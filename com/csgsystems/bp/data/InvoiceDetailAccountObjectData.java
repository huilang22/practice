/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: InvoiceDetailAccountObjectData.java
 * Definition File: Customer/InvoiceDetail.xml
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

import com.csgsystems.bp.data.*;

import com.csgsystems.api.base.BaseObjectData;
  
/** InvoiceDetailAccountObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class InvoiceDetailAccountObjectData extends InvoiceDetailObjectData  implements Serializable
{

  /** CMF.currency_code field */
  public    Integer AccountCurrencyCode  = null;
  protected boolean _AccountCurrencyCodeSet = false;
  /** PAYMENT_PROFILE.cust_bank_sort_code field */
  public    String CustBankSortCode  = null;
  protected boolean _CustBankSortCodeSet = false;
  /** PAYMENT_PROFILE.cust_bank_acc_num field */
  public    String CustBankAccNum  = null;
  protected boolean _CustBankAccNumSet = false;
  /** PAYMENT_PROFILE.alt_bank_acc_num field */
  public    String AltBankAccNum  = null;
  protected boolean _AltBankAccNumSet = false;
  /** PAYMENT_PROFILE.ownr_lname field */
  public    String OwnrLname  = null;
  protected boolean _OwnrLnameSet = false;
  /** PAYMENT_PROFILE.ownr_fname field */
  public    String OwnrFname  = null;
  protected boolean _OwnrFnameSet = false;
  /** PAYMENT_PROFILE.clearing_house_id field */
  public    String ClearingHouseId  = null;
  protected boolean _ClearingHouseIdSet = false;
  /** PAYMENT_PROFILE.bank_agency_code field */
  public    String BankAgencyCode  = null;
  protected boolean _BankAgencyCodeSet = false;
  /** PAYMENT_PROFILE.bank_agency_name field */
  public    String BankAgencyName  = null;
  protected boolean _BankAgencyNameSet = false;
  /** PAYMENT_PROFILE.new_cust_bank_sort_code field */
  public    String NewCustBankSortCode  = null;
  protected boolean _NewCustBankSortCodeSet = false;
  /** PAYMENT_PROFILE.bank_code field */
  public    String BankCode  = null;
  protected boolean _BankCodeSet = false;
  /** PAYMENT_PROFILE.bank_account_type field */
  public    Integer BankAccountType  = null;
  protected boolean _BankAccountTypeSet = false;
  /** PAYMENT_PROFILE.branch_name field */
  public    String BranchName  = null;
  protected boolean _BranchNameSet = false;
  /** PAYMENT_PROFILE.branch_code field */
  public    String BranchCode  = null;
  protected boolean _BranchCodeSet = false;
  /** CUSTOMER_ID_ACCT_MAP.external_id field */
  public    String ParentAccountExternalId  = null;
  protected boolean _ParentAccountExternalIdSet = false;
  /** CUSTOMER_ID_ACCT_MAP.external_id_type field */
  public    Integer ParentAccountExternalIdType  = null;
  protected boolean _ParentAccountExternalIdTypeSet = false;
  /** CUSTOMER_ID_ACCT_MAP.external_id field */
  public    String HierarchyAccountExternalId  = null;
  protected boolean _HierarchyAccountExternalIdSet = false;
  /** CUSTOMER_ID_ACCT_MAP.external_id_type field */
  public    Integer HierarchyAccountExternalIdType  = null;
  protected boolean _HierarchyAccountExternalIdTypeSet = false;
  /** CMF.parent_id field */
  public    Integer ParentId  = null;
  protected boolean _ParentIdSet = false;
  /** CMF.child_count field */
  public    Integer ChildCount  = null;
  protected boolean _ChildCountSet = false;
  /** CMF.hierarchy_id field */
  public    Integer HierarchyId  = null;
  protected boolean _HierarchyIdSet = false;
  /** CMF.tie_code field */
  public    Integer TieCode  = null;
  protected boolean _TieCodeSet = false;
  /** CMF.account_type field */
  public    Integer AccountType  = null;
  protected boolean _AccountTypeSet = false;
  /** CMF.account_category field */
  public    Integer AccountCategory  = null;
  protected boolean _AccountCategorySet = false;
  /** CMF.prev_cutoff_date field */
  public    Date PrevCutoffDate  = null;
  protected boolean _PrevCutoffDateSet = false;
  /** CMF.prev_bill_date field */
  public    Date PrevBillDate  = null;
  protected boolean _PrevBillDateSet = false;
  /** CMF.next_bill_date field */
  public    Date NextBillDate  = null;
  protected boolean _NextBillDateSet = false;
  /** CMF.prev_bill_refno field */
  public    Integer PrevBillRefno  = null;
  protected boolean _PrevBillRefnoSet = false;
  /** CMF.prev_bill_ref_resets field */
  public    Integer PrevBillRefResets  = null;
  protected boolean _PrevBillRefResetsSet = false;
  /** CMF.prev_balance_refno field */
  public    Integer PrevBalanceRefno  = null;
  protected boolean _PrevBalanceRefnoSet = false;
  /** CMF.prev_balance_ref_resets field */
  public    Integer PrevBalanceRefResets  = null;
  protected boolean _PrevBalanceRefResetsSet = false;
  /** CMF.bill_name_pre field */
  public    String BillNamePre  = null;
  protected boolean _BillNamePreSet = false;
  /** CMF.bill_fname field */
  public    String BillFname  = null;
  protected boolean _BillFnameSet = false;
  /** CMF.bill_minit field */
  public    String BillMinit  = null;
  protected boolean _BillMinitSet = false;
  /** CMF.bill_lname field */
  public    String BillLname  = null;
  protected boolean _BillLnameSet = false;
  /** CMF.bill_name_generation field */
  public    String BillNameGeneration  = null;
  protected boolean _BillNameGenerationSet = false;
  /** CMF.bill_title field */
  public    String BillTitle  = null;
  protected boolean _BillTitleSet = false;
  /** CMF.bill_company field */
  public    String BillCompany  = null;
  protected boolean _BillCompanySet = false;
  /** CMF.cust_address1 field */
  public    String CustAddress1  = null;
  protected boolean _CustAddress1Set = false;
  /** CMF.cust_address2 field */
  public    String CustAddress2  = null;
  protected boolean _CustAddress2Set = false;
  /** CMF.cust_address3 field */
  public    String CustAddress3  = null;
  protected boolean _CustAddress3Set = false;
  /** CMF.cust_city field */
  public    String CustCity  = null;
  protected boolean _CustCitySet = false;
  /** CMF.cust_state field */
  public    String CustState  = null;
  protected boolean _CustStateSet = false;
  /** CMF.cust_zip field */
  public    String CustZip  = null;
  protected boolean _CustZipSet = false;
  /** CMF.cust_country_code field */
  public    Integer CustCountryCode  = null;
  protected boolean _CustCountryCodeSet = false;
  /** CMF.cust_franchise_tax_code field */
  public    Integer CustFranchiseTaxCode  = null;
  protected boolean _CustFranchiseTaxCodeSet = false;
  /** CMF.cust_geocode field */
  public    String CustGeocode  = null;
  protected boolean _CustGeocodeSet = false;
  /** CMF.cust_county field */
  public    String CustCounty  = null;
  protected boolean _CustCountySet = false;
  /** CMF.cust_phone1 field */
  public    String CustPhone1  = null;
  protected boolean _CustPhone1Set = false;
  /** CMF.cust_phone2 field */
  public    String CustPhone2  = null;
  protected boolean _CustPhone2Set = false;
  /** CMF.bill_address1 field */
  public    String BillAddress1  = null;
  protected boolean _BillAddress1Set = false;
  /** CMF.bill_address2 field */
  public    String BillAddress2  = null;
  protected boolean _BillAddress2Set = false;
  /** CMF.bill_address3 field */
  public    String BillAddress3  = null;
  protected boolean _BillAddress3Set = false;
  /** CMF.bill_city field */
  public    String BillCity  = null;
  protected boolean _BillCitySet = false;
  /** CMF.bill_state field */
  public    String BillState  = null;
  protected boolean _BillStateSet = false;
  /** CMF.bill_zip field */
  public    String BillZip  = null;
  protected boolean _BillZipSet = false;
  /** CMF.bill_country_code field */
  public    Integer BillCountryCode  = null;
  protected boolean _BillCountryCodeSet = false;
  /** CMF.bill_franchise_tax_code field */
  public    Integer BillFranchiseTaxCode  = null;
  protected boolean _BillFranchiseTaxCodeSet = false;
  /** CMF.bill_county field */
  public    String BillCounty  = null;
  protected boolean _BillCountySet = false;
  /** CMF.bill_geocode field */
  public    String BillGeocode  = null;
  protected boolean _BillGeocodeSet = false;
  /** CMF.ssn field */
  public    String Ssn  = null;
  protected boolean _SsnSet = false;
  /** CMF.contact1_name field */
  public    String Contact1Name  = null;
  protected boolean _Contact1NameSet = false;
  /** CMF.contact2_name field */
  public    String Contact2Name  = null;
  protected boolean _Contact2NameSet = false;
  /** CMF.contact1_phone field */
  public    String Contact1Phone  = null;
  protected boolean _Contact1PhoneSet = false;
  /** CMF.contact2_phone field */
  public    String Contact2Phone  = null;
  protected boolean _Contact2PhoneSet = false;
  /** CMF.cust_faxno field */
  public    String CustFaxno  = null;
  protected boolean _CustFaxnoSet = false;
  /** CMF.statement_to_faxno field */
  public    String StatementToFaxno  = null;
  protected boolean _StatementToFaxnoSet = false;
  /** CMF.credit_thresh field */
  public    BigInteger CreditThresh  = null;
  protected boolean _CreditThreshSet = false;
  /** CMF.cred_status field */
  public    Integer CredStatus  = null;
  protected boolean _CredStatusSet = false;
  /** CMF.credit_rating field */
  public    Integer CreditRating  = null;
  protected boolean _CreditRatingSet = false;
  /** CMF.disconnect_reason field */
  public    Integer DisconnectReason  = null;
  protected boolean _DisconnectReasonSet = false;
  /** CMF.disc_rcv_opt field */
  public    Integer DiscRcvOpt  = null;
  protected boolean _DiscRcvOptSet = false;
  /** CMF.thresh_ref field */
  public    Integer ThreshRef  = null;
  protected boolean _ThreshRefSet = false;
  /** CMF.bill_period field */
  public    String BillPeriod  = null;
  protected boolean _BillPeriodSet = false;
  /** CMF.billing_frequency field */
  public    Integer BillingFrequency  = null;
  protected boolean _BillingFrequencySet = false;
  /** CMF.bill_fmt_opt field */
  public    Integer BillFmtOpt  = null;
  protected boolean _BillFmtOptSet = false;
  /** CMF.bill_disp_meth field */
  public    Integer BillDispMeth  = null;
  protected boolean _BillDispMethSet = false;
  /** CMF.bill_hold_code field */
  public    Integer BillHoldCode  = null;
  protected boolean _BillHoldCodeSet = false;
  /** CMF.msg_grp_id field */
  public    Integer MsgGrpId  = null;
  protected boolean _MsgGrpIdSet = false;
  /** CMF.insert_grp_id field */
  public    Integer InsertGrpId  = null;
  protected boolean _InsertGrpIdSet = false;
  /** CMF.rate_class_default field */
  public    Integer RateClassDefault  = null;
  protected boolean _RateClassDefaultSet = false;
  /** CMF.rate_class_special field */
  public    Integer RateClassSpecial  = null;
  protected boolean _RateClassSpecialSet = false;
  /** CMF.exrate_class field */
  public    Integer ExrateClass  = null;
  protected boolean _ExrateClassSet = false;
  /** CMF.plan_id_discount field */
  public    Integer PlanIdDiscount  = null;
  protected boolean _PlanIdDiscountSet = false;
  /** CMF.plan_id_credit field */
  public    Integer PlanIdCredit  = null;
  protected boolean _PlanIdCreditSet = false;
  /** CMF.account_status field */
  public    Integer AccountStatus  = null;
  protected boolean _AccountStatusSet = false;
  /** CMF.account_status_dt field */
  public    Date AccountStatusDt  = null;
  protected boolean _AccountStatusDtSet = false;
  /** CMF.distr_chan field */
  public    String DistrChan  = null;
  protected boolean _DistrChanSet = false;
  /** CMF.sales_code field */
  public    String SalesCode  = null;
  protected boolean _SalesCodeSet = false;
  /** CMF.mkt_code field */
  public    Integer MktCode  = null;
  protected boolean _MktCodeSet = false;
  /** CMF.sic_code field */
  public    Integer SicCode  = null;
  protected boolean _SicCodeSet = false;
  /** CMF.in_use field */
  public    String InUse  = null;
  protected boolean _InUseSet = false;
  /** CMF.no_bill field */
  public    Boolean NoBill  = null;
  protected boolean _NoBillSet = false;
  /** CMF.collection_indicator field */
  public    Integer CollectionIndicator  = null;
  protected boolean _CollectionIndicatorSet = false;
  /** CMF.collection_status field */
  public    Integer CollectionStatus  = null;
  protected boolean _CollectionStatusSet = false;
  /** CMF.collection_history field */
  public    String CollectionHistory  = null;
  protected boolean _CollectionHistorySet = false;
  /** CMF.vip_code field */
  public    Integer VipCode  = null;
  protected boolean _VipCodeSet = false;
  /** CMF.purchase_order field */
  public    String PurchaseOrder  = null;
  protected boolean _PurchaseOrderSet = false;
  /** CMF.codeword field */
  public    String Codeword  = null;
  protected boolean _CodewordSet = false;
  /** CMF.remark field */
  public    String Remark  = null;
  protected boolean _RemarkSet = false;
  /** CMF.cust_email field */
  public    String CustEmail  = null;
  protected boolean _CustEmailSet = false;
  /** CMF.statement_to_email field */
  public    String StatementToEmail  = null;
  protected boolean _StatementToEmailSet = false;
  /** CMF.chg_who field */
  public    String ChgWho  = null;
  protected boolean _ChgWhoSet = false;
  /** CMF.chg_date field */
  public    Date ChgDate  = null;
  protected boolean _ChgDateSet = false;
  /** CMF.date_created field */
  public    Date DateCreated  = null;
  protected boolean _DateCreatedSet = false;
  /** CMF.date_active field */
  public    Date DateActive  = null;
  protected boolean _DateActiveSet = false;
  /** CMF.date_inactive field */
  public    Date DateInactive  = null;
  protected boolean _DateInactiveSet = false;
  /** CMF.owning_cost_ctr field */
  public    Integer OwningCostCtr  = null;
  protected boolean _OwningCostCtrSet = false;
  /** CMF.acct_seg_id field */
  public    Integer AcctSegId  = null;
  protected boolean _AcctSegIdSet = false;
  /** CMF.converted field */
  public    Integer Converted  = null;
  protected boolean _ConvertedSet = false;
  /** CMF.charge_threshold field */
  public    BigInteger ChargeThreshold  = null;
  protected boolean _ChargeThresholdSet = false;
  /** CMF.threshold field */
  public    BigInteger Threshold  = null;
  protected boolean _ThresholdSet = false;
  /** CMF.cyclical_threshold field */
  public    BigInteger CyclicalThreshold  = null;
  protected boolean _CyclicalThresholdSet = false;
  /** CMF.usg_amt_limit field */
  public    BigInteger UsgAmtLimit  = null;
  protected boolean _UsgAmtLimitSet = false;
  /** CMF.usg_units_limit field */
  public    BigInteger UsgUnitsLimit  = null;
  protected boolean _UsgUnitsLimitSet = false;
  /** CMF.regulatory_id field */
  public    Integer RegulatoryId  = null;
  protected boolean _RegulatoryIdSet = false;
  /** CMF.global_contract_status field */
  public    Integer GlobalContractStatus  = null;
  protected boolean _GlobalContractStatusSet = false;
  /** CMF.alt_lname field */
  public    String AltLname  = null;
  protected boolean _AltLnameSet = false;
  /** CMF.alt_fname field */
  public    String AltFname  = null;
  protected boolean _AltFnameSet = false;
  /** CMF.alt_company_name field */
  public    String AltCompanyName  = null;
  protected boolean _AltCompanyNameSet = false;
  /** CMF.gender field */
  public    Integer Gender  = null;
  protected boolean _GenderSet = false;
  /** CMF.dept field */
  public    String Dept  = null;
  protected boolean _DeptSet = false;
  /** CMF.title field */
  public    String Title  = null;
  protected boolean _TitleSet = false;
  /** CMF.payment_profile_id field */
  public    BigInteger PaymentProfileId  = null;
  protected boolean _PaymentProfileIdSet = false;
  /** CMF.account_process_flag field */
  public    Integer AccountProcessFlag  = null;
  protected boolean _AccountProcessFlagSet = false;
  /** CMF.sd_agency_id field */
  public    String SdAgencyId  = null;
  protected boolean _SdAgencyIdSet = false;
  /** CMF.customer_lifetime_id field */
  public    Integer CustomerLifetimeId  = null;
  protected boolean _CustomerLifetimeIdSet = false;
  /** CMF.customer_lifetime_id2 field */
  public    Integer CustomerLifetimeId2  = null;
  protected boolean _CustomerLifetimeId2Set = false;
  /** CMF.auto_writeoff_status field */
  public    Integer AutoWriteoffStatus  = null;
  protected boolean _AutoWriteoffStatusSet = false;
  private String _objName = "InvoiceDetailAccountObjectData";
  /** Default constructor */
  public InvoiceDetailAccountObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public InvoiceDetailAccountObjectData (InvoiceDetailAccountObjectData other)
  {

    super (other);

    if (other == null) return;
    this.AccountCurrencyCode = other.AccountCurrencyCode;
    this._AccountCurrencyCodeSet = other._AccountCurrencyCodeSet;
    this.CustBankSortCode = other.CustBankSortCode;
    this._CustBankSortCodeSet = other._CustBankSortCodeSet;
    this.CustBankAccNum = other.CustBankAccNum;
    this._CustBankAccNumSet = other._CustBankAccNumSet;
    this.AltBankAccNum = other.AltBankAccNum;
    this._AltBankAccNumSet = other._AltBankAccNumSet;
    this.OwnrLname = other.OwnrLname;
    this._OwnrLnameSet = other._OwnrLnameSet;
    this.OwnrFname = other.OwnrFname;
    this._OwnrFnameSet = other._OwnrFnameSet;
    this.ClearingHouseId = other.ClearingHouseId;
    this._ClearingHouseIdSet = other._ClearingHouseIdSet;
    this.BankAgencyCode = other.BankAgencyCode;
    this._BankAgencyCodeSet = other._BankAgencyCodeSet;
    this.BankAgencyName = other.BankAgencyName;
    this._BankAgencyNameSet = other._BankAgencyNameSet;
    this.NewCustBankSortCode = other.NewCustBankSortCode;
    this._NewCustBankSortCodeSet = other._NewCustBankSortCodeSet;
    this.BankCode = other.BankCode;
    this._BankCodeSet = other._BankCodeSet;
    this.BankAccountType = other.BankAccountType;
    this._BankAccountTypeSet = other._BankAccountTypeSet;
    this.BranchName = other.BranchName;
    this._BranchNameSet = other._BranchNameSet;
    this.BranchCode = other.BranchCode;
    this._BranchCodeSet = other._BranchCodeSet;
    this.ParentAccountExternalId = other.ParentAccountExternalId;
    this._ParentAccountExternalIdSet = other._ParentAccountExternalIdSet;
    this.ParentAccountExternalIdType = other.ParentAccountExternalIdType;
    this._ParentAccountExternalIdTypeSet = other._ParentAccountExternalIdTypeSet;
    this.HierarchyAccountExternalId = other.HierarchyAccountExternalId;
    this._HierarchyAccountExternalIdSet = other._HierarchyAccountExternalIdSet;
    this.HierarchyAccountExternalIdType = other.HierarchyAccountExternalIdType;
    this._HierarchyAccountExternalIdTypeSet = other._HierarchyAccountExternalIdTypeSet;
    this.ParentId = other.ParentId;
    this._ParentIdSet = other._ParentIdSet;
    this.ChildCount = other.ChildCount;
    this._ChildCountSet = other._ChildCountSet;
    this.HierarchyId = other.HierarchyId;
    this._HierarchyIdSet = other._HierarchyIdSet;
    this.TieCode = other.TieCode;
    this._TieCodeSet = other._TieCodeSet;
    this.AccountType = other.AccountType;
    this._AccountTypeSet = other._AccountTypeSet;
    this.AccountCategory = other.AccountCategory;
    this._AccountCategorySet = other._AccountCategorySet;
    this.PrevCutoffDate = other.PrevCutoffDate;
    this._PrevCutoffDateSet = other._PrevCutoffDateSet;
    this.PrevBillDate = other.PrevBillDate;
    this._PrevBillDateSet = other._PrevBillDateSet;
    this.NextBillDate = other.NextBillDate;
    this._NextBillDateSet = other._NextBillDateSet;
    this.PrevBillRefno = other.PrevBillRefno;
    this._PrevBillRefnoSet = other._PrevBillRefnoSet;
    this.PrevBillRefResets = other.PrevBillRefResets;
    this._PrevBillRefResetsSet = other._PrevBillRefResetsSet;
    this.PrevBalanceRefno = other.PrevBalanceRefno;
    this._PrevBalanceRefnoSet = other._PrevBalanceRefnoSet;
    this.PrevBalanceRefResets = other.PrevBalanceRefResets;
    this._PrevBalanceRefResetsSet = other._PrevBalanceRefResetsSet;
    this.BillNamePre = other.BillNamePre;
    this._BillNamePreSet = other._BillNamePreSet;
    this.BillFname = other.BillFname;
    this._BillFnameSet = other._BillFnameSet;
    this.BillMinit = other.BillMinit;
    this._BillMinitSet = other._BillMinitSet;
    this.BillLname = other.BillLname;
    this._BillLnameSet = other._BillLnameSet;
    this.BillNameGeneration = other.BillNameGeneration;
    this._BillNameGenerationSet = other._BillNameGenerationSet;
    this.BillTitle = other.BillTitle;
    this._BillTitleSet = other._BillTitleSet;
    this.BillCompany = other.BillCompany;
    this._BillCompanySet = other._BillCompanySet;
    this.CustAddress1 = other.CustAddress1;
    this._CustAddress1Set = other._CustAddress1Set;
    this.CustAddress2 = other.CustAddress2;
    this._CustAddress2Set = other._CustAddress2Set;
    this.CustAddress3 = other.CustAddress3;
    this._CustAddress3Set = other._CustAddress3Set;
    this.CustCity = other.CustCity;
    this._CustCitySet = other._CustCitySet;
    this.CustState = other.CustState;
    this._CustStateSet = other._CustStateSet;
    this.CustZip = other.CustZip;
    this._CustZipSet = other._CustZipSet;
    this.CustCountryCode = other.CustCountryCode;
    this._CustCountryCodeSet = other._CustCountryCodeSet;
    this.CustFranchiseTaxCode = other.CustFranchiseTaxCode;
    this._CustFranchiseTaxCodeSet = other._CustFranchiseTaxCodeSet;
    this.CustGeocode = other.CustGeocode;
    this._CustGeocodeSet = other._CustGeocodeSet;
    this.CustCounty = other.CustCounty;
    this._CustCountySet = other._CustCountySet;
    this.CustPhone1 = other.CustPhone1;
    this._CustPhone1Set = other._CustPhone1Set;
    this.CustPhone2 = other.CustPhone2;
    this._CustPhone2Set = other._CustPhone2Set;
    this.BillAddress1 = other.BillAddress1;
    this._BillAddress1Set = other._BillAddress1Set;
    this.BillAddress2 = other.BillAddress2;
    this._BillAddress2Set = other._BillAddress2Set;
    this.BillAddress3 = other.BillAddress3;
    this._BillAddress3Set = other._BillAddress3Set;
    this.BillCity = other.BillCity;
    this._BillCitySet = other._BillCitySet;
    this.BillState = other.BillState;
    this._BillStateSet = other._BillStateSet;
    this.BillZip = other.BillZip;
    this._BillZipSet = other._BillZipSet;
    this.BillCountryCode = other.BillCountryCode;
    this._BillCountryCodeSet = other._BillCountryCodeSet;
    this.BillFranchiseTaxCode = other.BillFranchiseTaxCode;
    this._BillFranchiseTaxCodeSet = other._BillFranchiseTaxCodeSet;
    this.BillCounty = other.BillCounty;
    this._BillCountySet = other._BillCountySet;
    this.BillGeocode = other.BillGeocode;
    this._BillGeocodeSet = other._BillGeocodeSet;
    this.Ssn = other.Ssn;
    this._SsnSet = other._SsnSet;
    this.Contact1Name = other.Contact1Name;
    this._Contact1NameSet = other._Contact1NameSet;
    this.Contact2Name = other.Contact2Name;
    this._Contact2NameSet = other._Contact2NameSet;
    this.Contact1Phone = other.Contact1Phone;
    this._Contact1PhoneSet = other._Contact1PhoneSet;
    this.Contact2Phone = other.Contact2Phone;
    this._Contact2PhoneSet = other._Contact2PhoneSet;
    this.CustFaxno = other.CustFaxno;
    this._CustFaxnoSet = other._CustFaxnoSet;
    this.StatementToFaxno = other.StatementToFaxno;
    this._StatementToFaxnoSet = other._StatementToFaxnoSet;
    this.CreditThresh = other.CreditThresh;
    this._CreditThreshSet = other._CreditThreshSet;
    this.CredStatus = other.CredStatus;
    this._CredStatusSet = other._CredStatusSet;
    this.CreditRating = other.CreditRating;
    this._CreditRatingSet = other._CreditRatingSet;
    this.DisconnectReason = other.DisconnectReason;
    this._DisconnectReasonSet = other._DisconnectReasonSet;
    this.DiscRcvOpt = other.DiscRcvOpt;
    this._DiscRcvOptSet = other._DiscRcvOptSet;
    this.ThreshRef = other.ThreshRef;
    this._ThreshRefSet = other._ThreshRefSet;
    this.BillPeriod = other.BillPeriod;
    this._BillPeriodSet = other._BillPeriodSet;
    this.BillingFrequency = other.BillingFrequency;
    this._BillingFrequencySet = other._BillingFrequencySet;
    this.BillFmtOpt = other.BillFmtOpt;
    this._BillFmtOptSet = other._BillFmtOptSet;
    this.BillDispMeth = other.BillDispMeth;
    this._BillDispMethSet = other._BillDispMethSet;
    this.BillHoldCode = other.BillHoldCode;
    this._BillHoldCodeSet = other._BillHoldCodeSet;
    this.MsgGrpId = other.MsgGrpId;
    this._MsgGrpIdSet = other._MsgGrpIdSet;
    this.InsertGrpId = other.InsertGrpId;
    this._InsertGrpIdSet = other._InsertGrpIdSet;
    this.RateClassDefault = other.RateClassDefault;
    this._RateClassDefaultSet = other._RateClassDefaultSet;
    this.RateClassSpecial = other.RateClassSpecial;
    this._RateClassSpecialSet = other._RateClassSpecialSet;
    this.ExrateClass = other.ExrateClass;
    this._ExrateClassSet = other._ExrateClassSet;
    this.PlanIdDiscount = other.PlanIdDiscount;
    this._PlanIdDiscountSet = other._PlanIdDiscountSet;
    this.PlanIdCredit = other.PlanIdCredit;
    this._PlanIdCreditSet = other._PlanIdCreditSet;
    this.AccountStatus = other.AccountStatus;
    this._AccountStatusSet = other._AccountStatusSet;
    this.AccountStatusDt = other.AccountStatusDt;
    this._AccountStatusDtSet = other._AccountStatusDtSet;
    this.DistrChan = other.DistrChan;
    this._DistrChanSet = other._DistrChanSet;
    this.SalesCode = other.SalesCode;
    this._SalesCodeSet = other._SalesCodeSet;
    this.MktCode = other.MktCode;
    this._MktCodeSet = other._MktCodeSet;
    this.SicCode = other.SicCode;
    this._SicCodeSet = other._SicCodeSet;
    this.InUse = other.InUse;
    this._InUseSet = other._InUseSet;
    this.NoBill = other.NoBill;
    this._NoBillSet = other._NoBillSet;
    this.CollectionIndicator = other.CollectionIndicator;
    this._CollectionIndicatorSet = other._CollectionIndicatorSet;
    this.CollectionStatus = other.CollectionStatus;
    this._CollectionStatusSet = other._CollectionStatusSet;
    this.CollectionHistory = other.CollectionHistory;
    this._CollectionHistorySet = other._CollectionHistorySet;
    this.VipCode = other.VipCode;
    this._VipCodeSet = other._VipCodeSet;
    this.PurchaseOrder = other.PurchaseOrder;
    this._PurchaseOrderSet = other._PurchaseOrderSet;
    this.Codeword = other.Codeword;
    this._CodewordSet = other._CodewordSet;
    this.Remark = other.Remark;
    this._RemarkSet = other._RemarkSet;
    this.CustEmail = other.CustEmail;
    this._CustEmailSet = other._CustEmailSet;
    this.StatementToEmail = other.StatementToEmail;
    this._StatementToEmailSet = other._StatementToEmailSet;
    this.ChgWho = other.ChgWho;
    this._ChgWhoSet = other._ChgWhoSet;
    this.ChgDate = other.ChgDate;
    this._ChgDateSet = other._ChgDateSet;
    this.DateCreated = other.DateCreated;
    this._DateCreatedSet = other._DateCreatedSet;
    this.DateActive = other.DateActive;
    this._DateActiveSet = other._DateActiveSet;
    this.DateInactive = other.DateInactive;
    this._DateInactiveSet = other._DateInactiveSet;
    this.OwningCostCtr = other.OwningCostCtr;
    this._OwningCostCtrSet = other._OwningCostCtrSet;
    this.AcctSegId = other.AcctSegId;
    this._AcctSegIdSet = other._AcctSegIdSet;
    this.Converted = other.Converted;
    this._ConvertedSet = other._ConvertedSet;
    this.ChargeThreshold = other.ChargeThreshold;
    this._ChargeThresholdSet = other._ChargeThresholdSet;
    this.Threshold = other.Threshold;
    this._ThresholdSet = other._ThresholdSet;
    this.CyclicalThreshold = other.CyclicalThreshold;
    this._CyclicalThresholdSet = other._CyclicalThresholdSet;
    this.UsgAmtLimit = other.UsgAmtLimit;
    this._UsgAmtLimitSet = other._UsgAmtLimitSet;
    this.UsgUnitsLimit = other.UsgUnitsLimit;
    this._UsgUnitsLimitSet = other._UsgUnitsLimitSet;
    this.RegulatoryId = other.RegulatoryId;
    this._RegulatoryIdSet = other._RegulatoryIdSet;
    this.GlobalContractStatus = other.GlobalContractStatus;
    this._GlobalContractStatusSet = other._GlobalContractStatusSet;
    this.AltLname = other.AltLname;
    this._AltLnameSet = other._AltLnameSet;
    this.AltFname = other.AltFname;
    this._AltFnameSet = other._AltFnameSet;
    this.AltCompanyName = other.AltCompanyName;
    this._AltCompanyNameSet = other._AltCompanyNameSet;
    this.Gender = other.Gender;
    this._GenderSet = other._GenderSet;
    this.Dept = other.Dept;
    this._DeptSet = other._DeptSet;
    this.Title = other.Title;
    this._TitleSet = other._TitleSet;
    this.PaymentProfileId = other.PaymentProfileId;
    this._PaymentProfileIdSet = other._PaymentProfileIdSet;
    this.AccountProcessFlag = other.AccountProcessFlag;
    this._AccountProcessFlagSet = other._AccountProcessFlagSet;
    this.SdAgencyId = other.SdAgencyId;
    this._SdAgencyIdSet = other._SdAgencyIdSet;
    this.CustomerLifetimeId = other.CustomerLifetimeId;
    this._CustomerLifetimeIdSet = other._CustomerLifetimeIdSet;
    this.CustomerLifetimeId2 = other.CustomerLifetimeId2;
    this._CustomerLifetimeId2Set = other._CustomerLifetimeId2Set;
    this.AutoWriteoffStatus = other.AutoWriteoffStatus;
    this._AutoWriteoffStatusSet = other._AutoWriteoffStatusSet;
  }

  /** Constructor to copy base class fields. 
   * @param other the object to copy
   */
  public InvoiceDetailAccountObjectData (InvoiceDetailObjectData other)
  {
    super (other);

  }

  /** set the fields value: AccountCurrencyCode (CMF.currency_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AccountCurrencyCode") 
  public void setAccountCurrencyCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountCurrencyCode", "setAccountCurrencyCode");
    }
    this.AccountCurrencyCode = value;
    this._AccountCurrencyCodeSet = true;
  }

  /** Retrieves the AccountCurrencyCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AccountCurrencyCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountCurrencyCode field
   */
   public String getAccountCurrencyCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountCurrencyCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountCurrencyCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getAccountCurrencyCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountCurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountCurrencyCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the AccountCurrencyCode field from a formatted string
   *
   * @param _value the AccountCurrencyCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AccountCurrencyCode field
   */
   public void setAccountCurrencyCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountCurrencyCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAccountCurrencyCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountCurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountCurrencyCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountCurrencyCodeFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated AccountCurrencyCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the AccountCurrencyCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AccountCurrencyCode field
   */

  public String getAccountCurrencyCodeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountCurrencyCodeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getAccountCurrencyCodeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountCurrencyCodeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getAccountCurrencyCode()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountCurrencyCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountCurrencyCodeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated AccountCurrencyCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the AccountCurrencyCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AccountCurrencyCode field
   */
  public Enumeration getAccountCurrencyCodeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountCurrencyCodeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("Currency", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountCurrencyCodeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountCurrencyCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountCurrencyCodeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated AccountCurrencyCode field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setAccountCurrencyCodeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountCurrencyCodeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getAccountCurrencyCodeEnumeration(_locale);
      this.setAccountCurrencyCode((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountCurrencyCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountCurrencyCodeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountCurrencyCodeFromDisplayValue");
  }

  /** get the value of the field: AccountCurrencyCode (CMF.currency_code)
   * @return Integer the value
   */
  public Integer getAccountCurrencyCode () {
    return this.AccountCurrencyCode;
  }
  /** Change the field to not being actively set: AccountCurrencyCode (CMF.currency_code)
   */
  public void unsetAccountCurrencyCode () {
    this._AccountCurrencyCodeSet = false;
  }
  /** See if the field is actively set: AccountCurrencyCode (CMF.currency_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountCurrencyCode () {
    return this._AccountCurrencyCodeSet;
  }
  /** set the fields value: CustBankSortCode (PAYMENT_PROFILE.cust_bank_sort_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CustBankSortCode") 
  public void setCustBankSortCode (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 9))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CustBankSortCode", "setCustBankSortCode");
    }
    this.CustBankSortCode = value;
    this._CustBankSortCodeSet = true;
  }

  /** Retrieves the CustBankSortCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CustBankSortCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustBankSortCode field
   */
   public String getCustBankSortCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBankSortCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustBankSortCodeAsFormattedString");
       return fmtMgr.formatString(this.getCustBankSortCode());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustBankSortCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustBankSortCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the CustBankSortCode field from a formatted string
   *
   * @param _value the CustBankSortCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CustBankSortCode field
   */
   public void setCustBankSortCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBankSortCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCustBankSortCode(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustBankSortCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustBankSortCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustBankSortCodeFromFormattedString");
   }

  /** get the value of the field: CustBankSortCode (PAYMENT_PROFILE.cust_bank_sort_code)
   * @return String the value
   */
  public String getCustBankSortCode () {
    return this.CustBankSortCode;
  }
  /** Change the field to not being actively set: CustBankSortCode (PAYMENT_PROFILE.cust_bank_sort_code)
   */
  public void unsetCustBankSortCode () {
    this._CustBankSortCodeSet = false;
  }
  /** See if the field is actively set: CustBankSortCode (PAYMENT_PROFILE.cust_bank_sort_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCustBankSortCode () {
    return this._CustBankSortCodeSet;
  }
  /** set the fields value: CustBankAccNum (PAYMENT_PROFILE.cust_bank_acc_num)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CustBankAccNum") 
  public void setCustBankAccNum (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CustBankAccNum", "setCustBankAccNum");
    }
    this.CustBankAccNum = value;
    this._CustBankAccNumSet = true;
  }

  /** Retrieves the CustBankAccNum field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CustBankAccNum field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustBankAccNum field
   */
   public String getCustBankAccNumAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBankAccNumAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustBankAccNumAsFormattedString");
       return fmtMgr.formatString(this.getCustBankAccNum());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustBankAccNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustBankAccNumAsFormattedString");
       throw x;
     }
   }
  /** Sets the CustBankAccNum field from a formatted string
   *
   * @param _value the CustBankAccNum field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CustBankAccNum field
   */
   public void setCustBankAccNumFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBankAccNumFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCustBankAccNum(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustBankAccNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustBankAccNumFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustBankAccNumFromFormattedString");
   }

  /** get the value of the field: CustBankAccNum (PAYMENT_PROFILE.cust_bank_acc_num)
   * @return String the value
   */
  public String getCustBankAccNum () {
    return this.CustBankAccNum;
  }
  /** Change the field to not being actively set: CustBankAccNum (PAYMENT_PROFILE.cust_bank_acc_num)
   */
  public void unsetCustBankAccNum () {
    this._CustBankAccNumSet = false;
  }
  /** See if the field is actively set: CustBankAccNum (PAYMENT_PROFILE.cust_bank_acc_num)
   * @return boolean whether the field is actively set
   */
  public boolean issetCustBankAccNum () {
    return this._CustBankAccNumSet;
  }
  /** set the fields value: AltBankAccNum (PAYMENT_PROFILE.alt_bank_acc_num)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AltBankAccNum") 
  public void setAltBankAccNum (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AltBankAccNum", "setAltBankAccNum");
    }
    this.AltBankAccNum = value;
    this._AltBankAccNumSet = true;
  }

  /** Retrieves the AltBankAccNum field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AltBankAccNum field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AltBankAccNum field
   */
   public String getAltBankAccNumAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAltBankAccNumAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAltBankAccNumAsFormattedString");
       return fmtMgr.formatString(this.getAltBankAccNum());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AltBankAccNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAltBankAccNumAsFormattedString");
       throw x;
     }
   }
  /** Sets the AltBankAccNum field from a formatted string
   *
   * @param _value the AltBankAccNum field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AltBankAccNum field
   */
   public void setAltBankAccNumFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAltBankAccNumFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAltBankAccNum(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AltBankAccNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAltBankAccNumFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAltBankAccNumFromFormattedString");
   }

  /** get the value of the field: AltBankAccNum (PAYMENT_PROFILE.alt_bank_acc_num)
   * @return String the value
   */
  public String getAltBankAccNum () {
    return this.AltBankAccNum;
  }
  /** Change the field to not being actively set: AltBankAccNum (PAYMENT_PROFILE.alt_bank_acc_num)
   */
  public void unsetAltBankAccNum () {
    this._AltBankAccNumSet = false;
  }
  /** See if the field is actively set: AltBankAccNum (PAYMENT_PROFILE.alt_bank_acc_num)
   * @return boolean whether the field is actively set
   */
  public boolean issetAltBankAccNum () {
    return this._AltBankAccNumSet;
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
  /** set the fields value: BankAgencyCode (PAYMENT_PROFILE.bank_agency_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BankAgencyCode") 
  public void setBankAgencyCode (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 5))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BankAgencyCode", "setBankAgencyCode");
    }
    this.BankAgencyCode = value;
    this._BankAgencyCodeSet = true;
  }

  /** Retrieves the BankAgencyCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BankAgencyCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BankAgencyCode field
   */
   public String getBankAgencyCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBankAgencyCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBankAgencyCodeAsFormattedString");
       return fmtMgr.formatString(this.getBankAgencyCode());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BankAgencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBankAgencyCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the BankAgencyCode field from a formatted string
   *
   * @param _value the BankAgencyCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BankAgencyCode field
   */
   public void setBankAgencyCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBankAgencyCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBankAgencyCode(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BankAgencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBankAgencyCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBankAgencyCodeFromFormattedString");
   }

  /** get the value of the field: BankAgencyCode (PAYMENT_PROFILE.bank_agency_code)
   * @return String the value
   */
  public String getBankAgencyCode () {
    return this.BankAgencyCode;
  }
  /** Change the field to not being actively set: BankAgencyCode (PAYMENT_PROFILE.bank_agency_code)
   */
  public void unsetBankAgencyCode () {
    this._BankAgencyCodeSet = false;
  }
  /** See if the field is actively set: BankAgencyCode (PAYMENT_PROFILE.bank_agency_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetBankAgencyCode () {
    return this._BankAgencyCodeSet;
  }
  /** set the fields value: BankAgencyName (PAYMENT_PROFILE.bank_agency_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BankAgencyName") 
  public void setBankAgencyName (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 24))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BankAgencyName", "setBankAgencyName");
    }
    this.BankAgencyName = value;
    this._BankAgencyNameSet = true;
  }

  /** Retrieves the BankAgencyName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BankAgencyName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BankAgencyName field
   */
   public String getBankAgencyNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBankAgencyNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBankAgencyNameAsFormattedString");
       return fmtMgr.formatString(this.getBankAgencyName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BankAgencyName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBankAgencyNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the BankAgencyName field from a formatted string
   *
   * @param _value the BankAgencyName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BankAgencyName field
   */
   public void setBankAgencyNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBankAgencyNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBankAgencyName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BankAgencyName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBankAgencyNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBankAgencyNameFromFormattedString");
   }

  /** get the value of the field: BankAgencyName (PAYMENT_PROFILE.bank_agency_name)
   * @return String the value
   */
  public String getBankAgencyName () {
    return this.BankAgencyName;
  }
  /** Change the field to not being actively set: BankAgencyName (PAYMENT_PROFILE.bank_agency_name)
   */
  public void unsetBankAgencyName () {
    this._BankAgencyNameSet = false;
  }
  /** See if the field is actively set: BankAgencyName (PAYMENT_PROFILE.bank_agency_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetBankAgencyName () {
    return this._BankAgencyNameSet;
  }
  /** set the fields value: NewCustBankSortCode (PAYMENT_PROFILE.new_cust_bank_sort_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("NewCustBankSortCode") 
  public void setNewCustBankSortCode (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 9))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "NewCustBankSortCode", "setNewCustBankSortCode");
    }
    this.NewCustBankSortCode = value;
    this._NewCustBankSortCodeSet = true;
  }

  /** Retrieves the NewCustBankSortCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The NewCustBankSortCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NewCustBankSortCode field
   */
   public String getNewCustBankSortCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNewCustBankSortCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNewCustBankSortCodeAsFormattedString");
       return fmtMgr.formatString(this.getNewCustBankSortCode());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NewCustBankSortCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getNewCustBankSortCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the NewCustBankSortCode field from a formatted string
   *
   * @param _value the NewCustBankSortCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NewCustBankSortCode field
   */
   public void setNewCustBankSortCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNewCustBankSortCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setNewCustBankSortCode(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NewCustBankSortCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setNewCustBankSortCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNewCustBankSortCodeFromFormattedString");
   }

  /** get the value of the field: NewCustBankSortCode (PAYMENT_PROFILE.new_cust_bank_sort_code)
   * @return String the value
   */
  public String getNewCustBankSortCode () {
    return this.NewCustBankSortCode;
  }
  /** Change the field to not being actively set: NewCustBankSortCode (PAYMENT_PROFILE.new_cust_bank_sort_code)
   */
  public void unsetNewCustBankSortCode () {
    this._NewCustBankSortCodeSet = false;
  }
  /** See if the field is actively set: NewCustBankSortCode (PAYMENT_PROFILE.new_cust_bank_sort_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetNewCustBankSortCode () {
    return this._NewCustBankSortCodeSet;
  }
  /** set the fields value: BankCode (PAYMENT_PROFILE.bank_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BankCode") 
  public void setBankCode (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 20))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BankCode", "setBankCode");
    }
    this.BankCode = value;
    this._BankCodeSet = true;
  }

  /** Retrieves the BankCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BankCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BankCode field
   */
   public String getBankCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBankCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBankCodeAsFormattedString");
       return fmtMgr.formatString(this.getBankCode());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BankCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBankCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the BankCode field from a formatted string
   *
   * @param _value the BankCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BankCode field
   */
   public void setBankCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBankCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBankCode(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BankCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBankCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBankCodeFromFormattedString");
   }

  /** get the value of the field: BankCode (PAYMENT_PROFILE.bank_code)
   * @return String the value
   */
  public String getBankCode () {
    return this.BankCode;
  }
  /** Change the field to not being actively set: BankCode (PAYMENT_PROFILE.bank_code)
   */
  public void unsetBankCode () {
    this._BankCodeSet = false;
  }
  /** See if the field is actively set: BankCode (PAYMENT_PROFILE.bank_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetBankCode () {
    return this._BankCodeSet;
  }
  /** set the fields value: BankAccountType (PAYMENT_PROFILE.bank_account_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BankAccountType") 
  public void setBankAccountType (Integer value) throws ServiceException
  {
    this.BankAccountType = value;
    this._BankAccountTypeSet = true;
  }

  /** Retrieves the BankAccountType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BankAccountType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BankAccountType field
   */
   public String getBankAccountTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBankAccountTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBankAccountTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getBankAccountType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BankAccountType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBankAccountTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the BankAccountType field from a formatted string
   *
   * @param _value the BankAccountType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BankAccountType field
   */
   public void setBankAccountTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBankAccountTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBankAccountType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BankAccountType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBankAccountTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBankAccountTypeFromFormattedString");
   }

  /** get the value of the field: BankAccountType (PAYMENT_PROFILE.bank_account_type)
   * @return Integer the value
   */
  public Integer getBankAccountType () {
    return this.BankAccountType;
  }
  /** Change the field to not being actively set: BankAccountType (PAYMENT_PROFILE.bank_account_type)
   */
  public void unsetBankAccountType () {
    this._BankAccountTypeSet = false;
  }
  /** See if the field is actively set: BankAccountType (PAYMENT_PROFILE.bank_account_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetBankAccountType () {
    return this._BankAccountTypeSet;
  }
  /** set the fields value: BranchName (PAYMENT_PROFILE.branch_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BranchName") 
  public void setBranchName (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 20))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BranchName", "setBranchName");
    }
    this.BranchName = value;
    this._BranchNameSet = true;
  }

  /** Retrieves the BranchName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BranchName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BranchName field
   */
   public String getBranchNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBranchNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBranchNameAsFormattedString");
       return fmtMgr.formatString(this.getBranchName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BranchName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBranchNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the BranchName field from a formatted string
   *
   * @param _value the BranchName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BranchName field
   */
   public void setBranchNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBranchNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBranchName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BranchName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBranchNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBranchNameFromFormattedString");
   }

  /** get the value of the field: BranchName (PAYMENT_PROFILE.branch_name)
   * @return String the value
   */
  public String getBranchName () {
    return this.BranchName;
  }
  /** Change the field to not being actively set: BranchName (PAYMENT_PROFILE.branch_name)
   */
  public void unsetBranchName () {
    this._BranchNameSet = false;
  }
  /** See if the field is actively set: BranchName (PAYMENT_PROFILE.branch_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetBranchName () {
    return this._BranchNameSet;
  }
  /** set the fields value: BranchCode (PAYMENT_PROFILE.branch_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BranchCode") 
  public void setBranchCode (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 20))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BranchCode", "setBranchCode");
    }
    this.BranchCode = value;
    this._BranchCodeSet = true;
  }

  /** Retrieves the BranchCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BranchCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BranchCode field
   */
   public String getBranchCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBranchCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBranchCodeAsFormattedString");
       return fmtMgr.formatString(this.getBranchCode());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BranchCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBranchCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the BranchCode field from a formatted string
   *
   * @param _value the BranchCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BranchCode field
   */
   public void setBranchCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBranchCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBranchCode(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BranchCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBranchCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBranchCodeFromFormattedString");
   }

  /** get the value of the field: BranchCode (PAYMENT_PROFILE.branch_code)
   * @return String the value
   */
  public String getBranchCode () {
    return this.BranchCode;
  }
  /** Change the field to not being actively set: BranchCode (PAYMENT_PROFILE.branch_code)
   */
  public void unsetBranchCode () {
    this._BranchCodeSet = false;
  }
  /** See if the field is actively set: BranchCode (PAYMENT_PROFILE.branch_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetBranchCode () {
    return this._BranchCodeSet;
  }
  /** set the fields value: ParentAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ParentAccountExternalId") 
  public void setParentAccountExternalId (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ParentAccountExternalId", "setParentAccountExternalId");
    }
    if (value != null && !DataHelper.validLength (value, 144))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ParentAccountExternalId", "setParentAccountExternalId");
    }
    this.ParentAccountExternalId = value;
    this._ParentAccountExternalIdSet = true;
  }

  /** Retrieves the ParentAccountExternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ParentAccountExternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParentAccountExternalId field
   */
   public String getParentAccountExternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentAccountExternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParentAccountExternalIdAsFormattedString");
       return fmtMgr.formatString(this.getParentAccountExternalId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParentAccountExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getParentAccountExternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ParentAccountExternalId field from a formatted string
   *
   * @param _value the ParentAccountExternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ParentAccountExternalId field
   */
   public void setParentAccountExternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentAccountExternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setParentAccountExternalId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParentAccountExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setParentAccountExternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParentAccountExternalIdFromFormattedString");
   }

  /** get the value of the field: ParentAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return String the value
   */
  public String getParentAccountExternalId () {
    return this.ParentAccountExternalId;
  }
  /** Change the field to not being actively set: ParentAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   */
  public void unsetParentAccountExternalId () {
    this._ParentAccountExternalIdSet = false;
  }
  /** See if the field is actively set: ParentAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetParentAccountExternalId () {
    return this._ParentAccountExternalIdSet;
  }
  /** set the fields value: ParentAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ParentAccountExternalIdType") 
  public void setParentAccountExternalIdType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ParentAccountExternalIdType", "setParentAccountExternalIdType");
    }
    this.ParentAccountExternalIdType = value;
    this._ParentAccountExternalIdTypeSet = true;
  }

  /** Retrieves the ParentAccountExternalIdType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ParentAccountExternalIdType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParentAccountExternalIdType field
   */
   public String getParentAccountExternalIdTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentAccountExternalIdTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParentAccountExternalIdTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getParentAccountExternalIdType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParentAccountExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getParentAccountExternalIdTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the ParentAccountExternalIdType field from a formatted string
   *
   * @param _value the ParentAccountExternalIdType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ParentAccountExternalIdType field
   */
   public void setParentAccountExternalIdTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentAccountExternalIdTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setParentAccountExternalIdType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParentAccountExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setParentAccountExternalIdTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParentAccountExternalIdTypeFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated ParentAccountExternalIdType field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the ParentAccountExternalIdType field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ParentAccountExternalIdType field
   */

  public String getParentAccountExternalIdTypeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentAccountExternalIdTypeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getParentAccountExternalIdTypeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParentAccountExternalIdTypeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getParentAccountExternalIdType()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParentAccountExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getParentAccountExternalIdTypeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated ParentAccountExternalIdType field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the ParentAccountExternalIdType field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ParentAccountExternalIdType field
   */
  public Enumeration getParentAccountExternalIdTypeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentAccountExternalIdTypeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("ExternalIdType", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParentAccountExternalIdTypeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParentAccountExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getParentAccountExternalIdTypeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated ParentAccountExternalIdType field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setParentAccountExternalIdTypeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setParentAccountExternalIdTypeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getParentAccountExternalIdTypeEnumeration(_locale);
      this.setParentAccountExternalIdType((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParentAccountExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setParentAccountExternalIdTypeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setParentAccountExternalIdTypeFromDisplayValue");
  }

  /** get the value of the field: ParentAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return Integer the value
   */
  public Integer getParentAccountExternalIdType () {
    return this.ParentAccountExternalIdType;
  }
  /** Change the field to not being actively set: ParentAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   */
  public void unsetParentAccountExternalIdType () {
    this._ParentAccountExternalIdTypeSet = false;
  }
  /** See if the field is actively set: ParentAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetParentAccountExternalIdType () {
    return this._ParentAccountExternalIdTypeSet;
  }
  /** set the fields value: HierarchyAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("HierarchyAccountExternalId") 
  public void setHierarchyAccountExternalId (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "HierarchyAccountExternalId", "setHierarchyAccountExternalId");
    }
    if (value != null && !DataHelper.validLength (value, 144))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "HierarchyAccountExternalId", "setHierarchyAccountExternalId");
    }
    this.HierarchyAccountExternalId = value;
    this._HierarchyAccountExternalIdSet = true;
  }

  /** Retrieves the HierarchyAccountExternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The HierarchyAccountExternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the HierarchyAccountExternalId field
   */
   public String getHierarchyAccountExternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHierarchyAccountExternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getHierarchyAccountExternalIdAsFormattedString");
       return fmtMgr.formatString(this.getHierarchyAccountExternalId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("HierarchyAccountExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getHierarchyAccountExternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the HierarchyAccountExternalId field from a formatted string
   *
   * @param _value the HierarchyAccountExternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the HierarchyAccountExternalId field
   */
   public void setHierarchyAccountExternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHierarchyAccountExternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setHierarchyAccountExternalId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("HierarchyAccountExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setHierarchyAccountExternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setHierarchyAccountExternalIdFromFormattedString");
   }

  /** get the value of the field: HierarchyAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return String the value
   */
  public String getHierarchyAccountExternalId () {
    return this.HierarchyAccountExternalId;
  }
  /** Change the field to not being actively set: HierarchyAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   */
  public void unsetHierarchyAccountExternalId () {
    this._HierarchyAccountExternalIdSet = false;
  }
  /** See if the field is actively set: HierarchyAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetHierarchyAccountExternalId () {
    return this._HierarchyAccountExternalIdSet;
  }
  /** set the fields value: HierarchyAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("HierarchyAccountExternalIdType") 
  public void setHierarchyAccountExternalIdType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "HierarchyAccountExternalIdType", "setHierarchyAccountExternalIdType");
    }
    this.HierarchyAccountExternalIdType = value;
    this._HierarchyAccountExternalIdTypeSet = true;
  }

  /** Retrieves the HierarchyAccountExternalIdType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The HierarchyAccountExternalIdType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the HierarchyAccountExternalIdType field
   */
   public String getHierarchyAccountExternalIdTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHierarchyAccountExternalIdTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getHierarchyAccountExternalIdTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getHierarchyAccountExternalIdType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("HierarchyAccountExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getHierarchyAccountExternalIdTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the HierarchyAccountExternalIdType field from a formatted string
   *
   * @param _value the HierarchyAccountExternalIdType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the HierarchyAccountExternalIdType field
   */
   public void setHierarchyAccountExternalIdTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHierarchyAccountExternalIdTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setHierarchyAccountExternalIdType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("HierarchyAccountExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setHierarchyAccountExternalIdTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setHierarchyAccountExternalIdTypeFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated HierarchyAccountExternalIdType field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the HierarchyAccountExternalIdType field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the HierarchyAccountExternalIdType field
   */

  public String getHierarchyAccountExternalIdTypeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHierarchyAccountExternalIdTypeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getHierarchyAccountExternalIdTypeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getHierarchyAccountExternalIdTypeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getHierarchyAccountExternalIdType()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("HierarchyAccountExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getHierarchyAccountExternalIdTypeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated HierarchyAccountExternalIdType field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the HierarchyAccountExternalIdType field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the HierarchyAccountExternalIdType field
   */
  public Enumeration getHierarchyAccountExternalIdTypeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHierarchyAccountExternalIdTypeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("ExternalIdType", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getHierarchyAccountExternalIdTypeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("HierarchyAccountExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getHierarchyAccountExternalIdTypeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated HierarchyAccountExternalIdType field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setHierarchyAccountExternalIdTypeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setHierarchyAccountExternalIdTypeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getHierarchyAccountExternalIdTypeEnumeration(_locale);
      this.setHierarchyAccountExternalIdType((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("HierarchyAccountExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setHierarchyAccountExternalIdTypeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setHierarchyAccountExternalIdTypeFromDisplayValue");
  }

  /** get the value of the field: HierarchyAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return Integer the value
   */
  public Integer getHierarchyAccountExternalIdType () {
    return this.HierarchyAccountExternalIdType;
  }
  /** Change the field to not being actively set: HierarchyAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   */
  public void unsetHierarchyAccountExternalIdType () {
    this._HierarchyAccountExternalIdTypeSet = false;
  }
  /** See if the field is actively set: HierarchyAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetHierarchyAccountExternalIdType () {
    return this._HierarchyAccountExternalIdTypeSet;
  }
  /** set the fields value: ParentId (CMF.parent_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ParentId") 
  public void setParentId (Integer value) throws ServiceException
  {
    this.ParentId = value;
    this._ParentIdSet = true;
  }

  /** Retrieves the ParentId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ParentId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParentId field
   */
   public String getParentIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParentIdAsFormattedString");
       return fmtMgr.formatNumber(this.getParentId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParentId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getParentIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ParentId field from a formatted string
   *
   * @param _value the ParentId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ParentId field
   */
   public void setParentIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setParentId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParentId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setParentIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParentIdFromFormattedString");
   }

  /** get the value of the field: ParentId (CMF.parent_id)
   * @return Integer the value
   */
  public Integer getParentId () {
    return this.ParentId;
  }
  /** Change the field to not being actively set: ParentId (CMF.parent_id)
   */
  public void unsetParentId () {
    this._ParentIdSet = false;
  }
  /** See if the field is actively set: ParentId (CMF.parent_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetParentId () {
    return this._ParentIdSet;
  }
  /** set the fields value: ChildCount (CMF.child_count)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ChildCount") 
  public void setChildCount (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ChildCount", "setChildCount");
    }
    this.ChildCount = value;
    this._ChildCountSet = true;
  }

  /** Retrieves the ChildCount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ChildCount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChildCount field
   */
   public String getChildCountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChildCountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChildCountAsFormattedString");
       return fmtMgr.formatNumber(this.getChildCount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChildCount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getChildCountAsFormattedString");
       throw x;
     }
   }
  /** Sets the ChildCount field from a formatted string
   *
   * @param _value the ChildCount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChildCount field
   */
   public void setChildCountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChildCountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setChildCount(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChildCount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setChildCountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChildCountFromFormattedString");
   }

  /** get the value of the field: ChildCount (CMF.child_count)
   * @return Integer the value
   */
  public Integer getChildCount () {
    return this.ChildCount;
  }
  /** Change the field to not being actively set: ChildCount (CMF.child_count)
   */
  public void unsetChildCount () {
    this._ChildCountSet = false;
  }
  /** See if the field is actively set: ChildCount (CMF.child_count)
   * @return boolean whether the field is actively set
   */
  public boolean issetChildCount () {
    return this._ChildCountSet;
  }
  /** set the fields value: HierarchyId (CMF.hierarchy_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("HierarchyId") 
  public void setHierarchyId (Integer value) throws ServiceException
  {
    this.HierarchyId = value;
    this._HierarchyIdSet = true;
  }

  /** Retrieves the HierarchyId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The HierarchyId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the HierarchyId field
   */
   public String getHierarchyIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHierarchyIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getHierarchyIdAsFormattedString");
       return fmtMgr.formatNumber(this.getHierarchyId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("HierarchyId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getHierarchyIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the HierarchyId field from a formatted string
   *
   * @param _value the HierarchyId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the HierarchyId field
   */
   public void setHierarchyIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHierarchyIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setHierarchyId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("HierarchyId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setHierarchyIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setHierarchyIdFromFormattedString");
   }

  /** get the value of the field: HierarchyId (CMF.hierarchy_id)
   * @return Integer the value
   */
  public Integer getHierarchyId () {
    return this.HierarchyId;
  }
  /** Change the field to not being actively set: HierarchyId (CMF.hierarchy_id)
   */
  public void unsetHierarchyId () {
    this._HierarchyIdSet = false;
  }
  /** See if the field is actively set: HierarchyId (CMF.hierarchy_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetHierarchyId () {
    return this._HierarchyIdSet;
  }
  /** set the fields value: TieCode (CMF.tie_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TieCode") 
  public void setTieCode (Integer value) throws ServiceException
  {
    this.TieCode = value;
    this._TieCodeSet = true;
  }

  /** Retrieves the TieCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TieCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TieCode field
   */
   public String getTieCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTieCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTieCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getTieCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TieCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTieCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the TieCode field from a formatted string
   *
   * @param _value the TieCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TieCode field
   */
   public void setTieCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTieCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTieCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TieCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTieCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTieCodeFromFormattedString");
   }

  /** get the value of the field: TieCode (CMF.tie_code)
   * @return Integer the value
   */
  public Integer getTieCode () {
    return this.TieCode;
  }
  /** Change the field to not being actively set: TieCode (CMF.tie_code)
   */
  public void unsetTieCode () {
    this._TieCodeSet = false;
  }
  /** See if the field is actively set: TieCode (CMF.tie_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetTieCode () {
    return this._TieCodeSet;
  }
  /** set the fields value: AccountType (CMF.account_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AccountType") 
  public void setAccountType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountType", "setAccountType");
    }
    this.AccountType = value;
    this._AccountTypeSet = true;
  }

  /** Retrieves the AccountType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AccountType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountType field
   */
   public String getAccountTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getAccountType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the AccountType field from a formatted string
   *
   * @param _value the AccountType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AccountType field
   */
   public void setAccountTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAccountType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountTypeFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated AccountType field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the AccountType field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AccountType field
   */

  public String getAccountTypeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountTypeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getAccountTypeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountTypeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getAccountType()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountTypeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated AccountType field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the AccountType field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AccountType field
   */
  public Enumeration getAccountTypeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountTypeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("AccountType", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountTypeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountTypeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated AccountType field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setAccountTypeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountTypeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getAccountTypeEnumeration(_locale);
      this.setAccountType((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountTypeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountTypeFromDisplayValue");
  }

  /** get the value of the field: AccountType (CMF.account_type)
   * @return Integer the value
   */
  public Integer getAccountType () {
    return this.AccountType;
  }
  /** Change the field to not being actively set: AccountType (CMF.account_type)
   */
  public void unsetAccountType () {
    this._AccountTypeSet = false;
  }
  /** See if the field is actively set: AccountType (CMF.account_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountType () {
    return this._AccountTypeSet;
  }
  /** set the fields value: AccountCategory (CMF.account_category)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AccountCategory") 
  public void setAccountCategory (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountCategory", "setAccountCategory");
    }
    this.AccountCategory = value;
    this._AccountCategorySet = true;
  }

  /** Retrieves the AccountCategory field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AccountCategory field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountCategory field
   */
   public String getAccountCategoryAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountCategoryAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountCategoryAsFormattedString");
       return fmtMgr.formatNumber(this.getAccountCategory(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountCategory");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountCategoryAsFormattedString");
       throw x;
     }
   }
  /** Sets the AccountCategory field from a formatted string
   *
   * @param _value the AccountCategory field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AccountCategory field
   */
   public void setAccountCategoryFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountCategoryFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAccountCategory(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountCategory");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountCategoryFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountCategoryFromFormattedString");
   }

  /** get the value of the field: AccountCategory (CMF.account_category)
   * @return Integer the value
   */
  public Integer getAccountCategory () {
    return this.AccountCategory;
  }
  /** Change the field to not being actively set: AccountCategory (CMF.account_category)
   */
  public void unsetAccountCategory () {
    this._AccountCategorySet = false;
  }
  /** See if the field is actively set: AccountCategory (CMF.account_category)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountCategory () {
    return this._AccountCategorySet;
  }
  /** set the fields value: PrevCutoffDate (CMF.prev_cutoff_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PrevCutoffDate") 
  public void setPrevCutoffDate (Date value) throws ServiceException
  {
    this.PrevCutoffDate = value;
    this._PrevCutoffDateSet = true;
  }

  /** Retrieves the PrevCutoffDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrevCutoffDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrevCutoffDate field
   */
   public String getPrevCutoffDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevCutoffDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrevCutoffDateAsFormattedString");
       return fmtMgr.formatDate(this.getPrevCutoffDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrevCutoffDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrevCutoffDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrevCutoffDate field from a formatted string
   *
   * @param _value the PrevCutoffDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrevCutoffDate field
   */
   public void setPrevCutoffDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevCutoffDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrevCutoffDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrevCutoffDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrevCutoffDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrevCutoffDateFromFormattedString");
   }

  /**
   * Retrieves the PrevCutoffDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrevCutoffDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrevCutoffDate field
   */
  public String getPrevCutoffDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevCutoffDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrevCutoffDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getPrevCutoffDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevCutoffDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrevCutoffDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the PrevCutoffDate field value from a formatted date/time string
   *
   * @param _value the PrevCutoffDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrevCutoffDate field
   */
  public void setPrevCutoffDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrevCutoffDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setPrevCutoffDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevCutoffDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrevCutoffDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: PrevCutoffDate (CMF.prev_cutoff_date)
   * @return Date the value
   */
  public Date getPrevCutoffDate () {
    return this.PrevCutoffDate;
  }
  /** Change the field to not being actively set: PrevCutoffDate (CMF.prev_cutoff_date)
   */
  public void unsetPrevCutoffDate () {
    this._PrevCutoffDateSet = false;
  }
  /** See if the field is actively set: PrevCutoffDate (CMF.prev_cutoff_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetPrevCutoffDate () {
    return this._PrevCutoffDateSet;
  }
  /** set the fields value: PrevBillDate (CMF.prev_bill_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PrevBillDate") 
  public void setPrevBillDate (Date value) throws ServiceException
  {
    this.PrevBillDate = value;
    this._PrevBillDateSet = true;
  }

  /** Retrieves the PrevBillDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrevBillDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrevBillDate field
   */
   public String getPrevBillDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevBillDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrevBillDateAsFormattedString");
       return fmtMgr.formatDate(this.getPrevBillDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrevBillDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrevBillDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrevBillDate field from a formatted string
   *
   * @param _value the PrevBillDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrevBillDate field
   */
   public void setPrevBillDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevBillDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrevBillDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrevBillDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrevBillDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrevBillDateFromFormattedString");
   }

  /**
   * Retrieves the PrevBillDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrevBillDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrevBillDate field
   */
  public String getPrevBillDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevBillDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrevBillDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getPrevBillDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevBillDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrevBillDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the PrevBillDate field value from a formatted date/time string
   *
   * @param _value the PrevBillDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrevBillDate field
   */
  public void setPrevBillDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrevBillDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setPrevBillDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevBillDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrevBillDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: PrevBillDate (CMF.prev_bill_date)
   * @return Date the value
   */
  public Date getPrevBillDate () {
    return this.PrevBillDate;
  }
  /** Change the field to not being actively set: PrevBillDate (CMF.prev_bill_date)
   */
  public void unsetPrevBillDate () {
    this._PrevBillDateSet = false;
  }
  /** See if the field is actively set: PrevBillDate (CMF.prev_bill_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetPrevBillDate () {
    return this._PrevBillDateSet;
  }
  /** set the fields value: NextBillDate (CMF.next_bill_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("NextBillDate") 
  public void setNextBillDate (Date value) throws ServiceException
  {
    this.NextBillDate = value;
    this._NextBillDateSet = true;
  }

  /** Retrieves the NextBillDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The NextBillDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NextBillDate field
   */
   public String getNextBillDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNextBillDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNextBillDateAsFormattedString");
       return fmtMgr.formatDate(this.getNextBillDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NextBillDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getNextBillDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the NextBillDate field from a formatted string
   *
   * @param _value the NextBillDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NextBillDate field
   */
   public void setNextBillDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNextBillDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setNextBillDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NextBillDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setNextBillDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNextBillDateFromFormattedString");
   }

  /**
   * Retrieves the NextBillDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NextBillDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the NextBillDate field
   */
  public String getNextBillDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNextBillDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNextBillDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getNextBillDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NextBillDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNextBillDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the NextBillDate field value from a formatted date/time string
   *
   * @param _value the NextBillDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NextBillDate field
   */
  public void setNextBillDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNextBillDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setNextBillDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NextBillDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNextBillDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: NextBillDate (CMF.next_bill_date)
   * @return Date the value
   */
  public Date getNextBillDate () {
    return this.NextBillDate;
  }
  /** Change the field to not being actively set: NextBillDate (CMF.next_bill_date)
   */
  public void unsetNextBillDate () {
    this._NextBillDateSet = false;
  }
  /** See if the field is actively set: NextBillDate (CMF.next_bill_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetNextBillDate () {
    return this._NextBillDateSet;
  }
  /** set the fields value: PrevBillRefno (CMF.prev_bill_refno)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PrevBillRefno") 
  public void setPrevBillRefno (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PrevBillRefno", "setPrevBillRefno");
    }
    this.PrevBillRefno = value;
    this._PrevBillRefnoSet = true;
  }

  /** Retrieves the PrevBillRefno field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrevBillRefno field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrevBillRefno field
   */
   public String getPrevBillRefnoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevBillRefnoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrevBillRefnoAsFormattedString");
       return fmtMgr.formatNumber(this.getPrevBillRefno(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrevBillRefno");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrevBillRefnoAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrevBillRefno field from a formatted string
   *
   * @param _value the PrevBillRefno field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrevBillRefno field
   */
   public void setPrevBillRefnoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevBillRefnoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrevBillRefno(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrevBillRefno");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrevBillRefnoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrevBillRefnoFromFormattedString");
   }

  /** get the value of the field: PrevBillRefno (CMF.prev_bill_refno)
   * @return Integer the value
   */
  public Integer getPrevBillRefno () {
    return this.PrevBillRefno;
  }
  /** Change the field to not being actively set: PrevBillRefno (CMF.prev_bill_refno)
   */
  public void unsetPrevBillRefno () {
    this._PrevBillRefnoSet = false;
  }
  /** See if the field is actively set: PrevBillRefno (CMF.prev_bill_refno)
   * @return boolean whether the field is actively set
   */
  public boolean issetPrevBillRefno () {
    return this._PrevBillRefnoSet;
  }
  /** set the fields value: PrevBillRefResets (CMF.prev_bill_ref_resets)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PrevBillRefResets") 
  public void setPrevBillRefResets (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PrevBillRefResets", "setPrevBillRefResets");
    }
    this.PrevBillRefResets = value;
    this._PrevBillRefResetsSet = true;
  }

  /** Retrieves the PrevBillRefResets field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrevBillRefResets field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrevBillRefResets field
   */
   public String getPrevBillRefResetsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevBillRefResetsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrevBillRefResetsAsFormattedString");
       return fmtMgr.formatNumber(this.getPrevBillRefResets(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrevBillRefResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrevBillRefResetsAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrevBillRefResets field from a formatted string
   *
   * @param _value the PrevBillRefResets field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrevBillRefResets field
   */
   public void setPrevBillRefResetsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevBillRefResetsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrevBillRefResets(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrevBillRefResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrevBillRefResetsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrevBillRefResetsFromFormattedString");
   }

  /** get the value of the field: PrevBillRefResets (CMF.prev_bill_ref_resets)
   * @return Integer the value
   */
  public Integer getPrevBillRefResets () {
    return this.PrevBillRefResets;
  }
  /** Change the field to not being actively set: PrevBillRefResets (CMF.prev_bill_ref_resets)
   */
  public void unsetPrevBillRefResets () {
    this._PrevBillRefResetsSet = false;
  }
  /** See if the field is actively set: PrevBillRefResets (CMF.prev_bill_ref_resets)
   * @return boolean whether the field is actively set
   */
  public boolean issetPrevBillRefResets () {
    return this._PrevBillRefResetsSet;
  }
  /** set the fields value: PrevBalanceRefno (CMF.prev_balance_refno)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PrevBalanceRefno") 
  public void setPrevBalanceRefno (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PrevBalanceRefno", "setPrevBalanceRefno");
    }
    this.PrevBalanceRefno = value;
    this._PrevBalanceRefnoSet = true;
  }

  /** Retrieves the PrevBalanceRefno field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrevBalanceRefno field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrevBalanceRefno field
   */
   public String getPrevBalanceRefnoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevBalanceRefnoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrevBalanceRefnoAsFormattedString");
       return fmtMgr.formatNumber(this.getPrevBalanceRefno(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrevBalanceRefno");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrevBalanceRefnoAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrevBalanceRefno field from a formatted string
   *
   * @param _value the PrevBalanceRefno field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrevBalanceRefno field
   */
   public void setPrevBalanceRefnoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevBalanceRefnoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrevBalanceRefno(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrevBalanceRefno");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrevBalanceRefnoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrevBalanceRefnoFromFormattedString");
   }

  /** get the value of the field: PrevBalanceRefno (CMF.prev_balance_refno)
   * @return Integer the value
   */
  public Integer getPrevBalanceRefno () {
    return this.PrevBalanceRefno;
  }
  /** Change the field to not being actively set: PrevBalanceRefno (CMF.prev_balance_refno)
   */
  public void unsetPrevBalanceRefno () {
    this._PrevBalanceRefnoSet = false;
  }
  /** See if the field is actively set: PrevBalanceRefno (CMF.prev_balance_refno)
   * @return boolean whether the field is actively set
   */
  public boolean issetPrevBalanceRefno () {
    return this._PrevBalanceRefnoSet;
  }
  /** set the fields value: PrevBalanceRefResets (CMF.prev_balance_ref_resets)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PrevBalanceRefResets") 
  public void setPrevBalanceRefResets (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PrevBalanceRefResets", "setPrevBalanceRefResets");
    }
    this.PrevBalanceRefResets = value;
    this._PrevBalanceRefResetsSet = true;
  }

  /** Retrieves the PrevBalanceRefResets field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrevBalanceRefResets field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrevBalanceRefResets field
   */
   public String getPrevBalanceRefResetsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevBalanceRefResetsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrevBalanceRefResetsAsFormattedString");
       return fmtMgr.formatNumber(this.getPrevBalanceRefResets(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrevBalanceRefResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrevBalanceRefResetsAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrevBalanceRefResets field from a formatted string
   *
   * @param _value the PrevBalanceRefResets field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrevBalanceRefResets field
   */
   public void setPrevBalanceRefResetsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevBalanceRefResetsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrevBalanceRefResets(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrevBalanceRefResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrevBalanceRefResetsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrevBalanceRefResetsFromFormattedString");
   }

  /** get the value of the field: PrevBalanceRefResets (CMF.prev_balance_ref_resets)
   * @return Integer the value
   */
  public Integer getPrevBalanceRefResets () {
    return this.PrevBalanceRefResets;
  }
  /** Change the field to not being actively set: PrevBalanceRefResets (CMF.prev_balance_ref_resets)
   */
  public void unsetPrevBalanceRefResets () {
    this._PrevBalanceRefResetsSet = false;
  }
  /** See if the field is actively set: PrevBalanceRefResets (CMF.prev_balance_ref_resets)
   * @return boolean whether the field is actively set
   */
  public boolean issetPrevBalanceRefResets () {
    return this._PrevBalanceRefResetsSet;
  }
  /** set the fields value: BillNamePre (CMF.bill_name_pre)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillNamePre") 
  public void setBillNamePre (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 4))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BillNamePre", "setBillNamePre");
    }
    this.BillNamePre = value;
    this._BillNamePreSet = true;
  }

  /** Retrieves the BillNamePre field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillNamePre field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillNamePre field
   */
   public String getBillNamePreAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillNamePreAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillNamePreAsFormattedString");
       return fmtMgr.formatString(this.getBillNamePre());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillNamePre");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillNamePreAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillNamePre field from a formatted string
   *
   * @param _value the BillNamePre field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillNamePre field
   */
   public void setBillNamePreFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillNamePreFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillNamePre(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillNamePre");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillNamePreFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillNamePreFromFormattedString");
   }

  /** get the value of the field: BillNamePre (CMF.bill_name_pre)
   * @return String the value
   */
  public String getBillNamePre () {
    return this.BillNamePre;
  }
  /** Change the field to not being actively set: BillNamePre (CMF.bill_name_pre)
   */
  public void unsetBillNamePre () {
    this._BillNamePreSet = false;
  }
  /** See if the field is actively set: BillNamePre (CMF.bill_name_pre)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillNamePre () {
    return this._BillNamePreSet;
  }
  /** set the fields value: BillFname (CMF.bill_fname)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillFname") 
  public void setBillFname (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 28))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BillFname", "setBillFname");
    }
    this.BillFname = value;
    this._BillFnameSet = true;
  }

  /** Retrieves the BillFname field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillFname field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillFname field
   */
   public String getBillFnameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillFnameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillFnameAsFormattedString");
       return fmtMgr.formatString(this.getBillFname());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillFname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillFnameAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillFname field from a formatted string
   *
   * @param _value the BillFname field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillFname field
   */
   public void setBillFnameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillFnameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillFname(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillFname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillFnameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillFnameFromFormattedString");
   }

  /** get the value of the field: BillFname (CMF.bill_fname)
   * @return String the value
   */
  public String getBillFname () {
    return this.BillFname;
  }
  /** Change the field to not being actively set: BillFname (CMF.bill_fname)
   */
  public void unsetBillFname () {
    this._BillFnameSet = false;
  }
  /** See if the field is actively set: BillFname (CMF.bill_fname)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillFname () {
    return this._BillFnameSet;
  }
  /** set the fields value: BillMinit (CMF.bill_minit)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillMinit") 
  public void setBillMinit (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BillMinit", "setBillMinit");
    }
    this.BillMinit = value;
    this._BillMinitSet = true;
  }

  /** Retrieves the BillMinit field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillMinit field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillMinit field
   */
   public String getBillMinitAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillMinitAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillMinitAsFormattedString");
       return fmtMgr.formatString(this.getBillMinit());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillMinit");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillMinitAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillMinit field from a formatted string
   *
   * @param _value the BillMinit field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillMinit field
   */
   public void setBillMinitFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillMinitFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillMinit(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillMinit");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillMinitFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillMinitFromFormattedString");
   }

  /** get the value of the field: BillMinit (CMF.bill_minit)
   * @return String the value
   */
  public String getBillMinit () {
    return this.BillMinit;
  }
  /** Change the field to not being actively set: BillMinit (CMF.bill_minit)
   */
  public void unsetBillMinit () {
    this._BillMinitSet = false;
  }
  /** See if the field is actively set: BillMinit (CMF.bill_minit)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillMinit () {
    return this._BillMinitSet;
  }
  /** set the fields value: BillLname (CMF.bill_lname)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillLname") 
  public void setBillLname (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 56))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BillLname", "setBillLname");
    }
    this.BillLname = value;
    this._BillLnameSet = true;
  }

  /** Retrieves the BillLname field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillLname field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillLname field
   */
   public String getBillLnameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillLnameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillLnameAsFormattedString");
       return fmtMgr.formatString(this.getBillLname());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillLname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillLnameAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillLname field from a formatted string
   *
   * @param _value the BillLname field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillLname field
   */
   public void setBillLnameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillLnameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillLname(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillLname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillLnameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillLnameFromFormattedString");
   }

  /** get the value of the field: BillLname (CMF.bill_lname)
   * @return String the value
   */
  public String getBillLname () {
    return this.BillLname;
  }
  /** Change the field to not being actively set: BillLname (CMF.bill_lname)
   */
  public void unsetBillLname () {
    this._BillLnameSet = false;
  }
  /** See if the field is actively set: BillLname (CMF.bill_lname)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillLname () {
    return this._BillLnameSet;
  }
  /** set the fields value: BillNameGeneration (CMF.bill_name_generation)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillNameGeneration") 
  public void setBillNameGeneration (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 4))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BillNameGeneration", "setBillNameGeneration");
    }
    this.BillNameGeneration = value;
    this._BillNameGenerationSet = true;
  }

  /** Retrieves the BillNameGeneration field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillNameGeneration field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillNameGeneration field
   */
   public String getBillNameGenerationAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillNameGenerationAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillNameGenerationAsFormattedString");
       return fmtMgr.formatString(this.getBillNameGeneration());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillNameGeneration");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillNameGenerationAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillNameGeneration field from a formatted string
   *
   * @param _value the BillNameGeneration field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillNameGeneration field
   */
   public void setBillNameGenerationFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillNameGenerationFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillNameGeneration(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillNameGeneration");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillNameGenerationFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillNameGenerationFromFormattedString");
   }

  /** get the value of the field: BillNameGeneration (CMF.bill_name_generation)
   * @return String the value
   */
  public String getBillNameGeneration () {
    return this.BillNameGeneration;
  }
  /** Change the field to not being actively set: BillNameGeneration (CMF.bill_name_generation)
   */
  public void unsetBillNameGeneration () {
    this._BillNameGenerationSet = false;
  }
  /** See if the field is actively set: BillNameGeneration (CMF.bill_name_generation)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillNameGeneration () {
    return this._BillNameGenerationSet;
  }
  /** set the fields value: BillTitle (CMF.bill_title)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillTitle") 
  public void setBillTitle (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 40))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BillTitle", "setBillTitle");
    }
    this.BillTitle = value;
    this._BillTitleSet = true;
  }

  /** Retrieves the BillTitle field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillTitle field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillTitle field
   */
   public String getBillTitleAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillTitleAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillTitleAsFormattedString");
       return fmtMgr.formatString(this.getBillTitle());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillTitle");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillTitleAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillTitle field from a formatted string
   *
   * @param _value the BillTitle field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillTitle field
   */
   public void setBillTitleFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillTitleFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillTitle(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillTitle");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillTitleFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillTitleFromFormattedString");
   }

  /** get the value of the field: BillTitle (CMF.bill_title)
   * @return String the value
   */
  public String getBillTitle () {
    return this.BillTitle;
  }
  /** Change the field to not being actively set: BillTitle (CMF.bill_title)
   */
  public void unsetBillTitle () {
    this._BillTitleSet = false;
  }
  /** See if the field is actively set: BillTitle (CMF.bill_title)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillTitle () {
    return this._BillTitleSet;
  }
  /** set the fields value: BillCompany (CMF.bill_company)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillCompany") 
  public void setBillCompany (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 56))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BillCompany", "setBillCompany");
    }
    this.BillCompany = value;
    this._BillCompanySet = true;
  }

  /** Retrieves the BillCompany field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillCompany field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillCompany field
   */
   public String getBillCompanyAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillCompanyAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillCompanyAsFormattedString");
       return fmtMgr.formatString(this.getBillCompany());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillCompany");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillCompanyAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillCompany field from a formatted string
   *
   * @param _value the BillCompany field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillCompany field
   */
   public void setBillCompanyFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillCompanyFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillCompany(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillCompany");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillCompanyFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillCompanyFromFormattedString");
   }

  /** get the value of the field: BillCompany (CMF.bill_company)
   * @return String the value
   */
  public String getBillCompany () {
    return this.BillCompany;
  }
  /** Change the field to not being actively set: BillCompany (CMF.bill_company)
   */
  public void unsetBillCompany () {
    this._BillCompanySet = false;
  }
  /** See if the field is actively set: BillCompany (CMF.bill_company)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillCompany () {
    return this._BillCompanySet;
  }
  /** set the fields value: CustAddress1 (CMF.cust_address1)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CustAddress1") 
  public void setCustAddress1 (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 75))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CustAddress1", "setCustAddress1");
    }
    this.CustAddress1 = value;
    this._CustAddress1Set = true;
  }

  /** Retrieves the CustAddress1 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CustAddress1 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustAddress1 field
   */
   public String getCustAddress1AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustAddress1AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustAddress1AsFormattedString");
       return fmtMgr.formatString(this.getCustAddress1());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustAddress1");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustAddress1AsFormattedString");
       throw x;
     }
   }
  /** Sets the CustAddress1 field from a formatted string
   *
   * @param _value the CustAddress1 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CustAddress1 field
   */
   public void setCustAddress1FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustAddress1FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCustAddress1(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustAddress1");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustAddress1FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustAddress1FromFormattedString");
   }

  /** get the value of the field: CustAddress1 (CMF.cust_address1)
   * @return String the value
   */
  public String getCustAddress1 () {
    return this.CustAddress1;
  }
  /** Change the field to not being actively set: CustAddress1 (CMF.cust_address1)
   */
  public void unsetCustAddress1 () {
    this._CustAddress1Set = false;
  }
  /** See if the field is actively set: CustAddress1 (CMF.cust_address1)
   * @return boolean whether the field is actively set
   */
  public boolean issetCustAddress1 () {
    return this._CustAddress1Set;
  }
  /** set the fields value: CustAddress2 (CMF.cust_address2)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CustAddress2") 
  public void setCustAddress2 (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 75))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CustAddress2", "setCustAddress2");
    }
    this.CustAddress2 = value;
    this._CustAddress2Set = true;
  }

  /** Retrieves the CustAddress2 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CustAddress2 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustAddress2 field
   */
   public String getCustAddress2AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustAddress2AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustAddress2AsFormattedString");
       return fmtMgr.formatString(this.getCustAddress2());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustAddress2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustAddress2AsFormattedString");
       throw x;
     }
   }
  /** Sets the CustAddress2 field from a formatted string
   *
   * @param _value the CustAddress2 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CustAddress2 field
   */
   public void setCustAddress2FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustAddress2FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCustAddress2(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustAddress2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustAddress2FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustAddress2FromFormattedString");
   }

  /** get the value of the field: CustAddress2 (CMF.cust_address2)
   * @return String the value
   */
  public String getCustAddress2 () {
    return this.CustAddress2;
  }
  /** Change the field to not being actively set: CustAddress2 (CMF.cust_address2)
   */
  public void unsetCustAddress2 () {
    this._CustAddress2Set = false;
  }
  /** See if the field is actively set: CustAddress2 (CMF.cust_address2)
   * @return boolean whether the field is actively set
   */
  public boolean issetCustAddress2 () {
    return this._CustAddress2Set;
  }
  /** set the fields value: CustAddress3 (CMF.cust_address3)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CustAddress3") 
  public void setCustAddress3 (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 75))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CustAddress3", "setCustAddress3");
    }
    this.CustAddress3 = value;
    this._CustAddress3Set = true;
  }

  /** Retrieves the CustAddress3 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CustAddress3 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustAddress3 field
   */
   public String getCustAddress3AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustAddress3AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustAddress3AsFormattedString");
       return fmtMgr.formatString(this.getCustAddress3());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustAddress3");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustAddress3AsFormattedString");
       throw x;
     }
   }
  /** Sets the CustAddress3 field from a formatted string
   *
   * @param _value the CustAddress3 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CustAddress3 field
   */
   public void setCustAddress3FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustAddress3FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCustAddress3(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustAddress3");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustAddress3FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustAddress3FromFormattedString");
   }

  /** get the value of the field: CustAddress3 (CMF.cust_address3)
   * @return String the value
   */
  public String getCustAddress3 () {
    return this.CustAddress3;
  }
  /** Change the field to not being actively set: CustAddress3 (CMF.cust_address3)
   */
  public void unsetCustAddress3 () {
    this._CustAddress3Set = false;
  }
  /** See if the field is actively set: CustAddress3 (CMF.cust_address3)
   * @return boolean whether the field is actively set
   */
  public boolean issetCustAddress3 () {
    return this._CustAddress3Set;
  }
  /** set the fields value: CustCity (CMF.cust_city)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CustCity") 
  public void setCustCity (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 35))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CustCity", "setCustCity");
    }
    this.CustCity = value;
    this._CustCitySet = true;
  }

  /** Retrieves the CustCity field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CustCity field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustCity field
   */
   public String getCustCityAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustCityAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustCityAsFormattedString");
       return fmtMgr.formatString(this.getCustCity());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustCity");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustCityAsFormattedString");
       throw x;
     }
   }
  /** Sets the CustCity field from a formatted string
   *
   * @param _value the CustCity field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CustCity field
   */
   public void setCustCityFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustCityFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCustCity(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustCity");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustCityFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustCityFromFormattedString");
   }

  /** get the value of the field: CustCity (CMF.cust_city)
   * @return String the value
   */
  public String getCustCity () {
    return this.CustCity;
  }
  /** Change the field to not being actively set: CustCity (CMF.cust_city)
   */
  public void unsetCustCity () {
    this._CustCitySet = false;
  }
  /** See if the field is actively set: CustCity (CMF.cust_city)
   * @return boolean whether the field is actively set
   */
  public boolean issetCustCity () {
    return this._CustCitySet;
  }
  /** set the fields value: CustState (CMF.cust_state)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CustState") 
  public void setCustState (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 28))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CustState", "setCustState");
    }
    this.CustState = value;
    this._CustStateSet = true;
  }

  /** Retrieves the CustState field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CustState field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustState field
   */
   public String getCustStateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustStateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustStateAsFormattedString");
       return fmtMgr.formatString(this.getCustState());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustState");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustStateAsFormattedString");
       throw x;
     }
   }
  /** Sets the CustState field from a formatted string
   *
   * @param _value the CustState field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CustState field
   */
   public void setCustStateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustStateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCustState(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustState");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustStateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustStateFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated CustState field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the CustState field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CustState field
   */

  public String getCustStateDisplayValue(Locale _locale, IntegerEquals CountryCode) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustStateDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getCustStateEnumeration(_locale, CountryCode);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustStateDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getCustState()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustState");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustStateDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated CustState field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the CustState field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CustState field
   */
  public Enumeration getCustStateEnumeration(Locale _locale, IntegerEquals CountryCode) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustStateEnumeration");
    EnumerationFilter enumFilter = new EnumerationFilter();
    enumFilter.addFilterCondition("CountryCode", CountryCode);

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("StateProvince", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustStateEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustState");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustStateEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated CustState field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setCustStateFromDisplayValue(String _value, Locale _locale, IntegerEquals CountryCode) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCustStateFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getCustStateEnumeration(_locale, CountryCode);
      this.setCustState((String)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), String.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustState");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustStateFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCustStateFromDisplayValue");
  }

  /** get the value of the field: CustState (CMF.cust_state)
   * @return String the value
   */
  public String getCustState () {
    return this.CustState;
  }
  /** Change the field to not being actively set: CustState (CMF.cust_state)
   */
  public void unsetCustState () {
    this._CustStateSet = false;
  }
  /** See if the field is actively set: CustState (CMF.cust_state)
   * @return boolean whether the field is actively set
   */
  public boolean issetCustState () {
    return this._CustStateSet;
  }
  /** set the fields value: CustZip (CMF.cust_zip)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CustZip") 
  public void setCustZip (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 16))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CustZip", "setCustZip");
    }
    this.CustZip = value;
    this._CustZipSet = true;
  }

  /** Retrieves the CustZip field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CustZip field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustZip field
   */
   public String getCustZipAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustZipAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustZipAsFormattedString");
       return fmtMgr.formatString(this.getCustZip());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustZip");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustZipAsFormattedString");
       throw x;
     }
   }
  /** Sets the CustZip field from a formatted string
   *
   * @param _value the CustZip field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CustZip field
   */
   public void setCustZipFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustZipFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCustZip(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustZip");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustZipFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustZipFromFormattedString");
   }

  /** get the value of the field: CustZip (CMF.cust_zip)
   * @return String the value
   */
  public String getCustZip () {
    return this.CustZip;
  }
  /** Change the field to not being actively set: CustZip (CMF.cust_zip)
   */
  public void unsetCustZip () {
    this._CustZipSet = false;
  }
  /** See if the field is actively set: CustZip (CMF.cust_zip)
   * @return boolean whether the field is actively set
   */
  public boolean issetCustZip () {
    return this._CustZipSet;
  }
  /** set the fields value: CustCountryCode (CMF.cust_country_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CustCountryCode") 
  public void setCustCountryCode (Integer value) throws ServiceException
  {
    this.CustCountryCode = value;
    this._CustCountryCodeSet = true;
  }

  /** Retrieves the CustCountryCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CustCountryCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustCountryCode field
   */
   public String getCustCountryCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustCountryCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustCountryCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getCustCountryCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustCountryCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustCountryCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the CustCountryCode field from a formatted string
   *
   * @param _value the CustCountryCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CustCountryCode field
   */
   public void setCustCountryCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustCountryCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCustCountryCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustCountryCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustCountryCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustCountryCodeFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated CustCountryCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the CustCountryCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CustCountryCode field
   */

  public String getCustCountryCodeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustCountryCodeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getCustCountryCodeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustCountryCodeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getCustCountryCode()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustCountryCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustCountryCodeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated CustCountryCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the CustCountryCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CustCountryCode field
   */
  public Enumeration getCustCountryCodeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustCountryCodeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("CountryCode", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustCountryCodeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustCountryCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustCountryCodeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated CustCountryCode field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setCustCountryCodeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCustCountryCodeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getCustCountryCodeEnumeration(_locale);
      this.setCustCountryCode((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustCountryCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustCountryCodeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCustCountryCodeFromDisplayValue");
  }

  /** get the value of the field: CustCountryCode (CMF.cust_country_code)
   * @return Integer the value
   */
  public Integer getCustCountryCode () {
    return this.CustCountryCode;
  }
  /** Change the field to not being actively set: CustCountryCode (CMF.cust_country_code)
   */
  public void unsetCustCountryCode () {
    this._CustCountryCodeSet = false;
  }
  /** See if the field is actively set: CustCountryCode (CMF.cust_country_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCustCountryCode () {
    return this._CustCountryCodeSet;
  }
  /** set the fields value: CustFranchiseTaxCode (CMF.cust_franchise_tax_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CustFranchiseTaxCode") 
  public void setCustFranchiseTaxCode (Integer value) throws ServiceException
  {
    this.CustFranchiseTaxCode = value;
    this._CustFranchiseTaxCodeSet = true;
  }

  /** Retrieves the CustFranchiseTaxCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CustFranchiseTaxCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustFranchiseTaxCode field
   */
   public String getCustFranchiseTaxCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustFranchiseTaxCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustFranchiseTaxCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getCustFranchiseTaxCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustFranchiseTaxCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustFranchiseTaxCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the CustFranchiseTaxCode field from a formatted string
   *
   * @param _value the CustFranchiseTaxCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CustFranchiseTaxCode field
   */
   public void setCustFranchiseTaxCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustFranchiseTaxCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCustFranchiseTaxCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustFranchiseTaxCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustFranchiseTaxCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustFranchiseTaxCodeFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated CustFranchiseTaxCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the CustFranchiseTaxCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CustFranchiseTaxCode field
   */

  public String getCustFranchiseTaxCodeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustFranchiseTaxCodeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getCustFranchiseTaxCodeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustFranchiseTaxCodeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getCustFranchiseTaxCode()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustFranchiseTaxCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustFranchiseTaxCodeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated CustFranchiseTaxCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the CustFranchiseTaxCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CustFranchiseTaxCode field
   */
  public Enumeration getCustFranchiseTaxCodeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustFranchiseTaxCodeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("FranchiseCode", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustFranchiseTaxCodeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustFranchiseTaxCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustFranchiseTaxCodeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated CustFranchiseTaxCode field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setCustFranchiseTaxCodeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCustFranchiseTaxCodeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getCustFranchiseTaxCodeEnumeration(_locale);
      this.setCustFranchiseTaxCode((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustFranchiseTaxCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustFranchiseTaxCodeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCustFranchiseTaxCodeFromDisplayValue");
  }

  /** get the value of the field: CustFranchiseTaxCode (CMF.cust_franchise_tax_code)
   * @return Integer the value
   */
  public Integer getCustFranchiseTaxCode () {
    return this.CustFranchiseTaxCode;
  }
  /** Change the field to not being actively set: CustFranchiseTaxCode (CMF.cust_franchise_tax_code)
   */
  public void unsetCustFranchiseTaxCode () {
    this._CustFranchiseTaxCodeSet = false;
  }
  /** See if the field is actively set: CustFranchiseTaxCode (CMF.cust_franchise_tax_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCustFranchiseTaxCode () {
    return this._CustFranchiseTaxCodeSet;
  }
  /** set the fields value: CustGeocode (CMF.cust_geocode)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CustGeocode") 
  public void setCustGeocode (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 15))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CustGeocode", "setCustGeocode");
    }
    this.CustGeocode = value;
    this._CustGeocodeSet = true;
  }

  /** Retrieves the CustGeocode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CustGeocode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustGeocode field
   */
   public String getCustGeocodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustGeocodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustGeocodeAsFormattedString");
       return fmtMgr.formatString(this.getCustGeocode());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustGeocode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustGeocodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the CustGeocode field from a formatted string
   *
   * @param _value the CustGeocode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CustGeocode field
   */
   public void setCustGeocodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustGeocodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCustGeocode(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustGeocode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustGeocodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustGeocodeFromFormattedString");
   }

  /** get the value of the field: CustGeocode (CMF.cust_geocode)
   * @return String the value
   */
  public String getCustGeocode () {
    return this.CustGeocode;
  }
  /** Change the field to not being actively set: CustGeocode (CMF.cust_geocode)
   */
  public void unsetCustGeocode () {
    this._CustGeocodeSet = false;
  }
  /** See if the field is actively set: CustGeocode (CMF.cust_geocode)
   * @return boolean whether the field is actively set
   */
  public boolean issetCustGeocode () {
    return this._CustGeocodeSet;
  }
  /** set the fields value: CustCounty (CMF.cust_county)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CustCounty") 
  public void setCustCounty (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 28))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CustCounty", "setCustCounty");
    }
    this.CustCounty = value;
    this._CustCountySet = true;
  }

  /** Retrieves the CustCounty field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CustCounty field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustCounty field
   */
   public String getCustCountyAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustCountyAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustCountyAsFormattedString");
       return fmtMgr.formatString(this.getCustCounty());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustCounty");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustCountyAsFormattedString");
       throw x;
     }
   }
  /** Sets the CustCounty field from a formatted string
   *
   * @param _value the CustCounty field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CustCounty field
   */
   public void setCustCountyFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustCountyFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCustCounty(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustCounty");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustCountyFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustCountyFromFormattedString");
   }

  /** get the value of the field: CustCounty (CMF.cust_county)
   * @return String the value
   */
  public String getCustCounty () {
    return this.CustCounty;
  }
  /** Change the field to not being actively set: CustCounty (CMF.cust_county)
   */
  public void unsetCustCounty () {
    this._CustCountySet = false;
  }
  /** See if the field is actively set: CustCounty (CMF.cust_county)
   * @return boolean whether the field is actively set
   */
  public boolean issetCustCounty () {
    return this._CustCountySet;
  }
  /** set the fields value: CustPhone1 (CMF.cust_phone1)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CustPhone1") 
  public void setCustPhone1 (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 20))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CustPhone1", "setCustPhone1");
    }
    this.CustPhone1 = value;
    this._CustPhone1Set = true;
  }

  /** Retrieves the CustPhone1 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CustPhone1 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustPhone1 field
   */
   public String getCustPhone1AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustPhone1AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustPhone1AsFormattedString");
       return fmtMgr.formatString(this.getCustPhone1());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustPhone1");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustPhone1AsFormattedString");
       throw x;
     }
   }
  /** Sets the CustPhone1 field from a formatted string
   *
   * @param _value the CustPhone1 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CustPhone1 field
   */
   public void setCustPhone1FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustPhone1FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCustPhone1(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustPhone1");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustPhone1FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustPhone1FromFormattedString");
   }

  /** get the value of the field: CustPhone1 (CMF.cust_phone1)
   * @return String the value
   */
  public String getCustPhone1 () {
    return this.CustPhone1;
  }
  /** Change the field to not being actively set: CustPhone1 (CMF.cust_phone1)
   */
  public void unsetCustPhone1 () {
    this._CustPhone1Set = false;
  }
  /** See if the field is actively set: CustPhone1 (CMF.cust_phone1)
   * @return boolean whether the field is actively set
   */
  public boolean issetCustPhone1 () {
    return this._CustPhone1Set;
  }
  /** set the fields value: CustPhone2 (CMF.cust_phone2)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CustPhone2") 
  public void setCustPhone2 (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 20))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CustPhone2", "setCustPhone2");
    }
    this.CustPhone2 = value;
    this._CustPhone2Set = true;
  }

  /** Retrieves the CustPhone2 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CustPhone2 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustPhone2 field
   */
   public String getCustPhone2AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustPhone2AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustPhone2AsFormattedString");
       return fmtMgr.formatString(this.getCustPhone2());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustPhone2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustPhone2AsFormattedString");
       throw x;
     }
   }
  /** Sets the CustPhone2 field from a formatted string
   *
   * @param _value the CustPhone2 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CustPhone2 field
   */
   public void setCustPhone2FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustPhone2FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCustPhone2(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustPhone2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustPhone2FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustPhone2FromFormattedString");
   }

  /** get the value of the field: CustPhone2 (CMF.cust_phone2)
   * @return String the value
   */
  public String getCustPhone2 () {
    return this.CustPhone2;
  }
  /** Change the field to not being actively set: CustPhone2 (CMF.cust_phone2)
   */
  public void unsetCustPhone2 () {
    this._CustPhone2Set = false;
  }
  /** See if the field is actively set: CustPhone2 (CMF.cust_phone2)
   * @return boolean whether the field is actively set
   */
  public boolean issetCustPhone2 () {
    return this._CustPhone2Set;
  }
  /** set the fields value: BillAddress1 (CMF.bill_address1)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillAddress1") 
  public void setBillAddress1 (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 75))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BillAddress1", "setBillAddress1");
    }
    this.BillAddress1 = value;
    this._BillAddress1Set = true;
  }

  /** Retrieves the BillAddress1 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillAddress1 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillAddress1 field
   */
   public String getBillAddress1AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillAddress1AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillAddress1AsFormattedString");
       return fmtMgr.formatString(this.getBillAddress1());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillAddress1");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillAddress1AsFormattedString");
       throw x;
     }
   }
  /** Sets the BillAddress1 field from a formatted string
   *
   * @param _value the BillAddress1 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillAddress1 field
   */
   public void setBillAddress1FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillAddress1FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillAddress1(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillAddress1");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillAddress1FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillAddress1FromFormattedString");
   }

  /** get the value of the field: BillAddress1 (CMF.bill_address1)
   * @return String the value
   */
  public String getBillAddress1 () {
    return this.BillAddress1;
  }
  /** Change the field to not being actively set: BillAddress1 (CMF.bill_address1)
   */
  public void unsetBillAddress1 () {
    this._BillAddress1Set = false;
  }
  /** See if the field is actively set: BillAddress1 (CMF.bill_address1)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillAddress1 () {
    return this._BillAddress1Set;
  }
  /** set the fields value: BillAddress2 (CMF.bill_address2)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillAddress2") 
  public void setBillAddress2 (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 75))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BillAddress2", "setBillAddress2");
    }
    this.BillAddress2 = value;
    this._BillAddress2Set = true;
  }

  /** Retrieves the BillAddress2 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillAddress2 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillAddress2 field
   */
   public String getBillAddress2AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillAddress2AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillAddress2AsFormattedString");
       return fmtMgr.formatString(this.getBillAddress2());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillAddress2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillAddress2AsFormattedString");
       throw x;
     }
   }
  /** Sets the BillAddress2 field from a formatted string
   *
   * @param _value the BillAddress2 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillAddress2 field
   */
   public void setBillAddress2FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillAddress2FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillAddress2(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillAddress2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillAddress2FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillAddress2FromFormattedString");
   }

  /** get the value of the field: BillAddress2 (CMF.bill_address2)
   * @return String the value
   */
  public String getBillAddress2 () {
    return this.BillAddress2;
  }
  /** Change the field to not being actively set: BillAddress2 (CMF.bill_address2)
   */
  public void unsetBillAddress2 () {
    this._BillAddress2Set = false;
  }
  /** See if the field is actively set: BillAddress2 (CMF.bill_address2)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillAddress2 () {
    return this._BillAddress2Set;
  }
  /** set the fields value: BillAddress3 (CMF.bill_address3)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillAddress3") 
  public void setBillAddress3 (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 75))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BillAddress3", "setBillAddress3");
    }
    this.BillAddress3 = value;
    this._BillAddress3Set = true;
  }

  /** Retrieves the BillAddress3 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillAddress3 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillAddress3 field
   */
   public String getBillAddress3AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillAddress3AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillAddress3AsFormattedString");
       return fmtMgr.formatString(this.getBillAddress3());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillAddress3");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillAddress3AsFormattedString");
       throw x;
     }
   }
  /** Sets the BillAddress3 field from a formatted string
   *
   * @param _value the BillAddress3 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillAddress3 field
   */
   public void setBillAddress3FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillAddress3FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillAddress3(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillAddress3");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillAddress3FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillAddress3FromFormattedString");
   }

  /** get the value of the field: BillAddress3 (CMF.bill_address3)
   * @return String the value
   */
  public String getBillAddress3 () {
    return this.BillAddress3;
  }
  /** Change the field to not being actively set: BillAddress3 (CMF.bill_address3)
   */
  public void unsetBillAddress3 () {
    this._BillAddress3Set = false;
  }
  /** See if the field is actively set: BillAddress3 (CMF.bill_address3)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillAddress3 () {
    return this._BillAddress3Set;
  }
  /** set the fields value: BillCity (CMF.bill_city)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillCity") 
  public void setBillCity (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 35))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BillCity", "setBillCity");
    }
    this.BillCity = value;
    this._BillCitySet = true;
  }

  /** Retrieves the BillCity field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillCity field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillCity field
   */
   public String getBillCityAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillCityAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillCityAsFormattedString");
       return fmtMgr.formatString(this.getBillCity());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillCity");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillCityAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillCity field from a formatted string
   *
   * @param _value the BillCity field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillCity field
   */
   public void setBillCityFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillCityFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillCity(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillCity");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillCityFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillCityFromFormattedString");
   }

  /** get the value of the field: BillCity (CMF.bill_city)
   * @return String the value
   */
  public String getBillCity () {
    return this.BillCity;
  }
  /** Change the field to not being actively set: BillCity (CMF.bill_city)
   */
  public void unsetBillCity () {
    this._BillCitySet = false;
  }
  /** See if the field is actively set: BillCity (CMF.bill_city)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillCity () {
    return this._BillCitySet;
  }
  /** set the fields value: BillState (CMF.bill_state)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillState") 
  public void setBillState (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 28))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BillState", "setBillState");
    }
    this.BillState = value;
    this._BillStateSet = true;
  }

  /** Retrieves the BillState field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillState field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillState field
   */
   public String getBillStateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillStateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillStateAsFormattedString");
       return fmtMgr.formatString(this.getBillState());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillState");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillStateAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillState field from a formatted string
   *
   * @param _value the BillState field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillState field
   */
   public void setBillStateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillStateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillState(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillState");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillStateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillStateFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated BillState field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the BillState field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BillState field
   */

  public String getBillStateDisplayValue(Locale _locale, IntegerEquals CountryCode) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillStateDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getBillStateEnumeration(_locale, CountryCode);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillStateDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getBillState()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillState");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillStateDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated BillState field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the BillState field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BillState field
   */
  public Enumeration getBillStateEnumeration(Locale _locale, IntegerEquals CountryCode) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillStateEnumeration");
    EnumerationFilter enumFilter = new EnumerationFilter();
    enumFilter.addFilterCondition("CountryCode", CountryCode);

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("StateProvince", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillStateEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillState");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillStateEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated BillState field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setBillStateFromDisplayValue(String _value, Locale _locale, IntegerEquals CountryCode) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillStateFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getBillStateEnumeration(_locale, CountryCode);
      this.setBillState((String)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), String.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillState");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillStateFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillStateFromDisplayValue");
  }

  /** get the value of the field: BillState (CMF.bill_state)
   * @return String the value
   */
  public String getBillState () {
    return this.BillState;
  }
  /** Change the field to not being actively set: BillState (CMF.bill_state)
   */
  public void unsetBillState () {
    this._BillStateSet = false;
  }
  /** See if the field is actively set: BillState (CMF.bill_state)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillState () {
    return this._BillStateSet;
  }
  /** set the fields value: BillZip (CMF.bill_zip)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillZip") 
  public void setBillZip (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 16))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BillZip", "setBillZip");
    }
    this.BillZip = value;
    this._BillZipSet = true;
  }

  /** Retrieves the BillZip field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillZip field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillZip field
   */
   public String getBillZipAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillZipAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillZipAsFormattedString");
       return fmtMgr.formatString(this.getBillZip());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillZip");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillZipAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillZip field from a formatted string
   *
   * @param _value the BillZip field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillZip field
   */
   public void setBillZipFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillZipFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillZip(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillZip");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillZipFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillZipFromFormattedString");
   }

  /** get the value of the field: BillZip (CMF.bill_zip)
   * @return String the value
   */
  public String getBillZip () {
    return this.BillZip;
  }
  /** Change the field to not being actively set: BillZip (CMF.bill_zip)
   */
  public void unsetBillZip () {
    this._BillZipSet = false;
  }
  /** See if the field is actively set: BillZip (CMF.bill_zip)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillZip () {
    return this._BillZipSet;
  }
  /** set the fields value: BillCountryCode (CMF.bill_country_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillCountryCode") 
  public void setBillCountryCode (Integer value) throws ServiceException
  {
    this.BillCountryCode = value;
    this._BillCountryCodeSet = true;
  }

  /** Retrieves the BillCountryCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillCountryCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillCountryCode field
   */
   public String getBillCountryCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillCountryCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillCountryCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getBillCountryCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillCountryCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillCountryCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillCountryCode field from a formatted string
   *
   * @param _value the BillCountryCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillCountryCode field
   */
   public void setBillCountryCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillCountryCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillCountryCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillCountryCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillCountryCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillCountryCodeFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated BillCountryCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the BillCountryCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BillCountryCode field
   */

  public String getBillCountryCodeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillCountryCodeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getBillCountryCodeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillCountryCodeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getBillCountryCode()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillCountryCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillCountryCodeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated BillCountryCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the BillCountryCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BillCountryCode field
   */
  public Enumeration getBillCountryCodeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillCountryCodeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("CountryCode", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillCountryCodeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillCountryCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillCountryCodeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated BillCountryCode field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setBillCountryCodeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillCountryCodeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getBillCountryCodeEnumeration(_locale);
      this.setBillCountryCode((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillCountryCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillCountryCodeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillCountryCodeFromDisplayValue");
  }

  /** get the value of the field: BillCountryCode (CMF.bill_country_code)
   * @return Integer the value
   */
  public Integer getBillCountryCode () {
    return this.BillCountryCode;
  }
  /** Change the field to not being actively set: BillCountryCode (CMF.bill_country_code)
   */
  public void unsetBillCountryCode () {
    this._BillCountryCodeSet = false;
  }
  /** See if the field is actively set: BillCountryCode (CMF.bill_country_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillCountryCode () {
    return this._BillCountryCodeSet;
  }
  /** set the fields value: BillFranchiseTaxCode (CMF.bill_franchise_tax_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillFranchiseTaxCode") 
  public void setBillFranchiseTaxCode (Integer value) throws ServiceException
  {
    this.BillFranchiseTaxCode = value;
    this._BillFranchiseTaxCodeSet = true;
  }

  /** Retrieves the BillFranchiseTaxCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillFranchiseTaxCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillFranchiseTaxCode field
   */
   public String getBillFranchiseTaxCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillFranchiseTaxCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillFranchiseTaxCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getBillFranchiseTaxCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillFranchiseTaxCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillFranchiseTaxCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillFranchiseTaxCode field from a formatted string
   *
   * @param _value the BillFranchiseTaxCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillFranchiseTaxCode field
   */
   public void setBillFranchiseTaxCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillFranchiseTaxCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillFranchiseTaxCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillFranchiseTaxCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillFranchiseTaxCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillFranchiseTaxCodeFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated BillFranchiseTaxCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the BillFranchiseTaxCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BillFranchiseTaxCode field
   */

  public String getBillFranchiseTaxCodeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillFranchiseTaxCodeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getBillFranchiseTaxCodeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillFranchiseTaxCodeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getBillFranchiseTaxCode()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillFranchiseTaxCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillFranchiseTaxCodeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated BillFranchiseTaxCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the BillFranchiseTaxCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BillFranchiseTaxCode field
   */
  public Enumeration getBillFranchiseTaxCodeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillFranchiseTaxCodeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("FranchiseCode", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillFranchiseTaxCodeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillFranchiseTaxCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillFranchiseTaxCodeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated BillFranchiseTaxCode field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setBillFranchiseTaxCodeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillFranchiseTaxCodeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getBillFranchiseTaxCodeEnumeration(_locale);
      this.setBillFranchiseTaxCode((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillFranchiseTaxCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillFranchiseTaxCodeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillFranchiseTaxCodeFromDisplayValue");
  }

  /** get the value of the field: BillFranchiseTaxCode (CMF.bill_franchise_tax_code)
   * @return Integer the value
   */
  public Integer getBillFranchiseTaxCode () {
    return this.BillFranchiseTaxCode;
  }
  /** Change the field to not being actively set: BillFranchiseTaxCode (CMF.bill_franchise_tax_code)
   */
  public void unsetBillFranchiseTaxCode () {
    this._BillFranchiseTaxCodeSet = false;
  }
  /** See if the field is actively set: BillFranchiseTaxCode (CMF.bill_franchise_tax_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillFranchiseTaxCode () {
    return this._BillFranchiseTaxCodeSet;
  }
  /** set the fields value: BillCounty (CMF.bill_county)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillCounty") 
  public void setBillCounty (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 28))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BillCounty", "setBillCounty");
    }
    this.BillCounty = value;
    this._BillCountySet = true;
  }

  /** Retrieves the BillCounty field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillCounty field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillCounty field
   */
   public String getBillCountyAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillCountyAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillCountyAsFormattedString");
       return fmtMgr.formatString(this.getBillCounty());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillCounty");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillCountyAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillCounty field from a formatted string
   *
   * @param _value the BillCounty field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillCounty field
   */
   public void setBillCountyFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillCountyFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillCounty(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillCounty");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillCountyFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillCountyFromFormattedString");
   }

  /** get the value of the field: BillCounty (CMF.bill_county)
   * @return String the value
   */
  public String getBillCounty () {
    return this.BillCounty;
  }
  /** Change the field to not being actively set: BillCounty (CMF.bill_county)
   */
  public void unsetBillCounty () {
    this._BillCountySet = false;
  }
  /** See if the field is actively set: BillCounty (CMF.bill_county)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillCounty () {
    return this._BillCountySet;
  }
  /** set the fields value: BillGeocode (CMF.bill_geocode)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillGeocode") 
  public void setBillGeocode (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 15))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BillGeocode", "setBillGeocode");
    }
    this.BillGeocode = value;
    this._BillGeocodeSet = true;
  }

  /** Retrieves the BillGeocode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillGeocode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillGeocode field
   */
   public String getBillGeocodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillGeocodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillGeocodeAsFormattedString");
       return fmtMgr.formatString(this.getBillGeocode());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillGeocode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillGeocodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillGeocode field from a formatted string
   *
   * @param _value the BillGeocode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillGeocode field
   */
   public void setBillGeocodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillGeocodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillGeocode(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillGeocode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillGeocodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillGeocodeFromFormattedString");
   }

  /** get the value of the field: BillGeocode (CMF.bill_geocode)
   * @return String the value
   */
  public String getBillGeocode () {
    return this.BillGeocode;
  }
  /** Change the field to not being actively set: BillGeocode (CMF.bill_geocode)
   */
  public void unsetBillGeocode () {
    this._BillGeocodeSet = false;
  }
  /** See if the field is actively set: BillGeocode (CMF.bill_geocode)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillGeocode () {
    return this._BillGeocodeSet;
  }
  /** set the fields value: Ssn (CMF.ssn)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Ssn") 
  public void setSsn (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 20))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Ssn", "setSsn");
    }
    this.Ssn = value;
    this._SsnSet = true;
  }

  /** Retrieves the Ssn field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Ssn field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Ssn field
   */
   public String getSsnAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSsnAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSsnAsFormattedString");
       return fmtMgr.formatString(this.getSsn());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Ssn");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSsnAsFormattedString");
       throw x;
     }
   }
  /** Sets the Ssn field from a formatted string
   *
   * @param _value the Ssn field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Ssn field
   */
   public void setSsnFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSsnFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSsn(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Ssn");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSsnFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSsnFromFormattedString");
   }

  /** get the value of the field: Ssn (CMF.ssn)
   * @return String the value
   */
  public String getSsn () {
    return this.Ssn;
  }
  /** Change the field to not being actively set: Ssn (CMF.ssn)
   */
  public void unsetSsn () {
    this._SsnSet = false;
  }
  /** See if the field is actively set: Ssn (CMF.ssn)
   * @return boolean whether the field is actively set
   */
  public boolean issetSsn () {
    return this._SsnSet;
  }
  /** set the fields value: Contact1Name (CMF.contact1_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Contact1Name") 
  public void setContact1Name (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 60))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Contact1Name", "setContact1Name");
    }
    this.Contact1Name = value;
    this._Contact1NameSet = true;
  }

  /** Retrieves the Contact1Name field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Contact1Name field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Contact1Name field
   */
   public String getContact1NameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContact1NameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContact1NameAsFormattedString");
       return fmtMgr.formatString(this.getContact1Name());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Contact1Name");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getContact1NameAsFormattedString");
       throw x;
     }
   }
  /** Sets the Contact1Name field from a formatted string
   *
   * @param _value the Contact1Name field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Contact1Name field
   */
   public void setContact1NameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContact1NameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setContact1Name(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Contact1Name");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setContact1NameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContact1NameFromFormattedString");
   }

  /** get the value of the field: Contact1Name (CMF.contact1_name)
   * @return String the value
   */
  public String getContact1Name () {
    return this.Contact1Name;
  }
  /** Change the field to not being actively set: Contact1Name (CMF.contact1_name)
   */
  public void unsetContact1Name () {
    this._Contact1NameSet = false;
  }
  /** See if the field is actively set: Contact1Name (CMF.contact1_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetContact1Name () {
    return this._Contact1NameSet;
  }
  /** set the fields value: Contact2Name (CMF.contact2_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Contact2Name") 
  public void setContact2Name (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 60))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Contact2Name", "setContact2Name");
    }
    this.Contact2Name = value;
    this._Contact2NameSet = true;
  }

  /** Retrieves the Contact2Name field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Contact2Name field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Contact2Name field
   */
   public String getContact2NameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContact2NameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContact2NameAsFormattedString");
       return fmtMgr.formatString(this.getContact2Name());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Contact2Name");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getContact2NameAsFormattedString");
       throw x;
     }
   }
  /** Sets the Contact2Name field from a formatted string
   *
   * @param _value the Contact2Name field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Contact2Name field
   */
   public void setContact2NameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContact2NameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setContact2Name(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Contact2Name");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setContact2NameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContact2NameFromFormattedString");
   }

  /** get the value of the field: Contact2Name (CMF.contact2_name)
   * @return String the value
   */
  public String getContact2Name () {
    return this.Contact2Name;
  }
  /** Change the field to not being actively set: Contact2Name (CMF.contact2_name)
   */
  public void unsetContact2Name () {
    this._Contact2NameSet = false;
  }
  /** See if the field is actively set: Contact2Name (CMF.contact2_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetContact2Name () {
    return this._Contact2NameSet;
  }
  /** set the fields value: Contact1Phone (CMF.contact1_phone)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Contact1Phone") 
  public void setContact1Phone (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 20))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Contact1Phone", "setContact1Phone");
    }
    this.Contact1Phone = value;
    this._Contact1PhoneSet = true;
  }

  /** Retrieves the Contact1Phone field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Contact1Phone field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Contact1Phone field
   */
   public String getContact1PhoneAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContact1PhoneAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContact1PhoneAsFormattedString");
       return fmtMgr.formatString(this.getContact1Phone());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Contact1Phone");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getContact1PhoneAsFormattedString");
       throw x;
     }
   }
  /** Sets the Contact1Phone field from a formatted string
   *
   * @param _value the Contact1Phone field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Contact1Phone field
   */
   public void setContact1PhoneFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContact1PhoneFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setContact1Phone(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Contact1Phone");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setContact1PhoneFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContact1PhoneFromFormattedString");
   }

  /** get the value of the field: Contact1Phone (CMF.contact1_phone)
   * @return String the value
   */
  public String getContact1Phone () {
    return this.Contact1Phone;
  }
  /** Change the field to not being actively set: Contact1Phone (CMF.contact1_phone)
   */
  public void unsetContact1Phone () {
    this._Contact1PhoneSet = false;
  }
  /** See if the field is actively set: Contact1Phone (CMF.contact1_phone)
   * @return boolean whether the field is actively set
   */
  public boolean issetContact1Phone () {
    return this._Contact1PhoneSet;
  }
  /** set the fields value: Contact2Phone (CMF.contact2_phone)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Contact2Phone") 
  public void setContact2Phone (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 20))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Contact2Phone", "setContact2Phone");
    }
    this.Contact2Phone = value;
    this._Contact2PhoneSet = true;
  }

  /** Retrieves the Contact2Phone field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Contact2Phone field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Contact2Phone field
   */
   public String getContact2PhoneAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContact2PhoneAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContact2PhoneAsFormattedString");
       return fmtMgr.formatString(this.getContact2Phone());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Contact2Phone");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getContact2PhoneAsFormattedString");
       throw x;
     }
   }
  /** Sets the Contact2Phone field from a formatted string
   *
   * @param _value the Contact2Phone field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Contact2Phone field
   */
   public void setContact2PhoneFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContact2PhoneFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setContact2Phone(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Contact2Phone");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setContact2PhoneFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContact2PhoneFromFormattedString");
   }

  /** get the value of the field: Contact2Phone (CMF.contact2_phone)
   * @return String the value
   */
  public String getContact2Phone () {
    return this.Contact2Phone;
  }
  /** Change the field to not being actively set: Contact2Phone (CMF.contact2_phone)
   */
  public void unsetContact2Phone () {
    this._Contact2PhoneSet = false;
  }
  /** See if the field is actively set: Contact2Phone (CMF.contact2_phone)
   * @return boolean whether the field is actively set
   */
  public boolean issetContact2Phone () {
    return this._Contact2PhoneSet;
  }
  /** set the fields value: CustFaxno (CMF.cust_faxno)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CustFaxno") 
  public void setCustFaxno (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 20))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CustFaxno", "setCustFaxno");
    }
    this.CustFaxno = value;
    this._CustFaxnoSet = true;
  }

  /** Retrieves the CustFaxno field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CustFaxno field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustFaxno field
   */
   public String getCustFaxnoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustFaxnoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustFaxnoAsFormattedString");
       return fmtMgr.formatString(this.getCustFaxno());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustFaxno");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustFaxnoAsFormattedString");
       throw x;
     }
   }
  /** Sets the CustFaxno field from a formatted string
   *
   * @param _value the CustFaxno field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CustFaxno field
   */
   public void setCustFaxnoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustFaxnoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCustFaxno(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustFaxno");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustFaxnoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustFaxnoFromFormattedString");
   }

  /** get the value of the field: CustFaxno (CMF.cust_faxno)
   * @return String the value
   */
  public String getCustFaxno () {
    return this.CustFaxno;
  }
  /** Change the field to not being actively set: CustFaxno (CMF.cust_faxno)
   */
  public void unsetCustFaxno () {
    this._CustFaxnoSet = false;
  }
  /** See if the field is actively set: CustFaxno (CMF.cust_faxno)
   * @return boolean whether the field is actively set
   */
  public boolean issetCustFaxno () {
    return this._CustFaxnoSet;
  }
  /** set the fields value: StatementToFaxno (CMF.statement_to_faxno)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("StatementToFaxno") 
  public void setStatementToFaxno (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 20))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "StatementToFaxno", "setStatementToFaxno");
    }
    this.StatementToFaxno = value;
    this._StatementToFaxnoSet = true;
  }

  /** Retrieves the StatementToFaxno field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The StatementToFaxno field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatementToFaxno field
   */
   public String getStatementToFaxnoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatementToFaxnoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatementToFaxnoAsFormattedString");
       return fmtMgr.formatString(this.getStatementToFaxno());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StatementToFaxno");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatementToFaxnoAsFormattedString");
       throw x;
     }
   }
  /** Sets the StatementToFaxno field from a formatted string
   *
   * @param _value the StatementToFaxno field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StatementToFaxno field
   */
   public void setStatementToFaxnoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatementToFaxnoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setStatementToFaxno(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StatementToFaxno");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatementToFaxnoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatementToFaxnoFromFormattedString");
   }

  /** get the value of the field: StatementToFaxno (CMF.statement_to_faxno)
   * @return String the value
   */
  public String getStatementToFaxno () {
    return this.StatementToFaxno;
  }
  /** Change the field to not being actively set: StatementToFaxno (CMF.statement_to_faxno)
   */
  public void unsetStatementToFaxno () {
    this._StatementToFaxnoSet = false;
  }
  /** See if the field is actively set: StatementToFaxno (CMF.statement_to_faxno)
   * @return boolean whether the field is actively set
   */
  public boolean issetStatementToFaxno () {
    return this._StatementToFaxnoSet;
  }
  /** set the fields value: CreditThresh (CMF.credit_thresh)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CreditThresh") 
  public void setCreditThresh (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CreditThresh", "setCreditThresh");
    }
    this.CreditThresh = value;
    this._CreditThreshSet = true;
  }

  /** Retrieves the CreditThresh field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CreditThresh field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CreditThresh field
   */
   public String getCreditThreshAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreditThreshAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCreditThreshAsFormattedString");
       return fmtMgr.formatBigInteger(this.getCreditThresh(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CreditThresh");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCreditThreshAsFormattedString");
       throw x;
     }
   }
  /** Sets the CreditThresh field from a formatted string
   *
   * @param _value the CreditThresh field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CreditThresh field
   */
   public void setCreditThreshFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreditThreshFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCreditThresh(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CreditThresh");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCreditThreshFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCreditThreshFromFormattedString");
   }

  /**
   * Retrieves the CreditThresh field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CreditThresh field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the CreditThresh field
   */
  public String getCreditThreshAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreditThreshAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCreditThreshAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getCreditThresh(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CreditThresh");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCreditThreshAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the CreditThresh field value from a formatted currency string
   *
   * @param _value the CreditThresh field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CreditThresh field
   */
  public void setCreditThreshFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCreditThreshFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setCreditThresh(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CreditThresh");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCreditThreshFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCreditThreshFromFormattedCurrencyString");
  }

  /** get the value of the field: CreditThresh (CMF.credit_thresh)
   * @return BigInteger the value
   */
  public BigInteger getCreditThresh () {
    return this.CreditThresh;
  }
  /** Change the field to not being actively set: CreditThresh (CMF.credit_thresh)
   */
  public void unsetCreditThresh () {
    this._CreditThreshSet = false;
  }
  /** See if the field is actively set: CreditThresh (CMF.credit_thresh)
   * @return boolean whether the field is actively set
   */
  public boolean issetCreditThresh () {
    return this._CreditThreshSet;
  }
  /** set the fields value: CredStatus (CMF.cred_status)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CredStatus") 
  public void setCredStatus (Integer value) throws ServiceException
  {
    this.CredStatus = value;
    this._CredStatusSet = true;
  }

  /** Retrieves the CredStatus field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CredStatus field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CredStatus field
   */
   public String getCredStatusAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCredStatusAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCredStatusAsFormattedString");
       return fmtMgr.formatNumber(this.getCredStatus(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CredStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCredStatusAsFormattedString");
       throw x;
     }
   }
  /** Sets the CredStatus field from a formatted string
   *
   * @param _value the CredStatus field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CredStatus field
   */
   public void setCredStatusFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCredStatusFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCredStatus(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CredStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCredStatusFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCredStatusFromFormattedString");
   }

  /** get the value of the field: CredStatus (CMF.cred_status)
   * @return Integer the value
   */
  public Integer getCredStatus () {
    return this.CredStatus;
  }
  /** Change the field to not being actively set: CredStatus (CMF.cred_status)
   */
  public void unsetCredStatus () {
    this._CredStatusSet = false;
  }
  /** See if the field is actively set: CredStatus (CMF.cred_status)
   * @return boolean whether the field is actively set
   */
  public boolean issetCredStatus () {
    return this._CredStatusSet;
  }
  /** set the fields value: CreditRating (CMF.credit_rating)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CreditRating") 
  public void setCreditRating (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CreditRating", "setCreditRating");
    }
    this.CreditRating = value;
    this._CreditRatingSet = true;
  }

  /** Retrieves the CreditRating field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CreditRating field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CreditRating field
   */
   public String getCreditRatingAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreditRatingAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCreditRatingAsFormattedString");
       return fmtMgr.formatNumber(this.getCreditRating(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CreditRating");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCreditRatingAsFormattedString");
       throw x;
     }
   }
  /** Sets the CreditRating field from a formatted string
   *
   * @param _value the CreditRating field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CreditRating field
   */
   public void setCreditRatingFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreditRatingFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCreditRating(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CreditRating");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCreditRatingFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCreditRatingFromFormattedString");
   }

  /** get the value of the field: CreditRating (CMF.credit_rating)
   * @return Integer the value
   */
  public Integer getCreditRating () {
    return this.CreditRating;
  }
  /** Change the field to not being actively set: CreditRating (CMF.credit_rating)
   */
  public void unsetCreditRating () {
    this._CreditRatingSet = false;
  }
  /** See if the field is actively set: CreditRating (CMF.credit_rating)
   * @return boolean whether the field is actively set
   */
  public boolean issetCreditRating () {
    return this._CreditRatingSet;
  }
  /** set the fields value: DisconnectReason (CMF.disconnect_reason)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DisconnectReason") 
  public void setDisconnectReason (Integer value) throws ServiceException
  {
    this.DisconnectReason = value;
    this._DisconnectReasonSet = true;
  }

  /** Retrieves the DisconnectReason field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DisconnectReason field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DisconnectReason field
   */
   public String getDisconnectReasonAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDisconnectReasonAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDisconnectReasonAsFormattedString");
       return fmtMgr.formatNumber(this.getDisconnectReason(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DisconnectReason");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDisconnectReasonAsFormattedString");
       throw x;
     }
   }
  /** Sets the DisconnectReason field from a formatted string
   *
   * @param _value the DisconnectReason field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DisconnectReason field
   */
   public void setDisconnectReasonFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDisconnectReasonFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDisconnectReason(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DisconnectReason");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDisconnectReasonFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDisconnectReasonFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated DisconnectReason field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the DisconnectReason field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the DisconnectReason field
   */

  public String getDisconnectReasonDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDisconnectReasonDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getDisconnectReasonEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDisconnectReasonDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getDisconnectReason()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DisconnectReason");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDisconnectReasonDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated DisconnectReason field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the DisconnectReason field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the DisconnectReason field
   */
  public Enumeration getDisconnectReasonEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDisconnectReasonEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("DiscReason", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDisconnectReasonEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DisconnectReason");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDisconnectReasonEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated DisconnectReason field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setDisconnectReasonFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDisconnectReasonFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getDisconnectReasonEnumeration(_locale);
      this.setDisconnectReason((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DisconnectReason");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDisconnectReasonFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDisconnectReasonFromDisplayValue");
  }

  /** get the value of the field: DisconnectReason (CMF.disconnect_reason)
   * @return Integer the value
   */
  public Integer getDisconnectReason () {
    return this.DisconnectReason;
  }
  /** Change the field to not being actively set: DisconnectReason (CMF.disconnect_reason)
   */
  public void unsetDisconnectReason () {
    this._DisconnectReasonSet = false;
  }
  /** See if the field is actively set: DisconnectReason (CMF.disconnect_reason)
   * @return boolean whether the field is actively set
   */
  public boolean issetDisconnectReason () {
    return this._DisconnectReasonSet;
  }
  /** set the fields value: DiscRcvOpt (CMF.disc_rcv_opt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DiscRcvOpt") 
  public void setDiscRcvOpt (Integer value) throws ServiceException
  {
    this.DiscRcvOpt = value;
    this._DiscRcvOptSet = true;
  }

  /** Retrieves the DiscRcvOpt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DiscRcvOpt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DiscRcvOpt field
   */
   public String getDiscRcvOptAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscRcvOptAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscRcvOptAsFormattedString");
       return fmtMgr.formatNumber(this.getDiscRcvOpt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DiscRcvOpt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDiscRcvOptAsFormattedString");
       throw x;
     }
   }
  /** Sets the DiscRcvOpt field from a formatted string
   *
   * @param _value the DiscRcvOpt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DiscRcvOpt field
   */
   public void setDiscRcvOptFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscRcvOptFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDiscRcvOpt(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DiscRcvOpt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDiscRcvOptFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDiscRcvOptFromFormattedString");
   }

  /** get the value of the field: DiscRcvOpt (CMF.disc_rcv_opt)
   * @return Integer the value
   */
  public Integer getDiscRcvOpt () {
    return this.DiscRcvOpt;
  }
  /** Change the field to not being actively set: DiscRcvOpt (CMF.disc_rcv_opt)
   */
  public void unsetDiscRcvOpt () {
    this._DiscRcvOptSet = false;
  }
  /** See if the field is actively set: DiscRcvOpt (CMF.disc_rcv_opt)
   * @return boolean whether the field is actively set
   */
  public boolean issetDiscRcvOpt () {
    return this._DiscRcvOptSet;
  }
  /** set the fields value: ThreshRef (CMF.thresh_ref)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ThreshRef") 
  public void setThreshRef (Integer value) throws ServiceException
  {
    this.ThreshRef = value;
    this._ThreshRefSet = true;
  }

  /** Retrieves the ThreshRef field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ThreshRef field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ThreshRef field
   */
   public String getThreshRefAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getThreshRefAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getThreshRefAsFormattedString");
       return fmtMgr.formatNumber(this.getThreshRef(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ThreshRef");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getThreshRefAsFormattedString");
       throw x;
     }
   }
  /** Sets the ThreshRef field from a formatted string
   *
   * @param _value the ThreshRef field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ThreshRef field
   */
   public void setThreshRefFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getThreshRefFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setThreshRef(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ThreshRef");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setThreshRefFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setThreshRefFromFormattedString");
   }

  /** get the value of the field: ThreshRef (CMF.thresh_ref)
   * @return Integer the value
   */
  public Integer getThreshRef () {
    return this.ThreshRef;
  }
  /** Change the field to not being actively set: ThreshRef (CMF.thresh_ref)
   */
  public void unsetThreshRef () {
    this._ThreshRefSet = false;
  }
  /** See if the field is actively set: ThreshRef (CMF.thresh_ref)
   * @return boolean whether the field is actively set
   */
  public boolean issetThreshRef () {
    return this._ThreshRefSet;
  }
  /** set the fields value: BillPeriod (CMF.bill_period)
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

  /** get the value of the field: BillPeriod (CMF.bill_period)
   * @return String the value
   */
  public String getBillPeriod () {
    return this.BillPeriod;
  }
  /** Change the field to not being actively set: BillPeriod (CMF.bill_period)
   */
  public void unsetBillPeriod () {
    this._BillPeriodSet = false;
  }
  /** See if the field is actively set: BillPeriod (CMF.bill_period)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillPeriod () {
    return this._BillPeriodSet;
  }
  /** set the fields value: BillingFrequency (CMF.billing_frequency)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillingFrequency") 
  public void setBillingFrequency (Integer value) throws ServiceException
  {
    this.BillingFrequency = value;
    this._BillingFrequencySet = true;
  }

  /** Retrieves the BillingFrequency field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillingFrequency field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillingFrequency field
   */
   public String getBillingFrequencyAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillingFrequencyAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillingFrequencyAsFormattedString");
       return fmtMgr.formatNumber(this.getBillingFrequency(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillingFrequency");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillingFrequencyAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillingFrequency field from a formatted string
   *
   * @param _value the BillingFrequency field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillingFrequency field
   */
   public void setBillingFrequencyFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillingFrequencyFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillingFrequency(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillingFrequency");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillingFrequencyFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillingFrequencyFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated BillingFrequency field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the BillingFrequency field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BillingFrequency field
   */

  public String getBillingFrequencyDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillingFrequencyDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getBillingFrequencyEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillingFrequencyDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getBillingFrequency()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillingFrequency");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillingFrequencyDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated BillingFrequency field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the BillingFrequency field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BillingFrequency field
   */
  public Enumeration getBillingFrequencyEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillingFrequencyEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("BillingFrequency", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillingFrequencyEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillingFrequency");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillingFrequencyEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated BillingFrequency field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setBillingFrequencyFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillingFrequencyFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getBillingFrequencyEnumeration(_locale);
      this.setBillingFrequency((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillingFrequency");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillingFrequencyFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillingFrequencyFromDisplayValue");
  }

  /** get the value of the field: BillingFrequency (CMF.billing_frequency)
   * @return Integer the value
   */
  public Integer getBillingFrequency () {
    return this.BillingFrequency;
  }
  /** Change the field to not being actively set: BillingFrequency (CMF.billing_frequency)
   */
  public void unsetBillingFrequency () {
    this._BillingFrequencySet = false;
  }
  /** See if the field is actively set: BillingFrequency (CMF.billing_frequency)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillingFrequency () {
    return this._BillingFrequencySet;
  }
  /** set the fields value: BillFmtOpt (CMF.bill_fmt_opt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillFmtOpt") 
  public void setBillFmtOpt (Integer value) throws ServiceException
  {
    this.BillFmtOpt = value;
    this._BillFmtOptSet = true;
  }

  /** Retrieves the BillFmtOpt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillFmtOpt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillFmtOpt field
   */
   public String getBillFmtOptAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillFmtOptAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillFmtOptAsFormattedString");
       return fmtMgr.formatNumber(this.getBillFmtOpt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillFmtOpt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillFmtOptAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillFmtOpt field from a formatted string
   *
   * @param _value the BillFmtOpt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillFmtOpt field
   */
   public void setBillFmtOptFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillFmtOptFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillFmtOpt(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillFmtOpt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillFmtOptFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillFmtOptFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated BillFmtOpt field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the BillFmtOpt field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BillFmtOpt field
   */

  public String getBillFmtOptDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillFmtOptDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getBillFmtOptEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillFmtOptDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getBillFmtOpt()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillFmtOpt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillFmtOptDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated BillFmtOpt field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the BillFmtOpt field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BillFmtOpt field
   */
  public Enumeration getBillFmtOptEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillFmtOptEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("BillFormatOption", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillFmtOptEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillFmtOpt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillFmtOptEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated BillFmtOpt field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setBillFmtOptFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillFmtOptFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getBillFmtOptEnumeration(_locale);
      this.setBillFmtOpt((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillFmtOpt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillFmtOptFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillFmtOptFromDisplayValue");
  }

  /** get the value of the field: BillFmtOpt (CMF.bill_fmt_opt)
   * @return Integer the value
   */
  public Integer getBillFmtOpt () {
    return this.BillFmtOpt;
  }
  /** Change the field to not being actively set: BillFmtOpt (CMF.bill_fmt_opt)
   */
  public void unsetBillFmtOpt () {
    this._BillFmtOptSet = false;
  }
  /** See if the field is actively set: BillFmtOpt (CMF.bill_fmt_opt)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillFmtOpt () {
    return this._BillFmtOptSet;
  }
  /** set the fields value: BillDispMeth (CMF.bill_disp_meth)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillDispMeth") 
  public void setBillDispMeth (Integer value) throws ServiceException
  {
    this.BillDispMeth = value;
    this._BillDispMethSet = true;
  }

  /** Retrieves the BillDispMeth field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillDispMeth field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillDispMeth field
   */
   public String getBillDispMethAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillDispMethAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillDispMethAsFormattedString");
       return fmtMgr.formatNumber(this.getBillDispMeth(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillDispMeth");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillDispMethAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillDispMeth field from a formatted string
   *
   * @param _value the BillDispMeth field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillDispMeth field
   */
   public void setBillDispMethFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillDispMethFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillDispMeth(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillDispMeth");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillDispMethFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillDispMethFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated BillDispMeth field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the BillDispMeth field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BillDispMeth field
   */

  public String getBillDispMethDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillDispMethDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getBillDispMethEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillDispMethDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getBillDispMeth()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillDispMeth");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillDispMethDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated BillDispMeth field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the BillDispMeth field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BillDispMeth field
   */
  public Enumeration getBillDispMethEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillDispMethEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("BillDispatchMethod", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillDispMethEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillDispMeth");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillDispMethEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated BillDispMeth field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setBillDispMethFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillDispMethFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getBillDispMethEnumeration(_locale);
      this.setBillDispMeth((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillDispMeth");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillDispMethFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillDispMethFromDisplayValue");
  }

  /** get the value of the field: BillDispMeth (CMF.bill_disp_meth)
   * @return Integer the value
   */
  public Integer getBillDispMeth () {
    return this.BillDispMeth;
  }
  /** Change the field to not being actively set: BillDispMeth (CMF.bill_disp_meth)
   */
  public void unsetBillDispMeth () {
    this._BillDispMethSet = false;
  }
  /** See if the field is actively set: BillDispMeth (CMF.bill_disp_meth)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillDispMeth () {
    return this._BillDispMethSet;
  }
  /** set the fields value: BillHoldCode (CMF.bill_hold_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillHoldCode") 
  public void setBillHoldCode (Integer value) throws ServiceException
  {
    this.BillHoldCode = value;
    this._BillHoldCodeSet = true;
  }

  /** Retrieves the BillHoldCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillHoldCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillHoldCode field
   */
   public String getBillHoldCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillHoldCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillHoldCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getBillHoldCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillHoldCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillHoldCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillHoldCode field from a formatted string
   *
   * @param _value the BillHoldCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillHoldCode field
   */
   public void setBillHoldCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillHoldCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillHoldCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillHoldCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillHoldCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillHoldCodeFromFormattedString");
   }

  /** get the value of the field: BillHoldCode (CMF.bill_hold_code)
   * @return Integer the value
   */
  public Integer getBillHoldCode () {
    return this.BillHoldCode;
  }
  /** Change the field to not being actively set: BillHoldCode (CMF.bill_hold_code)
   */
  public void unsetBillHoldCode () {
    this._BillHoldCodeSet = false;
  }
  /** See if the field is actively set: BillHoldCode (CMF.bill_hold_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillHoldCode () {
    return this._BillHoldCodeSet;
  }
  /** set the fields value: MsgGrpId (CMF.msg_grp_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MsgGrpId") 
  public void setMsgGrpId (Integer value) throws ServiceException
  {
    this.MsgGrpId = value;
    this._MsgGrpIdSet = true;
  }

  /** Retrieves the MsgGrpId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MsgGrpId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MsgGrpId field
   */
   public String getMsgGrpIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgGrpIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMsgGrpIdAsFormattedString");
       return fmtMgr.formatNumber(this.getMsgGrpId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MsgGrpId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMsgGrpIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the MsgGrpId field from a formatted string
   *
   * @param _value the MsgGrpId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MsgGrpId field
   */
   public void setMsgGrpIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgGrpIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMsgGrpId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MsgGrpId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMsgGrpIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMsgGrpIdFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated MsgGrpId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the MsgGrpId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the MsgGrpId field
   */

  public String getMsgGrpIdDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgGrpIdDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getMsgGrpIdEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMsgGrpIdDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getMsgGrpId()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MsgGrpId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMsgGrpIdDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated MsgGrpId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the MsgGrpId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the MsgGrpId field
   */
  public Enumeration getMsgGrpIdEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgGrpIdEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("BillMessageGroup", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMsgGrpIdEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MsgGrpId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMsgGrpIdEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated MsgGrpId field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setMsgGrpIdFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMsgGrpIdFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getMsgGrpIdEnumeration(_locale);
      this.setMsgGrpId((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MsgGrpId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMsgGrpIdFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMsgGrpIdFromDisplayValue");
  }

  /** get the value of the field: MsgGrpId (CMF.msg_grp_id)
   * @return Integer the value
   */
  public Integer getMsgGrpId () {
    return this.MsgGrpId;
  }
  /** Change the field to not being actively set: MsgGrpId (CMF.msg_grp_id)
   */
  public void unsetMsgGrpId () {
    this._MsgGrpIdSet = false;
  }
  /** See if the field is actively set: MsgGrpId (CMF.msg_grp_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetMsgGrpId () {
    return this._MsgGrpIdSet;
  }
  /** set the fields value: InsertGrpId (CMF.insert_grp_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("InsertGrpId") 
  public void setInsertGrpId (Integer value) throws ServiceException
  {
    this.InsertGrpId = value;
    this._InsertGrpIdSet = true;
  }

  /** Retrieves the InsertGrpId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InsertGrpId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InsertGrpId field
   */
   public String getInsertGrpIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInsertGrpIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInsertGrpIdAsFormattedString");
       return fmtMgr.formatNumber(this.getInsertGrpId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InsertGrpId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInsertGrpIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the InsertGrpId field from a formatted string
   *
   * @param _value the InsertGrpId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InsertGrpId field
   */
   public void setInsertGrpIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInsertGrpIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInsertGrpId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InsertGrpId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInsertGrpIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInsertGrpIdFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated InsertGrpId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the InsertGrpId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the InsertGrpId field
   */

  public String getInsertGrpIdDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInsertGrpIdDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getInsertGrpIdEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInsertGrpIdDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getInsertGrpId()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InsertGrpId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInsertGrpIdDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated InsertGrpId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the InsertGrpId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the InsertGrpId field
   */
  public Enumeration getInsertGrpIdEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInsertGrpIdEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("BillInsertGroup", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInsertGrpIdEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InsertGrpId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInsertGrpIdEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated InsertGrpId field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setInsertGrpIdFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInsertGrpIdFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getInsertGrpIdEnumeration(_locale);
      this.setInsertGrpId((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InsertGrpId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInsertGrpIdFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInsertGrpIdFromDisplayValue");
  }

  /** get the value of the field: InsertGrpId (CMF.insert_grp_id)
   * @return Integer the value
   */
  public Integer getInsertGrpId () {
    return this.InsertGrpId;
  }
  /** Change the field to not being actively set: InsertGrpId (CMF.insert_grp_id)
   */
  public void unsetInsertGrpId () {
    this._InsertGrpIdSet = false;
  }
  /** See if the field is actively set: InsertGrpId (CMF.insert_grp_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetInsertGrpId () {
    return this._InsertGrpIdSet;
  }
  /** set the fields value: RateClassDefault (CMF.rate_class_default)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RateClassDefault") 
  public void setRateClassDefault (Integer value) throws ServiceException
  {
    this.RateClassDefault = value;
    this._RateClassDefaultSet = true;
  }

  /** Retrieves the RateClassDefault field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RateClassDefault field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateClassDefault field
   */
   public String getRateClassDefaultAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateClassDefaultAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateClassDefaultAsFormattedString");
       return fmtMgr.formatNumber(this.getRateClassDefault(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateClassDefault");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateClassDefaultAsFormattedString");
       throw x;
     }
   }
  /** Sets the RateClassDefault field from a formatted string
   *
   * @param _value the RateClassDefault field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RateClassDefault field
   */
   public void setRateClassDefaultFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateClassDefaultFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRateClassDefault(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateClassDefault");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateClassDefaultFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateClassDefaultFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated RateClassDefault field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the RateClassDefault field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the RateClassDefault field
   */

  public String getRateClassDefaultDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateClassDefaultDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getRateClassDefaultEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateClassDefaultDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getRateClassDefault()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateClassDefault");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateClassDefaultDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated RateClassDefault field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the RateClassDefault field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the RateClassDefault field
   */
  public Enumeration getRateClassDefaultEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateClassDefaultEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("RateClass", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateClassDefaultEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateClassDefault");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateClassDefaultEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated RateClassDefault field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setRateClassDefaultFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRateClassDefaultFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getRateClassDefaultEnumeration(_locale);
      this.setRateClassDefault((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateClassDefault");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateClassDefaultFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRateClassDefaultFromDisplayValue");
  }

  /** get the value of the field: RateClassDefault (CMF.rate_class_default)
   * @return Integer the value
   */
  public Integer getRateClassDefault () {
    return this.RateClassDefault;
  }
  /** Change the field to not being actively set: RateClassDefault (CMF.rate_class_default)
   */
  public void unsetRateClassDefault () {
    this._RateClassDefaultSet = false;
  }
  /** See if the field is actively set: RateClassDefault (CMF.rate_class_default)
   * @return boolean whether the field is actively set
   */
  public boolean issetRateClassDefault () {
    return this._RateClassDefaultSet;
  }
  /** set the fields value: RateClassSpecial (CMF.rate_class_special)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RateClassSpecial") 
  public void setRateClassSpecial (Integer value) throws ServiceException
  {
    this.RateClassSpecial = value;
    this._RateClassSpecialSet = true;
  }

  /** Retrieves the RateClassSpecial field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RateClassSpecial field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateClassSpecial field
   */
   public String getRateClassSpecialAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateClassSpecialAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateClassSpecialAsFormattedString");
       return fmtMgr.formatNumber(this.getRateClassSpecial(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateClassSpecial");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateClassSpecialAsFormattedString");
       throw x;
     }
   }
  /** Sets the RateClassSpecial field from a formatted string
   *
   * @param _value the RateClassSpecial field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RateClassSpecial field
   */
   public void setRateClassSpecialFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateClassSpecialFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRateClassSpecial(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateClassSpecial");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateClassSpecialFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateClassSpecialFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated RateClassSpecial field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the RateClassSpecial field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the RateClassSpecial field
   */

  public String getRateClassSpecialDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateClassSpecialDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getRateClassSpecialEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateClassSpecialDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getRateClassSpecial()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateClassSpecial");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateClassSpecialDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated RateClassSpecial field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the RateClassSpecial field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the RateClassSpecial field
   */
  public Enumeration getRateClassSpecialEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateClassSpecialEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("RateClass", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateClassSpecialEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateClassSpecial");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateClassSpecialEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated RateClassSpecial field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setRateClassSpecialFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRateClassSpecialFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getRateClassSpecialEnumeration(_locale);
      this.setRateClassSpecial((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateClassSpecial");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateClassSpecialFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRateClassSpecialFromDisplayValue");
  }

  /** get the value of the field: RateClassSpecial (CMF.rate_class_special)
   * @return Integer the value
   */
  public Integer getRateClassSpecial () {
    return this.RateClassSpecial;
  }
  /** Change the field to not being actively set: RateClassSpecial (CMF.rate_class_special)
   */
  public void unsetRateClassSpecial () {
    this._RateClassSpecialSet = false;
  }
  /** See if the field is actively set: RateClassSpecial (CMF.rate_class_special)
   * @return boolean whether the field is actively set
   */
  public boolean issetRateClassSpecial () {
    return this._RateClassSpecialSet;
  }
  /** set the fields value: ExrateClass (CMF.exrate_class)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ExrateClass") 
  public void setExrateClass (Integer value) throws ServiceException
  {
    this.ExrateClass = value;
    this._ExrateClassSet = true;
  }

  /** Retrieves the ExrateClass field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ExrateClass field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExrateClass field
   */
   public String getExrateClassAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExrateClassAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExrateClassAsFormattedString");
       return fmtMgr.formatNumber(this.getExrateClass(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExrateClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getExrateClassAsFormattedString");
       throw x;
     }
   }
  /** Sets the ExrateClass field from a formatted string
   *
   * @param _value the ExrateClass field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ExrateClass field
   */
   public void setExrateClassFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExrateClassFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setExrateClass(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExrateClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setExrateClassFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExrateClassFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated ExrateClass field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the ExrateClass field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ExrateClass field
   */

  public String getExrateClassDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExrateClassDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getExrateClassEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExrateClassDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getExrateClass()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExrateClass");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getExrateClassDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated ExrateClass field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the ExrateClass field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ExrateClass field
   */
  public Enumeration getExrateClassEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExrateClassEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("ExchangeRateClass", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExrateClassEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExrateClass");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getExrateClassEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated ExrateClass field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setExrateClassFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setExrateClassFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getExrateClassEnumeration(_locale);
      this.setExrateClass((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExrateClass");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setExrateClassFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setExrateClassFromDisplayValue");
  }

  /** get the value of the field: ExrateClass (CMF.exrate_class)
   * @return Integer the value
   */
  public Integer getExrateClass () {
    return this.ExrateClass;
  }
  /** Change the field to not being actively set: ExrateClass (CMF.exrate_class)
   */
  public void unsetExrateClass () {
    this._ExrateClassSet = false;
  }
  /** See if the field is actively set: ExrateClass (CMF.exrate_class)
   * @return boolean whether the field is actively set
   */
  public boolean issetExrateClass () {
    return this._ExrateClassSet;
  }
  /** set the fields value: PlanIdDiscount (CMF.plan_id_discount)
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

  /**
   * Retrieves the display value for the enumerated PlanIdDiscount field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the PlanIdDiscount field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the PlanIdDiscount field
   */

  public String getPlanIdDiscountDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPlanIdDiscountDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getPlanIdDiscountEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPlanIdDiscountDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getPlanIdDiscount()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PlanIdDiscount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPlanIdDiscountDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated PlanIdDiscount field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the PlanIdDiscount field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the PlanIdDiscount field
   */
  public Enumeration getPlanIdDiscountEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPlanIdDiscountEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("DiscountPlanType", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPlanIdDiscountEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PlanIdDiscount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPlanIdDiscountEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated PlanIdDiscount field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setPlanIdDiscountFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPlanIdDiscountFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getPlanIdDiscountEnumeration(_locale);
      this.setPlanIdDiscount((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PlanIdDiscount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPlanIdDiscountFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPlanIdDiscountFromDisplayValue");
  }

  /** get the value of the field: PlanIdDiscount (CMF.plan_id_discount)
   * @return Integer the value
   */
  public Integer getPlanIdDiscount () {
    return this.PlanIdDiscount;
  }
  /** Change the field to not being actively set: PlanIdDiscount (CMF.plan_id_discount)
   */
  public void unsetPlanIdDiscount () {
    this._PlanIdDiscountSet = false;
  }
  /** See if the field is actively set: PlanIdDiscount (CMF.plan_id_discount)
   * @return boolean whether the field is actively set
   */
  public boolean issetPlanIdDiscount () {
    return this._PlanIdDiscountSet;
  }
  /** set the fields value: PlanIdCredit (CMF.plan_id_credit)
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

  /**
   * Retrieves the display value for the enumerated PlanIdCredit field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the PlanIdCredit field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the PlanIdCredit field
   */

  public String getPlanIdCreditDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPlanIdCreditDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getPlanIdCreditEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPlanIdCreditDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getPlanIdCredit()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PlanIdCredit");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPlanIdCreditDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated PlanIdCredit field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the PlanIdCredit field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the PlanIdCredit field
   */
  public Enumeration getPlanIdCreditEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPlanIdCreditEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("UsageCreditPlanType", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPlanIdCreditEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PlanIdCredit");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPlanIdCreditEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated PlanIdCredit field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setPlanIdCreditFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPlanIdCreditFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getPlanIdCreditEnumeration(_locale);
      this.setPlanIdCredit((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PlanIdCredit");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPlanIdCreditFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPlanIdCreditFromDisplayValue");
  }

  /** get the value of the field: PlanIdCredit (CMF.plan_id_credit)
   * @return Integer the value
   */
  public Integer getPlanIdCredit () {
    return this.PlanIdCredit;
  }
  /** Change the field to not being actively set: PlanIdCredit (CMF.plan_id_credit)
   */
  public void unsetPlanIdCredit () {
    this._PlanIdCreditSet = false;
  }
  /** See if the field is actively set: PlanIdCredit (CMF.plan_id_credit)
   * @return boolean whether the field is actively set
   */
  public boolean issetPlanIdCredit () {
    return this._PlanIdCreditSet;
  }
  /** set the fields value: AccountStatus (CMF.account_status)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AccountStatus") 
  public void setAccountStatus (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountStatus", "setAccountStatus");
    }
    this.AccountStatus = value;
    this._AccountStatusSet = true;
  }

  /** Retrieves the AccountStatus field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AccountStatus field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountStatus field
   */
   public String getAccountStatusAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountStatusAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountStatusAsFormattedString");
       return fmtMgr.formatNumber(this.getAccountStatus(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountStatusAsFormattedString");
       throw x;
     }
   }
  /** Sets the AccountStatus field from a formatted string
   *
   * @param _value the AccountStatus field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AccountStatus field
   */
   public void setAccountStatusFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountStatusFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAccountStatus(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountStatusFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountStatusFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated AccountStatus field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the AccountStatus field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AccountStatus field
   */

  public String getAccountStatusDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountStatusDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getAccountStatusEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountStatusDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getAccountStatus()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountStatus");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountStatusDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated AccountStatus field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the AccountStatus field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AccountStatus field
   */
  public Enumeration getAccountStatusEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountStatusEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("AccountStatus", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountStatusEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountStatus");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountStatusEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated AccountStatus field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setAccountStatusFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountStatusFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getAccountStatusEnumeration(_locale);
      this.setAccountStatus((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountStatus");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountStatusFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountStatusFromDisplayValue");
  }

  /** get the value of the field: AccountStatus (CMF.account_status)
   * @return Integer the value
   */
  public Integer getAccountStatus () {
    return this.AccountStatus;
  }
  /** Change the field to not being actively set: AccountStatus (CMF.account_status)
   */
  public void unsetAccountStatus () {
    this._AccountStatusSet = false;
  }
  /** See if the field is actively set: AccountStatus (CMF.account_status)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountStatus () {
    return this._AccountStatusSet;
  }
  /** set the fields value: AccountStatusDt (CMF.account_status_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AccountStatusDt") 
  public void setAccountStatusDt (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountStatusDt", "setAccountStatusDt");
    }
    this.AccountStatusDt = value;
    this._AccountStatusDtSet = true;
  }

  /** Retrieves the AccountStatusDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AccountStatusDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountStatusDt field
   */
   public String getAccountStatusDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountStatusDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountStatusDtAsFormattedString");
       return fmtMgr.formatDate(this.getAccountStatusDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountStatusDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountStatusDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the AccountStatusDt field from a formatted string
   *
   * @param _value the AccountStatusDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AccountStatusDt field
   */
   public void setAccountStatusDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountStatusDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAccountStatusDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountStatusDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountStatusDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountStatusDtFromFormattedString");
   }

  /**
   * Retrieves the AccountStatusDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AccountStatusDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountStatusDt field
   */
  public String getAccountStatusDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountStatusDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountStatusDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getAccountStatusDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountStatusDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountStatusDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the AccountStatusDt field value from a formatted date/time string
   *
   * @param _value the AccountStatusDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AccountStatusDt field
   */
  public void setAccountStatusDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountStatusDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setAccountStatusDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountStatusDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountStatusDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: AccountStatusDt (CMF.account_status_dt)
   * @return Date the value
   */
  public Date getAccountStatusDt () {
    return this.AccountStatusDt;
  }
  /** Change the field to not being actively set: AccountStatusDt (CMF.account_status_dt)
   */
  public void unsetAccountStatusDt () {
    this._AccountStatusDtSet = false;
  }
  /** See if the field is actively set: AccountStatusDt (CMF.account_status_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountStatusDt () {
    return this._AccountStatusDtSet;
  }
  /** set the fields value: DistrChan (CMF.distr_chan)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DistrChan") 
  public void setDistrChan (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "DistrChan", "setDistrChan");
    }
    this.DistrChan = value;
    this._DistrChanSet = true;
  }

  /** Retrieves the DistrChan field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DistrChan field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DistrChan field
   */
   public String getDistrChanAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDistrChanAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDistrChanAsFormattedString");
       return fmtMgr.formatString(this.getDistrChan());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DistrChan");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDistrChanAsFormattedString");
       throw x;
     }
   }
  /** Sets the DistrChan field from a formatted string
   *
   * @param _value the DistrChan field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DistrChan field
   */
   public void setDistrChanFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDistrChanFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDistrChan(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DistrChan");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDistrChanFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDistrChanFromFormattedString");
   }

  /** get the value of the field: DistrChan (CMF.distr_chan)
   * @return String the value
   */
  public String getDistrChan () {
    return this.DistrChan;
  }
  /** Change the field to not being actively set: DistrChan (CMF.distr_chan)
   */
  public void unsetDistrChan () {
    this._DistrChanSet = false;
  }
  /** See if the field is actively set: DistrChan (CMF.distr_chan)
   * @return boolean whether the field is actively set
   */
  public boolean issetDistrChan () {
    return this._DistrChanSet;
  }
  /** set the fields value: SalesCode (CMF.sales_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SalesCode") 
  public void setSalesCode (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 13))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "SalesCode", "setSalesCode");
    }
    this.SalesCode = value;
    this._SalesCodeSet = true;
  }

  /** Retrieves the SalesCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SalesCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SalesCode field
   */
   public String getSalesCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSalesCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSalesCodeAsFormattedString");
       return fmtMgr.formatString(this.getSalesCode());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SalesCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSalesCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the SalesCode field from a formatted string
   *
   * @param _value the SalesCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SalesCode field
   */
   public void setSalesCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSalesCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSalesCode(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SalesCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSalesCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSalesCodeFromFormattedString");
   }

  /** get the value of the field: SalesCode (CMF.sales_code)
   * @return String the value
   */
  public String getSalesCode () {
    return this.SalesCode;
  }
  /** Change the field to not being actively set: SalesCode (CMF.sales_code)
   */
  public void unsetSalesCode () {
    this._SalesCodeSet = false;
  }
  /** See if the field is actively set: SalesCode (CMF.sales_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetSalesCode () {
    return this._SalesCodeSet;
  }
  /** set the fields value: MktCode (CMF.mkt_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MktCode") 
  public void setMktCode (Integer value) throws ServiceException
  {
    this.MktCode = value;
    this._MktCodeSet = true;
  }

  /** Retrieves the MktCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MktCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MktCode field
   */
   public String getMktCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMktCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMktCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getMktCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MktCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMktCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the MktCode field from a formatted string
   *
   * @param _value the MktCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MktCode field
   */
   public void setMktCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMktCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMktCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MktCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMktCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMktCodeFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated MktCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the MktCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the MktCode field
   */

  public String getMktCodeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMktCodeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getMktCodeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMktCodeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getMktCode()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MktCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMktCodeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated MktCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the MktCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the MktCode field
   */
  public Enumeration getMktCodeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMktCodeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("MarketCode", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMktCodeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MktCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMktCodeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated MktCode field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setMktCodeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMktCodeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getMktCodeEnumeration(_locale);
      this.setMktCode((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MktCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMktCodeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMktCodeFromDisplayValue");
  }

  /** get the value of the field: MktCode (CMF.mkt_code)
   * @return Integer the value
   */
  public Integer getMktCode () {
    return this.MktCode;
  }
  /** Change the field to not being actively set: MktCode (CMF.mkt_code)
   */
  public void unsetMktCode () {
    this._MktCodeSet = false;
  }
  /** See if the field is actively set: MktCode (CMF.mkt_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetMktCode () {
    return this._MktCodeSet;
  }
  /** set the fields value: SicCode (CMF.sic_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SicCode") 
  public void setSicCode (Integer value) throws ServiceException
  {
    this.SicCode = value;
    this._SicCodeSet = true;
  }

  /** Retrieves the SicCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SicCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SicCode field
   */
   public String getSicCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSicCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSicCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getSicCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SicCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSicCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the SicCode field from a formatted string
   *
   * @param _value the SicCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SicCode field
   */
   public void setSicCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSicCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSicCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SicCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSicCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSicCodeFromFormattedString");
   }

  /** get the value of the field: SicCode (CMF.sic_code)
   * @return Integer the value
   */
  public Integer getSicCode () {
    return this.SicCode;
  }
  /** Change the field to not being actively set: SicCode (CMF.sic_code)
   */
  public void unsetSicCode () {
    this._SicCodeSet = false;
  }
  /** See if the field is actively set: SicCode (CMF.sic_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetSicCode () {
    return this._SicCodeSet;
  }
  /** set the fields value: InUse (CMF.in_use)
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

  /** get the value of the field: InUse (CMF.in_use)
   * @return String the value
   */
  public String getInUse () {
    return this.InUse;
  }
  /** Change the field to not being actively set: InUse (CMF.in_use)
   */
  public void unsetInUse () {
    this._InUseSet = false;
  }
  /** See if the field is actively set: InUse (CMF.in_use)
   * @return boolean whether the field is actively set
   */
  public boolean issetInUse () {
    return this._InUseSet;
  }
  /** set the fields value: NoBill (CMF.no_bill)
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

  /** get the value of the field: NoBill (CMF.no_bill)
   * @return Boolean the value
   */
  public Boolean getNoBill () {
    return this.NoBill;
  }
  /** Change the field to not being actively set: NoBill (CMF.no_bill)
   */
  public void unsetNoBill () {
    this._NoBillSet = false;
  }
  /** See if the field is actively set: NoBill (CMF.no_bill)
   * @return boolean whether the field is actively set
   */
  public boolean issetNoBill () {
    return this._NoBillSet;
  }
  /** set the fields value: CollectionIndicator (CMF.collection_indicator)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CollectionIndicator") 
  public void setCollectionIndicator (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CollectionIndicator", "setCollectionIndicator");
    }
    this.CollectionIndicator = value;
    this._CollectionIndicatorSet = true;
  }

  /** Retrieves the CollectionIndicator field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CollectionIndicator field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CollectionIndicator field
   */
   public String getCollectionIndicatorAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCollectionIndicatorAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCollectionIndicatorAsFormattedString");
       return fmtMgr.formatNumber(this.getCollectionIndicator(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CollectionIndicator");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCollectionIndicatorAsFormattedString");
       throw x;
     }
   }
  /** Sets the CollectionIndicator field from a formatted string
   *
   * @param _value the CollectionIndicator field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CollectionIndicator field
   */
   public void setCollectionIndicatorFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCollectionIndicatorFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCollectionIndicator(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CollectionIndicator");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCollectionIndicatorFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCollectionIndicatorFromFormattedString");
   }

  /** get the value of the field: CollectionIndicator (CMF.collection_indicator)
   * @return Integer the value
   */
  public Integer getCollectionIndicator () {
    return this.CollectionIndicator;
  }
  /** Change the field to not being actively set: CollectionIndicator (CMF.collection_indicator)
   */
  public void unsetCollectionIndicator () {
    this._CollectionIndicatorSet = false;
  }
  /** See if the field is actively set: CollectionIndicator (CMF.collection_indicator)
   * @return boolean whether the field is actively set
   */
  public boolean issetCollectionIndicator () {
    return this._CollectionIndicatorSet;
  }
  /** set the fields value: CollectionStatus (CMF.collection_status)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CollectionStatus") 
  public void setCollectionStatus (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CollectionStatus", "setCollectionStatus");
    }
    this.CollectionStatus = value;
    this._CollectionStatusSet = true;
  }

  /** Retrieves the CollectionStatus field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CollectionStatus field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CollectionStatus field
   */
   public String getCollectionStatusAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCollectionStatusAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCollectionStatusAsFormattedString");
       return fmtMgr.formatNumber(this.getCollectionStatus(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CollectionStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCollectionStatusAsFormattedString");
       throw x;
     }
   }
  /** Sets the CollectionStatus field from a formatted string
   *
   * @param _value the CollectionStatus field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CollectionStatus field
   */
   public void setCollectionStatusFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCollectionStatusFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCollectionStatus(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CollectionStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCollectionStatusFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCollectionStatusFromFormattedString");
   }

  /** get the value of the field: CollectionStatus (CMF.collection_status)
   * @return Integer the value
   */
  public Integer getCollectionStatus () {
    return this.CollectionStatus;
  }
  /** Change the field to not being actively set: CollectionStatus (CMF.collection_status)
   */
  public void unsetCollectionStatus () {
    this._CollectionStatusSet = false;
  }
  /** See if the field is actively set: CollectionStatus (CMF.collection_status)
   * @return boolean whether the field is actively set
   */
  public boolean issetCollectionStatus () {
    return this._CollectionStatusSet;
  }
  /** set the fields value: CollectionHistory (CMF.collection_history)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CollectionHistory") 
  public void setCollectionHistory (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 12))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CollectionHistory", "setCollectionHistory");
    }
    this.CollectionHistory = value;
    this._CollectionHistorySet = true;
  }

  /** Retrieves the CollectionHistory field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CollectionHistory field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CollectionHistory field
   */
   public String getCollectionHistoryAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCollectionHistoryAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCollectionHistoryAsFormattedString");
       return fmtMgr.formatString(this.getCollectionHistory());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CollectionHistory");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCollectionHistoryAsFormattedString");
       throw x;
     }
   }
  /** Sets the CollectionHistory field from a formatted string
   *
   * @param _value the CollectionHistory field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CollectionHistory field
   */
   public void setCollectionHistoryFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCollectionHistoryFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCollectionHistory(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CollectionHistory");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCollectionHistoryFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCollectionHistoryFromFormattedString");
   }

  /** get the value of the field: CollectionHistory (CMF.collection_history)
   * @return String the value
   */
  public String getCollectionHistory () {
    return this.CollectionHistory;
  }
  /** Change the field to not being actively set: CollectionHistory (CMF.collection_history)
   */
  public void unsetCollectionHistory () {
    this._CollectionHistorySet = false;
  }
  /** See if the field is actively set: CollectionHistory (CMF.collection_history)
   * @return boolean whether the field is actively set
   */
  public boolean issetCollectionHistory () {
    return this._CollectionHistorySet;
  }
  /** set the fields value: VipCode (CMF.vip_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("VipCode") 
  public void setVipCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "VipCode", "setVipCode");
    }
    this.VipCode = value;
    this._VipCodeSet = true;
  }

  /** Retrieves the VipCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The VipCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the VipCode field
   */
   public String getVipCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getVipCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getVipCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getVipCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("VipCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getVipCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the VipCode field from a formatted string
   *
   * @param _value the VipCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the VipCode field
   */
   public void setVipCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getVipCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setVipCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("VipCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setVipCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setVipCodeFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated VipCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the VipCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the VipCode field
   */

  public String getVipCodeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getVipCodeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getVipCodeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getVipCodeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getVipCode()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("VipCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getVipCodeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated VipCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the VipCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the VipCode field
   */
  public Enumeration getVipCodeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getVipCodeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("VipCode", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getVipCodeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("VipCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getVipCodeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated VipCode field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setVipCodeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setVipCodeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getVipCodeEnumeration(_locale);
      this.setVipCode((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("VipCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setVipCodeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setVipCodeFromDisplayValue");
  }

  /** get the value of the field: VipCode (CMF.vip_code)
   * @return Integer the value
   */
  public Integer getVipCode () {
    return this.VipCode;
  }
  /** Change the field to not being actively set: VipCode (CMF.vip_code)
   */
  public void unsetVipCode () {
    this._VipCodeSet = false;
  }
  /** See if the field is actively set: VipCode (CMF.vip_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetVipCode () {
    return this._VipCodeSet;
  }
  /** set the fields value: PurchaseOrder (CMF.purchase_order)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PurchaseOrder") 
  public void setPurchaseOrder (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 16))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "PurchaseOrder", "setPurchaseOrder");
    }
    this.PurchaseOrder = value;
    this._PurchaseOrderSet = true;
  }

  /** Retrieves the PurchaseOrder field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PurchaseOrder field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PurchaseOrder field
   */
   public String getPurchaseOrderAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPurchaseOrderAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPurchaseOrderAsFormattedString");
       return fmtMgr.formatString(this.getPurchaseOrder());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PurchaseOrder");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPurchaseOrderAsFormattedString");
       throw x;
     }
   }
  /** Sets the PurchaseOrder field from a formatted string
   *
   * @param _value the PurchaseOrder field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PurchaseOrder field
   */
   public void setPurchaseOrderFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPurchaseOrderFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPurchaseOrder(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PurchaseOrder");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPurchaseOrderFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPurchaseOrderFromFormattedString");
   }

  /** get the value of the field: PurchaseOrder (CMF.purchase_order)
   * @return String the value
   */
  public String getPurchaseOrder () {
    return this.PurchaseOrder;
  }
  /** Change the field to not being actively set: PurchaseOrder (CMF.purchase_order)
   */
  public void unsetPurchaseOrder () {
    this._PurchaseOrderSet = false;
  }
  /** See if the field is actively set: PurchaseOrder (CMF.purchase_order)
   * @return boolean whether the field is actively set
   */
  public boolean issetPurchaseOrder () {
    return this._PurchaseOrderSet;
  }
  /** set the fields value: Codeword (CMF.codeword)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Codeword") 
  public void setCodeword (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 20))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Codeword", "setCodeword");
    }
    this.Codeword = value;
    this._CodewordSet = true;
  }

  /** Retrieves the Codeword field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Codeword field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Codeword field
   */
   public String getCodewordAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCodewordAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCodewordAsFormattedString");
       return fmtMgr.formatString(this.getCodeword());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Codeword");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCodewordAsFormattedString");
       throw x;
     }
   }
  /** Sets the Codeword field from a formatted string
   *
   * @param _value the Codeword field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Codeword field
   */
   public void setCodewordFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCodewordFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCodeword(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Codeword");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCodewordFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCodewordFromFormattedString");
   }

  /** get the value of the field: Codeword (CMF.codeword)
   * @return String the value
   */
  public String getCodeword () {
    return this.Codeword;
  }
  /** Change the field to not being actively set: Codeword (CMF.codeword)
   */
  public void unsetCodeword () {
    this._CodewordSet = false;
  }
  /** See if the field is actively set: Codeword (CMF.codeword)
   * @return boolean whether the field is actively set
   */
  public boolean issetCodeword () {
    return this._CodewordSet;
  }
  /** set the fields value: Remark (CMF.remark)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Remark") 
  public void setRemark (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 80))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Remark", "setRemark");
    }
    this.Remark = value;
    this._RemarkSet = true;
  }

  /** Retrieves the Remark field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Remark field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Remark field
   */
   public String getRemarkAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRemarkAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRemarkAsFormattedString");
       return fmtMgr.formatString(this.getRemark());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Remark");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRemarkAsFormattedString");
       throw x;
     }
   }
  /** Sets the Remark field from a formatted string
   *
   * @param _value the Remark field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Remark field
   */
   public void setRemarkFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRemarkFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRemark(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Remark");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRemarkFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRemarkFromFormattedString");
   }

  /** get the value of the field: Remark (CMF.remark)
   * @return String the value
   */
  public String getRemark () {
    return this.Remark;
  }
  /** Change the field to not being actively set: Remark (CMF.remark)
   */
  public void unsetRemark () {
    this._RemarkSet = false;
  }
  /** See if the field is actively set: Remark (CMF.remark)
   * @return boolean whether the field is actively set
   */
  public boolean issetRemark () {
    return this._RemarkSet;
  }
  /** set the fields value: CustEmail (CMF.cust_email)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CustEmail") 
  public void setCustEmail (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 144))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CustEmail", "setCustEmail");
    }
    this.CustEmail = value;
    this._CustEmailSet = true;
  }

  /** Retrieves the CustEmail field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CustEmail field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustEmail field
   */
   public String getCustEmailAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustEmailAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustEmailAsFormattedString");
       return fmtMgr.formatString(this.getCustEmail());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustEmail");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustEmailAsFormattedString");
       throw x;
     }
   }
  /** Sets the CustEmail field from a formatted string
   *
   * @param _value the CustEmail field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CustEmail field
   */
   public void setCustEmailFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustEmailFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCustEmail(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustEmail");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustEmailFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustEmailFromFormattedString");
   }

  /** get the value of the field: CustEmail (CMF.cust_email)
   * @return String the value
   */
  public String getCustEmail () {
    return this.CustEmail;
  }
  /** Change the field to not being actively set: CustEmail (CMF.cust_email)
   */
  public void unsetCustEmail () {
    this._CustEmailSet = false;
  }
  /** See if the field is actively set: CustEmail (CMF.cust_email)
   * @return boolean whether the field is actively set
   */
  public boolean issetCustEmail () {
    return this._CustEmailSet;
  }
  /** set the fields value: StatementToEmail (CMF.statement_to_email)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("StatementToEmail") 
  public void setStatementToEmail (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 144))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "StatementToEmail", "setStatementToEmail");
    }
    this.StatementToEmail = value;
    this._StatementToEmailSet = true;
  }

  /** Retrieves the StatementToEmail field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The StatementToEmail field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatementToEmail field
   */
   public String getStatementToEmailAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatementToEmailAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatementToEmailAsFormattedString");
       return fmtMgr.formatString(this.getStatementToEmail());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StatementToEmail");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatementToEmailAsFormattedString");
       throw x;
     }
   }
  /** Sets the StatementToEmail field from a formatted string
   *
   * @param _value the StatementToEmail field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StatementToEmail field
   */
   public void setStatementToEmailFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatementToEmailFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setStatementToEmail(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StatementToEmail");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatementToEmailFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatementToEmailFromFormattedString");
   }

  /** get the value of the field: StatementToEmail (CMF.statement_to_email)
   * @return String the value
   */
  public String getStatementToEmail () {
    return this.StatementToEmail;
  }
  /** Change the field to not being actively set: StatementToEmail (CMF.statement_to_email)
   */
  public void unsetStatementToEmail () {
    this._StatementToEmailSet = false;
  }
  /** See if the field is actively set: StatementToEmail (CMF.statement_to_email)
   * @return boolean whether the field is actively set
   */
  public boolean issetStatementToEmail () {
    return this._StatementToEmailSet;
  }
  /** set the fields value: ChgWho (CMF.chg_who)
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

  /** get the value of the field: ChgWho (CMF.chg_who)
   * @return String the value
   */
  public String getChgWho () {
    return this.ChgWho;
  }
  /** Change the field to not being actively set: ChgWho (CMF.chg_who)
   */
  public void unsetChgWho () {
    this._ChgWhoSet = false;
  }
  /** See if the field is actively set: ChgWho (CMF.chg_who)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgWho () {
    return this._ChgWhoSet;
  }
  /** set the fields value: ChgDate (CMF.chg_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ChgDate") 
  public void setChgDate (Date value) throws ServiceException
  {
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

  /** get the value of the field: ChgDate (CMF.chg_date)
   * @return Date the value
   */
  public Date getChgDate () {
    return this.ChgDate;
  }
  /** Change the field to not being actively set: ChgDate (CMF.chg_date)
   */
  public void unsetChgDate () {
    this._ChgDateSet = false;
  }
  /** See if the field is actively set: ChgDate (CMF.chg_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgDate () {
    return this._ChgDateSet;
  }
  /** set the fields value: DateCreated (CMF.date_created)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DateCreated") 
  public void setDateCreated (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DateCreated", "setDateCreated");
    }
    this.DateCreated = value;
    this._DateCreatedSet = true;
  }

  /** Retrieves the DateCreated field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DateCreated field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateCreated field
   */
   public String getDateCreatedAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateCreatedAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateCreatedAsFormattedString");
       return fmtMgr.formatDate(this.getDateCreated(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DateCreated");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateCreatedAsFormattedString");
       throw x;
     }
   }
  /** Sets the DateCreated field from a formatted string
   *
   * @param _value the DateCreated field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DateCreated field
   */
   public void setDateCreatedFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateCreatedFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDateCreated(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DateCreated");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateCreatedFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDateCreatedFromFormattedString");
   }

  /**
   * Retrieves the DateCreated field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DateCreated field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateCreated field
   */
  public String getDateCreatedAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateCreatedAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateCreatedAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getDateCreated(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateCreated");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateCreatedAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the DateCreated field value from a formatted date/time string
   *
   * @param _value the DateCreated field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DateCreated field
   */
  public void setDateCreatedFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDateCreatedFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setDateCreated(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateCreated");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateCreatedFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: DateCreated (CMF.date_created)
   * @return Date the value
   */
  public Date getDateCreated () {
    return this.DateCreated;
  }
  /** Change the field to not being actively set: DateCreated (CMF.date_created)
   */
  public void unsetDateCreated () {
    this._DateCreatedSet = false;
  }
  /** See if the field is actively set: DateCreated (CMF.date_created)
   * @return boolean whether the field is actively set
   */
  public boolean issetDateCreated () {
    return this._DateCreatedSet;
  }
  /** set the fields value: DateActive (CMF.date_active)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DateActive") 
  public void setDateActive (Date value) throws ServiceException
  {
    this.DateActive = value;
    this._DateActiveSet = true;
  }

  /** Retrieves the DateActive field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DateActive field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateActive field
   */
   public String getDateActiveAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateActiveAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateActiveAsFormattedString");
       return fmtMgr.formatDate(this.getDateActive(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DateActive");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateActiveAsFormattedString");
       throw x;
     }
   }
  /** Sets the DateActive field from a formatted string
   *
   * @param _value the DateActive field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DateActive field
   */
   public void setDateActiveFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateActiveFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDateActive(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DateActive");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateActiveFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDateActiveFromFormattedString");
   }

  /**
   * Retrieves the DateActive field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DateActive field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateActive field
   */
  public String getDateActiveAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateActiveAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateActiveAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getDateActive(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateActive");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateActiveAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the DateActive field value from a formatted date/time string
   *
   * @param _value the DateActive field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DateActive field
   */
  public void setDateActiveFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDateActiveFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setDateActive(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateActive");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateActiveFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: DateActive (CMF.date_active)
   * @return Date the value
   */
  public Date getDateActive () {
    return this.DateActive;
  }
  /** Change the field to not being actively set: DateActive (CMF.date_active)
   */
  public void unsetDateActive () {
    this._DateActiveSet = false;
  }
  /** See if the field is actively set: DateActive (CMF.date_active)
   * @return boolean whether the field is actively set
   */
  public boolean issetDateActive () {
    return this._DateActiveSet;
  }
  /** set the fields value: DateInactive (CMF.date_inactive)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DateInactive") 
  public void setDateInactive (Date value) throws ServiceException
  {
    this.DateInactive = value;
    this._DateInactiveSet = true;
  }

  /** Retrieves the DateInactive field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DateInactive field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateInactive field
   */
   public String getDateInactiveAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateInactiveAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateInactiveAsFormattedString");
       return fmtMgr.formatDate(this.getDateInactive(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DateInactive");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateInactiveAsFormattedString");
       throw x;
     }
   }
  /** Sets the DateInactive field from a formatted string
   *
   * @param _value the DateInactive field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DateInactive field
   */
   public void setDateInactiveFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateInactiveFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDateInactive(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DateInactive");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateInactiveFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDateInactiveFromFormattedString");
   }

  /**
   * Retrieves the DateInactive field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DateInactive field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateInactive field
   */
  public String getDateInactiveAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateInactiveAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateInactiveAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getDateInactive(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateInactive");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateInactiveAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the DateInactive field value from a formatted date/time string
   *
   * @param _value the DateInactive field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DateInactive field
   */
  public void setDateInactiveFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDateInactiveFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setDateInactive(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateInactive");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateInactiveFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: DateInactive (CMF.date_inactive)
   * @return Date the value
   */
  public Date getDateInactive () {
    return this.DateInactive;
  }
  /** Change the field to not being actively set: DateInactive (CMF.date_inactive)
   */
  public void unsetDateInactive () {
    this._DateInactiveSet = false;
  }
  /** See if the field is actively set: DateInactive (CMF.date_inactive)
   * @return boolean whether the field is actively set
   */
  public boolean issetDateInactive () {
    return this._DateInactiveSet;
  }
  /** set the fields value: OwningCostCtr (CMF.owning_cost_ctr)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OwningCostCtr") 
  public void setOwningCostCtr (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "OwningCostCtr", "setOwningCostCtr");
    }
    this.OwningCostCtr = value;
    this._OwningCostCtrSet = true;
  }

  /** Retrieves the OwningCostCtr field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OwningCostCtr field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OwningCostCtr field
   */
   public String getOwningCostCtrAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOwningCostCtrAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOwningCostCtrAsFormattedString");
       return fmtMgr.formatNumber(this.getOwningCostCtr(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OwningCostCtr");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOwningCostCtrAsFormattedString");
       throw x;
     }
   }
  /** Sets the OwningCostCtr field from a formatted string
   *
   * @param _value the OwningCostCtr field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OwningCostCtr field
   */
   public void setOwningCostCtrFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOwningCostCtrFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOwningCostCtr(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OwningCostCtr");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOwningCostCtrFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOwningCostCtrFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated OwningCostCtr field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the OwningCostCtr field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the OwningCostCtr field
   */

  public String getOwningCostCtrDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOwningCostCtrDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getOwningCostCtrEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOwningCostCtrDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getOwningCostCtr()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OwningCostCtr");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOwningCostCtrDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated OwningCostCtr field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the OwningCostCtr field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the OwningCostCtr field
   */
  public Enumeration getOwningCostCtrEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOwningCostCtrEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("OwningCostCenter", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOwningCostCtrEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OwningCostCtr");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOwningCostCtrEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated OwningCostCtr field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setOwningCostCtrFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOwningCostCtrFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getOwningCostCtrEnumeration(_locale);
      this.setOwningCostCtr((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OwningCostCtr");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOwningCostCtrFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOwningCostCtrFromDisplayValue");
  }

  /** get the value of the field: OwningCostCtr (CMF.owning_cost_ctr)
   * @return Integer the value
   */
  public Integer getOwningCostCtr () {
    return this.OwningCostCtr;
  }
  /** Change the field to not being actively set: OwningCostCtr (CMF.owning_cost_ctr)
   */
  public void unsetOwningCostCtr () {
    this._OwningCostCtrSet = false;
  }
  /** See if the field is actively set: OwningCostCtr (CMF.owning_cost_ctr)
   * @return boolean whether the field is actively set
   */
  public boolean issetOwningCostCtr () {
    return this._OwningCostCtrSet;
  }
  /** set the fields value: AcctSegId (CMF.acct_seg_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AcctSegId") 
  public void setAcctSegId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AcctSegId", "setAcctSegId");
    }
    this.AcctSegId = value;
    this._AcctSegIdSet = true;
  }

  /** Retrieves the AcctSegId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AcctSegId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AcctSegId field
   */
   public String getAcctSegIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAcctSegIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAcctSegIdAsFormattedString");
       return fmtMgr.formatNumber(this.getAcctSegId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AcctSegId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAcctSegIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the AcctSegId field from a formatted string
   *
   * @param _value the AcctSegId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AcctSegId field
   */
   public void setAcctSegIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAcctSegIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAcctSegId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AcctSegId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAcctSegIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAcctSegIdFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated AcctSegId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the AcctSegId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AcctSegId field
   */

  public String getAcctSegIdDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAcctSegIdDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getAcctSegIdEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAcctSegIdDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getAcctSegId()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AcctSegId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAcctSegIdDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated AcctSegId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the AcctSegId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AcctSegId field
   */
  public Enumeration getAcctSegIdEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAcctSegIdEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("AccountSegment", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAcctSegIdEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AcctSegId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAcctSegIdEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated AcctSegId field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setAcctSegIdFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAcctSegIdFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getAcctSegIdEnumeration(_locale);
      this.setAcctSegId((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AcctSegId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAcctSegIdFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAcctSegIdFromDisplayValue");
  }

  /** get the value of the field: AcctSegId (CMF.acct_seg_id)
   * @return Integer the value
   */
  public Integer getAcctSegId () {
    return this.AcctSegId;
  }
  /** Change the field to not being actively set: AcctSegId (CMF.acct_seg_id)
   */
  public void unsetAcctSegId () {
    this._AcctSegIdSet = false;
  }
  /** See if the field is actively set: AcctSegId (CMF.acct_seg_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetAcctSegId () {
    return this._AcctSegIdSet;
  }
  /** set the fields value: Converted (CMF.converted)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Converted") 
  public void setConverted (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Converted", "setConverted");
    }
    this.Converted = value;
    this._ConvertedSet = true;
  }

  /** Retrieves the Converted field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Converted field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Converted field
   */
   public String getConvertedAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getConvertedAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getConvertedAsFormattedString");
       return fmtMgr.formatNumber(this.getConverted(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Converted");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getConvertedAsFormattedString");
       throw x;
     }
   }
  /** Sets the Converted field from a formatted string
   *
   * @param _value the Converted field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Converted field
   */
   public void setConvertedFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getConvertedFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setConverted(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Converted");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setConvertedFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setConvertedFromFormattedString");
   }

  /** get the value of the field: Converted (CMF.converted)
   * @return Integer the value
   */
  public Integer getConverted () {
    return this.Converted;
  }
  /** Change the field to not being actively set: Converted (CMF.converted)
   */
  public void unsetConverted () {
    this._ConvertedSet = false;
  }
  /** See if the field is actively set: Converted (CMF.converted)
   * @return boolean whether the field is actively set
   */
  public boolean issetConverted () {
    return this._ConvertedSet;
  }
  /** set the fields value: ChargeThreshold (CMF.charge_threshold)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ChargeThreshold") 
  public void setChargeThreshold (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ChargeThreshold", "setChargeThreshold");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ChargeThreshold", "setChargeThreshold");
    }
    this.ChargeThreshold = value;
    this._ChargeThresholdSet = true;
  }

  /** Retrieves the ChargeThreshold field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ChargeThreshold field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChargeThreshold field
   */
   public String getChargeThresholdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChargeThresholdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChargeThresholdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getChargeThreshold(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChargeThreshold");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getChargeThresholdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ChargeThreshold field from a formatted string
   *
   * @param _value the ChargeThreshold field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChargeThreshold field
   */
   public void setChargeThresholdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChargeThresholdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setChargeThreshold(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChargeThreshold");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setChargeThresholdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChargeThresholdFromFormattedString");
   }

  /**
   * Retrieves the ChargeThreshold field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChargeThreshold field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChargeThreshold field
   */
  public String getChargeThresholdAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChargeThresholdAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChargeThresholdAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getChargeThreshold(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChargeThreshold");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChargeThresholdAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the ChargeThreshold field value from a formatted currency string
   *
   * @param _value the ChargeThreshold field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChargeThreshold field
   */
  public void setChargeThresholdFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChargeThresholdFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setChargeThreshold(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChargeThreshold");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChargeThresholdFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChargeThresholdFromFormattedCurrencyString");
  }

  /** get the value of the field: ChargeThreshold (CMF.charge_threshold)
   * @return BigInteger the value
   */
  public BigInteger getChargeThreshold () {
    return this.ChargeThreshold;
  }
  /** Change the field to not being actively set: ChargeThreshold (CMF.charge_threshold)
   */
  public void unsetChargeThreshold () {
    this._ChargeThresholdSet = false;
  }
  /** See if the field is actively set: ChargeThreshold (CMF.charge_threshold)
   * @return boolean whether the field is actively set
   */
  public boolean issetChargeThreshold () {
    return this._ChargeThresholdSet;
  }
  /** set the fields value: Threshold (CMF.threshold)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Threshold") 
  public void setThreshold (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Threshold", "setThreshold");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Threshold", "setThreshold");
    }
    this.Threshold = value;
    this._ThresholdSet = true;
  }

  /** Retrieves the Threshold field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Threshold field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Threshold field
   */
   public String getThresholdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getThresholdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getThresholdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getThreshold(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Threshold");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getThresholdAsFormattedString");
       throw x;
     }
   }
  /** Sets the Threshold field from a formatted string
   *
   * @param _value the Threshold field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Threshold field
   */
   public void setThresholdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getThresholdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setThreshold(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Threshold");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setThresholdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setThresholdFromFormattedString");
   }

  /**
   * Retrieves the Threshold field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The Threshold field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the Threshold field
   */
  public String getThresholdAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getThresholdAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getThresholdAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getThreshold(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Threshold");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getThresholdAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the Threshold field value from a formatted currency string
   *
   * @param _value the Threshold field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Threshold field
   */
  public void setThresholdFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setThresholdFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setThreshold(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Threshold");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setThresholdFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setThresholdFromFormattedCurrencyString");
  }

  /** get the value of the field: Threshold (CMF.threshold)
   * @return BigInteger the value
   */
  public BigInteger getThreshold () {
    return this.Threshold;
  }
  /** Change the field to not being actively set: Threshold (CMF.threshold)
   */
  public void unsetThreshold () {
    this._ThresholdSet = false;
  }
  /** See if the field is actively set: Threshold (CMF.threshold)
   * @return boolean whether the field is actively set
   */
  public boolean issetThreshold () {
    return this._ThresholdSet;
  }
  /** set the fields value: CyclicalThreshold (CMF.cyclical_threshold)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CyclicalThreshold") 
  public void setCyclicalThreshold (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CyclicalThreshold", "setCyclicalThreshold");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CyclicalThreshold", "setCyclicalThreshold");
    }
    this.CyclicalThreshold = value;
    this._CyclicalThresholdSet = true;
  }

  /** Retrieves the CyclicalThreshold field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CyclicalThreshold field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CyclicalThreshold field
   */
   public String getCyclicalThresholdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCyclicalThresholdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCyclicalThresholdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getCyclicalThreshold(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CyclicalThreshold");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCyclicalThresholdAsFormattedString");
       throw x;
     }
   }
  /** Sets the CyclicalThreshold field from a formatted string
   *
   * @param _value the CyclicalThreshold field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CyclicalThreshold field
   */
   public void setCyclicalThresholdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCyclicalThresholdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCyclicalThreshold(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CyclicalThreshold");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCyclicalThresholdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCyclicalThresholdFromFormattedString");
   }

  /**
   * Retrieves the CyclicalThreshold field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CyclicalThreshold field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the CyclicalThreshold field
   */
  public String getCyclicalThresholdAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCyclicalThresholdAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCyclicalThresholdAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getCyclicalThreshold(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CyclicalThreshold");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCyclicalThresholdAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the CyclicalThreshold field value from a formatted currency string
   *
   * @param _value the CyclicalThreshold field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CyclicalThreshold field
   */
  public void setCyclicalThresholdFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCyclicalThresholdFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setCyclicalThreshold(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CyclicalThreshold");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCyclicalThresholdFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCyclicalThresholdFromFormattedCurrencyString");
  }

  /** get the value of the field: CyclicalThreshold (CMF.cyclical_threshold)
   * @return BigInteger the value
   */
  public BigInteger getCyclicalThreshold () {
    return this.CyclicalThreshold;
  }
  /** Change the field to not being actively set: CyclicalThreshold (CMF.cyclical_threshold)
   */
  public void unsetCyclicalThreshold () {
    this._CyclicalThresholdSet = false;
  }
  /** See if the field is actively set: CyclicalThreshold (CMF.cyclical_threshold)
   * @return boolean whether the field is actively set
   */
  public boolean issetCyclicalThreshold () {
    return this._CyclicalThresholdSet;
  }
  /** set the fields value: UsgAmtLimit (CMF.usg_amt_limit)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UsgAmtLimit") 
  public void setUsgAmtLimit (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "UsgAmtLimit", "setUsgAmtLimit");
    }
    this.UsgAmtLimit = value;
    this._UsgAmtLimitSet = true;
  }

  /** Retrieves the UsgAmtLimit field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UsgAmtLimit field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UsgAmtLimit field
   */
   public String getUsgAmtLimitAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsgAmtLimitAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUsgAmtLimitAsFormattedString");
       return fmtMgr.formatBigInteger(this.getUsgAmtLimit(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UsgAmtLimit");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUsgAmtLimitAsFormattedString");
       throw x;
     }
   }
  /** Sets the UsgAmtLimit field from a formatted string
   *
   * @param _value the UsgAmtLimit field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UsgAmtLimit field
   */
   public void setUsgAmtLimitFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsgAmtLimitFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUsgAmtLimit(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UsgAmtLimit");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUsgAmtLimitFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUsgAmtLimitFromFormattedString");
   }

  /**
   * Retrieves the UsgAmtLimit field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UsgAmtLimit field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the UsgAmtLimit field
   */
  public String getUsgAmtLimitAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsgAmtLimitAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUsgAmtLimitAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getUsgAmtLimit(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UsgAmtLimit");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUsgAmtLimitAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the UsgAmtLimit field value from a formatted currency string
   *
   * @param _value the UsgAmtLimit field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UsgAmtLimit field
   */
  public void setUsgAmtLimitFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUsgAmtLimitFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setUsgAmtLimit(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UsgAmtLimit");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUsgAmtLimitFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUsgAmtLimitFromFormattedCurrencyString");
  }

  /** get the value of the field: UsgAmtLimit (CMF.usg_amt_limit)
   * @return BigInteger the value
   */
  public BigInteger getUsgAmtLimit () {
    return this.UsgAmtLimit;
  }
  /** Change the field to not being actively set: UsgAmtLimit (CMF.usg_amt_limit)
   */
  public void unsetUsgAmtLimit () {
    this._UsgAmtLimitSet = false;
  }
  /** See if the field is actively set: UsgAmtLimit (CMF.usg_amt_limit)
   * @return boolean whether the field is actively set
   */
  public boolean issetUsgAmtLimit () {
    return this._UsgAmtLimitSet;
  }
  /** set the fields value: UsgUnitsLimit (CMF.usg_units_limit)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UsgUnitsLimit") 
  public void setUsgUnitsLimit (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "UsgUnitsLimit", "setUsgUnitsLimit");
    }
    this.UsgUnitsLimit = value;
    this._UsgUnitsLimitSet = true;
  }

  /** Retrieves the UsgUnitsLimit field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UsgUnitsLimit field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UsgUnitsLimit field
   */
   public String getUsgUnitsLimitAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsgUnitsLimitAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUsgUnitsLimitAsFormattedString");
       return fmtMgr.formatBigInteger(this.getUsgUnitsLimit(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UsgUnitsLimit");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUsgUnitsLimitAsFormattedString");
       throw x;
     }
   }
  /** Sets the UsgUnitsLimit field from a formatted string
   *
   * @param _value the UsgUnitsLimit field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UsgUnitsLimit field
   */
   public void setUsgUnitsLimitFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsgUnitsLimitFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUsgUnitsLimit(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UsgUnitsLimit");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUsgUnitsLimitFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUsgUnitsLimitFromFormattedString");
   }

  /** get the value of the field: UsgUnitsLimit (CMF.usg_units_limit)
   * @return BigInteger the value
   */
  public BigInteger getUsgUnitsLimit () {
    return this.UsgUnitsLimit;
  }
  /** Change the field to not being actively set: UsgUnitsLimit (CMF.usg_units_limit)
   */
  public void unsetUsgUnitsLimit () {
    this._UsgUnitsLimitSet = false;
  }
  /** See if the field is actively set: UsgUnitsLimit (CMF.usg_units_limit)
   * @return boolean whether the field is actively set
   */
  public boolean issetUsgUnitsLimit () {
    return this._UsgUnitsLimitSet;
  }
  /** set the fields value: RegulatoryId (CMF.regulatory_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RegulatoryId") 
  public void setRegulatoryId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RegulatoryId", "setRegulatoryId");
    }
    this.RegulatoryId = value;
    this._RegulatoryIdSet = true;
  }

  /** Retrieves the RegulatoryId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RegulatoryId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RegulatoryId field
   */
   public String getRegulatoryIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRegulatoryIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRegulatoryIdAsFormattedString");
       return fmtMgr.formatNumber(this.getRegulatoryId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RegulatoryId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRegulatoryIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the RegulatoryId field from a formatted string
   *
   * @param _value the RegulatoryId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RegulatoryId field
   */
   public void setRegulatoryIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRegulatoryIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRegulatoryId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RegulatoryId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRegulatoryIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRegulatoryIdFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated RegulatoryId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the RegulatoryId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the RegulatoryId field
   */

  public String getRegulatoryIdDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRegulatoryIdDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getRegulatoryIdEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRegulatoryIdDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getRegulatoryId()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RegulatoryId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRegulatoryIdDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated RegulatoryId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the RegulatoryId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the RegulatoryId field
   */
  public Enumeration getRegulatoryIdEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRegulatoryIdEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("RegulatoryId", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRegulatoryIdEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RegulatoryId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRegulatoryIdEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated RegulatoryId field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setRegulatoryIdFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRegulatoryIdFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getRegulatoryIdEnumeration(_locale);
      this.setRegulatoryId((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RegulatoryId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRegulatoryIdFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRegulatoryIdFromDisplayValue");
  }

  /** get the value of the field: RegulatoryId (CMF.regulatory_id)
   * @return Integer the value
   */
  public Integer getRegulatoryId () {
    return this.RegulatoryId;
  }
  /** Change the field to not being actively set: RegulatoryId (CMF.regulatory_id)
   */
  public void unsetRegulatoryId () {
    this._RegulatoryIdSet = false;
  }
  /** See if the field is actively set: RegulatoryId (CMF.regulatory_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetRegulatoryId () {
    return this._RegulatoryIdSet;
  }
  /** set the fields value: GlobalContractStatus (CMF.global_contract_status)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("GlobalContractStatus") 
  public void setGlobalContractStatus (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "GlobalContractStatus", "setGlobalContractStatus");
    }
    this.GlobalContractStatus = value;
    this._GlobalContractStatusSet = true;
  }

  /** Retrieves the GlobalContractStatus field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The GlobalContractStatus field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GlobalContractStatus field
   */
   public String getGlobalContractStatusAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGlobalContractStatusAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGlobalContractStatusAsFormattedString");
       return fmtMgr.formatNumber(this.getGlobalContractStatus(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("GlobalContractStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getGlobalContractStatusAsFormattedString");
       throw x;
     }
   }
  /** Sets the GlobalContractStatus field from a formatted string
   *
   * @param _value the GlobalContractStatus field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the GlobalContractStatus field
   */
   public void setGlobalContractStatusFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGlobalContractStatusFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setGlobalContractStatus(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("GlobalContractStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setGlobalContractStatusFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGlobalContractStatusFromFormattedString");
   }

  /** get the value of the field: GlobalContractStatus (CMF.global_contract_status)
   * @return Integer the value
   */
  public Integer getGlobalContractStatus () {
    return this.GlobalContractStatus;
  }
  /** Change the field to not being actively set: GlobalContractStatus (CMF.global_contract_status)
   */
  public void unsetGlobalContractStatus () {
    this._GlobalContractStatusSet = false;
  }
  /** See if the field is actively set: GlobalContractStatus (CMF.global_contract_status)
   * @return boolean whether the field is actively set
   */
  public boolean issetGlobalContractStatus () {
    return this._GlobalContractStatusSet;
  }
  /** set the fields value: AltLname (CMF.alt_lname)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AltLname") 
  public void setAltLname (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 60))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AltLname", "setAltLname");
    }
    this.AltLname = value;
    this._AltLnameSet = true;
  }

  /** Retrieves the AltLname field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AltLname field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AltLname field
   */
   public String getAltLnameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAltLnameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAltLnameAsFormattedString");
       return fmtMgr.formatString(this.getAltLname());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AltLname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAltLnameAsFormattedString");
       throw x;
     }
   }
  /** Sets the AltLname field from a formatted string
   *
   * @param _value the AltLname field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AltLname field
   */
   public void setAltLnameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAltLnameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAltLname(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AltLname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAltLnameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAltLnameFromFormattedString");
   }

  /** get the value of the field: AltLname (CMF.alt_lname)
   * @return String the value
   */
  public String getAltLname () {
    return this.AltLname;
  }
  /** Change the field to not being actively set: AltLname (CMF.alt_lname)
   */
  public void unsetAltLname () {
    this._AltLnameSet = false;
  }
  /** See if the field is actively set: AltLname (CMF.alt_lname)
   * @return boolean whether the field is actively set
   */
  public boolean issetAltLname () {
    return this._AltLnameSet;
  }
  /** set the fields value: AltFname (CMF.alt_fname)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AltFname") 
  public void setAltFname (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AltFname", "setAltFname");
    }
    this.AltFname = value;
    this._AltFnameSet = true;
  }

  /** Retrieves the AltFname field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AltFname field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AltFname field
   */
   public String getAltFnameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAltFnameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAltFnameAsFormattedString");
       return fmtMgr.formatString(this.getAltFname());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AltFname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAltFnameAsFormattedString");
       throw x;
     }
   }
  /** Sets the AltFname field from a formatted string
   *
   * @param _value the AltFname field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AltFname field
   */
   public void setAltFnameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAltFnameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAltFname(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AltFname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAltFnameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAltFnameFromFormattedString");
   }

  /** get the value of the field: AltFname (CMF.alt_fname)
   * @return String the value
   */
  public String getAltFname () {
    return this.AltFname;
  }
  /** Change the field to not being actively set: AltFname (CMF.alt_fname)
   */
  public void unsetAltFname () {
    this._AltFnameSet = false;
  }
  /** See if the field is actively set: AltFname (CMF.alt_fname)
   * @return boolean whether the field is actively set
   */
  public boolean issetAltFname () {
    return this._AltFnameSet;
  }
  /** set the fields value: AltCompanyName (CMF.alt_company_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AltCompanyName") 
  public void setAltCompanyName (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 60))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AltCompanyName", "setAltCompanyName");
    }
    this.AltCompanyName = value;
    this._AltCompanyNameSet = true;
  }

  /** Retrieves the AltCompanyName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AltCompanyName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AltCompanyName field
   */
   public String getAltCompanyNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAltCompanyNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAltCompanyNameAsFormattedString");
       return fmtMgr.formatString(this.getAltCompanyName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AltCompanyName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAltCompanyNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the AltCompanyName field from a formatted string
   *
   * @param _value the AltCompanyName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AltCompanyName field
   */
   public void setAltCompanyNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAltCompanyNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAltCompanyName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AltCompanyName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAltCompanyNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAltCompanyNameFromFormattedString");
   }

  /** get the value of the field: AltCompanyName (CMF.alt_company_name)
   * @return String the value
   */
  public String getAltCompanyName () {
    return this.AltCompanyName;
  }
  /** Change the field to not being actively set: AltCompanyName (CMF.alt_company_name)
   */
  public void unsetAltCompanyName () {
    this._AltCompanyNameSet = false;
  }
  /** See if the field is actively set: AltCompanyName (CMF.alt_company_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetAltCompanyName () {
    return this._AltCompanyNameSet;
  }
  /** set the fields value: Gender (CMF.gender)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Gender") 
  public void setGender (Integer value) throws ServiceException
  {
    this.Gender = value;
    this._GenderSet = true;
  }

  /** Retrieves the Gender field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Gender field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Gender field
   */
   public String getGenderAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGenderAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGenderAsFormattedString");
       return fmtMgr.formatNumber(this.getGender(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Gender");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getGenderAsFormattedString");
       throw x;
     }
   }
  /** Sets the Gender field from a formatted string
   *
   * @param _value the Gender field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Gender field
   */
   public void setGenderFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGenderFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setGender(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Gender");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setGenderFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGenderFromFormattedString");
   }

  /** get the value of the field: Gender (CMF.gender)
   * @return Integer the value
   */
  public Integer getGender () {
    return this.Gender;
  }
  /** Change the field to not being actively set: Gender (CMF.gender)
   */
  public void unsetGender () {
    this._GenderSet = false;
  }
  /** See if the field is actively set: Gender (CMF.gender)
   * @return boolean whether the field is actively set
   */
  public boolean issetGender () {
    return this._GenderSet;
  }
  /** set the fields value: Dept (CMF.dept)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Dept") 
  public void setDept (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 40))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Dept", "setDept");
    }
    this.Dept = value;
    this._DeptSet = true;
  }

  /** Retrieves the Dept field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Dept field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Dept field
   */
   public String getDeptAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDeptAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDeptAsFormattedString");
       return fmtMgr.formatString(this.getDept());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Dept");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDeptAsFormattedString");
       throw x;
     }
   }
  /** Sets the Dept field from a formatted string
   *
   * @param _value the Dept field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Dept field
   */
   public void setDeptFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDeptFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDept(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Dept");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDeptFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDeptFromFormattedString");
   }

  /** get the value of the field: Dept (CMF.dept)
   * @return String the value
   */
  public String getDept () {
    return this.Dept;
  }
  /** Change the field to not being actively set: Dept (CMF.dept)
   */
  public void unsetDept () {
    this._DeptSet = false;
  }
  /** See if the field is actively set: Dept (CMF.dept)
   * @return boolean whether the field is actively set
   */
  public boolean issetDept () {
    return this._DeptSet;
  }
  /** set the fields value: Title (CMF.title)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Title") 
  public void setTitle (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 40))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Title", "setTitle");
    }
    this.Title = value;
    this._TitleSet = true;
  }

  /** Retrieves the Title field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Title field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Title field
   */
   public String getTitleAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTitleAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTitleAsFormattedString");
       return fmtMgr.formatString(this.getTitle());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Title");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTitleAsFormattedString");
       throw x;
     }
   }
  /** Sets the Title field from a formatted string
   *
   * @param _value the Title field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Title field
   */
   public void setTitleFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTitleFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTitle(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Title");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTitleFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTitleFromFormattedString");
   }

  /** get the value of the field: Title (CMF.title)
   * @return String the value
   */
  public String getTitle () {
    return this.Title;
  }
  /** Change the field to not being actively set: Title (CMF.title)
   */
  public void unsetTitle () {
    this._TitleSet = false;
  }
  /** See if the field is actively set: Title (CMF.title)
   * @return boolean whether the field is actively set
   */
  public boolean issetTitle () {
    return this._TitleSet;
  }
  /** set the fields value: PaymentProfileId (CMF.payment_profile_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PaymentProfileId") 
  public void setPaymentProfileId (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PaymentProfileId", "setPaymentProfileId");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "PaymentProfileId", "setPaymentProfileId");
    }
    this.PaymentProfileId = value;
    this._PaymentProfileIdSet = true;
  }

  /** Retrieves the PaymentProfileId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PaymentProfileId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PaymentProfileId field
   */
   public String getPaymentProfileIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentProfileIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentProfileIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getPaymentProfileId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PaymentProfileId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPaymentProfileIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the PaymentProfileId field from a formatted string
   *
   * @param _value the PaymentProfileId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PaymentProfileId field
   */
   public void setPaymentProfileIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentProfileIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPaymentProfileId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PaymentProfileId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPaymentProfileIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPaymentProfileIdFromFormattedString");
   }

  /** get the value of the field: PaymentProfileId (CMF.payment_profile_id)
   * @return BigInteger the value
   */
  public BigInteger getPaymentProfileId () {
    return this.PaymentProfileId;
  }
  /** Change the field to not being actively set: PaymentProfileId (CMF.payment_profile_id)
   */
  public void unsetPaymentProfileId () {
    this._PaymentProfileIdSet = false;
  }
  /** See if the field is actively set: PaymentProfileId (CMF.payment_profile_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetPaymentProfileId () {
    return this._PaymentProfileIdSet;
  }
  /** set the fields value: AccountProcessFlag (CMF.account_process_flag)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AccountProcessFlag") 
  public void setAccountProcessFlag (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountProcessFlag", "setAccountProcessFlag");
    }
    this.AccountProcessFlag = value;
    this._AccountProcessFlagSet = true;
  }

  /** Retrieves the AccountProcessFlag field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AccountProcessFlag field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountProcessFlag field
   */
   public String getAccountProcessFlagAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountProcessFlagAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountProcessFlagAsFormattedString");
       return fmtMgr.formatNumber(this.getAccountProcessFlag(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountProcessFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountProcessFlagAsFormattedString");
       throw x;
     }
   }
  /** Sets the AccountProcessFlag field from a formatted string
   *
   * @param _value the AccountProcessFlag field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AccountProcessFlag field
   */
   public void setAccountProcessFlagFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountProcessFlagFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAccountProcessFlag(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountProcessFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountProcessFlagFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountProcessFlagFromFormattedString");
   }

  /** get the value of the field: AccountProcessFlag (CMF.account_process_flag)
   * @return Integer the value
   */
  public Integer getAccountProcessFlag () {
    return this.AccountProcessFlag;
  }
  /** Change the field to not being actively set: AccountProcessFlag (CMF.account_process_flag)
   */
  public void unsetAccountProcessFlag () {
    this._AccountProcessFlagSet = false;
  }
  /** See if the field is actively set: AccountProcessFlag (CMF.account_process_flag)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountProcessFlag () {
    return this._AccountProcessFlagSet;
  }
  /** set the fields value: SdAgencyId (CMF.sd_agency_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SdAgencyId") 
  public void setSdAgencyId (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SdAgencyId", "setSdAgencyId");
    }
    if (value != null && !DataHelper.validLength (value, 20))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "SdAgencyId", "setSdAgencyId");
    }
    this.SdAgencyId = value;
    this._SdAgencyIdSet = true;
  }

  /** Retrieves the SdAgencyId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SdAgencyId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SdAgencyId field
   */
   public String getSdAgencyIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSdAgencyIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSdAgencyIdAsFormattedString");
       return fmtMgr.formatString(this.getSdAgencyId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SdAgencyId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSdAgencyIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the SdAgencyId field from a formatted string
   *
   * @param _value the SdAgencyId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SdAgencyId field
   */
   public void setSdAgencyIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSdAgencyIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSdAgencyId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SdAgencyId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSdAgencyIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSdAgencyIdFromFormattedString");
   }

  /** get the value of the field: SdAgencyId (CMF.sd_agency_id)
   * @return String the value
   */
  public String getSdAgencyId () {
    return this.SdAgencyId;
  }
  /** Change the field to not being actively set: SdAgencyId (CMF.sd_agency_id)
   */
  public void unsetSdAgencyId () {
    this._SdAgencyIdSet = false;
  }
  /** See if the field is actively set: SdAgencyId (CMF.sd_agency_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetSdAgencyId () {
    return this._SdAgencyIdSet;
  }
  /** set the fields value: CustomerLifetimeId (CMF.customer_lifetime_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CustomerLifetimeId") 
  public void setCustomerLifetimeId (Integer value) throws ServiceException
  {
    this.CustomerLifetimeId = value;
    this._CustomerLifetimeIdSet = true;
  }

  /** Retrieves the CustomerLifetimeId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CustomerLifetimeId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustomerLifetimeId field
   */
   public String getCustomerLifetimeIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustomerLifetimeIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerLifetimeIdAsFormattedString");
       return fmtMgr.formatNumber(this.getCustomerLifetimeId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustomerLifetimeId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustomerLifetimeIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the CustomerLifetimeId field from a formatted string
   *
   * @param _value the CustomerLifetimeId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CustomerLifetimeId field
   */
   public void setCustomerLifetimeIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustomerLifetimeIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCustomerLifetimeId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustomerLifetimeId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustomerLifetimeIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustomerLifetimeIdFromFormattedString");
   }

  /** get the value of the field: CustomerLifetimeId (CMF.customer_lifetime_id)
   * @return Integer the value
   */
  public Integer getCustomerLifetimeId () {
    return this.CustomerLifetimeId;
  }
  /** Change the field to not being actively set: CustomerLifetimeId (CMF.customer_lifetime_id)
   */
  public void unsetCustomerLifetimeId () {
    this._CustomerLifetimeIdSet = false;
  }
  /** See if the field is actively set: CustomerLifetimeId (CMF.customer_lifetime_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetCustomerLifetimeId () {
    return this._CustomerLifetimeIdSet;
  }
  /** set the fields value: CustomerLifetimeId2 (CMF.customer_lifetime_id2)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CustomerLifetimeId2") 
  public void setCustomerLifetimeId2 (Integer value) throws ServiceException
  {
    this.CustomerLifetimeId2 = value;
    this._CustomerLifetimeId2Set = true;
  }

  /** Retrieves the CustomerLifetimeId2 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CustomerLifetimeId2 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustomerLifetimeId2 field
   */
   public String getCustomerLifetimeId2AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustomerLifetimeId2AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerLifetimeId2AsFormattedString");
       return fmtMgr.formatNumber(this.getCustomerLifetimeId2(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustomerLifetimeId2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustomerLifetimeId2AsFormattedString");
       throw x;
     }
   }
  /** Sets the CustomerLifetimeId2 field from a formatted string
   *
   * @param _value the CustomerLifetimeId2 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CustomerLifetimeId2 field
   */
   public void setCustomerLifetimeId2FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustomerLifetimeId2FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCustomerLifetimeId2(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustomerLifetimeId2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustomerLifetimeId2FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustomerLifetimeId2FromFormattedString");
   }

  /** get the value of the field: CustomerLifetimeId2 (CMF.customer_lifetime_id2)
   * @return Integer the value
   */
  public Integer getCustomerLifetimeId2 () {
    return this.CustomerLifetimeId2;
  }
  /** Change the field to not being actively set: CustomerLifetimeId2 (CMF.customer_lifetime_id2)
   */
  public void unsetCustomerLifetimeId2 () {
    this._CustomerLifetimeId2Set = false;
  }
  /** See if the field is actively set: CustomerLifetimeId2 (CMF.customer_lifetime_id2)
   * @return boolean whether the field is actively set
   */
  public boolean issetCustomerLifetimeId2 () {
    return this._CustomerLifetimeId2Set;
  }
  /** set the fields value: AutoWriteoffStatus (CMF.auto_writeoff_status)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AutoWriteoffStatus") 
  public void setAutoWriteoffStatus (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AutoWriteoffStatus", "setAutoWriteoffStatus");
    }
    this.AutoWriteoffStatus = value;
    this._AutoWriteoffStatusSet = true;
  }

  /** Retrieves the AutoWriteoffStatus field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AutoWriteoffStatus field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AutoWriteoffStatus field
   */
   public String getAutoWriteoffStatusAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAutoWriteoffStatusAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAutoWriteoffStatusAsFormattedString");
       return fmtMgr.formatNumber(this.getAutoWriteoffStatus(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AutoWriteoffStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAutoWriteoffStatusAsFormattedString");
       throw x;
     }
   }
  /** Sets the AutoWriteoffStatus field from a formatted string
   *
   * @param _value the AutoWriteoffStatus field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AutoWriteoffStatus field
   */
   public void setAutoWriteoffStatusFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAutoWriteoffStatusFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAutoWriteoffStatus(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AutoWriteoffStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAutoWriteoffStatusFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAutoWriteoffStatusFromFormattedString");
   }

  /** get the value of the field: AutoWriteoffStatus (CMF.auto_writeoff_status)
   * @return Integer the value
   */
  public Integer getAutoWriteoffStatus () {
    return this.AutoWriteoffStatus;
  }
  /** Change the field to not being actively set: AutoWriteoffStatus (CMF.auto_writeoff_status)
   */
  public void unsetAutoWriteoffStatus () {
    this._AutoWriteoffStatusSet = false;
  }
  /** See if the field is actively set: AutoWriteoffStatus (CMF.auto_writeoff_status)
   * @return boolean whether the field is actively set
   */
  public boolean issetAutoWriteoffStatus () {
    return this._AutoWriteoffStatusSet;
  }
  public String toString() {
    return InvoiceDetailAccountObjectHelper.toMap(this, null).toString();
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
    
      super.resetFlags(flag, true);
    
      resetFlags(flag, true);
  }
  /*
   * This method sets the *Set flags to the specified value
   * @param flag value to set for flags
   * @param nonNullOnly set only those flags where the value is not null. 
   */
  public void resetFlags(boolean flag, boolean nonNullOnly) {
    
  /** CMF.currency_code field */
    if(!nonNullOnly || (AccountCurrencyCode != null))  _AccountCurrencyCodeSet = flag;
  /** PAYMENT_PROFILE.cust_bank_sort_code field */
    if(!nonNullOnly || (CustBankSortCode != null))  _CustBankSortCodeSet = flag;
  /** PAYMENT_PROFILE.cust_bank_acc_num field */
    if(!nonNullOnly || (CustBankAccNum != null))  _CustBankAccNumSet = flag;
  /** PAYMENT_PROFILE.alt_bank_acc_num field */
    if(!nonNullOnly || (AltBankAccNum != null))  _AltBankAccNumSet = flag;
  /** PAYMENT_PROFILE.ownr_lname field */
    if(!nonNullOnly || (OwnrLname != null))  _OwnrLnameSet = flag;
  /** PAYMENT_PROFILE.ownr_fname field */
    if(!nonNullOnly || (OwnrFname != null))  _OwnrFnameSet = flag;
  /** PAYMENT_PROFILE.clearing_house_id field */
    if(!nonNullOnly || (ClearingHouseId != null))  _ClearingHouseIdSet = flag;
  /** PAYMENT_PROFILE.bank_agency_code field */
    if(!nonNullOnly || (BankAgencyCode != null))  _BankAgencyCodeSet = flag;
  /** PAYMENT_PROFILE.bank_agency_name field */
    if(!nonNullOnly || (BankAgencyName != null))  _BankAgencyNameSet = flag;
  /** PAYMENT_PROFILE.new_cust_bank_sort_code field */
    if(!nonNullOnly || (NewCustBankSortCode != null))  _NewCustBankSortCodeSet = flag;
  /** PAYMENT_PROFILE.bank_code field */
    if(!nonNullOnly || (BankCode != null))  _BankCodeSet = flag;
  /** PAYMENT_PROFILE.bank_account_type field */
    if(!nonNullOnly || (BankAccountType != null))  _BankAccountTypeSet = flag;
  /** PAYMENT_PROFILE.branch_name field */
    if(!nonNullOnly || (BranchName != null))  _BranchNameSet = flag;
  /** PAYMENT_PROFILE.branch_code field */
    if(!nonNullOnly || (BranchCode != null))  _BranchCodeSet = flag;
  /** CUSTOMER_ID_ACCT_MAP.external_id field */
    if(!nonNullOnly || (ParentAccountExternalId != null))  _ParentAccountExternalIdSet = flag;
  /** CUSTOMER_ID_ACCT_MAP.external_id_type field */
    if(!nonNullOnly || (ParentAccountExternalIdType != null))  _ParentAccountExternalIdTypeSet = flag;
  /** CUSTOMER_ID_ACCT_MAP.external_id field */
    if(!nonNullOnly || (HierarchyAccountExternalId != null))  _HierarchyAccountExternalIdSet = flag;
  /** CUSTOMER_ID_ACCT_MAP.external_id_type field */
    if(!nonNullOnly || (HierarchyAccountExternalIdType != null))  _HierarchyAccountExternalIdTypeSet = flag;
  /** CMF.parent_id field */
    if(!nonNullOnly || (ParentId != null))  _ParentIdSet = flag;
  /** CMF.child_count field */
    if(!nonNullOnly || (ChildCount != null))  _ChildCountSet = flag;
  /** CMF.hierarchy_id field */
    if(!nonNullOnly || (HierarchyId != null))  _HierarchyIdSet = flag;
  /** CMF.tie_code field */
    if(!nonNullOnly || (TieCode != null))  _TieCodeSet = flag;
  /** CMF.account_type field */
    if(!nonNullOnly || (AccountType != null))  _AccountTypeSet = flag;
  /** CMF.account_category field */
    if(!nonNullOnly || (AccountCategory != null))  _AccountCategorySet = flag;
  /** CMF.prev_cutoff_date field */
    if(!nonNullOnly || (PrevCutoffDate != null))  _PrevCutoffDateSet = flag;
  /** CMF.prev_bill_date field */
    if(!nonNullOnly || (PrevBillDate != null))  _PrevBillDateSet = flag;
  /** CMF.next_bill_date field */
    if(!nonNullOnly || (NextBillDate != null))  _NextBillDateSet = flag;
  /** CMF.prev_bill_refno field */
    if(!nonNullOnly || (PrevBillRefno != null))  _PrevBillRefnoSet = flag;
  /** CMF.prev_bill_ref_resets field */
    if(!nonNullOnly || (PrevBillRefResets != null))  _PrevBillRefResetsSet = flag;
  /** CMF.prev_balance_refno field */
    if(!nonNullOnly || (PrevBalanceRefno != null))  _PrevBalanceRefnoSet = flag;
  /** CMF.prev_balance_ref_resets field */
    if(!nonNullOnly || (PrevBalanceRefResets != null))  _PrevBalanceRefResetsSet = flag;
  /** CMF.bill_name_pre field */
    if(!nonNullOnly || (BillNamePre != null))  _BillNamePreSet = flag;
  /** CMF.bill_fname field */
    if(!nonNullOnly || (BillFname != null))  _BillFnameSet = flag;
  /** CMF.bill_minit field */
    if(!nonNullOnly || (BillMinit != null))  _BillMinitSet = flag;
  /** CMF.bill_lname field */
    if(!nonNullOnly || (BillLname != null))  _BillLnameSet = flag;
  /** CMF.bill_name_generation field */
    if(!nonNullOnly || (BillNameGeneration != null))  _BillNameGenerationSet = flag;
  /** CMF.bill_title field */
    if(!nonNullOnly || (BillTitle != null))  _BillTitleSet = flag;
  /** CMF.bill_company field */
    if(!nonNullOnly || (BillCompany != null))  _BillCompanySet = flag;
  /** CMF.cust_address1 field */
    if(!nonNullOnly || (CustAddress1 != null))  _CustAddress1Set = flag;
  /** CMF.cust_address2 field */
    if(!nonNullOnly || (CustAddress2 != null))  _CustAddress2Set = flag;
  /** CMF.cust_address3 field */
    if(!nonNullOnly || (CustAddress3 != null))  _CustAddress3Set = flag;
  /** CMF.cust_city field */
    if(!nonNullOnly || (CustCity != null))  _CustCitySet = flag;
  /** CMF.cust_state field */
    if(!nonNullOnly || (CustState != null))  _CustStateSet = flag;
  /** CMF.cust_zip field */
    if(!nonNullOnly || (CustZip != null))  _CustZipSet = flag;
  /** CMF.cust_country_code field */
    if(!nonNullOnly || (CustCountryCode != null))  _CustCountryCodeSet = flag;
  /** CMF.cust_franchise_tax_code field */
    if(!nonNullOnly || (CustFranchiseTaxCode != null))  _CustFranchiseTaxCodeSet = flag;
  /** CMF.cust_geocode field */
    if(!nonNullOnly || (CustGeocode != null))  _CustGeocodeSet = flag;
  /** CMF.cust_county field */
    if(!nonNullOnly || (CustCounty != null))  _CustCountySet = flag;
  /** CMF.cust_phone1 field */
    if(!nonNullOnly || (CustPhone1 != null))  _CustPhone1Set = flag;
  /** CMF.cust_phone2 field */
    if(!nonNullOnly || (CustPhone2 != null))  _CustPhone2Set = flag;
  /** CMF.bill_address1 field */
    if(!nonNullOnly || (BillAddress1 != null))  _BillAddress1Set = flag;
  /** CMF.bill_address2 field */
    if(!nonNullOnly || (BillAddress2 != null))  _BillAddress2Set = flag;
  /** CMF.bill_address3 field */
    if(!nonNullOnly || (BillAddress3 != null))  _BillAddress3Set = flag;
  /** CMF.bill_city field */
    if(!nonNullOnly || (BillCity != null))  _BillCitySet = flag;
  /** CMF.bill_state field */
    if(!nonNullOnly || (BillState != null))  _BillStateSet = flag;
  /** CMF.bill_zip field */
    if(!nonNullOnly || (BillZip != null))  _BillZipSet = flag;
  /** CMF.bill_country_code field */
    if(!nonNullOnly || (BillCountryCode != null))  _BillCountryCodeSet = flag;
  /** CMF.bill_franchise_tax_code field */
    if(!nonNullOnly || (BillFranchiseTaxCode != null))  _BillFranchiseTaxCodeSet = flag;
  /** CMF.bill_county field */
    if(!nonNullOnly || (BillCounty != null))  _BillCountySet = flag;
  /** CMF.bill_geocode field */
    if(!nonNullOnly || (BillGeocode != null))  _BillGeocodeSet = flag;
  /** CMF.ssn field */
    if(!nonNullOnly || (Ssn != null))  _SsnSet = flag;
  /** CMF.contact1_name field */
    if(!nonNullOnly || (Contact1Name != null))  _Contact1NameSet = flag;
  /** CMF.contact2_name field */
    if(!nonNullOnly || (Contact2Name != null))  _Contact2NameSet = flag;
  /** CMF.contact1_phone field */
    if(!nonNullOnly || (Contact1Phone != null))  _Contact1PhoneSet = flag;
  /** CMF.contact2_phone field */
    if(!nonNullOnly || (Contact2Phone != null))  _Contact2PhoneSet = flag;
  /** CMF.cust_faxno field */
    if(!nonNullOnly || (CustFaxno != null))  _CustFaxnoSet = flag;
  /** CMF.statement_to_faxno field */
    if(!nonNullOnly || (StatementToFaxno != null))  _StatementToFaxnoSet = flag;
  /** CMF.credit_thresh field */
    if(!nonNullOnly || (CreditThresh != null))  _CreditThreshSet = flag;
  /** CMF.cred_status field */
    if(!nonNullOnly || (CredStatus != null))  _CredStatusSet = flag;
  /** CMF.credit_rating field */
    if(!nonNullOnly || (CreditRating != null))  _CreditRatingSet = flag;
  /** CMF.disconnect_reason field */
    if(!nonNullOnly || (DisconnectReason != null))  _DisconnectReasonSet = flag;
  /** CMF.disc_rcv_opt field */
    if(!nonNullOnly || (DiscRcvOpt != null))  _DiscRcvOptSet = flag;
  /** CMF.thresh_ref field */
    if(!nonNullOnly || (ThreshRef != null))  _ThreshRefSet = flag;
  /** CMF.bill_period field */
    if(!nonNullOnly || (BillPeriod != null))  _BillPeriodSet = flag;
  /** CMF.billing_frequency field */
    if(!nonNullOnly || (BillingFrequency != null))  _BillingFrequencySet = flag;
  /** CMF.bill_fmt_opt field */
    if(!nonNullOnly || (BillFmtOpt != null))  _BillFmtOptSet = flag;
  /** CMF.bill_disp_meth field */
    if(!nonNullOnly || (BillDispMeth != null))  _BillDispMethSet = flag;
  /** CMF.bill_hold_code field */
    if(!nonNullOnly || (BillHoldCode != null))  _BillHoldCodeSet = flag;
  /** CMF.msg_grp_id field */
    if(!nonNullOnly || (MsgGrpId != null))  _MsgGrpIdSet = flag;
  /** CMF.insert_grp_id field */
    if(!nonNullOnly || (InsertGrpId != null))  _InsertGrpIdSet = flag;
  /** CMF.rate_class_default field */
    if(!nonNullOnly || (RateClassDefault != null))  _RateClassDefaultSet = flag;
  /** CMF.rate_class_special field */
    if(!nonNullOnly || (RateClassSpecial != null))  _RateClassSpecialSet = flag;
  /** CMF.exrate_class field */
    if(!nonNullOnly || (ExrateClass != null))  _ExrateClassSet = flag;
  /** CMF.plan_id_discount field */
    if(!nonNullOnly || (PlanIdDiscount != null))  _PlanIdDiscountSet = flag;
  /** CMF.plan_id_credit field */
    if(!nonNullOnly || (PlanIdCredit != null))  _PlanIdCreditSet = flag;
  /** CMF.account_status field */
    if(!nonNullOnly || (AccountStatus != null))  _AccountStatusSet = flag;
  /** CMF.account_status_dt field */
    if(!nonNullOnly || (AccountStatusDt != null))  _AccountStatusDtSet = flag;
  /** CMF.distr_chan field */
    if(!nonNullOnly || (DistrChan != null))  _DistrChanSet = flag;
  /** CMF.sales_code field */
    if(!nonNullOnly || (SalesCode != null))  _SalesCodeSet = flag;
  /** CMF.mkt_code field */
    if(!nonNullOnly || (MktCode != null))  _MktCodeSet = flag;
  /** CMF.sic_code field */
    if(!nonNullOnly || (SicCode != null))  _SicCodeSet = flag;
  /** CMF.in_use field */
    if(!nonNullOnly || (InUse != null))  _InUseSet = flag;
  /** CMF.no_bill field */
    if(!nonNullOnly || (NoBill != null))  _NoBillSet = flag;
  /** CMF.collection_indicator field */
    if(!nonNullOnly || (CollectionIndicator != null))  _CollectionIndicatorSet = flag;
  /** CMF.collection_status field */
    if(!nonNullOnly || (CollectionStatus != null))  _CollectionStatusSet = flag;
  /** CMF.collection_history field */
    if(!nonNullOnly || (CollectionHistory != null))  _CollectionHistorySet = flag;
  /** CMF.vip_code field */
    if(!nonNullOnly || (VipCode != null))  _VipCodeSet = flag;
  /** CMF.purchase_order field */
    if(!nonNullOnly || (PurchaseOrder != null))  _PurchaseOrderSet = flag;
  /** CMF.codeword field */
    if(!nonNullOnly || (Codeword != null))  _CodewordSet = flag;
  /** CMF.remark field */
    if(!nonNullOnly || (Remark != null))  _RemarkSet = flag;
  /** CMF.cust_email field */
    if(!nonNullOnly || (CustEmail != null))  _CustEmailSet = flag;
  /** CMF.statement_to_email field */
    if(!nonNullOnly || (StatementToEmail != null))  _StatementToEmailSet = flag;
  /** CMF.chg_who field */
    if(!nonNullOnly || (ChgWho != null))  _ChgWhoSet = flag;
  /** CMF.chg_date field */
    if(!nonNullOnly || (ChgDate != null))  _ChgDateSet = flag;
  /** CMF.date_created field */
    if(!nonNullOnly || (DateCreated != null))  _DateCreatedSet = flag;
  /** CMF.date_active field */
    if(!nonNullOnly || (DateActive != null))  _DateActiveSet = flag;
  /** CMF.date_inactive field */
    if(!nonNullOnly || (DateInactive != null))  _DateInactiveSet = flag;
  /** CMF.owning_cost_ctr field */
    if(!nonNullOnly || (OwningCostCtr != null))  _OwningCostCtrSet = flag;
  /** CMF.acct_seg_id field */
    if(!nonNullOnly || (AcctSegId != null))  _AcctSegIdSet = flag;
  /** CMF.converted field */
    if(!nonNullOnly || (Converted != null))  _ConvertedSet = flag;
  /** CMF.charge_threshold field */
    if(!nonNullOnly || (ChargeThreshold != null))  _ChargeThresholdSet = flag;
  /** CMF.threshold field */
    if(!nonNullOnly || (Threshold != null))  _ThresholdSet = flag;
  /** CMF.cyclical_threshold field */
    if(!nonNullOnly || (CyclicalThreshold != null))  _CyclicalThresholdSet = flag;
  /** CMF.usg_amt_limit field */
    if(!nonNullOnly || (UsgAmtLimit != null))  _UsgAmtLimitSet = flag;
  /** CMF.usg_units_limit field */
    if(!nonNullOnly || (UsgUnitsLimit != null))  _UsgUnitsLimitSet = flag;
  /** CMF.regulatory_id field */
    if(!nonNullOnly || (RegulatoryId != null))  _RegulatoryIdSet = flag;
  /** CMF.global_contract_status field */
    if(!nonNullOnly || (GlobalContractStatus != null))  _GlobalContractStatusSet = flag;
  /** CMF.alt_lname field */
    if(!nonNullOnly || (AltLname != null))  _AltLnameSet = flag;
  /** CMF.alt_fname field */
    if(!nonNullOnly || (AltFname != null))  _AltFnameSet = flag;
  /** CMF.alt_company_name field */
    if(!nonNullOnly || (AltCompanyName != null))  _AltCompanyNameSet = flag;
  /** CMF.gender field */
    if(!nonNullOnly || (Gender != null))  _GenderSet = flag;
  /** CMF.dept field */
    if(!nonNullOnly || (Dept != null))  _DeptSet = flag;
  /** CMF.title field */
    if(!nonNullOnly || (Title != null))  _TitleSet = flag;
  /** CMF.payment_profile_id field */
    if(!nonNullOnly || (PaymentProfileId != null))  _PaymentProfileIdSet = flag;
  /** CMF.account_process_flag field */
    if(!nonNullOnly || (AccountProcessFlag != null))  _AccountProcessFlagSet = flag;
  /** CMF.sd_agency_id field */
    if(!nonNullOnly || (SdAgencyId != null))  _SdAgencyIdSet = flag;
  /** CMF.customer_lifetime_id field */
    if(!nonNullOnly || (CustomerLifetimeId != null))  _CustomerLifetimeIdSet = flag;
  /** CMF.customer_lifetime_id2 field */
    if(!nonNullOnly || (CustomerLifetimeId2 != null))  _CustomerLifetimeId2Set = flag;
  /** CMF.auto_writeoff_status field */
    if(!nonNullOnly || (AutoWriteoffStatus != null))  _AutoWriteoffStatusSet = flag;
      super.resetFlags(flag, nonNullOnly);
    
  }
}
