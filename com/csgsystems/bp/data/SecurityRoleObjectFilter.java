/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: SecurityRoleObjectFilter.java
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
public class SecurityRoleObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public SecurityRoleObjectKeyFilter Key = null;
  /** raw field for: SEC_FX_ROLE_VALUES.frv_short_display) */
  public    StringFilter[] FrvShortDisplay  = null;
  protected boolean FrvShortDisplayFetch = false;
  protected boolean FrvShortDisplaySortAscending = true;
  protected boolean FrvShortDisplayCaseInsensitive = false;
  protected Integer FrvShortDisplaySort = null;
  /** raw field for: SEC_FX_ROLE_VALUES.frv_display_value) */
  public    StringFilter[] FrvDisplayValue  = null;
  protected boolean FrvDisplayValueFetch = false;
  protected boolean FrvDisplayValueSortAscending = true;
  protected boolean FrvDisplayValueCaseInsensitive = false;
  protected Integer FrvDisplayValueSort = null;
  /** raw field for: SEC_FX_ROLE_VALUES.frv_update_count) */
  public    BigIntegerFilter[] FrvUpdateCount  = null;
  protected boolean FrvUpdateCountFetch = false;
  protected boolean FrvUpdateCountSortAscending = true;
  protected Integer FrvUpdateCountSort = null;
  /** raw field for: SEC_FX_ROLE_VALUES.frv_create_date) */
  public    DateFilter[] FrvCreateDate  = null;
  protected boolean FrvCreateDateFetch = false;
  protected boolean FrvCreateDateSortAscending = true;
  protected Integer FrvCreateDateSort = null;
  /** raw field for: SEC_FX_ROLE_VALUES.frv_modify_date) */
  public    DateFilter[] FrvModifyDate  = null;
  protected boolean FrvModifyDateFetch = false;
  protected boolean FrvModifyDateSortAscending = true;
  protected Integer FrvModifyDateSort = null;
  /** raw field for: SEC_FX_ROLE_VALUES.frv_modify_user) */
  public    StringFilter[] FrvModifyUser  = null;
  protected boolean FrvModifyUserFetch = false;
  protected boolean FrvModifyUserSortAscending = true;
  protected boolean FrvModifyUserCaseInsensitive = false;
  protected Integer FrvModifyUserSort = null;
  private String _objName = "SecurityRoleObjectFilter";
  /** default constructor */
  public SecurityRoleObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public SecurityRoleObjectFilter (SecurityRoleObjectFilter other)
  {
    if (other == null) return;
    this.Key = new SecurityRoleObjectKeyFilter (other.Key);
    this.FrvShortDisplay = other.FrvShortDisplay;
    this.FrvShortDisplayFetch = other.FrvShortDisplayFetch;
    this.FrvShortDisplaySort = other.FrvShortDisplaySort;
    this.FrvShortDisplayCaseInsensitive = other.FrvShortDisplayCaseInsensitive;
    this.FrvShortDisplaySortAscending = other.FrvShortDisplaySortAscending;
    this.FrvDisplayValue = other.FrvDisplayValue;
    this.FrvDisplayValueFetch = other.FrvDisplayValueFetch;
    this.FrvDisplayValueSort = other.FrvDisplayValueSort;
    this.FrvDisplayValueCaseInsensitive = other.FrvDisplayValueCaseInsensitive;
    this.FrvDisplayValueSortAscending = other.FrvDisplayValueSortAscending;
    this.FrvUpdateCount = other.FrvUpdateCount;
    this.FrvUpdateCountFetch = other.FrvUpdateCountFetch;
    this.FrvUpdateCountSort = other.FrvUpdateCountSort;
    this.FrvUpdateCountSortAscending = other.FrvUpdateCountSortAscending;
    this.FrvCreateDate = other.FrvCreateDate;
    this.FrvCreateDateFetch = other.FrvCreateDateFetch;
    this.FrvCreateDateSort = other.FrvCreateDateSort;
    this.FrvCreateDateSortAscending = other.FrvCreateDateSortAscending;
    this.FrvModifyDate = other.FrvModifyDate;
    this.FrvModifyDateFetch = other.FrvModifyDateFetch;
    this.FrvModifyDateSort = other.FrvModifyDateSort;
    this.FrvModifyDateSortAscending = other.FrvModifyDateSortAscending;
    this.FrvModifyUser = other.FrvModifyUser;
    this.FrvModifyUserFetch = other.FrvModifyUserFetch;
    this.FrvModifyUserSort = other.FrvModifyUserSort;
    this.FrvModifyUserCaseInsensitive = other.FrvModifyUserCaseInsensitive;
    this.FrvModifyUserSortAscending = other.FrvModifyUserSortAscending;  }
  /** get the filter for this object's key
   * @return SecurityRoleObjectKeyFilter
   */
  public SecurityRoleObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (SecurityRoleObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: FrvRoleId (SEC_FX_ROLE_VALUES.frv_role_id)
   * @param fetch whether to fetch this field or not
   */
  public void setFrvRoleIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new SecurityRoleObjectKeyFilter ();
    this.Key.FrvRoleIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: FrvRoleId (SEC_FX_ROLE_VALUES.frv_role_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getFrvRoleIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.FrvRoleIdFetch;
  }
  /** Set the SortOrder for field: FrvRoleId (SEC_FX_ROLE_VALUES.frv_role_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFrvRoleIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new SecurityRoleObjectKeyFilter ();
    this.Key.FrvRoleIdSort = value;
  }
  /** Retrieve SortOrder for field: FrvRoleId (SEC_FX_ROLE_VALUES.frv_role_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFrvRoleIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.FrvRoleIdSort;
  }
  /** Set the sort direction for field: FrvRoleId (SEC_FX_ROLE_VALUES.frv_role_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFrvRoleIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new SecurityRoleObjectKeyFilter ();
    this.Key.FrvRoleIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FrvRoleId (SEC_FX_ROLE_VALUES.frv_role_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFrvRoleIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.FrvRoleIdSortAscending;
  }
  /** Set the field level filters for field: FrvRoleId (SEC_FX_ROLE_VALUES.frv_role_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFrvRoleIdFilter (BigIntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new SecurityRoleObjectKeyFilter ();
    this.Key.FrvRoleId = value;
  }
  /** Retrieve filter for field: FrvRoleId (SEC_FX_ROLE_VALUES.frv_role_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getFrvRoleIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.FrvRoleId;
  }
  /** Set the field level Fetch value for field: FrvLanguageCode (SEC_FX_ROLE_VALUES.frv_language_code)
   * @param fetch whether to fetch this field or not
   */
  public void setFrvLanguageCodeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new SecurityRoleObjectKeyFilter ();
    this.Key.FrvLanguageCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: FrvLanguageCode (SEC_FX_ROLE_VALUES.frv_language_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getFrvLanguageCodeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.FrvLanguageCodeFetch;
  }
  /** Set the SortOrder for field: FrvLanguageCode (SEC_FX_ROLE_VALUES.frv_language_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFrvLanguageCodeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new SecurityRoleObjectKeyFilter ();
    this.Key.FrvLanguageCodeSort = value;
  }
  /** Retrieve SortOrder for field: FrvLanguageCode (SEC_FX_ROLE_VALUES.frv_language_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFrvLanguageCodeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.FrvLanguageCodeSort;
  }
  /** Set the sort direction for field: FrvLanguageCode (SEC_FX_ROLE_VALUES.frv_language_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFrvLanguageCodeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new SecurityRoleObjectKeyFilter ();
    this.Key.FrvLanguageCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FrvLanguageCode (SEC_FX_ROLE_VALUES.frv_language_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFrvLanguageCodeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.FrvLanguageCodeSortAscending;
  }
  /** Set the field level filters for field: FrvLanguageCode (SEC_FX_ROLE_VALUES.frv_language_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFrvLanguageCodeFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new SecurityRoleObjectKeyFilter ();
    this.Key.FrvLanguageCode = value;
  }
  /** Retrieve filter for field: FrvLanguageCode (SEC_FX_ROLE_VALUES.frv_language_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getFrvLanguageCodeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.FrvLanguageCode;
  }
  /** Set the field level Fetch value for field: FrvShortDisplay (SEC_FX_ROLE_VALUES.frv_short_display)
   * @param fetch whether to fetch this field or not
   */
  public void setFrvShortDisplayFetch (boolean fetch) {
    this.FrvShortDisplayFetch = fetch;
  }
  /** Retrieve Fetch value for field: FrvShortDisplay (SEC_FX_ROLE_VALUES.frv_short_display)
   * @return boolean the Fetch value for this field
   */
  public boolean getFrvShortDisplayFetch () {
    return this.FrvShortDisplayFetch;
  }
  /** Set the SortOrder for field: FrvShortDisplay (SEC_FX_ROLE_VALUES.frv_short_display)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFrvShortDisplaySortOrder (Integer value) {
    this.FrvShortDisplaySort = value;
  }
  /** Retrieve SortOrder for field: FrvShortDisplay (SEC_FX_ROLE_VALUES.frv_short_display)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFrvShortDisplaySortOrder () {
    return this.FrvShortDisplaySort;
  }
  /** Set the sort direction for field: FrvShortDisplay (SEC_FX_ROLE_VALUES.frv_short_display)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFrvShortDisplaySortDirection (boolean ascending) {
    this.FrvShortDisplaySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FrvShortDisplay (SEC_FX_ROLE_VALUES.frv_short_display)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFrvShortDisplaySortDirection () {
    return this.FrvShortDisplaySortAscending;
  }
  /** Set the case insensitive for field: FrvShortDisplay (SEC_FX_ROLE_VALUES.frv_short_display)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setFrvShortDisplayCaseInsensitive (boolean ascending) {
    this.FrvShortDisplayCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: FrvShortDisplay (SEC_FX_ROLE_VALUES.frv_short_display)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getFrvShortDisplayCaseInsensitive () {
    return this.FrvShortDisplayCaseInsensitive;
  }
  /** Set the field level filters for field: FrvShortDisplay (SEC_FX_ROLE_VALUES.frv_short_display)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFrvShortDisplayFilter (StringFilter[] value) throws ServiceException {
    this.FrvShortDisplay = value;
  }
  /** Retrieve filter for field: FrvShortDisplay (SEC_FX_ROLE_VALUES.frv_short_display)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getFrvShortDisplayFilter () {
    return this.FrvShortDisplay;
  }

  /**
   * Retrieves the FrvShortDisplayFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FrvShortDisplayFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrvShortDisplayFilter field
   */
  public String[] getFrvShortDisplayFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvShortDisplayFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFrvShortDisplayFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrvShortDisplayFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrvShortDisplayFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrvShortDisplayFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FrvShortDisplayFilter filter value from a formatted string
   *
   * @param _value the FrvShortDisplayFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FrvShortDisplayFilter filter field
   */
  public void setFrvShortDisplayFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFrvShortDisplayFilterFromFormattedString");
    try {
      this.setFrvShortDisplayFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrvShortDisplayFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrvShortDisplayFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrvShortDisplayFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: FrvDisplayValue (SEC_FX_ROLE_VALUES.frv_display_value)
   * @param fetch whether to fetch this field or not
   */
  public void setFrvDisplayValueFetch (boolean fetch) {
    this.FrvDisplayValueFetch = fetch;
  }
  /** Retrieve Fetch value for field: FrvDisplayValue (SEC_FX_ROLE_VALUES.frv_display_value)
   * @return boolean the Fetch value for this field
   */
  public boolean getFrvDisplayValueFetch () {
    return this.FrvDisplayValueFetch;
  }
  /** Set the SortOrder for field: FrvDisplayValue (SEC_FX_ROLE_VALUES.frv_display_value)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFrvDisplayValueSortOrder (Integer value) {
    this.FrvDisplayValueSort = value;
  }
  /** Retrieve SortOrder for field: FrvDisplayValue (SEC_FX_ROLE_VALUES.frv_display_value)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFrvDisplayValueSortOrder () {
    return this.FrvDisplayValueSort;
  }
  /** Set the sort direction for field: FrvDisplayValue (SEC_FX_ROLE_VALUES.frv_display_value)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFrvDisplayValueSortDirection (boolean ascending) {
    this.FrvDisplayValueSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FrvDisplayValue (SEC_FX_ROLE_VALUES.frv_display_value)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFrvDisplayValueSortDirection () {
    return this.FrvDisplayValueSortAscending;
  }
  /** Set the case insensitive for field: FrvDisplayValue (SEC_FX_ROLE_VALUES.frv_display_value)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setFrvDisplayValueCaseInsensitive (boolean ascending) {
    this.FrvDisplayValueCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: FrvDisplayValue (SEC_FX_ROLE_VALUES.frv_display_value)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getFrvDisplayValueCaseInsensitive () {
    return this.FrvDisplayValueCaseInsensitive;
  }
  /** Set the field level filters for field: FrvDisplayValue (SEC_FX_ROLE_VALUES.frv_display_value)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFrvDisplayValueFilter (StringFilter[] value) throws ServiceException {
    this.FrvDisplayValue = value;
  }
  /** Retrieve filter for field: FrvDisplayValue (SEC_FX_ROLE_VALUES.frv_display_value)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getFrvDisplayValueFilter () {
    return this.FrvDisplayValue;
  }

  /**
   * Retrieves the FrvDisplayValueFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FrvDisplayValueFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrvDisplayValueFilter field
   */
  public String[] getFrvDisplayValueFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvDisplayValueFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFrvDisplayValueFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrvDisplayValueFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrvDisplayValueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrvDisplayValueFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FrvDisplayValueFilter filter value from a formatted string
   *
   * @param _value the FrvDisplayValueFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FrvDisplayValueFilter filter field
   */
  public void setFrvDisplayValueFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFrvDisplayValueFilterFromFormattedString");
    try {
      this.setFrvDisplayValueFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrvDisplayValueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrvDisplayValueFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrvDisplayValueFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: FrvUpdateCount (SEC_FX_ROLE_VALUES.frv_update_count)
   * @param fetch whether to fetch this field or not
   */
  public void setFrvUpdateCountFetch (boolean fetch) {
    this.FrvUpdateCountFetch = fetch;
  }
  /** Retrieve Fetch value for field: FrvUpdateCount (SEC_FX_ROLE_VALUES.frv_update_count)
   * @return boolean the Fetch value for this field
   */
  public boolean getFrvUpdateCountFetch () {
    return this.FrvUpdateCountFetch;
  }
  /** Set the SortOrder for field: FrvUpdateCount (SEC_FX_ROLE_VALUES.frv_update_count)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFrvUpdateCountSortOrder (Integer value) {
    this.FrvUpdateCountSort = value;
  }
  /** Retrieve SortOrder for field: FrvUpdateCount (SEC_FX_ROLE_VALUES.frv_update_count)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFrvUpdateCountSortOrder () {
    return this.FrvUpdateCountSort;
  }
  /** Set the sort direction for field: FrvUpdateCount (SEC_FX_ROLE_VALUES.frv_update_count)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFrvUpdateCountSortDirection (boolean ascending) {
    this.FrvUpdateCountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FrvUpdateCount (SEC_FX_ROLE_VALUES.frv_update_count)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFrvUpdateCountSortDirection () {
    return this.FrvUpdateCountSortAscending;
  }
  /** Set the field level filters for field: FrvUpdateCount (SEC_FX_ROLE_VALUES.frv_update_count)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFrvUpdateCountFilter (BigIntegerFilter[] value) throws ServiceException {
    this.FrvUpdateCount = value;
  }
  /** Retrieve filter for field: FrvUpdateCount (SEC_FX_ROLE_VALUES.frv_update_count)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getFrvUpdateCountFilter () {
    return this.FrvUpdateCount;
  }

  /**
   * Retrieves the FrvUpdateCountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FrvUpdateCountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrvUpdateCountFilter field
   */
  public String[] getFrvUpdateCountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvUpdateCountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFrvUpdateCountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrvUpdateCountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrvUpdateCountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrvUpdateCountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FrvUpdateCountFilter filter value from a formatted string
   *
   * @param _value the FrvUpdateCountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FrvUpdateCountFilter filter field
   */
  public void setFrvUpdateCountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFrvUpdateCountFilterFromFormattedString");
    try {
      this.setFrvUpdateCountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrvUpdateCountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrvUpdateCountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrvUpdateCountFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: FrvCreateDate (SEC_FX_ROLE_VALUES.frv_create_date)
   * @param fetch whether to fetch this field or not
   */
  public void setFrvCreateDateFetch (boolean fetch) {
    this.FrvCreateDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: FrvCreateDate (SEC_FX_ROLE_VALUES.frv_create_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getFrvCreateDateFetch () {
    return this.FrvCreateDateFetch;
  }
  /** Set the SortOrder for field: FrvCreateDate (SEC_FX_ROLE_VALUES.frv_create_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFrvCreateDateSortOrder (Integer value) {
    this.FrvCreateDateSort = value;
  }
  /** Retrieve SortOrder for field: FrvCreateDate (SEC_FX_ROLE_VALUES.frv_create_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFrvCreateDateSortOrder () {
    return this.FrvCreateDateSort;
  }
  /** Set the sort direction for field: FrvCreateDate (SEC_FX_ROLE_VALUES.frv_create_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFrvCreateDateSortDirection (boolean ascending) {
    this.FrvCreateDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FrvCreateDate (SEC_FX_ROLE_VALUES.frv_create_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFrvCreateDateSortDirection () {
    return this.FrvCreateDateSortAscending;
  }
  /** Set the field level filters for field: FrvCreateDate (SEC_FX_ROLE_VALUES.frv_create_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFrvCreateDateFilter (DateFilter[] value) throws ServiceException {
    this.FrvCreateDate = value;
  }
  /** Retrieve filter for field: FrvCreateDate (SEC_FX_ROLE_VALUES.frv_create_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getFrvCreateDateFilter () {
    return this.FrvCreateDate;
  }

  /**
   * Retrieves the FrvCreateDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FrvCreateDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrvCreateDateFilter field
   */
  public String[] getFrvCreateDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvCreateDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFrvCreateDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrvCreateDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrvCreateDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrvCreateDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FrvCreateDateFilter filter value from a formatted string
   *
   * @param _value the FrvCreateDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FrvCreateDateFilter filter field
   */
  public void setFrvCreateDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFrvCreateDateFilterFromFormattedString");
    try {
      this.setFrvCreateDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrvCreateDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrvCreateDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrvCreateDateFilterFromFormattedString");
  }

  /**
   * Retrieves the FrvCreateDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FrvCreateDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrvCreateDateFilter field
   */
  public String[] getFrvCreateDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvCreateDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFrvCreateDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrvCreateDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrvCreateDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrvCreateDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the FrvCreateDateFilter filter value from a formatted string
   *
   * @param _value the FrvCreateDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FrvCreateDateFilter filter field
   */
  public void setFrvCreateDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFrvCreateDateFilterFromFormattedDateTimeString");
    try {
      this.setFrvCreateDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrvCreateDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrvCreateDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrvCreateDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: FrvModifyDate (SEC_FX_ROLE_VALUES.frv_modify_date)
   * @param fetch whether to fetch this field or not
   */
  public void setFrvModifyDateFetch (boolean fetch) {
    this.FrvModifyDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: FrvModifyDate (SEC_FX_ROLE_VALUES.frv_modify_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getFrvModifyDateFetch () {
    return this.FrvModifyDateFetch;
  }
  /** Set the SortOrder for field: FrvModifyDate (SEC_FX_ROLE_VALUES.frv_modify_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFrvModifyDateSortOrder (Integer value) {
    this.FrvModifyDateSort = value;
  }
  /** Retrieve SortOrder for field: FrvModifyDate (SEC_FX_ROLE_VALUES.frv_modify_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFrvModifyDateSortOrder () {
    return this.FrvModifyDateSort;
  }
  /** Set the sort direction for field: FrvModifyDate (SEC_FX_ROLE_VALUES.frv_modify_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFrvModifyDateSortDirection (boolean ascending) {
    this.FrvModifyDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FrvModifyDate (SEC_FX_ROLE_VALUES.frv_modify_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFrvModifyDateSortDirection () {
    return this.FrvModifyDateSortAscending;
  }
  /** Set the field level filters for field: FrvModifyDate (SEC_FX_ROLE_VALUES.frv_modify_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFrvModifyDateFilter (DateFilter[] value) throws ServiceException {
    this.FrvModifyDate = value;
  }
  /** Retrieve filter for field: FrvModifyDate (SEC_FX_ROLE_VALUES.frv_modify_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getFrvModifyDateFilter () {
    return this.FrvModifyDate;
  }

  /**
   * Retrieves the FrvModifyDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FrvModifyDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrvModifyDateFilter field
   */
  public String[] getFrvModifyDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvModifyDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFrvModifyDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrvModifyDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrvModifyDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrvModifyDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FrvModifyDateFilter filter value from a formatted string
   *
   * @param _value the FrvModifyDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FrvModifyDateFilter filter field
   */
  public void setFrvModifyDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFrvModifyDateFilterFromFormattedString");
    try {
      this.setFrvModifyDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrvModifyDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrvModifyDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrvModifyDateFilterFromFormattedString");
  }

  /**
   * Retrieves the FrvModifyDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FrvModifyDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrvModifyDateFilter field
   */
  public String[] getFrvModifyDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvModifyDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFrvModifyDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrvModifyDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrvModifyDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrvModifyDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the FrvModifyDateFilter filter value from a formatted string
   *
   * @param _value the FrvModifyDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FrvModifyDateFilter filter field
   */
  public void setFrvModifyDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFrvModifyDateFilterFromFormattedDateTimeString");
    try {
      this.setFrvModifyDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrvModifyDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrvModifyDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrvModifyDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: FrvModifyUser (SEC_FX_ROLE_VALUES.frv_modify_user)
   * @param fetch whether to fetch this field or not
   */
  public void setFrvModifyUserFetch (boolean fetch) {
    this.FrvModifyUserFetch = fetch;
  }
  /** Retrieve Fetch value for field: FrvModifyUser (SEC_FX_ROLE_VALUES.frv_modify_user)
   * @return boolean the Fetch value for this field
   */
  public boolean getFrvModifyUserFetch () {
    return this.FrvModifyUserFetch;
  }
  /** Set the SortOrder for field: FrvModifyUser (SEC_FX_ROLE_VALUES.frv_modify_user)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFrvModifyUserSortOrder (Integer value) {
    this.FrvModifyUserSort = value;
  }
  /** Retrieve SortOrder for field: FrvModifyUser (SEC_FX_ROLE_VALUES.frv_modify_user)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFrvModifyUserSortOrder () {
    return this.FrvModifyUserSort;
  }
  /** Set the sort direction for field: FrvModifyUser (SEC_FX_ROLE_VALUES.frv_modify_user)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFrvModifyUserSortDirection (boolean ascending) {
    this.FrvModifyUserSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FrvModifyUser (SEC_FX_ROLE_VALUES.frv_modify_user)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFrvModifyUserSortDirection () {
    return this.FrvModifyUserSortAscending;
  }
  /** Set the case insensitive for field: FrvModifyUser (SEC_FX_ROLE_VALUES.frv_modify_user)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setFrvModifyUserCaseInsensitive (boolean ascending) {
    this.FrvModifyUserCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: FrvModifyUser (SEC_FX_ROLE_VALUES.frv_modify_user)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getFrvModifyUserCaseInsensitive () {
    return this.FrvModifyUserCaseInsensitive;
  }
  /** Set the field level filters for field: FrvModifyUser (SEC_FX_ROLE_VALUES.frv_modify_user)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFrvModifyUserFilter (StringFilter[] value) throws ServiceException {
    this.FrvModifyUser = value;
  }
  /** Retrieve filter for field: FrvModifyUser (SEC_FX_ROLE_VALUES.frv_modify_user)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getFrvModifyUserFilter () {
    return this.FrvModifyUser;
  }

  /**
   * Retrieves the FrvModifyUserFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FrvModifyUserFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrvModifyUserFilter field
   */
  public String[] getFrvModifyUserFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvModifyUserFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFrvModifyUserFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrvModifyUserFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrvModifyUserFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrvModifyUserFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FrvModifyUserFilter filter value from a formatted string
   *
   * @param _value the FrvModifyUserFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FrvModifyUserFilter filter field
   */
  public void setFrvModifyUserFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFrvModifyUserFilterFromFormattedString");
    try {
      this.setFrvModifyUserFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrvModifyUserFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrvModifyUserFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrvModifyUserFilterFromFormattedString");
  }

  public String toString() {
    return SecurityRoleObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return SecurityRoleObjectHelper.toMap(this, null);
  }
}
