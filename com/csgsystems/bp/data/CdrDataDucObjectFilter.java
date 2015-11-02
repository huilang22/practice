/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CdrDataDucObjectFilter.java
 * Definition File: Customer/CdrDataDuc.xml
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
public class CdrDataDucObjectFilter  extends BaseFilter  implements Serializable
{
  /** raw field for: CDR_DATA_DUC.cdr_data_partition_key) */
  public    DateFilter[] CdrDataPartitionKey  = null;
  protected boolean CdrDataPartitionKeyFetch = false;
  protected boolean CdrDataPartitionKeySortAscending = true;
  protected Integer CdrDataPartitionKeySort = null;
  /** raw field for: CDR_DATA_DUC.msg_id) */
  public    IntegerFilter[] MsgId  = null;
  protected boolean MsgIdFetch = false;
  protected boolean MsgIdSortAscending = true;
  protected Integer MsgIdSort = null;
  /** raw field for: CDR_DATA_DUC.msg_id2) */
  public    IntegerFilter[] MsgId2  = null;
  protected boolean MsgId2Fetch = false;
  protected boolean MsgId2SortAscending = true;
  protected Integer MsgId2Sort = null;
  /** raw field for: CDR_DATA_DUC.msg_id_serv) */
  public    IntegerFilter[] MsgIdServ  = null;
  protected boolean MsgIdServFetch = false;
  protected boolean MsgIdServSortAscending = true;
  protected Integer MsgIdServSort = null;
  /** raw field for: CDR_DATA_DUC.split_row_num) */
  public    IntegerFilter[] SplitRowNum  = null;
  protected boolean SplitRowNumFetch = false;
  protected boolean SplitRowNumSortAscending = true;
  protected Integer SplitRowNumSort = null;
  /** raw field for: CDR_DATA_DUC.duc_type) */
  public    IntegerFilter[] DucType  = null;
  protected boolean DucTypeFetch = false;
  protected boolean DucTypeSortAscending = true;
  protected Integer DucTypeSort = null;
  /** raw field for: CDR_DATA_DUC.duc_subtype) */
  public    IntegerFilter[] DucSubtype  = null;
  protected boolean DucSubtypeFetch = false;
  protected boolean DucSubtypeSortAscending = true;
  protected Integer DucSubtypeSort = null;
  /** raw field for: CDR_DATA_DUC.duc_plan_id) */
  public    IntegerFilter[] DucPlanId  = null;
  protected boolean DucPlanIdFetch = false;
  protected boolean DucPlanIdSortAscending = true;
  protected Integer DucPlanIdSort = null;
  /** raw field for: CDR_DATA_DUC.duc_id) */
  public    IntegerFilter[] DucId  = null;
  protected boolean DucIdFetch = false;
  protected boolean DucIdSortAscending = true;
  protected Integer DucIdSort = null;
  /** raw field for: CDR_DATA_DUC.contract_tracking_id) */
  public    IntegerFilter[] ContractTrackingId  = null;
  protected boolean ContractTrackingIdFetch = false;
  protected boolean ContractTrackingIdSortAscending = true;
  protected Integer ContractTrackingIdSort = null;
  /** raw field for: CDR_DATA_DUC.contract_tracking_id_serv) */
  public    IntegerFilter[] ContractTrackingIdServ  = null;
  protected boolean ContractTrackingIdServFetch = false;
  protected boolean ContractTrackingIdServSortAscending = true;
  protected Integer ContractTrackingIdServSort = null;
  /** raw field for: CDR_DATA_DUC.awarded_quantum_type) */
  public    IntegerFilter[] AwardedQuantumType  = null;
  protected boolean AwardedQuantumTypeFetch = false;
  protected boolean AwardedQuantumTypeSortAscending = true;
  protected Integer AwardedQuantumTypeSort = null;
  /** raw field for: CDR_DATA_DUC.units_value) */
  public    BigIntegerFilter[] UnitsValue  = null;
  protected boolean UnitsValueFetch = false;
  protected boolean UnitsValueSortAscending = true;
  protected Integer UnitsValueSort = null;
  /** raw field for: CDR_DATA_DUC.units_type) */
  public    IntegerFilter[] UnitsType  = null;
  protected boolean UnitsTypeFetch = false;
  protected boolean UnitsTypeSortAscending = true;
  protected Integer UnitsTypeSort = null;
  /** raw field for: CDR_DATA_DUC.money_value) */
  public    BigIntegerFilter[] MoneyValue  = null;
  protected boolean MoneyValueFetch = false;
  protected boolean MoneyValueSortAscending = true;
  protected Integer MoneyValueSort = null;
  /** raw field for: CDR_DATA_DUC.currency_code) */
  public    IntegerFilter[] CurrencyCode  = null;
  protected boolean CurrencyCodeFetch = false;
  protected boolean CurrencyCodeSortAscending = true;
  protected Integer CurrencyCodeSort = null;
  /** raw field for: CDR_DATA_DUC.rebate_proration_ratio) */
  public    IntegerFilter[] RebateProrationRatio  = null;
  protected boolean RebateProrationRatioFetch = false;
  protected boolean RebateProrationRatioSortAscending = true;
  protected Integer RebateProrationRatioSort = null;
  /** raw field for: CDR_DATA_DUC.threshold_proration_ratio) */
  public    IntegerFilter[] ThresholdProrationRatio  = null;
  protected boolean ThresholdProrationRatioFetch = false;
  protected boolean ThresholdProrationRatioSortAscending = true;
  protected Integer ThresholdProrationRatioSort = null;
  /** raw field for: CDR_DATA_DUC.profile_id) */
  public    IntegerFilter[] ProfileId  = null;
  protected boolean ProfileIdFetch = false;
  protected boolean ProfileIdSortAscending = true;
  protected Integer ProfileIdSort = null;
  /** raw field for: CDR_DATA_DUC.profile_id_serv) */
  public    IntegerFilter[] ProfileIdServ  = null;
  protected boolean ProfileIdServFetch = false;
  protected boolean ProfileIdServSortAscending = true;
  protected Integer ProfileIdServSort = null;
  /** raw field for: CDR_DATA_DUC.instance_num) */
  public    IntegerFilter[] InstanceNum  = null;
  protected boolean InstanceNumFetch = false;
  protected boolean InstanceNumSortAscending = true;
  protected Integer InstanceNumSort = null;
  /** raw field for: CDR_DATA_DUC.quantum_pre_charge) */
  public    BigIntegerFilter[] QuantumPreCharge  = null;
  protected boolean QuantumPreChargeFetch = false;
  protected boolean QuantumPreChargeSortAscending = true;
  protected Integer QuantumPreChargeSort = null;
  /** raw field for: CDR_DATA_DUC.create_dt) */
  public    DateFilter[] CreateDt  = null;
  protected boolean CreateDtFetch = false;
  protected boolean CreateDtSortAscending = true;
  protected Integer CreateDtSort = null;
  /** raw field for: CDR_DATA_DUC.instance_start_dt) */
  public    DateFilter[] InstanceStartDt  = null;
  protected boolean InstanceStartDtFetch = false;
  protected boolean InstanceStartDtSortAscending = true;
  protected Integer InstanceStartDtSort = null;
  /** raw field for: CDR_DATA_DUC.annotation) */
  public    StringFilter[] Annotation  = null;
  protected boolean AnnotationFetch = false;
  protected boolean AnnotationSortAscending = true;
  protected boolean AnnotationCaseInsensitive = false;
  protected Integer AnnotationSort = null;
  private String _objName = "CdrDataDucObjectFilter";
  /** default constructor */
  public CdrDataDucObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public CdrDataDucObjectFilter (CdrDataDucObjectFilter other)
  {
    if (other == null) return;
    this.CdrDataPartitionKey = other.CdrDataPartitionKey;
    this.CdrDataPartitionKeyFetch = other.CdrDataPartitionKeyFetch;
    this.CdrDataPartitionKeySort = other.CdrDataPartitionKeySort;
    this.CdrDataPartitionKeySortAscending = other.CdrDataPartitionKeySortAscending;
    this.MsgId = other.MsgId;
    this.MsgIdFetch = other.MsgIdFetch;
    this.MsgIdSort = other.MsgIdSort;
    this.MsgIdSortAscending = other.MsgIdSortAscending;
    this.MsgId2 = other.MsgId2;
    this.MsgId2Fetch = other.MsgId2Fetch;
    this.MsgId2Sort = other.MsgId2Sort;
    this.MsgId2SortAscending = other.MsgId2SortAscending;
    this.MsgIdServ = other.MsgIdServ;
    this.MsgIdServFetch = other.MsgIdServFetch;
    this.MsgIdServSort = other.MsgIdServSort;
    this.MsgIdServSortAscending = other.MsgIdServSortAscending;
    this.SplitRowNum = other.SplitRowNum;
    this.SplitRowNumFetch = other.SplitRowNumFetch;
    this.SplitRowNumSort = other.SplitRowNumSort;
    this.SplitRowNumSortAscending = other.SplitRowNumSortAscending;
    this.DucType = other.DucType;
    this.DucTypeFetch = other.DucTypeFetch;
    this.DucTypeSort = other.DucTypeSort;
    this.DucTypeSortAscending = other.DucTypeSortAscending;
    this.DucSubtype = other.DucSubtype;
    this.DucSubtypeFetch = other.DucSubtypeFetch;
    this.DucSubtypeSort = other.DucSubtypeSort;
    this.DucSubtypeSortAscending = other.DucSubtypeSortAscending;
    this.DucPlanId = other.DucPlanId;
    this.DucPlanIdFetch = other.DucPlanIdFetch;
    this.DucPlanIdSort = other.DucPlanIdSort;
    this.DucPlanIdSortAscending = other.DucPlanIdSortAscending;
    this.DucId = other.DucId;
    this.DucIdFetch = other.DucIdFetch;
    this.DucIdSort = other.DucIdSort;
    this.DucIdSortAscending = other.DucIdSortAscending;
    this.ContractTrackingId = other.ContractTrackingId;
    this.ContractTrackingIdFetch = other.ContractTrackingIdFetch;
    this.ContractTrackingIdSort = other.ContractTrackingIdSort;
    this.ContractTrackingIdSortAscending = other.ContractTrackingIdSortAscending;
    this.ContractTrackingIdServ = other.ContractTrackingIdServ;
    this.ContractTrackingIdServFetch = other.ContractTrackingIdServFetch;
    this.ContractTrackingIdServSort = other.ContractTrackingIdServSort;
    this.ContractTrackingIdServSortAscending = other.ContractTrackingIdServSortAscending;
    this.AwardedQuantumType = other.AwardedQuantumType;
    this.AwardedQuantumTypeFetch = other.AwardedQuantumTypeFetch;
    this.AwardedQuantumTypeSort = other.AwardedQuantumTypeSort;
    this.AwardedQuantumTypeSortAscending = other.AwardedQuantumTypeSortAscending;
    this.UnitsValue = other.UnitsValue;
    this.UnitsValueFetch = other.UnitsValueFetch;
    this.UnitsValueSort = other.UnitsValueSort;
    this.UnitsValueSortAscending = other.UnitsValueSortAscending;
    this.UnitsType = other.UnitsType;
    this.UnitsTypeFetch = other.UnitsTypeFetch;
    this.UnitsTypeSort = other.UnitsTypeSort;
    this.UnitsTypeSortAscending = other.UnitsTypeSortAscending;
    this.MoneyValue = other.MoneyValue;
    this.MoneyValueFetch = other.MoneyValueFetch;
    this.MoneyValueSort = other.MoneyValueSort;
    this.MoneyValueSortAscending = other.MoneyValueSortAscending;
    this.CurrencyCode = other.CurrencyCode;
    this.CurrencyCodeFetch = other.CurrencyCodeFetch;
    this.CurrencyCodeSort = other.CurrencyCodeSort;
    this.CurrencyCodeSortAscending = other.CurrencyCodeSortAscending;
    this.RebateProrationRatio = other.RebateProrationRatio;
    this.RebateProrationRatioFetch = other.RebateProrationRatioFetch;
    this.RebateProrationRatioSort = other.RebateProrationRatioSort;
    this.RebateProrationRatioSortAscending = other.RebateProrationRatioSortAscending;
    this.ThresholdProrationRatio = other.ThresholdProrationRatio;
    this.ThresholdProrationRatioFetch = other.ThresholdProrationRatioFetch;
    this.ThresholdProrationRatioSort = other.ThresholdProrationRatioSort;
    this.ThresholdProrationRatioSortAscending = other.ThresholdProrationRatioSortAscending;
    this.ProfileId = other.ProfileId;
    this.ProfileIdFetch = other.ProfileIdFetch;
    this.ProfileIdSort = other.ProfileIdSort;
    this.ProfileIdSortAscending = other.ProfileIdSortAscending;
    this.ProfileIdServ = other.ProfileIdServ;
    this.ProfileIdServFetch = other.ProfileIdServFetch;
    this.ProfileIdServSort = other.ProfileIdServSort;
    this.ProfileIdServSortAscending = other.ProfileIdServSortAscending;
    this.InstanceNum = other.InstanceNum;
    this.InstanceNumFetch = other.InstanceNumFetch;
    this.InstanceNumSort = other.InstanceNumSort;
    this.InstanceNumSortAscending = other.InstanceNumSortAscending;
    this.QuantumPreCharge = other.QuantumPreCharge;
    this.QuantumPreChargeFetch = other.QuantumPreChargeFetch;
    this.QuantumPreChargeSort = other.QuantumPreChargeSort;
    this.QuantumPreChargeSortAscending = other.QuantumPreChargeSortAscending;
    this.CreateDt = other.CreateDt;
    this.CreateDtFetch = other.CreateDtFetch;
    this.CreateDtSort = other.CreateDtSort;
    this.CreateDtSortAscending = other.CreateDtSortAscending;
    this.InstanceStartDt = other.InstanceStartDt;
    this.InstanceStartDtFetch = other.InstanceStartDtFetch;
    this.InstanceStartDtSort = other.InstanceStartDtSort;
    this.InstanceStartDtSortAscending = other.InstanceStartDtSortAscending;
    this.Annotation = other.Annotation;
    this.AnnotationFetch = other.AnnotationFetch;
    this.AnnotationSort = other.AnnotationSort;
    this.AnnotationCaseInsensitive = other.AnnotationCaseInsensitive;
    this.AnnotationSortAscending = other.AnnotationSortAscending;  }
  /** Set the field level Fetch value for field: CdrDataPartitionKey (CDR_DATA_DUC.cdr_data_partition_key)
   * @param fetch whether to fetch this field or not
   */
  public void setCdrDataPartitionKeyFetch (boolean fetch) {
    this.CdrDataPartitionKeyFetch = fetch;
  }
  /** Retrieve Fetch value for field: CdrDataPartitionKey (CDR_DATA_DUC.cdr_data_partition_key)
   * @return boolean the Fetch value for this field
   */
  public boolean getCdrDataPartitionKeyFetch () {
    return this.CdrDataPartitionKeyFetch;
  }
  /** Set the SortOrder for field: CdrDataPartitionKey (CDR_DATA_DUC.cdr_data_partition_key)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCdrDataPartitionKeySortOrder (Integer value) {
    this.CdrDataPartitionKeySort = value;
  }
  /** Retrieve SortOrder for field: CdrDataPartitionKey (CDR_DATA_DUC.cdr_data_partition_key)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCdrDataPartitionKeySortOrder () {
    return this.CdrDataPartitionKeySort;
  }
  /** Set the sort direction for field: CdrDataPartitionKey (CDR_DATA_DUC.cdr_data_partition_key)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCdrDataPartitionKeySortDirection (boolean ascending) {
    this.CdrDataPartitionKeySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CdrDataPartitionKey (CDR_DATA_DUC.cdr_data_partition_key)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCdrDataPartitionKeySortDirection () {
    return this.CdrDataPartitionKeySortAscending;
  }
  /** Set the field level filters for field: CdrDataPartitionKey (CDR_DATA_DUC.cdr_data_partition_key)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCdrDataPartitionKeyFilter (DateFilter[] value) throws ServiceException {
    this.CdrDataPartitionKey = value;
  }
  /** Retrieve filter for field: CdrDataPartitionKey (CDR_DATA_DUC.cdr_data_partition_key)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getCdrDataPartitionKeyFilter () {
    return this.CdrDataPartitionKey;
  }

  /**
   * Retrieves the CdrDataPartitionKeyFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CdrDataPartitionKeyFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CdrDataPartitionKeyFilter field
   */
  public String[] getCdrDataPartitionKeyFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCdrDataPartitionKeyFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCdrDataPartitionKeyFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCdrDataPartitionKeyFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CdrDataPartitionKeyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCdrDataPartitionKeyFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CdrDataPartitionKeyFilter filter value from a formatted string
   *
   * @param _value the CdrDataPartitionKeyFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CdrDataPartitionKeyFilter filter field
   */
  public void setCdrDataPartitionKeyFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCdrDataPartitionKeyFilterFromFormattedString");
    try {
      this.setCdrDataPartitionKeyFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CdrDataPartitionKeyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCdrDataPartitionKeyFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCdrDataPartitionKeyFilterFromFormattedString");
  }

