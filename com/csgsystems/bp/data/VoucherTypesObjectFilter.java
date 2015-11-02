/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: VoucherTypesObjectFilter.java
 * Definition File: Catalog/VoucherTypes.xml
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
public class VoucherTypesObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public VoucherTypesObjectKeyFilter Key = null;
  /** raw field for: VOUCHER_TYPES.length_of_pin) */
  public    BigIntegerFilter[] LengthOfPin  = null;
  protected boolean LengthOfPinFetch = false;
  protected boolean LengthOfPinSortAscending = true;
  protected Integer LengthOfPinSort = null;
  /** raw field for: VOUCHER_TYPES.pin_data_type) */
  public    BigIntegerFilter[] PinDataType  = null;
  protected boolean PinDataTypeFetch = false;
  protected boolean PinDataTypeSortAscending = true;
  protected Integer PinDataTypeSort = null;
  /** raw field for: VOUCHER_TYPES.voucher_descriptions) */
  public    StringFilter[] VoucherDescriptions  = null;
  protected boolean VoucherDescriptionsFetch = false;
  protected boolean VoucherDescriptionsSortAscending = true;
  protected boolean VoucherDescriptionsCaseInsensitive = false;
  protected Integer VoucherDescriptionsSort = null;
  /** raw field for: VOUCHER_TYPES.credit_conversion_type) */
  public    BigIntegerFilter[] CreditConversionType  = null;
  protected boolean CreditConversionTypeFetch = false;
  protected boolean CreditConversionTypeSortAscending = true;
  protected Integer CreditConversionTypeSort = null;
  /** raw field for: VOUCHER_TYPES.api_validation_check) */
  public    BigIntegerFilter[] ApiValidationCheck  = null;
  protected boolean ApiValidationCheckFetch = false;
  protected boolean ApiValidationCheckSortAscending = true;
  protected Integer ApiValidationCheckSort = null;
  /** raw field for: VOUCHER_TYPES.gui_validation_check) */
  public    BigIntegerFilter[] GuiValidationCheck  = null;
  protected boolean GuiValidationCheckFetch = false;
  protected boolean GuiValidationCheckSortAscending = true;
  protected Integer GuiValidationCheckSort = null;
  /** raw field for: VOUCHER_TYPES.unit_credit_contract_id) */
  public    BigIntegerFilter[] UnitCreditContractId  = null;
  protected boolean UnitCreditContractIdFetch = false;
  protected boolean UnitCreditContractIdSortAscending = true;
  protected Integer UnitCreditContractIdSort = null;
  /** raw field for: VOUCHER_TYPES.payment_trans_type) */
  public    BigIntegerFilter[] PaymentTransType  = null;
  protected boolean PaymentTransTypeFetch = false;
  protected boolean PaymentTransTypeSortAscending = true;
  protected Integer PaymentTransTypeSort = null;
  private String _objName = "VoucherTypesObjectFilter";
  /** default constructor */
  public VoucherTypesObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public VoucherTypesObjectFilter (VoucherTypesObjectFilter other)
  {
    if (other == null) return;
    this.Key = new VoucherTypesObjectKeyFilter (other.Key);
    this.LengthOfPin = other.LengthOfPin;
    this.LengthOfPinFetch = other.LengthOfPinFetch;
    this.LengthOfPinSort = other.LengthOfPinSort;
    this.LengthOfPinSortAscending = other.LengthOfPinSortAscending;
    this.PinDataType = other.PinDataType;
    this.PinDataTypeFetch = other.PinDataTypeFetch;
    this.PinDataTypeSort = other.PinDataTypeSort;
    this.PinDataTypeSortAscending = other.PinDataTypeSortAscending;
    this.VoucherDescriptions = other.VoucherDescriptions;
    this.VoucherDescriptionsFetch = other.VoucherDescriptionsFetch;
    this.VoucherDescriptionsSort = other.VoucherDescriptionsSort;
    this.VoucherDescriptionsCaseInsensitive = other.VoucherDescriptionsCaseInsensitive;
    this.VoucherDescriptionsSortAscending = other.VoucherDescriptionsSortAscending;
    this.CreditConversionType = other.CreditConversionType;
    this.CreditConversionTypeFetch = other.CreditConversionTypeFetch;
    this.CreditConversionTypeSort = other.CreditConversionTypeSort;
    this.CreditConversionTypeSortAscending = other.CreditConversionTypeSortAscending;
    this.ApiValidationCheck = other.ApiValidationCheck;
    this.ApiValidationCheckFetch = other.ApiValidationCheckFetch;
    this.ApiValidationCheckSort = other.ApiValidationCheckSort;
    this.ApiValidationCheckSortAscending = other.ApiValidationCheckSortAscending;
    this.GuiValidationCheck = other.GuiValidationCheck;
    this.GuiValidationCheckFetch = other.GuiValidationCheckFetch;
    this.GuiValidationCheckSort = other.GuiValidationCheckSort;
    this.GuiValidationCheckSortAscending = other.GuiValidationCheckSortAscending;
    this.UnitCreditContractId = other.UnitCreditContractId;
    this.UnitCreditContractIdFetch = other.UnitCreditContractIdFetch;
    this.UnitCreditContractIdSort = other.UnitCreditContractIdSort;
    this.UnitCreditContractIdSortAscending = other.UnitCreditContractIdSortAscending;
    this.PaymentTransType = other.PaymentTransType;
    this.PaymentTransTypeFetch = other.PaymentTransTypeFetch;
    this.PaymentTransTypeSort = other.PaymentTransTypeSort;
    this.PaymentTransTypeSortAscending = other.PaymentTransTypeSortAscending;  }
  /** get the filter for this object's key
   * @return VoucherTypesObjectKeyFilter
   */
  public VoucherTypesObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (VoucherTypesObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: VoucherTypeId (VOUCHER_TYPES.voucher_type_id)
   * @param fetch whether to fetch this field or not
   */
  public void setVoucherTypeIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new VoucherTypesObjectKeyFilter ();
    this.Key.VoucherTypeIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: VoucherTypeId (VOUCHER_TYPES.voucher_type_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getVoucherTypeIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.VoucherTypeIdFetch;
  }
  /** Set the SortOrder for field: VoucherTypeId (VOUCHER_TYPES.voucher_type_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setVoucherTypeIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new VoucherTypesObjectKeyFilter ();
    this.Key.VoucherTypeIdSort = value;
  }
  /** Retrieve SortOrder for field: VoucherTypeId (VOUCHER_TYPES.voucher_type_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getVoucherTypeIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.VoucherTypeIdSort;
  }
  /** Set the sort direction for field: VoucherTypeId (VOUCHER_TYPES.voucher_type_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setVoucherTypeIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new VoucherTypesObjectKeyFilter ();
    this.Key.VoucherTypeIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: VoucherTypeId (VOUCHER_TYPES.voucher_type_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getVoucherTypeIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.VoucherTypeIdSortAscending;
  }
  /** Set the field level filters for field: VoucherTypeId (VOUCHER_TYPES.voucher_type_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setVoucherTypeIdFilter (BigIntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new VoucherTypesObjectKeyFilter ();
    this.Key.VoucherTypeId = value;
  }
  /** Retrieve filter for field: VoucherTypeId (VOUCHER_TYPES.voucher_type_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getVoucherTypeIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.VoucherTypeId;
  }
  /** Set the field level Fetch value for field: LengthOfPin (VOUCHER_TYPES.length_of_pin)
   * @param fetch whether to fetch this field or not
   */
  public void setLengthOfPinFetch (boolean fetch) {
    this.LengthOfPinFetch = fetch;
  }
  /** Retrieve Fetch value for field: LengthOfPin (VOUCHER_TYPES.length_of_pin)
   * @return boolean the Fetch value for this field
   */
  public boolean getLengthOfPinFetch () {
    return this.LengthOfPinFetch;
  }
  /** Set the SortOrder for field: LengthOfPin (VOUCHER_TYPES.length_of_pin)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLengthOfPinSortOrder (Integer value) {
    this.LengthOfPinSort = value;
  }
  /** Retrieve SortOrder for field: LengthOfPin (VOUCHER_TYPES.length_of_pin)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLengthOfPinSortOrder () {
    return this.LengthOfPinSort;
  }
  /** Set the sort direction for field: LengthOfPin (VOUCHER_TYPES.length_of_pin)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLengthOfPinSortDirection (boolean ascending) {
    this.LengthOfPinSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LengthOfPin (VOUCHER_TYPES.length_of_pin)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLengthOfPinSortDirection () {
    return this.LengthOfPinSortAscending;
  }
  /** Set the field level filters for field: LengthOfPin (VOUCHER_TYPES.length_of_pin)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLengthOfPinFilter (BigIntegerFilter[] value) throws ServiceException {
    this.LengthOfPin = value;
  }
  /** Retrieve filter for field: LengthOfPin (VOUCHER_TYPES.length_of_pin)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getLengthOfPinFilter () {
    return this.LengthOfPin;
  }

  /**
   * Retrieves the LengthOfPinFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The LengthOfPinFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LengthOfPinFilter field
   */
  public String[] getLengthOfPinFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLengthOfPinFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getLengthOfPinFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLengthOfPinFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LengthOfPinFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getLengthOfPinFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the LengthOfPinFilter filter value from a formatted string
   *
   * @param _value the LengthOfPinFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the LengthOfPinFilter filter field
   */
  public void setLengthOfPinFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setLengthOfPinFilterFromFormattedString");
    try {
      this.setLengthOfPinFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LengthOfPinFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setLengthOfPinFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLengthOfPinFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PinDataType (VOUCHER_TYPES.pin_data_type)
   * @param fetch whether to fetch this field or not
   */
  public void setPinDataTypeFetch (boolean fetch) {
    this.PinDataTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: PinDataType (VOUCHER_TYPES.pin_data_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getPinDataTypeFetch () {
    return this.PinDataTypeFetch;
  }
  /** Set the SortOrder for field: PinDataType (VOUCHER_TYPES.pin_data_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPinDataTypeSortOrder (Integer value) {
    this.PinDataTypeSort = value;
  }
  /** Retrieve SortOrder for field: PinDataType (VOUCHER_TYPES.pin_data_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPinDataTypeSortOrder () {
    return this.PinDataTypeSort;
  }
  /** Set the sort direction for field: PinDataType (VOUCHER_TYPES.pin_data_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPinDataTypeSortDirection (boolean ascending) {
    this.PinDataTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PinDataType (VOUCHER_TYPES.pin_data_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPinDataTypeSortDirection () {
    return this.PinDataTypeSortAscending;
  }
  /** Set the field level filters for field: PinDataType (VOUCHER_TYPES.pin_data_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPinDataTypeFilter (BigIntegerFilter[] value) throws ServiceException {
    this.PinDataType = value;
  }
  /** Retrieve filter for field: PinDataType (VOUCHER_TYPES.pin_data_type)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getPinDataTypeFilter () {
    return this.PinDataType;
  }

  /**
   * Retrieves the PinDataTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PinDataTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PinDataTypeFilter field
   */
  public String[] getPinDataTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPinDataTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPinDataTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPinDataTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PinDataTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPinDataTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PinDataTypeFilter filter value from a formatted string
   *
   * @param _value the PinDataTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PinDataTypeFilter filter field
   */
  public void setPinDataTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPinDataTypeFilterFromFormattedString");
    try {
      this.setPinDataTypeFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PinDataTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPinDataTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPinDataTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: VoucherDescriptions (VOUCHER_TYPES.voucher_descriptions)
   * @param fetch whether to fetch this field or not
   */
  public void setVoucherDescriptionsFetch (boolean fetch) {
    this.VoucherDescriptionsFetch = fetch;
  }
  /** Retrieve Fetch value for field: VoucherDescriptions (VOUCHER_TYPES.voucher_descriptions)
   * @return boolean the Fetch value for this field
   */
  public boolean getVoucherDescriptionsFetch () {
    return this.VoucherDescriptionsFetch;
  }
  /** Set the SortOrder for field: VoucherDescriptions (VOUCHER_TYPES.voucher_descriptions)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setVoucherDescriptionsSortOrder (Integer value) {
    this.VoucherDescriptionsSort = value;
  }
  /** Retrieve SortOrder for field: VoucherDescriptions (VOUCHER_TYPES.voucher_descriptions)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getVoucherDescriptionsSortOrder () {
    return this.VoucherDescriptionsSort;
  }
  /** Set the sort direction for field: VoucherDescriptions (VOUCHER_TYPES.voucher_descriptions)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setVoucherDescriptionsSortDirection (boolean ascending) {
    this.VoucherDescriptionsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: VoucherDescriptions (VOUCHER_TYPES.voucher_descriptions)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getVoucherDescriptionsSortDirection () {
    return this.VoucherDescriptionsSortAscending;
  }
  /** Set the case insensitive for field: VoucherDescriptions (VOUCHER_TYPES.voucher_descriptions)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setVoucherDescriptionsCaseInsensitive (boolean ascending) {
    this.VoucherDescriptionsCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: VoucherDescriptions (VOUCHER_TYPES.voucher_descriptions)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getVoucherDescriptionsCaseInsensitive () {
    return this.VoucherDescriptionsCaseInsensitive;
  }
  /** Set the field level filters for field: VoucherDescriptions (VOUCHER_TYPES.voucher_descriptions)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setVoucherDescriptionsFilter (StringFilter[] value) throws ServiceException {
    this.VoucherDescriptions = value;
  }
  /** Retrieve filter for field: VoucherDescriptions (VOUCHER_TYPES.voucher_descriptions)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getVoucherDescriptionsFilter () {
    return this.VoucherDescriptions;
  }

  /**
   * Retrieves the VoucherDescriptionsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The VoucherDescriptionsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the VoucherDescriptionsFilter field
   */
  public String[] getVoucherDescriptionsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherDescriptionsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getVoucherDescriptionsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherDescriptionsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("VoucherDescriptionsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getVoucherDescriptionsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the VoucherDescriptionsFilter filter value from a formatted string
   *
   * @param _value the VoucherDescriptionsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the VoucherDescriptionsFilter filter field
   */
  public void setVoucherDescriptionsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setVoucherDescriptionsFilterFromFormattedString");
    try {
      this.setVoucherDescriptionsFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("VoucherDescriptionsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setVoucherDescriptionsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setVoucherDescriptionsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CreditConversionType (VOUCHER_TYPES.credit_conversion_type)
   * @param fetch whether to fetch this field or not
   */
  public void setCreditConversionTypeFetch (boolean fetch) {
    this.CreditConversionTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CreditConversionType (VOUCHER_TYPES.credit_conversion_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getCreditConversionTypeFetch () {
    return this.CreditConversionTypeFetch;
  }
  /** Set the SortOrder for field: CreditConversionType (VOUCHER_TYPES.credit_conversion_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCreditConversionTypeSortOrder (Integer value) {
    this.CreditConversionTypeSort = value;
  }
  /** Retrieve SortOrder for field: CreditConversionType (VOUCHER_TYPES.credit_conversion_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCreditConversionTypeSortOrder () {
    return this.CreditConversionTypeSort;
  }
  /** Set the sort direction for field: CreditConversionType (VOUCHER_TYPES.credit_conversion_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCreditConversionTypeSortDirection (boolean ascending) {
    this.CreditConversionTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CreditConversionType (VOUCHER_TYPES.credit_conversion_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCreditConversionTypeSortDirection () {
    return this.CreditConversionTypeSortAscending;
  }
  /** Set the field level filters for field: CreditConversionType (VOUCHER_TYPES.credit_conversion_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCreditConversionTypeFilter (BigIntegerFilter[] value) throws ServiceException {
    this.CreditConversionType = value;
  }
  /** Retrieve filter for field: CreditConversionType (VOUCHER_TYPES.credit_conversion_type)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getCreditConversionTypeFilter () {
    return this.CreditConversionType;
  }

  /**
   * Retrieves the CreditConversionTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CreditConversionTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CreditConversionTypeFilter field
   */
  public String[] getCreditConversionTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreditConversionTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCreditConversionTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCreditConversionTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CreditConversionTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCreditConversionTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CreditConversionTypeFilter filter value from a formatted string
   *
   * @param _value the CreditConversionTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CreditConversionTypeFilter filter field
   */
  public void setCreditConversionTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCreditConversionTypeFilterFromFormattedString");
    try {
      this.setCreditConversionTypeFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CreditConversionTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCreditConversionTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCreditConversionTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ApiValidationCheck (VOUCHER_TYPES.api_validation_check)
   * @param fetch whether to fetch this field or not
   */
  public void setApiValidationCheckFetch (boolean fetch) {
    this.ApiValidationCheckFetch = fetch;
  }
  /** Retrieve Fetch value for field: ApiValidationCheck (VOUCHER_TYPES.api_validation_check)
   * @return boolean the Fetch value for this field
   */
  public boolean getApiValidationCheckFetch () {
    return this.ApiValidationCheckFetch;
  }
  /** Set the SortOrder for field: ApiValidationCheck (VOUCHER_TYPES.api_validation_check)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setApiValidationCheckSortOrder (Integer value) {
    this.ApiValidationCheckSort = value;
  }
  /** Retrieve SortOrder for field: ApiValidationCheck (VOUCHER_TYPES.api_validation_check)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getApiValidationCheckSortOrder () {
    return this.ApiValidationCheckSort;
  }
  /** Set the sort direction for field: ApiValidationCheck (VOUCHER_TYPES.api_validation_check)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setApiValidationCheckSortDirection (boolean ascending) {
    this.ApiValidationCheckSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ApiValidationCheck (VOUCHER_TYPES.api_validation_check)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getApiValidationCheckSortDirection () {
    return this.ApiValidationCheckSortAscending;
  }
  /** Set the field level filters for field: ApiValidationCheck (VOUCHER_TYPES.api_validation_check)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setApiValidationCheckFilter (BigIntegerFilter[] value) throws ServiceException {
    this.ApiValidationCheck = value;
  }
  /** Retrieve filter for field: ApiValidationCheck (VOUCHER_TYPES.api_validation_check)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getApiValidationCheckFilter () {
    return this.ApiValidationCheck;
  }

  /**
   * Retrieves the ApiValidationCheckFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ApiValidationCheckFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ApiValidationCheckFilter field
   */
  public String[] getApiValidationCheckFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getApiValidationCheckFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getApiValidationCheckFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getApiValidationCheckFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ApiValidationCheckFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getApiValidationCheckFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ApiValidationCheckFilter filter value from a formatted string
   *
   * @param _value the ApiValidationCheckFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ApiValidationCheckFilter filter field
   */
  public void setApiValidationCheckFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setApiValidationCheckFilterFromFormattedString");
    try {
      this.setApiValidationCheckFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ApiValidationCheckFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setApiValidationCheckFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setApiValidationCheckFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: GuiValidationCheck (VOUCHER_TYPES.gui_validation_check)
   * @param fetch whether to fetch this field or not
   */
  public void setGuiValidationCheckFetch (boolean fetch) {
    this.GuiValidationCheckFetch = fetch;
  }
  /** Retrieve Fetch value for field: GuiValidationCheck (VOUCHER_TYPES.gui_validation_check)
   * @return boolean the Fetch value for this field
   */
  public boolean getGuiValidationCheckFetch () {
    return this.GuiValidationCheckFetch;
  }
  /** Set the SortOrder for field: GuiValidationCheck (VOUCHER_TYPES.gui_validation_check)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setGuiValidationCheckSortOrder (Integer value) {
    this.GuiValidationCheckSort = value;
  }
  /** Retrieve SortOrder for field: GuiValidationCheck (VOUCHER_TYPES.gui_validation_check)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getGuiValidationCheckSortOrder () {
    return this.GuiValidationCheckSort;
  }
  /** Set the sort direction for field: GuiValidationCheck (VOUCHER_TYPES.gui_validation_check)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setGuiValidationCheckSortDirection (boolean ascending) {
    this.GuiValidationCheckSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: GuiValidationCheck (VOUCHER_TYPES.gui_validation_check)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getGuiValidationCheckSortDirection () {
    return this.GuiValidationCheckSortAscending;
  }
  /** Set the field level filters for field: GuiValidationCheck (VOUCHER_TYPES.gui_validation_check)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setGuiValidationCheckFilter (BigIntegerFilter[] value) throws ServiceException {
    this.GuiValidationCheck = value;
  }
  /** Retrieve filter for field: GuiValidationCheck (VOUCHER_TYPES.gui_validation_check)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getGuiValidationCheckFilter () {
    return this.GuiValidationCheck;
  }

  /**
   * Retrieves the GuiValidationCheckFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The GuiValidationCheckFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GuiValidationCheckFilter field
   */
  public String[] getGuiValidationCheckFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGuiValidationCheckFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getGuiValidationCheckFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGuiValidationCheckFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GuiValidationCheckFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getGuiValidationCheckFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the GuiValidationCheckFilter filter value from a formatted string
   *
   * @param _value the GuiValidationCheckFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the GuiValidationCheckFilter filter field
   */
  public void setGuiValidationCheckFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setGuiValidationCheckFilterFromFormattedString");
    try {
      this.setGuiValidationCheckFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GuiValidationCheckFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setGuiValidationCheckFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGuiValidationCheckFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: UnitCreditContractId (VOUCHER_TYPES.unit_credit_contract_id)
   * @param fetch whether to fetch this field or not
   */
  public void setUnitCreditContractIdFetch (boolean fetch) {
    this.UnitCreditContractIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: UnitCreditContractId (VOUCHER_TYPES.unit_credit_contract_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getUnitCreditContractIdFetch () {
    return this.UnitCreditContractIdFetch;
  }
  /** Set the SortOrder for field: UnitCreditContractId (VOUCHER_TYPES.unit_credit_contract_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUnitCreditContractIdSortOrder (Integer value) {
    this.UnitCreditContractIdSort = value;
  }
  /** Retrieve SortOrder for field: UnitCreditContractId (VOUCHER_TYPES.unit_credit_contract_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUnitCreditContractIdSortOrder () {
    return this.UnitCreditContractIdSort;
  }
  /** Set the sort direction for field: UnitCreditContractId (VOUCHER_TYPES.unit_credit_contract_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUnitCreditContractIdSortDirection (boolean ascending) {
    this.UnitCreditContractIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UnitCreditContractId (VOUCHER_TYPES.unit_credit_contract_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUnitCreditContractIdSortDirection () {
    return this.UnitCreditContractIdSortAscending;
  }
  /** Set the field level filters for field: UnitCreditContractId (VOUCHER_TYPES.unit_credit_contract_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUnitCreditContractIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.UnitCreditContractId = value;
  }
  /** Retrieve filter for field: UnitCreditContractId (VOUCHER_TYPES.unit_credit_contract_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getUnitCreditContractIdFilter () {
    return this.UnitCreditContractId;
  }

  /**
   * Retrieves the UnitCreditContractIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UnitCreditContractIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UnitCreditContractIdFilter field
   */
  public String[] getUnitCreditContractIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitCreditContractIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUnitCreditContractIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUnitCreditContractIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UnitCreditContractIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUnitCreditContractIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UnitCreditContractIdFilter filter value from a formatted string
   *
   * @param _value the UnitCreditContractIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UnitCreditContractIdFilter filter field
   */
  public void setUnitCreditContractIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUnitCreditContractIdFilterFromFormattedString");
    try {
      this.setUnitCreditContractIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UnitCreditContractIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUnitCreditContractIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUnitCreditContractIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PaymentTransType (VOUCHER_TYPES.payment_trans_type)
   * @param fetch whether to fetch this field or not
   */
  public void setPaymentTransTypeFetch (boolean fetch) {
    this.PaymentTransTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: PaymentTransType (VOUCHER_TYPES.payment_trans_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getPaymentTransTypeFetch () {
    return this.PaymentTransTypeFetch;
  }
  /** Set the SortOrder for field: PaymentTransType (VOUCHER_TYPES.payment_trans_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPaymentTransTypeSortOrder (Integer value) {
    this.PaymentTransTypeSort = value;
  }
  /** Retrieve SortOrder for field: PaymentTransType (VOUCHER_TYPES.payment_trans_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPaymentTransTypeSortOrder () {
    return this.PaymentTransTypeSort;
  }
  /** Set the sort direction for field: PaymentTransType (VOUCHER_TYPES.payment_trans_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPaymentTransTypeSortDirection (boolean ascending) {
    this.PaymentTransTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PaymentTransType (VOUCHER_TYPES.payment_trans_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPaymentTransTypeSortDirection () {
    return this.PaymentTransTypeSortAscending;
  }
  /** Set the field level filters for field: PaymentTransType (VOUCHER_TYPES.payment_trans_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPaymentTransTypeFilter (BigIntegerFilter[] value) throws ServiceException {
    this.PaymentTransType = value;
  }
  /** Retrieve filter for field: PaymentTransType (VOUCHER_TYPES.payment_trans_type)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getPaymentTransTypeFilter () {
    return this.PaymentTransType;
  }

  /**
   * Retrieves the PaymentTransTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PaymentTransTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PaymentTransTypeFilter field
   */
  public String[] getPaymentTransTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentTransTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPaymentTransTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentTransTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PaymentTransTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPaymentTransTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PaymentTransTypeFilter filter value from a formatted string
   *
   * @param _value the PaymentTransTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PaymentTransTypeFilter filter field
   */
  public void setPaymentTransTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPaymentTransTypeFilterFromFormattedString");
    try {
      this.setPaymentTransTypeFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PaymentTransTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPaymentTransTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPaymentTransTypeFilterFromFormattedString");
  }

  public String toString() {
    return VoucherTypesObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return VoucherTypesObjectHelper.toMap(this, null);
  }
}
