/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AbiNrcDucObjectFilter.java
 * Definition File: Customer/AbiNrcDuc.xml
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
public class AbiNrcDucObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public AbiNrcDucObjectKeyFilter Key = null;
  /** raw field for: ABI_NRC_DUC.duc_id) */
  public    BigIntegerFilter[] DucId  = null;
  protected boolean DucIdFetch = false;
  protected boolean DucIdSortAscending = true;
  protected Integer DucIdSort = null;
  /** raw field for: ABI_NRC_DUC.duc_type) */
  public    BigIntegerFilter[] DucType  = null;
  protected boolean DucTypeFetch = false;
  protected boolean DucTypeSortAscending = true;
  protected Integer DucTypeSort = null;
  /** raw field for: ABI_NRC_DUC.duc_subtype) */
  public    BigIntegerFilter[] DucSubtype  = null;
  protected boolean DucSubtypeFetch = false;
  protected boolean DucSubtypeSortAscending = true;
  protected Integer DucSubtypeSort = null;
  /** raw field for: ABI_NRC_DUC.money_value) */
  public    BigIntegerFilter[] MoneyValue  = null;
  protected boolean MoneyValueFetch = false;
  protected boolean MoneyValueSortAscending = true;
  protected Integer MoneyValueSort = null;
  /** raw field for: ABI_NRC_DUC.currency_code) */
  public    BigIntegerFilter[] CurrencyCode  = null;
  protected boolean CurrencyCodeFetch = false;
  protected boolean CurrencyCodeSortAscending = true;
  protected Integer CurrencyCodeSort = null;
  /** raw field for: ABI_NRC_DUC.annotation) */
  public    StringFilter[] Annotation  = null;
  protected boolean AnnotationFetch = false;
  protected boolean AnnotationSortAscending = true;
  protected boolean AnnotationCaseInsensitive = false;
  protected Integer AnnotationSort = null;
  private String _objName = "AbiNrcDucObjectFilter";
  /** default constructor */
  public AbiNrcDucObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public AbiNrcDucObjectFilter (AbiNrcDucObjectFilter other)
  {
    if (other == null) return;
    this.Key = new AbiNrcDucObjectKeyFilter (other.Key);
    this.DucId = other.DucId;
    this.DucIdFetch = other.DucIdFetch;
    this.DucIdSort = other.DucIdSort;
    this.DucIdSortAscending = other.DucIdSortAscending;
    this.DucType = other.DucType;
    this.DucTypeFetch = other.DucTypeFetch;
    this.DucTypeSort = other.DucTypeSort;
    this.DucTypeSortAscending = other.DucTypeSortAscending;
    this.DucSubtype = other.DucSubtype;
    this.DucSubtypeFetch = other.DucSubtypeFetch;
    this.DucSubtypeSort = other.DucSubtypeSort;
    this.DucSubtypeSortAscending = other.DucSubtypeSortAscending;
    this.MoneyValue = other.MoneyValue;
    this.MoneyValueFetch = other.MoneyValueFetch;
    this.MoneyValueSort = other.MoneyValueSort;
    this.MoneyValueSortAscending = other.MoneyValueSortAscending;
    this.CurrencyCode = other.CurrencyCode;
    this.CurrencyCodeFetch = other.CurrencyCodeFetch;
    this.CurrencyCodeSort = other.CurrencyCodeSort;
    this.CurrencyCodeSortAscending = other.CurrencyCodeSortAscending;
    this.Annotation = other.Annotation;
    this.AnnotationFetch = other.AnnotationFetch;
    this.AnnotationSort = other.AnnotationSort;
    this.AnnotationCaseInsensitive = other.AnnotationCaseInsensitive;
    this.AnnotationSortAscending = other.AnnotationSortAscending;  }
  /** get the filter for this object's key
   * @return AbiNrcDucObjectKeyFilter
   */
  public AbiNrcDucObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (AbiNrcDucObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: TrackingId (ABI_NRC_DUC.tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new AbiNrcDucObjectKeyFilter ();
    this.Key.TrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingId (ABI_NRC_DUC.tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdFetch;
  }
  /** Set the SortOrder for field: TrackingId (ABI_NRC_DUC.tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new AbiNrcDucObjectKeyFilter ();
    this.Key.TrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: TrackingId (ABI_NRC_DUC.tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdSort;
  }
  /** Set the sort direction for field: TrackingId (ABI_NRC_DUC.tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new AbiNrcDucObjectKeyFilter ();
    this.Key.TrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingId (ABI_NRC_DUC.tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdSortAscending;
  }
  /** Set the field level filters for field: TrackingId (ABI_NRC_DUC.tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdFilter (BigIntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new AbiNrcDucObjectKeyFilter ();
    this.Key.TrackingId = value;
  }
  /** Retrieve filter for field: TrackingId (ABI_NRC_DUC.tracking_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getTrackingIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingId;
  }
  /** Set the field level Fetch value for field: TrackingIdServ (ABI_NRC_DUC.tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdServFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new AbiNrcDucObjectKeyFilter ();
    this.Key.TrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingIdServ (ABI_NRC_DUC.tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdServFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdServFetch;
  }
  /** Set the SortOrder for field: TrackingIdServ (ABI_NRC_DUC.tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdServSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new AbiNrcDucObjectKeyFilter ();
    this.Key.TrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: TrackingIdServ (ABI_NRC_DUC.tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdServSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServSort;
  }
  /** Set the sort direction for field: TrackingIdServ (ABI_NRC_DUC.tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdServSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new AbiNrcDucObjectKeyFilter ();
    this.Key.TrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingIdServ (ABI_NRC_DUC.tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdServSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdServSortAscending;
  }
  /** Set the field level filters for field: TrackingIdServ (ABI_NRC_DUC.tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdServFilter (BigIntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new AbiNrcDucObjectKeyFilter ();
    this.Key.TrackingIdServ = value;
  }
  /** Retrieve filter for field: TrackingIdServ (ABI_NRC_DUC.tracking_id_serv)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getTrackingIdServFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServ;
  }
  /** Set the field level Fetch value for field: ParentChargeType (ABI_NRC_DUC.parent_charge_type)
   * @param fetch whether to fetch this field or not
   */
  public void setParentChargeTypeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new AbiNrcDucObjectKeyFilter ();
    this.Key.ParentChargeTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ParentChargeType (ABI_NRC_DUC.parent_charge_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getParentChargeTypeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.ParentChargeTypeFetch;
  }
  /** Set the SortOrder for field: ParentChargeType (ABI_NRC_DUC.parent_charge_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setParentChargeTypeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new AbiNrcDucObjectKeyFilter ();
    this.Key.ParentChargeTypeSort = value;
  }
  /** Retrieve SortOrder for field: ParentChargeType (ABI_NRC_DUC.parent_charge_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getParentChargeTypeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.ParentChargeTypeSort;
  }
  /** Set the sort direction for field: ParentChargeType (ABI_NRC_DUC.parent_charge_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setParentChargeTypeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new AbiNrcDucObjectKeyFilter ();
    this.Key.ParentChargeTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ParentChargeType (ABI_NRC_DUC.parent_charge_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getParentChargeTypeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.ParentChargeTypeSortAscending;
  }
  /** Set the field level filters for field: ParentChargeType (ABI_NRC_DUC.parent_charge_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setParentChargeTypeFilter (BigIntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new AbiNrcDucObjectKeyFilter ();
    this.Key.ParentChargeType = value;
  }
  /** Retrieve filter for field: ParentChargeType (ABI_NRC_DUC.parent_charge_type)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getParentChargeTypeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.ParentChargeType;
  }
  /** Set the field level Fetch value for field: DucId (ABI_NRC_DUC.duc_id)
   * @param fetch whether to fetch this field or not
   */
  public void setDucIdFetch (boolean fetch) {
    this.DucIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: DucId (ABI_NRC_DUC.duc_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getDucIdFetch () {
    return this.DucIdFetch;
  }
  /** Set the SortOrder for field: DucId (ABI_NRC_DUC.duc_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDucIdSortOrder (Integer value) {
    this.DucIdSort = value;
  }
  /** Retrieve SortOrder for field: DucId (ABI_NRC_DUC.duc_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDucIdSortOrder () {
    return this.DucIdSort;
  }
  /** Set the sort direction for field: DucId (ABI_NRC_DUC.duc_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDucIdSortDirection (boolean ascending) {
    this.DucIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DucId (ABI_NRC_DUC.duc_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDucIdSortDirection () {
    return this.DucIdSortAscending;
  }
  /** Set the field level filters for field: DucId (ABI_NRC_DUC.duc_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDucIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.DucId = value;
  }
  /** Retrieve filter for field: DucId (ABI_NRC_DUC.duc_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getDucIdFilter () {
    return this.DucId;
  }

  /**
   * Retrieves the DucIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DucIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DucIdFilter field
   */
  public String[] getDucIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDucIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDucIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDucIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DucIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDucIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DucIdFilter filter value from a formatted string
   *
   * @param _value the DucIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DucIdFilter filter field
   */
  public void setDucIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDucIdFilterFromFormattedString");
    try {
      this.setDucIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DucIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDucIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDucIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DucType (ABI_NRC_DUC.duc_type)
   * @param fetch whether to fetch this field or not
   */
  public void setDucTypeFetch (boolean fetch) {
    this.DucTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: DucType (ABI_NRC_DUC.duc_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getDucTypeFetch () {
    return this.DucTypeFetch;
  }
  /** Set the SortOrder for field: DucType (ABI_NRC_DUC.duc_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDucTypeSortOrder (Integer value) {
    this.DucTypeSort = value;
  }
  /** Retrieve SortOrder for field: DucType (ABI_NRC_DUC.duc_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDucTypeSortOrder () {
    return this.DucTypeSort;
  }
  /** Set the sort direction for field: DucType (ABI_NRC_DUC.duc_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDucTypeSortDirection (boolean ascending) {
    this.DucTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DucType (ABI_NRC_DUC.duc_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDucTypeSortDirection () {
    return this.DucTypeSortAscending;
  }
  /** Set the field level filters for field: DucType (ABI_NRC_DUC.duc_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDucTypeFilter (BigIntegerFilter[] value) throws ServiceException {
    this.DucType = value;
  }
  /** Retrieve filter for field: DucType (ABI_NRC_DUC.duc_type)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getDucTypeFilter () {
    return this.DucType;
  }

  /**
   * Retrieves the DucTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DucTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DucTypeFilter field
   */
  public String[] getDucTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDucTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDucTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDucTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DucTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDucTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DucTypeFilter filter value from a formatted string
   *
   * @param _value the DucTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DucTypeFilter filter field
   */
  public void setDucTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDucTypeFilterFromFormattedString");
    try {
      this.setDucTypeFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DucTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDucTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDucTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DucSubtype (ABI_NRC_DUC.duc_subtype)
   * @param fetch whether to fetch this field or not
   */
  public void setDucSubtypeFetch (boolean fetch) {
    this.DucSubtypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: DucSubtype (ABI_NRC_DUC.duc_subtype)
   * @return boolean the Fetch value for this field
   */
  public boolean getDucSubtypeFetch () {
    return this.DucSubtypeFetch;
  }
  /** Set the SortOrder for field: DucSubtype (ABI_NRC_DUC.duc_subtype)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDucSubtypeSortOrder (Integer value) {
    this.DucSubtypeSort = value;
  }
  /** Retrieve SortOrder for field: DucSubtype (ABI_NRC_DUC.duc_subtype)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDucSubtypeSortOrder () {
    return this.DucSubtypeSort;
  }
  /** Set the sort direction for field: DucSubtype (ABI_NRC_DUC.duc_subtype)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDucSubtypeSortDirection (boolean ascending) {
    this.DucSubtypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DucSubtype (ABI_NRC_DUC.duc_subtype)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDucSubtypeSortDirection () {
    return this.DucSubtypeSortAscending;
  }
  /** Set the field level filters for field: DucSubtype (ABI_NRC_DUC.duc_subtype)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDucSubtypeFilter (BigIntegerFilter[] value) throws ServiceException {
    this.DucSubtype = value;
  }
  /** Retrieve filter for field: DucSubtype (ABI_NRC_DUC.duc_subtype)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getDucSubtypeFilter () {
    return this.DucSubtype;
  }

  /**
   * Retrieves the DucSubtypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DucSubtypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DucSubtypeFilter field
   */
  public String[] getDucSubtypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDucSubtypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDucSubtypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDucSubtypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DucSubtypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDucSubtypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DucSubtypeFilter filter value from a formatted string
   *
   * @param _value the DucSubtypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DucSubtypeFilter filter field
   */
  public void setDucSubtypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDucSubtypeFilterFromFormattedString");
    try {
      this.setDucSubtypeFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DucSubtypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDucSubtypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDucSubtypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: MoneyValue (ABI_NRC_DUC.money_value)
   * @param fetch whether to fetch this field or not
   */
  public void setMoneyValueFetch (boolean fetch) {
    this.MoneyValueFetch = fetch;
  }
  /** Retrieve Fetch value for field: MoneyValue (ABI_NRC_DUC.money_value)
   * @return boolean the Fetch value for this field
   */
  public boolean getMoneyValueFetch () {
    return this.MoneyValueFetch;
  }
  /** Set the SortOrder for field: MoneyValue (ABI_NRC_DUC.money_value)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMoneyValueSortOrder (Integer value) {
    this.MoneyValueSort = value;
  }
  /** Retrieve SortOrder for field: MoneyValue (ABI_NRC_DUC.money_value)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMoneyValueSortOrder () {
    return this.MoneyValueSort;
  }
  /** Set the sort direction for field: MoneyValue (ABI_NRC_DUC.money_value)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMoneyValueSortDirection (boolean ascending) {
    this.MoneyValueSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MoneyValue (ABI_NRC_DUC.money_value)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMoneyValueSortDirection () {
    return this.MoneyValueSortAscending;
  }
  /** Set the field level filters for field: MoneyValue (ABI_NRC_DUC.money_value)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMoneyValueFilter (BigIntegerFilter[] value) throws ServiceException {
    this.MoneyValue = value;
  }
  /** Retrieve filter for field: MoneyValue (ABI_NRC_DUC.money_value)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getMoneyValueFilter () {
    return this.MoneyValue;
  }

  /**
   * Retrieves the MoneyValueFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MoneyValueFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MoneyValueFilter field
   */
  public String[] getMoneyValueFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMoneyValueFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMoneyValueFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMoneyValueFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MoneyValueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMoneyValueFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MoneyValueFilter filter value from a formatted string
   *
   * @param _value the MoneyValueFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MoneyValueFilter filter field
   */
  public void setMoneyValueFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMoneyValueFilterFromFormattedString");
    try {
      this.setMoneyValueFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MoneyValueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMoneyValueFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMoneyValueFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CurrencyCode (ABI_NRC_DUC.currency_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCurrencyCodeFetch (boolean fetch) {
    this.CurrencyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CurrencyCode (ABI_NRC_DUC.currency_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCurrencyCodeFetch () {
    return this.CurrencyCodeFetch;
  }
  /** Set the SortOrder for field: CurrencyCode (ABI_NRC_DUC.currency_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCurrencyCodeSortOrder (Integer value) {
    this.CurrencyCodeSort = value;
  }
  /** Retrieve SortOrder for field: CurrencyCode (ABI_NRC_DUC.currency_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCurrencyCodeSortOrder () {
    return this.CurrencyCodeSort;
  }
  /** Set the sort direction for field: CurrencyCode (ABI_NRC_DUC.currency_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCurrencyCodeSortDirection (boolean ascending) {
    this.CurrencyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CurrencyCode (ABI_NRC_DUC.currency_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCurrencyCodeSortDirection () {
    return this.CurrencyCodeSortAscending;
  }
  /** Set the field level filters for field: CurrencyCode (ABI_NRC_DUC.currency_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCurrencyCodeFilter (BigIntegerFilter[] value) throws ServiceException {
    this.CurrencyCode = value;
  }
  /** Retrieve filter for field: CurrencyCode (ABI_NRC_DUC.currency_code)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getCurrencyCodeFilter () {
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
      this.setCurrencyCodeFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCurrencyCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCurrencyCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Annotation (ABI_NRC_DUC.annotation)
   * @param fetch whether to fetch this field or not
   */
  public void setAnnotationFetch (boolean fetch) {
    this.AnnotationFetch = fetch;
  }
  /** Retrieve Fetch value for field: Annotation (ABI_NRC_DUC.annotation)
   * @return boolean the Fetch value for this field
   */
  public boolean getAnnotationFetch () {
    return this.AnnotationFetch;
  }
  /** Set the SortOrder for field: Annotation (ABI_NRC_DUC.annotation)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAnnotationSortOrder (Integer value) {
    this.AnnotationSort = value;
  }
  /** Retrieve SortOrder for field: Annotation (ABI_NRC_DUC.annotation)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAnnotationSortOrder () {
    return this.AnnotationSort;
  }
  /** Set the sort direction for field: Annotation (ABI_NRC_DUC.annotation)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAnnotationSortDirection (boolean ascending) {
    this.AnnotationSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Annotation (ABI_NRC_DUC.annotation)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAnnotationSortDirection () {
    return this.AnnotationSortAscending;
  }
  /** Set the case insensitive for field: Annotation (ABI_NRC_DUC.annotation)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAnnotationCaseInsensitive (boolean ascending) {
    this.AnnotationCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: Annotation (ABI_NRC_DUC.annotation)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getAnnotationCaseInsensitive () {
    return this.AnnotationCaseInsensitive;
  }
  /** Set the field level filters for field: Annotation (ABI_NRC_DUC.annotation)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAnnotationFilter (StringFilter[] value) throws ServiceException {
    this.Annotation = value;
  }
  /** Retrieve filter for field: Annotation (ABI_NRC_DUC.annotation)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getAnnotationFilter () {
    return this.Annotation;
  }

  /**
   * Retrieves the AnnotationFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AnnotationFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AnnotationFilter field
   */
  public String[] getAnnotationFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAnnotationFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAnnotationFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAnnotationFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AnnotationFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAnnotationFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AnnotationFilter filter value from a formatted string
   *
   * @param _value the AnnotationFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AnnotationFilter filter field
   */
  public void setAnnotationFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAnnotationFilterFromFormattedString");
    try {
      this.setAnnotationFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AnnotationFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAnnotationFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAnnotationFilterFromFormattedString");
  }

  public String toString() {
    return AbiNrcDucObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return AbiNrcDucObjectHelper.toMap(this, null);
  }
}
