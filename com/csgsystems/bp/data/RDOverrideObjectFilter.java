/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: RDOverrideObjectFilter.java
 * Definition File: Customer/OverrideDiscountRate.xml
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
public class RDOverrideObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public RDOverrideObjectKeyFilter Key = null;
  /** raw field for: RATE_DISCOUNT_OVERRIDES.contract_tracking_id) */
  public    IntegerFilter[] ContractTrackingId  = null;
  protected boolean ContractTrackingIdFetch = false;
  protected boolean ContractTrackingIdSortAscending = true;
  protected Integer ContractTrackingIdSort = null;
  /** raw field for: RATE_DISCOUNT_OVERRIDES.contract_tracking_id_serv) */
  public    IntegerFilter[] ContractTrackingIdServ  = null;
  protected boolean ContractTrackingIdServFetch = false;
  protected boolean ContractTrackingIdServSortAscending = true;
  protected Integer ContractTrackingIdServSort = null;
  /** raw field for: RATE_DISCOUNT_OVERRIDES.discount_id) */
  public    IntegerFilter[] DiscountId  = null;
  protected boolean DiscountIdFetch = false;
  protected boolean DiscountIdSortAscending = true;
  protected Integer DiscountIdSort = null;
  /** raw field for: RATE_DISCOUNT_OVERRIDES.range_origin) */
  public    BigIntegerFilter[] RangeOrigin  = null;
  protected boolean RangeOriginFetch = false;
  protected boolean RangeOriginSortAscending = true;
  protected Integer RangeOriginSort = null;
  /** raw field for: RATE_DISCOUNT_OVERRIDES.range_terminus) */
  public    BigIntegerFilter[] RangeTerminus  = null;
  protected boolean RangeTerminusFetch = false;
  protected boolean RangeTerminusSortAscending = true;
  protected Integer RangeTerminusSort = null;
  /** raw field for: RATE_DISCOUNT_OVERRIDES.billing_frequency) */
  public    IntegerFilter[] BillingFrequency  = null;
  protected boolean BillingFrequencyFetch = false;
  protected boolean BillingFrequencySortAscending = true;
  protected Integer BillingFrequencySort = null;
  /** raw field for: RATE_DISCOUNT_OVERRIDES.currency_code) */
  public    IntegerFilter[] CurrencyCode  = null;
  protected boolean CurrencyCodeFetch = false;
  protected boolean CurrencyCodeSortAscending = true;
  protected Integer CurrencyCodeSort = null;
  /** raw field for: RATE_DISCOUNT_OVERRIDES.discount_percent) */
  public    IntegerFilter[] DiscountPercent  = null;
  protected boolean DiscountPercentFetch = false;
  protected boolean DiscountPercentSortAscending = true;
  protected Integer DiscountPercentSort = null;
  /** raw field for: RATE_DISCOUNT_OVERRIDES.implied_decimals) */
  public    IntegerFilter[] ImpliedDecimals  = null;
  protected boolean ImpliedDecimalsFetch = false;
  protected boolean ImpliedDecimalsSortAscending = true;
  protected Integer ImpliedDecimalsSort = null;
  /** raw field for: RATE_DISCOUNT_OVERRIDES.discount_amount) */
  public    BigIntegerFilter[] DiscountAmount  = null;
  protected boolean DiscountAmountFetch = false;
  protected boolean DiscountAmountSortAscending = true;
  protected Integer DiscountAmountSort = null;
  /** raw field for: RATE_DISCOUNT_OVERRIDES.create_dt) */
  public    DateFilter[] CreateDt  = null;
  protected boolean CreateDtFetch = false;
  protected boolean CreateDtSortAscending = true;
  protected Integer CreateDtSort = null;
  /** raw field for: RATE_DISCOUNT_OVERRIDES.chg_dt) */
  public    DateFilter[] ChgDt  = null;
  protected boolean ChgDtFetch = false;
  protected boolean ChgDtSortAscending = true;
  protected Integer ChgDtSort = null;
  /** raw field for: RATE_DISCOUNT_OVERRIDES.chg_who) */
  public    StringFilter[] ChgWho  = null;
  protected boolean ChgWhoFetch = false;
  protected boolean ChgWhoSortAscending = true;
  protected boolean ChgWhoCaseInsensitive = false;
  protected Integer ChgWhoSort = null;
  /** raw field for: RATE_DISCOUNT_OVERRIDES.task_mode) */
  public    IntegerFilter[] TaskMode  = null;
  protected boolean TaskModeFetch = false;
  protected boolean TaskModeSortAscending = true;
  protected Integer TaskModeSort = null;
  /** raw field for: RATE_DISCOUNT_OVERRIDES.active_dt) */
  public    DateFilter[] ActiveDt  = null;
  protected boolean ActiveDtFetch = false;
  protected boolean ActiveDtSortAscending = true;
  protected Integer ActiveDtSort = null;
  /** raw field for: RATE_DISCOUNT_OVERRIDES.inactive_dt) */
  public    DateFilter[] InactiveDt  = null;
  protected boolean InactiveDtFetch = false;
  protected boolean InactiveDtSortAscending = true;
  protected Integer InactiveDtSort = null;
  private String _objName = "RDOverrideObjectFilter";
  /** default constructor */
  public RDOverrideObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public RDOverrideObjectFilter (RDOverrideObjectFilter other)
  {
    if (other == null) return;
    this.Key = new RDOverrideObjectKeyFilter (other.Key);
    this.ContractTrackingId = other.ContractTrackingId;
    this.ContractTrackingIdFetch = other.ContractTrackingIdFetch;
    this.ContractTrackingIdSort = other.ContractTrackingIdSort;
    this.ContractTrackingIdSortAscending = other.ContractTrackingIdSortAscending;
    this.ContractTrackingIdServ = other.ContractTrackingIdServ;
    this.ContractTrackingIdServFetch = other.ContractTrackingIdServFetch;
    this.ContractTrackingIdServSort = other.ContractTrackingIdServSort;
    this.ContractTrackingIdServSortAscending = other.ContractTrackingIdServSortAscending;
    this.DiscountId = other.DiscountId;
    this.DiscountIdFetch = other.DiscountIdFetch;
    this.DiscountIdSort = other.DiscountIdSort;
    this.DiscountIdSortAscending = other.DiscountIdSortAscending;
    this.RangeOrigin = other.RangeOrigin;
    this.RangeOriginFetch = other.RangeOriginFetch;
    this.RangeOriginSort = other.RangeOriginSort;
    this.RangeOriginSortAscending = other.RangeOriginSortAscending;
    this.RangeTerminus = other.RangeTerminus;
    this.RangeTerminusFetch = other.RangeTerminusFetch;
    this.RangeTerminusSort = other.RangeTerminusSort;
    this.RangeTerminusSortAscending = other.RangeTerminusSortAscending;
    this.BillingFrequency = other.BillingFrequency;
    this.BillingFrequencyFetch = other.BillingFrequencyFetch;
    this.BillingFrequencySort = other.BillingFrequencySort;
    this.BillingFrequencySortAscending = other.BillingFrequencySortAscending;
    this.CurrencyCode = other.CurrencyCode;
    this.CurrencyCodeFetch = other.CurrencyCodeFetch;
    this.CurrencyCodeSort = other.CurrencyCodeSort;
    this.CurrencyCodeSortAscending = other.CurrencyCodeSortAscending;
    this.DiscountPercent = other.DiscountPercent;
    this.DiscountPercentFetch = other.DiscountPercentFetch;
    this.DiscountPercentSort = other.DiscountPercentSort;
    this.DiscountPercentSortAscending = other.DiscountPercentSortAscending;
    this.ImpliedDecimals = other.ImpliedDecimals;
    this.ImpliedDecimalsFetch = other.ImpliedDecimalsFetch;
    this.ImpliedDecimalsSort = other.ImpliedDecimalsSort;
    this.ImpliedDecimalsSortAscending = other.ImpliedDecimalsSortAscending;
    this.DiscountAmount = other.DiscountAmount;
    this.DiscountAmountFetch = other.DiscountAmountFetch;
    this.DiscountAmountSort = other.DiscountAmountSort;
    this.DiscountAmountSortAscending = other.DiscountAmountSortAscending;
    this.CreateDt = other.CreateDt;
    this.CreateDtFetch = other.CreateDtFetch;
    this.CreateDtSort = other.CreateDtSort;
    this.CreateDtSortAscending = other.CreateDtSortAscending;
    this.ChgDt = other.ChgDt;
    this.ChgDtFetch = other.ChgDtFetch;
    this.ChgDtSort = other.ChgDtSort;
    this.ChgDtSortAscending = other.ChgDtSortAscending;
    this.ChgWho = other.ChgWho;
    this.ChgWhoFetch = other.ChgWhoFetch;
    this.ChgWhoSort = other.ChgWhoSort;
    this.ChgWhoCaseInsensitive = other.ChgWhoCaseInsensitive;
    this.ChgWhoSortAscending = other.ChgWhoSortAscending;
    this.TaskMode = other.TaskMode;
    this.TaskModeFetch = other.TaskModeFetch;
    this.TaskModeSort = other.TaskModeSort;
    this.TaskModeSortAscending = other.TaskModeSortAscending;
    this.ActiveDt = other.ActiveDt;
    this.ActiveDtFetch = other.ActiveDtFetch;
    this.ActiveDtSort = other.ActiveDtSort;
    this.ActiveDtSortAscending = other.ActiveDtSortAscending;
    this.InactiveDt = other.InactiveDt;
    this.InactiveDtFetch = other.InactiveDtFetch;
    this.InactiveDtSort = other.InactiveDtSort;
    this.InactiveDtSortAscending = other.InactiveDtSortAscending;  }
  /** get the filter for this object's key
   * @return RDOverrideObjectKeyFilter
   */
  public RDOverrideObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (RDOverrideObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: OverrideTrackingId (RATE_DISCOUNT_OVERRIDES.override_tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setOverrideTrackingIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new RDOverrideObjectKeyFilter ();
    this.Key.OverrideTrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: OverrideTrackingId (RATE_DISCOUNT_OVERRIDES.override_tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getOverrideTrackingIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.OverrideTrackingIdFetch;
  }
  /** Set the SortOrder for field: OverrideTrackingId (RATE_DISCOUNT_OVERRIDES.override_tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOverrideTrackingIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new RDOverrideObjectKeyFilter ();
    this.Key.OverrideTrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: OverrideTrackingId (RATE_DISCOUNT_OVERRIDES.override_tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOverrideTrackingIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.OverrideTrackingIdSort;
  }
  /** Set the sort direction for field: OverrideTrackingId (RATE_DISCOUNT_OVERRIDES.override_tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOverrideTrackingIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new RDOverrideObjectKeyFilter ();
    this.Key.OverrideTrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OverrideTrackingId (RATE_DISCOUNT_OVERRIDES.override_tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOverrideTrackingIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.OverrideTrackingIdSortAscending;
  }
  /** Set the field level filters for field: OverrideTrackingId (RATE_DISCOUNT_OVERRIDES.override_tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOverrideTrackingIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new RDOverrideObjectKeyFilter ();
    this.Key.OverrideTrackingId = value;
  }
  /** Retrieve filter for field: OverrideTrackingId (RATE_DISCOUNT_OVERRIDES.override_tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getOverrideTrackingIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.OverrideTrackingId;
  }
  /** Set the field level Fetch value for field: OverrideTrackingIdServ (RATE_DISCOUNT_OVERRIDES.override_tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setOverrideTrackingIdServFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new RDOverrideObjectKeyFilter ();
    this.Key.OverrideTrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: OverrideTrackingIdServ (RATE_DISCOUNT_OVERRIDES.override_tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getOverrideTrackingIdServFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.OverrideTrackingIdServFetch;
  }
  /** Set the SortOrder for field: OverrideTrackingIdServ (RATE_DISCOUNT_OVERRIDES.override_tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOverrideTrackingIdServSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new RDOverrideObjectKeyFilter ();
    this.Key.OverrideTrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: OverrideTrackingIdServ (RATE_DISCOUNT_OVERRIDES.override_tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOverrideTrackingIdServSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.OverrideTrackingIdServSort;
  }
  /** Set the sort direction for field: OverrideTrackingIdServ (RATE_DISCOUNT_OVERRIDES.override_tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOverrideTrackingIdServSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new RDOverrideObjectKeyFilter ();
    this.Key.OverrideTrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OverrideTrackingIdServ (RATE_DISCOUNT_OVERRIDES.override_tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOverrideTrackingIdServSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.OverrideTrackingIdServSortAscending;
  }
  /** Set the field level filters for field: OverrideTrackingIdServ (RATE_DISCOUNT_OVERRIDES.override_tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOverrideTrackingIdServFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new RDOverrideObjectKeyFilter ();
    this.Key.OverrideTrackingIdServ = value;
  }
  /** Retrieve filter for field: OverrideTrackingIdServ (RATE_DISCOUNT_OVERRIDES.override_tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getOverrideTrackingIdServFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.OverrideTrackingIdServ;
  }
  /** Set the field level Fetch value for field: ContractTrackingId (RATE_DISCOUNT_OVERRIDES.contract_tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setContractTrackingIdFetch (boolean fetch) {
    this.ContractTrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ContractTrackingId (RATE_DISCOUNT_OVERRIDES.contract_tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getContractTrackingIdFetch () {
    return this.ContractTrackingIdFetch;
  }
  /** Set the SortOrder for field: ContractTrackingId (RATE_DISCOUNT_OVERRIDES.contract_tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setContractTrackingIdSortOrder (Integer value) {
    this.ContractTrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: ContractTrackingId (RATE_DISCOUNT_OVERRIDES.contract_tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getContractTrackingIdSortOrder () {
    return this.ContractTrackingIdSort;
  }
  /** Set the sort direction for field: ContractTrackingId (RATE_DISCOUNT_OVERRIDES.contract_tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setContractTrackingIdSortDirection (boolean ascending) {
    this.ContractTrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ContractTrackingId (RATE_DISCOUNT_OVERRIDES.contract_tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getContractTrackingIdSortDirection () {
    return this.ContractTrackingIdSortAscending;
  }
  /** Set the field level filters for field: ContractTrackingId (RATE_DISCOUNT_OVERRIDES.contract_tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setContractTrackingIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ContractTrackingId = value;
  }
  /** Retrieve filter for field: ContractTrackingId (RATE_DISCOUNT_OVERRIDES.contract_tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getContractTrackingIdFilter () {
    return this.ContractTrackingId;
  }

  /**
   * Retrieves the ContractTrackingIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ContractTrackingIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ContractTrackingIdFilter field
   */
  public String[] getContractTrackingIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractTrackingIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getContractTrackingIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContractTrackingIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContractTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getContractTrackingIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ContractTrackingIdFilter filter value from a formatted string
   *
   * @param _value the ContractTrackingIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ContractTrackingIdFilter filter field
   */
  public void setContractTrackingIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setContractTrackingIdFilterFromFormattedString");
    try {
      this.setContractTrackingIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContractTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setContractTrackingIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContractTrackingIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ContractTrackingIdServ (RATE_DISCOUNT_OVERRIDES.contract_tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setContractTrackingIdServFetch (boolean fetch) {
    this.ContractTrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: ContractTrackingIdServ (RATE_DISCOUNT_OVERRIDES.contract_tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getContractTrackingIdServFetch () {
    return this.ContractTrackingIdServFetch;
  }
  /** Set the SortOrder for field: ContractTrackingIdServ (RATE_DISCOUNT_OVERRIDES.contract_tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setContractTrackingIdServSortOrder (Integer value) {
    this.ContractTrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: ContractTrackingIdServ (RATE_DISCOUNT_OVERRIDES.contract_tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getContractTrackingIdServSortOrder () {
    return this.ContractTrackingIdServSort;
  }
  /** Set the sort direction for field: ContractTrackingIdServ (RATE_DISCOUNT_OVERRIDES.contract_tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setContractTrackingIdServSortDirection (boolean ascending) {
    this.ContractTrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ContractTrackingIdServ (RATE_DISCOUNT_OVERRIDES.contract_tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getContractTrackingIdServSortDirection () {
    return this.ContractTrackingIdServSortAscending;
  }
  /** Set the field level filters for field: ContractTrackingIdServ (RATE_DISCOUNT_OVERRIDES.contract_tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setContractTrackingIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.ContractTrackingIdServ = value;
  }
  /** Retrieve filter for field: ContractTrackingIdServ (RATE_DISCOUNT_OVERRIDES.contract_tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getContractTrackingIdServFilter () {
    return this.ContractTrackingIdServ;
  }

  /**
   * Retrieves the ContractTrackingIdServFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ContractTrackingIdServFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ContractTrackingIdServFilter field
   */
  public String[] getContractTrackingIdServFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractTrackingIdServFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getContractTrackingIdServFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContractTrackingIdServFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContractTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getContractTrackingIdServFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ContractTrackingIdServFilter filter value from a formatted string
   *
   * @param _value the ContractTrackingIdServFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ContractTrackingIdServFilter filter field
   */
  public void setContractTrackingIdServFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setContractTrackingIdServFilterFromFormattedString");
    try {
      this.setContractTrackingIdServFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContractTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setContractTrackingIdServFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContractTrackingIdServFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DiscountId (RATE_DISCOUNT_OVERRIDES.discount_id)
   * @param fetch whether to fetch this field or not
   */
  public void setDiscountIdFetch (boolean fetch) {
    this.DiscountIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: DiscountId (RATE_DISCOUNT_OVERRIDES.discount_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getDiscountIdFetch () {
    return this.DiscountIdFetch;
  }
  /** Set the SortOrder for field: DiscountId (RATE_DISCOUNT_OVERRIDES.discount_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDiscountIdSortOrder (Integer value) {
    this.DiscountIdSort = value;
  }
  /** Retrieve SortOrder for field: DiscountId (RATE_DISCOUNT_OVERRIDES.discount_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDiscountIdSortOrder () {
    return this.DiscountIdSort;
  }
  /** Set the sort direction for field: DiscountId (RATE_DISCOUNT_OVERRIDES.discount_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDiscountIdSortDirection (boolean ascending) {
    this.DiscountIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DiscountId (RATE_DISCOUNT_OVERRIDES.discount_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDiscountIdSortDirection () {
    return this.DiscountIdSortAscending;
  }
  /** Set the field level filters for field: DiscountId (RATE_DISCOUNT_OVERRIDES.discount_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDiscountIdFilter (IntegerFilter[] value) throws ServiceException {
    this.DiscountId = value;
  }
  /** Retrieve filter for field: DiscountId (RATE_DISCOUNT_OVERRIDES.discount_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDiscountIdFilter () {
    return this.DiscountId;
  }

  /**
   * Retrieves the DiscountIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DiscountIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DiscountIdFilter field
   */
  public String[] getDiscountIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDiscountIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscountIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DiscountIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDiscountIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DiscountIdFilter filter value from a formatted string
   *
   * @param _value the DiscountIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DiscountIdFilter filter field
   */
  public void setDiscountIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDiscountIdFilterFromFormattedString");
    try {
      this.setDiscountIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DiscountIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDiscountIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDiscountIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RangeOrigin (RATE_DISCOUNT_OVERRIDES.range_origin)
   * @param fetch whether to fetch this field or not
   */
  public void setRangeOriginFetch (boolean fetch) {
    this.RangeOriginFetch = fetch;
  }
  /** Retrieve Fetch value for field: RangeOrigin (RATE_DISCOUNT_OVERRIDES.range_origin)
   * @return boolean the Fetch value for this field
   */
  public boolean getRangeOriginFetch () {
    return this.RangeOriginFetch;
  }
  /** Set the SortOrder for field: RangeOrigin (RATE_DISCOUNT_OVERRIDES.range_origin)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRangeOriginSortOrder (Integer value) {
    this.RangeOriginSort = value;
  }
  /** Retrieve SortOrder for field: RangeOrigin (RATE_DISCOUNT_OVERRIDES.range_origin)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRangeOriginSortOrder () {
    return this.RangeOriginSort;
  }
  /** Set the sort direction for field: RangeOrigin (RATE_DISCOUNT_OVERRIDES.range_origin)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRangeOriginSortDirection (boolean ascending) {
    this.RangeOriginSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RangeOrigin (RATE_DISCOUNT_OVERRIDES.range_origin)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRangeOriginSortDirection () {
    return this.RangeOriginSortAscending;
  }
  /** Set the field level filters for field: RangeOrigin (RATE_DISCOUNT_OVERRIDES.range_origin)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRangeOriginFilter (BigIntegerFilter[] value) throws ServiceException {
    this.RangeOrigin = value;
  }
  /** Retrieve filter for field: RangeOrigin (RATE_DISCOUNT_OVERRIDES.range_origin)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getRangeOriginFilter () {
    return this.RangeOrigin;
  }

  /**
   * Retrieves the RangeOriginFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RangeOriginFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RangeOriginFilter field
   */
  public String[] getRangeOriginFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRangeOriginFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRangeOriginFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRangeOriginFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RangeOriginFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRangeOriginFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RangeOriginFilter filter value from a formatted string
   *
   * @param _value the RangeOriginFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RangeOriginFilter filter field
   */
  public void setRangeOriginFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRangeOriginFilterFromFormattedString");
    try {
      this.setRangeOriginFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RangeOriginFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRangeOriginFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRangeOriginFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RangeTerminus (RATE_DISCOUNT_OVERRIDES.range_terminus)
   * @param fetch whether to fetch this field or not
   */
  public void setRangeTerminusFetch (boolean fetch) {
    this.RangeTerminusFetch = fetch;
  }
  /** Retrieve Fetch value for field: RangeTerminus (RATE_DISCOUNT_OVERRIDES.range_terminus)
   * @return boolean the Fetch value for this field
   */
  public boolean getRangeTerminusFetch () {
    return this.RangeTerminusFetch;
  }
  /** Set the SortOrder for field: RangeTerminus (RATE_DISCOUNT_OVERRIDES.range_terminus)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRangeTerminusSortOrder (Integer value) {
    this.RangeTerminusSort = value;
  }
  /** Retrieve SortOrder for field: RangeTerminus (RATE_DISCOUNT_OVERRIDES.range_terminus)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRangeTerminusSortOrder () {
    return this.RangeTerminusSort;
  }
  /** Set the sort direction for field: RangeTerminus (RATE_DISCOUNT_OVERRIDES.range_terminus)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRangeTerminusSortDirection (boolean ascending) {
    this.RangeTerminusSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RangeTerminus (RATE_DISCOUNT_OVERRIDES.range_terminus)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRangeTerminusSortDirection () {
    return this.RangeTerminusSortAscending;
  }
  /** Set the field level filters for field: RangeTerminus (RATE_DISCOUNT_OVERRIDES.range_terminus)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRangeTerminusFilter (BigIntegerFilter[] value) throws ServiceException {
    this.RangeTerminus = value;
  }
  /** Retrieve filter for field: RangeTerminus (RATE_DISCOUNT_OVERRIDES.range_terminus)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getRangeTerminusFilter () {
    return this.RangeTerminus;
  }

  /**
   * Retrieves the RangeTerminusFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RangeTerminusFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RangeTerminusFilter field
   */
  public String[] getRangeTerminusFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRangeTerminusFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRangeTerminusFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRangeTerminusFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RangeTerminusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRangeTerminusFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RangeTerminusFilter filter value from a formatted string
   *
   * @param _value the RangeTerminusFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RangeTerminusFilter filter field
   */
  public void setRangeTerminusFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRangeTerminusFilterFromFormattedString");
    try {
      this.setRangeTerminusFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RangeTerminusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRangeTerminusFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRangeTerminusFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillingFrequency (RATE_DISCOUNT_OVERRIDES.billing_frequency)
   * @param fetch whether to fetch this field or not
   */
  public void setBillingFrequencyFetch (boolean fetch) {
    this.BillingFrequencyFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillingFrequency (RATE_DISCOUNT_OVERRIDES.billing_frequency)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillingFrequencyFetch () {
    return this.BillingFrequencyFetch;
  }
  /** Set the SortOrder for field: BillingFrequency (RATE_DISCOUNT_OVERRIDES.billing_frequency)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillingFrequencySortOrder (Integer value) {
    this.BillingFrequencySort = value;
  }
  /** Retrieve SortOrder for field: BillingFrequency (RATE_DISCOUNT_OVERRIDES.billing_frequency)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillingFrequencySortOrder () {
    return this.BillingFrequencySort;
  }
  /** Set the sort direction for field: BillingFrequency (RATE_DISCOUNT_OVERRIDES.billing_frequency)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillingFrequencySortDirection (boolean ascending) {
    this.BillingFrequencySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillingFrequency (RATE_DISCOUNT_OVERRIDES.billing_frequency)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillingFrequencySortDirection () {
    return this.BillingFrequencySortAscending;
  }
  /** Set the field level filters for field: BillingFrequency (RATE_DISCOUNT_OVERRIDES.billing_frequency)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillingFrequencyFilter (IntegerFilter[] value) throws ServiceException {
    this.BillingFrequency = value;
  }
  /** Retrieve filter for field: BillingFrequency (RATE_DISCOUNT_OVERRIDES.billing_frequency)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillingFrequencyFilter () {
    return this.BillingFrequency;
  }

  /**
   * Retrieves the BillingFrequencyFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillingFrequencyFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillingFrequencyFilter field
   */
  public String[] getBillingFrequencyFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillingFrequencyFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillingFrequencyFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillingFrequencyFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillingFrequencyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillingFrequencyFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillingFrequencyFilter filter value from a formatted string
   *
   * @param _value the BillingFrequencyFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillingFrequencyFilter filter field
   */
  public void setBillingFrequencyFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillingFrequencyFilterFromFormattedString");
    try {
      this.setBillingFrequencyFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillingFrequencyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillingFrequencyFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillingFrequencyFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CurrencyCode (RATE_DISCOUNT_OVERRIDES.currency_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCurrencyCodeFetch (boolean fetch) {
    this.CurrencyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CurrencyCode (RATE_DISCOUNT_OVERRIDES.currency_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCurrencyCodeFetch () {
    return this.CurrencyCodeFetch;
  }
  /** Set the SortOrder for field: CurrencyCode (RATE_DISCOUNT_OVERRIDES.currency_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCurrencyCodeSortOrder (Integer value) {
    this.CurrencyCodeSort = value;
  }
  /** Retrieve SortOrder for field: CurrencyCode (RATE_DISCOUNT_OVERRIDES.currency_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCurrencyCodeSortOrder () {
    return this.CurrencyCodeSort;
  }
  /** Set the sort direction for field: CurrencyCode (RATE_DISCOUNT_OVERRIDES.currency_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCurrencyCodeSortDirection (boolean ascending) {
    this.CurrencyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CurrencyCode (RATE_DISCOUNT_OVERRIDES.currency_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCurrencyCodeSortDirection () {
    return this.CurrencyCodeSortAscending;
  }
  /** Set the field level filters for field: CurrencyCode (RATE_DISCOUNT_OVERRIDES.currency_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCurrencyCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.CurrencyCode = value;
  }
  /** Retrieve filter for field: CurrencyCode (RATE_DISCOUNT_OVERRIDES.currency_code)
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

  /** Set the field level Fetch value for field: DiscountPercent (RATE_DISCOUNT_OVERRIDES.discount_percent)
   * @param fetch whether to fetch this field or not
   */
  public void setDiscountPercentFetch (boolean fetch) {
    this.DiscountPercentFetch = fetch;
  }
  /** Retrieve Fetch value for field: DiscountPercent (RATE_DISCOUNT_OVERRIDES.discount_percent)
   * @return boolean the Fetch value for this field
   */
  public boolean getDiscountPercentFetch () {
    return this.DiscountPercentFetch;
  }
  /** Set the SortOrder for field: DiscountPercent (RATE_DISCOUNT_OVERRIDES.discount_percent)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDiscountPercentSortOrder (Integer value) {
    this.DiscountPercentSort = value;
  }
  /** Retrieve SortOrder for field: DiscountPercent (RATE_DISCOUNT_OVERRIDES.discount_percent)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDiscountPercentSortOrder () {
    return this.DiscountPercentSort;
  }
  /** Set the sort direction for field: DiscountPercent (RATE_DISCOUNT_OVERRIDES.discount_percent)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDiscountPercentSortDirection (boolean ascending) {
    this.DiscountPercentSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DiscountPercent (RATE_DISCOUNT_OVERRIDES.discount_percent)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDiscountPercentSortDirection () {
    return this.DiscountPercentSortAscending;
  }
  /** Set the field level filters for field: DiscountPercent (RATE_DISCOUNT_OVERRIDES.discount_percent)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDiscountPercentFilter (IntegerFilter[] value) throws ServiceException {
    this.DiscountPercent = value;
  }
  /** Retrieve filter for field: DiscountPercent (RATE_DISCOUNT_OVERRIDES.discount_percent)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDiscountPercentFilter () {
    return this.DiscountPercent;
  }

  /**
   * Retrieves the DiscountPercentFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DiscountPercentFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DiscountPercentFilter field
   */
  public String[] getDiscountPercentFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountPercentFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDiscountPercentFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscountPercentFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DiscountPercentFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDiscountPercentFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DiscountPercentFilter filter value from a formatted string
   *
   * @param _value the DiscountPercentFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DiscountPercentFilter filter field
   */
  public void setDiscountPercentFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDiscountPercentFilterFromFormattedString");
    try {
      this.setDiscountPercentFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DiscountPercentFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDiscountPercentFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDiscountPercentFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ImpliedDecimals (RATE_DISCOUNT_OVERRIDES.implied_decimals)
   * @param fetch whether to fetch this field or not
   */
  public void setImpliedDecimalsFetch (boolean fetch) {
    this.ImpliedDecimalsFetch = fetch;
  }
  /** Retrieve Fetch value for field: ImpliedDecimals (RATE_DISCOUNT_OVERRIDES.implied_decimals)
   * @return boolean the Fetch value for this field
   */
  public boolean getImpliedDecimalsFetch () {
    return this.ImpliedDecimalsFetch;
  }
  /** Set the SortOrder for field: ImpliedDecimals (RATE_DISCOUNT_OVERRIDES.implied_decimals)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setImpliedDecimalsSortOrder (Integer value) {
    this.ImpliedDecimalsSort = value;
  }
  /** Retrieve SortOrder for field: ImpliedDecimals (RATE_DISCOUNT_OVERRIDES.implied_decimals)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getImpliedDecimalsSortOrder () {
    return this.ImpliedDecimalsSort;
  }
  /** Set the sort direction for field: ImpliedDecimals (RATE_DISCOUNT_OVERRIDES.implied_decimals)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setImpliedDecimalsSortDirection (boolean ascending) {
    this.ImpliedDecimalsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ImpliedDecimals (RATE_DISCOUNT_OVERRIDES.implied_decimals)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getImpliedDecimalsSortDirection () {
    return this.ImpliedDecimalsSortAscending;
  }
  /** Set the field level filters for field: ImpliedDecimals (RATE_DISCOUNT_OVERRIDES.implied_decimals)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setImpliedDecimalsFilter (IntegerFilter[] value) throws ServiceException {
    this.ImpliedDecimals = value;
  }
  /** Retrieve filter for field: ImpliedDecimals (RATE_DISCOUNT_OVERRIDES.implied_decimals)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getImpliedDecimalsFilter () {
    return this.ImpliedDecimals;
  }

  /**
   * Retrieves the ImpliedDecimalsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ImpliedDecimalsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ImpliedDecimalsFilter field
   */
  public String[] getImpliedDecimalsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getImpliedDecimalsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getImpliedDecimalsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getImpliedDecimalsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ImpliedDecimalsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getImpliedDecimalsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ImpliedDecimalsFilter filter value from a formatted string
   *
   * @param _value the ImpliedDecimalsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ImpliedDecimalsFilter filter field
   */
  public void setImpliedDecimalsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setImpliedDecimalsFilterFromFormattedString");
    try {
      this.setImpliedDecimalsFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ImpliedDecimalsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setImpliedDecimalsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setImpliedDecimalsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DiscountAmount (RATE_DISCOUNT_OVERRIDES.discount_amount)
   * @param fetch whether to fetch this field or not
   */
  public void setDiscountAmountFetch (boolean fetch) {
    this.DiscountAmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: DiscountAmount (RATE_DISCOUNT_OVERRIDES.discount_amount)
   * @return boolean the Fetch value for this field
   */
  public boolean getDiscountAmountFetch () {
    return this.DiscountAmountFetch;
  }
  /** Set the SortOrder for field: DiscountAmount (RATE_DISCOUNT_OVERRIDES.discount_amount)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDiscountAmountSortOrder (Integer value) {
    this.DiscountAmountSort = value;
  }
  /** Retrieve SortOrder for field: DiscountAmount (RATE_DISCOUNT_OVERRIDES.discount_amount)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDiscountAmountSortOrder () {
    return this.DiscountAmountSort;
  }
  /** Set the sort direction for field: DiscountAmount (RATE_DISCOUNT_OVERRIDES.discount_amount)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDiscountAmountSortDirection (boolean ascending) {
    this.DiscountAmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DiscountAmount (RATE_DISCOUNT_OVERRIDES.discount_amount)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDiscountAmountSortDirection () {
    return this.DiscountAmountSortAscending;
  }
  /** Set the field level filters for field: DiscountAmount (RATE_DISCOUNT_OVERRIDES.discount_amount)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDiscountAmountFilter (BigIntegerFilter[] value) throws ServiceException {
    this.DiscountAmount = value;
  }
  /** Retrieve filter for field: DiscountAmount (RATE_DISCOUNT_OVERRIDES.discount_amount)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getDiscountAmountFilter () {
    return this.DiscountAmount;
  }

  /**
   * Retrieves the DiscountAmountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DiscountAmountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DiscountAmountFilter field
   */
  public String[] getDiscountAmountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountAmountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDiscountAmountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscountAmountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DiscountAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDiscountAmountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DiscountAmountFilter filter value from a formatted string
   *
   * @param _value the DiscountAmountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DiscountAmountFilter filter field
   */
  public void setDiscountAmountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDiscountAmountFilterFromFormattedString");
    try {
      this.setDiscountAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DiscountAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDiscountAmountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDiscountAmountFilterFromFormattedString");
  }

  /**
   * Sets the DiscountAmountFilter filter value from a formatted string
   *
   * @param _value the DiscountAmountFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DiscountAmountFilter filter field
   */
  public void setDiscountAmountFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDiscountAmountFilterFromFormattedCurrencyString");
    try {
      this.setDiscountAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DiscountAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDiscountAmountFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDiscountAmountFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the DiscountAmountFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DiscountAmountFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the DiscountAmountFilter field
   */

  public String[] getDiscountAmountFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountAmountFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDiscountAmountFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscountAmountFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DiscountAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDiscountAmountFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: CreateDt (RATE_DISCOUNT_OVERRIDES.create_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setCreateDtFetch (boolean fetch) {
    this.CreateDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: CreateDt (RATE_DISCOUNT_OVERRIDES.create_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getCreateDtFetch () {
    return this.CreateDtFetch;
  }
  /** Set the SortOrder for field: CreateDt (RATE_DISCOUNT_OVERRIDES.create_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCreateDtSortOrder (Integer value) {
    this.CreateDtSort = value;
  }
  /** Retrieve SortOrder for field: CreateDt (RATE_DISCOUNT_OVERRIDES.create_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCreateDtSortOrder () {
    return this.CreateDtSort;
  }
  /** Set the sort direction for field: CreateDt (RATE_DISCOUNT_OVERRIDES.create_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCreateDtSortDirection (boolean ascending) {
    this.CreateDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CreateDt (RATE_DISCOUNT_OVERRIDES.create_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCreateDtSortDirection () {
    return this.CreateDtSortAscending;
  }
  /** Set the field level filters for field: CreateDt (RATE_DISCOUNT_OVERRIDES.create_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCreateDtFilter (DateFilter[] value) throws ServiceException {
    this.CreateDt = value;
  }
  /** Retrieve filter for field: CreateDt (RATE_DISCOUNT_OVERRIDES.create_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getCreateDtFilter () {
    return this.CreateDt;
  }

  /**
   * Retrieves the CreateDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CreateDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CreateDtFilter field
   */
  public String[] getCreateDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreateDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCreateDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCreateDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CreateDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCreateDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CreateDtFilter filter value from a formatted string
   *
   * @param _value the CreateDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CreateDtFilter filter field
   */
  public void setCreateDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCreateDtFilterFromFormattedString");
    try {
      this.setCreateDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CreateDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCreateDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCreateDtFilterFromFormattedString");
  }

  /**
   * Retrieves the CreateDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CreateDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the CreateDtFilter field
   */
  public String[] getCreateDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreateDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCreateDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCreateDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CreateDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCreateDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the CreateDtFilter filter value from a formatted string
   *
   * @param _value the CreateDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CreateDtFilter filter field
   */
  public void setCreateDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCreateDtFilterFromFormattedDateTimeString");
    try {
      this.setCreateDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CreateDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCreateDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCreateDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: ChgDt (RATE_DISCOUNT_OVERRIDES.chg_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setChgDtFetch (boolean fetch) {
    this.ChgDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgDt (RATE_DISCOUNT_OVERRIDES.chg_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgDtFetch () {
    return this.ChgDtFetch;
  }
  /** Set the SortOrder for field: ChgDt (RATE_DISCOUNT_OVERRIDES.chg_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgDtSortOrder (Integer value) {
    this.ChgDtSort = value;
  }
  /** Retrieve SortOrder for field: ChgDt (RATE_DISCOUNT_OVERRIDES.chg_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgDtSortOrder () {
    return this.ChgDtSort;
  }
  /** Set the sort direction for field: ChgDt (RATE_DISCOUNT_OVERRIDES.chg_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgDtSortDirection (boolean ascending) {
    this.ChgDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgDt (RATE_DISCOUNT_OVERRIDES.chg_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgDtSortDirection () {
    return this.ChgDtSortAscending;
  }
  /** Set the field level filters for field: ChgDt (RATE_DISCOUNT_OVERRIDES.chg_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgDtFilter (DateFilter[] value) throws ServiceException {
    this.ChgDt = value;
  }
  /** Retrieve filter for field: ChgDt (RATE_DISCOUNT_OVERRIDES.chg_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getChgDtFilter () {
    return this.ChgDt;
  }

  /**
   * Retrieves the ChgDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDtFilter field
   */
  public String[] getChgDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getChgDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ChgDtFilter filter value from a formatted string
   *
   * @param _value the ChgDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ChgDtFilter filter field
   */
  public void setChgDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgDtFilterFromFormattedString");
    try {
      this.setChgDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgDtFilterFromFormattedString");
  }

  /**
   * Retrieves the ChgDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDtFilter field
   */
  public String[] getChgDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getChgDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ChgDtFilter filter value from a formatted string
   *
   * @param _value the ChgDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ChgDtFilter filter field
   */
  public void setChgDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgDtFilterFromFormattedDateTimeString");
    try {
      this.setChgDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: ChgWho (RATE_DISCOUNT_OVERRIDES.chg_who)
   * @param fetch whether to fetch this field or not
   */
  public void setChgWhoFetch (boolean fetch) {
    this.ChgWhoFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgWho (RATE_DISCOUNT_OVERRIDES.chg_who)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgWhoFetch () {
    return this.ChgWhoFetch;
  }
  /** Set the SortOrder for field: ChgWho (RATE_DISCOUNT_OVERRIDES.chg_who)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgWhoSortOrder (Integer value) {
    this.ChgWhoSort = value;
  }
  /** Retrieve SortOrder for field: ChgWho (RATE_DISCOUNT_OVERRIDES.chg_who)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgWhoSortOrder () {
    return this.ChgWhoSort;
  }
  /** Set the sort direction for field: ChgWho (RATE_DISCOUNT_OVERRIDES.chg_who)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgWhoSortDirection (boolean ascending) {
    this.ChgWhoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgWho (RATE_DISCOUNT_OVERRIDES.chg_who)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgWhoSortDirection () {
    return this.ChgWhoSortAscending;
  }
  /** Set the case insensitive for field: ChgWho (RATE_DISCOUNT_OVERRIDES.chg_who)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setChgWhoCaseInsensitive (boolean ascending) {
    this.ChgWhoCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ChgWho (RATE_DISCOUNT_OVERRIDES.chg_who)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getChgWhoCaseInsensitive () {
    return this.ChgWhoCaseInsensitive;
  }
  /** Set the field level filters for field: ChgWho (RATE_DISCOUNT_OVERRIDES.chg_who)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgWhoFilter (StringFilter[] value) throws ServiceException {
    this.ChgWho = value;
  }
  /** Retrieve filter for field: ChgWho (RATE_DISCOUNT_OVERRIDES.chg_who)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getChgWhoFilter () {
    return this.ChgWho;
  }

  /**
   * Retrieves the ChgWhoFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgWhoFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgWhoFilter field
   */
  public String[] getChgWhoFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgWhoFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getChgWhoFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgWhoFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgWhoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgWhoFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ChgWhoFilter filter value from a formatted string
   *
   * @param _value the ChgWhoFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ChgWhoFilter filter field
   */
  public void setChgWhoFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgWhoFilterFromFormattedString");
    try {
      this.setChgWhoFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgWhoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgWhoFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgWhoFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TaskMode (RATE_DISCOUNT_OVERRIDES.task_mode)
   * @param fetch whether to fetch this field or not
   */
  public void setTaskModeFetch (boolean fetch) {
    this.TaskModeFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaskMode (RATE_DISCOUNT_OVERRIDES.task_mode)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaskModeFetch () {
    return this.TaskModeFetch;
  }
  /** Set the SortOrder for field: TaskMode (RATE_DISCOUNT_OVERRIDES.task_mode)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaskModeSortOrder (Integer value) {
    this.TaskModeSort = value;
  }
  /** Retrieve SortOrder for field: TaskMode (RATE_DISCOUNT_OVERRIDES.task_mode)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaskModeSortOrder () {
    return this.TaskModeSort;
  }
  /** Set the sort direction for field: TaskMode (RATE_DISCOUNT_OVERRIDES.task_mode)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaskModeSortDirection (boolean ascending) {
    this.TaskModeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaskMode (RATE_DISCOUNT_OVERRIDES.task_mode)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaskModeSortDirection () {
    return this.TaskModeSortAscending;
  }
  /** Set the field level filters for field: TaskMode (RATE_DISCOUNT_OVERRIDES.task_mode)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaskModeFilter (IntegerFilter[] value) throws ServiceException {
    this.TaskMode = value;
  }
  /** Retrieve filter for field: TaskMode (RATE_DISCOUNT_OVERRIDES.task_mode)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTaskModeFilter () {
    return this.TaskMode;
  }

  /**
   * Retrieves the TaskModeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TaskModeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaskModeFilter field
   */
  public String[] getTaskModeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaskModeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTaskModeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaskModeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaskModeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaskModeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TaskModeFilter filter value from a formatted string
   *
   * @param _value the TaskModeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TaskModeFilter filter field
   */
  public void setTaskModeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTaskModeFilterFromFormattedString");
    try {
      this.setTaskModeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaskModeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaskModeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaskModeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ActiveDt (RATE_DISCOUNT_OVERRIDES.active_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setActiveDtFetch (boolean fetch) {
    this.ActiveDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: ActiveDt (RATE_DISCOUNT_OVERRIDES.active_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getActiveDtFetch () {
    return this.ActiveDtFetch;
  }
  /** Set the SortOrder for field: ActiveDt (RATE_DISCOUNT_OVERRIDES.active_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setActiveDtSortOrder (Integer value) {
    this.ActiveDtSort = value;
  }
  /** Retrieve SortOrder for field: ActiveDt (RATE_DISCOUNT_OVERRIDES.active_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getActiveDtSortOrder () {
    return this.ActiveDtSort;
  }
  /** Set the sort direction for field: ActiveDt (RATE_DISCOUNT_OVERRIDES.active_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setActiveDtSortDirection (boolean ascending) {
    this.ActiveDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ActiveDt (RATE_DISCOUNT_OVERRIDES.active_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getActiveDtSortDirection () {
    return this.ActiveDtSortAscending;
  }
  /** Set the field level filters for field: ActiveDt (RATE_DISCOUNT_OVERRIDES.active_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setActiveDtFilter (DateFilter[] value) throws ServiceException {
    this.ActiveDt = value;
  }
  /** Retrieve filter for field: ActiveDt (RATE_DISCOUNT_OVERRIDES.active_dt)
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


  /** Set the field level Fetch value for field: InactiveDt (RATE_DISCOUNT_OVERRIDES.inactive_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setInactiveDtFetch (boolean fetch) {
    this.InactiveDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: InactiveDt (RATE_DISCOUNT_OVERRIDES.inactive_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getInactiveDtFetch () {
    return this.InactiveDtFetch;
  }
  /** Set the SortOrder for field: InactiveDt (RATE_DISCOUNT_OVERRIDES.inactive_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInactiveDtSortOrder (Integer value) {
    this.InactiveDtSort = value;
  }
  /** Retrieve SortOrder for field: InactiveDt (RATE_DISCOUNT_OVERRIDES.inactive_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInactiveDtSortOrder () {
    return this.InactiveDtSort;
  }
  /** Set the sort direction for field: InactiveDt (RATE_DISCOUNT_OVERRIDES.inactive_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInactiveDtSortDirection (boolean ascending) {
    this.InactiveDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InactiveDt (RATE_DISCOUNT_OVERRIDES.inactive_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInactiveDtSortDirection () {
    return this.InactiveDtSortAscending;
  }
  /** Set the field level filters for field: InactiveDt (RATE_DISCOUNT_OVERRIDES.inactive_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInactiveDtFilter (DateFilter[] value) throws ServiceException {
    this.InactiveDt = value;
  }
  /** Retrieve filter for field: InactiveDt (RATE_DISCOUNT_OVERRIDES.inactive_dt)
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
    return RDOverrideObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return RDOverrideObjectHelper.toMap(this, null);
  }
}
