/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ProductChargeMapObjectFilter.java
 * Definition File: Customer/ProductChargeMap.xml
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
public class ProductChargeMapObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public ProductChargeMapObjectKeyFilter Key = null;
  /** raw field for: PRODUCT_CHARGE_MAP.billing_account_no) */
  public    IntegerFilter[] BillingAccountInternalId  = null;
  protected boolean BillingAccountInternalIdFetch = false;
  protected boolean BillingAccountInternalIdSortAscending = true;
  protected Integer BillingAccountInternalIdSort = null;
  /** raw field for: PRODUCT_CHARGE_MAP.billed_thru_dt) */
  public    DateFilter[] BilledThruDt  = null;
  protected boolean BilledThruDtFetch = false;
  protected boolean BilledThruDtSortAscending = true;
  protected Integer BilledThruDtSort = null;
  /** raw field for: PRODUCT_CHARGE_MAP.bill_period) */
  public    StringFilter[] BillPeriod  = null;
  protected boolean BillPeriodFetch = false;
  protected boolean BillPeriodSortAscending = true;
  protected boolean BillPeriodCaseInsensitive = false;
  protected Integer BillPeriodSort = null;
  /** raw field for: PRODUCT_CHARGE_MAP.no_bill) */
  public    BooleanFilter[] NoBill  = null;
  protected boolean NoBillFetch = false;
  protected boolean NoBillSortAscending = true;
  protected Integer NoBillSort = null;
  /** raw field for: PRODUCT_CHARGE_MAP.parent_account_no) */
  public    IntegerFilter[] ParentAccountInternalId  = null;
  protected boolean ParentAccountInternalIdFetch = false;
  protected boolean ParentAccountInternalIdSortAscending = true;
  protected Integer ParentAccountInternalIdSort = null;
  /** raw field for: PRODUCT_CHARGE_MAP.open_item_id) */
  public    IntegerFilter[] OpenItemId  = null;
  protected boolean OpenItemIdFetch = false;
  protected boolean OpenItemIdSortAscending = true;
  protected Integer OpenItemIdSort = null;
  /** raw field for: PRODUCT_CHARGE_MAP.in_arrears_override) */
  public    IntegerFilter[] InArrearsOverride  = null;
  protected boolean InArrearsOverrideFetch = false;
  protected boolean InArrearsOverrideSortAscending = true;
  protected Integer InArrearsOverrideSort = null;
  /** raw field for: PRODUCT_CHARGE_MAP.activation_code) */
  public    IntegerFilter[] ActivationCode  = null;
  protected boolean ActivationCodeFetch = false;
  protected boolean ActivationCodeSortAscending = true;
  protected Integer ActivationCodeSort = null;
  /** raw field for: PRODUCT_CHARGE_MAP.termination_code) */
  public    IntegerFilter[] TerminationCode  = null;
  protected boolean TerminationCodeFetch = false;
  protected boolean TerminationCodeSortAscending = true;
  protected Integer TerminationCodeSort = null;
  /** raw field for: PRODUCT_CHARGE_MAP.inactive_dt) */
  public    DateFilter[] InactiveDt  = null;
  protected boolean InactiveDtFetch = false;
  protected boolean InactiveDtSortAscending = true;
  protected Integer InactiveDtSort = null;
  /** raw field for: CUSTOMER_ID_ACCT_MAP.external_id) */
  public    StringFilter[] BillingAccountExternalId  = null;
  protected boolean BillingAccountExternalIdFetch = false;
  protected boolean BillingAccountExternalIdSortAscending = true;
  protected boolean BillingAccountExternalIdCaseInsensitive = false;
  protected Integer BillingAccountExternalIdSort = null;
  /** raw field for: CUSTOMER_ID_ACCT_MAP.external_id_type) */
  public    IntegerFilter[] BillingAccountExternalIdType  = null;
  protected boolean BillingAccountExternalIdTypeFetch = false;
  protected boolean BillingAccountExternalIdTypeSortAscending = true;
  protected Integer BillingAccountExternalIdTypeSort = null;
  private String _objName = "ProductChargeMapObjectFilter";
  /** default constructor */
  public ProductChargeMapObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public ProductChargeMapObjectFilter (ProductChargeMapObjectFilter other)
  {
    if (other == null) return;
    this.Key = new ProductChargeMapObjectKeyFilter (other.Key);
    this.BillingAccountInternalId = other.BillingAccountInternalId;
    this.BillingAccountInternalIdFetch = other.BillingAccountInternalIdFetch;
    this.BillingAccountInternalIdSort = other.BillingAccountInternalIdSort;
    this.BillingAccountInternalIdSortAscending = other.BillingAccountInternalIdSortAscending;
    this.BilledThruDt = other.BilledThruDt;
    this.BilledThruDtFetch = other.BilledThruDtFetch;
    this.BilledThruDtSort = other.BilledThruDtSort;
    this.BilledThruDtSortAscending = other.BilledThruDtSortAscending;
    this.BillPeriod = other.BillPeriod;
    this.BillPeriodFetch = other.BillPeriodFetch;
    this.BillPeriodSort = other.BillPeriodSort;
    this.BillPeriodCaseInsensitive = other.BillPeriodCaseInsensitive;
    this.BillPeriodSortAscending = other.BillPeriodSortAscending;
    this.NoBill = other.NoBill;
    this.NoBillFetch = other.NoBillFetch;
    this.NoBillSort = other.NoBillSort;
    this.NoBillSortAscending = other.NoBillSortAscending;
    this.ParentAccountInternalId = other.ParentAccountInternalId;
    this.ParentAccountInternalIdFetch = other.ParentAccountInternalIdFetch;
    this.ParentAccountInternalIdSort = other.ParentAccountInternalIdSort;
    this.ParentAccountInternalIdSortAscending = other.ParentAccountInternalIdSortAscending;
    this.OpenItemId = other.OpenItemId;
    this.OpenItemIdFetch = other.OpenItemIdFetch;
    this.OpenItemIdSort = other.OpenItemIdSort;
    this.OpenItemIdSortAscending = other.OpenItemIdSortAscending;
    this.InArrearsOverride = other.InArrearsOverride;
    this.InArrearsOverrideFetch = other.InArrearsOverrideFetch;
    this.InArrearsOverrideSort = other.InArrearsOverrideSort;
    this.InArrearsOverrideSortAscending = other.InArrearsOverrideSortAscending;
    this.ActivationCode = other.ActivationCode;
    this.ActivationCodeFetch = other.ActivationCodeFetch;
    this.ActivationCodeSort = other.ActivationCodeSort;
    this.ActivationCodeSortAscending = other.ActivationCodeSortAscending;
    this.TerminationCode = other.TerminationCode;
    this.TerminationCodeFetch = other.TerminationCodeFetch;
    this.TerminationCodeSort = other.TerminationCodeSort;
    this.TerminationCodeSortAscending = other.TerminationCodeSortAscending;
    this.InactiveDt = other.InactiveDt;
    this.InactiveDtFetch = other.InactiveDtFetch;
    this.InactiveDtSort = other.InactiveDtSort;
    this.InactiveDtSortAscending = other.InactiveDtSortAscending;
    this.BillingAccountExternalId = other.BillingAccountExternalId;
    this.BillingAccountExternalIdFetch = other.BillingAccountExternalIdFetch;
    this.BillingAccountExternalIdSort = other.BillingAccountExternalIdSort;
    this.BillingAccountExternalIdCaseInsensitive = other.BillingAccountExternalIdCaseInsensitive;
    this.BillingAccountExternalIdSortAscending = other.BillingAccountExternalIdSortAscending;
    this.BillingAccountExternalIdType = other.BillingAccountExternalIdType;
    this.BillingAccountExternalIdTypeFetch = other.BillingAccountExternalIdTypeFetch;
    this.BillingAccountExternalIdTypeSort = other.BillingAccountExternalIdTypeSort;
    this.BillingAccountExternalIdTypeSortAscending = other.BillingAccountExternalIdTypeSortAscending;  }
  /** get the filter for this object's key
   * @return ProductChargeMapObjectKeyFilter
   */
  public ProductChargeMapObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (ProductChargeMapObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: TrackingId (PRODUCT_CHARGE_MAP.tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new ProductChargeMapObjectKeyFilter ();
    this.Key.TrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingId (PRODUCT_CHARGE_MAP.tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdFetch;
  }
  /** Set the SortOrder for field: TrackingId (PRODUCT_CHARGE_MAP.tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new ProductChargeMapObjectKeyFilter ();
    this.Key.TrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: TrackingId (PRODUCT_CHARGE_MAP.tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdSort;
  }
  /** Set the sort direction for field: TrackingId (PRODUCT_CHARGE_MAP.tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new ProductChargeMapObjectKeyFilter ();
    this.Key.TrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingId (PRODUCT_CHARGE_MAP.tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdSortAscending;
  }
  /** Set the field level filters for field: TrackingId (PRODUCT_CHARGE_MAP.tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new ProductChargeMapObjectKeyFilter ();
    this.Key.TrackingId = value;
  }
  /** Retrieve filter for field: TrackingId (PRODUCT_CHARGE_MAP.tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingId;
  }
  /** Set the field level Fetch value for field: TrackingIdServ (PRODUCT_CHARGE_MAP.tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdServFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new ProductChargeMapObjectKeyFilter ();
    this.Key.TrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingIdServ (PRODUCT_CHARGE_MAP.tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdServFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdServFetch;
  }
  /** Set the SortOrder for field: TrackingIdServ (PRODUCT_CHARGE_MAP.tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdServSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new ProductChargeMapObjectKeyFilter ();
    this.Key.TrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: TrackingIdServ (PRODUCT_CHARGE_MAP.tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdServSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServSort;
  }
  /** Set the sort direction for field: TrackingIdServ (PRODUCT_CHARGE_MAP.tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdServSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new ProductChargeMapObjectKeyFilter ();
    this.Key.TrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingIdServ (PRODUCT_CHARGE_MAP.tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdServSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdServSortAscending;
  }
  /** Set the field level filters for field: TrackingIdServ (PRODUCT_CHARGE_MAP.tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdServFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new ProductChargeMapObjectKeyFilter ();
    this.Key.TrackingIdServ = value;
  }
  /** Retrieve filter for field: TrackingIdServ (PRODUCT_CHARGE_MAP.tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdServFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServ;
  }
  /** Set the field level Fetch value for field: ActiveDt (PRODUCT_CHARGE_MAP.active_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setActiveDtFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new ProductChargeMapObjectKeyFilter ();
    this.Key.ActiveDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: ActiveDt (PRODUCT_CHARGE_MAP.active_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getActiveDtFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.ActiveDtFetch;
  }
  /** Set the SortOrder for field: ActiveDt (PRODUCT_CHARGE_MAP.active_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setActiveDtSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new ProductChargeMapObjectKeyFilter ();
    this.Key.ActiveDtSort = value;
  }
  /** Retrieve SortOrder for field: ActiveDt (PRODUCT_CHARGE_MAP.active_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getActiveDtSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.ActiveDtSort;
  }
  /** Set the sort direction for field: ActiveDt (PRODUCT_CHARGE_MAP.active_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setActiveDtSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new ProductChargeMapObjectKeyFilter ();
    this.Key.ActiveDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ActiveDt (PRODUCT_CHARGE_MAP.active_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getActiveDtSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.ActiveDtSortAscending;
  }
  /** Set the field level filters for field: ActiveDt (PRODUCT_CHARGE_MAP.active_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setActiveDtFilter (DateFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new ProductChargeMapObjectKeyFilter ();
    this.Key.ActiveDt = value;
  }
  /** Retrieve filter for field: ActiveDt (PRODUCT_CHARGE_MAP.active_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getActiveDtFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.ActiveDt;
  }
  /** Set the field level Fetch value for field: BillingAccountInternalId (PRODUCT_CHARGE_MAP.billing_account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setBillingAccountInternalIdFetch (boolean fetch) {
    this.BillingAccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillingAccountInternalId (PRODUCT_CHARGE_MAP.billing_account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillingAccountInternalIdFetch () {
    return this.BillingAccountInternalIdFetch;
  }
  /** Set the SortOrder for field: BillingAccountInternalId (PRODUCT_CHARGE_MAP.billing_account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillingAccountInternalIdSortOrder (Integer value) {
    this.BillingAccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: BillingAccountInternalId (PRODUCT_CHARGE_MAP.billing_account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillingAccountInternalIdSortOrder () {
    return this.BillingAccountInternalIdSort;
  }
  /** Set the sort direction for field: BillingAccountInternalId (PRODUCT_CHARGE_MAP.billing_account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillingAccountInternalIdSortDirection (boolean ascending) {
    this.BillingAccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillingAccountInternalId (PRODUCT_CHARGE_MAP.billing_account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillingAccountInternalIdSortDirection () {
    return this.BillingAccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: BillingAccountInternalId (PRODUCT_CHARGE_MAP.billing_account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillingAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.BillingAccountInternalId = value;
  }
  /** Retrieve filter for field: BillingAccountInternalId (PRODUCT_CHARGE_MAP.billing_account_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillingAccountInternalIdFilter () {
    return this.BillingAccountInternalId;
  }

  /**
   * Retrieves the BillingAccountInternalIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillingAccountInternalIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillingAccountInternalIdFilter field
   */
  public String[] getBillingAccountInternalIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillingAccountInternalIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillingAccountInternalIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillingAccountInternalIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillingAccountInternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillingAccountInternalIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillingAccountInternalIdFilter filter value from a formatted string
   *
   * @param _value the BillingAccountInternalIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillingAccountInternalIdFilter filter field
   */
  public void setBillingAccountInternalIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillingAccountInternalIdFilterFromFormattedString");
    try {
      this.setBillingAccountInternalIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillingAccountInternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillingAccountInternalIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillingAccountInternalIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BilledThruDt (PRODUCT_CHARGE_MAP.billed_thru_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setBilledThruDtFetch (boolean fetch) {
    this.BilledThruDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: BilledThruDt (PRODUCT_CHARGE_MAP.billed_thru_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getBilledThruDtFetch () {
    return this.BilledThruDtFetch;
  }
  /** Set the SortOrder for field: BilledThruDt (PRODUCT_CHARGE_MAP.billed_thru_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBilledThruDtSortOrder (Integer value) {
    this.BilledThruDtSort = value;
  }
  /** Retrieve SortOrder for field: BilledThruDt (PRODUCT_CHARGE_MAP.billed_thru_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBilledThruDtSortOrder () {
    return this.BilledThruDtSort;
  }
  /** Set the sort direction for field: BilledThruDt (PRODUCT_CHARGE_MAP.billed_thru_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBilledThruDtSortDirection (boolean ascending) {
    this.BilledThruDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BilledThruDt (PRODUCT_CHARGE_MAP.billed_thru_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBilledThruDtSortDirection () {
    return this.BilledThruDtSortAscending;
  }
  /** Set the field level filters for field: BilledThruDt (PRODUCT_CHARGE_MAP.billed_thru_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBilledThruDtFilter (DateFilter[] value) throws ServiceException {
    this.BilledThruDt = value;
  }
  /** Retrieve filter for field: BilledThruDt (PRODUCT_CHARGE_MAP.billed_thru_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getBilledThruDtFilter () {
    return this.BilledThruDt;
  }

  /**
   * Retrieves the BilledThruDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BilledThruDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BilledThruDtFilter field
   */
  public String[] getBilledThruDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBilledThruDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBilledThruDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBilledThruDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BilledThruDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBilledThruDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BilledThruDtFilter filter value from a formatted string
   *
   * @param _value the BilledThruDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BilledThruDtFilter filter field
   */
  public void setBilledThruDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBilledThruDtFilterFromFormattedString");
    try {
      this.setBilledThruDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BilledThruDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBilledThruDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBilledThruDtFilterFromFormattedString");
  }

  /**
   * Retrieves the BilledThruDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BilledThruDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the BilledThruDtFilter field
   */
  public String[] getBilledThruDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBilledThruDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBilledThruDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBilledThruDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BilledThruDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBilledThruDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the BilledThruDtFilter filter value from a formatted string
   *
   * @param _value the BilledThruDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BilledThruDtFilter filter field
   */
  public void setBilledThruDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBilledThruDtFilterFromFormattedDateTimeString");
    try {
      this.setBilledThruDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BilledThruDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBilledThruDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBilledThruDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: BillPeriod (PRODUCT_CHARGE_MAP.bill_period)
   * @param fetch whether to fetch this field or not
   */
  public void setBillPeriodFetch (boolean fetch) {
    this.BillPeriodFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillPeriod (PRODUCT_CHARGE_MAP.bill_period)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillPeriodFetch () {
    return this.BillPeriodFetch;
  }
  /** Set the SortOrder for field: BillPeriod (PRODUCT_CHARGE_MAP.bill_period)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillPeriodSortOrder (Integer value) {
    this.BillPeriodSort = value;
  }
  /** Retrieve SortOrder for field: BillPeriod (PRODUCT_CHARGE_MAP.bill_period)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillPeriodSortOrder () {
    return this.BillPeriodSort;
  }
  /** Set the sort direction for field: BillPeriod (PRODUCT_CHARGE_MAP.bill_period)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillPeriodSortDirection (boolean ascending) {
    this.BillPeriodSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillPeriod (PRODUCT_CHARGE_MAP.bill_period)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillPeriodSortDirection () {
    return this.BillPeriodSortAscending;
  }
  /** Set the case insensitive for field: BillPeriod (PRODUCT_CHARGE_MAP.bill_period)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBillPeriodCaseInsensitive (boolean ascending) {
    this.BillPeriodCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BillPeriod (PRODUCT_CHARGE_MAP.bill_period)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBillPeriodCaseInsensitive () {
    return this.BillPeriodCaseInsensitive;
  }
  /** Set the field level filters for field: BillPeriod (PRODUCT_CHARGE_MAP.bill_period)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillPeriodFilter (StringFilter[] value) throws ServiceException {
    this.BillPeriod = value;
  }
  /** Retrieve filter for field: BillPeriod (PRODUCT_CHARGE_MAP.bill_period)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBillPeriodFilter () {
    return this.BillPeriod;
  }

  /**
   * Retrieves the BillPeriodFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillPeriodFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillPeriodFilter field
   */
  public String[] getBillPeriodFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillPeriodFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillPeriodFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillPeriodFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillPeriodFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillPeriodFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillPeriodFilter filter value from a formatted string
   *
   * @param _value the BillPeriodFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillPeriodFilter filter field
   */
  public void setBillPeriodFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillPeriodFilterFromFormattedString");
    try {
      this.setBillPeriodFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillPeriodFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillPeriodFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillPeriodFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: NoBill (PRODUCT_CHARGE_MAP.no_bill)
   * @param fetch whether to fetch this field or not
   */
  public void setNoBillFetch (boolean fetch) {
    this.NoBillFetch = fetch;
  }
  /** Retrieve Fetch value for field: NoBill (PRODUCT_CHARGE_MAP.no_bill)
   * @return boolean the Fetch value for this field
   */
  public boolean getNoBillFetch () {
    return this.NoBillFetch;
  }
  /** Set the SortOrder for field: NoBill (PRODUCT_CHARGE_MAP.no_bill)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setNoBillSortOrder (Integer value) {
    this.NoBillSort = value;
  }
  /** Retrieve SortOrder for field: NoBill (PRODUCT_CHARGE_MAP.no_bill)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getNoBillSortOrder () {
    return this.NoBillSort;
  }
  /** Set the sort direction for field: NoBill (PRODUCT_CHARGE_MAP.no_bill)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setNoBillSortDirection (boolean ascending) {
    this.NoBillSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: NoBill (PRODUCT_CHARGE_MAP.no_bill)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getNoBillSortDirection () {
    return this.NoBillSortAscending;
  }
  /** Set the field level filters for field: NoBill (PRODUCT_CHARGE_MAP.no_bill)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setNoBillFilter (BooleanFilter[] value) throws ServiceException {
    this.NoBill = value;
  }
  /** Retrieve filter for field: NoBill (PRODUCT_CHARGE_MAP.no_bill)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getNoBillFilter () {
    return this.NoBill;
  }

  /**
   * Retrieves the NoBillFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NoBillFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NoBillFilter field
   */
  public String[] getNoBillFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoBillFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getNoBillFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNoBillFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NoBillFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNoBillFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the NoBillFilter filter value from a formatted string
   *
   * @param _value the NoBillFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the NoBillFilter filter field
   */
  public void setNoBillFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNoBillFilterFromFormattedString");
    try {
      this.setNoBillFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NoBillFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNoBillFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNoBillFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ParentAccountInternalId (PRODUCT_CHARGE_MAP.parent_account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setParentAccountInternalIdFetch (boolean fetch) {
    this.ParentAccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ParentAccountInternalId (PRODUCT_CHARGE_MAP.parent_account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getParentAccountInternalIdFetch () {
    return this.ParentAccountInternalIdFetch;
  }
  /** Set the SortOrder for field: ParentAccountInternalId (PRODUCT_CHARGE_MAP.parent_account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setParentAccountInternalIdSortOrder (Integer value) {
    this.ParentAccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: ParentAccountInternalId (PRODUCT_CHARGE_MAP.parent_account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getParentAccountInternalIdSortOrder () {
    return this.ParentAccountInternalIdSort;
  }
  /** Set the sort direction for field: ParentAccountInternalId (PRODUCT_CHARGE_MAP.parent_account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setParentAccountInternalIdSortDirection (boolean ascending) {
    this.ParentAccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ParentAccountInternalId (PRODUCT_CHARGE_MAP.parent_account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getParentAccountInternalIdSortDirection () {
    return this.ParentAccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: ParentAccountInternalId (PRODUCT_CHARGE_MAP.parent_account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setParentAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ParentAccountInternalId = value;
  }
  /** Retrieve filter for field: ParentAccountInternalId (PRODUCT_CHARGE_MAP.parent_account_no)
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

  /** Set the field level Fetch value for field: OpenItemId (PRODUCT_CHARGE_MAP.open_item_id)
   * @param fetch whether to fetch this field or not
   */
  public void setOpenItemIdFetch (boolean fetch) {
    this.OpenItemIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: OpenItemId (PRODUCT_CHARGE_MAP.open_item_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getOpenItemIdFetch () {
    return this.OpenItemIdFetch;
  }
  /** Set the SortOrder for field: OpenItemId (PRODUCT_CHARGE_MAP.open_item_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOpenItemIdSortOrder (Integer value) {
    this.OpenItemIdSort = value;
  }
  /** Retrieve SortOrder for field: OpenItemId (PRODUCT_CHARGE_MAP.open_item_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOpenItemIdSortOrder () {
    return this.OpenItemIdSort;
  }
  /** Set the sort direction for field: OpenItemId (PRODUCT_CHARGE_MAP.open_item_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOpenItemIdSortDirection (boolean ascending) {
    this.OpenItemIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OpenItemId (PRODUCT_CHARGE_MAP.open_item_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOpenItemIdSortDirection () {
    return this.OpenItemIdSortAscending;
  }
  /** Set the field level filters for field: OpenItemId (PRODUCT_CHARGE_MAP.open_item_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOpenItemIdFilter (IntegerFilter[] value) throws ServiceException {
    this.OpenItemId = value;
  }
  /** Retrieve filter for field: OpenItemId (PRODUCT_CHARGE_MAP.open_item_id)
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

  /** Set the field level Fetch value for field: InArrearsOverride (PRODUCT_CHARGE_MAP.in_arrears_override)
   * @param fetch whether to fetch this field or not
   */
  public void setInArrearsOverrideFetch (boolean fetch) {
    this.InArrearsOverrideFetch = fetch;
  }
  /** Retrieve Fetch value for field: InArrearsOverride (PRODUCT_CHARGE_MAP.in_arrears_override)
   * @return boolean the Fetch value for this field
   */
  public boolean getInArrearsOverrideFetch () {
    return this.InArrearsOverrideFetch;
  }
  /** Set the SortOrder for field: InArrearsOverride (PRODUCT_CHARGE_MAP.in_arrears_override)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInArrearsOverrideSortOrder (Integer value) {
    this.InArrearsOverrideSort = value;
  }
  /** Retrieve SortOrder for field: InArrearsOverride (PRODUCT_CHARGE_MAP.in_arrears_override)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInArrearsOverrideSortOrder () {
    return this.InArrearsOverrideSort;
  }
  /** Set the sort direction for field: InArrearsOverride (PRODUCT_CHARGE_MAP.in_arrears_override)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInArrearsOverrideSortDirection (boolean ascending) {
    this.InArrearsOverrideSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InArrearsOverride (PRODUCT_CHARGE_MAP.in_arrears_override)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInArrearsOverrideSortDirection () {
    return this.InArrearsOverrideSortAscending;
  }
  /** Set the field level filters for field: InArrearsOverride (PRODUCT_CHARGE_MAP.in_arrears_override)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInArrearsOverrideFilter (IntegerFilter[] value) throws ServiceException {
    this.InArrearsOverride = value;
  }
  /** Retrieve filter for field: InArrearsOverride (PRODUCT_CHARGE_MAP.in_arrears_override)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getInArrearsOverrideFilter () {
    return this.InArrearsOverride;
  }

  /**
   * Retrieves the InArrearsOverrideFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InArrearsOverrideFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InArrearsOverrideFilter field
   */
  public String[] getInArrearsOverrideFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInArrearsOverrideFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getInArrearsOverrideFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInArrearsOverrideFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InArrearsOverrideFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInArrearsOverrideFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the InArrearsOverrideFilter filter value from a formatted string
   *
   * @param _value the InArrearsOverrideFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the InArrearsOverrideFilter filter field
   */
  public void setInArrearsOverrideFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInArrearsOverrideFilterFromFormattedString");
    try {
      this.setInArrearsOverrideFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InArrearsOverrideFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInArrearsOverrideFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInArrearsOverrideFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ActivationCode (PRODUCT_CHARGE_MAP.activation_code)
   * @param fetch whether to fetch this field or not
   */
  public void setActivationCodeFetch (boolean fetch) {
    this.ActivationCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ActivationCode (PRODUCT_CHARGE_MAP.activation_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getActivationCodeFetch () {
    return this.ActivationCodeFetch;
  }
  /** Set the SortOrder for field: ActivationCode (PRODUCT_CHARGE_MAP.activation_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setActivationCodeSortOrder (Integer value) {
    this.ActivationCodeSort = value;
  }
  /** Retrieve SortOrder for field: ActivationCode (PRODUCT_CHARGE_MAP.activation_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getActivationCodeSortOrder () {
    return this.ActivationCodeSort;
  }
  /** Set the sort direction for field: ActivationCode (PRODUCT_CHARGE_MAP.activation_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setActivationCodeSortDirection (boolean ascending) {
    this.ActivationCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ActivationCode (PRODUCT_CHARGE_MAP.activation_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getActivationCodeSortDirection () {
    return this.ActivationCodeSortAscending;
  }
  /** Set the field level filters for field: ActivationCode (PRODUCT_CHARGE_MAP.activation_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setActivationCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.ActivationCode = value;
  }
  /** Retrieve filter for field: ActivationCode (PRODUCT_CHARGE_MAP.activation_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getActivationCodeFilter () {
    return this.ActivationCode;
  }

  /**
   * Retrieves the ActivationCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ActivationCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActivationCodeFilter field
   */
  public String[] getActivationCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActivationCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getActivationCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActivationCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActivationCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getActivationCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ActivationCodeFilter filter value from a formatted string
   *
   * @param _value the ActivationCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ActivationCodeFilter filter field
   */
  public void setActivationCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setActivationCodeFilterFromFormattedString");
    try {
      this.setActivationCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActivationCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setActivationCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setActivationCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TerminationCode (PRODUCT_CHARGE_MAP.termination_code)
   * @param fetch whether to fetch this field or not
   */
  public void setTerminationCodeFetch (boolean fetch) {
    this.TerminationCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: TerminationCode (PRODUCT_CHARGE_MAP.termination_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getTerminationCodeFetch () {
    return this.TerminationCodeFetch;
  }
  /** Set the SortOrder for field: TerminationCode (PRODUCT_CHARGE_MAP.termination_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTerminationCodeSortOrder (Integer value) {
    this.TerminationCodeSort = value;
  }
  /** Retrieve SortOrder for field: TerminationCode (PRODUCT_CHARGE_MAP.termination_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTerminationCodeSortOrder () {
    return this.TerminationCodeSort;
  }
  /** Set the sort direction for field: TerminationCode (PRODUCT_CHARGE_MAP.termination_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTerminationCodeSortDirection (boolean ascending) {
    this.TerminationCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TerminationCode (PRODUCT_CHARGE_MAP.termination_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTerminationCodeSortDirection () {
    return this.TerminationCodeSortAscending;
  }
  /** Set the field level filters for field: TerminationCode (PRODUCT_CHARGE_MAP.termination_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTerminationCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.TerminationCode = value;
  }
  /** Retrieve filter for field: TerminationCode (PRODUCT_CHARGE_MAP.termination_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTerminationCodeFilter () {
    return this.TerminationCode;
  }

  /**
   * Retrieves the TerminationCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TerminationCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TerminationCodeFilter field
   */
  public String[] getTerminationCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTerminationCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTerminationCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTerminationCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TerminationCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTerminationCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TerminationCodeFilter filter value from a formatted string
   *
   * @param _value the TerminationCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TerminationCodeFilter filter field
   */
  public void setTerminationCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTerminationCodeFilterFromFormattedString");
    try {
      this.setTerminationCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TerminationCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTerminationCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTerminationCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: InactiveDt (PRODUCT_CHARGE_MAP.inactive_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setInactiveDtFetch (boolean fetch) {
    this.InactiveDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: InactiveDt (PRODUCT_CHARGE_MAP.inactive_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getInactiveDtFetch () {
    return this.InactiveDtFetch;
  }
  /** Set the SortOrder for field: InactiveDt (PRODUCT_CHARGE_MAP.inactive_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInactiveDtSortOrder (Integer value) {
    this.InactiveDtSort = value;
  }
  /** Retrieve SortOrder for field: InactiveDt (PRODUCT_CHARGE_MAP.inactive_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInactiveDtSortOrder () {
    return this.InactiveDtSort;
  }
  /** Set the sort direction for field: InactiveDt (PRODUCT_CHARGE_MAP.inactive_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInactiveDtSortDirection (boolean ascending) {
    this.InactiveDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InactiveDt (PRODUCT_CHARGE_MAP.inactive_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInactiveDtSortDirection () {
    return this.InactiveDtSortAscending;
  }
  /** Set the field level filters for field: InactiveDt (PRODUCT_CHARGE_MAP.inactive_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInactiveDtFilter (DateFilter[] value) throws ServiceException {
    this.InactiveDt = value;
  }
  /** Retrieve filter for field: InactiveDt (PRODUCT_CHARGE_MAP.inactive_dt)
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


  /** Set the field level Fetch value for field: BillingAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param fetch whether to fetch this field or not
   */
  public void setBillingAccountExternalIdFetch (boolean fetch) {
    this.BillingAccountExternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillingAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillingAccountExternalIdFetch () {
    return this.BillingAccountExternalIdFetch;
  }
  /** Set the SortOrder for field: BillingAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillingAccountExternalIdSortOrder (Integer value) {
    this.BillingAccountExternalIdSort = value;
  }
  /** Retrieve SortOrder for field: BillingAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillingAccountExternalIdSortOrder () {
    return this.BillingAccountExternalIdSort;
  }
  /** Set the sort direction for field: BillingAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillingAccountExternalIdSortDirection (boolean ascending) {
    this.BillingAccountExternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillingAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillingAccountExternalIdSortDirection () {
    return this.BillingAccountExternalIdSortAscending;
  }
  /** Set the case insensitive for field: BillingAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBillingAccountExternalIdCaseInsensitive (boolean ascending) {
    this.BillingAccountExternalIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BillingAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBillingAccountExternalIdCaseInsensitive () {
    return this.BillingAccountExternalIdCaseInsensitive;
  }
  /** Set the field level filters for field: BillingAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillingAccountExternalIdFilter (StringFilter[] value) throws ServiceException {
    this.BillingAccountExternalId = value;
  }
  /** Retrieve filter for field: BillingAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBillingAccountExternalIdFilter () {
    return this.BillingAccountExternalId;
  }

  /**
   * Retrieves the BillingAccountExternalIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillingAccountExternalIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillingAccountExternalIdFilter field
   */
  public String[] getBillingAccountExternalIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillingAccountExternalIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillingAccountExternalIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillingAccountExternalIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillingAccountExternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillingAccountExternalIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillingAccountExternalIdFilter filter value from a formatted string
   *
   * @param _value the BillingAccountExternalIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillingAccountExternalIdFilter filter field
   */
  public void setBillingAccountExternalIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillingAccountExternalIdFilterFromFormattedString");
    try {
      this.setBillingAccountExternalIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillingAccountExternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillingAccountExternalIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillingAccountExternalIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillingAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @param fetch whether to fetch this field or not
   */
  public void setBillingAccountExternalIdTypeFetch (boolean fetch) {
    this.BillingAccountExternalIdTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillingAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillingAccountExternalIdTypeFetch () {
    return this.BillingAccountExternalIdTypeFetch;
  }
  /** Set the SortOrder for field: BillingAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillingAccountExternalIdTypeSortOrder (Integer value) {
    this.BillingAccountExternalIdTypeSort = value;
  }
  /** Retrieve SortOrder for field: BillingAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillingAccountExternalIdTypeSortOrder () {
    return this.BillingAccountExternalIdTypeSort;
  }
  /** Set the sort direction for field: BillingAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillingAccountExternalIdTypeSortDirection (boolean ascending) {
    this.BillingAccountExternalIdTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillingAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillingAccountExternalIdTypeSortDirection () {
    return this.BillingAccountExternalIdTypeSortAscending;
  }
  /** Set the field level filters for field: BillingAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillingAccountExternalIdTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.BillingAccountExternalIdType = value;
  }
  /** Retrieve filter for field: BillingAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillingAccountExternalIdTypeFilter () {
    return this.BillingAccountExternalIdType;
  }

  /**
   * Retrieves the BillingAccountExternalIdTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillingAccountExternalIdTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillingAccountExternalIdTypeFilter field
   */
  public String[] getBillingAccountExternalIdTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillingAccountExternalIdTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillingAccountExternalIdTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillingAccountExternalIdTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillingAccountExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillingAccountExternalIdTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillingAccountExternalIdTypeFilter filter value from a formatted string
   *
   * @param _value the BillingAccountExternalIdTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillingAccountExternalIdTypeFilter filter field
   */
  public void setBillingAccountExternalIdTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillingAccountExternalIdTypeFilterFromFormattedString");
    try {
      this.setBillingAccountExternalIdTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillingAccountExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillingAccountExternalIdTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillingAccountExternalIdTypeFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated BillingAccountExternalIdTypeFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the BillingAccountExternalIdTypeFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BillingAccountExternalIdTypeFilter filter field
   */
  public String[] getBillingAccountExternalIdTypeFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillingAccountExternalIdTypeFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getBillingAccountExternalIdTypeFilter(), "ExternalIdType", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillingAccountExternalIdTypeFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillingAccountExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillingAccountExternalIdTypeFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated BillingAccountExternalIdTypeFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BillingAccountExternalIdTypeFilter filter field
   */
  public void setBillingAccountExternalIdTypeFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillingAccountExternalIdTypeFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setBillingAccountExternalIdTypeFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "BillingAccountExternalIdType", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillingAccountExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillingAccountExternalIdTypeFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillingAccountExternalIdTypeFilterFromDisplayValue");
  }


  public String toString() {
    return ProductChargeMapObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return ProductChargeMapObjectHelper.toMap(this, null);
  }
}
