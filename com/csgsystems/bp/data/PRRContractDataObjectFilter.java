/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PRRContractDataObjectFilter.java
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
public class PRRContractDataObjectFilter  extends BaseFilter  implements Serializable
{
  /** raw field for: CUSTOMER_CONTRACT_VIEW.tracking_id) */
  public    IntegerFilter[] TrackingId  = null;
  protected boolean TrackingIdFetch = false;
  protected boolean TrackingIdSortAscending = true;
  protected Integer TrackingIdSort = null;
  /** raw field for: CUSTOMER_CONTRACT_VIEW.tracking_id_serv) */
  public    IntegerFilter[] TrackingIdServ  = null;
  protected boolean TrackingIdServFetch = false;
  protected boolean TrackingIdServSortAscending = true;
  protected Integer TrackingIdServSort = null;
  /** raw field for: CUSTOMER_CONTRACT_VIEW.view_status) */
  public    IntegerFilter[] ViewStatus  = null;
  protected boolean ViewStatusFetch = false;
  protected boolean ViewStatusSortAscending = true;
  protected Integer ViewStatusSort = null;
  /** raw field for: CUSTOMER_CONTRACT_VIEW.parent_subscr_no) */
  public    IntegerFilter[] ParentServiceInternalId  = null;
  protected boolean ParentServiceInternalIdFetch = false;
  protected boolean ParentServiceInternalIdSortAscending = true;
  protected Integer ParentServiceInternalIdSort = null;
  /** raw field for: CUSTOMER_CONTRACT_VIEW.parent_subscr_no_resets) */
  public    IntegerFilter[] ParentServiceInternalIdResets  = null;
  protected boolean ParentServiceInternalIdResetsFetch = false;
  protected boolean ParentServiceInternalIdResetsSortAscending = true;
  protected Integer ParentServiceInternalIdResetsSort = null;
  /** raw field for: CUSTOMER_CONTRACT_VIEW.parent_account_no) */
  public    IntegerFilter[] ParentAccountInternalId  = null;
  protected boolean ParentAccountInternalIdFetch = false;
  protected boolean ParentAccountInternalIdSortAscending = true;
  protected Integer ParentAccountInternalIdSort = null;
  /** raw field for: CUSTOMER_CONTRACT_VIEW.commitment_reference) */
  public    IntegerFilter[] CommitmentReference  = null;
  protected boolean CommitmentReferenceFetch = false;
  protected boolean CommitmentReferenceSortAscending = true;
  protected Integer CommitmentReferenceSort = null;
  /** raw field for: CONTRACT_TYPES.description_code) */
  public    IntegerFilter[] DescriptionCode  = null;
  protected boolean DescriptionCodeFetch = false;
  protected boolean DescriptionCodeSortAscending = true;
  protected Integer DescriptionCodeSort = null;
  /** raw field for: CUSTOMER_CONTRACT_VIEW.start_dt) */
  public    DateFilter[] StartDt  = null;
  protected boolean StartDtFetch = false;
  protected boolean StartDtSortAscending = true;
  protected Integer StartDtSort = null;
  /** raw field for: CUSTOMER_CONTRACT_VIEW.end_dt) */
  public    DateFilter[] EndDt  = null;
  protected boolean EndDtFetch = false;
  protected boolean EndDtSortAscending = true;
  protected Integer EndDtSort = null;
  /** raw field for: CUSTOMER_CONTRACT_VIEW.contract_level) */
  public    IntegerFilter[] ContractLevel  = null;
  protected boolean ContractLevelFetch = false;
  protected boolean ContractLevelSortAscending = true;
  protected Integer ContractLevelSort = null;
  /** raw field for: CUSTOMER_CONTRACT_VIEW.contract_type) */
  public    IntegerFilter[] ContractType  = null;
  protected boolean ContractTypeFetch = false;
  protected boolean ContractTypeSortAscending = true;
  protected Integer ContractTypeSort = null;
  /** raw field for: CONTRACT_TYPES.termination_type_id_nrc) */
  public    IntegerFilter[] TerminationTypeIdNrc  = null;
  protected boolean TerminationTypeIdNrcFetch = false;
  protected boolean TerminationTypeIdNrcSortAscending = true;
  protected Integer TerminationTypeIdNrcSort = null;
  /** raw field for: CONTRACT_TYPES.commitment_type_id_nrc) */
  public    IntegerFilter[] CommitmentTypeIdNrc  = null;
  protected boolean CommitmentTypeIdNrcFetch = false;
  protected boolean CommitmentTypeIdNrcSortAscending = true;
  protected Integer CommitmentTypeIdNrcSort = null;
  /** raw field for: CONTRACT_TYPES.contract_category) */
  public    IntegerFilter[] ContractCategory  = null;
  protected boolean ContractCategoryFetch = false;
  protected boolean ContractCategorySortAscending = true;
  protected Integer ContractCategorySort = null;
  private String _objName = "PRRContractDataObjectFilter";
  /** default constructor */
  public PRRContractDataObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public PRRContractDataObjectFilter (PRRContractDataObjectFilter other)
  {
    if (other == null) return;
    this.TrackingId = other.TrackingId;
    this.TrackingIdFetch = other.TrackingIdFetch;
    this.TrackingIdSort = other.TrackingIdSort;
    this.TrackingIdSortAscending = other.TrackingIdSortAscending;
    this.TrackingIdServ = other.TrackingIdServ;
    this.TrackingIdServFetch = other.TrackingIdServFetch;
    this.TrackingIdServSort = other.TrackingIdServSort;
    this.TrackingIdServSortAscending = other.TrackingIdServSortAscending;
    this.ViewStatus = other.ViewStatus;
    this.ViewStatusFetch = other.ViewStatusFetch;
    this.ViewStatusSort = other.ViewStatusSort;
    this.ViewStatusSortAscending = other.ViewStatusSortAscending;
    this.ParentServiceInternalId = other.ParentServiceInternalId;
    this.ParentServiceInternalIdFetch = other.ParentServiceInternalIdFetch;
    this.ParentServiceInternalIdSort = other.ParentServiceInternalIdSort;
    this.ParentServiceInternalIdSortAscending = other.ParentServiceInternalIdSortAscending;
    this.ParentServiceInternalIdResets = other.ParentServiceInternalIdResets;
    this.ParentServiceInternalIdResetsFetch = other.ParentServiceInternalIdResetsFetch;
    this.ParentServiceInternalIdResetsSort = other.ParentServiceInternalIdResetsSort;
    this.ParentServiceInternalIdResetsSortAscending = other.ParentServiceInternalIdResetsSortAscending;
    this.ParentAccountInternalId = other.ParentAccountInternalId;
    this.ParentAccountInternalIdFetch = other.ParentAccountInternalIdFetch;
    this.ParentAccountInternalIdSort = other.ParentAccountInternalIdSort;
    this.ParentAccountInternalIdSortAscending = other.ParentAccountInternalIdSortAscending;
    this.CommitmentReference = other.CommitmentReference;
    this.CommitmentReferenceFetch = other.CommitmentReferenceFetch;
    this.CommitmentReferenceSort = other.CommitmentReferenceSort;
    this.CommitmentReferenceSortAscending = other.CommitmentReferenceSortAscending;
    this.DescriptionCode = other.DescriptionCode;
    this.DescriptionCodeFetch = other.DescriptionCodeFetch;
    this.DescriptionCodeSort = other.DescriptionCodeSort;
    this.DescriptionCodeSortAscending = other.DescriptionCodeSortAscending;
    this.StartDt = other.StartDt;
    this.StartDtFetch = other.StartDtFetch;
    this.StartDtSort = other.StartDtSort;
    this.StartDtSortAscending = other.StartDtSortAscending;
    this.EndDt = other.EndDt;
    this.EndDtFetch = other.EndDtFetch;
    this.EndDtSort = other.EndDtSort;
    this.EndDtSortAscending = other.EndDtSortAscending;
    this.ContractLevel = other.ContractLevel;
    this.ContractLevelFetch = other.ContractLevelFetch;
    this.ContractLevelSort = other.ContractLevelSort;
    this.ContractLevelSortAscending = other.ContractLevelSortAscending;
    this.ContractType = other.ContractType;
    this.ContractTypeFetch = other.ContractTypeFetch;
    this.ContractTypeSort = other.ContractTypeSort;
    this.ContractTypeSortAscending = other.ContractTypeSortAscending;
    this.TerminationTypeIdNrc = other.TerminationTypeIdNrc;
    this.TerminationTypeIdNrcFetch = other.TerminationTypeIdNrcFetch;
    this.TerminationTypeIdNrcSort = other.TerminationTypeIdNrcSort;
    this.TerminationTypeIdNrcSortAscending = other.TerminationTypeIdNrcSortAscending;
    this.CommitmentTypeIdNrc = other.CommitmentTypeIdNrc;
    this.CommitmentTypeIdNrcFetch = other.CommitmentTypeIdNrcFetch;
    this.CommitmentTypeIdNrcSort = other.CommitmentTypeIdNrcSort;
    this.CommitmentTypeIdNrcSortAscending = other.CommitmentTypeIdNrcSortAscending;
    this.ContractCategory = other.ContractCategory;
    this.ContractCategoryFetch = other.ContractCategoryFetch;
    this.ContractCategorySort = other.ContractCategorySort;
    this.ContractCategorySortAscending = other.ContractCategorySortAscending;  }
  /** Set the field level Fetch value for field: TrackingId (CUSTOMER_CONTRACT_VIEW.tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdFetch (boolean fetch) {
    this.TrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingId (CUSTOMER_CONTRACT_VIEW.tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdFetch () {
    return this.TrackingIdFetch;
  }
  /** Set the SortOrder for field: TrackingId (CUSTOMER_CONTRACT_VIEW.tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdSortOrder (Integer value) {
    this.TrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: TrackingId (CUSTOMER_CONTRACT_VIEW.tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdSortOrder () {
    return this.TrackingIdSort;
  }
  /** Set the sort direction for field: TrackingId (CUSTOMER_CONTRACT_VIEW.tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdSortDirection (boolean ascending) {
    this.TrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingId (CUSTOMER_CONTRACT_VIEW.tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdSortDirection () {
    return this.TrackingIdSortAscending;
  }
  /** Set the field level filters for field: TrackingId (CUSTOMER_CONTRACT_VIEW.tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdFilter (IntegerFilter[] value) throws ServiceException {
    this.TrackingId = value;
  }
  /** Retrieve filter for field: TrackingId (CUSTOMER_CONTRACT_VIEW.tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdFilter () {
    return this.TrackingId;
  }

  /**
   * Retrieves the TrackingIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TrackingIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TrackingIdFilter field
   */
  public String[] getTrackingIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTrackingIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTrackingIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTrackingIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TrackingIdFilter filter value from a formatted string
   *
   * @param _value the TrackingIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TrackingIdFilter filter field
   */
  public void setTrackingIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTrackingIdFilterFromFormattedString");
    try {
      this.setTrackingIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTrackingIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTrackingIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TrackingIdServ (CUSTOMER_CONTRACT_VIEW.tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdServFetch (boolean fetch) {
    this.TrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingIdServ (CUSTOMER_CONTRACT_VIEW.tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdServFetch () {
    return this.TrackingIdServFetch;
  }
  /** Set the SortOrder for field: TrackingIdServ (CUSTOMER_CONTRACT_VIEW.tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdServSortOrder (Integer value) {
    this.TrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: TrackingIdServ (CUSTOMER_CONTRACT_VIEW.tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdServSortOrder () {
    return this.TrackingIdServSort;
  }
  /** Set the sort direction for field: TrackingIdServ (CUSTOMER_CONTRACT_VIEW.tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdServSortDirection (boolean ascending) {
    this.TrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingIdServ (CUSTOMER_CONTRACT_VIEW.tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdServSortDirection () {
    return this.TrackingIdServSortAscending;
  }
  /** Set the field level filters for field: TrackingIdServ (CUSTOMER_CONTRACT_VIEW.tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.TrackingIdServ = value;
  }
  /** Retrieve filter for field: TrackingIdServ (CUSTOMER_CONTRACT_VIEW.tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdServFilter () {
    return this.TrackingIdServ;
  }

  /**
   * Retrieves the TrackingIdServFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TrackingIdServFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TrackingIdServFilter field
   */
  public String[] getTrackingIdServFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdServFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTrackingIdServFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTrackingIdServFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTrackingIdServFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TrackingIdServFilter filter value from a formatted string
   *
   * @param _value the TrackingIdServFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TrackingIdServFilter filter field
   */
  public void setTrackingIdServFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTrackingIdServFilterFromFormattedString");
    try {
      this.setTrackingIdServFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTrackingIdServFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTrackingIdServFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ViewStatus (CUSTOMER_CONTRACT_VIEW.view_status)
   * @param fetch whether to fetch this field or not
   */
  public void setViewStatusFetch (boolean fetch) {
    this.ViewStatusFetch = fetch;
  }
  /** Retrieve Fetch value for field: ViewStatus (CUSTOMER_CONTRACT_VIEW.view_status)
   * @return boolean the Fetch value for this field
   */
  public boolean getViewStatusFetch () {
    return this.ViewStatusFetch;
  }
  /** Set the SortOrder for field: ViewStatus (CUSTOMER_CONTRACT_VIEW.view_status)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setViewStatusSortOrder (Integer value) {
    this.ViewStatusSort = value;
  }
  /** Retrieve SortOrder for field: ViewStatus (CUSTOMER_CONTRACT_VIEW.view_status)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getViewStatusSortOrder () {
    return this.ViewStatusSort;
  }
  /** Set the sort direction for field: ViewStatus (CUSTOMER_CONTRACT_VIEW.view_status)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setViewStatusSortDirection (boolean ascending) {
    this.ViewStatusSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ViewStatus (CUSTOMER_CONTRACT_VIEW.view_status)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getViewStatusSortDirection () {
    return this.ViewStatusSortAscending;
  }
  /** Set the field level filters for field: ViewStatus (CUSTOMER_CONTRACT_VIEW.view_status)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setViewStatusFilter (IntegerFilter[] value) throws ServiceException {
    this.ViewStatus = value;
  }
  /** Retrieve filter for field: ViewStatus (CUSTOMER_CONTRACT_VIEW.view_status)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getViewStatusFilter () {
    return this.ViewStatus;
  }

  /**
   * Retrieves the ViewStatusFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ViewStatusFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ViewStatusFilter field
   */
  public String[] getViewStatusFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getViewStatusFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getViewStatusFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getViewStatusFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ViewStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getViewStatusFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ViewStatusFilter filter value from a formatted string
   *
   * @param _value the ViewStatusFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ViewStatusFilter filter field
   */
  public void setViewStatusFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setViewStatusFilterFromFormattedString");
    try {
      this.setViewStatusFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ViewStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setViewStatusFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setViewStatusFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated ViewStatusFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the ViewStatusFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ViewStatusFilter filter field
   */
  public String[] getViewStatusFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getViewStatusFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getViewStatusFilter(), "ViewStatus", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getViewStatusFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ViewStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getViewStatusFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated ViewStatusFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the ViewStatusFilter filter field
   */
  public void setViewStatusFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setViewStatusFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setViewStatusFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "ViewStatus", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ViewStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setViewStatusFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setViewStatusFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: ParentServiceInternalId (CUSTOMER_CONTRACT_VIEW.parent_subscr_no)
   * @param fetch whether to fetch this field or not
   */
  public void setParentServiceInternalIdFetch (boolean fetch) {
    this.ParentServiceInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ParentServiceInternalId (CUSTOMER_CONTRACT_VIEW.parent_subscr_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getParentServiceInternalIdFetch () {
    return this.ParentServiceInternalIdFetch;
  }
  /** Set the SortOrder for field: ParentServiceInternalId (CUSTOMER_CONTRACT_VIEW.parent_subscr_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setParentServiceInternalIdSortOrder (Integer value) {
    this.ParentServiceInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: ParentServiceInternalId (CUSTOMER_CONTRACT_VIEW.parent_subscr_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getParentServiceInternalIdSortOrder () {
    return this.ParentServiceInternalIdSort;
  }
  /** Set the sort direction for field: ParentServiceInternalId (CUSTOMER_CONTRACT_VIEW.parent_subscr_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setParentServiceInternalIdSortDirection (boolean ascending) {
    this.ParentServiceInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ParentServiceInternalId (CUSTOMER_CONTRACT_VIEW.parent_subscr_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getParentServiceInternalIdSortDirection () {
    return this.ParentServiceInternalIdSortAscending;
  }
  /** Set the field level filters for field: ParentServiceInternalId (CUSTOMER_CONTRACT_VIEW.parent_subscr_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setParentServiceInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ParentServiceInternalId = value;
  }
  /** Retrieve filter for field: ParentServiceInternalId (CUSTOMER_CONTRACT_VIEW.parent_subscr_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getParentServiceInternalIdFilter () {
    return this.ParentServiceInternalId;
  }

  /**
   * Retrieves the ParentServiceInternalIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ParentServiceInternalIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParentServiceInternalIdFilter field
   */
  public String[] getParentServiceInternalIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentServiceInternalIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getParentServiceInternalIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParentServiceInternalIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParentServiceInternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getParentServiceInternalIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ParentServiceInternalIdFilter filter value from a formatted string
   *
   * @param _value the ParentServiceInternalIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ParentServiceInternalIdFilter filter field
   */
  public void setParentServiceInternalIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setParentServiceInternalIdFilterFromFormattedString");
    try {
      this.setParentServiceInternalIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParentServiceInternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setParentServiceInternalIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParentServiceInternalIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ParentServiceInternalIdResets (CUSTOMER_CONTRACT_VIEW.parent_subscr_no_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setParentServiceInternalIdResetsFetch (boolean fetch) {
    this.ParentServiceInternalIdResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: ParentServiceInternalIdResets (CUSTOMER_CONTRACT_VIEW.parent_subscr_no_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getParentServiceInternalIdResetsFetch () {
    return this.ParentServiceInternalIdResetsFetch;
  }
  /** Set the SortOrder for field: ParentServiceInternalIdResets (CUSTOMER_CONTRACT_VIEW.parent_subscr_no_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setParentServiceInternalIdResetsSortOrder (Integer value) {
    this.ParentServiceInternalIdResetsSort = value;
  }
  /** Retrieve SortOrder for field: ParentServiceInternalIdResets (CUSTOMER_CONTRACT_VIEW.parent_subscr_no_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getParentServiceInternalIdResetsSortOrder () {
    return this.ParentServiceInternalIdResetsSort;
  }
  /** Set the sort direction for field: ParentServiceInternalIdResets (CUSTOMER_CONTRACT_VIEW.parent_subscr_no_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setParentServiceInternalIdResetsSortDirection (boolean ascending) {
    this.ParentServiceInternalIdResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ParentServiceInternalIdResets (CUSTOMER_CONTRACT_VIEW.parent_subscr_no_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getParentServiceInternalIdResetsSortDirection () {
    return this.ParentServiceInternalIdResetsSortAscending;
  }
  /** Set the field level filters for field: ParentServiceInternalIdResets (CUSTOMER_CONTRACT_VIEW.parent_subscr_no_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setParentServiceInternalIdResetsFilter (IntegerFilter[] value) throws ServiceException {
    this.ParentServiceInternalIdResets = value;
  }
  /** Retrieve filter for field: ParentServiceInternalIdResets (CUSTOMER_CONTRACT_VIEW.parent_subscr_no_resets)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getParentServiceInternalIdResetsFilter () {
    return this.ParentServiceInternalIdResets;
  }

  /**
   * Retrieves the ParentServiceInternalIdResetsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ParentServiceInternalIdResetsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParentServiceInternalIdResetsFilter field
   */
  public String[] getParentServiceInternalIdResetsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentServiceInternalIdResetsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getParentServiceInternalIdResetsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParentServiceInternalIdResetsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParentServiceInternalIdResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getParentServiceInternalIdResetsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ParentServiceInternalIdResetsFilter filter value from a formatted string
   *
   * @param _value the ParentServiceInternalIdResetsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ParentServiceInternalIdResetsFilter filter field
   */
  public void setParentServiceInternalIdResetsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setParentServiceInternalIdResetsFilterFromFormattedString");
    try {
      this.setParentServiceInternalIdResetsFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParentServiceInternalIdResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setParentServiceInternalIdResetsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParentServiceInternalIdResetsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ParentAccountInternalId (CUSTOMER_CONTRACT_VIEW.parent_account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setParentAccountInternalIdFetch (boolean fetch) {
    this.ParentAccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ParentAccountInternalId (CUSTOMER_CONTRACT_VIEW.parent_account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getParentAccountInternalIdFetch () {
    return this.ParentAccountInternalIdFetch;
  }
  /** Set the SortOrder for field: ParentAccountInternalId (CUSTOMER_CONTRACT_VIEW.parent_account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setParentAccountInternalIdSortOrder (Integer value) {
    this.ParentAccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: ParentAccountInternalId (CUSTOMER_CONTRACT_VIEW.parent_account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getParentAccountInternalIdSortOrder () {
    return this.ParentAccountInternalIdSort;
  }
  /** Set the sort direction for field: ParentAccountInternalId (CUSTOMER_CONTRACT_VIEW.parent_account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setParentAccountInternalIdSortDirection (boolean ascending) {
    this.ParentAccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ParentAccountInternalId (CUSTOMER_CONTRACT_VIEW.parent_account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getParentAccountInternalIdSortDirection () {
    return this.ParentAccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: ParentAccountInternalId (CUSTOMER_CONTRACT_VIEW.parent_account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setParentAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ParentAccountInternalId = value;
  }
  /** Retrieve filter for field: ParentAccountInternalId (CUSTOMER_CONTRACT_VIEW.parent_account_no)
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

  /** Set the field level Fetch value for field: CommitmentReference (CUSTOMER_CONTRACT_VIEW.commitment_reference)
   * @param fetch whether to fetch this field or not
   */
  public void setCommitmentReferenceFetch (boolean fetch) {
    this.CommitmentReferenceFetch = fetch;
  }
  /** Retrieve Fetch value for field: CommitmentReference (CUSTOMER_CONTRACT_VIEW.commitment_reference)
   * @return boolean the Fetch value for this field
   */
  public boolean getCommitmentReferenceFetch () {
    return this.CommitmentReferenceFetch;
  }
  /** Set the SortOrder for field: CommitmentReference (CUSTOMER_CONTRACT_VIEW.commitment_reference)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCommitmentReferenceSortOrder (Integer value) {
    this.CommitmentReferenceSort = value;
  }
  /** Retrieve SortOrder for field: CommitmentReference (CUSTOMER_CONTRACT_VIEW.commitment_reference)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCommitmentReferenceSortOrder () {
    return this.CommitmentReferenceSort;
  }
  /** Set the sort direction for field: CommitmentReference (CUSTOMER_CONTRACT_VIEW.commitment_reference)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCommitmentReferenceSortDirection (boolean ascending) {
    this.CommitmentReferenceSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CommitmentReference (CUSTOMER_CONTRACT_VIEW.commitment_reference)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCommitmentReferenceSortDirection () {
    return this.CommitmentReferenceSortAscending;
  }
  /** Set the field level filters for field: CommitmentReference (CUSTOMER_CONTRACT_VIEW.commitment_reference)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCommitmentReferenceFilter (IntegerFilter[] value) throws ServiceException {
    this.CommitmentReference = value;
  }
  /** Retrieve filter for field: CommitmentReference (CUSTOMER_CONTRACT_VIEW.commitment_reference)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCommitmentReferenceFilter () {
    return this.CommitmentReference;
  }

  /**
   * Retrieves the CommitmentReferenceFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CommitmentReferenceFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CommitmentReferenceFilter field
   */
  public String[] getCommitmentReferenceFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCommitmentReferenceFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCommitmentReferenceFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCommitmentReferenceFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CommitmentReferenceFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCommitmentReferenceFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CommitmentReferenceFilter filter value from a formatted string
   *
   * @param _value the CommitmentReferenceFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CommitmentReferenceFilter filter field
   */
  public void setCommitmentReferenceFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCommitmentReferenceFilterFromFormattedString");
    try {
      this.setCommitmentReferenceFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CommitmentReferenceFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCommitmentReferenceFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCommitmentReferenceFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated CommitmentReferenceFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the CommitmentReferenceFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CommitmentReferenceFilter filter field
   */
  public String[] getCommitmentReferenceFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCommitmentReferenceFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getCommitmentReferenceFilter(), "ProductType", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCommitmentReferenceFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CommitmentReferenceFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCommitmentReferenceFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated CommitmentReferenceFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the CommitmentReferenceFilter filter field
   */
  public void setCommitmentReferenceFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCommitmentReferenceFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setCommitmentReferenceFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "CommitmentReference", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CommitmentReferenceFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCommitmentReferenceFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCommitmentReferenceFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: DescriptionCode (CONTRACT_TYPES.description_code)
   * @param fetch whether to fetch this field or not
   */
  public void setDescriptionCodeFetch (boolean fetch) {
    this.DescriptionCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: DescriptionCode (CONTRACT_TYPES.description_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getDescriptionCodeFetch () {
    return this.DescriptionCodeFetch;
  }
  /** Set the SortOrder for field: DescriptionCode (CONTRACT_TYPES.description_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDescriptionCodeSortOrder (Integer value) {
    this.DescriptionCodeSort = value;
  }
  /** Retrieve SortOrder for field: DescriptionCode (CONTRACT_TYPES.description_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDescriptionCodeSortOrder () {
    return this.DescriptionCodeSort;
  }
  /** Set the sort direction for field: DescriptionCode (CONTRACT_TYPES.description_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDescriptionCodeSortDirection (boolean ascending) {
    this.DescriptionCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DescriptionCode (CONTRACT_TYPES.description_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDescriptionCodeSortDirection () {
    return this.DescriptionCodeSortAscending;
  }
  /** Set the field level filters for field: DescriptionCode (CONTRACT_TYPES.description_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDescriptionCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.DescriptionCode = value;
  }
  /** Retrieve filter for field: DescriptionCode (CONTRACT_TYPES.description_code)
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

  /** Set the field level Fetch value for field: StartDt (CUSTOMER_CONTRACT_VIEW.start_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setStartDtFetch (boolean fetch) {
    this.StartDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: StartDt (CUSTOMER_CONTRACT_VIEW.start_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getStartDtFetch () {
    return this.StartDtFetch;
  }
  /** Set the SortOrder for field: StartDt (CUSTOMER_CONTRACT_VIEW.start_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStartDtSortOrder (Integer value) {
    this.StartDtSort = value;
  }
  /** Retrieve SortOrder for field: StartDt (CUSTOMER_CONTRACT_VIEW.start_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStartDtSortOrder () {
    return this.StartDtSort;
  }
  /** Set the sort direction for field: StartDt (CUSTOMER_CONTRACT_VIEW.start_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStartDtSortDirection (boolean ascending) {
    this.StartDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: StartDt (CUSTOMER_CONTRACT_VIEW.start_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStartDtSortDirection () {
    return this.StartDtSortAscending;
  }
  /** Set the field level filters for field: StartDt (CUSTOMER_CONTRACT_VIEW.start_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStartDtFilter (DateFilter[] value) throws ServiceException {
    this.StartDt = value;
  }
  /** Retrieve filter for field: StartDt (CUSTOMER_CONTRACT_VIEW.start_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getStartDtFilter () {
    return this.StartDt;
  }

  /**
   * Retrieves the StartDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StartDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StartDtFilter field
   */
  public String[] getStartDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStartDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getStartDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStartDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StartDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStartDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the StartDtFilter filter value from a formatted string
   *
   * @param _value the StartDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the StartDtFilter filter field
   */
  public void setStartDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStartDtFilterFromFormattedString");
    try {
      this.setStartDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StartDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStartDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStartDtFilterFromFormattedString");
  }

  /**
   * Retrieves the StartDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StartDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the StartDtFilter field
   */
  public String[] getStartDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStartDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getStartDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStartDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StartDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStartDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the StartDtFilter filter value from a formatted string
   *
   * @param _value the StartDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the StartDtFilter filter field
   */
  public void setStartDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStartDtFilterFromFormattedDateTimeString");
    try {
      this.setStartDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StartDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStartDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStartDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: EndDt (CUSTOMER_CONTRACT_VIEW.end_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setEndDtFetch (boolean fetch) {
    this.EndDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: EndDt (CUSTOMER_CONTRACT_VIEW.end_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getEndDtFetch () {
    return this.EndDtFetch;
  }
  /** Set the SortOrder for field: EndDt (CUSTOMER_CONTRACT_VIEW.end_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEndDtSortOrder (Integer value) {
    this.EndDtSort = value;
  }
  /** Retrieve SortOrder for field: EndDt (CUSTOMER_CONTRACT_VIEW.end_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEndDtSortOrder () {
    return this.EndDtSort;
  }
  /** Set the sort direction for field: EndDt (CUSTOMER_CONTRACT_VIEW.end_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEndDtSortDirection (boolean ascending) {
    this.EndDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EndDt (CUSTOMER_CONTRACT_VIEW.end_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEndDtSortDirection () {
    return this.EndDtSortAscending;
  }
  /** Set the field level filters for field: EndDt (CUSTOMER_CONTRACT_VIEW.end_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEndDtFilter (DateFilter[] value) throws ServiceException {
    this.EndDt = value;
  }
  /** Retrieve filter for field: EndDt (CUSTOMER_CONTRACT_VIEW.end_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getEndDtFilter () {
    return this.EndDt;
  }

  /**
   * Retrieves the EndDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EndDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EndDtFilter field
   */
  public String[] getEndDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEndDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEndDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEndDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EndDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEndDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EndDtFilter filter value from a formatted string
   *
   * @param _value the EndDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EndDtFilter filter field
   */
  public void setEndDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEndDtFilterFromFormattedString");
    try {
      this.setEndDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EndDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEndDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEndDtFilterFromFormattedString");
  }

  /**
   * Retrieves the EndDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EndDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the EndDtFilter field
   */
  public String[] getEndDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEndDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEndDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEndDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EndDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEndDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the EndDtFilter filter value from a formatted string
   *
   * @param _value the EndDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EndDtFilter filter field
   */
  public void setEndDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEndDtFilterFromFormattedDateTimeString");
    try {
      this.setEndDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EndDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEndDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEndDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: ContractLevel (CUSTOMER_CONTRACT_VIEW.contract_level)
   * @param fetch whether to fetch this field or not
   */
  public void setContractLevelFetch (boolean fetch) {
    this.ContractLevelFetch = fetch;
  }
  /** Retrieve Fetch value for field: ContractLevel (CUSTOMER_CONTRACT_VIEW.contract_level)
   * @return boolean the Fetch value for this field
   */
  public boolean getContractLevelFetch () {
    return this.ContractLevelFetch;
  }
  /** Set the SortOrder for field: ContractLevel (CUSTOMER_CONTRACT_VIEW.contract_level)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setContractLevelSortOrder (Integer value) {
    this.ContractLevelSort = value;
  }
  /** Retrieve SortOrder for field: ContractLevel (CUSTOMER_CONTRACT_VIEW.contract_level)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getContractLevelSortOrder () {
    return this.ContractLevelSort;
  }
  /** Set the sort direction for field: ContractLevel (CUSTOMER_CONTRACT_VIEW.contract_level)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setContractLevelSortDirection (boolean ascending) {
    this.ContractLevelSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ContractLevel (CUSTOMER_CONTRACT_VIEW.contract_level)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getContractLevelSortDirection () {
    return this.ContractLevelSortAscending;
  }
  /** Set the field level filters for field: ContractLevel (CUSTOMER_CONTRACT_VIEW.contract_level)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setContractLevelFilter (IntegerFilter[] value) throws ServiceException {
    this.ContractLevel = value;
  }
  /** Retrieve filter for field: ContractLevel (CUSTOMER_CONTRACT_VIEW.contract_level)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getContractLevelFilter () {
    return this.ContractLevel;
  }

  /**
   * Retrieves the ContractLevelFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ContractLevelFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ContractLevelFilter field
   */
  public String[] getContractLevelFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractLevelFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getContractLevelFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContractLevelFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContractLevelFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getContractLevelFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ContractLevelFilter filter value from a formatted string
   *
   * @param _value the ContractLevelFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ContractLevelFilter filter field
   */
  public void setContractLevelFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setContractLevelFilterFromFormattedString");
    try {
      this.setContractLevelFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContractLevelFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setContractLevelFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContractLevelFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ContractType (CUSTOMER_CONTRACT_VIEW.contract_type)
   * @param fetch whether to fetch this field or not
   */
  public void setContractTypeFetch (boolean fetch) {
    this.ContractTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ContractType (CUSTOMER_CONTRACT_VIEW.contract_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getContractTypeFetch () {
    return this.ContractTypeFetch;
  }
  /** Set the SortOrder for field: ContractType (CUSTOMER_CONTRACT_VIEW.contract_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setContractTypeSortOrder (Integer value) {
    this.ContractTypeSort = value;
  }
  /** Retrieve SortOrder for field: ContractType (CUSTOMER_CONTRACT_VIEW.contract_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getContractTypeSortOrder () {
    return this.ContractTypeSort;
  }
  /** Set the sort direction for field: ContractType (CUSTOMER_CONTRACT_VIEW.contract_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setContractTypeSortDirection (boolean ascending) {
    this.ContractTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ContractType (CUSTOMER_CONTRACT_VIEW.contract_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getContractTypeSortDirection () {
    return this.ContractTypeSortAscending;
  }
  /** Set the field level filters for field: ContractType (CUSTOMER_CONTRACT_VIEW.contract_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setContractTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.ContractType = value;
  }
  /** Retrieve filter for field: ContractType (CUSTOMER_CONTRACT_VIEW.contract_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getContractTypeFilter () {
    return this.ContractType;
  }

  /**
   * Retrieves the ContractTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ContractTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ContractTypeFilter field
   */
  public String[] getContractTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getContractTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContractTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContractTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getContractTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ContractTypeFilter filter value from a formatted string
   *
   * @param _value the ContractTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ContractTypeFilter filter field
   */
  public void setContractTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setContractTypeFilterFromFormattedString");
    try {
      this.setContractTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContractTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setContractTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContractTypeFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated ContractTypeFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the ContractTypeFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ContractTypeFilter filter field
   */
  public String[] getContractTypeFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractTypeFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getContractTypeFilter(), "ContractType", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContractTypeFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContractTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getContractTypeFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated ContractTypeFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the ContractTypeFilter filter field
   */
  public void setContractTypeFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setContractTypeFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setContractTypeFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "ContractType", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContractTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setContractTypeFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContractTypeFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: TerminationTypeIdNrc (CONTRACT_TYPES.termination_type_id_nrc)
   * @param fetch whether to fetch this field or not
   */
  public void setTerminationTypeIdNrcFetch (boolean fetch) {
    this.TerminationTypeIdNrcFetch = fetch;
  }
  /** Retrieve Fetch value for field: TerminationTypeIdNrc (CONTRACT_TYPES.termination_type_id_nrc)
   * @return boolean the Fetch value for this field
   */
  public boolean getTerminationTypeIdNrcFetch () {
    return this.TerminationTypeIdNrcFetch;
  }
  /** Set the SortOrder for field: TerminationTypeIdNrc (CONTRACT_TYPES.termination_type_id_nrc)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTerminationTypeIdNrcSortOrder (Integer value) {
    this.TerminationTypeIdNrcSort = value;
  }
  /** Retrieve SortOrder for field: TerminationTypeIdNrc (CONTRACT_TYPES.termination_type_id_nrc)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTerminationTypeIdNrcSortOrder () {
    return this.TerminationTypeIdNrcSort;
  }
  /** Set the sort direction for field: TerminationTypeIdNrc (CONTRACT_TYPES.termination_type_id_nrc)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTerminationTypeIdNrcSortDirection (boolean ascending) {
    this.TerminationTypeIdNrcSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TerminationTypeIdNrc (CONTRACT_TYPES.termination_type_id_nrc)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTerminationTypeIdNrcSortDirection () {
    return this.TerminationTypeIdNrcSortAscending;
  }
  /** Set the field level filters for field: TerminationTypeIdNrc (CONTRACT_TYPES.termination_type_id_nrc)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTerminationTypeIdNrcFilter (IntegerFilter[] value) throws ServiceException {
    this.TerminationTypeIdNrc = value;
  }
  /** Retrieve filter for field: TerminationTypeIdNrc (CONTRACT_TYPES.termination_type_id_nrc)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTerminationTypeIdNrcFilter () {
    return this.TerminationTypeIdNrc;
  }

  /**
   * Retrieves the TerminationTypeIdNrcFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TerminationTypeIdNrcFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TerminationTypeIdNrcFilter field
   */
  public String[] getTerminationTypeIdNrcFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTerminationTypeIdNrcFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTerminationTypeIdNrcFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTerminationTypeIdNrcFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TerminationTypeIdNrcFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTerminationTypeIdNrcFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TerminationTypeIdNrcFilter filter value from a formatted string
   *
   * @param _value the TerminationTypeIdNrcFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TerminationTypeIdNrcFilter filter field
   */
  public void setTerminationTypeIdNrcFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTerminationTypeIdNrcFilterFromFormattedString");
    try {
      this.setTerminationTypeIdNrcFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TerminationTypeIdNrcFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTerminationTypeIdNrcFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTerminationTypeIdNrcFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CommitmentTypeIdNrc (CONTRACT_TYPES.commitment_type_id_nrc)
   * @param fetch whether to fetch this field or not
   */
  public void setCommitmentTypeIdNrcFetch (boolean fetch) {
    this.CommitmentTypeIdNrcFetch = fetch;
  }
  /** Retrieve Fetch value for field: CommitmentTypeIdNrc (CONTRACT_TYPES.commitment_type_id_nrc)
   * @return boolean the Fetch value for this field
   */
  public boolean getCommitmentTypeIdNrcFetch () {
    return this.CommitmentTypeIdNrcFetch;
  }
  /** Set the SortOrder for field: CommitmentTypeIdNrc (CONTRACT_TYPES.commitment_type_id_nrc)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCommitmentTypeIdNrcSortOrder (Integer value) {
    this.CommitmentTypeIdNrcSort = value;
  }
  /** Retrieve SortOrder for field: CommitmentTypeIdNrc (CONTRACT_TYPES.commitment_type_id_nrc)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCommitmentTypeIdNrcSortOrder () {
    return this.CommitmentTypeIdNrcSort;
  }
  /** Set the sort direction for field: CommitmentTypeIdNrc (CONTRACT_TYPES.commitment_type_id_nrc)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCommitmentTypeIdNrcSortDirection (boolean ascending) {
    this.CommitmentTypeIdNrcSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CommitmentTypeIdNrc (CONTRACT_TYPES.commitment_type_id_nrc)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCommitmentTypeIdNrcSortDirection () {
    return this.CommitmentTypeIdNrcSortAscending;
  }
  /** Set the field level filters for field: CommitmentTypeIdNrc (CONTRACT_TYPES.commitment_type_id_nrc)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCommitmentTypeIdNrcFilter (IntegerFilter[] value) throws ServiceException {
    this.CommitmentTypeIdNrc = value;
  }
  /** Retrieve filter for field: CommitmentTypeIdNrc (CONTRACT_TYPES.commitment_type_id_nrc)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCommitmentTypeIdNrcFilter () {
    return this.CommitmentTypeIdNrc;
  }

  /**
   * Retrieves the CommitmentTypeIdNrcFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CommitmentTypeIdNrcFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CommitmentTypeIdNrcFilter field
   */
  public String[] getCommitmentTypeIdNrcFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCommitmentTypeIdNrcFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCommitmentTypeIdNrcFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCommitmentTypeIdNrcFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CommitmentTypeIdNrcFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCommitmentTypeIdNrcFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CommitmentTypeIdNrcFilter filter value from a formatted string
   *
   * @param _value the CommitmentTypeIdNrcFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CommitmentTypeIdNrcFilter filter field
   */
  public void setCommitmentTypeIdNrcFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCommitmentTypeIdNrcFilterFromFormattedString");
    try {
      this.setCommitmentTypeIdNrcFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CommitmentTypeIdNrcFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCommitmentTypeIdNrcFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCommitmentTypeIdNrcFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ContractCategory (CONTRACT_TYPES.contract_category)
   * @param fetch whether to fetch this field or not
   */
  public void setContractCategoryFetch (boolean fetch) {
    this.ContractCategoryFetch = fetch;
  }
  /** Retrieve Fetch value for field: ContractCategory (CONTRACT_TYPES.contract_category)
   * @return boolean the Fetch value for this field
   */
  public boolean getContractCategoryFetch () {
    return this.ContractCategoryFetch;
  }
  /** Set the SortOrder for field: ContractCategory (CONTRACT_TYPES.contract_category)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setContractCategorySortOrder (Integer value) {
    this.ContractCategorySort = value;
  }
  /** Retrieve SortOrder for field: ContractCategory (CONTRACT_TYPES.contract_category)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getContractCategorySortOrder () {
    return this.ContractCategorySort;
  }
  /** Set the sort direction for field: ContractCategory (CONTRACT_TYPES.contract_category)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setContractCategorySortDirection (boolean ascending) {
    this.ContractCategorySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ContractCategory (CONTRACT_TYPES.contract_category)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getContractCategorySortDirection () {
    return this.ContractCategorySortAscending;
  }
  /** Set the field level filters for field: ContractCategory (CONTRACT_TYPES.contract_category)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setContractCategoryFilter (IntegerFilter[] value) throws ServiceException {
    this.ContractCategory = value;
  }
  /** Retrieve filter for field: ContractCategory (CONTRACT_TYPES.contract_category)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getContractCategoryFilter () {
    return this.ContractCategory;
  }

  /**
   * Retrieves the ContractCategoryFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ContractCategoryFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ContractCategoryFilter field
   */
  public String[] getContractCategoryFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractCategoryFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getContractCategoryFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContractCategoryFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContractCategoryFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getContractCategoryFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ContractCategoryFilter filter value from a formatted string
   *
   * @param _value the ContractCategoryFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ContractCategoryFilter filter field
   */
  public void setContractCategoryFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setContractCategoryFilterFromFormattedString");
    try {
      this.setContractCategoryFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContractCategoryFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setContractCategoryFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContractCategoryFilterFromFormattedString");
  }

  public String toString() {
    return PRRContractDataObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return PRRContractDataObjectHelper.toMap(this, null);
  }
}
