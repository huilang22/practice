/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ClearingHouseContactsObjectFilter.java
 * Definition File: Customer/ClearingHouseContacts.xml
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
public class ClearingHouseContactsObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public ClearingHouseContactsObjectKeyFilter Key = null;
  /** raw field for: CLEARING_HOUSE_CONTACTS.clearing_house_id) */
  public    StringFilter[] ClearingHouseId  = null;
  protected boolean ClearingHouseIdFetch = false;
  protected boolean ClearingHouseIdSortAscending = true;
  protected boolean ClearingHouseIdCaseInsensitive = false;
  protected Integer ClearingHouseIdSort = null;
  /** raw field for: CLEARING_HOUSE_CONTACTS.module) */
  public    StringFilter[] Module  = null;
  protected boolean ModuleFetch = false;
  protected boolean ModuleSortAscending = true;
  protected boolean ModuleCaseInsensitive = false;
  protected Integer ModuleSort = null;
  /** raw field for: CLEARING_HOUSE_CONTACTS.is_send) */
  public    IntegerFilter[] IsSend  = null;
  protected boolean IsSendFetch = false;
  protected boolean IsSendSortAscending = true;
  protected Integer IsSendSort = null;
  /** raw field for: CLEARING_HOUSE_CONTACTS.ch_format_type) */
  public    IntegerFilter[] ChFormatType  = null;
  protected boolean ChFormatTypeFetch = false;
  protected boolean ChFormatTypeSortAscending = true;
  protected Integer ChFormatTypeSort = null;
  /** raw field for: CLEARING_HOUSE_CONTACTS.credit_trans_type) */
  public    IntegerFilter[] CreditTransType  = null;
  protected boolean CreditTransTypeFetch = false;
  protected boolean CreditTransTypeSortAscending = true;
  protected Integer CreditTransTypeSort = null;
  /** raw field for: CLEARING_HOUSE_CONTACTS.debit_trans_type) */
  public    IntegerFilter[] DebitTransType  = null;
  protected boolean DebitTransTypeFetch = false;
  protected boolean DebitTransTypeSortAscending = true;
  protected Integer DebitTransTypeSort = null;
  /** raw field for: CLEARING_HOUSE_CONTACTS.allow_auto_post) */
  public    BooleanFilter[] AllowAutoPost  = null;
  protected boolean AllowAutoPostFetch = false;
  protected boolean AllowAutoPostSortAscending = true;
  protected Integer AllowAutoPostSort = null;
  /** raw field for: CLEARING_HOUSE_CONTACTS.auto_post_delay) */
  public    IntegerFilter[] AutoPostDelay  = null;
  protected boolean AutoPostDelayFetch = false;
  protected boolean AutoPostDelaySortAscending = true;
  protected Integer AutoPostDelaySort = null;
  /** raw field for: CLEARING_HOUSE_CONTACTS.chgb_resubmit_delay) */
  public    IntegerFilter[] ChgbResubmitDelay  = null;
  protected boolean ChgbResubmitDelayFetch = false;
  protected boolean ChgbResubmitDelaySortAscending = true;
  protected Integer ChgbResubmitDelaySort = null;
  /** raw field for: CLEARING_HOUSE_CONTACTS.collection_delay) */
  public    IntegerFilter[] CollectionDelay  = null;
  protected boolean CollectionDelayFetch = false;
  protected boolean CollectionDelaySortAscending = true;
  protected Integer CollectionDelaySort = null;
  /** raw field for: CLEARING_HOUSE_CONTACTS.suppress_prenotes) */
  public    BooleanFilter[] SuppressPrenotes  = null;
  protected boolean SuppressPrenotesFetch = false;
  protected boolean SuppressPrenotesSortAscending = true;
  protected Integer SuppressPrenotesSort = null;
  /** raw field for: CLEARING_HOUSE_CONTACTS.config_tag_id) */
  public    StringFilter[] ConfigTagId  = null;
  protected boolean ConfigTagIdFetch = false;
  protected boolean ConfigTagIdSortAscending = true;
  protected boolean ConfigTagIdCaseInsensitive = false;
  protected Integer ConfigTagIdSort = null;
  private String _objName = "ClearingHouseContactsObjectFilter";
  /** default constructor */
  public ClearingHouseContactsObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public ClearingHouseContactsObjectFilter (ClearingHouseContactsObjectFilter other)
  {
    if (other == null) return;
    this.Key = new ClearingHouseContactsObjectKeyFilter (other.Key);
    this.ClearingHouseId = other.ClearingHouseId;
    this.ClearingHouseIdFetch = other.ClearingHouseIdFetch;
    this.ClearingHouseIdSort = other.ClearingHouseIdSort;
    this.ClearingHouseIdCaseInsensitive = other.ClearingHouseIdCaseInsensitive;
    this.ClearingHouseIdSortAscending = other.ClearingHouseIdSortAscending;
    this.Module = other.Module;
    this.ModuleFetch = other.ModuleFetch;
    this.ModuleSort = other.ModuleSort;
    this.ModuleCaseInsensitive = other.ModuleCaseInsensitive;
    this.ModuleSortAscending = other.ModuleSortAscending;
    this.IsSend = other.IsSend;
    this.IsSendFetch = other.IsSendFetch;
    this.IsSendSort = other.IsSendSort;
    this.IsSendSortAscending = other.IsSendSortAscending;
    this.ChFormatType = other.ChFormatType;
    this.ChFormatTypeFetch = other.ChFormatTypeFetch;
    this.ChFormatTypeSort = other.ChFormatTypeSort;
    this.ChFormatTypeSortAscending = other.ChFormatTypeSortAscending;
    this.CreditTransType = other.CreditTransType;
    this.CreditTransTypeFetch = other.CreditTransTypeFetch;
    this.CreditTransTypeSort = other.CreditTransTypeSort;
    this.CreditTransTypeSortAscending = other.CreditTransTypeSortAscending;
    this.DebitTransType = other.DebitTransType;
    this.DebitTransTypeFetch = other.DebitTransTypeFetch;
    this.DebitTransTypeSort = other.DebitTransTypeSort;
    this.DebitTransTypeSortAscending = other.DebitTransTypeSortAscending;
    this.AllowAutoPost = other.AllowAutoPost;
    this.AllowAutoPostFetch = other.AllowAutoPostFetch;
    this.AllowAutoPostSort = other.AllowAutoPostSort;
    this.AllowAutoPostSortAscending = other.AllowAutoPostSortAscending;
    this.AutoPostDelay = other.AutoPostDelay;
    this.AutoPostDelayFetch = other.AutoPostDelayFetch;
    this.AutoPostDelaySort = other.AutoPostDelaySort;
    this.AutoPostDelaySortAscending = other.AutoPostDelaySortAscending;
    this.ChgbResubmitDelay = other.ChgbResubmitDelay;
    this.ChgbResubmitDelayFetch = other.ChgbResubmitDelayFetch;
    this.ChgbResubmitDelaySort = other.ChgbResubmitDelaySort;
    this.ChgbResubmitDelaySortAscending = other.ChgbResubmitDelaySortAscending;
    this.CollectionDelay = other.CollectionDelay;
    this.CollectionDelayFetch = other.CollectionDelayFetch;
    this.CollectionDelaySort = other.CollectionDelaySort;
    this.CollectionDelaySortAscending = other.CollectionDelaySortAscending;
    this.SuppressPrenotes = other.SuppressPrenotes;
    this.SuppressPrenotesFetch = other.SuppressPrenotesFetch;
    this.SuppressPrenotesSort = other.SuppressPrenotesSort;
    this.SuppressPrenotesSortAscending = other.SuppressPrenotesSortAscending;
    this.ConfigTagId = other.ConfigTagId;
    this.ConfigTagIdFetch = other.ConfigTagIdFetch;
    this.ConfigTagIdSort = other.ConfigTagIdSort;
    this.ConfigTagIdCaseInsensitive = other.ConfigTagIdCaseInsensitive;
    this.ConfigTagIdSortAscending = other.ConfigTagIdSortAscending;  }
  /** get the filter for this object's key
   * @return ClearingHouseContactsObjectKeyFilter
   */
  public ClearingHouseContactsObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (ClearingHouseContactsObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: ExtContactId (CLEARING_HOUSE_CONTACTS.ext_contact_id)
   * @param fetch whether to fetch this field or not
   */
  public void setExtContactIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new ClearingHouseContactsObjectKeyFilter ();
    this.Key.ExtContactIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ExtContactId (CLEARING_HOUSE_CONTACTS.ext_contact_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getExtContactIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.ExtContactIdFetch;
  }
  /** Set the SortOrder for field: ExtContactId (CLEARING_HOUSE_CONTACTS.ext_contact_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setExtContactIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new ClearingHouseContactsObjectKeyFilter ();
    this.Key.ExtContactIdSort = value;
  }
  /** Retrieve SortOrder for field: ExtContactId (CLEARING_HOUSE_CONTACTS.ext_contact_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getExtContactIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.ExtContactIdSort;
  }
  /** Set the sort direction for field: ExtContactId (CLEARING_HOUSE_CONTACTS.ext_contact_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setExtContactIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new ClearingHouseContactsObjectKeyFilter ();
    this.Key.ExtContactIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ExtContactId (CLEARING_HOUSE_CONTACTS.ext_contact_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getExtContactIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.ExtContactIdSortAscending;
  }
  /** Set the field level filters for field: ExtContactId (CLEARING_HOUSE_CONTACTS.ext_contact_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setExtContactIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new ClearingHouseContactsObjectKeyFilter ();
    this.Key.ExtContactId = value;
  }
  /** Retrieve filter for field: ExtContactId (CLEARING_HOUSE_CONTACTS.ext_contact_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getExtContactIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.ExtContactId;
  }
  /** Set the field level Fetch value for field: ClearingHouseId (CLEARING_HOUSE_CONTACTS.clearing_house_id)
   * @param fetch whether to fetch this field or not
   */
  public void setClearingHouseIdFetch (boolean fetch) {
    this.ClearingHouseIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ClearingHouseId (CLEARING_HOUSE_CONTACTS.clearing_house_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getClearingHouseIdFetch () {
    return this.ClearingHouseIdFetch;
  }
  /** Set the SortOrder for field: ClearingHouseId (CLEARING_HOUSE_CONTACTS.clearing_house_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setClearingHouseIdSortOrder (Integer value) {
    this.ClearingHouseIdSort = value;
  }
  /** Retrieve SortOrder for field: ClearingHouseId (CLEARING_HOUSE_CONTACTS.clearing_house_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getClearingHouseIdSortOrder () {
    return this.ClearingHouseIdSort;
  }
  /** Set the sort direction for field: ClearingHouseId (CLEARING_HOUSE_CONTACTS.clearing_house_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setClearingHouseIdSortDirection (boolean ascending) {
    this.ClearingHouseIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ClearingHouseId (CLEARING_HOUSE_CONTACTS.clearing_house_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getClearingHouseIdSortDirection () {
    return this.ClearingHouseIdSortAscending;
  }
  /** Set the case insensitive for field: ClearingHouseId (CLEARING_HOUSE_CONTACTS.clearing_house_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setClearingHouseIdCaseInsensitive (boolean ascending) {
    this.ClearingHouseIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ClearingHouseId (CLEARING_HOUSE_CONTACTS.clearing_house_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getClearingHouseIdCaseInsensitive () {
    return this.ClearingHouseIdCaseInsensitive;
  }
  /** Set the field level filters for field: ClearingHouseId (CLEARING_HOUSE_CONTACTS.clearing_house_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setClearingHouseIdFilter (StringFilter[] value) throws ServiceException {
    this.ClearingHouseId = value;
  }
  /** Retrieve filter for field: ClearingHouseId (CLEARING_HOUSE_CONTACTS.clearing_house_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getClearingHouseIdFilter () {
    return this.ClearingHouseId;
  }

  /**
   * Retrieves the ClearingHouseIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ClearingHouseIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ClearingHouseIdFilter field
   */
  public String[] getClearingHouseIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getClearingHouseIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getClearingHouseIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getClearingHouseIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ClearingHouseIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getClearingHouseIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ClearingHouseIdFilter filter value from a formatted string
   *
   * @param _value the ClearingHouseIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ClearingHouseIdFilter filter field
   */
  public void setClearingHouseIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setClearingHouseIdFilterFromFormattedString");
    try {
      this.setClearingHouseIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ClearingHouseIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setClearingHouseIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setClearingHouseIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Module (CLEARING_HOUSE_CONTACTS.module)
   * @param fetch whether to fetch this field or not
   */
  public void setModuleFetch (boolean fetch) {
    this.ModuleFetch = fetch;
  }
  /** Retrieve Fetch value for field: Module (CLEARING_HOUSE_CONTACTS.module)
   * @return boolean the Fetch value for this field
   */
  public boolean getModuleFetch () {
    return this.ModuleFetch;
  }
  /** Set the SortOrder for field: Module (CLEARING_HOUSE_CONTACTS.module)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setModuleSortOrder (Integer value) {
    this.ModuleSort = value;
  }
  /** Retrieve SortOrder for field: Module (CLEARING_HOUSE_CONTACTS.module)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getModuleSortOrder () {
    return this.ModuleSort;
  }
  /** Set the sort direction for field: Module (CLEARING_HOUSE_CONTACTS.module)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setModuleSortDirection (boolean ascending) {
    this.ModuleSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Module (CLEARING_HOUSE_CONTACTS.module)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getModuleSortDirection () {
    return this.ModuleSortAscending;
  }
  /** Set the case insensitive for field: Module (CLEARING_HOUSE_CONTACTS.module)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setModuleCaseInsensitive (boolean ascending) {
    this.ModuleCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: Module (CLEARING_HOUSE_CONTACTS.module)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getModuleCaseInsensitive () {
    return this.ModuleCaseInsensitive;
  }
  /** Set the field level filters for field: Module (CLEARING_HOUSE_CONTACTS.module)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setModuleFilter (StringFilter[] value) throws ServiceException {
    this.Module = value;
  }
  /** Retrieve filter for field: Module (CLEARING_HOUSE_CONTACTS.module)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getModuleFilter () {
    return this.Module;
  }

  /**
   * Retrieves the ModuleFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ModuleFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ModuleFilter field
   */
  public String[] getModuleFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getModuleFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getModuleFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getModuleFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ModuleFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getModuleFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ModuleFilter filter value from a formatted string
   *
   * @param _value the ModuleFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ModuleFilter filter field
   */
  public void setModuleFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setModuleFilterFromFormattedString");
    try {
      this.setModuleFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ModuleFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setModuleFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setModuleFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsSend (CLEARING_HOUSE_CONTACTS.is_send)
   * @param fetch whether to fetch this field or not
   */
  public void setIsSendFetch (boolean fetch) {
    this.IsSendFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsSend (CLEARING_HOUSE_CONTACTS.is_send)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsSendFetch () {
    return this.IsSendFetch;
  }
  /** Set the SortOrder for field: IsSend (CLEARING_HOUSE_CONTACTS.is_send)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsSendSortOrder (Integer value) {
    this.IsSendSort = value;
  }
  /** Retrieve SortOrder for field: IsSend (CLEARING_HOUSE_CONTACTS.is_send)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsSendSortOrder () {
    return this.IsSendSort;
  }
  /** Set the sort direction for field: IsSend (CLEARING_HOUSE_CONTACTS.is_send)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsSendSortDirection (boolean ascending) {
    this.IsSendSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsSend (CLEARING_HOUSE_CONTACTS.is_send)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsSendSortDirection () {
    return this.IsSendSortAscending;
  }
  /** Set the field level filters for field: IsSend (CLEARING_HOUSE_CONTACTS.is_send)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsSendFilter (IntegerFilter[] value) throws ServiceException {
    this.IsSend = value;
  }
  /** Retrieve filter for field: IsSend (CLEARING_HOUSE_CONTACTS.is_send)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getIsSendFilter () {
    return this.IsSend;
  }

  /**
   * Retrieves the IsSendFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsSendFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsSendFilter field
   */
  public String[] getIsSendFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsSendFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsSendFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsSendFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsSendFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsSendFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsSendFilter filter value from a formatted string
   *
   * @param _value the IsSendFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsSendFilter filter field
   */
  public void setIsSendFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsSendFilterFromFormattedString");
    try {
      this.setIsSendFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsSendFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsSendFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsSendFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ChFormatType (CLEARING_HOUSE_CONTACTS.ch_format_type)
   * @param fetch whether to fetch this field or not
   */
  public void setChFormatTypeFetch (boolean fetch) {
    this.ChFormatTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChFormatType (CLEARING_HOUSE_CONTACTS.ch_format_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getChFormatTypeFetch () {
    return this.ChFormatTypeFetch;
  }
  /** Set the SortOrder for field: ChFormatType (CLEARING_HOUSE_CONTACTS.ch_format_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChFormatTypeSortOrder (Integer value) {
    this.ChFormatTypeSort = value;
  }
  /** Retrieve SortOrder for field: ChFormatType (CLEARING_HOUSE_CONTACTS.ch_format_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChFormatTypeSortOrder () {
    return this.ChFormatTypeSort;
  }
  /** Set the sort direction for field: ChFormatType (CLEARING_HOUSE_CONTACTS.ch_format_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChFormatTypeSortDirection (boolean ascending) {
    this.ChFormatTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChFormatType (CLEARING_HOUSE_CONTACTS.ch_format_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChFormatTypeSortDirection () {
    return this.ChFormatTypeSortAscending;
  }
  /** Set the field level filters for field: ChFormatType (CLEARING_HOUSE_CONTACTS.ch_format_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChFormatTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.ChFormatType = value;
  }
  /** Retrieve filter for field: ChFormatType (CLEARING_HOUSE_CONTACTS.ch_format_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getChFormatTypeFilter () {
    return this.ChFormatType;
  }

  /**
   * Retrieves the ChFormatTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChFormatTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChFormatTypeFilter field
   */
  public String[] getChFormatTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChFormatTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getChFormatTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChFormatTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChFormatTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChFormatTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ChFormatTypeFilter filter value from a formatted string
   *
   * @param _value the ChFormatTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ChFormatTypeFilter filter field
   */
  public void setChFormatTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChFormatTypeFilterFromFormattedString");
    try {
      this.setChFormatTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChFormatTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChFormatTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChFormatTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CreditTransType (CLEARING_HOUSE_CONTACTS.credit_trans_type)
   * @param fetch whether to fetch this field or not
   */
  public void setCreditTransTypeFetch (boolean fetch) {
    this.CreditTransTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CreditTransType (CLEARING_HOUSE_CONTACTS.credit_trans_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getCreditTransTypeFetch () {
    return this.CreditTransTypeFetch;
  }
  /** Set the SortOrder for field: CreditTransType (CLEARING_HOUSE_CONTACTS.credit_trans_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCreditTransTypeSortOrder (Integer value) {
    this.CreditTransTypeSort = value;
  }
  /** Retrieve SortOrder for field: CreditTransType (CLEARING_HOUSE_CONTACTS.credit_trans_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCreditTransTypeSortOrder () {
    return this.CreditTransTypeSort;
  }
  /** Set the sort direction for field: CreditTransType (CLEARING_HOUSE_CONTACTS.credit_trans_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCreditTransTypeSortDirection (boolean ascending) {
    this.CreditTransTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CreditTransType (CLEARING_HOUSE_CONTACTS.credit_trans_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCreditTransTypeSortDirection () {
    return this.CreditTransTypeSortAscending;
  }
  /** Set the field level filters for field: CreditTransType (CLEARING_HOUSE_CONTACTS.credit_trans_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCreditTransTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.CreditTransType = value;
  }
  /** Retrieve filter for field: CreditTransType (CLEARING_HOUSE_CONTACTS.credit_trans_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCreditTransTypeFilter () {
    return this.CreditTransType;
  }

  /**
   * Retrieves the CreditTransTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CreditTransTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CreditTransTypeFilter field
   */
  public String[] getCreditTransTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreditTransTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCreditTransTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCreditTransTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CreditTransTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCreditTransTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CreditTransTypeFilter filter value from a formatted string
   *
   * @param _value the CreditTransTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CreditTransTypeFilter filter field
   */
  public void setCreditTransTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCreditTransTypeFilterFromFormattedString");
    try {
      this.setCreditTransTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CreditTransTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCreditTransTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCreditTransTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DebitTransType (CLEARING_HOUSE_CONTACTS.debit_trans_type)
   * @param fetch whether to fetch this field or not
   */
  public void setDebitTransTypeFetch (boolean fetch) {
    this.DebitTransTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: DebitTransType (CLEARING_HOUSE_CONTACTS.debit_trans_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getDebitTransTypeFetch () {
    return this.DebitTransTypeFetch;
  }
  /** Set the SortOrder for field: DebitTransType (CLEARING_HOUSE_CONTACTS.debit_trans_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDebitTransTypeSortOrder (Integer value) {
    this.DebitTransTypeSort = value;
  }
  /** Retrieve SortOrder for field: DebitTransType (CLEARING_HOUSE_CONTACTS.debit_trans_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDebitTransTypeSortOrder () {
    return this.DebitTransTypeSort;
  }
  /** Set the sort direction for field: DebitTransType (CLEARING_HOUSE_CONTACTS.debit_trans_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDebitTransTypeSortDirection (boolean ascending) {
    this.DebitTransTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DebitTransType (CLEARING_HOUSE_CONTACTS.debit_trans_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDebitTransTypeSortDirection () {
    return this.DebitTransTypeSortAscending;
  }
  /** Set the field level filters for field: DebitTransType (CLEARING_HOUSE_CONTACTS.debit_trans_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDebitTransTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.DebitTransType = value;
  }
  /** Retrieve filter for field: DebitTransType (CLEARING_HOUSE_CONTACTS.debit_trans_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDebitTransTypeFilter () {
    return this.DebitTransType;
  }

  /**
   * Retrieves the DebitTransTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DebitTransTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DebitTransTypeFilter field
   */
  public String[] getDebitTransTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDebitTransTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDebitTransTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDebitTransTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DebitTransTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDebitTransTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DebitTransTypeFilter filter value from a formatted string
   *
   * @param _value the DebitTransTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DebitTransTypeFilter filter field
   */
  public void setDebitTransTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDebitTransTypeFilterFromFormattedString");
    try {
      this.setDebitTransTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DebitTransTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDebitTransTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDebitTransTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AllowAutoPost (CLEARING_HOUSE_CONTACTS.allow_auto_post)
   * @param fetch whether to fetch this field or not
   */
  public void setAllowAutoPostFetch (boolean fetch) {
    this.AllowAutoPostFetch = fetch;
  }
  /** Retrieve Fetch value for field: AllowAutoPost (CLEARING_HOUSE_CONTACTS.allow_auto_post)
   * @return boolean the Fetch value for this field
   */
  public boolean getAllowAutoPostFetch () {
    return this.AllowAutoPostFetch;
  }
  /** Set the SortOrder for field: AllowAutoPost (CLEARING_HOUSE_CONTACTS.allow_auto_post)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAllowAutoPostSortOrder (Integer value) {
    this.AllowAutoPostSort = value;
  }
  /** Retrieve SortOrder for field: AllowAutoPost (CLEARING_HOUSE_CONTACTS.allow_auto_post)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAllowAutoPostSortOrder () {
    return this.AllowAutoPostSort;
  }
  /** Set the sort direction for field: AllowAutoPost (CLEARING_HOUSE_CONTACTS.allow_auto_post)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAllowAutoPostSortDirection (boolean ascending) {
    this.AllowAutoPostSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AllowAutoPost (CLEARING_HOUSE_CONTACTS.allow_auto_post)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAllowAutoPostSortDirection () {
    return this.AllowAutoPostSortAscending;
  }
  /** Set the field level filters for field: AllowAutoPost (CLEARING_HOUSE_CONTACTS.allow_auto_post)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAllowAutoPostFilter (BooleanFilter[] value) throws ServiceException {
    this.AllowAutoPost = value;
  }
  /** Retrieve filter for field: AllowAutoPost (CLEARING_HOUSE_CONTACTS.allow_auto_post)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getAllowAutoPostFilter () {
    return this.AllowAutoPost;
  }

  /**
   * Retrieves the AllowAutoPostFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AllowAutoPostFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AllowAutoPostFilter field
   */
  public String[] getAllowAutoPostFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAllowAutoPostFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAllowAutoPostFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAllowAutoPostFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AllowAutoPostFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAllowAutoPostFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AllowAutoPostFilter filter value from a formatted string
   *
   * @param _value the AllowAutoPostFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AllowAutoPostFilter filter field
   */
  public void setAllowAutoPostFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAllowAutoPostFilterFromFormattedString");
    try {
      this.setAllowAutoPostFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AllowAutoPostFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAllowAutoPostFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAllowAutoPostFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AutoPostDelay (CLEARING_HOUSE_CONTACTS.auto_post_delay)
   * @param fetch whether to fetch this field or not
   */
  public void setAutoPostDelayFetch (boolean fetch) {
    this.AutoPostDelayFetch = fetch;
  }
  /** Retrieve Fetch value for field: AutoPostDelay (CLEARING_HOUSE_CONTACTS.auto_post_delay)
   * @return boolean the Fetch value for this field
   */
  public boolean getAutoPostDelayFetch () {
    return this.AutoPostDelayFetch;
  }
  /** Set the SortOrder for field: AutoPostDelay (CLEARING_HOUSE_CONTACTS.auto_post_delay)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAutoPostDelaySortOrder (Integer value) {
    this.AutoPostDelaySort = value;
  }
  /** Retrieve SortOrder for field: AutoPostDelay (CLEARING_HOUSE_CONTACTS.auto_post_delay)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAutoPostDelaySortOrder () {
    return this.AutoPostDelaySort;
  }
  /** Set the sort direction for field: AutoPostDelay (CLEARING_HOUSE_CONTACTS.auto_post_delay)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAutoPostDelaySortDirection (boolean ascending) {
    this.AutoPostDelaySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AutoPostDelay (CLEARING_HOUSE_CONTACTS.auto_post_delay)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAutoPostDelaySortDirection () {
    return this.AutoPostDelaySortAscending;
  }
  /** Set the field level filters for field: AutoPostDelay (CLEARING_HOUSE_CONTACTS.auto_post_delay)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAutoPostDelayFilter (IntegerFilter[] value) throws ServiceException {
    this.AutoPostDelay = value;
  }
  /** Retrieve filter for field: AutoPostDelay (CLEARING_HOUSE_CONTACTS.auto_post_delay)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAutoPostDelayFilter () {
    return this.AutoPostDelay;
  }

  /**
   * Retrieves the AutoPostDelayFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AutoPostDelayFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AutoPostDelayFilter field
   */
  public String[] getAutoPostDelayFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAutoPostDelayFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAutoPostDelayFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAutoPostDelayFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AutoPostDelayFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAutoPostDelayFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AutoPostDelayFilter filter value from a formatted string
   *
   * @param _value the AutoPostDelayFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AutoPostDelayFilter filter field
   */
  public void setAutoPostDelayFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAutoPostDelayFilterFromFormattedString");
    try {
      this.setAutoPostDelayFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AutoPostDelayFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAutoPostDelayFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAutoPostDelayFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ChgbResubmitDelay (CLEARING_HOUSE_CONTACTS.chgb_resubmit_delay)
   * @param fetch whether to fetch this field or not
   */
  public void setChgbResubmitDelayFetch (boolean fetch) {
    this.ChgbResubmitDelayFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgbResubmitDelay (CLEARING_HOUSE_CONTACTS.chgb_resubmit_delay)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgbResubmitDelayFetch () {
    return this.ChgbResubmitDelayFetch;
  }
  /** Set the SortOrder for field: ChgbResubmitDelay (CLEARING_HOUSE_CONTACTS.chgb_resubmit_delay)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgbResubmitDelaySortOrder (Integer value) {
    this.ChgbResubmitDelaySort = value;
  }
  /** Retrieve SortOrder for field: ChgbResubmitDelay (CLEARING_HOUSE_CONTACTS.chgb_resubmit_delay)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgbResubmitDelaySortOrder () {
    return this.ChgbResubmitDelaySort;
  }
  /** Set the sort direction for field: ChgbResubmitDelay (CLEARING_HOUSE_CONTACTS.chgb_resubmit_delay)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgbResubmitDelaySortDirection (boolean ascending) {
    this.ChgbResubmitDelaySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgbResubmitDelay (CLEARING_HOUSE_CONTACTS.chgb_resubmit_delay)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgbResubmitDelaySortDirection () {
    return this.ChgbResubmitDelaySortAscending;
  }
  /** Set the field level filters for field: ChgbResubmitDelay (CLEARING_HOUSE_CONTACTS.chgb_resubmit_delay)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgbResubmitDelayFilter (IntegerFilter[] value) throws ServiceException {
    this.ChgbResubmitDelay = value;
  }
  /** Retrieve filter for field: ChgbResubmitDelay (CLEARING_HOUSE_CONTACTS.chgb_resubmit_delay)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getChgbResubmitDelayFilter () {
    return this.ChgbResubmitDelay;
  }

  /**
   * Retrieves the ChgbResubmitDelayFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgbResubmitDelayFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgbResubmitDelayFilter field
   */
  public String[] getChgbResubmitDelayFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgbResubmitDelayFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getChgbResubmitDelayFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgbResubmitDelayFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgbResubmitDelayFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgbResubmitDelayFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ChgbResubmitDelayFilter filter value from a formatted string
   *
   * @param _value the ChgbResubmitDelayFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ChgbResubmitDelayFilter filter field
   */
  public void setChgbResubmitDelayFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgbResubmitDelayFilterFromFormattedString");
    try {
      this.setChgbResubmitDelayFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgbResubmitDelayFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgbResubmitDelayFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgbResubmitDelayFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CollectionDelay (CLEARING_HOUSE_CONTACTS.collection_delay)
   * @param fetch whether to fetch this field or not
   */
  public void setCollectionDelayFetch (boolean fetch) {
    this.CollectionDelayFetch = fetch;
  }
  /** Retrieve Fetch value for field: CollectionDelay (CLEARING_HOUSE_CONTACTS.collection_delay)
   * @return boolean the Fetch value for this field
   */
  public boolean getCollectionDelayFetch () {
    return this.CollectionDelayFetch;
  }
  /** Set the SortOrder for field: CollectionDelay (CLEARING_HOUSE_CONTACTS.collection_delay)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCollectionDelaySortOrder (Integer value) {
    this.CollectionDelaySort = value;
  }
  /** Retrieve SortOrder for field: CollectionDelay (CLEARING_HOUSE_CONTACTS.collection_delay)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCollectionDelaySortOrder () {
    return this.CollectionDelaySort;
  }
  /** Set the sort direction for field: CollectionDelay (CLEARING_HOUSE_CONTACTS.collection_delay)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCollectionDelaySortDirection (boolean ascending) {
    this.CollectionDelaySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CollectionDelay (CLEARING_HOUSE_CONTACTS.collection_delay)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCollectionDelaySortDirection () {
    return this.CollectionDelaySortAscending;
  }
  /** Set the field level filters for field: CollectionDelay (CLEARING_HOUSE_CONTACTS.collection_delay)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCollectionDelayFilter (IntegerFilter[] value) throws ServiceException {
    this.CollectionDelay = value;
  }
  /** Retrieve filter for field: CollectionDelay (CLEARING_HOUSE_CONTACTS.collection_delay)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCollectionDelayFilter () {
    return this.CollectionDelay;
  }

  /**
   * Retrieves the CollectionDelayFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CollectionDelayFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CollectionDelayFilter field
   */
  public String[] getCollectionDelayFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCollectionDelayFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCollectionDelayFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCollectionDelayFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CollectionDelayFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCollectionDelayFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CollectionDelayFilter filter value from a formatted string
   *
   * @param _value the CollectionDelayFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CollectionDelayFilter filter field
   */
  public void setCollectionDelayFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCollectionDelayFilterFromFormattedString");
    try {
      this.setCollectionDelayFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CollectionDelayFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCollectionDelayFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCollectionDelayFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: SuppressPrenotes (CLEARING_HOUSE_CONTACTS.suppress_prenotes)
   * @param fetch whether to fetch this field or not
   */
  public void setSuppressPrenotesFetch (boolean fetch) {
    this.SuppressPrenotesFetch = fetch;
  }
  /** Retrieve Fetch value for field: SuppressPrenotes (CLEARING_HOUSE_CONTACTS.suppress_prenotes)
   * @return boolean the Fetch value for this field
   */
  public boolean getSuppressPrenotesFetch () {
    return this.SuppressPrenotesFetch;
  }
  /** Set the SortOrder for field: SuppressPrenotes (CLEARING_HOUSE_CONTACTS.suppress_prenotes)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSuppressPrenotesSortOrder (Integer value) {
    this.SuppressPrenotesSort = value;
  }
  /** Retrieve SortOrder for field: SuppressPrenotes (CLEARING_HOUSE_CONTACTS.suppress_prenotes)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSuppressPrenotesSortOrder () {
    return this.SuppressPrenotesSort;
  }
  /** Set the sort direction for field: SuppressPrenotes (CLEARING_HOUSE_CONTACTS.suppress_prenotes)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSuppressPrenotesSortDirection (boolean ascending) {
    this.SuppressPrenotesSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SuppressPrenotes (CLEARING_HOUSE_CONTACTS.suppress_prenotes)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSuppressPrenotesSortDirection () {
    return this.SuppressPrenotesSortAscending;
  }
  /** Set the field level filters for field: SuppressPrenotes (CLEARING_HOUSE_CONTACTS.suppress_prenotes)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSuppressPrenotesFilter (BooleanFilter[] value) throws ServiceException {
    this.SuppressPrenotes = value;
  }
  /** Retrieve filter for field: SuppressPrenotes (CLEARING_HOUSE_CONTACTS.suppress_prenotes)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getSuppressPrenotesFilter () {
    return this.SuppressPrenotes;
  }

  /**
   * Retrieves the SuppressPrenotesFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SuppressPrenotesFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SuppressPrenotesFilter field
   */
  public String[] getSuppressPrenotesFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSuppressPrenotesFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSuppressPrenotesFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSuppressPrenotesFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SuppressPrenotesFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSuppressPrenotesFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SuppressPrenotesFilter filter value from a formatted string
   *
   * @param _value the SuppressPrenotesFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SuppressPrenotesFilter filter field
   */
  public void setSuppressPrenotesFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSuppressPrenotesFilterFromFormattedString");
    try {
      this.setSuppressPrenotesFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SuppressPrenotesFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSuppressPrenotesFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSuppressPrenotesFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ConfigTagId (CLEARING_HOUSE_CONTACTS.config_tag_id)
   * @param fetch whether to fetch this field or not
   */
  public void setConfigTagIdFetch (boolean fetch) {
    this.ConfigTagIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ConfigTagId (CLEARING_HOUSE_CONTACTS.config_tag_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getConfigTagIdFetch () {
    return this.ConfigTagIdFetch;
  }
  /** Set the SortOrder for field: ConfigTagId (CLEARING_HOUSE_CONTACTS.config_tag_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setConfigTagIdSortOrder (Integer value) {
    this.ConfigTagIdSort = value;
  }
  /** Retrieve SortOrder for field: ConfigTagId (CLEARING_HOUSE_CONTACTS.config_tag_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getConfigTagIdSortOrder () {
    return this.ConfigTagIdSort;
  }
  /** Set the sort direction for field: ConfigTagId (CLEARING_HOUSE_CONTACTS.config_tag_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setConfigTagIdSortDirection (boolean ascending) {
    this.ConfigTagIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ConfigTagId (CLEARING_HOUSE_CONTACTS.config_tag_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getConfigTagIdSortDirection () {
    return this.ConfigTagIdSortAscending;
  }
  /** Set the case insensitive for field: ConfigTagId (CLEARING_HOUSE_CONTACTS.config_tag_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setConfigTagIdCaseInsensitive (boolean ascending) {
    this.ConfigTagIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ConfigTagId (CLEARING_HOUSE_CONTACTS.config_tag_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getConfigTagIdCaseInsensitive () {
    return this.ConfigTagIdCaseInsensitive;
  }
  /** Set the field level filters for field: ConfigTagId (CLEARING_HOUSE_CONTACTS.config_tag_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setConfigTagIdFilter (StringFilter[] value) throws ServiceException {
    this.ConfigTagId = value;
  }
  /** Retrieve filter for field: ConfigTagId (CLEARING_HOUSE_CONTACTS.config_tag_id)
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
    return ClearingHouseContactsObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return ClearingHouseContactsObjectHelper.toMap(this, null);
  }
}
