/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AxrtPaymentMerchantObjectFilter.java
 * Definition File: Admin/AxrtPaymentMerchant.xml
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
public class AxrtPaymentMerchantObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public AxrtPaymentMerchantObjectKeyFilter Key = null;
  /** raw field for: PAYMENT_MERCHANT_ID_REF.epg_merchant_id) */
  public    StringFilter[] EpgMerchantId  = null;
  protected boolean EpgMerchantIdFetch = false;
  protected boolean EpgMerchantIdSortAscending = true;
  protected boolean EpgMerchantIdCaseInsensitive = false;
  protected Integer EpgMerchantIdSort = null;
  /** raw field for: PAYMENT_MERCHANT_ID_REF.status) */
  public    BooleanFilter[] Status  = null;
  protected boolean StatusFetch = false;
  protected boolean StatusSortAscending = true;
  protected Integer StatusSort = null;
  /** raw field for: PAYMENT_MERCHANT_ID_REF.is_default) */
  public    BooleanFilter[] IsDefault  = null;
  protected boolean IsDefaultFetch = false;
  protected boolean IsDefaultSortAscending = true;
  protected Integer IsDefaultSort = null;
  /** raw field for: PAYMENT_MERCHANT_ID_REF.is_internal) */
  public    BooleanFilter[] IsInternal  = null;
  protected boolean IsInternalFetch = false;
  protected boolean IsInternalSortAscending = true;
  protected Integer IsInternalSort = null;
  /** raw field for: PAYMENT_MERCHANT_ID_REF.config_tag_id) */
  public    StringFilter[] ConfigTagId  = null;
  protected boolean ConfigTagIdFetch = false;
  protected boolean ConfigTagIdSortAscending = true;
  protected boolean ConfigTagIdCaseInsensitive = false;
  protected Integer ConfigTagIdSort = null;
  /** raw field for: PAYMENT_MERCHANT_ID_REF.access_key) */
  public    StringFilter[] AccessKey  = null;
  protected boolean AccessKeyFetch = false;
  protected boolean AccessKeySortAscending = true;
  protected boolean AccessKeyCaseInsensitive = false;
  protected Integer AccessKeySort = null;
  /** raw field for: PAYMENT_MERCHANT_ID_REF.profile_id) */
  public    StringFilter[] ProfileId  = null;
  protected boolean ProfileIdFetch = false;
  protected boolean ProfileIdSortAscending = true;
  protected boolean ProfileIdCaseInsensitive = false;
  protected Integer ProfileIdSort = null;
  /** raw field for: PAYMENT_MERCHANT_ID_REF.secret_key) */
  public    StringFilter[] SecretKey  = null;
  protected boolean SecretKeyFetch = false;
  protected boolean SecretKeySortAscending = true;
  protected boolean SecretKeyCaseInsensitive = false;
  protected Integer SecretKeySort = null;
  private String _objName = "AxrtPaymentMerchantObjectFilter";
  /** default constructor */
  public AxrtPaymentMerchantObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public AxrtPaymentMerchantObjectFilter (AxrtPaymentMerchantObjectFilter other)
  {
    if (other == null) return;
    this.Key = new AxrtPaymentMerchantObjectKeyFilter (other.Key);
    this.EpgMerchantId = other.EpgMerchantId;
    this.EpgMerchantIdFetch = other.EpgMerchantIdFetch;
    this.EpgMerchantIdSort = other.EpgMerchantIdSort;
    this.EpgMerchantIdCaseInsensitive = other.EpgMerchantIdCaseInsensitive;
    this.EpgMerchantIdSortAscending = other.EpgMerchantIdSortAscending;
    this.Status = other.Status;
    this.StatusFetch = other.StatusFetch;
    this.StatusSort = other.StatusSort;
    this.StatusSortAscending = other.StatusSortAscending;
    this.IsDefault = other.IsDefault;
    this.IsDefaultFetch = other.IsDefaultFetch;
    this.IsDefaultSort = other.IsDefaultSort;
    this.IsDefaultSortAscending = other.IsDefaultSortAscending;
    this.IsInternal = other.IsInternal;
    this.IsInternalFetch = other.IsInternalFetch;
    this.IsInternalSort = other.IsInternalSort;
    this.IsInternalSortAscending = other.IsInternalSortAscending;
    this.ConfigTagId = other.ConfigTagId;
    this.ConfigTagIdFetch = other.ConfigTagIdFetch;
    this.ConfigTagIdSort = other.ConfigTagIdSort;
    this.ConfigTagIdCaseInsensitive = other.ConfigTagIdCaseInsensitive;
    this.ConfigTagIdSortAscending = other.ConfigTagIdSortAscending;
    this.AccessKey = other.AccessKey;
    this.AccessKeyFetch = other.AccessKeyFetch;
    this.AccessKeySort = other.AccessKeySort;
    this.AccessKeyCaseInsensitive = other.AccessKeyCaseInsensitive;
    this.AccessKeySortAscending = other.AccessKeySortAscending;
    this.ProfileId = other.ProfileId;
    this.ProfileIdFetch = other.ProfileIdFetch;
    this.ProfileIdSort = other.ProfileIdSort;
    this.ProfileIdCaseInsensitive = other.ProfileIdCaseInsensitive;
    this.ProfileIdSortAscending = other.ProfileIdSortAscending;
    this.SecretKey = other.SecretKey;
    this.SecretKeyFetch = other.SecretKeyFetch;
    this.SecretKeySort = other.SecretKeySort;
    this.SecretKeyCaseInsensitive = other.SecretKeyCaseInsensitive;
    this.SecretKeySortAscending = other.SecretKeySortAscending;  }
  /** get the filter for this object's key
   * @return AxrtPaymentMerchantObjectKeyFilter
   */
  public AxrtPaymentMerchantObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (AxrtPaymentMerchantObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: PaymentMerchantId (PAYMENT_MERCHANT_ID_REF.payment_merchant_id)
   * @param fetch whether to fetch this field or not
   */
  public void setPaymentMerchantIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new AxrtPaymentMerchantObjectKeyFilter ();
    this.Key.PaymentMerchantIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: PaymentMerchantId (PAYMENT_MERCHANT_ID_REF.payment_merchant_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getPaymentMerchantIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.PaymentMerchantIdFetch;
  }
  /** Set the SortOrder for field: PaymentMerchantId (PAYMENT_MERCHANT_ID_REF.payment_merchant_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPaymentMerchantIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new AxrtPaymentMerchantObjectKeyFilter ();
    this.Key.PaymentMerchantIdSort = value;
  }
  /** Retrieve SortOrder for field: PaymentMerchantId (PAYMENT_MERCHANT_ID_REF.payment_merchant_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPaymentMerchantIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.PaymentMerchantIdSort;
  }
  /** Set the sort direction for field: PaymentMerchantId (PAYMENT_MERCHANT_ID_REF.payment_merchant_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPaymentMerchantIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new AxrtPaymentMerchantObjectKeyFilter ();
    this.Key.PaymentMerchantIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PaymentMerchantId (PAYMENT_MERCHANT_ID_REF.payment_merchant_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPaymentMerchantIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.PaymentMerchantIdSortAscending;
  }
  /** Set the field level filters for field: PaymentMerchantId (PAYMENT_MERCHANT_ID_REF.payment_merchant_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPaymentMerchantIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new AxrtPaymentMerchantObjectKeyFilter ();
    this.Key.PaymentMerchantId = value;
  }
  /** Retrieve filter for field: PaymentMerchantId (PAYMENT_MERCHANT_ID_REF.payment_merchant_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPaymentMerchantIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.PaymentMerchantId;
  }
  /** Set the field level Fetch value for field: EpgMerchantId (PAYMENT_MERCHANT_ID_REF.epg_merchant_id)
   * @param fetch whether to fetch this field or not
   */
  public void setEpgMerchantIdFetch (boolean fetch) {
    this.EpgMerchantIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: EpgMerchantId (PAYMENT_MERCHANT_ID_REF.epg_merchant_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getEpgMerchantIdFetch () {
    return this.EpgMerchantIdFetch;
  }
  /** Set the SortOrder for field: EpgMerchantId (PAYMENT_MERCHANT_ID_REF.epg_merchant_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEpgMerchantIdSortOrder (Integer value) {
    this.EpgMerchantIdSort = value;
  }
  /** Retrieve SortOrder for field: EpgMerchantId (PAYMENT_MERCHANT_ID_REF.epg_merchant_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEpgMerchantIdSortOrder () {
    return this.EpgMerchantIdSort;
  }
  /** Set the sort direction for field: EpgMerchantId (PAYMENT_MERCHANT_ID_REF.epg_merchant_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEpgMerchantIdSortDirection (boolean ascending) {
    this.EpgMerchantIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EpgMerchantId (PAYMENT_MERCHANT_ID_REF.epg_merchant_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEpgMerchantIdSortDirection () {
    return this.EpgMerchantIdSortAscending;
  }
  /** Set the case insensitive for field: EpgMerchantId (PAYMENT_MERCHANT_ID_REF.epg_merchant_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setEpgMerchantIdCaseInsensitive (boolean ascending) {
    this.EpgMerchantIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: EpgMerchantId (PAYMENT_MERCHANT_ID_REF.epg_merchant_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getEpgMerchantIdCaseInsensitive () {
    return this.EpgMerchantIdCaseInsensitive;
  }
  /** Set the field level filters for field: EpgMerchantId (PAYMENT_MERCHANT_ID_REF.epg_merchant_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEpgMerchantIdFilter (StringFilter[] value) throws ServiceException {
    this.EpgMerchantId = value;
  }
  /** Retrieve filter for field: EpgMerchantId (PAYMENT_MERCHANT_ID_REF.epg_merchant_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getEpgMerchantIdFilter () {
    return this.EpgMerchantId;
  }

  /**
   * Retrieves the EpgMerchantIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EpgMerchantIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EpgMerchantIdFilter field
   */
  public String[] getEpgMerchantIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEpgMerchantIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEpgMerchantIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEpgMerchantIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EpgMerchantIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEpgMerchantIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EpgMerchantIdFilter filter value from a formatted string
   *
   * @param _value the EpgMerchantIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EpgMerchantIdFilter filter field
   */
  public void setEpgMerchantIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEpgMerchantIdFilterFromFormattedString");
    try {
      this.setEpgMerchantIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EpgMerchantIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEpgMerchantIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEpgMerchantIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Status (PAYMENT_MERCHANT_ID_REF.status)
   * @param fetch whether to fetch this field or not
   */
  public void setStatusFetch (boolean fetch) {
    this.StatusFetch = fetch;
  }
  /** Retrieve Fetch value for field: Status (PAYMENT_MERCHANT_ID_REF.status)
   * @return boolean the Fetch value for this field
   */
  public boolean getStatusFetch () {
    return this.StatusFetch;
  }
  /** Set the SortOrder for field: Status (PAYMENT_MERCHANT_ID_REF.status)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStatusSortOrder (Integer value) {
    this.StatusSort = value;
  }
  /** Retrieve SortOrder for field: Status (PAYMENT_MERCHANT_ID_REF.status)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStatusSortOrder () {
    return this.StatusSort;
  }
  /** Set the sort direction for field: Status (PAYMENT_MERCHANT_ID_REF.status)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStatusSortDirection (boolean ascending) {
    this.StatusSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Status (PAYMENT_MERCHANT_ID_REF.status)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStatusSortDirection () {
    return this.StatusSortAscending;
  }
  /** Set the field level filters for field: Status (PAYMENT_MERCHANT_ID_REF.status)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStatusFilter (BooleanFilter[] value) throws ServiceException {
    this.Status = value;
  }
  /** Retrieve filter for field: Status (PAYMENT_MERCHANT_ID_REF.status)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getStatusFilter () {
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
      this.setStatusFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatusFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatusFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsDefault (PAYMENT_MERCHANT_ID_REF.is_default)
   * @param fetch whether to fetch this field or not
   */
  public void setIsDefaultFetch (boolean fetch) {
    this.IsDefaultFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsDefault (PAYMENT_MERCHANT_ID_REF.is_default)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsDefaultFetch () {
    return this.IsDefaultFetch;
  }
  /** Set the SortOrder for field: IsDefault (PAYMENT_MERCHANT_ID_REF.is_default)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsDefaultSortOrder (Integer value) {
    this.IsDefaultSort = value;
  }
  /** Retrieve SortOrder for field: IsDefault (PAYMENT_MERCHANT_ID_REF.is_default)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsDefaultSortOrder () {
    return this.IsDefaultSort;
  }
  /** Set the sort direction for field: IsDefault (PAYMENT_MERCHANT_ID_REF.is_default)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsDefaultSortDirection (boolean ascending) {
    this.IsDefaultSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsDefault (PAYMENT_MERCHANT_ID_REF.is_default)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsDefaultSortDirection () {
    return this.IsDefaultSortAscending;
  }
  /** Set the field level filters for field: IsDefault (PAYMENT_MERCHANT_ID_REF.is_default)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsDefaultFilter (BooleanFilter[] value) throws ServiceException {
    this.IsDefault = value;
  }
  /** Retrieve filter for field: IsDefault (PAYMENT_MERCHANT_ID_REF.is_default)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsDefaultFilter () {
    return this.IsDefault;
  }

  /**
   * Retrieves the IsDefaultFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsDefaultFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsDefaultFilter field
   */
  public String[] getIsDefaultFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsDefaultFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsDefaultFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsDefaultFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsDefaultFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsDefaultFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsDefaultFilter filter value from a formatted string
   *
   * @param _value the IsDefaultFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsDefaultFilter filter field
   */
  public void setIsDefaultFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsDefaultFilterFromFormattedString");
    try {
      this.setIsDefaultFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsDefaultFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsDefaultFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsDefaultFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsInternal (PAYMENT_MERCHANT_ID_REF.is_internal)
   * @param fetch whether to fetch this field or not
   */
  public void setIsInternalFetch (boolean fetch) {
    this.IsInternalFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsInternal (PAYMENT_MERCHANT_ID_REF.is_internal)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsInternalFetch () {
    return this.IsInternalFetch;
  }
  /** Set the SortOrder for field: IsInternal (PAYMENT_MERCHANT_ID_REF.is_internal)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsInternalSortOrder (Integer value) {
    this.IsInternalSort = value;
  }
  /** Retrieve SortOrder for field: IsInternal (PAYMENT_MERCHANT_ID_REF.is_internal)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsInternalSortOrder () {
    return this.IsInternalSort;
  }
  /** Set the sort direction for field: IsInternal (PAYMENT_MERCHANT_ID_REF.is_internal)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsInternalSortDirection (boolean ascending) {
    this.IsInternalSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsInternal (PAYMENT_MERCHANT_ID_REF.is_internal)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsInternalSortDirection () {
    return this.IsInternalSortAscending;
  }
  /** Set the field level filters for field: IsInternal (PAYMENT_MERCHANT_ID_REF.is_internal)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsInternalFilter (BooleanFilter[] value) throws ServiceException {
    this.IsInternal = value;
  }
  /** Retrieve filter for field: IsInternal (PAYMENT_MERCHANT_ID_REF.is_internal)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsInternalFilter () {
    return this.IsInternal;
  }

  /**
   * Retrieves the IsInternalFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsInternalFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsInternalFilter field
   */
  public String[] getIsInternalFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsInternalFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsInternalFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsInternalFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsInternalFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsInternalFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsInternalFilter filter value from a formatted string
   *
   * @param _value the IsInternalFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsInternalFilter filter field
   */
  public void setIsInternalFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsInternalFilterFromFormattedString");
    try {
      this.setIsInternalFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsInternalFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsInternalFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsInternalFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ConfigTagId (PAYMENT_MERCHANT_ID_REF.config_tag_id)
   * @param fetch whether to fetch this field or not
   */
  public void setConfigTagIdFetch (boolean fetch) {
    this.ConfigTagIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ConfigTagId (PAYMENT_MERCHANT_ID_REF.config_tag_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getConfigTagIdFetch () {
    return this.ConfigTagIdFetch;
  }
  /** Set the SortOrder for field: ConfigTagId (PAYMENT_MERCHANT_ID_REF.config_tag_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setConfigTagIdSortOrder (Integer value) {
    this.ConfigTagIdSort = value;
  }
  /** Retrieve SortOrder for field: ConfigTagId (PAYMENT_MERCHANT_ID_REF.config_tag_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getConfigTagIdSortOrder () {
    return this.ConfigTagIdSort;
  }
  /** Set the sort direction for field: ConfigTagId (PAYMENT_MERCHANT_ID_REF.config_tag_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setConfigTagIdSortDirection (boolean ascending) {
    this.ConfigTagIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ConfigTagId (PAYMENT_MERCHANT_ID_REF.config_tag_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getConfigTagIdSortDirection () {
    return this.ConfigTagIdSortAscending;
  }
  /** Set the case insensitive for field: ConfigTagId (PAYMENT_MERCHANT_ID_REF.config_tag_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setConfigTagIdCaseInsensitive (boolean ascending) {
    this.ConfigTagIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ConfigTagId (PAYMENT_MERCHANT_ID_REF.config_tag_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getConfigTagIdCaseInsensitive () {
    return this.ConfigTagIdCaseInsensitive;
  }
  /** Set the field level filters for field: ConfigTagId (PAYMENT_MERCHANT_ID_REF.config_tag_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setConfigTagIdFilter (StringFilter[] value) throws ServiceException {
    this.ConfigTagId = value;
  }
  /** Retrieve filter for field: ConfigTagId (PAYMENT_MERCHANT_ID_REF.config_tag_id)
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

  /** Set the field level Fetch value for field: AccessKey (PAYMENT_MERCHANT_ID_REF.access_key)
   * @param fetch whether to fetch this field or not
   */
  public void setAccessKeyFetch (boolean fetch) {
    this.AccessKeyFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccessKey (PAYMENT_MERCHANT_ID_REF.access_key)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccessKeyFetch () {
    return this.AccessKeyFetch;
  }
  /** Set the SortOrder for field: AccessKey (PAYMENT_MERCHANT_ID_REF.access_key)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccessKeySortOrder (Integer value) {
    this.AccessKeySort = value;
  }
  /** Retrieve SortOrder for field: AccessKey (PAYMENT_MERCHANT_ID_REF.access_key)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccessKeySortOrder () {
    return this.AccessKeySort;
  }
  /** Set the sort direction for field: AccessKey (PAYMENT_MERCHANT_ID_REF.access_key)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccessKeySortDirection (boolean ascending) {
    this.AccessKeySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccessKey (PAYMENT_MERCHANT_ID_REF.access_key)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccessKeySortDirection () {
    return this.AccessKeySortAscending;
  }
  /** Set the case insensitive for field: AccessKey (PAYMENT_MERCHANT_ID_REF.access_key)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAccessKeyCaseInsensitive (boolean ascending) {
    this.AccessKeyCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: AccessKey (PAYMENT_MERCHANT_ID_REF.access_key)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getAccessKeyCaseInsensitive () {
    return this.AccessKeyCaseInsensitive;
  }
  /** Set the field level filters for field: AccessKey (PAYMENT_MERCHANT_ID_REF.access_key)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccessKeyFilter (StringFilter[] value) throws ServiceException {
    this.AccessKey = value;
  }
  /** Retrieve filter for field: AccessKey (PAYMENT_MERCHANT_ID_REF.access_key)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getAccessKeyFilter () {
    return this.AccessKey;
  }

  /**
   * Retrieves the AccessKeyFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AccessKeyFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccessKeyFilter field
   */
  public String[] getAccessKeyFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccessKeyFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAccessKeyFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccessKeyFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccessKeyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccessKeyFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AccessKeyFilter filter value from a formatted string
   *
   * @param _value the AccessKeyFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AccessKeyFilter filter field
   */
  public void setAccessKeyFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccessKeyFilterFromFormattedString");
    try {
      this.setAccessKeyFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccessKeyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccessKeyFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccessKeyFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ProfileId (PAYMENT_MERCHANT_ID_REF.profile_id)
   * @param fetch whether to fetch this field or not
   */
  public void setProfileIdFetch (boolean fetch) {
    this.ProfileIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ProfileId (PAYMENT_MERCHANT_ID_REF.profile_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getProfileIdFetch () {
    return this.ProfileIdFetch;
  }
  /** Set the SortOrder for field: ProfileId (PAYMENT_MERCHANT_ID_REF.profile_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setProfileIdSortOrder (Integer value) {
    this.ProfileIdSort = value;
  }
  /** Retrieve SortOrder for field: ProfileId (PAYMENT_MERCHANT_ID_REF.profile_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getProfileIdSortOrder () {
    return this.ProfileIdSort;
  }
  /** Set the sort direction for field: ProfileId (PAYMENT_MERCHANT_ID_REF.profile_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setProfileIdSortDirection (boolean ascending) {
    this.ProfileIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ProfileId (PAYMENT_MERCHANT_ID_REF.profile_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getProfileIdSortDirection () {
    return this.ProfileIdSortAscending;
  }
  /** Set the case insensitive for field: ProfileId (PAYMENT_MERCHANT_ID_REF.profile_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setProfileIdCaseInsensitive (boolean ascending) {
    this.ProfileIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ProfileId (PAYMENT_MERCHANT_ID_REF.profile_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getProfileIdCaseInsensitive () {
    return this.ProfileIdCaseInsensitive;
  }
  /** Set the field level filters for field: ProfileId (PAYMENT_MERCHANT_ID_REF.profile_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setProfileIdFilter (StringFilter[] value) throws ServiceException {
    this.ProfileId = value;
  }
  /** Retrieve filter for field: ProfileId (PAYMENT_MERCHANT_ID_REF.profile_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getProfileIdFilter () {
    return this.ProfileId;
  }

  /**
   * Retrieves the ProfileIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ProfileIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProfileIdFilter field
   */
  public String[] getProfileIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProfileIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getProfileIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProfileIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProfileIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getProfileIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ProfileIdFilter filter value from a formatted string
   *
   * @param _value the ProfileIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ProfileIdFilter filter field
   */
  public void setProfileIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setProfileIdFilterFromFormattedString");
    try {
      this.setProfileIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProfileIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setProfileIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProfileIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: SecretKey (PAYMENT_MERCHANT_ID_REF.secret_key)
   * @param fetch whether to fetch this field or not
   */
  public void setSecretKeyFetch (boolean fetch) {
    this.SecretKeyFetch = fetch;
  }
  /** Retrieve Fetch value for field: SecretKey (PAYMENT_MERCHANT_ID_REF.secret_key)
   * @return boolean the Fetch value for this field
   */
  public boolean getSecretKeyFetch () {
    return this.SecretKeyFetch;
  }
  /** Set the SortOrder for field: SecretKey (PAYMENT_MERCHANT_ID_REF.secret_key)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSecretKeySortOrder (Integer value) {
    this.SecretKeySort = value;
  }
  /** Retrieve SortOrder for field: SecretKey (PAYMENT_MERCHANT_ID_REF.secret_key)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSecretKeySortOrder () {
    return this.SecretKeySort;
  }
  /** Set the sort direction for field: SecretKey (PAYMENT_MERCHANT_ID_REF.secret_key)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSecretKeySortDirection (boolean ascending) {
    this.SecretKeySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SecretKey (PAYMENT_MERCHANT_ID_REF.secret_key)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSecretKeySortDirection () {
    return this.SecretKeySortAscending;
  }
  /** Set the case insensitive for field: SecretKey (PAYMENT_MERCHANT_ID_REF.secret_key)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setSecretKeyCaseInsensitive (boolean ascending) {
    this.SecretKeyCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: SecretKey (PAYMENT_MERCHANT_ID_REF.secret_key)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getSecretKeyCaseInsensitive () {
    return this.SecretKeyCaseInsensitive;
  }
  /** Set the field level filters for field: SecretKey (PAYMENT_MERCHANT_ID_REF.secret_key)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSecretKeyFilter (StringFilter[] value) throws ServiceException {
    this.SecretKey = value;
  }
  /** Retrieve filter for field: SecretKey (PAYMENT_MERCHANT_ID_REF.secret_key)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getSecretKeyFilter () {
    return this.SecretKey;
  }

  /**
   * Retrieves the SecretKeyFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SecretKeyFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SecretKeyFilter field
   */
  public String[] getSecretKeyFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSecretKeyFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSecretKeyFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSecretKeyFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SecretKeyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSecretKeyFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SecretKeyFilter filter value from a formatted string
   *
   * @param _value the SecretKeyFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SecretKeyFilter filter field
   */
  public void setSecretKeyFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSecretKeyFilterFromFormattedString");
    try {
      this.setSecretKeyFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SecretKeyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSecretKeyFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSecretKeyFilterFromFormattedString");
  }

  public String toString() {
    return AxrtPaymentMerchantObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return AxrtPaymentMerchantObjectHelper.toMap(this, null);
  }
}
