/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AddressLocateXIDObjectFilter.java
 * Definition File: Catalog/AccountLocate.xml
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



import com.csgsystems.bali.BaliObjectFilter;

/** Filter object */
public class AddressLocateXIDObjectFilter extends AccountLocateObjectFilter  implements Serializable
{
  /** raw field for: SERVICE_ADDRESS_ASSOC.address_id) */
  public    BigIntegerFilter[] AddressId  = null;
  protected boolean AddressIdFetch = false;
  protected boolean AddressIdSortAscending = true;
  protected Integer AddressIdSort = null;
  /** raw field for: SERVICE_ADDRESS_ASSOC.emf_config_id) */
  public    IntegerFilter[] EmfConfigId  = null;
  protected boolean EmfConfigIdFetch = false;
  protected boolean EmfConfigIdSortAscending = true;
  protected Integer EmfConfigIdSort = null;
  /** raw field for: EXTERNAL_ID_ACCT_MAP.external_id) */
  public    StringFilter[] ExternalId  = null;
  protected boolean ExternalIdFetch = false;
  protected boolean ExternalIdSortAscending = true;
  protected boolean ExternalIdCaseInsensitive = false;
  protected Integer ExternalIdSort = null;
  /** raw field for: EXTERNAL_ID_ACCT_MAP.external_id_type) */
  public    IntegerFilter[] ExternalIdType  = null;
  protected boolean ExternalIdTypeFetch = false;
  protected boolean ExternalIdTypeSortAscending = true;
  protected Integer ExternalIdTypeSort = null;
  /** raw field for: EXTERNAL_ID_ACCT_MAP.active_date) */
  public    DateFilter[] ActiveDate  = null;
  protected boolean ActiveDateFetch = false;
  protected boolean ActiveDateSortAscending = true;
  protected Integer ActiveDateSort = null;
  /** raw field for: EXTERNAL_ID_ACCT_MAP.inactive_date) */
  public    DateFilter[] InactiveDate  = null;
  protected boolean InactiveDateFetch = false;
  protected boolean InactiveDateSortAscending = true;
  protected Integer InactiveDateSort = null;
  /** raw field for: SERVICE_ADDRESS_ASSOC.active_dt) */
  public    DateFilter[] AddressAssocActiveDt  = null;
  protected boolean AddressAssocActiveDtFetch = false;
  protected boolean AddressAssocActiveDtSortAscending = true;
  protected Integer AddressAssocActiveDtSort = null;
  /** raw field for: SERVICE_ADDRESS_ASSOC.inactive_dt) */
  public    DateFilter[] AddressAssocInactiveDt  = null;
  protected boolean AddressAssocInactiveDtFetch = false;
  protected boolean AddressAssocInactiveDtSortAscending = true;
  protected Integer AddressAssocInactiveDtSort = null;
  private String _objName = "AddressLocateXIDObjectFilter";
  /** default constructor */
  public AddressLocateXIDObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public AddressLocateXIDObjectFilter (AddressLocateXIDObjectFilter other)
  {
    super (other);
    if (other == null) return;
    this.AddressId = other.AddressId;
    this.AddressIdFetch = other.AddressIdFetch;
    this.AddressIdSort = other.AddressIdSort;
    this.AddressIdSortAscending = other.AddressIdSortAscending;
    this.EmfConfigId = other.EmfConfigId;
    this.EmfConfigIdFetch = other.EmfConfigIdFetch;
    this.EmfConfigIdSort = other.EmfConfigIdSort;
    this.EmfConfigIdSortAscending = other.EmfConfigIdSortAscending;
    this.ExternalId = other.ExternalId;
    this.ExternalIdFetch = other.ExternalIdFetch;
    this.ExternalIdSort = other.ExternalIdSort;
    this.ExternalIdCaseInsensitive = other.ExternalIdCaseInsensitive;
    this.ExternalIdSortAscending = other.ExternalIdSortAscending;
    this.ExternalIdType = other.ExternalIdType;
    this.ExternalIdTypeFetch = other.ExternalIdTypeFetch;
    this.ExternalIdTypeSort = other.ExternalIdTypeSort;
    this.ExternalIdTypeSortAscending = other.ExternalIdTypeSortAscending;
    this.ActiveDate = other.ActiveDate;
    this.ActiveDateFetch = other.ActiveDateFetch;
    this.ActiveDateSort = other.ActiveDateSort;
    this.ActiveDateSortAscending = other.ActiveDateSortAscending;
    this.InactiveDate = other.InactiveDate;
    this.InactiveDateFetch = other.InactiveDateFetch;
    this.InactiveDateSort = other.InactiveDateSort;
    this.InactiveDateSortAscending = other.InactiveDateSortAscending;
    this.AddressAssocActiveDt = other.AddressAssocActiveDt;
    this.AddressAssocActiveDtFetch = other.AddressAssocActiveDtFetch;
    this.AddressAssocActiveDtSort = other.AddressAssocActiveDtSort;
    this.AddressAssocActiveDtSortAscending = other.AddressAssocActiveDtSortAscending;
    this.AddressAssocInactiveDt = other.AddressAssocInactiveDt;
    this.AddressAssocInactiveDtFetch = other.AddressAssocInactiveDtFetch;
    this.AddressAssocInactiveDtSort = other.AddressAssocInactiveDtSort;
    this.AddressAssocInactiveDtSortAscending = other.AddressAssocInactiveDtSortAscending;  }
  /** Set the field level Fetch value for field: AddressId (SERVICE_ADDRESS_ASSOC.address_id)
   * @param fetch whether to fetch this field or not
   */
  public void setAddressIdFetch (boolean fetch) {
    this.AddressIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AddressId (SERVICE_ADDRESS_ASSOC.address_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getAddressIdFetch () {
    return this.AddressIdFetch;
  }
  /** Set the SortOrder for field: AddressId (SERVICE_ADDRESS_ASSOC.address_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAddressIdSortOrder (Integer value) {
    this.AddressIdSort = value;
  }
  /** Retrieve SortOrder for field: AddressId (SERVICE_ADDRESS_ASSOC.address_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAddressIdSortOrder () {
    return this.AddressIdSort;
  }
  /** Set the sort direction for field: AddressId (SERVICE_ADDRESS_ASSOC.address_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAddressIdSortDirection (boolean ascending) {
    this.AddressIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AddressId (SERVICE_ADDRESS_ASSOC.address_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAddressIdSortDirection () {
    return this.AddressIdSortAscending;
  }
  /** Set the field level filters for field: AddressId (SERVICE_ADDRESS_ASSOC.address_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAddressIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.AddressId = value;
  }
  /** Retrieve filter for field: AddressId (SERVICE_ADDRESS_ASSOC.address_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getAddressIdFilter () {
    return this.AddressId;
  }

  /**
   * Retrieves the AddressIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AddressIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AddressIdFilter field
   */
  public String[] getAddressIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAddressIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAddressIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAddressIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AddressIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAddressIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AddressIdFilter filter value from a formatted string
   *
   * @param _value the AddressIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AddressIdFilter filter field
   */
  public void setAddressIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAddressIdFilterFromFormattedString");
    try {
      this.setAddressIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AddressIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAddressIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAddressIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: EmfConfigId (SERVICE_ADDRESS_ASSOC.emf_config_id)
   * @param fetch whether to fetch this field or not
   */
  public void setEmfConfigIdFetch (boolean fetch) {
    this.EmfConfigIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: EmfConfigId (SERVICE_ADDRESS_ASSOC.emf_config_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getEmfConfigIdFetch () {
    return this.EmfConfigIdFetch;
  }
  /** Set the SortOrder for field: EmfConfigId (SERVICE_ADDRESS_ASSOC.emf_config_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEmfConfigIdSortOrder (Integer value) {
    this.EmfConfigIdSort = value;
  }
  /** Retrieve SortOrder for field: EmfConfigId (SERVICE_ADDRESS_ASSOC.emf_config_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEmfConfigIdSortOrder () {
    return this.EmfConfigIdSort;
  }
  /** Set the sort direction for field: EmfConfigId (SERVICE_ADDRESS_ASSOC.emf_config_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEmfConfigIdSortDirection (boolean ascending) {
    this.EmfConfigIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EmfConfigId (SERVICE_ADDRESS_ASSOC.emf_config_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEmfConfigIdSortDirection () {
    return this.EmfConfigIdSortAscending;
  }
  /** Set the field level filters for field: EmfConfigId (SERVICE_ADDRESS_ASSOC.emf_config_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEmfConfigIdFilter (IntegerFilter[] value) throws ServiceException {
    this.EmfConfigId = value;
  }
  /** Retrieve filter for field: EmfConfigId (SERVICE_ADDRESS_ASSOC.emf_config_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getEmfConfigIdFilter () {
    return this.EmfConfigId;
  }

  /**
   * Retrieves the EmfConfigIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EmfConfigIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EmfConfigIdFilter field
   */
  public String[] getEmfConfigIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEmfConfigIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEmfConfigIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEmfConfigIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EmfConfigIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEmfConfigIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EmfConfigIdFilter filter value from a formatted string
   *
   * @param _value the EmfConfigIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EmfConfigIdFilter filter field
   */
  public void setEmfConfigIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEmfConfigIdFilterFromFormattedString");
    try {
      this.setEmfConfigIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EmfConfigIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEmfConfigIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEmfConfigIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ExternalId (EXTERNAL_ID_ACCT_MAP.external_id)
   * @param fetch whether to fetch this field or not
   */
  public void setExternalIdFetch (boolean fetch) {
    this.ExternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ExternalId (EXTERNAL_ID_ACCT_MAP.external_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getExternalIdFetch () {
    return this.ExternalIdFetch;
  }
  /** Set the SortOrder for field: ExternalId (EXTERNAL_ID_ACCT_MAP.external_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setExternalIdSortOrder (Integer value) {
    this.ExternalIdSort = value;
  }
  /** Retrieve SortOrder for field: ExternalId (EXTERNAL_ID_ACCT_MAP.external_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getExternalIdSortOrder () {
    return this.ExternalIdSort;
  }
  /** Set the sort direction for field: ExternalId (EXTERNAL_ID_ACCT_MAP.external_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setExternalIdSortDirection (boolean ascending) {
    this.ExternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ExternalId (EXTERNAL_ID_ACCT_MAP.external_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getExternalIdSortDirection () {
    return this.ExternalIdSortAscending;
  }
  /** Set the case insensitive for field: ExternalId (EXTERNAL_ID_ACCT_MAP.external_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setExternalIdCaseInsensitive (boolean ascending) {
    this.ExternalIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ExternalId (EXTERNAL_ID_ACCT_MAP.external_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getExternalIdCaseInsensitive () {
    return this.ExternalIdCaseInsensitive;
  }
  /** Set the field level filters for field: ExternalId (EXTERNAL_ID_ACCT_MAP.external_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setExternalIdFilter (StringFilter[] value) throws ServiceException {
    this.ExternalId = value;
  }
  /** Retrieve filter for field: ExternalId (EXTERNAL_ID_ACCT_MAP.external_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getExternalIdFilter () {
    return this.ExternalId;
  }

  /**
   * Retrieves the ExternalIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ExternalIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExternalIdFilter field
   */
  public String[] getExternalIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getExternalIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getExternalIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ExternalIdFilter filter value from a formatted string
   *
   * @param _value the ExternalIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ExternalIdFilter filter field
   */
  public void setExternalIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setExternalIdFilterFromFormattedString");
    try {
      this.setExternalIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setExternalIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExternalIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ExternalIdType (EXTERNAL_ID_ACCT_MAP.external_id_type)
   * @param fetch whether to fetch this field or not
   */
  public void setExternalIdTypeFetch (boolean fetch) {
    this.ExternalIdTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ExternalIdType (EXTERNAL_ID_ACCT_MAP.external_id_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getExternalIdTypeFetch () {
    return this.ExternalIdTypeFetch;
  }
  /** Set the SortOrder for field: ExternalIdType (EXTERNAL_ID_ACCT_MAP.external_id_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setExternalIdTypeSortOrder (Integer value) {
    this.ExternalIdTypeSort = value;
  }
  /** Retrieve SortOrder for field: ExternalIdType (EXTERNAL_ID_ACCT_MAP.external_id_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getExternalIdTypeSortOrder () {
    return this.ExternalIdTypeSort;
  }
  /** Set the sort direction for field: ExternalIdType (EXTERNAL_ID_ACCT_MAP.external_id_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setExternalIdTypeSortDirection (boolean ascending) {
    this.ExternalIdTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ExternalIdType (EXTERNAL_ID_ACCT_MAP.external_id_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getExternalIdTypeSortDirection () {
    return this.ExternalIdTypeSortAscending;
  }
  /** Set the field level filters for field: ExternalIdType (EXTERNAL_ID_ACCT_MAP.external_id_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setExternalIdTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.ExternalIdType = value;
  }
  /** Retrieve filter for field: ExternalIdType (EXTERNAL_ID_ACCT_MAP.external_id_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getExternalIdTypeFilter () {
    return this.ExternalIdType;
  }

  /**
   * Retrieves the ExternalIdTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ExternalIdTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExternalIdTypeFilter field
   */
  public String[] getExternalIdTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalIdTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getExternalIdTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalIdTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getExternalIdTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ExternalIdTypeFilter filter value from a formatted string
   *
   * @param _value the ExternalIdTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ExternalIdTypeFilter filter field
   */
  public void setExternalIdTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setExternalIdTypeFilterFromFormattedString");
    try {
      this.setExternalIdTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setExternalIdTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExternalIdTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ActiveDate (EXTERNAL_ID_ACCT_MAP.active_date)
   * @param fetch whether to fetch this field or not
   */
  public void setActiveDateFetch (boolean fetch) {
    this.ActiveDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: ActiveDate (EXTERNAL_ID_ACCT_MAP.active_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getActiveDateFetch () {
    return this.ActiveDateFetch;
  }
  /** Set the SortOrder for field: ActiveDate (EXTERNAL_ID_ACCT_MAP.active_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setActiveDateSortOrder (Integer value) {
    this.ActiveDateSort = value;
  }
  /** Retrieve SortOrder for field: ActiveDate (EXTERNAL_ID_ACCT_MAP.active_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getActiveDateSortOrder () {
    return this.ActiveDateSort;
  }
  /** Set the sort direction for field: ActiveDate (EXTERNAL_ID_ACCT_MAP.active_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setActiveDateSortDirection (boolean ascending) {
    this.ActiveDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ActiveDate (EXTERNAL_ID_ACCT_MAP.active_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getActiveDateSortDirection () {
    return this.ActiveDateSortAscending;
  }
  /** Set the field level filters for field: ActiveDate (EXTERNAL_ID_ACCT_MAP.active_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setActiveDateFilter (DateFilter[] value) throws ServiceException {
    this.ActiveDate = value;
  }
  /** Retrieve filter for field: ActiveDate (EXTERNAL_ID_ACCT_MAP.active_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getActiveDateFilter () {
    return this.ActiveDate;
  }

  /**
   * Retrieves the ActiveDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ActiveDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActiveDateFilter field
   */
  public String[] getActiveDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getActiveDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActiveDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getActiveDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ActiveDateFilter filter value from a formatted string
   *
   * @param _value the ActiveDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ActiveDateFilter filter field
   */
  public void setActiveDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setActiveDateFilterFromFormattedString");
    try {
      this.setActiveDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setActiveDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setActiveDateFilterFromFormattedString");
  }

  /**
   * Retrieves the ActiveDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ActiveDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActiveDateFilter field
   */
  public String[] getActiveDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getActiveDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActiveDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getActiveDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ActiveDateFilter filter value from a formatted string
   *
   * @param _value the ActiveDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ActiveDateFilter filter field
   */
  public void setActiveDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setActiveDateFilterFromFormattedDateTimeString");
    try {
      this.setActiveDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setActiveDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setActiveDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: InactiveDate (EXTERNAL_ID_ACCT_MAP.inactive_date)
   * @param fetch whether to fetch this field or not
   */
  public void setInactiveDateFetch (boolean fetch) {
    this.InactiveDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: InactiveDate (EXTERNAL_ID_ACCT_MAP.inactive_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getInactiveDateFetch () {
    return this.InactiveDateFetch;
  }
  /** Set the SortOrder for field: InactiveDate (EXTERNAL_ID_ACCT_MAP.inactive_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInactiveDateSortOrder (Integer value) {
    this.InactiveDateSort = value;
  }
  /** Retrieve SortOrder for field: InactiveDate (EXTERNAL_ID_ACCT_MAP.inactive_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInactiveDateSortOrder () {
    return this.InactiveDateSort;
  }
  /** Set the sort direction for field: InactiveDate (EXTERNAL_ID_ACCT_MAP.inactive_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInactiveDateSortDirection (boolean ascending) {
    this.InactiveDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InactiveDate (EXTERNAL_ID_ACCT_MAP.inactive_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInactiveDateSortDirection () {
    return this.InactiveDateSortAscending;
  }
  /** Set the field level filters for field: InactiveDate (EXTERNAL_ID_ACCT_MAP.inactive_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInactiveDateFilter (DateFilter[] value) throws ServiceException {
    this.InactiveDate = value;
  }
  /** Retrieve filter for field: InactiveDate (EXTERNAL_ID_ACCT_MAP.inactive_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getInactiveDateFilter () {
    return this.InactiveDate;
  }

  /**
   * Retrieves the InactiveDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InactiveDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InactiveDateFilter field
   */
  public String[] getInactiveDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getInactiveDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInactiveDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInactiveDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the InactiveDateFilter filter value from a formatted string
   *
   * @param _value the InactiveDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the InactiveDateFilter filter field
   */
  public void setInactiveDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInactiveDateFilterFromFormattedString");
    try {
      this.setInactiveDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInactiveDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInactiveDateFilterFromFormattedString");
  }

  /**
   * Retrieves the InactiveDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InactiveDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the InactiveDateFilter field
   */
  public String[] getInactiveDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getInactiveDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInactiveDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInactiveDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the InactiveDateFilter filter value from a formatted string
   *
   * @param _value the InactiveDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the InactiveDateFilter filter field
   */
  public void setInactiveDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInactiveDateFilterFromFormattedDateTimeString");
    try {
      this.setInactiveDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInactiveDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInactiveDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: AddressAssocActiveDt (SERVICE_ADDRESS_ASSOC.active_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setAddressAssocActiveDtFetch (boolean fetch) {
    this.AddressAssocActiveDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: AddressAssocActiveDt (SERVICE_ADDRESS_ASSOC.active_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getAddressAssocActiveDtFetch () {
    return this.AddressAssocActiveDtFetch;
  }
  /** Set the SortOrder for field: AddressAssocActiveDt (SERVICE_ADDRESS_ASSOC.active_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAddressAssocActiveDtSortOrder (Integer value) {
    this.AddressAssocActiveDtSort = value;
  }
  /** Retrieve SortOrder for field: AddressAssocActiveDt (SERVICE_ADDRESS_ASSOC.active_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAddressAssocActiveDtSortOrder () {
    return this.AddressAssocActiveDtSort;
  }
  /** Set the sort direction for field: AddressAssocActiveDt (SERVICE_ADDRESS_ASSOC.active_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAddressAssocActiveDtSortDirection (boolean ascending) {
    this.AddressAssocActiveDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AddressAssocActiveDt (SERVICE_ADDRESS_ASSOC.active_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAddressAssocActiveDtSortDirection () {
    return this.AddressAssocActiveDtSortAscending;
  }
  /** Set the field level filters for field: AddressAssocActiveDt (SERVICE_ADDRESS_ASSOC.active_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAddressAssocActiveDtFilter (DateFilter[] value) throws ServiceException {
    this.AddressAssocActiveDt = value;
  }
  /** Retrieve filter for field: AddressAssocActiveDt (SERVICE_ADDRESS_ASSOC.active_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getAddressAssocActiveDtFilter () {
    return this.AddressAssocActiveDt;
  }

  /**
   * Retrieves the AddressAssocActiveDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AddressAssocActiveDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AddressAssocActiveDtFilter field
   */
  public String[] getAddressAssocActiveDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAddressAssocActiveDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAddressAssocActiveDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAddressAssocActiveDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AddressAssocActiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAddressAssocActiveDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AddressAssocActiveDtFilter filter value from a formatted string
   *
   * @param _value the AddressAssocActiveDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AddressAssocActiveDtFilter filter field
   */
  public void setAddressAssocActiveDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAddressAssocActiveDtFilterFromFormattedString");
    try {
      this.setAddressAssocActiveDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AddressAssocActiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAddressAssocActiveDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAddressAssocActiveDtFilterFromFormattedString");
  }

  /**
   * Retrieves the AddressAssocActiveDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AddressAssocActiveDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the AddressAssocActiveDtFilter field
   */
  public String[] getAddressAssocActiveDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAddressAssocActiveDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAddressAssocActiveDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAddressAssocActiveDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AddressAssocActiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAddressAssocActiveDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the AddressAssocActiveDtFilter filter value from a formatted string
   *
   * @param _value the AddressAssocActiveDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AddressAssocActiveDtFilter filter field
   */
  public void setAddressAssocActiveDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAddressAssocActiveDtFilterFromFormattedDateTimeString");
    try {
      this.setAddressAssocActiveDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AddressAssocActiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAddressAssocActiveDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAddressAssocActiveDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: AddressAssocInactiveDt (SERVICE_ADDRESS_ASSOC.inactive_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setAddressAssocInactiveDtFetch (boolean fetch) {
    this.AddressAssocInactiveDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: AddressAssocInactiveDt (SERVICE_ADDRESS_ASSOC.inactive_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getAddressAssocInactiveDtFetch () {
    return this.AddressAssocInactiveDtFetch;
  }
  /** Set the SortOrder for field: AddressAssocInactiveDt (SERVICE_ADDRESS_ASSOC.inactive_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAddressAssocInactiveDtSortOrder (Integer value) {
    this.AddressAssocInactiveDtSort = value;
  }
  /** Retrieve SortOrder for field: AddressAssocInactiveDt (SERVICE_ADDRESS_ASSOC.inactive_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAddressAssocInactiveDtSortOrder () {
    return this.AddressAssocInactiveDtSort;
  }
  /** Set the sort direction for field: AddressAssocInactiveDt (SERVICE_ADDRESS_ASSOC.inactive_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAddressAssocInactiveDtSortDirection (boolean ascending) {
    this.AddressAssocInactiveDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AddressAssocInactiveDt (SERVICE_ADDRESS_ASSOC.inactive_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAddressAssocInactiveDtSortDirection () {
    return this.AddressAssocInactiveDtSortAscending;
  }
  /** Set the field level filters for field: AddressAssocInactiveDt (SERVICE_ADDRESS_ASSOC.inactive_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAddressAssocInactiveDtFilter (DateFilter[] value) throws ServiceException {
    this.AddressAssocInactiveDt = value;
  }
  /** Retrieve filter for field: AddressAssocInactiveDt (SERVICE_ADDRESS_ASSOC.inactive_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getAddressAssocInactiveDtFilter () {
    return this.AddressAssocInactiveDt;
  }

  /**
   * Retrieves the AddressAssocInactiveDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AddressAssocInactiveDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AddressAssocInactiveDtFilter field
   */
  public String[] getAddressAssocInactiveDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAddressAssocInactiveDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAddressAssocInactiveDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAddressAssocInactiveDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AddressAssocInactiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAddressAssocInactiveDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AddressAssocInactiveDtFilter filter value from a formatted string
   *
   * @param _value the AddressAssocInactiveDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AddressAssocInactiveDtFilter filter field
   */
  public void setAddressAssocInactiveDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAddressAssocInactiveDtFilterFromFormattedString");
    try {
      this.setAddressAssocInactiveDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AddressAssocInactiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAddressAssocInactiveDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAddressAssocInactiveDtFilterFromFormattedString");
  }

  /**
   * Retrieves the AddressAssocInactiveDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AddressAssocInactiveDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the AddressAssocInactiveDtFilter field
   */
  public String[] getAddressAssocInactiveDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAddressAssocInactiveDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAddressAssocInactiveDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAddressAssocInactiveDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AddressAssocInactiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAddressAssocInactiveDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the AddressAssocInactiveDtFilter filter value from a formatted string
   *
   * @param _value the AddressAssocInactiveDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AddressAssocInactiveDtFilter filter field
   */
  public void setAddressAssocInactiveDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAddressAssocInactiveDtFilterFromFormattedDateTimeString");
    try {
      this.setAddressAssocInactiveDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AddressAssocInactiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAddressAssocInactiveDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAddressAssocInactiveDtFilterFromFormattedDateTimeString");
  }


  /** Constructor to copy base class fields. 
   * @param other the object to copy
   */
  public AddressLocateXIDObjectFilter (AccountLocateObjectFilter other)
  {
    super (other);

  }

  public String toString() {
    return AddressLocateXIDObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return AddressLocateXIDObjectHelper.toMap(this, null);
  }
}
