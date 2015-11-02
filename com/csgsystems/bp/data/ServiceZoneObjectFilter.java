/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ServiceZoneObjectFilter.java
 * Definition File: Customer/ServiceZone.xml
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
public class ServiceZoneObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public ServiceZoneObjectKeyFilter Key = null;
  /** raw field for: CUSTOMER_ID_EQUIP_MAP_VIEW.external_id) */
  public    StringFilter[] ServiceExternalId  = null;
  protected boolean ServiceExternalIdFetch = false;
  protected boolean ServiceExternalIdSortAscending = true;
  protected boolean ServiceExternalIdCaseInsensitive = false;
  protected Integer ServiceExternalIdSort = null;
  /** raw field for: CUSTOMER_ID_EQUIP_MAP_VIEW.external_id_type) */
  public    IntegerFilter[] ServiceExternalIdType  = null;
  protected boolean ServiceExternalIdTypeFetch = false;
  protected boolean ServiceExternalIdTypeSortAscending = true;
  protected Integer ServiceExternalIdTypeSort = null;
  /** raw field for: SERVICE_ZONE.zone_id) */
  public    IntegerFilter[] ZoneId  = null;
  protected boolean ZoneIdFetch = false;
  protected boolean ZoneIdSortAscending = true;
  protected Integer ZoneIdSort = null;
  /** raw field for: SERVICE_ZONE.subscr_no) */
  public    IntegerFilter[] ServiceInternalId  = null;
  protected boolean ServiceInternalIdFetch = false;
  protected boolean ServiceInternalIdSortAscending = true;
  protected Integer ServiceInternalIdSort = null;
  /** raw field for: SERVICE_ZONE.subscr_no_resets) */
  public    IntegerFilter[] ServiceInternalIdResets  = null;
  protected boolean ServiceInternalIdResetsFetch = false;
  protected boolean ServiceInternalIdResetsSortAscending = true;
  protected Integer ServiceInternalIdResetsSort = null;
  /** raw field for: SERVICE_ZONE.element_id) */
  public    IntegerFilter[] ElementId  = null;
  protected boolean ElementIdFetch = false;
  protected boolean ElementIdSortAscending = true;
  protected Integer ElementIdSort = null;
  /** raw field for: SERVICE_ZONE.active_dt) */
  public    DateFilter[] ActiveDt  = null;
  protected boolean ActiveDtFetch = false;
  protected boolean ActiveDtSortAscending = true;
  protected Integer ActiveDtSort = null;
  /** raw field for: SERVICE_ZONE.inactive_dt) */
  public    DateFilter[] InactiveDt  = null;
  protected boolean InactiveDtFetch = false;
  protected boolean InactiveDtSortAscending = true;
  protected Integer InactiveDtSort = null;
  private String _objName = "ServiceZoneObjectFilter";
  /** default constructor */
  public ServiceZoneObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public ServiceZoneObjectFilter (ServiceZoneObjectFilter other)
  {
    if (other == null) return;
    this.Key = new ServiceZoneObjectKeyFilter (other.Key);
    this.ServiceExternalId = other.ServiceExternalId;
    this.ServiceExternalIdFetch = other.ServiceExternalIdFetch;
    this.ServiceExternalIdSort = other.ServiceExternalIdSort;
    this.ServiceExternalIdCaseInsensitive = other.ServiceExternalIdCaseInsensitive;
    this.ServiceExternalIdSortAscending = other.ServiceExternalIdSortAscending;
    this.ServiceExternalIdType = other.ServiceExternalIdType;
    this.ServiceExternalIdTypeFetch = other.ServiceExternalIdTypeFetch;
    this.ServiceExternalIdTypeSort = other.ServiceExternalIdTypeSort;
    this.ServiceExternalIdTypeSortAscending = other.ServiceExternalIdTypeSortAscending;
    this.ZoneId = other.ZoneId;
    this.ZoneIdFetch = other.ZoneIdFetch;
    this.ZoneIdSort = other.ZoneIdSort;
    this.ZoneIdSortAscending = other.ZoneIdSortAscending;
    this.ServiceInternalId = other.ServiceInternalId;
    this.ServiceInternalIdFetch = other.ServiceInternalIdFetch;
    this.ServiceInternalIdSort = other.ServiceInternalIdSort;
    this.ServiceInternalIdSortAscending = other.ServiceInternalIdSortAscending;
    this.ServiceInternalIdResets = other.ServiceInternalIdResets;
    this.ServiceInternalIdResetsFetch = other.ServiceInternalIdResetsFetch;
    this.ServiceInternalIdResetsSort = other.ServiceInternalIdResetsSort;
    this.ServiceInternalIdResetsSortAscending = other.ServiceInternalIdResetsSortAscending;
    this.ElementId = other.ElementId;
    this.ElementIdFetch = other.ElementIdFetch;
    this.ElementIdSort = other.ElementIdSort;
    this.ElementIdSortAscending = other.ElementIdSortAscending;
    this.ActiveDt = other.ActiveDt;
    this.ActiveDtFetch = other.ActiveDtFetch;
    this.ActiveDtSort = other.ActiveDtSort;
    this.ActiveDtSortAscending = other.ActiveDtSortAscending;
    this.InactiveDt = other.InactiveDt;
    this.InactiveDtFetch = other.InactiveDtFetch;
    this.InactiveDtSort = other.InactiveDtSort;
    this.InactiveDtSortAscending = other.InactiveDtSortAscending;  }
  /** get the filter for this object's key
   * @return ServiceZoneObjectKeyFilter
   */
  public ServiceZoneObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (ServiceZoneObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: TrackingId (SERVICE_ZONE.tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new ServiceZoneObjectKeyFilter ();
    this.Key.TrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingId (SERVICE_ZONE.tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdFetch;
  }
  /** Set the SortOrder for field: TrackingId (SERVICE_ZONE.tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new ServiceZoneObjectKeyFilter ();
    this.Key.TrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: TrackingId (SERVICE_ZONE.tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdSort;
  }
  /** Set the sort direction for field: TrackingId (SERVICE_ZONE.tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new ServiceZoneObjectKeyFilter ();
    this.Key.TrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingId (SERVICE_ZONE.tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdSortAscending;
  }
  /** Set the field level filters for field: TrackingId (SERVICE_ZONE.tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new ServiceZoneObjectKeyFilter ();
    this.Key.TrackingId = value;
  }
  /** Retrieve filter for field: TrackingId (SERVICE_ZONE.tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingId;
  }
  /** Set the field level Fetch value for field: TrackingIdServ (SERVICE_ZONE.tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdServFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new ServiceZoneObjectKeyFilter ();
    this.Key.TrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingIdServ (SERVICE_ZONE.tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdServFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdServFetch;
  }
  /** Set the SortOrder for field: TrackingIdServ (SERVICE_ZONE.tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdServSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new ServiceZoneObjectKeyFilter ();
    this.Key.TrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: TrackingIdServ (SERVICE_ZONE.tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdServSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServSort;
  }
  /** Set the sort direction for field: TrackingIdServ (SERVICE_ZONE.tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdServSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new ServiceZoneObjectKeyFilter ();
    this.Key.TrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingIdServ (SERVICE_ZONE.tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdServSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdServSortAscending;
  }
  /** Set the field level filters for field: TrackingIdServ (SERVICE_ZONE.tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdServFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new ServiceZoneObjectKeyFilter ();
    this.Key.TrackingIdServ = value;
  }
  /** Retrieve filter for field: TrackingIdServ (SERVICE_ZONE.tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdServFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServ;
  }
  /** Set the field level Fetch value for field: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceExternalIdFetch (boolean fetch) {
    this.ServiceExternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceExternalIdFetch () {
    return this.ServiceExternalIdFetch;
  }
  /** Set the SortOrder for field: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceExternalIdSortOrder (Integer value) {
    this.ServiceExternalIdSort = value;
  }
  /** Retrieve SortOrder for field: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceExternalIdSortOrder () {
    return this.ServiceExternalIdSort;
  }
  /** Set the sort direction for field: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceExternalIdSortDirection (boolean ascending) {
    this.ServiceExternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceExternalIdSortDirection () {
    return this.ServiceExternalIdSortAscending;
  }
  /** Set the case insensitive for field: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setServiceExternalIdCaseInsensitive (boolean ascending) {
    this.ServiceExternalIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getServiceExternalIdCaseInsensitive () {
    return this.ServiceExternalIdCaseInsensitive;
  }
  /** Set the field level filters for field: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceExternalIdFilter (StringFilter[] value) throws ServiceException {
    this.ServiceExternalId = value;
  }
  /** Retrieve filter for field: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id)
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

  /** Set the field level Fetch value for field: ServiceExternalIdType (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id_type)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceExternalIdTypeFetch (boolean fetch) {
    this.ServiceExternalIdTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceExternalIdType (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceExternalIdTypeFetch () {
    return this.ServiceExternalIdTypeFetch;
  }
  /** Set the SortOrder for field: ServiceExternalIdType (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceExternalIdTypeSortOrder (Integer value) {
    this.ServiceExternalIdTypeSort = value;
  }
  /** Retrieve SortOrder for field: ServiceExternalIdType (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceExternalIdTypeSortOrder () {
    return this.ServiceExternalIdTypeSort;
  }
  /** Set the sort direction for field: ServiceExternalIdType (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceExternalIdTypeSortDirection (boolean ascending) {
    this.ServiceExternalIdTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceExternalIdType (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceExternalIdTypeSortDirection () {
    return this.ServiceExternalIdTypeSortAscending;
  }
  /** Set the field level filters for field: ServiceExternalIdType (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceExternalIdTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.ServiceExternalIdType = value;
  }
  /** Retrieve filter for field: ServiceExternalIdType (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id_type)
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

  /**
   * Retrieves the display value for the enumerated ServiceExternalIdTypeFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the ServiceExternalIdTypeFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ServiceExternalIdTypeFilter filter field
   */
  public String[] getServiceExternalIdTypeFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceExternalIdTypeFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getServiceExternalIdTypeFilter(), "ExternalIdType", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceExternalIdTypeFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceExternalIdTypeFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated ServiceExternalIdTypeFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the ServiceExternalIdTypeFilter filter field
   */
  public void setServiceExternalIdTypeFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceExternalIdTypeFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setServiceExternalIdTypeFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "ServiceExternalIdType", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceExternalIdTypeFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceExternalIdTypeFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: ZoneId (SERVICE_ZONE.zone_id)
   * @param fetch whether to fetch this field or not
   */
  public void setZoneIdFetch (boolean fetch) {
    this.ZoneIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ZoneId (SERVICE_ZONE.zone_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getZoneIdFetch () {
    return this.ZoneIdFetch;
  }
  /** Set the SortOrder for field: ZoneId (SERVICE_ZONE.zone_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setZoneIdSortOrder (Integer value) {
    this.ZoneIdSort = value;
  }
  /** Retrieve SortOrder for field: ZoneId (SERVICE_ZONE.zone_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getZoneIdSortOrder () {
    return this.ZoneIdSort;
  }
  /** Set the sort direction for field: ZoneId (SERVICE_ZONE.zone_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setZoneIdSortDirection (boolean ascending) {
    this.ZoneIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ZoneId (SERVICE_ZONE.zone_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getZoneIdSortDirection () {
    return this.ZoneIdSortAscending;
  }
  /** Set the field level filters for field: ZoneId (SERVICE_ZONE.zone_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setZoneIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ZoneId = value;
  }
  /** Retrieve filter for field: ZoneId (SERVICE_ZONE.zone_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getZoneIdFilter () {
    return this.ZoneId;
  }

  /**
   * Retrieves the ZoneIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ZoneIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ZoneIdFilter field
   */
  public String[] getZoneIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getZoneIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getZoneIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getZoneIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ZoneIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getZoneIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ZoneIdFilter filter value from a formatted string
   *
   * @param _value the ZoneIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ZoneIdFilter filter field
   */
  public void setZoneIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setZoneIdFilterFromFormattedString");
    try {
      this.setZoneIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ZoneIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setZoneIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setZoneIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ServiceInternalId (SERVICE_ZONE.subscr_no)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceInternalIdFetch (boolean fetch) {
    this.ServiceInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceInternalId (SERVICE_ZONE.subscr_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceInternalIdFetch () {
    return this.ServiceInternalIdFetch;
  }
  /** Set the SortOrder for field: ServiceInternalId (SERVICE_ZONE.subscr_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceInternalIdSortOrder (Integer value) {
    this.ServiceInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: ServiceInternalId (SERVICE_ZONE.subscr_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceInternalIdSortOrder () {
    return this.ServiceInternalIdSort;
  }
  /** Set the sort direction for field: ServiceInternalId (SERVICE_ZONE.subscr_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceInternalIdSortDirection (boolean ascending) {
    this.ServiceInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceInternalId (SERVICE_ZONE.subscr_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceInternalIdSortDirection () {
    return this.ServiceInternalIdSortAscending;
  }
  /** Set the field level filters for field: ServiceInternalId (SERVICE_ZONE.subscr_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ServiceInternalId = value;
  }
  /** Retrieve filter for field: ServiceInternalId (SERVICE_ZONE.subscr_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getServiceInternalIdFilter () {
    return this.ServiceInternalId;
  }

  /**
   * Retrieves the ServiceInternalIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServiceInternalIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceInternalIdFilter field
   */
  public String[] getServiceInternalIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceInternalIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getServiceInternalIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceInternalIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceInternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceInternalIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ServiceInternalIdFilter filter value from a formatted string
   *
   * @param _value the ServiceInternalIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ServiceInternalIdFilter filter field
   */
  public void setServiceInternalIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceInternalIdFilterFromFormattedString");
    try {
      this.setServiceInternalIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceInternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceInternalIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceInternalIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ServiceInternalIdResets (SERVICE_ZONE.subscr_no_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceInternalIdResetsFetch (boolean fetch) {
    this.ServiceInternalIdResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceInternalIdResets (SERVICE_ZONE.subscr_no_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceInternalIdResetsFetch () {
    return this.ServiceInternalIdResetsFetch;
  }
  /** Set the SortOrder for field: ServiceInternalIdResets (SERVICE_ZONE.subscr_no_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceInternalIdResetsSortOrder (Integer value) {
    this.ServiceInternalIdResetsSort = value;
  }
  /** Retrieve SortOrder for field: ServiceInternalIdResets (SERVICE_ZONE.subscr_no_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceInternalIdResetsSortOrder () {
    return this.ServiceInternalIdResetsSort;
  }
  /** Set the sort direction for field: ServiceInternalIdResets (SERVICE_ZONE.subscr_no_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceInternalIdResetsSortDirection (boolean ascending) {
    this.ServiceInternalIdResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceInternalIdResets (SERVICE_ZONE.subscr_no_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceInternalIdResetsSortDirection () {
    return this.ServiceInternalIdResetsSortAscending;
  }
  /** Set the field level filters for field: ServiceInternalIdResets (SERVICE_ZONE.subscr_no_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceInternalIdResetsFilter (IntegerFilter[] value) throws ServiceException {
    this.ServiceInternalIdResets = value;
  }
  /** Retrieve filter for field: ServiceInternalIdResets (SERVICE_ZONE.subscr_no_resets)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getServiceInternalIdResetsFilter () {
    return this.ServiceInternalIdResets;
  }

  /**
   * Retrieves the ServiceInternalIdResetsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServiceInternalIdResetsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceInternalIdResetsFilter field
   */
  public String[] getServiceInternalIdResetsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceInternalIdResetsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getServiceInternalIdResetsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceInternalIdResetsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceInternalIdResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceInternalIdResetsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ServiceInternalIdResetsFilter filter value from a formatted string
   *
   * @param _value the ServiceInternalIdResetsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ServiceInternalIdResetsFilter filter field
   */
  public void setServiceInternalIdResetsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceInternalIdResetsFilterFromFormattedString");
    try {
      this.setServiceInternalIdResetsFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceInternalIdResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceInternalIdResetsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceInternalIdResetsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ElementId (SERVICE_ZONE.element_id)
   * @param fetch whether to fetch this field or not
   */
  public void setElementIdFetch (boolean fetch) {
    this.ElementIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ElementId (SERVICE_ZONE.element_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getElementIdFetch () {
    return this.ElementIdFetch;
  }
  /** Set the SortOrder for field: ElementId (SERVICE_ZONE.element_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setElementIdSortOrder (Integer value) {
    this.ElementIdSort = value;
  }
  /** Retrieve SortOrder for field: ElementId (SERVICE_ZONE.element_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getElementIdSortOrder () {
    return this.ElementIdSort;
  }
  /** Set the sort direction for field: ElementId (SERVICE_ZONE.element_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setElementIdSortDirection (boolean ascending) {
    this.ElementIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ElementId (SERVICE_ZONE.element_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getElementIdSortDirection () {
    return this.ElementIdSortAscending;
  }
  /** Set the field level filters for field: ElementId (SERVICE_ZONE.element_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setElementIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ElementId = value;
  }
  /** Retrieve filter for field: ElementId (SERVICE_ZONE.element_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getElementIdFilter () {
    return this.ElementId;
  }

  /**
   * Retrieves the ElementIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ElementIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ElementIdFilter field
   */
  public String[] getElementIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getElementIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getElementIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getElementIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ElementIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getElementIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ElementIdFilter filter value from a formatted string
   *
   * @param _value the ElementIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ElementIdFilter filter field
   */
  public void setElementIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setElementIdFilterFromFormattedString");
    try {
      this.setElementIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ElementIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setElementIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setElementIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ActiveDt (SERVICE_ZONE.active_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setActiveDtFetch (boolean fetch) {
    this.ActiveDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: ActiveDt (SERVICE_ZONE.active_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getActiveDtFetch () {
    return this.ActiveDtFetch;
  }
  /** Set the SortOrder for field: ActiveDt (SERVICE_ZONE.active_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setActiveDtSortOrder (Integer value) {
    this.ActiveDtSort = value;
  }
  /** Retrieve SortOrder for field: ActiveDt (SERVICE_ZONE.active_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getActiveDtSortOrder () {
    return this.ActiveDtSort;
  }
  /** Set the sort direction for field: ActiveDt (SERVICE_ZONE.active_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setActiveDtSortDirection (boolean ascending) {
    this.ActiveDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ActiveDt (SERVICE_ZONE.active_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getActiveDtSortDirection () {
    return this.ActiveDtSortAscending;
  }
  /** Set the field level filters for field: ActiveDt (SERVICE_ZONE.active_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setActiveDtFilter (DateFilter[] value) throws ServiceException {
    this.ActiveDt = value;
  }
  /** Retrieve filter for field: ActiveDt (SERVICE_ZONE.active_dt)
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


  /** Set the field level Fetch value for field: InactiveDt (SERVICE_ZONE.inactive_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setInactiveDtFetch (boolean fetch) {
    this.InactiveDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: InactiveDt (SERVICE_ZONE.inactive_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getInactiveDtFetch () {
    return this.InactiveDtFetch;
  }
  /** Set the SortOrder for field: InactiveDt (SERVICE_ZONE.inactive_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInactiveDtSortOrder (Integer value) {
    this.InactiveDtSort = value;
  }
  /** Retrieve SortOrder for field: InactiveDt (SERVICE_ZONE.inactive_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInactiveDtSortOrder () {
    return this.InactiveDtSort;
  }
  /** Set the sort direction for field: InactiveDt (SERVICE_ZONE.inactive_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInactiveDtSortDirection (boolean ascending) {
    this.InactiveDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InactiveDt (SERVICE_ZONE.inactive_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInactiveDtSortDirection () {
    return this.InactiveDtSortAscending;
  }
  /** Set the field level filters for field: InactiveDt (SERVICE_ZONE.inactive_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInactiveDtFilter (DateFilter[] value) throws ServiceException {
    this.InactiveDt = value;
  }
  /** Retrieve filter for field: InactiveDt (SERVICE_ZONE.inactive_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getInactiveDtFilter () {
    return this.InactiveDt;
  }

  /**
   * Retrieves the InactiveDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InactiveDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InactiveDtFilter field
   */
  public String[] getInactiveDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getInactiveDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInactiveDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInactiveDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the InactiveDtFilter filter value from a formatted string
   *
   * @param _value the InactiveDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the InactiveDtFilter filter field
   */
  public void setInactiveDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInactiveDtFilterFromFormattedString");
    try {
      this.setInactiveDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInactiveDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInactiveDtFilterFromFormattedString");
  }

  /**
   * Retrieves the InactiveDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InactiveDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the InactiveDtFilter field
   */
  public String[] getInactiveDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getInactiveDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInactiveDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInactiveDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the InactiveDtFilter filter value from a formatted string
   *
   * @param _value the InactiveDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the InactiveDtFilter filter field
   */
  public void setInactiveDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInactiveDtFilterFromFormattedDateTimeString");
    try {
      this.setInactiveDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInactiveDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInactiveDtFilterFromFormattedDateTimeString");
  }


  public String toString() {
    return ServiceZoneObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return ServiceZoneObjectHelper.toMap(this, null);
  }
}
