/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: GlobalContractObjectData.java
 * Definition File: Customer/GlobalContract.xml
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
import java.util.Locale;
import java.math.BigInteger;
import java.util.Map;
import java.util.Locale;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlTransient;

import javax.ws.rs.QueryParam;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.csgsystems.aruba.connection.ServiceException;
import com.csgsystems.aruba.*;

import com.csgsystems.api.utilities.Logger;
import com.csgsystems.api.utilities.ObjectHelper;

import com.csgsystems.api.constraint.ConstraintManager;
import com.csgsystems.api.constraint.ConstraintException;

import com.csgsystems.api.defaults.DefaultManager;

import com.csgsystems.api.bulk.*;


import com.csgsystems.api.format.FieldFormatMgr;

import com.csgsystems.aruba.filter.*;

import com.csgsystems.api.enumeration.Enumeration;
import com.csgsystems.api.enumeration.EnumerationFilter;
import com.csgsystems.api.enumeration.EnumeratedDataMgr;


import com.csgsystems.api.base.BaseExtObjectData;
  
/** GlobalContractObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class GlobalContractObjectData extends BaseExtObjectData implements Serializable
{

  /** the object's key data */
  public GlobalContractObjectKeyData Key = null;
  /** CUSTOMER_CONTRACT_KEY.tracking_id field */
  public    Integer TrackingId  = null;
  protected boolean _TrackingIdSet = false;
  /** CUSTOMER_CONTRACT_KEY.tracking_id_serv field */
  public    Integer TrackingIdServ  = null;
  protected boolean _TrackingIdServSet = false;
  /** CUSTOMER_CONTRACT_KEY.create_dt field */
  public    Date CreateDt  = null;
  protected boolean _CreateDtSet = false;
  /** CUSTOMER_CONTRACT_KEY.in_use field */
  public    String InUse  = null;
  protected boolean _InUseSet = false;
  /** CUSTOMER_CONTRACT_KEY.arch_flag field */
  public    Boolean ArchFlag  = null;
  protected boolean _ArchFlagSet = false;
  /** CUSTOMER_CONTRACT_KEY.avail_periods field */
  public    Integer AvailPeriods  = null;
  protected boolean _AvailPeriodsSet = false;
  /** CUSTOMER_CONTRACT_KEY.first_use_dt field */
  public    Date FirstUseDt  = null;
  protected boolean _FirstUseDtSet = false;
  /** CUSTOMER_CONTRACT_KEY.last_use_dt field */
  public    Date LastUseDt  = null;
  protected boolean _LastUseDtSet = false;
  /** CUSTOMER_CONTRACT_KEY.commitment_amount field */
  public    BigInteger CommitmentAmount  = null;
  protected boolean _CommitmentAmountSet = false;
  /** CUSTOMER_CONTRACT_KEY.commitment_currency_code field */
  public    Integer CommitmentCurrencyCode  = null;
  protected boolean _CommitmentCurrencyCodeSet = false;
  /** CUSTOMER_CONTRACT_KEY.total_savings_amount field */
  public    BigInteger TotalSavingsAmount  = null;
  protected boolean _TotalSavingsAmountSet = false;
  /** CUSTOMER_CONTRACT_KEY.total_element_amount field */
  public    BigInteger TotalElementAmount  = null;
  protected boolean _TotalElementAmountSet = false;
  /** CUSTOMER_CONTRACT_KEY.prev_eval_date field */
  public    Date PrevEvalDate  = null;
  protected boolean _PrevEvalDateSet = false;
  /** CUSTOMER_CONTRACT_KEY.next_eval_date field */
  public    Date NextEvalDate  = null;
  protected boolean _NextEvalDateSet = false;
  /** CUSTOMER_CONTRACT_VIEW.view_status field */
  public    Integer ViewStatus  = null;
  protected boolean _ViewStatusSet = false;
  /** CUSTOMER_CONTRACT_VIEW.view_created_dt field */
  public    Date ViewCreatedDt  = null;
  protected boolean _ViewCreatedDtSet = false;
  /** CUSTOMER_CONTRACT_VIEW.view_effective_dt field */
  public    Date ViewEffectiveDt  = null;
  protected boolean _ViewEffectiveDtSet = false;
  /** CUSTOMER_CONTRACT_VIEW.intended_view_effective_dt field */
  public    Date IntendedViewEffectiveDt  = null;
  protected boolean _IntendedViewEffectiveDtSet = false;
  /** CUSTOMER_CONTRACT_VIEW.prev_view_id field */
  public    BigInteger PrevViewId  = null;
  protected boolean _PrevViewIdSet = false;
  /** CUSTOMER_CONTRACT_VIEW.contract_type field */
  public    Integer ContractType  = null;
  protected boolean _ContractTypeSet = false;
  /** CUSTOMER_CONTRACT_VIEW.contract_id field */
  public    String ContractId  = null;
  protected boolean _ContractIdSet = false;
  /** CUSTOMER_CONTRACT_VIEW.parent_group_no field */
  public    Integer ParentGroupNo  = null;
  protected boolean _ParentGroupNoSet = false;
  /** CUSTOMER_CONTRACT_VIEW.start_dt field */
  public    Date StartDt  = null;
  protected boolean _StartDtSet = false;
  /** CUSTOMER_CONTRACT_VIEW.end_dt field */
  public    Date EndDt  = null;
  protected boolean _EndDtSet = false;
  /** CUSTOMER_CONTRACT_VIEW.prev_end_dt field */
  public    Date PrevEndDt  = null;
  protected boolean _PrevEndDtSet = false;
  /** CUSTOMER_CONTRACT_VIEW.grace_period field */
  public    Integer GracePeriod  = null;
  protected boolean _GracePeriodSet = false;
  /** CUSTOMER_CONTRACT_VIEW.total_periods field */
  public    Integer TotalPeriods  = null;
  protected boolean _TotalPeriodsSet = false;
  /** CUSTOMER_CONTRACT_VIEW.sales_channel_id field */
  public    Integer SalesChannelId  = null;
  protected boolean _SalesChannelIdSet = false;
  /** CUSTOMER_CONTRACT_VIEW.track_total_amounts field */
  public    Boolean TrackTotalAmounts  = null;
  protected boolean _TrackTotalAmountsSet = false;
  /** CUSTOMER_CONTRACT_VIEW.rollover_period field */
  public    Integer RolloverPeriod  = null;
  protected boolean _RolloverPeriodSet = false;
  /** CUSTOMER_CONTRACT_VIEW.rollover_period_start field */
  public    Integer RolloverPeriodStart  = null;
  protected boolean _RolloverPeriodStartSet = false;
  /** CUSTOMER_CONTRACT_VIEW.bill_period field */
  public    String BillPeriod  = null;
  protected boolean _BillPeriodSet = false;
  /** CUSTOMER_CONTRACT_VIEW.distribute_payback field */
  public    Boolean DistributePayback  = null;
  protected boolean _DistributePaybackSet = false;
  /** CUSTOMER_CONTRACT_VIEW.prorate_contract_strt_override field */
  public    Integer ProrateContractStrtOverride  = null;
  protected boolean _ProrateContractStrtOverrideSet = false;
  /** CUSTOMER_CONTRACT_VIEW.prorate_contract_end_override field */
  public    Integer ProrateContractEndOverride  = null;
  protected boolean _ProrateContractEndOverrideSet = false;
  /** CUSTOMER_CONTRACT_VIEW.prorate_interim_bill_override field */
  public    Integer ProrateInterimBillOverride  = null;
  protected boolean _ProrateInterimBillOverrideSet = false;
  /** CUSTOMER_CONTRACT_VIEW.prorate_period_change_override field */
  public    Integer ProratePeriodChangeOverride  = null;
  protected boolean _ProratePeriodChangeOverrideSet = false;
  /** CUSTOMER_CONTRACT_VIEW.prorate_account_start_override field */
  public    Integer ProrateAccountStartOverride  = null;
  protected boolean _ProrateAccountStartOverrideSet = false;
  /** CUSTOMER_CONTRACT_VIEW.prorate_account_end_override field */
  public    Integer ProrateAccountEndOverride  = null;
  protected boolean _ProrateAccountEndOverrideSet = false;
  /** CUSTOMER_CONTRACT_VIEW.prorate_tgt_threshold_override field */
  public    Integer ProrateTgtThresholdOverride  = null;
  protected boolean _ProrateTgtThresholdOverrideSet = false;
  /** CUSTOMER_CONTRACT_VIEW.prorate_tgt_rebates_override field */
  public    Integer ProrateTgtRebatesOverride  = null;
  protected boolean _ProrateTgtRebatesOverrideSet = false;
  /** CUSTOMER_CONTRACT_VIEW.start_by_dt field */
  public    Date StartByDt  = null;
  protected boolean _StartByDtSet = false;
  /** CUSTOMER_CONTRACT_VIEW.notice_end_dt field */
  public    Date NoticeEndDt  = null;
  protected boolean _NoticeEndDtSet = false;
  /** CUSTOMER_CONTRACT_VIEW.duration_override field */
  public    Boolean DurationOverride  = null;
  protected boolean _DurationOverrideSet = false;
  /** CUSTOMER_CONTRACT_VIEW.notice_override field */
  public    Boolean NoticeOverride  = null;
  protected boolean _NoticeOverrideSet = false;
  /** CUSTOMER_CONTRACT_VIEW.is_part_of_component field */
  public    Boolean IsPartOfComponent  = null;
  protected boolean _IsPartOfComponentSet = false;
  /** CUSTOMER_CONTRACT_VIEW.element_id field */
  public    Integer ElementId  = null;
  protected boolean _ElementIdSet = false;
  /** CUSTOMER_CONTRACT_VIEW.commitment_reference field */
  public    Integer CommitmentReference  = null;
  protected boolean _CommitmentReferenceSet = false;
  /** CUSTOMER_CONTRACT_VIEW.min_duration_date field */
  public    Date MinDurationDate  = null;
  protected boolean _MinDurationDateSet = false;
  /** CUSTOMER_CONTRACT_VIEW.min_notice_date field */
  public    Date MinNoticeDate  = null;
  protected boolean _MinNoticeDateSet = false;
  /** CUSTOMER_CONTRACT_VIEW.is_custom field */
  public    Integer IsCustom  = null;
  protected boolean _IsCustomSet = false;
  private String _objName = "GlobalContractObjectData";
  /** Default constructor */
  public GlobalContractObjectData ()
  {
    super ();
    tableName = "";
  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public GlobalContractObjectData (GlobalContractObjectData other)
  {
    tableName = "";
    if (other == null) return;
    this.Key = new GlobalContractObjectKeyData (other.Key);
    this.TrackingId = other.TrackingId;
    this._TrackingIdSet = other._TrackingIdSet;
    this.TrackingIdServ = other.TrackingIdServ;
    this._TrackingIdServSet = other._TrackingIdServSet;
    this.CreateDt = other.CreateDt;
    this._CreateDtSet = other._CreateDtSet;
    this.InUse = other.InUse;
    this._InUseSet = other._InUseSet;
    this.ArchFlag = other.ArchFlag;
    this._ArchFlagSet = other._ArchFlagSet;
    this.AvailPeriods = other.AvailPeriods;
    this._AvailPeriodsSet = other._AvailPeriodsSet;
    this.FirstUseDt = other.FirstUseDt;
    this._FirstUseDtSet = other._FirstUseDtSet;
    this.LastUseDt = other.LastUseDt;
    this._LastUseDtSet = other._LastUseDtSet;
    this.CommitmentAmount = other.CommitmentAmount;
    this._CommitmentAmountSet = other._CommitmentAmountSet;
    this.CommitmentCurrencyCode = other.CommitmentCurrencyCode;
    this._CommitmentCurrencyCodeSet = other._CommitmentCurrencyCodeSet;
    this.TotalSavingsAmount = other.TotalSavingsAmount;
    this._TotalSavingsAmountSet = other._TotalSavingsAmountSet;
    this.TotalElementAmount = other.TotalElementAmount;
    this._TotalElementAmountSet = other._TotalElementAmountSet;
    this.PrevEvalDate = other.PrevEvalDate;
    this._PrevEvalDateSet = other._PrevEvalDateSet;
    this.NextEvalDate = other.NextEvalDate;
    this._NextEvalDateSet = other._NextEvalDateSet;
    this.ViewStatus = other.ViewStatus;
    this._ViewStatusSet = other._ViewStatusSet;
    this.ViewCreatedDt = other.ViewCreatedDt;
    this._ViewCreatedDtSet = other._ViewCreatedDtSet;
    this.ViewEffectiveDt = other.ViewEffectiveDt;
    this._ViewEffectiveDtSet = other._ViewEffectiveDtSet;
    this.IntendedViewEffectiveDt = other.IntendedViewEffectiveDt;
    this._IntendedViewEffectiveDtSet = other._IntendedViewEffectiveDtSet;
    this.PrevViewId = other.PrevViewId;
    this._PrevViewIdSet = other._PrevViewIdSet;
    this.ContractType = other.ContractType;
    this._ContractTypeSet = other._ContractTypeSet;
    this.ContractId = other.ContractId;
    this._ContractIdSet = other._ContractIdSet;
    this.ParentGroupNo = other.ParentGroupNo;
    this._ParentGroupNoSet = other._ParentGroupNoSet;
    this.StartDt = other.StartDt;
    this._StartDtSet = other._StartDtSet;
    this.EndDt = other.EndDt;
    this._EndDtSet = other._EndDtSet;
    this.PrevEndDt = other.PrevEndDt;
    this._PrevEndDtSet = other._PrevEndDtSet;
    this.GracePeriod = other.GracePeriod;
    this._GracePeriodSet = other._GracePeriodSet;
    this.TotalPeriods = other.TotalPeriods;
    this._TotalPeriodsSet = other._TotalPeriodsSet;
    this.SalesChannelId = other.SalesChannelId;
    this._SalesChannelIdSet = other._SalesChannelIdSet;
    this.TrackTotalAmounts = other.TrackTotalAmounts;
    this._TrackTotalAmountsSet = other._TrackTotalAmountsSet;
    this.RolloverPeriod = other.RolloverPeriod;
    this._RolloverPeriodSet = other._RolloverPeriodSet;
    this.RolloverPeriodStart = other.RolloverPeriodStart;
    this._RolloverPeriodStartSet = other._RolloverPeriodStartSet;
    this.BillPeriod = other.BillPeriod;
    this._BillPeriodSet = other._BillPeriodSet;
    this.DistributePayback = other.DistributePayback;
    this._DistributePaybackSet = other._DistributePaybackSet;
    this.ProrateContractStrtOverride = other.ProrateContractStrtOverride;
    this._ProrateContractStrtOverrideSet = other._ProrateContractStrtOverrideSet;
    this.ProrateContractEndOverride = other.ProrateContractEndOverride;
    this._ProrateContractEndOverrideSet = other._ProrateContractEndOverrideSet;
    this.ProrateInterimBillOverride = other.ProrateInterimBillOverride;
    this._ProrateInterimBillOverrideSet = other._ProrateInterimBillOverrideSet;
    this.ProratePeriodChangeOverride = other.ProratePeriodChangeOverride;
    this._ProratePeriodChangeOverrideSet = other._ProratePeriodChangeOverrideSet;
    this.ProrateAccountStartOverride = other.ProrateAccountStartOverride;
    this._ProrateAccountStartOverrideSet = other._ProrateAccountStartOverrideSet;
    this.ProrateAccountEndOverride = other.ProrateAccountEndOverride;
    this._ProrateAccountEndOverrideSet = other._ProrateAccountEndOverrideSet;
    this.ProrateTgtThresholdOverride = other.ProrateTgtThresholdOverride;
    this._ProrateTgtThresholdOverrideSet = other._ProrateTgtThresholdOverrideSet;
    this.ProrateTgtRebatesOverride = other.ProrateTgtRebatesOverride;
    this._ProrateTgtRebatesOverrideSet = other._ProrateTgtRebatesOverrideSet;
    this.StartByDt = other.StartByDt;
    this._StartByDtSet = other._StartByDtSet;
    this.NoticeEndDt = other.NoticeEndDt;
    this._NoticeEndDtSet = other._NoticeEndDtSet;
    this.DurationOverride = other.DurationOverride;
    this._DurationOverrideSet = other._DurationOverrideSet;
    this.NoticeOverride = other.NoticeOverride;
    this._NoticeOverrideSet = other._NoticeOverrideSet;
    this.IsPartOfComponent = other.IsPartOfComponent;
    this._IsPartOfComponentSet = other._IsPartOfComponentSet;
    this.ElementId = other.ElementId;
    this._ElementIdSet = other._ElementIdSet;
    this.CommitmentReference = other.CommitmentReference;
    this._CommitmentReferenceSet = other._CommitmentReferenceSet;
    this.MinDurationDate = other.MinDurationDate;
    this._MinDurationDateSet = other._MinDurationDateSet;
    this.MinNoticeDate = other.MinNoticeDate;
    this._MinNoticeDateSet = other._MinNoticeDateSet;
    this.IsCustom = other.IsCustom;
    this._IsCustomSet = other._IsCustomSet;
    this.extendedData = other.extendedData;    

  }

  /** get the Key for this object
   * @return GlobalContractObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public GlobalContractObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (GlobalContractObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: ViewId (CUSTOMER_CONTRACT_VIEW.view_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setViewId (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ViewId", "setViewId");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ViewId", "setViewId");
    }
    if (this.Key == null) this.Key = new GlobalContractObjectKeyData ();
    this.Key.ViewId = value;
    this.Key._ViewIdSet = true;
  }
  /** get the value of the field: ViewId (CUSTOMER_CONTRACT_VIEW.view_id)
   * @return BigInteger the value
   */
  public BigInteger getViewId () {
    if (this.Key == null) return null;
    return this.Key.ViewId;
  }
  /** Change the field to not being actively set: ViewId (CUSTOMER_CONTRACT_VIEW.view_id)
   */
  public void unsetViewId () {
    if (this.Key == null) return;
    this.Key._ViewIdSet = false;
  }
  /** See if the field is actively set: ViewId (CUSTOMER_CONTRACT_VIEW.view_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetViewId () {
    if (this.Key == null) return false;
    return this.Key._ViewIdSet;
  }

  /** Retrieves the ViewId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ViewId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ViewId field
   */
   public String getViewIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getViewIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getViewIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getViewId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ViewId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getViewIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ViewId field from a formatted string
   *
   * @param _value the ViewId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ViewId field
   */
   public void setViewIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getViewIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setViewId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ViewId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setViewIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setViewIdFromFormattedString");
   }

  /** set the fields value: TrackingId (CUSTOMER_CONTRACT_KEY.tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TrackingId") 
  public void setTrackingId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingId", "setTrackingId");
    }
    this.TrackingId = value;
    this._TrackingIdSet = true;
  }

  /** Retrieves the TrackingId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TrackingId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TrackingId field
   */
   public String getTrackingIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTrackingIdAsFormattedString");
       return fmtMgr.formatNumber(this.getTrackingId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTrackingIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the TrackingId field from a formatted string
   *
   * @param _value the TrackingId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TrackingId field
   */
   public void setTrackingIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTrackingId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTrackingIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTrackingIdFromFormattedString");
   }

  /** get the value of the field: TrackingId (CUSTOMER_CONTRACT_KEY.tracking_id)
   * @return Integer the value
   */
  public Integer getTrackingId () {
    return this.TrackingId;
  }
  /** Change the field to not being actively set: TrackingId (CUSTOMER_CONTRACT_KEY.tracking_id)
   */
  public void unsetTrackingId () {
    this._TrackingIdSet = false;
  }
  /** See if the field is actively set: TrackingId (CUSTOMER_CONTRACT_KEY.tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetTrackingId () {
    return this._TrackingIdSet;
  }
  /** set the fields value: TrackingIdServ (CUSTOMER_CONTRACT_KEY.tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TrackingIdServ") 
  public void setTrackingIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingIdServ", "setTrackingIdServ");
    }
    this.TrackingIdServ = value;
    this._TrackingIdServSet = true;
  }

  /** Retrieves the TrackingIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TrackingIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TrackingIdServ field
   */
   public String getTrackingIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTrackingIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getTrackingIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTrackingIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the TrackingIdServ field from a formatted string
   *
   * @param _value the TrackingIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TrackingIdServ field
   */
   public void setTrackingIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTrackingIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTrackingIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTrackingIdServFromFormattedString");
   }

  /** get the value of the field: TrackingIdServ (CUSTOMER_CONTRACT_KEY.tracking_id_serv)
   * @return Integer the value
   */
  public Integer getTrackingIdServ () {
    return this.TrackingIdServ;
  }
  /** Change the field to not being actively set: TrackingIdServ (CUSTOMER_CONTRACT_KEY.tracking_id_serv)
   */
  public void unsetTrackingIdServ () {
    this._TrackingIdServSet = false;
  }
  /** See if the field is actively set: TrackingIdServ (CUSTOMER_CONTRACT_KEY.tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetTrackingIdServ () {
    return this._TrackingIdServSet;
  }
  /** set the fields value: CreateDt (CUSTOMER_CONTRACT_KEY.create_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CreateDt") 
  public void setCreateDt (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CreateDt", "setCreateDt");
    }
    this.CreateDt = value;
    this._CreateDtSet = true;
  }

  /** Retrieves the CreateDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CreateDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CreateDt field
   */
   public String getCreateDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreateDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCreateDtAsFormattedString");
       return fmtMgr.formatDate(this.getCreateDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CreateDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCreateDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the CreateDt field from a formatted string
   *
   * @param _value the CreateDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CreateDt field
   */
   public void setCreateDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreateDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCreateDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CreateDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCreateDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCreateDtFromFormattedString");
   }

  /**
   * Retrieves the CreateDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CreateDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the CreateDt field
   */
  public String getCreateDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreateDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCreateDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getCreateDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CreateDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCreateDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the CreateDt field value from a formatted date/time string
   *
   * @param _value the CreateDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CreateDt field
   */
  public void setCreateDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCreateDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setCreateDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CreateDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCreateDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: CreateDt (CUSTOMER_CONTRACT_KEY.create_dt)
   * @return Date the value
   */
  public Date getCreateDt () {
    return this.CreateDt;
  }
  /** Change the field to not being actively set: CreateDt (CUSTOMER_CONTRACT_KEY.create_dt)
   */
  public void unsetCreateDt () {
    this._CreateDtSet = false;
  }
  /** See if the field is actively set: CreateDt (CUSTOMER_CONTRACT_KEY.create_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetCreateDt () {
    return this._CreateDtSet;
  }
  /** set the fields value: InUse (CUSTOMER_CONTRACT_KEY.in_use)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("InUse") 
  public void setInUse (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 8))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "InUse", "setInUse");
    }
    this.InUse = value;
    this._InUseSet = true;
  }

  /** Retrieves the InUse field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InUse field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InUse field
   */
   public String getInUseAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInUseAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInUseAsFormattedString");
       return fmtMgr.formatString(this.getInUse());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InUse");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInUseAsFormattedString");
       throw x;
     }
   }
  /** Sets the InUse field from a formatted string
   *
   * @param _value the InUse field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InUse field
   */
   public void setInUseFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInUseFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInUse(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InUse");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInUseFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInUseFromFormattedString");
   }

  /** get the value of the field: InUse (CUSTOMER_CONTRACT_KEY.in_use)
   * @return String the value
   */
  public String getInUse () {
    return this.InUse;
  }
  /** Change the field to not being actively set: InUse (CUSTOMER_CONTRACT_KEY.in_use)
   */
  public void unsetInUse () {
    this._InUseSet = false;
  }
  /** See if the field is actively set: InUse (CUSTOMER_CONTRACT_KEY.in_use)
   * @return boolean whether the field is actively set
   */
  public boolean issetInUse () {
    return this._InUseSet;
  }
  /** set the fields value: ArchFlag (CUSTOMER_CONTRACT_KEY.arch_flag)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ArchFlag") 
  public void setArchFlag (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ArchFlag", "setArchFlag");
    }
    this.ArchFlag = value;
    this._ArchFlagSet = true;
  }

  /** Retrieves the ArchFlag field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ArchFlag field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ArchFlag field
   */
   public String getArchFlagAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getArchFlagAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getArchFlagAsFormattedString");
       return fmtMgr.formatBoolean(this.getArchFlag());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ArchFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getArchFlagAsFormattedString");
       throw x;
     }
   }
  /** Sets the ArchFlag field from a formatted string
   *
   * @param _value the ArchFlag field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ArchFlag field
   */
   public void setArchFlagFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getArchFlagFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setArchFlag(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ArchFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setArchFlagFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setArchFlagFromFormattedString");
   }

  /** get the value of the field: ArchFlag (CUSTOMER_CONTRACT_KEY.arch_flag)
   * @return Boolean the value
   */
  public Boolean getArchFlag () {
    return this.ArchFlag;
  }
  /** Change the field to not being actively set: ArchFlag (CUSTOMER_CONTRACT_KEY.arch_flag)
   */
  public void unsetArchFlag () {
    this._ArchFlagSet = false;
  }
  /** See if the field is actively set: ArchFlag (CUSTOMER_CONTRACT_KEY.arch_flag)
   * @return boolean whether the field is actively set
   */
  public boolean issetArchFlag () {
    return this._ArchFlagSet;
  }
  /** set the fields value: AvailPeriods (CUSTOMER_CONTRACT_KEY.avail_periods)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AvailPeriods") 
  public void setAvailPeriods (Integer value) throws ServiceException
  {
    this.AvailPeriods = value;
    this._AvailPeriodsSet = true;
  }

  /** Retrieves the AvailPeriods field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AvailPeriods field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AvailPeriods field
   */
   public String getAvailPeriodsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAvailPeriodsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAvailPeriodsAsFormattedString");
       return fmtMgr.formatNumber(this.getAvailPeriods(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AvailPeriods");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAvailPeriodsAsFormattedString");
       throw x;
     }
   }
  /** Sets the AvailPeriods field from a formatted string
   *
   * @param _value the AvailPeriods field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AvailPeriods field
   */
   public void setAvailPeriodsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAvailPeriodsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAvailPeriods(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AvailPeriods");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAvailPeriodsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAvailPeriodsFromFormattedString");
   }

  /** get the value of the field: AvailPeriods (CUSTOMER_CONTRACT_KEY.avail_periods)
   * @return Integer the value
   */
  public Integer getAvailPeriods () {
    return this.AvailPeriods;
  }
  /** Change the field to not being actively set: AvailPeriods (CUSTOMER_CONTRACT_KEY.avail_periods)
   */
  public void unsetAvailPeriods () {
    this._AvailPeriodsSet = false;
  }
  /** See if the field is actively set: AvailPeriods (CUSTOMER_CONTRACT_KEY.avail_periods)
   * @return boolean whether the field is actively set
   */
  public boolean issetAvailPeriods () {
    return this._AvailPeriodsSet;
  }
  /** set the fields value: FirstUseDt (CUSTOMER_CONTRACT_KEY.first_use_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FirstUseDt") 
  public void setFirstUseDt (Date value) throws ServiceException
  {
    this.FirstUseDt = value;
    this._FirstUseDtSet = true;
  }

  /** Retrieves the FirstUseDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FirstUseDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FirstUseDt field
   */
   public String getFirstUseDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFirstUseDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFirstUseDtAsFormattedString");
       return fmtMgr.formatDate(this.getFirstUseDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FirstUseDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFirstUseDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the FirstUseDt field from a formatted string
   *
   * @param _value the FirstUseDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FirstUseDt field
   */
   public void setFirstUseDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFirstUseDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFirstUseDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FirstUseDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFirstUseDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFirstUseDtFromFormattedString");
   }

  /**
   * Retrieves the FirstUseDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FirstUseDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the FirstUseDt field
   */
  public String getFirstUseDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFirstUseDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFirstUseDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getFirstUseDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FirstUseDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFirstUseDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the FirstUseDt field value from a formatted date/time string
   *
   * @param _value the FirstUseDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FirstUseDt field
   */
  public void setFirstUseDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFirstUseDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setFirstUseDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FirstUseDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFirstUseDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: FirstUseDt (CUSTOMER_CONTRACT_KEY.first_use_dt)
   * @return Date the value
   */
  public Date getFirstUseDt () {
    return this.FirstUseDt;
  }
  /** Change the field to not being actively set: FirstUseDt (CUSTOMER_CONTRACT_KEY.first_use_dt)
   */
  public void unsetFirstUseDt () {
    this._FirstUseDtSet = false;
  }
  /** See if the field is actively set: FirstUseDt (CUSTOMER_CONTRACT_KEY.first_use_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetFirstUseDt () {
    return this._FirstUseDtSet;
  }
  /** set the fields value: LastUseDt (CUSTOMER_CONTRACT_KEY.last_use_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("LastUseDt") 
  public void setLastUseDt (Date value) throws ServiceException
  {
    this.LastUseDt = value;
    this._LastUseDtSet = true;
  }

  /** Retrieves the LastUseDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The LastUseDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LastUseDt field
   */
   public String getLastUseDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLastUseDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLastUseDtAsFormattedString");
       return fmtMgr.formatDate(this.getLastUseDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LastUseDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getLastUseDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the LastUseDt field from a formatted string
   *
   * @param _value the LastUseDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the LastUseDt field
   */
   public void setLastUseDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLastUseDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setLastUseDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LastUseDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setLastUseDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLastUseDtFromFormattedString");
   }

  /**
   * Retrieves the LastUseDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The LastUseDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the LastUseDt field
   */
  public String getLastUseDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLastUseDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLastUseDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getLastUseDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LastUseDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getLastUseDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the LastUseDt field value from a formatted date/time string
   *
   * @param _value the LastUseDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the LastUseDt field
   */
  public void setLastUseDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setLastUseDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setLastUseDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LastUseDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setLastUseDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: LastUseDt (CUSTOMER_CONTRACT_KEY.last_use_dt)
   * @return Date the value
   */
  public Date getLastUseDt () {
    return this.LastUseDt;
  }
  /** Change the field to not being actively set: LastUseDt (CUSTOMER_CONTRACT_KEY.last_use_dt)
   */
  public void unsetLastUseDt () {
    this._LastUseDtSet = false;
  }
  /** See if the field is actively set: LastUseDt (CUSTOMER_CONTRACT_KEY.last_use_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetLastUseDt () {
    return this._LastUseDtSet;
  }
  /** set the fields value: CommitmentAmount (CUSTOMER_CONTRACT_KEY.commitment_amount)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CommitmentAmount") 
  public void setCommitmentAmount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CommitmentAmount", "setCommitmentAmount");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CommitmentAmount", "setCommitmentAmount");
    }
    this.CommitmentAmount = value;
    this._CommitmentAmountSet = true;
  }

  /** Retrieves the CommitmentAmount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CommitmentAmount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CommitmentAmount field
   */
   public String getCommitmentAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCommitmentAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCommitmentAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getCommitmentAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CommitmentAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCommitmentAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the CommitmentAmount field from a formatted string
   *
   * @param _value the CommitmentAmount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CommitmentAmount field
   */
   public void setCommitmentAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCommitmentAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCommitmentAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CommitmentAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCommitmentAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCommitmentAmountFromFormattedString");
   }

  /**
   * Retrieves the CommitmentAmount field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CommitmentAmount field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the CommitmentAmount field
   */
  public String getCommitmentAmountAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCommitmentAmountAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCommitmentAmountAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getCommitmentAmount(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CommitmentAmount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCommitmentAmountAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the CommitmentAmount field value from a formatted currency string
   *
   * @param _value the CommitmentAmount field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CommitmentAmount field
   */
  public void setCommitmentAmountFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCommitmentAmountFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setCommitmentAmount(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CommitmentAmount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCommitmentAmountFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCommitmentAmountFromFormattedCurrencyString");
  }

  /** get the value of the field: CommitmentAmount (CUSTOMER_CONTRACT_KEY.commitment_amount)
   * @return BigInteger the value
   */
  public BigInteger getCommitmentAmount () {
    return this.CommitmentAmount;
  }
  /** Change the field to not being actively set: CommitmentAmount (CUSTOMER_CONTRACT_KEY.commitment_amount)
   */
  public void unsetCommitmentAmount () {
    this._CommitmentAmountSet = false;
  }
  /** See if the field is actively set: CommitmentAmount (CUSTOMER_CONTRACT_KEY.commitment_amount)
   * @return boolean whether the field is actively set
   */
  public boolean issetCommitmentAmount () {
    return this._CommitmentAmountSet;
  }
  /** set the fields value: CommitmentCurrencyCode (CUSTOMER_CONTRACT_KEY.commitment_currency_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CommitmentCurrencyCode") 
  public void setCommitmentCurrencyCode (Integer value) throws ServiceException
  {
    this.CommitmentCurrencyCode = value;
    this._CommitmentCurrencyCodeSet = true;
  }

  /** Retrieves the CommitmentCurrencyCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CommitmentCurrencyCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CommitmentCurrencyCode field
   */
   public String getCommitmentCurrencyCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCommitmentCurrencyCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCommitmentCurrencyCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getCommitmentCurrencyCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CommitmentCurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCommitmentCurrencyCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the CommitmentCurrencyCode field from a formatted string
   *
   * @param _value the CommitmentCurrencyCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CommitmentCurrencyCode field
   */
   public void setCommitmentCurrencyCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCommitmentCurrencyCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCommitmentCurrencyCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CommitmentCurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCommitmentCurrencyCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCommitmentCurrencyCodeFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated CommitmentCurrencyCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the CommitmentCurrencyCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CommitmentCurrencyCode field
   */

  public String getCommitmentCurrencyCodeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCommitmentCurrencyCodeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getCommitmentCurrencyCodeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCommitmentCurrencyCodeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getCommitmentCurrencyCode()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CommitmentCurrencyCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCommitmentCurrencyCodeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated CommitmentCurrencyCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the CommitmentCurrencyCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CommitmentCurrencyCode field
   */
  public Enumeration getCommitmentCurrencyCodeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCommitmentCurrencyCodeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("Currency", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCommitmentCurrencyCodeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CommitmentCurrencyCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCommitmentCurrencyCodeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated CommitmentCurrencyCode field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setCommitmentCurrencyCodeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCommitmentCurrencyCodeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getCommitmentCurrencyCodeEnumeration(_locale);
      this.setCommitmentCurrencyCode((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CommitmentCurrencyCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCommitmentCurrencyCodeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCommitmentCurrencyCodeFromDisplayValue");
  }

  /** get the value of the field: CommitmentCurrencyCode (CUSTOMER_CONTRACT_KEY.commitment_currency_code)
   * @return Integer the value
   */
  public Integer getCommitmentCurrencyCode () {
    return this.CommitmentCurrencyCode;
  }
  /** Change the field to not being actively set: CommitmentCurrencyCode (CUSTOMER_CONTRACT_KEY.commitment_currency_code)
   */
  public void unsetCommitmentCurrencyCode () {
    this._CommitmentCurrencyCodeSet = false;
  }
  /** See if the field is actively set: CommitmentCurrencyCode (CUSTOMER_CONTRACT_KEY.commitment_currency_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCommitmentCurrencyCode () {
    return this._CommitmentCurrencyCodeSet;
  }
  /** set the fields value: TotalSavingsAmount (CUSTOMER_CONTRACT_KEY.total_savings_amount)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TotalSavingsAmount") 
  public void setTotalSavingsAmount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TotalSavingsAmount", "setTotalSavingsAmount");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "TotalSavingsAmount", "setTotalSavingsAmount");
    }
    this.TotalSavingsAmount = value;
    this._TotalSavingsAmountSet = true;
  }

  /** Retrieves the TotalSavingsAmount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TotalSavingsAmount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalSavingsAmount field
   */
   public String getTotalSavingsAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalSavingsAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalSavingsAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getTotalSavingsAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TotalSavingsAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalSavingsAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the TotalSavingsAmount field from a formatted string
   *
   * @param _value the TotalSavingsAmount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TotalSavingsAmount field
   */
   public void setTotalSavingsAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalSavingsAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTotalSavingsAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TotalSavingsAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalSavingsAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalSavingsAmountFromFormattedString");
   }

  /**
   * Retrieves the TotalSavingsAmount field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TotalSavingsAmount field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalSavingsAmount field
   */
  public String getTotalSavingsAmountAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalSavingsAmountAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalSavingsAmountAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getTotalSavingsAmount(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalSavingsAmount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalSavingsAmountAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the TotalSavingsAmount field value from a formatted currency string
   *
   * @param _value the TotalSavingsAmount field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TotalSavingsAmount field
   */
  public void setTotalSavingsAmountFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTotalSavingsAmountFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setTotalSavingsAmount(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalSavingsAmount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalSavingsAmountFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalSavingsAmountFromFormattedCurrencyString");
  }

  /** get the value of the field: TotalSavingsAmount (CUSTOMER_CONTRACT_KEY.total_savings_amount)
   * @return BigInteger the value
   */
  public BigInteger getTotalSavingsAmount () {
    return this.TotalSavingsAmount;
  }
  /** Change the field to not being actively set: TotalSavingsAmount (CUSTOMER_CONTRACT_KEY.total_savings_amount)
   */
  public void unsetTotalSavingsAmount () {
    this._TotalSavingsAmountSet = false;
  }
  /** See if the field is actively set: TotalSavingsAmount (CUSTOMER_CONTRACT_KEY.total_savings_amount)
   * @return boolean whether the field is actively set
   */
  public boolean issetTotalSavingsAmount () {
    return this._TotalSavingsAmountSet;
  }
  /** set the fields value: TotalElementAmount (CUSTOMER_CONTRACT_KEY.total_element_amount)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TotalElementAmount") 
  public void setTotalElementAmount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TotalElementAmount", "setTotalElementAmount");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "TotalElementAmount", "setTotalElementAmount");
    }
    this.TotalElementAmount = value;
    this._TotalElementAmountSet = true;
  }

  /** Retrieves the TotalElementAmount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TotalElementAmount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalElementAmount field
   */
   public String getTotalElementAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalElementAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalElementAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getTotalElementAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TotalElementAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalElementAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the TotalElementAmount field from a formatted string
   *
   * @param _value the TotalElementAmount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TotalElementAmount field
   */
   public void setTotalElementAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalElementAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTotalElementAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TotalElementAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalElementAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalElementAmountFromFormattedString");
   }

  /**
   * Retrieves the TotalElementAmount field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TotalElementAmount field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalElementAmount field
   */
  public String getTotalElementAmountAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalElementAmountAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalElementAmountAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getTotalElementAmount(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalElementAmount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalElementAmountAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the TotalElementAmount field value from a formatted currency string
   *
   * @param _value the TotalElementAmount field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TotalElementAmount field
   */
  public void setTotalElementAmountFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTotalElementAmountFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setTotalElementAmount(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalElementAmount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalElementAmountFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalElementAmountFromFormattedCurrencyString");
  }

  /** get the value of the field: TotalElementAmount (CUSTOMER_CONTRACT_KEY.total_element_amount)
   * @return BigInteger the value
   */
  public BigInteger getTotalElementAmount () {
    return this.TotalElementAmount;
  }
  /** Change the field to not being actively set: TotalElementAmount (CUSTOMER_CONTRACT_KEY.total_element_amount)
   */
  public void unsetTotalElementAmount () {
    this._TotalElementAmountSet = false;
  }
  /** See if the field is actively set: TotalElementAmount (CUSTOMER_CONTRACT_KEY.total_element_amount)
   * @return boolean whether the field is actively set
   */
  public boolean issetTotalElementAmount () {
    return this._TotalElementAmountSet;
  }
  /** set the fields value: PrevEvalDate (CUSTOMER_CONTRACT_KEY.prev_eval_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PrevEvalDate") 
  public void setPrevEvalDate (Date value) throws ServiceException
  {
    this.PrevEvalDate = value;
    this._PrevEvalDateSet = true;
  }

  /** Retrieves the PrevEvalDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrevEvalDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrevEvalDate field
   */
   public String getPrevEvalDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevEvalDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrevEvalDateAsFormattedString");
       return fmtMgr.formatDate(this.getPrevEvalDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrevEvalDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrevEvalDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrevEvalDate field from a formatted string
   *
   * @param _value the PrevEvalDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrevEvalDate field
   */
   public void setPrevEvalDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevEvalDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrevEvalDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrevEvalDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrevEvalDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrevEvalDateFromFormattedString");
   }

  /**
   * Retrieves the PrevEvalDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrevEvalDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrevEvalDate field
   */
  public String getPrevEvalDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevEvalDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrevEvalDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getPrevEvalDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevEvalDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrevEvalDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the PrevEvalDate field value from a formatted date/time string
   *
   * @param _value the PrevEvalDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrevEvalDate field
   */
  public void setPrevEvalDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrevEvalDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setPrevEvalDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevEvalDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrevEvalDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: PrevEvalDate (CUSTOMER_CONTRACT_KEY.prev_eval_date)
   * @return Date the value
   */
  public Date getPrevEvalDate () {
    return this.PrevEvalDate;
  }
  /** Change the field to not being actively set: PrevEvalDate (CUSTOMER_CONTRACT_KEY.prev_eval_date)
   */
  public void unsetPrevEvalDate () {
    this._PrevEvalDateSet = false;
  }
  /** See if the field is actively set: PrevEvalDate (CUSTOMER_CONTRACT_KEY.prev_eval_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetPrevEvalDate () {
    return this._PrevEvalDateSet;
  }
  /** set the fields value: NextEvalDate (CUSTOMER_CONTRACT_KEY.next_eval_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("NextEvalDate") 
  public void setNextEvalDate (Date value) throws ServiceException
  {
    this.NextEvalDate = value;
    this._NextEvalDateSet = true;
  }

  /** Retrieves the NextEvalDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The NextEvalDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NextEvalDate field
   */
   public String getNextEvalDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNextEvalDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNextEvalDateAsFormattedString");
       return fmtMgr.formatDate(this.getNextEvalDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NextEvalDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getNextEvalDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the NextEvalDate field from a formatted string
   *
   * @param _value the NextEvalDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NextEvalDate field
   */
   public void setNextEvalDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNextEvalDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setNextEvalDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NextEvalDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setNextEvalDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNextEvalDateFromFormattedString");
   }

  /**
   * Retrieves the NextEvalDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NextEvalDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the NextEvalDate field
   */
  public String getNextEvalDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNextEvalDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNextEvalDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getNextEvalDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NextEvalDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNextEvalDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the NextEvalDate field value from a formatted date/time string
   *
   * @param _value the NextEvalDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NextEvalDate field
   */
  public void setNextEvalDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNextEvalDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setNextEvalDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NextEvalDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNextEvalDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: NextEvalDate (CUSTOMER_CONTRACT_KEY.next_eval_date)
   * @return Date the value
   */
  public Date getNextEvalDate () {
    return this.NextEvalDate;
  }
  /** Change the field to not being actively set: NextEvalDate (CUSTOMER_CONTRACT_KEY.next_eval_date)
   */
  public void unsetNextEvalDate () {
    this._NextEvalDateSet = false;
  }
  /** See if the field is actively set: NextEvalDate (CUSTOMER_CONTRACT_KEY.next_eval_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetNextEvalDate () {
    return this._NextEvalDateSet;
  }
  /** set the fields value: ViewStatus (CUSTOMER_CONTRACT_VIEW.view_status)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ViewStatus") 
  public void setViewStatus (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ViewStatus", "setViewStatus");
    }
    this.ViewStatus = value;
    this._ViewStatusSet = true;
  }

  /** Retrieves the ViewStatus field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ViewStatus field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ViewStatus field
   */
   public String getViewStatusAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getViewStatusAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getViewStatusAsFormattedString");
       return fmtMgr.formatNumber(this.getViewStatus(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ViewStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getViewStatusAsFormattedString");
       throw x;
     }
   }
  /** Sets the ViewStatus field from a formatted string
   *
   * @param _value the ViewStatus field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ViewStatus field
   */
   public void setViewStatusFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getViewStatusFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setViewStatus(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ViewStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setViewStatusFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setViewStatusFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated ViewStatus field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the ViewStatus field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ViewStatus field
   */

  public String getViewStatusDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getViewStatusDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getViewStatusEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getViewStatusDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getViewStatus()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ViewStatus");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getViewStatusDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated ViewStatus field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the ViewStatus field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ViewStatus field
   */
  public Enumeration getViewStatusEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getViewStatusEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("ViewStatus", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getViewStatusEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ViewStatus");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getViewStatusEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated ViewStatus field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setViewStatusFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setViewStatusFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getViewStatusEnumeration(_locale);
      this.setViewStatus((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ViewStatus");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setViewStatusFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setViewStatusFromDisplayValue");
  }

  /** get the value of the field: ViewStatus (CUSTOMER_CONTRACT_VIEW.view_status)
   * @return Integer the value
   */
  public Integer getViewStatus () {
    return this.ViewStatus;
  }
  /** Change the field to not being actively set: ViewStatus (CUSTOMER_CONTRACT_VIEW.view_status)
   */
  public void unsetViewStatus () {
    this._ViewStatusSet = false;
  }
  /** See if the field is actively set: ViewStatus (CUSTOMER_CONTRACT_VIEW.view_status)
   * @return boolean whether the field is actively set
   */
  public boolean issetViewStatus () {
    return this._ViewStatusSet;
  }
  /** set the fields value: ViewCreatedDt (CUSTOMER_CONTRACT_VIEW.view_created_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ViewCreatedDt") 
  public void setViewCreatedDt (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ViewCreatedDt", "setViewCreatedDt");
    }
    this.ViewCreatedDt = value;
    this._ViewCreatedDtSet = true;
  }

  /** Retrieves the ViewCreatedDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ViewCreatedDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ViewCreatedDt field
   */
   public String getViewCreatedDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getViewCreatedDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getViewCreatedDtAsFormattedString");
       return fmtMgr.formatDate(this.getViewCreatedDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ViewCreatedDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getViewCreatedDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the ViewCreatedDt field from a formatted string
   *
   * @param _value the ViewCreatedDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ViewCreatedDt field
   */
   public void setViewCreatedDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getViewCreatedDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setViewCreatedDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ViewCreatedDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setViewCreatedDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setViewCreatedDtFromFormattedString");
   }

  /**
   * Retrieves the ViewCreatedDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ViewCreatedDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ViewCreatedDt field
   */
  public String getViewCreatedDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getViewCreatedDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getViewCreatedDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getViewCreatedDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ViewCreatedDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getViewCreatedDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ViewCreatedDt field value from a formatted date/time string
   *
   * @param _value the ViewCreatedDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ViewCreatedDt field
   */
  public void setViewCreatedDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setViewCreatedDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setViewCreatedDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ViewCreatedDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setViewCreatedDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: ViewCreatedDt (CUSTOMER_CONTRACT_VIEW.view_created_dt)
   * @return Date the value
   */
  public Date getViewCreatedDt () {
    return this.ViewCreatedDt;
  }
  /** Change the field to not being actively set: ViewCreatedDt (CUSTOMER_CONTRACT_VIEW.view_created_dt)
   */
  public void unsetViewCreatedDt () {
    this._ViewCreatedDtSet = false;
  }
  /** See if the field is actively set: ViewCreatedDt (CUSTOMER_CONTRACT_VIEW.view_created_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetViewCreatedDt () {
    return this._ViewCreatedDtSet;
  }
  /** set the fields value: ViewEffectiveDt (CUSTOMER_CONTRACT_VIEW.view_effective_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ViewEffectiveDt") 
  public void setViewEffectiveDt (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ViewEffectiveDt", "setViewEffectiveDt");
    }
    this.ViewEffectiveDt = value;
    this._ViewEffectiveDtSet = true;
  }

  /** Retrieves the ViewEffectiveDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ViewEffectiveDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ViewEffectiveDt field
   */
   public String getViewEffectiveDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getViewEffectiveDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getViewEffectiveDtAsFormattedString");
       return fmtMgr.formatDate(this.getViewEffectiveDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ViewEffectiveDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getViewEffectiveDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the ViewEffectiveDt field from a formatted string
   *
   * @param _value the ViewEffectiveDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ViewEffectiveDt field
   */
   public void setViewEffectiveDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getViewEffectiveDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setViewEffectiveDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ViewEffectiveDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setViewEffectiveDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setViewEffectiveDtFromFormattedString");
   }

  /**
   * Retrieves the ViewEffectiveDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ViewEffectiveDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ViewEffectiveDt field
   */
  public String getViewEffectiveDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getViewEffectiveDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getViewEffectiveDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getViewEffectiveDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ViewEffectiveDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getViewEffectiveDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ViewEffectiveDt field value from a formatted date/time string
   *
   * @param _value the ViewEffectiveDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ViewEffectiveDt field
   */
  public void setViewEffectiveDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setViewEffectiveDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setViewEffectiveDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ViewEffectiveDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setViewEffectiveDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: ViewEffectiveDt (CUSTOMER_CONTRACT_VIEW.view_effective_dt)
   * @return Date the value
   */
  public Date getViewEffectiveDt () {
    return this.ViewEffectiveDt;
  }
  /** Change the field to not being actively set: ViewEffectiveDt (CUSTOMER_CONTRACT_VIEW.view_effective_dt)
   */
  public void unsetViewEffectiveDt () {
    this._ViewEffectiveDtSet = false;
  }
  /** See if the field is actively set: ViewEffectiveDt (CUSTOMER_CONTRACT_VIEW.view_effective_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetViewEffectiveDt () {
    return this._ViewEffectiveDtSet;
  }
  /** set the fields value: IntendedViewEffectiveDt (CUSTOMER_CONTRACT_VIEW.intended_view_effective_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IntendedViewEffectiveDt") 
  public void setIntendedViewEffectiveDt (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IntendedViewEffectiveDt", "setIntendedViewEffectiveDt");
    }
    this.IntendedViewEffectiveDt = value;
    this._IntendedViewEffectiveDtSet = true;
  }

  /** Retrieves the IntendedViewEffectiveDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IntendedViewEffectiveDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IntendedViewEffectiveDt field
   */
   public String getIntendedViewEffectiveDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIntendedViewEffectiveDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIntendedViewEffectiveDtAsFormattedString");
       return fmtMgr.formatDate(this.getIntendedViewEffectiveDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IntendedViewEffectiveDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIntendedViewEffectiveDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the IntendedViewEffectiveDt field from a formatted string
   *
   * @param _value the IntendedViewEffectiveDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IntendedViewEffectiveDt field
   */
   public void setIntendedViewEffectiveDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIntendedViewEffectiveDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIntendedViewEffectiveDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IntendedViewEffectiveDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIntendedViewEffectiveDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIntendedViewEffectiveDtFromFormattedString");
   }

  /**
   * Retrieves the IntendedViewEffectiveDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IntendedViewEffectiveDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the IntendedViewEffectiveDt field
   */
  public String getIntendedViewEffectiveDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIntendedViewEffectiveDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIntendedViewEffectiveDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getIntendedViewEffectiveDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IntendedViewEffectiveDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIntendedViewEffectiveDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the IntendedViewEffectiveDt field value from a formatted date/time string
   *
   * @param _value the IntendedViewEffectiveDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IntendedViewEffectiveDt field
   */
  public void setIntendedViewEffectiveDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIntendedViewEffectiveDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setIntendedViewEffectiveDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IntendedViewEffectiveDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIntendedViewEffectiveDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: IntendedViewEffectiveDt (CUSTOMER_CONTRACT_VIEW.intended_view_effective_dt)
   * @return Date the value
   */
  public Date getIntendedViewEffectiveDt () {
    return this.IntendedViewEffectiveDt;
  }
  /** Change the field to not being actively set: IntendedViewEffectiveDt (CUSTOMER_CONTRACT_VIEW.intended_view_effective_dt)
   */
  public void unsetIntendedViewEffectiveDt () {
    this._IntendedViewEffectiveDtSet = false;
  }
  /** See if the field is actively set: IntendedViewEffectiveDt (CUSTOMER_CONTRACT_VIEW.intended_view_effective_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetIntendedViewEffectiveDt () {
    return this._IntendedViewEffectiveDtSet;
  }
  /** set the fields value: PrevViewId (CUSTOMER_CONTRACT_VIEW.prev_view_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PrevViewId") 
  public void setPrevViewId (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "PrevViewId", "setPrevViewId");
    }
    this.PrevViewId = value;
    this._PrevViewIdSet = true;
  }

  /** Retrieves the PrevViewId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrevViewId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrevViewId field
   */
   public String getPrevViewIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevViewIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrevViewIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getPrevViewId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrevViewId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrevViewIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrevViewId field from a formatted string
   *
   * @param _value the PrevViewId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrevViewId field
   */
   public void setPrevViewIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevViewIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrevViewId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrevViewId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrevViewIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrevViewIdFromFormattedString");
   }

  /** get the value of the field: PrevViewId (CUSTOMER_CONTRACT_VIEW.prev_view_id)
   * @return BigInteger the value
   */
  public BigInteger getPrevViewId () {
    return this.PrevViewId;
  }
  /** Change the field to not being actively set: PrevViewId (CUSTOMER_CONTRACT_VIEW.prev_view_id)
   */
  public void unsetPrevViewId () {
    this._PrevViewIdSet = false;
  }
  /** See if the field is actively set: PrevViewId (CUSTOMER_CONTRACT_VIEW.prev_view_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetPrevViewId () {
    return this._PrevViewIdSet;
  }
  /** set the fields value: ContractType (CUSTOMER_CONTRACT_VIEW.contract_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ContractType") 
  public void setContractType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ContractType", "setContractType");
    }
    this.ContractType = value;
    this._ContractTypeSet = true;
  }

  /** Retrieves the ContractType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ContractType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ContractType field
   */
   public String getContractTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContractTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getContractType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContractType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getContractTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the ContractType field from a formatted string
   *
   * @param _value the ContractType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ContractType field
   */
   public void setContractTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setContractType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContractType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setContractTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContractTypeFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated ContractType field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the ContractType field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ContractType field
   */

  public String getContractTypeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractTypeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getContractTypeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContractTypeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getContractType()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContractType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getContractTypeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated ContractType field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the ContractType field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ContractType field
   */
  public Enumeration getContractTypeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractTypeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("ContractType", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContractTypeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContractType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getContractTypeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated ContractType field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setContractTypeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setContractTypeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getContractTypeEnumeration(_locale);
      this.setContractType((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContractType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setContractTypeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setContractTypeFromDisplayValue");
  }

  /** get the value of the field: ContractType (CUSTOMER_CONTRACT_VIEW.contract_type)
   * @return Integer the value
   */
  public Integer getContractType () {
    return this.ContractType;
  }
  /** Change the field to not being actively set: ContractType (CUSTOMER_CONTRACT_VIEW.contract_type)
   */
  public void unsetContractType () {
    this._ContractTypeSet = false;
  }
  /** See if the field is actively set: ContractType (CUSTOMER_CONTRACT_VIEW.contract_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetContractType () {
    return this._ContractTypeSet;
  }
  /** set the fields value: ContractId (CUSTOMER_CONTRACT_VIEW.contract_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ContractId") 
  public void setContractId (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ContractId", "setContractId");
    }
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ContractId", "setContractId");
    }
    this.ContractId = value;
    this._ContractIdSet = true;
  }

  /** Retrieves the ContractId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ContractId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ContractId field
   */
   public String getContractIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContractIdAsFormattedString");
       return fmtMgr.formatString(this.getContractId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContractId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getContractIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ContractId field from a formatted string
   *
   * @param _value the ContractId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ContractId field
   */
   public void setContractIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setContractId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContractId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setContractIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContractIdFromFormattedString");
   }

  /** get the value of the field: ContractId (CUSTOMER_CONTRACT_VIEW.contract_id)
   * @return String the value
   */
  public String getContractId () {
    return this.ContractId;
  }
  /** Change the field to not being actively set: ContractId (CUSTOMER_CONTRACT_VIEW.contract_id)
   */
  public void unsetContractId () {
    this._ContractIdSet = false;
  }
  /** See if the field is actively set: ContractId (CUSTOMER_CONTRACT_VIEW.contract_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetContractId () {
    return this._ContractIdSet;
  }
  /** set the fields value: ParentGroupNo (CUSTOMER_CONTRACT_VIEW.parent_group_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ParentGroupNo") 
  public void setParentGroupNo (Integer value) throws ServiceException
  {
    this.ParentGroupNo = value;
    this._ParentGroupNoSet = true;
  }

  /** Retrieves the ParentGroupNo field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ParentGroupNo field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParentGroupNo field
   */
   public String getParentGroupNoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentGroupNoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParentGroupNoAsFormattedString");
       return fmtMgr.formatNumber(this.getParentGroupNo(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParentGroupNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getParentGroupNoAsFormattedString");
       throw x;
     }
   }
  /** Sets the ParentGroupNo field from a formatted string
   *
   * @param _value the ParentGroupNo field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ParentGroupNo field
   */
   public void setParentGroupNoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentGroupNoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setParentGroupNo(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParentGroupNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setParentGroupNoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParentGroupNoFromFormattedString");
   }

  /** get the value of the field: ParentGroupNo (CUSTOMER_CONTRACT_VIEW.parent_group_no)
   * @return Integer the value
   */
  public Integer getParentGroupNo () {
    return this.ParentGroupNo;
  }
  /** Change the field to not being actively set: ParentGroupNo (CUSTOMER_CONTRACT_VIEW.parent_group_no)
   */
  public void unsetParentGroupNo () {
    this._ParentGroupNoSet = false;
  }
  /** See if the field is actively set: ParentGroupNo (CUSTOMER_CONTRACT_VIEW.parent_group_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetParentGroupNo () {
    return this._ParentGroupNoSet;
  }
  /** set the fields value: StartDt (CUSTOMER_CONTRACT_VIEW.start_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("StartDt") 
  public void setStartDt (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "StartDt", "setStartDt");
    }
    this.StartDt = value;
    this._StartDtSet = true;
  }

  /** Retrieves the StartDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The StartDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StartDt field
   */
   public String getStartDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStartDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStartDtAsFormattedString");
       return fmtMgr.formatDate(this.getStartDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StartDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStartDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the StartDt field from a formatted string
   *
   * @param _value the StartDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StartDt field
   */
   public void setStartDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStartDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setStartDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StartDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStartDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStartDtFromFormattedString");
   }

  /**
   * Retrieves the StartDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StartDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the StartDt field
   */
  public String getStartDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStartDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStartDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getStartDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StartDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStartDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the StartDt field value from a formatted date/time string
   *
   * @param _value the StartDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StartDt field
   */
  public void setStartDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStartDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setStartDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StartDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStartDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: StartDt (CUSTOMER_CONTRACT_VIEW.start_dt)
   * @return Date the value
   */
  public Date getStartDt () {
    return this.StartDt;
  }
  /** Change the field to not being actively set: StartDt (CUSTOMER_CONTRACT_VIEW.start_dt)
   */
  public void unsetStartDt () {
    this._StartDtSet = false;
  }
  /** See if the field is actively set: StartDt (CUSTOMER_CONTRACT_VIEW.start_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetStartDt () {
    return this._StartDtSet;
  }
  /** set the fields value: EndDt (CUSTOMER_CONTRACT_VIEW.end_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("EndDt") 
  public void setEndDt (Date value) throws ServiceException
  {
    this.EndDt = value;
    this._EndDtSet = true;
  }

  /** Retrieves the EndDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The EndDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EndDt field
   */
   public String getEndDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEndDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEndDtAsFormattedString");
       return fmtMgr.formatDate(this.getEndDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EndDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getEndDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the EndDt field from a formatted string
   *
   * @param _value the EndDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EndDt field
   */
   public void setEndDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEndDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setEndDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EndDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setEndDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEndDtFromFormattedString");
   }

  /**
   * Retrieves the EndDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EndDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the EndDt field
   */
  public String getEndDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEndDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEndDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getEndDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EndDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEndDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the EndDt field value from a formatted date/time string
   *
   * @param _value the EndDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EndDt field
   */
  public void setEndDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEndDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setEndDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EndDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEndDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: EndDt (CUSTOMER_CONTRACT_VIEW.end_dt)
   * @return Date the value
   */
  public Date getEndDt () {
    return this.EndDt;
  }
  /** Change the field to not being actively set: EndDt (CUSTOMER_CONTRACT_VIEW.end_dt)
   */
  public void unsetEndDt () {
    this._EndDtSet = false;
  }
  /** See if the field is actively set: EndDt (CUSTOMER_CONTRACT_VIEW.end_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetEndDt () {
    return this._EndDtSet;
  }
  /** set the fields value: PrevEndDt (CUSTOMER_CONTRACT_VIEW.prev_end_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PrevEndDt") 
  public void setPrevEndDt (Date value) throws ServiceException
  {
    this.PrevEndDt = value;
    this._PrevEndDtSet = true;
  }

  /** Retrieves the PrevEndDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrevEndDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrevEndDt field
   */
   public String getPrevEndDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevEndDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrevEndDtAsFormattedString");
       return fmtMgr.formatDate(this.getPrevEndDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrevEndDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrevEndDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrevEndDt field from a formatted string
   *
   * @param _value the PrevEndDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrevEndDt field
   */
   public void setPrevEndDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevEndDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrevEndDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrevEndDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrevEndDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrevEndDtFromFormattedString");
   }

  /**
   * Retrieves the PrevEndDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrevEndDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrevEndDt field
   */
  public String getPrevEndDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevEndDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrevEndDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getPrevEndDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevEndDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrevEndDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the PrevEndDt field value from a formatted date/time string
   *
   * @param _value the PrevEndDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrevEndDt field
   */
  public void setPrevEndDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrevEndDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setPrevEndDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevEndDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrevEndDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: PrevEndDt (CUSTOMER_CONTRACT_VIEW.prev_end_dt)
   * @return Date the value
   */
  public Date getPrevEndDt () {
    return this.PrevEndDt;
  }
  /** Change the field to not being actively set: PrevEndDt (CUSTOMER_CONTRACT_VIEW.prev_end_dt)
   */
  public void unsetPrevEndDt () {
    this._PrevEndDtSet = false;
  }
  /** See if the field is actively set: PrevEndDt (CUSTOMER_CONTRACT_VIEW.prev_end_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetPrevEndDt () {
    return this._PrevEndDtSet;
  }
  /** set the fields value: GracePeriod (CUSTOMER_CONTRACT_VIEW.grace_period)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("GracePeriod") 
  public void setGracePeriod (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "GracePeriod", "setGracePeriod");
    }
    this.GracePeriod = value;
    this._GracePeriodSet = true;
  }

  /** Retrieves the GracePeriod field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The GracePeriod field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GracePeriod field
   */
   public String getGracePeriodAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGracePeriodAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGracePeriodAsFormattedString");
       return fmtMgr.formatNumber(this.getGracePeriod(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("GracePeriod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getGracePeriodAsFormattedString");
       throw x;
     }
   }
  /** Sets the GracePeriod field from a formatted string
   *
   * @param _value the GracePeriod field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the GracePeriod field
   */
   public void setGracePeriodFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGracePeriodFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setGracePeriod(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("GracePeriod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setGracePeriodFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGracePeriodFromFormattedString");
   }

  /** get the value of the field: GracePeriod (CUSTOMER_CONTRACT_VIEW.grace_period)
   * @return Integer the value
   */
  public Integer getGracePeriod () {
    return this.GracePeriod;
  }
  /** Change the field to not being actively set: GracePeriod (CUSTOMER_CONTRACT_VIEW.grace_period)
   */
  public void unsetGracePeriod () {
    this._GracePeriodSet = false;
  }
  /** See if the field is actively set: GracePeriod (CUSTOMER_CONTRACT_VIEW.grace_period)
   * @return boolean whether the field is actively set
   */
  public boolean issetGracePeriod () {
    return this._GracePeriodSet;
  }
  /** set the fields value: TotalPeriods (CUSTOMER_CONTRACT_VIEW.total_periods)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TotalPeriods") 
  public void setTotalPeriods (Integer value) throws ServiceException
  {
    this.TotalPeriods = value;
    this._TotalPeriodsSet = true;
  }

  /** Retrieves the TotalPeriods field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TotalPeriods field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalPeriods field
   */
   public String getTotalPeriodsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalPeriodsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalPeriodsAsFormattedString");
       return fmtMgr.formatNumber(this.getTotalPeriods(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TotalPeriods");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalPeriodsAsFormattedString");
       throw x;
     }
   }
  /** Sets the TotalPeriods field from a formatted string
   *
   * @param _value the TotalPeriods field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TotalPeriods field
   */
   public void setTotalPeriodsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalPeriodsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTotalPeriods(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TotalPeriods");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalPeriodsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalPeriodsFromFormattedString");
   }

  /** get the value of the field: TotalPeriods (CUSTOMER_CONTRACT_VIEW.total_periods)
   * @return Integer the value
   */
  public Integer getTotalPeriods () {
    return this.TotalPeriods;
  }
  /** Change the field to not being actively set: TotalPeriods (CUSTOMER_CONTRACT_VIEW.total_periods)
   */
  public void unsetTotalPeriods () {
    this._TotalPeriodsSet = false;
  }
  /** See if the field is actively set: TotalPeriods (CUSTOMER_CONTRACT_VIEW.total_periods)
   * @return boolean whether the field is actively set
   */
  public boolean issetTotalPeriods () {
    return this._TotalPeriodsSet;
  }
  /** set the fields value: SalesChannelId (CUSTOMER_CONTRACT_VIEW.sales_channel_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SalesChannelId") 
  public void setSalesChannelId (Integer value) throws ServiceException
  {
    this.SalesChannelId = value;
    this._SalesChannelIdSet = true;
  }

  /** Retrieves the SalesChannelId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SalesChannelId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SalesChannelId field
   */
   public String getSalesChannelIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSalesChannelIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSalesChannelIdAsFormattedString");
       return fmtMgr.formatNumber(this.getSalesChannelId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SalesChannelId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSalesChannelIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the SalesChannelId field from a formatted string
   *
   * @param _value the SalesChannelId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SalesChannelId field
   */
   public void setSalesChannelIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSalesChannelIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSalesChannelId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SalesChannelId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSalesChannelIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSalesChannelIdFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated SalesChannelId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the SalesChannelId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the SalesChannelId field
   */

  public String getSalesChannelIdDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSalesChannelIdDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getSalesChannelIdEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSalesChannelIdDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getSalesChannelId()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SalesChannelId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSalesChannelIdDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated SalesChannelId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the SalesChannelId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the SalesChannelId field
   */
  public Enumeration getSalesChannelIdEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSalesChannelIdEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("SalesChannel", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSalesChannelIdEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SalesChannelId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSalesChannelIdEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated SalesChannelId field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setSalesChannelIdFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSalesChannelIdFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getSalesChannelIdEnumeration(_locale);
      this.setSalesChannelId((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SalesChannelId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSalesChannelIdFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSalesChannelIdFromDisplayValue");
  }

  /** get the value of the field: SalesChannelId (CUSTOMER_CONTRACT_VIEW.sales_channel_id)
   * @return Integer the value
   */
  public Integer getSalesChannelId () {
    return this.SalesChannelId;
  }
  /** Change the field to not being actively set: SalesChannelId (CUSTOMER_CONTRACT_VIEW.sales_channel_id)
   */
  public void unsetSalesChannelId () {
    this._SalesChannelIdSet = false;
  }
  /** See if the field is actively set: SalesChannelId (CUSTOMER_CONTRACT_VIEW.sales_channel_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetSalesChannelId () {
    return this._SalesChannelIdSet;
  }
  /** set the fields value: TrackTotalAmounts (CUSTOMER_CONTRACT_VIEW.track_total_amounts)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TrackTotalAmounts") 
  public void setTrackTotalAmounts (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackTotalAmounts", "setTrackTotalAmounts");
    }
    this.TrackTotalAmounts = value;
    this._TrackTotalAmountsSet = true;
  }

  /** Retrieves the TrackTotalAmounts field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TrackTotalAmounts field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TrackTotalAmounts field
   */
   public String getTrackTotalAmountsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackTotalAmountsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTrackTotalAmountsAsFormattedString");
       return fmtMgr.formatBoolean(this.getTrackTotalAmounts());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackTotalAmounts");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTrackTotalAmountsAsFormattedString");
       throw x;
     }
   }
  /** Sets the TrackTotalAmounts field from a formatted string
   *
   * @param _value the TrackTotalAmounts field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TrackTotalAmounts field
   */
   public void setTrackTotalAmountsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackTotalAmountsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTrackTotalAmounts(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackTotalAmounts");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTrackTotalAmountsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTrackTotalAmountsFromFormattedString");
   }

  /** get the value of the field: TrackTotalAmounts (CUSTOMER_CONTRACT_VIEW.track_total_amounts)
   * @return Boolean the value
   */
  public Boolean getTrackTotalAmounts () {
    return this.TrackTotalAmounts;
  }
  /** Change the field to not being actively set: TrackTotalAmounts (CUSTOMER_CONTRACT_VIEW.track_total_amounts)
   */
  public void unsetTrackTotalAmounts () {
    this._TrackTotalAmountsSet = false;
  }
  /** See if the field is actively set: TrackTotalAmounts (CUSTOMER_CONTRACT_VIEW.track_total_amounts)
   * @return boolean whether the field is actively set
   */
  public boolean issetTrackTotalAmounts () {
    return this._TrackTotalAmountsSet;
  }
  /** set the fields value: RolloverPeriod (CUSTOMER_CONTRACT_VIEW.rollover_period)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RolloverPeriod") 
  public void setRolloverPeriod (Integer value) throws ServiceException
  {
    this.RolloverPeriod = value;
    this._RolloverPeriodSet = true;
  }

  /** Retrieves the RolloverPeriod field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RolloverPeriod field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RolloverPeriod field
   */
   public String getRolloverPeriodAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRolloverPeriodAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRolloverPeriodAsFormattedString");
       return fmtMgr.formatNumber(this.getRolloverPeriod(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RolloverPeriod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRolloverPeriodAsFormattedString");
       throw x;
     }
   }
  /** Sets the RolloverPeriod field from a formatted string
   *
   * @param _value the RolloverPeriod field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RolloverPeriod field
   */
   public void setRolloverPeriodFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRolloverPeriodFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRolloverPeriod(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RolloverPeriod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRolloverPeriodFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRolloverPeriodFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated RolloverPeriod field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the RolloverPeriod field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the RolloverPeriod field
   */

  public String getRolloverPeriodDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRolloverPeriodDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getRolloverPeriodEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRolloverPeriodDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getRolloverPeriod()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RolloverPeriod");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRolloverPeriodDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated RolloverPeriod field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the RolloverPeriod field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the RolloverPeriod field
   */
  public Enumeration getRolloverPeriodEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRolloverPeriodEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("RolloverPeriodStart", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRolloverPeriodEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RolloverPeriod");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRolloverPeriodEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated RolloverPeriod field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setRolloverPeriodFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRolloverPeriodFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getRolloverPeriodEnumeration(_locale);
      this.setRolloverPeriod((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RolloverPeriod");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRolloverPeriodFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRolloverPeriodFromDisplayValue");
  }

  /** get the value of the field: RolloverPeriod (CUSTOMER_CONTRACT_VIEW.rollover_period)
   * @return Integer the value
   */
  public Integer getRolloverPeriod () {
    return this.RolloverPeriod;
  }
  /** Change the field to not being actively set: RolloverPeriod (CUSTOMER_CONTRACT_VIEW.rollover_period)
   */
  public void unsetRolloverPeriod () {
    this._RolloverPeriodSet = false;
  }
  /** See if the field is actively set: RolloverPeriod (CUSTOMER_CONTRACT_VIEW.rollover_period)
   * @return boolean whether the field is actively set
   */
  public boolean issetRolloverPeriod () {
    return this._RolloverPeriodSet;
  }
  /** set the fields value: RolloverPeriodStart (CUSTOMER_CONTRACT_VIEW.rollover_period_start)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RolloverPeriodStart") 
  public void setRolloverPeriodStart (Integer value) throws ServiceException
  {
    this.RolloverPeriodStart = value;
    this._RolloverPeriodStartSet = true;
  }

  /** Retrieves the RolloverPeriodStart field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RolloverPeriodStart field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RolloverPeriodStart field
   */
   public String getRolloverPeriodStartAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRolloverPeriodStartAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRolloverPeriodStartAsFormattedString");
       return fmtMgr.formatNumber(this.getRolloverPeriodStart(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RolloverPeriodStart");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRolloverPeriodStartAsFormattedString");
       throw x;
     }
   }
  /** Sets the RolloverPeriodStart field from a formatted string
   *
   * @param _value the RolloverPeriodStart field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RolloverPeriodStart field
   */
   public void setRolloverPeriodStartFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRolloverPeriodStartFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRolloverPeriodStart(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RolloverPeriodStart");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRolloverPeriodStartFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRolloverPeriodStartFromFormattedString");
   }

  /** get the value of the field: RolloverPeriodStart (CUSTOMER_CONTRACT_VIEW.rollover_period_start)
   * @return Integer the value
   */
  public Integer getRolloverPeriodStart () {
    return this.RolloverPeriodStart;
  }
  /** Change the field to not being actively set: RolloverPeriodStart (CUSTOMER_CONTRACT_VIEW.rollover_period_start)
   */
  public void unsetRolloverPeriodStart () {
    this._RolloverPeriodStartSet = false;
  }
  /** See if the field is actively set: RolloverPeriodStart (CUSTOMER_CONTRACT_VIEW.rollover_period_start)
   * @return boolean whether the field is actively set
   */
  public boolean issetRolloverPeriodStart () {
    return this._RolloverPeriodStartSet;
  }
  /** set the fields value: BillPeriod (CUSTOMER_CONTRACT_VIEW.bill_period)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillPeriod") 
  public void setBillPeriod (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 3))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BillPeriod", "setBillPeriod");
    }
    this.BillPeriod = value;
    this._BillPeriodSet = true;
  }

  /** Retrieves the BillPeriod field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillPeriod field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillPeriod field
   */
   public String getBillPeriodAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillPeriodAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillPeriodAsFormattedString");
       return fmtMgr.formatString(this.getBillPeriod());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillPeriod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillPeriodAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillPeriod field from a formatted string
   *
   * @param _value the BillPeriod field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillPeriod field
   */
   public void setBillPeriodFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillPeriodFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillPeriod(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillPeriod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillPeriodFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillPeriodFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated BillPeriod field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the BillPeriod field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BillPeriod field
   */

  public String getBillPeriodDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillPeriodDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getBillPeriodEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillPeriodDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getBillPeriod()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillPeriod");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillPeriodDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated BillPeriod field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the BillPeriod field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BillPeriod field
   */
  public Enumeration getBillPeriodEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillPeriodEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("BillPeriod", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillPeriodEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillPeriod");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillPeriodEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated BillPeriod field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setBillPeriodFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillPeriodFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getBillPeriodEnumeration(_locale);
      this.setBillPeriod((String)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), String.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillPeriod");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillPeriodFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillPeriodFromDisplayValue");
  }

  /** get the value of the field: BillPeriod (CUSTOMER_CONTRACT_VIEW.bill_period)
   * @return String the value
   */
  public String getBillPeriod () {
    return this.BillPeriod;
  }
  /** Change the field to not being actively set: BillPeriod (CUSTOMER_CONTRACT_VIEW.bill_period)
   */
  public void unsetBillPeriod () {
    this._BillPeriodSet = false;
  }
  /** See if the field is actively set: BillPeriod (CUSTOMER_CONTRACT_VIEW.bill_period)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillPeriod () {
    return this._BillPeriodSet;
  }
  /** set the fields value: DistributePayback (CUSTOMER_CONTRACT_VIEW.distribute_payback)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DistributePayback") 
  public void setDistributePayback (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DistributePayback", "setDistributePayback");
    }
    this.DistributePayback = value;
    this._DistributePaybackSet = true;
  }

  /** Retrieves the DistributePayback field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DistributePayback field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DistributePayback field
   */
   public String getDistributePaybackAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDistributePaybackAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDistributePaybackAsFormattedString");
       return fmtMgr.formatBoolean(this.getDistributePayback());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DistributePayback");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDistributePaybackAsFormattedString");
       throw x;
     }
   }
  /** Sets the DistributePayback field from a formatted string
   *
   * @param _value the DistributePayback field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DistributePayback field
   */
   public void setDistributePaybackFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDistributePaybackFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDistributePayback(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DistributePayback");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDistributePaybackFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDistributePaybackFromFormattedString");
   }

  /** get the value of the field: DistributePayback (CUSTOMER_CONTRACT_VIEW.distribute_payback)
   * @return Boolean the value
   */
  public Boolean getDistributePayback () {
    return this.DistributePayback;
  }
  /** Change the field to not being actively set: DistributePayback (CUSTOMER_CONTRACT_VIEW.distribute_payback)
   */
  public void unsetDistributePayback () {
    this._DistributePaybackSet = false;
  }
  /** See if the field is actively set: DistributePayback (CUSTOMER_CONTRACT_VIEW.distribute_payback)
   * @return boolean whether the field is actively set
   */
  public boolean issetDistributePayback () {
    return this._DistributePaybackSet;
  }
  /** set the fields value: ProrateContractStrtOverride (CUSTOMER_CONTRACT_VIEW.prorate_contract_strt_override)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ProrateContractStrtOverride") 
  public void setProrateContractStrtOverride (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ProrateContractStrtOverride", "setProrateContractStrtOverride");
    }
    this.ProrateContractStrtOverride = value;
    this._ProrateContractStrtOverrideSet = true;
  }

  /** Retrieves the ProrateContractStrtOverride field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ProrateContractStrtOverride field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProrateContractStrtOverride field
   */
   public String getProrateContractStrtOverrideAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProrateContractStrtOverrideAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProrateContractStrtOverrideAsFormattedString");
       return fmtMgr.formatNumber(this.getProrateContractStrtOverride(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProrateContractStrtOverride");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getProrateContractStrtOverrideAsFormattedString");
       throw x;
     }
   }
  /** Sets the ProrateContractStrtOverride field from a formatted string
   *
   * @param _value the ProrateContractStrtOverride field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ProrateContractStrtOverride field
   */
   public void setProrateContractStrtOverrideFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProrateContractStrtOverrideFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setProrateContractStrtOverride(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProrateContractStrtOverride");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setProrateContractStrtOverrideFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProrateContractStrtOverrideFromFormattedString");
   }

  /** get the value of the field: ProrateContractStrtOverride (CUSTOMER_CONTRACT_VIEW.prorate_contract_strt_override)
   * @return Integer the value
   */
  public Integer getProrateContractStrtOverride () {
    return this.ProrateContractStrtOverride;
  }
  /** Change the field to not being actively set: ProrateContractStrtOverride (CUSTOMER_CONTRACT_VIEW.prorate_contract_strt_override)
   */
  public void unsetProrateContractStrtOverride () {
    this._ProrateContractStrtOverrideSet = false;
  }
  /** See if the field is actively set: ProrateContractStrtOverride (CUSTOMER_CONTRACT_VIEW.prorate_contract_strt_override)
   * @return boolean whether the field is actively set
   */
  public boolean issetProrateContractStrtOverride () {
    return this._ProrateContractStrtOverrideSet;
  }
  /** set the fields value: ProrateContractEndOverride (CUSTOMER_CONTRACT_VIEW.prorate_contract_end_override)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ProrateContractEndOverride") 
  public void setProrateContractEndOverride (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ProrateContractEndOverride", "setProrateContractEndOverride");
    }
    this.ProrateContractEndOverride = value;
    this._ProrateContractEndOverrideSet = true;
  }

  /** Retrieves the ProrateContractEndOverride field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ProrateContractEndOverride field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProrateContractEndOverride field
   */
   public String getProrateContractEndOverrideAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProrateContractEndOverrideAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProrateContractEndOverrideAsFormattedString");
       return fmtMgr.formatNumber(this.getProrateContractEndOverride(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProrateContractEndOverride");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getProrateContractEndOverrideAsFormattedString");
       throw x;
     }
   }
  /** Sets the ProrateContractEndOverride field from a formatted string
   *
   * @param _value the ProrateContractEndOverride field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ProrateContractEndOverride field
   */
   public void setProrateContractEndOverrideFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProrateContractEndOverrideFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setProrateContractEndOverride(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProrateContractEndOverride");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setProrateContractEndOverrideFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProrateContractEndOverrideFromFormattedString");
   }

  /** get the value of the field: ProrateContractEndOverride (CUSTOMER_CONTRACT_VIEW.prorate_contract_end_override)
   * @return Integer the value
   */
  public Integer getProrateContractEndOverride () {
    return this.ProrateContractEndOverride;
  }
  /** Change the field to not being actively set: ProrateContractEndOverride (CUSTOMER_CONTRACT_VIEW.prorate_contract_end_override)
   */
  public void unsetProrateContractEndOverride () {
    this._ProrateContractEndOverrideSet = false;
  }
  /** See if the field is actively set: ProrateContractEndOverride (CUSTOMER_CONTRACT_VIEW.prorate_contract_end_override)
   * @return boolean whether the field is actively set
   */
  public boolean issetProrateContractEndOverride () {
    return this._ProrateContractEndOverrideSet;
  }
  /** set the fields value: ProrateInterimBillOverride (CUSTOMER_CONTRACT_VIEW.prorate_interim_bill_override)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ProrateInterimBillOverride") 
  public void setProrateInterimBillOverride (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ProrateInterimBillOverride", "setProrateInterimBillOverride");
    }
    this.ProrateInterimBillOverride = value;
    this._ProrateInterimBillOverrideSet = true;
  }

  /** Retrieves the ProrateInterimBillOverride field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ProrateInterimBillOverride field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProrateInterimBillOverride field
   */
   public String getProrateInterimBillOverrideAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProrateInterimBillOverrideAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProrateInterimBillOverrideAsFormattedString");
       return fmtMgr.formatNumber(this.getProrateInterimBillOverride(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProrateInterimBillOverride");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getProrateInterimBillOverrideAsFormattedString");
       throw x;
     }
   }
  /** Sets the ProrateInterimBillOverride field from a formatted string
   *
   * @param _value the ProrateInterimBillOverride field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ProrateInterimBillOverride field
   */
   public void setProrateInterimBillOverrideFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProrateInterimBillOverrideFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setProrateInterimBillOverride(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProrateInterimBillOverride");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setProrateInterimBillOverrideFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProrateInterimBillOverrideFromFormattedString");
   }

  /** get the value of the field: ProrateInterimBillOverride (CUSTOMER_CONTRACT_VIEW.prorate_interim_bill_override)
   * @return Integer the value
   */
  public Integer getProrateInterimBillOverride () {
    return this.ProrateInterimBillOverride;
  }
  /** Change the field to not being actively set: ProrateInterimBillOverride (CUSTOMER_CONTRACT_VIEW.prorate_interim_bill_override)
   */
  public void unsetProrateInterimBillOverride () {
    this._ProrateInterimBillOverrideSet = false;
  }
  /** See if the field is actively set: ProrateInterimBillOverride (CUSTOMER_CONTRACT_VIEW.prorate_interim_bill_override)
   * @return boolean whether the field is actively set
   */
  public boolean issetProrateInterimBillOverride () {
    return this._ProrateInterimBillOverrideSet;
  }
  /** set the fields value: ProratePeriodChangeOverride (CUSTOMER_CONTRACT_VIEW.prorate_period_change_override)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ProratePeriodChangeOverride") 
  public void setProratePeriodChangeOverride (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ProratePeriodChangeOverride", "setProratePeriodChangeOverride");
    }
    this.ProratePeriodChangeOverride = value;
    this._ProratePeriodChangeOverrideSet = true;
  }

  /** Retrieves the ProratePeriodChangeOverride field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ProratePeriodChangeOverride field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProratePeriodChangeOverride field
   */
   public String getProratePeriodChangeOverrideAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProratePeriodChangeOverrideAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProratePeriodChangeOverrideAsFormattedString");
       return fmtMgr.formatNumber(this.getProratePeriodChangeOverride(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProratePeriodChangeOverride");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getProratePeriodChangeOverrideAsFormattedString");
       throw x;
     }
   }
  /** Sets the ProratePeriodChangeOverride field from a formatted string
   *
   * @param _value the ProratePeriodChangeOverride field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ProratePeriodChangeOverride field
   */
   public void setProratePeriodChangeOverrideFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProratePeriodChangeOverrideFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setProratePeriodChangeOverride(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProratePeriodChangeOverride");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setProratePeriodChangeOverrideFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProratePeriodChangeOverrideFromFormattedString");
   }

  /** get the value of the field: ProratePeriodChangeOverride (CUSTOMER_CONTRACT_VIEW.prorate_period_change_override)
   * @return Integer the value
   */
  public Integer getProratePeriodChangeOverride () {
    return this.ProratePeriodChangeOverride;
  }
  /** Change the field to not being actively set: ProratePeriodChangeOverride (CUSTOMER_CONTRACT_VIEW.prorate_period_change_override)
   */
  public void unsetProratePeriodChangeOverride () {
    this._ProratePeriodChangeOverrideSet = false;
  }
  /** See if the field is actively set: ProratePeriodChangeOverride (CUSTOMER_CONTRACT_VIEW.prorate_period_change_override)
   * @return boolean whether the field is actively set
   */
  public boolean issetProratePeriodChangeOverride () {
    return this._ProratePeriodChangeOverrideSet;
  }
  /** set the fields value: ProrateAccountStartOverride (CUSTOMER_CONTRACT_VIEW.prorate_account_start_override)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ProrateAccountStartOverride") 
  public void setProrateAccountStartOverride (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ProrateAccountStartOverride", "setProrateAccountStartOverride");
    }
    this.ProrateAccountStartOverride = value;
    this._ProrateAccountStartOverrideSet = true;
  }

  /** Retrieves the ProrateAccountStartOverride field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ProrateAccountStartOverride field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProrateAccountStartOverride field
   */
   public String getProrateAccountStartOverrideAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProrateAccountStartOverrideAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProrateAccountStartOverrideAsFormattedString");
       return fmtMgr.formatNumber(this.getProrateAccountStartOverride(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProrateAccountStartOverride");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getProrateAccountStartOverrideAsFormattedString");
       throw x;
     }
   }
  /** Sets the ProrateAccountStartOverride field from a formatted string
   *
   * @param _value the ProrateAccountStartOverride field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ProrateAccountStartOverride field
   */
   public void setProrateAccountStartOverrideFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProrateAccountStartOverrideFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setProrateAccountStartOverride(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProrateAccountStartOverride");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setProrateAccountStartOverrideFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProrateAccountStartOverrideFromFormattedString");
   }

  /** get the value of the field: ProrateAccountStartOverride (CUSTOMER_CONTRACT_VIEW.prorate_account_start_override)
   * @return Integer the value
   */
  public Integer getProrateAccountStartOverride () {
    return this.ProrateAccountStartOverride;
  }
  /** Change the field to not being actively set: ProrateAccountStartOverride (CUSTOMER_CONTRACT_VIEW.prorate_account_start_override)
   */
  public void unsetProrateAccountStartOverride () {
    this._ProrateAccountStartOverrideSet = false;
  }
  /** See if the field is actively set: ProrateAccountStartOverride (CUSTOMER_CONTRACT_VIEW.prorate_account_start_override)
   * @return boolean whether the field is actively set
   */
  public boolean issetProrateAccountStartOverride () {
    return this._ProrateAccountStartOverrideSet;
  }
  /** set the fields value: ProrateAccountEndOverride (CUSTOMER_CONTRACT_VIEW.prorate_account_end_override)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ProrateAccountEndOverride") 
  public void setProrateAccountEndOverride (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ProrateAccountEndOverride", "setProrateAccountEndOverride");
    }
    this.ProrateAccountEndOverride = value;
    this._ProrateAccountEndOverrideSet = true;
  }

  /** Retrieves the ProrateAccountEndOverride field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ProrateAccountEndOverride field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProrateAccountEndOverride field
   */
   public String getProrateAccountEndOverrideAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProrateAccountEndOverrideAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProrateAccountEndOverrideAsFormattedString");
       return fmtMgr.formatNumber(this.getProrateAccountEndOverride(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProrateAccountEndOverride");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getProrateAccountEndOverrideAsFormattedString");
       throw x;
     }
   }
  /** Sets the ProrateAccountEndOverride field from a formatted string
   *
   * @param _value the ProrateAccountEndOverride field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ProrateAccountEndOverride field
   */
   public void setProrateAccountEndOverrideFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProrateAccountEndOverrideFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setProrateAccountEndOverride(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProrateAccountEndOverride");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setProrateAccountEndOverrideFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProrateAccountEndOverrideFromFormattedString");
   }

  /** get the value of the field: ProrateAccountEndOverride (CUSTOMER_CONTRACT_VIEW.prorate_account_end_override)
   * @return Integer the value
   */
  public Integer getProrateAccountEndOverride () {
    return this.ProrateAccountEndOverride;
  }
  /** Change the field to not being actively set: ProrateAccountEndOverride (CUSTOMER_CONTRACT_VIEW.prorate_account_end_override)
   */
  public void unsetProrateAccountEndOverride () {
    this._ProrateAccountEndOverrideSet = false;
  }
  /** See if the field is actively set: ProrateAccountEndOverride (CUSTOMER_CONTRACT_VIEW.prorate_account_end_override)
   * @return boolean whether the field is actively set
   */
  public boolean issetProrateAccountEndOverride () {
    return this._ProrateAccountEndOverrideSet;
  }
  /** set the fields value: ProrateTgtThresholdOverride (CUSTOMER_CONTRACT_VIEW.prorate_tgt_threshold_override)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ProrateTgtThresholdOverride") 
  public void setProrateTgtThresholdOverride (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ProrateTgtThresholdOverride", "setProrateTgtThresholdOverride");
    }
    this.ProrateTgtThresholdOverride = value;
    this._ProrateTgtThresholdOverrideSet = true;
  }

  /** Retrieves the ProrateTgtThresholdOverride field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ProrateTgtThresholdOverride field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProrateTgtThresholdOverride field
   */
   public String getProrateTgtThresholdOverrideAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProrateTgtThresholdOverrideAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProrateTgtThresholdOverrideAsFormattedString");
       return fmtMgr.formatNumber(this.getProrateTgtThresholdOverride(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProrateTgtThresholdOverride");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getProrateTgtThresholdOverrideAsFormattedString");
       throw x;
     }
   }
  /** Sets the ProrateTgtThresholdOverride field from a formatted string
   *
   * @param _value the ProrateTgtThresholdOverride field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ProrateTgtThresholdOverride field
   */
   public void setProrateTgtThresholdOverrideFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProrateTgtThresholdOverrideFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setProrateTgtThresholdOverride(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProrateTgtThresholdOverride");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setProrateTgtThresholdOverrideFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProrateTgtThresholdOverrideFromFormattedString");
   }

  /** get the value of the field: ProrateTgtThresholdOverride (CUSTOMER_CONTRACT_VIEW.prorate_tgt_threshold_override)
   * @return Integer the value
   */
  public Integer getProrateTgtThresholdOverride () {
    return this.ProrateTgtThresholdOverride;
  }
  /** Change the field to not being actively set: ProrateTgtThresholdOverride (CUSTOMER_CONTRACT_VIEW.prorate_tgt_threshold_override)
   */
  public void unsetProrateTgtThresholdOverride () {
    this._ProrateTgtThresholdOverrideSet = false;
  }
  /** See if the field is actively set: ProrateTgtThresholdOverride (CUSTOMER_CONTRACT_VIEW.prorate_tgt_threshold_override)
   * @return boolean whether the field is actively set
   */
  public boolean issetProrateTgtThresholdOverride () {
    return this._ProrateTgtThresholdOverrideSet;
  }
  /** set the fields value: ProrateTgtRebatesOverride (CUSTOMER_CONTRACT_VIEW.prorate_tgt_rebates_override)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ProrateTgtRebatesOverride") 
  public void setProrateTgtRebatesOverride (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ProrateTgtRebatesOverride", "setProrateTgtRebatesOverride");
    }
    this.ProrateTgtRebatesOverride = value;
    this._ProrateTgtRebatesOverrideSet = true;
  }

  /** Retrieves the ProrateTgtRebatesOverride field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ProrateTgtRebatesOverride field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProrateTgtRebatesOverride field
   */
   public String getProrateTgtRebatesOverrideAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProrateTgtRebatesOverrideAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProrateTgtRebatesOverrideAsFormattedString");
       return fmtMgr.formatNumber(this.getProrateTgtRebatesOverride(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProrateTgtRebatesOverride");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getProrateTgtRebatesOverrideAsFormattedString");
       throw x;
     }
   }
  /** Sets the ProrateTgtRebatesOverride field from a formatted string
   *
   * @param _value the ProrateTgtRebatesOverride field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ProrateTgtRebatesOverride field
   */
   public void setProrateTgtRebatesOverrideFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProrateTgtRebatesOverrideFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setProrateTgtRebatesOverride(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProrateTgtRebatesOverride");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setProrateTgtRebatesOverrideFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProrateTgtRebatesOverrideFromFormattedString");
   }

  /** get the value of the field: ProrateTgtRebatesOverride (CUSTOMER_CONTRACT_VIEW.prorate_tgt_rebates_override)
   * @return Integer the value
   */
  public Integer getProrateTgtRebatesOverride () {
    return this.ProrateTgtRebatesOverride;
  }
  /** Change the field to not being actively set: ProrateTgtRebatesOverride (CUSTOMER_CONTRACT_VIEW.prorate_tgt_rebates_override)
   */
  public void unsetProrateTgtRebatesOverride () {
    this._ProrateTgtRebatesOverrideSet = false;
  }
  /** See if the field is actively set: ProrateTgtRebatesOverride (CUSTOMER_CONTRACT_VIEW.prorate_tgt_rebates_override)
   * @return boolean whether the field is actively set
   */
  public boolean issetProrateTgtRebatesOverride () {
    return this._ProrateTgtRebatesOverrideSet;
  }
  /** set the fields value: StartByDt (CUSTOMER_CONTRACT_VIEW.start_by_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("StartByDt") 
  public void setStartByDt (Date value) throws ServiceException
  {
    this.StartByDt = value;
    this._StartByDtSet = true;
  }

  /** Retrieves the StartByDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The StartByDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StartByDt field
   */
   public String getStartByDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStartByDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStartByDtAsFormattedString");
       return fmtMgr.formatDate(this.getStartByDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StartByDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStartByDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the StartByDt field from a formatted string
   *
   * @param _value the StartByDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StartByDt field
   */
   public void setStartByDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStartByDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setStartByDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StartByDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStartByDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStartByDtFromFormattedString");
   }

  /**
   * Retrieves the StartByDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StartByDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the StartByDt field
   */
  public String getStartByDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStartByDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStartByDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getStartByDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StartByDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStartByDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the StartByDt field value from a formatted date/time string
   *
   * @param _value the StartByDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StartByDt field
   */
  public void setStartByDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStartByDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setStartByDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StartByDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStartByDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: StartByDt (CUSTOMER_CONTRACT_VIEW.start_by_dt)
   * @return Date the value
   */
  public Date getStartByDt () {
    return this.StartByDt;
  }
  /** Change the field to not being actively set: StartByDt (CUSTOMER_CONTRACT_VIEW.start_by_dt)
   */
  public void unsetStartByDt () {
    this._StartByDtSet = false;
  }
  /** See if the field is actively set: StartByDt (CUSTOMER_CONTRACT_VIEW.start_by_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetStartByDt () {
    return this._StartByDtSet;
  }
  /** set the fields value: NoticeEndDt (CUSTOMER_CONTRACT_VIEW.notice_end_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("NoticeEndDt") 
  public void setNoticeEndDt (Date value) throws ServiceException
  {
    this.NoticeEndDt = value;
    this._NoticeEndDtSet = true;
  }

  /** Retrieves the NoticeEndDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The NoticeEndDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NoticeEndDt field
   */
   public String getNoticeEndDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoticeEndDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNoticeEndDtAsFormattedString");
       return fmtMgr.formatDate(this.getNoticeEndDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NoticeEndDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getNoticeEndDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the NoticeEndDt field from a formatted string
   *
   * @param _value the NoticeEndDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NoticeEndDt field
   */
   public void setNoticeEndDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoticeEndDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setNoticeEndDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NoticeEndDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setNoticeEndDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNoticeEndDtFromFormattedString");
   }

  /**
   * Retrieves the NoticeEndDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NoticeEndDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the NoticeEndDt field
   */
  public String getNoticeEndDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoticeEndDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNoticeEndDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getNoticeEndDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NoticeEndDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNoticeEndDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the NoticeEndDt field value from a formatted date/time string
   *
   * @param _value the NoticeEndDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NoticeEndDt field
   */
  public void setNoticeEndDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNoticeEndDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setNoticeEndDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NoticeEndDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNoticeEndDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: NoticeEndDt (CUSTOMER_CONTRACT_VIEW.notice_end_dt)
   * @return Date the value
   */
  public Date getNoticeEndDt () {
    return this.NoticeEndDt;
  }
  /** Change the field to not being actively set: NoticeEndDt (CUSTOMER_CONTRACT_VIEW.notice_end_dt)
   */
  public void unsetNoticeEndDt () {
    this._NoticeEndDtSet = false;
  }
  /** See if the field is actively set: NoticeEndDt (CUSTOMER_CONTRACT_VIEW.notice_end_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetNoticeEndDt () {
    return this._NoticeEndDtSet;
  }
  /** set the fields value: DurationOverride (CUSTOMER_CONTRACT_VIEW.duration_override)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DurationOverride") 
  public void setDurationOverride (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DurationOverride", "setDurationOverride");
    }
    this.DurationOverride = value;
    this._DurationOverrideSet = true;
  }

  /** Retrieves the DurationOverride field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DurationOverride field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DurationOverride field
   */
   public String getDurationOverrideAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDurationOverrideAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDurationOverrideAsFormattedString");
       return fmtMgr.formatBoolean(this.getDurationOverride());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DurationOverride");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDurationOverrideAsFormattedString");
       throw x;
     }
   }
  /** Sets the DurationOverride field from a formatted string
   *
   * @param _value the DurationOverride field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DurationOverride field
   */
   public void setDurationOverrideFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDurationOverrideFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDurationOverride(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DurationOverride");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDurationOverrideFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDurationOverrideFromFormattedString");
   }

  /** get the value of the field: DurationOverride (CUSTOMER_CONTRACT_VIEW.duration_override)
   * @return Boolean the value
   */
  public Boolean getDurationOverride () {
    return this.DurationOverride;
  }
  /** Change the field to not being actively set: DurationOverride (CUSTOMER_CONTRACT_VIEW.duration_override)
   */
  public void unsetDurationOverride () {
    this._DurationOverrideSet = false;
  }
  /** See if the field is actively set: DurationOverride (CUSTOMER_CONTRACT_VIEW.duration_override)
   * @return boolean whether the field is actively set
   */
  public boolean issetDurationOverride () {
    return this._DurationOverrideSet;
  }
  /** set the fields value: NoticeOverride (CUSTOMER_CONTRACT_VIEW.notice_override)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("NoticeOverride") 
  public void setNoticeOverride (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "NoticeOverride", "setNoticeOverride");
    }
    this.NoticeOverride = value;
    this._NoticeOverrideSet = true;
  }

  /** Retrieves the NoticeOverride field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The NoticeOverride field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NoticeOverride field
   */
   public String getNoticeOverrideAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoticeOverrideAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNoticeOverrideAsFormattedString");
       return fmtMgr.formatBoolean(this.getNoticeOverride());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NoticeOverride");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getNoticeOverrideAsFormattedString");
       throw x;
     }
   }
  /** Sets the NoticeOverride field from a formatted string
   *
   * @param _value the NoticeOverride field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NoticeOverride field
   */
   public void setNoticeOverrideFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoticeOverrideFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setNoticeOverride(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NoticeOverride");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setNoticeOverrideFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNoticeOverrideFromFormattedString");
   }

  /** get the value of the field: NoticeOverride (CUSTOMER_CONTRACT_VIEW.notice_override)
   * @return Boolean the value
   */
  public Boolean getNoticeOverride () {
    return this.NoticeOverride;
  }
  /** Change the field to not being actively set: NoticeOverride (CUSTOMER_CONTRACT_VIEW.notice_override)
   */
  public void unsetNoticeOverride () {
    this._NoticeOverrideSet = false;
  }
  /** See if the field is actively set: NoticeOverride (CUSTOMER_CONTRACT_VIEW.notice_override)
   * @return boolean whether the field is actively set
   */
  public boolean issetNoticeOverride () {
    return this._NoticeOverrideSet;
  }
  /** set the fields value: IsPartOfComponent (CUSTOMER_CONTRACT_VIEW.is_part_of_component)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsPartOfComponent") 
  public void setIsPartOfComponent (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsPartOfComponent", "setIsPartOfComponent");
    }
    this.IsPartOfComponent = value;
    this._IsPartOfComponentSet = true;
  }

  /** Retrieves the IsPartOfComponent field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsPartOfComponent field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsPartOfComponent field
   */
   public String getIsPartOfComponentAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsPartOfComponentAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsPartOfComponentAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsPartOfComponent());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsPartOfComponent");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsPartOfComponentAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsPartOfComponent field from a formatted string
   *
   * @param _value the IsPartOfComponent field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsPartOfComponent field
   */
   public void setIsPartOfComponentFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsPartOfComponentFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsPartOfComponent(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsPartOfComponent");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsPartOfComponentFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsPartOfComponentFromFormattedString");
   }

  /** get the value of the field: IsPartOfComponent (CUSTOMER_CONTRACT_VIEW.is_part_of_component)
   * @return Boolean the value
   */
  public Boolean getIsPartOfComponent () {
    return this.IsPartOfComponent;
  }
  /** Change the field to not being actively set: IsPartOfComponent (CUSTOMER_CONTRACT_VIEW.is_part_of_component)
   */
  public void unsetIsPartOfComponent () {
    this._IsPartOfComponentSet = false;
  }
  /** See if the field is actively set: IsPartOfComponent (CUSTOMER_CONTRACT_VIEW.is_part_of_component)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsPartOfComponent () {
    return this._IsPartOfComponentSet;
  }
  /** set the fields value: ElementId (CUSTOMER_CONTRACT_VIEW.element_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ElementId") 
  public void setElementId (Integer value) throws ServiceException
  {
    this.ElementId = value;
    this._ElementIdSet = true;
  }

  /** Retrieves the ElementId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ElementId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ElementId field
   */
   public String getElementIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getElementIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getElementIdAsFormattedString");
       return fmtMgr.formatNumber(this.getElementId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ElementId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getElementIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ElementId field from a formatted string
   *
   * @param _value the ElementId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ElementId field
   */
   public void setElementIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getElementIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setElementId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ElementId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setElementIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setElementIdFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated ElementId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the ElementId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ElementId field
   */

  public String getElementIdDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getElementIdDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getElementIdEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getElementIdDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getElementId()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ElementId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getElementIdDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated ElementId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the ElementId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ElementId field
   */
  public Enumeration getElementIdEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getElementIdEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("ProductType", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getElementIdEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ElementId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getElementIdEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated ElementId field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setElementIdFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setElementIdFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getElementIdEnumeration(_locale);
      this.setElementId((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ElementId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setElementIdFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setElementIdFromDisplayValue");
  }

  /** get the value of the field: ElementId (CUSTOMER_CONTRACT_VIEW.element_id)
   * @return Integer the value
   */
  public Integer getElementId () {
    return this.ElementId;
  }
  /** Change the field to not being actively set: ElementId (CUSTOMER_CONTRACT_VIEW.element_id)
   */
  public void unsetElementId () {
    this._ElementIdSet = false;
  }
  /** See if the field is actively set: ElementId (CUSTOMER_CONTRACT_VIEW.element_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetElementId () {
    return this._ElementIdSet;
  }
  /** set the fields value: CommitmentReference (CUSTOMER_CONTRACT_VIEW.commitment_reference)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CommitmentReference") 
  public void setCommitmentReference (Integer value) throws ServiceException
  {
    this.CommitmentReference = value;
    this._CommitmentReferenceSet = true;
  }

  /** Retrieves the CommitmentReference field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CommitmentReference field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CommitmentReference field
   */
   public String getCommitmentReferenceAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCommitmentReferenceAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCommitmentReferenceAsFormattedString");
       return fmtMgr.formatNumber(this.getCommitmentReference(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CommitmentReference");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCommitmentReferenceAsFormattedString");
       throw x;
     }
   }
  /** Sets the CommitmentReference field from a formatted string
   *
   * @param _value the CommitmentReference field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CommitmentReference field
   */
   public void setCommitmentReferenceFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCommitmentReferenceFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCommitmentReference(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CommitmentReference");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCommitmentReferenceFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCommitmentReferenceFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated CommitmentReference field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the CommitmentReference field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CommitmentReference field
   */

  public String getCommitmentReferenceDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCommitmentReferenceDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getCommitmentReferenceEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCommitmentReferenceDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getCommitmentReference()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CommitmentReference");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCommitmentReferenceDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated CommitmentReference field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the CommitmentReference field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CommitmentReference field
   */
  public Enumeration getCommitmentReferenceEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCommitmentReferenceEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("ProductType", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCommitmentReferenceEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CommitmentReference");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCommitmentReferenceEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated CommitmentReference field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setCommitmentReferenceFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCommitmentReferenceFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getCommitmentReferenceEnumeration(_locale);
      this.setCommitmentReference((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CommitmentReference");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCommitmentReferenceFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCommitmentReferenceFromDisplayValue");
  }

  /** get the value of the field: CommitmentReference (CUSTOMER_CONTRACT_VIEW.commitment_reference)
   * @return Integer the value
   */
  public Integer getCommitmentReference () {
    return this.CommitmentReference;
  }
  /** Change the field to not being actively set: CommitmentReference (CUSTOMER_CONTRACT_VIEW.commitment_reference)
   */
  public void unsetCommitmentReference () {
    this._CommitmentReferenceSet = false;
  }
  /** See if the field is actively set: CommitmentReference (CUSTOMER_CONTRACT_VIEW.commitment_reference)
   * @return boolean whether the field is actively set
   */
  public boolean issetCommitmentReference () {
    return this._CommitmentReferenceSet;
  }
  /** set the fields value: MinDurationDate (CUSTOMER_CONTRACT_VIEW.min_duration_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MinDurationDate") 
  public void setMinDurationDate (Date value) throws ServiceException
  {
    this.MinDurationDate = value;
    this._MinDurationDateSet = true;
  }

  /** Retrieves the MinDurationDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MinDurationDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MinDurationDate field
   */
   public String getMinDurationDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMinDurationDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMinDurationDateAsFormattedString");
       return fmtMgr.formatDate(this.getMinDurationDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MinDurationDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMinDurationDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the MinDurationDate field from a formatted string
   *
   * @param _value the MinDurationDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MinDurationDate field
   */
   public void setMinDurationDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMinDurationDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMinDurationDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MinDurationDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMinDurationDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMinDurationDateFromFormattedString");
   }

  /**
   * Retrieves the MinDurationDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MinDurationDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the MinDurationDate field
   */
  public String getMinDurationDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMinDurationDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMinDurationDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getMinDurationDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MinDurationDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMinDurationDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the MinDurationDate field value from a formatted date/time string
   *
   * @param _value the MinDurationDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MinDurationDate field
   */
  public void setMinDurationDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMinDurationDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setMinDurationDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MinDurationDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMinDurationDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: MinDurationDate (CUSTOMER_CONTRACT_VIEW.min_duration_date)
   * @return Date the value
   */
  public Date getMinDurationDate () {
    return this.MinDurationDate;
  }
  /** Change the field to not being actively set: MinDurationDate (CUSTOMER_CONTRACT_VIEW.min_duration_date)
   */
  public void unsetMinDurationDate () {
    this._MinDurationDateSet = false;
  }
  /** See if the field is actively set: MinDurationDate (CUSTOMER_CONTRACT_VIEW.min_duration_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetMinDurationDate () {
    return this._MinDurationDateSet;
  }
  /** set the fields value: MinNoticeDate (CUSTOMER_CONTRACT_VIEW.min_notice_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MinNoticeDate") 
  public void setMinNoticeDate (Date value) throws ServiceException
  {
    this.MinNoticeDate = value;
    this._MinNoticeDateSet = true;
  }

  /** Retrieves the MinNoticeDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MinNoticeDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MinNoticeDate field
   */
   public String getMinNoticeDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMinNoticeDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMinNoticeDateAsFormattedString");
       return fmtMgr.formatDate(this.getMinNoticeDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MinNoticeDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMinNoticeDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the MinNoticeDate field from a formatted string
   *
   * @param _value the MinNoticeDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MinNoticeDate field
   */
   public void setMinNoticeDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMinNoticeDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMinNoticeDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MinNoticeDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMinNoticeDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMinNoticeDateFromFormattedString");
   }

  /**
   * Retrieves the MinNoticeDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MinNoticeDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the MinNoticeDate field
   */
  public String getMinNoticeDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMinNoticeDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMinNoticeDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getMinNoticeDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MinNoticeDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMinNoticeDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the MinNoticeDate field value from a formatted date/time string
   *
   * @param _value the MinNoticeDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MinNoticeDate field
   */
  public void setMinNoticeDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMinNoticeDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setMinNoticeDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MinNoticeDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMinNoticeDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: MinNoticeDate (CUSTOMER_CONTRACT_VIEW.min_notice_date)
   * @return Date the value
   */
  public Date getMinNoticeDate () {
    return this.MinNoticeDate;
  }
  /** Change the field to not being actively set: MinNoticeDate (CUSTOMER_CONTRACT_VIEW.min_notice_date)
   */
  public void unsetMinNoticeDate () {
    this._MinNoticeDateSet = false;
  }
  /** See if the field is actively set: MinNoticeDate (CUSTOMER_CONTRACT_VIEW.min_notice_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetMinNoticeDate () {
    return this._MinNoticeDateSet;
  }
  /** set the fields value: IsCustom (CUSTOMER_CONTRACT_VIEW.is_custom)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsCustom") 
  public void setIsCustom (Integer value) throws ServiceException
  {
    this.IsCustom = value;
    this._IsCustomSet = true;
  }

  /** Retrieves the IsCustom field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsCustom field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsCustom field
   */
   public String getIsCustomAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsCustomAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsCustomAsFormattedString");
       return fmtMgr.formatNumber(this.getIsCustom(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsCustom");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsCustomAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsCustom field from a formatted string
   *
   * @param _value the IsCustom field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsCustom field
   */
   public void setIsCustomFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsCustomFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsCustom(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsCustom");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsCustomFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsCustomFromFormattedString");
   }

  /** get the value of the field: IsCustom (CUSTOMER_CONTRACT_VIEW.is_custom)
   * @return Integer the value
   */
  public Integer getIsCustom () {
    return this.IsCustom;
  }
  /** Change the field to not being actively set: IsCustom (CUSTOMER_CONTRACT_VIEW.is_custom)
   */
  public void unsetIsCustom () {
    this._IsCustomSet = false;
  }
  /** See if the field is actively set: IsCustom (CUSTOMER_CONTRACT_VIEW.is_custom)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsCustom () {
    return this._IsCustomSet;
  }
  public String toString() {
    return GlobalContractObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return ObjectHelper.objectToMap(this);
  }
  public void loadDefaults(String action) {
    if (action != null) DefaultManager.getInstance().setObjectDefaults(this, action);
  }
  public void checkConstraints(String action) throws ConstraintException {
    if (action != null) ConstraintManager.getInstance().checkConstraints(this, action);
  }
  /*
   * This method set all of the *Set flags to the specified value
   * @param flag value to set for flags
   */
  public void resetFlags(boolean flag) {
    
      resetFlags(flag, true);
  }
  /*
   * This method sets the *Set flags to the specified value
   * @param flag value to set for flags
   * @param nonNullOnly set only those flags where the value is not null. 
   */
  public void resetFlags(boolean flag, boolean nonNullOnly) {
    
    /** the object's key data */
    if (Key != null) Key.resetFlags(flag, nonNullOnly);
  /** CUSTOMER_CONTRACT_KEY.tracking_id field */
    if(!nonNullOnly || (TrackingId != null))  _TrackingIdSet = flag;
  /** CUSTOMER_CONTRACT_KEY.tracking_id_serv field */
    if(!nonNullOnly || (TrackingIdServ != null))  _TrackingIdServSet = flag;
  /** CUSTOMER_CONTRACT_KEY.create_dt field */
    if(!nonNullOnly || (CreateDt != null))  _CreateDtSet = flag;
  /** CUSTOMER_CONTRACT_KEY.in_use field */
    if(!nonNullOnly || (InUse != null))  _InUseSet = flag;
  /** CUSTOMER_CONTRACT_KEY.arch_flag field */
    if(!nonNullOnly || (ArchFlag != null))  _ArchFlagSet = flag;
  /** CUSTOMER_CONTRACT_KEY.avail_periods field */
    if(!nonNullOnly || (AvailPeriods != null))  _AvailPeriodsSet = flag;
  /** CUSTOMER_CONTRACT_KEY.first_use_dt field */
    if(!nonNullOnly || (FirstUseDt != null))  _FirstUseDtSet = flag;
  /** CUSTOMER_CONTRACT_KEY.last_use_dt field */
    if(!nonNullOnly || (LastUseDt != null))  _LastUseDtSet = flag;
  /** CUSTOMER_CONTRACT_KEY.commitment_amount field */
    if(!nonNullOnly || (CommitmentAmount != null))  _CommitmentAmountSet = flag;
  /** CUSTOMER_CONTRACT_KEY.commitment_currency_code field */
    if(!nonNullOnly || (CommitmentCurrencyCode != null))  _CommitmentCurrencyCodeSet = flag;
  /** CUSTOMER_CONTRACT_KEY.total_savings_amount field */
    if(!nonNullOnly || (TotalSavingsAmount != null))  _TotalSavingsAmountSet = flag;
  /** CUSTOMER_CONTRACT_KEY.total_element_amount field */
    if(!nonNullOnly || (TotalElementAmount != null))  _TotalElementAmountSet = flag;
  /** CUSTOMER_CONTRACT_KEY.prev_eval_date field */
    if(!nonNullOnly || (PrevEvalDate != null))  _PrevEvalDateSet = flag;
  /** CUSTOMER_CONTRACT_KEY.next_eval_date field */
    if(!nonNullOnly || (NextEvalDate != null))  _NextEvalDateSet = flag;
  /** CUSTOMER_CONTRACT_VIEW.view_status field */
    if(!nonNullOnly || (ViewStatus != null))  _ViewStatusSet = flag;
  /** CUSTOMER_CONTRACT_VIEW.view_created_dt field */
    if(!nonNullOnly || (ViewCreatedDt != null))  _ViewCreatedDtSet = flag;
  /** CUSTOMER_CONTRACT_VIEW.view_effective_dt field */
    if(!nonNullOnly || (ViewEffectiveDt != null))  _ViewEffectiveDtSet = flag;
  /** CUSTOMER_CONTRACT_VIEW.intended_view_effective_dt field */
    if(!nonNullOnly || (IntendedViewEffectiveDt != null))  _IntendedViewEffectiveDtSet = flag;
  /** CUSTOMER_CONTRACT_VIEW.prev_view_id field */
    if(!nonNullOnly || (PrevViewId != null))  _PrevViewIdSet = flag;
  /** CUSTOMER_CONTRACT_VIEW.contract_type field */
    if(!nonNullOnly || (ContractType != null))  _ContractTypeSet = flag;
  /** CUSTOMER_CONTRACT_VIEW.contract_id field */
    if(!nonNullOnly || (ContractId != null))  _ContractIdSet = flag;
  /** CUSTOMER_CONTRACT_VIEW.parent_group_no field */
    if(!nonNullOnly || (ParentGroupNo != null))  _ParentGroupNoSet = flag;
  /** CUSTOMER_CONTRACT_VIEW.start_dt field */
    if(!nonNullOnly || (StartDt != null))  _StartDtSet = flag;
  /** CUSTOMER_CONTRACT_VIEW.end_dt field */
    if(!nonNullOnly || (EndDt != null))  _EndDtSet = flag;
  /** CUSTOMER_CONTRACT_VIEW.prev_end_dt field */
    if(!nonNullOnly || (PrevEndDt != null))  _PrevEndDtSet = flag;
  /** CUSTOMER_CONTRACT_VIEW.grace_period field */
    if(!nonNullOnly || (GracePeriod != null))  _GracePeriodSet = flag;
  /** CUSTOMER_CONTRACT_VIEW.total_periods field */
    if(!nonNullOnly || (TotalPeriods != null))  _TotalPeriodsSet = flag;
  /** CUSTOMER_CONTRACT_VIEW.sales_channel_id field */
    if(!nonNullOnly || (SalesChannelId != null))  _SalesChannelIdSet = flag;
  /** CUSTOMER_CONTRACT_VIEW.track_total_amounts field */
    if(!nonNullOnly || (TrackTotalAmounts != null))  _TrackTotalAmountsSet = flag;
  /** CUSTOMER_CONTRACT_VIEW.rollover_period field */
    if(!nonNullOnly || (RolloverPeriod != null))  _RolloverPeriodSet = flag;
  /** CUSTOMER_CONTRACT_VIEW.rollover_period_start field */
    if(!nonNullOnly || (RolloverPeriodStart != null))  _RolloverPeriodStartSet = flag;
  /** CUSTOMER_CONTRACT_VIEW.bill_period field */
    if(!nonNullOnly || (BillPeriod != null))  _BillPeriodSet = flag;
  /** CUSTOMER_CONTRACT_VIEW.distribute_payback field */
    if(!nonNullOnly || (DistributePayback != null))  _DistributePaybackSet = flag;
  /** CUSTOMER_CONTRACT_VIEW.prorate_contract_strt_override field */
    if(!nonNullOnly || (ProrateContractStrtOverride != null))  _ProrateContractStrtOverrideSet = flag;
  /** CUSTOMER_CONTRACT_VIEW.prorate_contract_end_override field */
    if(!nonNullOnly || (ProrateContractEndOverride != null))  _ProrateContractEndOverrideSet = flag;
  /** CUSTOMER_CONTRACT_VIEW.prorate_interim_bill_override field */
    if(!nonNullOnly || (ProrateInterimBillOverride != null))  _ProrateInterimBillOverrideSet = flag;
  /** CUSTOMER_CONTRACT_VIEW.prorate_period_change_override field */
    if(!nonNullOnly || (ProratePeriodChangeOverride != null))  _ProratePeriodChangeOverrideSet = flag;
  /** CUSTOMER_CONTRACT_VIEW.prorate_account_start_override field */
    if(!nonNullOnly || (ProrateAccountStartOverride != null))  _ProrateAccountStartOverrideSet = flag;
  /** CUSTOMER_CONTRACT_VIEW.prorate_account_end_override field */
    if(!nonNullOnly || (ProrateAccountEndOverride != null))  _ProrateAccountEndOverrideSet = flag;
  /** CUSTOMER_CONTRACT_VIEW.prorate_tgt_threshold_override field */
    if(!nonNullOnly || (ProrateTgtThresholdOverride != null))  _ProrateTgtThresholdOverrideSet = flag;
  /** CUSTOMER_CONTRACT_VIEW.prorate_tgt_rebates_override field */
    if(!nonNullOnly || (ProrateTgtRebatesOverride != null))  _ProrateTgtRebatesOverrideSet = flag;
  /** CUSTOMER_CONTRACT_VIEW.start_by_dt field */
    if(!nonNullOnly || (StartByDt != null))  _StartByDtSet = flag;
  /** CUSTOMER_CONTRACT_VIEW.notice_end_dt field */
    if(!nonNullOnly || (NoticeEndDt != null))  _NoticeEndDtSet = flag;
  /** CUSTOMER_CONTRACT_VIEW.duration_override field */
    if(!nonNullOnly || (DurationOverride != null))  _DurationOverrideSet = flag;
  /** CUSTOMER_CONTRACT_VIEW.notice_override field */
    if(!nonNullOnly || (NoticeOverride != null))  _NoticeOverrideSet = flag;
  /** CUSTOMER_CONTRACT_VIEW.is_part_of_component field */
    if(!nonNullOnly || (IsPartOfComponent != null))  _IsPartOfComponentSet = flag;
  /** CUSTOMER_CONTRACT_VIEW.element_id field */
    if(!nonNullOnly || (ElementId != null))  _ElementIdSet = flag;
  /** CUSTOMER_CONTRACT_VIEW.commitment_reference field */
    if(!nonNullOnly || (CommitmentReference != null))  _CommitmentReferenceSet = flag;
  /** CUSTOMER_CONTRACT_VIEW.min_duration_date field */
    if(!nonNullOnly || (MinDurationDate != null))  _MinDurationDateSet = flag;
  /** CUSTOMER_CONTRACT_VIEW.min_notice_date field */
    if(!nonNullOnly || (MinNoticeDate != null))  _MinNoticeDateSet = flag;
  /** CUSTOMER_CONTRACT_VIEW.is_custom field */
    if(!nonNullOnly || (IsCustom != null))  _IsCustomSet = flag;
  }
}
