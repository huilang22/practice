/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AdjustmentObjectData.java
 * Definition File: Customer/Adjustment.xml
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
  
/** AdjustmentObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class AdjustmentObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public AdjustmentObjectKeyData Key = null;
  /** PAYMENT_PROFILE.card_account field */
  public    String CcardAccount  = null;
  protected boolean _CcardAccountSet = false;
  /** PAYMENT_PROFILE.ownr_lname field */
  public    String OwnrLname  = null;
  protected boolean _OwnrLnameSet = false;
  /** PAYMENT_PROFILE.ownr_fname field */
  public    String OwnrFname  = null;
  protected boolean _OwnrFnameSet = false;
  /** PAYMENT_PROFILE.card_carrier field */
  public    String CcardCarrier  = null;
  protected boolean _CcardCarrierSet = false;
  /** PAYMENT_PROFILE.card_expire field */
  public    String CcardExpire  = null;
  protected boolean _CcardExpireSet = false;
  /** PAYMENT_PROFILE.avs_address_id field */
  public    Integer AvsAddressId  = null;
  protected boolean _AvsAddressIdSet = false;
  /** PAYMENT_PROFILE.clearing_house_id field */
  public    String ClearingHouseId  = null;
  protected boolean _ClearingHouseIdSet = false;
  /** PAYMENT_PROFILE.avs_response_code field */
  public    String AvsResponseCode  = null;
  protected boolean _AvsResponseCodeSet = false;
  /** PAYMENT_PROFILE.trans_flag field */
  public    String TransFlag  = null;
  protected boolean _TransFlagSet = false;
  /** CUSTOMER_ID_ACCT_MAP.external_id field */
  public    String AccountExternalId  = null;
  protected boolean _AccountExternalIdSet = false;
  /** CUSTOMER_ID_ACCT_MAP.external_id_type field */
  public    Integer AccountExternalIdType  = null;
  protected boolean _AccountExternalIdTypeSet = false;
  /** CUSTOMER_ID_EQUIP_MAP_VIEW.external_id field */
  public    String ServiceExternalId  = null;
  protected boolean _ServiceExternalIdSet = false;
  /** CUSTOMER_ID_EQUIP_MAP_VIEW.external_id_type field */
  public    Integer ServiceExternalIdType  = null;
  protected boolean _ServiceExternalIdTypeSet = false;
  /** ACCOUNT_BALANCES.balance_desc field */
  public    String PrepayBalanceDesc  = null;
  protected boolean _PrepayBalanceDescSet = false;
  /** ADJ_TRANS_DESCR.trans_sign field */
  public    Integer TransSign  = null;
  protected boolean _TransSignSet = false;
  /** ADJ_TRANS_DESCR.billing_category field */
  public    Integer BillingCategory  = null;
  protected boolean _BillingCategorySet = false;
  /** ADJ_TRANS_DESCR.trans_target_type field */
  public    Integer TransTargetType  = null;
  protected boolean _TransTargetTypeSet = false;
  /** ADJ_TRANS_DESCR.is_negative_bill_adj field */
  public    Boolean IsNegativeBillAdj  = null;
  protected boolean _IsNegativeBillAdjSet = false;
  /** ServerId field */
  public    Integer ServerId  = null;
  protected boolean _ServerIdSet = false;
  /** ADJ.account_no field */
  public    Integer AccountInternalId  = null;
  protected boolean _AccountInternalIdSet = false;
  /** ADJ.subscr_no field */
  public    Integer ServiceInternalId  = null;
  protected boolean _ServiceInternalIdSet = false;
  /** ADJ.subscr_no_resets field */
  public    Integer ServiceInternalIdResets  = null;
  protected boolean _ServiceInternalIdResetsSet = false;
  /** ADJ.adj_trans_code field */
  public    Integer TransCode  = null;
  protected boolean _TransCodeSet = false;
  /** ADJ.orig_trans_code field */
  public    Integer OrigTransCode  = null;
  protected boolean _OrigTransCodeSet = false;
  /** ADJ.annotation field */
  public    String Annotation  = null;
  protected boolean _AnnotationSet = false;
  /** ADJ.primary_units_type field */
  public    Integer PrimaryUnitsType  = null;
  protected boolean _PrimaryUnitsTypeSet = false;
  /** ADJ.primary_units field */
  public    BigInteger PrimaryUnits  = null;
  protected boolean _PrimaryUnitsSet = false;
  /** ADJ.transact_date field */
  public    Date TransactDate  = null;
  protected boolean _TransactDateSet = false;
  /** ADJ.effective_date field */
  public    Date EffectiveDate  = null;
  protected boolean _EffectiveDateSet = false;
  /** ADJ.end_date field */
  public    Date InactiveDate  = null;
  protected boolean _InactiveDateSet = false;
  /** ADJ.tracking_id_counter field */
  public    Integer TrackingIdCounter  = null;
  protected boolean _TrackingIdCounterSet = false;
  /** ADJ.request_status field */
  public    Integer RequestStatus  = null;
  protected boolean _RequestStatusSet = false;
  /** ADJ.review_date field */
  public    Date ReviewDate  = null;
  protected boolean _ReviewDateSet = false;
  /** ADJ.supervisor_name field */
  public    String SupervisorName  = null;
  protected boolean _SupervisorNameSet = false;
  /** ADJ.current_flag field */
  public    Boolean CurrentFlag  = null;
  protected boolean _CurrentFlagSet = false;
  /** ADJ.pending_flag field */
  public    Boolean PendingFlag  = null;
  protected boolean _PendingFlagSet = false;
  /** ADJ.no_bill field */
  public    Boolean NoBill  = null;
  protected boolean _NoBillSet = false;
  /** ADJ.currency_code field */
  public    Integer CurrencyCode  = null;
  protected boolean _CurrencyCodeSet = false;
  /** ADJ.total_amt field */
  public    BigInteger TotalAmt  = null;
  protected boolean _TotalAmtSet = false;
  /** ADJ.rated_flag field */
  public    Boolean RatedFlag  = null;
  protected boolean _RatedFlagSet = false;
  /** ADJ.arch_flag field */
  public    Boolean ArchFlag  = null;
  protected boolean _ArchFlagSet = false;
  /** ADJ.orig_provider_id field */
  public    Integer OrigProviderId  = null;
  protected boolean _OrigProviderIdSet = false;
  /** ADJ.orig_bill_ref_no field */
  public    Integer OrigBillRefNo  = null;
  protected boolean _OrigBillRefNoSet = false;
  /** ADJ.orig_bill_ref_resets field */
  public    Integer OrigBillRefResets  = null;
  protected boolean _OrigBillRefResetsSet = false;
  /** ADJ.orig_bill_invoice_row field */
  public    Integer OrigBillInvoiceRow  = null;
  protected boolean _OrigBillInvoiceRowSet = false;
  /** ADJ.orig_type field */
  public    Integer OrigType  = null;
  protected boolean _OrigTypeSet = false;
  /** ADJ.orig_subtype field */
  public    Integer OrigSubtype  = null;
  protected boolean _OrigSubtypeSet = false;
  /** ADJ.orig_msg_id field */
  public    Integer OrigMsgId  = null;
  protected boolean _OrigMsgIdSet = false;
  /** ADJ.orig_msg_id2 field */
  public    Integer OrigMsgId2  = null;
  protected boolean _OrigMsgId2Set = false;
  /** ADJ.orig_msg_id_serv field */
  public    Integer OrigMsgIdServ  = null;
  protected boolean _OrigMsgIdServSet = false;
  /** ADJ.orig_tracking_id field */
  public    Integer OrigTrackingId  = null;
  protected boolean _OrigTrackingIdSet = false;
  /** ADJ.orig_tracking_id_serv field */
  public    Integer OrigTrackingIdServ  = null;
  protected boolean _OrigTrackingIdServSet = false;
  /** ADJ.orig_tracking_dt field */
  public    Date OrigTrackingDt  = null;
  protected boolean _OrigTrackingDtSet = false;
  /** ADJ.orig_rc_from_date field */
  public    Date OrigRcFromDate  = null;
  protected boolean _OrigRcFromDateSet = false;
  /** ADJ.bill_ref_no field */
  public    Integer BillRefNo  = null;
  protected boolean _BillRefNoSet = false;
  /** ADJ.bill_ref_resets field */
  public    Integer BillRefResets  = null;
  protected boolean _BillRefResetsSet = false;
  /** ADJ.tax_class field */
  public    Integer TaxClass  = null;
  protected boolean _TaxClassSet = false;
  /** ADJ.tax_pkg_inst_id field */
  public    Integer TaxPkgInstId  = null;
  protected boolean _TaxPkgInstIdSet = false;
  /** ADJ.geocode field */
  public    String Geocode  = null;
  protected boolean _GeocodeSet = false;
  /** ADJ.aux_tax_info field */
  public    String AuxTaxInfo  = null;
  protected boolean _AuxTaxInfoSet = false;
  /** ADJ.comb_tax_rate field */
  public    Integer CombTaxRate  = null;
  protected boolean _CombTaxRateSet = false;
  /** ADJ.federal_tax field */
  public    BigInteger FederalTax  = null;
  protected boolean _FederalTaxSet = false;
  /** ADJ.state_tax field */
  public    BigInteger StateTax  = null;
  protected boolean _StateTaxSet = false;
  /** ADJ.county_tax field */
  public    BigInteger CountyTax  = null;
  protected boolean _CountyTaxSet = false;
  /** ADJ.city_tax field */
  public    BigInteger CityTax  = null;
  protected boolean _CityTaxSet = false;
  /** ADJ.other_tax field */
  public    BigInteger OtherTax  = null;
  protected boolean _OtherTaxSet = false;
  /** ADJ.tax_journal_status field */
  public    Integer TaxJournalStatus  = null;
  protected boolean _TaxJournalStatusSet = false;
  /** ADJ.discount_amt field */
  public    BigInteger DiscountAmt  = null;
  protected boolean _DiscountAmtSet = false;
  /** ADJ.profile_id field */
  public    BigInteger ProfileId  = null;
  protected boolean _ProfileIdSet = false;
  /** ADJ.adj_reason_code field */
  public    Integer AdjReasonCode  = null;
  protected boolean _AdjReasonCodeSet = false;
  /** ADJ.fraud_indicator field */
  public    Integer FraudIndicator  = null;
  protected boolean _FraudIndicatorSet = false;
  /** ADJ.rev_rcv_cost_ctr field */
  public    Integer RevRcvCostCtr  = null;
  protected boolean _RevRcvCostCtrSet = false;
  /** ADJ.chg_who field */
  public    String ChgWho  = null;
  protected boolean _ChgWhoSet = false;
  /** ADJ.chg_date field */
  public    Date ChgDate  = null;
  protected boolean _ChgDateSet = false;
  /** ADJ.balance_chg_date field */
  public    Date BalanceChgDate  = null;
  protected boolean _BalanceChgDateSet = false;
  /** ADJ.b_rev_rcv_cost_ctr field */
  public    Integer BRevRcvCostCtr  = null;
  protected boolean _BRevRcvCostCtrSet = false;
  /** ADJ.orig_split_row_num field */
  public    Integer OrigSplitRowNum  = null;
  protected boolean _OrigSplitRowNumSet = false;
  /** ADJ.tax_type_code field */
  public    Integer TaxTypeCode  = null;
  protected boolean _TaxTypeCodeSet = false;
  /** ADJ.orig_submitter_name field */
  public    String OrigSubmitterName  = null;
  protected boolean _OrigSubmitterNameSet = false;
  /** ADJ.last_reviewed_name field */
  public    String LastReviewedName  = null;
  protected boolean _LastReviewedNameSet = false;
  /** ADJ.jurisdiction field */
  public    Integer Jurisdiction  = null;
  protected boolean _JurisdictionSet = false;
  /** ADJ.open_item_id field */
  public    Integer OpenItemId  = null;
  protected boolean _OpenItemIdSet = false;
  /** ADJ.bill_order_number field */
  public    String BillOrderNumber  = null;
  protected boolean _BillOrderNumberSet = false;
  /** ADJ.request_id field */
  public    BigInteger RequestId  = null;
  protected boolean _RequestIdSet = false;
  private String _objName = "AdjustmentObjectData";
  /** Default constructor */
  public AdjustmentObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public AdjustmentObjectData (AdjustmentObjectData other)
  {

    if (other == null) return;
    this.Key = new AdjustmentObjectKeyData (other.Key);
    this.CcardAccount = other.CcardAccount;
    this._CcardAccountSet = other._CcardAccountSet;
    this.OwnrLname = other.OwnrLname;
    this._OwnrLnameSet = other._OwnrLnameSet;
    this.OwnrFname = other.OwnrFname;
    this._OwnrFnameSet = other._OwnrFnameSet;
    this.CcardCarrier = other.CcardCarrier;
    this._CcardCarrierSet = other._CcardCarrierSet;
    this.CcardExpire = other.CcardExpire;
    this._CcardExpireSet = other._CcardExpireSet;
    this.AvsAddressId = other.AvsAddressId;
    this._AvsAddressIdSet = other._AvsAddressIdSet;
    this.ClearingHouseId = other.ClearingHouseId;
    this._ClearingHouseIdSet = other._ClearingHouseIdSet;
    this.AvsResponseCode = other.AvsResponseCode;
    this._AvsResponseCodeSet = other._AvsResponseCodeSet;
    this.TransFlag = other.TransFlag;
    this._TransFlagSet = other._TransFlagSet;
    this.AccountExternalId = other.AccountExternalId;
    this._AccountExternalIdSet = other._AccountExternalIdSet;
    this.AccountExternalIdType = other.AccountExternalIdType;
    this._AccountExternalIdTypeSet = other._AccountExternalIdTypeSet;
    this.ServiceExternalId = other.ServiceExternalId;
    this._ServiceExternalIdSet = other._ServiceExternalIdSet;
    this.ServiceExternalIdType = other.ServiceExternalIdType;
    this._ServiceExternalIdTypeSet = other._ServiceExternalIdTypeSet;
    this.PrepayBalanceDesc = other.PrepayBalanceDesc;
    this._PrepayBalanceDescSet = other._PrepayBalanceDescSet;
    this.TransSign = other.TransSign;
    this._TransSignSet = other._TransSignSet;
    this.BillingCategory = other.BillingCategory;
    this._BillingCategorySet = other._BillingCategorySet;
    this.TransTargetType = other.TransTargetType;
    this._TransTargetTypeSet = other._TransTargetTypeSet;
    this.IsNegativeBillAdj = other.IsNegativeBillAdj;
    this._IsNegativeBillAdjSet = other._IsNegativeBillAdjSet;
    this.ServerId = other.ServerId;
    this._ServerIdSet = other._ServerIdSet;
    this.AccountInternalId = other.AccountInternalId;
    this._AccountInternalIdSet = other._AccountInternalIdSet;
    this.ServiceInternalId = other.ServiceInternalId;
    this._ServiceInternalIdSet = other._ServiceInternalIdSet;
    this.ServiceInternalIdResets = other.ServiceInternalIdResets;
    this._ServiceInternalIdResetsSet = other._ServiceInternalIdResetsSet;
    this.TransCode = other.TransCode;
    this._TransCodeSet = other._TransCodeSet;
    this.OrigTransCode = other.OrigTransCode;
    this._OrigTransCodeSet = other._OrigTransCodeSet;
    this.Annotation = other.Annotation;
    this._AnnotationSet = other._AnnotationSet;
    this.PrimaryUnitsType = other.PrimaryUnitsType;
    this._PrimaryUnitsTypeSet = other._PrimaryUnitsTypeSet;
    this.PrimaryUnits = other.PrimaryUnits;
    this._PrimaryUnitsSet = other._PrimaryUnitsSet;
    this.TransactDate = other.TransactDate;
    this._TransactDateSet = other._TransactDateSet;
    this.EffectiveDate = other.EffectiveDate;
    this._EffectiveDateSet = other._EffectiveDateSet;
    this.InactiveDate = other.InactiveDate;
    this._InactiveDateSet = other._InactiveDateSet;
    this.TrackingIdCounter = other.TrackingIdCounter;
    this._TrackingIdCounterSet = other._TrackingIdCounterSet;
    this.RequestStatus = other.RequestStatus;
    this._RequestStatusSet = other._RequestStatusSet;
    this.ReviewDate = other.ReviewDate;
    this._ReviewDateSet = other._ReviewDateSet;
    this.SupervisorName = other.SupervisorName;
    this._SupervisorNameSet = other._SupervisorNameSet;
    this.CurrentFlag = other.CurrentFlag;
    this._CurrentFlagSet = other._CurrentFlagSet;
    this.PendingFlag = other.PendingFlag;
    this._PendingFlagSet = other._PendingFlagSet;
    this.NoBill = other.NoBill;
    this._NoBillSet = other._NoBillSet;
    this.CurrencyCode = other.CurrencyCode;
    this._CurrencyCodeSet = other._CurrencyCodeSet;
    this.TotalAmt = other.TotalAmt;
    this._TotalAmtSet = other._TotalAmtSet;
    this.RatedFlag = other.RatedFlag;
    this._RatedFlagSet = other._RatedFlagSet;
    this.ArchFlag = other.ArchFlag;
    this._ArchFlagSet = other._ArchFlagSet;
    this.OrigProviderId = other.OrigProviderId;
    this._OrigProviderIdSet = other._OrigProviderIdSet;
    this.OrigBillRefNo = other.OrigBillRefNo;
    this._OrigBillRefNoSet = other._OrigBillRefNoSet;
    this.OrigBillRefResets = other.OrigBillRefResets;
    this._OrigBillRefResetsSet = other._OrigBillRefResetsSet;
    this.OrigBillInvoiceRow = other.OrigBillInvoiceRow;
    this._OrigBillInvoiceRowSet = other._OrigBillInvoiceRowSet;
    this.OrigType = other.OrigType;
    this._OrigTypeSet = other._OrigTypeSet;
    this.OrigSubtype = other.OrigSubtype;
    this._OrigSubtypeSet = other._OrigSubtypeSet;
    this.OrigMsgId = other.OrigMsgId;
    this._OrigMsgIdSet = other._OrigMsgIdSet;
    this.OrigMsgId2 = other.OrigMsgId2;
    this._OrigMsgId2Set = other._OrigMsgId2Set;
    this.OrigMsgIdServ = other.OrigMsgIdServ;
    this._OrigMsgIdServSet = other._OrigMsgIdServSet;
    this.OrigTrackingId = other.OrigTrackingId;
    this._OrigTrackingIdSet = other._OrigTrackingIdSet;
    this.OrigTrackingIdServ = other.OrigTrackingIdServ;
    this._OrigTrackingIdServSet = other._OrigTrackingIdServSet;
    this.OrigTrackingDt = other.OrigTrackingDt;
    this._OrigTrackingDtSet = other._OrigTrackingDtSet;
    this.OrigRcFromDate = other.OrigRcFromDate;
    this._OrigRcFromDateSet = other._OrigRcFromDateSet;
    this.BillRefNo = other.BillRefNo;
    this._BillRefNoSet = other._BillRefNoSet;
    this.BillRefResets = other.BillRefResets;
    this._BillRefResetsSet = other._BillRefResetsSet;
    this.TaxClass = other.TaxClass;
    this._TaxClassSet = other._TaxClassSet;
    this.TaxPkgInstId = other.TaxPkgInstId;
    this._TaxPkgInstIdSet = other._TaxPkgInstIdSet;
    this.Geocode = other.Geocode;
    this._GeocodeSet = other._GeocodeSet;
    this.AuxTaxInfo = other.AuxTaxInfo;
    this._AuxTaxInfoSet = other._AuxTaxInfoSet;
    this.CombTaxRate = other.CombTaxRate;
    this._CombTaxRateSet = other._CombTaxRateSet;
    this.FederalTax = other.FederalTax;
    this._FederalTaxSet = other._FederalTaxSet;
    this.StateTax = other.StateTax;
    this._StateTaxSet = other._StateTaxSet;
    this.CountyTax = other.CountyTax;
    this._CountyTaxSet = other._CountyTaxSet;
    this.CityTax = other.CityTax;
    this._CityTaxSet = other._CityTaxSet;
    this.OtherTax = other.OtherTax;
    this._OtherTaxSet = other._OtherTaxSet;
    this.TaxJournalStatus = other.TaxJournalStatus;
    this._TaxJournalStatusSet = other._TaxJournalStatusSet;
    this.DiscountAmt = other.DiscountAmt;
    this._DiscountAmtSet = other._DiscountAmtSet;
    this.ProfileId = other.ProfileId;
    this._ProfileIdSet = other._ProfileIdSet;
    this.AdjReasonCode = other.AdjReasonCode;
    this._AdjReasonCodeSet = other._AdjReasonCodeSet;
    this.FraudIndicator = other.FraudIndicator;
    this._FraudIndicatorSet = other._FraudIndicatorSet;
    this.RevRcvCostCtr = other.RevRcvCostCtr;
    this._RevRcvCostCtrSet = other._RevRcvCostCtrSet;
    this.ChgWho = other.ChgWho;
    this._ChgWhoSet = other._ChgWhoSet;
    this.ChgDate = other.ChgDate;
    this._ChgDateSet = other._ChgDateSet;
    this.BalanceChgDate = other.BalanceChgDate;
    this._BalanceChgDateSet = other._BalanceChgDateSet;
    this.BRevRcvCostCtr = other.BRevRcvCostCtr;
    this._BRevRcvCostCtrSet = other._BRevRcvCostCtrSet;
    this.OrigSplitRowNum = other.OrigSplitRowNum;
    this._OrigSplitRowNumSet = other._OrigSplitRowNumSet;
    this.TaxTypeCode = other.TaxTypeCode;
    this._TaxTypeCodeSet = other._TaxTypeCodeSet;
    this.OrigSubmitterName = other.OrigSubmitterName;
    this._OrigSubmitterNameSet = other._OrigSubmitterNameSet;
    this.LastReviewedName = other.LastReviewedName;
    this._LastReviewedNameSet = other._LastReviewedNameSet;
    this.Jurisdiction = other.Jurisdiction;
    this._JurisdictionSet = other._JurisdictionSet;
    this.OpenItemId = other.OpenItemId;
    this._OpenItemIdSet = other._OpenItemIdSet;
    this.BillOrderNumber = other.BillOrderNumber;
    this._BillOrderNumberSet = other._BillOrderNumberSet;
    this.RequestId = other.RequestId;
    this._RequestIdSet = other._RequestIdSet;
  }

  /** get the Key for this object
   * @return AdjustmentObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public AdjustmentObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (AdjustmentObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: TrackingId (ADJ.tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTrackingId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingId", "setTrackingId");
    }
    if (this.Key == null) this.Key = new AdjustmentObjectKeyData ();
    this.Key.TrackingId = value;
    this.Key._TrackingIdSet = true;
  }
  /** get the value of the field: TrackingId (ADJ.tracking_id)
   * @return Integer the value
   */
  public Integer getTrackingId () {
    if (this.Key == null) return null;
    return this.Key.TrackingId;
  }
  /** Change the field to not being actively set: TrackingId (ADJ.tracking_id)
   */
  public void unsetTrackingId () {
    if (this.Key == null) return;
    this.Key._TrackingIdSet = false;
  }
  /** See if the field is actively set: TrackingId (ADJ.tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetTrackingId () {
    if (this.Key == null) return false;
    return this.Key._TrackingIdSet;
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

  /** set the fields value: TrackingIdServ (ADJ.tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTrackingIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingIdServ", "setTrackingIdServ");
    }
    if (this.Key == null) this.Key = new AdjustmentObjectKeyData ();
    this.Key.TrackingIdServ = value;
    this.Key._TrackingIdServSet = true;
  }
  /** get the value of the field: TrackingIdServ (ADJ.tracking_id_serv)
   * @return Integer the value
   */
  public Integer getTrackingIdServ () {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServ;
  }
  /** Change the field to not being actively set: TrackingIdServ (ADJ.tracking_id_serv)
   */
  public void unsetTrackingIdServ () {
    if (this.Key == null) return;
    this.Key._TrackingIdServSet = false;
  }
  /** See if the field is actively set: TrackingIdServ (ADJ.tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetTrackingIdServ () {
    if (this.Key == null) return false;
    return this.Key._TrackingIdServSet;
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

  /** set the fields value: CcardAccount (PAYMENT_PROFILE.card_account)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CcardAccount") 
  public void setCcardAccount (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 22))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CcardAccount", "setCcardAccount");
    }
    this.CcardAccount = value;
    this._CcardAccountSet = true;
  }

  /** Retrieves the CcardAccount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CcardAccount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CcardAccount field
   */
   public String getCcardAccountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCcardAccountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCcardAccountAsFormattedString");
       return fmtMgr.formatString(this.getCcardAccount());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CcardAccount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCcardAccountAsFormattedString");
       throw x;
     }
   }
  /** Sets the CcardAccount field from a formatted string
   *
   * @param _value the CcardAccount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CcardAccount field
   */
   public void setCcardAccountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCcardAccountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCcardAccount(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CcardAccount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCcardAccountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCcardAccountFromFormattedString");
   }

  /** get the value of the field: CcardAccount (PAYMENT_PROFILE.card_account)
   * @return String the value
   */
  public String getCcardAccount () {
    return this.CcardAccount;
  }
  /** Change the field to not being actively set: CcardAccount (PAYMENT_PROFILE.card_account)
   */
  public void unsetCcardAccount () {
    this._CcardAccountSet = false;
  }
  /** See if the field is actively set: CcardAccount (PAYMENT_PROFILE.card_account)
   * @return boolean whether the field is actively set
   */
  public boolean issetCcardAccount () {
    return this._CcardAccountSet;
  }
  /** set the fields value: OwnrLname (PAYMENT_PROFILE.ownr_lname)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OwnrLname") 
  public void setOwnrLname (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 56))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "OwnrLname", "setOwnrLname");
    }
    this.OwnrLname = value;
    this._OwnrLnameSet = true;
  }

  /** Retrieves the OwnrLname field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OwnrLname field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OwnrLname field
   */
   public String getOwnrLnameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOwnrLnameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOwnrLnameAsFormattedString");
       return fmtMgr.formatString(this.getOwnrLname());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OwnrLname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOwnrLnameAsFormattedString");
       throw x;
     }
   }
  /** Sets the OwnrLname field from a formatted string
   *
   * @param _value the OwnrLname field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OwnrLname field
   */
   public void setOwnrLnameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOwnrLnameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOwnrLname(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OwnrLname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOwnrLnameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOwnrLnameFromFormattedString");
   }

  /** get the value of the field: OwnrLname (PAYMENT_PROFILE.ownr_lname)
   * @return String the value
   */
  public String getOwnrLname () {
    return this.OwnrLname;
  }
  /** Change the field to not being actively set: OwnrLname (PAYMENT_PROFILE.ownr_lname)
   */
  public void unsetOwnrLname () {
    this._OwnrLnameSet = false;
  }
  /** See if the field is actively set: OwnrLname (PAYMENT_PROFILE.ownr_lname)
   * @return boolean whether the field is actively set
   */
  public boolean issetOwnrLname () {
    return this._OwnrLnameSet;
  }
  /** set the fields value: OwnrFname (PAYMENT_PROFILE.ownr_fname)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OwnrFname") 
  public void setOwnrFname (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 28))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "OwnrFname", "setOwnrFname");
    }
    this.OwnrFname = value;
    this._OwnrFnameSet = true;
  }

  /** Retrieves the OwnrFname field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OwnrFname field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OwnrFname field
   */
   public String getOwnrFnameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOwnrFnameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOwnrFnameAsFormattedString");
       return fmtMgr.formatString(this.getOwnrFname());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OwnrFname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOwnrFnameAsFormattedString");
       throw x;
     }
   }
  /** Sets the OwnrFname field from a formatted string
   *
   * @param _value the OwnrFname field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OwnrFname field
   */
   public void setOwnrFnameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOwnrFnameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOwnrFname(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OwnrFname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOwnrFnameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOwnrFnameFromFormattedString");
   }

  /** get the value of the field: OwnrFname (PAYMENT_PROFILE.ownr_fname)
   * @return String the value
   */
  public String getOwnrFname () {
    return this.OwnrFname;
  }
  /** Change the field to not being actively set: OwnrFname (PAYMENT_PROFILE.ownr_fname)
   */
  public void unsetOwnrFname () {
    this._OwnrFnameSet = false;
  }
  /** See if the field is actively set: OwnrFname (PAYMENT_PROFILE.ownr_fname)
   * @return boolean whether the field is actively set
   */
  public boolean issetOwnrFname () {
    return this._OwnrFnameSet;
  }
  /** set the fields value: CcardCarrier (PAYMENT_PROFILE.card_carrier)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CcardCarrier") 
  public void setCcardCarrier (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 4))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CcardCarrier", "setCcardCarrier");
    }
    this.CcardCarrier = value;
    this._CcardCarrierSet = true;
  }

  /** Retrieves the CcardCarrier field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CcardCarrier field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CcardCarrier field
   */
   public String getCcardCarrierAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCcardCarrierAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCcardCarrierAsFormattedString");
       return fmtMgr.formatString(this.getCcardCarrier());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CcardCarrier");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCcardCarrierAsFormattedString");
       throw x;
     }
   }
  /** Sets the CcardCarrier field from a formatted string
   *
   * @param _value the CcardCarrier field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CcardCarrier field
   */
   public void setCcardCarrierFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCcardCarrierFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCcardCarrier(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CcardCarrier");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCcardCarrierFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCcardCarrierFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated CcardCarrier field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the CcardCarrier field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CcardCarrier field
   */

  public String getCcardCarrierDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCcardCarrierDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getCcardCarrierEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCcardCarrierDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getCcardCarrier()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CcardCarrier");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCcardCarrierDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated CcardCarrier field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the CcardCarrier field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CcardCarrier field
   */
  public Enumeration getCcardCarrierEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCcardCarrierEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("CardTypeCode", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCcardCarrierEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CcardCarrier");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCcardCarrierEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated CcardCarrier field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setCcardCarrierFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCcardCarrierFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getCcardCarrierEnumeration(_locale);
      this.setCcardCarrier((String)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), String.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CcardCarrier");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCcardCarrierFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCcardCarrierFromDisplayValue");
  }

  /** get the value of the field: CcardCarrier (PAYMENT_PROFILE.card_carrier)
   * @return String the value
   */
  public String getCcardCarrier () {
    return this.CcardCarrier;
  }
  /** Change the field to not being actively set: CcardCarrier (PAYMENT_PROFILE.card_carrier)
   */
  public void unsetCcardCarrier () {
    this._CcardCarrierSet = false;
  }
  /** See if the field is actively set: CcardCarrier (PAYMENT_PROFILE.card_carrier)
   * @return boolean whether the field is actively set
   */
  public boolean issetCcardCarrier () {
    return this._CcardCarrierSet;
  }
  /** set the fields value: CcardExpire (PAYMENT_PROFILE.card_expire)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CcardExpire") 
  public void setCcardExpire (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 4))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CcardExpire", "setCcardExpire");
    }
    this.CcardExpire = value;
    this._CcardExpireSet = true;
  }

  /** Retrieves the CcardExpire field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CcardExpire field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CcardExpire field
   */
   public String getCcardExpireAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCcardExpireAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCcardExpireAsFormattedString");
       return fmtMgr.formatString(this.getCcardExpire());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CcardExpire");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCcardExpireAsFormattedString");
       throw x;
     }
   }
  /** Sets the CcardExpire field from a formatted string
   *
   * @param _value the CcardExpire field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CcardExpire field
   */
   public void setCcardExpireFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCcardExpireFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCcardExpire(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CcardExpire");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCcardExpireFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCcardExpireFromFormattedString");
   }

  /** get the value of the field: CcardExpire (PAYMENT_PROFILE.card_expire)
   * @return String the value
   */
  public String getCcardExpire () {
    return this.CcardExpire;
  }
  /** Change the field to not being actively set: CcardExpire (PAYMENT_PROFILE.card_expire)
   */
  public void unsetCcardExpire () {
    this._CcardExpireSet = false;
  }
  /** See if the field is actively set: CcardExpire (PAYMENT_PROFILE.card_expire)
   * @return boolean whether the field is actively set
   */
  public boolean issetCcardExpire () {
    return this._CcardExpireSet;
  }
  /** set the fields value: AvsAddressId (PAYMENT_PROFILE.avs_address_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AvsAddressId") 
  public void setAvsAddressId (Integer value) throws ServiceException
  {
    this.AvsAddressId = value;
    this._AvsAddressIdSet = true;
  }

  /** Retrieves the AvsAddressId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AvsAddressId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AvsAddressId field
   */
   public String getAvsAddressIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAvsAddressIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAvsAddressIdAsFormattedString");
       return fmtMgr.formatNumber(this.getAvsAddressId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AvsAddressId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAvsAddressIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the AvsAddressId field from a formatted string
   *
   * @param _value the AvsAddressId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AvsAddressId field
   */
   public void setAvsAddressIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAvsAddressIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAvsAddressId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AvsAddressId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAvsAddressIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAvsAddressIdFromFormattedString");
   }

  /** get the value of the field: AvsAddressId (PAYMENT_PROFILE.avs_address_id)
   * @return Integer the value
   */
  public Integer getAvsAddressId () {
    return this.AvsAddressId;
  }
  /** Change the field to not being actively set: AvsAddressId (PAYMENT_PROFILE.avs_address_id)
   */
  public void unsetAvsAddressId () {
    this._AvsAddressIdSet = false;
  }
  /** See if the field is actively set: AvsAddressId (PAYMENT_PROFILE.avs_address_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetAvsAddressId () {
    return this._AvsAddressIdSet;
  }
  /** set the fields value: ClearingHouseId (PAYMENT_PROFILE.clearing_house_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ClearingHouseId") 
  public void setClearingHouseId (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 3))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ClearingHouseId", "setClearingHouseId");
    }
    this.ClearingHouseId = value;
    this._ClearingHouseIdSet = true;
  }

  /** Retrieves the ClearingHouseId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ClearingHouseId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ClearingHouseId field
   */
   public String getClearingHouseIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getClearingHouseIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getClearingHouseIdAsFormattedString");
       return fmtMgr.formatString(this.getClearingHouseId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ClearingHouseId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getClearingHouseIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ClearingHouseId field from a formatted string
   *
   * @param _value the ClearingHouseId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ClearingHouseId field
   */
   public void setClearingHouseIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getClearingHouseIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setClearingHouseId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ClearingHouseId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setClearingHouseIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setClearingHouseIdFromFormattedString");
   }

  /** get the value of the field: ClearingHouseId (PAYMENT_PROFILE.clearing_house_id)
   * @return String the value
   */
  public String getClearingHouseId () {
    return this.ClearingHouseId;
  }
  /** Change the field to not being actively set: ClearingHouseId (PAYMENT_PROFILE.clearing_house_id)
   */
  public void unsetClearingHouseId () {
    this._ClearingHouseIdSet = false;
  }
  /** See if the field is actively set: ClearingHouseId (PAYMENT_PROFILE.clearing_house_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetClearingHouseId () {
    return this._ClearingHouseIdSet;
  }
  /** set the fields value: AvsResponseCode (PAYMENT_PROFILE.avs_response_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AvsResponseCode") 
  public void setAvsResponseCode (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 4))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AvsResponseCode", "setAvsResponseCode");
    }
    this.AvsResponseCode = value;
    this._AvsResponseCodeSet = true;
  }

  /** Retrieves the AvsResponseCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AvsResponseCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AvsResponseCode field
   */
   public String getAvsResponseCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAvsResponseCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAvsResponseCodeAsFormattedString");
       return fmtMgr.formatString(this.getAvsResponseCode());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AvsResponseCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAvsResponseCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the AvsResponseCode field from a formatted string
   *
   * @param _value the AvsResponseCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AvsResponseCode field
   */
   public void setAvsResponseCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAvsResponseCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAvsResponseCode(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AvsResponseCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAvsResponseCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAvsResponseCodeFromFormattedString");
   }

  /** get the value of the field: AvsResponseCode (PAYMENT_PROFILE.avs_response_code)
   * @return String the value
   */
  public String getAvsResponseCode () {
    return this.AvsResponseCode;
  }
  /** Change the field to not being actively set: AvsResponseCode (PAYMENT_PROFILE.avs_response_code)
   */
  public void unsetAvsResponseCode () {
    this._AvsResponseCodeSet = false;
  }
  /** See if the field is actively set: AvsResponseCode (PAYMENT_PROFILE.avs_response_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetAvsResponseCode () {
    return this._AvsResponseCodeSet;
  }
  /** set the fields value: TransFlag (PAYMENT_PROFILE.trans_flag)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TransFlag") 
  public void setTransFlag (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 1))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "TransFlag", "setTransFlag");
    }
    this.TransFlag = value;
    this._TransFlagSet = true;
  }

  /** Retrieves the TransFlag field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TransFlag field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransFlag field
   */
   public String getTransFlagAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransFlagAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransFlagAsFormattedString");
       return fmtMgr.formatString(this.getTransFlag());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransFlagAsFormattedString");
       throw x;
     }
   }
  /** Sets the TransFlag field from a formatted string
   *
   * @param _value the TransFlag field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TransFlag field
   */
   public void setTransFlagFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransFlagFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTransFlag(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransFlagFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransFlagFromFormattedString");
   }

  /** get the value of the field: TransFlag (PAYMENT_PROFILE.trans_flag)
   * @return String the value
   */
  public String getTransFlag () {
    return this.TransFlag;
  }
  /** Change the field to not being actively set: TransFlag (PAYMENT_PROFILE.trans_flag)
   */
  public void unsetTransFlag () {
    this._TransFlagSet = false;
  }
  /** See if the field is actively set: TransFlag (PAYMENT_PROFILE.trans_flag)
   * @return boolean whether the field is actively set
   */
  public boolean issetTransFlag () {
    return this._TransFlagSet;
  }
  /** set the fields value: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AccountExternalId") 
  public void setAccountExternalId (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountExternalId", "setAccountExternalId");
    }
    if (value != null && !DataHelper.validLength (value, 144))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AccountExternalId", "setAccountExternalId");
    }
    this.AccountExternalId = value;
    this._AccountExternalIdSet = true;
  }

  /** Retrieves the AccountExternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AccountExternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountExternalId field
   */
   public String getAccountExternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountExternalIdAsFormattedString");
       return fmtMgr.formatString(this.getAccountExternalId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountExternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the AccountExternalId field from a formatted string
   *
   * @param _value the AccountExternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AccountExternalId field
   */
   public void setAccountExternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAccountExternalId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountExternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountExternalIdFromFormattedString");
   }

  /** get the value of the field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return String the value
   */
  public String getAccountExternalId () {
    return this.AccountExternalId;
  }
  /** Change the field to not being actively set: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   */
  public void unsetAccountExternalId () {
    this._AccountExternalIdSet = false;
  }
  /** See if the field is actively set: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountExternalId () {
    return this._AccountExternalIdSet;
  }
  /** set the fields value: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AccountExternalIdType") 
  public void setAccountExternalIdType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountExternalIdType", "setAccountExternalIdType");
    }
    this.AccountExternalIdType = value;
    this._AccountExternalIdTypeSet = true;
  }

  /** Retrieves the AccountExternalIdType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AccountExternalIdType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountExternalIdType field
   */
   public String getAccountExternalIdTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountExternalIdTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getAccountExternalIdType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountExternalIdTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the AccountExternalIdType field from a formatted string
   *
   * @param _value the AccountExternalIdType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AccountExternalIdType field
   */
   public void setAccountExternalIdTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAccountExternalIdType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountExternalIdTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountExternalIdTypeFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated AccountExternalIdType field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the AccountExternalIdType field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AccountExternalIdType field
   */

  public String getAccountExternalIdTypeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdTypeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getAccountExternalIdTypeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountExternalIdTypeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getAccountExternalIdType()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountExternalIdTypeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated AccountExternalIdType field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the AccountExternalIdType field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AccountExternalIdType field
   */
  public Enumeration getAccountExternalIdTypeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdTypeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("ExternalIdType", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountExternalIdTypeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountExternalIdTypeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated AccountExternalIdType field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setAccountExternalIdTypeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountExternalIdTypeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getAccountExternalIdTypeEnumeration(_locale);
      this.setAccountExternalIdType((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountExternalIdTypeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountExternalIdTypeFromDisplayValue");
  }

  /** get the value of the field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return Integer the value
   */
  public Integer getAccountExternalIdType () {
    return this.AccountExternalIdType;
  }
  /** Change the field to not being actively set: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   */
  public void unsetAccountExternalIdType () {
    this._AccountExternalIdTypeSet = false;
  }
  /** See if the field is actively set: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountExternalIdType () {
    return this._AccountExternalIdTypeSet;
  }
  /** set the fields value: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServiceExternalId") 
  public void setServiceExternalId (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ServiceExternalId", "setServiceExternalId");
    }
    if (value != null && !DataHelper.validLength (value, 144))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ServiceExternalId", "setServiceExternalId");
    }
    this.ServiceExternalId = value;
    this._ServiceExternalIdSet = true;
  }

  /** Retrieves the ServiceExternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServiceExternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceExternalId field
   */
   public String getServiceExternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceExternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceExternalIdAsFormattedString");
       return fmtMgr.formatString(this.getServiceExternalId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceExternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServiceExternalId field from a formatted string
   *
   * @param _value the ServiceExternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServiceExternalId field
   */
   public void setServiceExternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceExternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServiceExternalId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceExternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceExternalIdFromFormattedString");
   }

  /** get the value of the field: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id)
   * @return String the value
   */
  public String getServiceExternalId () {
    return this.ServiceExternalId;
  }
  /** Change the field to not being actively set: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id)
   */
  public void unsetServiceExternalId () {
    this._ServiceExternalIdSet = false;
  }
  /** See if the field is actively set: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceExternalId () {
    return this._ServiceExternalIdSet;
  }
  /** set the fields value: ServiceExternalIdType (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServiceExternalIdType") 
  public void setServiceExternalIdType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ServiceExternalIdType", "setServiceExternalIdType");
    }
    this.ServiceExternalIdType = value;
    this._ServiceExternalIdTypeSet = true;
  }

  /** Retrieves the ServiceExternalIdType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServiceExternalIdType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceExternalIdType field
   */
   public String getServiceExternalIdTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceExternalIdTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceExternalIdTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getServiceExternalIdType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceExternalIdTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServiceExternalIdType field from a formatted string
   *
   * @param _value the ServiceExternalIdType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServiceExternalIdType field
   */
   public void setServiceExternalIdTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceExternalIdTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServiceExternalIdType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceExternalIdTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceExternalIdTypeFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated ServiceExternalIdType field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the ServiceExternalIdType field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ServiceExternalIdType field
   */

  public String getServiceExternalIdTypeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceExternalIdTypeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getServiceExternalIdTypeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceExternalIdTypeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getServiceExternalIdType()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceExternalIdTypeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated ServiceExternalIdType field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the ServiceExternalIdType field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ServiceExternalIdType field
   */
  public Enumeration getServiceExternalIdTypeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceExternalIdTypeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("ExternalIdType", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceExternalIdTypeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceExternalIdTypeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated ServiceExternalIdType field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setServiceExternalIdTypeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceExternalIdTypeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getServiceExternalIdTypeEnumeration(_locale);
      this.setServiceExternalIdType((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceExternalIdTypeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceExternalIdTypeFromDisplayValue");
  }

  /** get the value of the field: ServiceExternalIdType (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id_type)
   * @return Integer the value
   */
  public Integer getServiceExternalIdType () {
    return this.ServiceExternalIdType;
  }
  /** Change the field to not being actively set: ServiceExternalIdType (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id_type)
   */
  public void unsetServiceExternalIdType () {
    this._ServiceExternalIdTypeSet = false;
  }
  /** See if the field is actively set: ServiceExternalIdType (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceExternalIdType () {
    return this._ServiceExternalIdTypeSet;
  }
  /** set the fields value: PrepayBalanceDesc (ACCOUNT_BALANCES.balance_desc)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PrepayBalanceDesc") 
  public void setPrepayBalanceDesc (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 85))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "PrepayBalanceDesc", "setPrepayBalanceDesc");
    }
    this.PrepayBalanceDesc = value;
    this._PrepayBalanceDescSet = true;
  }

  /** Retrieves the PrepayBalanceDesc field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrepayBalanceDesc field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrepayBalanceDesc field
   */
   public String getPrepayBalanceDescAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepayBalanceDescAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepayBalanceDescAsFormattedString");
       return fmtMgr.formatString(this.getPrepayBalanceDesc());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrepayBalanceDesc");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrepayBalanceDescAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrepayBalanceDesc field from a formatted string
   *
   * @param _value the PrepayBalanceDesc field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrepayBalanceDesc field
   */
   public void setPrepayBalanceDescFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepayBalanceDescFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrepayBalanceDesc(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrepayBalanceDesc");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrepayBalanceDescFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrepayBalanceDescFromFormattedString");
   }

  /** get the value of the field: PrepayBalanceDesc (ACCOUNT_BALANCES.balance_desc)
   * @return String the value
   */
  public String getPrepayBalanceDesc () {
    return this.PrepayBalanceDesc;
  }
  /** Change the field to not being actively set: PrepayBalanceDesc (ACCOUNT_BALANCES.balance_desc)
   */
  public void unsetPrepayBalanceDesc () {
    this._PrepayBalanceDescSet = false;
  }
  /** See if the field is actively set: PrepayBalanceDesc (ACCOUNT_BALANCES.balance_desc)
   * @return boolean whether the field is actively set
   */
  public boolean issetPrepayBalanceDesc () {
    return this._PrepayBalanceDescSet;
  }
  /** set the fields value: TransSign (ADJ_TRANS_DESCR.trans_sign)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TransSign") 
  public void setTransSign (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TransSign", "setTransSign");
    }
    this.TransSign = value;
    this._TransSignSet = true;
  }

  /** Retrieves the TransSign field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TransSign field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransSign field
   */
   public String getTransSignAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransSignAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransSignAsFormattedString");
       return fmtMgr.formatNumber(this.getTransSign(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransSign");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransSignAsFormattedString");
       throw x;
     }
   }
  /** Sets the TransSign field from a formatted string
   *
   * @param _value the TransSign field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TransSign field
   */
   public void setTransSignFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransSignFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTransSign(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransSign");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransSignFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransSignFromFormattedString");
   }

  /** get the value of the field: TransSign (ADJ_TRANS_DESCR.trans_sign)
   * @return Integer the value
   */
  public Integer getTransSign () {
    return this.TransSign;
  }
  /** Change the field to not being actively set: TransSign (ADJ_TRANS_DESCR.trans_sign)
   */
  public void unsetTransSign () {
    this._TransSignSet = false;
  }
  /** See if the field is actively set: TransSign (ADJ_TRANS_DESCR.trans_sign)
   * @return boolean whether the field is actively set
   */
  public boolean issetTransSign () {
    return this._TransSignSet;
  }
  /** set the fields value: BillingCategory (ADJ_TRANS_DESCR.billing_category)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillingCategory") 
  public void setBillingCategory (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillingCategory", "setBillingCategory");
    }
    this.BillingCategory = value;
    this._BillingCategorySet = true;
  }

  /** Retrieves the BillingCategory field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillingCategory field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillingCategory field
   */
   public String getBillingCategoryAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillingCategoryAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillingCategoryAsFormattedString");
       return fmtMgr.formatNumber(this.getBillingCategory(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillingCategory");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillingCategoryAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillingCategory field from a formatted string
   *
   * @param _value the BillingCategory field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillingCategory field
   */
   public void setBillingCategoryFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillingCategoryFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillingCategory(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillingCategory");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillingCategoryFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillingCategoryFromFormattedString");
   }

  /** get the value of the field: BillingCategory (ADJ_TRANS_DESCR.billing_category)
   * @return Integer the value
   */
  public Integer getBillingCategory () {
    return this.BillingCategory;
  }
  /** Change the field to not being actively set: BillingCategory (ADJ_TRANS_DESCR.billing_category)
   */
  public void unsetBillingCategory () {
    this._BillingCategorySet = false;
  }
  /** See if the field is actively set: BillingCategory (ADJ_TRANS_DESCR.billing_category)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillingCategory () {
    return this._BillingCategorySet;
  }
  /** set the fields value: TransTargetType (ADJ_TRANS_DESCR.trans_target_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TransTargetType") 
  public void setTransTargetType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TransTargetType", "setTransTargetType");
    }
    this.TransTargetType = value;
    this._TransTargetTypeSet = true;
  }

  /** Retrieves the TransTargetType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TransTargetType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransTargetType field
   */
   public String getTransTargetTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransTargetTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransTargetTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getTransTargetType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransTargetType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransTargetTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the TransTargetType field from a formatted string
   *
   * @param _value the TransTargetType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TransTargetType field
   */
   public void setTransTargetTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransTargetTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTransTargetType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransTargetType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransTargetTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransTargetTypeFromFormattedString");
   }

  /** get the value of the field: TransTargetType (ADJ_TRANS_DESCR.trans_target_type)
   * @return Integer the value
   */
  public Integer getTransTargetType () {
    return this.TransTargetType;
  }
  /** Change the field to not being actively set: TransTargetType (ADJ_TRANS_DESCR.trans_target_type)
   */
  public void unsetTransTargetType () {
    this._TransTargetTypeSet = false;
  }
  /** See if the field is actively set: TransTargetType (ADJ_TRANS_DESCR.trans_target_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetTransTargetType () {
    return this._TransTargetTypeSet;
  }
  /** set the fields value: IsNegativeBillAdj (ADJ_TRANS_DESCR.is_negative_bill_adj)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsNegativeBillAdj") 
  public void setIsNegativeBillAdj (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsNegativeBillAdj", "setIsNegativeBillAdj");
    }
    this.IsNegativeBillAdj = value;
    this._IsNegativeBillAdjSet = true;
  }

  /** Retrieves the IsNegativeBillAdj field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsNegativeBillAdj field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsNegativeBillAdj field
   */
   public String getIsNegativeBillAdjAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsNegativeBillAdjAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsNegativeBillAdjAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsNegativeBillAdj());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsNegativeBillAdj");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsNegativeBillAdjAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsNegativeBillAdj field from a formatted string
   *
   * @param _value the IsNegativeBillAdj field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsNegativeBillAdj field
   */
   public void setIsNegativeBillAdjFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsNegativeBillAdjFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsNegativeBillAdj(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsNegativeBillAdj");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsNegativeBillAdjFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsNegativeBillAdjFromFormattedString");
   }

  /** get the value of the field: IsNegativeBillAdj (ADJ_TRANS_DESCR.is_negative_bill_adj)
   * @return Boolean the value
   */
  public Boolean getIsNegativeBillAdj () {
    return this.IsNegativeBillAdj;
  }
  /** Change the field to not being actively set: IsNegativeBillAdj (ADJ_TRANS_DESCR.is_negative_bill_adj)
   */
  public void unsetIsNegativeBillAdj () {
    this._IsNegativeBillAdjSet = false;
  }
  /** See if the field is actively set: IsNegativeBillAdj (ADJ_TRANS_DESCR.is_negative_bill_adj)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsNegativeBillAdj () {
    return this._IsNegativeBillAdjSet;
  }
  /** set the fields value: ServerId
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setServerId (Integer value) throws ServiceException
  {
    this.ServerId = value;
    this._ServerIdSet = true;
  }
  /** get the value of the field: ServerId
   * @return Integer the value
   */
  public Integer getServerId ()
  {
    return this.ServerId;
  }
  /** Change the field to not being actively set: ServerId
   */
  public void unsetServerId ()
  {
    this._ServerIdSet = false;
  }
  /** See if the field is actively set: ServerId
   * @return boolean whether the field is actively set
   */
  public boolean issetServerId ()
  {
    return this._ServerIdSet;
  }

  /** Retrieves the ServerId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServerId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServerId field
   */
   public String getServerIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServerIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServerIdAsFormattedString");
       return fmtMgr.formatNumber(this.getServerId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServerId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServerIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServerId field from a formatted string
   *
   * @param _value the ServerId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServerId field
   */
   public void setServerIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServerIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServerId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServerId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServerIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServerIdFromFormattedString");
   }

  /** set the fields value: AccountInternalId (ADJ.account_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AccountInternalId") 
  public void setAccountInternalId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountInternalId", "setAccountInternalId");
    }
    this.AccountInternalId = value;
    this._AccountInternalIdSet = true;
  }

  /** Retrieves the AccountInternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AccountInternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountInternalId field
   */
   public String getAccountInternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountInternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountInternalIdAsFormattedString");
       return fmtMgr.formatNumber(this.getAccountInternalId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountInternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the AccountInternalId field from a formatted string
   *
   * @param _value the AccountInternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AccountInternalId field
   */
   public void setAccountInternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountInternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAccountInternalId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountInternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountInternalIdFromFormattedString");
   }

  /** get the value of the field: AccountInternalId (ADJ.account_no)
   * @return Integer the value
   */
  public Integer getAccountInternalId () {
    return this.AccountInternalId;
  }
  /** Change the field to not being actively set: AccountInternalId (ADJ.account_no)
   */
  public void unsetAccountInternalId () {
    this._AccountInternalIdSet = false;
  }
  /** See if the field is actively set: AccountInternalId (ADJ.account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountInternalId () {
    return this._AccountInternalIdSet;
  }
  /** set the fields value: ServiceInternalId (ADJ.subscr_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServiceInternalId") 
  public void setServiceInternalId (Integer value) throws ServiceException
  {
    this.ServiceInternalId = value;
    this._ServiceInternalIdSet = true;
  }

  /** Retrieves the ServiceInternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServiceInternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceInternalId field
   */
   public String getServiceInternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceInternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceInternalIdAsFormattedString");
       return fmtMgr.formatNumber(this.getServiceInternalId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceInternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServiceInternalId field from a formatted string
   *
   * @param _value the ServiceInternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServiceInternalId field
   */
   public void setServiceInternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceInternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServiceInternalId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceInternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceInternalIdFromFormattedString");
   }

  /** get the value of the field: ServiceInternalId (ADJ.subscr_no)
   * @return Integer the value
   */
  public Integer getServiceInternalId () {
    return this.ServiceInternalId;
  }
  /** Change the field to not being actively set: ServiceInternalId (ADJ.subscr_no)
   */
  public void unsetServiceInternalId () {
    this._ServiceInternalIdSet = false;
  }
  /** See if the field is actively set: ServiceInternalId (ADJ.subscr_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceInternalId () {
    return this._ServiceInternalIdSet;
  }
  /** set the fields value: ServiceInternalIdResets (ADJ.subscr_no_resets)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServiceInternalIdResets") 
  public void setServiceInternalIdResets (Integer value) throws ServiceException
  {
    this.ServiceInternalIdResets = value;
    this._ServiceInternalIdResetsSet = true;
  }

  /** Retrieves the ServiceInternalIdResets field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServiceInternalIdResets field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceInternalIdResets field
   */
   public String getServiceInternalIdResetsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceInternalIdResetsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceInternalIdResetsAsFormattedString");
       return fmtMgr.formatNumber(this.getServiceInternalIdResets(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceInternalIdResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceInternalIdResetsAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServiceInternalIdResets field from a formatted string
   *
   * @param _value the ServiceInternalIdResets field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServiceInternalIdResets field
   */
   public void setServiceInternalIdResetsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceInternalIdResetsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServiceInternalIdResets(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceInternalIdResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceInternalIdResetsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceInternalIdResetsFromFormattedString");
   }

  /** get the value of the field: ServiceInternalIdResets (ADJ.subscr_no_resets)
   * @return Integer the value
   */
  public Integer getServiceInternalIdResets () {
    return this.ServiceInternalIdResets;
  }
  /** Change the field to not being actively set: ServiceInternalIdResets (ADJ.subscr_no_resets)
   */
  public void unsetServiceInternalIdResets () {
    this._ServiceInternalIdResetsSet = false;
  }
  /** See if the field is actively set: ServiceInternalIdResets (ADJ.subscr_no_resets)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceInternalIdResets () {
    return this._ServiceInternalIdResetsSet;
  }
  /** set the fields value: TransCode (ADJ.adj_trans_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TransCode") 
  public void setTransCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TransCode", "setTransCode");
    }
    this.TransCode = value;
    this._TransCodeSet = true;
  }

  /** Retrieves the TransCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TransCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransCode field
   */
   public String getTransCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getTransCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the TransCode field from a formatted string
   *
   * @param _value the TransCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TransCode field
   */
   public void setTransCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTransCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransCodeFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated TransCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the TransCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the TransCode field
   */

  public String getTransCodeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransCodeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getTransCodeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransCodeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getTransCode()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransCodeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated TransCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the TransCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the TransCode field
   */
  public Enumeration getTransCodeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransCodeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("AdjustmentType", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransCodeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransCodeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated TransCode field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setTransCodeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransCodeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getTransCodeEnumeration(_locale);
      this.setTransCode((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransCodeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransCodeFromDisplayValue");
  }

  /** get the value of the field: TransCode (ADJ.adj_trans_code)
   * @return Integer the value
   */
  public Integer getTransCode () {
    return this.TransCode;
  }
  /** Change the field to not being actively set: TransCode (ADJ.adj_trans_code)
   */
  public void unsetTransCode () {
    this._TransCodeSet = false;
  }
  /** See if the field is actively set: TransCode (ADJ.adj_trans_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetTransCode () {
    return this._TransCodeSet;
  }
  /** set the fields value: OrigTransCode (ADJ.orig_trans_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OrigTransCode") 
  public void setOrigTransCode (Integer value) throws ServiceException
  {
    this.OrigTransCode = value;
    this._OrigTransCodeSet = true;
  }

  /** Retrieves the OrigTransCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OrigTransCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigTransCode field
   */
   public String getOrigTransCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigTransCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigTransCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getOrigTransCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigTransCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigTransCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the OrigTransCode field from a formatted string
   *
   * @param _value the OrigTransCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OrigTransCode field
   */
   public void setOrigTransCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigTransCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOrigTransCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigTransCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigTransCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigTransCodeFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated OrigTransCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the OrigTransCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the OrigTransCode field
   */

  public String getOrigTransCodeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigTransCodeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getOrigTransCodeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigTransCodeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getOrigTransCode()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigTransCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigTransCodeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated OrigTransCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the OrigTransCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the OrigTransCode field
   */
  public Enumeration getOrigTransCodeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigTransCodeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("AdjustmentType", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigTransCodeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigTransCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigTransCodeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated OrigTransCode field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setOrigTransCodeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOrigTransCodeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getOrigTransCodeEnumeration(_locale);
      this.setOrigTransCode((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigTransCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigTransCodeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOrigTransCodeFromDisplayValue");
  }

  /** get the value of the field: OrigTransCode (ADJ.orig_trans_code)
   * @return Integer the value
   */
  public Integer getOrigTransCode () {
    return this.OrigTransCode;
  }
  /** Change the field to not being actively set: OrigTransCode (ADJ.orig_trans_code)
   */
  public void unsetOrigTransCode () {
    this._OrigTransCodeSet = false;
  }
  /** See if the field is actively set: OrigTransCode (ADJ.orig_trans_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetOrigTransCode () {
    return this._OrigTransCodeSet;
  }
  /** set the fields value: Annotation (ADJ.annotation)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Annotation") 
  public void setAnnotation (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Annotation", "setAnnotation");
    }
    this.Annotation = value;
    this._AnnotationSet = true;
  }

  /** Retrieves the Annotation field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Annotation field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Annotation field
   */
   public String getAnnotationAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAnnotationAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAnnotationAsFormattedString");
       return fmtMgr.formatString(this.getAnnotation());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Annotation");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAnnotationAsFormattedString");
       throw x;
     }
   }
  /** Sets the Annotation field from a formatted string
   *
   * @param _value the Annotation field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Annotation field
   */
   public void setAnnotationFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAnnotationFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAnnotation(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Annotation");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAnnotationFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAnnotationFromFormattedString");
   }

  /** get the value of the field: Annotation (ADJ.annotation)
   * @return String the value
   */
  public String getAnnotation () {
    return this.Annotation;
  }
  /** Change the field to not being actively set: Annotation (ADJ.annotation)
   */
  public void unsetAnnotation () {
    this._AnnotationSet = false;
  }
  /** See if the field is actively set: Annotation (ADJ.annotation)
   * @return boolean whether the field is actively set
   */
  public boolean issetAnnotation () {
    return this._AnnotationSet;
  }
  /** set the fields value: PrimaryUnitsType (ADJ.primary_units_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PrimaryUnitsType") 
  public void setPrimaryUnitsType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PrimaryUnitsType", "setPrimaryUnitsType");
    }
    this.PrimaryUnitsType = value;
    this._PrimaryUnitsTypeSet = true;
  }

  /** Retrieves the PrimaryUnitsType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrimaryUnitsType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrimaryUnitsType field
   */
   public String getPrimaryUnitsTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrimaryUnitsTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrimaryUnitsTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getPrimaryUnitsType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrimaryUnitsType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrimaryUnitsTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrimaryUnitsType field from a formatted string
   *
   * @param _value the PrimaryUnitsType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrimaryUnitsType field
   */
   public void setPrimaryUnitsTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrimaryUnitsTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrimaryUnitsType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrimaryUnitsType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrimaryUnitsTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrimaryUnitsTypeFromFormattedString");
   }

  /** get the value of the field: PrimaryUnitsType (ADJ.primary_units_type)
   * @return Integer the value
   */
  public Integer getPrimaryUnitsType () {
    return this.PrimaryUnitsType;
  }
  /** Change the field to not being actively set: PrimaryUnitsType (ADJ.primary_units_type)
   */
  public void unsetPrimaryUnitsType () {
    this._PrimaryUnitsTypeSet = false;
  }
  /** See if the field is actively set: PrimaryUnitsType (ADJ.primary_units_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetPrimaryUnitsType () {
    return this._PrimaryUnitsTypeSet;
  }
  /** set the fields value: PrimaryUnits (ADJ.primary_units)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PrimaryUnits") 
  public void setPrimaryUnits (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "PrimaryUnits", "setPrimaryUnits");
    }
    this.PrimaryUnits = value;
    this._PrimaryUnitsSet = true;
  }

  /** Retrieves the PrimaryUnits field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrimaryUnits field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrimaryUnits field
   */
   public String getPrimaryUnitsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrimaryUnitsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrimaryUnitsAsFormattedString");
       return fmtMgr.formatBigInteger(this.getPrimaryUnits(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrimaryUnits");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrimaryUnitsAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrimaryUnits field from a formatted string
   *
   * @param _value the PrimaryUnits field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrimaryUnits field
   */
   public void setPrimaryUnitsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrimaryUnitsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrimaryUnits(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrimaryUnits");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrimaryUnitsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrimaryUnitsFromFormattedString");
   }

  /** get the value of the field: PrimaryUnits (ADJ.primary_units)
   * @return BigInteger the value
   */
  public BigInteger getPrimaryUnits () {
    return this.PrimaryUnits;
  }
  /** Change the field to not being actively set: PrimaryUnits (ADJ.primary_units)
   */
  public void unsetPrimaryUnits () {
    this._PrimaryUnitsSet = false;
  }
  /** See if the field is actively set: PrimaryUnits (ADJ.primary_units)
   * @return boolean whether the field is actively set
   */
  public boolean issetPrimaryUnits () {
    return this._PrimaryUnitsSet;
  }
  /** set the fields value: TransactDate (ADJ.transact_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TransactDate") 
  public void setTransactDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TransactDate", "setTransactDate");
    }
    this.TransactDate = value;
    this._TransactDateSet = true;
  }

  /** Retrieves the TransactDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TransactDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransactDate field
   */
   public String getTransactDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransactDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransactDateAsFormattedString");
       return fmtMgr.formatDate(this.getTransactDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransactDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransactDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the TransactDate field from a formatted string
   *
   * @param _value the TransactDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TransactDate field
   */
   public void setTransactDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransactDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTransactDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransactDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransactDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransactDateFromFormattedString");
   }

  /**
   * Retrieves the TransactDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransactDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransactDate field
   */
  public String getTransactDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransactDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransactDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getTransactDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransactDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransactDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the TransactDate field value from a formatted date/time string
   *
   * @param _value the TransactDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TransactDate field
   */
  public void setTransactDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransactDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setTransactDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransactDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransactDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: TransactDate (ADJ.transact_date)
   * @return Date the value
   */
  public Date getTransactDate () {
    return this.TransactDate;
  }
  /** Change the field to not being actively set: TransactDate (ADJ.transact_date)
   */
  public void unsetTransactDate () {
    this._TransactDateSet = false;
  }
  /** See if the field is actively set: TransactDate (ADJ.transact_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetTransactDate () {
    return this._TransactDateSet;
  }
  /** set the fields value: EffectiveDate (ADJ.effective_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("EffectiveDate") 
  public void setEffectiveDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "EffectiveDate", "setEffectiveDate");
    }
    this.EffectiveDate = value;
    this._EffectiveDateSet = true;
  }

  /** Retrieves the EffectiveDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The EffectiveDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EffectiveDate field
   */
   public String getEffectiveDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEffectiveDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEffectiveDateAsFormattedString");
       return fmtMgr.formatDate(this.getEffectiveDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EffectiveDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getEffectiveDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the EffectiveDate field from a formatted string
   *
   * @param _value the EffectiveDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EffectiveDate field
   */
   public void setEffectiveDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEffectiveDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setEffectiveDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EffectiveDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setEffectiveDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEffectiveDateFromFormattedString");
   }

  /**
   * Retrieves the EffectiveDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EffectiveDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the EffectiveDate field
   */
  public String getEffectiveDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEffectiveDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEffectiveDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getEffectiveDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EffectiveDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEffectiveDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the EffectiveDate field value from a formatted date/time string
   *
   * @param _value the EffectiveDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EffectiveDate field
   */
  public void setEffectiveDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEffectiveDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setEffectiveDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EffectiveDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEffectiveDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: EffectiveDate (ADJ.effective_date)
   * @return Date the value
   */
  public Date getEffectiveDate () {
    return this.EffectiveDate;
  }
  /** Change the field to not being actively set: EffectiveDate (ADJ.effective_date)
   */
  public void unsetEffectiveDate () {
    this._EffectiveDateSet = false;
  }
  /** See if the field is actively set: EffectiveDate (ADJ.effective_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetEffectiveDate () {
    return this._EffectiveDateSet;
  }
  /** set the fields value: InactiveDate (ADJ.end_date)
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

  /** get the value of the field: InactiveDate (ADJ.end_date)
   * @return Date the value
   */
  public Date getInactiveDate () {
    return this.InactiveDate;
  }
  /** Change the field to not being actively set: InactiveDate (ADJ.end_date)
   */
  public void unsetInactiveDate () {
    this._InactiveDateSet = false;
  }
  /** See if the field is actively set: InactiveDate (ADJ.end_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetInactiveDate () {
    return this._InactiveDateSet;
  }
  /** set the fields value: TrackingIdCounter (ADJ.tracking_id_counter)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TrackingIdCounter") 
  public void setTrackingIdCounter (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingIdCounter", "setTrackingIdCounter");
    }
    this.TrackingIdCounter = value;
    this._TrackingIdCounterSet = true;
  }

  /** Retrieves the TrackingIdCounter field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TrackingIdCounter field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TrackingIdCounter field
   */
   public String getTrackingIdCounterAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdCounterAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTrackingIdCounterAsFormattedString");
       return fmtMgr.formatNumber(this.getTrackingIdCounter(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackingIdCounter");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTrackingIdCounterAsFormattedString");
       throw x;
     }
   }
  /** Sets the TrackingIdCounter field from a formatted string
   *
   * @param _value the TrackingIdCounter field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TrackingIdCounter field
   */
   public void setTrackingIdCounterFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdCounterFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTrackingIdCounter(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackingIdCounter");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTrackingIdCounterFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTrackingIdCounterFromFormattedString");
   }

  /** get the value of the field: TrackingIdCounter (ADJ.tracking_id_counter)
   * @return Integer the value
   */
  public Integer getTrackingIdCounter () {
    return this.TrackingIdCounter;
  }
  /** Change the field to not being actively set: TrackingIdCounter (ADJ.tracking_id_counter)
   */
  public void unsetTrackingIdCounter () {
    this._TrackingIdCounterSet = false;
  }
  /** See if the field is actively set: TrackingIdCounter (ADJ.tracking_id_counter)
   * @return boolean whether the field is actively set
   */
  public boolean issetTrackingIdCounter () {
    return this._TrackingIdCounterSet;
  }
  /** set the fields value: RequestStatus (ADJ.request_status)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RequestStatus") 
  public void setRequestStatus (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RequestStatus", "setRequestStatus");
    }
    this.RequestStatus = value;
    this._RequestStatusSet = true;
  }

  /** Retrieves the RequestStatus field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RequestStatus field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RequestStatus field
   */
   public String getRequestStatusAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRequestStatusAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRequestStatusAsFormattedString");
       return fmtMgr.formatNumber(this.getRequestStatus(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RequestStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRequestStatusAsFormattedString");
       throw x;
     }
   }
  /** Sets the RequestStatus field from a formatted string
   *
   * @param _value the RequestStatus field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RequestStatus field
   */
   public void setRequestStatusFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRequestStatusFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRequestStatus(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RequestStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRequestStatusFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRequestStatusFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated RequestStatus field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the RequestStatus field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the RequestStatus field
   */

  public String getRequestStatusDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRequestStatusDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getRequestStatusEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRequestStatusDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getRequestStatus()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RequestStatus");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRequestStatusDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated RequestStatus field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the RequestStatus field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the RequestStatus field
   */
  public Enumeration getRequestStatusEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRequestStatusEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("RequestStatus", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRequestStatusEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RequestStatus");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRequestStatusEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated RequestStatus field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setRequestStatusFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRequestStatusFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getRequestStatusEnumeration(_locale);
      this.setRequestStatus((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RequestStatus");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRequestStatusFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRequestStatusFromDisplayValue");
  }

  /** get the value of the field: RequestStatus (ADJ.request_status)
   * @return Integer the value
   */
  public Integer getRequestStatus () {
    return this.RequestStatus;
  }
  /** Change the field to not being actively set: RequestStatus (ADJ.request_status)
   */
  public void unsetRequestStatus () {
    this._RequestStatusSet = false;
  }
  /** See if the field is actively set: RequestStatus (ADJ.request_status)
   * @return boolean whether the field is actively set
   */
  public boolean issetRequestStatus () {
    return this._RequestStatusSet;
  }
  /** set the fields value: ReviewDate (ADJ.review_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ReviewDate") 
  public void setReviewDate (Date value) throws ServiceException
  {
    this.ReviewDate = value;
    this._ReviewDateSet = true;
  }

  /** Retrieves the ReviewDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ReviewDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ReviewDate field
   */
   public String getReviewDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getReviewDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getReviewDateAsFormattedString");
       return fmtMgr.formatDate(this.getReviewDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ReviewDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getReviewDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the ReviewDate field from a formatted string
   *
   * @param _value the ReviewDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ReviewDate field
   */
   public void setReviewDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getReviewDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setReviewDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ReviewDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setReviewDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setReviewDateFromFormattedString");
   }

  /**
   * Retrieves the ReviewDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ReviewDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ReviewDate field
   */
  public String getReviewDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getReviewDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getReviewDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getReviewDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ReviewDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getReviewDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ReviewDate field value from a formatted date/time string
   *
   * @param _value the ReviewDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ReviewDate field
   */
  public void setReviewDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setReviewDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setReviewDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ReviewDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setReviewDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: ReviewDate (ADJ.review_date)
   * @return Date the value
   */
  public Date getReviewDate () {
    return this.ReviewDate;
  }
  /** Change the field to not being actively set: ReviewDate (ADJ.review_date)
   */
  public void unsetReviewDate () {
    this._ReviewDateSet = false;
  }
  /** See if the field is actively set: ReviewDate (ADJ.review_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetReviewDate () {
    return this._ReviewDateSet;
  }
  /** set the fields value: SupervisorName (ADJ.supervisor_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SupervisorName") 
  public void setSupervisorName (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "SupervisorName", "setSupervisorName");
    }
    this.SupervisorName = value;
    this._SupervisorNameSet = true;
  }

  /** Retrieves the SupervisorName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SupervisorName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SupervisorName field
   */
   public String getSupervisorNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSupervisorNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSupervisorNameAsFormattedString");
       return fmtMgr.formatString(this.getSupervisorName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SupervisorName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSupervisorNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the SupervisorName field from a formatted string
   *
   * @param _value the SupervisorName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SupervisorName field
   */
   public void setSupervisorNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSupervisorNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSupervisorName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SupervisorName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSupervisorNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSupervisorNameFromFormattedString");
   }

  /** get the value of the field: SupervisorName (ADJ.supervisor_name)
   * @return String the value
   */
  public String getSupervisorName () {
    return this.SupervisorName;
  }
  /** Change the field to not being actively set: SupervisorName (ADJ.supervisor_name)
   */
  public void unsetSupervisorName () {
    this._SupervisorNameSet = false;
  }
  /** See if the field is actively set: SupervisorName (ADJ.supervisor_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetSupervisorName () {
    return this._SupervisorNameSet;
  }
  /** set the fields value: CurrentFlag (ADJ.current_flag)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CurrentFlag") 
  public void setCurrentFlag (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CurrentFlag", "setCurrentFlag");
    }
    this.CurrentFlag = value;
    this._CurrentFlagSet = true;
  }

  /** Retrieves the CurrentFlag field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CurrentFlag field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CurrentFlag field
   */
   public String getCurrentFlagAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrentFlagAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCurrentFlagAsFormattedString");
       return fmtMgr.formatBoolean(this.getCurrentFlag());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CurrentFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCurrentFlagAsFormattedString");
       throw x;
     }
   }
  /** Sets the CurrentFlag field from a formatted string
   *
   * @param _value the CurrentFlag field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CurrentFlag field
   */
   public void setCurrentFlagFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrentFlagFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCurrentFlag(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CurrentFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCurrentFlagFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCurrentFlagFromFormattedString");
   }

  /** get the value of the field: CurrentFlag (ADJ.current_flag)
   * @return Boolean the value
   */
  public Boolean getCurrentFlag () {
    return this.CurrentFlag;
  }
  /** Change the field to not being actively set: CurrentFlag (ADJ.current_flag)
   */
  public void unsetCurrentFlag () {
    this._CurrentFlagSet = false;
  }
  /** See if the field is actively set: CurrentFlag (ADJ.current_flag)
   * @return boolean whether the field is actively set
   */
  public boolean issetCurrentFlag () {
    return this._CurrentFlagSet;
  }
  /** set the fields value: PendingFlag (ADJ.pending_flag)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PendingFlag") 
  public void setPendingFlag (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PendingFlag", "setPendingFlag");
    }
    this.PendingFlag = value;
    this._PendingFlagSet = true;
  }

  /** Retrieves the PendingFlag field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PendingFlag field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PendingFlag field
   */
   public String getPendingFlagAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPendingFlagAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPendingFlagAsFormattedString");
       return fmtMgr.formatBoolean(this.getPendingFlag());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PendingFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPendingFlagAsFormattedString");
       throw x;
     }
   }
  /** Sets the PendingFlag field from a formatted string
   *
   * @param _value the PendingFlag field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PendingFlag field
   */
   public void setPendingFlagFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPendingFlagFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPendingFlag(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PendingFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPendingFlagFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPendingFlagFromFormattedString");
   }

  /** get the value of the field: PendingFlag (ADJ.pending_flag)
   * @return Boolean the value
   */
  public Boolean getPendingFlag () {
    return this.PendingFlag;
  }
  /** Change the field to not being actively set: PendingFlag (ADJ.pending_flag)
   */
  public void unsetPendingFlag () {
    this._PendingFlagSet = false;
  }
  /** See if the field is actively set: PendingFlag (ADJ.pending_flag)
   * @return boolean whether the field is actively set
   */
  public boolean issetPendingFlag () {
    return this._PendingFlagSet;
  }
  /** set the fields value: NoBill (ADJ.no_bill)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("NoBill") 
  public void setNoBill (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "NoBill", "setNoBill");
    }
    this.NoBill = value;
    this._NoBillSet = true;
  }

  /** Retrieves the NoBill field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The NoBill field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NoBill field
   */
   public String getNoBillAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoBillAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNoBillAsFormattedString");
       return fmtMgr.formatBoolean(this.getNoBill());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NoBill");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getNoBillAsFormattedString");
       throw x;
     }
   }
  /** Sets the NoBill field from a formatted string
   *
   * @param _value the NoBill field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NoBill field
   */
   public void setNoBillFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoBillFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setNoBill(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NoBill");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setNoBillFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNoBillFromFormattedString");
   }

  /** get the value of the field: NoBill (ADJ.no_bill)
   * @return Boolean the value
   */
  public Boolean getNoBill () {
    return this.NoBill;
  }
  /** Change the field to not being actively set: NoBill (ADJ.no_bill)
   */
  public void unsetNoBill () {
    this._NoBillSet = false;
  }
  /** See if the field is actively set: NoBill (ADJ.no_bill)
   * @return boolean whether the field is actively set
   */
  public boolean issetNoBill () {
    return this._NoBillSet;
  }
  /** set the fields value: CurrencyCode (ADJ.currency_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CurrencyCode") 
  public void setCurrencyCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CurrencyCode", "setCurrencyCode");
    }
    this.CurrencyCode = value;
    this._CurrencyCodeSet = true;
  }

  /** Retrieves the CurrencyCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CurrencyCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CurrencyCode field
   */
   public String getCurrencyCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCurrencyCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getCurrencyCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCurrencyCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the CurrencyCode field from a formatted string
   *
   * @param _value the CurrencyCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CurrencyCode field
   */
   public void setCurrencyCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCurrencyCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCurrencyCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCurrencyCodeFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated CurrencyCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the CurrencyCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CurrencyCode field
   */

  public String getCurrencyCodeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyCodeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getCurrencyCodeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCurrencyCodeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getCurrencyCode()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCurrencyCodeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated CurrencyCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the CurrencyCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CurrencyCode field
   */
  public Enumeration getCurrencyCodeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyCodeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("Currency", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCurrencyCodeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCurrencyCodeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated CurrencyCode field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setCurrencyCodeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCurrencyCodeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getCurrencyCodeEnumeration(_locale);
      this.setCurrencyCode((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCurrencyCodeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCurrencyCodeFromDisplayValue");
  }

  /** get the value of the field: CurrencyCode (ADJ.currency_code)
   * @return Integer the value
   */
  public Integer getCurrencyCode () {
    return this.CurrencyCode;
  }
  /** Change the field to not being actively set: CurrencyCode (ADJ.currency_code)
   */
  public void unsetCurrencyCode () {
    this._CurrencyCodeSet = false;
  }
  /** See if the field is actively set: CurrencyCode (ADJ.currency_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCurrencyCode () {
    return this._CurrencyCodeSet;
  }
  /** set the fields value: TotalAmt (ADJ.total_amt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TotalAmt") 
  public void setTotalAmt (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "TotalAmt", "setTotalAmt");
    }
    this.TotalAmt = value;
    this._TotalAmtSet = true;
  }

  /** Retrieves the TotalAmt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TotalAmt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalAmt field
   */
   public String getTotalAmtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalAmtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalAmtAsFormattedString");
       return fmtMgr.formatBigInteger(this.getTotalAmt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TotalAmt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalAmtAsFormattedString");
       throw x;
     }
   }
  /** Sets the TotalAmt field from a formatted string
   *
   * @param _value the TotalAmt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TotalAmt field
   */
   public void setTotalAmtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalAmtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTotalAmt(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TotalAmt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalAmtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalAmtFromFormattedString");
   }

  /**
   * Retrieves the TotalAmt field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TotalAmt field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalAmt field
   */
  public String getTotalAmtAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalAmtAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalAmtAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getTotalAmt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalAmt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalAmtAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the TotalAmt field value from a formatted currency string
   *
   * @param _value the TotalAmt field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TotalAmt field
   */
  public void setTotalAmtFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTotalAmtFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setTotalAmt(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalAmt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalAmtFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalAmtFromFormattedCurrencyString");
  }

  /** get the value of the field: TotalAmt (ADJ.total_amt)
   * @return BigInteger the value
   */
  public BigInteger getTotalAmt () {
    return this.TotalAmt;
  }
  /** Change the field to not being actively set: TotalAmt (ADJ.total_amt)
   */
  public void unsetTotalAmt () {
    this._TotalAmtSet = false;
  }
  /** See if the field is actively set: TotalAmt (ADJ.total_amt)
   * @return boolean whether the field is actively set
   */
  public boolean issetTotalAmt () {
    return this._TotalAmtSet;
  }
  /** set the fields value: RatedFlag (ADJ.rated_flag)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RatedFlag") 
  public void setRatedFlag (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RatedFlag", "setRatedFlag");
    }
    this.RatedFlag = value;
    this._RatedFlagSet = true;
  }

  /** Retrieves the RatedFlag field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RatedFlag field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RatedFlag field
   */
   public String getRatedFlagAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRatedFlagAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRatedFlagAsFormattedString");
       return fmtMgr.formatBoolean(this.getRatedFlag());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RatedFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRatedFlagAsFormattedString");
       throw x;
     }
   }
  /** Sets the RatedFlag field from a formatted string
   *
   * @param _value the RatedFlag field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RatedFlag field
   */
   public void setRatedFlagFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRatedFlagFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRatedFlag(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RatedFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRatedFlagFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRatedFlagFromFormattedString");
   }

  /** get the value of the field: RatedFlag (ADJ.rated_flag)
   * @return Boolean the value
   */
  public Boolean getRatedFlag () {
    return this.RatedFlag;
  }
  /** Change the field to not being actively set: RatedFlag (ADJ.rated_flag)
   */
  public void unsetRatedFlag () {
    this._RatedFlagSet = false;
  }
  /** See if the field is actively set: RatedFlag (ADJ.rated_flag)
   * @return boolean whether the field is actively set
   */
  public boolean issetRatedFlag () {
    return this._RatedFlagSet;
  }
  /** set the fields value: ArchFlag (ADJ.arch_flag)
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

  /** get the value of the field: ArchFlag (ADJ.arch_flag)
   * @return Boolean the value
   */
  public Boolean getArchFlag () {
    return this.ArchFlag;
  }
  /** Change the field to not being actively set: ArchFlag (ADJ.arch_flag)
   */
  public void unsetArchFlag () {
    this._ArchFlagSet = false;
  }
  /** See if the field is actively set: ArchFlag (ADJ.arch_flag)
   * @return boolean whether the field is actively set
   */
  public boolean issetArchFlag () {
    return this._ArchFlagSet;
  }
  /** set the fields value: OrigProviderId (ADJ.orig_provider_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OrigProviderId") 
  public void setOrigProviderId (Integer value) throws ServiceException
  {
    this.OrigProviderId = value;
    this._OrigProviderIdSet = true;
  }

  /** Retrieves the OrigProviderId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OrigProviderId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigProviderId field
   */
   public String getOrigProviderIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigProviderIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigProviderIdAsFormattedString");
       return fmtMgr.formatNumber(this.getOrigProviderId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigProviderId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigProviderIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the OrigProviderId field from a formatted string
   *
   * @param _value the OrigProviderId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OrigProviderId field
   */
   public void setOrigProviderIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigProviderIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOrigProviderId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigProviderId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigProviderIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigProviderIdFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated OrigProviderId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the OrigProviderId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the OrigProviderId field
   */

  public String getOrigProviderIdDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigProviderIdDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getOrigProviderIdEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigProviderIdDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getOrigProviderId()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigProviderId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigProviderIdDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated OrigProviderId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the OrigProviderId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the OrigProviderId field
   */
  public Enumeration getOrigProviderIdEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigProviderIdEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("ProviderType", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigProviderIdEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigProviderId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigProviderIdEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated OrigProviderId field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setOrigProviderIdFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOrigProviderIdFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getOrigProviderIdEnumeration(_locale);
      this.setOrigProviderId((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigProviderId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigProviderIdFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOrigProviderIdFromDisplayValue");
  }

  /** get the value of the field: OrigProviderId (ADJ.orig_provider_id)
   * @return Integer the value
   */
  public Integer getOrigProviderId () {
    return this.OrigProviderId;
  }
  /** Change the field to not being actively set: OrigProviderId (ADJ.orig_provider_id)
   */
  public void unsetOrigProviderId () {
    this._OrigProviderIdSet = false;
  }
  /** See if the field is actively set: OrigProviderId (ADJ.orig_provider_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetOrigProviderId () {
    return this._OrigProviderIdSet;
  }
  /** set the fields value: OrigBillRefNo (ADJ.orig_bill_ref_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OrigBillRefNo") 
  public void setOrigBillRefNo (Integer value) throws ServiceException
  {
    this.OrigBillRefNo = value;
    this._OrigBillRefNoSet = true;
  }

  /** Retrieves the OrigBillRefNo field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OrigBillRefNo field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigBillRefNo field
   */
   public String getOrigBillRefNoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigBillRefNoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigBillRefNoAsFormattedString");
       return fmtMgr.formatNumber(this.getOrigBillRefNo(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigBillRefNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigBillRefNoAsFormattedString");
       throw x;
     }
   }
  /** Sets the OrigBillRefNo field from a formatted string
   *
   * @param _value the OrigBillRefNo field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OrigBillRefNo field
   */
   public void setOrigBillRefNoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigBillRefNoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOrigBillRefNo(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigBillRefNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigBillRefNoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigBillRefNoFromFormattedString");
   }

  /** get the value of the field: OrigBillRefNo (ADJ.orig_bill_ref_no)
   * @return Integer the value
   */
  public Integer getOrigBillRefNo () {
    return this.OrigBillRefNo;
  }
  /** Change the field to not being actively set: OrigBillRefNo (ADJ.orig_bill_ref_no)
   */
  public void unsetOrigBillRefNo () {
    this._OrigBillRefNoSet = false;
  }
  /** See if the field is actively set: OrigBillRefNo (ADJ.orig_bill_ref_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetOrigBillRefNo () {
    return this._OrigBillRefNoSet;
  }
  /** set the fields value: OrigBillRefResets (ADJ.orig_bill_ref_resets)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OrigBillRefResets") 
  public void setOrigBillRefResets (Integer value) throws ServiceException
  {
    this.OrigBillRefResets = value;
    this._OrigBillRefResetsSet = true;
  }

  /** Retrieves the OrigBillRefResets field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OrigBillRefResets field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigBillRefResets field
   */
   public String getOrigBillRefResetsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigBillRefResetsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigBillRefResetsAsFormattedString");
       return fmtMgr.formatNumber(this.getOrigBillRefResets(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigBillRefResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigBillRefResetsAsFormattedString");
       throw x;
     }
   }
  /** Sets the OrigBillRefResets field from a formatted string
   *
   * @param _value the OrigBillRefResets field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OrigBillRefResets field
   */
   public void setOrigBillRefResetsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigBillRefResetsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOrigBillRefResets(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigBillRefResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigBillRefResetsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigBillRefResetsFromFormattedString");
   }

  /** get the value of the field: OrigBillRefResets (ADJ.orig_bill_ref_resets)
   * @return Integer the value
   */
  public Integer getOrigBillRefResets () {
    return this.OrigBillRefResets;
  }
  /** Change the field to not being actively set: OrigBillRefResets (ADJ.orig_bill_ref_resets)
   */
  public void unsetOrigBillRefResets () {
    this._OrigBillRefResetsSet = false;
  }
  /** See if the field is actively set: OrigBillRefResets (ADJ.orig_bill_ref_resets)
   * @return boolean whether the field is actively set
   */
  public boolean issetOrigBillRefResets () {
    return this._OrigBillRefResetsSet;
  }
  /** set the fields value: OrigBillInvoiceRow (ADJ.orig_bill_invoice_row)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OrigBillInvoiceRow") 
  public void setOrigBillInvoiceRow (Integer value) throws ServiceException
  {
    this.OrigBillInvoiceRow = value;
    this._OrigBillInvoiceRowSet = true;
  }

  /** Retrieves the OrigBillInvoiceRow field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OrigBillInvoiceRow field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigBillInvoiceRow field
   */
   public String getOrigBillInvoiceRowAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigBillInvoiceRowAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigBillInvoiceRowAsFormattedString");
       return fmtMgr.formatNumber(this.getOrigBillInvoiceRow(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigBillInvoiceRow");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigBillInvoiceRowAsFormattedString");
       throw x;
     }
   }
  /** Sets the OrigBillInvoiceRow field from a formatted string
   *
   * @param _value the OrigBillInvoiceRow field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OrigBillInvoiceRow field
   */
   public void setOrigBillInvoiceRowFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigBillInvoiceRowFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOrigBillInvoiceRow(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigBillInvoiceRow");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigBillInvoiceRowFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigBillInvoiceRowFromFormattedString");
   }

  /** get the value of the field: OrigBillInvoiceRow (ADJ.orig_bill_invoice_row)
   * @return Integer the value
   */
  public Integer getOrigBillInvoiceRow () {
    return this.OrigBillInvoiceRow;
  }
  /** Change the field to not being actively set: OrigBillInvoiceRow (ADJ.orig_bill_invoice_row)
   */
  public void unsetOrigBillInvoiceRow () {
    this._OrigBillInvoiceRowSet = false;
  }
  /** See if the field is actively set: OrigBillInvoiceRow (ADJ.orig_bill_invoice_row)
   * @return boolean whether the field is actively set
   */
  public boolean issetOrigBillInvoiceRow () {
    return this._OrigBillInvoiceRowSet;
  }
  /** set the fields value: OrigType (ADJ.orig_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OrigType") 
  public void setOrigType (Integer value) throws ServiceException
  {
    this.OrigType = value;
    this._OrigTypeSet = true;
  }

  /** Retrieves the OrigType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OrigType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigType field
   */
   public String getOrigTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getOrigType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the OrigType field from a formatted string
   *
   * @param _value the OrigType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OrigType field
   */
   public void setOrigTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOrigType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigTypeFromFormattedString");
   }

  /** get the value of the field: OrigType (ADJ.orig_type)
   * @return Integer the value
   */
  public Integer getOrigType () {
    return this.OrigType;
  }
  /** Change the field to not being actively set: OrigType (ADJ.orig_type)
   */
  public void unsetOrigType () {
    this._OrigTypeSet = false;
  }
  /** See if the field is actively set: OrigType (ADJ.orig_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetOrigType () {
    return this._OrigTypeSet;
  }
  /** set the fields value: OrigSubtype (ADJ.orig_subtype)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OrigSubtype") 
  public void setOrigSubtype (Integer value) throws ServiceException
  {
    this.OrigSubtype = value;
    this._OrigSubtypeSet = true;
  }

  /** Retrieves the OrigSubtype field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OrigSubtype field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigSubtype field
   */
   public String getOrigSubtypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigSubtypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigSubtypeAsFormattedString");
       return fmtMgr.formatNumber(this.getOrigSubtype(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigSubtype");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigSubtypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the OrigSubtype field from a formatted string
   *
   * @param _value the OrigSubtype field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OrigSubtype field
   */
   public void setOrigSubtypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigSubtypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOrigSubtype(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigSubtype");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigSubtypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigSubtypeFromFormattedString");
   }

  /** get the value of the field: OrigSubtype (ADJ.orig_subtype)
   * @return Integer the value
   */
  public Integer getOrigSubtype () {
    return this.OrigSubtype;
  }
  /** Change the field to not being actively set: OrigSubtype (ADJ.orig_subtype)
   */
  public void unsetOrigSubtype () {
    this._OrigSubtypeSet = false;
  }
  /** See if the field is actively set: OrigSubtype (ADJ.orig_subtype)
   * @return boolean whether the field is actively set
   */
  public boolean issetOrigSubtype () {
    return this._OrigSubtypeSet;
  }
  /** set the fields value: OrigMsgId (ADJ.orig_msg_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OrigMsgId") 
  public void setOrigMsgId (Integer value) throws ServiceException
  {
    this.OrigMsgId = value;
    this._OrigMsgIdSet = true;
  }

  /** Retrieves the OrigMsgId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OrigMsgId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigMsgId field
   */
   public String getOrigMsgIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigMsgIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigMsgIdAsFormattedString");
       return fmtMgr.formatNumber(this.getOrigMsgId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigMsgId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigMsgIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the OrigMsgId field from a formatted string
   *
   * @param _value the OrigMsgId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OrigMsgId field
   */
   public void setOrigMsgIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigMsgIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOrigMsgId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigMsgId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigMsgIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigMsgIdFromFormattedString");
   }

  /** get the value of the field: OrigMsgId (ADJ.orig_msg_id)
   * @return Integer the value
   */
  public Integer getOrigMsgId () {
    return this.OrigMsgId;
  }
  /** Change the field to not being actively set: OrigMsgId (ADJ.orig_msg_id)
   */
  public void unsetOrigMsgId () {
    this._OrigMsgIdSet = false;
  }
  /** See if the field is actively set: OrigMsgId (ADJ.orig_msg_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetOrigMsgId () {
    return this._OrigMsgIdSet;
  }
  /** set the fields value: OrigMsgId2 (ADJ.orig_msg_id2)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OrigMsgId2") 
  public void setOrigMsgId2 (Integer value) throws ServiceException
  {
    this.OrigMsgId2 = value;
    this._OrigMsgId2Set = true;
  }

  /** Retrieves the OrigMsgId2 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OrigMsgId2 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigMsgId2 field
   */
   public String getOrigMsgId2AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigMsgId2AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigMsgId2AsFormattedString");
       return fmtMgr.formatNumber(this.getOrigMsgId2(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigMsgId2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigMsgId2AsFormattedString");
       throw x;
     }
   }
  /** Sets the OrigMsgId2 field from a formatted string
   *
   * @param _value the OrigMsgId2 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OrigMsgId2 field
   */
   public void setOrigMsgId2FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigMsgId2FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOrigMsgId2(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigMsgId2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigMsgId2FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigMsgId2FromFormattedString");
   }

  /** get the value of the field: OrigMsgId2 (ADJ.orig_msg_id2)
   * @return Integer the value
   */
  public Integer getOrigMsgId2 () {
    return this.OrigMsgId2;
  }
  /** Change the field to not being actively set: OrigMsgId2 (ADJ.orig_msg_id2)
   */
  public void unsetOrigMsgId2 () {
    this._OrigMsgId2Set = false;
  }
  /** See if the field is actively set: OrigMsgId2 (ADJ.orig_msg_id2)
   * @return boolean whether the field is actively set
   */
  public boolean issetOrigMsgId2 () {
    return this._OrigMsgId2Set;
  }
  /** set the fields value: OrigMsgIdServ (ADJ.orig_msg_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OrigMsgIdServ") 
  public void setOrigMsgIdServ (Integer value) throws ServiceException
  {
    this.OrigMsgIdServ = value;
    this._OrigMsgIdServSet = true;
  }

  /** Retrieves the OrigMsgIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OrigMsgIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigMsgIdServ field
   */
   public String getOrigMsgIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigMsgIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigMsgIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getOrigMsgIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigMsgIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigMsgIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the OrigMsgIdServ field from a formatted string
   *
   * @param _value the OrigMsgIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OrigMsgIdServ field
   */
   public void setOrigMsgIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigMsgIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOrigMsgIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigMsgIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigMsgIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigMsgIdServFromFormattedString");
   }

  /** get the value of the field: OrigMsgIdServ (ADJ.orig_msg_id_serv)
   * @return Integer the value
   */
  public Integer getOrigMsgIdServ () {
    return this.OrigMsgIdServ;
  }
  /** Change the field to not being actively set: OrigMsgIdServ (ADJ.orig_msg_id_serv)
   */
  public void unsetOrigMsgIdServ () {
    this._OrigMsgIdServSet = false;
  }
  /** See if the field is actively set: OrigMsgIdServ (ADJ.orig_msg_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetOrigMsgIdServ () {
    return this._OrigMsgIdServSet;
  }
  /** set the fields value: OrigTrackingId (ADJ.orig_tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OrigTrackingId") 
  public void setOrigTrackingId (Integer value) throws ServiceException
  {
    this.OrigTrackingId = value;
    this._OrigTrackingIdSet = true;
  }

  /** Retrieves the OrigTrackingId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OrigTrackingId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigTrackingId field
   */
   public String getOrigTrackingIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigTrackingIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigTrackingIdAsFormattedString");
       return fmtMgr.formatNumber(this.getOrigTrackingId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigTrackingIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the OrigTrackingId field from a formatted string
   *
   * @param _value the OrigTrackingId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OrigTrackingId field
   */
   public void setOrigTrackingIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigTrackingIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOrigTrackingId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigTrackingIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigTrackingIdFromFormattedString");
   }

  /** get the value of the field: OrigTrackingId (ADJ.orig_tracking_id)
   * @return Integer the value
   */
  public Integer getOrigTrackingId () {
    return this.OrigTrackingId;
  }
  /** Change the field to not being actively set: OrigTrackingId (ADJ.orig_tracking_id)
   */
  public void unsetOrigTrackingId () {
    this._OrigTrackingIdSet = false;
  }
  /** See if the field is actively set: OrigTrackingId (ADJ.orig_tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetOrigTrackingId () {
    return this._OrigTrackingIdSet;
  }
  /** set the fields value: OrigTrackingIdServ (ADJ.orig_tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OrigTrackingIdServ") 
  public void setOrigTrackingIdServ (Integer value) throws ServiceException
  {
    this.OrigTrackingIdServ = value;
    this._OrigTrackingIdServSet = true;
  }

  /** Retrieves the OrigTrackingIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OrigTrackingIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigTrackingIdServ field
   */
   public String getOrigTrackingIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigTrackingIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigTrackingIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getOrigTrackingIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigTrackingIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the OrigTrackingIdServ field from a formatted string
   *
   * @param _value the OrigTrackingIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OrigTrackingIdServ field
   */
   public void setOrigTrackingIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigTrackingIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOrigTrackingIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigTrackingIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigTrackingIdServFromFormattedString");
   }

  /** get the value of the field: OrigTrackingIdServ (ADJ.orig_tracking_id_serv)
   * @return Integer the value
   */
  public Integer getOrigTrackingIdServ () {
    return this.OrigTrackingIdServ;
  }
  /** Change the field to not being actively set: OrigTrackingIdServ (ADJ.orig_tracking_id_serv)
   */
  public void unsetOrigTrackingIdServ () {
    this._OrigTrackingIdServSet = false;
  }
  /** See if the field is actively set: OrigTrackingIdServ (ADJ.orig_tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetOrigTrackingIdServ () {
    return this._OrigTrackingIdServSet;
  }
  /** set the fields value: OrigTrackingDt (ADJ.orig_tracking_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OrigTrackingDt") 
  public void setOrigTrackingDt (Date value) throws ServiceException
  {
    this.OrigTrackingDt = value;
    this._OrigTrackingDtSet = true;
  }

  /** Retrieves the OrigTrackingDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OrigTrackingDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigTrackingDt field
   */
   public String getOrigTrackingDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigTrackingDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigTrackingDtAsFormattedString");
       return fmtMgr.formatDate(this.getOrigTrackingDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigTrackingDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigTrackingDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the OrigTrackingDt field from a formatted string
   *
   * @param _value the OrigTrackingDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OrigTrackingDt field
   */
   public void setOrigTrackingDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigTrackingDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOrigTrackingDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigTrackingDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigTrackingDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigTrackingDtFromFormattedString");
   }

  /**
   * Retrieves the OrigTrackingDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OrigTrackingDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigTrackingDt field
   */
  public String getOrigTrackingDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigTrackingDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigTrackingDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getOrigTrackingDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigTrackingDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigTrackingDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the OrigTrackingDt field value from a formatted date/time string
   *
   * @param _value the OrigTrackingDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OrigTrackingDt field
   */
  public void setOrigTrackingDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOrigTrackingDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setOrigTrackingDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigTrackingDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigTrackingDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: OrigTrackingDt (ADJ.orig_tracking_dt)
   * @return Date the value
   */
  public Date getOrigTrackingDt () {
    return this.OrigTrackingDt;
  }
  /** Change the field to not being actively set: OrigTrackingDt (ADJ.orig_tracking_dt)
   */
  public void unsetOrigTrackingDt () {
    this._OrigTrackingDtSet = false;
  }
  /** See if the field is actively set: OrigTrackingDt (ADJ.orig_tracking_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetOrigTrackingDt () {
    return this._OrigTrackingDtSet;
  }
  /** set the fields value: OrigRcFromDate (ADJ.orig_rc_from_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OrigRcFromDate") 
  public void setOrigRcFromDate (Date value) throws ServiceException
  {
    this.OrigRcFromDate = value;
    this._OrigRcFromDateSet = true;
  }

  /** Retrieves the OrigRcFromDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OrigRcFromDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigRcFromDate field
   */
   public String getOrigRcFromDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigRcFromDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigRcFromDateAsFormattedString");
       return fmtMgr.formatDate(this.getOrigRcFromDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigRcFromDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigRcFromDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the OrigRcFromDate field from a formatted string
   *
   * @param _value the OrigRcFromDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OrigRcFromDate field
   */
   public void setOrigRcFromDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigRcFromDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOrigRcFromDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigRcFromDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigRcFromDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigRcFromDateFromFormattedString");
   }

  /**
   * Retrieves the OrigRcFromDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OrigRcFromDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigRcFromDate field
   */
  public String getOrigRcFromDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigRcFromDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigRcFromDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getOrigRcFromDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigRcFromDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigRcFromDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the OrigRcFromDate field value from a formatted date/time string
   *
   * @param _value the OrigRcFromDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OrigRcFromDate field
   */
  public void setOrigRcFromDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOrigRcFromDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setOrigRcFromDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigRcFromDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigRcFromDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: OrigRcFromDate (ADJ.orig_rc_from_date)
   * @return Date the value
   */
  public Date getOrigRcFromDate () {
    return this.OrigRcFromDate;
  }
  /** Change the field to not being actively set: OrigRcFromDate (ADJ.orig_rc_from_date)
   */
  public void unsetOrigRcFromDate () {
    this._OrigRcFromDateSet = false;
  }
  /** See if the field is actively set: OrigRcFromDate (ADJ.orig_rc_from_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetOrigRcFromDate () {
    return this._OrigRcFromDateSet;
  }
  /** set the fields value: BillRefNo (ADJ.bill_ref_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillRefNo") 
  public void setBillRefNo (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillRefNo", "setBillRefNo");
    }
    this.BillRefNo = value;
    this._BillRefNoSet = true;
  }

  /** Retrieves the BillRefNo field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillRefNo field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillRefNo field
   */
   public String getBillRefNoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillRefNoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillRefNoAsFormattedString");
       return fmtMgr.formatNumber(this.getBillRefNo(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillRefNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillRefNoAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillRefNo field from a formatted string
   *
   * @param _value the BillRefNo field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillRefNo field
   */
   public void setBillRefNoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillRefNoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillRefNo(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillRefNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillRefNoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillRefNoFromFormattedString");
   }

  /** get the value of the field: BillRefNo (ADJ.bill_ref_no)
   * @return Integer the value
   */
  public Integer getBillRefNo () {
    return this.BillRefNo;
  }
  /** Change the field to not being actively set: BillRefNo (ADJ.bill_ref_no)
   */
  public void unsetBillRefNo () {
    this._BillRefNoSet = false;
  }
  /** See if the field is actively set: BillRefNo (ADJ.bill_ref_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillRefNo () {
    return this._BillRefNoSet;
  }
  /** set the fields value: BillRefResets (ADJ.bill_ref_resets)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillRefResets") 
  public void setBillRefResets (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillRefResets", "setBillRefResets");
    }
    this.BillRefResets = value;
    this._BillRefResetsSet = true;
  }

  /** Retrieves the BillRefResets field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillRefResets field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillRefResets field
   */
   public String getBillRefResetsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillRefResetsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillRefResetsAsFormattedString");
       return fmtMgr.formatNumber(this.getBillRefResets(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillRefResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillRefResetsAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillRefResets field from a formatted string
   *
   * @param _value the BillRefResets field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillRefResets field
   */
   public void setBillRefResetsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillRefResetsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillRefResets(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillRefResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillRefResetsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillRefResetsFromFormattedString");
   }

  /** get the value of the field: BillRefResets (ADJ.bill_ref_resets)
   * @return Integer the value
   */
  public Integer getBillRefResets () {
    return this.BillRefResets;
  }
  /** Change the field to not being actively set: BillRefResets (ADJ.bill_ref_resets)
   */
  public void unsetBillRefResets () {
    this._BillRefResetsSet = false;
  }
  /** See if the field is actively set: BillRefResets (ADJ.bill_ref_resets)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillRefResets () {
    return this._BillRefResetsSet;
  }
  /** set the fields value: TaxClass (ADJ.tax_class)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TaxClass") 
  public void setTaxClass (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TaxClass", "setTaxClass");
    }
    this.TaxClass = value;
    this._TaxClassSet = true;
  }

  /** Retrieves the TaxClass field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TaxClass field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxClass field
   */
   public String getTaxClassAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxClassAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxClassAsFormattedString");
       return fmtMgr.formatNumber(this.getTaxClass(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxClassAsFormattedString");
       throw x;
     }
   }
  /** Sets the TaxClass field from a formatted string
   *
   * @param _value the TaxClass field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TaxClass field
   */
   public void setTaxClassFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxClassFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTaxClass(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxClassFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxClassFromFormattedString");
   }

  /** get the value of the field: TaxClass (ADJ.tax_class)
   * @return Integer the value
   */
  public Integer getTaxClass () {
    return this.TaxClass;
  }
  /** Change the field to not being actively set: TaxClass (ADJ.tax_class)
   */
  public void unsetTaxClass () {
    this._TaxClassSet = false;
  }
  /** See if the field is actively set: TaxClass (ADJ.tax_class)
   * @return boolean whether the field is actively set
   */
  public boolean issetTaxClass () {
    return this._TaxClassSet;
  }
  /** set the fields value: TaxPkgInstId (ADJ.tax_pkg_inst_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TaxPkgInstId") 
  public void setTaxPkgInstId (Integer value) throws ServiceException
  {
    this.TaxPkgInstId = value;
    this._TaxPkgInstIdSet = true;
  }

  /** Retrieves the TaxPkgInstId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TaxPkgInstId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxPkgInstId field
   */
   public String getTaxPkgInstIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxPkgInstIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxPkgInstIdAsFormattedString");
       return fmtMgr.formatNumber(this.getTaxPkgInstId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxPkgInstId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxPkgInstIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the TaxPkgInstId field from a formatted string
   *
   * @param _value the TaxPkgInstId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TaxPkgInstId field
   */
   public void setTaxPkgInstIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxPkgInstIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTaxPkgInstId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxPkgInstId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxPkgInstIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxPkgInstIdFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated TaxPkgInstId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the TaxPkgInstId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the TaxPkgInstId field
   */

  public String getTaxPkgInstIdDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxPkgInstIdDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getTaxPkgInstIdEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxPkgInstIdDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getTaxPkgInstId()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxPkgInstId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxPkgInstIdDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated TaxPkgInstId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the TaxPkgInstId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the TaxPkgInstId field
   */
  public Enumeration getTaxPkgInstIdEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxPkgInstIdEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("TaxPackageInst", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxPkgInstIdEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxPkgInstId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxPkgInstIdEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated TaxPkgInstId field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setTaxPkgInstIdFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTaxPkgInstIdFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getTaxPkgInstIdEnumeration(_locale);
      this.setTaxPkgInstId((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxPkgInstId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxPkgInstIdFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTaxPkgInstIdFromDisplayValue");
  }

  /** get the value of the field: TaxPkgInstId (ADJ.tax_pkg_inst_id)
   * @return Integer the value
   */
  public Integer getTaxPkgInstId () {
    return this.TaxPkgInstId;
  }
  /** Change the field to not being actively set: TaxPkgInstId (ADJ.tax_pkg_inst_id)
   */
  public void unsetTaxPkgInstId () {
    this._TaxPkgInstIdSet = false;
  }
  /** See if the field is actively set: TaxPkgInstId (ADJ.tax_pkg_inst_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetTaxPkgInstId () {
    return this._TaxPkgInstIdSet;
  }
  /** set the fields value: Geocode (ADJ.geocode)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Geocode") 
  public void setGeocode (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 15))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Geocode", "setGeocode");
    }
    this.Geocode = value;
    this._GeocodeSet = true;
  }

  /** Retrieves the Geocode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Geocode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Geocode field
   */
   public String getGeocodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGeocodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGeocodeAsFormattedString");
       return fmtMgr.formatString(this.getGeocode());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Geocode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getGeocodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the Geocode field from a formatted string
   *
   * @param _value the Geocode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Geocode field
   */
   public void setGeocodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGeocodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setGeocode(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Geocode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setGeocodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGeocodeFromFormattedString");
   }

  /** get the value of the field: Geocode (ADJ.geocode)
   * @return String the value
   */
  public String getGeocode () {
    return this.Geocode;
  }
  /** Change the field to not being actively set: Geocode (ADJ.geocode)
   */
  public void unsetGeocode () {
    this._GeocodeSet = false;
  }
  /** See if the field is actively set: Geocode (ADJ.geocode)
   * @return boolean whether the field is actively set
   */
  public boolean issetGeocode () {
    return this._GeocodeSet;
  }
  /** set the fields value: AuxTaxInfo (ADJ.aux_tax_info)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AuxTaxInfo") 
  public void setAuxTaxInfo (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 15))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AuxTaxInfo", "setAuxTaxInfo");
    }
    this.AuxTaxInfo = value;
    this._AuxTaxInfoSet = true;
  }

  /** Retrieves the AuxTaxInfo field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AuxTaxInfo field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AuxTaxInfo field
   */
   public String getAuxTaxInfoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAuxTaxInfoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAuxTaxInfoAsFormattedString");
       return fmtMgr.formatString(this.getAuxTaxInfo());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AuxTaxInfo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAuxTaxInfoAsFormattedString");
       throw x;
     }
   }
  /** Sets the AuxTaxInfo field from a formatted string
   *
   * @param _value the AuxTaxInfo field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AuxTaxInfo field
   */
   public void setAuxTaxInfoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAuxTaxInfoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAuxTaxInfo(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AuxTaxInfo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAuxTaxInfoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAuxTaxInfoFromFormattedString");
   }

  /** get the value of the field: AuxTaxInfo (ADJ.aux_tax_info)
   * @return String the value
   */
  public String getAuxTaxInfo () {
    return this.AuxTaxInfo;
  }
  /** Change the field to not being actively set: AuxTaxInfo (ADJ.aux_tax_info)
   */
  public void unsetAuxTaxInfo () {
    this._AuxTaxInfoSet = false;
  }
  /** See if the field is actively set: AuxTaxInfo (ADJ.aux_tax_info)
   * @return boolean whether the field is actively set
   */
  public boolean issetAuxTaxInfo () {
    return this._AuxTaxInfoSet;
  }
  /** set the fields value: CombTaxRate (ADJ.comb_tax_rate)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CombTaxRate") 
  public void setCombTaxRate (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CombTaxRate", "setCombTaxRate");
    }
    this.CombTaxRate = value;
    this._CombTaxRateSet = true;
  }

  /** Retrieves the CombTaxRate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CombTaxRate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CombTaxRate field
   */
   public String getCombTaxRateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCombTaxRateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCombTaxRateAsFormattedString");
       return fmtMgr.formatNumber(this.getCombTaxRate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CombTaxRate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCombTaxRateAsFormattedString");
       throw x;
     }
   }
  /** Sets the CombTaxRate field from a formatted string
   *
   * @param _value the CombTaxRate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CombTaxRate field
   */
   public void setCombTaxRateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCombTaxRateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCombTaxRate(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CombTaxRate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCombTaxRateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCombTaxRateFromFormattedString");
   }

  /** get the value of the field: CombTaxRate (ADJ.comb_tax_rate)
   * @return Integer the value
   */
  public Integer getCombTaxRate () {
    return this.CombTaxRate;
  }
  /** Change the field to not being actively set: CombTaxRate (ADJ.comb_tax_rate)
   */
  public void unsetCombTaxRate () {
    this._CombTaxRateSet = false;
  }
  /** See if the field is actively set: CombTaxRate (ADJ.comb_tax_rate)
   * @return boolean whether the field is actively set
   */
  public boolean issetCombTaxRate () {
    return this._CombTaxRateSet;
  }
  /** set the fields value: FederalTax (ADJ.federal_tax)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FederalTax") 
  public void setFederalTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "FederalTax", "setFederalTax");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "FederalTax", "setFederalTax");
    }
    this.FederalTax = value;
    this._FederalTaxSet = true;
  }

  /** Retrieves the FederalTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FederalTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FederalTax field
   */
   public String getFederalTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFederalTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFederalTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getFederalTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FederalTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFederalTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the FederalTax field from a formatted string
   *
   * @param _value the FederalTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FederalTax field
   */
   public void setFederalTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFederalTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFederalTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FederalTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFederalTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFederalTaxFromFormattedString");
   }

  /**
   * Retrieves the FederalTax field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FederalTax field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the FederalTax field
   */
  public String getFederalTaxAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFederalTaxAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFederalTaxAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getFederalTax(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FederalTax");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFederalTaxAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the FederalTax field value from a formatted currency string
   *
   * @param _value the FederalTax field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FederalTax field
   */
  public void setFederalTaxFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFederalTaxFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setFederalTax(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FederalTax");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFederalTaxFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFederalTaxFromFormattedCurrencyString");
  }

  /** get the value of the field: FederalTax (ADJ.federal_tax)
   * @return BigInteger the value
   */
  public BigInteger getFederalTax () {
    return this.FederalTax;
  }
  /** Change the field to not being actively set: FederalTax (ADJ.federal_tax)
   */
  public void unsetFederalTax () {
    this._FederalTaxSet = false;
  }
  /** See if the field is actively set: FederalTax (ADJ.federal_tax)
   * @return boolean whether the field is actively set
   */
  public boolean issetFederalTax () {
    return this._FederalTaxSet;
  }
  /** set the fields value: StateTax (ADJ.state_tax)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("StateTax") 
  public void setStateTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "StateTax", "setStateTax");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "StateTax", "setStateTax");
    }
    this.StateTax = value;
    this._StateTaxSet = true;
  }

  /** Retrieves the StateTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The StateTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StateTax field
   */
   public String getStateTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStateTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStateTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getStateTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StateTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStateTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the StateTax field from a formatted string
   *
   * @param _value the StateTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StateTax field
   */
   public void setStateTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStateTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setStateTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StateTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStateTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStateTaxFromFormattedString");
   }

  /**
   * Retrieves the StateTax field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StateTax field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the StateTax field
   */
  public String getStateTaxAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStateTaxAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStateTaxAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getStateTax(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StateTax");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStateTaxAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the StateTax field value from a formatted currency string
   *
   * @param _value the StateTax field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StateTax field
   */
  public void setStateTaxFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStateTaxFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setStateTax(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StateTax");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStateTaxFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStateTaxFromFormattedCurrencyString");
  }

  /** get the value of the field: StateTax (ADJ.state_tax)
   * @return BigInteger the value
   */
  public BigInteger getStateTax () {
    return this.StateTax;
  }
  /** Change the field to not being actively set: StateTax (ADJ.state_tax)
   */
  public void unsetStateTax () {
    this._StateTaxSet = false;
  }
  /** See if the field is actively set: StateTax (ADJ.state_tax)
   * @return boolean whether the field is actively set
   */
  public boolean issetStateTax () {
    return this._StateTaxSet;
  }
  /** set the fields value: CountyTax (ADJ.county_tax)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CountyTax") 
  public void setCountyTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CountyTax", "setCountyTax");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CountyTax", "setCountyTax");
    }
    this.CountyTax = value;
    this._CountyTaxSet = true;
  }

  /** Retrieves the CountyTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CountyTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CountyTax field
   */
   public String getCountyTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountyTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCountyTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getCountyTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CountyTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCountyTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the CountyTax field from a formatted string
   *
   * @param _value the CountyTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CountyTax field
   */
   public void setCountyTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountyTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCountyTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CountyTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCountyTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCountyTaxFromFormattedString");
   }

  /**
   * Retrieves the CountyTax field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CountyTax field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the CountyTax field
   */
  public String getCountyTaxAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountyTaxAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCountyTaxAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getCountyTax(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountyTax");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCountyTaxAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the CountyTax field value from a formatted currency string
   *
   * @param _value the CountyTax field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CountyTax field
   */
  public void setCountyTaxFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCountyTaxFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setCountyTax(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountyTax");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCountyTaxFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCountyTaxFromFormattedCurrencyString");
  }

  /** get the value of the field: CountyTax (ADJ.county_tax)
   * @return BigInteger the value
   */
  public BigInteger getCountyTax () {
    return this.CountyTax;
  }
  /** Change the field to not being actively set: CountyTax (ADJ.county_tax)
   */
  public void unsetCountyTax () {
    this._CountyTaxSet = false;
  }
  /** See if the field is actively set: CountyTax (ADJ.county_tax)
   * @return boolean whether the field is actively set
   */
  public boolean issetCountyTax () {
    return this._CountyTaxSet;
  }
  /** set the fields value: CityTax (ADJ.city_tax)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CityTax") 
  public void setCityTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CityTax", "setCityTax");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CityTax", "setCityTax");
    }
    this.CityTax = value;
    this._CityTaxSet = true;
  }

  /** Retrieves the CityTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CityTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CityTax field
   */
   public String getCityTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCityTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCityTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getCityTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CityTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCityTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the CityTax field from a formatted string
   *
   * @param _value the CityTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CityTax field
   */
   public void setCityTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCityTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCityTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CityTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCityTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCityTaxFromFormattedString");
   }

  /**
   * Retrieves the CityTax field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CityTax field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the CityTax field
   */
  public String getCityTaxAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCityTaxAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCityTaxAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getCityTax(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CityTax");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCityTaxAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the CityTax field value from a formatted currency string
   *
   * @param _value the CityTax field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CityTax field
   */
  public void setCityTaxFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCityTaxFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setCityTax(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CityTax");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCityTaxFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCityTaxFromFormattedCurrencyString");
  }

  /** get the value of the field: CityTax (ADJ.city_tax)
   * @return BigInteger the value
   */
  public BigInteger getCityTax () {
    return this.CityTax;
  }
  /** Change the field to not being actively set: CityTax (ADJ.city_tax)
   */
  public void unsetCityTax () {
    this._CityTaxSet = false;
  }
  /** See if the field is actively set: CityTax (ADJ.city_tax)
   * @return boolean whether the field is actively set
   */
  public boolean issetCityTax () {
    return this._CityTaxSet;
  }
  /** set the fields value: OtherTax (ADJ.other_tax)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OtherTax") 
  public void setOtherTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "OtherTax", "setOtherTax");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "OtherTax", "setOtherTax");
    }
    this.OtherTax = value;
    this._OtherTaxSet = true;
  }

  /** Retrieves the OtherTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OtherTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OtherTax field
   */
   public String getOtherTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOtherTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOtherTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getOtherTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OtherTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOtherTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the OtherTax field from a formatted string
   *
   * @param _value the OtherTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OtherTax field
   */
   public void setOtherTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOtherTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOtherTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OtherTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOtherTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOtherTaxFromFormattedString");
   }

  /**
   * Retrieves the OtherTax field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OtherTax field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the OtherTax field
   */
  public String getOtherTaxAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOtherTaxAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOtherTaxAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getOtherTax(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OtherTax");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOtherTaxAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the OtherTax field value from a formatted currency string
   *
   * @param _value the OtherTax field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OtherTax field
   */
  public void setOtherTaxFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOtherTaxFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setOtherTax(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OtherTax");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOtherTaxFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOtherTaxFromFormattedCurrencyString");
  }

  /** get the value of the field: OtherTax (ADJ.other_tax)
   * @return BigInteger the value
   */
  public BigInteger getOtherTax () {
    return this.OtherTax;
  }
  /** Change the field to not being actively set: OtherTax (ADJ.other_tax)
   */
  public void unsetOtherTax () {
    this._OtherTaxSet = false;
  }
  /** See if the field is actively set: OtherTax (ADJ.other_tax)
   * @return boolean whether the field is actively set
   */
  public boolean issetOtherTax () {
    return this._OtherTaxSet;
  }
  /** set the fields value: TaxJournalStatus (ADJ.tax_journal_status)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TaxJournalStatus") 
  public void setTaxJournalStatus (Integer value) throws ServiceException
  {
    this.TaxJournalStatus = value;
    this._TaxJournalStatusSet = true;
  }

  /** Retrieves the TaxJournalStatus field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TaxJournalStatus field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxJournalStatus field
   */
   public String getTaxJournalStatusAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxJournalStatusAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxJournalStatusAsFormattedString");
       return fmtMgr.formatNumber(this.getTaxJournalStatus(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxJournalStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxJournalStatusAsFormattedString");
       throw x;
     }
   }
  /** Sets the TaxJournalStatus field from a formatted string
   *
   * @param _value the TaxJournalStatus field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TaxJournalStatus field
   */
   public void setTaxJournalStatusFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxJournalStatusFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTaxJournalStatus(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxJournalStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxJournalStatusFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxJournalStatusFromFormattedString");
   }

  /** get the value of the field: TaxJournalStatus (ADJ.tax_journal_status)
   * @return Integer the value
   */
  public Integer getTaxJournalStatus () {
    return this.TaxJournalStatus;
  }
  /** Change the field to not being actively set: TaxJournalStatus (ADJ.tax_journal_status)
   */
  public void unsetTaxJournalStatus () {
    this._TaxJournalStatusSet = false;
  }
  /** See if the field is actively set: TaxJournalStatus (ADJ.tax_journal_status)
   * @return boolean whether the field is actively set
   */
  public boolean issetTaxJournalStatus () {
    return this._TaxJournalStatusSet;
  }
  /** set the fields value: DiscountAmt (ADJ.discount_amt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DiscountAmt") 
  public void setDiscountAmt (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DiscountAmt", "setDiscountAmt");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "DiscountAmt", "setDiscountAmt");
    }
    this.DiscountAmt = value;
    this._DiscountAmtSet = true;
  }

  /** Retrieves the DiscountAmt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DiscountAmt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DiscountAmt field
   */
   public String getDiscountAmtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountAmtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscountAmtAsFormattedString");
       return fmtMgr.formatBigInteger(this.getDiscountAmt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DiscountAmt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDiscountAmtAsFormattedString");
       throw x;
     }
   }
  /** Sets the DiscountAmt field from a formatted string
   *
   * @param _value the DiscountAmt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DiscountAmt field
   */
   public void setDiscountAmtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountAmtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDiscountAmt(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DiscountAmt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDiscountAmtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDiscountAmtFromFormattedString");
   }

  /**
   * Retrieves the DiscountAmt field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DiscountAmt field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the DiscountAmt field
   */
  public String getDiscountAmtAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountAmtAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscountAmtAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getDiscountAmt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DiscountAmt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDiscountAmtAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the DiscountAmt field value from a formatted currency string
   *
   * @param _value the DiscountAmt field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DiscountAmt field
   */
  public void setDiscountAmtFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDiscountAmtFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setDiscountAmt(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DiscountAmt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDiscountAmtFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDiscountAmtFromFormattedCurrencyString");
  }

  /** get the value of the field: DiscountAmt (ADJ.discount_amt)
   * @return BigInteger the value
   */
  public BigInteger getDiscountAmt () {
    return this.DiscountAmt;
  }
  /** Change the field to not being actively set: DiscountAmt (ADJ.discount_amt)
   */
  public void unsetDiscountAmt () {
    this._DiscountAmtSet = false;
  }
  /** See if the field is actively set: DiscountAmt (ADJ.discount_amt)
   * @return boolean whether the field is actively set
   */
  public boolean issetDiscountAmt () {
    return this._DiscountAmtSet;
  }
  /** set the fields value: ProfileId (ADJ.profile_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ProfileId") 
  public void setProfileId (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ProfileId", "setProfileId");
    }
    this.ProfileId = value;
    this._ProfileIdSet = true;
  }

  /** Retrieves the ProfileId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ProfileId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProfileId field
   */
   public String getProfileIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProfileIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProfileIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getProfileId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProfileId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getProfileIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ProfileId field from a formatted string
   *
   * @param _value the ProfileId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ProfileId field
   */
   public void setProfileIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProfileIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setProfileId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProfileId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setProfileIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProfileIdFromFormattedString");
   }

  /** get the value of the field: ProfileId (ADJ.profile_id)
   * @return BigInteger the value
   */
  public BigInteger getProfileId () {
    return this.ProfileId;
  }
  /** Change the field to not being actively set: ProfileId (ADJ.profile_id)
   */
  public void unsetProfileId () {
    this._ProfileIdSet = false;
  }
  /** See if the field is actively set: ProfileId (ADJ.profile_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetProfileId () {
    return this._ProfileIdSet;
  }
  /** set the fields value: AdjReasonCode (ADJ.adj_reason_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AdjReasonCode") 
  public void setAdjReasonCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AdjReasonCode", "setAdjReasonCode");
    }
    this.AdjReasonCode = value;
    this._AdjReasonCodeSet = true;
  }

  /** Retrieves the AdjReasonCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AdjReasonCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AdjReasonCode field
   */
   public String getAdjReasonCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAdjReasonCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjReasonCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getAdjReasonCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AdjReasonCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAdjReasonCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the AdjReasonCode field from a formatted string
   *
   * @param _value the AdjReasonCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AdjReasonCode field
   */
   public void setAdjReasonCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAdjReasonCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAdjReasonCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AdjReasonCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAdjReasonCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAdjReasonCodeFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated AdjReasonCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the AdjReasonCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AdjReasonCode field
   */

  public String getAdjReasonCodeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAdjReasonCodeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getAdjReasonCodeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjReasonCodeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getAdjReasonCode()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AdjReasonCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAdjReasonCodeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated AdjReasonCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the AdjReasonCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AdjReasonCode field
   */
  public Enumeration getAdjReasonCodeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAdjReasonCodeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("AdjustmentReason", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjReasonCodeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AdjReasonCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAdjReasonCodeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated AdjReasonCode field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setAdjReasonCodeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAdjReasonCodeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getAdjReasonCodeEnumeration(_locale);
      this.setAdjReasonCode((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AdjReasonCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAdjReasonCodeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAdjReasonCodeFromDisplayValue");
  }

  /** get the value of the field: AdjReasonCode (ADJ.adj_reason_code)
   * @return Integer the value
   */
  public Integer getAdjReasonCode () {
    return this.AdjReasonCode;
  }
  /** Change the field to not being actively set: AdjReasonCode (ADJ.adj_reason_code)
   */
  public void unsetAdjReasonCode () {
    this._AdjReasonCodeSet = false;
  }
  /** See if the field is actively set: AdjReasonCode (ADJ.adj_reason_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetAdjReasonCode () {
    return this._AdjReasonCodeSet;
  }
  /** set the fields value: FraudIndicator (ADJ.fraud_indicator)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FraudIndicator") 
  public void setFraudIndicator (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "FraudIndicator", "setFraudIndicator");
    }
    this.FraudIndicator = value;
    this._FraudIndicatorSet = true;
  }

  /** Retrieves the FraudIndicator field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FraudIndicator field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FraudIndicator field
   */
   public String getFraudIndicatorAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFraudIndicatorAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFraudIndicatorAsFormattedString");
       return fmtMgr.formatNumber(this.getFraudIndicator(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FraudIndicator");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFraudIndicatorAsFormattedString");
       throw x;
     }
   }
  /** Sets the FraudIndicator field from a formatted string
   *
   * @param _value the FraudIndicator field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FraudIndicator field
   */
   public void setFraudIndicatorFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFraudIndicatorFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFraudIndicator(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FraudIndicator");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFraudIndicatorFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFraudIndicatorFromFormattedString");
   }

  /** get the value of the field: FraudIndicator (ADJ.fraud_indicator)
   * @return Integer the value
   */
  public Integer getFraudIndicator () {
    return this.FraudIndicator;
  }
  /** Change the field to not being actively set: FraudIndicator (ADJ.fraud_indicator)
   */
  public void unsetFraudIndicator () {
    this._FraudIndicatorSet = false;
  }
  /** See if the field is actively set: FraudIndicator (ADJ.fraud_indicator)
   * @return boolean whether the field is actively set
   */
  public boolean issetFraudIndicator () {
    return this._FraudIndicatorSet;
  }
  /** set the fields value: RevRcvCostCtr (ADJ.rev_rcv_cost_ctr)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RevRcvCostCtr") 
  public void setRevRcvCostCtr (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RevRcvCostCtr", "setRevRcvCostCtr");
    }
    this.RevRcvCostCtr = value;
    this._RevRcvCostCtrSet = true;
  }

  /** Retrieves the RevRcvCostCtr field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RevRcvCostCtr field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RevRcvCostCtr field
   */
   public String getRevRcvCostCtrAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRevRcvCostCtrAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRevRcvCostCtrAsFormattedString");
       return fmtMgr.formatNumber(this.getRevRcvCostCtr(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RevRcvCostCtr");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRevRcvCostCtrAsFormattedString");
       throw x;
     }
   }
  /** Sets the RevRcvCostCtr field from a formatted string
   *
   * @param _value the RevRcvCostCtr field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RevRcvCostCtr field
   */
   public void setRevRcvCostCtrFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRevRcvCostCtrFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRevRcvCostCtr(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RevRcvCostCtr");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRevRcvCostCtrFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRevRcvCostCtrFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated RevRcvCostCtr field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the RevRcvCostCtr field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the RevRcvCostCtr field
   */

  public String getRevRcvCostCtrDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRevRcvCostCtrDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getRevRcvCostCtrEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRevRcvCostCtrDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getRevRcvCostCtr()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RevRcvCostCtr");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRevRcvCostCtrDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated RevRcvCostCtr field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the RevRcvCostCtr field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the RevRcvCostCtr field
   */
  public Enumeration getRevRcvCostCtrEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRevRcvCostCtrEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("RevRcvCostCenter", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRevRcvCostCtrEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RevRcvCostCtr");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRevRcvCostCtrEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated RevRcvCostCtr field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setRevRcvCostCtrFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRevRcvCostCtrFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getRevRcvCostCtrEnumeration(_locale);
      this.setRevRcvCostCtr((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RevRcvCostCtr");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRevRcvCostCtrFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRevRcvCostCtrFromDisplayValue");
  }

  /** get the value of the field: RevRcvCostCtr (ADJ.rev_rcv_cost_ctr)
   * @return Integer the value
   */
  public Integer getRevRcvCostCtr () {
    return this.RevRcvCostCtr;
  }
  /** Change the field to not being actively set: RevRcvCostCtr (ADJ.rev_rcv_cost_ctr)
   */
  public void unsetRevRcvCostCtr () {
    this._RevRcvCostCtrSet = false;
  }
  /** See if the field is actively set: RevRcvCostCtr (ADJ.rev_rcv_cost_ctr)
   * @return boolean whether the field is actively set
   */
  public boolean issetRevRcvCostCtr () {
    return this._RevRcvCostCtrSet;
  }
  /** set the fields value: ChgWho (ADJ.chg_who)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ChgWho") 
  public void setChgWho (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ChgWho", "setChgWho");
    }
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ChgWho", "setChgWho");
    }
    this.ChgWho = value;
    this._ChgWhoSet = true;
  }

  /** Retrieves the ChgWho field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ChgWho field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgWho field
   */
   public String getChgWhoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgWhoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgWhoAsFormattedString");
       return fmtMgr.formatString(this.getChgWho());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgWho");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgWhoAsFormattedString");
       throw x;
     }
   }
  /** Sets the ChgWho field from a formatted string
   *
   * @param _value the ChgWho field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChgWho field
   */
   public void setChgWhoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgWhoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setChgWho(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgWho");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgWhoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgWhoFromFormattedString");
   }

  /** get the value of the field: ChgWho (ADJ.chg_who)
   * @return String the value
   */
  public String getChgWho () {
    return this.ChgWho;
  }
  /** Change the field to not being actively set: ChgWho (ADJ.chg_who)
   */
  public void unsetChgWho () {
    this._ChgWhoSet = false;
  }
  /** See if the field is actively set: ChgWho (ADJ.chg_who)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgWho () {
    return this._ChgWhoSet;
  }
  /** set the fields value: ChgDate (ADJ.chg_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ChgDate") 
  public void setChgDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ChgDate", "setChgDate");
    }
    this.ChgDate = value;
    this._ChgDateSet = true;
  }

  /** Retrieves the ChgDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ChgDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDate field
   */
   public String getChgDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDateAsFormattedString");
       return fmtMgr.formatDate(this.getChgDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the ChgDate field from a formatted string
   *
   * @param _value the ChgDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChgDate field
   */
   public void setChgDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setChgDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgDateFromFormattedString");
   }

  /**
   * Retrieves the ChgDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDate field
   */
  public String getChgDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getChgDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ChgDate field value from a formatted date/time string
   *
   * @param _value the ChgDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChgDate field
   */
  public void setChgDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setChgDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: ChgDate (ADJ.chg_date)
   * @return Date the value
   */
  public Date getChgDate () {
    return this.ChgDate;
  }
  /** Change the field to not being actively set: ChgDate (ADJ.chg_date)
   */
  public void unsetChgDate () {
    this._ChgDateSet = false;
  }
  /** See if the field is actively set: ChgDate (ADJ.chg_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgDate () {
    return this._ChgDateSet;
  }
  /** set the fields value: BalanceChgDate (ADJ.balance_chg_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BalanceChgDate") 
  public void setBalanceChgDate (Date value) throws ServiceException
  {
    this.BalanceChgDate = value;
    this._BalanceChgDateSet = true;
  }

  /** Retrieves the BalanceChgDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BalanceChgDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BalanceChgDate field
   */
   public String getBalanceChgDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceChgDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceChgDateAsFormattedString");
       return fmtMgr.formatDate(this.getBalanceChgDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BalanceChgDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBalanceChgDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the BalanceChgDate field from a formatted string
   *
   * @param _value the BalanceChgDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BalanceChgDate field
   */
   public void setBalanceChgDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceChgDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBalanceChgDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BalanceChgDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBalanceChgDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBalanceChgDateFromFormattedString");
   }

  /**
   * Retrieves the BalanceChgDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BalanceChgDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the BalanceChgDate field
   */
  public String getBalanceChgDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceChgDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceChgDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getBalanceChgDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BalanceChgDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBalanceChgDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the BalanceChgDate field value from a formatted date/time string
   *
   * @param _value the BalanceChgDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BalanceChgDate field
   */
  public void setBalanceChgDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBalanceChgDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setBalanceChgDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BalanceChgDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBalanceChgDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: BalanceChgDate (ADJ.balance_chg_date)
   * @return Date the value
   */
  public Date getBalanceChgDate () {
    return this.BalanceChgDate;
  }
  /** Change the field to not being actively set: BalanceChgDate (ADJ.balance_chg_date)
   */
  public void unsetBalanceChgDate () {
    this._BalanceChgDateSet = false;
  }
  /** See if the field is actively set: BalanceChgDate (ADJ.balance_chg_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetBalanceChgDate () {
    return this._BalanceChgDateSet;
  }
  /** set the fields value: BRevRcvCostCtr (ADJ.b_rev_rcv_cost_ctr)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BRevRcvCostCtr") 
  public void setBRevRcvCostCtr (Integer value) throws ServiceException
  {
    this.BRevRcvCostCtr = value;
    this._BRevRcvCostCtrSet = true;
  }

  /** Retrieves the BRevRcvCostCtr field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BRevRcvCostCtr field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BRevRcvCostCtr field
   */
   public String getBRevRcvCostCtrAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBRevRcvCostCtrAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBRevRcvCostCtrAsFormattedString");
       return fmtMgr.formatNumber(this.getBRevRcvCostCtr(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BRevRcvCostCtr");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBRevRcvCostCtrAsFormattedString");
       throw x;
     }
   }
  /** Sets the BRevRcvCostCtr field from a formatted string
   *
   * @param _value the BRevRcvCostCtr field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BRevRcvCostCtr field
   */
   public void setBRevRcvCostCtrFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBRevRcvCostCtrFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBRevRcvCostCtr(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BRevRcvCostCtr");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBRevRcvCostCtrFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBRevRcvCostCtrFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated BRevRcvCostCtr field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the BRevRcvCostCtr field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BRevRcvCostCtr field
   */

  public String getBRevRcvCostCtrDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBRevRcvCostCtrDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getBRevRcvCostCtrEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBRevRcvCostCtrDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getBRevRcvCostCtr()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BRevRcvCostCtr");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBRevRcvCostCtrDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated BRevRcvCostCtr field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the BRevRcvCostCtr field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BRevRcvCostCtr field
   */
  public Enumeration getBRevRcvCostCtrEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBRevRcvCostCtrEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("RevRcvCostCenter", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBRevRcvCostCtrEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BRevRcvCostCtr");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBRevRcvCostCtrEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated BRevRcvCostCtr field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setBRevRcvCostCtrFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBRevRcvCostCtrFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getBRevRcvCostCtrEnumeration(_locale);
      this.setBRevRcvCostCtr((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BRevRcvCostCtr");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBRevRcvCostCtrFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBRevRcvCostCtrFromDisplayValue");
  }

  /** get the value of the field: BRevRcvCostCtr (ADJ.b_rev_rcv_cost_ctr)
   * @return Integer the value
   */
  public Integer getBRevRcvCostCtr () {
    return this.BRevRcvCostCtr;
  }
  /** Change the field to not being actively set: BRevRcvCostCtr (ADJ.b_rev_rcv_cost_ctr)
   */
  public void unsetBRevRcvCostCtr () {
    this._BRevRcvCostCtrSet = false;
  }
  /** See if the field is actively set: BRevRcvCostCtr (ADJ.b_rev_rcv_cost_ctr)
   * @return boolean whether the field is actively set
   */
  public boolean issetBRevRcvCostCtr () {
    return this._BRevRcvCostCtrSet;
  }
  /** set the fields value: OrigSplitRowNum (ADJ.orig_split_row_num)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OrigSplitRowNum") 
  public void setOrigSplitRowNum (Integer value) throws ServiceException
  {
    this.OrigSplitRowNum = value;
    this._OrigSplitRowNumSet = true;
  }

  /** Retrieves the OrigSplitRowNum field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OrigSplitRowNum field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigSplitRowNum field
   */
   public String getOrigSplitRowNumAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigSplitRowNumAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigSplitRowNumAsFormattedString");
       return fmtMgr.formatNumber(this.getOrigSplitRowNum(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigSplitRowNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigSplitRowNumAsFormattedString");
       throw x;
     }
   }
  /** Sets the OrigSplitRowNum field from a formatted string
   *
   * @param _value the OrigSplitRowNum field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OrigSplitRowNum field
   */
   public void setOrigSplitRowNumFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigSplitRowNumFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOrigSplitRowNum(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigSplitRowNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigSplitRowNumFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigSplitRowNumFromFormattedString");
   }

  /** get the value of the field: OrigSplitRowNum (ADJ.orig_split_row_num)
   * @return Integer the value
   */
  public Integer getOrigSplitRowNum () {
    return this.OrigSplitRowNum;
  }
  /** Change the field to not being actively set: OrigSplitRowNum (ADJ.orig_split_row_num)
   */
  public void unsetOrigSplitRowNum () {
    this._OrigSplitRowNumSet = false;
  }
  /** See if the field is actively set: OrigSplitRowNum (ADJ.orig_split_row_num)
   * @return boolean whether the field is actively set
   */
  public boolean issetOrigSplitRowNum () {
    return this._OrigSplitRowNumSet;
  }
  /** set the fields value: TaxTypeCode (ADJ.tax_type_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TaxTypeCode") 
  public void setTaxTypeCode (Integer value) throws ServiceException
  {
    this.TaxTypeCode = value;
    this._TaxTypeCodeSet = true;
  }

  /** Retrieves the TaxTypeCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TaxTypeCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxTypeCode field
   */
   public String getTaxTypeCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxTypeCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxTypeCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getTaxTypeCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxTypeCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxTypeCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the TaxTypeCode field from a formatted string
   *
   * @param _value the TaxTypeCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TaxTypeCode field
   */
   public void setTaxTypeCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxTypeCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTaxTypeCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxTypeCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxTypeCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxTypeCodeFromFormattedString");
   }

  /** get the value of the field: TaxTypeCode (ADJ.tax_type_code)
   * @return Integer the value
   */
  public Integer getTaxTypeCode () {
    return this.TaxTypeCode;
  }
  /** Change the field to not being actively set: TaxTypeCode (ADJ.tax_type_code)
   */
  public void unsetTaxTypeCode () {
    this._TaxTypeCodeSet = false;
  }
  /** See if the field is actively set: TaxTypeCode (ADJ.tax_type_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetTaxTypeCode () {
    return this._TaxTypeCodeSet;
  }
  /** set the fields value: OrigSubmitterName (ADJ.orig_submitter_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OrigSubmitterName") 
  public void setOrigSubmitterName (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "OrigSubmitterName", "setOrigSubmitterName");
    }
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "OrigSubmitterName", "setOrigSubmitterName");
    }
    this.OrigSubmitterName = value;
    this._OrigSubmitterNameSet = true;
  }

  /** Retrieves the OrigSubmitterName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OrigSubmitterName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigSubmitterName field
   */
   public String getOrigSubmitterNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigSubmitterNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigSubmitterNameAsFormattedString");
       return fmtMgr.formatString(this.getOrigSubmitterName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigSubmitterName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigSubmitterNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the OrigSubmitterName field from a formatted string
   *
   * @param _value the OrigSubmitterName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OrigSubmitterName field
   */
   public void setOrigSubmitterNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigSubmitterNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOrigSubmitterName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigSubmitterName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigSubmitterNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigSubmitterNameFromFormattedString");
   }

  /** get the value of the field: OrigSubmitterName (ADJ.orig_submitter_name)
   * @return String the value
   */
  public String getOrigSubmitterName () {
    return this.OrigSubmitterName;
  }
  /** Change the field to not being actively set: OrigSubmitterName (ADJ.orig_submitter_name)
   */
  public void unsetOrigSubmitterName () {
    this._OrigSubmitterNameSet = false;
  }
  /** See if the field is actively set: OrigSubmitterName (ADJ.orig_submitter_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetOrigSubmitterName () {
    return this._OrigSubmitterNameSet;
  }
  /** set the fields value: LastReviewedName (ADJ.last_reviewed_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("LastReviewedName") 
  public void setLastReviewedName (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "LastReviewedName", "setLastReviewedName");
    }
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "LastReviewedName", "setLastReviewedName");
    }
    this.LastReviewedName = value;
    this._LastReviewedNameSet = true;
  }

  /** Retrieves the LastReviewedName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The LastReviewedName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LastReviewedName field
   */
   public String getLastReviewedNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLastReviewedNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLastReviewedNameAsFormattedString");
       return fmtMgr.formatString(this.getLastReviewedName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LastReviewedName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getLastReviewedNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the LastReviewedName field from a formatted string
   *
   * @param _value the LastReviewedName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the LastReviewedName field
   */
   public void setLastReviewedNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLastReviewedNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setLastReviewedName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LastReviewedName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setLastReviewedNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLastReviewedNameFromFormattedString");
   }

  /** get the value of the field: LastReviewedName (ADJ.last_reviewed_name)
   * @return String the value
   */
  public String getLastReviewedName () {
    return this.LastReviewedName;
  }
  /** Change the field to not being actively set: LastReviewedName (ADJ.last_reviewed_name)
   */
  public void unsetLastReviewedName () {
    this._LastReviewedNameSet = false;
  }
  /** See if the field is actively set: LastReviewedName (ADJ.last_reviewed_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetLastReviewedName () {
    return this._LastReviewedNameSet;
  }
  /** set the fields value: Jurisdiction (ADJ.jurisdiction)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Jurisdiction") 
  public void setJurisdiction (Integer value) throws ServiceException
  {
    this.Jurisdiction = value;
    this._JurisdictionSet = true;
  }

  /** Retrieves the Jurisdiction field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Jurisdiction field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Jurisdiction field
   */
   public String getJurisdictionAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getJurisdictionAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getJurisdictionAsFormattedString");
       return fmtMgr.formatNumber(this.getJurisdiction(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Jurisdiction");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getJurisdictionAsFormattedString");
       throw x;
     }
   }
  /** Sets the Jurisdiction field from a formatted string
   *
   * @param _value the Jurisdiction field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Jurisdiction field
   */
   public void setJurisdictionFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getJurisdictionFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setJurisdiction(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Jurisdiction");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setJurisdictionFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setJurisdictionFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated Jurisdiction field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the Jurisdiction field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the Jurisdiction field
   */

  public String getJurisdictionDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getJurisdictionDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getJurisdictionEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getJurisdictionDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getJurisdiction()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Jurisdiction");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getJurisdictionDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated Jurisdiction field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the Jurisdiction field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the Jurisdiction field
   */
  public Enumeration getJurisdictionEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getJurisdictionEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("Jurisdiction", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getJurisdictionEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Jurisdiction");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getJurisdictionEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated Jurisdiction field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setJurisdictionFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setJurisdictionFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getJurisdictionEnumeration(_locale);
      this.setJurisdiction((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Jurisdiction");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setJurisdictionFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setJurisdictionFromDisplayValue");
  }

  /** get the value of the field: Jurisdiction (ADJ.jurisdiction)
   * @return Integer the value
   */
  public Integer getJurisdiction () {
    return this.Jurisdiction;
  }
  /** Change the field to not being actively set: Jurisdiction (ADJ.jurisdiction)
   */
  public void unsetJurisdiction () {
    this._JurisdictionSet = false;
  }
  /** See if the field is actively set: Jurisdiction (ADJ.jurisdiction)
   * @return boolean whether the field is actively set
   */
  public boolean issetJurisdiction () {
    return this._JurisdictionSet;
  }
  /** set the fields value: OpenItemId (ADJ.open_item_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OpenItemId") 
  public void setOpenItemId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "OpenItemId", "setOpenItemId");
    }
    this.OpenItemId = value;
    this._OpenItemIdSet = true;
  }

  /** Retrieves the OpenItemId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OpenItemId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OpenItemId field
   */
   public String getOpenItemIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOpenItemIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOpenItemIdAsFormattedString");
       return fmtMgr.formatNumber(this.getOpenItemId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OpenItemId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOpenItemIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the OpenItemId field from a formatted string
   *
   * @param _value the OpenItemId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OpenItemId field
   */
   public void setOpenItemIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOpenItemIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOpenItemId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OpenItemId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOpenItemIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOpenItemIdFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated OpenItemId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the OpenItemId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the OpenItemId field
   */

  public String getOpenItemIdDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOpenItemIdDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getOpenItemIdEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOpenItemIdDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getOpenItemId()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OpenItemId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOpenItemIdDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated OpenItemId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the OpenItemId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the OpenItemId field
   */
  public Enumeration getOpenItemIdEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOpenItemIdEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("OpenItem", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOpenItemIdEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OpenItemId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOpenItemIdEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated OpenItemId field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setOpenItemIdFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOpenItemIdFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getOpenItemIdEnumeration(_locale);
      this.setOpenItemId((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OpenItemId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOpenItemIdFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOpenItemIdFromDisplayValue");
  }

  /** get the value of the field: OpenItemId (ADJ.open_item_id)
   * @return Integer the value
   */
  public Integer getOpenItemId () {
    return this.OpenItemId;
  }
  /** Change the field to not being actively set: OpenItemId (ADJ.open_item_id)
   */
  public void unsetOpenItemId () {
    this._OpenItemIdSet = false;
  }
  /** See if the field is actively set: OpenItemId (ADJ.open_item_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetOpenItemId () {
    return this._OpenItemIdSet;
  }
  /** set the fields value: BillOrderNumber (ADJ.bill_order_number)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillOrderNumber") 
  public void setBillOrderNumber (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 25))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BillOrderNumber", "setBillOrderNumber");
    }
    this.BillOrderNumber = value;
    this._BillOrderNumberSet = true;
  }

  /** Retrieves the BillOrderNumber field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillOrderNumber field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillOrderNumber field
   */
   public String getBillOrderNumberAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillOrderNumberAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillOrderNumberAsFormattedString");
       return fmtMgr.formatString(this.getBillOrderNumber());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillOrderNumber");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillOrderNumberAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillOrderNumber field from a formatted string
   *
   * @param _value the BillOrderNumber field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillOrderNumber field
   */
   public void setBillOrderNumberFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillOrderNumberFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillOrderNumber(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillOrderNumber");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillOrderNumberFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillOrderNumberFromFormattedString");
   }

  /** get the value of the field: BillOrderNumber (ADJ.bill_order_number)
   * @return String the value
   */
  public String getBillOrderNumber () {
    return this.BillOrderNumber;
  }
  /** Change the field to not being actively set: BillOrderNumber (ADJ.bill_order_number)
   */
  public void unsetBillOrderNumber () {
    this._BillOrderNumberSet = false;
  }
  /** See if the field is actively set: BillOrderNumber (ADJ.bill_order_number)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillOrderNumber () {
    return this._BillOrderNumberSet;
  }
  /** set the fields value: RequestId (ADJ.request_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RequestId") 
  public void setRequestId (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "RequestId", "setRequestId");
    }
    this.RequestId = value;
    this._RequestIdSet = true;
  }

  /** Retrieves the RequestId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RequestId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RequestId field
   */
   public String getRequestIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRequestIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRequestIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getRequestId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RequestId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRequestIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the RequestId field from a formatted string
   *
   * @param _value the RequestId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RequestId field
   */
   public void setRequestIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRequestIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRequestId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RequestId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRequestIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRequestIdFromFormattedString");
   }

  /** get the value of the field: RequestId (ADJ.request_id)
   * @return BigInteger the value
   */
  public BigInteger getRequestId () {
    return this.RequestId;
  }
  /** Change the field to not being actively set: RequestId (ADJ.request_id)
   */
  public void unsetRequestId () {
    this._RequestIdSet = false;
  }
  /** See if the field is actively set: RequestId (ADJ.request_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetRequestId () {
    return this._RequestIdSet;
  }
  public String toString() {
    return AdjustmentObjectHelper.toMap(this, null).toString();
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
  /** PAYMENT_PROFILE.card_account field */
    if(!nonNullOnly || (CcardAccount != null))  _CcardAccountSet = flag;
  /** PAYMENT_PROFILE.ownr_lname field */
    if(!nonNullOnly || (OwnrLname != null))  _OwnrLnameSet = flag;
  /** PAYMENT_PROFILE.ownr_fname field */
    if(!nonNullOnly || (OwnrFname != null))  _OwnrFnameSet = flag;
  /** PAYMENT_PROFILE.card_carrier field */
    if(!nonNullOnly || (CcardCarrier != null))  _CcardCarrierSet = flag;
  /** PAYMENT_PROFILE.card_expire field */
    if(!nonNullOnly || (CcardExpire != null))  _CcardExpireSet = flag;
  /** PAYMENT_PROFILE.avs_address_id field */
    if(!nonNullOnly || (AvsAddressId != null))  _AvsAddressIdSet = flag;
  /** PAYMENT_PROFILE.clearing_house_id field */
    if(!nonNullOnly || (ClearingHouseId != null))  _ClearingHouseIdSet = flag;
  /** PAYMENT_PROFILE.avs_response_code field */
    if(!nonNullOnly || (AvsResponseCode != null))  _AvsResponseCodeSet = flag;
  /** PAYMENT_PROFILE.trans_flag field */
    if(!nonNullOnly || (TransFlag != null))  _TransFlagSet = flag;
  /** CUSTOMER_ID_ACCT_MAP.external_id field */
    if(!nonNullOnly || (AccountExternalId != null))  _AccountExternalIdSet = flag;
  /** CUSTOMER_ID_ACCT_MAP.external_id_type field */
    if(!nonNullOnly || (AccountExternalIdType != null))  _AccountExternalIdTypeSet = flag;
  /** CUSTOMER_ID_EQUIP_MAP_VIEW.external_id field */
    if(!nonNullOnly || (ServiceExternalId != null))  _ServiceExternalIdSet = flag;
  /** CUSTOMER_ID_EQUIP_MAP_VIEW.external_id_type field */
    if(!nonNullOnly || (ServiceExternalIdType != null))  _ServiceExternalIdTypeSet = flag;
  /** ACCOUNT_BALANCES.balance_desc field */
    if(!nonNullOnly || (PrepayBalanceDesc != null))  _PrepayBalanceDescSet = flag;
  /** ADJ_TRANS_DESCR.trans_sign field */
    if(!nonNullOnly || (TransSign != null))  _TransSignSet = flag;
  /** ADJ_TRANS_DESCR.billing_category field */
    if(!nonNullOnly || (BillingCategory != null))  _BillingCategorySet = flag;
  /** ADJ_TRANS_DESCR.trans_target_type field */
    if(!nonNullOnly || (TransTargetType != null))  _TransTargetTypeSet = flag;
  /** ADJ_TRANS_DESCR.is_negative_bill_adj field */
    if(!nonNullOnly || (IsNegativeBillAdj != null))  _IsNegativeBillAdjSet = flag;
  /** ServerId field */
    if (!nonNullOnly || (ServerId != null)) _ServerIdSet = flag;
  /** ADJ.account_no field */
    if(!nonNullOnly || (AccountInternalId != null))  _AccountInternalIdSet = flag;
  /** ADJ.subscr_no field */
    if(!nonNullOnly || (ServiceInternalId != null))  _ServiceInternalIdSet = flag;
  /** ADJ.subscr_no_resets field */
    if(!nonNullOnly || (ServiceInternalIdResets != null))  _ServiceInternalIdResetsSet = flag;
  /** ADJ.adj_trans_code field */
    if(!nonNullOnly || (TransCode != null))  _TransCodeSet = flag;
  /** ADJ.orig_trans_code field */
    if(!nonNullOnly || (OrigTransCode != null))  _OrigTransCodeSet = flag;
  /** ADJ.annotation field */
    if(!nonNullOnly || (Annotation != null))  _AnnotationSet = flag;
  /** ADJ.primary_units_type field */
    if(!nonNullOnly || (PrimaryUnitsType != null))  _PrimaryUnitsTypeSet = flag;
  /** ADJ.primary_units field */
    if(!nonNullOnly || (PrimaryUnits != null))  _PrimaryUnitsSet = flag;
  /** ADJ.transact_date field */
    if(!nonNullOnly || (TransactDate != null))  _TransactDateSet = flag;
  /** ADJ.effective_date field */
    if(!nonNullOnly || (EffectiveDate != null))  _EffectiveDateSet = flag;
  /** ADJ.end_date field */
    if(!nonNullOnly || (InactiveDate != null))  _InactiveDateSet = flag;
  /** ADJ.tracking_id_counter field */
    if(!nonNullOnly || (TrackingIdCounter != null))  _TrackingIdCounterSet = flag;
  /** ADJ.request_status field */
    if(!nonNullOnly || (RequestStatus != null))  _RequestStatusSet = flag;
  /** ADJ.review_date field */
    if(!nonNullOnly || (ReviewDate != null))  _ReviewDateSet = flag;
  /** ADJ.supervisor_name field */
    if(!nonNullOnly || (SupervisorName != null))  _SupervisorNameSet = flag;
  /** ADJ.current_flag field */
    if(!nonNullOnly || (CurrentFlag != null))  _CurrentFlagSet = flag;
  /** ADJ.pending_flag field */
    if(!nonNullOnly || (PendingFlag != null))  _PendingFlagSet = flag;
  /** ADJ.no_bill field */
    if(!nonNullOnly || (NoBill != null))  _NoBillSet = flag;
  /** ADJ.currency_code field */
    if(!nonNullOnly || (CurrencyCode != null))  _CurrencyCodeSet = flag;
  /** ADJ.total_amt field */
    if(!nonNullOnly || (TotalAmt != null))  _TotalAmtSet = flag;
  /** ADJ.rated_flag field */
    if(!nonNullOnly || (RatedFlag != null))  _RatedFlagSet = flag;
  /** ADJ.arch_flag field */
    if(!nonNullOnly || (ArchFlag != null))  _ArchFlagSet = flag;
  /** ADJ.orig_provider_id field */
    if(!nonNullOnly || (OrigProviderId != null))  _OrigProviderIdSet = flag;
  /** ADJ.orig_bill_ref_no field */
    if(!nonNullOnly || (OrigBillRefNo != null))  _OrigBillRefNoSet = flag;
  /** ADJ.orig_bill_ref_resets field */
    if(!nonNullOnly || (OrigBillRefResets != null))  _OrigBillRefResetsSet = flag;
  /** ADJ.orig_bill_invoice_row field */
    if(!nonNullOnly || (OrigBillInvoiceRow != null))  _OrigBillInvoiceRowSet = flag;
  /** ADJ.orig_type field */
    if(!nonNullOnly || (OrigType != null))  _OrigTypeSet = flag;
  /** ADJ.orig_subtype field */
    if(!nonNullOnly || (OrigSubtype != null))  _OrigSubtypeSet = flag;
  /** ADJ.orig_msg_id field */
    if(!nonNullOnly || (OrigMsgId != null))  _OrigMsgIdSet = flag;
  /** ADJ.orig_msg_id2 field */
    if(!nonNullOnly || (OrigMsgId2 != null))  _OrigMsgId2Set = flag;
  /** ADJ.orig_msg_id_serv field */
    if(!nonNullOnly || (OrigMsgIdServ != null))  _OrigMsgIdServSet = flag;
  /** ADJ.orig_tracking_id field */
    if(!nonNullOnly || (OrigTrackingId != null))  _OrigTrackingIdSet = flag;
  /** ADJ.orig_tracking_id_serv field */
    if(!nonNullOnly || (OrigTrackingIdServ != null))  _OrigTrackingIdServSet = flag;
  /** ADJ.orig_tracking_dt field */
    if(!nonNullOnly || (OrigTrackingDt != null))  _OrigTrackingDtSet = flag;
  /** ADJ.orig_rc_from_date field */
    if(!nonNullOnly || (OrigRcFromDate != null))  _OrigRcFromDateSet = flag;
  /** ADJ.bill_ref_no field */
    if(!nonNullOnly || (BillRefNo != null))  _BillRefNoSet = flag;
  /** ADJ.bill_ref_resets field */
    if(!nonNullOnly || (BillRefResets != null))  _BillRefResetsSet = flag;
  /** ADJ.tax_class field */
    if(!nonNullOnly || (TaxClass != null))  _TaxClassSet = flag;
  /** ADJ.tax_pkg_inst_id field */
    if(!nonNullOnly || (TaxPkgInstId != null))  _TaxPkgInstIdSet = flag;
  /** ADJ.geocode field */
    if(!nonNullOnly || (Geocode != null))  _GeocodeSet = flag;
  /** ADJ.aux_tax_info field */
    if(!nonNullOnly || (AuxTaxInfo != null))  _AuxTaxInfoSet = flag;
  /** ADJ.comb_tax_rate field */
    if(!nonNullOnly || (CombTaxRate != null))  _CombTaxRateSet = flag;
  /** ADJ.federal_tax field */
    if(!nonNullOnly || (FederalTax != null))  _FederalTaxSet = flag;
  /** ADJ.state_tax field */
    if(!nonNullOnly || (StateTax != null))  _StateTaxSet = flag;
  /** ADJ.county_tax field */
    if(!nonNullOnly || (CountyTax != null))  _CountyTaxSet = flag;
  /** ADJ.city_tax field */
    if(!nonNullOnly || (CityTax != null))  _CityTaxSet = flag;
  /** ADJ.other_tax field */
    if(!nonNullOnly || (OtherTax != null))  _OtherTaxSet = flag;
  /** ADJ.tax_journal_status field */
    if(!nonNullOnly || (TaxJournalStatus != null))  _TaxJournalStatusSet = flag;
  /** ADJ.discount_amt field */
    if(!nonNullOnly || (DiscountAmt != null))  _DiscountAmtSet = flag;
  /** ADJ.profile_id field */
    if(!nonNullOnly || (ProfileId != null))  _ProfileIdSet = flag;
  /** ADJ.adj_reason_code field */
    if(!nonNullOnly || (AdjReasonCode != null))  _AdjReasonCodeSet = flag;
  /** ADJ.fraud_indicator field */
    if(!nonNullOnly || (FraudIndicator != null))  _FraudIndicatorSet = flag;
  /** ADJ.rev_rcv_cost_ctr field */
    if(!nonNullOnly || (RevRcvCostCtr != null))  _RevRcvCostCtrSet = flag;
  /** ADJ.chg_who field */
    if(!nonNullOnly || (ChgWho != null))  _ChgWhoSet = flag;
  /** ADJ.chg_date field */
    if(!nonNullOnly || (ChgDate != null))  _ChgDateSet = flag;
  /** ADJ.balance_chg_date field */
    if(!nonNullOnly || (BalanceChgDate != null))  _BalanceChgDateSet = flag;
  /** ADJ.b_rev_rcv_cost_ctr field */
    if(!nonNullOnly || (BRevRcvCostCtr != null))  _BRevRcvCostCtrSet = flag;
  /** ADJ.orig_split_row_num field */
    if(!nonNullOnly || (OrigSplitRowNum != null))  _OrigSplitRowNumSet = flag;
  /** ADJ.tax_type_code field */
    if(!nonNullOnly || (TaxTypeCode != null))  _TaxTypeCodeSet = flag;
  /** ADJ.orig_submitter_name field */
    if(!nonNullOnly || (OrigSubmitterName != null))  _OrigSubmitterNameSet = flag;
  /** ADJ.last_reviewed_name field */
    if(!nonNullOnly || (LastReviewedName != null))  _LastReviewedNameSet = flag;
  /** ADJ.jurisdiction field */
    if(!nonNullOnly || (Jurisdiction != null))  _JurisdictionSet = flag;
  /** ADJ.open_item_id field */
    if(!nonNullOnly || (OpenItemId != null))  _OpenItemIdSet = flag;
  /** ADJ.bill_order_number field */
    if(!nonNullOnly || (BillOrderNumber != null))  _BillOrderNumberSet = flag;
  /** ADJ.request_id field */
    if(!nonNullOnly || (RequestId != null))  _RequestIdSet = flag;
  }
}