  /**
   * Retrieves the CdrDataPartitionKeyFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CdrDataPartitionKeyFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the CdrDataPartitionKeyFilter field
   */
  public String[] getCdrDataPartitionKeyFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCdrDataPartitionKeyFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCdrDataPartitionKeyFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCdrDataPartitionKeyFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CdrDataPartitionKeyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCdrDataPartitionKeyFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the CdrDataPartitionKeyFilter filter value from a formatted string
   *
   * @param _value the CdrDataPartitionKeyFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CdrDataPartitionKeyFilter filter field
   */
  public void setCdrDataPartitionKeyFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCdrDataPartitionKeyFilterFromFormattedDateTimeString");
    try {
      this.setCdrDataPartitionKeyFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CdrDataPartitionKeyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCdrDataPartitionKeyFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCdrDataPartitionKeyFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: MsgId (CDR_DATA_DUC.msg_id)
   * @param fetch whether to fetch this field or not
   */
  public void setMsgIdFetch (boolean fetch) {
    this.MsgIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: MsgId (CDR_DATA_DUC.msg_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getMsgIdFetch () {
    return this.MsgIdFetch;
  }
  /** Set the SortOrder for field: MsgId (CDR_DATA_DUC.msg_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMsgIdSortOrder (Integer value) {
    this.MsgIdSort = value;
  }
  /** Retrieve SortOrder for field: MsgId (CDR_DATA_DUC.msg_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMsgIdSortOrder () {
    return this.MsgIdSort;
  }
  /** Set the sort direction for field: MsgId (CDR_DATA_DUC.msg_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMsgIdSortDirection (boolean ascending) {
    this.MsgIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MsgId (CDR_DATA_DUC.msg_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMsgIdSortDirection () {
    return this.MsgIdSortAscending;
  }
  /** Set the field level filters for field: MsgId (CDR_DATA_DUC.msg_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMsgIdFilter (IntegerFilter[] value) throws ServiceException {
    this.MsgId = value;
  }
  /** Retrieve filter for field: MsgId (CDR_DATA_DUC.msg_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getMsgIdFilter () {
    return this.MsgId;
  }

  /**
   * Retrieves the MsgIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MsgIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MsgIdFilter field
   */
  public String[] getMsgIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMsgIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMsgIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MsgIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMsgIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MsgIdFilter filter value from a formatted string
   *
   * @param _value the MsgIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MsgIdFilter filter field
   */
  public void setMsgIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMsgIdFilterFromFormattedString");
    try {
      this.setMsgIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MsgIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMsgIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMsgIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: MsgId2 (CDR_DATA_DUC.msg_id2)
   * @param fetch whether to fetch this field or not
   */
  public void setMsgId2Fetch (boolean fetch) {
    this.MsgId2Fetch = fetch;
  }
  /** Retrieve Fetch value for field: MsgId2 (CDR_DATA_DUC.msg_id2)
   * @return boolean the Fetch value for this field
   */
  public boolean getMsgId2Fetch () {
    return this.MsgId2Fetch;
  }
  /** Set the SortOrder for field: MsgId2 (CDR_DATA_DUC.msg_id2)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMsgId2SortOrder (Integer value) {
    this.MsgId2Sort = value;
  }
  /** Retrieve SortOrder for field: MsgId2 (CDR_DATA_DUC.msg_id2)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMsgId2SortOrder () {
    return this.MsgId2Sort;
  }
  /** Set the sort direction for field: MsgId2 (CDR_DATA_DUC.msg_id2)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMsgId2SortDirection (boolean ascending) {
    this.MsgId2SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MsgId2 (CDR_DATA_DUC.msg_id2)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMsgId2SortDirection () {
    return this.MsgId2SortAscending;
  }
  /** Set the field level filters for field: MsgId2 (CDR_DATA_DUC.msg_id2)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMsgId2Filter (IntegerFilter[] value) throws ServiceException {
    this.MsgId2 = value;
  }
  /** Retrieve filter for field: MsgId2 (CDR_DATA_DUC.msg_id2)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getMsgId2Filter () {
    return this.MsgId2;
  }

  /**
   * Retrieves the MsgId2Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MsgId2Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MsgId2Filter field
   */
  public String[] getMsgId2FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgId2FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMsgId2Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMsgId2FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MsgId2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMsgId2FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MsgId2Filter filter value from a formatted string
   *
   * @param _value the MsgId2Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MsgId2Filter filter field
   */
  public void setMsgId2FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMsgId2FilterFromFormattedString");
    try {
      this.setMsgId2Filter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MsgId2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMsgId2FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMsgId2FilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: MsgIdServ (CDR_DATA_DUC.msg_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setMsgIdServFetch (boolean fetch) {
    this.MsgIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: MsgIdServ (CDR_DATA_DUC.msg_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getMsgIdServFetch () {
    return this.MsgIdServFetch;
  }
  /** Set the SortOrder for field: MsgIdServ (CDR_DATA_DUC.msg_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMsgIdServSortOrder (Integer value) {
    this.MsgIdServSort = value;
  }
  /** Retrieve SortOrder for field: MsgIdServ (CDR_DATA_DUC.msg_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMsgIdServSortOrder () {
    return this.MsgIdServSort;
  }
  /** Set the sort direction for field: MsgIdServ (CDR_DATA_DUC.msg_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMsgIdServSortDirection (boolean ascending) {
    this.MsgIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MsgIdServ (CDR_DATA_DUC.msg_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMsgIdServSortDirection () {
    return this.MsgIdServSortAscending;
  }
  /** Set the field level filters for field: MsgIdServ (CDR_DATA_DUC.msg_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMsgIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.MsgIdServ = value;
  }
  /** Retrieve filter for field: MsgIdServ (CDR_DATA_DUC.msg_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getMsgIdServFilter () {
    return this.MsgIdServ;
  }

  /**
   * Retrieves the MsgIdServFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MsgIdServFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MsgIdServFilter field
   */
  public String[] getMsgIdServFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgIdServFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMsgIdServFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMsgIdServFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MsgIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMsgIdServFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MsgIdServFilter filter value from a formatted string
   *
   * @param _value the MsgIdServFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MsgIdServFilter filter field
   */
  public void setMsgIdServFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMsgIdServFilterFromFormattedString");
    try {
      this.setMsgIdServFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MsgIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMsgIdServFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMsgIdServFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: SplitRowNum (CDR_DATA_DUC.split_row_num)
   * @param fetch whether to fetch this field or not
   */
  public void setSplitRowNumFetch (boolean fetch) {
    this.SplitRowNumFetch = fetch;
  }
  /** Retrieve Fetch value for field: SplitRowNum (CDR_DATA_DUC.split_row_num)
   * @return boolean the Fetch value for this field
   */
  public boolean getSplitRowNumFetch () {
    return this.SplitRowNumFetch;
  }
  /** Set the SortOrder for field: SplitRowNum (CDR_DATA_DUC.split_row_num)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSplitRowNumSortOrder (Integer value) {
    this.SplitRowNumSort = value;
  }
  /** Retrieve SortOrder for field: SplitRowNum (CDR_DATA_DUC.split_row_num)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSplitRowNumSortOrder () {
    return this.SplitRowNumSort;
  }
  /** Set the sort direction for field: SplitRowNum (CDR_DATA_DUC.split_row_num)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSplitRowNumSortDirection (boolean ascending) {
    this.SplitRowNumSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SplitRowNum (CDR_DATA_DUC.split_row_num)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSplitRowNumSortDirection () {
    return this.SplitRowNumSortAscending;
  }
  /** Set the field level filters for field: SplitRowNum (CDR_DATA_DUC.split_row_num)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSplitRowNumFilter (IntegerFilter[] value) throws ServiceException {
    this.SplitRowNum = value;
  }
  /** Retrieve filter for field: SplitRowNum (CDR_DATA_DUC.split_row_num)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getSplitRowNumFilter () {
    return this.SplitRowNum;
  }

  /**
   * Retrieves the SplitRowNumFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SplitRowNumFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SplitRowNumFilter field
   */
  public String[] getSplitRowNumFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSplitRowNumFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSplitRowNumFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSplitRowNumFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SplitRowNumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSplitRowNumFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SplitRowNumFilter filter value from a formatted string
   *
   * @param _value the SplitRowNumFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SplitRowNumFilter filter field
   */
  public void setSplitRowNumFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSplitRowNumFilterFromFormattedString");
    try {
      this.setSplitRowNumFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SplitRowNumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSplitRowNumFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSplitRowNumFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DucType (CDR_DATA_DUC.duc_type)
   * @param fetch whether to fetch this field or not
   */
  public void setDucTypeFetch (boolean fetch) {
    this.DucTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: DucType (CDR_DATA_DUC.duc_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getDucTypeFetch () {
    return this.DucTypeFetch;
  }
  /** Set the SortOrder for field: DucType (CDR_DATA_DUC.duc_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDucTypeSortOrder (Integer value) {
    this.DucTypeSort = value;
  }
  /** Retrieve SortOrder for field: DucType (CDR_DATA_DUC.duc_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDucTypeSortOrder () {
    return this.DucTypeSort;
  }
  /** Set the sort direction for field: DucType (CDR_DATA_DUC.duc_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDucTypeSortDirection (boolean ascending) {
    this.DucTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DucType (CDR_DATA_DUC.duc_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDucTypeSortDirection () {
    return this.DucTypeSortAscending;
  }
  /** Set the field level filters for field: DucType (CDR_DATA_DUC.duc_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDucTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.DucType = value;
  }
  /** Retrieve filter for field: DucType (CDR_DATA_DUC.duc_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDucTypeFilter () {
    return this.DucType;
  }

  /**
   * Retrieves the DucTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DucTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DucTypeFilter field
   */
  public String[] getDucTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDucTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDucTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDucTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DucTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDucTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DucTypeFilter filter value from a formatted string
   *
   * @param _value the DucTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DucTypeFilter filter field
   */
  public void setDucTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDucTypeFilterFromFormattedString");
    try {
      this.setDucTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DucTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDucTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDucTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DucSubtype (CDR_DATA_DUC.duc_subtype)
   * @param fetch whether to fetch this field or not
   */
  public void setDucSubtypeFetch (boolean fetch) {
    this.DucSubtypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: DucSubtype (CDR_DATA_DUC.duc_subtype)
   * @return boolean the Fetch value for this field
   */
  public boolean getDucSubtypeFetch () {
    return this.DucSubtypeFetch;
  }
  /** Set the SortOrder for field: DucSubtype (CDR_DATA_DUC.duc_subtype)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDucSubtypeSortOrder (Integer value) {
    this.DucSubtypeSort = value;
  }
  /** Retrieve SortOrder for field: DucSubtype (CDR_DATA_DUC.duc_subtype)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDucSubtypeSortOrder () {
    return this.DucSubtypeSort;
  }
  /** Set the sort direction for field: DucSubtype (CDR_DATA_DUC.duc_subtype)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDucSubtypeSortDirection (boolean ascending) {
    this.DucSubtypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DucSubtype (CDR_DATA_DUC.duc_subtype)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDucSubtypeSortDirection () {
    return this.DucSubtypeSortAscending;
  }
  /** Set the field level filters for field: DucSubtype (CDR_DATA_DUC.duc_subtype)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDucSubtypeFilter (IntegerFilter[] value) throws ServiceException {
    this.DucSubtype = value;
  }
  /** Retrieve filter for field: DucSubtype (CDR_DATA_DUC.duc_subtype)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDucSubtypeFilter () {
    return this.DucSubtype;
  }

  /**
   * Retrieves the DucSubtypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DucSubtypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DucSubtypeFilter field
   */
  public String[] getDucSubtypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDucSubtypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDucSubtypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDucSubtypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DucSubtypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDucSubtypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DucSubtypeFilter filter value from a formatted string
   *
   * @param _value the DucSubtypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DucSubtypeFilter filter field
   */
  public void setDucSubtypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDucSubtypeFilterFromFormattedString");
    try {
      this.setDucSubtypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DucSubtypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDucSubtypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDucSubtypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DucPlanId (CDR_DATA_DUC.duc_plan_id)
   * @param fetch whether to fetch this field or not
   */
  public void setDucPlanIdFetch (boolean fetch) {
    this.DucPlanIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: DucPlanId (CDR_DATA_DUC.duc_plan_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getDucPlanIdFetch () {
    return this.DucPlanIdFetch;
  }
  /** Set the SortOrder for field: DucPlanId (CDR_DATA_DUC.duc_plan_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDucPlanIdSortOrder (Integer value) {
    this.DucPlanIdSort = value;
  }
  /** Retrieve SortOrder for field: DucPlanId (CDR_DATA_DUC.duc_plan_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDucPlanIdSortOrder () {
    return this.DucPlanIdSort;
  }
  /** Set the sort direction for field: DucPlanId (CDR_DATA_DUC.duc_plan_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDucPlanIdSortDirection (boolean ascending) {
    this.DucPlanIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DucPlanId (CDR_DATA_DUC.duc_plan_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDucPlanIdSortDirection () {
    return this.DucPlanIdSortAscending;
  }
  /** Set the field level filters for field: DucPlanId (CDR_DATA_DUC.duc_plan_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDucPlanIdFilter (IntegerFilter[] value) throws ServiceException {
    this.DucPlanId = value;
  }
  /** Retrieve filter for field: DucPlanId (CDR_DATA_DUC.duc_plan_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDucPlanIdFilter () {
    return this.DucPlanId;
  }

  /**
   * Retrieves the DucPlanIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DucPlanIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DucPlanIdFilter field
   */
  public String[] getDucPlanIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDucPlanIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDucPlanIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDucPlanIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DucPlanIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDucPlanIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DucPlanIdFilter filter value from a formatted string
   *
   * @param _value the DucPlanIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DucPlanIdFilter filter field
   */
  public void setDucPlanIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDucPlanIdFilterFromFormattedString");
    try {
      this.setDucPlanIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DucPlanIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDucPlanIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDucPlanIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DucId (CDR_DATA_DUC.duc_id)
   * @param fetch whether to fetch this field or not
   */
  public void setDucIdFetch (boolean fetch) {
    this.DucIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: DucId (CDR_DATA_DUC.duc_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getDucIdFetch () {
    return this.DucIdFetch;
  }
  /** Set the SortOrder for field: DucId (CDR_DATA_DUC.duc_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDucIdSortOrder (Integer value) {
    this.DucIdSort = value;
  }
  /** Retrieve SortOrder for field: DucId (CDR_DATA_DUC.duc_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDucIdSortOrder () {
    return this.DucIdSort;
  }
  /** Set the sort direction for field: DucId (CDR_DATA_DUC.duc_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDucIdSortDirection (boolean ascending) {
    this.DucIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DucId (CDR_DATA_DUC.duc_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDucIdSortDirection () {
    return this.DucIdSortAscending;
  }
  /** Set the field level filters for field: DucId (CDR_DATA_DUC.duc_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDucIdFilter (IntegerFilter[] value) throws ServiceException {
    this.DucId = value;
  }
  /** Retrieve filter for field: DucId (CDR_DATA_DUC.duc_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDucIdFilter () {
    return this.DucId;
  }

  /**
   * Retrieves the DucIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DucIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DucIdFilter field
   */
  public String[] getDucIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDucIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDucIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDucIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DucIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDucIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DucIdFilter filter value from a formatted string
   *
   * @param _value the DucIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DucIdFilter filter field
   */
  public void setDucIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDucIdFilterFromFormattedString");
    try {
      this.setDucIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DucIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDucIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDucIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ContractTrackingId (CDR_DATA_DUC.contract_tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setContractTrackingIdFetch (boolean fetch) {
    this.ContractTrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ContractTrackingId (CDR_DATA_DUC.contract_tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getContractTrackingIdFetch () {
    return this.ContractTrackingIdFetch;
  }
  /** Set the SortOrder for field: ContractTrackingId (CDR_DATA_DUC.contract_tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setContractTrackingIdSortOrder (Integer value) {
    this.ContractTrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: ContractTrackingId (CDR_DATA_DUC.contract_tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getContractTrackingIdSortOrder () {
    return this.ContractTrackingIdSort;
  }
  /** Set the sort direction for field: ContractTrackingId (CDR_DATA_DUC.contract_tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setContractTrackingIdSortDirection (boolean ascending) {
    this.ContractTrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ContractTrackingId (CDR_DATA_DUC.contract_tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getContractTrackingIdSortDirection () {
    return this.ContractTrackingIdSortAscending;
  }
  /** Set the field level filters for field: ContractTrackingId (CDR_DATA_DUC.contract_tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setContractTrackingIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ContractTrackingId = value;
  }
  /** Retrieve filter for field: ContractTrackingId (CDR_DATA_DUC.contract_tracking_id)
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

  /** Set the field level Fetch value for field: ContractTrackingIdServ (CDR_DATA_DUC.contract_tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setContractTrackingIdServFetch (boolean fetch) {
    this.ContractTrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: ContractTrackingIdServ (CDR_DATA_DUC.contract_tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getContractTrackingIdServFetch () {
    return this.ContractTrackingIdServFetch;
  }
  /** Set the SortOrder for field: ContractTrackingIdServ (CDR_DATA_DUC.contract_tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setContractTrackingIdServSortOrder (Integer value) {
    this.ContractTrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: ContractTrackingIdServ (CDR_DATA_DUC.contract_tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getContractTrackingIdServSortOrder () {
    return this.ContractTrackingIdServSort;
  }
  /** Set the sort direction for field: ContractTrackingIdServ (CDR_DATA_DUC.contract_tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setContractTrackingIdServSortDirection (boolean ascending) {
    this.ContractTrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ContractTrackingIdServ (CDR_DATA_DUC.contract_tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getContractTrackingIdServSortDirection () {
    return this.ContractTrackingIdServSortAscending;
  }
  /** Set the field level filters for field: ContractTrackingIdServ (CDR_DATA_DUC.contract_tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setContractTrackingIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.ContractTrackingIdServ = value;
  }
  /** Retrieve filter for field: ContractTrackingIdServ (CDR_DATA_DUC.contract_tracking_id_serv)
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

  /** Set the field level Fetch value for field: AwardedQuantumType (CDR_DATA_DUC.awarded_quantum_type)
   * @param fetch whether to fetch this field or not
   */
  public void setAwardedQuantumTypeFetch (boolean fetch) {
    this.AwardedQuantumTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: AwardedQuantumType (CDR_DATA_DUC.awarded_quantum_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getAwardedQuantumTypeFetch () {
    return this.AwardedQuantumTypeFetch;
  }
  /** Set the SortOrder for field: AwardedQuantumType (CDR_DATA_DUC.awarded_quantum_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAwardedQuantumTypeSortOrder (Integer value) {
    this.AwardedQuantumTypeSort = value;
  }
  /** Retrieve SortOrder for field: AwardedQuantumType (CDR_DATA_DUC.awarded_quantum_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAwardedQuantumTypeSortOrder () {
    return this.AwardedQuantumTypeSort;
  }
  /** Set the sort direction for field: AwardedQuantumType (CDR_DATA_DUC.awarded_quantum_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAwardedQuantumTypeSortDirection (boolean ascending) {
    this.AwardedQuantumTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AwardedQuantumType (CDR_DATA_DUC.awarded_quantum_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAwardedQuantumTypeSortDirection () {
    return this.AwardedQuantumTypeSortAscending;
  }
  /** Set the field level filters for field: AwardedQuantumType (CDR_DATA_DUC.awarded_quantum_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAwardedQuantumTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.AwardedQuantumType = value;
  }
  /** Retrieve filter for field: AwardedQuantumType (CDR_DATA_DUC.awarded_quantum_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAwardedQuantumTypeFilter () {
    return this.AwardedQuantumType;
  }

  /**
   * Retrieves the AwardedQuantumTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AwardedQuantumTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AwardedQuantumTypeFilter field
   */
  public String[] getAwardedQuantumTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAwardedQuantumTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAwardedQuantumTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAwardedQuantumTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AwardedQuantumTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAwardedQuantumTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AwardedQuantumTypeFilter filter value from a formatted string
   *
   * @param _value the AwardedQuantumTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AwardedQuantumTypeFilter filter field
   */
  public void setAwardedQuantumTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAwardedQuantumTypeFilterFromFormattedString");
    try {
      this.setAwardedQuantumTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AwardedQuantumTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAwardedQuantumTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAwardedQuantumTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: UnitsValue (CDR_DATA_DUC.units_value)
   * @param fetch whether to fetch this field or not
   */
  public void setUnitsValueFetch (boolean fetch) {
    this.UnitsValueFetch = fetch;
  }
  /** Retrieve Fetch value for field: UnitsValue (CDR_DATA_DUC.units_value)
   * @return boolean the Fetch value for this field
   */
  public boolean getUnitsValueFetch () {
    return this.UnitsValueFetch;
  }
  /** Set the SortOrder for field: UnitsValue (CDR_DATA_DUC.units_value)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUnitsValueSortOrder (Integer value) {
    this.UnitsValueSort = value;
  }
  /** Retrieve SortOrder for field: UnitsValue (CDR_DATA_DUC.units_value)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUnitsValueSortOrder () {
    return this.UnitsValueSort;
  }
  /** Set the sort direction for field: UnitsValue (CDR_DATA_DUC.units_value)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUnitsValueSortDirection (boolean ascending) {
    this.UnitsValueSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UnitsValue (CDR_DATA_DUC.units_value)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUnitsValueSortDirection () {
    return this.UnitsValueSortAscending;
  }
  /** Set the field level filters for field: UnitsValue (CDR_DATA_DUC.units_value)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUnitsValueFilter (BigIntegerFilter[] value) throws ServiceException {
    this.UnitsValue = value;
  }
  /** Retrieve filter for field: UnitsValue (CDR_DATA_DUC.units_value)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getUnitsValueFilter () {
    return this.UnitsValue;
  }

  /**
   * Retrieves the UnitsValueFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UnitsValueFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UnitsValueFilter field
   */
  public String[] getUnitsValueFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitsValueFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUnitsValueFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUnitsValueFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UnitsValueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUnitsValueFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UnitsValueFilter filter value from a formatted string
   *
   * @param _value the UnitsValueFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UnitsValueFilter filter field
   */
  public void setUnitsValueFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUnitsValueFilterFromFormattedString");
    try {
      this.setUnitsValueFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UnitsValueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUnitsValueFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUnitsValueFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: UnitsType (CDR_DATA_DUC.units_type)
   * @param fetch whether to fetch this field or not
   */
  public void setUnitsTypeFetch (boolean fetch) {
    this.UnitsTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: UnitsType (CDR_DATA_DUC.units_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getUnitsTypeFetch () {
    return this.UnitsTypeFetch;
  }
  /** Set the SortOrder for field: UnitsType (CDR_DATA_DUC.units_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUnitsTypeSortOrder (Integer value) {
    this.UnitsTypeSort = value;
  }
  /** Retrieve SortOrder for field: UnitsType (CDR_DATA_DUC.units_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUnitsTypeSortOrder () {
    return this.UnitsTypeSort;
  }
  /** Set the sort direction for field: UnitsType (CDR_DATA_DUC.units_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUnitsTypeSortDirection (boolean ascending) {
    this.UnitsTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UnitsType (CDR_DATA_DUC.units_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUnitsTypeSortDirection () {
    return this.UnitsTypeSortAscending;
  }
  /** Set the field level filters for field: UnitsType (CDR_DATA_DUC.units_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUnitsTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.UnitsType = value;
  }
  /** Retrieve filter for field: UnitsType (CDR_DATA_DUC.units_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getUnitsTypeFilter () {
    return this.UnitsType;
  }

  /**
   * Retrieves the UnitsTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UnitsTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UnitsTypeFilter field
   */
  public String[] getUnitsTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitsTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUnitsTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUnitsTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UnitsTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUnitsTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UnitsTypeFilter filter value from a formatted string
   *
   * @param _value the UnitsTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UnitsTypeFilter filter field
   */
  public void setUnitsTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUnitsTypeFilterFromFormattedString");
    try {
      this.setUnitsTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UnitsTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUnitsTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUnitsTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: MoneyValue (CDR_DATA_DUC.money_value)
   * @param fetch whether to fetch this field or not
   */
  public void setMoneyValueFetch (boolean fetch) {
    this.MoneyValueFetch = fetch;
  }
  /** Retrieve Fetch value for field: MoneyValue (CDR_DATA_DUC.money_value)
   * @return boolean the Fetch value for this field
   */
  public boolean getMoneyValueFetch () {
    return this.MoneyValueFetch;
  }
  /** Set the SortOrder for field: MoneyValue (CDR_DATA_DUC.money_value)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMoneyValueSortOrder (Integer value) {
    this.MoneyValueSort = value;
  }
  /** Retrieve SortOrder for field: MoneyValue (CDR_DATA_DUC.money_value)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMoneyValueSortOrder () {
    return this.MoneyValueSort;
  }
  /** Set the sort direction for field: MoneyValue (CDR_DATA_DUC.money_value)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMoneyValueSortDirection (boolean ascending) {
    this.MoneyValueSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MoneyValue (CDR_DATA_DUC.money_value)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMoneyValueSortDirection () {
    return this.MoneyValueSortAscending;
  }
  /** Set the field level filters for field: MoneyValue (CDR_DATA_DUC.money_value)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMoneyValueFilter (BigIntegerFilter[] value) throws ServiceException {
    this.MoneyValue = value;
  }
  /** Retrieve filter for field: MoneyValue (CDR_DATA_DUC.money_value)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getMoneyValueFilter () {
    return this.MoneyValue;
  }

  /**
   * Retrieves the MoneyValueFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MoneyValueFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MoneyValueFilter field
   */
  public String[] getMoneyValueFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMoneyValueFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMoneyValueFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMoneyValueFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MoneyValueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMoneyValueFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MoneyValueFilter filter value from a formatted string
   *
   * @param _value the MoneyValueFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MoneyValueFilter filter field
   */
  public void setMoneyValueFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMoneyValueFilterFromFormattedString");
    try {
      this.setMoneyValueFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MoneyValueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMoneyValueFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMoneyValueFilterFromFormattedString");
  }

  /**
   * Sets the MoneyValueFilter filter value from a formatted string
   *
   * @param _value the MoneyValueFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MoneyValueFilter filter field
   */
  public void setMoneyValueFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMoneyValueFilterFromFormattedCurrencyString");
    try {
      this.setMoneyValueFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MoneyValueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMoneyValueFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMoneyValueFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the MoneyValueFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MoneyValueFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the MoneyValueFilter field
   */

  public String[] getMoneyValueFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMoneyValueFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMoneyValueFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMoneyValueFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MoneyValueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMoneyValueFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: CurrencyCode (CDR_DATA_DUC.currency_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCurrencyCodeFetch (boolean fetch) {
    this.CurrencyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CurrencyCode (CDR_DATA_DUC.currency_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCurrencyCodeFetch () {
    return this.CurrencyCodeFetch;
  }
  /** Set the SortOrder for field: CurrencyCode (CDR_DATA_DUC.currency_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCurrencyCodeSortOrder (Integer value) {
    this.CurrencyCodeSort = value;
  }
  /** Retrieve SortOrder for field: CurrencyCode (CDR_DATA_DUC.currency_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCurrencyCodeSortOrder () {
    return this.CurrencyCodeSort;
  }
  /** Set the sort direction for field: CurrencyCode (CDR_DATA_DUC.currency_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCurrencyCodeSortDirection (boolean ascending) {
    this.CurrencyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CurrencyCode (CDR_DATA_DUC.currency_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCurrencyCodeSortDirection () {
    return this.CurrencyCodeSortAscending;
  }
  /** Set the field level filters for field: CurrencyCode (CDR_DATA_DUC.currency_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCurrencyCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.CurrencyCode = value;
  }
  /** Retrieve filter for field: CurrencyCode (CDR_DATA_DUC.currency_code)
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

  /** Set the field level Fetch value for field: RebateProrationRatio (CDR_DATA_DUC.rebate_proration_ratio)
   * @param fetch whether to fetch this field or not
   */
  public void setRebateProrationRatioFetch (boolean fetch) {
    this.RebateProrationRatioFetch = fetch;
  }
  /** Retrieve Fetch value for field: RebateProrationRatio (CDR_DATA_DUC.rebate_proration_ratio)
   * @return boolean the Fetch value for this field
   */
  public boolean getRebateProrationRatioFetch () {
    return this.RebateProrationRatioFetch;
  }
  /** Set the SortOrder for field: RebateProrationRatio (CDR_DATA_DUC.rebate_proration_ratio)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRebateProrationRatioSortOrder (Integer value) {
    this.RebateProrationRatioSort = value;
  }
  /** Retrieve SortOrder for field: RebateProrationRatio (CDR_DATA_DUC.rebate_proration_ratio)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRebateProrationRatioSortOrder () {
    return this.RebateProrationRatioSort;
  }
  /** Set the sort direction for field: RebateProrationRatio (CDR_DATA_DUC.rebate_proration_ratio)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRebateProrationRatioSortDirection (boolean ascending) {
    this.RebateProrationRatioSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RebateProrationRatio (CDR_DATA_DUC.rebate_proration_ratio)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRebateProrationRatioSortDirection () {
    return this.RebateProrationRatioSortAscending;
  }
  /** Set the field level filters for field: RebateProrationRatio (CDR_DATA_DUC.rebate_proration_ratio)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRebateProrationRatioFilter (IntegerFilter[] value) throws ServiceException {
    this.RebateProrationRatio = value;
  }
  /** Retrieve filter for field: RebateProrationRatio (CDR_DATA_DUC.rebate_proration_ratio)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRebateProrationRatioFilter () {
    return this.RebateProrationRatio;
  }

  /**
   * Retrieves the RebateProrationRatioFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RebateProrationRatioFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RebateProrationRatioFilter field
   */
  public String[] getRebateProrationRatioFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRebateProrationRatioFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRebateProrationRatioFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRebateProrationRatioFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RebateProrationRatioFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRebateProrationRatioFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RebateProrationRatioFilter filter value from a formatted string
   *
   * @param _value the RebateProrationRatioFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RebateProrationRatioFilter filter field
   */
  public void setRebateProrationRatioFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRebateProrationRatioFilterFromFormattedString");
    try {
      this.setRebateProrationRatioFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RebateProrationRatioFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRebateProrationRatioFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRebateProrationRatioFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ThresholdProrationRatio (CDR_DATA_DUC.threshold_proration_ratio)
   * @param fetch whether to fetch this field or not
   */
  public void setThresholdProrationRatioFetch (boolean fetch) {
    this.ThresholdProrationRatioFetch = fetch;
  }
  /** Retrieve Fetch value for field: ThresholdProrationRatio (CDR_DATA_DUC.threshold_proration_ratio)
   * @return boolean the Fetch value for this field
   */
  public boolean getThresholdProrationRatioFetch () {
    return this.ThresholdProrationRatioFetch;
  }
  /** Set the SortOrder for field: ThresholdProrationRatio (CDR_DATA_DUC.threshold_proration_ratio)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setThresholdProrationRatioSortOrder (Integer value) {
    this.ThresholdProrationRatioSort = value;
  }
  /** Retrieve SortOrder for field: ThresholdProrationRatio (CDR_DATA_DUC.threshold_proration_ratio)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getThresholdProrationRatioSortOrder () {
    return this.ThresholdProrationRatioSort;
  }
  /** Set the sort direction for field: ThresholdProrationRatio (CDR_DATA_DUC.threshold_proration_ratio)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setThresholdProrationRatioSortDirection (boolean ascending) {
    this.ThresholdProrationRatioSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ThresholdProrationRatio (CDR_DATA_DUC.threshold_proration_ratio)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getThresholdProrationRatioSortDirection () {
    return this.ThresholdProrationRatioSortAscending;
  }
  /** Set the field level filters for field: ThresholdProrationRatio (CDR_DATA_DUC.threshold_proration_ratio)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setThresholdProrationRatioFilter (IntegerFilter[] value) throws ServiceException {
    this.ThresholdProrationRatio = value;
  }
  /** Retrieve filter for field: ThresholdProrationRatio (CDR_DATA_DUC.threshold_proration_ratio)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getThresholdProrationRatioFilter () {
    return this.ThresholdProrationRatio;
  }

  /**
   * Retrieves the ThresholdProrationRatioFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ThresholdProrationRatioFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ThresholdProrationRatioFilter field
   */
  public String[] getThresholdProrationRatioFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getThresholdProrationRatioFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getThresholdProrationRatioFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getThresholdProrationRatioFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ThresholdProrationRatioFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getThresholdProrationRatioFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ThresholdProrationRatioFilter filter value from a formatted string
   *
   * @param _value the ThresholdProrationRatioFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ThresholdProrationRatioFilter filter field
   */
  public void setThresholdProrationRatioFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setThresholdProrationRatioFilterFromFormattedString");
    try {
      this.setThresholdProrationRatioFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ThresholdProrationRatioFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setThresholdProrationRatioFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setThresholdProrationRatioFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ProfileId (CDR_DATA_DUC.profile_id)
   * @param fetch whether to fetch this field or not
   */
  public void setProfileIdFetch (boolean fetch) {
    this.ProfileIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ProfileId (CDR_DATA_DUC.profile_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getProfileIdFetch () {
    return this.ProfileIdFetch;
  }
  /** Set the SortOrder for field: ProfileId (CDR_DATA_DUC.profile_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setProfileIdSortOrder (Integer value) {
    this.ProfileIdSort = value;
  }
  /** Retrieve SortOrder for field: ProfileId (CDR_DATA_DUC.profile_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getProfileIdSortOrder () {
    return this.ProfileIdSort;
  }
  /** Set the sort direction for field: ProfileId (CDR_DATA_DUC.profile_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setProfileIdSortDirection (boolean ascending) {
    this.ProfileIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ProfileId (CDR_DATA_DUC.profile_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getProfileIdSortDirection () {
    return this.ProfileIdSortAscending;
  }
  /** Set the field level filters for field: ProfileId (CDR_DATA_DUC.profile_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setProfileIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ProfileId = value;
  }
  /** Retrieve filter for field: ProfileId (CDR_DATA_DUC.profile_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getProfileIdFilter () {
    return this.ProfileId;
  }

  /**
   * Retrieves the ProfileIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ProfileIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProfileIdFilter field
   */
  public String[] getProfileIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProfileIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getProfileIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProfileIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProfileIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getProfileIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ProfileIdFilter filter value from a formatted string
   *
   * @param _value the ProfileIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ProfileIdFilter filter field
   */
  public void setProfileIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setProfileIdFilterFromFormattedString");
    try {
      this.setProfileIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProfileIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setProfileIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProfileIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ProfileIdServ (CDR_DATA_DUC.profile_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setProfileIdServFetch (boolean fetch) {
    this.ProfileIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: ProfileIdServ (CDR_DATA_DUC.profile_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getProfileIdServFetch () {
    return this.ProfileIdServFetch;
  }
  /** Set the SortOrder for field: ProfileIdServ (CDR_DATA_DUC.profile_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setProfileIdServSortOrder (Integer value) {
    this.ProfileIdServSort = value;
  }
  /** Retrieve SortOrder for field: ProfileIdServ (CDR_DATA_DUC.profile_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getProfileIdServSortOrder () {
    return this.ProfileIdServSort;
  }
  /** Set the sort direction for field: ProfileIdServ (CDR_DATA_DUC.profile_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setProfileIdServSortDirection (boolean ascending) {
    this.ProfileIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ProfileIdServ (CDR_DATA_DUC.profile_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getProfileIdServSortDirection () {
    return this.ProfileIdServSortAscending;
  }
  /** Set the field level filters for field: ProfileIdServ (CDR_DATA_DUC.profile_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setProfileIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.ProfileIdServ = value;
  }
  /** Retrieve filter for field: ProfileIdServ (CDR_DATA_DUC.profile_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getProfileIdServFilter () {
    return this.ProfileIdServ;
  }

  /**
   * Retrieves the ProfileIdServFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ProfileIdServFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProfileIdServFilter field
   */
  public String[] getProfileIdServFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProfileIdServFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getProfileIdServFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProfileIdServFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProfileIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getProfileIdServFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ProfileIdServFilter filter value from a formatted string
   *
   * @param _value the ProfileIdServFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ProfileIdServFilter filter field
   */
  public void setProfileIdServFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setProfileIdServFilterFromFormattedString");
    try {
      this.setProfileIdServFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProfileIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setProfileIdServFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProfileIdServFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: InstanceNum (CDR_DATA_DUC.instance_num)
   * @param fetch whether to fetch this field or not
   */
  public void setInstanceNumFetch (boolean fetch) {
    this.InstanceNumFetch = fetch;
  }
  /** Retrieve Fetch value for field: InstanceNum (CDR_DATA_DUC.instance_num)
   * @return boolean the Fetch value for this field
   */
  public boolean getInstanceNumFetch () {
    return this.InstanceNumFetch;
  }
  /** Set the SortOrder for field: InstanceNum (CDR_DATA_DUC.instance_num)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInstanceNumSortOrder (Integer value) {
    this.InstanceNumSort = value;
  }
  /** Retrieve SortOrder for field: InstanceNum (CDR_DATA_DUC.instance_num)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInstanceNumSortOrder () {
    return this.InstanceNumSort;
  }
  /** Set the sort direction for field: InstanceNum (CDR_DATA_DUC.instance_num)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInstanceNumSortDirection (boolean ascending) {
    this.InstanceNumSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InstanceNum (CDR_DATA_DUC.instance_num)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInstanceNumSortDirection () {
    return this.InstanceNumSortAscending;
  }
  /** Set the field level filters for field: InstanceNum (CDR_DATA_DUC.instance_num)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInstanceNumFilter (IntegerFilter[] value) throws ServiceException {
    this.InstanceNum = value;
  }
  /** Retrieve filter for field: InstanceNum (CDR_DATA_DUC.instance_num)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getInstanceNumFilter () {
    return this.InstanceNum;
  }

  /**
   * Retrieves the InstanceNumFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InstanceNumFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InstanceNumFilter field
   */
  public String[] getInstanceNumFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInstanceNumFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getInstanceNumFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInstanceNumFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InstanceNumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInstanceNumFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the InstanceNumFilter filter value from a formatted string
   *
   * @param _value the InstanceNumFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the InstanceNumFilter filter field
   */
  public void setInstanceNumFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInstanceNumFilterFromFormattedString");
    try {
      this.setInstanceNumFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InstanceNumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInstanceNumFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInstanceNumFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: QuantumPreCharge (CDR_DATA_DUC.quantum_pre_charge)
   * @param fetch whether to fetch this field or not
   */
  public void setQuantumPreChargeFetch (boolean fetch) {
    this.QuantumPreChargeFetch = fetch;
  }
  /** Retrieve Fetch value for field: QuantumPreCharge (CDR_DATA_DUC.quantum_pre_charge)
   * @return boolean the Fetch value for this field
   */
  public boolean getQuantumPreChargeFetch () {
    return this.QuantumPreChargeFetch;
  }
  /** Set the SortOrder for field: QuantumPreCharge (CDR_DATA_DUC.quantum_pre_charge)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setQuantumPreChargeSortOrder (Integer value) {
    this.QuantumPreChargeSort = value;
  }
  /** Retrieve SortOrder for field: QuantumPreCharge (CDR_DATA_DUC.quantum_pre_charge)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getQuantumPreChargeSortOrder () {
    return this.QuantumPreChargeSort;
  }
  /** Set the sort direction for field: QuantumPreCharge (CDR_DATA_DUC.quantum_pre_charge)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setQuantumPreChargeSortDirection (boolean ascending) {
    this.QuantumPreChargeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: QuantumPreCharge (CDR_DATA_DUC.quantum_pre_charge)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getQuantumPreChargeSortDirection () {
    return this.QuantumPreChargeSortAscending;
  }
  /** Set the field level filters for field: QuantumPreCharge (CDR_DATA_DUC.quantum_pre_charge)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setQuantumPreChargeFilter (BigIntegerFilter[] value) throws ServiceException {
    this.QuantumPreCharge = value;
  }
  /** Retrieve filter for field: QuantumPreCharge (CDR_DATA_DUC.quantum_pre_charge)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getQuantumPreChargeFilter () {
    return this.QuantumPreCharge;
  }

  /**
   * Retrieves the QuantumPreChargeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The QuantumPreChargeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the QuantumPreChargeFilter field
   */
  public String[] getQuantumPreChargeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getQuantumPreChargeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getQuantumPreChargeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getQuantumPreChargeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("QuantumPreChargeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getQuantumPreChargeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the QuantumPreChargeFilter filter value from a formatted string
   *
   * @param _value the QuantumPreChargeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the QuantumPreChargeFilter filter field
   */
  public void setQuantumPreChargeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setQuantumPreChargeFilterFromFormattedString");
    try {
      this.setQuantumPreChargeFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("QuantumPreChargeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setQuantumPreChargeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setQuantumPreChargeFilterFromFormattedString");
  }

  /**
   * Sets the QuantumPreChargeFilter filter value from a formatted string
   *
   * @param _value the QuantumPreChargeFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the QuantumPreChargeFilter filter field
   */
  public void setQuantumPreChargeFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setQuantumPreChargeFilterFromFormattedCurrencyString");
    try {
      this.setQuantumPreChargeFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("QuantumPreChargeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setQuantumPreChargeFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setQuantumPreChargeFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the QuantumPreChargeFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The QuantumPreChargeFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the QuantumPreChargeFilter field
   */

  public String[] getQuantumPreChargeFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getQuantumPreChargeFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getQuantumPreChargeFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getQuantumPreChargeFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("QuantumPreChargeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getQuantumPreChargeFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: CreateDt (CDR_DATA_DUC.create_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setCreateDtFetch (boolean fetch) {
    this.CreateDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: CreateDt (CDR_DATA_DUC.create_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getCreateDtFetch () {
    return this.CreateDtFetch;
  }
  /** Set the SortOrder for field: CreateDt (CDR_DATA_DUC.create_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCreateDtSortOrder (Integer value) {
    this.CreateDtSort = value;
  }
  /** Retrieve SortOrder for field: CreateDt (CDR_DATA_DUC.create_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCreateDtSortOrder () {
    return this.CreateDtSort;
  }
  /** Set the sort direction for field: CreateDt (CDR_DATA_DUC.create_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCreateDtSortDirection (boolean ascending) {
    this.CreateDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CreateDt (CDR_DATA_DUC.create_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCreateDtSortDirection () {
    return this.CreateDtSortAscending;
  }
  /** Set the field level filters for field: CreateDt (CDR_DATA_DUC.create_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCreateDtFilter (DateFilter[] value) throws ServiceException {
    this.CreateDt = value;
  }
  /** Retrieve filter for field: CreateDt (CDR_DATA_DUC.create_dt)
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


  /** Set the field level Fetch value for field: InstanceStartDt (CDR_DATA_DUC.instance_start_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setInstanceStartDtFetch (boolean fetch) {
    this.InstanceStartDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: InstanceStartDt (CDR_DATA_DUC.instance_start_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getInstanceStartDtFetch () {
    return this.InstanceStartDtFetch;
  }
  /** Set the SortOrder for field: InstanceStartDt (CDR_DATA_DUC.instance_start_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInstanceStartDtSortOrder (Integer value) {
    this.InstanceStartDtSort = value;
  }
  /** Retrieve SortOrder for field: InstanceStartDt (CDR_DATA_DUC.instance_start_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInstanceStartDtSortOrder () {
    return this.InstanceStartDtSort;
  }
  /** Set the sort direction for field: InstanceStartDt (CDR_DATA_DUC.instance_start_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInstanceStartDtSortDirection (boolean ascending) {
    this.InstanceStartDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InstanceStartDt (CDR_DATA_DUC.instance_start_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInstanceStartDtSortDirection () {
    return this.InstanceStartDtSortAscending;
  }
  /** Set the field level filters for field: InstanceStartDt (CDR_DATA_DUC.instance_start_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInstanceStartDtFilter (DateFilter[] value) throws ServiceException {
    this.InstanceStartDt = value;
  }
  /** Retrieve filter for field: InstanceStartDt (CDR_DATA_DUC.instance_start_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getInstanceStartDtFilter () {
    return this.InstanceStartDt;
  }

  /**
   * Retrieves the InstanceStartDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InstanceStartDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InstanceStartDtFilter field
   */
  public String[] getInstanceStartDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInstanceStartDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getInstanceStartDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInstanceStartDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InstanceStartDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInstanceStartDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the InstanceStartDtFilter filter value from a formatted string
   *
   * @param _value the InstanceStartDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the InstanceStartDtFilter filter field
   */
  public void setInstanceStartDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInstanceStartDtFilterFromFormattedString");
    try {
      this.setInstanceStartDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InstanceStartDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInstanceStartDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInstanceStartDtFilterFromFormattedString");
  }

  /**
   * Retrieves the InstanceStartDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InstanceStartDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the InstanceStartDtFilter field
   */
  public String[] getInstanceStartDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInstanceStartDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getInstanceStartDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInstanceStartDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InstanceStartDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInstanceStartDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the InstanceStartDtFilter filter value from a formatted string
   *
   * @param _value the InstanceStartDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the InstanceStartDtFilter filter field
   */
  public void setInstanceStartDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInstanceStartDtFilterFromFormattedDateTimeString");
    try {
      this.setInstanceStartDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InstanceStartDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInstanceStartDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInstanceStartDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: Annotation (CDR_DATA_DUC.annotation)
   * @param fetch whether to fetch this field or not
   */
  public void setAnnotationFetch (boolean fetch) {
    this.AnnotationFetch = fetch;
  }
  /** Retrieve Fetch value for field: Annotation (CDR_DATA_DUC.annotation)
   * @return boolean the Fetch value for this field
   */
  public boolean getAnnotationFetch () {
    return this.AnnotationFetch;
  }
  /** Set the SortOrder for field: Annotation (CDR_DATA_DUC.annotation)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAnnotationSortOrder (Integer value) {
    this.AnnotationSort = value;
  }
  /** Retrieve SortOrder for field: Annotation (CDR_DATA_DUC.annotation)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAnnotationSortOrder () {
    return this.AnnotationSort;
  }
  /** Set the sort direction for field: Annotation (CDR_DATA_DUC.annotation)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAnnotationSortDirection (boolean ascending) {
    this.AnnotationSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Annotation (CDR_DATA_DUC.annotation)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAnnotationSortDirection () {
    return this.AnnotationSortAscending;
  }
  /** Set the case insensitive for field: Annotation (CDR_DATA_DUC.annotation)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAnnotationCaseInsensitive (boolean ascending) {
    this.AnnotationCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: Annotation (CDR_DATA_DUC.annotation)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getAnnotationCaseInsensitive () {
    return this.AnnotationCaseInsensitive;
  }
  /** Set the field level filters for field: Annotation (CDR_DATA_DUC.annotation)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAnnotationFilter (StringFilter[] value) throws ServiceException {
    this.Annotation = value;
  }
  /** Retrieve filter for field: Annotation (CDR_DATA_DUC.annotation)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getAnnotationFilter () {
    return this.Annotation;
  }

  /**
   * Retrieves the AnnotationFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AnnotationFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AnnotationFilter field
   */
  public String[] getAnnotationFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAnnotationFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAnnotationFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAnnotationFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AnnotationFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAnnotationFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AnnotationFilter filter value from a formatted string
   *
   * @param _value the AnnotationFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AnnotationFilter filter field
   */
  public void setAnnotationFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAnnotationFilterFromFormattedString");
    try {
      this.setAnnotationFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AnnotationFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAnnotationFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAnnotationFilterFromFormattedString");
  }

  public String toString() {
    return CdrDataDucObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return CdrDataDucObjectHelper.toMap(this, null);
  }
}
