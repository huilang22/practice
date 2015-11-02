/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PRRRcDataObjectFilter.java
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
public class PRRRcDataObjectFilter  extends BaseFilter  implements Serializable
{
  /** raw field for: PRODUCT_ELEMENTS.description_code) */
  public    IntegerFilter[] DescriptionCode  = null;
  protected boolean DescriptionCodeFetch = false;
  protected boolean DescriptionCodeSortAscending = true;
  protected Integer DescriptionCodeSort = null;
  /** raw field for: PRODUCT_ELEMENTS.rate_rate_class) */
  public    BooleanFilter[] RateRateClass  = null;
  protected boolean RateRateClassFetch = false;
  protected boolean RateRateClassSortAscending = true;
  protected Integer RateRateClassSort = null;
  /** raw field for: PRODUCT_ELEMENTS.rate_equip_type) */
  public    BooleanFilter[] RateEquipType  = null;
  protected boolean RateEquipTypeFetch = false;
  protected boolean RateEquipTypeSortAscending = true;
  protected Integer RateEquipTypeSort = null;
  /** raw field for: PRODUCT_ELEMENTS.rate_equip_class) */
  public    BooleanFilter[] RateEquipClass  = null;
  protected boolean RateEquipClassFetch = false;
  protected boolean RateEquipClassSortAscending = true;
  protected Integer RateEquipClassSort = null;
  /** raw field for: PRODUCT_ELEMENTS.rate_class_of_service) */
  public    BooleanFilter[] RateClassOfService  = null;
  protected boolean RateClassOfServiceFetch = false;
  protected boolean RateClassOfServiceSortAscending = true;
  protected Integer RateClassOfServiceSort = null;
  /** raw field for: PRODUCT_ELEMENTS.rate_component_id) */
  public    BooleanFilter[] RateComponentId  = null;
  protected boolean RateComponentIdFetch = false;
  protected boolean RateComponentIdSortAscending = true;
  protected Integer RateComponentIdSort = null;
  /** raw field for: PRODUCT_ELEMENTS.rate_jurisdiction) */
  public    BooleanFilter[] RateJurisdiction  = null;
  protected boolean RateJurisdictionFetch = false;
  protected boolean RateJurisdictionSortAscending = true;
  protected Integer RateJurisdictionSort = null;
  /** raw field for: PRODUCT_ELEMENTS.rate_units) */
  public    BooleanFilter[] RateUnits  = null;
  protected boolean RateUnitsFetch = false;
  protected boolean RateUnitsSortAscending = true;
  protected Integer RateUnitsSort = null;
  /** raw field for: PRODUCT_ELEMENTS.currency_code) */
  public    IntegerFilter[] CurrencyCode  = null;
  protected boolean CurrencyCodeFetch = false;
  protected boolean CurrencyCodeSortAscending = true;
  protected Integer CurrencyCodeSort = null;
  /** raw field for: PRODUCT_ELEMENTS.rate_currency_location) */
  public    IntegerFilter[] RateCurrencyLocation  = null;
  protected boolean RateCurrencyLocationFetch = false;
  protected boolean RateCurrencyLocationSortAscending = true;
  protected Integer RateCurrencyLocationSort = null;
  /** raw field for: PRODUCT_ELEMENTS.bill_in_arrears) */
  public    BooleanFilter[] BillInArrears  = null;
  protected boolean BillInArrearsFetch = false;
  protected boolean BillInArrearsSortAscending = true;
  protected Integer BillInArrearsSort = null;
  /** raw field for: PRODUCT_RATE_KEY.units_type) */
  public    IntegerFilter[] UnitsType  = null;
  protected boolean UnitsTypeFetch = false;
  protected boolean UnitsTypeSortAscending = true;
  protected Integer UnitsTypeSort = null;
  /** raw field for: PRODUCT_RATE_KEY.units) */
  public    IntegerFilter[] Units  = null;
  protected boolean UnitsFetch = false;
  protected boolean UnitsSortAscending = true;
  protected Integer UnitsSort = null;
  /** raw field for: PRODUCT.component_id) */
  public    IntegerFilter[] ComponentId  = null;
  protected boolean ComponentIdFetch = false;
  protected boolean ComponentIdSortAscending = true;
  protected Integer ComponentIdSort = null;
  /** raw field for: PRODUCT_CHARGE_MAP.bill_period) */
  public    StringFilter[] BillPeriod  = null;
  protected boolean BillPeriodFetch = false;
  protected boolean BillPeriodSortAscending = true;
  protected boolean BillPeriodCaseInsensitive = false;
  protected Integer BillPeriodSort = null;
  /** raw field for: PRODUCT_CHARGE_MAP.billed_thru_dt) */
  public    DateFilter[] BilledThruDt  = null;
  protected boolean BilledThruDtFetch = false;
  protected boolean BilledThruDtSortAscending = true;
  protected Integer BilledThruDtSort = null;
  /** raw field for: PRODUCT_CHARGE_MAP.active_dt) */
  public    DateFilter[] ActiveDt  = null;
  protected boolean ActiveDtFetch = false;
  protected boolean ActiveDtSortAscending = true;
  protected Integer ActiveDtSort = null;
  /** raw field for: PRODUCT_CHARGE_MAP.termination_code) */
  public    IntegerFilter[] TerminationCode  = null;
  protected boolean TerminationCodeFetch = false;
  protected boolean TerminationCodeSortAscending = true;
  protected Integer TerminationCodeSort = null;
  /** raw field for: PRODUCT_CHARGE_MAP.in_arrears_override) */
  public    IntegerFilter[] InArrearsOverride  = null;
  protected boolean InArrearsOverrideFetch = false;
  protected boolean InArrearsOverrideSortAscending = true;
  protected Integer InArrearsOverrideSort = null;
  private String _objName = "PRRRcDataObjectFilter";
  /** default constructor */
  public PRRRcDataObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public PRRRcDataObjectFilter (PRRRcDataObjectFilter other)
  {
    if (other == null) return;
    this.DescriptionCode = other.DescriptionCode;
    this.DescriptionCodeFetch = other.DescriptionCodeFetch;
    this.DescriptionCodeSort = other.DescriptionCodeSort;
    this.DescriptionCodeSortAscending = other.DescriptionCodeSortAscending;
    this.RateRateClass = other.RateRateClass;
    this.RateRateClassFetch = other.RateRateClassFetch;
    this.RateRateClassSort = other.RateRateClassSort;
    this.RateRateClassSortAscending = other.RateRateClassSortAscending;
    this.RateEquipType = other.RateEquipType;
    this.RateEquipTypeFetch = other.RateEquipTypeFetch;
    this.RateEquipTypeSort = other.RateEquipTypeSort;
    this.RateEquipTypeSortAscending = other.RateEquipTypeSortAscending;
    this.RateEquipClass = other.RateEquipClass;
    this.RateEquipClassFetch = other.RateEquipClassFetch;
    this.RateEquipClassSort = other.RateEquipClassSort;
    this.RateEquipClassSortAscending = other.RateEquipClassSortAscending;
    this.RateClassOfService = other.RateClassOfService;
    this.RateClassOfServiceFetch = other.RateClassOfServiceFetch;
    this.RateClassOfServiceSort = other.RateClassOfServiceSort;
    this.RateClassOfServiceSortAscending = other.RateClassOfServiceSortAscending;
    this.RateComponentId = other.RateComponentId;
    this.RateComponentIdFetch = other.RateComponentIdFetch;
    this.RateComponentIdSort = other.RateComponentIdSort;
    this.RateComponentIdSortAscending = other.RateComponentIdSortAscending;
    this.RateJurisdiction = other.RateJurisdiction;
    this.RateJurisdictionFetch = other.RateJurisdictionFetch;
    this.RateJurisdictionSort = other.RateJurisdictionSort;
    this.RateJurisdictionSortAscending = other.RateJurisdictionSortAscending;
    this.RateUnits = other.RateUnits;
    this.RateUnitsFetch = other.RateUnitsFetch;
    this.RateUnitsSort = other.RateUnitsSort;
    this.RateUnitsSortAscending = other.RateUnitsSortAscending;
    this.CurrencyCode = other.CurrencyCode;
    this.CurrencyCodeFetch = other.CurrencyCodeFetch;
    this.CurrencyCodeSort = other.CurrencyCodeSort;
    this.CurrencyCodeSortAscending = other.CurrencyCodeSortAscending;
    this.RateCurrencyLocation = other.RateCurrencyLocation;
    this.RateCurrencyLocationFetch = other.RateCurrencyLocationFetch;
    this.RateCurrencyLocationSort = other.RateCurrencyLocationSort;
    this.RateCurrencyLocationSortAscending = other.RateCurrencyLocationSortAscending;
    this.BillInArrears = other.BillInArrears;
    this.BillInArrearsFetch = other.BillInArrearsFetch;
    this.BillInArrearsSort = other.BillInArrearsSort;
    this.BillInArrearsSortAscending = other.BillInArrearsSortAscending;
    this.UnitsType = other.UnitsType;
    this.UnitsTypeFetch = other.UnitsTypeFetch;
    this.UnitsTypeSort = other.UnitsTypeSort;
    this.UnitsTypeSortAscending = other.UnitsTypeSortAscending;
    this.Units = other.Units;
    this.UnitsFetch = other.UnitsFetch;
    this.UnitsSort = other.UnitsSort;
    this.UnitsSortAscending = other.UnitsSortAscending;
    this.ComponentId = other.ComponentId;
    this.ComponentIdFetch = other.ComponentIdFetch;
    this.ComponentIdSort = other.ComponentIdSort;
    this.ComponentIdSortAscending = other.ComponentIdSortAscending;
    this.BillPeriod = other.BillPeriod;
    this.BillPeriodFetch = other.BillPeriodFetch;
    this.BillPeriodSort = other.BillPeriodSort;
    this.BillPeriodCaseInsensitive = other.BillPeriodCaseInsensitive;
    this.BillPeriodSortAscending = other.BillPeriodSortAscending;
    this.BilledThruDt = other.BilledThruDt;
    this.BilledThruDtFetch = other.BilledThruDtFetch;
    this.BilledThruDtSort = other.BilledThruDtSort;
    this.BilledThruDtSortAscending = other.BilledThruDtSortAscending;
    this.ActiveDt = other.ActiveDt;
    this.ActiveDtFetch = other.ActiveDtFetch;
    this.ActiveDtSort = other.ActiveDtSort;
    this.ActiveDtSortAscending = other.ActiveDtSortAscending;
    this.TerminationCode = other.TerminationCode;
    this.TerminationCodeFetch = other.TerminationCodeFetch;
    this.TerminationCodeSort = other.TerminationCodeSort;
    this.TerminationCodeSortAscending = other.TerminationCodeSortAscending;
    this.InArrearsOverride = other.InArrearsOverride;
    this.InArrearsOverrideFetch = other.InArrearsOverrideFetch;
    this.InArrearsOverrideSort = other.InArrearsOverrideSort;
    this.InArrearsOverrideSortAscending = other.InArrearsOverrideSortAscending;  }
  /** Set the field level Fetch value for field: DescriptionCode (PRODUCT_ELEMENTS.description_code)
   * @param fetch whether to fetch this field or not
   */
  public void setDescriptionCodeFetch (boolean fetch) {
    this.DescriptionCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: DescriptionCode (PRODUCT_ELEMENTS.description_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getDescriptionCodeFetch () {
    return this.DescriptionCodeFetch;
  }
  /** Set the SortOrder for field: DescriptionCode (PRODUCT_ELEMENTS.description_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDescriptionCodeSortOrder (Integer value) {
    this.DescriptionCodeSort = value;
  }
  /** Retrieve SortOrder for field: DescriptionCode (PRODUCT_ELEMENTS.description_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDescriptionCodeSortOrder () {
    return this.DescriptionCodeSort;
  }
  /** Set the sort direction for field: DescriptionCode (PRODUCT_ELEMENTS.description_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDescriptionCodeSortDirection (boolean ascending) {
    this.DescriptionCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DescriptionCode (PRODUCT_ELEMENTS.description_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDescriptionCodeSortDirection () {
    return this.DescriptionCodeSortAscending;
  }
  /** Set the field level filters for field: DescriptionCode (PRODUCT_ELEMENTS.description_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDescriptionCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.DescriptionCode = value;
  }
  /** Retrieve filter for field: DescriptionCode (PRODUCT_ELEMENTS.description_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDescriptionCodeFilter () {
    return this.DescriptionCode;
  }

  /**
   * Retrieves the DescriptionCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DescriptionCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DescriptionCodeFilter field
   */
  public String[] getDescriptionCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDescriptionCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDescriptionCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDescriptionCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DescriptionCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDescriptionCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DescriptionCodeFilter filter value from a formatted string
   *
   * @param _value the DescriptionCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DescriptionCodeFilter filter field
   */
  public void setDescriptionCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDescriptionCodeFilterFromFormattedString");
    try {
      this.setDescriptionCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DescriptionCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDescriptionCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDescriptionCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RateRateClass (PRODUCT_ELEMENTS.rate_rate_class)
   * @param fetch whether to fetch this field or not
   */
  public void setRateRateClassFetch (boolean fetch) {
    this.RateRateClassFetch = fetch;
  }
  /** Retrieve Fetch value for field: RateRateClass (PRODUCT_ELEMENTS.rate_rate_class)
   * @return boolean the Fetch value for this field
   */
  public boolean getRateRateClassFetch () {
    return this.RateRateClassFetch;
  }
  /** Set the SortOrder for field: RateRateClass (PRODUCT_ELEMENTS.rate_rate_class)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRateRateClassSortOrder (Integer value) {
    this.RateRateClassSort = value;
  }
  /** Retrieve SortOrder for field: RateRateClass (PRODUCT_ELEMENTS.rate_rate_class)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRateRateClassSortOrder () {
    return this.RateRateClassSort;
  }
  /** Set the sort direction for field: RateRateClass (PRODUCT_ELEMENTS.rate_rate_class)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRateRateClassSortDirection (boolean ascending) {
    this.RateRateClassSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RateRateClass (PRODUCT_ELEMENTS.rate_rate_class)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRateRateClassSortDirection () {
    return this.RateRateClassSortAscending;
  }
  /** Set the field level filters for field: RateRateClass (PRODUCT_ELEMENTS.rate_rate_class)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRateRateClassFilter (BooleanFilter[] value) throws ServiceException {
    this.RateRateClass = value;
  }
  /** Retrieve filter for field: RateRateClass (PRODUCT_ELEMENTS.rate_rate_class)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getRateRateClassFilter () {
    return this.RateRateClass;
  }

  /**
   * Retrieves the RateRateClassFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RateRateClassFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateRateClassFilter field
   */
  public String[] getRateRateClassFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateRateClassFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRateRateClassFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateRateClassFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateRateClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateRateClassFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RateRateClassFilter filter value from a formatted string
   *
   * @param _value the RateRateClassFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RateRateClassFilter filter field
   */
  public void setRateRateClassFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRateRateClassFilterFromFormattedString");
    try {
      this.setRateRateClassFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateRateClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateRateClassFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateRateClassFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RateEquipType (PRODUCT_ELEMENTS.rate_equip_type)
   * @param fetch whether to fetch this field or not
   */
  public void setRateEquipTypeFetch (boolean fetch) {
    this.RateEquipTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: RateEquipType (PRODUCT_ELEMENTS.rate_equip_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getRateEquipTypeFetch () {
    return this.RateEquipTypeFetch;
  }
  /** Set the SortOrder for field: RateEquipType (PRODUCT_ELEMENTS.rate_equip_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRateEquipTypeSortOrder (Integer value) {
    this.RateEquipTypeSort = value;
  }
  /** Retrieve SortOrder for field: RateEquipType (PRODUCT_ELEMENTS.rate_equip_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRateEquipTypeSortOrder () {
    return this.RateEquipTypeSort;
  }
  /** Set the sort direction for field: RateEquipType (PRODUCT_ELEMENTS.rate_equip_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRateEquipTypeSortDirection (boolean ascending) {
    this.RateEquipTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RateEquipType (PRODUCT_ELEMENTS.rate_equip_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRateEquipTypeSortDirection () {
    return this.RateEquipTypeSortAscending;
  }
  /** Set the field level filters for field: RateEquipType (PRODUCT_ELEMENTS.rate_equip_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRateEquipTypeFilter (BooleanFilter[] value) throws ServiceException {
    this.RateEquipType = value;
  }
  /** Retrieve filter for field: RateEquipType (PRODUCT_ELEMENTS.rate_equip_type)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getRateEquipTypeFilter () {
    return this.RateEquipType;
  }

  /**
   * Retrieves the RateEquipTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RateEquipTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateEquipTypeFilter field
   */
  public String[] getRateEquipTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateEquipTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRateEquipTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateEquipTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateEquipTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateEquipTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RateEquipTypeFilter filter value from a formatted string
   *
   * @param _value the RateEquipTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RateEquipTypeFilter filter field
   */
  public void setRateEquipTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRateEquipTypeFilterFromFormattedString");
    try {
      this.setRateEquipTypeFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateEquipTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateEquipTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateEquipTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RateEquipClass (PRODUCT_ELEMENTS.rate_equip_class)
   * @param fetch whether to fetch this field or not
   */
  public void setRateEquipClassFetch (boolean fetch) {
    this.RateEquipClassFetch = fetch;
  }
  /** Retrieve Fetch value for field: RateEquipClass (PRODUCT_ELEMENTS.rate_equip_class)
   * @return boolean the Fetch value for this field
   */
  public boolean getRateEquipClassFetch () {
    return this.RateEquipClassFetch;
  }
  /** Set the SortOrder for field: RateEquipClass (PRODUCT_ELEMENTS.rate_equip_class)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRateEquipClassSortOrder (Integer value) {
    this.RateEquipClassSort = value;
  }
  /** Retrieve SortOrder for field: RateEquipClass (PRODUCT_ELEMENTS.rate_equip_class)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRateEquipClassSortOrder () {
    return this.RateEquipClassSort;
  }
  /** Set the sort direction for field: RateEquipClass (PRODUCT_ELEMENTS.rate_equip_class)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRateEquipClassSortDirection (boolean ascending) {
    this.RateEquipClassSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RateEquipClass (PRODUCT_ELEMENTS.rate_equip_class)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRateEquipClassSortDirection () {
    return this.RateEquipClassSortAscending;
  }
  /** Set the field level filters for field: RateEquipClass (PRODUCT_ELEMENTS.rate_equip_class)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRateEquipClassFilter (BooleanFilter[] value) throws ServiceException {
    this.RateEquipClass = value;
  }
  /** Retrieve filter for field: RateEquipClass (PRODUCT_ELEMENTS.rate_equip_class)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getRateEquipClassFilter () {
    return this.RateEquipClass;
  }

  /**
   * Retrieves the RateEquipClassFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RateEquipClassFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateEquipClassFilter field
   */
  public String[] getRateEquipClassFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateEquipClassFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRateEquipClassFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateEquipClassFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateEquipClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateEquipClassFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RateEquipClassFilter filter value from a formatted string
   *
   * @param _value the RateEquipClassFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RateEquipClassFilter filter field
   */
  public void setRateEquipClassFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRateEquipClassFilterFromFormattedString");
    try {
      this.setRateEquipClassFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateEquipClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateEquipClassFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateEquipClassFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RateClassOfService (PRODUCT_ELEMENTS.rate_class_of_service)
   * @param fetch whether to fetch this field or not
   */
  public void setRateClassOfServiceFetch (boolean fetch) {
    this.RateClassOfServiceFetch = fetch;
  }
  /** Retrieve Fetch value for field: RateClassOfService (PRODUCT_ELEMENTS.rate_class_of_service)
   * @return boolean the Fetch value for this field
   */
  public boolean getRateClassOfServiceFetch () {
    return this.RateClassOfServiceFetch;
  }
  /** Set the SortOrder for field: RateClassOfService (PRODUCT_ELEMENTS.rate_class_of_service)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRateClassOfServiceSortOrder (Integer value) {
    this.RateClassOfServiceSort = value;
  }
  /** Retrieve SortOrder for field: RateClassOfService (PRODUCT_ELEMENTS.rate_class_of_service)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRateClassOfServiceSortOrder () {
    return this.RateClassOfServiceSort;
  }
  /** Set the sort direction for field: RateClassOfService (PRODUCT_ELEMENTS.rate_class_of_service)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRateClassOfServiceSortDirection (boolean ascending) {
    this.RateClassOfServiceSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RateClassOfService (PRODUCT_ELEMENTS.rate_class_of_service)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRateClassOfServiceSortDirection () {
    return this.RateClassOfServiceSortAscending;
  }
  /** Set the field level filters for field: RateClassOfService (PRODUCT_ELEMENTS.rate_class_of_service)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRateClassOfServiceFilter (BooleanFilter[] value) throws ServiceException {
    this.RateClassOfService = value;
  }
  /** Retrieve filter for field: RateClassOfService (PRODUCT_ELEMENTS.rate_class_of_service)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getRateClassOfServiceFilter () {
    return this.RateClassOfService;
  }

  /**
   * Retrieves the RateClassOfServiceFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RateClassOfServiceFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateClassOfServiceFilter field
   */
  public String[] getRateClassOfServiceFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateClassOfServiceFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRateClassOfServiceFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateClassOfServiceFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateClassOfServiceFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateClassOfServiceFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RateClassOfServiceFilter filter value from a formatted string
   *
   * @param _value the RateClassOfServiceFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RateClassOfServiceFilter filter field
   */
  public void setRateClassOfServiceFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRateClassOfServiceFilterFromFormattedString");
    try {
      this.setRateClassOfServiceFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateClassOfServiceFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateClassOfServiceFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateClassOfServiceFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RateComponentId (PRODUCT_ELEMENTS.rate_component_id)
   * @param fetch whether to fetch this field or not
   */
  public void setRateComponentIdFetch (boolean fetch) {
    this.RateComponentIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: RateComponentId (PRODUCT_ELEMENTS.rate_component_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getRateComponentIdFetch () {
    return this.RateComponentIdFetch;
  }
  /** Set the SortOrder for field: RateComponentId (PRODUCT_ELEMENTS.rate_component_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRateComponentIdSortOrder (Integer value) {
    this.RateComponentIdSort = value;
  }
  /** Retrieve SortOrder for field: RateComponentId (PRODUCT_ELEMENTS.rate_component_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRateComponentIdSortOrder () {
    return this.RateComponentIdSort;
  }
  /** Set the sort direction for field: RateComponentId (PRODUCT_ELEMENTS.rate_component_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRateComponentIdSortDirection (boolean ascending) {
    this.RateComponentIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RateComponentId (PRODUCT_ELEMENTS.rate_component_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRateComponentIdSortDirection () {
    return this.RateComponentIdSortAscending;
  }
  /** Set the field level filters for field: RateComponentId (PRODUCT_ELEMENTS.rate_component_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRateComponentIdFilter (BooleanFilter[] value) throws ServiceException {
    this.RateComponentId = value;
  }
  /** Retrieve filter for field: RateComponentId (PRODUCT_ELEMENTS.rate_component_id)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getRateComponentIdFilter () {
    return this.RateComponentId;
  }

  /**
   * Retrieves the RateComponentIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RateComponentIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateComponentIdFilter field
   */
  public String[] getRateComponentIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateComponentIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRateComponentIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateComponentIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateComponentIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateComponentIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RateComponentIdFilter filter value from a formatted string
   *
   * @param _value the RateComponentIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RateComponentIdFilter filter field
   */
  public void setRateComponentIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRateComponentIdFilterFromFormattedString");
    try {
      this.setRateComponentIdFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateComponentIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateComponentIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateComponentIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RateJurisdiction (PRODUCT_ELEMENTS.rate_jurisdiction)
   * @param fetch whether to fetch this field or not
   */
  public void setRateJurisdictionFetch (boolean fetch) {
    this.RateJurisdictionFetch = fetch;
  }
  /** Retrieve Fetch value for field: RateJurisdiction (PRODUCT_ELEMENTS.rate_jurisdiction)
   * @return boolean the Fetch value for this field
   */
  public boolean getRateJurisdictionFetch () {
    return this.RateJurisdictionFetch;
  }
  /** Set the SortOrder for field: RateJurisdiction (PRODUCT_ELEMENTS.rate_jurisdiction)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRateJurisdictionSortOrder (Integer value) {
    this.RateJurisdictionSort = value;
  }
  /** Retrieve SortOrder for field: RateJurisdiction (PRODUCT_ELEMENTS.rate_jurisdiction)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRateJurisdictionSortOrder () {
    return this.RateJurisdictionSort;
  }
  /** Set the sort direction for field: RateJurisdiction (PRODUCT_ELEMENTS.rate_jurisdiction)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRateJurisdictionSortDirection (boolean ascending) {
    this.RateJurisdictionSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RateJurisdiction (PRODUCT_ELEMENTS.rate_jurisdiction)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRateJurisdictionSortDirection () {
    return this.RateJurisdictionSortAscending;
  }
  /** Set the field level filters for field: RateJurisdiction (PRODUCT_ELEMENTS.rate_jurisdiction)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRateJurisdictionFilter (BooleanFilter[] value) throws ServiceException {
    this.RateJurisdiction = value;
  }
  /** Retrieve filter for field: RateJurisdiction (PRODUCT_ELEMENTS.rate_jurisdiction)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getRateJurisdictionFilter () {
    return this.RateJurisdiction;
  }

  /**
   * Retrieves the RateJurisdictionFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RateJurisdictionFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateJurisdictionFilter field
   */
  public String[] getRateJurisdictionFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateJurisdictionFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRateJurisdictionFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateJurisdictionFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateJurisdictionFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateJurisdictionFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RateJurisdictionFilter filter value from a formatted string
   *
   * @param _value the RateJurisdictionFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RateJurisdictionFilter filter field
   */
  public void setRateJurisdictionFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRateJurisdictionFilterFromFormattedString");
    try {
      this.setRateJurisdictionFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateJurisdictionFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateJurisdictionFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateJurisdictionFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RateUnits (PRODUCT_ELEMENTS.rate_units)
   * @param fetch whether to fetch this field or not
   */
  public void setRateUnitsFetch (boolean fetch) {
    this.RateUnitsFetch = fetch;
  }
  /** Retrieve Fetch value for field: RateUnits (PRODUCT_ELEMENTS.rate_units)
   * @return boolean the Fetch value for this field
   */
  public boolean getRateUnitsFetch () {
    return this.RateUnitsFetch;
  }
  /** Set the SortOrder for field: RateUnits (PRODUCT_ELEMENTS.rate_units)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRateUnitsSortOrder (Integer value) {
    this.RateUnitsSort = value;
  }
  /** Retrieve SortOrder for field: RateUnits (PRODUCT_ELEMENTS.rate_units)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRateUnitsSortOrder () {
    return this.RateUnitsSort;
  }
  /** Set the sort direction for field: RateUnits (PRODUCT_ELEMENTS.rate_units)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRateUnitsSortDirection (boolean ascending) {
    this.RateUnitsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RateUnits (PRODUCT_ELEMENTS.rate_units)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRateUnitsSortDirection () {
    return this.RateUnitsSortAscending;
  }
  /** Set the field level filters for field: RateUnits (PRODUCT_ELEMENTS.rate_units)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRateUnitsFilter (BooleanFilter[] value) throws ServiceException {
    this.RateUnits = value;
  }
  /** Retrieve filter for field: RateUnits (PRODUCT_ELEMENTS.rate_units)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getRateUnitsFilter () {
    return this.RateUnits;
  }

  /**
   * Retrieves the RateUnitsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RateUnitsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateUnitsFilter field
   */
  public String[] getRateUnitsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateUnitsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRateUnitsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateUnitsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateUnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateUnitsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RateUnitsFilter filter value from a formatted string
   *
   * @param _value the RateUnitsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RateUnitsFilter filter field
   */
  public void setRateUnitsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRateUnitsFilterFromFormattedString");
    try {
      this.setRateUnitsFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateUnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateUnitsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateUnitsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CurrencyCode (PRODUCT_ELEMENTS.currency_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCurrencyCodeFetch (boolean fetch) {
    this.CurrencyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CurrencyCode (PRODUCT_ELEMENTS.currency_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCurrencyCodeFetch () {
    return this.CurrencyCodeFetch;
  }
  /** Set the SortOrder for field: CurrencyCode (PRODUCT_ELEMENTS.currency_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCurrencyCodeSortOrder (Integer value) {
    this.CurrencyCodeSort = value;
  }
  /** Retrieve SortOrder for field: CurrencyCode (PRODUCT_ELEMENTS.currency_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCurrencyCodeSortOrder () {
    return this.CurrencyCodeSort;
  }
  /** Set the sort direction for field: CurrencyCode (PRODUCT_ELEMENTS.currency_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCurrencyCodeSortDirection (boolean ascending) {
    this.CurrencyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CurrencyCode (PRODUCT_ELEMENTS.currency_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCurrencyCodeSortDirection () {
    return this.CurrencyCodeSortAscending;
  }
  /** Set the field level filters for field: CurrencyCode (PRODUCT_ELEMENTS.currency_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCurrencyCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.CurrencyCode = value;
  }
  /** Retrieve filter for field: CurrencyCode (PRODUCT_ELEMENTS.currency_code)
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

  /**
   * Retrieves the display value for the enumerated CurrencyCodeFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the CurrencyCodeFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CurrencyCodeFilter filter field
   */
  public String[] getCurrencyCodeFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyCodeFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getCurrencyCodeFilter(), "Currency", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCurrencyCodeFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCurrencyCodeFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated CurrencyCodeFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the CurrencyCodeFilter filter field
   */
  public void setCurrencyCodeFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCurrencyCodeFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setCurrencyCodeFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "CurrencyCode", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCurrencyCodeFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCurrencyCodeFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: RateCurrencyLocation (PRODUCT_ELEMENTS.rate_currency_location)
   * @param fetch whether to fetch this field or not
   */
  public void setRateCurrencyLocationFetch (boolean fetch) {
    this.RateCurrencyLocationFetch = fetch;
  }
  /** Retrieve Fetch value for field: RateCurrencyLocation (PRODUCT_ELEMENTS.rate_currency_location)
   * @return boolean the Fetch value for this field
   */
  public boolean getRateCurrencyLocationFetch () {
    return this.RateCurrencyLocationFetch;
  }
  /** Set the SortOrder for field: RateCurrencyLocation (PRODUCT_ELEMENTS.rate_currency_location)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRateCurrencyLocationSortOrder (Integer value) {
    this.RateCurrencyLocationSort = value;
  }
  /** Retrieve SortOrder for field: RateCurrencyLocation (PRODUCT_ELEMENTS.rate_currency_location)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRateCurrencyLocationSortOrder () {
    return this.RateCurrencyLocationSort;
  }
  /** Set the sort direction for field: RateCurrencyLocation (PRODUCT_ELEMENTS.rate_currency_location)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRateCurrencyLocationSortDirection (boolean ascending) {
    this.RateCurrencyLocationSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RateCurrencyLocation (PRODUCT_ELEMENTS.rate_currency_location)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRateCurrencyLocationSortDirection () {
    return this.RateCurrencyLocationSortAscending;
  }
  /** Set the field level filters for field: RateCurrencyLocation (PRODUCT_ELEMENTS.rate_currency_location)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRateCurrencyLocationFilter (IntegerFilter[] value) throws ServiceException {
    this.RateCurrencyLocation = value;
  }
  /** Retrieve filter for field: RateCurrencyLocation (PRODUCT_ELEMENTS.rate_currency_location)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRateCurrencyLocationFilter () {
    return this.RateCurrencyLocation;
  }

  /**
   * Retrieves the RateCurrencyLocationFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RateCurrencyLocationFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateCurrencyLocationFilter field
   */
  public String[] getRateCurrencyLocationFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateCurrencyLocationFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRateCurrencyLocationFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateCurrencyLocationFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateCurrencyLocationFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateCurrencyLocationFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RateCurrencyLocationFilter filter value from a formatted string
   *
   * @param _value the RateCurrencyLocationFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RateCurrencyLocationFilter filter field
   */
  public void setRateCurrencyLocationFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRateCurrencyLocationFilterFromFormattedString");
    try {
      this.setRateCurrencyLocationFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateCurrencyLocationFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateCurrencyLocationFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateCurrencyLocationFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillInArrears (PRODUCT_ELEMENTS.bill_in_arrears)
   * @param fetch whether to fetch this field or not
   */
  public void setBillInArrearsFetch (boolean fetch) {
    this.BillInArrearsFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillInArrears (PRODUCT_ELEMENTS.bill_in_arrears)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillInArrearsFetch () {
    return this.BillInArrearsFetch;
  }
  /** Set the SortOrder for field: BillInArrears (PRODUCT_ELEMENTS.bill_in_arrears)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillInArrearsSortOrder (Integer value) {
    this.BillInArrearsSort = value;
  }
  /** Retrieve SortOrder for field: BillInArrears (PRODUCT_ELEMENTS.bill_in_arrears)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillInArrearsSortOrder () {
    return this.BillInArrearsSort;
  }
  /** Set the sort direction for field: BillInArrears (PRODUCT_ELEMENTS.bill_in_arrears)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillInArrearsSortDirection (boolean ascending) {
    this.BillInArrearsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillInArrears (PRODUCT_ELEMENTS.bill_in_arrears)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillInArrearsSortDirection () {
    return this.BillInArrearsSortAscending;
  }
  /** Set the field level filters for field: BillInArrears (PRODUCT_ELEMENTS.bill_in_arrears)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillInArrearsFilter (BooleanFilter[] value) throws ServiceException {
    this.BillInArrears = value;
  }
  /** Retrieve filter for field: BillInArrears (PRODUCT_ELEMENTS.bill_in_arrears)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getBillInArrearsFilter () {
    return this.BillInArrears;
  }

  /**
   * Retrieves the BillInArrearsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillInArrearsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillInArrearsFilter field
   */
  public String[] getBillInArrearsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillInArrearsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillInArrearsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillInArrearsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillInArrearsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillInArrearsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillInArrearsFilter filter value from a formatted string
   *
   * @param _value the BillInArrearsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillInArrearsFilter filter field
   */
  public void setBillInArrearsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillInArrearsFilterFromFormattedString");
    try {
      this.setBillInArrearsFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillInArrearsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillInArrearsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillInArrearsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: UnitsType (PRODUCT_RATE_KEY.units_type)
   * @param fetch whether to fetch this field or not
   */
  public void setUnitsTypeFetch (boolean fetch) {
    this.UnitsTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: UnitsType (PRODUCT_RATE_KEY.units_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getUnitsTypeFetch () {
    return this.UnitsTypeFetch;
  }
  /** Set the SortOrder for field: UnitsType (PRODUCT_RATE_KEY.units_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUnitsTypeSortOrder (Integer value) {
    this.UnitsTypeSort = value;
  }
  /** Retrieve SortOrder for field: UnitsType (PRODUCT_RATE_KEY.units_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUnitsTypeSortOrder () {
    return this.UnitsTypeSort;
  }
  /** Set the sort direction for field: UnitsType (PRODUCT_RATE_KEY.units_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUnitsTypeSortDirection (boolean ascending) {
    this.UnitsTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UnitsType (PRODUCT_RATE_KEY.units_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUnitsTypeSortDirection () {
    return this.UnitsTypeSortAscending;
  }
  /** Set the field level filters for field: UnitsType (PRODUCT_RATE_KEY.units_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUnitsTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.UnitsType = value;
  }
  /** Retrieve filter for field: UnitsType (PRODUCT_RATE_KEY.units_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getUnitsTypeFilter () {
    return this.UnitsType;
  }

  /**
   * Retrieves the UnitsTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UnitsTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UnitsTypeFilter field
   */
  public String[] getUnitsTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitsTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUnitsTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUnitsTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UnitsTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUnitsTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UnitsTypeFilter filter value from a formatted string
   *
   * @param _value the UnitsTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UnitsTypeFilter filter field
   */
  public void setUnitsTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUnitsTypeFilterFromFormattedString");
    try {
      this.setUnitsTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UnitsTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUnitsTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUnitsTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Units (PRODUCT_RATE_KEY.units)
   * @param fetch whether to fetch this field or not
   */
  public void setUnitsFetch (boolean fetch) {
    this.UnitsFetch = fetch;
  }
  /** Retrieve Fetch value for field: Units (PRODUCT_RATE_KEY.units)
   * @return boolean the Fetch value for this field
   */
  public boolean getUnitsFetch () {
    return this.UnitsFetch;
  }
  /** Set the SortOrder for field: Units (PRODUCT_RATE_KEY.units)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUnitsSortOrder (Integer value) {
    this.UnitsSort = value;
  }
  /** Retrieve SortOrder for field: Units (PRODUCT_RATE_KEY.units)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUnitsSortOrder () {
    return this.UnitsSort;
  }
  /** Set the sort direction for field: Units (PRODUCT_RATE_KEY.units)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUnitsSortDirection (boolean ascending) {
    this.UnitsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Units (PRODUCT_RATE_KEY.units)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUnitsSortDirection () {
    return this.UnitsSortAscending;
  }
  /** Set the field level filters for field: Units (PRODUCT_RATE_KEY.units)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUnitsFilter (IntegerFilter[] value) throws ServiceException {
    this.Units = value;
  }
  /** Retrieve filter for field: Units (PRODUCT_RATE_KEY.units)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getUnitsFilter () {
    return this.Units;
  }

  /**
   * Retrieves the UnitsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UnitsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UnitsFilter field
   */
  public String[] getUnitsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUnitsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUnitsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUnitsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UnitsFilter filter value from a formatted string
   *
   * @param _value the UnitsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UnitsFilter filter field
   */
  public void setUnitsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUnitsFilterFromFormattedString");
    try {
      this.setUnitsFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUnitsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUnitsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ComponentId (PRODUCT.component_id)
   * @param fetch whether to fetch this field or not
   */
  public void setComponentIdFetch (boolean fetch) {
    this.ComponentIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ComponentId (PRODUCT.component_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getComponentIdFetch () {
    return this.ComponentIdFetch;
  }
  /** Set the SortOrder for field: ComponentId (PRODUCT.component_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setComponentIdSortOrder (Integer value) {
    this.ComponentIdSort = value;
  }
  /** Retrieve SortOrder for field: ComponentId (PRODUCT.component_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getComponentIdSortOrder () {
    return this.ComponentIdSort;
  }
  /** Set the sort direction for field: ComponentId (PRODUCT.component_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setComponentIdSortDirection (boolean ascending) {
    this.ComponentIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ComponentId (PRODUCT.component_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getComponentIdSortDirection () {
    return this.ComponentIdSortAscending;
  }
  /** Set the field level filters for field: ComponentId (PRODUCT.component_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setComponentIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ComponentId = value;
  }
  /** Retrieve filter for field: ComponentId (PRODUCT.component_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getComponentIdFilter () {
    return this.ComponentId;
  }

  /**
   * Retrieves the ComponentIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ComponentIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ComponentIdFilter field
   */
  public String[] getComponentIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getComponentIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getComponentIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getComponentIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ComponentIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getComponentIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ComponentIdFilter filter value from a formatted string
   *
   * @param _value the ComponentIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ComponentIdFilter filter field
   */
  public void setComponentIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setComponentIdFilterFromFormattedString");
    try {
      this.setComponentIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ComponentIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setComponentIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setComponentIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillPeriod (PRODUCT_CHARGE_MAP.bill_period)
   * @param fetch whether to fetch this field or not
   */
  public void setBillPeriodFetch (boolean fetch) {
    this.BillPeriodFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillPeriod (PRODUCT_CHARGE_MAP.bill_period)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillPeriodFetch () {
    return this.BillPeriodFetch;
  }
  /** Set the SortOrder for field: BillPeriod (PRODUCT_CHARGE_MAP.bill_period)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillPeriodSortOrder (Integer value) {
    this.BillPeriodSort = value;
  }
  /** Retrieve SortOrder for field: BillPeriod (PRODUCT_CHARGE_MAP.bill_period)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillPeriodSortOrder () {
    return this.BillPeriodSort;
  }
  /** Set the sort direction for field: BillPeriod (PRODUCT_CHARGE_MAP.bill_period)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillPeriodSortDirection (boolean ascending) {
    this.BillPeriodSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillPeriod (PRODUCT_CHARGE_MAP.bill_period)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillPeriodSortDirection () {
    return this.BillPeriodSortAscending;
  }
  /** Set the case insensitive for field: BillPeriod (PRODUCT_CHARGE_MAP.bill_period)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBillPeriodCaseInsensitive (boolean ascending) {
    this.BillPeriodCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BillPeriod (PRODUCT_CHARGE_MAP.bill_period)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBillPeriodCaseInsensitive () {
    return this.BillPeriodCaseInsensitive;
  }
  /** Set the field level filters for field: BillPeriod (PRODUCT_CHARGE_MAP.bill_period)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillPeriodFilter (StringFilter[] value) throws ServiceException {
    this.BillPeriod = value;
  }
  /** Retrieve filter for field: BillPeriod (PRODUCT_CHARGE_MAP.bill_period)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBillPeriodFilter () {
    return this.BillPeriod;
  }

  /**
   * Retrieves the BillPeriodFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillPeriodFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillPeriodFilter field
   */
  public String[] getBillPeriodFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillPeriodFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillPeriodFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillPeriodFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillPeriodFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillPeriodFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillPeriodFilter filter value from a formatted string
   *
   * @param _value the BillPeriodFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillPeriodFilter filter field
   */
  public void setBillPeriodFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillPeriodFilterFromFormattedString");
    try {
      this.setBillPeriodFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillPeriodFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillPeriodFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillPeriodFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BilledThruDt (PRODUCT_CHARGE_MAP.billed_thru_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setBilledThruDtFetch (boolean fetch) {
    this.BilledThruDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: BilledThruDt (PRODUCT_CHARGE_MAP.billed_thru_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getBilledThruDtFetch () {
    return this.BilledThruDtFetch;
  }
  /** Set the SortOrder for field: BilledThruDt (PRODUCT_CHARGE_MAP.billed_thru_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBilledThruDtSortOrder (Integer value) {
    this.BilledThruDtSort = value;
  }
  /** Retrieve SortOrder for field: BilledThruDt (PRODUCT_CHARGE_MAP.billed_thru_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBilledThruDtSortOrder () {
    return this.BilledThruDtSort;
  }
  /** Set the sort direction for field: BilledThruDt (PRODUCT_CHARGE_MAP.billed_thru_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBilledThruDtSortDirection (boolean ascending) {
    this.BilledThruDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BilledThruDt (PRODUCT_CHARGE_MAP.billed_thru_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBilledThruDtSortDirection () {
    return this.BilledThruDtSortAscending;
  }
  /** Set the field level filters for field: BilledThruDt (PRODUCT_CHARGE_MAP.billed_thru_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBilledThruDtFilter (DateFilter[] value) throws ServiceException {
    this.BilledThruDt = value;
  }
  /** Retrieve filter for field: BilledThruDt (PRODUCT_CHARGE_MAP.billed_thru_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getBilledThruDtFilter () {
    return this.BilledThruDt;
  }

  /**
   * Retrieves the BilledThruDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BilledThruDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BilledThruDtFilter field
   */
  public String[] getBilledThruDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBilledThruDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBilledThruDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBilledThruDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BilledThruDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBilledThruDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BilledThruDtFilter filter value from a formatted string
   *
   * @param _value the BilledThruDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BilledThruDtFilter filter field
   */
  public void setBilledThruDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBilledThruDtFilterFromFormattedString");
    try {
      this.setBilledThruDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BilledThruDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBilledThruDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBilledThruDtFilterFromFormattedString");
  }

  /**
   * Retrieves the BilledThruDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BilledThruDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the BilledThruDtFilter field
   */
  public String[] getBilledThruDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBilledThruDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBilledThruDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBilledThruDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BilledThruDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBilledThruDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the BilledThruDtFilter filter value from a formatted string
   *
   * @param _value the BilledThruDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BilledThruDtFilter filter field
   */
  public void setBilledThruDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBilledThruDtFilterFromFormattedDateTimeString");
    try {
      this.setBilledThruDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BilledThruDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBilledThruDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBilledThruDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: ActiveDt (PRODUCT_CHARGE_MAP.active_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setActiveDtFetch (boolean fetch) {
    this.ActiveDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: ActiveDt (PRODUCT_CHARGE_MAP.active_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getActiveDtFetch () {
    return this.ActiveDtFetch;
  }
  /** Set the SortOrder for field: ActiveDt (PRODUCT_CHARGE_MAP.active_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setActiveDtSortOrder (Integer value) {
    this.ActiveDtSort = value;
  }
  /** Retrieve SortOrder for field: ActiveDt (PRODUCT_CHARGE_MAP.active_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getActiveDtSortOrder () {
    return this.ActiveDtSort;
  }
  /** Set the sort direction for field: ActiveDt (PRODUCT_CHARGE_MAP.active_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setActiveDtSortDirection (boolean ascending) {
    this.ActiveDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ActiveDt (PRODUCT_CHARGE_MAP.active_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getActiveDtSortDirection () {
    return this.ActiveDtSortAscending;
  }
  /** Set the field level filters for field: ActiveDt (PRODUCT_CHARGE_MAP.active_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setActiveDtFilter (DateFilter[] value) throws ServiceException {
    this.ActiveDt = value;
  }
  /** Retrieve filter for field: ActiveDt (PRODUCT_CHARGE_MAP.active_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getActiveDtFilter () {
    return this.ActiveDt;
  }

  /**
   * Retrieves the ActiveDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ActiveDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActiveDtFilter field
   */
  public String[] getActiveDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getActiveDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActiveDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getActiveDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ActiveDtFilter filter value from a formatted string
   *
   * @param _value the ActiveDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ActiveDtFilter filter field
   */
  public void setActiveDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setActiveDtFilterFromFormattedString");
    try {
      this.setActiveDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setActiveDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setActiveDtFilterFromFormattedString");
  }

  /**
   * Retrieves the ActiveDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ActiveDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActiveDtFilter field
   */
  public String[] getActiveDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getActiveDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActiveDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getActiveDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ActiveDtFilter filter value from a formatted string
   *
   * @param _value the ActiveDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ActiveDtFilter filter field
   */
  public void setActiveDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setActiveDtFilterFromFormattedDateTimeString");
    try {
      this.setActiveDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setActiveDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setActiveDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: TerminationCode (PRODUCT_CHARGE_MAP.termination_code)
   * @param fetch whether to fetch this field or not
   */
  public void setTerminationCodeFetch (boolean fetch) {
    this.TerminationCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: TerminationCode (PRODUCT_CHARGE_MAP.termination_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getTerminationCodeFetch () {
    return this.TerminationCodeFetch;
  }
  /** Set the SortOrder for field: TerminationCode (PRODUCT_CHARGE_MAP.termination_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTerminationCodeSortOrder (Integer value) {
    this.TerminationCodeSort = value;
  }
  /** Retrieve SortOrder for field: TerminationCode (PRODUCT_CHARGE_MAP.termination_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTerminationCodeSortOrder () {
    return this.TerminationCodeSort;
  }
  /** Set the sort direction for field: TerminationCode (PRODUCT_CHARGE_MAP.termination_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTerminationCodeSortDirection (boolean ascending) {
    this.TerminationCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TerminationCode (PRODUCT_CHARGE_MAP.termination_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTerminationCodeSortDirection () {
    return this.TerminationCodeSortAscending;
  }
  /** Set the field level filters for field: TerminationCode (PRODUCT_CHARGE_MAP.termination_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTerminationCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.TerminationCode = value;
  }
  /** Retrieve filter for field: TerminationCode (PRODUCT_CHARGE_MAP.termination_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTerminationCodeFilter () {
    return this.TerminationCode;
  }

  /**
   * Retrieves the TerminationCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TerminationCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TerminationCodeFilter field
   */
  public String[] getTerminationCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTerminationCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTerminationCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTerminationCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TerminationCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTerminationCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TerminationCodeFilter filter value from a formatted string
   *
   * @param _value the TerminationCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TerminationCodeFilter filter field
   */
  public void setTerminationCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTerminationCodeFilterFromFormattedString");
    try {
      this.setTerminationCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TerminationCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTerminationCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTerminationCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: InArrearsOverride (PRODUCT_CHARGE_MAP.in_arrears_override)
   * @param fetch whether to fetch this field or not
   */
  public void setInArrearsOverrideFetch (boolean fetch) {
    this.InArrearsOverrideFetch = fetch;
  }
  /** Retrieve Fetch value for field: InArrearsOverride (PRODUCT_CHARGE_MAP.in_arrears_override)
   * @return boolean the Fetch value for this field
   */
  public boolean getInArrearsOverrideFetch () {
    return this.InArrearsOverrideFetch;
  }
  /** Set the SortOrder for field: InArrearsOverride (PRODUCT_CHARGE_MAP.in_arrears_override)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInArrearsOverrideSortOrder (Integer value) {
    this.InArrearsOverrideSort = value;
  }
  /** Retrieve SortOrder for field: InArrearsOverride (PRODUCT_CHARGE_MAP.in_arrears_override)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInArrearsOverrideSortOrder () {
    return this.InArrearsOverrideSort;
  }
  /** Set the sort direction for field: InArrearsOverride (PRODUCT_CHARGE_MAP.in_arrears_override)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInArrearsOverrideSortDirection (boolean ascending) {
    this.InArrearsOverrideSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InArrearsOverride (PRODUCT_CHARGE_MAP.in_arrears_override)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInArrearsOverrideSortDirection () {
    return this.InArrearsOverrideSortAscending;
  }
  /** Set the field level filters for field: InArrearsOverride (PRODUCT_CHARGE_MAP.in_arrears_override)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInArrearsOverrideFilter (IntegerFilter[] value) throws ServiceException {
    this.InArrearsOverride = value;
  }
  /** Retrieve filter for field: InArrearsOverride (PRODUCT_CHARGE_MAP.in_arrears_override)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getInArrearsOverrideFilter () {
    return this.InArrearsOverride;
  }

  /**
   * Retrieves the InArrearsOverrideFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InArrearsOverrideFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InArrearsOverrideFilter field
   */
  public String[] getInArrearsOverrideFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInArrearsOverrideFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getInArrearsOverrideFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInArrearsOverrideFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InArrearsOverrideFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInArrearsOverrideFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the InArrearsOverrideFilter filter value from a formatted string
   *
   * @param _value the InArrearsOverrideFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the InArrearsOverrideFilter filter field
   */
  public void setInArrearsOverrideFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInArrearsOverrideFilterFromFormattedString");
    try {
      this.setInArrearsOverrideFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InArrearsOverrideFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInArrearsOverrideFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInArrearsOverrideFilterFromFormattedString");
  }

  public String toString() {
    return PRRRcDataObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return PRRRcDataObjectHelper.toMap(this, null);
  }
}
