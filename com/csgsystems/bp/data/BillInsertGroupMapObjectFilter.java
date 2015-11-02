/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BillInsertGroupMapObjectFilter.java
 * Definition File: Admin/BillInsertGroupMap.xml
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
public class BillInsertGroupMapObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public BillInsertGroupMapObjectKeyFilter Key = null;
  /** raw field for: BILL_INSERT_GROUPS.insert_trigger_id) */
  public    IntegerFilter[] InsertTriggerId  = null;
  protected boolean InsertTriggerIdFetch = false;
  protected boolean InsertTriggerIdSortAscending = true;
  protected Integer InsertTriggerIdSort = null;
  /** raw field for: BILL_INSERT_GROUPS.insert_bin_num) */
  public    IntegerFilter[] InsertBinNum  = null;
  protected boolean InsertBinNumFetch = false;
  protected boolean InsertBinNumSortAscending = true;
  protected Integer InsertBinNumSort = null;
  /** raw field for: BILL_INSERT_GROUPS.is_required) */
  public    BooleanFilter[] IsRequired  = null;
  protected boolean IsRequiredFetch = false;
  protected boolean IsRequiredSortAscending = true;
  protected Integer IsRequiredSort = null;
  /** raw field for: BILL_INSERT_GROUPS.priority) */
  public    IntegerFilter[] Priority  = null;
  protected boolean PriorityFetch = false;
  protected boolean PrioritySortAscending = true;
  protected Integer PrioritySort = null;
  /** raw field for: BILL_INSERT_GROUPS.active_dt) */
  public    DateFilter[] ActiveDt  = null;
  protected boolean ActiveDtFetch = false;
  protected boolean ActiveDtSortAscending = true;
  protected Integer ActiveDtSort = null;
  /** raw field for: BILL_INSERT_GROUPS.inactive_dt) */
  public    DateFilter[] InactiveDt  = null;
  protected boolean InactiveDtFetch = false;
  protected boolean InactiveDtSortAscending = true;
  protected Integer InactiveDtSort = null;
  /** raw field for: BILL_INSERT_GROUPS.insert_foreign_key) */
  public    IntegerFilter[] InsertForeignKey  = null;
  protected boolean InsertForeignKeyFetch = false;
  protected boolean InsertForeignKeySortAscending = true;
  protected Integer InsertForeignKeySort = null;
  /** raw field for: BILL_INSERT_GROUPS.config_tag_id) */
  public    StringFilter[] ConfigTagId  = null;
  protected boolean ConfigTagIdFetch = false;
  protected boolean ConfigTagIdSortAscending = true;
  protected boolean ConfigTagIdCaseInsensitive = false;
  protected Integer ConfigTagIdSort = null;
  private String _objName = "BillInsertGroupMapObjectFilter";
  /** default constructor */
  public BillInsertGroupMapObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public BillInsertGroupMapObjectFilter (BillInsertGroupMapObjectFilter other)
  {
    if (other == null) return;
    this.Key = new BillInsertGroupMapObjectKeyFilter (other.Key);
    this.InsertTriggerId = other.InsertTriggerId;
    this.InsertTriggerIdFetch = other.InsertTriggerIdFetch;
    this.InsertTriggerIdSort = other.InsertTriggerIdSort;
    this.InsertTriggerIdSortAscending = other.InsertTriggerIdSortAscending;
    this.InsertBinNum = other.InsertBinNum;
    this.InsertBinNumFetch = other.InsertBinNumFetch;
    this.InsertBinNumSort = other.InsertBinNumSort;
    this.InsertBinNumSortAscending = other.InsertBinNumSortAscending;
    this.IsRequired = other.IsRequired;
    this.IsRequiredFetch = other.IsRequiredFetch;
    this.IsRequiredSort = other.IsRequiredSort;
    this.IsRequiredSortAscending = other.IsRequiredSortAscending;
    this.Priority = other.Priority;
    this.PriorityFetch = other.PriorityFetch;
    this.PrioritySort = other.PrioritySort;
    this.PrioritySortAscending = other.PrioritySortAscending;
    this.ActiveDt = other.ActiveDt;
    this.ActiveDtFetch = other.ActiveDtFetch;
    this.ActiveDtSort = other.ActiveDtSort;
    this.ActiveDtSortAscending = other.ActiveDtSortAscending;
    this.InactiveDt = other.InactiveDt;
    this.InactiveDtFetch = other.InactiveDtFetch;
    this.InactiveDtSort = other.InactiveDtSort;
    this.InactiveDtSortAscending = other.InactiveDtSortAscending;
    this.InsertForeignKey = other.InsertForeignKey;
    this.InsertForeignKeyFetch = other.InsertForeignKeyFetch;
    this.InsertForeignKeySort = other.InsertForeignKeySort;
    this.InsertForeignKeySortAscending = other.InsertForeignKeySortAscending;
    this.ConfigTagId = other.ConfigTagId;
    this.ConfigTagIdFetch = other.ConfigTagIdFetch;
    this.ConfigTagIdSort = other.ConfigTagIdSort;
    this.ConfigTagIdCaseInsensitive = other.ConfigTagIdCaseInsensitive;
    this.ConfigTagIdSortAscending = other.ConfigTagIdSortAscending;  }
  /** get the filter for this object's key
   * @return BillInsertGroupMapObjectKeyFilter
   */
  public BillInsertGroupMapObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (BillInsertGroupMapObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: InsertGrpId (BILL_INSERT_GROUPS.insert_grp_id)
   * @param fetch whether to fetch this field or not
   */
  public void setInsertGrpIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new BillInsertGroupMapObjectKeyFilter ();
    this.Key.InsertGrpIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: InsertGrpId (BILL_INSERT_GROUPS.insert_grp_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getInsertGrpIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.InsertGrpIdFetch;
  }
  /** Set the SortOrder for field: InsertGrpId (BILL_INSERT_GROUPS.insert_grp_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInsertGrpIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new BillInsertGroupMapObjectKeyFilter ();
    this.Key.InsertGrpIdSort = value;
  }
  /** Retrieve SortOrder for field: InsertGrpId (BILL_INSERT_GROUPS.insert_grp_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInsertGrpIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.InsertGrpIdSort;
  }
  /** Set the sort direction for field: InsertGrpId (BILL_INSERT_GROUPS.insert_grp_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInsertGrpIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new BillInsertGroupMapObjectKeyFilter ();
    this.Key.InsertGrpIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InsertGrpId (BILL_INSERT_GROUPS.insert_grp_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInsertGrpIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.InsertGrpIdSortAscending;
  }
  /** Set the field level filters for field: InsertGrpId (BILL_INSERT_GROUPS.insert_grp_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInsertGrpIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new BillInsertGroupMapObjectKeyFilter ();
    this.Key.InsertGrpId = value;
  }
  /** Retrieve filter for field: InsertGrpId (BILL_INSERT_GROUPS.insert_grp_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getInsertGrpIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.InsertGrpId;
  }
  /** Set the field level Fetch value for field: InsertId (BILL_INSERT_GROUPS.insert_id)
   * @param fetch whether to fetch this field or not
   */
  public void setInsertIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new BillInsertGroupMapObjectKeyFilter ();
    this.Key.InsertIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: InsertId (BILL_INSERT_GROUPS.insert_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getInsertIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.InsertIdFetch;
  }
  /** Set the SortOrder for field: InsertId (BILL_INSERT_GROUPS.insert_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInsertIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new BillInsertGroupMapObjectKeyFilter ();
    this.Key.InsertIdSort = value;
  }
  /** Retrieve SortOrder for field: InsertId (BILL_INSERT_GROUPS.insert_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInsertIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.InsertIdSort;
  }
  /** Set the sort direction for field: InsertId (BILL_INSERT_GROUPS.insert_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInsertIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new BillInsertGroupMapObjectKeyFilter ();
    this.Key.InsertIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InsertId (BILL_INSERT_GROUPS.insert_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInsertIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.InsertIdSortAscending;
  }
  /** Set the field level filters for field: InsertId (BILL_INSERT_GROUPS.insert_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInsertIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new BillInsertGroupMapObjectKeyFilter ();
    this.Key.InsertId = value;
  }
  /** Retrieve filter for field: InsertId (BILL_INSERT_GROUPS.insert_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getInsertIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.InsertId;
  }
  /** Set the field level Fetch value for field: GeoKey (BILL_INSERT_GROUPS.geo_key)
   * @param fetch whether to fetch this field or not
   */
  public void setGeoKeyFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new BillInsertGroupMapObjectKeyFilter ();
    this.Key.GeoKeyFetch = fetch;
  }
  /** Retrieve Fetch value for field: GeoKey (BILL_INSERT_GROUPS.geo_key)
   * @return boolean the Fetch value for this field
   */
  public boolean getGeoKeyFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.GeoKeyFetch;
  }
  /** Set the SortOrder for field: GeoKey (BILL_INSERT_GROUPS.geo_key)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setGeoKeySortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new BillInsertGroupMapObjectKeyFilter ();
    this.Key.GeoKeySort = value;
  }
  /** Retrieve SortOrder for field: GeoKey (BILL_INSERT_GROUPS.geo_key)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getGeoKeySortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.GeoKeySort;
  }
  /** Set the sort direction for field: GeoKey (BILL_INSERT_GROUPS.geo_key)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setGeoKeySortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new BillInsertGroupMapObjectKeyFilter ();
    this.Key.GeoKeySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: GeoKey (BILL_INSERT_GROUPS.geo_key)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getGeoKeySortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.GeoKeySortAscending;
  }
  /** Set the case insensitive for field: GeoKey (BILL_INSERT_GROUPS.geo_key)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setGeoKeyCaseInsensitive (boolean ascending)
  {
    if (this.Key == null) this.Key = new BillInsertGroupMapObjectKeyFilter ();
    this.Key.GeoKeyCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsentive for field: GeoKey (BILL_INSERT_GROUPS.geo_key)
   * @return boolean whether the field is case insensitive
   */
  public boolean getGeoKeyCaseInsensitive ()
  {
    if (this.Key == null) return false;
    return this.Key.GeoKeyCaseInsensitive;
  }
  /** Set the field level filters for field: GeoKey (BILL_INSERT_GROUPS.geo_key)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setGeoKeyFilter (StringFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new BillInsertGroupMapObjectKeyFilter ();
    this.Key.GeoKey = value;
  }
  /** Retrieve filter for field: GeoKey (BILL_INSERT_GROUPS.geo_key)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getGeoKeyFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.GeoKey;
  }
  /** Set the field level Fetch value for field: MktCode (BILL_INSERT_GROUPS.mkt_code)
   * @param fetch whether to fetch this field or not
   */
  public void setMktCodeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new BillInsertGroupMapObjectKeyFilter ();
    this.Key.MktCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: MktCode (BILL_INSERT_GROUPS.mkt_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getMktCodeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.MktCodeFetch;
  }
  /** Set the SortOrder for field: MktCode (BILL_INSERT_GROUPS.mkt_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMktCodeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new BillInsertGroupMapObjectKeyFilter ();
    this.Key.MktCodeSort = value;
  }
  /** Retrieve SortOrder for field: MktCode (BILL_INSERT_GROUPS.mkt_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMktCodeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.MktCodeSort;
  }
  /** Set the sort direction for field: MktCode (BILL_INSERT_GROUPS.mkt_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMktCodeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new BillInsertGroupMapObjectKeyFilter ();
    this.Key.MktCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MktCode (BILL_INSERT_GROUPS.mkt_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMktCodeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.MktCodeSortAscending;
  }
  /** Set the field level filters for field: MktCode (BILL_INSERT_GROUPS.mkt_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMktCodeFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new BillInsertGroupMapObjectKeyFilter ();
    this.Key.MktCode = value;
  }
  /** Retrieve filter for field: MktCode (BILL_INSERT_GROUPS.mkt_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getMktCodeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.MktCode;
  }
  /** Set the field level Fetch value for field: InsertTriggerId (BILL_INSERT_GROUPS.insert_trigger_id)
   * @param fetch whether to fetch this field or not
   */
  public void setInsertTriggerIdFetch (boolean fetch) {
    this.InsertTriggerIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: InsertTriggerId (BILL_INSERT_GROUPS.insert_trigger_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getInsertTriggerIdFetch () {
    return this.InsertTriggerIdFetch;
  }
  /** Set the SortOrder for field: InsertTriggerId (BILL_INSERT_GROUPS.insert_trigger_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInsertTriggerIdSortOrder (Integer value) {
    this.InsertTriggerIdSort = value;
  }
  /** Retrieve SortOrder for field: InsertTriggerId (BILL_INSERT_GROUPS.insert_trigger_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInsertTriggerIdSortOrder () {
    return this.InsertTriggerIdSort;
  }
  /** Set the sort direction for field: InsertTriggerId (BILL_INSERT_GROUPS.insert_trigger_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInsertTriggerIdSortDirection (boolean ascending) {
    this.InsertTriggerIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InsertTriggerId (BILL_INSERT_GROUPS.insert_trigger_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInsertTriggerIdSortDirection () {
    return this.InsertTriggerIdSortAscending;
  }
  /** Set the field level filters for field: InsertTriggerId (BILL_INSERT_GROUPS.insert_trigger_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInsertTriggerIdFilter (IntegerFilter[] value) throws ServiceException {
    this.InsertTriggerId = value;
  }
  /** Retrieve filter for field: InsertTriggerId (BILL_INSERT_GROUPS.insert_trigger_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getInsertTriggerIdFilter () {
    return this.InsertTriggerId;
  }

  /**
   * Retrieves the InsertTriggerIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InsertTriggerIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InsertTriggerIdFilter field
   */
  public String[] getInsertTriggerIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInsertTriggerIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getInsertTriggerIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInsertTriggerIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InsertTriggerIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInsertTriggerIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the InsertTriggerIdFilter filter value from a formatted string
   *
   * @param _value the InsertTriggerIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the InsertTriggerIdFilter filter field
   */
  public void setInsertTriggerIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInsertTriggerIdFilterFromFormattedString");
    try {
      this.setInsertTriggerIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InsertTriggerIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInsertTriggerIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInsertTriggerIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: InsertBinNum (BILL_INSERT_GROUPS.insert_bin_num)
   * @param fetch whether to fetch this field or not
   */
  public void setInsertBinNumFetch (boolean fetch) {
    this.InsertBinNumFetch = fetch;
  }
  /** Retrieve Fetch value for field: InsertBinNum (BILL_INSERT_GROUPS.insert_bin_num)
   * @return boolean the Fetch value for this field
   */
  public boolean getInsertBinNumFetch () {
    return this.InsertBinNumFetch;
  }
  /** Set the SortOrder for field: InsertBinNum (BILL_INSERT_GROUPS.insert_bin_num)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInsertBinNumSortOrder (Integer value) {
    this.InsertBinNumSort = value;
  }
  /** Retrieve SortOrder for field: InsertBinNum (BILL_INSERT_GROUPS.insert_bin_num)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInsertBinNumSortOrder () {
    return this.InsertBinNumSort;
  }
  /** Set the sort direction for field: InsertBinNum (BILL_INSERT_GROUPS.insert_bin_num)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInsertBinNumSortDirection (boolean ascending) {
    this.InsertBinNumSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InsertBinNum (BILL_INSERT_GROUPS.insert_bin_num)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInsertBinNumSortDirection () {
    return this.InsertBinNumSortAscending;
  }
  /** Set the field level filters for field: InsertBinNum (BILL_INSERT_GROUPS.insert_bin_num)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInsertBinNumFilter (IntegerFilter[] value) throws ServiceException {
    this.InsertBinNum = value;
  }
  /** Retrieve filter for field: InsertBinNum (BILL_INSERT_GROUPS.insert_bin_num)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getInsertBinNumFilter () {
    return this.InsertBinNum;
  }

  /**
   * Retrieves the InsertBinNumFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InsertBinNumFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InsertBinNumFilter field
   */
  public String[] getInsertBinNumFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInsertBinNumFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getInsertBinNumFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInsertBinNumFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InsertBinNumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInsertBinNumFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the InsertBinNumFilter filter value from a formatted string
   *
   * @param _value the InsertBinNumFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the InsertBinNumFilter filter field
   */
  public void setInsertBinNumFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInsertBinNumFilterFromFormattedString");
    try {
      this.setInsertBinNumFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InsertBinNumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInsertBinNumFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInsertBinNumFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsRequired (BILL_INSERT_GROUPS.is_required)
   * @param fetch whether to fetch this field or not
   */
  public void setIsRequiredFetch (boolean fetch) {
    this.IsRequiredFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsRequired (BILL_INSERT_GROUPS.is_required)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsRequiredFetch () {
    return this.IsRequiredFetch;
  }
  /** Set the SortOrder for field: IsRequired (BILL_INSERT_GROUPS.is_required)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsRequiredSortOrder (Integer value) {
    this.IsRequiredSort = value;
  }
  /** Retrieve SortOrder for field: IsRequired (BILL_INSERT_GROUPS.is_required)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsRequiredSortOrder () {
    return this.IsRequiredSort;
  }
  /** Set the sort direction for field: IsRequired (BILL_INSERT_GROUPS.is_required)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsRequiredSortDirection (boolean ascending) {
    this.IsRequiredSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsRequired (BILL_INSERT_GROUPS.is_required)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsRequiredSortDirection () {
    return this.IsRequiredSortAscending;
  }
  /** Set the field level filters for field: IsRequired (BILL_INSERT_GROUPS.is_required)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsRequiredFilter (BooleanFilter[] value) throws ServiceException {
    this.IsRequired = value;
  }
  /** Retrieve filter for field: IsRequired (BILL_INSERT_GROUPS.is_required)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsRequiredFilter () {
    return this.IsRequired;
  }

  /**
   * Retrieves the IsRequiredFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsRequiredFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsRequiredFilter field
   */
  public String[] getIsRequiredFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsRequiredFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsRequiredFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsRequiredFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsRequiredFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsRequiredFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsRequiredFilter filter value from a formatted string
   *
   * @param _value the IsRequiredFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsRequiredFilter filter field
   */
  public void setIsRequiredFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsRequiredFilterFromFormattedString");
    try {
      this.setIsRequiredFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsRequiredFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsRequiredFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsRequiredFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Priority (BILL_INSERT_GROUPS.priority)
   * @param fetch whether to fetch this field or not
   */
  public void setPriorityFetch (boolean fetch) {
    this.PriorityFetch = fetch;
  }
  /** Retrieve Fetch value for field: Priority (BILL_INSERT_GROUPS.priority)
   * @return boolean the Fetch value for this field
   */
  public boolean getPriorityFetch () {
    return this.PriorityFetch;
  }
  /** Set the SortOrder for field: Priority (BILL_INSERT_GROUPS.priority)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPrioritySortOrder (Integer value) {
    this.PrioritySort = value;
  }
  /** Retrieve SortOrder for field: Priority (BILL_INSERT_GROUPS.priority)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPrioritySortOrder () {
    return this.PrioritySort;
  }
  /** Set the sort direction for field: Priority (BILL_INSERT_GROUPS.priority)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPrioritySortDirection (boolean ascending) {
    this.PrioritySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Priority (BILL_INSERT_GROUPS.priority)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPrioritySortDirection () {
    return this.PrioritySortAscending;
  }
  /** Set the field level filters for field: Priority (BILL_INSERT_GROUPS.priority)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPriorityFilter (IntegerFilter[] value) throws ServiceException {
    this.Priority = value;
  }
  /** Retrieve filter for field: Priority (BILL_INSERT_GROUPS.priority)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPriorityFilter () {
    return this.Priority;
  }

  /**
   * Retrieves the PriorityFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PriorityFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PriorityFilter field
   */
  public String[] getPriorityFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPriorityFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPriorityFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPriorityFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PriorityFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPriorityFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PriorityFilter filter value from a formatted string
   *
   * @param _value the PriorityFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PriorityFilter filter field
   */
  public void setPriorityFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPriorityFilterFromFormattedString");
    try {
      this.setPriorityFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PriorityFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPriorityFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPriorityFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ActiveDt (BILL_INSERT_GROUPS.active_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setActiveDtFetch (boolean fetch) {
    this.ActiveDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: ActiveDt (BILL_INSERT_GROUPS.active_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getActiveDtFetch () {
    return this.ActiveDtFetch;
  }
  /** Set the SortOrder for field: ActiveDt (BILL_INSERT_GROUPS.active_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setActiveDtSortOrder (Integer value) {
    this.ActiveDtSort = value;
  }
  /** Retrieve SortOrder for field: ActiveDt (BILL_INSERT_GROUPS.active_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getActiveDtSortOrder () {
    return this.ActiveDtSort;
  }
  /** Set the sort direction for field: ActiveDt (BILL_INSERT_GROUPS.active_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setActiveDtSortDirection (boolean ascending) {
    this.ActiveDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ActiveDt (BILL_INSERT_GROUPS.active_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getActiveDtSortDirection () {
    return this.ActiveDtSortAscending;
  }
  /** Set the field level filters for field: ActiveDt (BILL_INSERT_GROUPS.active_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setActiveDtFilter (DateFilter[] value) throws ServiceException {
    this.ActiveDt = value;
  }
  /** Retrieve filter for field: ActiveDt (BILL_INSERT_GROUPS.active_dt)
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


  /** Set the field level Fetch value for field: InactiveDt (BILL_INSERT_GROUPS.inactive_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setInactiveDtFetch (boolean fetch) {
    this.InactiveDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: InactiveDt (BILL_INSERT_GROUPS.inactive_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getInactiveDtFetch () {
    return this.InactiveDtFetch;
  }
  /** Set the SortOrder for field: InactiveDt (BILL_INSERT_GROUPS.inactive_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInactiveDtSortOrder (Integer value) {
    this.InactiveDtSort = value;
  }
  /** Retrieve SortOrder for field: InactiveDt (BILL_INSERT_GROUPS.inactive_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInactiveDtSortOrder () {
    return this.InactiveDtSort;
  }
  /** Set the sort direction for field: InactiveDt (BILL_INSERT_GROUPS.inactive_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInactiveDtSortDirection (boolean ascending) {
    this.InactiveDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InactiveDt (BILL_INSERT_GROUPS.inactive_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInactiveDtSortDirection () {
    return this.InactiveDtSortAscending;
  }
  /** Set the field level filters for field: InactiveDt (BILL_INSERT_GROUPS.inactive_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInactiveDtFilter (DateFilter[] value) throws ServiceException {
    this.InactiveDt = value;
  }
  /** Retrieve filter for field: InactiveDt (BILL_INSERT_GROUPS.inactive_dt)
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


  /** Set the field level Fetch value for field: InsertForeignKey (BILL_INSERT_GROUPS.insert_foreign_key)
   * @param fetch whether to fetch this field or not
   */
  public void setInsertForeignKeyFetch (boolean fetch) {
    this.InsertForeignKeyFetch = fetch;
  }
  /** Retrieve Fetch value for field: InsertForeignKey (BILL_INSERT_GROUPS.insert_foreign_key)
   * @return boolean the Fetch value for this field
   */
  public boolean getInsertForeignKeyFetch () {
    return this.InsertForeignKeyFetch;
  }
  /** Set the SortOrder for field: InsertForeignKey (BILL_INSERT_GROUPS.insert_foreign_key)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInsertForeignKeySortOrder (Integer value) {
    this.InsertForeignKeySort = value;
  }
  /** Retrieve SortOrder for field: InsertForeignKey (BILL_INSERT_GROUPS.insert_foreign_key)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInsertForeignKeySortOrder () {
    return this.InsertForeignKeySort;
  }
  /** Set the sort direction for field: InsertForeignKey (BILL_INSERT_GROUPS.insert_foreign_key)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInsertForeignKeySortDirection (boolean ascending) {
    this.InsertForeignKeySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InsertForeignKey (BILL_INSERT_GROUPS.insert_foreign_key)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInsertForeignKeySortDirection () {
    return this.InsertForeignKeySortAscending;
  }
  /** Set the field level filters for field: InsertForeignKey (BILL_INSERT_GROUPS.insert_foreign_key)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInsertForeignKeyFilter (IntegerFilter[] value) throws ServiceException {
    this.InsertForeignKey = value;
  }
  /** Retrieve filter for field: InsertForeignKey (BILL_INSERT_GROUPS.insert_foreign_key)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getInsertForeignKeyFilter () {
    return this.InsertForeignKey;
  }

  /**
   * Retrieves the InsertForeignKeyFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InsertForeignKeyFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InsertForeignKeyFilter field
   */
  public String[] getInsertForeignKeyFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInsertForeignKeyFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getInsertForeignKeyFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInsertForeignKeyFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InsertForeignKeyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInsertForeignKeyFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the InsertForeignKeyFilter filter value from a formatted string
   *
   * @param _value the InsertForeignKeyFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the InsertForeignKeyFilter filter field
   */
  public void setInsertForeignKeyFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInsertForeignKeyFilterFromFormattedString");
    try {
      this.setInsertForeignKeyFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InsertForeignKeyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInsertForeignKeyFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInsertForeignKeyFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ConfigTagId (BILL_INSERT_GROUPS.config_tag_id)
   * @param fetch whether to fetch this field or not
   */
  public void setConfigTagIdFetch (boolean fetch) {
    this.ConfigTagIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ConfigTagId (BILL_INSERT_GROUPS.config_tag_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getConfigTagIdFetch () {
    return this.ConfigTagIdFetch;
  }
  /** Set the SortOrder for field: ConfigTagId (BILL_INSERT_GROUPS.config_tag_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setConfigTagIdSortOrder (Integer value) {
    this.ConfigTagIdSort = value;
  }
  /** Retrieve SortOrder for field: ConfigTagId (BILL_INSERT_GROUPS.config_tag_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getConfigTagIdSortOrder () {
    return this.ConfigTagIdSort;
  }
  /** Set the sort direction for field: ConfigTagId (BILL_INSERT_GROUPS.config_tag_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setConfigTagIdSortDirection (boolean ascending) {
    this.ConfigTagIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ConfigTagId (BILL_INSERT_GROUPS.config_tag_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getConfigTagIdSortDirection () {
    return this.ConfigTagIdSortAscending;
  }
  /** Set the case insensitive for field: ConfigTagId (BILL_INSERT_GROUPS.config_tag_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setConfigTagIdCaseInsensitive (boolean ascending) {
    this.ConfigTagIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ConfigTagId (BILL_INSERT_GROUPS.config_tag_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getConfigTagIdCaseInsensitive () {
    return this.ConfigTagIdCaseInsensitive;
  }
  /** Set the field level filters for field: ConfigTagId (BILL_INSERT_GROUPS.config_tag_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setConfigTagIdFilter (StringFilter[] value) throws ServiceException {
    this.ConfigTagId = value;
  }
  /** Retrieve filter for field: ConfigTagId (BILL_INSERT_GROUPS.config_tag_id)
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
    return BillInsertGroupMapObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return BillInsertGroupMapObjectHelper.toMap(this, null);
  }
}
