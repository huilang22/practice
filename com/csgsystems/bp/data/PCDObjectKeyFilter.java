/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PCDObjectKeyFilter.java
 * Definition File: Admin/PackageComponentDef.xml
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
import java.util.Locale;
import java.util.Map;

import java.math.BigInteger;
import com.csgsystems.api.utilities.FilterConversionHelper;
import com.csgsystems.api.utilities.Logger;
import com.csgsystems.api.utilities.ObjectHelper;

import com.csgsystems.api.enumeration.Enumeration;
import com.csgsystems.api.enumeration.EnumerationFilter;

import com.csgsystems.aruba.connection.ServiceException;

import com.csgsystems.aruba.filter.*;

import com.csgsystems.aruba.Filter;

import com.csgsystems.api.base.BaseFilter;

/** Key Filter for PCDObject object. */
public class PCDObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: PACKAGE_COMPONENTS.package_id) */
  public    IntegerFilter[] PackageId  = null;
  protected boolean PackageIdFetch = false;
  protected boolean PackageIdSortAscending = true;
  protected Integer PackageIdSort = null;
  /** raw field for: PACKAGE_COMPONENTS.active_dt) */
  public    DateFilter[] PackageActiveDt  = null;
  protected boolean PackageActiveDtFetch = false;
  protected boolean PackageActiveDtSortAscending = true;
  protected Integer PackageActiveDtSort = null;
  /** raw field for: COMPONENT_DEFINITION_VALUES.component_id) */
  public    IntegerFilter[] ComponentId  = null;
  protected boolean ComponentIdFetch = false;
  protected boolean ComponentIdSortAscending = true;
  protected Integer ComponentIdSort = null;
  /** raw field for: COMPONENT_DEFINITION_VALUES.language_code) */
  public    IntegerFilter[] LanguageCode  = null;
  protected boolean LanguageCodeFetch = false;
  protected boolean LanguageCodeSortAscending = true;
  protected Integer LanguageCodeSort = null;
  private String _objName = "PCDObjectKeyFilter";
  /** default constructor */
  public PCDObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public PCDObjectKeyFilter (PCDObjectKeyFilter other)
  {
    if (other == null) return;
    this.PackageId = other.PackageId;
    this.PackageIdFetch = other.PackageIdFetch;
    this.PackageIdSort = other.PackageIdSort;
    this.PackageIdSortAscending = other.PackageIdSortAscending;
    this.PackageActiveDt = other.PackageActiveDt;
    this.PackageActiveDtFetch = other.PackageActiveDtFetch;
    this.PackageActiveDtSort = other.PackageActiveDtSort;
    this.PackageActiveDtSortAscending = other.PackageActiveDtSortAscending;
    this.ComponentId = other.ComponentId;
    this.ComponentIdFetch = other.ComponentIdFetch;
    this.ComponentIdSort = other.ComponentIdSort;
    this.ComponentIdSortAscending = other.ComponentIdSortAscending;
    this.LanguageCode = other.LanguageCode;
    this.LanguageCodeFetch = other.LanguageCodeFetch;
    this.LanguageCodeSort = other.LanguageCodeSort;
    this.LanguageCodeSortAscending = other.LanguageCodeSortAscending;
  }
  /** Set the field level Fetch value for field: PackageId (PACKAGE_COMPONENTS.package_id)
   * @param fetch whether to fetch this field or not
   */
  public void setPackageIdFetch (boolean fetch) {
    this.PackageIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: PackageId (PACKAGE_COMPONENTS.package_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getPackageIdFetch () {
    return this.PackageIdFetch;
  }
  /** Set the SortOrder for field: PackageId (PACKAGE_COMPONENTS.package_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPackageIdSortOrder (Integer value) {
    this.PackageIdSort = value;
  }
  /** Retrieve SortOrder for field: PackageId (PACKAGE_COMPONENTS.package_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPackageIdSortOrder () {
    return this.PackageIdSort;
  }
  /** Set the sort direction for field: PackageId (PACKAGE_COMPONENTS.package_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPackageIdSortDirection (boolean ascending) {
    this.PackageIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PackageId (PACKAGE_COMPONENTS.package_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPackageIdSortDirection () {
    return this.PackageIdSortAscending;
  }
  /** Set the field level filters for field: PackageId (PACKAGE_COMPONENTS.package_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPackageIdFilter (IntegerFilter[] value) throws ServiceException {
    this.PackageId = value;
  }
  /** Retrieve filter for field: PackageId (PACKAGE_COMPONENTS.package_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPackageIdFilter () {
    return this.PackageId;
  }

  /**
   * Retrieves the PackageIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PackageIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PackageIdFilter field
   */
  public String[] getPackageIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPackageIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPackageIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPackageIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PackageIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPackageIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PackageIdFilter filter value from a formatted string
   *
   * @param _value the PackageIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PackageIdFilter filter field
   */
  public void setPackageIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPackageIdFilterFromFormattedString");
    try {
      this.setPackageIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PackageIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPackageIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPackageIdFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated PackageIdFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the PackageIdFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the PackageIdFilter filter field
   */
  public String[] getPackageIdFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPackageIdFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getPackageIdFilter(), "PackageType", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPackageIdFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PackageIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPackageIdFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated PackageIdFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the PackageIdFilter filter field
   */
  public void setPackageIdFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPackageIdFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setPackageIdFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "PackageId", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PackageIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPackageIdFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPackageIdFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: PackageActiveDt (PACKAGE_COMPONENTS.active_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setPackageActiveDtFetch (boolean fetch) {
    this.PackageActiveDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: PackageActiveDt (PACKAGE_COMPONENTS.active_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getPackageActiveDtFetch () {
    return this.PackageActiveDtFetch;
  }
  /** Set the SortOrder for field: PackageActiveDt (PACKAGE_COMPONENTS.active_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPackageActiveDtSortOrder (Integer value) {
    this.PackageActiveDtSort = value;
  }
  /** Retrieve SortOrder for field: PackageActiveDt (PACKAGE_COMPONENTS.active_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPackageActiveDtSortOrder () {
    return this.PackageActiveDtSort;
  }
  /** Set the sort direction for field: PackageActiveDt (PACKAGE_COMPONENTS.active_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPackageActiveDtSortDirection (boolean ascending) {
    this.PackageActiveDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PackageActiveDt (PACKAGE_COMPONENTS.active_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPackageActiveDtSortDirection () {
    return this.PackageActiveDtSortAscending;
  }
  /** Set the field level filters for field: PackageActiveDt (PACKAGE_COMPONENTS.active_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPackageActiveDtFilter (DateFilter[] value) throws ServiceException {
    this.PackageActiveDt = value;
  }
  /** Retrieve filter for field: PackageActiveDt (PACKAGE_COMPONENTS.active_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getPackageActiveDtFilter () {
    return this.PackageActiveDt;
  }

  /**
   * Retrieves the PackageActiveDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PackageActiveDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PackageActiveDtFilter field
   */
  public String[] getPackageActiveDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPackageActiveDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPackageActiveDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPackageActiveDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PackageActiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPackageActiveDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PackageActiveDtFilter filter value from a formatted string
   *
   * @param _value the PackageActiveDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PackageActiveDtFilter filter field
   */
  public void setPackageActiveDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPackageActiveDtFilterFromFormattedString");
    try {
      this.setPackageActiveDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PackageActiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPackageActiveDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPackageActiveDtFilterFromFormattedString");
  }

  /**
   * Retrieves the PackageActiveDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PackageActiveDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the PackageActiveDtFilter field
   */
  public String[] getPackageActiveDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPackageActiveDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPackageActiveDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPackageActiveDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PackageActiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPackageActiveDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the PackageActiveDtFilter filter value from a formatted string
   *
   * @param _value the PackageActiveDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PackageActiveDtFilter filter field
   */
  public void setPackageActiveDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPackageActiveDtFilterFromFormattedDateTimeString");
    try {
      this.setPackageActiveDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PackageActiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPackageActiveDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPackageActiveDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: ComponentId (COMPONENT_DEFINITION_VALUES.component_id)
   * @param fetch whether to fetch this field or not
   */
  public void setComponentIdFetch (boolean fetch) {
    this.ComponentIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ComponentId (COMPONENT_DEFINITION_VALUES.component_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getComponentIdFetch () {
    return this.ComponentIdFetch;
  }
  /** Set the SortOrder for field: ComponentId (COMPONENT_DEFINITION_VALUES.component_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setComponentIdSortOrder (Integer value) {
    this.ComponentIdSort = value;
  }
  /** Retrieve SortOrder for field: ComponentId (COMPONENT_DEFINITION_VALUES.component_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getComponentIdSortOrder () {
    return this.ComponentIdSort;
  }
  /** Set the sort direction for field: ComponentId (COMPONENT_DEFINITION_VALUES.component_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setComponentIdSortDirection (boolean ascending) {
    this.ComponentIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ComponentId (COMPONENT_DEFINITION_VALUES.component_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getComponentIdSortDirection () {
    return this.ComponentIdSortAscending;
  }
  /** Set the field level filters for field: ComponentId (COMPONENT_DEFINITION_VALUES.component_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setComponentIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ComponentId = value;
  }
  /** Retrieve filter for field: ComponentId (COMPONENT_DEFINITION_VALUES.component_id)
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

  /**
   * Retrieves the display value for the enumerated ComponentIdFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the ComponentIdFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ComponentIdFilter filter field
   */
  public String[] getComponentIdFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getComponentIdFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getComponentIdFilter(), "PackageComponentType", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getComponentIdFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ComponentIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getComponentIdFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated ComponentIdFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the ComponentIdFilter filter field
   */
  public void setComponentIdFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setComponentIdFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setComponentIdFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "ComponentId", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ComponentIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setComponentIdFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setComponentIdFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: LanguageCode (COMPONENT_DEFINITION_VALUES.language_code)
   * @param fetch whether to fetch this field or not
   */
  public void setLanguageCodeFetch (boolean fetch) {
    this.LanguageCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: LanguageCode (COMPONENT_DEFINITION_VALUES.language_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getLanguageCodeFetch () {
    return this.LanguageCodeFetch;
  }
  /** Set the SortOrder for field: LanguageCode (COMPONENT_DEFINITION_VALUES.language_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLanguageCodeSortOrder (Integer value) {
    this.LanguageCodeSort = value;
  }
  /** Retrieve SortOrder for field: LanguageCode (COMPONENT_DEFINITION_VALUES.language_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLanguageCodeSortOrder () {
    return this.LanguageCodeSort;
  }
  /** Set the sort direction for field: LanguageCode (COMPONENT_DEFINITION_VALUES.language_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLanguageCodeSortDirection (boolean ascending) {
    this.LanguageCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LanguageCode (COMPONENT_DEFINITION_VALUES.language_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLanguageCodeSortDirection () {
    return this.LanguageCodeSortAscending;
  }
  /** Set the field level filters for field: LanguageCode (COMPONENT_DEFINITION_VALUES.language_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLanguageCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.LanguageCode = value;
  }
  /** Retrieve filter for field: LanguageCode (COMPONENT_DEFINITION_VALUES.language_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getLanguageCodeFilter () {
    return this.LanguageCode;
  }

  /**
   * Retrieves the LanguageCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The LanguageCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LanguageCodeFilter field
   */
  public String[] getLanguageCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLanguageCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getLanguageCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLanguageCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LanguageCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getLanguageCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the LanguageCodeFilter filter value from a formatted string
   *
   * @param _value the LanguageCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the LanguageCodeFilter filter field
   */
  public void setLanguageCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setLanguageCodeFilterFromFormattedString");
    try {
      this.setLanguageCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LanguageCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setLanguageCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLanguageCodeFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated LanguageCodeFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the LanguageCodeFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the LanguageCodeFilter filter field
   */
  public String[] getLanguageCodeFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLanguageCodeFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getLanguageCodeFilter(), "LanguageCode", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLanguageCodeFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LanguageCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getLanguageCodeFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated LanguageCodeFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the LanguageCodeFilter filter field
   */
  public void setLanguageCodeFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setLanguageCodeFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setLanguageCodeFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "LanguageCode", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LanguageCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setLanguageCodeFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLanguageCodeFilterFromDisplayValue");
  }


  public String toString() {
    return PCDObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return PCDObjectKeyHelper.toMap(this, null);
  }
}
