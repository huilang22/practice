/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: SecurityAciObjectFilter.java
 * Definition File: Admin/SecurityAci.xml
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
public class SecurityAciObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public SecurityAciObjectKeyFilter Key = null;
  /** raw field for: SEC_ACI.aci_name) */
  public    StringFilter[] AciName  = null;
  protected boolean AciNameFetch = false;
  protected boolean AciNameSortAscending = true;
  protected boolean AciNameCaseInsensitive = false;
  protected Integer AciNameSort = null;
  /** raw field for: SEC_ACI.aci_res_id) */
  public    BigIntegerFilter[] AciResId  = null;
  protected boolean AciResIdFetch = false;
  protected boolean AciResIdSortAscending = true;
  protected Integer AciResIdSort = null;
  /** raw field for: SEC_ACI.aci_role_id) */
  public    BigIntegerFilter[] AciRoleId  = null;
  protected boolean AciRoleIdFetch = false;
  protected boolean AciRoleIdSortAscending = true;
  protected Integer AciRoleIdSort = null;
  /** raw field for: SEC_ACI.aci_update_count) */
  public    BigIntegerFilter[] AciUpdateCount  = null;
  protected boolean AciUpdateCountFetch = false;
  protected boolean AciUpdateCountSortAscending = true;
  protected Integer AciUpdateCountSort = null;
  /** raw field for: SEC_ACI.aci_create_date) */
  public    DateFilter[] AciCreateDate  = null;
  protected boolean AciCreateDateFetch = false;
  protected boolean AciCreateDateSortAscending = true;
  protected Integer AciCreateDateSort = null;
  /** raw field for: SEC_ACI.aci_modify_date) */
  public    DateFilter[] AciModifyDate  = null;
  protected boolean AciModifyDateFetch = false;
  protected boolean AciModifyDateSortAscending = true;
  protected Integer AciModifyDateSort = null;
  /** raw field for: SEC_ACI.aci_modify_user) */
  public    StringFilter[] AciModifyUser  = null;
  protected boolean AciModifyUserFetch = false;
  protected boolean AciModifyUserSortAscending = true;
  protected boolean AciModifyUserCaseInsensitive = false;
  protected Integer AciModifyUserSort = null;
  /** raw field for: SEC_FX_RESOURCE.res_id) */
  public    BigIntegerFilter[] ResId  = null;
  protected boolean ResIdFetch = false;
  protected boolean ResIdSortAscending = true;
  protected Integer ResIdSort = null;
  /** raw field for: SEC_FX_RESOURCE.res_name) */
  public    StringFilter[] ResName  = null;
  protected boolean ResNameFetch = false;
  protected boolean ResNameSortAscending = true;
  protected boolean ResNameCaseInsensitive = false;
  protected Integer ResNameSort = null;
  /** raw field for: SEC_FX_RESOURCE.res_sub_id) */
  public    BigIntegerFilter[] ResSubId  = null;
  protected boolean ResSubIdFetch = false;
  protected boolean ResSubIdSortAscending = true;
  protected Integer ResSubIdSort = null;
  /** raw field for: SEC_FX_RESOURCE.res_rty_id) */
  public    BigIntegerFilter[] ResRtyId  = null;
  protected boolean ResRtyIdFetch = false;
  protected boolean ResRtyIdSortAscending = true;
  protected Integer ResRtyIdSort = null;
  /** raw field for: SEC_FX_RESOURCE.res_mr_id) */
  public    BigIntegerFilter[] ResMrId  = null;
  protected boolean ResMrIdFetch = false;
  protected boolean ResMrIdSortAscending = true;
  protected Integer ResMrIdSort = null;
  /** raw field for: SEC_FX_RESOURCE.res_update_count) */
  public    BigIntegerFilter[] ResUpdateCount  = null;
  protected boolean ResUpdateCountFetch = false;
  protected boolean ResUpdateCountSortAscending = true;
  protected Integer ResUpdateCountSort = null;
  /** raw field for: SEC_FX_RESOURCE.res_create_date) */
  public    DateFilter[] ResCreateDate  = null;
  protected boolean ResCreateDateFetch = false;
  protected boolean ResCreateDateSortAscending = true;
  protected Integer ResCreateDateSort = null;
  /** raw field for: SEC_FX_RESOURCE.res_modify_date) */
  public    DateFilter[] ResModifyDate  = null;
  protected boolean ResModifyDateFetch = false;
  protected boolean ResModifyDateSortAscending = true;
  protected Integer ResModifyDateSort = null;
  /** raw field for: SEC_FX_RESOURCE.res_modify_user) */
  public    StringFilter[] ResModifyUser  = null;
  protected boolean ResModifyUserFetch = false;
  protected boolean ResModifyUserSortAscending = true;
  protected boolean ResModifyUserCaseInsensitive = false;
  protected Integer ResModifyUserSort = null;
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
  private String _objName = "SecurityAciObjectFilter";
  /** default constructor */
  public SecurityAciObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public SecurityAciObjectFilter (SecurityAciObjectFilter other)
  {
    if (other == null) return;
    this.Key = new SecurityAciObjectKeyFilter (other.Key);
    this.AciName = other.AciName;
    this.AciNameFetch = other.AciNameFetch;
    this.AciNameSort = other.AciNameSort;
    this.AciNameCaseInsensitive = other.AciNameCaseInsensitive;
    this.AciNameSortAscending = other.AciNameSortAscending;
    this.AciResId = other.AciResId;
    this.AciResIdFetch = other.AciResIdFetch;
    this.AciResIdSort = other.AciResIdSort;
    this.AciResIdSortAscending = other.AciResIdSortAscending;
    this.AciRoleId = other.AciRoleId;
    this.AciRoleIdFetch = other.AciRoleIdFetch;
    this.AciRoleIdSort = other.AciRoleIdSort;
    this.AciRoleIdSortAscending = other.AciRoleIdSortAscending;
    this.AciUpdateCount = other.AciUpdateCount;
    this.AciUpdateCountFetch = other.AciUpdateCountFetch;
    this.AciUpdateCountSort = other.AciUpdateCountSort;
    this.AciUpdateCountSortAscending = other.AciUpdateCountSortAscending;
    this.AciCreateDate = other.AciCreateDate;
    this.AciCreateDateFetch = other.AciCreateDateFetch;
    this.AciCreateDateSort = other.AciCreateDateSort;
    this.AciCreateDateSortAscending = other.AciCreateDateSortAscending;
    this.AciModifyDate = other.AciModifyDate;
    this.AciModifyDateFetch = other.AciModifyDateFetch;
    this.AciModifyDateSort = other.AciModifyDateSort;
    this.AciModifyDateSortAscending = other.AciModifyDateSortAscending;
    this.AciModifyUser = other.AciModifyUser;
    this.AciModifyUserFetch = other.AciModifyUserFetch;
    this.AciModifyUserSort = other.AciModifyUserSort;
    this.AciModifyUserCaseInsensitive = other.AciModifyUserCaseInsensitive;
    this.AciModifyUserSortAscending = other.AciModifyUserSortAscending;
    this.ResId = other.ResId;
    this.ResIdFetch = other.ResIdFetch;
    this.ResIdSort = other.ResIdSort;
    this.ResIdSortAscending = other.ResIdSortAscending;
    this.ResName = other.ResName;
    this.ResNameFetch = other.ResNameFetch;
    this.ResNameSort = other.ResNameSort;
    this.ResNameCaseInsensitive = other.ResNameCaseInsensitive;
    this.ResNameSortAscending = other.ResNameSortAscending;
    this.ResSubId = other.ResSubId;
    this.ResSubIdFetch = other.ResSubIdFetch;
    this.ResSubIdSort = other.ResSubIdSort;
    this.ResSubIdSortAscending = other.ResSubIdSortAscending;
    this.ResRtyId = other.ResRtyId;
    this.ResRtyIdFetch = other.ResRtyIdFetch;
    this.ResRtyIdSort = other.ResRtyIdSort;
    this.ResRtyIdSortAscending = other.ResRtyIdSortAscending;
    this.ResMrId = other.ResMrId;
    this.ResMrIdFetch = other.ResMrIdFetch;
    this.ResMrIdSort = other.ResMrIdSort;
    this.ResMrIdSortAscending = other.ResMrIdSortAscending;
    this.ResUpdateCount = other.ResUpdateCount;
    this.ResUpdateCountFetch = other.ResUpdateCountFetch;
    this.ResUpdateCountSort = other.ResUpdateCountSort;
    this.ResUpdateCountSortAscending = other.ResUpdateCountSortAscending;
    this.ResCreateDate = other.ResCreateDate;
    this.ResCreateDateFetch = other.ResCreateDateFetch;
    this.ResCreateDateSort = other.ResCreateDateSort;
    this.ResCreateDateSortAscending = other.ResCreateDateSortAscending;
    this.ResModifyDate = other.ResModifyDate;
    this.ResModifyDateFetch = other.ResModifyDateFetch;
    this.ResModifyDateSort = other.ResModifyDateSort;
    this.ResModifyDateSortAscending = other.ResModifyDateSortAscending;
    this.ResModifyUser = other.ResModifyUser;
    this.ResModifyUserFetch = other.ResModifyUserFetch;
    this.ResModifyUserSort = other.ResModifyUserSort;
    this.ResModifyUserCaseInsensitive = other.ResModifyUserCaseInsensitive;
    this.ResModifyUserSortAscending = other.ResModifyUserSortAscending;
    this.FrvRoleId = other.FrvRoleId;
    this.FrvRoleIdFetch = other.FrvRoleIdFetch;
    this.FrvRoleIdSort = other.FrvRoleIdSort;
    this.FrvRoleIdSortAscending = other.FrvRoleIdSortAscending;
    this.FrvLanguageCode = other.FrvLanguageCode;
    this.FrvLanguageCodeFetch = other.FrvLanguageCodeFetch;
    this.FrvLanguageCodeSort = other.FrvLanguageCodeSort;
    this.FrvLanguageCodeSortAscending = other.FrvLanguageCodeSortAscending;
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
   * @return SecurityAciObjectKeyFilter
   */
  public SecurityAciObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (SecurityAciObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: AciId (SEC_ACI.aci_id)
   * @param fetch whether to fetch this field or not
   */
  public void setAciIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new SecurityAciObjectKeyFilter ();
    this.Key.AciIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AciId (SEC_ACI.aci_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getAciIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.AciIdFetch;
  }
  /** Set the SortOrder for field: AciId (SEC_ACI.aci_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAciIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new SecurityAciObjectKeyFilter ();
    this.Key.AciIdSort = value;
  }
  /** Retrieve SortOrder for field: AciId (SEC_ACI.aci_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAciIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.AciIdSort;
  }
  /** Set the sort direction for field: AciId (SEC_ACI.aci_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAciIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new SecurityAciObjectKeyFilter ();
    this.Key.AciIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AciId (SEC_ACI.aci_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAciIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.AciIdSortAscending;
  }
  /** Set the field level filters for field: AciId (SEC_ACI.aci_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAciIdFilter (BigIntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new SecurityAciObjectKeyFilter ();
    this.Key.AciId = value;
  }
  /** Retrieve filter for field: AciId (SEC_ACI.aci_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getAciIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.AciId;
  }
  /** Set the field level Fetch value for field: AciName (SEC_ACI.aci_name)
   * @param fetch whether to fetch this field or not
   */
  public void setAciNameFetch (boolean fetch) {
    this.AciNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: AciName (SEC_ACI.aci_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getAciNameFetch () {
    return this.AciNameFetch;
  }
  /** Set the SortOrder for field: AciName (SEC_ACI.aci_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAciNameSortOrder (Integer value) {
    this.AciNameSort = value;
  }
  /** Retrieve SortOrder for field: AciName (SEC_ACI.aci_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAciNameSortOrder () {
    return this.AciNameSort;
  }
  /** Set the sort direction for field: AciName (SEC_ACI.aci_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAciNameSortDirection (boolean ascending) {
    this.AciNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AciName (SEC_ACI.aci_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAciNameSortDirection () {
    return this.AciNameSortAscending;
  }
  /** Set the case insensitive for field: AciName (SEC_ACI.aci_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAciNameCaseInsensitive (boolean ascending) {
    this.AciNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: AciName (SEC_ACI.aci_name)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getAciNameCaseInsensitive () {
    return this.AciNameCaseInsensitive;
  }
  /** Set the field level filters for field: AciName (SEC_ACI.aci_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAciNameFilter (StringFilter[] value) throws ServiceException {
    this.AciName = value;
  }
  /** Retrieve filter for field: AciName (SEC_ACI.aci_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getAciNameFilter () {
    return this.AciName;
  }

  /**
   * Retrieves the AciNameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AciNameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AciNameFilter field
   */
  public String[] getAciNameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAciNameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAciNameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAciNameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AciNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAciNameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AciNameFilter filter value from a formatted string
   *
   * @param _value the AciNameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AciNameFilter filter field
   */
  public void setAciNameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAciNameFilterFromFormattedString");
    try {
      this.setAciNameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AciNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAciNameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAciNameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AciResId (SEC_ACI.aci_res_id)
   * @param fetch whether to fetch this field or not
   */
  public void setAciResIdFetch (boolean fetch) {
    this.AciResIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AciResId (SEC_ACI.aci_res_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getAciResIdFetch () {
    return this.AciResIdFetch;
  }
  /** Set the SortOrder for field: AciResId (SEC_ACI.aci_res_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAciResIdSortOrder (Integer value) {
    this.AciResIdSort = value;
  }
  /** Retrieve SortOrder for field: AciResId (SEC_ACI.aci_res_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAciResIdSortOrder () {
    return this.AciResIdSort;
  }
  /** Set the sort direction for field: AciResId (SEC_ACI.aci_res_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAciResIdSortDirection (boolean ascending) {
    this.AciResIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AciResId (SEC_ACI.aci_res_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAciResIdSortDirection () {
    return this.AciResIdSortAscending;
  }
  /** Set the field level filters for field: AciResId (SEC_ACI.aci_res_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAciResIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.AciResId = value;
  }
  /** Retrieve filter for field: AciResId (SEC_ACI.aci_res_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getAciResIdFilter () {
    return this.AciResId;
  }

  /**
   * Retrieves the AciResIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AciResIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AciResIdFilter field
   */
  public String[] getAciResIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAciResIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAciResIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAciResIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AciResIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAciResIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AciResIdFilter filter value from a formatted string
   *
   * @param _value the AciResIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AciResIdFilter filter field
   */
  public void setAciResIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAciResIdFilterFromFormattedString");
    try {
      this.setAciResIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AciResIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAciResIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAciResIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AciRoleId (SEC_ACI.aci_role_id)
   * @param fetch whether to fetch this field or not
   */
  public void setAciRoleIdFetch (boolean fetch) {
    this.AciRoleIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AciRoleId (SEC_ACI.aci_role_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getAciRoleIdFetch () {
    return this.AciRoleIdFetch;
  }
  /** Set the SortOrder for field: AciRoleId (SEC_ACI.aci_role_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAciRoleIdSortOrder (Integer value) {
    this.AciRoleIdSort = value;
  }
  /** Retrieve SortOrder for field: AciRoleId (SEC_ACI.aci_role_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAciRoleIdSortOrder () {
    return this.AciRoleIdSort;
  }
  /** Set the sort direction for field: AciRoleId (SEC_ACI.aci_role_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAciRoleIdSortDirection (boolean ascending) {
    this.AciRoleIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AciRoleId (SEC_ACI.aci_role_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAciRoleIdSortDirection () {
    return this.AciRoleIdSortAscending;
  }
  /** Set the field level filters for field: AciRoleId (SEC_ACI.aci_role_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAciRoleIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.AciRoleId = value;
  }
  /** Retrieve filter for field: AciRoleId (SEC_ACI.aci_role_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getAciRoleIdFilter () {
    return this.AciRoleId;
  }

  /**
   * Retrieves the AciRoleIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AciRoleIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AciRoleIdFilter field
   */
  public String[] getAciRoleIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAciRoleIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAciRoleIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAciRoleIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AciRoleIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAciRoleIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AciRoleIdFilter filter value from a formatted string
   *
   * @param _value the AciRoleIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AciRoleIdFilter filter field
   */
  public void setAciRoleIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAciRoleIdFilterFromFormattedString");
    try {
      this.setAciRoleIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AciRoleIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAciRoleIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAciRoleIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AciUpdateCount (SEC_ACI.aci_update_count)
   * @param fetch whether to fetch this field or not
   */
  public void setAciUpdateCountFetch (boolean fetch) {
    this.AciUpdateCountFetch = fetch;
  }
  /** Retrieve Fetch value for field: AciUpdateCount (SEC_ACI.aci_update_count)
   * @return boolean the Fetch value for this field
   */
  public boolean getAciUpdateCountFetch () {
    return this.AciUpdateCountFetch;
  }
  /** Set the SortOrder for field: AciUpdateCount (SEC_ACI.aci_update_count)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAciUpdateCountSortOrder (Integer value) {
    this.AciUpdateCountSort = value;
  }
  /** Retrieve SortOrder for field: AciUpdateCount (SEC_ACI.aci_update_count)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAciUpdateCountSortOrder () {
    return this.AciUpdateCountSort;
  }
  /** Set the sort direction for field: AciUpdateCount (SEC_ACI.aci_update_count)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAciUpdateCountSortDirection (boolean ascending) {
    this.AciUpdateCountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AciUpdateCount (SEC_ACI.aci_update_count)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAciUpdateCountSortDirection () {
    return this.AciUpdateCountSortAscending;
  }
  /** Set the field level filters for field: AciUpdateCount (SEC_ACI.aci_update_count)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAciUpdateCountFilter (BigIntegerFilter[] value) throws ServiceException {
    this.AciUpdateCount = value;
  }
  /** Retrieve filter for field: AciUpdateCount (SEC_ACI.aci_update_count)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getAciUpdateCountFilter () {
    return this.AciUpdateCount;
  }

  /**
   * Retrieves the AciUpdateCountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AciUpdateCountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AciUpdateCountFilter field
   */
  public String[] getAciUpdateCountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAciUpdateCountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAciUpdateCountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAciUpdateCountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AciUpdateCountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAciUpdateCountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AciUpdateCountFilter filter value from a formatted string
   *
   * @param _value the AciUpdateCountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AciUpdateCountFilter filter field
   */
  public void setAciUpdateCountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAciUpdateCountFilterFromFormattedString");
    try {
      this.setAciUpdateCountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AciUpdateCountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAciUpdateCountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAciUpdateCountFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AciCreateDate (SEC_ACI.aci_create_date)
   * @param fetch whether to fetch this field or not
   */
  public void setAciCreateDateFetch (boolean fetch) {
    this.AciCreateDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: AciCreateDate (SEC_ACI.aci_create_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getAciCreateDateFetch () {
    return this.AciCreateDateFetch;
  }
  /** Set the SortOrder for field: AciCreateDate (SEC_ACI.aci_create_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAciCreateDateSortOrder (Integer value) {
    this.AciCreateDateSort = value;
  }
  /** Retrieve SortOrder for field: AciCreateDate (SEC_ACI.aci_create_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAciCreateDateSortOrder () {
    return this.AciCreateDateSort;
  }
  /** Set the sort direction for field: AciCreateDate (SEC_ACI.aci_create_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAciCreateDateSortDirection (boolean ascending) {
    this.AciCreateDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AciCreateDate (SEC_ACI.aci_create_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAciCreateDateSortDirection () {
    return this.AciCreateDateSortAscending;
  }
  /** Set the field level filters for field: AciCreateDate (SEC_ACI.aci_create_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAciCreateDateFilter (DateFilter[] value) throws ServiceException {
    this.AciCreateDate = value;
  }
  /** Retrieve filter for field: AciCreateDate (SEC_ACI.aci_create_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getAciCreateDateFilter () {
    return this.AciCreateDate;
  }

  /**
   * Retrieves the AciCreateDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AciCreateDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AciCreateDateFilter field
   */
  public String[] getAciCreateDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAciCreateDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAciCreateDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAciCreateDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AciCreateDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAciCreateDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AciCreateDateFilter filter value from a formatted string
   *
   * @param _value the AciCreateDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AciCreateDateFilter filter field
   */
  public void setAciCreateDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAciCreateDateFilterFromFormattedString");
    try {
      this.setAciCreateDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AciCreateDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAciCreateDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAciCreateDateFilterFromFormattedString");
  }

  /**
   * Retrieves the AciCreateDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AciCreateDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the AciCreateDateFilter field
   */
  public String[] getAciCreateDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAciCreateDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAciCreateDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAciCreateDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AciCreateDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAciCreateDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the AciCreateDateFilter filter value from a formatted string
   *
   * @param _value the AciCreateDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AciCreateDateFilter filter field
   */
  public void setAciCreateDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAciCreateDateFilterFromFormattedDateTimeString");
    try {
      this.setAciCreateDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AciCreateDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAciCreateDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAciCreateDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: AciModifyDate (SEC_ACI.aci_modify_date)
   * @param fetch whether to fetch this field or not
   */
  public void setAciModifyDateFetch (boolean fetch) {
    this.AciModifyDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: AciModifyDate (SEC_ACI.aci_modify_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getAciModifyDateFetch () {
    return this.AciModifyDateFetch;
  }
  /** Set the SortOrder for field: AciModifyDate (SEC_ACI.aci_modify_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAciModifyDateSortOrder (Integer value) {
    this.AciModifyDateSort = value;
  }
  /** Retrieve SortOrder for field: AciModifyDate (SEC_ACI.aci_modify_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAciModifyDateSortOrder () {
    return this.AciModifyDateSort;
  }
  /** Set the sort direction for field: AciModifyDate (SEC_ACI.aci_modify_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAciModifyDateSortDirection (boolean ascending) {
    this.AciModifyDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AciModifyDate (SEC_ACI.aci_modify_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAciModifyDateSortDirection () {
    return this.AciModifyDateSortAscending;
  }
  /** Set the field level filters for field: AciModifyDate (SEC_ACI.aci_modify_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAciModifyDateFilter (DateFilter[] value) throws ServiceException {
    this.AciModifyDate = value;
  }
  /** Retrieve filter for field: AciModifyDate (SEC_ACI.aci_modify_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getAciModifyDateFilter () {
    return this.AciModifyDate;
  }

  /**
   * Retrieves the AciModifyDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AciModifyDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AciModifyDateFilter field
   */
  public String[] getAciModifyDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAciModifyDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAciModifyDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAciModifyDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AciModifyDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAciModifyDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AciModifyDateFilter filter value from a formatted string
   *
   * @param _value the AciModifyDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AciModifyDateFilter filter field
   */
  public void setAciModifyDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAciModifyDateFilterFromFormattedString");
    try {
      this.setAciModifyDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AciModifyDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAciModifyDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAciModifyDateFilterFromFormattedString");
  }

  /**
   * Retrieves the AciModifyDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AciModifyDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the AciModifyDateFilter field
   */
  public String[] getAciModifyDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAciModifyDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAciModifyDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAciModifyDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AciModifyDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAciModifyDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the AciModifyDateFilter filter value from a formatted string
   *
   * @param _value the AciModifyDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AciModifyDateFilter filter field
   */
  public void setAciModifyDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAciModifyDateFilterFromFormattedDateTimeString");
    try {
      this.setAciModifyDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AciModifyDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAciModifyDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAciModifyDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: AciModifyUser (SEC_ACI.aci_modify_user)
   * @param fetch whether to fetch this field or not
   */
  public void setAciModifyUserFetch (boolean fetch) {
    this.AciModifyUserFetch = fetch;
  }
  /** Retrieve Fetch value for field: AciModifyUser (SEC_ACI.aci_modify_user)
   * @return boolean the Fetch value for this field
   */
  public boolean getAciModifyUserFetch () {
    return this.AciModifyUserFetch;
  }
  /** Set the SortOrder for field: AciModifyUser (SEC_ACI.aci_modify_user)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAciModifyUserSortOrder (Integer value) {
    this.AciModifyUserSort = value;
  }
  /** Retrieve SortOrder for field: AciModifyUser (SEC_ACI.aci_modify_user)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAciModifyUserSortOrder () {
    return this.AciModifyUserSort;
  }
  /** Set the sort direction for field: AciModifyUser (SEC_ACI.aci_modify_user)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAciModifyUserSortDirection (boolean ascending) {
    this.AciModifyUserSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AciModifyUser (SEC_ACI.aci_modify_user)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAciModifyUserSortDirection () {
    return this.AciModifyUserSortAscending;
  }
  /** Set the case insensitive for field: AciModifyUser (SEC_ACI.aci_modify_user)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAciModifyUserCaseInsensitive (boolean ascending) {
    this.AciModifyUserCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: AciModifyUser (SEC_ACI.aci_modify_user)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getAciModifyUserCaseInsensitive () {
    return this.AciModifyUserCaseInsensitive;
  }
  /** Set the field level filters for field: AciModifyUser (SEC_ACI.aci_modify_user)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAciModifyUserFilter (StringFilter[] value) throws ServiceException {
    this.AciModifyUser = value;
  }
  /** Retrieve filter for field: AciModifyUser (SEC_ACI.aci_modify_user)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getAciModifyUserFilter () {
    return this.AciModifyUser;
  }

  /**
   * Retrieves the AciModifyUserFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AciModifyUserFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AciModifyUserFilter field
   */
  public String[] getAciModifyUserFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAciModifyUserFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAciModifyUserFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAciModifyUserFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AciModifyUserFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAciModifyUserFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AciModifyUserFilter filter value from a formatted string
   *
   * @param _value the AciModifyUserFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AciModifyUserFilter filter field
   */
  public void setAciModifyUserFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAciModifyUserFilterFromFormattedString");
    try {
      this.setAciModifyUserFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AciModifyUserFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAciModifyUserFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAciModifyUserFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ResId (SEC_FX_RESOURCE.res_id)
   * @param fetch whether to fetch this field or not
   */
  public void setResIdFetch (boolean fetch) {
    this.ResIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ResId (SEC_FX_RESOURCE.res_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getResIdFetch () {
    return this.ResIdFetch;
  }
  /** Set the SortOrder for field: ResId (SEC_FX_RESOURCE.res_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setResIdSortOrder (Integer value) {
    this.ResIdSort = value;
  }
  /** Retrieve SortOrder for field: ResId (SEC_FX_RESOURCE.res_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getResIdSortOrder () {
    return this.ResIdSort;
  }
  /** Set the sort direction for field: ResId (SEC_FX_RESOURCE.res_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setResIdSortDirection (boolean ascending) {
    this.ResIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ResId (SEC_FX_RESOURCE.res_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getResIdSortDirection () {
    return this.ResIdSortAscending;
  }
  /** Set the field level filters for field: ResId (SEC_FX_RESOURCE.res_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setResIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.ResId = value;
  }
  /** Retrieve filter for field: ResId (SEC_FX_RESOURCE.res_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getResIdFilter () {
    return this.ResId;
  }

  /**
   * Retrieves the ResIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ResIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ResIdFilter field
   */
  public String[] getResIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getResIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getResIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getResIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ResIdFilter filter value from a formatted string
   *
   * @param _value the ResIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ResIdFilter filter field
   */
  public void setResIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setResIdFilterFromFormattedString");
    try {
      this.setResIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setResIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setResIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ResName (SEC_FX_RESOURCE.res_name)
   * @param fetch whether to fetch this field or not
   */
  public void setResNameFetch (boolean fetch) {
    this.ResNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: ResName (SEC_FX_RESOURCE.res_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getResNameFetch () {
    return this.ResNameFetch;
  }
  /** Set the SortOrder for field: ResName (SEC_FX_RESOURCE.res_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setResNameSortOrder (Integer value) {
    this.ResNameSort = value;
  }
  /** Retrieve SortOrder for field: ResName (SEC_FX_RESOURCE.res_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getResNameSortOrder () {
    return this.ResNameSort;
  }
  /** Set the sort direction for field: ResName (SEC_FX_RESOURCE.res_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setResNameSortDirection (boolean ascending) {
    this.ResNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ResName (SEC_FX_RESOURCE.res_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getResNameSortDirection () {
    return this.ResNameSortAscending;
  }
  /** Set the case insensitive for field: ResName (SEC_FX_RESOURCE.res_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setResNameCaseInsensitive (boolean ascending) {
    this.ResNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ResName (SEC_FX_RESOURCE.res_name)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getResNameCaseInsensitive () {
    return this.ResNameCaseInsensitive;
  }
  /** Set the field level filters for field: ResName (SEC_FX_RESOURCE.res_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setResNameFilter (StringFilter[] value) throws ServiceException {
    this.ResName = value;
  }
  /** Retrieve filter for field: ResName (SEC_FX_RESOURCE.res_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getResNameFilter () {
    return this.ResName;
  }

  /**
   * Retrieves the ResNameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ResNameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ResNameFilter field
   */
  public String[] getResNameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResNameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getResNameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getResNameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getResNameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ResNameFilter filter value from a formatted string
   *
   * @param _value the ResNameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ResNameFilter filter field
   */
  public void setResNameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setResNameFilterFromFormattedString");
    try {
      this.setResNameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setResNameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setResNameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ResSubId (SEC_FX_RESOURCE.res_sub_id)
   * @param fetch whether to fetch this field or not
   */
  public void setResSubIdFetch (boolean fetch) {
    this.ResSubIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ResSubId (SEC_FX_RESOURCE.res_sub_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getResSubIdFetch () {
    return this.ResSubIdFetch;
  }
  /** Set the SortOrder for field: ResSubId (SEC_FX_RESOURCE.res_sub_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setResSubIdSortOrder (Integer value) {
    this.ResSubIdSort = value;
  }
  /** Retrieve SortOrder for field: ResSubId (SEC_FX_RESOURCE.res_sub_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getResSubIdSortOrder () {
    return this.ResSubIdSort;
  }
  /** Set the sort direction for field: ResSubId (SEC_FX_RESOURCE.res_sub_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setResSubIdSortDirection (boolean ascending) {
    this.ResSubIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ResSubId (SEC_FX_RESOURCE.res_sub_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getResSubIdSortDirection () {
    return this.ResSubIdSortAscending;
  }
  /** Set the field level filters for field: ResSubId (SEC_FX_RESOURCE.res_sub_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setResSubIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.ResSubId = value;
  }
  /** Retrieve filter for field: ResSubId (SEC_FX_RESOURCE.res_sub_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getResSubIdFilter () {
    return this.ResSubId;
  }

  /**
   * Retrieves the ResSubIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ResSubIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ResSubIdFilter field
   */
  public String[] getResSubIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResSubIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getResSubIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getResSubIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResSubIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getResSubIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ResSubIdFilter filter value from a formatted string
   *
   * @param _value the ResSubIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ResSubIdFilter filter field
   */
  public void setResSubIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setResSubIdFilterFromFormattedString");
    try {
      this.setResSubIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResSubIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setResSubIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setResSubIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ResRtyId (SEC_FX_RESOURCE.res_rty_id)
   * @param fetch whether to fetch this field or not
   */
  public void setResRtyIdFetch (boolean fetch) {
    this.ResRtyIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ResRtyId (SEC_FX_RESOURCE.res_rty_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getResRtyIdFetch () {
    return this.ResRtyIdFetch;
  }
  /** Set the SortOrder for field: ResRtyId (SEC_FX_RESOURCE.res_rty_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setResRtyIdSortOrder (Integer value) {
    this.ResRtyIdSort = value;
  }
  /** Retrieve SortOrder for field: ResRtyId (SEC_FX_RESOURCE.res_rty_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getResRtyIdSortOrder () {
    return this.ResRtyIdSort;
  }
  /** Set the sort direction for field: ResRtyId (SEC_FX_RESOURCE.res_rty_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setResRtyIdSortDirection (boolean ascending) {
    this.ResRtyIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ResRtyId (SEC_FX_RESOURCE.res_rty_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getResRtyIdSortDirection () {
    return this.ResRtyIdSortAscending;
  }
  /** Set the field level filters for field: ResRtyId (SEC_FX_RESOURCE.res_rty_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setResRtyIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.ResRtyId = value;
  }
  /** Retrieve filter for field: ResRtyId (SEC_FX_RESOURCE.res_rty_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getResRtyIdFilter () {
    return this.ResRtyId;
  }

  /**
   * Retrieves the ResRtyIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ResRtyIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ResRtyIdFilter field
   */
  public String[] getResRtyIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResRtyIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getResRtyIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getResRtyIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResRtyIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getResRtyIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ResRtyIdFilter filter value from a formatted string
   *
   * @param _value the ResRtyIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ResRtyIdFilter filter field
   */
  public void setResRtyIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setResRtyIdFilterFromFormattedString");
    try {
      this.setResRtyIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResRtyIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setResRtyIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setResRtyIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ResMrId (SEC_FX_RESOURCE.res_mr_id)
   * @param fetch whether to fetch this field or not
   */
  public void setResMrIdFetch (boolean fetch) {
    this.ResMrIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ResMrId (SEC_FX_RESOURCE.res_mr_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getResMrIdFetch () {
    return this.ResMrIdFetch;
  }
  /** Set the SortOrder for field: ResMrId (SEC_FX_RESOURCE.res_mr_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setResMrIdSortOrder (Integer value) {
    this.ResMrIdSort = value;
  }
  /** Retrieve SortOrder for field: ResMrId (SEC_FX_RESOURCE.res_mr_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getResMrIdSortOrder () {
    return this.ResMrIdSort;
  }
  /** Set the sort direction for field: ResMrId (SEC_FX_RESOURCE.res_mr_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setResMrIdSortDirection (boolean ascending) {
    this.ResMrIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ResMrId (SEC_FX_RESOURCE.res_mr_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getResMrIdSortDirection () {
    return this.ResMrIdSortAscending;
  }
  /** Set the field level filters for field: ResMrId (SEC_FX_RESOURCE.res_mr_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setResMrIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.ResMrId = value;
  }
  /** Retrieve filter for field: ResMrId (SEC_FX_RESOURCE.res_mr_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getResMrIdFilter () {
    return this.ResMrId;
  }

  /**
   * Retrieves the ResMrIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ResMrIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ResMrIdFilter field
   */
  public String[] getResMrIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResMrIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getResMrIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getResMrIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResMrIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getResMrIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ResMrIdFilter filter value from a formatted string
   *
   * @param _value the ResMrIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ResMrIdFilter filter field
   */
  public void setResMrIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setResMrIdFilterFromFormattedString");
    try {
      this.setResMrIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResMrIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setResMrIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setResMrIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ResUpdateCount (SEC_FX_RESOURCE.res_update_count)
   * @param fetch whether to fetch this field or not
   */
  public void setResUpdateCountFetch (boolean fetch) {
    this.ResUpdateCountFetch = fetch;
  }
  /** Retrieve Fetch value for field: ResUpdateCount (SEC_FX_RESOURCE.res_update_count)
   * @return boolean the Fetch value for this field
   */
  public boolean getResUpdateCountFetch () {
    return this.ResUpdateCountFetch;
  }
  /** Set the SortOrder for field: ResUpdateCount (SEC_FX_RESOURCE.res_update_count)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setResUpdateCountSortOrder (Integer value) {
    this.ResUpdateCountSort = value;
  }
  /** Retrieve SortOrder for field: ResUpdateCount (SEC_FX_RESOURCE.res_update_count)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getResUpdateCountSortOrder () {
    return this.ResUpdateCountSort;
  }
  /** Set the sort direction for field: ResUpdateCount (SEC_FX_RESOURCE.res_update_count)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setResUpdateCountSortDirection (boolean ascending) {
    this.ResUpdateCountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ResUpdateCount (SEC_FX_RESOURCE.res_update_count)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getResUpdateCountSortDirection () {
    return this.ResUpdateCountSortAscending;
  }
  /** Set the field level filters for field: ResUpdateCount (SEC_FX_RESOURCE.res_update_count)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setResUpdateCountFilter (BigIntegerFilter[] value) throws ServiceException {
    this.ResUpdateCount = value;
  }
  /** Retrieve filter for field: ResUpdateCount (SEC_FX_RESOURCE.res_update_count)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getResUpdateCountFilter () {
    return this.ResUpdateCount;
  }

  /**
   * Retrieves the ResUpdateCountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ResUpdateCountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ResUpdateCountFilter field
   */
  public String[] getResUpdateCountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResUpdateCountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getResUpdateCountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getResUpdateCountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResUpdateCountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getResUpdateCountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ResUpdateCountFilter filter value from a formatted string
   *
   * @param _value the ResUpdateCountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ResUpdateCountFilter filter field
   */
  public void setResUpdateCountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setResUpdateCountFilterFromFormattedString");
    try {
      this.setResUpdateCountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResUpdateCountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setResUpdateCountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setResUpdateCountFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ResCreateDate (SEC_FX_RESOURCE.res_create_date)
   * @param fetch whether to fetch this field or not
   */
  public void setResCreateDateFetch (boolean fetch) {
    this.ResCreateDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: ResCreateDate (SEC_FX_RESOURCE.res_create_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getResCreateDateFetch () {
    return this.ResCreateDateFetch;
  }
  /** Set the SortOrder for field: ResCreateDate (SEC_FX_RESOURCE.res_create_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setResCreateDateSortOrder (Integer value) {
    this.ResCreateDateSort = value;
  }
  /** Retrieve SortOrder for field: ResCreateDate (SEC_FX_RESOURCE.res_create_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getResCreateDateSortOrder () {
    return this.ResCreateDateSort;
  }
  /** Set the sort direction for field: ResCreateDate (SEC_FX_RESOURCE.res_create_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setResCreateDateSortDirection (boolean ascending) {
    this.ResCreateDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ResCreateDate (SEC_FX_RESOURCE.res_create_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getResCreateDateSortDirection () {
    return this.ResCreateDateSortAscending;
  }
  /** Set the field level filters for field: ResCreateDate (SEC_FX_RESOURCE.res_create_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setResCreateDateFilter (DateFilter[] value) throws ServiceException {
    this.ResCreateDate = value;
  }
  /** Retrieve filter for field: ResCreateDate (SEC_FX_RESOURCE.res_create_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getResCreateDateFilter () {
    return this.ResCreateDate;
  }

  /**
   * Retrieves the ResCreateDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ResCreateDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ResCreateDateFilter field
   */
  public String[] getResCreateDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResCreateDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getResCreateDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getResCreateDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResCreateDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getResCreateDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ResCreateDateFilter filter value from a formatted string
   *
   * @param _value the ResCreateDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ResCreateDateFilter filter field
   */
  public void setResCreateDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setResCreateDateFilterFromFormattedString");
    try {
      this.setResCreateDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResCreateDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setResCreateDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setResCreateDateFilterFromFormattedString");
  }

  /**
   * Retrieves the ResCreateDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ResCreateDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ResCreateDateFilter field
   */
  public String[] getResCreateDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResCreateDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getResCreateDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getResCreateDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResCreateDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getResCreateDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ResCreateDateFilter filter value from a formatted string
   *
   * @param _value the ResCreateDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ResCreateDateFilter filter field
   */
  public void setResCreateDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setResCreateDateFilterFromFormattedDateTimeString");
    try {
      this.setResCreateDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResCreateDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setResCreateDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setResCreateDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: ResModifyDate (SEC_FX_RESOURCE.res_modify_date)
   * @param fetch whether to fetch this field or not
   */
  public void setResModifyDateFetch (boolean fetch) {
    this.ResModifyDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: ResModifyDate (SEC_FX_RESOURCE.res_modify_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getResModifyDateFetch () {
    return this.ResModifyDateFetch;
  }
  /** Set the SortOrder for field: ResModifyDate (SEC_FX_RESOURCE.res_modify_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setResModifyDateSortOrder (Integer value) {
    this.ResModifyDateSort = value;
  }
  /** Retrieve SortOrder for field: ResModifyDate (SEC_FX_RESOURCE.res_modify_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getResModifyDateSortOrder () {
    return this.ResModifyDateSort;
  }
  /** Set the sort direction for field: ResModifyDate (SEC_FX_RESOURCE.res_modify_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setResModifyDateSortDirection (boolean ascending) {
    this.ResModifyDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ResModifyDate (SEC_FX_RESOURCE.res_modify_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getResModifyDateSortDirection () {
    return this.ResModifyDateSortAscending;
  }
  /** Set the field level filters for field: ResModifyDate (SEC_FX_RESOURCE.res_modify_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setResModifyDateFilter (DateFilter[] value) throws ServiceException {
    this.ResModifyDate = value;
  }
  /** Retrieve filter for field: ResModifyDate (SEC_FX_RESOURCE.res_modify_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getResModifyDateFilter () {
    return this.ResModifyDate;
  }

  /**
   * Retrieves the ResModifyDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ResModifyDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ResModifyDateFilter field
   */
  public String[] getResModifyDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResModifyDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getResModifyDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getResModifyDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResModifyDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getResModifyDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ResModifyDateFilter filter value from a formatted string
   *
   * @param _value the ResModifyDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ResModifyDateFilter filter field
   */
  public void setResModifyDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setResModifyDateFilterFromFormattedString");
    try {
      this.setResModifyDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResModifyDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setResModifyDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setResModifyDateFilterFromFormattedString");
  }

  /**
   * Retrieves the ResModifyDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ResModifyDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ResModifyDateFilter field
   */
  public String[] getResModifyDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResModifyDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getResModifyDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getResModifyDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResModifyDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getResModifyDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ResModifyDateFilter filter value from a formatted string
   *
   * @param _value the ResModifyDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ResModifyDateFilter filter field
   */
  public void setResModifyDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setResModifyDateFilterFromFormattedDateTimeString");
    try {
      this.setResModifyDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResModifyDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setResModifyDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setResModifyDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: ResModifyUser (SEC_FX_RESOURCE.res_modify_user)
   * @param fetch whether to fetch this field or not
   */
  public void setResModifyUserFetch (boolean fetch) {
    this.ResModifyUserFetch = fetch;
  }
  /** Retrieve Fetch value for field: ResModifyUser (SEC_FX_RESOURCE.res_modify_user)
   * @return boolean the Fetch value for this field
   */
  public boolean getResModifyUserFetch () {
    return this.ResModifyUserFetch;
  }
  /** Set the SortOrder for field: ResModifyUser (SEC_FX_RESOURCE.res_modify_user)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setResModifyUserSortOrder (Integer value) {
    this.ResModifyUserSort = value;
  }
  /** Retrieve SortOrder for field: ResModifyUser (SEC_FX_RESOURCE.res_modify_user)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getResModifyUserSortOrder () {
    return this.ResModifyUserSort;
  }
  /** Set the sort direction for field: ResModifyUser (SEC_FX_RESOURCE.res_modify_user)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setResModifyUserSortDirection (boolean ascending) {
    this.ResModifyUserSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ResModifyUser (SEC_FX_RESOURCE.res_modify_user)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getResModifyUserSortDirection () {
    return this.ResModifyUserSortAscending;
  }
  /** Set the case insensitive for field: ResModifyUser (SEC_FX_RESOURCE.res_modify_user)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setResModifyUserCaseInsensitive (boolean ascending) {
    this.ResModifyUserCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ResModifyUser (SEC_FX_RESOURCE.res_modify_user)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getResModifyUserCaseInsensitive () {
    return this.ResModifyUserCaseInsensitive;
  }
  /** Set the field level filters for field: ResModifyUser (SEC_FX_RESOURCE.res_modify_user)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setResModifyUserFilter (StringFilter[] value) throws ServiceException {
    this.ResModifyUser = value;
  }
  /** Retrieve filter for field: ResModifyUser (SEC_FX_RESOURCE.res_modify_user)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getResModifyUserFilter () {
    return this.ResModifyUser;
  }

  /**
   * Retrieves the ResModifyUserFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ResModifyUserFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ResModifyUserFilter field
   */
  public String[] getResModifyUserFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResModifyUserFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getResModifyUserFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getResModifyUserFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResModifyUserFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getResModifyUserFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ResModifyUserFilter filter value from a formatted string
   *
   * @param _value the ResModifyUserFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ResModifyUserFilter filter field
   */
  public void setResModifyUserFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setResModifyUserFilterFromFormattedString");
    try {
      this.setResModifyUserFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResModifyUserFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setResModifyUserFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setResModifyUserFilterFromFormattedString");
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
    return SecurityAciObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return SecurityAciObjectHelper.toMap(this, null);
  }
}
