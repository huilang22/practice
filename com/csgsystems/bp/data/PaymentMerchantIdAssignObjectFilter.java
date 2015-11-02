/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PaymentMerchantIdAssignObjectFilter.java
 * Definition File: Admin/PaymentMerchantIdAssign.xml
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
public class PaymentMerchantIdAssignObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public PaymentMerchantIdAssignObjectKeyFilter Key = null;
  /** raw field for: PAYMENT_MERCHANT_ID_ASSIGN.is_default_merchant_id) */
  public    BooleanFilter[] IsDefaultMerchantId  = null;
  protected boolean IsDefaultMerchantIdFetch = false;
  protected boolean IsDefaultMerchantIdSortAscending = true;
  protected Integer IsDefaultMerchantIdSort = null;
  /** raw field for: PAYMENT_MERCHANT_ID_ASSIGN.config_tag_id) */
  public    StringFilter[] ConfigTagId  = null;
  protected boolean ConfigTagIdFetch = false;
  protected boolean ConfigTagIdSortAscending = true;
  protected boolean ConfigTagIdCaseInsensitive = false;
  protected Integer ConfigTagIdSort = null;
  private String _objName = "PaymentMerchantIdAssignObjectFilter";
  /** default constructor */
  public PaymentMerchantIdAssignObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public PaymentMerchantIdAssignObjectFilter (PaymentMerchantIdAssignObjectFilter other)
  {
    if (other == null) return;
    this.Key = new PaymentMerchantIdAssignObjectKeyFilter (other.Key);
    this.IsDefaultMerchantId = other.IsDefaultMerchantId;
    this.IsDefaultMerchantIdFetch = other.IsDefaultMerchantIdFetch;
    this.IsDefaultMerchantIdSort = other.IsDefaultMerchantIdSort;
    this.IsDefaultMerchantIdSortAscending = other.IsDefaultMerchantIdSortAscending;
    this.ConfigTagId = other.ConfigTagId;
    this.ConfigTagIdFetch = other.ConfigTagIdFetch;
    this.ConfigTagIdSort = other.ConfigTagIdSort;
    this.ConfigTagIdCaseInsensitive = other.ConfigTagIdCaseInsensitive;
    this.ConfigTagIdSortAscending = other.ConfigTagIdSortAscending;  }
  /** get the filter for this object's key
   * @return PaymentMerchantIdAssignObjectKeyFilter
   */
  public PaymentMerchantIdAssignObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (PaymentMerchantIdAssignObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: PaymentMerchantId (PAYMENT_MERCHANT_ID_ASSIGN.payment_merchant_id)
   * @param fetch whether to fetch this field or not
   */
  public void setPaymentMerchantIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new PaymentMerchantIdAssignObjectKeyFilter ();
    this.Key.PaymentMerchantIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: PaymentMerchantId (PAYMENT_MERCHANT_ID_ASSIGN.payment_merchant_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getPaymentMerchantIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.PaymentMerchantIdFetch;
  }
  /** Set the SortOrder for field: PaymentMerchantId (PAYMENT_MERCHANT_ID_ASSIGN.payment_merchant_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPaymentMerchantIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new PaymentMerchantIdAssignObjectKeyFilter ();
    this.Key.PaymentMerchantIdSort = value;
  }
  /** Retrieve SortOrder for field: PaymentMerchantId (PAYMENT_MERCHANT_ID_ASSIGN.payment_merchant_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPaymentMerchantIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.PaymentMerchantIdSort;
  }
  /** Set the sort direction for field: PaymentMerchantId (PAYMENT_MERCHANT_ID_ASSIGN.payment_merchant_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPaymentMerchantIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new PaymentMerchantIdAssignObjectKeyFilter ();
    this.Key.PaymentMerchantIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PaymentMerchantId (PAYMENT_MERCHANT_ID_ASSIGN.payment_merchant_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPaymentMerchantIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.PaymentMerchantIdSortAscending;
  }
  /** Set the field level filters for field: PaymentMerchantId (PAYMENT_MERCHANT_ID_ASSIGN.payment_merchant_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPaymentMerchantIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new PaymentMerchantIdAssignObjectKeyFilter ();
    this.Key.PaymentMerchantId = value;
  }
  /** Retrieve filter for field: PaymentMerchantId (PAYMENT_MERCHANT_ID_ASSIGN.payment_merchant_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPaymentMerchantIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.PaymentMerchantId;
  }
  /** Set the field level Fetch value for field: CardTypeCode (PAYMENT_MERCHANT_ID_ASSIGN.card_type_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCardTypeCodeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new PaymentMerchantIdAssignObjectKeyFilter ();
    this.Key.CardTypeCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CardTypeCode (PAYMENT_MERCHANT_ID_ASSIGN.card_type_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCardTypeCodeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.CardTypeCodeFetch;
  }
  /** Set the SortOrder for field: CardTypeCode (PAYMENT_MERCHANT_ID_ASSIGN.card_type_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCardTypeCodeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new PaymentMerchantIdAssignObjectKeyFilter ();
    this.Key.CardTypeCodeSort = value;
  }
  /** Retrieve SortOrder for field: CardTypeCode (PAYMENT_MERCHANT_ID_ASSIGN.card_type_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCardTypeCodeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.CardTypeCodeSort;
  }
  /** Set the sort direction for field: CardTypeCode (PAYMENT_MERCHANT_ID_ASSIGN.card_type_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCardTypeCodeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new PaymentMerchantIdAssignObjectKeyFilter ();
    this.Key.CardTypeCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CardTypeCode (PAYMENT_MERCHANT_ID_ASSIGN.card_type_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCardTypeCodeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.CardTypeCodeSortAscending;
  }
  /** Set the field level filters for field: CardTypeCode (PAYMENT_MERCHANT_ID_ASSIGN.card_type_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCardTypeCodeFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new PaymentMerchantIdAssignObjectKeyFilter ();
    this.Key.CardTypeCode = value;
  }
  /** Retrieve filter for field: CardTypeCode (PAYMENT_MERCHANT_ID_ASSIGN.card_type_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCardTypeCodeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.CardTypeCode;
  }
  /** Set the field level Fetch value for field: PayMethod (PAYMENT_MERCHANT_ID_ASSIGN.pay_method)
   * @param fetch whether to fetch this field or not
   */
  public void setPayMethodFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new PaymentMerchantIdAssignObjectKeyFilter ();
    this.Key.PayMethodFetch = fetch;
  }
  /** Retrieve Fetch value for field: PayMethod (PAYMENT_MERCHANT_ID_ASSIGN.pay_method)
   * @return boolean the Fetch value for this field
   */
  public boolean getPayMethodFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.PayMethodFetch;
  }
  /** Set the SortOrder for field: PayMethod (PAYMENT_MERCHANT_ID_ASSIGN.pay_method)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPayMethodSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new PaymentMerchantIdAssignObjectKeyFilter ();
    this.Key.PayMethodSort = value;
  }
  /** Retrieve SortOrder for field: PayMethod (PAYMENT_MERCHANT_ID_ASSIGN.pay_method)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPayMethodSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.PayMethodSort;
  }
  /** Set the sort direction for field: PayMethod (PAYMENT_MERCHANT_ID_ASSIGN.pay_method)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPayMethodSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new PaymentMerchantIdAssignObjectKeyFilter ();
    this.Key.PayMethodSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PayMethod (PAYMENT_MERCHANT_ID_ASSIGN.pay_method)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPayMethodSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.PayMethodSortAscending;
  }
  /** Set the field level filters for field: PayMethod (PAYMENT_MERCHANT_ID_ASSIGN.pay_method)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPayMethodFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new PaymentMerchantIdAssignObjectKeyFilter ();
    this.Key.PayMethod = value;
  }
  /** Retrieve filter for field: PayMethod (PAYMENT_MERCHANT_ID_ASSIGN.pay_method)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPayMethodFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.PayMethod;
  }
  /** Set the field level Fetch value for field: IsDefaultMerchantId (PAYMENT_MERCHANT_ID_ASSIGN.is_default_merchant_id)
   * @param fetch whether to fetch this field or not
   */
  public void setIsDefaultMerchantIdFetch (boolean fetch) {
    this.IsDefaultMerchantIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsDefaultMerchantId (PAYMENT_MERCHANT_ID_ASSIGN.is_default_merchant_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsDefaultMerchantIdFetch () {
    return this.IsDefaultMerchantIdFetch;
  }
  /** Set the SortOrder for field: IsDefaultMerchantId (PAYMENT_MERCHANT_ID_ASSIGN.is_default_merchant_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsDefaultMerchantIdSortOrder (Integer value) {
    this.IsDefaultMerchantIdSort = value;
  }
  /** Retrieve SortOrder for field: IsDefaultMerchantId (PAYMENT_MERCHANT_ID_ASSIGN.is_default_merchant_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsDefaultMerchantIdSortOrder () {
    return this.IsDefaultMerchantIdSort;
  }
  /** Set the sort direction for field: IsDefaultMerchantId (PAYMENT_MERCHANT_ID_ASSIGN.is_default_merchant_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsDefaultMerchantIdSortDirection (boolean ascending) {
    this.IsDefaultMerchantIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsDefaultMerchantId (PAYMENT_MERCHANT_ID_ASSIGN.is_default_merchant_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsDefaultMerchantIdSortDirection () {
    return this.IsDefaultMerchantIdSortAscending;
  }
  /** Set the field level filters for field: IsDefaultMerchantId (PAYMENT_MERCHANT_ID_ASSIGN.is_default_merchant_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsDefaultMerchantIdFilter (BooleanFilter[] value) throws ServiceException {
    this.IsDefaultMerchantId = value;
  }
  /** Retrieve filter for field: IsDefaultMerchantId (PAYMENT_MERCHANT_ID_ASSIGN.is_default_merchant_id)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsDefaultMerchantIdFilter () {
    return this.IsDefaultMerchantId;
  }

  /**
   * Retrieves the IsDefaultMerchantIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsDefaultMerchantIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsDefaultMerchantIdFilter field
   */
  public String[] getIsDefaultMerchantIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsDefaultMerchantIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsDefaultMerchantIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsDefaultMerchantIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsDefaultMerchantIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsDefaultMerchantIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsDefaultMerchantIdFilter filter value from a formatted string
   *
   * @param _value the IsDefaultMerchantIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsDefaultMerchantIdFilter filter field
   */
  public void setIsDefaultMerchantIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsDefaultMerchantIdFilterFromFormattedString");
    try {
      this.setIsDefaultMerchantIdFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsDefaultMerchantIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsDefaultMerchantIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsDefaultMerchantIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ConfigTagId (PAYMENT_MERCHANT_ID_ASSIGN.config_tag_id)
   * @param fetch whether to fetch this field or not
   */
  public void setConfigTagIdFetch (boolean fetch) {
    this.ConfigTagIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ConfigTagId (PAYMENT_MERCHANT_ID_ASSIGN.config_tag_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getConfigTagIdFetch () {
    return this.ConfigTagIdFetch;
  }
  /** Set the SortOrder for field: ConfigTagId (PAYMENT_MERCHANT_ID_ASSIGN.config_tag_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setConfigTagIdSortOrder (Integer value) {
    this.ConfigTagIdSort = value;
  }
  /** Retrieve SortOrder for field: ConfigTagId (PAYMENT_MERCHANT_ID_ASSIGN.config_tag_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getConfigTagIdSortOrder () {
    return this.ConfigTagIdSort;
  }
  /** Set the sort direction for field: ConfigTagId (PAYMENT_MERCHANT_ID_ASSIGN.config_tag_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setConfigTagIdSortDirection (boolean ascending) {
    this.ConfigTagIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ConfigTagId (PAYMENT_MERCHANT_ID_ASSIGN.config_tag_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getConfigTagIdSortDirection () {
    return this.ConfigTagIdSortAscending;
  }
  /** Set the case insensitive for field: ConfigTagId (PAYMENT_MERCHANT_ID_ASSIGN.config_tag_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setConfigTagIdCaseInsensitive (boolean ascending) {
    this.ConfigTagIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ConfigTagId (PAYMENT_MERCHANT_ID_ASSIGN.config_tag_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getConfigTagIdCaseInsensitive () {
    return this.ConfigTagIdCaseInsensitive;
  }
  /** Set the field level filters for field: ConfigTagId (PAYMENT_MERCHANT_ID_ASSIGN.config_tag_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setConfigTagIdFilter (StringFilter[] value) throws ServiceException {
    this.ConfigTagId = value;
  }
  /** Retrieve filter for field: ConfigTagId (PAYMENT_MERCHANT_ID_ASSIGN.config_tag_id)
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
    return PaymentMerchantIdAssignObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return PaymentMerchantIdAssignObjectHelper.toMap(this, null);
  }
}
