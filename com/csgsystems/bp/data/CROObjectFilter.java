/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CROObjectFilter.java
 * Definition File: Admin/CorridorRateOverride.xml
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
public class CROObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public CROObjectKeyFilter Key = null;
  /** raw field for: RATE_USAGE_OVERRIDES.corridor_plan_id) */
  public    IntegerFilter[] CorridorPlanId  = null;
  protected boolean CorridorPlanIdFetch = false;
  protected boolean CorridorPlanIdSortAscending = true;
  protected Integer CorridorPlanIdSort = null;
  /** raw field for: RATE_USAGE_OVERRIDES.type_id_usg) */
  public    IntegerFilter[] TypeIdUsg  = null;
  protected boolean TypeIdUsgFetch = false;
  protected boolean TypeIdUsgSortAscending = true;
  protected Integer TypeIdUsgSort = null;
  /** raw field for: RATE_USAGE_OVERRIDES.units_indicator) */
  public    IntegerFilter[] UnitsIndicator  = null;
  protected boolean UnitsIndicatorFetch = false;
  protected boolean UnitsIndicatorSortAscending = true;
  protected Integer UnitsIndicatorSort = null;
  /** raw field for: RATE_USAGE_OVERRIDES.element_id) */
  public    IntegerFilter[] ElementId  = null;
  protected boolean ElementIdFetch = false;
  protected boolean ElementIdSortAscending = true;
  protected Integer ElementIdSort = null;
  /** raw field for: RATE_USAGE_OVERRIDES.rate_class) */
  public    IntegerFilter[] RateClass  = null;
  protected boolean RateClassFetch = false;
  protected boolean RateClassSortAscending = true;
  protected Integer RateClassSort = null;
  /** raw field for: RATE_USAGE_OVERRIDES.equip_type_code) */
  public    IntegerFilter[] EquipTypeCode  = null;
  protected boolean EquipTypeCodeFetch = false;
  protected boolean EquipTypeCodeSortAscending = true;
  protected Integer EquipTypeCodeSort = null;
  /** raw field for: RATE_USAGE_OVERRIDES.equip_class_code) */
  public    IntegerFilter[] EquipClassCode  = null;
  protected boolean EquipClassCodeFetch = false;
  protected boolean EquipClassCodeSortAscending = true;
  protected Integer EquipClassCodeSort = null;
  /** raw field for: RATE_USAGE_OVERRIDES.class_of_service_code) */
  public    IntegerFilter[] ClassOfServiceCode  = null;
  protected boolean ClassOfServiceCodeFetch = false;
  protected boolean ClassOfServiceCodeSortAscending = true;
  protected Integer ClassOfServiceCodeSort = null;
  /** raw field for: RATE_USAGE_OVERRIDES.provider_class) */
  public    IntegerFilter[] ProviderClass  = null;
  protected boolean ProviderClassFetch = false;
  protected boolean ProviderClassSortAscending = true;
  protected Integer ProviderClassSort = null;
  /** raw field for: RATE_USAGE_OVERRIDES.bill_class) */
  public    IntegerFilter[] BillClass  = null;
  protected boolean BillClassFetch = false;
  protected boolean BillClassSortAscending = true;
  protected Integer BillClassSort = null;
  /** raw field for: RATE_USAGE_OVERRIDES.jurisdiction) */
  public    IntegerFilter[] Jurisdiction  = null;
  protected boolean JurisdictionFetch = false;
  protected boolean JurisdictionSortAscending = true;
  protected Integer JurisdictionSort = null;
  /** raw field for: RATE_USAGE_OVERRIDES.currency_code) */
  public    IntegerFilter[] CurrencyCode  = null;
  protected boolean CurrencyCodeFetch = false;
  protected boolean CurrencyCodeSortAscending = true;
  protected Integer CurrencyCodeSort = null;
  /** raw field for: RATE_USAGE_OVERRIDES.rate_period) */
  public    StringFilter[] RatePeriod  = null;
  protected boolean RatePeriodFetch = false;
  protected boolean RatePeriodSortAscending = true;
  protected boolean RatePeriodCaseInsensitive = false;
  protected Integer RatePeriodSort = null;
  /** raw field for: RATE_USAGE_OVERRIDES.incremental_bands) */
  public    BooleanFilter[] IncrementalBands  = null;
  protected boolean IncrementalBandsFetch = false;
  protected boolean IncrementalBandsSortAscending = true;
  protected Integer IncrementalBandsSort = null;
  /** raw field for: RATE_USAGE_OVERRIDES.fixed_charge_amt) */
  public    BigIntegerFilter[] FixedChargeAmt  = null;
  protected boolean FixedChargeAmtFetch = false;
  protected boolean FixedChargeAmtSortAscending = true;
  protected Integer FixedChargeAmtSort = null;
  /** raw field for: RATE_USAGE_OVERRIDES.add_fixed_amt) */
  public    IntegerFilter[] AddFixedAmt  = null;
  protected boolean AddFixedAmtFetch = false;
  protected boolean AddFixedAmtSortAscending = true;
  protected Integer AddFixedAmtSort = null;
  /** raw field for: RATE_USAGE_OVERRIDES.add_unit_rate) */
  public    IntegerFilter[] AddUnitRate  = null;
  protected boolean AddUnitRateFetch = false;
  protected boolean AddUnitRateSortAscending = true;
  protected Integer AddUnitRateSort = null;
  /** raw field for: RATE_USAGE_OVERRIDES.active_dt) */
  public    DateFilter[] ActiveDt  = null;
  protected boolean ActiveDtFetch = false;
  protected boolean ActiveDtSortAscending = true;
  protected Integer ActiveDtSort = null;
  /** raw field for: RATE_USAGE_OVERRIDES.inactive_dt) */
  public    DateFilter[] InactiveDt  = null;
  protected boolean InactiveDtFetch = false;
  protected boolean InactiveDtSortAscending = true;
  protected Integer InactiveDtSort = null;
  /** raw field for: RATE_USAGE_OVERRIDES.create_dt) */
  public    DateFilter[] CreateDt  = null;
  protected boolean CreateDtFetch = false;
  protected boolean CreateDtSortAscending = true;
  protected Integer CreateDtSort = null;
  /** raw field for: RATE_USAGE_OVERRIDES.chg_dt) */
  public    DateFilter[] ChgDt  = null;
  protected boolean ChgDtFetch = false;
  protected boolean ChgDtSortAscending = true;
  protected Integer ChgDtSort = null;
  /** raw field for: RATE_USAGE_OVERRIDES.chg_who) */
  public    StringFilter[] ChgWho  = null;
  protected boolean ChgWhoFetch = false;
  protected boolean ChgWhoSortAscending = true;
  protected boolean ChgWhoCaseInsensitive = false;
  protected Integer ChgWhoSort = null;
  /** raw field for: RATE_USAGE_OVERRIDES.rate_units_type) */
  public    IntegerFilter[] RateUnitsType  = null;
  protected boolean RateUnitsTypeFetch = false;
  protected boolean RateUnitsTypeSortAscending = true;
  protected Integer RateUnitsTypeSort = null;
  /** raw field for: RATE_USAGE_OVERRIDES.distance_band_id) */
  public    IntegerFilter[] DistanceBandId  = null;
  protected boolean DistanceBandIdFetch = false;
  protected boolean DistanceBandIdSortAscending = true;
  protected Integer DistanceBandIdSort = null;
  /** raw field for: RATE_USAGE_OVERRIDES.add_implied_decimal) */
  public    IntegerFilter[] AddImpliedDecimal  = null;
  protected boolean AddImpliedDecimalFetch = false;
  protected boolean AddImpliedDecimalSortAscending = true;
  protected Integer AddImpliedDecimalSort = null;
  /** raw field for: RATE_USAGE_OVERRIDES.component_id) */
  public    IntegerFilter[] ComponentId  = null;
  protected boolean ComponentIdFetch = false;
  protected boolean ComponentIdSortAscending = true;
  protected Integer ComponentIdSort = null;
  /** raw field for: RATE_USAGE_OVERRIDES.billing_units_type) */
  public    IntegerFilter[] BillingUnitsType  = null;
  protected boolean BillingUnitsTypeFetch = false;
  protected boolean BillingUnitsTypeSortAscending = true;
  protected Integer BillingUnitsTypeSort = null;
  /** raw field for: RATE_USAGE_OVERRIDES.config_tag_id) */
  public    StringFilter[] ConfigTagId  = null;
  protected boolean ConfigTagIdFetch = false;
  protected boolean ConfigTagIdSortAscending = true;
  protected boolean ConfigTagIdCaseInsensitive = false;
  protected Integer ConfigTagIdSort = null;
  private String _objName = "CROObjectFilter";
  /** default constructor */
  public CROObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public CROObjectFilter (CROObjectFilter other)
  {
    if (other == null) return;
    this.Key = new CROObjectKeyFilter (other.Key);
    this.CorridorPlanId = other.CorridorPlanId;
    this.CorridorPlanIdFetch = other.CorridorPlanIdFetch;
    this.CorridorPlanIdSort = other.CorridorPlanIdSort;
    this.CorridorPlanIdSortAscending = other.CorridorPlanIdSortAscending;
    this.TypeIdUsg = other.TypeIdUsg;
    this.TypeIdUsgFetch = other.TypeIdUsgFetch;
    this.TypeIdUsgSort = other.TypeIdUsgSort;
    this.TypeIdUsgSortAscending = other.TypeIdUsgSortAscending;
    this.UnitsIndicator = other.UnitsIndicator;
    this.UnitsIndicatorFetch = other.UnitsIndicatorFetch;
    this.UnitsIndicatorSort = other.UnitsIndicatorSort;
    this.UnitsIndicatorSortAscending = other.UnitsIndicatorSortAscending;
    this.ElementId = other.ElementId;
    this.ElementIdFetch = other.ElementIdFetch;
    this.ElementIdSort = other.ElementIdSort;
    this.ElementIdSortAscending = other.ElementIdSortAscending;
    this.RateClass = other.RateClass;
    this.RateClassFetch = other.RateClassFetch;
    this.RateClassSort = other.RateClassSort;
    this.RateClassSortAscending = other.RateClassSortAscending;
    this.EquipTypeCode = other.EquipTypeCode;
    this.EquipTypeCodeFetch = other.EquipTypeCodeFetch;
    this.EquipTypeCodeSort = other.EquipTypeCodeSort;
    this.EquipTypeCodeSortAscending = other.EquipTypeCodeSortAscending;
    this.EquipClassCode = other.EquipClassCode;
    this.EquipClassCodeFetch = other.EquipClassCodeFetch;
    this.EquipClassCodeSort = other.EquipClassCodeSort;
    this.EquipClassCodeSortAscending = other.EquipClassCodeSortAscending;
    this.ClassOfServiceCode = other.ClassOfServiceCode;
    this.ClassOfServiceCodeFetch = other.ClassOfServiceCodeFetch;
    this.ClassOfServiceCodeSort = other.ClassOfServiceCodeSort;
    this.ClassOfServiceCodeSortAscending = other.ClassOfServiceCodeSortAscending;
    this.ProviderClass = other.ProviderClass;
    this.ProviderClassFetch = other.ProviderClassFetch;
    this.ProviderClassSort = other.ProviderClassSort;
    this.ProviderClassSortAscending = other.ProviderClassSortAscending;
    this.BillClass = other.BillClass;
    this.BillClassFetch = other.BillClassFetch;
    this.BillClassSort = other.BillClassSort;
    this.BillClassSortAscending = other.BillClassSortAscending;
    this.Jurisdiction = other.Jurisdiction;
    this.JurisdictionFetch = other.JurisdictionFetch;
    this.JurisdictionSort = other.JurisdictionSort;
    this.JurisdictionSortAscending = other.JurisdictionSortAscending;
    this.CurrencyCode = other.CurrencyCode;
    this.CurrencyCodeFetch = other.CurrencyCodeFetch;
    this.CurrencyCodeSort = other.CurrencyCodeSort;
    this.CurrencyCodeSortAscending = other.CurrencyCodeSortAscending;
    this.RatePeriod = other.RatePeriod;
    this.RatePeriodFetch = other.RatePeriodFetch;
    this.RatePeriodSort = other.RatePeriodSort;
    this.RatePeriodCaseInsensitive = other.RatePeriodCaseInsensitive;
    this.RatePeriodSortAscending = other.RatePeriodSortAscending;
    this.IncrementalBands = other.IncrementalBands;
    this.IncrementalBandsFetch = other.IncrementalBandsFetch;
    this.IncrementalBandsSort = other.IncrementalBandsSort;
    this.IncrementalBandsSortAscending = other.IncrementalBandsSortAscending;
    this.FixedChargeAmt = other.FixedChargeAmt;
    this.FixedChargeAmtFetch = other.FixedChargeAmtFetch;
    this.FixedChargeAmtSort = other.FixedChargeAmtSort;
    this.FixedChargeAmtSortAscending = other.FixedChargeAmtSortAscending;
    this.AddFixedAmt = other.AddFixedAmt;
    this.AddFixedAmtFetch = other.AddFixedAmtFetch;
    this.AddFixedAmtSort = other.AddFixedAmtSort;
    this.AddFixedAmtSortAscending = other.AddFixedAmtSortAscending;
    this.AddUnitRate = other.AddUnitRate;
    this.AddUnitRateFetch = other.AddUnitRateFetch;
    this.AddUnitRateSort = other.AddUnitRateSort;
    this.AddUnitRateSortAscending = other.AddUnitRateSortAscending;
    this.ActiveDt = other.ActiveDt;
    this.ActiveDtFetch = other.ActiveDtFetch;
    this.ActiveDtSort = other.ActiveDtSort;
    this.ActiveDtSortAscending = other.ActiveDtSortAscending;
    this.InactiveDt = other.InactiveDt;
    this.InactiveDtFetch = other.InactiveDtFetch;
    this.InactiveDtSort = other.InactiveDtSort;
    this.InactiveDtSortAscending = other.InactiveDtSortAscending;
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
    this.RateUnitsType = other.RateUnitsType;
    this.RateUnitsTypeFetch = other.RateUnitsTypeFetch;
    this.RateUnitsTypeSort = other.RateUnitsTypeSort;
    this.RateUnitsTypeSortAscending = other.RateUnitsTypeSortAscending;
    this.DistanceBandId = other.DistanceBandId;
    this.DistanceBandIdFetch = other.DistanceBandIdFetch;
    this.DistanceBandIdSort = other.DistanceBandIdSort;
    this.DistanceBandIdSortAscending = other.DistanceBandIdSortAscending;
    this.AddImpliedDecimal = other.AddImpliedDecimal;
    this.AddImpliedDecimalFetch = other.AddImpliedDecimalFetch;
    this.AddImpliedDecimalSort = other.AddImpliedDecimalSort;
    this.AddImpliedDecimalSortAscending = other.AddImpliedDecimalSortAscending;
    this.ComponentId = other.ComponentId;
    this.ComponentIdFetch = other.ComponentIdFetch;
    this.ComponentIdSort = other.ComponentIdSort;
    this.ComponentIdSortAscending = other.ComponentIdSortAscending;
    this.BillingUnitsType = other.BillingUnitsType;
    this.BillingUnitsTypeFetch = other.BillingUnitsTypeFetch;
    this.BillingUnitsTypeSort = other.BillingUnitsTypeSort;
    this.BillingUnitsTypeSortAscending = other.BillingUnitsTypeSortAscending;
    this.ConfigTagId = other.ConfigTagId;
    this.ConfigTagIdFetch = other.ConfigTagIdFetch;
    this.ConfigTagIdSort = other.ConfigTagIdSort;
    this.ConfigTagIdCaseInsensitive = other.ConfigTagIdCaseInsensitive;
    this.ConfigTagIdSortAscending = other.ConfigTagIdSortAscending;  }
  /** get the filter for this object's key
   * @return CROObjectKeyFilter
   */
  public CROObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (CROObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: Seqnum (RATE_USAGE_OVERRIDES.seqnum)
   * @param fetch whether to fetch this field or not
   */
  public void setSeqnumFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new CROObjectKeyFilter ();
    this.Key.SeqnumFetch = fetch;
  }
  /** Retrieve Fetch value for field: Seqnum (RATE_USAGE_OVERRIDES.seqnum)
   * @return boolean the Fetch value for this field
   */
  public boolean getSeqnumFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.SeqnumFetch;
  }
  /** Set the SortOrder for field: Seqnum (RATE_USAGE_OVERRIDES.seqnum)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSeqnumSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new CROObjectKeyFilter ();
    this.Key.SeqnumSort = value;
  }
  /** Retrieve SortOrder for field: Seqnum (RATE_USAGE_OVERRIDES.seqnum)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSeqnumSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.SeqnumSort;
  }
  /** Set the sort direction for field: Seqnum (RATE_USAGE_OVERRIDES.seqnum)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSeqnumSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new CROObjectKeyFilter ();
    this.Key.SeqnumSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Seqnum (RATE_USAGE_OVERRIDES.seqnum)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSeqnumSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.SeqnumSortAscending;
  }
  /** Set the field level filters for field: Seqnum (RATE_USAGE_OVERRIDES.seqnum)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSeqnumFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new CROObjectKeyFilter ();
    this.Key.Seqnum = value;
  }
  /** Retrieve filter for field: Seqnum (RATE_USAGE_OVERRIDES.seqnum)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getSeqnumFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.Seqnum;
  }
  /** Set the field level Fetch value for field: CorridorPlanId (RATE_USAGE_OVERRIDES.corridor_plan_id)
   * @param fetch whether to fetch this field or not
   */
  public void setCorridorPlanIdFetch (boolean fetch) {
    this.CorridorPlanIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: CorridorPlanId (RATE_USAGE_OVERRIDES.corridor_plan_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getCorridorPlanIdFetch () {
    return this.CorridorPlanIdFetch;
  }
  /** Set the SortOrder for field: CorridorPlanId (RATE_USAGE_OVERRIDES.corridor_plan_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCorridorPlanIdSortOrder (Integer value) {
    this.CorridorPlanIdSort = value;
  }
  /** Retrieve SortOrder for field: CorridorPlanId (RATE_USAGE_OVERRIDES.corridor_plan_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCorridorPlanIdSortOrder () {
    return this.CorridorPlanIdSort;
  }
  /** Set the sort direction for field: CorridorPlanId (RATE_USAGE_OVERRIDES.corridor_plan_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCorridorPlanIdSortDirection (boolean ascending) {
    this.CorridorPlanIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CorridorPlanId (RATE_USAGE_OVERRIDES.corridor_plan_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCorridorPlanIdSortDirection () {
    return this.CorridorPlanIdSortAscending;
  }
  /** Set the field level filters for field: CorridorPlanId (RATE_USAGE_OVERRIDES.corridor_plan_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCorridorPlanIdFilter (IntegerFilter[] value) throws ServiceException {
    this.CorridorPlanId = value;
  }
  /** Retrieve filter for field: CorridorPlanId (RATE_USAGE_OVERRIDES.corridor_plan_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCorridorPlanIdFilter () {
    return this.CorridorPlanId;
  }

  /**
   * Retrieves the CorridorPlanIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CorridorPlanIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CorridorPlanIdFilter field
   */
  public String[] getCorridorPlanIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCorridorPlanIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCorridorPlanIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCorridorPlanIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CorridorPlanIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCorridorPlanIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CorridorPlanIdFilter filter value from a formatted string
   *
   * @param _value the CorridorPlanIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CorridorPlanIdFilter filter field
   */
  public void setCorridorPlanIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCorridorPlanIdFilterFromFormattedString");
    try {
      this.setCorridorPlanIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CorridorPlanIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCorridorPlanIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCorridorPlanIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TypeIdUsg (RATE_USAGE_OVERRIDES.type_id_usg)
   * @param fetch whether to fetch this field or not
   */
  public void setTypeIdUsgFetch (boolean fetch) {
    this.TypeIdUsgFetch = fetch;
  }
  /** Retrieve Fetch value for field: TypeIdUsg (RATE_USAGE_OVERRIDES.type_id_usg)
   * @return boolean the Fetch value for this field
   */
  public boolean getTypeIdUsgFetch () {
    return this.TypeIdUsgFetch;
  }
  /** Set the SortOrder for field: TypeIdUsg (RATE_USAGE_OVERRIDES.type_id_usg)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTypeIdUsgSortOrder (Integer value) {
    this.TypeIdUsgSort = value;
  }
  /** Retrieve SortOrder for field: TypeIdUsg (RATE_USAGE_OVERRIDES.type_id_usg)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTypeIdUsgSortOrder () {
    return this.TypeIdUsgSort;
  }
  /** Set the sort direction for field: TypeIdUsg (RATE_USAGE_OVERRIDES.type_id_usg)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTypeIdUsgSortDirection (boolean ascending) {
    this.TypeIdUsgSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TypeIdUsg (RATE_USAGE_OVERRIDES.type_id_usg)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTypeIdUsgSortDirection () {
    return this.TypeIdUsgSortAscending;
  }
  /** Set the field level filters for field: TypeIdUsg (RATE_USAGE_OVERRIDES.type_id_usg)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTypeIdUsgFilter (IntegerFilter[] value) throws ServiceException {
    this.TypeIdUsg = value;
  }
  /** Retrieve filter for field: TypeIdUsg (RATE_USAGE_OVERRIDES.type_id_usg)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTypeIdUsgFilter () {
    return this.TypeIdUsg;
  }

  /**
   * Retrieves the TypeIdUsgFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TypeIdUsgFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TypeIdUsgFilter field
   */
  public String[] getTypeIdUsgFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTypeIdUsgFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTypeIdUsgFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTypeIdUsgFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TypeIdUsgFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTypeIdUsgFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TypeIdUsgFilter filter value from a formatted string
   *
   * @param _value the TypeIdUsgFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TypeIdUsgFilter filter field
   */
  public void setTypeIdUsgFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTypeIdUsgFilterFromFormattedString");
    try {
      this.setTypeIdUsgFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TypeIdUsgFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTypeIdUsgFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTypeIdUsgFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: UnitsIndicator (RATE_USAGE_OVERRIDES.units_indicator)
   * @param fetch whether to fetch this field or not
   */
  public void setUnitsIndicatorFetch (boolean fetch) {
    this.UnitsIndicatorFetch = fetch;
  }
  /** Retrieve Fetch value for field: UnitsIndicator (RATE_USAGE_OVERRIDES.units_indicator)
   * @return boolean the Fetch value for this field
   */
  public boolean getUnitsIndicatorFetch () {
    return this.UnitsIndicatorFetch;
  }
  /** Set the SortOrder for field: UnitsIndicator (RATE_USAGE_OVERRIDES.units_indicator)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUnitsIndicatorSortOrder (Integer value) {
    this.UnitsIndicatorSort = value;
  }
  /** Retrieve SortOrder for field: UnitsIndicator (RATE_USAGE_OVERRIDES.units_indicator)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUnitsIndicatorSortOrder () {
    return this.UnitsIndicatorSort;
  }
  /** Set the sort direction for field: UnitsIndicator (RATE_USAGE_OVERRIDES.units_indicator)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUnitsIndicatorSortDirection (boolean ascending) {
    this.UnitsIndicatorSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UnitsIndicator (RATE_USAGE_OVERRIDES.units_indicator)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUnitsIndicatorSortDirection () {
    return this.UnitsIndicatorSortAscending;
  }
  /** Set the field level filters for field: UnitsIndicator (RATE_USAGE_OVERRIDES.units_indicator)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUnitsIndicatorFilter (IntegerFilter[] value) throws ServiceException {
    this.UnitsIndicator = value;
  }
  /** Retrieve filter for field: UnitsIndicator (RATE_USAGE_OVERRIDES.units_indicator)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getUnitsIndicatorFilter () {
    return this.UnitsIndicator;
  }

  /**
   * Retrieves the UnitsIndicatorFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UnitsIndicatorFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UnitsIndicatorFilter field
   */
  public String[] getUnitsIndicatorFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitsIndicatorFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUnitsIndicatorFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUnitsIndicatorFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UnitsIndicatorFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUnitsIndicatorFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UnitsIndicatorFilter filter value from a formatted string
   *
   * @param _value the UnitsIndicatorFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UnitsIndicatorFilter filter field
   */
  public void setUnitsIndicatorFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUnitsIndicatorFilterFromFormattedString");
    try {
      this.setUnitsIndicatorFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UnitsIndicatorFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUnitsIndicatorFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUnitsIndicatorFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ElementId (RATE_USAGE_OVERRIDES.element_id)
   * @param fetch whether to fetch this field or not
   */
  public void setElementIdFetch (boolean fetch) {
    this.ElementIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ElementId (RATE_USAGE_OVERRIDES.element_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getElementIdFetch () {
    return this.ElementIdFetch;
  }
  /** Set the SortOrder for field: ElementId (RATE_USAGE_OVERRIDES.element_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setElementIdSortOrder (Integer value) {
    this.ElementIdSort = value;
  }
  /** Retrieve SortOrder for field: ElementId (RATE_USAGE_OVERRIDES.element_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getElementIdSortOrder () {
    return this.ElementIdSort;
  }
  /** Set the sort direction for field: ElementId (RATE_USAGE_OVERRIDES.element_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setElementIdSortDirection (boolean ascending) {
    this.ElementIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ElementId (RATE_USAGE_OVERRIDES.element_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getElementIdSortDirection () {
    return this.ElementIdSortAscending;
  }
  /** Set the field level filters for field: ElementId (RATE_USAGE_OVERRIDES.element_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setElementIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ElementId = value;
  }
  /** Retrieve filter for field: ElementId (RATE_USAGE_OVERRIDES.element_id)
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

  /** Set the field level Fetch value for field: RateClass (RATE_USAGE_OVERRIDES.rate_class)
   * @param fetch whether to fetch this field or not
   */
  public void setRateClassFetch (boolean fetch) {
    this.RateClassFetch = fetch;
  }
  /** Retrieve Fetch value for field: RateClass (RATE_USAGE_OVERRIDES.rate_class)
   * @return boolean the Fetch value for this field
   */
  public boolean getRateClassFetch () {
    return this.RateClassFetch;
  }
  /** Set the SortOrder for field: RateClass (RATE_USAGE_OVERRIDES.rate_class)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRateClassSortOrder (Integer value) {
    this.RateClassSort = value;
  }
  /** Retrieve SortOrder for field: RateClass (RATE_USAGE_OVERRIDES.rate_class)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRateClassSortOrder () {
    return this.RateClassSort;
  }
  /** Set the sort direction for field: RateClass (RATE_USAGE_OVERRIDES.rate_class)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRateClassSortDirection (boolean ascending) {
    this.RateClassSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RateClass (RATE_USAGE_OVERRIDES.rate_class)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRateClassSortDirection () {
    return this.RateClassSortAscending;
  }
  /** Set the field level filters for field: RateClass (RATE_USAGE_OVERRIDES.rate_class)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRateClassFilter (IntegerFilter[] value) throws ServiceException {
    this.RateClass = value;
  }
  /** Retrieve filter for field: RateClass (RATE_USAGE_OVERRIDES.rate_class)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRateClassFilter () {
    return this.RateClass;
  }

  /**
   * Retrieves the RateClassFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RateClassFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateClassFilter field
   */
  public String[] getRateClassFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateClassFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRateClassFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateClassFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateClassFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RateClassFilter filter value from a formatted string
   *
   * @param _value the RateClassFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RateClassFilter filter field
   */
  public void setRateClassFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRateClassFilterFromFormattedString");
    try {
      this.setRateClassFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateClassFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateClassFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: EquipTypeCode (RATE_USAGE_OVERRIDES.equip_type_code)
   * @param fetch whether to fetch this field or not
   */
  public void setEquipTypeCodeFetch (boolean fetch) {
    this.EquipTypeCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: EquipTypeCode (RATE_USAGE_OVERRIDES.equip_type_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getEquipTypeCodeFetch () {
    return this.EquipTypeCodeFetch;
  }
  /** Set the SortOrder for field: EquipTypeCode (RATE_USAGE_OVERRIDES.equip_type_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEquipTypeCodeSortOrder (Integer value) {
    this.EquipTypeCodeSort = value;
  }
  /** Retrieve SortOrder for field: EquipTypeCode (RATE_USAGE_OVERRIDES.equip_type_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEquipTypeCodeSortOrder () {
    return this.EquipTypeCodeSort;
  }
  /** Set the sort direction for field: EquipTypeCode (RATE_USAGE_OVERRIDES.equip_type_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEquipTypeCodeSortDirection (boolean ascending) {
    this.EquipTypeCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EquipTypeCode (RATE_USAGE_OVERRIDES.equip_type_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEquipTypeCodeSortDirection () {
    return this.EquipTypeCodeSortAscending;
  }
  /** Set the field level filters for field: EquipTypeCode (RATE_USAGE_OVERRIDES.equip_type_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEquipTypeCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.EquipTypeCode = value;
  }
  /** Retrieve filter for field: EquipTypeCode (RATE_USAGE_OVERRIDES.equip_type_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getEquipTypeCodeFilter () {
    return this.EquipTypeCode;
  }

  /**
   * Retrieves the EquipTypeCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EquipTypeCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EquipTypeCodeFilter field
   */
  public String[] getEquipTypeCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEquipTypeCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEquipTypeCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEquipTypeCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EquipTypeCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEquipTypeCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EquipTypeCodeFilter filter value from a formatted string
   *
   * @param _value the EquipTypeCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EquipTypeCodeFilter filter field
   */
  public void setEquipTypeCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEquipTypeCodeFilterFromFormattedString");
    try {
      this.setEquipTypeCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EquipTypeCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEquipTypeCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEquipTypeCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: EquipClassCode (RATE_USAGE_OVERRIDES.equip_class_code)
   * @param fetch whether to fetch this field or not
   */
  public void setEquipClassCodeFetch (boolean fetch) {
    this.EquipClassCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: EquipClassCode (RATE_USAGE_OVERRIDES.equip_class_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getEquipClassCodeFetch () {
    return this.EquipClassCodeFetch;
  }
  /** Set the SortOrder for field: EquipClassCode (RATE_USAGE_OVERRIDES.equip_class_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEquipClassCodeSortOrder (Integer value) {
    this.EquipClassCodeSort = value;
  }
  /** Retrieve SortOrder for field: EquipClassCode (RATE_USAGE_OVERRIDES.equip_class_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEquipClassCodeSortOrder () {
    return this.EquipClassCodeSort;
  }
  /** Set the sort direction for field: EquipClassCode (RATE_USAGE_OVERRIDES.equip_class_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEquipClassCodeSortDirection (boolean ascending) {
    this.EquipClassCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EquipClassCode (RATE_USAGE_OVERRIDES.equip_class_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEquipClassCodeSortDirection () {
    return this.EquipClassCodeSortAscending;
  }
  /** Set the field level filters for field: EquipClassCode (RATE_USAGE_OVERRIDES.equip_class_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEquipClassCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.EquipClassCode = value;
  }
  /** Retrieve filter for field: EquipClassCode (RATE_USAGE_OVERRIDES.equip_class_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getEquipClassCodeFilter () {
    return this.EquipClassCode;
  }

  /**
   * Retrieves the EquipClassCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EquipClassCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EquipClassCodeFilter field
   */
  public String[] getEquipClassCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEquipClassCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEquipClassCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEquipClassCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EquipClassCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEquipClassCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EquipClassCodeFilter filter value from a formatted string
   *
   * @param _value the EquipClassCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EquipClassCodeFilter filter field
   */
  public void setEquipClassCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEquipClassCodeFilterFromFormattedString");
    try {
      this.setEquipClassCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EquipClassCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEquipClassCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEquipClassCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ClassOfServiceCode (RATE_USAGE_OVERRIDES.class_of_service_code)
   * @param fetch whether to fetch this field or not
   */
  public void setClassOfServiceCodeFetch (boolean fetch) {
    this.ClassOfServiceCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ClassOfServiceCode (RATE_USAGE_OVERRIDES.class_of_service_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getClassOfServiceCodeFetch () {
    return this.ClassOfServiceCodeFetch;
  }
  /** Set the SortOrder for field: ClassOfServiceCode (RATE_USAGE_OVERRIDES.class_of_service_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setClassOfServiceCodeSortOrder (Integer value) {
    this.ClassOfServiceCodeSort = value;
  }
  /** Retrieve SortOrder for field: ClassOfServiceCode (RATE_USAGE_OVERRIDES.class_of_service_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getClassOfServiceCodeSortOrder () {
    return this.ClassOfServiceCodeSort;
  }
  /** Set the sort direction for field: ClassOfServiceCode (RATE_USAGE_OVERRIDES.class_of_service_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setClassOfServiceCodeSortDirection (boolean ascending) {
    this.ClassOfServiceCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ClassOfServiceCode (RATE_USAGE_OVERRIDES.class_of_service_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getClassOfServiceCodeSortDirection () {
    return this.ClassOfServiceCodeSortAscending;
  }
  /** Set the field level filters for field: ClassOfServiceCode (RATE_USAGE_OVERRIDES.class_of_service_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setClassOfServiceCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.ClassOfServiceCode = value;
  }
  /** Retrieve filter for field: ClassOfServiceCode (RATE_USAGE_OVERRIDES.class_of_service_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getClassOfServiceCodeFilter () {
    return this.ClassOfServiceCode;
  }

  /**
   * Retrieves the ClassOfServiceCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ClassOfServiceCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ClassOfServiceCodeFilter field
   */
  public String[] getClassOfServiceCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getClassOfServiceCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getClassOfServiceCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getClassOfServiceCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ClassOfServiceCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getClassOfServiceCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ClassOfServiceCodeFilter filter value from a formatted string
   *
   * @param _value the ClassOfServiceCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ClassOfServiceCodeFilter filter field
   */
  public void setClassOfServiceCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setClassOfServiceCodeFilterFromFormattedString");
    try {
      this.setClassOfServiceCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ClassOfServiceCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setClassOfServiceCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setClassOfServiceCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ProviderClass (RATE_USAGE_OVERRIDES.provider_class)
   * @param fetch whether to fetch this field or not
   */
  public void setProviderClassFetch (boolean fetch) {
    this.ProviderClassFetch = fetch;
  }
  /** Retrieve Fetch value for field: ProviderClass (RATE_USAGE_OVERRIDES.provider_class)
   * @return boolean the Fetch value for this field
   */
  public boolean getProviderClassFetch () {
    return this.ProviderClassFetch;
  }
  /** Set the SortOrder for field: ProviderClass (RATE_USAGE_OVERRIDES.provider_class)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setProviderClassSortOrder (Integer value) {
    this.ProviderClassSort = value;
  }
  /** Retrieve SortOrder for field: ProviderClass (RATE_USAGE_OVERRIDES.provider_class)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getProviderClassSortOrder () {
    return this.ProviderClassSort;
  }
  /** Set the sort direction for field: ProviderClass (RATE_USAGE_OVERRIDES.provider_class)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setProviderClassSortDirection (boolean ascending) {
    this.ProviderClassSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ProviderClass (RATE_USAGE_OVERRIDES.provider_class)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getProviderClassSortDirection () {
    return this.ProviderClassSortAscending;
  }
  /** Set the field level filters for field: ProviderClass (RATE_USAGE_OVERRIDES.provider_class)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setProviderClassFilter (IntegerFilter[] value) throws ServiceException {
    this.ProviderClass = value;
  }
  /** Retrieve filter for field: ProviderClass (RATE_USAGE_OVERRIDES.provider_class)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getProviderClassFilter () {
    return this.ProviderClass;
  }

  /**
   * Retrieves the ProviderClassFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ProviderClassFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProviderClassFilter field
   */
  public String[] getProviderClassFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProviderClassFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getProviderClassFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProviderClassFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProviderClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getProviderClassFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ProviderClassFilter filter value from a formatted string
   *
   * @param _value the ProviderClassFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ProviderClassFilter filter field
   */
  public void setProviderClassFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setProviderClassFilterFromFormattedString");
    try {
      this.setProviderClassFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProviderClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setProviderClassFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProviderClassFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillClass (RATE_USAGE_OVERRIDES.bill_class)
   * @param fetch whether to fetch this field or not
   */
  public void setBillClassFetch (boolean fetch) {
    this.BillClassFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillClass (RATE_USAGE_OVERRIDES.bill_class)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillClassFetch () {
    return this.BillClassFetch;
  }
  /** Set the SortOrder for field: BillClass (RATE_USAGE_OVERRIDES.bill_class)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillClassSortOrder (Integer value) {
    this.BillClassSort = value;
  }
  /** Retrieve SortOrder for field: BillClass (RATE_USAGE_OVERRIDES.bill_class)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillClassSortOrder () {
    return this.BillClassSort;
  }
  /** Set the sort direction for field: BillClass (RATE_USAGE_OVERRIDES.bill_class)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillClassSortDirection (boolean ascending) {
    this.BillClassSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillClass (RATE_USAGE_OVERRIDES.bill_class)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillClassSortDirection () {
    return this.BillClassSortAscending;
  }
  /** Set the field level filters for field: BillClass (RATE_USAGE_OVERRIDES.bill_class)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillClassFilter (IntegerFilter[] value) throws ServiceException {
    this.BillClass = value;
  }
  /** Retrieve filter for field: BillClass (RATE_USAGE_OVERRIDES.bill_class)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillClassFilter () {
    return this.BillClass;
  }

  /**
   * Retrieves the BillClassFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillClassFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillClassFilter field
   */
  public String[] getBillClassFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillClassFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillClassFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillClassFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillClassFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillClassFilter filter value from a formatted string
   *
   * @param _value the BillClassFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillClassFilter filter field
   */
  public void setBillClassFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillClassFilterFromFormattedString");
    try {
      this.setBillClassFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillClassFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillClassFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Jurisdiction (RATE_USAGE_OVERRIDES.jurisdiction)
   * @param fetch whether to fetch this field or not
   */
  public void setJurisdictionFetch (boolean fetch) {
    this.JurisdictionFetch = fetch;
  }
  /** Retrieve Fetch value for field: Jurisdiction (RATE_USAGE_OVERRIDES.jurisdiction)
   * @return boolean the Fetch value for this field
   */
  public boolean getJurisdictionFetch () {
    return this.JurisdictionFetch;
  }
  /** Set the SortOrder for field: Jurisdiction (RATE_USAGE_OVERRIDES.jurisdiction)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setJurisdictionSortOrder (Integer value) {
    this.JurisdictionSort = value;
  }
  /** Retrieve SortOrder for field: Jurisdiction (RATE_USAGE_OVERRIDES.jurisdiction)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getJurisdictionSortOrder () {
    return this.JurisdictionSort;
  }
  /** Set the sort direction for field: Jurisdiction (RATE_USAGE_OVERRIDES.jurisdiction)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setJurisdictionSortDirection (boolean ascending) {
    this.JurisdictionSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Jurisdiction (RATE_USAGE_OVERRIDES.jurisdiction)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getJurisdictionSortDirection () {
    return this.JurisdictionSortAscending;
  }
  /** Set the field level filters for field: Jurisdiction (RATE_USAGE_OVERRIDES.jurisdiction)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setJurisdictionFilter (IntegerFilter[] value) throws ServiceException {
    this.Jurisdiction = value;
  }
  /** Retrieve filter for field: Jurisdiction (RATE_USAGE_OVERRIDES.jurisdiction)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getJurisdictionFilter () {
    return this.Jurisdiction;
  }

  /**
   * Retrieves the JurisdictionFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The JurisdictionFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the JurisdictionFilter field
   */
  public String[] getJurisdictionFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getJurisdictionFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getJurisdictionFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getJurisdictionFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("JurisdictionFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getJurisdictionFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the JurisdictionFilter filter value from a formatted string
   *
   * @param _value the JurisdictionFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the JurisdictionFilter filter field
   */
  public void setJurisdictionFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setJurisdictionFilterFromFormattedString");
    try {
      this.setJurisdictionFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("JurisdictionFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setJurisdictionFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setJurisdictionFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CurrencyCode (RATE_USAGE_OVERRIDES.currency_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCurrencyCodeFetch (boolean fetch) {
    this.CurrencyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CurrencyCode (RATE_USAGE_OVERRIDES.currency_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCurrencyCodeFetch () {
    return this.CurrencyCodeFetch;
  }
  /** Set the SortOrder for field: CurrencyCode (RATE_USAGE_OVERRIDES.currency_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCurrencyCodeSortOrder (Integer value) {
    this.CurrencyCodeSort = value;
  }
  /** Retrieve SortOrder for field: CurrencyCode (RATE_USAGE_OVERRIDES.currency_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCurrencyCodeSortOrder () {
    return this.CurrencyCodeSort;
  }
  /** Set the sort direction for field: CurrencyCode (RATE_USAGE_OVERRIDES.currency_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCurrencyCodeSortDirection (boolean ascending) {
    this.CurrencyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CurrencyCode (RATE_USAGE_OVERRIDES.currency_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCurrencyCodeSortDirection () {
    return this.CurrencyCodeSortAscending;
  }
  /** Set the field level filters for field: CurrencyCode (RATE_USAGE_OVERRIDES.currency_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCurrencyCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.CurrencyCode = value;
  }
  /** Retrieve filter for field: CurrencyCode (RATE_USAGE_OVERRIDES.currency_code)
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

  /** Set the field level Fetch value for field: RatePeriod (RATE_USAGE_OVERRIDES.rate_period)
   * @param fetch whether to fetch this field or not
   */
  public void setRatePeriodFetch (boolean fetch) {
    this.RatePeriodFetch = fetch;
  }
  /** Retrieve Fetch value for field: RatePeriod (RATE_USAGE_OVERRIDES.rate_period)
   * @return boolean the Fetch value for this field
   */
  public boolean getRatePeriodFetch () {
    return this.RatePeriodFetch;
  }
  /** Set the SortOrder for field: RatePeriod (RATE_USAGE_OVERRIDES.rate_period)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRatePeriodSortOrder (Integer value) {
    this.RatePeriodSort = value;
  }
  /** Retrieve SortOrder for field: RatePeriod (RATE_USAGE_OVERRIDES.rate_period)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRatePeriodSortOrder () {
    return this.RatePeriodSort;
  }
  /** Set the sort direction for field: RatePeriod (RATE_USAGE_OVERRIDES.rate_period)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRatePeriodSortDirection (boolean ascending) {
    this.RatePeriodSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RatePeriod (RATE_USAGE_OVERRIDES.rate_period)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRatePeriodSortDirection () {
    return this.RatePeriodSortAscending;
  }
  /** Set the case insensitive for field: RatePeriod (RATE_USAGE_OVERRIDES.rate_period)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setRatePeriodCaseInsensitive (boolean ascending) {
    this.RatePeriodCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: RatePeriod (RATE_USAGE_OVERRIDES.rate_period)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getRatePeriodCaseInsensitive () {
    return this.RatePeriodCaseInsensitive;
  }
  /** Set the field level filters for field: RatePeriod (RATE_USAGE_OVERRIDES.rate_period)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRatePeriodFilter (StringFilter[] value) throws ServiceException {
    this.RatePeriod = value;
  }
  /** Retrieve filter for field: RatePeriod (RATE_USAGE_OVERRIDES.rate_period)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getRatePeriodFilter () {
    return this.RatePeriod;
  }

  /**
   * Retrieves the RatePeriodFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RatePeriodFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RatePeriodFilter field
   */
  public String[] getRatePeriodFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRatePeriodFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRatePeriodFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRatePeriodFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RatePeriodFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRatePeriodFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RatePeriodFilter filter value from a formatted string
   *
   * @param _value the RatePeriodFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RatePeriodFilter filter field
   */
  public void setRatePeriodFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRatePeriodFilterFromFormattedString");
    try {
      this.setRatePeriodFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RatePeriodFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRatePeriodFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRatePeriodFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IncrementalBands (RATE_USAGE_OVERRIDES.incremental_bands)
   * @param fetch whether to fetch this field or not
   */
  public void setIncrementalBandsFetch (boolean fetch) {
    this.IncrementalBandsFetch = fetch;
  }
  /** Retrieve Fetch value for field: IncrementalBands (RATE_USAGE_OVERRIDES.incremental_bands)
   * @return boolean the Fetch value for this field
   */
  public boolean getIncrementalBandsFetch () {
    return this.IncrementalBandsFetch;
  }
  /** Set the SortOrder for field: IncrementalBands (RATE_USAGE_OVERRIDES.incremental_bands)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIncrementalBandsSortOrder (Integer value) {
    this.IncrementalBandsSort = value;
  }
  /** Retrieve SortOrder for field: IncrementalBands (RATE_USAGE_OVERRIDES.incremental_bands)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIncrementalBandsSortOrder () {
    return this.IncrementalBandsSort;
  }
  /** Set the sort direction for field: IncrementalBands (RATE_USAGE_OVERRIDES.incremental_bands)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIncrementalBandsSortDirection (boolean ascending) {
    this.IncrementalBandsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IncrementalBands (RATE_USAGE_OVERRIDES.incremental_bands)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIncrementalBandsSortDirection () {
    return this.IncrementalBandsSortAscending;
  }
  /** Set the field level filters for field: IncrementalBands (RATE_USAGE_OVERRIDES.incremental_bands)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIncrementalBandsFilter (BooleanFilter[] value) throws ServiceException {
    this.IncrementalBands = value;
  }
  /** Retrieve filter for field: IncrementalBands (RATE_USAGE_OVERRIDES.incremental_bands)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIncrementalBandsFilter () {
    return this.IncrementalBands;
  }

  /**
   * Retrieves the IncrementalBandsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IncrementalBandsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IncrementalBandsFilter field
   */
  public String[] getIncrementalBandsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIncrementalBandsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIncrementalBandsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIncrementalBandsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IncrementalBandsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIncrementalBandsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IncrementalBandsFilter filter value from a formatted string
   *
   * @param _value the IncrementalBandsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IncrementalBandsFilter filter field
   */
  public void setIncrementalBandsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIncrementalBandsFilterFromFormattedString");
    try {
      this.setIncrementalBandsFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IncrementalBandsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIncrementalBandsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIncrementalBandsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: FixedChargeAmt (RATE_USAGE_OVERRIDES.fixed_charge_amt)
   * @param fetch whether to fetch this field or not
   */
  public void setFixedChargeAmtFetch (boolean fetch) {
    this.FixedChargeAmtFetch = fetch;
  }
  /** Retrieve Fetch value for field: FixedChargeAmt (RATE_USAGE_OVERRIDES.fixed_charge_amt)
   * @return boolean the Fetch value for this field
   */
  public boolean getFixedChargeAmtFetch () {
    return this.FixedChargeAmtFetch;
  }
  /** Set the SortOrder for field: FixedChargeAmt (RATE_USAGE_OVERRIDES.fixed_charge_amt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFixedChargeAmtSortOrder (Integer value) {
    this.FixedChargeAmtSort = value;
  }
  /** Retrieve SortOrder for field: FixedChargeAmt (RATE_USAGE_OVERRIDES.fixed_charge_amt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFixedChargeAmtSortOrder () {
    return this.FixedChargeAmtSort;
  }
  /** Set the sort direction for field: FixedChargeAmt (RATE_USAGE_OVERRIDES.fixed_charge_amt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFixedChargeAmtSortDirection (boolean ascending) {
    this.FixedChargeAmtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FixedChargeAmt (RATE_USAGE_OVERRIDES.fixed_charge_amt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFixedChargeAmtSortDirection () {
    return this.FixedChargeAmtSortAscending;
  }
  /** Set the field level filters for field: FixedChargeAmt (RATE_USAGE_OVERRIDES.fixed_charge_amt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFixedChargeAmtFilter (BigIntegerFilter[] value) throws ServiceException {
    this.FixedChargeAmt = value;
  }
  /** Retrieve filter for field: FixedChargeAmt (RATE_USAGE_OVERRIDES.fixed_charge_amt)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getFixedChargeAmtFilter () {
    return this.FixedChargeAmt;
  }

  /**
   * Retrieves the FixedChargeAmtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FixedChargeAmtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FixedChargeAmtFilter field
   */
  public String[] getFixedChargeAmtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFixedChargeAmtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFixedChargeAmtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFixedChargeAmtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FixedChargeAmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFixedChargeAmtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FixedChargeAmtFilter filter value from a formatted string
   *
   * @param _value the FixedChargeAmtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FixedChargeAmtFilter filter field
   */
  public void setFixedChargeAmtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFixedChargeAmtFilterFromFormattedString");
    try {
      this.setFixedChargeAmtFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FixedChargeAmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFixedChargeAmtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFixedChargeAmtFilterFromFormattedString");
  }

  /**
   * Sets the FixedChargeAmtFilter filter value from a formatted string
   *
   * @param _value the FixedChargeAmtFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FixedChargeAmtFilter filter field
   */
  public void setFixedChargeAmtFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFixedChargeAmtFilterFromFormattedCurrencyString");
    try {
      this.setFixedChargeAmtFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FixedChargeAmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFixedChargeAmtFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFixedChargeAmtFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the FixedChargeAmtFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FixedChargeAmtFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the FixedChargeAmtFilter field
   */

  public String[] getFixedChargeAmtFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFixedChargeAmtFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFixedChargeAmtFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFixedChargeAmtFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FixedChargeAmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFixedChargeAmtFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: AddFixedAmt (RATE_USAGE_OVERRIDES.add_fixed_amt)
   * @param fetch whether to fetch this field or not
   */
  public void setAddFixedAmtFetch (boolean fetch) {
    this.AddFixedAmtFetch = fetch;
  }
  /** Retrieve Fetch value for field: AddFixedAmt (RATE_USAGE_OVERRIDES.add_fixed_amt)
   * @return boolean the Fetch value for this field
   */
  public boolean getAddFixedAmtFetch () {
    return this.AddFixedAmtFetch;
  }
  /** Set the SortOrder for field: AddFixedAmt (RATE_USAGE_OVERRIDES.add_fixed_amt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAddFixedAmtSortOrder (Integer value) {
    this.AddFixedAmtSort = value;
  }
  /** Retrieve SortOrder for field: AddFixedAmt (RATE_USAGE_OVERRIDES.add_fixed_amt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAddFixedAmtSortOrder () {
    return this.AddFixedAmtSort;
  }
  /** Set the sort direction for field: AddFixedAmt (RATE_USAGE_OVERRIDES.add_fixed_amt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAddFixedAmtSortDirection (boolean ascending) {
    this.AddFixedAmtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AddFixedAmt (RATE_USAGE_OVERRIDES.add_fixed_amt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAddFixedAmtSortDirection () {
    return this.AddFixedAmtSortAscending;
  }
  /** Set the field level filters for field: AddFixedAmt (RATE_USAGE_OVERRIDES.add_fixed_amt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAddFixedAmtFilter (IntegerFilter[] value) throws ServiceException {
    this.AddFixedAmt = value;
  }
  /** Retrieve filter for field: AddFixedAmt (RATE_USAGE_OVERRIDES.add_fixed_amt)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAddFixedAmtFilter () {
    return this.AddFixedAmt;
  }

  /**
   * Retrieves the AddFixedAmtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AddFixedAmtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AddFixedAmtFilter field
   */
  public String[] getAddFixedAmtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAddFixedAmtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAddFixedAmtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAddFixedAmtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AddFixedAmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAddFixedAmtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AddFixedAmtFilter filter value from a formatted string
   *
   * @param _value the AddFixedAmtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AddFixedAmtFilter filter field
   */
  public void setAddFixedAmtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAddFixedAmtFilterFromFormattedString");
    try {
      this.setAddFixedAmtFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AddFixedAmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAddFixedAmtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAddFixedAmtFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AddUnitRate (RATE_USAGE_OVERRIDES.add_unit_rate)
   * @param fetch whether to fetch this field or not
   */
  public void setAddUnitRateFetch (boolean fetch) {
    this.AddUnitRateFetch = fetch;
  }
  /** Retrieve Fetch value for field: AddUnitRate (RATE_USAGE_OVERRIDES.add_unit_rate)
   * @return boolean the Fetch value for this field
   */
  public boolean getAddUnitRateFetch () {
    return this.AddUnitRateFetch;
  }
  /** Set the SortOrder for field: AddUnitRate (RATE_USAGE_OVERRIDES.add_unit_rate)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAddUnitRateSortOrder (Integer value) {
    this.AddUnitRateSort = value;
  }
  /** Retrieve SortOrder for field: AddUnitRate (RATE_USAGE_OVERRIDES.add_unit_rate)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAddUnitRateSortOrder () {
    return this.AddUnitRateSort;
  }
  /** Set the sort direction for field: AddUnitRate (RATE_USAGE_OVERRIDES.add_unit_rate)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAddUnitRateSortDirection (boolean ascending) {
    this.AddUnitRateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AddUnitRate (RATE_USAGE_OVERRIDES.add_unit_rate)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAddUnitRateSortDirection () {
    return this.AddUnitRateSortAscending;
  }
  /** Set the field level filters for field: AddUnitRate (RATE_USAGE_OVERRIDES.add_unit_rate)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAddUnitRateFilter (IntegerFilter[] value) throws ServiceException {
    this.AddUnitRate = value;
  }
  /** Retrieve filter for field: AddUnitRate (RATE_USAGE_OVERRIDES.add_unit_rate)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAddUnitRateFilter () {
    return this.AddUnitRate;
  }

  /**
   * Retrieves the AddUnitRateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AddUnitRateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AddUnitRateFilter field
   */
  public String[] getAddUnitRateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAddUnitRateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAddUnitRateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAddUnitRateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AddUnitRateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAddUnitRateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AddUnitRateFilter filter value from a formatted string
   *
   * @param _value the AddUnitRateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AddUnitRateFilter filter field
   */
  public void setAddUnitRateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAddUnitRateFilterFromFormattedString");
    try {
      this.setAddUnitRateFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AddUnitRateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAddUnitRateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAddUnitRateFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ActiveDt (RATE_USAGE_OVERRIDES.active_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setActiveDtFetch (boolean fetch) {
    this.ActiveDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: ActiveDt (RATE_USAGE_OVERRIDES.active_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getActiveDtFetch () {
    return this.ActiveDtFetch;
  }
  /** Set the SortOrder for field: ActiveDt (RATE_USAGE_OVERRIDES.active_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setActiveDtSortOrder (Integer value) {
    this.ActiveDtSort = value;
  }
  /** Retrieve SortOrder for field: ActiveDt (RATE_USAGE_OVERRIDES.active_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getActiveDtSortOrder () {
    return this.ActiveDtSort;
  }
  /** Set the sort direction for field: ActiveDt (RATE_USAGE_OVERRIDES.active_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setActiveDtSortDirection (boolean ascending) {
    this.ActiveDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ActiveDt (RATE_USAGE_OVERRIDES.active_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getActiveDtSortDirection () {
    return this.ActiveDtSortAscending;
  }
  /** Set the field level filters for field: ActiveDt (RATE_USAGE_OVERRIDES.active_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setActiveDtFilter (DateFilter[] value) throws ServiceException {
    this.ActiveDt = value;
  }
  /** Retrieve filter for field: ActiveDt (RATE_USAGE_OVERRIDES.active_dt)
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


  /** Set the field level Fetch value for field: InactiveDt (RATE_USAGE_OVERRIDES.inactive_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setInactiveDtFetch (boolean fetch) {
    this.InactiveDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: InactiveDt (RATE_USAGE_OVERRIDES.inactive_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getInactiveDtFetch () {
    return this.InactiveDtFetch;
  }
  /** Set the SortOrder for field: InactiveDt (RATE_USAGE_OVERRIDES.inactive_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInactiveDtSortOrder (Integer value) {
    this.InactiveDtSort = value;
  }
  /** Retrieve SortOrder for field: InactiveDt (RATE_USAGE_OVERRIDES.inactive_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInactiveDtSortOrder () {
    return this.InactiveDtSort;
  }
  /** Set the sort direction for field: InactiveDt (RATE_USAGE_OVERRIDES.inactive_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInactiveDtSortDirection (boolean ascending) {
    this.InactiveDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InactiveDt (RATE_USAGE_OVERRIDES.inactive_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInactiveDtSortDirection () {
    return this.InactiveDtSortAscending;
  }
  /** Set the field level filters for field: InactiveDt (RATE_USAGE_OVERRIDES.inactive_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInactiveDtFilter (DateFilter[] value) throws ServiceException {
    this.InactiveDt = value;
  }
  /** Retrieve filter for field: InactiveDt (RATE_USAGE_OVERRIDES.inactive_dt)
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


  /** Set the field level Fetch value for field: CreateDt (RATE_USAGE_OVERRIDES.create_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setCreateDtFetch (boolean fetch) {
    this.CreateDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: CreateDt (RATE_USAGE_OVERRIDES.create_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getCreateDtFetch () {
    return this.CreateDtFetch;
  }
  /** Set the SortOrder for field: CreateDt (RATE_USAGE_OVERRIDES.create_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCreateDtSortOrder (Integer value) {
    this.CreateDtSort = value;
  }
  /** Retrieve SortOrder for field: CreateDt (RATE_USAGE_OVERRIDES.create_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCreateDtSortOrder () {
    return this.CreateDtSort;
  }
  /** Set the sort direction for field: CreateDt (RATE_USAGE_OVERRIDES.create_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCreateDtSortDirection (boolean ascending) {
    this.CreateDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CreateDt (RATE_USAGE_OVERRIDES.create_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCreateDtSortDirection () {
    return this.CreateDtSortAscending;
  }
  /** Set the field level filters for field: CreateDt (RATE_USAGE_OVERRIDES.create_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCreateDtFilter (DateFilter[] value) throws ServiceException {
    this.CreateDt = value;
  }
  /** Retrieve filter for field: CreateDt (RATE_USAGE_OVERRIDES.create_dt)
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


  /** Set the field level Fetch value for field: ChgDt (RATE_USAGE_OVERRIDES.chg_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setChgDtFetch (boolean fetch) {
    this.ChgDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgDt (RATE_USAGE_OVERRIDES.chg_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgDtFetch () {
    return this.ChgDtFetch;
  }
  /** Set the SortOrder for field: ChgDt (RATE_USAGE_OVERRIDES.chg_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgDtSortOrder (Integer value) {
    this.ChgDtSort = value;
  }
  /** Retrieve SortOrder for field: ChgDt (RATE_USAGE_OVERRIDES.chg_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgDtSortOrder () {
    return this.ChgDtSort;
  }
  /** Set the sort direction for field: ChgDt (RATE_USAGE_OVERRIDES.chg_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgDtSortDirection (boolean ascending) {
    this.ChgDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgDt (RATE_USAGE_OVERRIDES.chg_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgDtSortDirection () {
    return this.ChgDtSortAscending;
  }
  /** Set the field level filters for field: ChgDt (RATE_USAGE_OVERRIDES.chg_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgDtFilter (DateFilter[] value) throws ServiceException {
    this.ChgDt = value;
  }
  /** Retrieve filter for field: ChgDt (RATE_USAGE_OVERRIDES.chg_dt)
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


  /** Set the field level Fetch value for field: ChgWho (RATE_USAGE_OVERRIDES.chg_who)
   * @param fetch whether to fetch this field or not
   */
  public void setChgWhoFetch (boolean fetch) {
    this.ChgWhoFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgWho (RATE_USAGE_OVERRIDES.chg_who)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgWhoFetch () {
    return this.ChgWhoFetch;
  }
  /** Set the SortOrder for field: ChgWho (RATE_USAGE_OVERRIDES.chg_who)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgWhoSortOrder (Integer value) {
    this.ChgWhoSort = value;
  }
  /** Retrieve SortOrder for field: ChgWho (RATE_USAGE_OVERRIDES.chg_who)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgWhoSortOrder () {
    return this.ChgWhoSort;
  }
  /** Set the sort direction for field: ChgWho (RATE_USAGE_OVERRIDES.chg_who)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgWhoSortDirection (boolean ascending) {
    this.ChgWhoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgWho (RATE_USAGE_OVERRIDES.chg_who)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgWhoSortDirection () {
    return this.ChgWhoSortAscending;
  }
  /** Set the case insensitive for field: ChgWho (RATE_USAGE_OVERRIDES.chg_who)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setChgWhoCaseInsensitive (boolean ascending) {
    this.ChgWhoCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ChgWho (RATE_USAGE_OVERRIDES.chg_who)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getChgWhoCaseInsensitive () {
    return this.ChgWhoCaseInsensitive;
  }
  /** Set the field level filters for field: ChgWho (RATE_USAGE_OVERRIDES.chg_who)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgWhoFilter (StringFilter[] value) throws ServiceException {
    this.ChgWho = value;
  }
  /** Retrieve filter for field: ChgWho (RATE_USAGE_OVERRIDES.chg_who)
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

  /** Set the field level Fetch value for field: RateUnitsType (RATE_USAGE_OVERRIDES.rate_units_type)
   * @param fetch whether to fetch this field or not
   */
  public void setRateUnitsTypeFetch (boolean fetch) {
    this.RateUnitsTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: RateUnitsType (RATE_USAGE_OVERRIDES.rate_units_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getRateUnitsTypeFetch () {
    return this.RateUnitsTypeFetch;
  }
  /** Set the SortOrder for field: RateUnitsType (RATE_USAGE_OVERRIDES.rate_units_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRateUnitsTypeSortOrder (Integer value) {
    this.RateUnitsTypeSort = value;
  }
  /** Retrieve SortOrder for field: RateUnitsType (RATE_USAGE_OVERRIDES.rate_units_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRateUnitsTypeSortOrder () {
    return this.RateUnitsTypeSort;
  }
  /** Set the sort direction for field: RateUnitsType (RATE_USAGE_OVERRIDES.rate_units_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRateUnitsTypeSortDirection (boolean ascending) {
    this.RateUnitsTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RateUnitsType (RATE_USAGE_OVERRIDES.rate_units_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRateUnitsTypeSortDirection () {
    return this.RateUnitsTypeSortAscending;
  }
  /** Set the field level filters for field: RateUnitsType (RATE_USAGE_OVERRIDES.rate_units_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRateUnitsTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.RateUnitsType = value;
  }
  /** Retrieve filter for field: RateUnitsType (RATE_USAGE_OVERRIDES.rate_units_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRateUnitsTypeFilter () {
    return this.RateUnitsType;
  }

  /**
   * Retrieves the RateUnitsTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RateUnitsTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateUnitsTypeFilter field
   */
  public String[] getRateUnitsTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateUnitsTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRateUnitsTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateUnitsTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateUnitsTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateUnitsTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RateUnitsTypeFilter filter value from a formatted string
   *
   * @param _value the RateUnitsTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RateUnitsTypeFilter filter field
   */
  public void setRateUnitsTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRateUnitsTypeFilterFromFormattedString");
    try {
      this.setRateUnitsTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateUnitsTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateUnitsTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateUnitsTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DistanceBandId (RATE_USAGE_OVERRIDES.distance_band_id)
   * @param fetch whether to fetch this field or not
   */
  public void setDistanceBandIdFetch (boolean fetch) {
    this.DistanceBandIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: DistanceBandId (RATE_USAGE_OVERRIDES.distance_band_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getDistanceBandIdFetch () {
    return this.DistanceBandIdFetch;
  }
  /** Set the SortOrder for field: DistanceBandId (RATE_USAGE_OVERRIDES.distance_band_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDistanceBandIdSortOrder (Integer value) {
    this.DistanceBandIdSort = value;
  }
  /** Retrieve SortOrder for field: DistanceBandId (RATE_USAGE_OVERRIDES.distance_band_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDistanceBandIdSortOrder () {
    return this.DistanceBandIdSort;
  }
  /** Set the sort direction for field: DistanceBandId (RATE_USAGE_OVERRIDES.distance_band_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDistanceBandIdSortDirection (boolean ascending) {
    this.DistanceBandIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DistanceBandId (RATE_USAGE_OVERRIDES.distance_band_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDistanceBandIdSortDirection () {
    return this.DistanceBandIdSortAscending;
  }
  /** Set the field level filters for field: DistanceBandId (RATE_USAGE_OVERRIDES.distance_band_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDistanceBandIdFilter (IntegerFilter[] value) throws ServiceException {
    this.DistanceBandId = value;
  }
  /** Retrieve filter for field: DistanceBandId (RATE_USAGE_OVERRIDES.distance_band_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDistanceBandIdFilter () {
    return this.DistanceBandId;
  }

  /**
   * Retrieves the DistanceBandIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DistanceBandIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DistanceBandIdFilter field
   */
  public String[] getDistanceBandIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDistanceBandIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDistanceBandIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDistanceBandIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DistanceBandIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDistanceBandIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DistanceBandIdFilter filter value from a formatted string
   *
   * @param _value the DistanceBandIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DistanceBandIdFilter filter field
   */
  public void setDistanceBandIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDistanceBandIdFilterFromFormattedString");
    try {
      this.setDistanceBandIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DistanceBandIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDistanceBandIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDistanceBandIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AddImpliedDecimal (RATE_USAGE_OVERRIDES.add_implied_decimal)
   * @param fetch whether to fetch this field or not
   */
  public void setAddImpliedDecimalFetch (boolean fetch) {
    this.AddImpliedDecimalFetch = fetch;
  }
  /** Retrieve Fetch value for field: AddImpliedDecimal (RATE_USAGE_OVERRIDES.add_implied_decimal)
   * @return boolean the Fetch value for this field
   */
  public boolean getAddImpliedDecimalFetch () {
    return this.AddImpliedDecimalFetch;
  }
  /** Set the SortOrder for field: AddImpliedDecimal (RATE_USAGE_OVERRIDES.add_implied_decimal)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAddImpliedDecimalSortOrder (Integer value) {
    this.AddImpliedDecimalSort = value;
  }
  /** Retrieve SortOrder for field: AddImpliedDecimal (RATE_USAGE_OVERRIDES.add_implied_decimal)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAddImpliedDecimalSortOrder () {
    return this.AddImpliedDecimalSort;
  }
  /** Set the sort direction for field: AddImpliedDecimal (RATE_USAGE_OVERRIDES.add_implied_decimal)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAddImpliedDecimalSortDirection (boolean ascending) {
    this.AddImpliedDecimalSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AddImpliedDecimal (RATE_USAGE_OVERRIDES.add_implied_decimal)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAddImpliedDecimalSortDirection () {
    return this.AddImpliedDecimalSortAscending;
  }
  /** Set the field level filters for field: AddImpliedDecimal (RATE_USAGE_OVERRIDES.add_implied_decimal)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAddImpliedDecimalFilter (IntegerFilter[] value) throws ServiceException {
    this.AddImpliedDecimal = value;
  }
  /** Retrieve filter for field: AddImpliedDecimal (RATE_USAGE_OVERRIDES.add_implied_decimal)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAddImpliedDecimalFilter () {
    return this.AddImpliedDecimal;
  }

  /**
   * Retrieves the AddImpliedDecimalFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AddImpliedDecimalFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AddImpliedDecimalFilter field
   */
  public String[] getAddImpliedDecimalFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAddImpliedDecimalFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAddImpliedDecimalFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAddImpliedDecimalFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AddImpliedDecimalFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAddImpliedDecimalFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AddImpliedDecimalFilter filter value from a formatted string
   *
   * @param _value the AddImpliedDecimalFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AddImpliedDecimalFilter filter field
   */
  public void setAddImpliedDecimalFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAddImpliedDecimalFilterFromFormattedString");
    try {
      this.setAddImpliedDecimalFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AddImpliedDecimalFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAddImpliedDecimalFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAddImpliedDecimalFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ComponentId (RATE_USAGE_OVERRIDES.component_id)
   * @param fetch whether to fetch this field or not
   */
  public void setComponentIdFetch (boolean fetch) {
    this.ComponentIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ComponentId (RATE_USAGE_OVERRIDES.component_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getComponentIdFetch () {
    return this.ComponentIdFetch;
  }
  /** Set the SortOrder for field: ComponentId (RATE_USAGE_OVERRIDES.component_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setComponentIdSortOrder (Integer value) {
    this.ComponentIdSort = value;
  }
  /** Retrieve SortOrder for field: ComponentId (RATE_USAGE_OVERRIDES.component_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getComponentIdSortOrder () {
    return this.ComponentIdSort;
  }
  /** Set the sort direction for field: ComponentId (RATE_USAGE_OVERRIDES.component_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setComponentIdSortDirection (boolean ascending) {
    this.ComponentIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ComponentId (RATE_USAGE_OVERRIDES.component_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getComponentIdSortDirection () {
    return this.ComponentIdSortAscending;
  }
  /** Set the field level filters for field: ComponentId (RATE_USAGE_OVERRIDES.component_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setComponentIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ComponentId = value;
  }
  /** Retrieve filter for field: ComponentId (RATE_USAGE_OVERRIDES.component_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getComponentIdFilter () {
    return this.ComponentId;
  }

  /**
   * Retrieves the ComponentIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ComponentIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ComponentIdFilter field
   */
  public String[] getComponentIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getComponentIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getComponentIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getComponentIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ComponentIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getComponentIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ComponentIdFilter filter value from a formatted string
   *
   * @param _value the ComponentIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ComponentIdFilter filter field
   */
  public void setComponentIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setComponentIdFilterFromFormattedString");
    try {
      this.setComponentIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ComponentIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setComponentIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setComponentIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillingUnitsType (RATE_USAGE_OVERRIDES.billing_units_type)
   * @param fetch whether to fetch this field or not
   */
  public void setBillingUnitsTypeFetch (boolean fetch) {
    this.BillingUnitsTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillingUnitsType (RATE_USAGE_OVERRIDES.billing_units_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillingUnitsTypeFetch () {
    return this.BillingUnitsTypeFetch;
  }
  /** Set the SortOrder for field: BillingUnitsType (RATE_USAGE_OVERRIDES.billing_units_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillingUnitsTypeSortOrder (Integer value) {
    this.BillingUnitsTypeSort = value;
  }
  /** Retrieve SortOrder for field: BillingUnitsType (RATE_USAGE_OVERRIDES.billing_units_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillingUnitsTypeSortOrder () {
    return this.BillingUnitsTypeSort;
  }
  /** Set the sort direction for field: BillingUnitsType (RATE_USAGE_OVERRIDES.billing_units_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillingUnitsTypeSortDirection (boolean ascending) {
    this.BillingUnitsTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillingUnitsType (RATE_USAGE_OVERRIDES.billing_units_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillingUnitsTypeSortDirection () {
    return this.BillingUnitsTypeSortAscending;
  }
  /** Set the field level filters for field: BillingUnitsType (RATE_USAGE_OVERRIDES.billing_units_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillingUnitsTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.BillingUnitsType = value;
  }
  /** Retrieve filter for field: BillingUnitsType (RATE_USAGE_OVERRIDES.billing_units_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillingUnitsTypeFilter () {
    return this.BillingUnitsType;
  }

  /**
   * Retrieves the BillingUnitsTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillingUnitsTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillingUnitsTypeFilter field
   */
  public String[] getBillingUnitsTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillingUnitsTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillingUnitsTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillingUnitsTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillingUnitsTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillingUnitsTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillingUnitsTypeFilter filter value from a formatted string
   *
   * @param _value the BillingUnitsTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillingUnitsTypeFilter filter field
   */
  public void setBillingUnitsTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillingUnitsTypeFilterFromFormattedString");
    try {
      this.setBillingUnitsTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillingUnitsTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillingUnitsTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillingUnitsTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ConfigTagId (RATE_USAGE_OVERRIDES.config_tag_id)
   * @param fetch whether to fetch this field or not
   */
  public void setConfigTagIdFetch (boolean fetch) {
    this.ConfigTagIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ConfigTagId (RATE_USAGE_OVERRIDES.config_tag_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getConfigTagIdFetch () {
    return this.ConfigTagIdFetch;
  }
  /** Set the SortOrder for field: ConfigTagId (RATE_USAGE_OVERRIDES.config_tag_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setConfigTagIdSortOrder (Integer value) {
    this.ConfigTagIdSort = value;
  }
  /** Retrieve SortOrder for field: ConfigTagId (RATE_USAGE_OVERRIDES.config_tag_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getConfigTagIdSortOrder () {
    return this.ConfigTagIdSort;
  }
  /** Set the sort direction for field: ConfigTagId (RATE_USAGE_OVERRIDES.config_tag_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setConfigTagIdSortDirection (boolean ascending) {
    this.ConfigTagIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ConfigTagId (RATE_USAGE_OVERRIDES.config_tag_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getConfigTagIdSortDirection () {
    return this.ConfigTagIdSortAscending;
  }
  /** Set the case insensitive for field: ConfigTagId (RATE_USAGE_OVERRIDES.config_tag_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setConfigTagIdCaseInsensitive (boolean ascending) {
    this.ConfigTagIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ConfigTagId (RATE_USAGE_OVERRIDES.config_tag_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getConfigTagIdCaseInsensitive () {
    return this.ConfigTagIdCaseInsensitive;
  }
  /** Set the field level filters for field: ConfigTagId (RATE_USAGE_OVERRIDES.config_tag_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setConfigTagIdFilter (StringFilter[] value) throws ServiceException {
    this.ConfigTagId = value;
  }
  /** Retrieve filter for field: ConfigTagId (RATE_USAGE_OVERRIDES.config_tag_id)
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
    return CROObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return CROObjectHelper.toMap(this, null);
  }
}
