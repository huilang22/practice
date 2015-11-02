/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: SlaMeasurementDataObjectFilter.java
 * Definition File: Customer/SlaMeasurementData.xml
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
public class SlaMeasurementDataObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public SlaMeasurementDataObjectKeyFilter Key = null;
  /** raw field for: SLA_MEASUREMENT_DATA.account_no) */
  public    IntegerFilter[] AccountInternalId  = null;
  protected boolean AccountInternalIdFetch = false;
  protected boolean AccountInternalIdSortAscending = true;
  protected Integer AccountInternalIdSort = null;
  /** raw field for: SLA_MEASUREMENT_DATA.subscr_no) */
  public    IntegerFilter[] ServiceInternalId  = null;
  protected boolean ServiceInternalIdFetch = false;
  protected boolean ServiceInternalIdSortAscending = true;
  protected Integer ServiceInternalIdSort = null;
  /** raw field for: SLA_MEASUREMENT_DATA.subscr_no_resets) */
  public    IntegerFilter[] ServiceInternalIdResets  = null;
  protected boolean ServiceInternalIdResetsFetch = false;
  protected boolean ServiceInternalIdResetsSortAscending = true;
  protected Integer ServiceInternalIdResetsSort = null;
  /** raw field for: SLA_MEASUREMENT_DATA.bill_ref_no) */
  public    IntegerFilter[] BillRefNo  = null;
  protected boolean BillRefNoFetch = false;
  protected boolean BillRefNoSortAscending = true;
  protected Integer BillRefNoSort = null;
  /** raw field for: SLA_MEASUREMENT_DATA.bill_ref_resets) */
  public    IntegerFilter[] BillRefResets  = null;
  protected boolean BillRefResetsFetch = false;
  protected boolean BillRefResetsSortAscending = true;
  protected Integer BillRefResetsSort = null;
  /** raw field for: SLA_MEASUREMENT_DATA.sla_measurement_type_id) */
  public    IntegerFilter[] SlaMeasurementTypeId  = null;
  protected boolean SlaMeasurementTypeIdFetch = false;
  protected boolean SlaMeasurementTypeIdSortAscending = true;
  protected Integer SlaMeasurementTypeIdSort = null;
  /** raw field for: SLA_MEASUREMENT_DATA.measurement_value) */
  public    BigIntegerFilter[] MeasurementValue  = null;
  protected boolean MeasurementValueFetch = false;
  protected boolean MeasurementValueSortAscending = true;
  protected Integer MeasurementValueSort = null;
  /** raw field for: SLA_MEASUREMENT_DATA.sla_ext_id) */
  public    BigIntegerFilter[] SlaExtId  = null;
  protected boolean SlaExtIdFetch = false;
  protected boolean SlaExtIdSortAscending = true;
  protected Integer SlaExtIdSort = null;
  /** raw field for: SLA_MEASUREMENT_DATA.trans_dt) */
  public    DateFilter[] TransDt  = null;
  protected boolean TransDtFetch = false;
  protected boolean TransDtSortAscending = true;
  protected Integer TransDtSort = null;
  /** raw field for: SLA_MEASUREMENT_DATA.status) */
  public    IntegerFilter[] Status  = null;
  protected boolean StatusFetch = false;
  protected boolean StatusSortAscending = true;
  protected Integer StatusSort = null;
  /** raw field for: SLA_MEASUREMENT_DATA.entry_date) */
  public    DateFilter[] EntryDate  = null;
  protected boolean EntryDateFetch = false;
  protected boolean EntryDateSortAscending = true;
  protected Integer EntryDateSort = null;
  /** raw field for: SLA_MEASUREMENT_DATA.error_code) */
  public    IntegerFilter[] ErrorCode  = null;
  protected boolean ErrorCodeFetch = false;
  protected boolean ErrorCodeSortAscending = true;
  protected Integer ErrorCodeSort = null;
  /** raw field for: SLA_MEASUREMENT_DATA.sla_data_partition_key) */
  public    DateFilter[] SlaDataPartitionKey  = null;
  protected boolean SlaDataPartitionKeyFetch = false;
  protected boolean SlaDataPartitionKeySortAscending = true;
  protected Integer SlaDataPartitionKeySort = null;
  /** raw field for: SLA_MEASUREMENT_DATA.chg_date) */
  public    DateFilter[] ChgDate  = null;
  protected boolean ChgDateFetch = false;
  protected boolean ChgDateSortAscending = true;
  protected Integer ChgDateSort = null;
  /** raw field for: SLA_MEASUREMENT_DATA.chg_who) */
  public    StringFilter[] ChgWho  = null;
  protected boolean ChgWhoFetch = false;
  protected boolean ChgWhoSortAscending = true;
  protected boolean ChgWhoCaseInsensitive = false;
  protected Integer ChgWhoSort = null;
  private String _objName = "SlaMeasurementDataObjectFilter";
  /** default constructor */
  public SlaMeasurementDataObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public SlaMeasurementDataObjectFilter (SlaMeasurementDataObjectFilter other)
  {
    if (other == null) return;
    this.Key = new SlaMeasurementDataObjectKeyFilter (other.Key);
    this.AccountInternalId = other.AccountInternalId;
    this.AccountInternalIdFetch = other.AccountInternalIdFetch;
    this.AccountInternalIdSort = other.AccountInternalIdSort;
    this.AccountInternalIdSortAscending = other.AccountInternalIdSortAscending;
    this.ServiceInternalId = other.ServiceInternalId;
    this.ServiceInternalIdFetch = other.ServiceInternalIdFetch;
    this.ServiceInternalIdSort = other.ServiceInternalIdSort;
    this.ServiceInternalIdSortAscending = other.ServiceInternalIdSortAscending;
    this.ServiceInternalIdResets = other.ServiceInternalIdResets;
    this.ServiceInternalIdResetsFetch = other.ServiceInternalIdResetsFetch;
    this.ServiceInternalIdResetsSort = other.ServiceInternalIdResetsSort;
    this.ServiceInternalIdResetsSortAscending = other.ServiceInternalIdResetsSortAscending;
    this.BillRefNo = other.BillRefNo;
    this.BillRefNoFetch = other.BillRefNoFetch;
    this.BillRefNoSort = other.BillRefNoSort;
    this.BillRefNoSortAscending = other.BillRefNoSortAscending;
    this.BillRefResets = other.BillRefResets;
    this.BillRefResetsFetch = other.BillRefResetsFetch;
    this.BillRefResetsSort = other.BillRefResetsSort;
    this.BillRefResetsSortAscending = other.BillRefResetsSortAscending;
    this.SlaMeasurementTypeId = other.SlaMeasurementTypeId;
    this.SlaMeasurementTypeIdFetch = other.SlaMeasurementTypeIdFetch;
    this.SlaMeasurementTypeIdSort = other.SlaMeasurementTypeIdSort;
    this.SlaMeasurementTypeIdSortAscending = other.SlaMeasurementTypeIdSortAscending;
    this.MeasurementValue = other.MeasurementValue;
    this.MeasurementValueFetch = other.MeasurementValueFetch;
    this.MeasurementValueSort = other.MeasurementValueSort;
    this.MeasurementValueSortAscending = other.MeasurementValueSortAscending;
    this.SlaExtId = other.SlaExtId;
    this.SlaExtIdFetch = other.SlaExtIdFetch;
    this.SlaExtIdSort = other.SlaExtIdSort;
    this.SlaExtIdSortAscending = other.SlaExtIdSortAscending;
    this.TransDt = other.TransDt;
    this.TransDtFetch = other.TransDtFetch;
    this.TransDtSort = other.TransDtSort;
    this.TransDtSortAscending = other.TransDtSortAscending;
    this.Status = other.Status;
    this.StatusFetch = other.StatusFetch;
    this.StatusSort = other.StatusSort;
    this.StatusSortAscending = other.StatusSortAscending;
    this.EntryDate = other.EntryDate;
    this.EntryDateFetch = other.EntryDateFetch;
    this.EntryDateSort = other.EntryDateSort;
    this.EntryDateSortAscending = other.EntryDateSortAscending;
    this.ErrorCode = other.ErrorCode;
    this.ErrorCodeFetch = other.ErrorCodeFetch;
    this.ErrorCodeSort = other.ErrorCodeSort;
    this.ErrorCodeSortAscending = other.ErrorCodeSortAscending;
    this.SlaDataPartitionKey = other.SlaDataPartitionKey;
    this.SlaDataPartitionKeyFetch = other.SlaDataPartitionKeyFetch;
    this.SlaDataPartitionKeySort = other.SlaDataPartitionKeySort;
    this.SlaDataPartitionKeySortAscending = other.SlaDataPartitionKeySortAscending;
    this.ChgDate = other.ChgDate;
    this.ChgDateFetch = other.ChgDateFetch;
    this.ChgDateSort = other.ChgDateSort;
    this.ChgDateSortAscending = other.ChgDateSortAscending;
    this.ChgWho = other.ChgWho;
    this.ChgWhoFetch = other.ChgWhoFetch;
    this.ChgWhoSort = other.ChgWhoSort;
    this.ChgWhoCaseInsensitive = other.ChgWhoCaseInsensitive;
    this.ChgWhoSortAscending = other.ChgWhoSortAscending;  }
  /** get the filter for this object's key
   * @return SlaMeasurementDataObjectKeyFilter
   */
  public SlaMeasurementDataObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (SlaMeasurementDataObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: SlaMsmTrackingId (SLA_MEASUREMENT_DATA.sla_msm_tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setSlaMsmTrackingIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new SlaMeasurementDataObjectKeyFilter ();
    this.Key.SlaMsmTrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: SlaMsmTrackingId (SLA_MEASUREMENT_DATA.sla_msm_tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getSlaMsmTrackingIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.SlaMsmTrackingIdFetch;
  }
  /** Set the SortOrder for field: SlaMsmTrackingId (SLA_MEASUREMENT_DATA.sla_msm_tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSlaMsmTrackingIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new SlaMeasurementDataObjectKeyFilter ();
    this.Key.SlaMsmTrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: SlaMsmTrackingId (SLA_MEASUREMENT_DATA.sla_msm_tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSlaMsmTrackingIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.SlaMsmTrackingIdSort;
  }
  /** Set the sort direction for field: SlaMsmTrackingId (SLA_MEASUREMENT_DATA.sla_msm_tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSlaMsmTrackingIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new SlaMeasurementDataObjectKeyFilter ();
    this.Key.SlaMsmTrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SlaMsmTrackingId (SLA_MEASUREMENT_DATA.sla_msm_tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSlaMsmTrackingIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.SlaMsmTrackingIdSortAscending;
  }
  /** Set the field level filters for field: SlaMsmTrackingId (SLA_MEASUREMENT_DATA.sla_msm_tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSlaMsmTrackingIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new SlaMeasurementDataObjectKeyFilter ();
    this.Key.SlaMsmTrackingId = value;
  }
  /** Retrieve filter for field: SlaMsmTrackingId (SLA_MEASUREMENT_DATA.sla_msm_tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getSlaMsmTrackingIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.SlaMsmTrackingId;
  }
  /** Set the field level Fetch value for field: SlaMsmTrackingIdServ (SLA_MEASUREMENT_DATA.sla_msm_tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setSlaMsmTrackingIdServFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new SlaMeasurementDataObjectKeyFilter ();
    this.Key.SlaMsmTrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: SlaMsmTrackingIdServ (SLA_MEASUREMENT_DATA.sla_msm_tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getSlaMsmTrackingIdServFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.SlaMsmTrackingIdServFetch;
  }
  /** Set the SortOrder for field: SlaMsmTrackingIdServ (SLA_MEASUREMENT_DATA.sla_msm_tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSlaMsmTrackingIdServSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new SlaMeasurementDataObjectKeyFilter ();
    this.Key.SlaMsmTrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: SlaMsmTrackingIdServ (SLA_MEASUREMENT_DATA.sla_msm_tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSlaMsmTrackingIdServSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.SlaMsmTrackingIdServSort;
  }
  /** Set the sort direction for field: SlaMsmTrackingIdServ (SLA_MEASUREMENT_DATA.sla_msm_tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSlaMsmTrackingIdServSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new SlaMeasurementDataObjectKeyFilter ();
    this.Key.SlaMsmTrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SlaMsmTrackingIdServ (SLA_MEASUREMENT_DATA.sla_msm_tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSlaMsmTrackingIdServSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.SlaMsmTrackingIdServSortAscending;
  }
  /** Set the field level filters for field: SlaMsmTrackingIdServ (SLA_MEASUREMENT_DATA.sla_msm_tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSlaMsmTrackingIdServFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new SlaMeasurementDataObjectKeyFilter ();
    this.Key.SlaMsmTrackingIdServ = value;
  }
  /** Retrieve filter for field: SlaMsmTrackingIdServ (SLA_MEASUREMENT_DATA.sla_msm_tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getSlaMsmTrackingIdServFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.SlaMsmTrackingIdServ;
  }
  /** Set the field level Fetch value for field: AccountInternalId (SLA_MEASUREMENT_DATA.account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountInternalIdFetch (boolean fetch) {
    this.AccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountInternalId (SLA_MEASUREMENT_DATA.account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountInternalIdFetch () {
    return this.AccountInternalIdFetch;
  }
  /** Set the SortOrder for field: AccountInternalId (SLA_MEASUREMENT_DATA.account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountInternalIdSortOrder (Integer value) {
    this.AccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountInternalId (SLA_MEASUREMENT_DATA.account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountInternalIdSortOrder () {
    return this.AccountInternalIdSort;
  }
  /** Set the sort direction for field: AccountInternalId (SLA_MEASUREMENT_DATA.account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountInternalIdSortDirection (boolean ascending) {
    this.AccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountInternalId (SLA_MEASUREMENT_DATA.account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountInternalIdSortDirection () {
    return this.AccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: AccountInternalId (SLA_MEASUREMENT_DATA.account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.AccountInternalId = value;
  }
  /** Retrieve filter for field: AccountInternalId (SLA_MEASUREMENT_DATA.account_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAccountInternalIdFilter () {
    return this.AccountInternalId;
  }

  /**
   * Retrieves the AccountInternalIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AccountInternalIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountInternalIdFilter field
   */
  public String[] getAccountInternalIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountInternalIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAccountInternalIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountInternalIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountInternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountInternalIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AccountInternalIdFilter filter value from a formatted string
   *
   * @param _value the AccountInternalIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AccountInternalIdFilter filter field
   */
  public void setAccountInternalIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountInternalIdFilterFromFormattedString");
    try {
      this.setAccountInternalIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountInternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountInternalIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountInternalIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ServiceInternalId (SLA_MEASUREMENT_DATA.subscr_no)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceInternalIdFetch (boolean fetch) {
    this.ServiceInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceInternalId (SLA_MEASUREMENT_DATA.subscr_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceInternalIdFetch () {
    return this.ServiceInternalIdFetch;
  }
  /** Set the SortOrder for field: ServiceInternalId (SLA_MEASUREMENT_DATA.subscr_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceInternalIdSortOrder (Integer value) {
    this.ServiceInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: ServiceInternalId (SLA_MEASUREMENT_DATA.subscr_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceInternalIdSortOrder () {
    return this.ServiceInternalIdSort;
  }
  /** Set the sort direction for field: ServiceInternalId (SLA_MEASUREMENT_DATA.subscr_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceInternalIdSortDirection (boolean ascending) {
    this.ServiceInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceInternalId (SLA_MEASUREMENT_DATA.subscr_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceInternalIdSortDirection () {
    return this.ServiceInternalIdSortAscending;
  }
  /** Set the field level filters for field: ServiceInternalId (SLA_MEASUREMENT_DATA.subscr_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ServiceInternalId = value;
  }
  /** Retrieve filter for field: ServiceInternalId (SLA_MEASUREMENT_DATA.subscr_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getServiceInternalIdFilter () {
    return this.ServiceInternalId;
  }

  /**
   * Retrieves the ServiceInternalIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServiceInternalIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceInternalIdFilter field
   */
  public String[] getServiceInternalIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceInternalIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getServiceInternalIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceInternalIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceInternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceInternalIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ServiceInternalIdFilter filter value from a formatted string
   *
   * @param _value the ServiceInternalIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ServiceInternalIdFilter filter field
   */
  public void setServiceInternalIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceInternalIdFilterFromFormattedString");
    try {
      this.setServiceInternalIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceInternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceInternalIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceInternalIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ServiceInternalIdResets (SLA_MEASUREMENT_DATA.subscr_no_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceInternalIdResetsFetch (boolean fetch) {
    this.ServiceInternalIdResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceInternalIdResets (SLA_MEASUREMENT_DATA.subscr_no_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceInternalIdResetsFetch () {
    return this.ServiceInternalIdResetsFetch;
  }
  /** Set the SortOrder for field: ServiceInternalIdResets (SLA_MEASUREMENT_DATA.subscr_no_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceInternalIdResetsSortOrder (Integer value) {
    this.ServiceInternalIdResetsSort = value;
  }
  /** Retrieve SortOrder for field: ServiceInternalIdResets (SLA_MEASUREMENT_DATA.subscr_no_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceInternalIdResetsSortOrder () {
    return this.ServiceInternalIdResetsSort;
  }
  /** Set the sort direction for field: ServiceInternalIdResets (SLA_MEASUREMENT_DATA.subscr_no_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceInternalIdResetsSortDirection (boolean ascending) {
    this.ServiceInternalIdResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceInternalIdResets (SLA_MEASUREMENT_DATA.subscr_no_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceInternalIdResetsSortDirection () {
    return this.ServiceInternalIdResetsSortAscending;
  }
  /** Set the field level filters for field: ServiceInternalIdResets (SLA_MEASUREMENT_DATA.subscr_no_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceInternalIdResetsFilter (IntegerFilter[] value) throws ServiceException {
    this.ServiceInternalIdResets = value;
  }
  /** Retrieve filter for field: ServiceInternalIdResets (SLA_MEASUREMENT_DATA.subscr_no_resets)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getServiceInternalIdResetsFilter () {
    return this.ServiceInternalIdResets;
  }

  /**
   * Retrieves the ServiceInternalIdResetsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServiceInternalIdResetsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceInternalIdResetsFilter field
   */
  public String[] getServiceInternalIdResetsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceInternalIdResetsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getServiceInternalIdResetsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceInternalIdResetsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceInternalIdResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceInternalIdResetsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ServiceInternalIdResetsFilter filter value from a formatted string
   *
   * @param _value the ServiceInternalIdResetsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ServiceInternalIdResetsFilter filter field
   */
  public void setServiceInternalIdResetsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceInternalIdResetsFilterFromFormattedString");
    try {
      this.setServiceInternalIdResetsFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceInternalIdResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceInternalIdResetsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceInternalIdResetsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillRefNo (SLA_MEASUREMENT_DATA.bill_ref_no)
   * @param fetch whether to fetch this field or not
   */
  public void setBillRefNoFetch (boolean fetch) {
    this.BillRefNoFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillRefNo (SLA_MEASUREMENT_DATA.bill_ref_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillRefNoFetch () {
    return this.BillRefNoFetch;
  }
  /** Set the SortOrder for field: BillRefNo (SLA_MEASUREMENT_DATA.bill_ref_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillRefNoSortOrder (Integer value) {
    this.BillRefNoSort = value;
  }
  /** Retrieve SortOrder for field: BillRefNo (SLA_MEASUREMENT_DATA.bill_ref_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillRefNoSortOrder () {
    return this.BillRefNoSort;
  }
  /** Set the sort direction for field: BillRefNo (SLA_MEASUREMENT_DATA.bill_ref_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillRefNoSortDirection (boolean ascending) {
    this.BillRefNoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillRefNo (SLA_MEASUREMENT_DATA.bill_ref_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillRefNoSortDirection () {
    return this.BillRefNoSortAscending;
  }
  /** Set the field level filters for field: BillRefNo (SLA_MEASUREMENT_DATA.bill_ref_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillRefNoFilter (IntegerFilter[] value) throws ServiceException {
    this.BillRefNo = value;
  }
  /** Retrieve filter for field: BillRefNo (SLA_MEASUREMENT_DATA.bill_ref_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillRefNoFilter () {
    return this.BillRefNo;
  }

  /**
   * Retrieves the BillRefNoFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillRefNoFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillRefNoFilter field
   */
  public String[] getBillRefNoFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillRefNoFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillRefNoFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillRefNoFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillRefNoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillRefNoFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillRefNoFilter filter value from a formatted string
   *
   * @param _value the BillRefNoFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillRefNoFilter filter field
   */
  public void setBillRefNoFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillRefNoFilterFromFormattedString");
    try {
      this.setBillRefNoFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillRefNoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillRefNoFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillRefNoFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillRefResets (SLA_MEASUREMENT_DATA.bill_ref_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setBillRefResetsFetch (boolean fetch) {
    this.BillRefResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillRefResets (SLA_MEASUREMENT_DATA.bill_ref_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillRefResetsFetch () {
    return this.BillRefResetsFetch;
  }
  /** Set the SortOrder for field: BillRefResets (SLA_MEASUREMENT_DATA.bill_ref_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillRefResetsSortOrder (Integer value) {
    this.BillRefResetsSort = value;
  }
  /** Retrieve SortOrder for field: BillRefResets (SLA_MEASUREMENT_DATA.bill_ref_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillRefResetsSortOrder () {
    return this.BillRefResetsSort;
  }
  /** Set the sort direction for field: BillRefResets (SLA_MEASUREMENT_DATA.bill_ref_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillRefResetsSortDirection (boolean ascending) {
    this.BillRefResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillRefResets (SLA_MEASUREMENT_DATA.bill_ref_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillRefResetsSortDirection () {
    return this.BillRefResetsSortAscending;
  }
  /** Set the field level filters for field: BillRefResets (SLA_MEASUREMENT_DATA.bill_ref_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillRefResetsFilter (IntegerFilter[] value) throws ServiceException {
    this.BillRefResets = value;
  }
  /** Retrieve filter for field: BillRefResets (SLA_MEASUREMENT_DATA.bill_ref_resets)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillRefResetsFilter () {
    return this.BillRefResets;
  }

  /**
   * Retrieves the BillRefResetsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillRefResetsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillRefResetsFilter field
   */
  public String[] getBillRefResetsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillRefResetsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillRefResetsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillRefResetsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillRefResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillRefResetsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillRefResetsFilter filter value from a formatted string
   *
   * @param _value the BillRefResetsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillRefResetsFilter filter field
   */
  public void setBillRefResetsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillRefResetsFilterFromFormattedString");
    try {
      this.setBillRefResetsFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillRefResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillRefResetsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillRefResetsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: SlaMeasurementTypeId (SLA_MEASUREMENT_DATA.sla_measurement_type_id)
   * @param fetch whether to fetch this field or not
   */
  public void setSlaMeasurementTypeIdFetch (boolean fetch) {
    this.SlaMeasurementTypeIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: SlaMeasurementTypeId (SLA_MEASUREMENT_DATA.sla_measurement_type_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getSlaMeasurementTypeIdFetch () {
    return this.SlaMeasurementTypeIdFetch;
  }
  /** Set the SortOrder for field: SlaMeasurementTypeId (SLA_MEASUREMENT_DATA.sla_measurement_type_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSlaMeasurementTypeIdSortOrder (Integer value) {
    this.SlaMeasurementTypeIdSort = value;
  }
  /** Retrieve SortOrder for field: SlaMeasurementTypeId (SLA_MEASUREMENT_DATA.sla_measurement_type_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSlaMeasurementTypeIdSortOrder () {
    return this.SlaMeasurementTypeIdSort;
  }
  /** Set the sort direction for field: SlaMeasurementTypeId (SLA_MEASUREMENT_DATA.sla_measurement_type_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSlaMeasurementTypeIdSortDirection (boolean ascending) {
    this.SlaMeasurementTypeIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SlaMeasurementTypeId (SLA_MEASUREMENT_DATA.sla_measurement_type_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSlaMeasurementTypeIdSortDirection () {
    return this.SlaMeasurementTypeIdSortAscending;
  }
  /** Set the field level filters for field: SlaMeasurementTypeId (SLA_MEASUREMENT_DATA.sla_measurement_type_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSlaMeasurementTypeIdFilter (IntegerFilter[] value) throws ServiceException {
    this.SlaMeasurementTypeId = value;
  }
  /** Retrieve filter for field: SlaMeasurementTypeId (SLA_MEASUREMENT_DATA.sla_measurement_type_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getSlaMeasurementTypeIdFilter () {
    return this.SlaMeasurementTypeId;
  }

  /**
   * Retrieves the SlaMeasurementTypeIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SlaMeasurementTypeIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SlaMeasurementTypeIdFilter field
   */
  public String[] getSlaMeasurementTypeIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSlaMeasurementTypeIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSlaMeasurementTypeIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSlaMeasurementTypeIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SlaMeasurementTypeIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSlaMeasurementTypeIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SlaMeasurementTypeIdFilter filter value from a formatted string
   *
   * @param _value the SlaMeasurementTypeIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SlaMeasurementTypeIdFilter filter field
   */
  public void setSlaMeasurementTypeIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSlaMeasurementTypeIdFilterFromFormattedString");
    try {
      this.setSlaMeasurementTypeIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SlaMeasurementTypeIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSlaMeasurementTypeIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSlaMeasurementTypeIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: MeasurementValue (SLA_MEASUREMENT_DATA.measurement_value)
   * @param fetch whether to fetch this field or not
   */
  public void setMeasurementValueFetch (boolean fetch) {
    this.MeasurementValueFetch = fetch;
  }
  /** Retrieve Fetch value for field: MeasurementValue (SLA_MEASUREMENT_DATA.measurement_value)
   * @return boolean the Fetch value for this field
   */
  public boolean getMeasurementValueFetch () {
    return this.MeasurementValueFetch;
  }
  /** Set the SortOrder for field: MeasurementValue (SLA_MEASUREMENT_DATA.measurement_value)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMeasurementValueSortOrder (Integer value) {
    this.MeasurementValueSort = value;
  }
  /** Retrieve SortOrder for field: MeasurementValue (SLA_MEASUREMENT_DATA.measurement_value)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMeasurementValueSortOrder () {
    return this.MeasurementValueSort;
  }
  /** Set the sort direction for field: MeasurementValue (SLA_MEASUREMENT_DATA.measurement_value)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMeasurementValueSortDirection (boolean ascending) {
    this.MeasurementValueSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MeasurementValue (SLA_MEASUREMENT_DATA.measurement_value)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMeasurementValueSortDirection () {
    return this.MeasurementValueSortAscending;
  }
  /** Set the field level filters for field: MeasurementValue (SLA_MEASUREMENT_DATA.measurement_value)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMeasurementValueFilter (BigIntegerFilter[] value) throws ServiceException {
    this.MeasurementValue = value;
  }
  /** Retrieve filter for field: MeasurementValue (SLA_MEASUREMENT_DATA.measurement_value)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getMeasurementValueFilter () {
    return this.MeasurementValue;
  }

  /**
   * Retrieves the MeasurementValueFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MeasurementValueFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MeasurementValueFilter field
   */
  public String[] getMeasurementValueFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMeasurementValueFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMeasurementValueFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMeasurementValueFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MeasurementValueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMeasurementValueFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MeasurementValueFilter filter value from a formatted string
   *
   * @param _value the MeasurementValueFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MeasurementValueFilter filter field
   */
  public void setMeasurementValueFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMeasurementValueFilterFromFormattedString");
    try {
      this.setMeasurementValueFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MeasurementValueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMeasurementValueFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMeasurementValueFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: SlaExtId (SLA_MEASUREMENT_DATA.sla_ext_id)
   * @param fetch whether to fetch this field or not
   */
  public void setSlaExtIdFetch (boolean fetch) {
    this.SlaExtIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: SlaExtId (SLA_MEASUREMENT_DATA.sla_ext_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getSlaExtIdFetch () {
    return this.SlaExtIdFetch;
  }
  /** Set the SortOrder for field: SlaExtId (SLA_MEASUREMENT_DATA.sla_ext_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSlaExtIdSortOrder (Integer value) {
    this.SlaExtIdSort = value;
  }
  /** Retrieve SortOrder for field: SlaExtId (SLA_MEASUREMENT_DATA.sla_ext_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSlaExtIdSortOrder () {
    return this.SlaExtIdSort;
  }
  /** Set the sort direction for field: SlaExtId (SLA_MEASUREMENT_DATA.sla_ext_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSlaExtIdSortDirection (boolean ascending) {
    this.SlaExtIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SlaExtId (SLA_MEASUREMENT_DATA.sla_ext_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSlaExtIdSortDirection () {
    return this.SlaExtIdSortAscending;
  }
  /** Set the field level filters for field: SlaExtId (SLA_MEASUREMENT_DATA.sla_ext_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSlaExtIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.SlaExtId = value;
  }
  /** Retrieve filter for field: SlaExtId (SLA_MEASUREMENT_DATA.sla_ext_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getSlaExtIdFilter () {
    return this.SlaExtId;
  }

  /**
   * Retrieves the SlaExtIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SlaExtIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SlaExtIdFilter field
   */
  public String[] getSlaExtIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSlaExtIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSlaExtIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSlaExtIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SlaExtIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSlaExtIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SlaExtIdFilter filter value from a formatted string
   *
   * @param _value the SlaExtIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SlaExtIdFilter filter field
   */
  public void setSlaExtIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSlaExtIdFilterFromFormattedString");
    try {
      this.setSlaExtIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SlaExtIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSlaExtIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSlaExtIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TransDt (SLA_MEASUREMENT_DATA.trans_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setTransDtFetch (boolean fetch) {
    this.TransDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: TransDt (SLA_MEASUREMENT_DATA.trans_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getTransDtFetch () {
    return this.TransDtFetch;
  }
  /** Set the SortOrder for field: TransDt (SLA_MEASUREMENT_DATA.trans_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTransDtSortOrder (Integer value) {
    this.TransDtSort = value;
  }
  /** Retrieve SortOrder for field: TransDt (SLA_MEASUREMENT_DATA.trans_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTransDtSortOrder () {
    return this.TransDtSort;
  }
  /** Set the sort direction for field: TransDt (SLA_MEASUREMENT_DATA.trans_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTransDtSortDirection (boolean ascending) {
    this.TransDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TransDt (SLA_MEASUREMENT_DATA.trans_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTransDtSortDirection () {
    return this.TransDtSortAscending;
  }
  /** Set the field level filters for field: TransDt (SLA_MEASUREMENT_DATA.trans_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTransDtFilter (DateFilter[] value) throws ServiceException {
    this.TransDt = value;
  }
  /** Retrieve filter for field: TransDt (SLA_MEASUREMENT_DATA.trans_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getTransDtFilter () {
    return this.TransDt;
  }

  /**
   * Retrieves the TransDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransDtFilter field
   */
  public String[] getTransDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTransDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TransDtFilter filter value from a formatted string
   *
   * @param _value the TransDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TransDtFilter filter field
   */
  public void setTransDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransDtFilterFromFormattedString");
    try {
      this.setTransDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransDtFilterFromFormattedString");
  }

  /**
   * Retrieves the TransDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransDtFilter field
   */
  public String[] getTransDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTransDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the TransDtFilter filter value from a formatted string
   *
   * @param _value the TransDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TransDtFilter filter field
   */
  public void setTransDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransDtFilterFromFormattedDateTimeString");
    try {
      this.setTransDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: Status (SLA_MEASUREMENT_DATA.status)
   * @param fetch whether to fetch this field or not
   */
  public void setStatusFetch (boolean fetch) {
    this.StatusFetch = fetch;
  }
  /** Retrieve Fetch value for field: Status (SLA_MEASUREMENT_DATA.status)
   * @return boolean the Fetch value for this field
   */
  public boolean getStatusFetch () {
    return this.StatusFetch;
  }
  /** Set the SortOrder for field: Status (SLA_MEASUREMENT_DATA.status)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStatusSortOrder (Integer value) {
    this.StatusSort = value;
  }
  /** Retrieve SortOrder for field: Status (SLA_MEASUREMENT_DATA.status)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStatusSortOrder () {
    return this.StatusSort;
  }
  /** Set the sort direction for field: Status (SLA_MEASUREMENT_DATA.status)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStatusSortDirection (boolean ascending) {
    this.StatusSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Status (SLA_MEASUREMENT_DATA.status)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStatusSortDirection () {
    return this.StatusSortAscending;
  }
  /** Set the field level filters for field: Status (SLA_MEASUREMENT_DATA.status)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStatusFilter (IntegerFilter[] value) throws ServiceException {
    this.Status = value;
  }
  /** Retrieve filter for field: Status (SLA_MEASUREMENT_DATA.status)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getStatusFilter () {
    return this.Status;
  }

  /**
   * Retrieves the StatusFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StatusFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatusFilter field
   */
  public String[] getStatusFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getStatusFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatusFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatusFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the StatusFilter filter value from a formatted string
   *
   * @param _value the StatusFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the StatusFilter filter field
   */
  public void setStatusFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStatusFilterFromFormattedString");
    try {
      this.setStatusFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatusFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatusFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: EntryDate (SLA_MEASUREMENT_DATA.entry_date)
   * @param fetch whether to fetch this field or not
   */
  public void setEntryDateFetch (boolean fetch) {
    this.EntryDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: EntryDate (SLA_MEASUREMENT_DATA.entry_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getEntryDateFetch () {
    return this.EntryDateFetch;
  }
  /** Set the SortOrder for field: EntryDate (SLA_MEASUREMENT_DATA.entry_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEntryDateSortOrder (Integer value) {
    this.EntryDateSort = value;
  }
  /** Retrieve SortOrder for field: EntryDate (SLA_MEASUREMENT_DATA.entry_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEntryDateSortOrder () {
    return this.EntryDateSort;
  }
  /** Set the sort direction for field: EntryDate (SLA_MEASUREMENT_DATA.entry_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEntryDateSortDirection (boolean ascending) {
    this.EntryDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EntryDate (SLA_MEASUREMENT_DATA.entry_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEntryDateSortDirection () {
    return this.EntryDateSortAscending;
  }
  /** Set the field level filters for field: EntryDate (SLA_MEASUREMENT_DATA.entry_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEntryDateFilter (DateFilter[] value) throws ServiceException {
    this.EntryDate = value;
  }
  /** Retrieve filter for field: EntryDate (SLA_MEASUREMENT_DATA.entry_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getEntryDateFilter () {
    return this.EntryDate;
  }

  /**
   * Retrieves the EntryDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EntryDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EntryDateFilter field
   */
  public String[] getEntryDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEntryDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEntryDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEntryDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EntryDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEntryDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EntryDateFilter filter value from a formatted string
   *
   * @param _value the EntryDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EntryDateFilter filter field
   */
  public void setEntryDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEntryDateFilterFromFormattedString");
    try {
      this.setEntryDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EntryDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEntryDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEntryDateFilterFromFormattedString");
  }

  /**
   * Retrieves the EntryDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EntryDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the EntryDateFilter field
   */
  public String[] getEntryDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEntryDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEntryDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEntryDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EntryDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEntryDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the EntryDateFilter filter value from a formatted string
   *
   * @param _value the EntryDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EntryDateFilter filter field
   */
  public void setEntryDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEntryDateFilterFromFormattedDateTimeString");
    try {
      this.setEntryDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EntryDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEntryDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEntryDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: ErrorCode (SLA_MEASUREMENT_DATA.error_code)
   * @param fetch whether to fetch this field or not
   */
  public void setErrorCodeFetch (boolean fetch) {
    this.ErrorCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ErrorCode (SLA_MEASUREMENT_DATA.error_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getErrorCodeFetch () {
    return this.ErrorCodeFetch;
  }
  /** Set the SortOrder for field: ErrorCode (SLA_MEASUREMENT_DATA.error_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setErrorCodeSortOrder (Integer value) {
    this.ErrorCodeSort = value;
  }
  /** Retrieve SortOrder for field: ErrorCode (SLA_MEASUREMENT_DATA.error_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getErrorCodeSortOrder () {
    return this.ErrorCodeSort;
  }
  /** Set the sort direction for field: ErrorCode (SLA_MEASUREMENT_DATA.error_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setErrorCodeSortDirection (boolean ascending) {
    this.ErrorCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ErrorCode (SLA_MEASUREMENT_DATA.error_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getErrorCodeSortDirection () {
    return this.ErrorCodeSortAscending;
  }
  /** Set the field level filters for field: ErrorCode (SLA_MEASUREMENT_DATA.error_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setErrorCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.ErrorCode = value;
  }
  /** Retrieve filter for field: ErrorCode (SLA_MEASUREMENT_DATA.error_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getErrorCodeFilter () {
    return this.ErrorCode;
  }

  /**
   * Retrieves the ErrorCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ErrorCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ErrorCodeFilter field
   */
  public String[] getErrorCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getErrorCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getErrorCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getErrorCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ErrorCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getErrorCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ErrorCodeFilter filter value from a formatted string
   *
   * @param _value the ErrorCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ErrorCodeFilter filter field
   */
  public void setErrorCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setErrorCodeFilterFromFormattedString");
    try {
      this.setErrorCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ErrorCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setErrorCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setErrorCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: SlaDataPartitionKey (SLA_MEASUREMENT_DATA.sla_data_partition_key)
   * @param fetch whether to fetch this field or not
   */
  public void setSlaDataPartitionKeyFetch (boolean fetch) {
    this.SlaDataPartitionKeyFetch = fetch;
  }
  /** Retrieve Fetch value for field: SlaDataPartitionKey (SLA_MEASUREMENT_DATA.sla_data_partition_key)
   * @return boolean the Fetch value for this field
   */
  public boolean getSlaDataPartitionKeyFetch () {
    return this.SlaDataPartitionKeyFetch;
  }
  /** Set the SortOrder for field: SlaDataPartitionKey (SLA_MEASUREMENT_DATA.sla_data_partition_key)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSlaDataPartitionKeySortOrder (Integer value) {
    this.SlaDataPartitionKeySort = value;
  }
  /** Retrieve SortOrder for field: SlaDataPartitionKey (SLA_MEASUREMENT_DATA.sla_data_partition_key)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSlaDataPartitionKeySortOrder () {
    return this.SlaDataPartitionKeySort;
  }
  /** Set the sort direction for field: SlaDataPartitionKey (SLA_MEASUREMENT_DATA.sla_data_partition_key)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSlaDataPartitionKeySortDirection (boolean ascending) {
    this.SlaDataPartitionKeySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SlaDataPartitionKey (SLA_MEASUREMENT_DATA.sla_data_partition_key)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSlaDataPartitionKeySortDirection () {
    return this.SlaDataPartitionKeySortAscending;
  }
  /** Set the field level filters for field: SlaDataPartitionKey (SLA_MEASUREMENT_DATA.sla_data_partition_key)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSlaDataPartitionKeyFilter (DateFilter[] value) throws ServiceException {
    this.SlaDataPartitionKey = value;
  }
  /** Retrieve filter for field: SlaDataPartitionKey (SLA_MEASUREMENT_DATA.sla_data_partition_key)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getSlaDataPartitionKeyFilter () {
    return this.SlaDataPartitionKey;
  }

  /**
   * Retrieves the SlaDataPartitionKeyFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SlaDataPartitionKeyFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SlaDataPartitionKeyFilter field
   */
  public String[] getSlaDataPartitionKeyFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSlaDataPartitionKeyFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSlaDataPartitionKeyFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSlaDataPartitionKeyFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SlaDataPartitionKeyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSlaDataPartitionKeyFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SlaDataPartitionKeyFilter filter value from a formatted string
   *
   * @param _value the SlaDataPartitionKeyFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SlaDataPartitionKeyFilter filter field
   */
  public void setSlaDataPartitionKeyFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSlaDataPartitionKeyFilterFromFormattedString");
    try {
      this.setSlaDataPartitionKeyFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SlaDataPartitionKeyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSlaDataPartitionKeyFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSlaDataPartitionKeyFilterFromFormattedString");
  }

  /**
   * Retrieves the SlaDataPartitionKeyFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SlaDataPartitionKeyFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the SlaDataPartitionKeyFilter field
   */
  public String[] getSlaDataPartitionKeyFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSlaDataPartitionKeyFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSlaDataPartitionKeyFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSlaDataPartitionKeyFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SlaDataPartitionKeyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSlaDataPartitionKeyFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the SlaDataPartitionKeyFilter filter value from a formatted string
   *
   * @param _value the SlaDataPartitionKeyFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SlaDataPartitionKeyFilter filter field
   */
  public void setSlaDataPartitionKeyFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSlaDataPartitionKeyFilterFromFormattedDateTimeString");
    try {
      this.setSlaDataPartitionKeyFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SlaDataPartitionKeyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSlaDataPartitionKeyFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSlaDataPartitionKeyFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: ChgDate (SLA_MEASUREMENT_DATA.chg_date)
   * @param fetch whether to fetch this field or not
   */
  public void setChgDateFetch (boolean fetch) {
    this.ChgDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgDate (SLA_MEASUREMENT_DATA.chg_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgDateFetch () {
    return this.ChgDateFetch;
  }
  /** Set the SortOrder for field: ChgDate (SLA_MEASUREMENT_DATA.chg_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgDateSortOrder (Integer value) {
    this.ChgDateSort = value;
  }
  /** Retrieve SortOrder for field: ChgDate (SLA_MEASUREMENT_DATA.chg_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgDateSortOrder () {
    return this.ChgDateSort;
  }
  /** Set the sort direction for field: ChgDate (SLA_MEASUREMENT_DATA.chg_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgDateSortDirection (boolean ascending) {
    this.ChgDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgDate (SLA_MEASUREMENT_DATA.chg_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgDateSortDirection () {
    return this.ChgDateSortAscending;
  }
  /** Set the field level filters for field: ChgDate (SLA_MEASUREMENT_DATA.chg_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgDateFilter (DateFilter[] value) throws ServiceException {
    this.ChgDate = value;
  }
  /** Retrieve filter for field: ChgDate (SLA_MEASUREMENT_DATA.chg_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getChgDateFilter () {
    return this.ChgDate;
  }

  /**
   * Retrieves the ChgDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDateFilter field
   */
  public String[] getChgDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getChgDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ChgDateFilter filter value from a formatted string
   *
   * @param _value the ChgDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ChgDateFilter filter field
   */
  public void setChgDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgDateFilterFromFormattedString");
    try {
      this.setChgDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgDateFilterFromFormattedString");
  }

  /**
   * Retrieves the ChgDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDateFilter field
   */
  public String[] getChgDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getChgDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ChgDateFilter filter value from a formatted string
   *
   * @param _value the ChgDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ChgDateFilter filter field
   */
  public void setChgDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgDateFilterFromFormattedDateTimeString");
    try {
      this.setChgDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: ChgWho (SLA_MEASUREMENT_DATA.chg_who)
   * @param fetch whether to fetch this field or not
   */
  public void setChgWhoFetch (boolean fetch) {
    this.ChgWhoFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgWho (SLA_MEASUREMENT_DATA.chg_who)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgWhoFetch () {
    return this.ChgWhoFetch;
  }
  /** Set the SortOrder for field: ChgWho (SLA_MEASUREMENT_DATA.chg_who)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgWhoSortOrder (Integer value) {
    this.ChgWhoSort = value;
  }
  /** Retrieve SortOrder for field: ChgWho (SLA_MEASUREMENT_DATA.chg_who)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgWhoSortOrder () {
    return this.ChgWhoSort;
  }
  /** Set the sort direction for field: ChgWho (SLA_MEASUREMENT_DATA.chg_who)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgWhoSortDirection (boolean ascending) {
    this.ChgWhoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgWho (SLA_MEASUREMENT_DATA.chg_who)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgWhoSortDirection () {
    return this.ChgWhoSortAscending;
  }
  /** Set the case insensitive for field: ChgWho (SLA_MEASUREMENT_DATA.chg_who)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setChgWhoCaseInsensitive (boolean ascending) {
    this.ChgWhoCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ChgWho (SLA_MEASUREMENT_DATA.chg_who)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getChgWhoCaseInsensitive () {
    return this.ChgWhoCaseInsensitive;
  }
  /** Set the field level filters for field: ChgWho (SLA_MEASUREMENT_DATA.chg_who)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgWhoFilter (StringFilter[] value) throws ServiceException {
    this.ChgWho = value;
  }
  /** Retrieve filter for field: ChgWho (SLA_MEASUREMENT_DATA.chg_who)
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
    return SlaMeasurementDataObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return SlaMeasurementDataObjectHelper.toMap(this, null);
  }
}
