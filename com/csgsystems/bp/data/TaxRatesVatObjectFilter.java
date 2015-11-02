/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: TaxRatesVatObjectFilter.java
 * Definition File: Admin/TaxRatesVat.xml
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
public class TaxRatesVatObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public TaxRatesVatObjectKeyFilter Key = null;
  /** raw field for: TAX_RATES_VAT.fixed_amt) */
  public    BigIntegerFilter[] FixedAmt  = null;
  protected boolean FixedAmtFetch = false;
  protected boolean FixedAmtSortAscending = true;
  protected Integer FixedAmtSort = null;
  /** raw field for: TAX_RATES_VAT.rate) */
  public    IntegerFilter[] Rate  = null;
  protected boolean RateFetch = false;
  protected boolean RateSortAscending = true;
  protected Integer RateSort = null;
  /** raw field for: TAX_RATES_VAT.inactive_date) */
  public    DateFilter[] InactiveDate  = null;
  protected boolean InactiveDateFetch = false;
  protected boolean InactiveDateSortAscending = true;
  protected Integer InactiveDateSort = null;
  /** raw field for: TAX_RATES_VAT.tax_type_code) */
  public    IntegerFilter[] TaxTypeCode  = null;
  protected boolean TaxTypeCodeFetch = false;
  protected boolean TaxTypeCodeSortAscending = true;
  protected Integer TaxTypeCodeSort = null;
  /** raw field for: TAX_RATES_VAT.config_tag_id) */
  public    StringFilter[] ConfigTagId  = null;
  protected boolean ConfigTagIdFetch = false;
  protected boolean ConfigTagIdSortAscending = true;
  protected boolean ConfigTagIdCaseInsensitive = false;
  protected Integer ConfigTagIdSort = null;
  private String _objName = "TaxRatesVatObjectFilter";
  /** default constructor */
  public TaxRatesVatObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public TaxRatesVatObjectFilter (TaxRatesVatObjectFilter other)
  {
    if (other == null) return;
    this.Key = new TaxRatesVatObjectKeyFilter (other.Key);
    this.FixedAmt = other.FixedAmt;
    this.FixedAmtFetch = other.FixedAmtFetch;
    this.FixedAmtSort = other.FixedAmtSort;
    this.FixedAmtSortAscending = other.FixedAmtSortAscending;
    this.Rate = other.Rate;
    this.RateFetch = other.RateFetch;
    this.RateSort = other.RateSort;
    this.RateSortAscending = other.RateSortAscending;
    this.InactiveDate = other.InactiveDate;
    this.InactiveDateFetch = other.InactiveDateFetch;
    this.InactiveDateSort = other.InactiveDateSort;
    this.InactiveDateSortAscending = other.InactiveDateSortAscending;
    this.TaxTypeCode = other.TaxTypeCode;
    this.TaxTypeCodeFetch = other.TaxTypeCodeFetch;
    this.TaxTypeCodeSort = other.TaxTypeCodeSort;
    this.TaxTypeCodeSortAscending = other.TaxTypeCodeSortAscending;
    this.ConfigTagId = other.ConfigTagId;
    this.ConfigTagIdFetch = other.ConfigTagIdFetch;
    this.ConfigTagIdSort = other.ConfigTagIdSort;
    this.ConfigTagIdCaseInsensitive = other.ConfigTagIdCaseInsensitive;
    this.ConfigTagIdSortAscending = other.ConfigTagIdSortAscending;  }
  /** get the filter for this object's key
   * @return TaxRatesVatObjectKeyFilter
   */
  public TaxRatesVatObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (TaxRatesVatObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: TaxPkgInstId (TAX_RATES_VAT.tax_pkg_inst_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxPkgInstIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new TaxRatesVatObjectKeyFilter ();
    this.Key.TaxPkgInstIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaxPkgInstId (TAX_RATES_VAT.tax_pkg_inst_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxPkgInstIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TaxPkgInstIdFetch;
  }
  /** Set the SortOrder for field: TaxPkgInstId (TAX_RATES_VAT.tax_pkg_inst_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxPkgInstIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new TaxRatesVatObjectKeyFilter ();
    this.Key.TaxPkgInstIdSort = value;
  }
  /** Retrieve SortOrder for field: TaxPkgInstId (TAX_RATES_VAT.tax_pkg_inst_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxPkgInstIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TaxPkgInstIdSort;
  }
  /** Set the sort direction for field: TaxPkgInstId (TAX_RATES_VAT.tax_pkg_inst_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxPkgInstIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new TaxRatesVatObjectKeyFilter ();
    this.Key.TaxPkgInstIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaxPkgInstId (TAX_RATES_VAT.tax_pkg_inst_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxPkgInstIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TaxPkgInstIdSortAscending;
  }
  /** Set the field level filters for field: TaxPkgInstId (TAX_RATES_VAT.tax_pkg_inst_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxPkgInstIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new TaxRatesVatObjectKeyFilter ();
    this.Key.TaxPkgInstId = value;
  }
  /** Retrieve filter for field: TaxPkgInstId (TAX_RATES_VAT.tax_pkg_inst_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTaxPkgInstIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TaxPkgInstId;
  }
  /** Set the field level Fetch value for field: CurrencyCode (TAX_RATES_VAT.currency_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCurrencyCodeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new TaxRatesVatObjectKeyFilter ();
    this.Key.CurrencyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CurrencyCode (TAX_RATES_VAT.currency_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCurrencyCodeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.CurrencyCodeFetch;
  }
  /** Set the SortOrder for field: CurrencyCode (TAX_RATES_VAT.currency_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCurrencyCodeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new TaxRatesVatObjectKeyFilter ();
    this.Key.CurrencyCodeSort = value;
  }
  /** Retrieve SortOrder for field: CurrencyCode (TAX_RATES_VAT.currency_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCurrencyCodeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.CurrencyCodeSort;
  }
  /** Set the sort direction for field: CurrencyCode (TAX_RATES_VAT.currency_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCurrencyCodeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new TaxRatesVatObjectKeyFilter ();
    this.Key.CurrencyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CurrencyCode (TAX_RATES_VAT.currency_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCurrencyCodeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.CurrencyCodeSortAscending;
  }
  /** Set the field level filters for field: CurrencyCode (TAX_RATES_VAT.currency_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCurrencyCodeFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new TaxRatesVatObjectKeyFilter ();
    this.Key.CurrencyCode = value;
  }
  /** Retrieve filter for field: CurrencyCode (TAX_RATES_VAT.currency_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCurrencyCodeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.CurrencyCode;
  }
  /** Set the field level Fetch value for field: TaxClass (TAX_RATES_VAT.tax_class)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxClassFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new TaxRatesVatObjectKeyFilter ();
    this.Key.TaxClassFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaxClass (TAX_RATES_VAT.tax_class)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxClassFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TaxClassFetch;
  }
  /** Set the SortOrder for field: TaxClass (TAX_RATES_VAT.tax_class)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxClassSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new TaxRatesVatObjectKeyFilter ();
    this.Key.TaxClassSort = value;
  }
  /** Retrieve SortOrder for field: TaxClass (TAX_RATES_VAT.tax_class)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxClassSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TaxClassSort;
  }
  /** Set the sort direction for field: TaxClass (TAX_RATES_VAT.tax_class)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxClassSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new TaxRatesVatObjectKeyFilter ();
    this.Key.TaxClassSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaxClass (TAX_RATES_VAT.tax_class)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxClassSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TaxClassSortAscending;
  }
  /** Set the field level filters for field: TaxClass (TAX_RATES_VAT.tax_class)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxClassFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new TaxRatesVatObjectKeyFilter ();
    this.Key.TaxClass = value;
  }
  /** Retrieve filter for field: TaxClass (TAX_RATES_VAT.tax_class)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTaxClassFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TaxClass;
  }
  /** Set the field level Fetch value for field: ActiveDate (TAX_RATES_VAT.active_date)
   * @param fetch whether to fetch this field or not
   */
  public void setActiveDateFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new TaxRatesVatObjectKeyFilter ();
    this.Key.ActiveDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: ActiveDate (TAX_RATES_VAT.active_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getActiveDateFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.ActiveDateFetch;
  }
  /** Set the SortOrder for field: ActiveDate (TAX_RATES_VAT.active_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setActiveDateSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new TaxRatesVatObjectKeyFilter ();
    this.Key.ActiveDateSort = value;
  }
  /** Retrieve SortOrder for field: ActiveDate (TAX_RATES_VAT.active_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getActiveDateSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.ActiveDateSort;
  }
  /** Set the sort direction for field: ActiveDate (TAX_RATES_VAT.active_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setActiveDateSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new TaxRatesVatObjectKeyFilter ();
    this.Key.ActiveDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ActiveDate (TAX_RATES_VAT.active_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getActiveDateSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.ActiveDateSortAscending;
  }
  /** Set the field level filters for field: ActiveDate (TAX_RATES_VAT.active_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setActiveDateFilter (DateFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new TaxRatesVatObjectKeyFilter ();
    this.Key.ActiveDate = value;
  }
  /** Retrieve filter for field: ActiveDate (TAX_RATES_VAT.active_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getActiveDateFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.ActiveDate;
  }
  /** Set the field level Fetch value for field: BillingFrequency (TAX_RATES_VAT.billing_frequency)
   * @param fetch whether to fetch this field or not
   */
  public void setBillingFrequencyFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new TaxRatesVatObjectKeyFilter ();
    this.Key.BillingFrequencyFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillingFrequency (TAX_RATES_VAT.billing_frequency)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillingFrequencyFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.BillingFrequencyFetch;
  }
  /** Set the SortOrder for field: BillingFrequency (TAX_RATES_VAT.billing_frequency)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillingFrequencySortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new TaxRatesVatObjectKeyFilter ();
    this.Key.BillingFrequencySort = value;
  }
  /** Retrieve SortOrder for field: BillingFrequency (TAX_RATES_VAT.billing_frequency)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillingFrequencySortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.BillingFrequencySort;
  }
  /** Set the sort direction for field: BillingFrequency (TAX_RATES_VAT.billing_frequency)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillingFrequencySortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new TaxRatesVatObjectKeyFilter ();
    this.Key.BillingFrequencySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillingFrequency (TAX_RATES_VAT.billing_frequency)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillingFrequencySortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.BillingFrequencySortAscending;
  }
  /** Set the field level filters for field: BillingFrequency (TAX_RATES_VAT.billing_frequency)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillingFrequencyFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new TaxRatesVatObjectKeyFilter ();
    this.Key.BillingFrequency = value;
  }
  /** Retrieve filter for field: BillingFrequency (TAX_RATES_VAT.billing_frequency)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillingFrequencyFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.BillingFrequency;
  }
  /** Set the field level Fetch value for field: RangeTerminus (TAX_RATES_VAT.range_terminus)
   * @param fetch whether to fetch this field or not
   */
  public void setRangeTerminusFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new TaxRatesVatObjectKeyFilter ();
    this.Key.RangeTerminusFetch = fetch;
  }
  /** Retrieve Fetch value for field: RangeTerminus (TAX_RATES_VAT.range_terminus)
   * @return boolean the Fetch value for this field
   */
  public boolean getRangeTerminusFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.RangeTerminusFetch;
  }
  /** Set the SortOrder for field: RangeTerminus (TAX_RATES_VAT.range_terminus)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRangeTerminusSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new TaxRatesVatObjectKeyFilter ();
    this.Key.RangeTerminusSort = value;
  }
  /** Retrieve SortOrder for field: RangeTerminus (TAX_RATES_VAT.range_terminus)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRangeTerminusSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.RangeTerminusSort;
  }
  /** Set the sort direction for field: RangeTerminus (TAX_RATES_VAT.range_terminus)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRangeTerminusSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new TaxRatesVatObjectKeyFilter ();
    this.Key.RangeTerminusSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RangeTerminus (TAX_RATES_VAT.range_terminus)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRangeTerminusSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.RangeTerminusSortAscending;
  }
  /** Set the field level filters for field: RangeTerminus (TAX_RATES_VAT.range_terminus)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRangeTerminusFilter (BigIntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new TaxRatesVatObjectKeyFilter ();
    this.Key.RangeTerminus = value;
  }
  /** Retrieve filter for field: RangeTerminus (TAX_RATES_VAT.range_terminus)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getRangeTerminusFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.RangeTerminus;
  }
  /** Set the field level Fetch value for field: FixedAmt (TAX_RATES_VAT.fixed_amt)
   * @param fetch whether to fetch this field or not
   */
  public void setFixedAmtFetch (boolean fetch) {
    this.FixedAmtFetch = fetch;
  }
  /** Retrieve Fetch value for field: FixedAmt (TAX_RATES_VAT.fixed_amt)
   * @return boolean the Fetch value for this field
   */
  public boolean getFixedAmtFetch () {
    return this.FixedAmtFetch;
  }
  /** Set the SortOrder for field: FixedAmt (TAX_RATES_VAT.fixed_amt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFixedAmtSortOrder (Integer value) {
    this.FixedAmtSort = value;
  }
  /** Retrieve SortOrder for field: FixedAmt (TAX_RATES_VAT.fixed_amt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFixedAmtSortOrder () {
    return this.FixedAmtSort;
  }
  /** Set the sort direction for field: FixedAmt (TAX_RATES_VAT.fixed_amt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFixedAmtSortDirection (boolean ascending) {
    this.FixedAmtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FixedAmt (TAX_RATES_VAT.fixed_amt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFixedAmtSortDirection () {
    return this.FixedAmtSortAscending;
  }
  /** Set the field level filters for field: FixedAmt (TAX_RATES_VAT.fixed_amt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFixedAmtFilter (BigIntegerFilter[] value) throws ServiceException {
    this.FixedAmt = value;
  }
  /** Retrieve filter for field: FixedAmt (TAX_RATES_VAT.fixed_amt)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getFixedAmtFilter () {
    return this.FixedAmt;
  }

  /**
   * Retrieves the FixedAmtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FixedAmtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FixedAmtFilter field
   */
  public String[] getFixedAmtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFixedAmtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFixedAmtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFixedAmtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FixedAmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFixedAmtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FixedAmtFilter filter value from a formatted string
   *
   * @param _value the FixedAmtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FixedAmtFilter filter field
   */
  public void setFixedAmtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFixedAmtFilterFromFormattedString");
    try {
      this.setFixedAmtFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FixedAmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFixedAmtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFixedAmtFilterFromFormattedString");
  }

  /**
   * Sets the FixedAmtFilter filter value from a formatted string
   *
   * @param _value the FixedAmtFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FixedAmtFilter filter field
   */
  public void setFixedAmtFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFixedAmtFilterFromFormattedCurrencyString");
    try {
      this.setFixedAmtFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FixedAmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFixedAmtFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFixedAmtFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the FixedAmtFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FixedAmtFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the FixedAmtFilter field
   */

  public String[] getFixedAmtFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFixedAmtFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFixedAmtFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFixedAmtFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FixedAmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFixedAmtFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: Rate (TAX_RATES_VAT.rate)
   * @param fetch whether to fetch this field or not
   */
  public void setRateFetch (boolean fetch) {
    this.RateFetch = fetch;
  }
  /** Retrieve Fetch value for field: Rate (TAX_RATES_VAT.rate)
   * @return boolean the Fetch value for this field
   */
  public boolean getRateFetch () {
    return this.RateFetch;
  }
  /** Set the SortOrder for field: Rate (TAX_RATES_VAT.rate)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRateSortOrder (Integer value) {
    this.RateSort = value;
  }
  /** Retrieve SortOrder for field: Rate (TAX_RATES_VAT.rate)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRateSortOrder () {
    return this.RateSort;
  }
  /** Set the sort direction for field: Rate (TAX_RATES_VAT.rate)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRateSortDirection (boolean ascending) {
    this.RateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Rate (TAX_RATES_VAT.rate)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRateSortDirection () {
    return this.RateSortAscending;
  }
  /** Set the field level filters for field: Rate (TAX_RATES_VAT.rate)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRateFilter (IntegerFilter[] value) throws ServiceException {
    this.Rate = value;
  }
  /** Retrieve filter for field: Rate (TAX_RATES_VAT.rate)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRateFilter () {
    return this.Rate;
  }

  /**
   * Retrieves the RateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateFilter field
   */
  public String[] getRateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RateFilter filter value from a formatted string
   *
   * @param _value the RateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RateFilter filter field
   */
  public void setRateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRateFilterFromFormattedString");
    try {
      this.setRateFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: InactiveDate (TAX_RATES_VAT.inactive_date)
   * @param fetch whether to fetch this field or not
   */
  public void setInactiveDateFetch (boolean fetch) {
    this.InactiveDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: InactiveDate (TAX_RATES_VAT.inactive_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getInactiveDateFetch () {
    return this.InactiveDateFetch;
  }
  /** Set the SortOrder for field: InactiveDate (TAX_RATES_VAT.inactive_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInactiveDateSortOrder (Integer value) {
    this.InactiveDateSort = value;
  }
  /** Retrieve SortOrder for field: InactiveDate (TAX_RATES_VAT.inactive_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInactiveDateSortOrder () {
    return this.InactiveDateSort;
  }
  /** Set the sort direction for field: InactiveDate (TAX_RATES_VAT.inactive_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInactiveDateSortDirection (boolean ascending) {
    this.InactiveDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InactiveDate (TAX_RATES_VAT.inactive_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInactiveDateSortDirection () {
    return this.InactiveDateSortAscending;
  }
  /** Set the field level filters for field: InactiveDate (TAX_RATES_VAT.inactive_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInactiveDateFilter (DateFilter[] value) throws ServiceException {
    this.InactiveDate = value;
  }
  /** Retrieve filter for field: InactiveDate (TAX_RATES_VAT.inactive_date)
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


  /** Set the field level Fetch value for field: TaxTypeCode (TAX_RATES_VAT.tax_type_code)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxTypeCodeFetch (boolean fetch) {
    this.TaxTypeCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaxTypeCode (TAX_RATES_VAT.tax_type_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxTypeCodeFetch () {
    return this.TaxTypeCodeFetch;
  }
  /** Set the SortOrder for field: TaxTypeCode (TAX_RATES_VAT.tax_type_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxTypeCodeSortOrder (Integer value) {
    this.TaxTypeCodeSort = value;
  }
  /** Retrieve SortOrder for field: TaxTypeCode (TAX_RATES_VAT.tax_type_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxTypeCodeSortOrder () {
    return this.TaxTypeCodeSort;
  }
  /** Set the sort direction for field: TaxTypeCode (TAX_RATES_VAT.tax_type_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxTypeCodeSortDirection (boolean ascending) {
    this.TaxTypeCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaxTypeCode (TAX_RATES_VAT.tax_type_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxTypeCodeSortDirection () {
    return this.TaxTypeCodeSortAscending;
  }
  /** Set the field level filters for field: TaxTypeCode (TAX_RATES_VAT.tax_type_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxTypeCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.TaxTypeCode = value;
  }
  /** Retrieve filter for field: TaxTypeCode (TAX_RATES_VAT.tax_type_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTaxTypeCodeFilter () {
    return this.TaxTypeCode;
  }

  /**
   * Retrieves the TaxTypeCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TaxTypeCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxTypeCodeFilter field
   */
  public String[] getTaxTypeCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxTypeCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTaxTypeCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxTypeCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxTypeCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxTypeCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TaxTypeCodeFilter filter value from a formatted string
   *
   * @param _value the TaxTypeCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TaxTypeCodeFilter filter field
   */
  public void setTaxTypeCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTaxTypeCodeFilterFromFormattedString");
    try {
      this.setTaxTypeCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxTypeCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxTypeCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxTypeCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ConfigTagId (TAX_RATES_VAT.config_tag_id)
   * @param fetch whether to fetch this field or not
   */
  public void setConfigTagIdFetch (boolean fetch) {
    this.ConfigTagIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ConfigTagId (TAX_RATES_VAT.config_tag_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getConfigTagIdFetch () {
    return this.ConfigTagIdFetch;
  }
  /** Set the SortOrder for field: ConfigTagId (TAX_RATES_VAT.config_tag_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setConfigTagIdSortOrder (Integer value) {
    this.ConfigTagIdSort = value;
  }
  /** Retrieve SortOrder for field: ConfigTagId (TAX_RATES_VAT.config_tag_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getConfigTagIdSortOrder () {
    return this.ConfigTagIdSort;
  }
  /** Set the sort direction for field: ConfigTagId (TAX_RATES_VAT.config_tag_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setConfigTagIdSortDirection (boolean ascending) {
    this.ConfigTagIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ConfigTagId (TAX_RATES_VAT.config_tag_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getConfigTagIdSortDirection () {
    return this.ConfigTagIdSortAscending;
  }
  /** Set the case insensitive for field: ConfigTagId (TAX_RATES_VAT.config_tag_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setConfigTagIdCaseInsensitive (boolean ascending) {
    this.ConfigTagIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ConfigTagId (TAX_RATES_VAT.config_tag_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getConfigTagIdCaseInsensitive () {
    return this.ConfigTagIdCaseInsensitive;
  }
  /** Set the field level filters for field: ConfigTagId (TAX_RATES_VAT.config_tag_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setConfigTagIdFilter (StringFilter[] value) throws ServiceException {
    this.ConfigTagId = value;
  }
  /** Retrieve filter for field: ConfigTagId (TAX_RATES_VAT.config_tag_id)
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
    return TaxRatesVatObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return TaxRatesVatObjectHelper.toMap(this, null);
  }
}
