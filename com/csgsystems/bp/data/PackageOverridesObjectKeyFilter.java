/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PackageOverridesObjectKeyFilter.java
 * Definition File: Customer/CmfPackageOverrides.xml
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

/** Key Filter for PackageOverridesObject object. */
public class PackageOverridesObjectKeyFilter extends BaseFilter implements Serializable
{
  /** raw field for: CMF_PACKAGE_OVERRIDES.parent_account_no) */
  public    IntegerFilter[] ParentAccountInternalId  = null;
  protected boolean ParentAccountInternalIdFetch = false;
  protected boolean ParentAccountInternalIdSortAscending = true;
  protected Integer ParentAccountInternalIdSort = null;
  /** raw field for: CMF_PACKAGE_OVERRIDES.package_inst_id) */
  public    IntegerFilter[] PackageInstId  = null;
  protected boolean PackageInstIdFetch = false;
  protected boolean PackageInstIdSortAscending = true;
  protected Integer PackageInstIdSort = null;
  /** raw field for: CMF_PACKAGE_OVERRIDES.package_inst_id_serv) */
  public    IntegerFilter[] PackageInstIdServ  = null;
  protected boolean PackageInstIdServFetch = false;
  protected boolean PackageInstIdServSortAscending = true;
  protected Integer PackageInstIdServSort = null;
  /** raw field for: CMF_PACKAGE_OVERRIDES.package_id) */
  public    IntegerFilter[] PackageId  = null;
  protected boolean PackageIdFetch = false;
  protected boolean PackageIdSortAscending = true;
  protected Integer PackageIdSort = null;
  /** raw field for: CMF_PACKAGE_OVERRIDES.association_id) */
  public    IntegerFilter[] AssociationId  = null;
  protected boolean AssociationIdFetch = false;
  protected boolean AssociationIdSortAscending = true;
  protected Integer AssociationIdSort = null;
  /** raw field for: CMF_PACKAGE_OVERRIDES.association_type) */
  public    BigIntegerFilter[] AssociationType  = null;
  protected boolean AssociationTypeFetch = false;
  protected boolean AssociationTypeSortAscending = true;
  protected Integer AssociationTypeSort = null;
  /** raw field for: CMF_PACKAGE_OVERRIDES.currency_code) */
  public    IntegerFilter[] CurrencyCode  = null;
  protected boolean CurrencyCodeFetch = false;
  protected boolean CurrencyCodeSortAscending = true;
  protected Integer CurrencyCodeSort = null;
  private String _objName = "PackageOverridesObjectKeyFilter";
  /** default constructor */
  public PackageOverridesObjectKeyFilter ()
  {
  }
  /** copy constructor
   * @param other the filter to copy
   */
  public PackageOverridesObjectKeyFilter (PackageOverridesObjectKeyFilter other)
  {
    if (other == null) return;
    this.ParentAccountInternalId = other.ParentAccountInternalId;
    this.ParentAccountInternalIdFetch = other.ParentAccountInternalIdFetch;
    this.ParentAccountInternalIdSort = other.ParentAccountInternalIdSort;
    this.ParentAccountInternalIdSortAscending = other.ParentAccountInternalIdSortAscending;
    this.PackageInstId = other.PackageInstId;
    this.PackageInstIdFetch = other.PackageInstIdFetch;
    this.PackageInstIdSort = other.PackageInstIdSort;
    this.PackageInstIdSortAscending = other.PackageInstIdSortAscending;
    this.PackageInstIdServ = other.PackageInstIdServ;
    this.PackageInstIdServFetch = other.PackageInstIdServFetch;
    this.PackageInstIdServSort = other.PackageInstIdServSort;
    this.PackageInstIdServSortAscending = other.PackageInstIdServSortAscending;
    this.PackageId = other.PackageId;
    this.PackageIdFetch = other.PackageIdFetch;
    this.PackageIdSort = other.PackageIdSort;
    this.PackageIdSortAscending = other.PackageIdSortAscending;
    this.AssociationId = other.AssociationId;
    this.AssociationIdFetch = other.AssociationIdFetch;
    this.AssociationIdSort = other.AssociationIdSort;
    this.AssociationIdSortAscending = other.AssociationIdSortAscending;
    this.AssociationType = other.AssociationType;
    this.AssociationTypeFetch = other.AssociationTypeFetch;
    this.AssociationTypeSort = other.AssociationTypeSort;
    this.AssociationTypeSortAscending = other.AssociationTypeSortAscending;
    this.CurrencyCode = other.CurrencyCode;
    this.CurrencyCodeFetch = other.CurrencyCodeFetch;
    this.CurrencyCodeSort = other.CurrencyCodeSort;
    this.CurrencyCodeSortAscending = other.CurrencyCodeSortAscending;
  }
  /** Set the field level Fetch value for field: ParentAccountInternalId (CMF_PACKAGE_OVERRIDES.parent_account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setParentAccountInternalIdFetch (boolean fetch) {
    this.ParentAccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ParentAccountInternalId (CMF_PACKAGE_OVERRIDES.parent_account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getParentAccountInternalIdFetch () {
    return this.ParentAccountInternalIdFetch;
  }
  /** Set the SortOrder for field: ParentAccountInternalId (CMF_PACKAGE_OVERRIDES.parent_account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setParentAccountInternalIdSortOrder (Integer value) {
    this.ParentAccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: ParentAccountInternalId (CMF_PACKAGE_OVERRIDES.parent_account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getParentAccountInternalIdSortOrder () {
    return this.ParentAccountInternalIdSort;
  }
  /** Set the sort direction for field: ParentAccountInternalId (CMF_PACKAGE_OVERRIDES.parent_account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setParentAccountInternalIdSortDirection (boolean ascending) {
    this.ParentAccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ParentAccountInternalId (CMF_PACKAGE_OVERRIDES.parent_account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getParentAccountInternalIdSortDirection () {
    return this.ParentAccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: ParentAccountInternalId (CMF_PACKAGE_OVERRIDES.parent_account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setParentAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ParentAccountInternalId = value;
  }
  /** Retrieve filter for field: ParentAccountInternalId (CMF_PACKAGE_OVERRIDES.parent_account_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getParentAccountInternalIdFilter () {
    return this.ParentAccountInternalId;
  }

  /**
   * Retrieves the ParentAccountInternalIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ParentAccountInternalIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParentAccountInternalIdFilter field
   */
  public String[] getParentAccountInternalIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentAccountInternalIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getParentAccountInternalIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParentAccountInternalIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParentAccountInternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getParentAccountInternalIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ParentAccountInternalIdFilter filter value from a formatted string
   *
   * @param _value the ParentAccountInternalIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ParentAccountInternalIdFilter filter field
   */
  public void setParentAccountInternalIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setParentAccountInternalIdFilterFromFormattedString");
    try {
      this.setParentAccountInternalIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParentAccountInternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setParentAccountInternalIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParentAccountInternalIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PackageInstId (CMF_PACKAGE_OVERRIDES.package_inst_id)
   * @param fetch whether to fetch this field or not
   */
  public void setPackageInstIdFetch (boolean fetch) {
    this.PackageInstIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: PackageInstId (CMF_PACKAGE_OVERRIDES.package_inst_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getPackageInstIdFetch () {
    return this.PackageInstIdFetch;
  }
  /** Set the SortOrder for field: PackageInstId (CMF_PACKAGE_OVERRIDES.package_inst_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPackageInstIdSortOrder (Integer value) {
    this.PackageInstIdSort = value;
  }
  /** Retrieve SortOrder for field: PackageInstId (CMF_PACKAGE_OVERRIDES.package_inst_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPackageInstIdSortOrder () {
    return this.PackageInstIdSort;
  }
  /** Set the sort direction for field: PackageInstId (CMF_PACKAGE_OVERRIDES.package_inst_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPackageInstIdSortDirection (boolean ascending) {
    this.PackageInstIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PackageInstId (CMF_PACKAGE_OVERRIDES.package_inst_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPackageInstIdSortDirection () {
    return this.PackageInstIdSortAscending;
  }
  /** Set the field level filters for field: PackageInstId (CMF_PACKAGE_OVERRIDES.package_inst_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPackageInstIdFilter (IntegerFilter[] value) throws ServiceException {
    this.PackageInstId = value;
  }
  /** Retrieve filter for field: PackageInstId (CMF_PACKAGE_OVERRIDES.package_inst_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPackageInstIdFilter () {
    return this.PackageInstId;
  }

  /**
   * Retrieves the PackageInstIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PackageInstIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PackageInstIdFilter field
   */
  public String[] getPackageInstIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPackageInstIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPackageInstIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPackageInstIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PackageInstIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPackageInstIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PackageInstIdFilter filter value from a formatted string
   *
   * @param _value the PackageInstIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PackageInstIdFilter filter field
   */
  public void setPackageInstIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPackageInstIdFilterFromFormattedString");
    try {
      this.setPackageInstIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PackageInstIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPackageInstIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPackageInstIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PackageInstIdServ (CMF_PACKAGE_OVERRIDES.package_inst_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setPackageInstIdServFetch (boolean fetch) {
    this.PackageInstIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: PackageInstIdServ (CMF_PACKAGE_OVERRIDES.package_inst_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getPackageInstIdServFetch () {
    return this.PackageInstIdServFetch;
  }
  /** Set the SortOrder for field: PackageInstIdServ (CMF_PACKAGE_OVERRIDES.package_inst_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPackageInstIdServSortOrder (Integer value) {
    this.PackageInstIdServSort = value;
  }
  /** Retrieve SortOrder for field: PackageInstIdServ (CMF_PACKAGE_OVERRIDES.package_inst_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPackageInstIdServSortOrder () {
    return this.PackageInstIdServSort;
  }
  /** Set the sort direction for field: PackageInstIdServ (CMF_PACKAGE_OVERRIDES.package_inst_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPackageInstIdServSortDirection (boolean ascending) {
    this.PackageInstIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PackageInstIdServ (CMF_PACKAGE_OVERRIDES.package_inst_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPackageInstIdServSortDirection () {
    return this.PackageInstIdServSortAscending;
  }
  /** Set the field level filters for field: PackageInstIdServ (CMF_PACKAGE_OVERRIDES.package_inst_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPackageInstIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.PackageInstIdServ = value;
  }
  /** Retrieve filter for field: PackageInstIdServ (CMF_PACKAGE_OVERRIDES.package_inst_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPackageInstIdServFilter () {
    return this.PackageInstIdServ;
  }

  /**
   * Retrieves the PackageInstIdServFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PackageInstIdServFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PackageInstIdServFilter field
   */
  public String[] getPackageInstIdServFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPackageInstIdServFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPackageInstIdServFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPackageInstIdServFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PackageInstIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPackageInstIdServFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PackageInstIdServFilter filter value from a formatted string
   *
   * @param _value the PackageInstIdServFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PackageInstIdServFilter filter field
   */
  public void setPackageInstIdServFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPackageInstIdServFilterFromFormattedString");
    try {
      this.setPackageInstIdServFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PackageInstIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPackageInstIdServFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPackageInstIdServFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PackageId (CMF_PACKAGE_OVERRIDES.package_id)
   * @param fetch whether to fetch this field or not
   */
  public void setPackageIdFetch (boolean fetch) {
    this.PackageIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: PackageId (CMF_PACKAGE_OVERRIDES.package_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getPackageIdFetch () {
    return this.PackageIdFetch;
  }
  /** Set the SortOrder for field: PackageId (CMF_PACKAGE_OVERRIDES.package_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPackageIdSortOrder (Integer value) {
    this.PackageIdSort = value;
  }
  /** Retrieve SortOrder for field: PackageId (CMF_PACKAGE_OVERRIDES.package_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPackageIdSortOrder () {
    return this.PackageIdSort;
  }
  /** Set the sort direction for field: PackageId (CMF_PACKAGE_OVERRIDES.package_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPackageIdSortDirection (boolean ascending) {
    this.PackageIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PackageId (CMF_PACKAGE_OVERRIDES.package_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPackageIdSortDirection () {
    return this.PackageIdSortAscending;
  }
  /** Set the field level filters for field: PackageId (CMF_PACKAGE_OVERRIDES.package_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPackageIdFilter (IntegerFilter[] value) throws ServiceException {
    this.PackageId = value;
  }
  /** Retrieve filter for field: PackageId (CMF_PACKAGE_OVERRIDES.package_id)
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

  /** Set the field level Fetch value for field: AssociationId (CMF_PACKAGE_OVERRIDES.association_id)
   * @param fetch whether to fetch this field or not
   */
  public void setAssociationIdFetch (boolean fetch) {
    this.AssociationIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AssociationId (CMF_PACKAGE_OVERRIDES.association_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getAssociationIdFetch () {
    return this.AssociationIdFetch;
  }
  /** Set the SortOrder for field: AssociationId (CMF_PACKAGE_OVERRIDES.association_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAssociationIdSortOrder (Integer value) {
    this.AssociationIdSort = value;
  }
  /** Retrieve SortOrder for field: AssociationId (CMF_PACKAGE_OVERRIDES.association_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAssociationIdSortOrder () {
    return this.AssociationIdSort;
  }
  /** Set the sort direction for field: AssociationId (CMF_PACKAGE_OVERRIDES.association_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAssociationIdSortDirection (boolean ascending) {
    this.AssociationIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AssociationId (CMF_PACKAGE_OVERRIDES.association_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAssociationIdSortDirection () {
    return this.AssociationIdSortAscending;
  }
  /** Set the field level filters for field: AssociationId (CMF_PACKAGE_OVERRIDES.association_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAssociationIdFilter (IntegerFilter[] value) throws ServiceException {
    this.AssociationId = value;
  }
  /** Retrieve filter for field: AssociationId (CMF_PACKAGE_OVERRIDES.association_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAssociationIdFilter () {
    return this.AssociationId;
  }

  /**
   * Retrieves the AssociationIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AssociationIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AssociationIdFilter field
   */
  public String[] getAssociationIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAssociationIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAssociationIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAssociationIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AssociationIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAssociationIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AssociationIdFilter filter value from a formatted string
   *
   * @param _value the AssociationIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AssociationIdFilter filter field
   */
  public void setAssociationIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAssociationIdFilterFromFormattedString");
    try {
      this.setAssociationIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AssociationIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAssociationIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAssociationIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AssociationType (CMF_PACKAGE_OVERRIDES.association_type)
   * @param fetch whether to fetch this field or not
   */
  public void setAssociationTypeFetch (boolean fetch) {
    this.AssociationTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: AssociationType (CMF_PACKAGE_OVERRIDES.association_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getAssociationTypeFetch () {
    return this.AssociationTypeFetch;
  }
  /** Set the SortOrder for field: AssociationType (CMF_PACKAGE_OVERRIDES.association_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAssociationTypeSortOrder (Integer value) {
    this.AssociationTypeSort = value;
  }
  /** Retrieve SortOrder for field: AssociationType (CMF_PACKAGE_OVERRIDES.association_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAssociationTypeSortOrder () {
    return this.AssociationTypeSort;
  }
  /** Set the sort direction for field: AssociationType (CMF_PACKAGE_OVERRIDES.association_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAssociationTypeSortDirection (boolean ascending) {
    this.AssociationTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AssociationType (CMF_PACKAGE_OVERRIDES.association_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAssociationTypeSortDirection () {
    return this.AssociationTypeSortAscending;
  }
  /** Set the field level filters for field: AssociationType (CMF_PACKAGE_OVERRIDES.association_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAssociationTypeFilter (BigIntegerFilter[] value) throws ServiceException {
    this.AssociationType = value;
  }
  /** Retrieve filter for field: AssociationType (CMF_PACKAGE_OVERRIDES.association_type)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getAssociationTypeFilter () {
    return this.AssociationType;
  }

  /**
   * Retrieves the AssociationTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AssociationTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AssociationTypeFilter field
   */
  public String[] getAssociationTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAssociationTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAssociationTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAssociationTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AssociationTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAssociationTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AssociationTypeFilter filter value from a formatted string
   *
   * @param _value the AssociationTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AssociationTypeFilter filter field
   */
  public void setAssociationTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAssociationTypeFilterFromFormattedString");
    try {
      this.setAssociationTypeFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AssociationTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAssociationTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAssociationTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CurrencyCode (CMF_PACKAGE_OVERRIDES.currency_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCurrencyCodeFetch (boolean fetch) {
    this.CurrencyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CurrencyCode (CMF_PACKAGE_OVERRIDES.currency_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCurrencyCodeFetch () {
    return this.CurrencyCodeFetch;
  }
  /** Set the SortOrder for field: CurrencyCode (CMF_PACKAGE_OVERRIDES.currency_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCurrencyCodeSortOrder (Integer value) {
    this.CurrencyCodeSort = value;
  }
  /** Retrieve SortOrder for field: CurrencyCode (CMF_PACKAGE_OVERRIDES.currency_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCurrencyCodeSortOrder () {
    return this.CurrencyCodeSort;
  }
  /** Set the sort direction for field: CurrencyCode (CMF_PACKAGE_OVERRIDES.currency_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCurrencyCodeSortDirection (boolean ascending) {
    this.CurrencyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CurrencyCode (CMF_PACKAGE_OVERRIDES.currency_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCurrencyCodeSortDirection () {
    return this.CurrencyCodeSortAscending;
  }
  /** Set the field level filters for field: CurrencyCode (CMF_PACKAGE_OVERRIDES.currency_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCurrencyCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.CurrencyCode = value;
  }
  /** Retrieve filter for field: CurrencyCode (CMF_PACKAGE_OVERRIDES.currency_code)
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

  public String toString() {
    return PackageOverridesObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return PackageOverridesObjectKeyHelper.toMap(this, null);
  }
}
