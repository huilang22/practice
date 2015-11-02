/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: SecurityUserObjectFilter.java
 * Definition File: Admin/SecurityUser.xml
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
public class SecurityUserObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public SecurityUserObjectKeyFilter Key = null;
  /** raw field for: SEC_FX_USER.usr_user_id) */
  public    StringFilter[] UsrUserId  = null;
  protected boolean UsrUserIdFetch = false;
  protected boolean UsrUserIdSortAscending = true;
  protected boolean UsrUserIdCaseInsensitive = false;
  protected Integer UsrUserIdSort = null;
  /** raw field for: SEC_FX_USER.usr_first_name) */
  public    StringFilter[] UsrFirstName  = null;
  protected boolean UsrFirstNameFetch = false;
  protected boolean UsrFirstNameSortAscending = true;
  protected boolean UsrFirstNameCaseInsensitive = false;
  protected Integer UsrFirstNameSort = null;
  /** raw field for: SEC_FX_USER.usr_middle_name) */
  public    StringFilter[] UsrMiddleName  = null;
  protected boolean UsrMiddleNameFetch = false;
  protected boolean UsrMiddleNameSortAscending = true;
  protected boolean UsrMiddleNameCaseInsensitive = false;
  protected Integer UsrMiddleNameSort = null;
  /** raw field for: SEC_FX_USER.usr_last_name) */
  public    StringFilter[] UsrLastName  = null;
  protected boolean UsrLastNameFetch = false;
  protected boolean UsrLastNameSortAscending = true;
  protected boolean UsrLastNameCaseInsensitive = false;
  protected Integer UsrLastNameSort = null;
  /** raw field for: SEC_FX_USER.usr_phone) */
  public    StringFilter[] UsrPhone  = null;
  protected boolean UsrPhoneFetch = false;
  protected boolean UsrPhoneSortAscending = true;
  protected boolean UsrPhoneCaseInsensitive = false;
  protected Integer UsrPhoneSort = null;
  /** raw field for: SEC_FX_USER.usr_extension) */
  public    StringFilter[] UsrExtension  = null;
  protected boolean UsrExtensionFetch = false;
  protected boolean UsrExtensionSortAscending = true;
  protected boolean UsrExtensionCaseInsensitive = false;
  protected Integer UsrExtensionSort = null;
  /** raw field for: SEC_FX_USER.usr_department) */
  public    StringFilter[] UsrDepartment  = null;
  protected boolean UsrDepartmentFetch = false;
  protected boolean UsrDepartmentSortAscending = true;
  protected boolean UsrDepartmentCaseInsensitive = false;
  protected Integer UsrDepartmentSort = null;
  private String _objName = "SecurityUserObjectFilter";
  /** default constructor */
  public SecurityUserObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public SecurityUserObjectFilter (SecurityUserObjectFilter other)
  {
    if (other == null) return;
    this.Key = new SecurityUserObjectKeyFilter (other.Key);
    this.UsrUserId = other.UsrUserId;
    this.UsrUserIdFetch = other.UsrUserIdFetch;
    this.UsrUserIdSort = other.UsrUserIdSort;
    this.UsrUserIdCaseInsensitive = other.UsrUserIdCaseInsensitive;
    this.UsrUserIdSortAscending = other.UsrUserIdSortAscending;
    this.UsrFirstName = other.UsrFirstName;
    this.UsrFirstNameFetch = other.UsrFirstNameFetch;
    this.UsrFirstNameSort = other.UsrFirstNameSort;
    this.UsrFirstNameCaseInsensitive = other.UsrFirstNameCaseInsensitive;
    this.UsrFirstNameSortAscending = other.UsrFirstNameSortAscending;
    this.UsrMiddleName = other.UsrMiddleName;
    this.UsrMiddleNameFetch = other.UsrMiddleNameFetch;
    this.UsrMiddleNameSort = other.UsrMiddleNameSort;
    this.UsrMiddleNameCaseInsensitive = other.UsrMiddleNameCaseInsensitive;
    this.UsrMiddleNameSortAscending = other.UsrMiddleNameSortAscending;
    this.UsrLastName = other.UsrLastName;
    this.UsrLastNameFetch = other.UsrLastNameFetch;
    this.UsrLastNameSort = other.UsrLastNameSort;
    this.UsrLastNameCaseInsensitive = other.UsrLastNameCaseInsensitive;
    this.UsrLastNameSortAscending = other.UsrLastNameSortAscending;
    this.UsrPhone = other.UsrPhone;
    this.UsrPhoneFetch = other.UsrPhoneFetch;
    this.UsrPhoneSort = other.UsrPhoneSort;
    this.UsrPhoneCaseInsensitive = other.UsrPhoneCaseInsensitive;
    this.UsrPhoneSortAscending = other.UsrPhoneSortAscending;
    this.UsrExtension = other.UsrExtension;
    this.UsrExtensionFetch = other.UsrExtensionFetch;
    this.UsrExtensionSort = other.UsrExtensionSort;
    this.UsrExtensionCaseInsensitive = other.UsrExtensionCaseInsensitive;
    this.UsrExtensionSortAscending = other.UsrExtensionSortAscending;
    this.UsrDepartment = other.UsrDepartment;
    this.UsrDepartmentFetch = other.UsrDepartmentFetch;
    this.UsrDepartmentSort = other.UsrDepartmentSort;
    this.UsrDepartmentCaseInsensitive = other.UsrDepartmentCaseInsensitive;
    this.UsrDepartmentSortAscending = other.UsrDepartmentSortAscending;  }
  /** get the filter for this object's key
   * @return SecurityUserObjectKeyFilter
   */
  public SecurityUserObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (SecurityUserObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: UsrId (SEC_FX_USER.usr_id)
   * @param fetch whether to fetch this field or not
   */
  public void setUsrIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new SecurityUserObjectKeyFilter ();
    this.Key.UsrIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: UsrId (SEC_FX_USER.usr_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getUsrIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.UsrIdFetch;
  }
  /** Set the SortOrder for field: UsrId (SEC_FX_USER.usr_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUsrIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new SecurityUserObjectKeyFilter ();
    this.Key.UsrIdSort = value;
  }
  /** Retrieve SortOrder for field: UsrId (SEC_FX_USER.usr_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUsrIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.UsrIdSort;
  }
  /** Set the sort direction for field: UsrId (SEC_FX_USER.usr_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUsrIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new SecurityUserObjectKeyFilter ();
    this.Key.UsrIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UsrId (SEC_FX_USER.usr_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUsrIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.UsrIdSortAscending;
  }
  /** Set the field level filters for field: UsrId (SEC_FX_USER.usr_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUsrIdFilter (BigIntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new SecurityUserObjectKeyFilter ();
    this.Key.UsrId = value;
  }
  /** Retrieve filter for field: UsrId (SEC_FX_USER.usr_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getUsrIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.UsrId;
  }
  /** Set the field level Fetch value for field: UsrUserId (SEC_FX_USER.usr_user_id)
   * @param fetch whether to fetch this field or not
   */
  public void setUsrUserIdFetch (boolean fetch) {
    this.UsrUserIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: UsrUserId (SEC_FX_USER.usr_user_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getUsrUserIdFetch () {
    return this.UsrUserIdFetch;
  }
  /** Set the SortOrder for field: UsrUserId (SEC_FX_USER.usr_user_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUsrUserIdSortOrder (Integer value) {
    this.UsrUserIdSort = value;
  }
  /** Retrieve SortOrder for field: UsrUserId (SEC_FX_USER.usr_user_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUsrUserIdSortOrder () {
    return this.UsrUserIdSort;
  }
  /** Set the sort direction for field: UsrUserId (SEC_FX_USER.usr_user_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUsrUserIdSortDirection (boolean ascending) {
    this.UsrUserIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UsrUserId (SEC_FX_USER.usr_user_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUsrUserIdSortDirection () {
    return this.UsrUserIdSortAscending;
  }
  /** Set the case insensitive for field: UsrUserId (SEC_FX_USER.usr_user_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setUsrUserIdCaseInsensitive (boolean ascending) {
    this.UsrUserIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: UsrUserId (SEC_FX_USER.usr_user_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getUsrUserIdCaseInsensitive () {
    return this.UsrUserIdCaseInsensitive;
  }
  /** Set the field level filters for field: UsrUserId (SEC_FX_USER.usr_user_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUsrUserIdFilter (StringFilter[] value) throws ServiceException {
    this.UsrUserId = value;
  }
  /** Retrieve filter for field: UsrUserId (SEC_FX_USER.usr_user_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getUsrUserIdFilter () {
    return this.UsrUserId;
  }

  /**
   * Retrieves the UsrUserIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UsrUserIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UsrUserIdFilter field
   */
  public String[] getUsrUserIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsrUserIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUsrUserIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUsrUserIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UsrUserIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUsrUserIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UsrUserIdFilter filter value from a formatted string
   *
   * @param _value the UsrUserIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UsrUserIdFilter filter field
   */
  public void setUsrUserIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUsrUserIdFilterFromFormattedString");
    try {
      this.setUsrUserIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UsrUserIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUsrUserIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUsrUserIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: UsrFirstName (SEC_FX_USER.usr_first_name)
   * @param fetch whether to fetch this field or not
   */
  public void setUsrFirstNameFetch (boolean fetch) {
    this.UsrFirstNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: UsrFirstName (SEC_FX_USER.usr_first_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getUsrFirstNameFetch () {
    return this.UsrFirstNameFetch;
  }
  /** Set the SortOrder for field: UsrFirstName (SEC_FX_USER.usr_first_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUsrFirstNameSortOrder (Integer value) {
    this.UsrFirstNameSort = value;
  }
  /** Retrieve SortOrder for field: UsrFirstName (SEC_FX_USER.usr_first_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUsrFirstNameSortOrder () {
    return this.UsrFirstNameSort;
  }
  /** Set the sort direction for field: UsrFirstName (SEC_FX_USER.usr_first_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUsrFirstNameSortDirection (boolean ascending) {
    this.UsrFirstNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UsrFirstName (SEC_FX_USER.usr_first_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUsrFirstNameSortDirection () {
    return this.UsrFirstNameSortAscending;
  }
  /** Set the case insensitive for field: UsrFirstName (SEC_FX_USER.usr_first_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setUsrFirstNameCaseInsensitive (boolean ascending) {
    this.UsrFirstNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: UsrFirstName (SEC_FX_USER.usr_first_name)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getUsrFirstNameCaseInsensitive () {
    return this.UsrFirstNameCaseInsensitive;
  }
  /** Set the field level filters for field: UsrFirstName (SEC_FX_USER.usr_first_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUsrFirstNameFilter (StringFilter[] value) throws ServiceException {
    this.UsrFirstName = value;
  }
  /** Retrieve filter for field: UsrFirstName (SEC_FX_USER.usr_first_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getUsrFirstNameFilter () {
    return this.UsrFirstName;
  }

  /**
   * Retrieves the UsrFirstNameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UsrFirstNameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UsrFirstNameFilter field
   */
  public String[] getUsrFirstNameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsrFirstNameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUsrFirstNameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUsrFirstNameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UsrFirstNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUsrFirstNameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UsrFirstNameFilter filter value from a formatted string
   *
   * @param _value the UsrFirstNameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UsrFirstNameFilter filter field
   */
  public void setUsrFirstNameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUsrFirstNameFilterFromFormattedString");
    try {
      this.setUsrFirstNameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UsrFirstNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUsrFirstNameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUsrFirstNameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: UsrMiddleName (SEC_FX_USER.usr_middle_name)
   * @param fetch whether to fetch this field or not
   */
  public void setUsrMiddleNameFetch (boolean fetch) {
    this.UsrMiddleNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: UsrMiddleName (SEC_FX_USER.usr_middle_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getUsrMiddleNameFetch () {
    return this.UsrMiddleNameFetch;
  }
  /** Set the SortOrder for field: UsrMiddleName (SEC_FX_USER.usr_middle_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUsrMiddleNameSortOrder (Integer value) {
    this.UsrMiddleNameSort = value;
  }
  /** Retrieve SortOrder for field: UsrMiddleName (SEC_FX_USER.usr_middle_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUsrMiddleNameSortOrder () {
    return this.UsrMiddleNameSort;
  }
  /** Set the sort direction for field: UsrMiddleName (SEC_FX_USER.usr_middle_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUsrMiddleNameSortDirection (boolean ascending) {
    this.UsrMiddleNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UsrMiddleName (SEC_FX_USER.usr_middle_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUsrMiddleNameSortDirection () {
    return this.UsrMiddleNameSortAscending;
  }
  /** Set the case insensitive for field: UsrMiddleName (SEC_FX_USER.usr_middle_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setUsrMiddleNameCaseInsensitive (boolean ascending) {
    this.UsrMiddleNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: UsrMiddleName (SEC_FX_USER.usr_middle_name)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getUsrMiddleNameCaseInsensitive () {
    return this.UsrMiddleNameCaseInsensitive;
  }
  /** Set the field level filters for field: UsrMiddleName (SEC_FX_USER.usr_middle_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUsrMiddleNameFilter (StringFilter[] value) throws ServiceException {
    this.UsrMiddleName = value;
  }
  /** Retrieve filter for field: UsrMiddleName (SEC_FX_USER.usr_middle_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getUsrMiddleNameFilter () {
    return this.UsrMiddleName;
  }

  /**
   * Retrieves the UsrMiddleNameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UsrMiddleNameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UsrMiddleNameFilter field
   */
  public String[] getUsrMiddleNameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsrMiddleNameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUsrMiddleNameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUsrMiddleNameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UsrMiddleNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUsrMiddleNameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UsrMiddleNameFilter filter value from a formatted string
   *
   * @param _value the UsrMiddleNameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UsrMiddleNameFilter filter field
   */
  public void setUsrMiddleNameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUsrMiddleNameFilterFromFormattedString");
    try {
      this.setUsrMiddleNameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UsrMiddleNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUsrMiddleNameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUsrMiddleNameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: UsrLastName (SEC_FX_USER.usr_last_name)
   * @param fetch whether to fetch this field or not
   */
  public void setUsrLastNameFetch (boolean fetch) {
    this.UsrLastNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: UsrLastName (SEC_FX_USER.usr_last_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getUsrLastNameFetch () {
    return this.UsrLastNameFetch;
  }
  /** Set the SortOrder for field: UsrLastName (SEC_FX_USER.usr_last_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUsrLastNameSortOrder (Integer value) {
    this.UsrLastNameSort = value;
  }
  /** Retrieve SortOrder for field: UsrLastName (SEC_FX_USER.usr_last_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUsrLastNameSortOrder () {
    return this.UsrLastNameSort;
  }
  /** Set the sort direction for field: UsrLastName (SEC_FX_USER.usr_last_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUsrLastNameSortDirection (boolean ascending) {
    this.UsrLastNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UsrLastName (SEC_FX_USER.usr_last_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUsrLastNameSortDirection () {
    return this.UsrLastNameSortAscending;
  }
  /** Set the case insensitive for field: UsrLastName (SEC_FX_USER.usr_last_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setUsrLastNameCaseInsensitive (boolean ascending) {
    this.UsrLastNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: UsrLastName (SEC_FX_USER.usr_last_name)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getUsrLastNameCaseInsensitive () {
    return this.UsrLastNameCaseInsensitive;
  }
  /** Set the field level filters for field: UsrLastName (SEC_FX_USER.usr_last_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUsrLastNameFilter (StringFilter[] value) throws ServiceException {
    this.UsrLastName = value;
  }
  /** Retrieve filter for field: UsrLastName (SEC_FX_USER.usr_last_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getUsrLastNameFilter () {
    return this.UsrLastName;
  }

  /**
   * Retrieves the UsrLastNameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UsrLastNameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UsrLastNameFilter field
   */
  public String[] getUsrLastNameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsrLastNameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUsrLastNameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUsrLastNameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UsrLastNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUsrLastNameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UsrLastNameFilter filter value from a formatted string
   *
   * @param _value the UsrLastNameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UsrLastNameFilter filter field
   */
  public void setUsrLastNameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUsrLastNameFilterFromFormattedString");
    try {
      this.setUsrLastNameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UsrLastNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUsrLastNameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUsrLastNameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: UsrPhone (SEC_FX_USER.usr_phone)
   * @param fetch whether to fetch this field or not
   */
  public void setUsrPhoneFetch (boolean fetch) {
    this.UsrPhoneFetch = fetch;
  }
  /** Retrieve Fetch value for field: UsrPhone (SEC_FX_USER.usr_phone)
   * @return boolean the Fetch value for this field
   */
  public boolean getUsrPhoneFetch () {
    return this.UsrPhoneFetch;
  }
  /** Set the SortOrder for field: UsrPhone (SEC_FX_USER.usr_phone)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUsrPhoneSortOrder (Integer value) {
    this.UsrPhoneSort = value;
  }
  /** Retrieve SortOrder for field: UsrPhone (SEC_FX_USER.usr_phone)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUsrPhoneSortOrder () {
    return this.UsrPhoneSort;
  }
  /** Set the sort direction for field: UsrPhone (SEC_FX_USER.usr_phone)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUsrPhoneSortDirection (boolean ascending) {
    this.UsrPhoneSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UsrPhone (SEC_FX_USER.usr_phone)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUsrPhoneSortDirection () {
    return this.UsrPhoneSortAscending;
  }
  /** Set the case insensitive for field: UsrPhone (SEC_FX_USER.usr_phone)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setUsrPhoneCaseInsensitive (boolean ascending) {
    this.UsrPhoneCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: UsrPhone (SEC_FX_USER.usr_phone)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getUsrPhoneCaseInsensitive () {
    return this.UsrPhoneCaseInsensitive;
  }
  /** Set the field level filters for field: UsrPhone (SEC_FX_USER.usr_phone)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUsrPhoneFilter (StringFilter[] value) throws ServiceException {
    this.UsrPhone = value;
  }
  /** Retrieve filter for field: UsrPhone (SEC_FX_USER.usr_phone)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getUsrPhoneFilter () {
    return this.UsrPhone;
  }

  /**
   * Retrieves the UsrPhoneFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UsrPhoneFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UsrPhoneFilter field
   */
  public String[] getUsrPhoneFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsrPhoneFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUsrPhoneFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUsrPhoneFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UsrPhoneFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUsrPhoneFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UsrPhoneFilter filter value from a formatted string
   *
   * @param _value the UsrPhoneFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UsrPhoneFilter filter field
   */
  public void setUsrPhoneFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUsrPhoneFilterFromFormattedString");
    try {
      this.setUsrPhoneFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UsrPhoneFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUsrPhoneFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUsrPhoneFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: UsrExtension (SEC_FX_USER.usr_extension)
   * @param fetch whether to fetch this field or not
   */
  public void setUsrExtensionFetch (boolean fetch) {
    this.UsrExtensionFetch = fetch;
  }
  /** Retrieve Fetch value for field: UsrExtension (SEC_FX_USER.usr_extension)
   * @return boolean the Fetch value for this field
   */
  public boolean getUsrExtensionFetch () {
    return this.UsrExtensionFetch;
  }
  /** Set the SortOrder for field: UsrExtension (SEC_FX_USER.usr_extension)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUsrExtensionSortOrder (Integer value) {
    this.UsrExtensionSort = value;
  }
  /** Retrieve SortOrder for field: UsrExtension (SEC_FX_USER.usr_extension)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUsrExtensionSortOrder () {
    return this.UsrExtensionSort;
  }
  /** Set the sort direction for field: UsrExtension (SEC_FX_USER.usr_extension)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUsrExtensionSortDirection (boolean ascending) {
    this.UsrExtensionSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UsrExtension (SEC_FX_USER.usr_extension)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUsrExtensionSortDirection () {
    return this.UsrExtensionSortAscending;
  }
  /** Set the case insensitive for field: UsrExtension (SEC_FX_USER.usr_extension)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setUsrExtensionCaseInsensitive (boolean ascending) {
    this.UsrExtensionCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: UsrExtension (SEC_FX_USER.usr_extension)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getUsrExtensionCaseInsensitive () {
    return this.UsrExtensionCaseInsensitive;
  }
  /** Set the field level filters for field: UsrExtension (SEC_FX_USER.usr_extension)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUsrExtensionFilter (StringFilter[] value) throws ServiceException {
    this.UsrExtension = value;
  }
  /** Retrieve filter for field: UsrExtension (SEC_FX_USER.usr_extension)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getUsrExtensionFilter () {
    return this.UsrExtension;
  }

  /**
   * Retrieves the UsrExtensionFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UsrExtensionFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UsrExtensionFilter field
   */
  public String[] getUsrExtensionFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsrExtensionFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUsrExtensionFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUsrExtensionFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UsrExtensionFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUsrExtensionFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UsrExtensionFilter filter value from a formatted string
   *
   * @param _value the UsrExtensionFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UsrExtensionFilter filter field
   */
  public void setUsrExtensionFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUsrExtensionFilterFromFormattedString");
    try {
      this.setUsrExtensionFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UsrExtensionFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUsrExtensionFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUsrExtensionFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: UsrDepartment (SEC_FX_USER.usr_department)
   * @param fetch whether to fetch this field or not
   */
  public void setUsrDepartmentFetch (boolean fetch) {
    this.UsrDepartmentFetch = fetch;
  }
  /** Retrieve Fetch value for field: UsrDepartment (SEC_FX_USER.usr_department)
   * @return boolean the Fetch value for this field
   */
  public boolean getUsrDepartmentFetch () {
    return this.UsrDepartmentFetch;
  }
  /** Set the SortOrder for field: UsrDepartment (SEC_FX_USER.usr_department)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUsrDepartmentSortOrder (Integer value) {
    this.UsrDepartmentSort = value;
  }
  /** Retrieve SortOrder for field: UsrDepartment (SEC_FX_USER.usr_department)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUsrDepartmentSortOrder () {
    return this.UsrDepartmentSort;
  }
  /** Set the sort direction for field: UsrDepartment (SEC_FX_USER.usr_department)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUsrDepartmentSortDirection (boolean ascending) {
    this.UsrDepartmentSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UsrDepartment (SEC_FX_USER.usr_department)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUsrDepartmentSortDirection () {
    return this.UsrDepartmentSortAscending;
  }
  /** Set the case insensitive for field: UsrDepartment (SEC_FX_USER.usr_department)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setUsrDepartmentCaseInsensitive (boolean ascending) {
    this.UsrDepartmentCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: UsrDepartment (SEC_FX_USER.usr_department)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getUsrDepartmentCaseInsensitive () {
    return this.UsrDepartmentCaseInsensitive;
  }
  /** Set the field level filters for field: UsrDepartment (SEC_FX_USER.usr_department)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUsrDepartmentFilter (StringFilter[] value) throws ServiceException {
    this.UsrDepartment = value;
  }
  /** Retrieve filter for field: UsrDepartment (SEC_FX_USER.usr_department)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getUsrDepartmentFilter () {
    return this.UsrDepartment;
  }

  /**
   * Retrieves the UsrDepartmentFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UsrDepartmentFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UsrDepartmentFilter field
   */
  public String[] getUsrDepartmentFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsrDepartmentFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUsrDepartmentFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUsrDepartmentFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UsrDepartmentFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUsrDepartmentFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UsrDepartmentFilter filter value from a formatted string
   *
   * @param _value the UsrDepartmentFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UsrDepartmentFilter filter field
   */
  public void setUsrDepartmentFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUsrDepartmentFilterFromFormattedString");
    try {
      this.setUsrDepartmentFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UsrDepartmentFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUsrDepartmentFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUsrDepartmentFilterFromFormattedString");
  }

  public String toString() {
    return SecurityUserObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return SecurityUserObjectHelper.toMap(this, null);
  }
}
