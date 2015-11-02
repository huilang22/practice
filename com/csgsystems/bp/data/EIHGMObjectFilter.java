/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: EIHGMObjectFilter.java
 * Definition File: Catalog/ExternalIdHqGroupsMap.xml
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
public class EIHGMObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public EIHGMObjectKeyFilter Key = null;
  /** raw field for: EXTERNAL_ID_HQ_GROUPS_MAP.group_id) */
  public    IntegerFilter[] GroupId  = null;
  protected boolean GroupIdFetch = false;
  protected boolean GroupIdSortAscending = true;
  protected Integer GroupIdSort = null;
  /** raw field for: EXTERNAL_ID_HQ_GROUPS_MAP.group_id_serv) */
  public    IntegerFilter[] GroupIdServ  = null;
  protected boolean GroupIdServFetch = false;
  protected boolean GroupIdServSortAscending = true;
  protected Integer GroupIdServSort = null;
  /** raw field for: EXTERNAL_ID_HQ_GROUPS_MAP.inactive_date) */
  public    DateFilter[] InactiveDate  = null;
  protected boolean InactiveDateFetch = false;
  protected boolean InactiveDateSortAscending = true;
  protected Integer InactiveDateSort = null;
  /** raw field for: EXTERNAL_ID_HQ_GROUPS_MAP.group_purpose) */
  public    IntegerFilter[] GroupPurpose  = null;
  protected boolean GroupPurposeFetch = false;
  protected boolean GroupPurposeSortAscending = true;
  protected Integer GroupPurposeSort = null;
  private String _objName = "EIHGMObjectFilter";
  /** default constructor */
  public EIHGMObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public EIHGMObjectFilter (EIHGMObjectFilter other)
  {
    if (other == null) return;
    this.Key = new EIHGMObjectKeyFilter (other.Key);
    this.GroupId = other.GroupId;
    this.GroupIdFetch = other.GroupIdFetch;
    this.GroupIdSort = other.GroupIdSort;
    this.GroupIdSortAscending = other.GroupIdSortAscending;
    this.GroupIdServ = other.GroupIdServ;
    this.GroupIdServFetch = other.GroupIdServFetch;
    this.GroupIdServSort = other.GroupIdServSort;
    this.GroupIdServSortAscending = other.GroupIdServSortAscending;
    this.InactiveDate = other.InactiveDate;
    this.InactiveDateFetch = other.InactiveDateFetch;
    this.InactiveDateSort = other.InactiveDateSort;
    this.InactiveDateSortAscending = other.InactiveDateSortAscending;
    this.GroupPurpose = other.GroupPurpose;
    this.GroupPurposeFetch = other.GroupPurposeFetch;
    this.GroupPurposeSort = other.GroupPurposeSort;
    this.GroupPurposeSortAscending = other.GroupPurposeSortAscending;  }
  /** get the filter for this object's key
   * @return EIHGMObjectKeyFilter
   */
  public EIHGMObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (EIHGMObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: ExternalId (EXTERNAL_ID_HQ_GROUPS_MAP.external_id)
   * @param fetch whether to fetch this field or not
   */
  public void setExternalIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new EIHGMObjectKeyFilter ();
    this.Key.ExternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ExternalId (EXTERNAL_ID_HQ_GROUPS_MAP.external_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getExternalIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.ExternalIdFetch;
  }
  /** Set the SortOrder for field: ExternalId (EXTERNAL_ID_HQ_GROUPS_MAP.external_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setExternalIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new EIHGMObjectKeyFilter ();
    this.Key.ExternalIdSort = value;
  }
  /** Retrieve SortOrder for field: ExternalId (EXTERNAL_ID_HQ_GROUPS_MAP.external_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getExternalIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.ExternalIdSort;
  }
  /** Set the sort direction for field: ExternalId (EXTERNAL_ID_HQ_GROUPS_MAP.external_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setExternalIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new EIHGMObjectKeyFilter ();
    this.Key.ExternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ExternalId (EXTERNAL_ID_HQ_GROUPS_MAP.external_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getExternalIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.ExternalIdSortAscending;
  }
  /** Set the case insensitive for field: ExternalId (EXTERNAL_ID_HQ_GROUPS_MAP.external_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setExternalIdCaseInsensitive (boolean ascending)
  {
    if (this.Key == null) this.Key = new EIHGMObjectKeyFilter ();
    this.Key.ExternalIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsentive for field: ExternalId (EXTERNAL_ID_HQ_GROUPS_MAP.external_id)
   * @return boolean whether the field is case insensitive
   */
  public boolean getExternalIdCaseInsensitive ()
  {
    if (this.Key == null) return false;
    return this.Key.ExternalIdCaseInsensitive;
  }
  /** Set the field level filters for field: ExternalId (EXTERNAL_ID_HQ_GROUPS_MAP.external_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setExternalIdFilter (StringFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new EIHGMObjectKeyFilter ();
    this.Key.ExternalId = value;
  }
  /** Retrieve filter for field: ExternalId (EXTERNAL_ID_HQ_GROUPS_MAP.external_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getExternalIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.ExternalId;
  }
  /** Set the field level Fetch value for field: ExternalIdType (EXTERNAL_ID_HQ_GROUPS_MAP.external_id_type)
   * @param fetch whether to fetch this field or not
   */
  public void setExternalIdTypeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new EIHGMObjectKeyFilter ();
    this.Key.ExternalIdTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ExternalIdType (EXTERNAL_ID_HQ_GROUPS_MAP.external_id_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getExternalIdTypeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.ExternalIdTypeFetch;
  }
  /** Set the SortOrder for field: ExternalIdType (EXTERNAL_ID_HQ_GROUPS_MAP.external_id_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setExternalIdTypeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new EIHGMObjectKeyFilter ();
    this.Key.ExternalIdTypeSort = value;
  }
  /** Retrieve SortOrder for field: ExternalIdType (EXTERNAL_ID_HQ_GROUPS_MAP.external_id_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getExternalIdTypeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.ExternalIdTypeSort;
  }
  /** Set the sort direction for field: ExternalIdType (EXTERNAL_ID_HQ_GROUPS_MAP.external_id_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setExternalIdTypeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new EIHGMObjectKeyFilter ();
    this.Key.ExternalIdTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ExternalIdType (EXTERNAL_ID_HQ_GROUPS_MAP.external_id_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getExternalIdTypeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.ExternalIdTypeSortAscending;
  }
  /** Set the field level filters for field: ExternalIdType (EXTERNAL_ID_HQ_GROUPS_MAP.external_id_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setExternalIdTypeFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new EIHGMObjectKeyFilter ();
    this.Key.ExternalIdType = value;
  }
  /** Retrieve filter for field: ExternalIdType (EXTERNAL_ID_HQ_GROUPS_MAP.external_id_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getExternalIdTypeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.ExternalIdType;
  }
  /** Set the field level Fetch value for field: ActiveDate (EXTERNAL_ID_HQ_GROUPS_MAP.active_date)
   * @param fetch whether to fetch this field or not
   */
  public void setActiveDateFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new EIHGMObjectKeyFilter ();
    this.Key.ActiveDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: ActiveDate (EXTERNAL_ID_HQ_GROUPS_MAP.active_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getActiveDateFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.ActiveDateFetch;
  }
  /** Set the SortOrder for field: ActiveDate (EXTERNAL_ID_HQ_GROUPS_MAP.active_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setActiveDateSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new EIHGMObjectKeyFilter ();
    this.Key.ActiveDateSort = value;
  }
  /** Retrieve SortOrder for field: ActiveDate (EXTERNAL_ID_HQ_GROUPS_MAP.active_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getActiveDateSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.ActiveDateSort;
  }
  /** Set the sort direction for field: ActiveDate (EXTERNAL_ID_HQ_GROUPS_MAP.active_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setActiveDateSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new EIHGMObjectKeyFilter ();
    this.Key.ActiveDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ActiveDate (EXTERNAL_ID_HQ_GROUPS_MAP.active_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getActiveDateSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.ActiveDateSortAscending;
  }
  /** Set the field level filters for field: ActiveDate (EXTERNAL_ID_HQ_GROUPS_MAP.active_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setActiveDateFilter (DateFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new EIHGMObjectKeyFilter ();
    this.Key.ActiveDate = value;
  }
  /** Retrieve filter for field: ActiveDate (EXTERNAL_ID_HQ_GROUPS_MAP.active_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getActiveDateFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.ActiveDate;
  }
  /** Set the field level Fetch value for field: GroupId (EXTERNAL_ID_HQ_GROUPS_MAP.group_id)
   * @param fetch whether to fetch this field or not
   */
  public void setGroupIdFetch (boolean fetch) {
    this.GroupIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: GroupId (EXTERNAL_ID_HQ_GROUPS_MAP.group_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getGroupIdFetch () {
    return this.GroupIdFetch;
  }
  /** Set the SortOrder for field: GroupId (EXTERNAL_ID_HQ_GROUPS_MAP.group_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setGroupIdSortOrder (Integer value) {
    this.GroupIdSort = value;
  }
  /** Retrieve SortOrder for field: GroupId (EXTERNAL_ID_HQ_GROUPS_MAP.group_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getGroupIdSortOrder () {
    return this.GroupIdSort;
  }
  /** Set the sort direction for field: GroupId (EXTERNAL_ID_HQ_GROUPS_MAP.group_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setGroupIdSortDirection (boolean ascending) {
    this.GroupIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: GroupId (EXTERNAL_ID_HQ_GROUPS_MAP.group_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getGroupIdSortDirection () {
    return this.GroupIdSortAscending;
  }
  /** Set the field level filters for field: GroupId (EXTERNAL_ID_HQ_GROUPS_MAP.group_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setGroupIdFilter (IntegerFilter[] value) throws ServiceException {
    this.GroupId = value;
  }
  /** Retrieve filter for field: GroupId (EXTERNAL_ID_HQ_GROUPS_MAP.group_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getGroupIdFilter () {
    return this.GroupId;
  }

  /**
   * Retrieves the GroupIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The GroupIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GroupIdFilter field
   */
  public String[] getGroupIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getGroupIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GroupIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getGroupIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the GroupIdFilter filter value from a formatted string
   *
   * @param _value the GroupIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the GroupIdFilter filter field
   */
  public void setGroupIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setGroupIdFilterFromFormattedString");
    try {
      this.setGroupIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GroupIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setGroupIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGroupIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: GroupIdServ (EXTERNAL_ID_HQ_GROUPS_MAP.group_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setGroupIdServFetch (boolean fetch) {
    this.GroupIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: GroupIdServ (EXTERNAL_ID_HQ_GROUPS_MAP.group_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getGroupIdServFetch () {
    return this.GroupIdServFetch;
  }
  /** Set the SortOrder for field: GroupIdServ (EXTERNAL_ID_HQ_GROUPS_MAP.group_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setGroupIdServSortOrder (Integer value) {
    this.GroupIdServSort = value;
  }
  /** Retrieve SortOrder for field: GroupIdServ (EXTERNAL_ID_HQ_GROUPS_MAP.group_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getGroupIdServSortOrder () {
    return this.GroupIdServSort;
  }
  /** Set the sort direction for field: GroupIdServ (EXTERNAL_ID_HQ_GROUPS_MAP.group_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setGroupIdServSortDirection (boolean ascending) {
    this.GroupIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: GroupIdServ (EXTERNAL_ID_HQ_GROUPS_MAP.group_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getGroupIdServSortDirection () {
    return this.GroupIdServSortAscending;
  }
  /** Set the field level filters for field: GroupIdServ (EXTERNAL_ID_HQ_GROUPS_MAP.group_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setGroupIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.GroupIdServ = value;
  }
  /** Retrieve filter for field: GroupIdServ (EXTERNAL_ID_HQ_GROUPS_MAP.group_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getGroupIdServFilter () {
    return this.GroupIdServ;
  }

  /**
   * Retrieves the GroupIdServFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The GroupIdServFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GroupIdServFilter field
   */
  public String[] getGroupIdServFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupIdServFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getGroupIdServFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupIdServFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GroupIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getGroupIdServFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the GroupIdServFilter filter value from a formatted string
   *
   * @param _value the GroupIdServFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the GroupIdServFilter filter field
   */
  public void setGroupIdServFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setGroupIdServFilterFromFormattedString");
    try {
      this.setGroupIdServFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GroupIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setGroupIdServFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGroupIdServFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: InactiveDate (EXTERNAL_ID_HQ_GROUPS_MAP.inactive_date)
   * @param fetch whether to fetch this field or not
   */
  public void setInactiveDateFetch (boolean fetch) {
    this.InactiveDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: InactiveDate (EXTERNAL_ID_HQ_GROUPS_MAP.inactive_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getInactiveDateFetch () {
    return this.InactiveDateFetch;
  }
  /** Set the SortOrder for field: InactiveDate (EXTERNAL_ID_HQ_GROUPS_MAP.inactive_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInactiveDateSortOrder (Integer value) {
    this.InactiveDateSort = value;
  }
  /** Retrieve SortOrder for field: InactiveDate (EXTERNAL_ID_HQ_GROUPS_MAP.inactive_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInactiveDateSortOrder () {
    return this.InactiveDateSort;
  }
  /** Set the sort direction for field: InactiveDate (EXTERNAL_ID_HQ_GROUPS_MAP.inactive_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInactiveDateSortDirection (boolean ascending) {
    this.InactiveDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InactiveDate (EXTERNAL_ID_HQ_GROUPS_MAP.inactive_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInactiveDateSortDirection () {
    return this.InactiveDateSortAscending;
  }
  /** Set the field level filters for field: InactiveDate (EXTERNAL_ID_HQ_GROUPS_MAP.inactive_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInactiveDateFilter (DateFilter[] value) throws ServiceException {
    this.InactiveDate = value;
  }
  /** Retrieve filter for field: InactiveDate (EXTERNAL_ID_HQ_GROUPS_MAP.inactive_date)
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


  /** Set the field level Fetch value for field: GroupPurpose (EXTERNAL_ID_HQ_GROUPS_MAP.group_purpose)
   * @param fetch whether to fetch this field or not
   */
  public void setGroupPurposeFetch (boolean fetch) {
    this.GroupPurposeFetch = fetch;
  }
  /** Retrieve Fetch value for field: GroupPurpose (EXTERNAL_ID_HQ_GROUPS_MAP.group_purpose)
   * @return boolean the Fetch value for this field
   */
  public boolean getGroupPurposeFetch () {
    return this.GroupPurposeFetch;
  }
  /** Set the SortOrder for field: GroupPurpose (EXTERNAL_ID_HQ_GROUPS_MAP.group_purpose)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setGroupPurposeSortOrder (Integer value) {
    this.GroupPurposeSort = value;
  }
  /** Retrieve SortOrder for field: GroupPurpose (EXTERNAL_ID_HQ_GROUPS_MAP.group_purpose)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getGroupPurposeSortOrder () {
    return this.GroupPurposeSort;
  }
  /** Set the sort direction for field: GroupPurpose (EXTERNAL_ID_HQ_GROUPS_MAP.group_purpose)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setGroupPurposeSortDirection (boolean ascending) {
    this.GroupPurposeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: GroupPurpose (EXTERNAL_ID_HQ_GROUPS_MAP.group_purpose)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getGroupPurposeSortDirection () {
    return this.GroupPurposeSortAscending;
  }
  /** Set the field level filters for field: GroupPurpose (EXTERNAL_ID_HQ_GROUPS_MAP.group_purpose)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setGroupPurposeFilter (IntegerFilter[] value) throws ServiceException {
    this.GroupPurpose = value;
  }
  /** Retrieve filter for field: GroupPurpose (EXTERNAL_ID_HQ_GROUPS_MAP.group_purpose)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getGroupPurposeFilter () {
    return this.GroupPurpose;
  }

  /**
   * Retrieves the GroupPurposeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The GroupPurposeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GroupPurposeFilter field
   */
  public String[] getGroupPurposeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupPurposeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getGroupPurposeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupPurposeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GroupPurposeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getGroupPurposeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the GroupPurposeFilter filter value from a formatted string
   *
   * @param _value the GroupPurposeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the GroupPurposeFilter filter field
   */
  public void setGroupPurposeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setGroupPurposeFilterFromFormattedString");
    try {
      this.setGroupPurposeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GroupPurposeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setGroupPurposeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGroupPurposeFilterFromFormattedString");
  }

  public String toString() {
    return EIHGMObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return EIHGMObjectHelper.toMap(this, null);
  }
}
