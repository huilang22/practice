/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PRRServiceDataObjectFilter.java
 * Definition File: Customer/ProductRcRate.xml
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
public class PRRServiceDataObjectFilter  extends BaseFilter  implements Serializable
{
  /** raw field for: CUSTOMER_ID_EQUIP_MAP.external_id) */
  public    StringFilter[] ServiceExternalId  = null;
  protected boolean ServiceExternalIdFetch = false;
  protected boolean ServiceExternalIdSortAscending = true;
  protected boolean ServiceExternalIdCaseInsensitive = false;
  protected Integer ServiceExternalIdSort = null;
  /** raw field for: CUSTOMER_ID_EQUIP_MAP.external_id_type) */
  public    IntegerFilter[] ServiceExternalIdType  = null;
  protected boolean ServiceExternalIdTypeFetch = false;
  protected boolean ServiceExternalIdTypeSortAscending = true;
  protected Integer ServiceExternalIdTypeSort = null;
  /** raw field for: SERVICE.rate_class) */
  public    IntegerFilter[] RateClass  = null;
  protected boolean RateClassFetch = false;
  protected boolean RateClassSortAscending = true;
  protected Integer RateClassSort = null;
  /** raw field for: SERVICE.currency_code) */
  public    IntegerFilter[] CurrencyCode  = null;
  protected boolean CurrencyCodeFetch = false;
  protected boolean CurrencyCodeSortAscending = true;
  protected Integer CurrencyCodeSort = null;
  /** raw field for: SERVICE_BILLING.equip_type_code) */
  public    IntegerFilter[] EquipTypeCode  = null;
  protected boolean EquipTypeCodeFetch = false;
  protected boolean EquipTypeCodeSortAscending = true;
  protected Integer EquipTypeCodeSort = null;
  /** raw field for: SERVICE_BILLING.equip_class_code) */
  public    IntegerFilter[] EquipClassCode  = null;
  protected boolean EquipClassCodeFetch = false;
  protected boolean EquipClassCodeSortAscending = true;
  protected Integer EquipClassCodeSort = null;
  /** raw field for: SERVICE_BILLING.class_of_service_code) */
  public    IntegerFilter[] ClassOfServiceCode  = null;
  protected boolean ClassOfServiceCodeFetch = false;
  protected boolean ClassOfServiceCodeSortAscending = true;
  protected Integer ClassOfServiceCodeSort = null;
  /** raw field for: SERVICE_BILLING.pop_units) */
  public    IntegerFilter[] PopUnits  = null;
  protected boolean PopUnitsFetch = false;
  protected boolean PopUnitsSortAscending = true;
  protected Integer PopUnitsSort = null;
  private String _objName = "PRRServiceDataObjectFilter";
  /** default constructor */
  public PRRServiceDataObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public PRRServiceDataObjectFilter (PRRServiceDataObjectFilter other)
  {
    if (other == null) return;
    this.ServiceExternalId = other.ServiceExternalId;
    this.ServiceExternalIdFetch = other.ServiceExternalIdFetch;
    this.ServiceExternalIdSort = other.ServiceExternalIdSort;
    this.ServiceExternalIdCaseInsensitive = other.ServiceExternalIdCaseInsensitive;
    this.ServiceExternalIdSortAscending = other.ServiceExternalIdSortAscending;
    this.ServiceExternalIdType = other.ServiceExternalIdType;
    this.ServiceExternalIdTypeFetch = other.ServiceExternalIdTypeFetch;
    this.ServiceExternalIdTypeSort = other.ServiceExternalIdTypeSort;
    this.ServiceExternalIdTypeSortAscending = other.ServiceExternalIdTypeSortAscending;
    this.RateClass = other.RateClass;
    this.RateClassFetch = other.RateClassFetch;
    this.RateClassSort = other.RateClassSort;
    this.RateClassSortAscending = other.RateClassSortAscending;
    this.CurrencyCode = other.CurrencyCode;
    this.CurrencyCodeFetch = other.CurrencyCodeFetch;
    this.CurrencyCodeSort = other.CurrencyCodeSort;
    this.CurrencyCodeSortAscending = other.CurrencyCodeSortAscending;
    this.EquipTypeCode = other.EquipTypeCode;
    this.EquipTypeCodeFetch = other.EquipTypeCodeFetch;
    this.EquipTypeCodeSort = other.EquipTypeCodeSort;
    this.EquipTypeCodeSortAscending = other.EquipTypeCodeSortAscending;
    this.EquipClassCode = other.EquipClassCode;
    this.EquipClassCodeFetch = other.EquipClassCodeFetch;
    this.EquipClassCodeSort = other.EquipClassCodeSort;
    this.EquipClassCodeSortAscending = other.EquipClassCodeSortAscending;
    this.ClassOfServiceCode = other.ClassOfServiceCode;
    this.ClassOfServiceCodeFetch = other.ClassOfServiceCodeFetch;
    this.ClassOfServiceCodeSort = other.ClassOfServiceCodeSort;
    this.ClassOfServiceCodeSortAscending = other.ClassOfServiceCodeSortAscending;
    this.PopUnits = other.PopUnits;
    this.PopUnitsFetch = other.PopUnitsFetch;
    this.PopUnitsSort = other.PopUnitsSort;
    this.PopUnitsSortAscending = other.PopUnitsSortAscending;  }
  /** Set the field level Fetch value for field: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP.external_id)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceExternalIdFetch (boolean fetch) {
    this.ServiceExternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP.external_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceExternalIdFetch () {
    return this.ServiceExternalIdFetch;
  }
  /** Set the SortOrder for field: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP.external_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceExternalIdSortOrder (Integer value) {
    this.ServiceExternalIdSort = value;
  }
  /** Retrieve SortOrder for field: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP.external_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceExternalIdSortOrder () {
    return this.ServiceExternalIdSort;
  }
  /** Set the sort direction for field: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP.external_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceExternalIdSortDirection (boolean ascending) {
    this.ServiceExternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP.external_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceExternalIdSortDirection () {
    return this.ServiceExternalIdSortAscending;
  }
  /** Set the case insensitive for field: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP.external_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setServiceExternalIdCaseInsensitive (boolean ascending) {
    this.ServiceExternalIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP.external_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getServiceExternalIdCaseInsensitive () {
    return this.ServiceExternalIdCaseInsensitive;
  }
  /** Set the field level filters for field: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP.external_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceExternalIdFilter (StringFilter[] value) throws ServiceException {
    this.ServiceExternalId = value;
  }
  /** Retrieve filter for field: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP.external_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getServiceExternalIdFilter () {
    return this.ServiceExternalId;
  }

  /**
   * Retrieves the ServiceExternalIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServiceExternalIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceExternalIdFilter field
   */
  public String[] getServiceExternalIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceExternalIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getServiceExternalIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceExternalIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceExternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceExternalIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ServiceExternalIdFilter filter value from a formatted string
   *
   * @param _value the ServiceExternalIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ServiceExternalIdFilter filter field
   */
  public void setServiceExternalIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceExternalIdFilterFromFormattedString");
    try {
      this.setServiceExternalIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceExternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceExternalIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceExternalIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ServiceExternalIdType (CUSTOMER_ID_EQUIP_MAP.external_id_type)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceExternalIdTypeFetch (boolean fetch) {
    this.ServiceExternalIdTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceExternalIdType (CUSTOMER_ID_EQUIP_MAP.external_id_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceExternalIdTypeFetch () {
    return this.ServiceExternalIdTypeFetch;
  }
  /** Set the SortOrder for field: ServiceExternalIdType (CUSTOMER_ID_EQUIP_MAP.external_id_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceExternalIdTypeSortOrder (Integer value) {
    this.ServiceExternalIdTypeSort = value;
  }
  /** Retrieve SortOrder for field: ServiceExternalIdType (CUSTOMER_ID_EQUIP_MAP.external_id_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceExternalIdTypeSortOrder () {
    return this.ServiceExternalIdTypeSort;
  }
  /** Set the sort direction for field: ServiceExternalIdType (CUSTOMER_ID_EQUIP_MAP.external_id_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceExternalIdTypeSortDirection (boolean ascending) {
    this.ServiceExternalIdTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceExternalIdType (CUSTOMER_ID_EQUIP_MAP.external_id_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceExternalIdTypeSortDirection () {
    return this.ServiceExternalIdTypeSortAscending;
  }
  /** Set the field level filters for field: ServiceExternalIdType (CUSTOMER_ID_EQUIP_MAP.external_id_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceExternalIdTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.ServiceExternalIdType = value;
  }
  /** Retrieve filter for field: ServiceExternalIdType (CUSTOMER_ID_EQUIP_MAP.external_id_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getServiceExternalIdTypeFilter () {
    return this.ServiceExternalIdType;
  }

  /**
   * Retrieves the ServiceExternalIdTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServiceExternalIdTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceExternalIdTypeFilter field
   */
  public String[] getServiceExternalIdTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceExternalIdTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getServiceExternalIdTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceExternalIdTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceExternalIdTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ServiceExternalIdTypeFilter filter value from a formatted string
   *
   * @param _value the ServiceExternalIdTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ServiceExternalIdTypeFilter filter field
   */
  public void setServiceExternalIdTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceExternalIdTypeFilterFromFormattedString");
    try {
      this.setServiceExternalIdTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceExternalIdTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceExternalIdTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RateClass (SERVICE.rate_class)
   * @param fetch whether to fetch this field or not
   */
  public void setRateClassFetch (boolean fetch) {
    this.RateClassFetch = fetch;
  }
  /** Retrieve Fetch value for field: RateClass (SERVICE.rate_class)
   * @return boolean the Fetch value for this field
   */
  public boolean getRateClassFetch () {
    return this.RateClassFetch;
  }
  /** Set the SortOrder for field: RateClass (SERVICE.rate_class)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRateClassSortOrder (Integer value) {
    this.RateClassSort = value;
  }
  /** Retrieve SortOrder for field: RateClass (SERVICE.rate_class)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRateClassSortOrder () {
    return this.RateClassSort;
  }
  /** Set the sort direction for field: RateClass (SERVICE.rate_class)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRateClassSortDirection (boolean ascending) {
    this.RateClassSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RateClass (SERVICE.rate_class)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRateClassSortDirection () {
    return this.RateClassSortAscending;
  }
  /** Set the field level filters for field: RateClass (SERVICE.rate_class)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRateClassFilter (IntegerFilter[] value) throws ServiceException {
    this.RateClass = value;
  }
  /** Retrieve filter for field: RateClass (SERVICE.rate_class)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRateClassFilter () {
    return this.RateClass;
  }

  /**
   * Retrieves the RateClassFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RateClassFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateClassFilter field
   */
  public String[] getRateClassFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateClassFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRateClassFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateClassFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateClassFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RateClassFilter filter value from a formatted string
   *
   * @param _value the RateClassFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RateClassFilter filter field
   */
  public void setRateClassFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRateClassFilterFromFormattedString");
    try {
      this.setRateClassFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateClassFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateClassFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CurrencyCode (SERVICE.currency_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCurrencyCodeFetch (boolean fetch) {
    this.CurrencyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CurrencyCode (SERVICE.currency_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCurrencyCodeFetch () {
    return this.CurrencyCodeFetch;
  }
  /** Set the SortOrder for field: CurrencyCode (SERVICE.currency_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCurrencyCodeSortOrder (Integer value) {
    this.CurrencyCodeSort = value;
  }
  /** Retrieve SortOrder for field: CurrencyCode (SERVICE.currency_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCurrencyCodeSortOrder () {
    return this.CurrencyCodeSort;
  }
  /** Set the sort direction for field: CurrencyCode (SERVICE.currency_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCurrencyCodeSortDirection (boolean ascending) {
    this.CurrencyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CurrencyCode (SERVICE.currency_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCurrencyCodeSortDirection () {
    return this.CurrencyCodeSortAscending;
  }
  /** Set the field level filters for field: CurrencyCode (SERVICE.currency_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCurrencyCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.CurrencyCode = value;
  }
  /** Retrieve filter for field: CurrencyCode (SERVICE.currency_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCurrencyCodeFilter () {
    return this.CurrencyCode;
  }

  /**
   * Retrieves the CurrencyCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CurrencyCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CurrencyCodeFilter field
   */
  public String[] getCurrencyCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCurrencyCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCurrencyCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCurrencyCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CurrencyCodeFilter filter value from a formatted string
   *
   * @param _value the CurrencyCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CurrencyCodeFilter filter field
   */
  public void setCurrencyCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCurrencyCodeFilterFromFormattedString");
    try {
      this.setCurrencyCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCurrencyCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCurrencyCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: EquipTypeCode (SERVICE_BILLING.equip_type_code)
   * @param fetch whether to fetch this field or not
   */
  public void setEquipTypeCodeFetch (boolean fetch) {
    this.EquipTypeCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: EquipTypeCode (SERVICE_BILLING.equip_type_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getEquipTypeCodeFetch () {
    return this.EquipTypeCodeFetch;
  }
  /** Set the SortOrder for field: EquipTypeCode (SERVICE_BILLING.equip_type_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEquipTypeCodeSortOrder (Integer value) {
    this.EquipTypeCodeSort = value;
  }
  /** Retrieve SortOrder for field: EquipTypeCode (SERVICE_BILLING.equip_type_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEquipTypeCodeSortOrder () {
    return this.EquipTypeCodeSort;
  }
  /** Set the sort direction for field: EquipTypeCode (SERVICE_BILLING.equip_type_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEquipTypeCodeSortDirection (boolean ascending) {
    this.EquipTypeCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EquipTypeCode (SERVICE_BILLING.equip_type_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEquipTypeCodeSortDirection () {
    return this.EquipTypeCodeSortAscending;
  }
  /** Set the field level filters for field: EquipTypeCode (SERVICE_BILLING.equip_type_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEquipTypeCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.EquipTypeCode = value;
  }
  /** Retrieve filter for field: EquipTypeCode (SERVICE_BILLING.equip_type_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getEquipTypeCodeFilter () {
    return this.EquipTypeCode;
  }

  /**
   * Retrieves the EquipTypeCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EquipTypeCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EquipTypeCodeFilter field
   */
  public String[] getEquipTypeCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEquipTypeCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEquipTypeCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEquipTypeCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EquipTypeCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEquipTypeCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EquipTypeCodeFilter filter value from a formatted string
   *
   * @param _value the EquipTypeCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EquipTypeCodeFilter filter field
   */
  public void setEquipTypeCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEquipTypeCodeFilterFromFormattedString");
    try {
      this.setEquipTypeCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EquipTypeCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEquipTypeCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEquipTypeCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: EquipClassCode (SERVICE_BILLING.equip_class_code)
   * @param fetch whether to fetch this field or not
   */
  public void setEquipClassCodeFetch (boolean fetch) {
    this.EquipClassCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: EquipClassCode (SERVICE_BILLING.equip_class_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getEquipClassCodeFetch () {
    return this.EquipClassCodeFetch;
  }
  /** Set the SortOrder for field: EquipClassCode (SERVICE_BILLING.equip_class_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEquipClassCodeSortOrder (Integer value) {
    this.EquipClassCodeSort = value;
  }
  /** Retrieve SortOrder for field: EquipClassCode (SERVICE_BILLING.equip_class_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEquipClassCodeSortOrder () {
    return this.EquipClassCodeSort;
  }
  /** Set the sort direction for field: EquipClassCode (SERVICE_BILLING.equip_class_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEquipClassCodeSortDirection (boolean ascending) {
    this.EquipClassCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EquipClassCode (SERVICE_BILLING.equip_class_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEquipClassCodeSortDirection () {
    return this.EquipClassCodeSortAscending;
  }
  /** Set the field level filters for field: EquipClassCode (SERVICE_BILLING.equip_class_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEquipClassCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.EquipClassCode = value;
  }
  /** Retrieve filter for field: EquipClassCode (SERVICE_BILLING.equip_class_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getEquipClassCodeFilter () {
    return this.EquipClassCode;
  }

  /**
   * Retrieves the EquipClassCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EquipClassCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EquipClassCodeFilter field
   */
  public String[] getEquipClassCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEquipClassCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEquipClassCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEquipClassCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EquipClassCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEquipClassCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EquipClassCodeFilter filter value from a formatted string
   *
   * @param _value the EquipClassCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EquipClassCodeFilter filter field
   */
  public void setEquipClassCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEquipClassCodeFilterFromFormattedString");
    try {
      this.setEquipClassCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EquipClassCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEquipClassCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEquipClassCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ClassOfServiceCode (SERVICE_BILLING.class_of_service_code)
   * @param fetch whether to fetch this field or not
   */
  public void setClassOfServiceCodeFetch (boolean fetch) {
    this.ClassOfServiceCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ClassOfServiceCode (SERVICE_BILLING.class_of_service_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getClassOfServiceCodeFetch () {
    return this.ClassOfServiceCodeFetch;
  }
  /** Set the SortOrder for field: ClassOfServiceCode (SERVICE_BILLING.class_of_service_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setClassOfServiceCodeSortOrder (Integer value) {
    this.ClassOfServiceCodeSort = value;
  }
  /** Retrieve SortOrder for field: ClassOfServiceCode (SERVICE_BILLING.class_of_service_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getClassOfServiceCodeSortOrder () {
    return this.ClassOfServiceCodeSort;
  }
  /** Set the sort direction for field: ClassOfServiceCode (SERVICE_BILLING.class_of_service_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setClassOfServiceCodeSortDirection (boolean ascending) {
    this.ClassOfServiceCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ClassOfServiceCode (SERVICE_BILLING.class_of_service_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getClassOfServiceCodeSortDirection () {
    return this.ClassOfServiceCodeSortAscending;
  }
  /** Set the field level filters for field: ClassOfServiceCode (SERVICE_BILLING.class_of_service_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setClassOfServiceCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.ClassOfServiceCode = value;
  }
  /** Retrieve filter for field: ClassOfServiceCode (SERVICE_BILLING.class_of_service_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getClassOfServiceCodeFilter () {
    return this.ClassOfServiceCode;
  }

  /**
   * Retrieves the ClassOfServiceCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ClassOfServiceCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ClassOfServiceCodeFilter field
   */
  public String[] getClassOfServiceCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getClassOfServiceCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getClassOfServiceCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getClassOfServiceCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ClassOfServiceCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getClassOfServiceCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ClassOfServiceCodeFilter filter value from a formatted string
   *
   * @param _value the ClassOfServiceCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ClassOfServiceCodeFilter filter field
   */
  public void setClassOfServiceCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setClassOfServiceCodeFilterFromFormattedString");
    try {
      this.setClassOfServiceCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ClassOfServiceCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setClassOfServiceCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setClassOfServiceCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PopUnits (SERVICE_BILLING.pop_units)
   * @param fetch whether to fetch this field or not
   */
  public void setPopUnitsFetch (boolean fetch) {
    this.PopUnitsFetch = fetch;
  }
  /** Retrieve Fetch value for field: PopUnits (SERVICE_BILLING.pop_units)
   * @return boolean the Fetch value for this field
   */
  public boolean getPopUnitsFetch () {
    return this.PopUnitsFetch;
  }
  /** Set the SortOrder for field: PopUnits (SERVICE_BILLING.pop_units)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPopUnitsSortOrder (Integer value) {
    this.PopUnitsSort = value;
  }
  /** Retrieve SortOrder for field: PopUnits (SERVICE_BILLING.pop_units)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPopUnitsSortOrder () {
    return this.PopUnitsSort;
  }
  /** Set the sort direction for field: PopUnits (SERVICE_BILLING.pop_units)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPopUnitsSortDirection (boolean ascending) {
    this.PopUnitsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PopUnits (SERVICE_BILLING.pop_units)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPopUnitsSortDirection () {
    return this.PopUnitsSortAscending;
  }
  /** Set the field level filters for field: PopUnits (SERVICE_BILLING.pop_units)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPopUnitsFilter (IntegerFilter[] value) throws ServiceException {
    this.PopUnits = value;
  }
  /** Retrieve filter for field: PopUnits (SERVICE_BILLING.pop_units)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPopUnitsFilter () {
    return this.PopUnits;
  }

  /**
   * Retrieves the PopUnitsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PopUnitsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PopUnitsFilter field
   */
  public String[] getPopUnitsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPopUnitsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPopUnitsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPopUnitsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PopUnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPopUnitsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PopUnitsFilter filter value from a formatted string
   *
   * @param _value the PopUnitsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PopUnitsFilter filter field
   */
  public void setPopUnitsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPopUnitsFilterFromFormattedString");
    try {
      this.setPopUnitsFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PopUnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPopUnitsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPopUnitsFilterFromFormattedString");
  }

  public String toString() {
    return PRRServiceDataObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return PRRServiceDataObjectHelper.toMap(this, null);
  }
}
