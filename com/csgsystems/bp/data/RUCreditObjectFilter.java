/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: RUCreditObjectFilter.java
 * Definition File: Customer/UsageCreditRate.xml
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
public class RUCreditObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public RUCreditObjectKeyFilter Key = null;
  /** raw field for: RATE_UNIT_CR.units_free) */
  public    BigIntegerFilter[] UnitsFree  = null;
  protected boolean UnitsFreeFetch = false;
  protected boolean UnitsFreeSortAscending = true;
  protected Integer UnitsFreeSort = null;
  /** raw field for: RATE_UNIT_CR.amount_free) */
  public    BigIntegerFilter[] AmountFree  = null;
  protected boolean AmountFreeFetch = false;
  protected boolean AmountFreeSortAscending = true;
  protected Integer AmountFreeSort = null;
  /** raw field for: RATE_UNIT_CR.date_inactive) */
  public    DateFilter[] DateInactive  = null;
  protected boolean DateInactiveFetch = false;
  protected boolean DateInactiveSortAscending = true;
  protected Integer DateInactiveSort = null;
  /** raw field for: RATE_UNIT_CR.range_terminus) */
  public    BigIntegerFilter[] RangeTerminus  = null;
  protected boolean RangeTerminusFetch = false;
  protected boolean RangeTerminusSortAscending = true;
  protected Integer RangeTerminusSort = null;
  private String _objName = "RUCreditObjectFilter";
  /** default constructor */
  public RUCreditObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public RUCreditObjectFilter (RUCreditObjectFilter other)
  {
    if (other == null) return;
    this.Key = new RUCreditObjectKeyFilter (other.Key);
    this.UnitsFree = other.UnitsFree;
    this.UnitsFreeFetch = other.UnitsFreeFetch;
    this.UnitsFreeSort = other.UnitsFreeSort;
    this.UnitsFreeSortAscending = other.UnitsFreeSortAscending;
    this.AmountFree = other.AmountFree;
    this.AmountFreeFetch = other.AmountFreeFetch;
    this.AmountFreeSort = other.AmountFreeSort;
    this.AmountFreeSortAscending = other.AmountFreeSortAscending;
    this.DateInactive = other.DateInactive;
    this.DateInactiveFetch = other.DateInactiveFetch;
    this.DateInactiveSort = other.DateInactiveSort;
    this.DateInactiveSortAscending = other.DateInactiveSortAscending;
    this.RangeTerminus = other.RangeTerminus;
    this.RangeTerminusFetch = other.RangeTerminusFetch;
    this.RangeTerminusSort = other.RangeTerminusSort;
    this.RangeTerminusSortAscending = other.RangeTerminusSortAscending;  }
  /** get the filter for this object's key
   * @return RUCreditObjectKeyFilter
   */
  public RUCreditObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (RUCreditObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: UnitCrId (RATE_UNIT_CR.unit_cr_id)
   * @param fetch whether to fetch this field or not
   */
  public void setUnitCrIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new RUCreditObjectKeyFilter ();
    this.Key.UnitCrIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: UnitCrId (RATE_UNIT_CR.unit_cr_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getUnitCrIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.UnitCrIdFetch;
  }
  /** Set the SortOrder for field: UnitCrId (RATE_UNIT_CR.unit_cr_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUnitCrIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new RUCreditObjectKeyFilter ();
    this.Key.UnitCrIdSort = value;
  }
  /** Retrieve SortOrder for field: UnitCrId (RATE_UNIT_CR.unit_cr_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUnitCrIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.UnitCrIdSort;
  }
  /** Set the sort direction for field: UnitCrId (RATE_UNIT_CR.unit_cr_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUnitCrIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new RUCreditObjectKeyFilter ();
    this.Key.UnitCrIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UnitCrId (RATE_UNIT_CR.unit_cr_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUnitCrIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.UnitCrIdSortAscending;
  }
  /** Set the field level filters for field: UnitCrId (RATE_UNIT_CR.unit_cr_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUnitCrIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new RUCreditObjectKeyFilter ();
    this.Key.UnitCrId = value;
  }
  /** Retrieve filter for field: UnitCrId (RATE_UNIT_CR.unit_cr_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getUnitCrIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.UnitCrId;
  }
  /** Set the field level Fetch value for field: RateClass (RATE_UNIT_CR.rate_class)
   * @param fetch whether to fetch this field or not
   */
  public void setRateClassFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new RUCreditObjectKeyFilter ();
    this.Key.RateClassFetch = fetch;
  }
  /** Retrieve Fetch value for field: RateClass (RATE_UNIT_CR.rate_class)
   * @return boolean the Fetch value for this field
   */
  public boolean getRateClassFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.RateClassFetch;
  }
  /** Set the SortOrder for field: RateClass (RATE_UNIT_CR.rate_class)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRateClassSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new RUCreditObjectKeyFilter ();
    this.Key.RateClassSort = value;
  }
  /** Retrieve SortOrder for field: RateClass (RATE_UNIT_CR.rate_class)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRateClassSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.RateClassSort;
  }
  /** Set the sort direction for field: RateClass (RATE_UNIT_CR.rate_class)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRateClassSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new RUCreditObjectKeyFilter ();
    this.Key.RateClassSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RateClass (RATE_UNIT_CR.rate_class)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRateClassSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.RateClassSortAscending;
  }
  /** Set the field level filters for field: RateClass (RATE_UNIT_CR.rate_class)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRateClassFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new RUCreditObjectKeyFilter ();
    this.Key.RateClass = value;
  }
  /** Retrieve filter for field: RateClass (RATE_UNIT_CR.rate_class)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRateClassFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.RateClass;
  }
  /** Set the field level Fetch value for field: CurrencyCode (RATE_UNIT_CR.currency_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCurrencyCodeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new RUCreditObjectKeyFilter ();
    this.Key.CurrencyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CurrencyCode (RATE_UNIT_CR.currency_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCurrencyCodeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.CurrencyCodeFetch;
  }
  /** Set the SortOrder for field: CurrencyCode (RATE_UNIT_CR.currency_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCurrencyCodeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new RUCreditObjectKeyFilter ();
    this.Key.CurrencyCodeSort = value;
  }
  /** Retrieve SortOrder for field: CurrencyCode (RATE_UNIT_CR.currency_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCurrencyCodeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.CurrencyCodeSort;
  }
  /** Set the sort direction for field: CurrencyCode (RATE_UNIT_CR.currency_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCurrencyCodeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new RUCreditObjectKeyFilter ();
    this.Key.CurrencyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CurrencyCode (RATE_UNIT_CR.currency_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCurrencyCodeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.CurrencyCodeSortAscending;
  }
  /** Set the field level filters for field: CurrencyCode (RATE_UNIT_CR.currency_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCurrencyCodeFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new RUCreditObjectKeyFilter ();
    this.Key.CurrencyCode = value;
  }
  /** Retrieve filter for field: CurrencyCode (RATE_UNIT_CR.currency_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCurrencyCodeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.CurrencyCode;
  }
  /** Set the field level Fetch value for field: BillingFrequency (RATE_UNIT_CR.billing_frequency)
   * @param fetch whether to fetch this field or not
   */
  public void setBillingFrequencyFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new RUCreditObjectKeyFilter ();
    this.Key.BillingFrequencyFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillingFrequency (RATE_UNIT_CR.billing_frequency)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillingFrequencyFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.BillingFrequencyFetch;
  }
  /** Set the SortOrder for field: BillingFrequency (RATE_UNIT_CR.billing_frequency)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillingFrequencySortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new RUCreditObjectKeyFilter ();
    this.Key.BillingFrequencySort = value;
  }
  /** Retrieve SortOrder for field: BillingFrequency (RATE_UNIT_CR.billing_frequency)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillingFrequencySortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.BillingFrequencySort;
  }
  /** Set the sort direction for field: BillingFrequency (RATE_UNIT_CR.billing_frequency)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillingFrequencySortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new RUCreditObjectKeyFilter ();
    this.Key.BillingFrequencySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillingFrequency (RATE_UNIT_CR.billing_frequency)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillingFrequencySortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.BillingFrequencySortAscending;
  }
  /** Set the field level filters for field: BillingFrequency (RATE_UNIT_CR.billing_frequency)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillingFrequencyFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new RUCreditObjectKeyFilter ();
    this.Key.BillingFrequency = value;
  }
  /** Retrieve filter for field: BillingFrequency (RATE_UNIT_CR.billing_frequency)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillingFrequencyFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.BillingFrequency;
  }
  /** Set the field level Fetch value for field: DateActive (RATE_UNIT_CR.date_active)
   * @param fetch whether to fetch this field or not
   */
  public void setDateActiveFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new RUCreditObjectKeyFilter ();
    this.Key.DateActiveFetch = fetch;
  }
  /** Retrieve Fetch value for field: DateActive (RATE_UNIT_CR.date_active)
   * @return boolean the Fetch value for this field
   */
  public boolean getDateActiveFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.DateActiveFetch;
  }
  /** Set the SortOrder for field: DateActive (RATE_UNIT_CR.date_active)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDateActiveSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new RUCreditObjectKeyFilter ();
    this.Key.DateActiveSort = value;
  }
  /** Retrieve SortOrder for field: DateActive (RATE_UNIT_CR.date_active)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDateActiveSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.DateActiveSort;
  }
  /** Set the sort direction for field: DateActive (RATE_UNIT_CR.date_active)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDateActiveSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new RUCreditObjectKeyFilter ();
    this.Key.DateActiveSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DateActive (RATE_UNIT_CR.date_active)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDateActiveSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.DateActiveSortAscending;
  }
  /** Set the field level filters for field: DateActive (RATE_UNIT_CR.date_active)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDateActiveFilter (DateFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new RUCreditObjectKeyFilter ();
    this.Key.DateActive = value;
  }
  /** Retrieve filter for field: DateActive (RATE_UNIT_CR.date_active)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getDateActiveFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.DateActive;
  }
  /** Set the field level Fetch value for field: RangeOrigin (RATE_UNIT_CR.range_origin)
   * @param fetch whether to fetch this field or not
   */
  public void setRangeOriginFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new RUCreditObjectKeyFilter ();
    this.Key.RangeOriginFetch = fetch;
  }
  /** Retrieve Fetch value for field: RangeOrigin (RATE_UNIT_CR.range_origin)
   * @return boolean the Fetch value for this field
   */
  public boolean getRangeOriginFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.RangeOriginFetch;
  }
  /** Set the SortOrder for field: RangeOrigin (RATE_UNIT_CR.range_origin)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRangeOriginSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new RUCreditObjectKeyFilter ();
    this.Key.RangeOriginSort = value;
  }
  /** Retrieve SortOrder for field: RangeOrigin (RATE_UNIT_CR.range_origin)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRangeOriginSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.RangeOriginSort;
  }
  /** Set the sort direction for field: RangeOrigin (RATE_UNIT_CR.range_origin)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRangeOriginSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new RUCreditObjectKeyFilter ();
    this.Key.RangeOriginSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RangeOrigin (RATE_UNIT_CR.range_origin)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRangeOriginSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.RangeOriginSortAscending;
  }
  /** Set the field level filters for field: RangeOrigin (RATE_UNIT_CR.range_origin)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRangeOriginFilter (BigIntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new RUCreditObjectKeyFilter ();
    this.Key.RangeOrigin = value;
  }
  /** Retrieve filter for field: RangeOrigin (RATE_UNIT_CR.range_origin)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getRangeOriginFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.RangeOrigin;
  }
  /** Set the field level Fetch value for field: UnitsFree (RATE_UNIT_CR.units_free)
   * @param fetch whether to fetch this field or not
   */
  public void setUnitsFreeFetch (boolean fetch) {
    this.UnitsFreeFetch = fetch;
  }
  /** Retrieve Fetch value for field: UnitsFree (RATE_UNIT_CR.units_free)
   * @return boolean the Fetch value for this field
   */
  public boolean getUnitsFreeFetch () {
    return this.UnitsFreeFetch;
  }
  /** Set the SortOrder for field: UnitsFree (RATE_UNIT_CR.units_free)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUnitsFreeSortOrder (Integer value) {
    this.UnitsFreeSort = value;
  }
  /** Retrieve SortOrder for field: UnitsFree (RATE_UNIT_CR.units_free)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUnitsFreeSortOrder () {
    return this.UnitsFreeSort;
  }
  /** Set the sort direction for field: UnitsFree (RATE_UNIT_CR.units_free)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUnitsFreeSortDirection (boolean ascending) {
    this.UnitsFreeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UnitsFree (RATE_UNIT_CR.units_free)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUnitsFreeSortDirection () {
    return this.UnitsFreeSortAscending;
  }
  /** Set the field level filters for field: UnitsFree (RATE_UNIT_CR.units_free)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUnitsFreeFilter (BigIntegerFilter[] value) throws ServiceException {
    this.UnitsFree = value;
  }
  /** Retrieve filter for field: UnitsFree (RATE_UNIT_CR.units_free)
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

  /** Set the field level Fetch value for field: AmountFree (RATE_UNIT_CR.amount_free)
   * @param fetch whether to fetch this field or not
   */
  public void setAmountFreeFetch (boolean fetch) {
    this.AmountFreeFetch = fetch;
  }
  /** Retrieve Fetch value for field: AmountFree (RATE_UNIT_CR.amount_free)
   * @return boolean the Fetch value for this field
   */
  public boolean getAmountFreeFetch () {
    return this.AmountFreeFetch;
  }
  /** Set the SortOrder for field: AmountFree (RATE_UNIT_CR.amount_free)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAmountFreeSortOrder (Integer value) {
    this.AmountFreeSort = value;
  }
  /** Retrieve SortOrder for field: AmountFree (RATE_UNIT_CR.amount_free)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAmountFreeSortOrder () {
    return this.AmountFreeSort;
  }
  /** Set the sort direction for field: AmountFree (RATE_UNIT_CR.amount_free)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAmountFreeSortDirection (boolean ascending) {
    this.AmountFreeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AmountFree (RATE_UNIT_CR.amount_free)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAmountFreeSortDirection () {
    return this.AmountFreeSortAscending;
  }
  /** Set the field level filters for field: AmountFree (RATE_UNIT_CR.amount_free)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAmountFreeFilter (BigIntegerFilter[] value) throws ServiceException {
    this.AmountFree = value;
  }
  /** Retrieve filter for field: AmountFree (RATE_UNIT_CR.amount_free)
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


  /** Set the field level Fetch value for field: DateInactive (RATE_UNIT_CR.date_inactive)
   * @param fetch whether to fetch this field or not
   */
  public void setDateInactiveFetch (boolean fetch) {
    this.DateInactiveFetch = fetch;
  }
  /** Retrieve Fetch value for field: DateInactive (RATE_UNIT_CR.date_inactive)
   * @return boolean the Fetch value for this field
   */
  public boolean getDateInactiveFetch () {
    return this.DateInactiveFetch;
  }
  /** Set the SortOrder for field: DateInactive (RATE_UNIT_CR.date_inactive)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDateInactiveSortOrder (Integer value) {
    this.DateInactiveSort = value;
  }
  /** Retrieve SortOrder for field: DateInactive (RATE_UNIT_CR.date_inactive)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDateInactiveSortOrder () {
    return this.DateInactiveSort;
  }
  /** Set the sort direction for field: DateInactive (RATE_UNIT_CR.date_inactive)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDateInactiveSortDirection (boolean ascending) {
    this.DateInactiveSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DateInactive (RATE_UNIT_CR.date_inactive)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDateInactiveSortDirection () {
    return this.DateInactiveSortAscending;
  }
  /** Set the field level filters for field: DateInactive (RATE_UNIT_CR.date_inactive)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDateInactiveFilter (DateFilter[] value) throws ServiceException {
    this.DateInactive = value;
  }
  /** Retrieve filter for field: DateInactive (RATE_UNIT_CR.date_inactive)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getDateInactiveFilter () {
    return this.DateInactive;
  }

  /**
   * Retrieves the DateInactiveFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DateInactiveFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateInactiveFilter field
   */
  public String[] getDateInactiveFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateInactiveFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDateInactiveFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateInactiveFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateInactiveFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateInactiveFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DateInactiveFilter filter value from a formatted string
   *
   * @param _value the DateInactiveFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DateInactiveFilter filter field
   */
  public void setDateInactiveFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDateInactiveFilterFromFormattedString");
    try {
      this.setDateInactiveFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateInactiveFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateInactiveFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDateInactiveFilterFromFormattedString");
  }

  /**
   * Retrieves the DateInactiveFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DateInactiveFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateInactiveFilter field
   */
  public String[] getDateInactiveFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateInactiveFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDateInactiveFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateInactiveFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateInactiveFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateInactiveFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the DateInactiveFilter filter value from a formatted string
   *
   * @param _value the DateInactiveFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DateInactiveFilter filter field
   */
  public void setDateInactiveFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDateInactiveFilterFromFormattedDateTimeString");
    try {
      this.setDateInactiveFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateInactiveFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateInactiveFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDateInactiveFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: RangeTerminus (RATE_UNIT_CR.range_terminus)
   * @param fetch whether to fetch this field or not
   */
  public void setRangeTerminusFetch (boolean fetch) {
    this.RangeTerminusFetch = fetch;
  }
  /** Retrieve Fetch value for field: RangeTerminus (RATE_UNIT_CR.range_terminus)
   * @return boolean the Fetch value for this field
   */
  public boolean getRangeTerminusFetch () {
    return this.RangeTerminusFetch;
  }
  /** Set the SortOrder for field: RangeTerminus (RATE_UNIT_CR.range_terminus)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRangeTerminusSortOrder (Integer value) {
    this.RangeTerminusSort = value;
  }
  /** Retrieve SortOrder for field: RangeTerminus (RATE_UNIT_CR.range_terminus)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRangeTerminusSortOrder () {
    return this.RangeTerminusSort;
  }
  /** Set the sort direction for field: RangeTerminus (RATE_UNIT_CR.range_terminus)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRangeTerminusSortDirection (boolean ascending) {
    this.RangeTerminusSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RangeTerminus (RATE_UNIT_CR.range_terminus)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRangeTerminusSortDirection () {
    return this.RangeTerminusSortAscending;
  }
  /** Set the field level filters for field: RangeTerminus (RATE_UNIT_CR.range_terminus)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRangeTerminusFilter (BigIntegerFilter[] value) throws ServiceException {
    this.RangeTerminus = value;
  }
  /** Retrieve filter for field: RangeTerminus (RATE_UNIT_CR.range_terminus)
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

  public String toString() {
    return RUCreditObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return RUCreditObjectHelper.toMap(this, null);
  }
}
