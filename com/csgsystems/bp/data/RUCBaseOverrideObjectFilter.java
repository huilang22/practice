/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: RUCBaseOverrideObjectFilter.java
 * Definition File: Customer/OverrideUsageCreditRate.xml
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
public class RUCBaseOverrideObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public RUCBaseOverrideObjectKeyFilter Key = null;
  /** raw field for: UNIT_CR_DEFINITIONS.unit_cr_quantum) */
  public    IntegerFilter[] UnitCrQuantum  = null;
  protected boolean UnitCrQuantumFetch = false;
  protected boolean UnitCrQuantumSortAscending = true;
  protected Integer UnitCrQuantumSort = null;
  /** raw field for: RATE_UNIT_CR_OVERRIDES.contract_tracking_id) */
  public    IntegerFilter[] ContractTrackingId  = null;
  protected boolean ContractTrackingIdFetch = false;
  protected boolean ContractTrackingIdSortAscending = true;
  protected Integer ContractTrackingIdSort = null;
  /** raw field for: RATE_UNIT_CR_OVERRIDES.contract_tracking_id_serv) */
  public    IntegerFilter[] ContractTrackingIdServ  = null;
  protected boolean ContractTrackingIdServFetch = false;
  protected boolean ContractTrackingIdServSortAscending = true;
  protected Integer ContractTrackingIdServSort = null;
  /** raw field for: RATE_UNIT_CR_OVERRIDES.unit_cr_id) */
  public    IntegerFilter[] UnitCrId  = null;
  protected boolean UnitCrIdFetch = false;
  protected boolean UnitCrIdSortAscending = true;
  protected Integer UnitCrIdSort = null;
  /** raw field for: RATE_UNIT_CR_OVERRIDES.units_free) */
  public    BigIntegerFilter[] UnitsFree  = null;
  protected boolean UnitsFreeFetch = false;
  protected boolean UnitsFreeSortAscending = true;
  protected Integer UnitsFreeSort = null;
  /** raw field for: RATE_UNIT_CR_OVERRIDES.billing_frequency) */
  public    IntegerFilter[] BillingFrequency  = null;
  protected boolean BillingFrequencyFetch = false;
  protected boolean BillingFrequencySortAscending = true;
  protected Integer BillingFrequencySort = null;
  /** raw field for: RATE_UNIT_CR_OVERRIDES.currency_code) */
  public    IntegerFilter[] CurrencyCode  = null;
  protected boolean CurrencyCodeFetch = false;
  protected boolean CurrencyCodeSortAscending = true;
  protected Integer CurrencyCodeSort = null;
  /** raw field for: RATE_UNIT_CR_OVERRIDES.amount_free) */
  public    BigIntegerFilter[] AmountFree  = null;
  protected boolean AmountFreeFetch = false;
  protected boolean AmountFreeSortAscending = true;
  protected Integer AmountFreeSort = null;
  /** raw field for: RATE_UNIT_CR_OVERRIDES.range_origin) */
  public    BigIntegerFilter[] RangeOrigin  = null;
  protected boolean RangeOriginFetch = false;
  protected boolean RangeOriginSortAscending = true;
  protected Integer RangeOriginSort = null;
  /** raw field for: RATE_UNIT_CR_OVERRIDES.range_terminus) */
  public    BigIntegerFilter[] RangeTerminus  = null;
  protected boolean RangeTerminusFetch = false;
  protected boolean RangeTerminusSortAscending = true;
  protected Integer RangeTerminusSort = null;
  /** raw field for: RATE_UNIT_CR_OVERRIDES.create_dt) */
  public    DateFilter[] CreateDt  = null;
  protected boolean CreateDtFetch = false;
  protected boolean CreateDtSortAscending = true;
  protected Integer CreateDtSort = null;
  /** raw field for: RATE_UNIT_CR_OVERRIDES.chg_dt) */
  public    DateFilter[] ChgDt  = null;
  protected boolean ChgDtFetch = false;
  protected boolean ChgDtSortAscending = true;
  protected Integer ChgDtSort = null;
  /** raw field for: RATE_UNIT_CR_OVERRIDES.chg_who) */
  public    StringFilter[] ChgWho  = null;
  protected boolean ChgWhoFetch = false;
  protected boolean ChgWhoSortAscending = true;
  protected boolean ChgWhoCaseInsensitive = false;
  protected Integer ChgWhoSort = null;
  /** raw field for: RATE_UNIT_CR_OVERRIDES.active_dt) */
  public    DateFilter[] ActiveDt  = null;
  protected boolean ActiveDtFetch = false;
  protected boolean ActiveDtSortAscending = true;
  protected Integer ActiveDtSort = null;
  /** raw field for: RATE_UNIT_CR_OVERRIDES.inactive_dt) */
  public    DateFilter[] InactiveDt  = null;
  protected boolean InactiveDtFetch = false;
  protected boolean InactiveDtSortAscending = true;
  protected Integer InactiveDtSort = null;
  private String _objName = "RUCBaseOverrideObjectFilter";
  /** default constructor */
  public RUCBaseOverrideObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public RUCBaseOverrideObjectFilter (RUCBaseOverrideObjectFilter other)
  {
    if (other == null) return;
    this.Key = new RUCBaseOverrideObjectKeyFilter (other.Key);
    this.UnitCrQuantum = other.UnitCrQuantum;
    this.UnitCrQuantumFetch = other.UnitCrQuantumFetch;
    this.UnitCrQuantumSort = other.UnitCrQuantumSort;
    this.UnitCrQuantumSortAscending = other.UnitCrQuantumSortAscending;
    this.ContractTrackingId = other.ContractTrackingId;
    this.ContractTrackingIdFetch = other.ContractTrackingIdFetch;
    this.ContractTrackingIdSort = other.ContractTrackingIdSort;
    this.ContractTrackingIdSortAscending = other.ContractTrackingIdSortAscending;
    this.ContractTrackingIdServ = other.ContractTrackingIdServ;
    this.ContractTrackingIdServFetch = other.ContractTrackingIdServFetch;
    this.ContractTrackingIdServSort = other.ContractTrackingIdServSort;
    this.ContractTrackingIdServSortAscending = other.ContractTrackingIdServSortAscending;
    this.UnitCrId = other.UnitCrId;
    this.UnitCrIdFetch = other.UnitCrIdFetch;
    this.UnitCrIdSort = other.UnitCrIdSort;
    this.UnitCrIdSortAscending = other.UnitCrIdSortAscending;
    this.UnitsFree = other.UnitsFree;
    this.UnitsFreeFetch = other.UnitsFreeFetch;
    this.UnitsFreeSort = other.UnitsFreeSort;
    this.UnitsFreeSortAscending = other.UnitsFreeSortAscending;
    this.BillingFrequency = other.BillingFrequency;
    this.BillingFrequencyFetch = other.BillingFrequencyFetch;
    this.BillingFrequencySort = other.BillingFrequencySort;
    this.BillingFrequencySortAscending = other.BillingFrequencySortAscending;
    this.CurrencyCode = other.CurrencyCode;
    this.CurrencyCodeFetch = other.CurrencyCodeFetch;
    this.CurrencyCodeSort = other.CurrencyCodeSort;
    this.CurrencyCodeSortAscending = other.CurrencyCodeSortAscending;
    this.AmountFree = other.AmountFree;
    this.AmountFreeFetch = other.AmountFreeFetch;
    this.AmountFreeSort = other.AmountFreeSort;
    this.AmountFreeSortAscending = other.AmountFreeSortAscending;
    this.RangeOrigin = other.RangeOrigin;
    this.RangeOriginFetch = other.RangeOriginFetch;
    this.RangeOriginSort = other.RangeOriginSort;
    this.RangeOriginSortAscending = other.RangeOriginSortAscending;
    this.RangeTerminus = other.RangeTerminus;
    this.RangeTerminusFetch = other.RangeTerminusFetch;
    this.RangeTerminusSort = other.RangeTerminusSort;
    this.RangeTerminusSortAscending = other.RangeTerminusSortAscending;
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
    this.ActiveDt = other.ActiveDt;
    this.ActiveDtFetch = other.ActiveDtFetch;
    this.ActiveDtSort = other.ActiveDtSort;
    this.ActiveDtSortAscending = other.ActiveDtSortAscending;
    this.InactiveDt = other.InactiveDt;
    this.InactiveDtFetch = other.InactiveDtFetch;
    this.InactiveDtSort = other.InactiveDtSort;
    this.InactiveDtSortAscending = other.InactiveDtSortAscending;  }
  /** get the filter for this object's key
   * @return RUCBaseOverrideObjectKeyFilter
   */
  public RUCBaseOverrideObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (RUCBaseOverrideObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: OverrideTrackingId (RATE_UNIT_CR_OVERRIDES.override_tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setOverrideTrackingIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new RUCBaseOverrideObjectKeyFilter ();
    this.Key.OverrideTrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: OverrideTrackingId (RATE_UNIT_CR_OVERRIDES.override_tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getOverrideTrackingIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.OverrideTrackingIdFetch;
  }
  /** Set the SortOrder for field: OverrideTrackingId (RATE_UNIT_CR_OVERRIDES.override_tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOverrideTrackingIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new RUCBaseOverrideObjectKeyFilter ();
    this.Key.OverrideTrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: OverrideTrackingId (RATE_UNIT_CR_OVERRIDES.override_tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOverrideTrackingIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.OverrideTrackingIdSort;
  }
  /** Set the sort direction for field: OverrideTrackingId (RATE_UNIT_CR_OVERRIDES.override_tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOverrideTrackingIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new RUCBaseOverrideObjectKeyFilter ();
    this.Key.OverrideTrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OverrideTrackingId (RATE_UNIT_CR_OVERRIDES.override_tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOverrideTrackingIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.OverrideTrackingIdSortAscending;
  }
  /** Set the field level filters for field: OverrideTrackingId (RATE_UNIT_CR_OVERRIDES.override_tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOverrideTrackingIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new RUCBaseOverrideObjectKeyFilter ();
    this.Key.OverrideTrackingId = value;
  }
  /** Retrieve filter for field: OverrideTrackingId (RATE_UNIT_CR_OVERRIDES.override_tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getOverrideTrackingIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.OverrideTrackingId;
  }
  /** Set the field level Fetch value for field: OverrideTrackingIdServ (RATE_UNIT_CR_OVERRIDES.override_tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setOverrideTrackingIdServFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new RUCBaseOverrideObjectKeyFilter ();
    this.Key.OverrideTrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: OverrideTrackingIdServ (RATE_UNIT_CR_OVERRIDES.override_tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getOverrideTrackingIdServFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.OverrideTrackingIdServFetch;
  }
  /** Set the SortOrder for field: OverrideTrackingIdServ (RATE_UNIT_CR_OVERRIDES.override_tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOverrideTrackingIdServSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new RUCBaseOverrideObjectKeyFilter ();
    this.Key.OverrideTrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: OverrideTrackingIdServ (RATE_UNIT_CR_OVERRIDES.override_tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOverrideTrackingIdServSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.OverrideTrackingIdServSort;
  }
  /** Set the sort direction for field: OverrideTrackingIdServ (RATE_UNIT_CR_OVERRIDES.override_tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOverrideTrackingIdServSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new RUCBaseOverrideObjectKeyFilter ();
    this.Key.OverrideTrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OverrideTrackingIdServ (RATE_UNIT_CR_OVERRIDES.override_tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOverrideTrackingIdServSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.OverrideTrackingIdServSortAscending;
  }
  /** Set the field level filters for field: OverrideTrackingIdServ (RATE_UNIT_CR_OVERRIDES.override_tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOverrideTrackingIdServFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new RUCBaseOverrideObjectKeyFilter ();
    this.Key.OverrideTrackingIdServ = value;
  }
  /** Retrieve filter for field: OverrideTrackingIdServ (RATE_UNIT_CR_OVERRIDES.override_tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getOverrideTrackingIdServFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.OverrideTrackingIdServ;
  }
  /** Set the field level Fetch value for field: UnitCrQuantum (UNIT_CR_DEFINITIONS.unit_cr_quantum)
   * @param fetch whether to fetch this field or not
   */
  public void setUnitCrQuantumFetch (boolean fetch) {
    this.UnitCrQuantumFetch = fetch;
  }
  /** Retrieve Fetch value for field: UnitCrQuantum (UNIT_CR_DEFINITIONS.unit_cr_quantum)
   * @return boolean the Fetch value for this field
   */
  public boolean getUnitCrQuantumFetch () {
    return this.UnitCrQuantumFetch;
  }
  /** Set the SortOrder for field: UnitCrQuantum (UNIT_CR_DEFINITIONS.unit_cr_quantum)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUnitCrQuantumSortOrder (Integer value) {
    this.UnitCrQuantumSort = value;
  }
  /** Retrieve SortOrder for field: UnitCrQuantum (UNIT_CR_DEFINITIONS.unit_cr_quantum)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUnitCrQuantumSortOrder () {
    return this.UnitCrQuantumSort;
  }
  /** Set the sort direction for field: UnitCrQuantum (UNIT_CR_DEFINITIONS.unit_cr_quantum)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUnitCrQuantumSortDirection (boolean ascending) {
    this.UnitCrQuantumSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UnitCrQuantum (UNIT_CR_DEFINITIONS.unit_cr_quantum)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUnitCrQuantumSortDirection () {
    return this.UnitCrQuantumSortAscending;
  }
  /** Set the field level filters for field: UnitCrQuantum (UNIT_CR_DEFINITIONS.unit_cr_quantum)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUnitCrQuantumFilter (IntegerFilter[] value) throws ServiceException {
    this.UnitCrQuantum = value;
  }
  /** Retrieve filter for field: UnitCrQuantum (UNIT_CR_DEFINITIONS.unit_cr_quantum)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getUnitCrQuantumFilter () {
    return this.UnitCrQuantum;
  }

  /**
   * Retrieves the UnitCrQuantumFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UnitCrQuantumFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UnitCrQuantumFilter field
   */
  public String[] getUnitCrQuantumFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitCrQuantumFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUnitCrQuantumFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUnitCrQuantumFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UnitCrQuantumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUnitCrQuantumFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UnitCrQuantumFilter filter value from a formatted string
   *
   * @param _value the UnitCrQuantumFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UnitCrQuantumFilter filter field
   */
  public void setUnitCrQuantumFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUnitCrQuantumFilterFromFormattedString");
    try {
      this.setUnitCrQuantumFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UnitCrQuantumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUnitCrQuantumFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUnitCrQuantumFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ContractTrackingId (RATE_UNIT_CR_OVERRIDES.contract_tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setContractTrackingIdFetch (boolean fetch) {
    this.ContractTrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ContractTrackingId (RATE_UNIT_CR_OVERRIDES.contract_tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getContractTrackingIdFetch () {
    return this.ContractTrackingIdFetch;
  }
  /** Set the SortOrder for field: ContractTrackingId (RATE_UNIT_CR_OVERRIDES.contract_tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setContractTrackingIdSortOrder (Integer value) {
    this.ContractTrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: ContractTrackingId (RATE_UNIT_CR_OVERRIDES.contract_tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getContractTrackingIdSortOrder () {
    return this.ContractTrackingIdSort;
  }
  /** Set the sort direction for field: ContractTrackingId (RATE_UNIT_CR_OVERRIDES.contract_tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setContractTrackingIdSortDirection (boolean ascending) {
    this.ContractTrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ContractTrackingId (RATE_UNIT_CR_OVERRIDES.contract_tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getContractTrackingIdSortDirection () {
    return this.ContractTrackingIdSortAscending;
  }
  /** Set the field level filters for field: ContractTrackingId (RATE_UNIT_CR_OVERRIDES.contract_tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setContractTrackingIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ContractTrackingId = value;
  }
  /** Retrieve filter for field: ContractTrackingId (RATE_UNIT_CR_OVERRIDES.contract_tracking_id)
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

  /** Set the field level Fetch value for field: ContractTrackingIdServ (RATE_UNIT_CR_OVERRIDES.contract_tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setContractTrackingIdServFetch (boolean fetch) {
    this.ContractTrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: ContractTrackingIdServ (RATE_UNIT_CR_OVERRIDES.contract_tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getContractTrackingIdServFetch () {
    return this.ContractTrackingIdServFetch;
  }
  /** Set the SortOrder for field: ContractTrackingIdServ (RATE_UNIT_CR_OVERRIDES.contract_tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setContractTrackingIdServSortOrder (Integer value) {
    this.ContractTrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: ContractTrackingIdServ (RATE_UNIT_CR_OVERRIDES.contract_tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getContractTrackingIdServSortOrder () {
    return this.ContractTrackingIdServSort;
  }
  /** Set the sort direction for field: ContractTrackingIdServ (RATE_UNIT_CR_OVERRIDES.contract_tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setContractTrackingIdServSortDirection (boolean ascending) {
    this.ContractTrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ContractTrackingIdServ (RATE_UNIT_CR_OVERRIDES.contract_tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getContractTrackingIdServSortDirection () {
    return this.ContractTrackingIdServSortAscending;
  }
  /** Set the field level filters for field: ContractTrackingIdServ (RATE_UNIT_CR_OVERRIDES.contract_tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setContractTrackingIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.ContractTrackingIdServ = value;
  }
  /** Retrieve filter for field: ContractTrackingIdServ (RATE_UNIT_CR_OVERRIDES.contract_tracking_id_serv)
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

  /** Set the field level Fetch value for field: UnitCrId (RATE_UNIT_CR_OVERRIDES.unit_cr_id)
   * @param fetch whether to fetch this field or not
   */
  public void setUnitCrIdFetch (boolean fetch) {
    this.UnitCrIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: UnitCrId (RATE_UNIT_CR_OVERRIDES.unit_cr_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getUnitCrIdFetch () {
    return this.UnitCrIdFetch;
  }
  /** Set the SortOrder for field: UnitCrId (RATE_UNIT_CR_OVERRIDES.unit_cr_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUnitCrIdSortOrder (Integer value) {
    this.UnitCrIdSort = value;
  }
  /** Retrieve SortOrder for field: UnitCrId (RATE_UNIT_CR_OVERRIDES.unit_cr_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUnitCrIdSortOrder () {
    return this.UnitCrIdSort;
  }
  /** Set the sort direction for field: UnitCrId (RATE_UNIT_CR_OVERRIDES.unit_cr_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUnitCrIdSortDirection (boolean ascending) {
    this.UnitCrIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UnitCrId (RATE_UNIT_CR_OVERRIDES.unit_cr_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUnitCrIdSortDirection () {
    return this.UnitCrIdSortAscending;
  }
  /** Set the field level filters for field: UnitCrId (RATE_UNIT_CR_OVERRIDES.unit_cr_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUnitCrIdFilter (IntegerFilter[] value) throws ServiceException {
    this.UnitCrId = value;
  }
  /** Retrieve filter for field: UnitCrId (RATE_UNIT_CR_OVERRIDES.unit_cr_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getUnitCrIdFilter () {
    return this.UnitCrId;
  }

  /**
   * Retrieves the UnitCrIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UnitCrIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UnitCrIdFilter field
   */
  public String[] getUnitCrIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitCrIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUnitCrIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUnitCrIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UnitCrIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUnitCrIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UnitCrIdFilter filter value from a formatted string
   *
   * @param _value the UnitCrIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UnitCrIdFilter filter field
   */
  public void setUnitCrIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUnitCrIdFilterFromFormattedString");
    try {
      this.setUnitCrIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UnitCrIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUnitCrIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUnitCrIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: UnitsFree (RATE_UNIT_CR_OVERRIDES.units_free)
   * @param fetch whether to fetch this field or not
   */
  public void setUnitsFreeFetch (boolean fetch) {
    this.UnitsFreeFetch = fetch;
  }
  /** Retrieve Fetch value for field: UnitsFree (RATE_UNIT_CR_OVERRIDES.units_free)
   * @return boolean the Fetch value for this field
   */
  public boolean getUnitsFreeFetch () {
    return this.UnitsFreeFetch;
  }
  /** Set the SortOrder for field: UnitsFree (RATE_UNIT_CR_OVERRIDES.units_free)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUnitsFreeSortOrder (Integer value) {
    this.UnitsFreeSort = value;
  }
  /** Retrieve SortOrder for field: UnitsFree (RATE_UNIT_CR_OVERRIDES.units_free)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUnitsFreeSortOrder () {
    return this.UnitsFreeSort;
  }
  /** Set the sort direction for field: UnitsFree (RATE_UNIT_CR_OVERRIDES.units_free)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUnitsFreeSortDirection (boolean ascending) {
    this.UnitsFreeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UnitsFree (RATE_UNIT_CR_OVERRIDES.units_free)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUnitsFreeSortDirection () {
    return this.UnitsFreeSortAscending;
  }
  /** Set the field level filters for field: UnitsFree (RATE_UNIT_CR_OVERRIDES.units_free)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUnitsFreeFilter (BigIntegerFilter[] value) throws ServiceException {
    this.UnitsFree = value;
  }
  /** Retrieve filter for field: UnitsFree (RATE_UNIT_CR_OVERRIDES.units_free)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getUnitsFreeFilter () {
    return this.UnitsFree;
  }

  /**
   * Retrieves the UnitsFreeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UnitsFreeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UnitsFreeFilter field
   */
  public String[] getUnitsFreeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitsFreeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUnitsFreeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUnitsFreeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UnitsFreeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUnitsFreeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UnitsFreeFilter filter value from a formatted string
   *
   * @param _value the UnitsFreeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UnitsFreeFilter filter field
   */
  public void setUnitsFreeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUnitsFreeFilterFromFormattedString");
    try {
      this.setUnitsFreeFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UnitsFreeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUnitsFreeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUnitsFreeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillingFrequency (RATE_UNIT_CR_OVERRIDES.billing_frequency)
   * @param fetch whether to fetch this field or not
   */
  public void setBillingFrequencyFetch (boolean fetch) {
    this.BillingFrequencyFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillingFrequency (RATE_UNIT_CR_OVERRIDES.billing_frequency)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillingFrequencyFetch () {
    return this.BillingFrequencyFetch;
  }
  /** Set the SortOrder for field: BillingFrequency (RATE_UNIT_CR_OVERRIDES.billing_frequency)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillingFrequencySortOrder (Integer value) {
    this.BillingFrequencySort = value;
  }
  /** Retrieve SortOrder for field: BillingFrequency (RATE_UNIT_CR_OVERRIDES.billing_frequency)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillingFrequencySortOrder () {
    return this.BillingFrequencySort;
  }
  /** Set the sort direction for field: BillingFrequency (RATE_UNIT_CR_OVERRIDES.billing_frequency)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillingFrequencySortDirection (boolean ascending) {
    this.BillingFrequencySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillingFrequency (RATE_UNIT_CR_OVERRIDES.billing_frequency)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillingFrequencySortDirection () {
    return this.BillingFrequencySortAscending;
  }
  /** Set the field level filters for field: BillingFrequency (RATE_UNIT_CR_OVERRIDES.billing_frequency)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillingFrequencyFilter (IntegerFilter[] value) throws ServiceException {
    this.BillingFrequency = value;
  }
  /** Retrieve filter for field: BillingFrequency (RATE_UNIT_CR_OVERRIDES.billing_frequency)
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

  /** Set the field level Fetch value for field: CurrencyCode (RATE_UNIT_CR_OVERRIDES.currency_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCurrencyCodeFetch (boolean fetch) {
    this.CurrencyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CurrencyCode (RATE_UNIT_CR_OVERRIDES.currency_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCurrencyCodeFetch () {
    return this.CurrencyCodeFetch;
  }
  /** Set the SortOrder for field: CurrencyCode (RATE_UNIT_CR_OVERRIDES.currency_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCurrencyCodeSortOrder (Integer value) {
    this.CurrencyCodeSort = value;
  }
  /** Retrieve SortOrder for field: CurrencyCode (RATE_UNIT_CR_OVERRIDES.currency_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCurrencyCodeSortOrder () {
    return this.CurrencyCodeSort;
  }
  /** Set the sort direction for field: CurrencyCode (RATE_UNIT_CR_OVERRIDES.currency_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCurrencyCodeSortDirection (boolean ascending) {
    this.CurrencyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CurrencyCode (RATE_UNIT_CR_OVERRIDES.currency_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCurrencyCodeSortDirection () {
    return this.CurrencyCodeSortAscending;
  }
  /** Set the field level filters for field: CurrencyCode (RATE_UNIT_CR_OVERRIDES.currency_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCurrencyCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.CurrencyCode = value;
  }
  /** Retrieve filter for field: CurrencyCode (RATE_UNIT_CR_OVERRIDES.currency_code)
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

  /** Set the field level Fetch value for field: AmountFree (RATE_UNIT_CR_OVERRIDES.amount_free)
   * @param fetch whether to fetch this field or not
   */
  public void setAmountFreeFetch (boolean fetch) {
    this.AmountFreeFetch = fetch;
  }
  /** Retrieve Fetch value for field: AmountFree (RATE_UNIT_CR_OVERRIDES.amount_free)
   * @return boolean the Fetch value for this field
   */
  public boolean getAmountFreeFetch () {
    return this.AmountFreeFetch;
  }
  /** Set the SortOrder for field: AmountFree (RATE_UNIT_CR_OVERRIDES.amount_free)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAmountFreeSortOrder (Integer value) {
    this.AmountFreeSort = value;
  }
  /** Retrieve SortOrder for field: AmountFree (RATE_UNIT_CR_OVERRIDES.amount_free)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAmountFreeSortOrder () {
    return this.AmountFreeSort;
  }
  /** Set the sort direction for field: AmountFree (RATE_UNIT_CR_OVERRIDES.amount_free)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAmountFreeSortDirection (boolean ascending) {
    this.AmountFreeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AmountFree (RATE_UNIT_CR_OVERRIDES.amount_free)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAmountFreeSortDirection () {
    return this.AmountFreeSortAscending;
  }
  /** Set the field level filters for field: AmountFree (RATE_UNIT_CR_OVERRIDES.amount_free)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAmountFreeFilter (BigIntegerFilter[] value) throws ServiceException {
    this.AmountFree = value;
  }
  /** Retrieve filter for field: AmountFree (RATE_UNIT_CR_OVERRIDES.amount_free)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getAmountFreeFilter () {
    return this.AmountFree;
  }

  /**
   * Retrieves the AmountFreeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AmountFreeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AmountFreeFilter field
   */
  public String[] getAmountFreeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountFreeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAmountFreeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAmountFreeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AmountFreeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAmountFreeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AmountFreeFilter filter value from a formatted string
   *
   * @param _value the AmountFreeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AmountFreeFilter filter field
   */
  public void setAmountFreeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAmountFreeFilterFromFormattedString");
    try {
      this.setAmountFreeFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AmountFreeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAmountFreeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAmountFreeFilterFromFormattedString");
  }

  /**
   * Sets the AmountFreeFilter filter value from a formatted string
   *
   * @param _value the AmountFreeFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AmountFreeFilter filter field
   */
  public void setAmountFreeFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAmountFreeFilterFromFormattedCurrencyString");
    try {
      this.setAmountFreeFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AmountFreeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAmountFreeFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAmountFreeFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the AmountFreeFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AmountFreeFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the AmountFreeFilter field
   */

  public String[] getAmountFreeFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountFreeFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAmountFreeFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAmountFreeFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AmountFreeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAmountFreeFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: RangeOrigin (RATE_UNIT_CR_OVERRIDES.range_origin)
   * @param fetch whether to fetch this field or not
   */
  public void setRangeOriginFetch (boolean fetch) {
    this.RangeOriginFetch = fetch;
  }
  /** Retrieve Fetch value for field: RangeOrigin (RATE_UNIT_CR_OVERRIDES.range_origin)
   * @return boolean the Fetch value for this field
   */
  public boolean getRangeOriginFetch () {
    return this.RangeOriginFetch;
  }
  /** Set the SortOrder for field: RangeOrigin (RATE_UNIT_CR_OVERRIDES.range_origin)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRangeOriginSortOrder (Integer value) {
    this.RangeOriginSort = value;
  }
  /** Retrieve SortOrder for field: RangeOrigin (RATE_UNIT_CR_OVERRIDES.range_origin)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRangeOriginSortOrder () {
    return this.RangeOriginSort;
  }
  /** Set the sort direction for field: RangeOrigin (RATE_UNIT_CR_OVERRIDES.range_origin)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRangeOriginSortDirection (boolean ascending) {
    this.RangeOriginSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RangeOrigin (RATE_UNIT_CR_OVERRIDES.range_origin)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRangeOriginSortDirection () {
    return this.RangeOriginSortAscending;
  }
  /** Set the field level filters for field: RangeOrigin (RATE_UNIT_CR_OVERRIDES.range_origin)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRangeOriginFilter (BigIntegerFilter[] value) throws ServiceException {
    this.RangeOrigin = value;
  }
  /** Retrieve filter for field: RangeOrigin (RATE_UNIT_CR_OVERRIDES.range_origin)
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

  /** Set the field level Fetch value for field: RangeTerminus (RATE_UNIT_CR_OVERRIDES.range_terminus)
   * @param fetch whether to fetch this field or not
   */
  public void setRangeTerminusFetch (boolean fetch) {
    this.RangeTerminusFetch = fetch;
  }
  /** Retrieve Fetch value for field: RangeTerminus (RATE_UNIT_CR_OVERRIDES.range_terminus)
   * @return boolean the Fetch value for this field
   */
  public boolean getRangeTerminusFetch () {
    return this.RangeTerminusFetch;
  }
  /** Set the SortOrder for field: RangeTerminus (RATE_UNIT_CR_OVERRIDES.range_terminus)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRangeTerminusSortOrder (Integer value) {
    this.RangeTerminusSort = value;
  }
  /** Retrieve SortOrder for field: RangeTerminus (RATE_UNIT_CR_OVERRIDES.range_terminus)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRangeTerminusSortOrder () {
    return this.RangeTerminusSort;
  }
  /** Set the sort direction for field: RangeTerminus (RATE_UNIT_CR_OVERRIDES.range_terminus)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRangeTerminusSortDirection (boolean ascending) {
    this.RangeTerminusSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RangeTerminus (RATE_UNIT_CR_OVERRIDES.range_terminus)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRangeTerminusSortDirection () {
    return this.RangeTerminusSortAscending;
  }
  /** Set the field level filters for field: RangeTerminus (RATE_UNIT_CR_OVERRIDES.range_terminus)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRangeTerminusFilter (BigIntegerFilter[] value) throws ServiceException {
    this.RangeTerminus = value;
  }
  /** Retrieve filter for field: RangeTerminus (RATE_UNIT_CR_OVERRIDES.range_terminus)
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

  /** Set the field level Fetch value for field: CreateDt (RATE_UNIT_CR_OVERRIDES.create_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setCreateDtFetch (boolean fetch) {
    this.CreateDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: CreateDt (RATE_UNIT_CR_OVERRIDES.create_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getCreateDtFetch () {
    return this.CreateDtFetch;
  }
  /** Set the SortOrder for field: CreateDt (RATE_UNIT_CR_OVERRIDES.create_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCreateDtSortOrder (Integer value) {
    this.CreateDtSort = value;
  }
  /** Retrieve SortOrder for field: CreateDt (RATE_UNIT_CR_OVERRIDES.create_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCreateDtSortOrder () {
    return this.CreateDtSort;
  }
  /** Set the sort direction for field: CreateDt (RATE_UNIT_CR_OVERRIDES.create_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCreateDtSortDirection (boolean ascending) {
    this.CreateDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CreateDt (RATE_UNIT_CR_OVERRIDES.create_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCreateDtSortDirection () {
    return this.CreateDtSortAscending;
  }
  /** Set the field level filters for field: CreateDt (RATE_UNIT_CR_OVERRIDES.create_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCreateDtFilter (DateFilter[] value) throws ServiceException {
    this.CreateDt = value;
  }
  /** Retrieve filter for field: CreateDt (RATE_UNIT_CR_OVERRIDES.create_dt)
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


  /** Set the field level Fetch value for field: ChgDt (RATE_UNIT_CR_OVERRIDES.chg_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setChgDtFetch (boolean fetch) {
    this.ChgDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgDt (RATE_UNIT_CR_OVERRIDES.chg_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgDtFetch () {
    return this.ChgDtFetch;
  }
  /** Set the SortOrder for field: ChgDt (RATE_UNIT_CR_OVERRIDES.chg_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgDtSortOrder (Integer value) {
    this.ChgDtSort = value;
  }
  /** Retrieve SortOrder for field: ChgDt (RATE_UNIT_CR_OVERRIDES.chg_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgDtSortOrder () {
    return this.ChgDtSort;
  }
  /** Set the sort direction for field: ChgDt (RATE_UNIT_CR_OVERRIDES.chg_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgDtSortDirection (boolean ascending) {
    this.ChgDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgDt (RATE_UNIT_CR_OVERRIDES.chg_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgDtSortDirection () {
    return this.ChgDtSortAscending;
  }
  /** Set the field level filters for field: ChgDt (RATE_UNIT_CR_OVERRIDES.chg_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgDtFilter (DateFilter[] value) throws ServiceException {
    this.ChgDt = value;
  }
  /** Retrieve filter for field: ChgDt (RATE_UNIT_CR_OVERRIDES.chg_dt)
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


  /** Set the field level Fetch value for field: ChgWho (RATE_UNIT_CR_OVERRIDES.chg_who)
   * @param fetch whether to fetch this field or not
   */
  public void setChgWhoFetch (boolean fetch) {
    this.ChgWhoFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgWho (RATE_UNIT_CR_OVERRIDES.chg_who)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgWhoFetch () {
    return this.ChgWhoFetch;
  }
  /** Set the SortOrder for field: ChgWho (RATE_UNIT_CR_OVERRIDES.chg_who)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgWhoSortOrder (Integer value) {
    this.ChgWhoSort = value;
  }
  /** Retrieve SortOrder for field: ChgWho (RATE_UNIT_CR_OVERRIDES.chg_who)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgWhoSortOrder () {
    return this.ChgWhoSort;
  }
  /** Set the sort direction for field: ChgWho (RATE_UNIT_CR_OVERRIDES.chg_who)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgWhoSortDirection (boolean ascending) {
    this.ChgWhoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgWho (RATE_UNIT_CR_OVERRIDES.chg_who)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgWhoSortDirection () {
    return this.ChgWhoSortAscending;
  }
  /** Set the case insensitive for field: ChgWho (RATE_UNIT_CR_OVERRIDES.chg_who)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setChgWhoCaseInsensitive (boolean ascending) {
    this.ChgWhoCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ChgWho (RATE_UNIT_CR_OVERRIDES.chg_who)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getChgWhoCaseInsensitive () {
    return this.ChgWhoCaseInsensitive;
  }
  /** Set the field level filters for field: ChgWho (RATE_UNIT_CR_OVERRIDES.chg_who)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgWhoFilter (StringFilter[] value) throws ServiceException {
    this.ChgWho = value;
  }
  /** Retrieve filter for field: ChgWho (RATE_UNIT_CR_OVERRIDES.chg_who)
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

  /** Set the field level Fetch value for field: ActiveDt (RATE_UNIT_CR_OVERRIDES.active_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setActiveDtFetch (boolean fetch) {
    this.ActiveDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: ActiveDt (RATE_UNIT_CR_OVERRIDES.active_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getActiveDtFetch () {
    return this.ActiveDtFetch;
  }
  /** Set the SortOrder for field: ActiveDt (RATE_UNIT_CR_OVERRIDES.active_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setActiveDtSortOrder (Integer value) {
    this.ActiveDtSort = value;
  }
  /** Retrieve SortOrder for field: ActiveDt (RATE_UNIT_CR_OVERRIDES.active_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getActiveDtSortOrder () {
    return this.ActiveDtSort;
  }
  /** Set the sort direction for field: ActiveDt (RATE_UNIT_CR_OVERRIDES.active_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setActiveDtSortDirection (boolean ascending) {
    this.ActiveDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ActiveDt (RATE_UNIT_CR_OVERRIDES.active_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getActiveDtSortDirection () {
    return this.ActiveDtSortAscending;
  }
  /** Set the field level filters for field: ActiveDt (RATE_UNIT_CR_OVERRIDES.active_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setActiveDtFilter (DateFilter[] value) throws ServiceException {
    this.ActiveDt = value;
  }
  /** Retrieve filter for field: ActiveDt (RATE_UNIT_CR_OVERRIDES.active_dt)
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


  /** Set the field level Fetch value for field: InactiveDt (RATE_UNIT_CR_OVERRIDES.inactive_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setInactiveDtFetch (boolean fetch) {
    this.InactiveDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: InactiveDt (RATE_UNIT_CR_OVERRIDES.inactive_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getInactiveDtFetch () {
    return this.InactiveDtFetch;
  }
  /** Set the SortOrder for field: InactiveDt (RATE_UNIT_CR_OVERRIDES.inactive_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInactiveDtSortOrder (Integer value) {
    this.InactiveDtSort = value;
  }
  /** Retrieve SortOrder for field: InactiveDt (RATE_UNIT_CR_OVERRIDES.inactive_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInactiveDtSortOrder () {
    return this.InactiveDtSort;
  }
  /** Set the sort direction for field: InactiveDt (RATE_UNIT_CR_OVERRIDES.inactive_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInactiveDtSortDirection (boolean ascending) {
    this.InactiveDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InactiveDt (RATE_UNIT_CR_OVERRIDES.inactive_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInactiveDtSortDirection () {
    return this.InactiveDtSortAscending;
  }
  /** Set the field level filters for field: InactiveDt (RATE_UNIT_CR_OVERRIDES.inactive_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInactiveDtFilter (DateFilter[] value) throws ServiceException {
    this.InactiveDt = value;
  }
  /** Retrieve filter for field: InactiveDt (RATE_UNIT_CR_OVERRIDES.inactive_dt)
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
    return RUCBaseOverrideObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return RUCBaseOverrideObjectHelper.toMap(this, null);
  }
}
