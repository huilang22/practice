/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: HistoricalContributionTaxObjectFilter.java
 * Definition File: Customer/HistoricalContributionTax.xml
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
public class HistoricalContributionTaxObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public HistoricalContributionTaxObjectKeyFilter Key = null;
  /** raw field for: HISTORIC_CONTRIBUTION_TAX.tax_type_code) */
  public    IntegerFilter[] TaxTypeCode  = null;
  protected boolean TaxTypeCodeFetch = false;
  protected boolean TaxTypeCodeSortAscending = true;
  protected Integer TaxTypeCodeSort = null;
  /** raw field for: HISTORIC_CONTRIBUTION_TAX.basis) */
  public    BigIntegerFilter[] Basis  = null;
  protected boolean BasisFetch = false;
  protected boolean BasisSortAscending = true;
  protected Integer BasisSort = null;
  /** raw field for: HISTORIC_CONTRIBUTION_TAX.tax) */
  public    BigIntegerFilter[] Tax  = null;
  protected boolean TaxFetch = false;
  protected boolean TaxSortAscending = true;
  protected Integer TaxSort = null;
  /** raw field for: HISTORIC_CONTRIBUTION_TAX.chg_dt) */
  public    DateFilter[] ChgDt  = null;
  protected boolean ChgDtFetch = false;
  protected boolean ChgDtSortAscending = true;
  protected Integer ChgDtSort = null;
  /** raw field for: HISTORIC_CONTRIBUTION_TAX.chg_who) */
  public    StringFilter[] ChgWho  = null;
  protected boolean ChgWhoFetch = false;
  protected boolean ChgWhoSortAscending = true;
  protected boolean ChgWhoCaseInsensitive = false;
  protected Integer ChgWhoSort = null;
  private String _objName = "HistoricalContributionTaxObjectFilter";
  /** default constructor */
  public HistoricalContributionTaxObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public HistoricalContributionTaxObjectFilter (HistoricalContributionTaxObjectFilter other)
  {
    if (other == null) return;
    this.Key = new HistoricalContributionTaxObjectKeyFilter (other.Key);
    this.TaxTypeCode = other.TaxTypeCode;
    this.TaxTypeCodeFetch = other.TaxTypeCodeFetch;
    this.TaxTypeCodeSort = other.TaxTypeCodeSort;
    this.TaxTypeCodeSortAscending = other.TaxTypeCodeSortAscending;
    this.Basis = other.Basis;
    this.BasisFetch = other.BasisFetch;
    this.BasisSort = other.BasisSort;
    this.BasisSortAscending = other.BasisSortAscending;
    this.Tax = other.Tax;
    this.TaxFetch = other.TaxFetch;
    this.TaxSort = other.TaxSort;
    this.TaxSortAscending = other.TaxSortAscending;
    this.ChgDt = other.ChgDt;
    this.ChgDtFetch = other.ChgDtFetch;
    this.ChgDtSort = other.ChgDtSort;
    this.ChgDtSortAscending = other.ChgDtSortAscending;
    this.ChgWho = other.ChgWho;
    this.ChgWhoFetch = other.ChgWhoFetch;
    this.ChgWhoSort = other.ChgWhoSort;
    this.ChgWhoCaseInsensitive = other.ChgWhoCaseInsensitive;
    this.ChgWhoSortAscending = other.ChgWhoSortAscending;  }
  /** get the filter for this object's key
   * @return HistoricalContributionTaxObjectKeyFilter
   */
  public HistoricalContributionTaxObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (HistoricalContributionTaxObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: AccumulationTrackingId (HISTORIC_CONTRIBUTION_TAX.accumulation_tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setAccumulationTrackingIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new HistoricalContributionTaxObjectKeyFilter ();
    this.Key.AccumulationTrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccumulationTrackingId (HISTORIC_CONTRIBUTION_TAX.accumulation_tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccumulationTrackingIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.AccumulationTrackingIdFetch;
  }
  /** Set the SortOrder for field: AccumulationTrackingId (HISTORIC_CONTRIBUTION_TAX.accumulation_tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccumulationTrackingIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new HistoricalContributionTaxObjectKeyFilter ();
    this.Key.AccumulationTrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: AccumulationTrackingId (HISTORIC_CONTRIBUTION_TAX.accumulation_tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccumulationTrackingIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.AccumulationTrackingIdSort;
  }
  /** Set the sort direction for field: AccumulationTrackingId (HISTORIC_CONTRIBUTION_TAX.accumulation_tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccumulationTrackingIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new HistoricalContributionTaxObjectKeyFilter ();
    this.Key.AccumulationTrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccumulationTrackingId (HISTORIC_CONTRIBUTION_TAX.accumulation_tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccumulationTrackingIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.AccumulationTrackingIdSortAscending;
  }
  /** Set the field level filters for field: AccumulationTrackingId (HISTORIC_CONTRIBUTION_TAX.accumulation_tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccumulationTrackingIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new HistoricalContributionTaxObjectKeyFilter ();
    this.Key.AccumulationTrackingId = value;
  }
  /** Retrieve filter for field: AccumulationTrackingId (HISTORIC_CONTRIBUTION_TAX.accumulation_tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAccumulationTrackingIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.AccumulationTrackingId;
  }
  /** Set the field level Fetch value for field: AccumulationTrackingIdServ (HISTORIC_CONTRIBUTION_TAX.accumulation_tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setAccumulationTrackingIdServFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new HistoricalContributionTaxObjectKeyFilter ();
    this.Key.AccumulationTrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccumulationTrackingIdServ (HISTORIC_CONTRIBUTION_TAX.accumulation_tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccumulationTrackingIdServFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.AccumulationTrackingIdServFetch;
  }
  /** Set the SortOrder for field: AccumulationTrackingIdServ (HISTORIC_CONTRIBUTION_TAX.accumulation_tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccumulationTrackingIdServSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new HistoricalContributionTaxObjectKeyFilter ();
    this.Key.AccumulationTrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: AccumulationTrackingIdServ (HISTORIC_CONTRIBUTION_TAX.accumulation_tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccumulationTrackingIdServSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.AccumulationTrackingIdServSort;
  }
  /** Set the sort direction for field: AccumulationTrackingIdServ (HISTORIC_CONTRIBUTION_TAX.accumulation_tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccumulationTrackingIdServSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new HistoricalContributionTaxObjectKeyFilter ();
    this.Key.AccumulationTrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccumulationTrackingIdServ (HISTORIC_CONTRIBUTION_TAX.accumulation_tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccumulationTrackingIdServSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.AccumulationTrackingIdServSortAscending;
  }
  /** Set the field level filters for field: AccumulationTrackingIdServ (HISTORIC_CONTRIBUTION_TAX.accumulation_tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccumulationTrackingIdServFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new HistoricalContributionTaxObjectKeyFilter ();
    this.Key.AccumulationTrackingIdServ = value;
  }
  /** Retrieve filter for field: AccumulationTrackingIdServ (HISTORIC_CONTRIBUTION_TAX.accumulation_tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAccumulationTrackingIdServFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.AccumulationTrackingIdServ;
  }
  /** Set the field level Fetch value for field: TaxPkgInstId (HISTORIC_CONTRIBUTION_TAX.tax_pkg_inst_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxPkgInstIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new HistoricalContributionTaxObjectKeyFilter ();
    this.Key.TaxPkgInstIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaxPkgInstId (HISTORIC_CONTRIBUTION_TAX.tax_pkg_inst_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxPkgInstIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TaxPkgInstIdFetch;
  }
  /** Set the SortOrder for field: TaxPkgInstId (HISTORIC_CONTRIBUTION_TAX.tax_pkg_inst_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxPkgInstIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new HistoricalContributionTaxObjectKeyFilter ();
    this.Key.TaxPkgInstIdSort = value;
  }
  /** Retrieve SortOrder for field: TaxPkgInstId (HISTORIC_CONTRIBUTION_TAX.tax_pkg_inst_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxPkgInstIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TaxPkgInstIdSort;
  }
  /** Set the sort direction for field: TaxPkgInstId (HISTORIC_CONTRIBUTION_TAX.tax_pkg_inst_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxPkgInstIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new HistoricalContributionTaxObjectKeyFilter ();
    this.Key.TaxPkgInstIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaxPkgInstId (HISTORIC_CONTRIBUTION_TAX.tax_pkg_inst_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxPkgInstIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TaxPkgInstIdSortAscending;
  }
  /** Set the field level filters for field: TaxPkgInstId (HISTORIC_CONTRIBUTION_TAX.tax_pkg_inst_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxPkgInstIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new HistoricalContributionTaxObjectKeyFilter ();
    this.Key.TaxPkgInstId = value;
  }
  /** Retrieve filter for field: TaxPkgInstId (HISTORIC_CONTRIBUTION_TAX.tax_pkg_inst_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTaxPkgInstIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TaxPkgInstId;
  }
  /** Set the field level Fetch value for field: TaxTypeCode (HISTORIC_CONTRIBUTION_TAX.tax_type_code)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxTypeCodeFetch (boolean fetch) {
    this.TaxTypeCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaxTypeCode (HISTORIC_CONTRIBUTION_TAX.tax_type_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxTypeCodeFetch () {
    return this.TaxTypeCodeFetch;
  }
  /** Set the SortOrder for field: TaxTypeCode (HISTORIC_CONTRIBUTION_TAX.tax_type_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxTypeCodeSortOrder (Integer value) {
    this.TaxTypeCodeSort = value;
  }
  /** Retrieve SortOrder for field: TaxTypeCode (HISTORIC_CONTRIBUTION_TAX.tax_type_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxTypeCodeSortOrder () {
    return this.TaxTypeCodeSort;
  }
  /** Set the sort direction for field: TaxTypeCode (HISTORIC_CONTRIBUTION_TAX.tax_type_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxTypeCodeSortDirection (boolean ascending) {
    this.TaxTypeCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaxTypeCode (HISTORIC_CONTRIBUTION_TAX.tax_type_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxTypeCodeSortDirection () {
    return this.TaxTypeCodeSortAscending;
  }
  /** Set the field level filters for field: TaxTypeCode (HISTORIC_CONTRIBUTION_TAX.tax_type_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxTypeCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.TaxTypeCode = value;
  }
  /** Retrieve filter for field: TaxTypeCode (HISTORIC_CONTRIBUTION_TAX.tax_type_code)
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

  /** Set the field level Fetch value for field: Basis (HISTORIC_CONTRIBUTION_TAX.basis)
   * @param fetch whether to fetch this field or not
   */
  public void setBasisFetch (boolean fetch) {
    this.BasisFetch = fetch;
  }
  /** Retrieve Fetch value for field: Basis (HISTORIC_CONTRIBUTION_TAX.basis)
   * @return boolean the Fetch value for this field
   */
  public boolean getBasisFetch () {
    return this.BasisFetch;
  }
  /** Set the SortOrder for field: Basis (HISTORIC_CONTRIBUTION_TAX.basis)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBasisSortOrder (Integer value) {
    this.BasisSort = value;
  }
  /** Retrieve SortOrder for field: Basis (HISTORIC_CONTRIBUTION_TAX.basis)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBasisSortOrder () {
    return this.BasisSort;
  }
  /** Set the sort direction for field: Basis (HISTORIC_CONTRIBUTION_TAX.basis)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBasisSortDirection (boolean ascending) {
    this.BasisSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Basis (HISTORIC_CONTRIBUTION_TAX.basis)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBasisSortDirection () {
    return this.BasisSortAscending;
  }
  /** Set the field level filters for field: Basis (HISTORIC_CONTRIBUTION_TAX.basis)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBasisFilter (BigIntegerFilter[] value) throws ServiceException {
    this.Basis = value;
  }
  /** Retrieve filter for field: Basis (HISTORIC_CONTRIBUTION_TAX.basis)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getBasisFilter () {
    return this.Basis;
  }

  /**
   * Retrieves the BasisFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BasisFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BasisFilter field
   */
  public String[] getBasisFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBasisFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBasisFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBasisFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BasisFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBasisFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BasisFilter filter value from a formatted string
   *
   * @param _value the BasisFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BasisFilter filter field
   */
  public void setBasisFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBasisFilterFromFormattedString");
    try {
      this.setBasisFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BasisFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBasisFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBasisFilterFromFormattedString");
  }

  /**
   * Sets the BasisFilter filter value from a formatted string
   *
   * @param _value the BasisFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BasisFilter filter field
   */
  public void setBasisFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBasisFilterFromFormattedCurrencyString");
    try {
      this.setBasisFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BasisFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBasisFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBasisFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the BasisFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BasisFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the BasisFilter field
   */

  public String[] getBasisFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBasisFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBasisFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBasisFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BasisFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBasisFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: Tax (HISTORIC_CONTRIBUTION_TAX.tax)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxFetch (boolean fetch) {
    this.TaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: Tax (HISTORIC_CONTRIBUTION_TAX.tax)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxFetch () {
    return this.TaxFetch;
  }
  /** Set the SortOrder for field: Tax (HISTORIC_CONTRIBUTION_TAX.tax)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxSortOrder (Integer value) {
    this.TaxSort = value;
  }
  /** Retrieve SortOrder for field: Tax (HISTORIC_CONTRIBUTION_TAX.tax)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxSortOrder () {
    return this.TaxSort;
  }
  /** Set the sort direction for field: Tax (HISTORIC_CONTRIBUTION_TAX.tax)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxSortDirection (boolean ascending) {
    this.TaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Tax (HISTORIC_CONTRIBUTION_TAX.tax)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxSortDirection () {
    return this.TaxSortAscending;
  }
  /** Set the field level filters for field: Tax (HISTORIC_CONTRIBUTION_TAX.tax)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxFilter (BigIntegerFilter[] value) throws ServiceException {
    this.Tax = value;
  }
  /** Retrieve filter for field: Tax (HISTORIC_CONTRIBUTION_TAX.tax)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getTaxFilter () {
    return this.Tax;
  }

  /**
   * Retrieves the TaxFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TaxFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxFilter field
   */
  public String[] getTaxFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTaxFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TaxFilter filter value from a formatted string
   *
   * @param _value the TaxFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TaxFilter filter field
   */
  public void setTaxFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTaxFilterFromFormattedString");
    try {
      this.setTaxFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxFilterFromFormattedString");
  }

  /**
   * Sets the TaxFilter filter value from a formatted string
   *
   * @param _value the TaxFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TaxFilter filter field
   */
  public void setTaxFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTaxFilterFromFormattedCurrencyString");
    try {
      this.setTaxFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the TaxFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TaxFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxFilter field
   */

  public String[] getTaxFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTaxFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: ChgDt (HISTORIC_CONTRIBUTION_TAX.chg_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setChgDtFetch (boolean fetch) {
    this.ChgDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgDt (HISTORIC_CONTRIBUTION_TAX.chg_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgDtFetch () {
    return this.ChgDtFetch;
  }
  /** Set the SortOrder for field: ChgDt (HISTORIC_CONTRIBUTION_TAX.chg_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgDtSortOrder (Integer value) {
    this.ChgDtSort = value;
  }
  /** Retrieve SortOrder for field: ChgDt (HISTORIC_CONTRIBUTION_TAX.chg_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgDtSortOrder () {
    return this.ChgDtSort;
  }
  /** Set the sort direction for field: ChgDt (HISTORIC_CONTRIBUTION_TAX.chg_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgDtSortDirection (boolean ascending) {
    this.ChgDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgDt (HISTORIC_CONTRIBUTION_TAX.chg_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgDtSortDirection () {
    return this.ChgDtSortAscending;
  }
  /** Set the field level filters for field: ChgDt (HISTORIC_CONTRIBUTION_TAX.chg_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgDtFilter (DateFilter[] value) throws ServiceException {
    this.ChgDt = value;
  }
  /** Retrieve filter for field: ChgDt (HISTORIC_CONTRIBUTION_TAX.chg_dt)
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


  /** Set the field level Fetch value for field: ChgWho (HISTORIC_CONTRIBUTION_TAX.chg_who)
   * @param fetch whether to fetch this field or not
   */
  public void setChgWhoFetch (boolean fetch) {
    this.ChgWhoFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgWho (HISTORIC_CONTRIBUTION_TAX.chg_who)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgWhoFetch () {
    return this.ChgWhoFetch;
  }
  /** Set the SortOrder for field: ChgWho (HISTORIC_CONTRIBUTION_TAX.chg_who)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgWhoSortOrder (Integer value) {
    this.ChgWhoSort = value;
  }
  /** Retrieve SortOrder for field: ChgWho (HISTORIC_CONTRIBUTION_TAX.chg_who)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgWhoSortOrder () {
    return this.ChgWhoSort;
  }
  /** Set the sort direction for field: ChgWho (HISTORIC_CONTRIBUTION_TAX.chg_who)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgWhoSortDirection (boolean ascending) {
    this.ChgWhoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgWho (HISTORIC_CONTRIBUTION_TAX.chg_who)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgWhoSortDirection () {
    return this.ChgWhoSortAscending;
  }
  /** Set the case insensitive for field: ChgWho (HISTORIC_CONTRIBUTION_TAX.chg_who)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setChgWhoCaseInsensitive (boolean ascending) {
    this.ChgWhoCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ChgWho (HISTORIC_CONTRIBUTION_TAX.chg_who)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getChgWhoCaseInsensitive () {
    return this.ChgWhoCaseInsensitive;
  }
  /** Set the field level filters for field: ChgWho (HISTORIC_CONTRIBUTION_TAX.chg_who)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgWhoFilter (StringFilter[] value) throws ServiceException {
    this.ChgWho = value;
  }
  /** Retrieve filter for field: ChgWho (HISTORIC_CONTRIBUTION_TAX.chg_who)
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

  public String toString() {
    return HistoricalContributionTaxObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return HistoricalContributionTaxObjectHelper.toMap(this, null);
  }
}
