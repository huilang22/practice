/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ContractDiscountObjectData.java
 * Definition File: Customer/ContractDiscount.xml
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


import com.csgsystems.api.base.BaseObjectData;
  
/** ContractDiscountObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class ContractDiscountObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public ContractDiscountObjectKeyData Key = null;
  /** CONTRACT_TYPES.contract_category field */
  public    Integer ContractCategory  = null;
  protected boolean _ContractCategorySet = false;
  /** CONTRACT_TYPES.element_id field */
  public    Integer ElementId  = null;
  protected boolean _ElementIdSet = false;
  /** CONTRACT_TYPES.commitment_reference field */
  public    Integer CommitmentReference  = null;
  protected boolean _CommitmentReferenceSet = false;
  /** CONTRACT_TYPES.duration_units field */
  public    Integer DurationUnits  = null;
  protected boolean _DurationUnitsSet = false;
  /** CONTRACT_TYPES.duration field */
  public    Integer Duration  = null;
  protected boolean _DurationSet = false;
  /** CONTRACT_TYPES.plan_id_discount field */
  public    Integer PlanIdDiscount  = null;
  protected boolean _PlanIdDiscountSet = false;
  /** CONTRACT_TYPES.plan_id_credit field */
  public    Integer PlanIdCredit  = null;
  protected boolean _PlanIdCreditSet = false;
  /** CONTRACT_TYPES.activation_type_id_nrc field */
  public    Integer ActivationTypeIdNrc  = null;
  protected boolean _ActivationTypeIdNrcSet = false;
  /** CONTRACT_TYPES.termination_type_id_nrc field */
  public    Integer TerminationTypeIdNrc  = null;
  protected boolean _TerminationTypeIdNrcSet = false;
  /** CONTRACT_TYPES.is_promotion field */
  public    Boolean IsPromotion  = null;
  protected boolean _IsPromotionSet = false;
  /** CONTRACT_TYPES.description_code field */
  public    Integer DescriptionCode  = null;
  protected boolean _DescriptionCodeSet = false;
  /** CONTRACT_TYPES.foreign_code field */
  public    String ForeignCode  = null;
  protected boolean _ForeignCodeSet = false;
  /** CONTRACT_TYPES.start_by_units field */
  public    Integer StartByUnits  = null;
  protected boolean _StartByUnitsSet = false;
  /** CONTRACT_TYPES.start_by field */
  public    Integer StartBy  = null;
  protected boolean _StartBySet = false;
  /** CONTRACT_TYPES.active_date field */
  public    Date ActiveDate  = null;
  protected boolean _ActiveDateSet = false;
  /** CONTRACT_TYPES.inactive_date field */
  public    Date InactiveDate  = null;
  protected boolean _InactiveDateSet = false;
  /** CONTRACT_TYPES.fixed_start_date field */
  public    Date FixedStartDate  = null;
  protected boolean _FixedStartDateSet = false;
  /** CONTRACT_TYPES.fixed_end_date field */
  public    Date FixedEndDate  = null;
  protected boolean _FixedEndDateSet = false;
  /** CONTRACT_TYPES.partial_period field */
  public    Boolean PartialPeriod  = null;
  protected boolean _PartialPeriodSet = false;
  /** CONTRACT_TYPES.commitment_type_id_nrc field */
  public    Integer CommitmentTypeIdNrc  = null;
  protected boolean _CommitmentTypeIdNrcSet = false;
  /** CONTRACT_TYPES.discount_base_period field */
  public    Integer DiscountBasePeriod  = null;
  protected boolean _DiscountBasePeriodSet = false;
  /** CONTRACT_TYPES.rollover_order field */
  public    Integer RolloverOrder  = null;
  protected boolean _RolloverOrderSet = false;
  /** CONTRACT_TYPES.rollover_grouping field */
  public    Integer RolloverGrouping  = null;
  protected boolean _RolloverGroupingSet = false;
  /** CONTRACT_TYPES.bonus_point_id field */
  public    Integer BonusPointId  = null;
  protected boolean _BonusPointIdSet = false;
  /** CONTRACT_TYPES.prorate_contract_start field */
  public    Boolean ProrateContractStart  = null;
  protected boolean _ProrateContractStartSet = false;
  /** CONTRACT_TYPES.prorate_contract_end field */
  public    Boolean ProrateContractEnd  = null;
  protected boolean _ProrateContractEndSet = false;
  /** CONTRACT_TYPES.prorate_interim_bill field */
  public    Boolean ProrateInterimBill  = null;
  protected boolean _ProrateInterimBillSet = false;
  /** CONTRACT_TYPES.prorate_period_change field */
  public    Boolean ProratePeriodChange  = null;
  protected boolean _ProratePeriodChangeSet = false;
  /** CONTRACT_TYPES.prorate_account_start field */
  public    Boolean ProrateAccountStart  = null;
  protected boolean _ProrateAccountStartSet = false;
  /** CONTRACT_TYPES.prorate_account_end field */
  public    Boolean ProrateAccountEnd  = null;
  protected boolean _ProrateAccountEndSet = false;
  /** CONTRACT_TYPES.prorate_target_threshold field */
  public    Boolean ProrateTargetThreshold  = null;
  protected boolean _ProrateTargetThresholdSet = false;
  /** CONTRACT_TYPES.prorate_target_rebates field */
  public    Boolean ProrateTargetRebates  = null;
  protected boolean _ProrateTargetRebatesSet = false;
  /** CONTRACT_TYPES.allow_account field */
  public    Integer AllowAccount  = null;
  protected boolean _AllowAccountSet = false;
  /** CONTRACT_TYPES.allow_serv_inst field */
  public    Integer AllowService  = null;
  protected boolean _AllowServiceSet = false;
  /** CONTRACT_TYPES.allow_acct_group field */
  public    Integer AllowAccountGroup  = null;
  protected boolean _AllowAccountGroupSet = false;
  /** CONTRACT_TYPES.allow_si_group field */
  public    Integer AllowServiceGroup  = null;
  protected boolean _AllowServiceGroupSet = false;
  /** CONTRACT_TYPES.bill_period field */
  public    String BillPeriod  = null;
  protected boolean _BillPeriodSet = false;
  /** CONTRACT_TYPES.min_duration_units field */
  public    Integer MinDurationUnits  = null;
  protected boolean _MinDurationUnitsSet = false;
  /** CONTRACT_TYPES.min_duration field */
  public    Integer MinDuration  = null;
  protected boolean _MinDurationSet = false;
  /** CONTRACT_TYPES.min_notice_units field */
  public    Integer MinNoticeUnits  = null;
  protected boolean _MinNoticeUnitsSet = false;
  /** CONTRACT_TYPES.min_notice_delay field */
  public    Integer MinNoticeDelay  = null;
  protected boolean _MinNoticeDelaySet = false;
  /** CONTRACT_TYPES.is_custom field */
  public    Integer IsCustom  = null;
  protected boolean _IsCustomSet = false;
  /** CONTRACT_TYPES.when_applied field */
  public    Integer WhenApplied  = null;
  protected boolean _WhenAppliedSet = false;
  /** CONTRACT_TYPES.apply_during_suspend field */
  public    Integer ApplyDuringSuspend  = null;
  protected boolean _ApplyDuringSuspendSet = false;
  /** DISCOUNT_PLANS.plan_order field */
  public    Integer PlanOrder  = null;
  protected boolean _PlanOrderSet = false;
  /** DISCOUNT_PLANS.def_order field */
  public    Integer DefOrder  = null;
  protected boolean _DefOrderSet = false;
  private String _objName = "ContractDiscountObjectData";
  /** Default constructor */
  public ContractDiscountObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public ContractDiscountObjectData (ContractDiscountObjectData other)
  {

    if (other == null) return;
    this.Key = new ContractDiscountObjectKeyData (other.Key);
    this.ContractCategory = other.ContractCategory;
    this._ContractCategorySet = other._ContractCategorySet;
    this.ElementId = other.ElementId;
    this._ElementIdSet = other._ElementIdSet;
    this.CommitmentReference = other.CommitmentReference;
    this._CommitmentReferenceSet = other._CommitmentReferenceSet;
    this.DurationUnits = other.DurationUnits;
    this._DurationUnitsSet = other._DurationUnitsSet;
    this.Duration = other.Duration;
    this._DurationSet = other._DurationSet;
    this.PlanIdDiscount = other.PlanIdDiscount;
    this._PlanIdDiscountSet = other._PlanIdDiscountSet;
    this.PlanIdCredit = other.PlanIdCredit;
    this._PlanIdCreditSet = other._PlanIdCreditSet;
    this.ActivationTypeIdNrc = other.ActivationTypeIdNrc;
    this._ActivationTypeIdNrcSet = other._ActivationTypeIdNrcSet;
    this.TerminationTypeIdNrc = other.TerminationTypeIdNrc;
    this._TerminationTypeIdNrcSet = other._TerminationTypeIdNrcSet;
    this.IsPromotion = other.IsPromotion;
    this._IsPromotionSet = other._IsPromotionSet;
    this.DescriptionCode = other.DescriptionCode;
    this._DescriptionCodeSet = other._DescriptionCodeSet;
    this.ForeignCode = other.ForeignCode;
    this._ForeignCodeSet = other._ForeignCodeSet;
    this.StartByUnits = other.StartByUnits;
    this._StartByUnitsSet = other._StartByUnitsSet;
    this.StartBy = other.StartBy;
    this._StartBySet = other._StartBySet;
    this.ActiveDate = other.ActiveDate;
    this._ActiveDateSet = other._ActiveDateSet;
    this.InactiveDate = other.InactiveDate;
    this._InactiveDateSet = other._InactiveDateSet;
    this.FixedStartDate = other.FixedStartDate;
    this._FixedStartDateSet = other._FixedStartDateSet;
    this.FixedEndDate = other.FixedEndDate;
    this._FixedEndDateSet = other._FixedEndDateSet;
    this.PartialPeriod = other.PartialPeriod;
    this._PartialPeriodSet = other._PartialPeriodSet;
    this.CommitmentTypeIdNrc = other.CommitmentTypeIdNrc;
    this._CommitmentTypeIdNrcSet = other._CommitmentTypeIdNrcSet;
    this.DiscountBasePeriod = other.DiscountBasePeriod;
    this._DiscountBasePeriodSet = other._DiscountBasePeriodSet;
    this.RolloverOrder = other.RolloverOrder;
    this._RolloverOrderSet = other._RolloverOrderSet;
    this.RolloverGrouping = other.RolloverGrouping;
    this._RolloverGroupingSet = other._RolloverGroupingSet;
    this.BonusPointId = other.BonusPointId;
    this._BonusPointIdSet = other._BonusPointIdSet;
    this.ProrateContractStart = other.ProrateContractStart;
    this._ProrateContractStartSet = other._ProrateContractStartSet;
    this.ProrateContractEnd = other.ProrateContractEnd;
    this._ProrateContractEndSet = other._ProrateContractEndSet;
    this.ProrateInterimBill = other.ProrateInterimBill;
    this._ProrateInterimBillSet = other._ProrateInterimBillSet;
    this.ProratePeriodChange = other.ProratePeriodChange;
    this._ProratePeriodChangeSet = other._ProratePeriodChangeSet;
    this.ProrateAccountStart = other.ProrateAccountStart;
    this._ProrateAccountStartSet = other._ProrateAccountStartSet;
    this.ProrateAccountEnd = other.ProrateAccountEnd;
    this._ProrateAccountEndSet = other._ProrateAccountEndSet;
    this.ProrateTargetThreshold = other.ProrateTargetThreshold;
    this._ProrateTargetThresholdSet = other._ProrateTargetThresholdSet;
    this.ProrateTargetRebates = other.ProrateTargetRebates;
    this._ProrateTargetRebatesSet = other._ProrateTargetRebatesSet;
    this.AllowAccount = other.AllowAccount;
    this._AllowAccountSet = other._AllowAccountSet;
    this.AllowService = other.AllowService;
    this._AllowServiceSet = other._AllowServiceSet;
    this.AllowAccountGroup = other.AllowAccountGroup;
    this._AllowAccountGroupSet = other._AllowAccountGroupSet;
    this.AllowServiceGroup = other.AllowServiceGroup;
    this._AllowServiceGroupSet = other._AllowServiceGroupSet;
    this.BillPeriod = other.BillPeriod;
    this._BillPeriodSet = other._BillPeriodSet;
    this.MinDurationUnits = other.MinDurationUnits;
    this._MinDurationUnitsSet = other._MinDurationUnitsSet;
    this.MinDuration = other.MinDuration;
    this._MinDurationSet = other._MinDurationSet;
    this.MinNoticeUnits = other.MinNoticeUnits;
    this._MinNoticeUnitsSet = other._MinNoticeUnitsSet;
    this.MinNoticeDelay = other.MinNoticeDelay;
    this._MinNoticeDelaySet = other._MinNoticeDelaySet;
    this.IsCustom = other.IsCustom;
    this._IsCustomSet = other._IsCustomSet;
    this.WhenApplied = other.WhenApplied;
    this._WhenAppliedSet = other._WhenAppliedSet;
    this.ApplyDuringSuspend = other.ApplyDuringSuspend;
    this._ApplyDuringSuspendSet = other._ApplyDuringSuspendSet;
    this.PlanOrder = other.PlanOrder;
    this._PlanOrderSet = other._PlanOrderSet;
    this.DefOrder = other.DefOrder;
    this._DefOrderSet = other._DefOrderSet;
  }

  /** get the Key for this object
   * @return ContractDiscountObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public ContractDiscountObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (ContractDiscountObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: DiscountId (DISCOUNT_PLANS.discount_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setDiscountId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DiscountId", "setDiscountId");
    }
    if (this.Key == null) this.Key = new ContractDiscountObjectKeyData ();
    this.Key.DiscountId = value;
    this.Key._DiscountIdSet = true;
  }
  /** get the value of the field: DiscountId (DISCOUNT_PLANS.discount_id)
   * @return Integer the value
   */
  public Integer getDiscountId () {
    if (this.Key == null) return null;
    return this.Key.DiscountId;
  }
  /** Change the field to not being actively set: DiscountId (DISCOUNT_PLANS.discount_id)
   */
  public void unsetDiscountId () {
    if (this.Key == null) return;
    this.Key._DiscountIdSet = false;
  }
  /** See if the field is actively set: DiscountId (DISCOUNT_PLANS.discount_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetDiscountId () {
    if (this.Key == null) return false;
    return this.Key._DiscountIdSet;
  }

  /** Retrieves the DiscountId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DiscountId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DiscountId field
   */
   public String getDiscountIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscountIdAsFormattedString");
       return fmtMgr.formatNumber(this.getDiscountId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DiscountId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDiscountIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the DiscountId field from a formatted string
   *
   * @param _value the DiscountId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DiscountId field
   */
   public void setDiscountIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDiscountId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DiscountId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDiscountIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDiscountIdFromFormattedString");
   }

  /** set the fields value: ContractType (CONTRACT_TYPES.contract_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setContractType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ContractType", "setContractType");
    }
    if (this.Key == null) this.Key = new ContractDiscountObjectKeyData ();
    this.Key.ContractType = value;
    this.Key._ContractTypeSet = true;
  }
  /** get the value of the field: ContractType (CONTRACT_TYPES.contract_type)
   * @return Integer the value
   */
  public Integer getContractType () {
    if (this.Key == null) return null;
    return this.Key.ContractType;
  }
  /** Change the field to not being actively set: ContractType (CONTRACT_TYPES.contract_type)
   */
  public void unsetContractType () {
    if (this.Key == null) return;
    this.Key._ContractTypeSet = false;
  }
  /** See if the field is actively set: ContractType (CONTRACT_TYPES.contract_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetContractType () {
    if (this.Key == null) return false;
    return this.Key._ContractTypeSet;
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

  /** set the fields value: ContractCategory (CONTRACT_TYPES.contract_category)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ContractCategory") 
  public void setContractCategory (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ContractCategory", "setContractCategory");
    }
    this.ContractCategory = value;
    this._ContractCategorySet = true;
  }

  /** Retrieves the ContractCategory field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ContractCategory field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ContractCategory field
   */
   public String getContractCategoryAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractCategoryAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContractCategoryAsFormattedString");
       return fmtMgr.formatNumber(this.getContractCategory(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContractCategory");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getContractCategoryAsFormattedString");
       throw x;
     }
   }
  /** Sets the ContractCategory field from a formatted string
   *
   * @param _value the ContractCategory field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ContractCategory field
   */
   public void setContractCategoryFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractCategoryFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setContractCategory(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContractCategory");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setContractCategoryFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContractCategoryFromFormattedString");
   }

  /** get the value of the field: ContractCategory (CONTRACT_TYPES.contract_category)
   * @return Integer the value
   */
  public Integer getContractCategory () {
    return this.ContractCategory;
  }
  /** Change the field to not being actively set: ContractCategory (CONTRACT_TYPES.contract_category)
   */
  public void unsetContractCategory () {
    this._ContractCategorySet = false;
  }
  /** See if the field is actively set: ContractCategory (CONTRACT_TYPES.contract_category)
   * @return boolean whether the field is actively set
   */
  public boolean issetContractCategory () {
    return this._ContractCategorySet;
  }
  /** set the fields value: ElementId (CONTRACT_TYPES.element_id)
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

  /** get the value of the field: ElementId (CONTRACT_TYPES.element_id)
   * @return Integer the value
   */
  public Integer getElementId () {
    return this.ElementId;
  }
  /** Change the field to not being actively set: ElementId (CONTRACT_TYPES.element_id)
   */
  public void unsetElementId () {
    this._ElementIdSet = false;
  }
  /** See if the field is actively set: ElementId (CONTRACT_TYPES.element_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetElementId () {
    return this._ElementIdSet;
  }
  /** set the fields value: CommitmentReference (CONTRACT_TYPES.commitment_reference)
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

  /** get the value of the field: CommitmentReference (CONTRACT_TYPES.commitment_reference)
   * @return Integer the value
   */
  public Integer getCommitmentReference () {
    return this.CommitmentReference;
  }
  /** Change the field to not being actively set: CommitmentReference (CONTRACT_TYPES.commitment_reference)
   */
  public void unsetCommitmentReference () {
    this._CommitmentReferenceSet = false;
  }
  /** See if the field is actively set: CommitmentReference (CONTRACT_TYPES.commitment_reference)
   * @return boolean whether the field is actively set
   */
  public boolean issetCommitmentReference () {
    return this._CommitmentReferenceSet;
  }
  /** set the fields value: DurationUnits (CONTRACT_TYPES.duration_units)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DurationUnits") 
  public void setDurationUnits (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DurationUnits", "setDurationUnits");
    }
    this.DurationUnits = value;
    this._DurationUnitsSet = true;
  }

  /** Retrieves the DurationUnits field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DurationUnits field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DurationUnits field
   */
   public String getDurationUnitsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDurationUnitsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDurationUnitsAsFormattedString");
       return fmtMgr.formatNumber(this.getDurationUnits(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DurationUnits");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDurationUnitsAsFormattedString");
       throw x;
     }
   }
  /** Sets the DurationUnits field from a formatted string
   *
   * @param _value the DurationUnits field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DurationUnits field
   */
   public void setDurationUnitsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDurationUnitsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDurationUnits(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DurationUnits");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDurationUnitsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDurationUnitsFromFormattedString");
   }

  /** get the value of the field: DurationUnits (CONTRACT_TYPES.duration_units)
   * @return Integer the value
   */
  public Integer getDurationUnits () {
    return this.DurationUnits;
  }
  /** Change the field to not being actively set: DurationUnits (CONTRACT_TYPES.duration_units)
   */
  public void unsetDurationUnits () {
    this._DurationUnitsSet = false;
  }
  /** See if the field is actively set: DurationUnits (CONTRACT_TYPES.duration_units)
   * @return boolean whether the field is actively set
   */
  public boolean issetDurationUnits () {
    return this._DurationUnitsSet;
  }
  /** set the fields value: Duration (CONTRACT_TYPES.duration)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Duration") 
  public void setDuration (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Duration", "setDuration");
    }
    this.Duration = value;
    this._DurationSet = true;
  }

  /** Retrieves the Duration field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Duration field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Duration field
   */
   public String getDurationAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDurationAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDurationAsFormattedString");
       return fmtMgr.formatNumber(this.getDuration(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Duration");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDurationAsFormattedString");
       throw x;
     }
   }
  /** Sets the Duration field from a formatted string
   *
   * @param _value the Duration field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Duration field
   */
   public void setDurationFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDurationFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDuration(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Duration");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDurationFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDurationFromFormattedString");
   }

  /** get the value of the field: Duration (CONTRACT_TYPES.duration)
   * @return Integer the value
   */
  public Integer getDuration () {
    return this.Duration;
  }
  /** Change the field to not being actively set: Duration (CONTRACT_TYPES.duration)
   */
  public void unsetDuration () {
    this._DurationSet = false;
  }
  /** See if the field is actively set: Duration (CONTRACT_TYPES.duration)
   * @return boolean whether the field is actively set
   */
  public boolean issetDuration () {
    return this._DurationSet;
  }
  /** set the fields value: PlanIdDiscount (CONTRACT_TYPES.plan_id_discount)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PlanIdDiscount") 
  public void setPlanIdDiscount (Integer value) throws ServiceException
  {
    this.PlanIdDiscount = value;
    this._PlanIdDiscountSet = true;
  }

  /** Retrieves the PlanIdDiscount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PlanIdDiscount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PlanIdDiscount field
   */
   public String getPlanIdDiscountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPlanIdDiscountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPlanIdDiscountAsFormattedString");
       return fmtMgr.formatNumber(this.getPlanIdDiscount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PlanIdDiscount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPlanIdDiscountAsFormattedString");
       throw x;
     }
   }
  /** Sets the PlanIdDiscount field from a formatted string
   *
   * @param _value the PlanIdDiscount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PlanIdDiscount field
   */
   public void setPlanIdDiscountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPlanIdDiscountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPlanIdDiscount(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PlanIdDiscount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPlanIdDiscountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPlanIdDiscountFromFormattedString");
   }

  /** get the value of the field: PlanIdDiscount (CONTRACT_TYPES.plan_id_discount)
   * @return Integer the value
   */
  public Integer getPlanIdDiscount () {
    return this.PlanIdDiscount;
  }
  /** Change the field to not being actively set: PlanIdDiscount (CONTRACT_TYPES.plan_id_discount)
   */
  public void unsetPlanIdDiscount () {
    this._PlanIdDiscountSet = false;
  }
  /** See if the field is actively set: PlanIdDiscount (CONTRACT_TYPES.plan_id_discount)
   * @return boolean whether the field is actively set
   */
  public boolean issetPlanIdDiscount () {
    return this._PlanIdDiscountSet;
  }
  /** set the fields value: PlanIdCredit (CONTRACT_TYPES.plan_id_credit)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PlanIdCredit") 
  public void setPlanIdCredit (Integer value) throws ServiceException
  {
    this.PlanIdCredit = value;
    this._PlanIdCreditSet = true;
  }

  /** Retrieves the PlanIdCredit field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PlanIdCredit field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PlanIdCredit field
   */
   public String getPlanIdCreditAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPlanIdCreditAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPlanIdCreditAsFormattedString");
       return fmtMgr.formatNumber(this.getPlanIdCredit(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PlanIdCredit");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPlanIdCreditAsFormattedString");
       throw x;
     }
   }
  /** Sets the PlanIdCredit field from a formatted string
   *
   * @param _value the PlanIdCredit field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PlanIdCredit field
   */
   public void setPlanIdCreditFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPlanIdCreditFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPlanIdCredit(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PlanIdCredit");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPlanIdCreditFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPlanIdCreditFromFormattedString");
   }

  /** get the value of the field: PlanIdCredit (CONTRACT_TYPES.plan_id_credit)
   * @return Integer the value
   */
  public Integer getPlanIdCredit () {
    return this.PlanIdCredit;
  }
  /** Change the field to not being actively set: PlanIdCredit (CONTRACT_TYPES.plan_id_credit)
   */
  public void unsetPlanIdCredit () {
    this._PlanIdCreditSet = false;
  }
  /** See if the field is actively set: PlanIdCredit (CONTRACT_TYPES.plan_id_credit)
   * @return boolean whether the field is actively set
   */
  public boolean issetPlanIdCredit () {
    return this._PlanIdCreditSet;
  }
  /** set the fields value: ActivationTypeIdNrc (CONTRACT_TYPES.activation_type_id_nrc)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ActivationTypeIdNrc") 
  public void setActivationTypeIdNrc (Integer value) throws ServiceException
  {
    this.ActivationTypeIdNrc = value;
    this._ActivationTypeIdNrcSet = true;
  }

  /** Retrieves the ActivationTypeIdNrc field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ActivationTypeIdNrc field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActivationTypeIdNrc field
   */
   public String getActivationTypeIdNrcAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActivationTypeIdNrcAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActivationTypeIdNrcAsFormattedString");
       return fmtMgr.formatNumber(this.getActivationTypeIdNrc(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ActivationTypeIdNrc");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getActivationTypeIdNrcAsFormattedString");
       throw x;
     }
   }
  /** Sets the ActivationTypeIdNrc field from a formatted string
   *
   * @param _value the ActivationTypeIdNrc field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ActivationTypeIdNrc field
   */
   public void setActivationTypeIdNrcFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActivationTypeIdNrcFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setActivationTypeIdNrc(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ActivationTypeIdNrc");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setActivationTypeIdNrcFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setActivationTypeIdNrcFromFormattedString");
   }

  /** get the value of the field: ActivationTypeIdNrc (CONTRACT_TYPES.activation_type_id_nrc)
   * @return Integer the value
   */
  public Integer getActivationTypeIdNrc () {
    return this.ActivationTypeIdNrc;
  }
  /** Change the field to not being actively set: ActivationTypeIdNrc (CONTRACT_TYPES.activation_type_id_nrc)
   */
  public void unsetActivationTypeIdNrc () {
    this._ActivationTypeIdNrcSet = false;
  }
  /** See if the field is actively set: ActivationTypeIdNrc (CONTRACT_TYPES.activation_type_id_nrc)
   * @return boolean whether the field is actively set
   */
  public boolean issetActivationTypeIdNrc () {
    return this._ActivationTypeIdNrcSet;
  }
  /** set the fields value: TerminationTypeIdNrc (CONTRACT_TYPES.termination_type_id_nrc)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TerminationTypeIdNrc") 
  public void setTerminationTypeIdNrc (Integer value) throws ServiceException
  {
    this.TerminationTypeIdNrc = value;
    this._TerminationTypeIdNrcSet = true;
  }

  /** Retrieves the TerminationTypeIdNrc field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TerminationTypeIdNrc field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TerminationTypeIdNrc field
   */
   public String getTerminationTypeIdNrcAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTerminationTypeIdNrcAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTerminationTypeIdNrcAsFormattedString");
       return fmtMgr.formatNumber(this.getTerminationTypeIdNrc(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TerminationTypeIdNrc");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTerminationTypeIdNrcAsFormattedString");
       throw x;
     }
   }
  /** Sets the TerminationTypeIdNrc field from a formatted string
   *
   * @param _value the TerminationTypeIdNrc field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TerminationTypeIdNrc field
   */
   public void setTerminationTypeIdNrcFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTerminationTypeIdNrcFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTerminationTypeIdNrc(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TerminationTypeIdNrc");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTerminationTypeIdNrcFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTerminationTypeIdNrcFromFormattedString");
   }

  /** get the value of the field: TerminationTypeIdNrc (CONTRACT_TYPES.termination_type_id_nrc)
   * @return Integer the value
   */
  public Integer getTerminationTypeIdNrc () {
    return this.TerminationTypeIdNrc;
  }
  /** Change the field to not being actively set: TerminationTypeIdNrc (CONTRACT_TYPES.termination_type_id_nrc)
   */
  public void unsetTerminationTypeIdNrc () {
    this._TerminationTypeIdNrcSet = false;
  }
  /** See if the field is actively set: TerminationTypeIdNrc (CONTRACT_TYPES.termination_type_id_nrc)
   * @return boolean whether the field is actively set
   */
  public boolean issetTerminationTypeIdNrc () {
    return this._TerminationTypeIdNrcSet;
  }
  /** set the fields value: IsPromotion (CONTRACT_TYPES.is_promotion)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsPromotion") 
  public void setIsPromotion (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsPromotion", "setIsPromotion");
    }
    this.IsPromotion = value;
    this._IsPromotionSet = true;
  }

  /** Retrieves the IsPromotion field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsPromotion field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsPromotion field
   */
   public String getIsPromotionAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsPromotionAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsPromotionAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsPromotion());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsPromotion");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsPromotionAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsPromotion field from a formatted string
   *
   * @param _value the IsPromotion field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsPromotion field
   */
   public void setIsPromotionFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsPromotionFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsPromotion(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsPromotion");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsPromotionFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsPromotionFromFormattedString");
   }

  /** get the value of the field: IsPromotion (CONTRACT_TYPES.is_promotion)
   * @return Boolean the value
   */
  public Boolean getIsPromotion () {
    return this.IsPromotion;
  }
  /** Change the field to not being actively set: IsPromotion (CONTRACT_TYPES.is_promotion)
   */
  public void unsetIsPromotion () {
    this._IsPromotionSet = false;
  }
  /** See if the field is actively set: IsPromotion (CONTRACT_TYPES.is_promotion)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsPromotion () {
    return this._IsPromotionSet;
  }
  /** set the fields value: DescriptionCode (CONTRACT_TYPES.description_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DescriptionCode") 
  public void setDescriptionCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DescriptionCode", "setDescriptionCode");
    }
    this.DescriptionCode = value;
    this._DescriptionCodeSet = true;
  }

  /** Retrieves the DescriptionCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DescriptionCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DescriptionCode field
   */
   public String getDescriptionCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDescriptionCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDescriptionCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getDescriptionCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DescriptionCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDescriptionCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the DescriptionCode field from a formatted string
   *
   * @param _value the DescriptionCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DescriptionCode field
   */
   public void setDescriptionCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDescriptionCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDescriptionCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DescriptionCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDescriptionCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDescriptionCodeFromFormattedString");
   }

  /** get the value of the field: DescriptionCode (CONTRACT_TYPES.description_code)
   * @return Integer the value
   */
  public Integer getDescriptionCode () {
    return this.DescriptionCode;
  }
  /** Change the field to not being actively set: DescriptionCode (CONTRACT_TYPES.description_code)
   */
  public void unsetDescriptionCode () {
    this._DescriptionCodeSet = false;
  }
  /** See if the field is actively set: DescriptionCode (CONTRACT_TYPES.description_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetDescriptionCode () {
    return this._DescriptionCodeSet;
  }
  /** set the fields value: ForeignCode (CONTRACT_TYPES.foreign_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ForeignCode") 
  public void setForeignCode (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ForeignCode", "setForeignCode");
    }
    this.ForeignCode = value;
    this._ForeignCodeSet = true;
  }

  /** Retrieves the ForeignCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ForeignCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ForeignCode field
   */
   public String getForeignCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getForeignCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getForeignCodeAsFormattedString");
       return fmtMgr.formatString(this.getForeignCode());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ForeignCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getForeignCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the ForeignCode field from a formatted string
   *
   * @param _value the ForeignCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ForeignCode field
   */
   public void setForeignCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getForeignCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setForeignCode(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ForeignCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setForeignCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setForeignCodeFromFormattedString");
   }

  /** get the value of the field: ForeignCode (CONTRACT_TYPES.foreign_code)
   * @return String the value
   */
  public String getForeignCode () {
    return this.ForeignCode;
  }
  /** Change the field to not being actively set: ForeignCode (CONTRACT_TYPES.foreign_code)
   */
  public void unsetForeignCode () {
    this._ForeignCodeSet = false;
  }
  /** See if the field is actively set: ForeignCode (CONTRACT_TYPES.foreign_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetForeignCode () {
    return this._ForeignCodeSet;
  }
  /** set the fields value: StartByUnits (CONTRACT_TYPES.start_by_units)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("StartByUnits") 
  public void setStartByUnits (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "StartByUnits", "setStartByUnits");
    }
    this.StartByUnits = value;
    this._StartByUnitsSet = true;
  }

  /** Retrieves the StartByUnits field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The StartByUnits field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StartByUnits field
   */
   public String getStartByUnitsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStartByUnitsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStartByUnitsAsFormattedString");
       return fmtMgr.formatNumber(this.getStartByUnits(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StartByUnits");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStartByUnitsAsFormattedString");
       throw x;
     }
   }
  /** Sets the StartByUnits field from a formatted string
   *
   * @param _value the StartByUnits field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StartByUnits field
   */
   public void setStartByUnitsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStartByUnitsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setStartByUnits(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StartByUnits");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStartByUnitsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStartByUnitsFromFormattedString");
   }

  /** get the value of the field: StartByUnits (CONTRACT_TYPES.start_by_units)
   * @return Integer the value
   */
  public Integer getStartByUnits () {
    return this.StartByUnits;
  }
  /** Change the field to not being actively set: StartByUnits (CONTRACT_TYPES.start_by_units)
   */
  public void unsetStartByUnits () {
    this._StartByUnitsSet = false;
  }
  /** See if the field is actively set: StartByUnits (CONTRACT_TYPES.start_by_units)
   * @return boolean whether the field is actively set
   */
  public boolean issetStartByUnits () {
    return this._StartByUnitsSet;
  }
  /** set the fields value: StartBy (CONTRACT_TYPES.start_by)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("StartBy") 
  public void setStartBy (Integer value) throws ServiceException
  {
    this.StartBy = value;
    this._StartBySet = true;
  }

  /** Retrieves the StartBy field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The StartBy field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StartBy field
   */
   public String getStartByAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStartByAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStartByAsFormattedString");
       return fmtMgr.formatNumber(this.getStartBy(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StartBy");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStartByAsFormattedString");
       throw x;
     }
   }
  /** Sets the StartBy field from a formatted string
   *
   * @param _value the StartBy field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StartBy field
   */
   public void setStartByFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStartByFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setStartBy(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StartBy");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStartByFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStartByFromFormattedString");
   }

  /** get the value of the field: StartBy (CONTRACT_TYPES.start_by)
   * @return Integer the value
   */
  public Integer getStartBy () {
    return this.StartBy;
  }
  /** Change the field to not being actively set: StartBy (CONTRACT_TYPES.start_by)
   */
  public void unsetStartBy () {
    this._StartBySet = false;
  }
  /** See if the field is actively set: StartBy (CONTRACT_TYPES.start_by)
   * @return boolean whether the field is actively set
   */
  public boolean issetStartBy () {
    return this._StartBySet;
  }
  /** set the fields value: ActiveDate (CONTRACT_TYPES.active_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ActiveDate") 
  public void setActiveDate (Date value) throws ServiceException
  {
    this.ActiveDate = value;
    this._ActiveDateSet = true;
  }

  /** Retrieves the ActiveDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ActiveDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActiveDate field
   */
   public String getActiveDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActiveDateAsFormattedString");
       return fmtMgr.formatDate(this.getActiveDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ActiveDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getActiveDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the ActiveDate field from a formatted string
   *
   * @param _value the ActiveDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ActiveDate field
   */
   public void setActiveDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setActiveDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ActiveDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setActiveDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setActiveDateFromFormattedString");
   }

  /**
   * Retrieves the ActiveDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ActiveDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActiveDate field
   */
  public String getActiveDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActiveDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getActiveDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getActiveDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ActiveDate field value from a formatted date/time string
   *
   * @param _value the ActiveDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ActiveDate field
   */
  public void setActiveDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setActiveDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setActiveDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setActiveDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: ActiveDate (CONTRACT_TYPES.active_date)
   * @return Date the value
   */
  public Date getActiveDate () {
    return this.ActiveDate;
  }
  /** Change the field to not being actively set: ActiveDate (CONTRACT_TYPES.active_date)
   */
  public void unsetActiveDate () {
    this._ActiveDateSet = false;
  }
  /** See if the field is actively set: ActiveDate (CONTRACT_TYPES.active_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetActiveDate () {
    return this._ActiveDateSet;
  }
  /** set the fields value: InactiveDate (CONTRACT_TYPES.inactive_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("InactiveDate") 
  public void setInactiveDate (Date value) throws ServiceException
  {
    this.InactiveDate = value;
    this._InactiveDateSet = true;
  }

  /** Retrieves the InactiveDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InactiveDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InactiveDate field
   */
   public String getInactiveDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInactiveDateAsFormattedString");
       return fmtMgr.formatDate(this.getInactiveDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InactiveDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInactiveDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the InactiveDate field from a formatted string
   *
   * @param _value the InactiveDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InactiveDate field
   */
   public void setInactiveDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInactiveDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InactiveDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInactiveDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInactiveDateFromFormattedString");
   }

  /**
   * Retrieves the InactiveDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InactiveDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the InactiveDate field
   */
  public String getInactiveDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInactiveDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getInactiveDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInactiveDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the InactiveDate field value from a formatted date/time string
   *
   * @param _value the InactiveDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InactiveDate field
   */
  public void setInactiveDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInactiveDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setInactiveDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInactiveDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: InactiveDate (CONTRACT_TYPES.inactive_date)
   * @return Date the value
   */
  public Date getInactiveDate () {
    return this.InactiveDate;
  }
  /** Change the field to not being actively set: InactiveDate (CONTRACT_TYPES.inactive_date)
   */
  public void unsetInactiveDate () {
    this._InactiveDateSet = false;
  }
  /** See if the field is actively set: InactiveDate (CONTRACT_TYPES.inactive_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetInactiveDate () {
    return this._InactiveDateSet;
  }
  /** set the fields value: FixedStartDate (CONTRACT_TYPES.fixed_start_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FixedStartDate") 
  public void setFixedStartDate (Date value) throws ServiceException
  {
    this.FixedStartDate = value;
    this._FixedStartDateSet = true;
  }

  /** Retrieves the FixedStartDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FixedStartDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FixedStartDate field
   */
   public String getFixedStartDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFixedStartDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFixedStartDateAsFormattedString");
       return fmtMgr.formatDate(this.getFixedStartDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FixedStartDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFixedStartDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the FixedStartDate field from a formatted string
   *
   * @param _value the FixedStartDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FixedStartDate field
   */
   public void setFixedStartDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFixedStartDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFixedStartDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FixedStartDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFixedStartDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFixedStartDateFromFormattedString");
   }

  /**
   * Retrieves the FixedStartDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FixedStartDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the FixedStartDate field
   */
  public String getFixedStartDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFixedStartDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFixedStartDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getFixedStartDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FixedStartDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFixedStartDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the FixedStartDate field value from a formatted date/time string
   *
   * @param _value the FixedStartDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FixedStartDate field
   */
  public void setFixedStartDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFixedStartDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setFixedStartDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FixedStartDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFixedStartDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: FixedStartDate (CONTRACT_TYPES.fixed_start_date)
   * @return Date the value
   */
  public Date getFixedStartDate () {
    return this.FixedStartDate;
  }
  /** Change the field to not being actively set: FixedStartDate (CONTRACT_TYPES.fixed_start_date)
   */
  public void unsetFixedStartDate () {
    this._FixedStartDateSet = false;
  }
  /** See if the field is actively set: FixedStartDate (CONTRACT_TYPES.fixed_start_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetFixedStartDate () {
    return this._FixedStartDateSet;
  }
  /** set the fields value: FixedEndDate (CONTRACT_TYPES.fixed_end_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FixedEndDate") 
  public void setFixedEndDate (Date value) throws ServiceException
  {
    this.FixedEndDate = value;
    this._FixedEndDateSet = true;
  }

  /** Retrieves the FixedEndDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FixedEndDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FixedEndDate field
   */
   public String getFixedEndDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFixedEndDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFixedEndDateAsFormattedString");
       return fmtMgr.formatDate(this.getFixedEndDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FixedEndDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFixedEndDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the FixedEndDate field from a formatted string
   *
   * @param _value the FixedEndDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FixedEndDate field
   */
   public void setFixedEndDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFixedEndDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFixedEndDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FixedEndDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFixedEndDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFixedEndDateFromFormattedString");
   }

  /**
   * Retrieves the FixedEndDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FixedEndDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the FixedEndDate field
   */
  public String getFixedEndDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFixedEndDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFixedEndDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getFixedEndDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FixedEndDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFixedEndDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the FixedEndDate field value from a formatted date/time string
   *
   * @param _value the FixedEndDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FixedEndDate field
   */
  public void setFixedEndDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFixedEndDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setFixedEndDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FixedEndDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFixedEndDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: FixedEndDate (CONTRACT_TYPES.fixed_end_date)
   * @return Date the value
   */
  public Date getFixedEndDate () {
    return this.FixedEndDate;
  }
  /** Change the field to not being actively set: FixedEndDate (CONTRACT_TYPES.fixed_end_date)
   */
  public void unsetFixedEndDate () {
    this._FixedEndDateSet = false;
  }
  /** See if the field is actively set: FixedEndDate (CONTRACT_TYPES.fixed_end_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetFixedEndDate () {
    return this._FixedEndDateSet;
  }
  /** set the fields value: PartialPeriod (CONTRACT_TYPES.partial_period)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PartialPeriod") 
  public void setPartialPeriod (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PartialPeriod", "setPartialPeriod");
    }
    this.PartialPeriod = value;
    this._PartialPeriodSet = true;
  }

  /** Retrieves the PartialPeriod field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PartialPeriod field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PartialPeriod field
   */
   public String getPartialPeriodAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPartialPeriodAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPartialPeriodAsFormattedString");
       return fmtMgr.formatBoolean(this.getPartialPeriod());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PartialPeriod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPartialPeriodAsFormattedString");
       throw x;
     }
   }
  /** Sets the PartialPeriod field from a formatted string
   *
   * @param _value the PartialPeriod field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PartialPeriod field
   */
   public void setPartialPeriodFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPartialPeriodFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPartialPeriod(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PartialPeriod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPartialPeriodFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPartialPeriodFromFormattedString");
   }

  /** get the value of the field: PartialPeriod (CONTRACT_TYPES.partial_period)
   * @return Boolean the value
   */
  public Boolean getPartialPeriod () {
    return this.PartialPeriod;
  }
  /** Change the field to not being actively set: PartialPeriod (CONTRACT_TYPES.partial_period)
   */
  public void unsetPartialPeriod () {
    this._PartialPeriodSet = false;
  }
  /** See if the field is actively set: PartialPeriod (CONTRACT_TYPES.partial_period)
   * @return boolean whether the field is actively set
   */
  public boolean issetPartialPeriod () {
    return this._PartialPeriodSet;
  }
  /** set the fields value: CommitmentTypeIdNrc (CONTRACT_TYPES.commitment_type_id_nrc)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CommitmentTypeIdNrc") 
  public void setCommitmentTypeIdNrc (Integer value) throws ServiceException
  {
    this.CommitmentTypeIdNrc = value;
    this._CommitmentTypeIdNrcSet = true;
  }

  /** Retrieves the CommitmentTypeIdNrc field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CommitmentTypeIdNrc field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CommitmentTypeIdNrc field
   */
   public String getCommitmentTypeIdNrcAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCommitmentTypeIdNrcAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCommitmentTypeIdNrcAsFormattedString");
       return fmtMgr.formatNumber(this.getCommitmentTypeIdNrc(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CommitmentTypeIdNrc");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCommitmentTypeIdNrcAsFormattedString");
       throw x;
     }
   }
  /** Sets the CommitmentTypeIdNrc field from a formatted string
   *
   * @param _value the CommitmentTypeIdNrc field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CommitmentTypeIdNrc field
   */
   public void setCommitmentTypeIdNrcFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCommitmentTypeIdNrcFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCommitmentTypeIdNrc(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CommitmentTypeIdNrc");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCommitmentTypeIdNrcFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCommitmentTypeIdNrcFromFormattedString");
   }

  /** get the value of the field: CommitmentTypeIdNrc (CONTRACT_TYPES.commitment_type_id_nrc)
   * @return Integer the value
   */
  public Integer getCommitmentTypeIdNrc () {
    return this.CommitmentTypeIdNrc;
  }
  /** Change the field to not being actively set: CommitmentTypeIdNrc (CONTRACT_TYPES.commitment_type_id_nrc)
   */
  public void unsetCommitmentTypeIdNrc () {
    this._CommitmentTypeIdNrcSet = false;
  }
  /** See if the field is actively set: CommitmentTypeIdNrc (CONTRACT_TYPES.commitment_type_id_nrc)
   * @return boolean whether the field is actively set
   */
  public boolean issetCommitmentTypeIdNrc () {
    return this._CommitmentTypeIdNrcSet;
  }
  /** set the fields value: DiscountBasePeriod (CONTRACT_TYPES.discount_base_period)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DiscountBasePeriod") 
  public void setDiscountBasePeriod (Integer value) throws ServiceException
  {
    this.DiscountBasePeriod = value;
    this._DiscountBasePeriodSet = true;
  }

  /** Retrieves the DiscountBasePeriod field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DiscountBasePeriod field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DiscountBasePeriod field
   */
   public String getDiscountBasePeriodAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountBasePeriodAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscountBasePeriodAsFormattedString");
       return fmtMgr.formatNumber(this.getDiscountBasePeriod(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DiscountBasePeriod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDiscountBasePeriodAsFormattedString");
       throw x;
     }
   }
  /** Sets the DiscountBasePeriod field from a formatted string
   *
   * @param _value the DiscountBasePeriod field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DiscountBasePeriod field
   */
   public void setDiscountBasePeriodFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountBasePeriodFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDiscountBasePeriod(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DiscountBasePeriod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDiscountBasePeriodFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDiscountBasePeriodFromFormattedString");
   }

  /** get the value of the field: DiscountBasePeriod (CONTRACT_TYPES.discount_base_period)
   * @return Integer the value
   */
  public Integer getDiscountBasePeriod () {
    return this.DiscountBasePeriod;
  }
  /** Change the field to not being actively set: DiscountBasePeriod (CONTRACT_TYPES.discount_base_period)
   */
  public void unsetDiscountBasePeriod () {
    this._DiscountBasePeriodSet = false;
  }
  /** See if the field is actively set: DiscountBasePeriod (CONTRACT_TYPES.discount_base_period)
   * @return boolean whether the field is actively set
   */
  public boolean issetDiscountBasePeriod () {
    return this._DiscountBasePeriodSet;
  }
  /** set the fields value: RolloverOrder (CONTRACT_TYPES.rollover_order)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RolloverOrder") 
  public void setRolloverOrder (Integer value) throws ServiceException
  {
    this.RolloverOrder = value;
    this._RolloverOrderSet = true;
  }

  /** Retrieves the RolloverOrder field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RolloverOrder field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RolloverOrder field
   */
   public String getRolloverOrderAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRolloverOrderAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRolloverOrderAsFormattedString");
       return fmtMgr.formatNumber(this.getRolloverOrder(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RolloverOrder");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRolloverOrderAsFormattedString");
       throw x;
     }
   }
  /** Sets the RolloverOrder field from a formatted string
   *
   * @param _value the RolloverOrder field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RolloverOrder field
   */
   public void setRolloverOrderFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRolloverOrderFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRolloverOrder(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RolloverOrder");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRolloverOrderFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRolloverOrderFromFormattedString");
   }

  /** get the value of the field: RolloverOrder (CONTRACT_TYPES.rollover_order)
   * @return Integer the value
   */
  public Integer getRolloverOrder () {
    return this.RolloverOrder;
  }
  /** Change the field to not being actively set: RolloverOrder (CONTRACT_TYPES.rollover_order)
   */
  public void unsetRolloverOrder () {
    this._RolloverOrderSet = false;
  }
  /** See if the field is actively set: RolloverOrder (CONTRACT_TYPES.rollover_order)
   * @return boolean whether the field is actively set
   */
  public boolean issetRolloverOrder () {
    return this._RolloverOrderSet;
  }
  /** set the fields value: RolloverGrouping (CONTRACT_TYPES.rollover_grouping)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RolloverGrouping") 
  public void setRolloverGrouping (Integer value) throws ServiceException
  {
    this.RolloverGrouping = value;
    this._RolloverGroupingSet = true;
  }

  /** Retrieves the RolloverGrouping field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RolloverGrouping field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RolloverGrouping field
   */
   public String getRolloverGroupingAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRolloverGroupingAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRolloverGroupingAsFormattedString");
       return fmtMgr.formatNumber(this.getRolloverGrouping(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RolloverGrouping");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRolloverGroupingAsFormattedString");
       throw x;
     }
   }
  /** Sets the RolloverGrouping field from a formatted string
   *
   * @param _value the RolloverGrouping field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RolloverGrouping field
   */
   public void setRolloverGroupingFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRolloverGroupingFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRolloverGrouping(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RolloverGrouping");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRolloverGroupingFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRolloverGroupingFromFormattedString");
   }

  /** get the value of the field: RolloverGrouping (CONTRACT_TYPES.rollover_grouping)
   * @return Integer the value
   */
  public Integer getRolloverGrouping () {
    return this.RolloverGrouping;
  }
  /** Change the field to not being actively set: RolloverGrouping (CONTRACT_TYPES.rollover_grouping)
   */
  public void unsetRolloverGrouping () {
    this._RolloverGroupingSet = false;
  }
  /** See if the field is actively set: RolloverGrouping (CONTRACT_TYPES.rollover_grouping)
   * @return boolean whether the field is actively set
   */
  public boolean issetRolloverGrouping () {
    return this._RolloverGroupingSet;
  }
  /** set the fields value: BonusPointId (CONTRACT_TYPES.bonus_point_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BonusPointId") 
  public void setBonusPointId (Integer value) throws ServiceException
  {
    this.BonusPointId = value;
    this._BonusPointIdSet = true;
  }

  /** Retrieves the BonusPointId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BonusPointId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BonusPointId field
   */
   public String getBonusPointIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBonusPointIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBonusPointIdAsFormattedString");
       return fmtMgr.formatNumber(this.getBonusPointId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BonusPointId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBonusPointIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the BonusPointId field from a formatted string
   *
   * @param _value the BonusPointId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BonusPointId field
   */
   public void setBonusPointIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBonusPointIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBonusPointId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BonusPointId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBonusPointIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBonusPointIdFromFormattedString");
   }

  /** get the value of the field: BonusPointId (CONTRACT_TYPES.bonus_point_id)
   * @return Integer the value
   */
  public Integer getBonusPointId () {
    return this.BonusPointId;
  }
  /** Change the field to not being actively set: BonusPointId (CONTRACT_TYPES.bonus_point_id)
   */
  public void unsetBonusPointId () {
    this._BonusPointIdSet = false;
  }
  /** See if the field is actively set: BonusPointId (CONTRACT_TYPES.bonus_point_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetBonusPointId () {
    return this._BonusPointIdSet;
  }
  /** set the fields value: ProrateContractStart (CONTRACT_TYPES.prorate_contract_start)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ProrateContractStart") 
  public void setProrateContractStart (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ProrateContractStart", "setProrateContractStart");
    }
    this.ProrateContractStart = value;
    this._ProrateContractStartSet = true;
  }

  /** Retrieves the ProrateContractStart field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ProrateContractStart field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProrateContractStart field
   */
   public String getProrateContractStartAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProrateContractStartAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProrateContractStartAsFormattedString");
       return fmtMgr.formatBoolean(this.getProrateContractStart());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProrateContractStart");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getProrateContractStartAsFormattedString");
       throw x;
     }
   }
  /** Sets the ProrateContractStart field from a formatted string
   *
   * @param _value the ProrateContractStart field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ProrateContractStart field
   */
   public void setProrateContractStartFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProrateContractStartFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setProrateContractStart(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProrateContractStart");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setProrateContractStartFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProrateContractStartFromFormattedString");
   }

  /** get the value of the field: ProrateContractStart (CONTRACT_TYPES.prorate_contract_start)
   * @return Boolean the value
   */
  public Boolean getProrateContractStart () {
    return this.ProrateContractStart;
  }
  /** Change the field to not being actively set: ProrateContractStart (CONTRACT_TYPES.prorate_contract_start)
   */
  public void unsetProrateContractStart () {
    this._ProrateContractStartSet = false;
  }
  /** See if the field is actively set: ProrateContractStart (CONTRACT_TYPES.prorate_contract_start)
   * @return boolean whether the field is actively set
   */
  public boolean issetProrateContractStart () {
    return this._ProrateContractStartSet;
  }
  /** set the fields value: ProrateContractEnd (CONTRACT_TYPES.prorate_contract_end)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ProrateContractEnd") 
  public void setProrateContractEnd (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ProrateContractEnd", "setProrateContractEnd");
    }
    this.ProrateContractEnd = value;
    this._ProrateContractEndSet = true;
  }

  /** Retrieves the ProrateContractEnd field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ProrateContractEnd field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProrateContractEnd field
   */
   public String getProrateContractEndAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProrateContractEndAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProrateContractEndAsFormattedString");
       return fmtMgr.formatBoolean(this.getProrateContractEnd());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProrateContractEnd");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getProrateContractEndAsFormattedString");
       throw x;
     }
   }
  /** Sets the ProrateContractEnd field from a formatted string
   *
   * @param _value the ProrateContractEnd field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ProrateContractEnd field
   */
   public void setProrateContractEndFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProrateContractEndFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setProrateContractEnd(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProrateContractEnd");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setProrateContractEndFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProrateContractEndFromFormattedString");
   }

  /** get the value of the field: ProrateContractEnd (CONTRACT_TYPES.prorate_contract_end)
   * @return Boolean the value
   */
  public Boolean getProrateContractEnd () {
    return this.ProrateContractEnd;
  }
  /** Change the field to not being actively set: ProrateContractEnd (CONTRACT_TYPES.prorate_contract_end)
   */
  public void unsetProrateContractEnd () {
    this._ProrateContractEndSet = false;
  }
  /** See if the field is actively set: ProrateContractEnd (CONTRACT_TYPES.prorate_contract_end)
   * @return boolean whether the field is actively set
   */
  public boolean issetProrateContractEnd () {
    return this._ProrateContractEndSet;
  }
  /** set the fields value: ProrateInterimBill (CONTRACT_TYPES.prorate_interim_bill)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ProrateInterimBill") 
  public void setProrateInterimBill (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ProrateInterimBill", "setProrateInterimBill");
    }
    this.ProrateInterimBill = value;
    this._ProrateInterimBillSet = true;
  }

  /** Retrieves the ProrateInterimBill field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ProrateInterimBill field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProrateInterimBill field
   */
   public String getProrateInterimBillAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProrateInterimBillAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProrateInterimBillAsFormattedString");
       return fmtMgr.formatBoolean(this.getProrateInterimBill());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProrateInterimBill");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getProrateInterimBillAsFormattedString");
       throw x;
     }
   }
  /** Sets the ProrateInterimBill field from a formatted string
   *
   * @param _value the ProrateInterimBill field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ProrateInterimBill field
   */
   public void setProrateInterimBillFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProrateInterimBillFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setProrateInterimBill(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProrateInterimBill");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setProrateInterimBillFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProrateInterimBillFromFormattedString");
   }

  /** get the value of the field: ProrateInterimBill (CONTRACT_TYPES.prorate_interim_bill)
   * @return Boolean the value
   */
  public Boolean getProrateInterimBill () {
    return this.ProrateInterimBill;
  }
  /** Change the field to not being actively set: ProrateInterimBill (CONTRACT_TYPES.prorate_interim_bill)
   */
  public void unsetProrateInterimBill () {
    this._ProrateInterimBillSet = false;
  }
  /** See if the field is actively set: ProrateInterimBill (CONTRACT_TYPES.prorate_interim_bill)
   * @return boolean whether the field is actively set
   */
  public boolean issetProrateInterimBill () {
    return this._ProrateInterimBillSet;
  }
  /** set the fields value: ProratePeriodChange (CONTRACT_TYPES.prorate_period_change)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ProratePeriodChange") 
  public void setProratePeriodChange (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ProratePeriodChange", "setProratePeriodChange");
    }
    this.ProratePeriodChange = value;
    this._ProratePeriodChangeSet = true;
  }

  /** Retrieves the ProratePeriodChange field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ProratePeriodChange field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProratePeriodChange field
   */
   public String getProratePeriodChangeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProratePeriodChangeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProratePeriodChangeAsFormattedString");
       return fmtMgr.formatBoolean(this.getProratePeriodChange());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProratePeriodChange");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getProratePeriodChangeAsFormattedString");
       throw x;
     }
   }
  /** Sets the ProratePeriodChange field from a formatted string
   *
   * @param _value the ProratePeriodChange field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ProratePeriodChange field
   */
   public void setProratePeriodChangeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProratePeriodChangeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setProratePeriodChange(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProratePeriodChange");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setProratePeriodChangeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProratePeriodChangeFromFormattedString");
   }

  /** get the value of the field: ProratePeriodChange (CONTRACT_TYPES.prorate_period_change)
   * @return Boolean the value
   */
  public Boolean getProratePeriodChange () {
    return this.ProratePeriodChange;
  }
  /** Change the field to not being actively set: ProratePeriodChange (CONTRACT_TYPES.prorate_period_change)
   */
  public void unsetProratePeriodChange () {
    this._ProratePeriodChangeSet = false;
  }
  /** See if the field is actively set: ProratePeriodChange (CONTRACT_TYPES.prorate_period_change)
   * @return boolean whether the field is actively set
   */
  public boolean issetProratePeriodChange () {
    return this._ProratePeriodChangeSet;
  }
  /** set the fields value: ProrateAccountStart (CONTRACT_TYPES.prorate_account_start)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ProrateAccountStart") 
  public void setProrateAccountStart (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ProrateAccountStart", "setProrateAccountStart");
    }
    this.ProrateAccountStart = value;
    this._ProrateAccountStartSet = true;
  }

  /** Retrieves the ProrateAccountStart field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ProrateAccountStart field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProrateAccountStart field
   */
   public String getProrateAccountStartAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProrateAccountStartAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProrateAccountStartAsFormattedString");
       return fmtMgr.formatBoolean(this.getProrateAccountStart());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProrateAccountStart");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getProrateAccountStartAsFormattedString");
       throw x;
     }
   }
  /** Sets the ProrateAccountStart field from a formatted string
   *
   * @param _value the ProrateAccountStart field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ProrateAccountStart field
   */
   public void setProrateAccountStartFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProrateAccountStartFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setProrateAccountStart(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProrateAccountStart");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setProrateAccountStartFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProrateAccountStartFromFormattedString");
   }

  /** get the value of the field: ProrateAccountStart (CONTRACT_TYPES.prorate_account_start)
   * @return Boolean the value
   */
  public Boolean getProrateAccountStart () {
    return this.ProrateAccountStart;
  }
  /** Change the field to not being actively set: ProrateAccountStart (CONTRACT_TYPES.prorate_account_start)
   */
  public void unsetProrateAccountStart () {
    this._ProrateAccountStartSet = false;
  }
  /** See if the field is actively set: ProrateAccountStart (CONTRACT_TYPES.prorate_account_start)
   * @return boolean whether the field is actively set
   */
  public boolean issetProrateAccountStart () {
    return this._ProrateAccountStartSet;
  }
  /** set the fields value: ProrateAccountEnd (CONTRACT_TYPES.prorate_account_end)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ProrateAccountEnd") 
  public void setProrateAccountEnd (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ProrateAccountEnd", "setProrateAccountEnd");
    }
    this.ProrateAccountEnd = value;
    this._ProrateAccountEndSet = true;
  }

  /** Retrieves the ProrateAccountEnd field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ProrateAccountEnd field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProrateAccountEnd field
   */
   public String getProrateAccountEndAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProrateAccountEndAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProrateAccountEndAsFormattedString");
       return fmtMgr.formatBoolean(this.getProrateAccountEnd());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProrateAccountEnd");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getProrateAccountEndAsFormattedString");
       throw x;
     }
   }
  /** Sets the ProrateAccountEnd field from a formatted string
   *
   * @param _value the ProrateAccountEnd field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ProrateAccountEnd field
   */
   public void setProrateAccountEndFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProrateAccountEndFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setProrateAccountEnd(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProrateAccountEnd");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setProrateAccountEndFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProrateAccountEndFromFormattedString");
   }

  /** get the value of the field: ProrateAccountEnd (CONTRACT_TYPES.prorate_account_end)
   * @return Boolean the value
   */
  public Boolean getProrateAccountEnd () {
    return this.ProrateAccountEnd;
  }
  /** Change the field to not being actively set: ProrateAccountEnd (CONTRACT_TYPES.prorate_account_end)
   */
  public void unsetProrateAccountEnd () {
    this._ProrateAccountEndSet = false;
  }
  /** See if the field is actively set: ProrateAccountEnd (CONTRACT_TYPES.prorate_account_end)
   * @return boolean whether the field is actively set
   */
  public boolean issetProrateAccountEnd () {
    return this._ProrateAccountEndSet;
  }
  /** set the fields value: ProrateTargetThreshold (CONTRACT_TYPES.prorate_target_threshold)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ProrateTargetThreshold") 
  public void setProrateTargetThreshold (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ProrateTargetThreshold", "setProrateTargetThreshold");
    }
    this.ProrateTargetThreshold = value;
    this._ProrateTargetThresholdSet = true;
  }

  /** Retrieves the ProrateTargetThreshold field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ProrateTargetThreshold field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProrateTargetThreshold field
   */
   public String getProrateTargetThresholdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProrateTargetThresholdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProrateTargetThresholdAsFormattedString");
       return fmtMgr.formatBoolean(this.getProrateTargetThreshold());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProrateTargetThreshold");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getProrateTargetThresholdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ProrateTargetThreshold field from a formatted string
   *
   * @param _value the ProrateTargetThreshold field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ProrateTargetThreshold field
   */
   public void setProrateTargetThresholdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProrateTargetThresholdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setProrateTargetThreshold(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProrateTargetThreshold");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setProrateTargetThresholdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProrateTargetThresholdFromFormattedString");
   }

  /** get the value of the field: ProrateTargetThreshold (CONTRACT_TYPES.prorate_target_threshold)
   * @return Boolean the value
   */
  public Boolean getProrateTargetThreshold () {
    return this.ProrateTargetThreshold;
  }
  /** Change the field to not being actively set: ProrateTargetThreshold (CONTRACT_TYPES.prorate_target_threshold)
   */
  public void unsetProrateTargetThreshold () {
    this._ProrateTargetThresholdSet = false;
  }
  /** See if the field is actively set: ProrateTargetThreshold (CONTRACT_TYPES.prorate_target_threshold)
   * @return boolean whether the field is actively set
   */
  public boolean issetProrateTargetThreshold () {
    return this._ProrateTargetThresholdSet;
  }
  /** set the fields value: ProrateTargetRebates (CONTRACT_TYPES.prorate_target_rebates)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ProrateTargetRebates") 
  public void setProrateTargetRebates (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ProrateTargetRebates", "setProrateTargetRebates");
    }
    this.ProrateTargetRebates = value;
    this._ProrateTargetRebatesSet = true;
  }

  /** Retrieves the ProrateTargetRebates field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ProrateTargetRebates field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProrateTargetRebates field
   */
   public String getProrateTargetRebatesAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProrateTargetRebatesAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProrateTargetRebatesAsFormattedString");
       return fmtMgr.formatBoolean(this.getProrateTargetRebates());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProrateTargetRebates");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getProrateTargetRebatesAsFormattedString");
       throw x;
     }
   }
  /** Sets the ProrateTargetRebates field from a formatted string
   *
   * @param _value the ProrateTargetRebates field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ProrateTargetRebates field
   */
   public void setProrateTargetRebatesFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProrateTargetRebatesFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setProrateTargetRebates(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProrateTargetRebates");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setProrateTargetRebatesFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProrateTargetRebatesFromFormattedString");
   }

  /** get the value of the field: ProrateTargetRebates (CONTRACT_TYPES.prorate_target_rebates)
   * @return Boolean the value
   */
  public Boolean getProrateTargetRebates () {
    return this.ProrateTargetRebates;
  }
  /** Change the field to not being actively set: ProrateTargetRebates (CONTRACT_TYPES.prorate_target_rebates)
   */
  public void unsetProrateTargetRebates () {
    this._ProrateTargetRebatesSet = false;
  }
  /** See if the field is actively set: ProrateTargetRebates (CONTRACT_TYPES.prorate_target_rebates)
   * @return boolean whether the field is actively set
   */
  public boolean issetProrateTargetRebates () {
    return this._ProrateTargetRebatesSet;
  }
  /** set the fields value: AllowAccount (CONTRACT_TYPES.allow_account)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AllowAccount") 
  public void setAllowAccount (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AllowAccount", "setAllowAccount");
    }
    this.AllowAccount = value;
    this._AllowAccountSet = true;
  }

  /** Retrieves the AllowAccount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AllowAccount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AllowAccount field
   */
   public String getAllowAccountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAllowAccountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAllowAccountAsFormattedString");
       return fmtMgr.formatNumber(this.getAllowAccount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AllowAccount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAllowAccountAsFormattedString");
       throw x;
     }
   }
  /** Sets the AllowAccount field from a formatted string
   *
   * @param _value the AllowAccount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AllowAccount field
   */
   public void setAllowAccountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAllowAccountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAllowAccount(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AllowAccount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAllowAccountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAllowAccountFromFormattedString");
   }

  /** get the value of the field: AllowAccount (CONTRACT_TYPES.allow_account)
   * @return Integer the value
   */
  public Integer getAllowAccount () {
    return this.AllowAccount;
  }
  /** Change the field to not being actively set: AllowAccount (CONTRACT_TYPES.allow_account)
   */
  public void unsetAllowAccount () {
    this._AllowAccountSet = false;
  }
  /** See if the field is actively set: AllowAccount (CONTRACT_TYPES.allow_account)
   * @return boolean whether the field is actively set
   */
  public boolean issetAllowAccount () {
    return this._AllowAccountSet;
  }
  /** set the fields value: AllowService (CONTRACT_TYPES.allow_serv_inst)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AllowService") 
  public void setAllowService (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AllowService", "setAllowService");
    }
    this.AllowService = value;
    this._AllowServiceSet = true;
  }

  /** Retrieves the AllowService field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AllowService field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AllowService field
   */
   public String getAllowServiceAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAllowServiceAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAllowServiceAsFormattedString");
       return fmtMgr.formatNumber(this.getAllowService(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AllowService");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAllowServiceAsFormattedString");
       throw x;
     }
   }
  /** Sets the AllowService field from a formatted string
   *
   * @param _value the AllowService field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AllowService field
   */
   public void setAllowServiceFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAllowServiceFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAllowService(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AllowService");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAllowServiceFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAllowServiceFromFormattedString");
   }

  /** get the value of the field: AllowService (CONTRACT_TYPES.allow_serv_inst)
   * @return Integer the value
   */
  public Integer getAllowService () {
    return this.AllowService;
  }
  /** Change the field to not being actively set: AllowService (CONTRACT_TYPES.allow_serv_inst)
   */
  public void unsetAllowService () {
    this._AllowServiceSet = false;
  }
  /** See if the field is actively set: AllowService (CONTRACT_TYPES.allow_serv_inst)
   * @return boolean whether the field is actively set
   */
  public boolean issetAllowService () {
    return this._AllowServiceSet;
  }
  /** set the fields value: AllowAccountGroup (CONTRACT_TYPES.allow_acct_group)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AllowAccountGroup") 
  public void setAllowAccountGroup (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AllowAccountGroup", "setAllowAccountGroup");
    }
    this.AllowAccountGroup = value;
    this._AllowAccountGroupSet = true;
  }

  /** Retrieves the AllowAccountGroup field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AllowAccountGroup field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AllowAccountGroup field
   */
   public String getAllowAccountGroupAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAllowAccountGroupAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAllowAccountGroupAsFormattedString");
       return fmtMgr.formatNumber(this.getAllowAccountGroup(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AllowAccountGroup");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAllowAccountGroupAsFormattedString");
       throw x;
     }
   }
  /** Sets the AllowAccountGroup field from a formatted string
   *
   * @param _value the AllowAccountGroup field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AllowAccountGroup field
   */
   public void setAllowAccountGroupFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAllowAccountGroupFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAllowAccountGroup(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AllowAccountGroup");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAllowAccountGroupFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAllowAccountGroupFromFormattedString");
   }

  /** get the value of the field: AllowAccountGroup (CONTRACT_TYPES.allow_acct_group)
   * @return Integer the value
   */
  public Integer getAllowAccountGroup () {
    return this.AllowAccountGroup;
  }
  /** Change the field to not being actively set: AllowAccountGroup (CONTRACT_TYPES.allow_acct_group)
   */
  public void unsetAllowAccountGroup () {
    this._AllowAccountGroupSet = false;
  }
  /** See if the field is actively set: AllowAccountGroup (CONTRACT_TYPES.allow_acct_group)
   * @return boolean whether the field is actively set
   */
  public boolean issetAllowAccountGroup () {
    return this._AllowAccountGroupSet;
  }
  /** set the fields value: AllowServiceGroup (CONTRACT_TYPES.allow_si_group)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AllowServiceGroup") 
  public void setAllowServiceGroup (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AllowServiceGroup", "setAllowServiceGroup");
    }
    this.AllowServiceGroup = value;
    this._AllowServiceGroupSet = true;
  }

  /** Retrieves the AllowServiceGroup field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AllowServiceGroup field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AllowServiceGroup field
   */
   public String getAllowServiceGroupAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAllowServiceGroupAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAllowServiceGroupAsFormattedString");
       return fmtMgr.formatNumber(this.getAllowServiceGroup(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AllowServiceGroup");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAllowServiceGroupAsFormattedString");
       throw x;
     }
   }
  /** Sets the AllowServiceGroup field from a formatted string
   *
   * @param _value the AllowServiceGroup field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AllowServiceGroup field
   */
   public void setAllowServiceGroupFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAllowServiceGroupFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAllowServiceGroup(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AllowServiceGroup");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAllowServiceGroupFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAllowServiceGroupFromFormattedString");
   }

  /** get the value of the field: AllowServiceGroup (CONTRACT_TYPES.allow_si_group)
   * @return Integer the value
   */
  public Integer getAllowServiceGroup () {
    return this.AllowServiceGroup;
  }
  /** Change the field to not being actively set: AllowServiceGroup (CONTRACT_TYPES.allow_si_group)
   */
  public void unsetAllowServiceGroup () {
    this._AllowServiceGroupSet = false;
  }
  /** See if the field is actively set: AllowServiceGroup (CONTRACT_TYPES.allow_si_group)
   * @return boolean whether the field is actively set
   */
  public boolean issetAllowServiceGroup () {
    return this._AllowServiceGroupSet;
  }
  /** set the fields value: BillPeriod (CONTRACT_TYPES.bill_period)
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

  /** get the value of the field: BillPeriod (CONTRACT_TYPES.bill_period)
   * @return String the value
   */
  public String getBillPeriod () {
    return this.BillPeriod;
  }
  /** Change the field to not being actively set: BillPeriod (CONTRACT_TYPES.bill_period)
   */
  public void unsetBillPeriod () {
    this._BillPeriodSet = false;
  }
  /** See if the field is actively set: BillPeriod (CONTRACT_TYPES.bill_period)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillPeriod () {
    return this._BillPeriodSet;
  }
  /** set the fields value: MinDurationUnits (CONTRACT_TYPES.min_duration_units)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MinDurationUnits") 
  public void setMinDurationUnits (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "MinDurationUnits", "setMinDurationUnits");
    }
    this.MinDurationUnits = value;
    this._MinDurationUnitsSet = true;
  }

  /** Retrieves the MinDurationUnits field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MinDurationUnits field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MinDurationUnits field
   */
   public String getMinDurationUnitsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMinDurationUnitsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMinDurationUnitsAsFormattedString");
       return fmtMgr.formatNumber(this.getMinDurationUnits(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MinDurationUnits");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMinDurationUnitsAsFormattedString");
       throw x;
     }
   }
  /** Sets the MinDurationUnits field from a formatted string
   *
   * @param _value the MinDurationUnits field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MinDurationUnits field
   */
   public void setMinDurationUnitsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMinDurationUnitsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMinDurationUnits(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MinDurationUnits");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMinDurationUnitsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMinDurationUnitsFromFormattedString");
   }

  /** get the value of the field: MinDurationUnits (CONTRACT_TYPES.min_duration_units)
   * @return Integer the value
   */
  public Integer getMinDurationUnits () {
    return this.MinDurationUnits;
  }
  /** Change the field to not being actively set: MinDurationUnits (CONTRACT_TYPES.min_duration_units)
   */
  public void unsetMinDurationUnits () {
    this._MinDurationUnitsSet = false;
  }
  /** See if the field is actively set: MinDurationUnits (CONTRACT_TYPES.min_duration_units)
   * @return boolean whether the field is actively set
   */
  public boolean issetMinDurationUnits () {
    return this._MinDurationUnitsSet;
  }
  /** set the fields value: MinDuration (CONTRACT_TYPES.min_duration)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MinDuration") 
  public void setMinDuration (Integer value) throws ServiceException
  {
    this.MinDuration = value;
    this._MinDurationSet = true;
  }

  /** Retrieves the MinDuration field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MinDuration field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MinDuration field
   */
   public String getMinDurationAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMinDurationAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMinDurationAsFormattedString");
       return fmtMgr.formatNumber(this.getMinDuration(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MinDuration");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMinDurationAsFormattedString");
       throw x;
     }
   }
  /** Sets the MinDuration field from a formatted string
   *
   * @param _value the MinDuration field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MinDuration field
   */
   public void setMinDurationFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMinDurationFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMinDuration(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MinDuration");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMinDurationFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMinDurationFromFormattedString");
   }

  /** get the value of the field: MinDuration (CONTRACT_TYPES.min_duration)
   * @return Integer the value
   */
  public Integer getMinDuration () {
    return this.MinDuration;
  }
  /** Change the field to not being actively set: MinDuration (CONTRACT_TYPES.min_duration)
   */
  public void unsetMinDuration () {
    this._MinDurationSet = false;
  }
  /** See if the field is actively set: MinDuration (CONTRACT_TYPES.min_duration)
   * @return boolean whether the field is actively set
   */
  public boolean issetMinDuration () {
    return this._MinDurationSet;
  }
  /** set the fields value: MinNoticeUnits (CONTRACT_TYPES.min_notice_units)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MinNoticeUnits") 
  public void setMinNoticeUnits (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "MinNoticeUnits", "setMinNoticeUnits");
    }
    this.MinNoticeUnits = value;
    this._MinNoticeUnitsSet = true;
  }

  /** Retrieves the MinNoticeUnits field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MinNoticeUnits field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MinNoticeUnits field
   */
   public String getMinNoticeUnitsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMinNoticeUnitsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMinNoticeUnitsAsFormattedString");
       return fmtMgr.formatNumber(this.getMinNoticeUnits(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MinNoticeUnits");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMinNoticeUnitsAsFormattedString");
       throw x;
     }
   }
  /** Sets the MinNoticeUnits field from a formatted string
   *
   * @param _value the MinNoticeUnits field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MinNoticeUnits field
   */
   public void setMinNoticeUnitsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMinNoticeUnitsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMinNoticeUnits(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MinNoticeUnits");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMinNoticeUnitsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMinNoticeUnitsFromFormattedString");
   }

  /** get the value of the field: MinNoticeUnits (CONTRACT_TYPES.min_notice_units)
   * @return Integer the value
   */
  public Integer getMinNoticeUnits () {
    return this.MinNoticeUnits;
  }
  /** Change the field to not being actively set: MinNoticeUnits (CONTRACT_TYPES.min_notice_units)
   */
  public void unsetMinNoticeUnits () {
    this._MinNoticeUnitsSet = false;
  }
  /** See if the field is actively set: MinNoticeUnits (CONTRACT_TYPES.min_notice_units)
   * @return boolean whether the field is actively set
   */
  public boolean issetMinNoticeUnits () {
    return this._MinNoticeUnitsSet;
  }
  /** set the fields value: MinNoticeDelay (CONTRACT_TYPES.min_notice_delay)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MinNoticeDelay") 
  public void setMinNoticeDelay (Integer value) throws ServiceException
  {
    this.MinNoticeDelay = value;
    this._MinNoticeDelaySet = true;
  }

  /** Retrieves the MinNoticeDelay field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MinNoticeDelay field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MinNoticeDelay field
   */
   public String getMinNoticeDelayAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMinNoticeDelayAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMinNoticeDelayAsFormattedString");
       return fmtMgr.formatNumber(this.getMinNoticeDelay(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MinNoticeDelay");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMinNoticeDelayAsFormattedString");
       throw x;
     }
   }
  /** Sets the MinNoticeDelay field from a formatted string
   *
   * @param _value the MinNoticeDelay field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MinNoticeDelay field
   */
   public void setMinNoticeDelayFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMinNoticeDelayFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMinNoticeDelay(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MinNoticeDelay");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMinNoticeDelayFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMinNoticeDelayFromFormattedString");
   }

  /** get the value of the field: MinNoticeDelay (CONTRACT_TYPES.min_notice_delay)
   * @return Integer the value
   */
  public Integer getMinNoticeDelay () {
    return this.MinNoticeDelay;
  }
  /** Change the field to not being actively set: MinNoticeDelay (CONTRACT_TYPES.min_notice_delay)
   */
  public void unsetMinNoticeDelay () {
    this._MinNoticeDelaySet = false;
  }
  /** See if the field is actively set: MinNoticeDelay (CONTRACT_TYPES.min_notice_delay)
   * @return boolean whether the field is actively set
   */
  public boolean issetMinNoticeDelay () {
    return this._MinNoticeDelaySet;
  }
  /** set the fields value: IsCustom (CONTRACT_TYPES.is_custom)
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

  /** get the value of the field: IsCustom (CONTRACT_TYPES.is_custom)
   * @return Integer the value
   */
  public Integer getIsCustom () {
    return this.IsCustom;
  }
  /** Change the field to not being actively set: IsCustom (CONTRACT_TYPES.is_custom)
   */
  public void unsetIsCustom () {
    this._IsCustomSet = false;
  }
  /** See if the field is actively set: IsCustom (CONTRACT_TYPES.is_custom)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsCustom () {
    return this._IsCustomSet;
  }
  /** set the fields value: WhenApplied (CONTRACT_TYPES.when_applied)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("WhenApplied") 
  public void setWhenApplied (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "WhenApplied", "setWhenApplied");
    }
    this.WhenApplied = value;
    this._WhenAppliedSet = true;
  }

  /** Retrieves the WhenApplied field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The WhenApplied field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the WhenApplied field
   */
   public String getWhenAppliedAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getWhenAppliedAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getWhenAppliedAsFormattedString");
       return fmtMgr.formatNumber(this.getWhenApplied(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("WhenApplied");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getWhenAppliedAsFormattedString");
       throw x;
     }
   }
  /** Sets the WhenApplied field from a formatted string
   *
   * @param _value the WhenApplied field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the WhenApplied field
   */
   public void setWhenAppliedFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getWhenAppliedFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setWhenApplied(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("WhenApplied");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setWhenAppliedFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setWhenAppliedFromFormattedString");
   }

  /** get the value of the field: WhenApplied (CONTRACT_TYPES.when_applied)
   * @return Integer the value
   */
  public Integer getWhenApplied () {
    return this.WhenApplied;
  }
  /** Change the field to not being actively set: WhenApplied (CONTRACT_TYPES.when_applied)
   */
  public void unsetWhenApplied () {
    this._WhenAppliedSet = false;
  }
  /** See if the field is actively set: WhenApplied (CONTRACT_TYPES.when_applied)
   * @return boolean whether the field is actively set
   */
  public boolean issetWhenApplied () {
    return this._WhenAppliedSet;
  }
  /** set the fields value: ApplyDuringSuspend (CONTRACT_TYPES.apply_during_suspend)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ApplyDuringSuspend") 
  public void setApplyDuringSuspend (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ApplyDuringSuspend", "setApplyDuringSuspend");
    }
    this.ApplyDuringSuspend = value;
    this._ApplyDuringSuspendSet = true;
  }

  /** Retrieves the ApplyDuringSuspend field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ApplyDuringSuspend field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ApplyDuringSuspend field
   */
   public String getApplyDuringSuspendAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getApplyDuringSuspendAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getApplyDuringSuspendAsFormattedString");
       return fmtMgr.formatNumber(this.getApplyDuringSuspend(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ApplyDuringSuspend");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getApplyDuringSuspendAsFormattedString");
       throw x;
     }
   }
  /** Sets the ApplyDuringSuspend field from a formatted string
   *
   * @param _value the ApplyDuringSuspend field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ApplyDuringSuspend field
   */
   public void setApplyDuringSuspendFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getApplyDuringSuspendFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setApplyDuringSuspend(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ApplyDuringSuspend");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setApplyDuringSuspendFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setApplyDuringSuspendFromFormattedString");
   }

  /** get the value of the field: ApplyDuringSuspend (CONTRACT_TYPES.apply_during_suspend)
   * @return Integer the value
   */
  public Integer getApplyDuringSuspend () {
    return this.ApplyDuringSuspend;
  }
  /** Change the field to not being actively set: ApplyDuringSuspend (CONTRACT_TYPES.apply_during_suspend)
   */
  public void unsetApplyDuringSuspend () {
    this._ApplyDuringSuspendSet = false;
  }
  /** See if the field is actively set: ApplyDuringSuspend (CONTRACT_TYPES.apply_during_suspend)
   * @return boolean whether the field is actively set
   */
  public boolean issetApplyDuringSuspend () {
    return this._ApplyDuringSuspendSet;
  }
  /** set the fields value: PlanOrder (DISCOUNT_PLANS.plan_order)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PlanOrder") 
  public void setPlanOrder (Integer value) throws ServiceException
  {
    this.PlanOrder = value;
    this._PlanOrderSet = true;
  }

  /** Retrieves the PlanOrder field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PlanOrder field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PlanOrder field
   */
   public String getPlanOrderAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPlanOrderAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPlanOrderAsFormattedString");
       return fmtMgr.formatNumber(this.getPlanOrder(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PlanOrder");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPlanOrderAsFormattedString");
       throw x;
     }
   }
  /** Sets the PlanOrder field from a formatted string
   *
   * @param _value the PlanOrder field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PlanOrder field
   */
   public void setPlanOrderFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPlanOrderFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPlanOrder(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PlanOrder");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPlanOrderFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPlanOrderFromFormattedString");
   }

  /** get the value of the field: PlanOrder (DISCOUNT_PLANS.plan_order)
   * @return Integer the value
   */
  public Integer getPlanOrder () {
    return this.PlanOrder;
  }
  /** Change the field to not being actively set: PlanOrder (DISCOUNT_PLANS.plan_order)
   */
  public void unsetPlanOrder () {
    this._PlanOrderSet = false;
  }
  /** See if the field is actively set: PlanOrder (DISCOUNT_PLANS.plan_order)
   * @return boolean whether the field is actively set
   */
  public boolean issetPlanOrder () {
    return this._PlanOrderSet;
  }
  /** set the fields value: DefOrder (DISCOUNT_PLANS.def_order)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DefOrder") 
  public void setDefOrder (Integer value) throws ServiceException
  {
    this.DefOrder = value;
    this._DefOrderSet = true;
  }

  /** Retrieves the DefOrder field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DefOrder field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DefOrder field
   */
   public String getDefOrderAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDefOrderAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDefOrderAsFormattedString");
       return fmtMgr.formatNumber(this.getDefOrder(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DefOrder");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDefOrderAsFormattedString");
       throw x;
     }
   }
  /** Sets the DefOrder field from a formatted string
   *
   * @param _value the DefOrder field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DefOrder field
   */
   public void setDefOrderFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDefOrderFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDefOrder(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DefOrder");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDefOrderFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDefOrderFromFormattedString");
   }

  /** get the value of the field: DefOrder (DISCOUNT_PLANS.def_order)
   * @return Integer the value
   */
  public Integer getDefOrder () {
    return this.DefOrder;
  }
  /** Change the field to not being actively set: DefOrder (DISCOUNT_PLANS.def_order)
   */
  public void unsetDefOrder () {
    this._DefOrderSet = false;
  }
  /** See if the field is actively set: DefOrder (DISCOUNT_PLANS.def_order)
   * @return boolean whether the field is actively set
   */
  public boolean issetDefOrder () {
    return this._DefOrderSet;
  }
  public String toString() {
    return ContractDiscountObjectHelper.toMap(this, null).toString();
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
  /** CONTRACT_TYPES.contract_category field */
    if(!nonNullOnly || (ContractCategory != null))  _ContractCategorySet = flag;
  /** CONTRACT_TYPES.element_id field */
    if(!nonNullOnly || (ElementId != null))  _ElementIdSet = flag;
  /** CONTRACT_TYPES.commitment_reference field */
    if(!nonNullOnly || (CommitmentReference != null))  _CommitmentReferenceSet = flag;
  /** CONTRACT_TYPES.duration_units field */
    if(!nonNullOnly || (DurationUnits != null))  _DurationUnitsSet = flag;
  /** CONTRACT_TYPES.duration field */
    if(!nonNullOnly || (Duration != null))  _DurationSet = flag;
  /** CONTRACT_TYPES.plan_id_discount field */
    if(!nonNullOnly || (PlanIdDiscount != null))  _PlanIdDiscountSet = flag;
  /** CONTRACT_TYPES.plan_id_credit field */
    if(!nonNullOnly || (PlanIdCredit != null))  _PlanIdCreditSet = flag;
  /** CONTRACT_TYPES.activation_type_id_nrc field */
    if(!nonNullOnly || (ActivationTypeIdNrc != null))  _ActivationTypeIdNrcSet = flag;
  /** CONTRACT_TYPES.termination_type_id_nrc field */
    if(!nonNullOnly || (TerminationTypeIdNrc != null))  _TerminationTypeIdNrcSet = flag;
  /** CONTRACT_TYPES.is_promotion field */
    if(!nonNullOnly || (IsPromotion != null))  _IsPromotionSet = flag;
  /** CONTRACT_TYPES.description_code field */
    if(!nonNullOnly || (DescriptionCode != null))  _DescriptionCodeSet = flag;
  /** CONTRACT_TYPES.foreign_code field */
    if(!nonNullOnly || (ForeignCode != null))  _ForeignCodeSet = flag;
  /** CONTRACT_TYPES.start_by_units field */
    if(!nonNullOnly || (StartByUnits != null))  _StartByUnitsSet = flag;
  /** CONTRACT_TYPES.start_by field */
    if(!nonNullOnly || (StartBy != null))  _StartBySet = flag;
  /** CONTRACT_TYPES.active_date field */
    if(!nonNullOnly || (ActiveDate != null))  _ActiveDateSet = flag;
  /** CONTRACT_TYPES.inactive_date field */
    if(!nonNullOnly || (InactiveDate != null))  _InactiveDateSet = flag;
  /** CONTRACT_TYPES.fixed_start_date field */
    if(!nonNullOnly || (FixedStartDate != null))  _FixedStartDateSet = flag;
  /** CONTRACT_TYPES.fixed_end_date field */
    if(!nonNullOnly || (FixedEndDate != null))  _FixedEndDateSet = flag;
  /** CONTRACT_TYPES.partial_period field */
    if(!nonNullOnly || (PartialPeriod != null))  _PartialPeriodSet = flag;
  /** CONTRACT_TYPES.commitment_type_id_nrc field */
    if(!nonNullOnly || (CommitmentTypeIdNrc != null))  _CommitmentTypeIdNrcSet = flag;
  /** CONTRACT_TYPES.discount_base_period field */
    if(!nonNullOnly || (DiscountBasePeriod != null))  _DiscountBasePeriodSet = flag;
  /** CONTRACT_TYPES.rollover_order field */
    if(!nonNullOnly || (RolloverOrder != null))  _RolloverOrderSet = flag;
  /** CONTRACT_TYPES.rollover_grouping field */
    if(!nonNullOnly || (RolloverGrouping != null))  _RolloverGroupingSet = flag;
  /** CONTRACT_TYPES.bonus_point_id field */
    if(!nonNullOnly || (BonusPointId != null))  _BonusPointIdSet = flag;
  /** CONTRACT_TYPES.prorate_contract_start field */
    if(!nonNullOnly || (ProrateContractStart != null))  _ProrateContractStartSet = flag;
  /** CONTRACT_TYPES.prorate_contract_end field */
    if(!nonNullOnly || (ProrateContractEnd != null))  _ProrateContractEndSet = flag;
  /** CONTRACT_TYPES.prorate_interim_bill field */
    if(!nonNullOnly || (ProrateInterimBill != null))  _ProrateInterimBillSet = flag;
  /** CONTRACT_TYPES.prorate_period_change field */
    if(!nonNullOnly || (ProratePeriodChange != null))  _ProratePeriodChangeSet = flag;
  /** CONTRACT_TYPES.prorate_account_start field */
    if(!nonNullOnly || (ProrateAccountStart != null))  _ProrateAccountStartSet = flag;
  /** CONTRACT_TYPES.prorate_account_end field */
    if(!nonNullOnly || (ProrateAccountEnd != null))  _ProrateAccountEndSet = flag;
  /** CONTRACT_TYPES.prorate_target_threshold field */
    if(!nonNullOnly || (ProrateTargetThreshold != null))  _ProrateTargetThresholdSet = flag;
  /** CONTRACT_TYPES.prorate_target_rebates field */
    if(!nonNullOnly || (ProrateTargetRebates != null))  _ProrateTargetRebatesSet = flag;
  /** CONTRACT_TYPES.allow_account field */
    if(!nonNullOnly || (AllowAccount != null))  _AllowAccountSet = flag;
  /** CONTRACT_TYPES.allow_serv_inst field */
    if(!nonNullOnly || (AllowService != null))  _AllowServiceSet = flag;
  /** CONTRACT_TYPES.allow_acct_group field */
    if(!nonNullOnly || (AllowAccountGroup != null))  _AllowAccountGroupSet = flag;
  /** CONTRACT_TYPES.allow_si_group field */
    if(!nonNullOnly || (AllowServiceGroup != null))  _AllowServiceGroupSet = flag;
  /** CONTRACT_TYPES.bill_period field */
    if(!nonNullOnly || (BillPeriod != null))  _BillPeriodSet = flag;
  /** CONTRACT_TYPES.min_duration_units field */
    if(!nonNullOnly || (MinDurationUnits != null))  _MinDurationUnitsSet = flag;
  /** CONTRACT_TYPES.min_duration field */
    if(!nonNullOnly || (MinDuration != null))  _MinDurationSet = flag;
  /** CONTRACT_TYPES.min_notice_units field */
    if(!nonNullOnly || (MinNoticeUnits != null))  _MinNoticeUnitsSet = flag;
  /** CONTRACT_TYPES.min_notice_delay field */
    if(!nonNullOnly || (MinNoticeDelay != null))  _MinNoticeDelaySet = flag;
  /** CONTRACT_TYPES.is_custom field */
    if(!nonNullOnly || (IsCustom != null))  _IsCustomSet = flag;
  /** CONTRACT_TYPES.when_applied field */
    if(!nonNullOnly || (WhenApplied != null))  _WhenAppliedSet = flag;
  /** CONTRACT_TYPES.apply_during_suspend field */
    if(!nonNullOnly || (ApplyDuringSuspend != null))  _ApplyDuringSuspendSet = flag;
  /** DISCOUNT_PLANS.plan_order field */
    if(!nonNullOnly || (PlanOrder != null))  _PlanOrderSet = flag;
  /** DISCOUNT_PLANS.def_order field */
    if(!nonNullOnly || (DefOrder != null))  _DefOrderSet = flag;
  }
}
