/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: LateFeeRateOverridesObjectFilter.java
 * Definition File: Customer/LateFeeRateOverrides.xml
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
public class LateFeeRateOverridesObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public LateFeeRateOverridesObjectKeyFilter Key = null;
  /** raw field for: LATE_FEE_RATE_OVERRIDES.currency_code) */
  public    IntegerFilter[] CurrencyCode  = null;
  protected boolean CurrencyCodeFetch = false;
  protected boolean CurrencyCodeSortAscending = true;
  protected Integer CurrencyCodeSort = null;
  /** raw field for: LATE_FEE_RATE_OVERRIDES.rate_amt) */
  public    BigIntegerFilter[] RateAmt  = null;
  protected boolean RateAmtFetch = false;
  protected boolean RateAmtSortAscending = true;
  protected Integer RateAmtSort = null;
  /** raw field for: LATE_FEE_RATE_OVERRIDES.rate_pct) */
  public    IntegerFilter[] RatePct  = null;
  protected boolean RatePctFetch = false;
  protected boolean RatePctSortAscending = true;
  protected Integer RatePctSort = null;
  /** raw field for: LATE_FEE_RATE_OVERRIDES.add_implied_decimals) */
  public    IntegerFilter[] AddImpliedDecimals  = null;
  protected boolean AddImpliedDecimalsFetch = false;
  protected boolean AddImpliedDecimalsSortAscending = true;
  protected Integer AddImpliedDecimalsSort = null;
  /** raw field for: LATE_FEE_RATE_OVERRIDES.delay_origin) */
  public    IntegerFilter[] DelayOrigin  = null;
  protected boolean DelayOriginFetch = false;
  protected boolean DelayOriginSortAscending = true;
  protected Integer DelayOriginSort = null;
  /** raw field for: LATE_FEE_RATE_OVERRIDES.delay_terminus) */
  public    IntegerFilter[] DelayTerminus  = null;
  protected boolean DelayTerminusFetch = false;
  protected boolean DelayTerminusSortAscending = true;
  protected Integer DelayTerminusSort = null;
  /** raw field for: LATE_FEE_RATE_OVERRIDES.inactive_dt) */
  public    DateFilter[] InactiveDt  = null;
  protected boolean InactiveDtFetch = false;
  protected boolean InactiveDtSortAscending = true;
  protected Integer InactiveDtSort = null;
  /** raw field for: LATE_FEE_RATE_OVERRIDES.calculation_type) */
  public    IntegerFilter[] CalculationType  = null;
  protected boolean CalculationTypeFetch = false;
  protected boolean CalculationTypeSortAscending = true;
  protected Integer CalculationTypeSort = null;
  /** raw field for: LATE_FEE_RATE_OVERRIDES.min_amt) */
  public    BigIntegerFilter[] MinAmt  = null;
  protected boolean MinAmtFetch = false;
  protected boolean MinAmtSortAscending = true;
  protected Integer MinAmtSort = null;
  /** raw field for: LATE_FEE_RATE_OVERRIDES.max_amt) */
  public    BigIntegerFilter[] MaxAmt  = null;
  protected boolean MaxAmtFetch = false;
  protected boolean MaxAmtSortAscending = true;
  protected Integer MaxAmtSort = null;
  /** raw field for: LATE_FEE_RATE_OVERRIDES.type_id_nrc) */
  public    IntegerFilter[] TypeIdNrc  = null;
  protected boolean TypeIdNrcFetch = false;
  protected boolean TypeIdNrcSortAscending = true;
  protected Integer TypeIdNrcSort = null;
  /** raw field for: LATE_FEE_RATE_OVERRIDES.grace_period) */
  public    IntegerFilter[] GracePeriod  = null;
  protected boolean GracePeriodFetch = false;
  protected boolean GracePeriodSortAscending = true;
  protected Integer GracePeriodSort = null;
  /** raw field for: LATE_FEE_RATE_OVERRIDES.min_bal_thresh) */
  public    BigIntegerFilter[] MinBalThresh  = null;
  protected boolean MinBalThreshFetch = false;
  protected boolean MinBalThreshSortAscending = true;
  protected Integer MinBalThreshSort = null;
  /** raw field for: LATE_FEE_RATE_OVERRIDES.open_item_id) */
  public    IntegerFilter[] OpenItemId  = null;
  protected boolean OpenItemIdFetch = false;
  protected boolean OpenItemIdSortAscending = true;
  protected Integer OpenItemIdSort = null;
  /** raw field for: LATE_FEE_RATE_OVERRIDES.product_line_id) */
  public    IntegerFilter[] ProductLineId  = null;
  protected boolean ProductLineIdFetch = false;
  protected boolean ProductLineIdSortAscending = true;
  protected Integer ProductLineIdSort = null;
  /** raw field for: LATE_FEE_RATE_OVERRIDES.dual_late_fee) */
  public    IntegerFilter[] DualLateFee  = null;
  protected boolean DualLateFeeFetch = false;
  protected boolean DualLateFeeSortAscending = true;
  protected Integer DualLateFeeSort = null;
  private String _objName = "LateFeeRateOverridesObjectFilter";
  /** default constructor */
  public LateFeeRateOverridesObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public LateFeeRateOverridesObjectFilter (LateFeeRateOverridesObjectFilter other)
  {
    if (other == null) return;
    this.Key = new LateFeeRateOverridesObjectKeyFilter (other.Key);
    this.CurrencyCode = other.CurrencyCode;
    this.CurrencyCodeFetch = other.CurrencyCodeFetch;
    this.CurrencyCodeSort = other.CurrencyCodeSort;
    this.CurrencyCodeSortAscending = other.CurrencyCodeSortAscending;
    this.RateAmt = other.RateAmt;
    this.RateAmtFetch = other.RateAmtFetch;
    this.RateAmtSort = other.RateAmtSort;
    this.RateAmtSortAscending = other.RateAmtSortAscending;
    this.RatePct = other.RatePct;
    this.RatePctFetch = other.RatePctFetch;
    this.RatePctSort = other.RatePctSort;
    this.RatePctSortAscending = other.RatePctSortAscending;
    this.AddImpliedDecimals = other.AddImpliedDecimals;
    this.AddImpliedDecimalsFetch = other.AddImpliedDecimalsFetch;
    this.AddImpliedDecimalsSort = other.AddImpliedDecimalsSort;
    this.AddImpliedDecimalsSortAscending = other.AddImpliedDecimalsSortAscending;
    this.DelayOrigin = other.DelayOrigin;
    this.DelayOriginFetch = other.DelayOriginFetch;
    this.DelayOriginSort = other.DelayOriginSort;
    this.DelayOriginSortAscending = other.DelayOriginSortAscending;
    this.DelayTerminus = other.DelayTerminus;
    this.DelayTerminusFetch = other.DelayTerminusFetch;
    this.DelayTerminusSort = other.DelayTerminusSort;
    this.DelayTerminusSortAscending = other.DelayTerminusSortAscending;
    this.InactiveDt = other.InactiveDt;
    this.InactiveDtFetch = other.InactiveDtFetch;
    this.InactiveDtSort = other.InactiveDtSort;
    this.InactiveDtSortAscending = other.InactiveDtSortAscending;
    this.CalculationType = other.CalculationType;
    this.CalculationTypeFetch = other.CalculationTypeFetch;
    this.CalculationTypeSort = other.CalculationTypeSort;
    this.CalculationTypeSortAscending = other.CalculationTypeSortAscending;
    this.MinAmt = other.MinAmt;
    this.MinAmtFetch = other.MinAmtFetch;
    this.MinAmtSort = other.MinAmtSort;
    this.MinAmtSortAscending = other.MinAmtSortAscending;
    this.MaxAmt = other.MaxAmt;
    this.MaxAmtFetch = other.MaxAmtFetch;
    this.MaxAmtSort = other.MaxAmtSort;
    this.MaxAmtSortAscending = other.MaxAmtSortAscending;
    this.TypeIdNrc = other.TypeIdNrc;
    this.TypeIdNrcFetch = other.TypeIdNrcFetch;
    this.TypeIdNrcSort = other.TypeIdNrcSort;
    this.TypeIdNrcSortAscending = other.TypeIdNrcSortAscending;
    this.GracePeriod = other.GracePeriod;
    this.GracePeriodFetch = other.GracePeriodFetch;
    this.GracePeriodSort = other.GracePeriodSort;
    this.GracePeriodSortAscending = other.GracePeriodSortAscending;
    this.MinBalThresh = other.MinBalThresh;
    this.MinBalThreshFetch = other.MinBalThreshFetch;
    this.MinBalThreshSort = other.MinBalThreshSort;
    this.MinBalThreshSortAscending = other.MinBalThreshSortAscending;
    this.OpenItemId = other.OpenItemId;
    this.OpenItemIdFetch = other.OpenItemIdFetch;
    this.OpenItemIdSort = other.OpenItemIdSort;
    this.OpenItemIdSortAscending = other.OpenItemIdSortAscending;
    this.ProductLineId = other.ProductLineId;
    this.ProductLineIdFetch = other.ProductLineIdFetch;
    this.ProductLineIdSort = other.ProductLineIdSort;
    this.ProductLineIdSortAscending = other.ProductLineIdSortAscending;
    this.DualLateFee = other.DualLateFee;
    this.DualLateFeeFetch = other.DualLateFeeFetch;
    this.DualLateFeeSort = other.DualLateFeeSort;
    this.DualLateFeeSortAscending = other.DualLateFeeSortAscending;  }
  /** get the filter for this object's key
   * @return LateFeeRateOverridesObjectKeyFilter
   */
  public LateFeeRateOverridesObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (LateFeeRateOverridesObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: AccountInternalId (LATE_FEE_RATE_OVERRIDES.account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountInternalIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new LateFeeRateOverridesObjectKeyFilter ();
    this.Key.AccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountInternalId (LATE_FEE_RATE_OVERRIDES.account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountInternalIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.AccountInternalIdFetch;
  }
  /** Set the SortOrder for field: AccountInternalId (LATE_FEE_RATE_OVERRIDES.account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountInternalIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new LateFeeRateOverridesObjectKeyFilter ();
    this.Key.AccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountInternalId (LATE_FEE_RATE_OVERRIDES.account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountInternalIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.AccountInternalIdSort;
  }
  /** Set the sort direction for field: AccountInternalId (LATE_FEE_RATE_OVERRIDES.account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountInternalIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new LateFeeRateOverridesObjectKeyFilter ();
    this.Key.AccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountInternalId (LATE_FEE_RATE_OVERRIDES.account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountInternalIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.AccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: AccountInternalId (LATE_FEE_RATE_OVERRIDES.account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new LateFeeRateOverridesObjectKeyFilter ();
    this.Key.AccountInternalId = value;
  }
  /** Retrieve filter for field: AccountInternalId (LATE_FEE_RATE_OVERRIDES.account_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAccountInternalIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.AccountInternalId;
  }
  /** Set the field level Fetch value for field: LateFeeTypeId (LATE_FEE_RATE_OVERRIDES.late_fee_type_id)
   * @param fetch whether to fetch this field or not
   */
  public void setLateFeeTypeIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new LateFeeRateOverridesObjectKeyFilter ();
    this.Key.LateFeeTypeIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: LateFeeTypeId (LATE_FEE_RATE_OVERRIDES.late_fee_type_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getLateFeeTypeIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.LateFeeTypeIdFetch;
  }
  /** Set the SortOrder for field: LateFeeTypeId (LATE_FEE_RATE_OVERRIDES.late_fee_type_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLateFeeTypeIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new LateFeeRateOverridesObjectKeyFilter ();
    this.Key.LateFeeTypeIdSort = value;
  }
  /** Retrieve SortOrder for field: LateFeeTypeId (LATE_FEE_RATE_OVERRIDES.late_fee_type_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLateFeeTypeIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.LateFeeTypeIdSort;
  }
  /** Set the sort direction for field: LateFeeTypeId (LATE_FEE_RATE_OVERRIDES.late_fee_type_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLateFeeTypeIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new LateFeeRateOverridesObjectKeyFilter ();
    this.Key.LateFeeTypeIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LateFeeTypeId (LATE_FEE_RATE_OVERRIDES.late_fee_type_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLateFeeTypeIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.LateFeeTypeIdSortAscending;
  }
  /** Set the field level filters for field: LateFeeTypeId (LATE_FEE_RATE_OVERRIDES.late_fee_type_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLateFeeTypeIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new LateFeeRateOverridesObjectKeyFilter ();
    this.Key.LateFeeTypeId = value;
  }
  /** Retrieve filter for field: LateFeeTypeId (LATE_FEE_RATE_OVERRIDES.late_fee_type_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getLateFeeTypeIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.LateFeeTypeId;
  }
  /** Set the field level Fetch value for field: ActiveDt (LATE_FEE_RATE_OVERRIDES.active_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setActiveDtFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new LateFeeRateOverridesObjectKeyFilter ();
    this.Key.ActiveDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: ActiveDt (LATE_FEE_RATE_OVERRIDES.active_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getActiveDtFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.ActiveDtFetch;
  }
  /** Set the SortOrder for field: ActiveDt (LATE_FEE_RATE_OVERRIDES.active_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setActiveDtSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new LateFeeRateOverridesObjectKeyFilter ();
    this.Key.ActiveDtSort = value;
  }
  /** Retrieve SortOrder for field: ActiveDt (LATE_FEE_RATE_OVERRIDES.active_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getActiveDtSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.ActiveDtSort;
  }
  /** Set the sort direction for field: ActiveDt (LATE_FEE_RATE_OVERRIDES.active_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setActiveDtSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new LateFeeRateOverridesObjectKeyFilter ();
    this.Key.ActiveDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ActiveDt (LATE_FEE_RATE_OVERRIDES.active_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getActiveDtSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.ActiveDtSortAscending;
  }
  /** Set the field level filters for field: ActiveDt (LATE_FEE_RATE_OVERRIDES.active_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setActiveDtFilter (DateFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new LateFeeRateOverridesObjectKeyFilter ();
    this.Key.ActiveDt = value;
  }
  /** Retrieve filter for field: ActiveDt (LATE_FEE_RATE_OVERRIDES.active_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getActiveDtFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.ActiveDt;
  }
  /** Set the field level Fetch value for field: CurrencyCode (LATE_FEE_RATE_OVERRIDES.currency_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCurrencyCodeFetch (boolean fetch) {
    this.CurrencyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CurrencyCode (LATE_FEE_RATE_OVERRIDES.currency_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCurrencyCodeFetch () {
    return this.CurrencyCodeFetch;
  }
  /** Set the SortOrder for field: CurrencyCode (LATE_FEE_RATE_OVERRIDES.currency_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCurrencyCodeSortOrder (Integer value) {
    this.CurrencyCodeSort = value;
  }
  /** Retrieve SortOrder for field: CurrencyCode (LATE_FEE_RATE_OVERRIDES.currency_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCurrencyCodeSortOrder () {
    return this.CurrencyCodeSort;
  }
  /** Set the sort direction for field: CurrencyCode (LATE_FEE_RATE_OVERRIDES.currency_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCurrencyCodeSortDirection (boolean ascending) {
    this.CurrencyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CurrencyCode (LATE_FEE_RATE_OVERRIDES.currency_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCurrencyCodeSortDirection () {
    return this.CurrencyCodeSortAscending;
  }
  /** Set the field level filters for field: CurrencyCode (LATE_FEE_RATE_OVERRIDES.currency_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCurrencyCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.CurrencyCode = value;
  }
  /** Retrieve filter for field: CurrencyCode (LATE_FEE_RATE_OVERRIDES.currency_code)
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


  /** Set the field level Fetch value for field: RateAmt (LATE_FEE_RATE_OVERRIDES.rate_amt)
   * @param fetch whether to fetch this field or not
   */
  public void setRateAmtFetch (boolean fetch) {
    this.RateAmtFetch = fetch;
  }
  /** Retrieve Fetch value for field: RateAmt (LATE_FEE_RATE_OVERRIDES.rate_amt)
   * @return boolean the Fetch value for this field
   */
  public boolean getRateAmtFetch () {
    return this.RateAmtFetch;
  }
  /** Set the SortOrder for field: RateAmt (LATE_FEE_RATE_OVERRIDES.rate_amt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRateAmtSortOrder (Integer value) {
    this.RateAmtSort = value;
  }
  /** Retrieve SortOrder for field: RateAmt (LATE_FEE_RATE_OVERRIDES.rate_amt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRateAmtSortOrder () {
    return this.RateAmtSort;
  }
  /** Set the sort direction for field: RateAmt (LATE_FEE_RATE_OVERRIDES.rate_amt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRateAmtSortDirection (boolean ascending) {
    this.RateAmtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RateAmt (LATE_FEE_RATE_OVERRIDES.rate_amt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRateAmtSortDirection () {
    return this.RateAmtSortAscending;
  }
  /** Set the field level filters for field: RateAmt (LATE_FEE_RATE_OVERRIDES.rate_amt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRateAmtFilter (BigIntegerFilter[] value) throws ServiceException {
    this.RateAmt = value;
  }
  /** Retrieve filter for field: RateAmt (LATE_FEE_RATE_OVERRIDES.rate_amt)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getRateAmtFilter () {
    return this.RateAmt;
  }

  /**
   * Retrieves the RateAmtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RateAmtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateAmtFilter field
   */
  public String[] getRateAmtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateAmtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRateAmtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateAmtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateAmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateAmtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RateAmtFilter filter value from a formatted string
   *
   * @param _value the RateAmtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RateAmtFilter filter field
   */
  public void setRateAmtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRateAmtFilterFromFormattedString");
    try {
      this.setRateAmtFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateAmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateAmtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateAmtFilterFromFormattedString");
  }

  /**
   * Sets the RateAmtFilter filter value from a formatted string
   *
   * @param _value the RateAmtFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RateAmtFilter filter field
   */
  public void setRateAmtFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRateAmtFilterFromFormattedCurrencyString");
    try {
      this.setRateAmtFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateAmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateAmtFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateAmtFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the RateAmtFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RateAmtFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateAmtFilter field
   */

  public String[] getRateAmtFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateAmtFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRateAmtFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateAmtFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateAmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateAmtFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: RatePct (LATE_FEE_RATE_OVERRIDES.rate_pct)
   * @param fetch whether to fetch this field or not
   */
  public void setRatePctFetch (boolean fetch) {
    this.RatePctFetch = fetch;
  }
  /** Retrieve Fetch value for field: RatePct (LATE_FEE_RATE_OVERRIDES.rate_pct)
   * @return boolean the Fetch value for this field
   */
  public boolean getRatePctFetch () {
    return this.RatePctFetch;
  }
  /** Set the SortOrder for field: RatePct (LATE_FEE_RATE_OVERRIDES.rate_pct)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRatePctSortOrder (Integer value) {
    this.RatePctSort = value;
  }
  /** Retrieve SortOrder for field: RatePct (LATE_FEE_RATE_OVERRIDES.rate_pct)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRatePctSortOrder () {
    return this.RatePctSort;
  }
  /** Set the sort direction for field: RatePct (LATE_FEE_RATE_OVERRIDES.rate_pct)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRatePctSortDirection (boolean ascending) {
    this.RatePctSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RatePct (LATE_FEE_RATE_OVERRIDES.rate_pct)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRatePctSortDirection () {
    return this.RatePctSortAscending;
  }
  /** Set the field level filters for field: RatePct (LATE_FEE_RATE_OVERRIDES.rate_pct)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRatePctFilter (IntegerFilter[] value) throws ServiceException {
    this.RatePct = value;
  }
  /** Retrieve filter for field: RatePct (LATE_FEE_RATE_OVERRIDES.rate_pct)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRatePctFilter () {
    return this.RatePct;
  }

  /**
   * Retrieves the RatePctFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RatePctFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RatePctFilter field
   */
  public String[] getRatePctFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRatePctFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRatePctFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRatePctFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RatePctFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRatePctFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RatePctFilter filter value from a formatted string
   *
   * @param _value the RatePctFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RatePctFilter filter field
   */
  public void setRatePctFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRatePctFilterFromFormattedString");
    try {
      this.setRatePctFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RatePctFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRatePctFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRatePctFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AddImpliedDecimals (LATE_FEE_RATE_OVERRIDES.add_implied_decimals)
   * @param fetch whether to fetch this field or not
   */
  public void setAddImpliedDecimalsFetch (boolean fetch) {
    this.AddImpliedDecimalsFetch = fetch;
  }
  /** Retrieve Fetch value for field: AddImpliedDecimals (LATE_FEE_RATE_OVERRIDES.add_implied_decimals)
   * @return boolean the Fetch value for this field
   */
  public boolean getAddImpliedDecimalsFetch () {
    return this.AddImpliedDecimalsFetch;
  }
  /** Set the SortOrder for field: AddImpliedDecimals (LATE_FEE_RATE_OVERRIDES.add_implied_decimals)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAddImpliedDecimalsSortOrder (Integer value) {
    this.AddImpliedDecimalsSort = value;
  }
  /** Retrieve SortOrder for field: AddImpliedDecimals (LATE_FEE_RATE_OVERRIDES.add_implied_decimals)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAddImpliedDecimalsSortOrder () {
    return this.AddImpliedDecimalsSort;
  }
  /** Set the sort direction for field: AddImpliedDecimals (LATE_FEE_RATE_OVERRIDES.add_implied_decimals)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAddImpliedDecimalsSortDirection (boolean ascending) {
    this.AddImpliedDecimalsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AddImpliedDecimals (LATE_FEE_RATE_OVERRIDES.add_implied_decimals)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAddImpliedDecimalsSortDirection () {
    return this.AddImpliedDecimalsSortAscending;
  }
  /** Set the field level filters for field: AddImpliedDecimals (LATE_FEE_RATE_OVERRIDES.add_implied_decimals)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAddImpliedDecimalsFilter (IntegerFilter[] value) throws ServiceException {
    this.AddImpliedDecimals = value;
  }
  /** Retrieve filter for field: AddImpliedDecimals (LATE_FEE_RATE_OVERRIDES.add_implied_decimals)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAddImpliedDecimalsFilter () {
    return this.AddImpliedDecimals;
  }

  /**
   * Retrieves the AddImpliedDecimalsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AddImpliedDecimalsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AddImpliedDecimalsFilter field
   */
  public String[] getAddImpliedDecimalsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAddImpliedDecimalsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAddImpliedDecimalsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAddImpliedDecimalsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AddImpliedDecimalsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAddImpliedDecimalsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AddImpliedDecimalsFilter filter value from a formatted string
   *
   * @param _value the AddImpliedDecimalsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AddImpliedDecimalsFilter filter field
   */
  public void setAddImpliedDecimalsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAddImpliedDecimalsFilterFromFormattedString");
    try {
      this.setAddImpliedDecimalsFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AddImpliedDecimalsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAddImpliedDecimalsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAddImpliedDecimalsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DelayOrigin (LATE_FEE_RATE_OVERRIDES.delay_origin)
   * @param fetch whether to fetch this field or not
   */
  public void setDelayOriginFetch (boolean fetch) {
    this.DelayOriginFetch = fetch;
  }
  /** Retrieve Fetch value for field: DelayOrigin (LATE_FEE_RATE_OVERRIDES.delay_origin)
   * @return boolean the Fetch value for this field
   */
  public boolean getDelayOriginFetch () {
    return this.DelayOriginFetch;
  }
  /** Set the SortOrder for field: DelayOrigin (LATE_FEE_RATE_OVERRIDES.delay_origin)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDelayOriginSortOrder (Integer value) {
    this.DelayOriginSort = value;
  }
  /** Retrieve SortOrder for field: DelayOrigin (LATE_FEE_RATE_OVERRIDES.delay_origin)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDelayOriginSortOrder () {
    return this.DelayOriginSort;
  }
  /** Set the sort direction for field: DelayOrigin (LATE_FEE_RATE_OVERRIDES.delay_origin)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDelayOriginSortDirection (boolean ascending) {
    this.DelayOriginSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DelayOrigin (LATE_FEE_RATE_OVERRIDES.delay_origin)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDelayOriginSortDirection () {
    return this.DelayOriginSortAscending;
  }
  /** Set the field level filters for field: DelayOrigin (LATE_FEE_RATE_OVERRIDES.delay_origin)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDelayOriginFilter (IntegerFilter[] value) throws ServiceException {
    this.DelayOrigin = value;
  }
  /** Retrieve filter for field: DelayOrigin (LATE_FEE_RATE_OVERRIDES.delay_origin)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDelayOriginFilter () {
    return this.DelayOrigin;
  }

  /**
   * Retrieves the DelayOriginFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DelayOriginFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DelayOriginFilter field
   */
  public String[] getDelayOriginFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDelayOriginFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDelayOriginFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDelayOriginFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DelayOriginFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDelayOriginFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DelayOriginFilter filter value from a formatted string
   *
   * @param _value the DelayOriginFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DelayOriginFilter filter field
   */
  public void setDelayOriginFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDelayOriginFilterFromFormattedString");
    try {
      this.setDelayOriginFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DelayOriginFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDelayOriginFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDelayOriginFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DelayTerminus (LATE_FEE_RATE_OVERRIDES.delay_terminus)
   * @param fetch whether to fetch this field or not
   */
  public void setDelayTerminusFetch (boolean fetch) {
    this.DelayTerminusFetch = fetch;
  }
  /** Retrieve Fetch value for field: DelayTerminus (LATE_FEE_RATE_OVERRIDES.delay_terminus)
   * @return boolean the Fetch value for this field
   */
  public boolean getDelayTerminusFetch () {
    return this.DelayTerminusFetch;
  }
  /** Set the SortOrder for field: DelayTerminus (LATE_FEE_RATE_OVERRIDES.delay_terminus)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDelayTerminusSortOrder (Integer value) {
    this.DelayTerminusSort = value;
  }
  /** Retrieve SortOrder for field: DelayTerminus (LATE_FEE_RATE_OVERRIDES.delay_terminus)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDelayTerminusSortOrder () {
    return this.DelayTerminusSort;
  }
  /** Set the sort direction for field: DelayTerminus (LATE_FEE_RATE_OVERRIDES.delay_terminus)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDelayTerminusSortDirection (boolean ascending) {
    this.DelayTerminusSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DelayTerminus (LATE_FEE_RATE_OVERRIDES.delay_terminus)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDelayTerminusSortDirection () {
    return this.DelayTerminusSortAscending;
  }
  /** Set the field level filters for field: DelayTerminus (LATE_FEE_RATE_OVERRIDES.delay_terminus)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDelayTerminusFilter (IntegerFilter[] value) throws ServiceException {
    this.DelayTerminus = value;
  }
  /** Retrieve filter for field: DelayTerminus (LATE_FEE_RATE_OVERRIDES.delay_terminus)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDelayTerminusFilter () {
    return this.DelayTerminus;
  }

  /**
   * Retrieves the DelayTerminusFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DelayTerminusFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DelayTerminusFilter field
   */
  public String[] getDelayTerminusFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDelayTerminusFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDelayTerminusFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDelayTerminusFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DelayTerminusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDelayTerminusFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DelayTerminusFilter filter value from a formatted string
   *
   * @param _value the DelayTerminusFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DelayTerminusFilter filter field
   */
  public void setDelayTerminusFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDelayTerminusFilterFromFormattedString");
    try {
      this.setDelayTerminusFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DelayTerminusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDelayTerminusFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDelayTerminusFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: InactiveDt (LATE_FEE_RATE_OVERRIDES.inactive_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setInactiveDtFetch (boolean fetch) {
    this.InactiveDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: InactiveDt (LATE_FEE_RATE_OVERRIDES.inactive_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getInactiveDtFetch () {
    return this.InactiveDtFetch;
  }
  /** Set the SortOrder for field: InactiveDt (LATE_FEE_RATE_OVERRIDES.inactive_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInactiveDtSortOrder (Integer value) {
    this.InactiveDtSort = value;
  }
  /** Retrieve SortOrder for field: InactiveDt (LATE_FEE_RATE_OVERRIDES.inactive_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInactiveDtSortOrder () {
    return this.InactiveDtSort;
  }
  /** Set the sort direction for field: InactiveDt (LATE_FEE_RATE_OVERRIDES.inactive_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInactiveDtSortDirection (boolean ascending) {
    this.InactiveDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InactiveDt (LATE_FEE_RATE_OVERRIDES.inactive_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInactiveDtSortDirection () {
    return this.InactiveDtSortAscending;
  }
  /** Set the field level filters for field: InactiveDt (LATE_FEE_RATE_OVERRIDES.inactive_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInactiveDtFilter (DateFilter[] value) throws ServiceException {
    this.InactiveDt = value;
  }
  /** Retrieve filter for field: InactiveDt (LATE_FEE_RATE_OVERRIDES.inactive_dt)
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


  /** Set the field level Fetch value for field: CalculationType (LATE_FEE_RATE_OVERRIDES.calculation_type)
   * @param fetch whether to fetch this field or not
   */
  public void setCalculationTypeFetch (boolean fetch) {
    this.CalculationTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CalculationType (LATE_FEE_RATE_OVERRIDES.calculation_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getCalculationTypeFetch () {
    return this.CalculationTypeFetch;
  }
  /** Set the SortOrder for field: CalculationType (LATE_FEE_RATE_OVERRIDES.calculation_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCalculationTypeSortOrder (Integer value) {
    this.CalculationTypeSort = value;
  }
  /** Retrieve SortOrder for field: CalculationType (LATE_FEE_RATE_OVERRIDES.calculation_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCalculationTypeSortOrder () {
    return this.CalculationTypeSort;
  }
  /** Set the sort direction for field: CalculationType (LATE_FEE_RATE_OVERRIDES.calculation_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCalculationTypeSortDirection (boolean ascending) {
    this.CalculationTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CalculationType (LATE_FEE_RATE_OVERRIDES.calculation_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCalculationTypeSortDirection () {
    return this.CalculationTypeSortAscending;
  }
  /** Set the field level filters for field: CalculationType (LATE_FEE_RATE_OVERRIDES.calculation_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCalculationTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.CalculationType = value;
  }
  /** Retrieve filter for field: CalculationType (LATE_FEE_RATE_OVERRIDES.calculation_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCalculationTypeFilter () {
    return this.CalculationType;
  }

  /**
   * Retrieves the CalculationTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CalculationTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CalculationTypeFilter field
   */
  public String[] getCalculationTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCalculationTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCalculationTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCalculationTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CalculationTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCalculationTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CalculationTypeFilter filter value from a formatted string
   *
   * @param _value the CalculationTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CalculationTypeFilter filter field
   */
  public void setCalculationTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCalculationTypeFilterFromFormattedString");
    try {
      this.setCalculationTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CalculationTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCalculationTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCalculationTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: MinAmt (LATE_FEE_RATE_OVERRIDES.min_amt)
   * @param fetch whether to fetch this field or not
   */
  public void setMinAmtFetch (boolean fetch) {
    this.MinAmtFetch = fetch;
  }
  /** Retrieve Fetch value for field: MinAmt (LATE_FEE_RATE_OVERRIDES.min_amt)
   * @return boolean the Fetch value for this field
   */
  public boolean getMinAmtFetch () {
    return this.MinAmtFetch;
  }
  /** Set the SortOrder for field: MinAmt (LATE_FEE_RATE_OVERRIDES.min_amt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMinAmtSortOrder (Integer value) {
    this.MinAmtSort = value;
  }
  /** Retrieve SortOrder for field: MinAmt (LATE_FEE_RATE_OVERRIDES.min_amt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMinAmtSortOrder () {
    return this.MinAmtSort;
  }
  /** Set the sort direction for field: MinAmt (LATE_FEE_RATE_OVERRIDES.min_amt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMinAmtSortDirection (boolean ascending) {
    this.MinAmtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MinAmt (LATE_FEE_RATE_OVERRIDES.min_amt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMinAmtSortDirection () {
    return this.MinAmtSortAscending;
  }
  /** Set the field level filters for field: MinAmt (LATE_FEE_RATE_OVERRIDES.min_amt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMinAmtFilter (BigIntegerFilter[] value) throws ServiceException {
    this.MinAmt = value;
  }
  /** Retrieve filter for field: MinAmt (LATE_FEE_RATE_OVERRIDES.min_amt)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getMinAmtFilter () {
    return this.MinAmt;
  }

  /**
   * Retrieves the MinAmtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MinAmtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MinAmtFilter field
   */
  public String[] getMinAmtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMinAmtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMinAmtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMinAmtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MinAmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMinAmtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MinAmtFilter filter value from a formatted string
   *
   * @param _value the MinAmtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MinAmtFilter filter field
   */
  public void setMinAmtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMinAmtFilterFromFormattedString");
    try {
      this.setMinAmtFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MinAmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMinAmtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMinAmtFilterFromFormattedString");
  }

  /**
   * Sets the MinAmtFilter filter value from a formatted string
   *
   * @param _value the MinAmtFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MinAmtFilter filter field
   */
  public void setMinAmtFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMinAmtFilterFromFormattedCurrencyString");
    try {
      this.setMinAmtFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MinAmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMinAmtFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMinAmtFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the MinAmtFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MinAmtFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the MinAmtFilter field
   */

  public String[] getMinAmtFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMinAmtFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMinAmtFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMinAmtFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MinAmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMinAmtFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: MaxAmt (LATE_FEE_RATE_OVERRIDES.max_amt)
   * @param fetch whether to fetch this field or not
   */
  public void setMaxAmtFetch (boolean fetch) {
    this.MaxAmtFetch = fetch;
  }
  /** Retrieve Fetch value for field: MaxAmt (LATE_FEE_RATE_OVERRIDES.max_amt)
   * @return boolean the Fetch value for this field
   */
  public boolean getMaxAmtFetch () {
    return this.MaxAmtFetch;
  }
  /** Set the SortOrder for field: MaxAmt (LATE_FEE_RATE_OVERRIDES.max_amt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMaxAmtSortOrder (Integer value) {
    this.MaxAmtSort = value;
  }
  /** Retrieve SortOrder for field: MaxAmt (LATE_FEE_RATE_OVERRIDES.max_amt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMaxAmtSortOrder () {
    return this.MaxAmtSort;
  }
  /** Set the sort direction for field: MaxAmt (LATE_FEE_RATE_OVERRIDES.max_amt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMaxAmtSortDirection (boolean ascending) {
    this.MaxAmtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MaxAmt (LATE_FEE_RATE_OVERRIDES.max_amt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMaxAmtSortDirection () {
    return this.MaxAmtSortAscending;
  }
  /** Set the field level filters for field: MaxAmt (LATE_FEE_RATE_OVERRIDES.max_amt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMaxAmtFilter (BigIntegerFilter[] value) throws ServiceException {
    this.MaxAmt = value;
  }
  /** Retrieve filter for field: MaxAmt (LATE_FEE_RATE_OVERRIDES.max_amt)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getMaxAmtFilter () {
    return this.MaxAmt;
  }

  /**
   * Retrieves the MaxAmtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MaxAmtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MaxAmtFilter field
   */
  public String[] getMaxAmtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMaxAmtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMaxAmtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMaxAmtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MaxAmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMaxAmtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MaxAmtFilter filter value from a formatted string
   *
   * @param _value the MaxAmtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MaxAmtFilter filter field
   */
  public void setMaxAmtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMaxAmtFilterFromFormattedString");
    try {
      this.setMaxAmtFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MaxAmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMaxAmtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMaxAmtFilterFromFormattedString");
  }

  /**
   * Sets the MaxAmtFilter filter value from a formatted string
   *
   * @param _value the MaxAmtFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MaxAmtFilter filter field
   */
  public void setMaxAmtFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMaxAmtFilterFromFormattedCurrencyString");
    try {
      this.setMaxAmtFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MaxAmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMaxAmtFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMaxAmtFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the MaxAmtFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MaxAmtFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the MaxAmtFilter field
   */

  public String[] getMaxAmtFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMaxAmtFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMaxAmtFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMaxAmtFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MaxAmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMaxAmtFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: TypeIdNrc (LATE_FEE_RATE_OVERRIDES.type_id_nrc)
   * @param fetch whether to fetch this field or not
   */
  public void setTypeIdNrcFetch (boolean fetch) {
    this.TypeIdNrcFetch = fetch;
  }
  /** Retrieve Fetch value for field: TypeIdNrc (LATE_FEE_RATE_OVERRIDES.type_id_nrc)
   * @return boolean the Fetch value for this field
   */
  public boolean getTypeIdNrcFetch () {
    return this.TypeIdNrcFetch;
  }
  /** Set the SortOrder for field: TypeIdNrc (LATE_FEE_RATE_OVERRIDES.type_id_nrc)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTypeIdNrcSortOrder (Integer value) {
    this.TypeIdNrcSort = value;
  }
  /** Retrieve SortOrder for field: TypeIdNrc (LATE_FEE_RATE_OVERRIDES.type_id_nrc)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTypeIdNrcSortOrder () {
    return this.TypeIdNrcSort;
  }
  /** Set the sort direction for field: TypeIdNrc (LATE_FEE_RATE_OVERRIDES.type_id_nrc)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTypeIdNrcSortDirection (boolean ascending) {
    this.TypeIdNrcSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TypeIdNrc (LATE_FEE_RATE_OVERRIDES.type_id_nrc)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTypeIdNrcSortDirection () {
    return this.TypeIdNrcSortAscending;
  }
  /** Set the field level filters for field: TypeIdNrc (LATE_FEE_RATE_OVERRIDES.type_id_nrc)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTypeIdNrcFilter (IntegerFilter[] value) throws ServiceException {
    this.TypeIdNrc = value;
  }
  /** Retrieve filter for field: TypeIdNrc (LATE_FEE_RATE_OVERRIDES.type_id_nrc)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTypeIdNrcFilter () {
    return this.TypeIdNrc;
  }

  /**
   * Retrieves the TypeIdNrcFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TypeIdNrcFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TypeIdNrcFilter field
   */
  public String[] getTypeIdNrcFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTypeIdNrcFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTypeIdNrcFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTypeIdNrcFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TypeIdNrcFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTypeIdNrcFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TypeIdNrcFilter filter value from a formatted string
   *
   * @param _value the TypeIdNrcFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TypeIdNrcFilter filter field
   */
  public void setTypeIdNrcFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTypeIdNrcFilterFromFormattedString");
    try {
      this.setTypeIdNrcFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TypeIdNrcFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTypeIdNrcFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTypeIdNrcFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: GracePeriod (LATE_FEE_RATE_OVERRIDES.grace_period)
   * @param fetch whether to fetch this field or not
   */
  public void setGracePeriodFetch (boolean fetch) {
    this.GracePeriodFetch = fetch;
  }
  /** Retrieve Fetch value for field: GracePeriod (LATE_FEE_RATE_OVERRIDES.grace_period)
   * @return boolean the Fetch value for this field
   */
  public boolean getGracePeriodFetch () {
    return this.GracePeriodFetch;
  }
  /** Set the SortOrder for field: GracePeriod (LATE_FEE_RATE_OVERRIDES.grace_period)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setGracePeriodSortOrder (Integer value) {
    this.GracePeriodSort = value;
  }
  /** Retrieve SortOrder for field: GracePeriod (LATE_FEE_RATE_OVERRIDES.grace_period)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getGracePeriodSortOrder () {
    return this.GracePeriodSort;
  }
  /** Set the sort direction for field: GracePeriod (LATE_FEE_RATE_OVERRIDES.grace_period)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setGracePeriodSortDirection (boolean ascending) {
    this.GracePeriodSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: GracePeriod (LATE_FEE_RATE_OVERRIDES.grace_period)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getGracePeriodSortDirection () {
    return this.GracePeriodSortAscending;
  }
  /** Set the field level filters for field: GracePeriod (LATE_FEE_RATE_OVERRIDES.grace_period)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setGracePeriodFilter (IntegerFilter[] value) throws ServiceException {
    this.GracePeriod = value;
  }
  /** Retrieve filter for field: GracePeriod (LATE_FEE_RATE_OVERRIDES.grace_period)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getGracePeriodFilter () {
    return this.GracePeriod;
  }

  /**
   * Retrieves the GracePeriodFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The GracePeriodFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GracePeriodFilter field
   */
  public String[] getGracePeriodFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGracePeriodFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getGracePeriodFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGracePeriodFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GracePeriodFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getGracePeriodFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the GracePeriodFilter filter value from a formatted string
   *
   * @param _value the GracePeriodFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the GracePeriodFilter filter field
   */
  public void setGracePeriodFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setGracePeriodFilterFromFormattedString");
    try {
      this.setGracePeriodFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GracePeriodFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setGracePeriodFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGracePeriodFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: MinBalThresh (LATE_FEE_RATE_OVERRIDES.min_bal_thresh)
   * @param fetch whether to fetch this field or not
   */
  public void setMinBalThreshFetch (boolean fetch) {
    this.MinBalThreshFetch = fetch;
  }
  /** Retrieve Fetch value for field: MinBalThresh (LATE_FEE_RATE_OVERRIDES.min_bal_thresh)
   * @return boolean the Fetch value for this field
   */
  public boolean getMinBalThreshFetch () {
    return this.MinBalThreshFetch;
  }
  /** Set the SortOrder for field: MinBalThresh (LATE_FEE_RATE_OVERRIDES.min_bal_thresh)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMinBalThreshSortOrder (Integer value) {
    this.MinBalThreshSort = value;
  }
  /** Retrieve SortOrder for field: MinBalThresh (LATE_FEE_RATE_OVERRIDES.min_bal_thresh)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMinBalThreshSortOrder () {
    return this.MinBalThreshSort;
  }
  /** Set the sort direction for field: MinBalThresh (LATE_FEE_RATE_OVERRIDES.min_bal_thresh)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMinBalThreshSortDirection (boolean ascending) {
    this.MinBalThreshSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MinBalThresh (LATE_FEE_RATE_OVERRIDES.min_bal_thresh)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMinBalThreshSortDirection () {
    return this.MinBalThreshSortAscending;
  }
  /** Set the field level filters for field: MinBalThresh (LATE_FEE_RATE_OVERRIDES.min_bal_thresh)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMinBalThreshFilter (BigIntegerFilter[] value) throws ServiceException {
    this.MinBalThresh = value;
  }
  /** Retrieve filter for field: MinBalThresh (LATE_FEE_RATE_OVERRIDES.min_bal_thresh)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getMinBalThreshFilter () {
    return this.MinBalThresh;
  }

  /**
   * Retrieves the MinBalThreshFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MinBalThreshFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MinBalThreshFilter field
   */
  public String[] getMinBalThreshFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMinBalThreshFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMinBalThreshFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMinBalThreshFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MinBalThreshFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMinBalThreshFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MinBalThreshFilter filter value from a formatted string
   *
   * @param _value the MinBalThreshFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MinBalThreshFilter filter field
   */
  public void setMinBalThreshFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMinBalThreshFilterFromFormattedString");
    try {
      this.setMinBalThreshFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MinBalThreshFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMinBalThreshFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMinBalThreshFilterFromFormattedString");
  }

  /**
   * Sets the MinBalThreshFilter filter value from a formatted string
   *
   * @param _value the MinBalThreshFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MinBalThreshFilter filter field
   */
  public void setMinBalThreshFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMinBalThreshFilterFromFormattedCurrencyString");
    try {
      this.setMinBalThreshFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MinBalThreshFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMinBalThreshFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMinBalThreshFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the MinBalThreshFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MinBalThreshFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the MinBalThreshFilter field
   */

  public String[] getMinBalThreshFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMinBalThreshFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMinBalThreshFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMinBalThreshFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MinBalThreshFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMinBalThreshFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: OpenItemId (LATE_FEE_RATE_OVERRIDES.open_item_id)
   * @param fetch whether to fetch this field or not
   */
  public void setOpenItemIdFetch (boolean fetch) {
    this.OpenItemIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: OpenItemId (LATE_FEE_RATE_OVERRIDES.open_item_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getOpenItemIdFetch () {
    return this.OpenItemIdFetch;
  }
  /** Set the SortOrder for field: OpenItemId (LATE_FEE_RATE_OVERRIDES.open_item_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOpenItemIdSortOrder (Integer value) {
    this.OpenItemIdSort = value;
  }
  /** Retrieve SortOrder for field: OpenItemId (LATE_FEE_RATE_OVERRIDES.open_item_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOpenItemIdSortOrder () {
    return this.OpenItemIdSort;
  }
  /** Set the sort direction for field: OpenItemId (LATE_FEE_RATE_OVERRIDES.open_item_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOpenItemIdSortDirection (boolean ascending) {
    this.OpenItemIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OpenItemId (LATE_FEE_RATE_OVERRIDES.open_item_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOpenItemIdSortDirection () {
    return this.OpenItemIdSortAscending;
  }
  /** Set the field level filters for field: OpenItemId (LATE_FEE_RATE_OVERRIDES.open_item_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOpenItemIdFilter (IntegerFilter[] value) throws ServiceException {
    this.OpenItemId = value;
  }
  /** Retrieve filter for field: OpenItemId (LATE_FEE_RATE_OVERRIDES.open_item_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getOpenItemIdFilter () {
    return this.OpenItemId;
  }

  /**
   * Retrieves the OpenItemIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OpenItemIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OpenItemIdFilter field
   */
  public String[] getOpenItemIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOpenItemIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOpenItemIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOpenItemIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OpenItemIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOpenItemIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OpenItemIdFilter filter value from a formatted string
   *
   * @param _value the OpenItemIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OpenItemIdFilter filter field
   */
  public void setOpenItemIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOpenItemIdFilterFromFormattedString");
    try {
      this.setOpenItemIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OpenItemIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOpenItemIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOpenItemIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ProductLineId (LATE_FEE_RATE_OVERRIDES.product_line_id)
   * @param fetch whether to fetch this field or not
   */
  public void setProductLineIdFetch (boolean fetch) {
    this.ProductLineIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ProductLineId (LATE_FEE_RATE_OVERRIDES.product_line_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getProductLineIdFetch () {
    return this.ProductLineIdFetch;
  }
  /** Set the SortOrder for field: ProductLineId (LATE_FEE_RATE_OVERRIDES.product_line_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setProductLineIdSortOrder (Integer value) {
    this.ProductLineIdSort = value;
  }
  /** Retrieve SortOrder for field: ProductLineId (LATE_FEE_RATE_OVERRIDES.product_line_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getProductLineIdSortOrder () {
    return this.ProductLineIdSort;
  }
  /** Set the sort direction for field: ProductLineId (LATE_FEE_RATE_OVERRIDES.product_line_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setProductLineIdSortDirection (boolean ascending) {
    this.ProductLineIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ProductLineId (LATE_FEE_RATE_OVERRIDES.product_line_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getProductLineIdSortDirection () {
    return this.ProductLineIdSortAscending;
  }
  /** Set the field level filters for field: ProductLineId (LATE_FEE_RATE_OVERRIDES.product_line_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setProductLineIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ProductLineId = value;
  }
  /** Retrieve filter for field: ProductLineId (LATE_FEE_RATE_OVERRIDES.product_line_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getProductLineIdFilter () {
    return this.ProductLineId;
  }

  /**
   * Retrieves the ProductLineIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ProductLineIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProductLineIdFilter field
   */
  public String[] getProductLineIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProductLineIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getProductLineIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProductLineIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProductLineIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getProductLineIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ProductLineIdFilter filter value from a formatted string
   *
   * @param _value the ProductLineIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ProductLineIdFilter filter field
   */
  public void setProductLineIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setProductLineIdFilterFromFormattedString");
    try {
      this.setProductLineIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProductLineIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setProductLineIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProductLineIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DualLateFee (LATE_FEE_RATE_OVERRIDES.dual_late_fee)
   * @param fetch whether to fetch this field or not
   */
  public void setDualLateFeeFetch (boolean fetch) {
    this.DualLateFeeFetch = fetch;
  }
  /** Retrieve Fetch value for field: DualLateFee (LATE_FEE_RATE_OVERRIDES.dual_late_fee)
   * @return boolean the Fetch value for this field
   */
  public boolean getDualLateFeeFetch () {
    return this.DualLateFeeFetch;
  }
  /** Set the SortOrder for field: DualLateFee (LATE_FEE_RATE_OVERRIDES.dual_late_fee)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDualLateFeeSortOrder (Integer value) {
    this.DualLateFeeSort = value;
  }
  /** Retrieve SortOrder for field: DualLateFee (LATE_FEE_RATE_OVERRIDES.dual_late_fee)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDualLateFeeSortOrder () {
    return this.DualLateFeeSort;
  }
  /** Set the sort direction for field: DualLateFee (LATE_FEE_RATE_OVERRIDES.dual_late_fee)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDualLateFeeSortDirection (boolean ascending) {
    this.DualLateFeeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DualLateFee (LATE_FEE_RATE_OVERRIDES.dual_late_fee)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDualLateFeeSortDirection () {
    return this.DualLateFeeSortAscending;
  }
  /** Set the field level filters for field: DualLateFee (LATE_FEE_RATE_OVERRIDES.dual_late_fee)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDualLateFeeFilter (IntegerFilter[] value) throws ServiceException {
    this.DualLateFee = value;
  }
  /** Retrieve filter for field: DualLateFee (LATE_FEE_RATE_OVERRIDES.dual_late_fee)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDualLateFeeFilter () {
    return this.DualLateFee;
  }

  /**
   * Retrieves the DualLateFeeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DualLateFeeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DualLateFeeFilter field
   */
  public String[] getDualLateFeeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDualLateFeeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDualLateFeeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDualLateFeeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DualLateFeeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDualLateFeeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DualLateFeeFilter filter value from a formatted string
   *
   * @param _value the DualLateFeeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DualLateFeeFilter filter field
   */
  public void setDualLateFeeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDualLateFeeFilterFromFormattedString");
    try {
      this.setDualLateFeeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DualLateFeeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDualLateFeeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDualLateFeeFilterFromFormattedString");
  }

  public String toString() {
    return LateFeeRateOverridesObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return LateFeeRateOverridesObjectHelper.toMap(this, null);
  }
}
