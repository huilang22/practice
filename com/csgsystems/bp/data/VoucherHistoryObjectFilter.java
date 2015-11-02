/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: VoucherHistoryObjectFilter.java
 * Definition File: Catalog/VoucherHistory.xml
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
public class VoucherHistoryObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public VoucherHistoryObjectKeyFilter Key = null;
  /** raw field for: VOUCHER_HISTORY.chg_who) */
  public    StringFilter[] ChgWho  = null;
  protected boolean ChgWhoFetch = false;
  protected boolean ChgWhoSortAscending = true;
  protected boolean ChgWhoCaseInsensitive = false;
  protected Integer ChgWhoSort = null;
  /** raw field for: VOUCHER_HISTORY.status) */
  public    BigIntegerFilter[] Status  = null;
  protected boolean StatusFetch = false;
  protected boolean StatusSortAscending = true;
  protected Integer StatusSort = null;
  /** raw field for: VOUCHER_HISTORY.location_code) */
  public    BigIntegerFilter[] LocationCode  = null;
  protected boolean LocationCodeFetch = false;
  protected boolean LocationCodeSortAscending = true;
  protected Integer LocationCodeSort = null;
  /** raw field for: VOUCHER_HISTORY.modification_remark1) */
  public    StringFilter[] ModificationRemark1  = null;
  protected boolean ModificationRemark1Fetch = false;
  protected boolean ModificationRemark1SortAscending = true;
  protected boolean ModificationRemark1CaseInsensitive = false;
  protected Integer ModificationRemark1Sort = null;
  /** raw field for: VOUCHER_HISTORY.modification_remark2) */
  public    StringFilter[] ModificationRemark2  = null;
  protected boolean ModificationRemark2Fetch = false;
  protected boolean ModificationRemark2SortAscending = true;
  protected boolean ModificationRemark2CaseInsensitive = false;
  protected Integer ModificationRemark2Sort = null;
  /** raw field for: VOUCHER_HISTORY.modification_remark3) */
  public    StringFilter[] ModificationRemark3  = null;
  protected boolean ModificationRemark3Fetch = false;
  protected boolean ModificationRemark3SortAscending = true;
  protected boolean ModificationRemark3CaseInsensitive = false;
  protected Integer ModificationRemark3Sort = null;
  /** raw field for: VOUCHER_HISTORY.modification_remark4) */
  public    StringFilter[] ModificationRemark4  = null;
  protected boolean ModificationRemark4Fetch = false;
  protected boolean ModificationRemark4SortAscending = true;
  protected boolean ModificationRemark4CaseInsensitive = false;
  protected Integer ModificationRemark4Sort = null;
  /** raw field for: VOUCHER_HISTORY.modification_remark5) */
  public    StringFilter[] ModificationRemark5  = null;
  protected boolean ModificationRemark5Fetch = false;
  protected boolean ModificationRemark5SortAscending = true;
  protected boolean ModificationRemark5CaseInsensitive = false;
  protected Integer ModificationRemark5Sort = null;
  private String _objName = "VoucherHistoryObjectFilter";
  /** default constructor */
  public VoucherHistoryObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public VoucherHistoryObjectFilter (VoucherHistoryObjectFilter other)
  {
    if (other == null) return;
    this.Key = new VoucherHistoryObjectKeyFilter (other.Key);
    this.ChgWho = other.ChgWho;
    this.ChgWhoFetch = other.ChgWhoFetch;
    this.ChgWhoSort = other.ChgWhoSort;
    this.ChgWhoCaseInsensitive = other.ChgWhoCaseInsensitive;
    this.ChgWhoSortAscending = other.ChgWhoSortAscending;
    this.Status = other.Status;
    this.StatusFetch = other.StatusFetch;
    this.StatusSort = other.StatusSort;
    this.StatusSortAscending = other.StatusSortAscending;
    this.LocationCode = other.LocationCode;
    this.LocationCodeFetch = other.LocationCodeFetch;
    this.LocationCodeSort = other.LocationCodeSort;
    this.LocationCodeSortAscending = other.LocationCodeSortAscending;
    this.ModificationRemark1 = other.ModificationRemark1;
    this.ModificationRemark1Fetch = other.ModificationRemark1Fetch;
    this.ModificationRemark1Sort = other.ModificationRemark1Sort;
    this.ModificationRemark1CaseInsensitive = other.ModificationRemark1CaseInsensitive;
    this.ModificationRemark1SortAscending = other.ModificationRemark1SortAscending;
    this.ModificationRemark2 = other.ModificationRemark2;
    this.ModificationRemark2Fetch = other.ModificationRemark2Fetch;
    this.ModificationRemark2Sort = other.ModificationRemark2Sort;
    this.ModificationRemark2CaseInsensitive = other.ModificationRemark2CaseInsensitive;
    this.ModificationRemark2SortAscending = other.ModificationRemark2SortAscending;
    this.ModificationRemark3 = other.ModificationRemark3;
    this.ModificationRemark3Fetch = other.ModificationRemark3Fetch;
    this.ModificationRemark3Sort = other.ModificationRemark3Sort;
    this.ModificationRemark3CaseInsensitive = other.ModificationRemark3CaseInsensitive;
    this.ModificationRemark3SortAscending = other.ModificationRemark3SortAscending;
    this.ModificationRemark4 = other.ModificationRemark4;
    this.ModificationRemark4Fetch = other.ModificationRemark4Fetch;
    this.ModificationRemark4Sort = other.ModificationRemark4Sort;
    this.ModificationRemark4CaseInsensitive = other.ModificationRemark4CaseInsensitive;
    this.ModificationRemark4SortAscending = other.ModificationRemark4SortAscending;
    this.ModificationRemark5 = other.ModificationRemark5;
    this.ModificationRemark5Fetch = other.ModificationRemark5Fetch;
    this.ModificationRemark5Sort = other.ModificationRemark5Sort;
    this.ModificationRemark5CaseInsensitive = other.ModificationRemark5CaseInsensitive;
    this.ModificationRemark5SortAscending = other.ModificationRemark5SortAscending;  }
  /** get the filter for this object's key
   * @return VoucherHistoryObjectKeyFilter
   */
  public VoucherHistoryObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (VoucherHistoryObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: VoucherId (VOUCHER_HISTORY.voucher_id)
   * @param fetch whether to fetch this field or not
   */
  public void setVoucherIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new VoucherHistoryObjectKeyFilter ();
    this.Key.VoucherIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: VoucherId (VOUCHER_HISTORY.voucher_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getVoucherIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.VoucherIdFetch;
  }
  /** Set the SortOrder for field: VoucherId (VOUCHER_HISTORY.voucher_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setVoucherIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new VoucherHistoryObjectKeyFilter ();
    this.Key.VoucherIdSort = value;
  }
  /** Retrieve SortOrder for field: VoucherId (VOUCHER_HISTORY.voucher_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getVoucherIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.VoucherIdSort;
  }
  /** Set the sort direction for field: VoucherId (VOUCHER_HISTORY.voucher_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setVoucherIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new VoucherHistoryObjectKeyFilter ();
    this.Key.VoucherIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: VoucherId (VOUCHER_HISTORY.voucher_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getVoucherIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.VoucherIdSortAscending;
  }
  /** Set the case insensitive for field: VoucherId (VOUCHER_HISTORY.voucher_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setVoucherIdCaseInsensitive (boolean ascending)
  {
    if (this.Key == null) this.Key = new VoucherHistoryObjectKeyFilter ();
    this.Key.VoucherIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsentive for field: VoucherId (VOUCHER_HISTORY.voucher_id)
   * @return boolean whether the field is case insensitive
   */
  public boolean getVoucherIdCaseInsensitive ()
  {
    if (this.Key == null) return false;
    return this.Key.VoucherIdCaseInsensitive;
  }
  /** Set the field level filters for field: VoucherId (VOUCHER_HISTORY.voucher_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setVoucherIdFilter (StringFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new VoucherHistoryObjectKeyFilter ();
    this.Key.VoucherId = value;
  }
  /** Retrieve filter for field: VoucherId (VOUCHER_HISTORY.voucher_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getVoucherIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.VoucherId;
  }
  /** Set the field level Fetch value for field: ChgDate (VOUCHER_HISTORY.chg_date)
   * @param fetch whether to fetch this field or not
   */
  public void setChgDateFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new VoucherHistoryObjectKeyFilter ();
    this.Key.ChgDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgDate (VOUCHER_HISTORY.chg_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgDateFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.ChgDateFetch;
  }
  /** Set the SortOrder for field: ChgDate (VOUCHER_HISTORY.chg_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgDateSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new VoucherHistoryObjectKeyFilter ();
    this.Key.ChgDateSort = value;
  }
  /** Retrieve SortOrder for field: ChgDate (VOUCHER_HISTORY.chg_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgDateSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.ChgDateSort;
  }
  /** Set the sort direction for field: ChgDate (VOUCHER_HISTORY.chg_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgDateSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new VoucherHistoryObjectKeyFilter ();
    this.Key.ChgDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgDate (VOUCHER_HISTORY.chg_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgDateSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.ChgDateSortAscending;
  }
  /** Set the field level filters for field: ChgDate (VOUCHER_HISTORY.chg_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgDateFilter (DateFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new VoucherHistoryObjectKeyFilter ();
    this.Key.ChgDate = value;
  }
  /** Retrieve filter for field: ChgDate (VOUCHER_HISTORY.chg_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getChgDateFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.ChgDate;
  }
  /** Set the field level Fetch value for field: ChgWho (VOUCHER_HISTORY.chg_who)
   * @param fetch whether to fetch this field or not
   */
  public void setChgWhoFetch (boolean fetch) {
    this.ChgWhoFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgWho (VOUCHER_HISTORY.chg_who)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgWhoFetch () {
    return this.ChgWhoFetch;
  }
  /** Set the SortOrder for field: ChgWho (VOUCHER_HISTORY.chg_who)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgWhoSortOrder (Integer value) {
    this.ChgWhoSort = value;
  }
  /** Retrieve SortOrder for field: ChgWho (VOUCHER_HISTORY.chg_who)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgWhoSortOrder () {
    return this.ChgWhoSort;
  }
  /** Set the sort direction for field: ChgWho (VOUCHER_HISTORY.chg_who)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgWhoSortDirection (boolean ascending) {
    this.ChgWhoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgWho (VOUCHER_HISTORY.chg_who)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgWhoSortDirection () {
    return this.ChgWhoSortAscending;
  }
  /** Set the case insensitive for field: ChgWho (VOUCHER_HISTORY.chg_who)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setChgWhoCaseInsensitive (boolean ascending) {
    this.ChgWhoCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ChgWho (VOUCHER_HISTORY.chg_who)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getChgWhoCaseInsensitive () {
    return this.ChgWhoCaseInsensitive;
  }
  /** Set the field level filters for field: ChgWho (VOUCHER_HISTORY.chg_who)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgWhoFilter (StringFilter[] value) throws ServiceException {
    this.ChgWho = value;
  }
  /** Retrieve filter for field: ChgWho (VOUCHER_HISTORY.chg_who)
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

  /** Set the field level Fetch value for field: Status (VOUCHER_HISTORY.status)
   * @param fetch whether to fetch this field or not
   */
  public void setStatusFetch (boolean fetch) {
    this.StatusFetch = fetch;
  }
  /** Retrieve Fetch value for field: Status (VOUCHER_HISTORY.status)
   * @return boolean the Fetch value for this field
   */
  public boolean getStatusFetch () {
    return this.StatusFetch;
  }
  /** Set the SortOrder for field: Status (VOUCHER_HISTORY.status)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStatusSortOrder (Integer value) {
    this.StatusSort = value;
  }
  /** Retrieve SortOrder for field: Status (VOUCHER_HISTORY.status)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStatusSortOrder () {
    return this.StatusSort;
  }
  /** Set the sort direction for field: Status (VOUCHER_HISTORY.status)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStatusSortDirection (boolean ascending) {
    this.StatusSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Status (VOUCHER_HISTORY.status)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStatusSortDirection () {
    return this.StatusSortAscending;
  }
  /** Set the field level filters for field: Status (VOUCHER_HISTORY.status)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStatusFilter (BigIntegerFilter[] value) throws ServiceException {
    this.Status = value;
  }
  /** Retrieve filter for field: Status (VOUCHER_HISTORY.status)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getStatusFilter () {
    return this.Status;
  }

  /**
   * Retrieves the StatusFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StatusFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatusFilter field
   */
  public String[] getStatusFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getStatusFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatusFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatusFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the StatusFilter filter value from a formatted string
   *
   * @param _value the StatusFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the StatusFilter filter field
   */
  public void setStatusFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStatusFilterFromFormattedString");
    try {
      this.setStatusFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatusFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatusFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: LocationCode (VOUCHER_HISTORY.location_code)
   * @param fetch whether to fetch this field or not
   */
  public void setLocationCodeFetch (boolean fetch) {
    this.LocationCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: LocationCode (VOUCHER_HISTORY.location_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getLocationCodeFetch () {
    return this.LocationCodeFetch;
  }
  /** Set the SortOrder for field: LocationCode (VOUCHER_HISTORY.location_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLocationCodeSortOrder (Integer value) {
    this.LocationCodeSort = value;
  }
  /** Retrieve SortOrder for field: LocationCode (VOUCHER_HISTORY.location_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLocationCodeSortOrder () {
    return this.LocationCodeSort;
  }
  /** Set the sort direction for field: LocationCode (VOUCHER_HISTORY.location_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLocationCodeSortDirection (boolean ascending) {
    this.LocationCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LocationCode (VOUCHER_HISTORY.location_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLocationCodeSortDirection () {
    return this.LocationCodeSortAscending;
  }
  /** Set the field level filters for field: LocationCode (VOUCHER_HISTORY.location_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLocationCodeFilter (BigIntegerFilter[] value) throws ServiceException {
    this.LocationCode = value;
  }
  /** Retrieve filter for field: LocationCode (VOUCHER_HISTORY.location_code)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getLocationCodeFilter () {
    return this.LocationCode;
  }

  /**
   * Retrieves the LocationCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The LocationCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LocationCodeFilter field
   */
  public String[] getLocationCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLocationCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getLocationCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLocationCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LocationCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getLocationCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the LocationCodeFilter filter value from a formatted string
   *
   * @param _value the LocationCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the LocationCodeFilter filter field
   */
  public void setLocationCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setLocationCodeFilterFromFormattedString");
    try {
      this.setLocationCodeFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LocationCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setLocationCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLocationCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ModificationRemark1 (VOUCHER_HISTORY.modification_remark1)
   * @param fetch whether to fetch this field or not
   */
  public void setModificationRemark1Fetch (boolean fetch) {
    this.ModificationRemark1Fetch = fetch;
  }
  /** Retrieve Fetch value for field: ModificationRemark1 (VOUCHER_HISTORY.modification_remark1)
   * @return boolean the Fetch value for this field
   */
  public boolean getModificationRemark1Fetch () {
    return this.ModificationRemark1Fetch;
  }
  /** Set the SortOrder for field: ModificationRemark1 (VOUCHER_HISTORY.modification_remark1)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setModificationRemark1SortOrder (Integer value) {
    this.ModificationRemark1Sort = value;
  }
  /** Retrieve SortOrder for field: ModificationRemark1 (VOUCHER_HISTORY.modification_remark1)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getModificationRemark1SortOrder () {
    return this.ModificationRemark1Sort;
  }
  /** Set the sort direction for field: ModificationRemark1 (VOUCHER_HISTORY.modification_remark1)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setModificationRemark1SortDirection (boolean ascending) {
    this.ModificationRemark1SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ModificationRemark1 (VOUCHER_HISTORY.modification_remark1)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getModificationRemark1SortDirection () {
    return this.ModificationRemark1SortAscending;
  }
  /** Set the case insensitive for field: ModificationRemark1 (VOUCHER_HISTORY.modification_remark1)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setModificationRemark1CaseInsensitive (boolean ascending) {
    this.ModificationRemark1CaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ModificationRemark1 (VOUCHER_HISTORY.modification_remark1)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getModificationRemark1CaseInsensitive () {
    return this.ModificationRemark1CaseInsensitive;
  }
  /** Set the field level filters for field: ModificationRemark1 (VOUCHER_HISTORY.modification_remark1)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setModificationRemark1Filter (StringFilter[] value) throws ServiceException {
    this.ModificationRemark1 = value;
  }
  /** Retrieve filter for field: ModificationRemark1 (VOUCHER_HISTORY.modification_remark1)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getModificationRemark1Filter () {
    return this.ModificationRemark1;
  }

  /**
   * Retrieves the ModificationRemark1Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ModificationRemark1Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ModificationRemark1Filter field
   */
  public String[] getModificationRemark1FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getModificationRemark1FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getModificationRemark1Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getModificationRemark1FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ModificationRemark1Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getModificationRemark1FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ModificationRemark1Filter filter value from a formatted string
   *
   * @param _value the ModificationRemark1Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ModificationRemark1Filter filter field
   */
  public void setModificationRemark1FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setModificationRemark1FilterFromFormattedString");
    try {
      this.setModificationRemark1Filter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ModificationRemark1Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setModificationRemark1FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setModificationRemark1FilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ModificationRemark2 (VOUCHER_HISTORY.modification_remark2)
   * @param fetch whether to fetch this field or not
   */
  public void setModificationRemark2Fetch (boolean fetch) {
    this.ModificationRemark2Fetch = fetch;
  }
  /** Retrieve Fetch value for field: ModificationRemark2 (VOUCHER_HISTORY.modification_remark2)
   * @return boolean the Fetch value for this field
   */
  public boolean getModificationRemark2Fetch () {
    return this.ModificationRemark2Fetch;
  }
  /** Set the SortOrder for field: ModificationRemark2 (VOUCHER_HISTORY.modification_remark2)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setModificationRemark2SortOrder (Integer value) {
    this.ModificationRemark2Sort = value;
  }
  /** Retrieve SortOrder for field: ModificationRemark2 (VOUCHER_HISTORY.modification_remark2)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getModificationRemark2SortOrder () {
    return this.ModificationRemark2Sort;
  }
  /** Set the sort direction for field: ModificationRemark2 (VOUCHER_HISTORY.modification_remark2)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setModificationRemark2SortDirection (boolean ascending) {
    this.ModificationRemark2SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ModificationRemark2 (VOUCHER_HISTORY.modification_remark2)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getModificationRemark2SortDirection () {
    return this.ModificationRemark2SortAscending;
  }
  /** Set the case insensitive for field: ModificationRemark2 (VOUCHER_HISTORY.modification_remark2)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setModificationRemark2CaseInsensitive (boolean ascending) {
    this.ModificationRemark2CaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ModificationRemark2 (VOUCHER_HISTORY.modification_remark2)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getModificationRemark2CaseInsensitive () {
    return this.ModificationRemark2CaseInsensitive;
  }
  /** Set the field level filters for field: ModificationRemark2 (VOUCHER_HISTORY.modification_remark2)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setModificationRemark2Filter (StringFilter[] value) throws ServiceException {
    this.ModificationRemark2 = value;
  }
  /** Retrieve filter for field: ModificationRemark2 (VOUCHER_HISTORY.modification_remark2)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getModificationRemark2Filter () {
    return this.ModificationRemark2;
  }

  /**
   * Retrieves the ModificationRemark2Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ModificationRemark2Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ModificationRemark2Filter field
   */
  public String[] getModificationRemark2FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getModificationRemark2FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getModificationRemark2Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getModificationRemark2FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ModificationRemark2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getModificationRemark2FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ModificationRemark2Filter filter value from a formatted string
   *
   * @param _value the ModificationRemark2Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ModificationRemark2Filter filter field
   */
  public void setModificationRemark2FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setModificationRemark2FilterFromFormattedString");
    try {
      this.setModificationRemark2Filter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ModificationRemark2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setModificationRemark2FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setModificationRemark2FilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ModificationRemark3 (VOUCHER_HISTORY.modification_remark3)
   * @param fetch whether to fetch this field or not
   */
  public void setModificationRemark3Fetch (boolean fetch) {
    this.ModificationRemark3Fetch = fetch;
  }
  /** Retrieve Fetch value for field: ModificationRemark3 (VOUCHER_HISTORY.modification_remark3)
   * @return boolean the Fetch value for this field
   */
  public boolean getModificationRemark3Fetch () {
    return this.ModificationRemark3Fetch;
  }
  /** Set the SortOrder for field: ModificationRemark3 (VOUCHER_HISTORY.modification_remark3)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setModificationRemark3SortOrder (Integer value) {
    this.ModificationRemark3Sort = value;
  }
  /** Retrieve SortOrder for field: ModificationRemark3 (VOUCHER_HISTORY.modification_remark3)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getModificationRemark3SortOrder () {
    return this.ModificationRemark3Sort;
  }
  /** Set the sort direction for field: ModificationRemark3 (VOUCHER_HISTORY.modification_remark3)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setModificationRemark3SortDirection (boolean ascending) {
    this.ModificationRemark3SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ModificationRemark3 (VOUCHER_HISTORY.modification_remark3)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getModificationRemark3SortDirection () {
    return this.ModificationRemark3SortAscending;
  }
  /** Set the case insensitive for field: ModificationRemark3 (VOUCHER_HISTORY.modification_remark3)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setModificationRemark3CaseInsensitive (boolean ascending) {
    this.ModificationRemark3CaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ModificationRemark3 (VOUCHER_HISTORY.modification_remark3)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getModificationRemark3CaseInsensitive () {
    return this.ModificationRemark3CaseInsensitive;
  }
  /** Set the field level filters for field: ModificationRemark3 (VOUCHER_HISTORY.modification_remark3)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setModificationRemark3Filter (StringFilter[] value) throws ServiceException {
    this.ModificationRemark3 = value;
  }
  /** Retrieve filter for field: ModificationRemark3 (VOUCHER_HISTORY.modification_remark3)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getModificationRemark3Filter () {
    return this.ModificationRemark3;
  }

  /**
   * Retrieves the ModificationRemark3Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ModificationRemark3Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ModificationRemark3Filter field
   */
  public String[] getModificationRemark3FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getModificationRemark3FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getModificationRemark3Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getModificationRemark3FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ModificationRemark3Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getModificationRemark3FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ModificationRemark3Filter filter value from a formatted string
   *
   * @param _value the ModificationRemark3Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ModificationRemark3Filter filter field
   */
  public void setModificationRemark3FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setModificationRemark3FilterFromFormattedString");
    try {
      this.setModificationRemark3Filter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ModificationRemark3Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setModificationRemark3FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setModificationRemark3FilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ModificationRemark4 (VOUCHER_HISTORY.modification_remark4)
   * @param fetch whether to fetch this field or not
   */
  public void setModificationRemark4Fetch (boolean fetch) {
    this.ModificationRemark4Fetch = fetch;
  }
  /** Retrieve Fetch value for field: ModificationRemark4 (VOUCHER_HISTORY.modification_remark4)
   * @return boolean the Fetch value for this field
   */
  public boolean getModificationRemark4Fetch () {
    return this.ModificationRemark4Fetch;
  }
  /** Set the SortOrder for field: ModificationRemark4 (VOUCHER_HISTORY.modification_remark4)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setModificationRemark4SortOrder (Integer value) {
    this.ModificationRemark4Sort = value;
  }
  /** Retrieve SortOrder for field: ModificationRemark4 (VOUCHER_HISTORY.modification_remark4)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getModificationRemark4SortOrder () {
    return this.ModificationRemark4Sort;
  }
  /** Set the sort direction for field: ModificationRemark4 (VOUCHER_HISTORY.modification_remark4)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setModificationRemark4SortDirection (boolean ascending) {
    this.ModificationRemark4SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ModificationRemark4 (VOUCHER_HISTORY.modification_remark4)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getModificationRemark4SortDirection () {
    return this.ModificationRemark4SortAscending;
  }
  /** Set the case insensitive for field: ModificationRemark4 (VOUCHER_HISTORY.modification_remark4)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setModificationRemark4CaseInsensitive (boolean ascending) {
    this.ModificationRemark4CaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ModificationRemark4 (VOUCHER_HISTORY.modification_remark4)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getModificationRemark4CaseInsensitive () {
    return this.ModificationRemark4CaseInsensitive;
  }
  /** Set the field level filters for field: ModificationRemark4 (VOUCHER_HISTORY.modification_remark4)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setModificationRemark4Filter (StringFilter[] value) throws ServiceException {
    this.ModificationRemark4 = value;
  }
  /** Retrieve filter for field: ModificationRemark4 (VOUCHER_HISTORY.modification_remark4)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getModificationRemark4Filter () {
    return this.ModificationRemark4;
  }

  /**
   * Retrieves the ModificationRemark4Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ModificationRemark4Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ModificationRemark4Filter field
   */
  public String[] getModificationRemark4FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getModificationRemark4FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getModificationRemark4Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getModificationRemark4FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ModificationRemark4Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getModificationRemark4FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ModificationRemark4Filter filter value from a formatted string
   *
   * @param _value the ModificationRemark4Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ModificationRemark4Filter filter field
   */
  public void setModificationRemark4FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setModificationRemark4FilterFromFormattedString");
    try {
      this.setModificationRemark4Filter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ModificationRemark4Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setModificationRemark4FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setModificationRemark4FilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ModificationRemark5 (VOUCHER_HISTORY.modification_remark5)
   * @param fetch whether to fetch this field or not
   */
  public void setModificationRemark5Fetch (boolean fetch) {
    this.ModificationRemark5Fetch = fetch;
  }
  /** Retrieve Fetch value for field: ModificationRemark5 (VOUCHER_HISTORY.modification_remark5)
   * @return boolean the Fetch value for this field
   */
  public boolean getModificationRemark5Fetch () {
    return this.ModificationRemark5Fetch;
  }
  /** Set the SortOrder for field: ModificationRemark5 (VOUCHER_HISTORY.modification_remark5)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setModificationRemark5SortOrder (Integer value) {
    this.ModificationRemark5Sort = value;
  }
  /** Retrieve SortOrder for field: ModificationRemark5 (VOUCHER_HISTORY.modification_remark5)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getModificationRemark5SortOrder () {
    return this.ModificationRemark5Sort;
  }
  /** Set the sort direction for field: ModificationRemark5 (VOUCHER_HISTORY.modification_remark5)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setModificationRemark5SortDirection (boolean ascending) {
    this.ModificationRemark5SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ModificationRemark5 (VOUCHER_HISTORY.modification_remark5)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getModificationRemark5SortDirection () {
    return this.ModificationRemark5SortAscending;
  }
  /** Set the case insensitive for field: ModificationRemark5 (VOUCHER_HISTORY.modification_remark5)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setModificationRemark5CaseInsensitive (boolean ascending) {
    this.ModificationRemark5CaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ModificationRemark5 (VOUCHER_HISTORY.modification_remark5)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getModificationRemark5CaseInsensitive () {
    return this.ModificationRemark5CaseInsensitive;
  }
  /** Set the field level filters for field: ModificationRemark5 (VOUCHER_HISTORY.modification_remark5)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setModificationRemark5Filter (StringFilter[] value) throws ServiceException {
    this.ModificationRemark5 = value;
  }
  /** Retrieve filter for field: ModificationRemark5 (VOUCHER_HISTORY.modification_remark5)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getModificationRemark5Filter () {
    return this.ModificationRemark5;
  }

  /**
   * Retrieves the ModificationRemark5Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ModificationRemark5Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ModificationRemark5Filter field
   */
  public String[] getModificationRemark5FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getModificationRemark5FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getModificationRemark5Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getModificationRemark5FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ModificationRemark5Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getModificationRemark5FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ModificationRemark5Filter filter value from a formatted string
   *
   * @param _value the ModificationRemark5Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ModificationRemark5Filter filter field
   */
  public void setModificationRemark5FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setModificationRemark5FilterFromFormattedString");
    try {
      this.setModificationRemark5Filter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ModificationRemark5Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setModificationRemark5FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setModificationRemark5FilterFromFormattedString");
  }

  public String toString() {
    return VoucherHistoryObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return VoucherHistoryObjectHelper.toMap(this, null);
  }
}
