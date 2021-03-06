/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PrepaymentObjectData.java
 * Definition File: Customer/Prepayment.xml
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
  
/** PrepaymentObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class PrepaymentObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public PrepaymentObjectKeyData Key = null;
  /** CUSTOMER_ID_ACCT_MAP.external_id field */
  public    String AccountExternalId  = null;
  protected boolean _AccountExternalIdSet = false;
  /** CUSTOMER_ID_ACCT_MAP.external_id_type field */
  public    Integer AccountExternalIdType  = null;
  protected boolean _AccountExternalIdTypeSet = false;
  /** PAYMENT_TRANS.epg_transaction_id field */
  public    String EpgTransactionId  = null;
  protected boolean _EpgTransactionIdSet = false;
  /** PREPAYMENT.account_no field */
  public    Integer AccountInternalId  = null;
  protected boolean _AccountInternalIdSet = false;
  /** PREPAYMENT.undesignated_amount field */
  public    BigInteger UndesignatedAmount  = null;
  protected boolean _UndesignatedAmountSet = false;
  /** PREPAYMENT.tax_rate field */
  public    Integer TaxRate  = null;
  protected boolean _TaxRateSet = false;
  /** PREPAYMENT.designated_tax_amount field */
  public    BigInteger DesignatedTaxAmount  = null;
  protected boolean _DesignatedTaxAmountSet = false;
  /** PREPAYMENT.tax_point field */
  public    Date TaxPoint  = null;
  protected boolean _TaxPointSet = false;
  /** PREPAYMENT.tax_pkg_inst_id field */
  public    Integer TaxPkgInstId  = null;
  protected boolean _TaxPkgInstIdSet = false;
  /** PREPAYMENT.no_bill field */
  public    Boolean NoBill  = null;
  protected boolean _NoBillSet = false;
  /** PREPAYMENT.bill_ref_no field */
  public    Integer BillRefNo  = null;
  protected boolean _BillRefNoSet = false;
  /** PREPAYMENT.bill_ref_resets field */
  public    Integer BillRefResets  = null;
  protected boolean _BillRefResetsSet = false;
  /** PREPAYMENT.trans_dt field */
  public    Date TransDt  = null;
  protected boolean _TransDtSet = false;
  /** PREPAYMENT.tax_type_code field */
  public    Integer TaxTypeCode  = null;
  protected boolean _TaxTypeCodeSet = false;
  /** PREPAYMENT.open_item_id field */
  public    Integer OpenItemId  = null;
  protected boolean _OpenItemIdSet = false;
  /** PREPAYMENT.source_type field */
  public    Integer SourceType  = null;
  protected boolean _SourceTypeSet = false;
  /** PREPAYMENT.source_id field */
  public    Integer SourceId  = null;
  protected boolean _SourceIdSet = false;
  /** PREPAYMENT.source_id_serv field */
  public    Integer SourceIdServ  = null;
  protected boolean _SourceIdServSet = false;
  /** PREPAYMENT.discount_id field */
  public    Integer DiscountId  = null;
  protected boolean _DiscountIdSet = false;
  /** PREPAYMENT.allocated_tax field */
  public    BigInteger AllocatedTax  = null;
  protected boolean _AllocatedTaxSet = false;
  /** PREPAYMENT.allocated_undesignated field */
  public    BigInteger AllocatedUndesignated  = null;
  protected boolean _AllocatedUndesignatedSet = false;
  /** PREPAYMENT.micr_bank_id field */
  public    String MicrBankId  = null;
  protected boolean _MicrBankIdSet = false;
  /** PREPAYMENT.micr_dda_num field */
  public    String MicrDdaNum  = null;
  protected boolean _MicrDdaNumSet = false;
  /** PREPAYMENT.micr_check_num field */
  public    String MicrCheckNum  = null;
  protected boolean _MicrCheckNumSet = false;
  /** PREPAYMENT.chg_who field */
  public    String ChgWho  = null;
  protected boolean _ChgWhoSet = false;
  /** PREPAYMENT.chg_date field */
  public    Date ChgDate  = null;
  protected boolean _ChgDateSet = false;
  /** PREPAYMENT.status field */
  public    Integer Status  = null;
  protected boolean _StatusSet = false;
  /** PREPAYMENT.implied_decimal field */
  public    Integer ImpliedDecimal  = null;
  protected boolean _ImpliedDecimalSet = false;
  /** PREPAYMENT.currency_code field */
  public    Integer CurrencyCode  = null;
  protected boolean _CurrencyCodeSet = false;
  /** PREPAYMENT.pay_method field */
  public    Integer PayMethod  = null;
  protected boolean _PayMethodSet = false;
  /** PREPAYMENT.realtime_indicator field */
  public    Integer RealtimeIndicator  = null;
  protected boolean _RealtimeIndicatorSet = false;
  /** PREPAYMENT.payment_profile_id field */
  public    BigInteger PaymentProfileId  = null;
  protected boolean _PaymentProfileIdSet = false;
  /** PAYMENT_PROFILE.cust_bank_sort_code field */
  public    String CustBankSortCode  = null;
  protected boolean _CustBankSortCodeSet = false;
  /** PAYMENT_PROFILE.cust_bank_acc_num field */
  public    String CustBankAccNum  = null;
  protected boolean _CustBankAccNumSet = false;
  /** PAYMENT_PROFILE.alt_bank_acc_num field */
  public    String AltBankAccNum  = null;
  protected boolean _AltBankAccNumSet = false;
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
  /** PAYMENT_PROFILE.card_account field */
  public    String CardAccount  = null;
  protected boolean _CardAccountSet = false;
  /** PAYMENT_PROFILE.card_carrier field */
  public    String CardCarrier  = null;
  protected boolean _CardCarrierSet = false;
  /** PAYMENT_PROFILE.card_expire field */
  public    String CardExpire  = null;
  protected boolean _CardExpireSet = false;
  /** PAYMENT_PROFILE.avs_address_id field */
  public    Integer AvsAddressId  = null;
  protected boolean _AvsAddressIdSet = false;
  /** PAYMENT_PROFILE.avs_response_code field */
  public    String AvsResponseCode  = null;
  protected boolean _AvsResponseCodeSet = false;
  /** PAYMENT_PROFILE.trans_flag field */
  public    String TransFlag  = null;
  protected boolean _TransFlagSet = false;
  /** PAYMENT_PROFILE.cust_bank_acct_type field */
  public    String CustBankAcctType  = null;
  protected boolean _CustBankAcctTypeSet = false;
  /** PAYMENT_PROFILE.cust_email field */
  public    String CustEmail  = null;
  protected boolean _CustEmailSet = false;
  /** PAYMENT_PROFILE.cust_bill_address field */
  public    String CustBillAddress  = null;
  protected boolean _CustBillAddressSet = false;
  /** PAYMENT_PROFILE.cust_bill_city field */
  public    String CustBillCity  = null;
  protected boolean _CustBillCitySet = false;
  /** PAYMENT_PROFILE.cust_bill_state field */
  public    String CustBillState  = null;
  protected boolean _CustBillStateSet = false;
  /** PAYMENT_PROFILE.cust_bill_zip field */
  public    String CustBillZip  = null;
  protected boolean _CustBillZipSet = false;
  /** PAYMENT_PROFILE.cust_bill_country_code field */
  public    Integer CustBillCountryCode  = null;
  protected boolean _CustBillCountryCodeSet = false;
  /** PAYMENT_PROFILE.driver_license_num field */
  public    String DriverLicenseNum  = null;
  protected boolean _DriverLicenseNumSet = false;
  /** PAYMENT_PROFILE.driver_license_state field */
  public    String DriverLicenseState  = null;
  protected boolean _DriverLicenseStateSet = false;
  /** PAYMENT_PROFILE.cust_company_name field */
  public    String CustCompanyName  = null;
  protected boolean _CustCompanyNameSet = false;
  /** PAYMENT_PROFILE.bill_company_tax_id field */
  public    BigInteger BillCompanyTaxId  = null;
  protected boolean _BillCompanyTaxIdSet = false;
  /** PAYMENT_PROFILE.cust_phone field */
  public    String CustPhone  = null;
  protected boolean _CustPhoneSet = false;
  /** PAYMENT_PROFILE.ownr_fname field */
  public    String OwnrFname  = null;
  protected boolean _OwnrFnameSet = false;
  /** PAYMENT_PROFILE.ownr_lname field */
  public    String OwnrLname  = null;
  protected boolean _OwnrLnameSet = false;
  /** PAYMENT_PROFILE.cyclical_bill_used field */
  public    Boolean CyclicalBillUsed  = null;
  protected boolean _CyclicalBillUsedSet = false;
  /** PAYMENT_PROFILE.is_default field */
  public    Boolean IsDefault  = null;
  protected boolean _IsDefaultSet = false;
  /** PAYMENT_PROFILE.non_realtime_only field */
  public    Boolean NonRealtimeOnly  = null;
  protected boolean _NonRealtimeOnlySet = false;
  /** PAYMENT_PROFILE.is_temporary field */
  public    Boolean IsTemporary  = null;
  protected boolean _IsTemporarySet = false;
  /** PAYMENT_PROFILE.mandate_id field */
  public    String MandateId  = null;
  protected boolean _MandateIdSet = false;
  /** PAYMENT_PROFILE.mandate_sign_date field */
  public    Date MandateSignDate  = null;
  protected boolean _MandateSignDateSet = false;
  /** PAYMENT_PROFILE.mandate_status field */
  public    String MandateStatus  = null;
  protected boolean _MandateStatusSet = false;
  /** PAYMENT_PROFILE.cust_bank_iban field */
  public    String CustBankIban  = null;
  protected boolean _CustBankIbanSet = false;
  /** PAYMENT_PROFILE.cust_bank_bic field */
  public    String CustBankBic  = null;
  protected boolean _CustBankBicSet = false;
  /** PAYMENT_PROFILE.diff_acct_own_flag field */
  public    String DiffAcctOwnFlag  = null;
  protected boolean _DiffAcctOwnFlagSet = false;
  /** PAYMENT_PROFILE.cust_bank_acc_owner field */
  public    String CustBankAccOwner  = null;
  protected boolean _CustBankAccOwnerSet = false;
  /** PAYMENT_PROFILE.sequence_type field */
  public    String SequenceType  = null;
  protected boolean _SequenceTypeSet = false;
  /** PAYMENT_PROFILE.cust_bank_iban_hist field */
  public    String CustBankIbanHist  = null;
  protected boolean _CustBankIbanHistSet = false;
  /** PAYMENT_PROFILE.cust_bank_bic_hist field */
  public    String CustBankBicHist  = null;
  protected boolean _CustBankBicHistSet = false;
  /** PAYMENT_PROFILE.mandate_reset field */
  public    String MandateReset  = null;
  protected boolean _MandateResetSet = false;
  /** PAYMENT_PROFILE.epg_subscription_id field */
  public    String EpgSubscriptionId  = null;
  protected boolean _EpgSubscriptionIdSet = false;
  /** PAYMENT_PROFILE.reference_number field */
  public    String ReferenceNumber  = null;
  protected boolean _ReferenceNumberSet = false;
  /** PAYMENT_PROFILE.transaction_uuid field */
  public    String TransactionUuid  = null;
  protected boolean _TransactionUuidSet = false;
  /** PAYMENT_PROFILE.profile_creation_time field */
  public    Date ProfileCreationTime  = null;
  protected boolean _ProfileCreationTimeSet = false;
  /** PAYMENT_PROFILE.payment_merchant_id field */
  public    Integer PaymentMerchantId  = null;
  protected boolean _PaymentMerchantIdSet = false;
  private String _objName = "PrepaymentObjectData";
  /** Default constructor */
  public PrepaymentObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public PrepaymentObjectData (PrepaymentObjectData other)
  {

    if (other == null) return;
    this.Key = new PrepaymentObjectKeyData (other.Key);
    this.AccountExternalId = other.AccountExternalId;
    this._AccountExternalIdSet = other._AccountExternalIdSet;
    this.AccountExternalIdType = other.AccountExternalIdType;
    this._AccountExternalIdTypeSet = other._AccountExternalIdTypeSet;
    this.EpgTransactionId = other.EpgTransactionId;
    this._EpgTransactionIdSet = other._EpgTransactionIdSet;
    this.AccountInternalId = other.AccountInternalId;
    this._AccountInternalIdSet = other._AccountInternalIdSet;
    this.UndesignatedAmount = other.UndesignatedAmount;
    this._UndesignatedAmountSet = other._UndesignatedAmountSet;
    this.TaxRate = other.TaxRate;
    this._TaxRateSet = other._TaxRateSet;
    this.DesignatedTaxAmount = other.DesignatedTaxAmount;
    this._DesignatedTaxAmountSet = other._DesignatedTaxAmountSet;
    this.TaxPoint = other.TaxPoint;
    this._TaxPointSet = other._TaxPointSet;
    this.TaxPkgInstId = other.TaxPkgInstId;
    this._TaxPkgInstIdSet = other._TaxPkgInstIdSet;
    this.NoBill = other.NoBill;
    this._NoBillSet = other._NoBillSet;
    this.BillRefNo = other.BillRefNo;
    this._BillRefNoSet = other._BillRefNoSet;
    this.BillRefResets = other.BillRefResets;
    this._BillRefResetsSet = other._BillRefResetsSet;
    this.TransDt = other.TransDt;
    this._TransDtSet = other._TransDtSet;
    this.TaxTypeCode = other.TaxTypeCode;
    this._TaxTypeCodeSet = other._TaxTypeCodeSet;
    this.OpenItemId = other.OpenItemId;
    this._OpenItemIdSet = other._OpenItemIdSet;
    this.SourceType = other.SourceType;
    this._SourceTypeSet = other._SourceTypeSet;
    this.SourceId = other.SourceId;
    this._SourceIdSet = other._SourceIdSet;
    this.SourceIdServ = other.SourceIdServ;
    this._SourceIdServSet = other._SourceIdServSet;
    this.DiscountId = other.DiscountId;
    this._DiscountIdSet = other._DiscountIdSet;
    this.AllocatedTax = other.AllocatedTax;
    this._AllocatedTaxSet = other._AllocatedTaxSet;
    this.AllocatedUndesignated = other.AllocatedUndesignated;
    this._AllocatedUndesignatedSet = other._AllocatedUndesignatedSet;
    this.MicrBankId = other.MicrBankId;
    this._MicrBankIdSet = other._MicrBankIdSet;
    this.MicrDdaNum = other.MicrDdaNum;
    this._MicrDdaNumSet = other._MicrDdaNumSet;
    this.MicrCheckNum = other.MicrCheckNum;
    this._MicrCheckNumSet = other._MicrCheckNumSet;
    this.ChgWho = other.ChgWho;
    this._ChgWhoSet = other._ChgWhoSet;
    this.ChgDate = other.ChgDate;
    this._ChgDateSet = other._ChgDateSet;
    this.Status = other.Status;
    this._StatusSet = other._StatusSet;
    this.ImpliedDecimal = other.ImpliedDecimal;
    this._ImpliedDecimalSet = other._ImpliedDecimalSet;
    this.CurrencyCode = other.CurrencyCode;
    this._CurrencyCodeSet = other._CurrencyCodeSet;
    this.PayMethod = other.PayMethod;
    this._PayMethodSet = other._PayMethodSet;
    this.RealtimeIndicator = other.RealtimeIndicator;
    this._RealtimeIndicatorSet = other._RealtimeIndicatorSet;
    this.PaymentProfileId = other.PaymentProfileId;
    this._PaymentProfileIdSet = other._PaymentProfileIdSet;
    this.CustBankSortCode = other.CustBankSortCode;
    this._CustBankSortCodeSet = other._CustBankSortCodeSet;
    this.CustBankAccNum = other.CustBankAccNum;
    this._CustBankAccNumSet = other._CustBankAccNumSet;
    this.AltBankAccNum = other.AltBankAccNum;
    this._AltBankAccNumSet = other._AltBankAccNumSet;
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
    this.CardAccount = other.CardAccount;
    this._CardAccountSet = other._CardAccountSet;
    this.CardCarrier = other.CardCarrier;
    this._CardCarrierSet = other._CardCarrierSet;
    this.CardExpire = other.CardExpire;
    this._CardExpireSet = other._CardExpireSet;
    this.AvsAddressId = other.AvsAddressId;
    this._AvsAddressIdSet = other._AvsAddressIdSet;
    this.AvsResponseCode = other.AvsResponseCode;
    this._AvsResponseCodeSet = other._AvsResponseCodeSet;
    this.TransFlag = other.TransFlag;
    this._TransFlagSet = other._TransFlagSet;
    this.CustBankAcctType = other.CustBankAcctType;
    this._CustBankAcctTypeSet = other._CustBankAcctTypeSet;
    this.CustEmail = other.CustEmail;
    this._CustEmailSet = other._CustEmailSet;
    this.CustBillAddress = other.CustBillAddress;
    this._CustBillAddressSet = other._CustBillAddressSet;
    this.CustBillCity = other.CustBillCity;
    this._CustBillCitySet = other._CustBillCitySet;
    this.CustBillState = other.CustBillState;
    this._CustBillStateSet = other._CustBillStateSet;
    this.CustBillZip = other.CustBillZip;
    this._CustBillZipSet = other._CustBillZipSet;
    this.CustBillCountryCode = other.CustBillCountryCode;
    this._CustBillCountryCodeSet = other._CustBillCountryCodeSet;
    this.DriverLicenseNum = other.DriverLicenseNum;
    this._DriverLicenseNumSet = other._DriverLicenseNumSet;
    this.DriverLicenseState = other.DriverLicenseState;
    this._DriverLicenseStateSet = other._DriverLicenseStateSet;
    this.CustCompanyName = other.CustCompanyName;
    this._CustCompanyNameSet = other._CustCompanyNameSet;
    this.BillCompanyTaxId = other.BillCompanyTaxId;
    this._BillCompanyTaxIdSet = other._BillCompanyTaxIdSet;
    this.CustPhone = other.CustPhone;
    this._CustPhoneSet = other._CustPhoneSet;
    this.OwnrFname = other.OwnrFname;
    this._OwnrFnameSet = other._OwnrFnameSet;
    this.OwnrLname = other.OwnrLname;
    this._OwnrLnameSet = other._OwnrLnameSet;
    this.CyclicalBillUsed = other.CyclicalBillUsed;
    this._CyclicalBillUsedSet = other._CyclicalBillUsedSet;
    this.IsDefault = other.IsDefault;
    this._IsDefaultSet = other._IsDefaultSet;
    this.NonRealtimeOnly = other.NonRealtimeOnly;
    this._NonRealtimeOnlySet = other._NonRealtimeOnlySet;
    this.IsTemporary = other.IsTemporary;
    this._IsTemporarySet = other._IsTemporarySet;
    this.MandateId = other.MandateId;
    this._MandateIdSet = other._MandateIdSet;
    this.MandateSignDate = other.MandateSignDate;
    this._MandateSignDateSet = other._MandateSignDateSet;
    this.MandateStatus = other.MandateStatus;
    this._MandateStatusSet = other._MandateStatusSet;
    this.CustBankIban = other.CustBankIban;
    this._CustBankIbanSet = other._CustBankIbanSet;
    this.CustBankBic = other.CustBankBic;
    this._CustBankBicSet = other._CustBankBicSet;
    this.DiffAcctOwnFlag = other.DiffAcctOwnFlag;
    this._DiffAcctOwnFlagSet = other._DiffAcctOwnFlagSet;
    this.CustBankAccOwner = other.CustBankAccOwner;
    this._CustBankAccOwnerSet = other._CustBankAccOwnerSet;
    this.SequenceType = other.SequenceType;
    this._SequenceTypeSet = other._SequenceTypeSet;
    this.CustBankIbanHist = other.CustBankIbanHist;
    this._CustBankIbanHistSet = other._CustBankIbanHistSet;
    this.CustBankBicHist = other.CustBankBicHist;
    this._CustBankBicHistSet = other._CustBankBicHistSet;
    this.MandateReset = other.MandateReset;
    this._MandateResetSet = other._MandateResetSet;
    this.EpgSubscriptionId = other.EpgSubscriptionId;
    this._EpgSubscriptionIdSet = other._EpgSubscriptionIdSet;
    this.ReferenceNumber = other.ReferenceNumber;
    this._ReferenceNumberSet = other._ReferenceNumberSet;
    this.TransactionUuid = other.TransactionUuid;
    this._TransactionUuidSet = other._TransactionUuidSet;
    this.ProfileCreationTime = other.ProfileCreationTime;
    this._ProfileCreationTimeSet = other._ProfileCreationTimeSet;
    this.PaymentMerchantId = other.PaymentMerchantId;
    this._PaymentMerchantIdSet = other._PaymentMerchantIdSet;
  }

  /** get the Key for this object
   * @return PrepaymentObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public PrepaymentObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (PrepaymentObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: TrackingId (PREPAYMENT.tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTrackingId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingId", "setTrackingId");
    }
    if (this.Key == null) this.Key = new PrepaymentObjectKeyData ();
    this.Key.TrackingId = value;
    this.Key._TrackingIdSet = true;
  }
  /** get the value of the field: TrackingId (PREPAYMENT.tracking_id)
   * @return Integer the value
   */
  public Integer getTrackingId () {
    if (this.Key == null) return null;
    return this.Key.TrackingId;
  }
  /** Change the field to not being actively set: TrackingId (PREPAYMENT.tracking_id)
   */
  public void unsetTrackingId () {
    if (this.Key == null) return;
    this.Key._TrackingIdSet = false;
  }
  /** See if the field is actively set: TrackingId (PREPAYMENT.tracking_id)
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

  /** set the fields value: TrackingIdServ (PREPAYMENT.tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTrackingIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingIdServ", "setTrackingIdServ");
    }
    if (this.Key == null) this.Key = new PrepaymentObjectKeyData ();
    this.Key.TrackingIdServ = value;
    this.Key._TrackingIdServSet = true;
  }
  /** get the value of the field: TrackingIdServ (PREPAYMENT.tracking_id_serv)
   * @return Integer the value
   */
  public Integer getTrackingIdServ () {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServ;
  }
  /** Change the field to not being actively set: TrackingIdServ (PREPAYMENT.tracking_id_serv)
   */
  public void unsetTrackingIdServ () {
    if (this.Key == null) return;
    this.Key._TrackingIdServSet = false;
  }
  /** See if the field is actively set: TrackingIdServ (PREPAYMENT.tracking_id_serv)
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
  /** set the fields value: EpgTransactionId (PAYMENT_TRANS.epg_transaction_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("EpgTransactionId") 
  public void setEpgTransactionId (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 60))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "EpgTransactionId", "setEpgTransactionId");
    }
    this.EpgTransactionId = value;
    this._EpgTransactionIdSet = true;
  }

  /** Retrieves the EpgTransactionId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The EpgTransactionId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EpgTransactionId field
   */
   public String getEpgTransactionIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEpgTransactionIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEpgTransactionIdAsFormattedString");
       return fmtMgr.formatString(this.getEpgTransactionId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EpgTransactionId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getEpgTransactionIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the EpgTransactionId field from a formatted string
   *
   * @param _value the EpgTransactionId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EpgTransactionId field
   */
   public void setEpgTransactionIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEpgTransactionIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setEpgTransactionId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EpgTransactionId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setEpgTransactionIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEpgTransactionIdFromFormattedString");
   }

  /** get the value of the field: EpgTransactionId (PAYMENT_TRANS.epg_transaction_id)
   * @return String the value
   */
  public String getEpgTransactionId () {
    return this.EpgTransactionId;
  }
  /** Change the field to not being actively set: EpgTransactionId (PAYMENT_TRANS.epg_transaction_id)
   */
  public void unsetEpgTransactionId () {
    this._EpgTransactionIdSet = false;
  }
  /** See if the field is actively set: EpgTransactionId (PAYMENT_TRANS.epg_transaction_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetEpgTransactionId () {
    return this._EpgTransactionIdSet;
  }
  /** set the fields value: AccountInternalId (PREPAYMENT.account_no)
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

  /** get the value of the field: AccountInternalId (PREPAYMENT.account_no)
   * @return Integer the value
   */
  public Integer getAccountInternalId () {
    return this.AccountInternalId;
  }
  /** Change the field to not being actively set: AccountInternalId (PREPAYMENT.account_no)
   */
  public void unsetAccountInternalId () {
    this._AccountInternalIdSet = false;
  }
  /** See if the field is actively set: AccountInternalId (PREPAYMENT.account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountInternalId () {
    return this._AccountInternalIdSet;
  }
  /** set the fields value: UndesignatedAmount (PREPAYMENT.undesignated_amount)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UndesignatedAmount") 
  public void setUndesignatedAmount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "UndesignatedAmount", "setUndesignatedAmount");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "UndesignatedAmount", "setUndesignatedAmount");
    }
    this.UndesignatedAmount = value;
    this._UndesignatedAmountSet = true;
  }

  /** Retrieves the UndesignatedAmount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UndesignatedAmount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UndesignatedAmount field
   */
   public String getUndesignatedAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUndesignatedAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUndesignatedAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getUndesignatedAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UndesignatedAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUndesignatedAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the UndesignatedAmount field from a formatted string
   *
   * @param _value the UndesignatedAmount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UndesignatedAmount field
   */
   public void setUndesignatedAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUndesignatedAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUndesignatedAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UndesignatedAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUndesignatedAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUndesignatedAmountFromFormattedString");
   }

  /**
   * Retrieves the UndesignatedAmount field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UndesignatedAmount field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the UndesignatedAmount field
   */
  public String getUndesignatedAmountAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUndesignatedAmountAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUndesignatedAmountAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getUndesignatedAmount(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UndesignatedAmount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUndesignatedAmountAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the UndesignatedAmount field value from a formatted currency string
   *
   * @param _value the UndesignatedAmount field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UndesignatedAmount field
   */
  public void setUndesignatedAmountFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUndesignatedAmountFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setUndesignatedAmount(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UndesignatedAmount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUndesignatedAmountFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUndesignatedAmountFromFormattedCurrencyString");
  }

  /** get the value of the field: UndesignatedAmount (PREPAYMENT.undesignated_amount)
   * @return BigInteger the value
   */
  public BigInteger getUndesignatedAmount () {
    return this.UndesignatedAmount;
  }
  /** Change the field to not being actively set: UndesignatedAmount (PREPAYMENT.undesignated_amount)
   */
  public void unsetUndesignatedAmount () {
    this._UndesignatedAmountSet = false;
  }
  /** See if the field is actively set: UndesignatedAmount (PREPAYMENT.undesignated_amount)
   * @return boolean whether the field is actively set
   */
  public boolean issetUndesignatedAmount () {
    return this._UndesignatedAmountSet;
  }
  /** set the fields value: TaxRate (PREPAYMENT.tax_rate)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TaxRate") 
  public void setTaxRate (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TaxRate", "setTaxRate");
    }
    this.TaxRate = value;
    this._TaxRateSet = true;
  }

  /** Retrieves the TaxRate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TaxRate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxRate field
   */
   public String getTaxRateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxRateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxRateAsFormattedString");
       return fmtMgr.formatNumber(this.getTaxRate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxRate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxRateAsFormattedString");
       throw x;
     }
   }
  /** Sets the TaxRate field from a formatted string
   *
   * @param _value the TaxRate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TaxRate field
   */
   public void setTaxRateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxRateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTaxRate(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxRate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxRateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxRateFromFormattedString");
   }

  /** get the value of the field: TaxRate (PREPAYMENT.tax_rate)
   * @return Integer the value
   */
  public Integer getTaxRate () {
    return this.TaxRate;
  }
  /** Change the field to not being actively set: TaxRate (PREPAYMENT.tax_rate)
   */
  public void unsetTaxRate () {
    this._TaxRateSet = false;
  }
  /** See if the field is actively set: TaxRate (PREPAYMENT.tax_rate)
   * @return boolean whether the field is actively set
   */
  public boolean issetTaxRate () {
    return this._TaxRateSet;
  }
  /** set the fields value: DesignatedTaxAmount (PREPAYMENT.designated_tax_amount)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DesignatedTaxAmount") 
  public void setDesignatedTaxAmount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DesignatedTaxAmount", "setDesignatedTaxAmount");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "DesignatedTaxAmount", "setDesignatedTaxAmount");
    }
    this.DesignatedTaxAmount = value;
    this._DesignatedTaxAmountSet = true;
  }

  /** Retrieves the DesignatedTaxAmount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DesignatedTaxAmount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DesignatedTaxAmount field
   */
   public String getDesignatedTaxAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDesignatedTaxAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDesignatedTaxAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getDesignatedTaxAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DesignatedTaxAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDesignatedTaxAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the DesignatedTaxAmount field from a formatted string
   *
   * @param _value the DesignatedTaxAmount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DesignatedTaxAmount field
   */
   public void setDesignatedTaxAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDesignatedTaxAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDesignatedTaxAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DesignatedTaxAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDesignatedTaxAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDesignatedTaxAmountFromFormattedString");
   }

  /**
   * Retrieves the DesignatedTaxAmount field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DesignatedTaxAmount field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the DesignatedTaxAmount field
   */
  public String getDesignatedTaxAmountAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDesignatedTaxAmountAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDesignatedTaxAmountAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getDesignatedTaxAmount(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DesignatedTaxAmount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDesignatedTaxAmountAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the DesignatedTaxAmount field value from a formatted currency string
   *
   * @param _value the DesignatedTaxAmount field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DesignatedTaxAmount field
   */
  public void setDesignatedTaxAmountFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDesignatedTaxAmountFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setDesignatedTaxAmount(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DesignatedTaxAmount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDesignatedTaxAmountFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDesignatedTaxAmountFromFormattedCurrencyString");
  }

  /** get the value of the field: DesignatedTaxAmount (PREPAYMENT.designated_tax_amount)
   * @return BigInteger the value
   */
  public BigInteger getDesignatedTaxAmount () {
    return this.DesignatedTaxAmount;
  }
  /** Change the field to not being actively set: DesignatedTaxAmount (PREPAYMENT.designated_tax_amount)
   */
  public void unsetDesignatedTaxAmount () {
    this._DesignatedTaxAmountSet = false;
  }
  /** See if the field is actively set: DesignatedTaxAmount (PREPAYMENT.designated_tax_amount)
   * @return boolean whether the field is actively set
   */
  public boolean issetDesignatedTaxAmount () {
    return this._DesignatedTaxAmountSet;
  }
  /** set the fields value: TaxPoint (PREPAYMENT.tax_point)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TaxPoint") 
  public void setTaxPoint (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TaxPoint", "setTaxPoint");
    }
    this.TaxPoint = value;
    this._TaxPointSet = true;
  }

  /** Retrieves the TaxPoint field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TaxPoint field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxPoint field
   */
   public String getTaxPointAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxPointAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxPointAsFormattedString");
       return fmtMgr.formatDate(this.getTaxPoint(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxPoint");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxPointAsFormattedString");
       throw x;
     }
   }
  /** Sets the TaxPoint field from a formatted string
   *
   * @param _value the TaxPoint field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TaxPoint field
   */
   public void setTaxPointFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxPointFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTaxPoint(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxPoint");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxPointFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxPointFromFormattedString");
   }

  /**
   * Retrieves the TaxPoint field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TaxPoint field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxPoint field
   */
  public String getTaxPointAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxPointAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxPointAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getTaxPoint(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxPoint");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxPointAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the TaxPoint field value from a formatted date/time string
   *
   * @param _value the TaxPoint field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TaxPoint field
   */
  public void setTaxPointFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTaxPointFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setTaxPoint(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxPoint");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxPointFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: TaxPoint (PREPAYMENT.tax_point)
   * @return Date the value
   */
  public Date getTaxPoint () {
    return this.TaxPoint;
  }
  /** Change the field to not being actively set: TaxPoint (PREPAYMENT.tax_point)
   */
  public void unsetTaxPoint () {
    this._TaxPointSet = false;
  }
  /** See if the field is actively set: TaxPoint (PREPAYMENT.tax_point)
   * @return boolean whether the field is actively set
   */
  public boolean issetTaxPoint () {
    return this._TaxPointSet;
  }
  /** set the fields value: TaxPkgInstId (PREPAYMENT.tax_pkg_inst_id)
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

  /** get the value of the field: TaxPkgInstId (PREPAYMENT.tax_pkg_inst_id)
   * @return Integer the value
   */
  public Integer getTaxPkgInstId () {
    return this.TaxPkgInstId;
  }
  /** Change the field to not being actively set: TaxPkgInstId (PREPAYMENT.tax_pkg_inst_id)
   */
  public void unsetTaxPkgInstId () {
    this._TaxPkgInstIdSet = false;
  }
  /** See if the field is actively set: TaxPkgInstId (PREPAYMENT.tax_pkg_inst_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetTaxPkgInstId () {
    return this._TaxPkgInstIdSet;
  }
  /** set the fields value: NoBill (PREPAYMENT.no_bill)
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

  /** get the value of the field: NoBill (PREPAYMENT.no_bill)
   * @return Boolean the value
   */
  public Boolean getNoBill () {
    return this.NoBill;
  }
  /** Change the field to not being actively set: NoBill (PREPAYMENT.no_bill)
   */
  public void unsetNoBill () {
    this._NoBillSet = false;
  }
  /** See if the field is actively set: NoBill (PREPAYMENT.no_bill)
   * @return boolean whether the field is actively set
   */
  public boolean issetNoBill () {
    return this._NoBillSet;
  }
  /** set the fields value: BillRefNo (PREPAYMENT.bill_ref_no)
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

  /** get the value of the field: BillRefNo (PREPAYMENT.bill_ref_no)
   * @return Integer the value
   */
  public Integer getBillRefNo () {
    return this.BillRefNo;
  }
  /** Change the field to not being actively set: BillRefNo (PREPAYMENT.bill_ref_no)
   */
  public void unsetBillRefNo () {
    this._BillRefNoSet = false;
  }
  /** See if the field is actively set: BillRefNo (PREPAYMENT.bill_ref_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillRefNo () {
    return this._BillRefNoSet;
  }
  /** set the fields value: BillRefResets (PREPAYMENT.bill_ref_resets)
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

  /** get the value of the field: BillRefResets (PREPAYMENT.bill_ref_resets)
   * @return Integer the value
   */
  public Integer getBillRefResets () {
    return this.BillRefResets;
  }
  /** Change the field to not being actively set: BillRefResets (PREPAYMENT.bill_ref_resets)
   */
  public void unsetBillRefResets () {
    this._BillRefResetsSet = false;
  }
  /** See if the field is actively set: BillRefResets (PREPAYMENT.bill_ref_resets)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillRefResets () {
    return this._BillRefResetsSet;
  }
  /** set the fields value: TransDt (PREPAYMENT.trans_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TransDt") 
  public void setTransDt (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TransDt", "setTransDt");
    }
    this.TransDt = value;
    this._TransDtSet = true;
  }

  /** Retrieves the TransDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TransDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransDt field
   */
   public String getTransDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransDtAsFormattedString");
       return fmtMgr.formatDate(this.getTransDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the TransDt field from a formatted string
   *
   * @param _value the TransDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TransDt field
   */
   public void setTransDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTransDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransDtFromFormattedString");
   }

  /**
   * Retrieves the TransDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransDt field
   */
  public String getTransDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getTransDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the TransDt field value from a formatted date/time string
   *
   * @param _value the TransDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TransDt field
   */
  public void setTransDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setTransDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: TransDt (PREPAYMENT.trans_dt)
   * @return Date the value
   */
  public Date getTransDt () {
    return this.TransDt;
  }
  /** Change the field to not being actively set: TransDt (PREPAYMENT.trans_dt)
   */
  public void unsetTransDt () {
    this._TransDtSet = false;
  }
  /** See if the field is actively set: TransDt (PREPAYMENT.trans_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetTransDt () {
    return this._TransDtSet;
  }
  /** set the fields value: TaxTypeCode (PREPAYMENT.tax_type_code)
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

  /** get the value of the field: TaxTypeCode (PREPAYMENT.tax_type_code)
   * @return Integer the value
   */
  public Integer getTaxTypeCode () {
    return this.TaxTypeCode;
  }
  /** Change the field to not being actively set: TaxTypeCode (PREPAYMENT.tax_type_code)
   */
  public void unsetTaxTypeCode () {
    this._TaxTypeCodeSet = false;
  }
  /** See if the field is actively set: TaxTypeCode (PREPAYMENT.tax_type_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetTaxTypeCode () {
    return this._TaxTypeCodeSet;
  }
  /** set the fields value: OpenItemId (PREPAYMENT.open_item_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OpenItemId") 
  public void setOpenItemId (Integer value) throws ServiceException
  {
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

  /** get the value of the field: OpenItemId (PREPAYMENT.open_item_id)
   * @return Integer the value
   */
  public Integer getOpenItemId () {
    return this.OpenItemId;
  }
  /** Change the field to not being actively set: OpenItemId (PREPAYMENT.open_item_id)
   */
  public void unsetOpenItemId () {
    this._OpenItemIdSet = false;
  }
  /** See if the field is actively set: OpenItemId (PREPAYMENT.open_item_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetOpenItemId () {
    return this._OpenItemIdSet;
  }
  /** set the fields value: SourceType (PREPAYMENT.source_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SourceType") 
  public void setSourceType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SourceType", "setSourceType");
    }
    this.SourceType = value;
    this._SourceTypeSet = true;
  }

  /** Retrieves the SourceType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SourceType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SourceType field
   */
   public String getSourceTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSourceTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSourceTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getSourceType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SourceType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSourceTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the SourceType field from a formatted string
   *
   * @param _value the SourceType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SourceType field
   */
   public void setSourceTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSourceTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSourceType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SourceType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSourceTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSourceTypeFromFormattedString");
   }

  /** get the value of the field: SourceType (PREPAYMENT.source_type)
   * @return Integer the value
   */
  public Integer getSourceType () {
    return this.SourceType;
  }
  /** Change the field to not being actively set: SourceType (PREPAYMENT.source_type)
   */
  public void unsetSourceType () {
    this._SourceTypeSet = false;
  }
  /** See if the field is actively set: SourceType (PREPAYMENT.source_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetSourceType () {
    return this._SourceTypeSet;
  }
  /** set the fields value: SourceId (PREPAYMENT.source_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SourceId") 
  public void setSourceId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SourceId", "setSourceId");
    }
    this.SourceId = value;
    this._SourceIdSet = true;
  }

  /** Retrieves the SourceId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SourceId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SourceId field
   */
   public String getSourceIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSourceIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSourceIdAsFormattedString");
       return fmtMgr.formatNumber(this.getSourceId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SourceId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSourceIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the SourceId field from a formatted string
   *
   * @param _value the SourceId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SourceId field
   */
   public void setSourceIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSourceIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSourceId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SourceId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSourceIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSourceIdFromFormattedString");
   }

  /** get the value of the field: SourceId (PREPAYMENT.source_id)
   * @return Integer the value
   */
  public Integer getSourceId () {
    return this.SourceId;
  }
  /** Change the field to not being actively set: SourceId (PREPAYMENT.source_id)
   */
  public void unsetSourceId () {
    this._SourceIdSet = false;
  }
  /** See if the field is actively set: SourceId (PREPAYMENT.source_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetSourceId () {
    return this._SourceIdSet;
  }
  /** set the fields value: SourceIdServ (PREPAYMENT.source_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SourceIdServ") 
  public void setSourceIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SourceIdServ", "setSourceIdServ");
    }
    this.SourceIdServ = value;
    this._SourceIdServSet = true;
  }

  /** Retrieves the SourceIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SourceIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SourceIdServ field
   */
   public String getSourceIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSourceIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSourceIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getSourceIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SourceIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSourceIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the SourceIdServ field from a formatted string
   *
   * @param _value the SourceIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SourceIdServ field
   */
   public void setSourceIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSourceIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSourceIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SourceIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSourceIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSourceIdServFromFormattedString");
   }

  /** get the value of the field: SourceIdServ (PREPAYMENT.source_id_serv)
   * @return Integer the value
   */
  public Integer getSourceIdServ () {
    return this.SourceIdServ;
  }
  /** Change the field to not being actively set: SourceIdServ (PREPAYMENT.source_id_serv)
   */
  public void unsetSourceIdServ () {
    this._SourceIdServSet = false;
  }
  /** See if the field is actively set: SourceIdServ (PREPAYMENT.source_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetSourceIdServ () {
    return this._SourceIdServSet;
  }
  /** set the fields value: DiscountId (PREPAYMENT.discount_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DiscountId") 
  public void setDiscountId (Integer value) throws ServiceException
  {
    this.DiscountId = value;
    this._DiscountIdSet = true;
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

  /** get the value of the field: DiscountId (PREPAYMENT.discount_id)
   * @return Integer the value
   */
  public Integer getDiscountId () {
    return this.DiscountId;
  }
  /** Change the field to not being actively set: DiscountId (PREPAYMENT.discount_id)
   */
  public void unsetDiscountId () {
    this._DiscountIdSet = false;
  }
  /** See if the field is actively set: DiscountId (PREPAYMENT.discount_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetDiscountId () {
    return this._DiscountIdSet;
  }
  /** set the fields value: AllocatedTax (PREPAYMENT.allocated_tax)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AllocatedTax") 
  public void setAllocatedTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AllocatedTax", "setAllocatedTax");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AllocatedTax", "setAllocatedTax");
    }
    this.AllocatedTax = value;
    this._AllocatedTaxSet = true;
  }

  /** Retrieves the AllocatedTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AllocatedTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AllocatedTax field
   */
   public String getAllocatedTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAllocatedTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAllocatedTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getAllocatedTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AllocatedTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAllocatedTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the AllocatedTax field from a formatted string
   *
   * @param _value the AllocatedTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AllocatedTax field
   */
   public void setAllocatedTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAllocatedTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAllocatedTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AllocatedTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAllocatedTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAllocatedTaxFromFormattedString");
   }

  /**
   * Retrieves the AllocatedTax field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AllocatedTax field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the AllocatedTax field
   */
  public String getAllocatedTaxAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAllocatedTaxAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAllocatedTaxAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getAllocatedTax(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AllocatedTax");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAllocatedTaxAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the AllocatedTax field value from a formatted currency string
   *
   * @param _value the AllocatedTax field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AllocatedTax field
   */
  public void setAllocatedTaxFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAllocatedTaxFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setAllocatedTax(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AllocatedTax");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAllocatedTaxFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAllocatedTaxFromFormattedCurrencyString");
  }

  /** get the value of the field: AllocatedTax (PREPAYMENT.allocated_tax)
   * @return BigInteger the value
   */
  public BigInteger getAllocatedTax () {
    return this.AllocatedTax;
  }
  /** Change the field to not being actively set: AllocatedTax (PREPAYMENT.allocated_tax)
   */
  public void unsetAllocatedTax () {
    this._AllocatedTaxSet = false;
  }
  /** See if the field is actively set: AllocatedTax (PREPAYMENT.allocated_tax)
   * @return boolean whether the field is actively set
   */
  public boolean issetAllocatedTax () {
    return this._AllocatedTaxSet;
  }
  /** set the fields value: AllocatedUndesignated (PREPAYMENT.allocated_undesignated)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AllocatedUndesignated") 
  public void setAllocatedUndesignated (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AllocatedUndesignated", "setAllocatedUndesignated");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AllocatedUndesignated", "setAllocatedUndesignated");
    }
    this.AllocatedUndesignated = value;
    this._AllocatedUndesignatedSet = true;
  }

  /** Retrieves the AllocatedUndesignated field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AllocatedUndesignated field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AllocatedUndesignated field
   */
   public String getAllocatedUndesignatedAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAllocatedUndesignatedAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAllocatedUndesignatedAsFormattedString");
       return fmtMgr.formatBigInteger(this.getAllocatedUndesignated(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AllocatedUndesignated");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAllocatedUndesignatedAsFormattedString");
       throw x;
     }
   }
  /** Sets the AllocatedUndesignated field from a formatted string
   *
   * @param _value the AllocatedUndesignated field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AllocatedUndesignated field
   */
   public void setAllocatedUndesignatedFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAllocatedUndesignatedFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAllocatedUndesignated(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AllocatedUndesignated");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAllocatedUndesignatedFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAllocatedUndesignatedFromFormattedString");
   }

  /**
   * Retrieves the AllocatedUndesignated field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AllocatedUndesignated field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the AllocatedUndesignated field
   */
  public String getAllocatedUndesignatedAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAllocatedUndesignatedAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAllocatedUndesignatedAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getAllocatedUndesignated(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AllocatedUndesignated");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAllocatedUndesignatedAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the AllocatedUndesignated field value from a formatted currency string
   *
   * @param _value the AllocatedUndesignated field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AllocatedUndesignated field
   */
  public void setAllocatedUndesignatedFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAllocatedUndesignatedFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setAllocatedUndesignated(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AllocatedUndesignated");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAllocatedUndesignatedFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAllocatedUndesignatedFromFormattedCurrencyString");
  }

  /** get the value of the field: AllocatedUndesignated (PREPAYMENT.allocated_undesignated)
   * @return BigInteger the value
   */
  public BigInteger getAllocatedUndesignated () {
    return this.AllocatedUndesignated;
  }
  /** Change the field to not being actively set: AllocatedUndesignated (PREPAYMENT.allocated_undesignated)
   */
  public void unsetAllocatedUndesignated () {
    this._AllocatedUndesignatedSet = false;
  }
  /** See if the field is actively set: AllocatedUndesignated (PREPAYMENT.allocated_undesignated)
   * @return boolean whether the field is actively set
   */
  public boolean issetAllocatedUndesignated () {
    return this._AllocatedUndesignatedSet;
  }
  /** set the fields value: MicrBankId (PREPAYMENT.micr_bank_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MicrBankId") 
  public void setMicrBankId (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 20))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "MicrBankId", "setMicrBankId");
    }
    this.MicrBankId = value;
    this._MicrBankIdSet = true;
  }

  /** Retrieves the MicrBankId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MicrBankId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MicrBankId field
   */
   public String getMicrBankIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMicrBankIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMicrBankIdAsFormattedString");
       return fmtMgr.formatString(this.getMicrBankId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MicrBankId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMicrBankIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the MicrBankId field from a formatted string
   *
   * @param _value the MicrBankId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MicrBankId field
   */
   public void setMicrBankIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMicrBankIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMicrBankId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MicrBankId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMicrBankIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMicrBankIdFromFormattedString");
   }

  /** get the value of the field: MicrBankId (PREPAYMENT.micr_bank_id)
   * @return String the value
   */
  public String getMicrBankId () {
    return this.MicrBankId;
  }
  /** Change the field to not being actively set: MicrBankId (PREPAYMENT.micr_bank_id)
   */
  public void unsetMicrBankId () {
    this._MicrBankIdSet = false;
  }
  /** See if the field is actively set: MicrBankId (PREPAYMENT.micr_bank_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetMicrBankId () {
    return this._MicrBankIdSet;
  }
  /** set the fields value: MicrDdaNum (PREPAYMENT.micr_dda_num)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MicrDdaNum") 
  public void setMicrDdaNum (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 20))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "MicrDdaNum", "setMicrDdaNum");
    }
    this.MicrDdaNum = value;
    this._MicrDdaNumSet = true;
  }

  /** Retrieves the MicrDdaNum field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MicrDdaNum field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MicrDdaNum field
   */
   public String getMicrDdaNumAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMicrDdaNumAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMicrDdaNumAsFormattedString");
       return fmtMgr.formatString(this.getMicrDdaNum());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MicrDdaNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMicrDdaNumAsFormattedString");
       throw x;
     }
   }
  /** Sets the MicrDdaNum field from a formatted string
   *
   * @param _value the MicrDdaNum field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MicrDdaNum field
   */
   public void setMicrDdaNumFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMicrDdaNumFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMicrDdaNum(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MicrDdaNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMicrDdaNumFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMicrDdaNumFromFormattedString");
   }

  /** get the value of the field: MicrDdaNum (PREPAYMENT.micr_dda_num)
   * @return String the value
   */
  public String getMicrDdaNum () {
    return this.MicrDdaNum;
  }
  /** Change the field to not being actively set: MicrDdaNum (PREPAYMENT.micr_dda_num)
   */
  public void unsetMicrDdaNum () {
    this._MicrDdaNumSet = false;
  }
  /** See if the field is actively set: MicrDdaNum (PREPAYMENT.micr_dda_num)
   * @return boolean whether the field is actively set
   */
  public boolean issetMicrDdaNum () {
    return this._MicrDdaNumSet;
  }
  /** set the fields value: MicrCheckNum (PREPAYMENT.micr_check_num)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MicrCheckNum") 
  public void setMicrCheckNum (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 15))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "MicrCheckNum", "setMicrCheckNum");
    }
    this.MicrCheckNum = value;
    this._MicrCheckNumSet = true;
  }

  /** Retrieves the MicrCheckNum field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MicrCheckNum field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MicrCheckNum field
   */
   public String getMicrCheckNumAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMicrCheckNumAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMicrCheckNumAsFormattedString");
       return fmtMgr.formatString(this.getMicrCheckNum());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MicrCheckNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMicrCheckNumAsFormattedString");
       throw x;
     }
   }
  /** Sets the MicrCheckNum field from a formatted string
   *
   * @param _value the MicrCheckNum field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MicrCheckNum field
   */
   public void setMicrCheckNumFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMicrCheckNumFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMicrCheckNum(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MicrCheckNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMicrCheckNumFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMicrCheckNumFromFormattedString");
   }

  /** get the value of the field: MicrCheckNum (PREPAYMENT.micr_check_num)
   * @return String the value
   */
  public String getMicrCheckNum () {
    return this.MicrCheckNum;
  }
  /** Change the field to not being actively set: MicrCheckNum (PREPAYMENT.micr_check_num)
   */
  public void unsetMicrCheckNum () {
    this._MicrCheckNumSet = false;
  }
  /** See if the field is actively set: MicrCheckNum (PREPAYMENT.micr_check_num)
   * @return boolean whether the field is actively set
   */
  public boolean issetMicrCheckNum () {
    return this._MicrCheckNumSet;
  }
  /** set the fields value: ChgWho (PREPAYMENT.chg_who)
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

  /** get the value of the field: ChgWho (PREPAYMENT.chg_who)
   * @return String the value
   */
  public String getChgWho () {
    return this.ChgWho;
  }
  /** Change the field to not being actively set: ChgWho (PREPAYMENT.chg_who)
   */
  public void unsetChgWho () {
    this._ChgWhoSet = false;
  }
  /** See if the field is actively set: ChgWho (PREPAYMENT.chg_who)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgWho () {
    return this._ChgWhoSet;
  }
  /** set the fields value: ChgDate (PREPAYMENT.chg_date)
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

  /** get the value of the field: ChgDate (PREPAYMENT.chg_date)
   * @return Date the value
   */
  public Date getChgDate () {
    return this.ChgDate;
  }
  /** Change the field to not being actively set: ChgDate (PREPAYMENT.chg_date)
   */
  public void unsetChgDate () {
    this._ChgDateSet = false;
  }
  /** See if the field is actively set: ChgDate (PREPAYMENT.chg_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgDate () {
    return this._ChgDateSet;
  }
  /** set the fields value: Status (PREPAYMENT.status)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Status") 
  public void setStatus (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Status", "setStatus");
    }
    this.Status = value;
    this._StatusSet = true;
  }

  /** Retrieves the Status field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Status field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Status field
   */
   public String getStatusAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatusAsFormattedString");
       return fmtMgr.formatNumber(this.getStatus(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Status");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatusAsFormattedString");
       throw x;
     }
   }
  /** Sets the Status field from a formatted string
   *
   * @param _value the Status field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Status field
   */
   public void setStatusFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setStatus(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Status");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatusFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatusFromFormattedString");
   }

  /** get the value of the field: Status (PREPAYMENT.status)
   * @return Integer the value
   */
  public Integer getStatus () {
    return this.Status;
  }
  /** Change the field to not being actively set: Status (PREPAYMENT.status)
   */
  public void unsetStatus () {
    this._StatusSet = false;
  }
  /** See if the field is actively set: Status (PREPAYMENT.status)
   * @return boolean whether the field is actively set
   */
  public boolean issetStatus () {
    return this._StatusSet;
  }
  /** set the fields value: ImpliedDecimal (PREPAYMENT.implied_decimal)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ImpliedDecimal") 
  public void setImpliedDecimal (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ImpliedDecimal", "setImpliedDecimal");
    }
    this.ImpliedDecimal = value;
    this._ImpliedDecimalSet = true;
  }

  /** Retrieves the ImpliedDecimal field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ImpliedDecimal field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ImpliedDecimal field
   */
   public String getImpliedDecimalAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getImpliedDecimalAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getImpliedDecimalAsFormattedString");
       return fmtMgr.formatNumber(this.getImpliedDecimal(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ImpliedDecimal");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getImpliedDecimalAsFormattedString");
       throw x;
     }
   }
  /** Sets the ImpliedDecimal field from a formatted string
   *
   * @param _value the ImpliedDecimal field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ImpliedDecimal field
   */
   public void setImpliedDecimalFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getImpliedDecimalFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setImpliedDecimal(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ImpliedDecimal");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setImpliedDecimalFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setImpliedDecimalFromFormattedString");
   }

  /** get the value of the field: ImpliedDecimal (PREPAYMENT.implied_decimal)
   * @return Integer the value
   */
  public Integer getImpliedDecimal () {
    return this.ImpliedDecimal;
  }
  /** Change the field to not being actively set: ImpliedDecimal (PREPAYMENT.implied_decimal)
   */
  public void unsetImpliedDecimal () {
    this._ImpliedDecimalSet = false;
  }
  /** See if the field is actively set: ImpliedDecimal (PREPAYMENT.implied_decimal)
   * @return boolean whether the field is actively set
   */
  public boolean issetImpliedDecimal () {
    return this._ImpliedDecimalSet;
  }
  /** set the fields value: CurrencyCode (PREPAYMENT.currency_code)
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

  /** get the value of the field: CurrencyCode (PREPAYMENT.currency_code)
   * @return Integer the value
   */
  public Integer getCurrencyCode () {
    return this.CurrencyCode;
  }
  /** Change the field to not being actively set: CurrencyCode (PREPAYMENT.currency_code)
   */
  public void unsetCurrencyCode () {
    this._CurrencyCodeSet = false;
  }
  /** See if the field is actively set: CurrencyCode (PREPAYMENT.currency_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCurrencyCode () {
    return this._CurrencyCodeSet;
  }
  /** set the fields value: PayMethod (PREPAYMENT.pay_method)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PayMethod") 
  public void setPayMethod (Integer value) throws ServiceException
  {
    this.PayMethod = value;
    this._PayMethodSet = true;
  }

  /** Retrieves the PayMethod field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PayMethod field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PayMethod field
   */
   public String getPayMethodAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayMethodAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPayMethodAsFormattedString");
       return fmtMgr.formatNumber(this.getPayMethod(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PayMethod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPayMethodAsFormattedString");
       throw x;
     }
   }
  /** Sets the PayMethod field from a formatted string
   *
   * @param _value the PayMethod field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PayMethod field
   */
   public void setPayMethodFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayMethodFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPayMethod(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PayMethod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPayMethodFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPayMethodFromFormattedString");
   }

  /** get the value of the field: PayMethod (PREPAYMENT.pay_method)
   * @return Integer the value
   */
  public Integer getPayMethod () {
    return this.PayMethod;
  }
  /** Change the field to not being actively set: PayMethod (PREPAYMENT.pay_method)
   */
  public void unsetPayMethod () {
    this._PayMethodSet = false;
  }
  /** See if the field is actively set: PayMethod (PREPAYMENT.pay_method)
   * @return boolean whether the field is actively set
   */
  public boolean issetPayMethod () {
    return this._PayMethodSet;
  }
  /** set the fields value: RealtimeIndicator (PREPAYMENT.realtime_indicator)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RealtimeIndicator") 
  public void setRealtimeIndicator (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RealtimeIndicator", "setRealtimeIndicator");
    }
    this.RealtimeIndicator = value;
    this._RealtimeIndicatorSet = true;
  }

  /** Retrieves the RealtimeIndicator field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RealtimeIndicator field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RealtimeIndicator field
   */
   public String getRealtimeIndicatorAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRealtimeIndicatorAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRealtimeIndicatorAsFormattedString");
       return fmtMgr.formatNumber(this.getRealtimeIndicator(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RealtimeIndicator");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRealtimeIndicatorAsFormattedString");
       throw x;
     }
   }
  /** Sets the RealtimeIndicator field from a formatted string
   *
   * @param _value the RealtimeIndicator field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RealtimeIndicator field
   */
   public void setRealtimeIndicatorFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRealtimeIndicatorFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRealtimeIndicator(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RealtimeIndicator");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRealtimeIndicatorFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRealtimeIndicatorFromFormattedString");
   }

  /** get the value of the field: RealtimeIndicator (PREPAYMENT.realtime_indicator)
   * @return Integer the value
   */
  public Integer getRealtimeIndicator () {
    return this.RealtimeIndicator;
  }
  /** Change the field to not being actively set: RealtimeIndicator (PREPAYMENT.realtime_indicator)
   */
  public void unsetRealtimeIndicator () {
    this._RealtimeIndicatorSet = false;
  }
  /** See if the field is actively set: RealtimeIndicator (PREPAYMENT.realtime_indicator)
   * @return boolean whether the field is actively set
   */
  public boolean issetRealtimeIndicator () {
    return this._RealtimeIndicatorSet;
  }
  /** set the fields value: PaymentProfileId (PREPAYMENT.payment_profile_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PaymentProfileId") 
  public void setPaymentProfileId (BigInteger value) throws ServiceException
  {
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

  /** get the value of the field: PaymentProfileId (PREPAYMENT.payment_profile_id)
   * @return BigInteger the value
   */
  public BigInteger getPaymentProfileId () {
    return this.PaymentProfileId;
  }
  /** Change the field to not being actively set: PaymentProfileId (PREPAYMENT.payment_profile_id)
   */
  public void unsetPaymentProfileId () {
    this._PaymentProfileIdSet = false;
  }
  /** See if the field is actively set: PaymentProfileId (PREPAYMENT.payment_profile_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetPaymentProfileId () {
    return this._PaymentProfileIdSet;
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
  /** set the fields value: CardAccount (PAYMENT_PROFILE.card_account)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CardAccount") 
  public void setCardAccount (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 22))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CardAccount", "setCardAccount");
    }
    this.CardAccount = value;
    this._CardAccountSet = true;
  }

  /** Retrieves the CardAccount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CardAccount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CardAccount field
   */
   public String getCardAccountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCardAccountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCardAccountAsFormattedString");
       return fmtMgr.formatString(this.getCardAccount());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CardAccount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCardAccountAsFormattedString");
       throw x;
     }
   }
  /** Sets the CardAccount field from a formatted string
   *
   * @param _value the CardAccount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CardAccount field
   */
   public void setCardAccountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCardAccountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCardAccount(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CardAccount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCardAccountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCardAccountFromFormattedString");
   }

  /** get the value of the field: CardAccount (PAYMENT_PROFILE.card_account)
   * @return String the value
   */
  public String getCardAccount () {
    return this.CardAccount;
  }
  /** Change the field to not being actively set: CardAccount (PAYMENT_PROFILE.card_account)
   */
  public void unsetCardAccount () {
    this._CardAccountSet = false;
  }
  /** See if the field is actively set: CardAccount (PAYMENT_PROFILE.card_account)
   * @return boolean whether the field is actively set
   */
  public boolean issetCardAccount () {
    return this._CardAccountSet;
  }
  /** set the fields value: CardCarrier (PAYMENT_PROFILE.card_carrier)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CardCarrier") 
  public void setCardCarrier (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 4))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CardCarrier", "setCardCarrier");
    }
    this.CardCarrier = value;
    this._CardCarrierSet = true;
  }

  /** Retrieves the CardCarrier field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CardCarrier field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CardCarrier field
   */
   public String getCardCarrierAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCardCarrierAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCardCarrierAsFormattedString");
       return fmtMgr.formatString(this.getCardCarrier());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CardCarrier");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCardCarrierAsFormattedString");
       throw x;
     }
   }
  /** Sets the CardCarrier field from a formatted string
   *
   * @param _value the CardCarrier field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CardCarrier field
   */
   public void setCardCarrierFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCardCarrierFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCardCarrier(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CardCarrier");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCardCarrierFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCardCarrierFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated CardCarrier field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the CardCarrier field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CardCarrier field
   */

  public String getCardCarrierDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCardCarrierDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getCardCarrierEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCardCarrierDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getCardCarrier()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CardCarrier");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCardCarrierDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated CardCarrier field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the CardCarrier field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CardCarrier field
   */
  public Enumeration getCardCarrierEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCardCarrierEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("CardTypeCode", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCardCarrierEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CardCarrier");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCardCarrierEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated CardCarrier field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setCardCarrierFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCardCarrierFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getCardCarrierEnumeration(_locale);
      this.setCardCarrier((String)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), String.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CardCarrier");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCardCarrierFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCardCarrierFromDisplayValue");
  }

  /** get the value of the field: CardCarrier (PAYMENT_PROFILE.card_carrier)
   * @return String the value
   */
  public String getCardCarrier () {
    return this.CardCarrier;
  }
  /** Change the field to not being actively set: CardCarrier (PAYMENT_PROFILE.card_carrier)
   */
  public void unsetCardCarrier () {
    this._CardCarrierSet = false;
  }
  /** See if the field is actively set: CardCarrier (PAYMENT_PROFILE.card_carrier)
   * @return boolean whether the field is actively set
   */
  public boolean issetCardCarrier () {
    return this._CardCarrierSet;
  }
  /** set the fields value: CardExpire (PAYMENT_PROFILE.card_expire)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CardExpire") 
  public void setCardExpire (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 4))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CardExpire", "setCardExpire");
    }
    this.CardExpire = value;
    this._CardExpireSet = true;
  }

  /** Retrieves the CardExpire field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CardExpire field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CardExpire field
   */
   public String getCardExpireAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCardExpireAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCardExpireAsFormattedString");
       return fmtMgr.formatString(this.getCardExpire());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CardExpire");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCardExpireAsFormattedString");
       throw x;
     }
   }
  /** Sets the CardExpire field from a formatted string
   *
   * @param _value the CardExpire field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CardExpire field
   */
   public void setCardExpireFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCardExpireFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCardExpire(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CardExpire");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCardExpireFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCardExpireFromFormattedString");
   }

  /** get the value of the field: CardExpire (PAYMENT_PROFILE.card_expire)
   * @return String the value
   */
  public String getCardExpire () {
    return this.CardExpire;
  }
  /** Change the field to not being actively set: CardExpire (PAYMENT_PROFILE.card_expire)
   */
  public void unsetCardExpire () {
    this._CardExpireSet = false;
  }
  /** See if the field is actively set: CardExpire (PAYMENT_PROFILE.card_expire)
   * @return boolean whether the field is actively set
   */
  public boolean issetCardExpire () {
    return this._CardExpireSet;
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
  /** set the fields value: CustBankAcctType (PAYMENT_PROFILE.cust_bank_acct_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CustBankAcctType") 
  public void setCustBankAcctType (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 1))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CustBankAcctType", "setCustBankAcctType");
    }
    this.CustBankAcctType = value;
    this._CustBankAcctTypeSet = true;
  }

  /** Retrieves the CustBankAcctType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CustBankAcctType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustBankAcctType field
   */
   public String getCustBankAcctTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBankAcctTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustBankAcctTypeAsFormattedString");
       return fmtMgr.formatString(this.getCustBankAcctType());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustBankAcctType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustBankAcctTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the CustBankAcctType field from a formatted string
   *
   * @param _value the CustBankAcctType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CustBankAcctType field
   */
   public void setCustBankAcctTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBankAcctTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCustBankAcctType(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustBankAcctType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustBankAcctTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustBankAcctTypeFromFormattedString");
   }

  /** get the value of the field: CustBankAcctType (PAYMENT_PROFILE.cust_bank_acct_type)
   * @return String the value
   */
  public String getCustBankAcctType () {
    return this.CustBankAcctType;
  }
  /** Change the field to not being actively set: CustBankAcctType (PAYMENT_PROFILE.cust_bank_acct_type)
   */
  public void unsetCustBankAcctType () {
    this._CustBankAcctTypeSet = false;
  }
  /** See if the field is actively set: CustBankAcctType (PAYMENT_PROFILE.cust_bank_acct_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetCustBankAcctType () {
    return this._CustBankAcctTypeSet;
  }
  /** set the fields value: CustEmail (PAYMENT_PROFILE.cust_email)
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

  /** get the value of the field: CustEmail (PAYMENT_PROFILE.cust_email)
   * @return String the value
   */
  public String getCustEmail () {
    return this.CustEmail;
  }
  /** Change the field to not being actively set: CustEmail (PAYMENT_PROFILE.cust_email)
   */
  public void unsetCustEmail () {
    this._CustEmailSet = false;
  }
  /** See if the field is actively set: CustEmail (PAYMENT_PROFILE.cust_email)
   * @return boolean whether the field is actively set
   */
  public boolean issetCustEmail () {
    return this._CustEmailSet;
  }
  /** set the fields value: CustBillAddress (PAYMENT_PROFILE.cust_bill_address)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CustBillAddress") 
  public void setCustBillAddress (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 75))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CustBillAddress", "setCustBillAddress");
    }
    this.CustBillAddress = value;
    this._CustBillAddressSet = true;
  }

  /** Retrieves the CustBillAddress field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CustBillAddress field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustBillAddress field
   */
   public String getCustBillAddressAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBillAddressAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustBillAddressAsFormattedString");
       return fmtMgr.formatString(this.getCustBillAddress());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustBillAddress");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustBillAddressAsFormattedString");
       throw x;
     }
   }
  /** Sets the CustBillAddress field from a formatted string
   *
   * @param _value the CustBillAddress field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CustBillAddress field
   */
   public void setCustBillAddressFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBillAddressFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCustBillAddress(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustBillAddress");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustBillAddressFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustBillAddressFromFormattedString");
   }

  /** get the value of the field: CustBillAddress (PAYMENT_PROFILE.cust_bill_address)
   * @return String the value
   */
  public String getCustBillAddress () {
    return this.CustBillAddress;
  }
  /** Change the field to not being actively set: CustBillAddress (PAYMENT_PROFILE.cust_bill_address)
   */
  public void unsetCustBillAddress () {
    this._CustBillAddressSet = false;
  }
  /** See if the field is actively set: CustBillAddress (PAYMENT_PROFILE.cust_bill_address)
   * @return boolean whether the field is actively set
   */
  public boolean issetCustBillAddress () {
    return this._CustBillAddressSet;
  }
  /** set the fields value: CustBillCity (PAYMENT_PROFILE.cust_bill_city)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CustBillCity") 
  public void setCustBillCity (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 35))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CustBillCity", "setCustBillCity");
    }
    this.CustBillCity = value;
    this._CustBillCitySet = true;
  }

  /** Retrieves the CustBillCity field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CustBillCity field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustBillCity field
   */
   public String getCustBillCityAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBillCityAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustBillCityAsFormattedString");
       return fmtMgr.formatString(this.getCustBillCity());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustBillCity");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustBillCityAsFormattedString");
       throw x;
     }
   }
  /** Sets the CustBillCity field from a formatted string
   *
   * @param _value the CustBillCity field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CustBillCity field
   */
   public void setCustBillCityFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBillCityFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCustBillCity(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustBillCity");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustBillCityFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustBillCityFromFormattedString");
   }

  /** get the value of the field: CustBillCity (PAYMENT_PROFILE.cust_bill_city)
   * @return String the value
   */
  public String getCustBillCity () {
    return this.CustBillCity;
  }
  /** Change the field to not being actively set: CustBillCity (PAYMENT_PROFILE.cust_bill_city)
   */
  public void unsetCustBillCity () {
    this._CustBillCitySet = false;
  }
  /** See if the field is actively set: CustBillCity (PAYMENT_PROFILE.cust_bill_city)
   * @return boolean whether the field is actively set
   */
  public boolean issetCustBillCity () {
    return this._CustBillCitySet;
  }
  /** set the fields value: CustBillState (PAYMENT_PROFILE.cust_bill_state)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CustBillState") 
  public void setCustBillState (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 28))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CustBillState", "setCustBillState");
    }
    this.CustBillState = value;
    this._CustBillStateSet = true;
  }

  /** Retrieves the CustBillState field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CustBillState field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustBillState field
   */
   public String getCustBillStateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBillStateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustBillStateAsFormattedString");
       return fmtMgr.formatString(this.getCustBillState());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustBillState");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustBillStateAsFormattedString");
       throw x;
     }
   }
  /** Sets the CustBillState field from a formatted string
   *
   * @param _value the CustBillState field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CustBillState field
   */
   public void setCustBillStateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBillStateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCustBillState(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustBillState");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustBillStateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustBillStateFromFormattedString");
   }

  /** get the value of the field: CustBillState (PAYMENT_PROFILE.cust_bill_state)
   * @return String the value
   */
  public String getCustBillState () {
    return this.CustBillState;
  }
  /** Change the field to not being actively set: CustBillState (PAYMENT_PROFILE.cust_bill_state)
   */
  public void unsetCustBillState () {
    this._CustBillStateSet = false;
  }
  /** See if the field is actively set: CustBillState (PAYMENT_PROFILE.cust_bill_state)
   * @return boolean whether the field is actively set
   */
  public boolean issetCustBillState () {
    return this._CustBillStateSet;
  }
  /** set the fields value: CustBillZip (PAYMENT_PROFILE.cust_bill_zip)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CustBillZip") 
  public void setCustBillZip (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 16))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CustBillZip", "setCustBillZip");
    }
    this.CustBillZip = value;
    this._CustBillZipSet = true;
  }

  /** Retrieves the CustBillZip field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CustBillZip field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustBillZip field
   */
   public String getCustBillZipAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBillZipAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustBillZipAsFormattedString");
       return fmtMgr.formatString(this.getCustBillZip());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustBillZip");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustBillZipAsFormattedString");
       throw x;
     }
   }
  /** Sets the CustBillZip field from a formatted string
   *
   * @param _value the CustBillZip field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CustBillZip field
   */
   public void setCustBillZipFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBillZipFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCustBillZip(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustBillZip");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustBillZipFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustBillZipFromFormattedString");
   }

  /** get the value of the field: CustBillZip (PAYMENT_PROFILE.cust_bill_zip)
   * @return String the value
   */
  public String getCustBillZip () {
    return this.CustBillZip;
  }
  /** Change the field to not being actively set: CustBillZip (PAYMENT_PROFILE.cust_bill_zip)
   */
  public void unsetCustBillZip () {
    this._CustBillZipSet = false;
  }
  /** See if the field is actively set: CustBillZip (PAYMENT_PROFILE.cust_bill_zip)
   * @return boolean whether the field is actively set
   */
  public boolean issetCustBillZip () {
    return this._CustBillZipSet;
  }
  /** set the fields value: CustBillCountryCode (PAYMENT_PROFILE.cust_bill_country_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CustBillCountryCode") 
  public void setCustBillCountryCode (Integer value) throws ServiceException
  {
    this.CustBillCountryCode = value;
    this._CustBillCountryCodeSet = true;
  }

  /** Retrieves the CustBillCountryCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CustBillCountryCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustBillCountryCode field
   */
   public String getCustBillCountryCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBillCountryCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustBillCountryCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getCustBillCountryCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustBillCountryCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustBillCountryCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the CustBillCountryCode field from a formatted string
   *
   * @param _value the CustBillCountryCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CustBillCountryCode field
   */
   public void setCustBillCountryCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBillCountryCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCustBillCountryCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustBillCountryCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustBillCountryCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustBillCountryCodeFromFormattedString");
   }

  /** get the value of the field: CustBillCountryCode (PAYMENT_PROFILE.cust_bill_country_code)
   * @return Integer the value
   */
  public Integer getCustBillCountryCode () {
    return this.CustBillCountryCode;
  }
  /** Change the field to not being actively set: CustBillCountryCode (PAYMENT_PROFILE.cust_bill_country_code)
   */
  public void unsetCustBillCountryCode () {
    this._CustBillCountryCodeSet = false;
  }
  /** See if the field is actively set: CustBillCountryCode (PAYMENT_PROFILE.cust_bill_country_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCustBillCountryCode () {
    return this._CustBillCountryCodeSet;
  }
  /** set the fields value: DriverLicenseNum (PAYMENT_PROFILE.driver_license_num)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DriverLicenseNum") 
  public void setDriverLicenseNum (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "DriverLicenseNum", "setDriverLicenseNum");
    }
    this.DriverLicenseNum = value;
    this._DriverLicenseNumSet = true;
  }

  /** Retrieves the DriverLicenseNum field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DriverLicenseNum field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DriverLicenseNum field
   */
   public String getDriverLicenseNumAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDriverLicenseNumAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDriverLicenseNumAsFormattedString");
       return fmtMgr.formatString(this.getDriverLicenseNum());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DriverLicenseNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDriverLicenseNumAsFormattedString");
       throw x;
     }
   }
  /** Sets the DriverLicenseNum field from a formatted string
   *
   * @param _value the DriverLicenseNum field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DriverLicenseNum field
   */
   public void setDriverLicenseNumFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDriverLicenseNumFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDriverLicenseNum(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DriverLicenseNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDriverLicenseNumFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDriverLicenseNumFromFormattedString");
   }

  /** get the value of the field: DriverLicenseNum (PAYMENT_PROFILE.driver_license_num)
   * @return String the value
   */
  public String getDriverLicenseNum () {
    return this.DriverLicenseNum;
  }
  /** Change the field to not being actively set: DriverLicenseNum (PAYMENT_PROFILE.driver_license_num)
   */
  public void unsetDriverLicenseNum () {
    this._DriverLicenseNumSet = false;
  }
  /** See if the field is actively set: DriverLicenseNum (PAYMENT_PROFILE.driver_license_num)
   * @return boolean whether the field is actively set
   */
  public boolean issetDriverLicenseNum () {
    return this._DriverLicenseNumSet;
  }
  /** set the fields value: DriverLicenseState (PAYMENT_PROFILE.driver_license_state)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DriverLicenseState") 
  public void setDriverLicenseState (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 6))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "DriverLicenseState", "setDriverLicenseState");
    }
    this.DriverLicenseState = value;
    this._DriverLicenseStateSet = true;
  }

  /** Retrieves the DriverLicenseState field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DriverLicenseState field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DriverLicenseState field
   */
   public String getDriverLicenseStateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDriverLicenseStateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDriverLicenseStateAsFormattedString");
       return fmtMgr.formatString(this.getDriverLicenseState());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DriverLicenseState");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDriverLicenseStateAsFormattedString");
       throw x;
     }
   }
  /** Sets the DriverLicenseState field from a formatted string
   *
   * @param _value the DriverLicenseState field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DriverLicenseState field
   */
   public void setDriverLicenseStateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDriverLicenseStateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDriverLicenseState(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DriverLicenseState");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDriverLicenseStateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDriverLicenseStateFromFormattedString");
   }

  /** get the value of the field: DriverLicenseState (PAYMENT_PROFILE.driver_license_state)
   * @return String the value
   */
  public String getDriverLicenseState () {
    return this.DriverLicenseState;
  }
  /** Change the field to not being actively set: DriverLicenseState (PAYMENT_PROFILE.driver_license_state)
   */
  public void unsetDriverLicenseState () {
    this._DriverLicenseStateSet = false;
  }
  /** See if the field is actively set: DriverLicenseState (PAYMENT_PROFILE.driver_license_state)
   * @return boolean whether the field is actively set
   */
  public boolean issetDriverLicenseState () {
    return this._DriverLicenseStateSet;
  }
  /** set the fields value: CustCompanyName (PAYMENT_PROFILE.cust_company_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CustCompanyName") 
  public void setCustCompanyName (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 40))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CustCompanyName", "setCustCompanyName");
    }
    this.CustCompanyName = value;
    this._CustCompanyNameSet = true;
  }

  /** Retrieves the CustCompanyName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CustCompanyName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustCompanyName field
   */
   public String getCustCompanyNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustCompanyNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustCompanyNameAsFormattedString");
       return fmtMgr.formatString(this.getCustCompanyName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustCompanyName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustCompanyNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the CustCompanyName field from a formatted string
   *
   * @param _value the CustCompanyName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CustCompanyName field
   */
   public void setCustCompanyNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustCompanyNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCustCompanyName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustCompanyName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustCompanyNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustCompanyNameFromFormattedString");
   }

  /** get the value of the field: CustCompanyName (PAYMENT_PROFILE.cust_company_name)
   * @return String the value
   */
  public String getCustCompanyName () {
    return this.CustCompanyName;
  }
  /** Change the field to not being actively set: CustCompanyName (PAYMENT_PROFILE.cust_company_name)
   */
  public void unsetCustCompanyName () {
    this._CustCompanyNameSet = false;
  }
  /** See if the field is actively set: CustCompanyName (PAYMENT_PROFILE.cust_company_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetCustCompanyName () {
    return this._CustCompanyNameSet;
  }
  /** set the fields value: BillCompanyTaxId (PAYMENT_PROFILE.bill_company_tax_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillCompanyTaxId") 
  public void setBillCompanyTaxId (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BillCompanyTaxId", "setBillCompanyTaxId");
    }
    this.BillCompanyTaxId = value;
    this._BillCompanyTaxIdSet = true;
  }

  /** Retrieves the BillCompanyTaxId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillCompanyTaxId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillCompanyTaxId field
   */
   public String getBillCompanyTaxIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillCompanyTaxIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillCompanyTaxIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getBillCompanyTaxId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillCompanyTaxId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillCompanyTaxIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillCompanyTaxId field from a formatted string
   *
   * @param _value the BillCompanyTaxId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillCompanyTaxId field
   */
   public void setBillCompanyTaxIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillCompanyTaxIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillCompanyTaxId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillCompanyTaxId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillCompanyTaxIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillCompanyTaxIdFromFormattedString");
   }

  /** get the value of the field: BillCompanyTaxId (PAYMENT_PROFILE.bill_company_tax_id)
   * @return BigInteger the value
   */
  public BigInteger getBillCompanyTaxId () {
    return this.BillCompanyTaxId;
  }
  /** Change the field to not being actively set: BillCompanyTaxId (PAYMENT_PROFILE.bill_company_tax_id)
   */
  public void unsetBillCompanyTaxId () {
    this._BillCompanyTaxIdSet = false;
  }
  /** See if the field is actively set: BillCompanyTaxId (PAYMENT_PROFILE.bill_company_tax_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillCompanyTaxId () {
    return this._BillCompanyTaxIdSet;
  }
  /** set the fields value: CustPhone (PAYMENT_PROFILE.cust_phone)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CustPhone") 
  public void setCustPhone (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 15))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CustPhone", "setCustPhone");
    }
    this.CustPhone = value;
    this._CustPhoneSet = true;
  }

  /** Retrieves the CustPhone field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CustPhone field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustPhone field
   */
   public String getCustPhoneAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustPhoneAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustPhoneAsFormattedString");
       return fmtMgr.formatString(this.getCustPhone());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustPhone");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustPhoneAsFormattedString");
       throw x;
     }
   }
  /** Sets the CustPhone field from a formatted string
   *
   * @param _value the CustPhone field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CustPhone field
   */
   public void setCustPhoneFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustPhoneFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCustPhone(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustPhone");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustPhoneFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustPhoneFromFormattedString");
   }

  /** get the value of the field: CustPhone (PAYMENT_PROFILE.cust_phone)
   * @return String the value
   */
  public String getCustPhone () {
    return this.CustPhone;
  }
  /** Change the field to not being actively set: CustPhone (PAYMENT_PROFILE.cust_phone)
   */
  public void unsetCustPhone () {
    this._CustPhoneSet = false;
  }
  /** See if the field is actively set: CustPhone (PAYMENT_PROFILE.cust_phone)
   * @return boolean whether the field is actively set
   */
  public boolean issetCustPhone () {
    return this._CustPhoneSet;
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
  /** set the fields value: CyclicalBillUsed (PAYMENT_PROFILE.cyclical_bill_used)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CyclicalBillUsed") 
  public void setCyclicalBillUsed (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CyclicalBillUsed", "setCyclicalBillUsed");
    }
    this.CyclicalBillUsed = value;
    this._CyclicalBillUsedSet = true;
  }

  /** Retrieves the CyclicalBillUsed field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CyclicalBillUsed field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CyclicalBillUsed field
   */
   public String getCyclicalBillUsedAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCyclicalBillUsedAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCyclicalBillUsedAsFormattedString");
       return fmtMgr.formatBoolean(this.getCyclicalBillUsed());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CyclicalBillUsed");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCyclicalBillUsedAsFormattedString");
       throw x;
     }
   }
  /** Sets the CyclicalBillUsed field from a formatted string
   *
   * @param _value the CyclicalBillUsed field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CyclicalBillUsed field
   */
   public void setCyclicalBillUsedFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCyclicalBillUsedFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCyclicalBillUsed(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CyclicalBillUsed");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCyclicalBillUsedFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCyclicalBillUsedFromFormattedString");
   }

  /** get the value of the field: CyclicalBillUsed (PAYMENT_PROFILE.cyclical_bill_used)
   * @return Boolean the value
   */
  public Boolean getCyclicalBillUsed () {
    return this.CyclicalBillUsed;
  }
  /** Change the field to not being actively set: CyclicalBillUsed (PAYMENT_PROFILE.cyclical_bill_used)
   */
  public void unsetCyclicalBillUsed () {
    this._CyclicalBillUsedSet = false;
  }
  /** See if the field is actively set: CyclicalBillUsed (PAYMENT_PROFILE.cyclical_bill_used)
   * @return boolean whether the field is actively set
   */
  public boolean issetCyclicalBillUsed () {
    return this._CyclicalBillUsedSet;
  }
  /** set the fields value: IsDefault (PAYMENT_PROFILE.is_default)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsDefault") 
  public void setIsDefault (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsDefault", "setIsDefault");
    }
    this.IsDefault = value;
    this._IsDefaultSet = true;
  }

  /** Retrieves the IsDefault field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsDefault field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsDefault field
   */
   public String getIsDefaultAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsDefaultAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsDefaultAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsDefault());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsDefault");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsDefaultAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsDefault field from a formatted string
   *
   * @param _value the IsDefault field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsDefault field
   */
   public void setIsDefaultFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsDefaultFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsDefault(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsDefault");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsDefaultFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsDefaultFromFormattedString");
   }

  /** get the value of the field: IsDefault (PAYMENT_PROFILE.is_default)
   * @return Boolean the value
   */
  public Boolean getIsDefault () {
    return this.IsDefault;
  }
  /** Change the field to not being actively set: IsDefault (PAYMENT_PROFILE.is_default)
   */
  public void unsetIsDefault () {
    this._IsDefaultSet = false;
  }
  /** See if the field is actively set: IsDefault (PAYMENT_PROFILE.is_default)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsDefault () {
    return this._IsDefaultSet;
  }
  /** set the fields value: NonRealtimeOnly (PAYMENT_PROFILE.non_realtime_only)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("NonRealtimeOnly") 
  public void setNonRealtimeOnly (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "NonRealtimeOnly", "setNonRealtimeOnly");
    }
    this.NonRealtimeOnly = value;
    this._NonRealtimeOnlySet = true;
  }

  /** Retrieves the NonRealtimeOnly field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The NonRealtimeOnly field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NonRealtimeOnly field
   */
   public String getNonRealtimeOnlyAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNonRealtimeOnlyAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNonRealtimeOnlyAsFormattedString");
       return fmtMgr.formatBoolean(this.getNonRealtimeOnly());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NonRealtimeOnly");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getNonRealtimeOnlyAsFormattedString");
       throw x;
     }
   }
  /** Sets the NonRealtimeOnly field from a formatted string
   *
   * @param _value the NonRealtimeOnly field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NonRealtimeOnly field
   */
   public void setNonRealtimeOnlyFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNonRealtimeOnlyFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setNonRealtimeOnly(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NonRealtimeOnly");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setNonRealtimeOnlyFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNonRealtimeOnlyFromFormattedString");
   }

  /** get the value of the field: NonRealtimeOnly (PAYMENT_PROFILE.non_realtime_only)
   * @return Boolean the value
   */
  public Boolean getNonRealtimeOnly () {
    return this.NonRealtimeOnly;
  }
  /** Change the field to not being actively set: NonRealtimeOnly (PAYMENT_PROFILE.non_realtime_only)
   */
  public void unsetNonRealtimeOnly () {
    this._NonRealtimeOnlySet = false;
  }
  /** See if the field is actively set: NonRealtimeOnly (PAYMENT_PROFILE.non_realtime_only)
   * @return boolean whether the field is actively set
   */
  public boolean issetNonRealtimeOnly () {
    return this._NonRealtimeOnlySet;
  }
  /** set the fields value: IsTemporary (PAYMENT_PROFILE.is_temporary)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsTemporary") 
  public void setIsTemporary (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsTemporary", "setIsTemporary");
    }
    this.IsTemporary = value;
    this._IsTemporarySet = true;
  }

  /** Retrieves the IsTemporary field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsTemporary field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsTemporary field
   */
   public String getIsTemporaryAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsTemporaryAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsTemporaryAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsTemporary());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsTemporary");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsTemporaryAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsTemporary field from a formatted string
   *
   * @param _value the IsTemporary field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsTemporary field
   */
   public void setIsTemporaryFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsTemporaryFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsTemporary(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsTemporary");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsTemporaryFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsTemporaryFromFormattedString");
   }

  /** get the value of the field: IsTemporary (PAYMENT_PROFILE.is_temporary)
   * @return Boolean the value
   */
  public Boolean getIsTemporary () {
    return this.IsTemporary;
  }
  /** Change the field to not being actively set: IsTemporary (PAYMENT_PROFILE.is_temporary)
   */
  public void unsetIsTemporary () {
    this._IsTemporarySet = false;
  }
  /** See if the field is actively set: IsTemporary (PAYMENT_PROFILE.is_temporary)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsTemporary () {
    return this._IsTemporarySet;
  }
  /** set the fields value: MandateId (PAYMENT_PROFILE.mandate_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MandateId") 
  public void setMandateId (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 24))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "MandateId", "setMandateId");
    }
    this.MandateId = value;
    this._MandateIdSet = true;
  }

  /** Retrieves the MandateId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MandateId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MandateId field
   */
   public String getMandateIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMandateIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMandateIdAsFormattedString");
       return fmtMgr.formatString(this.getMandateId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MandateId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMandateIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the MandateId field from a formatted string
   *
   * @param _value the MandateId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MandateId field
   */
   public void setMandateIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMandateIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMandateId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MandateId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMandateIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMandateIdFromFormattedString");
   }

  /** get the value of the field: MandateId (PAYMENT_PROFILE.mandate_id)
   * @return String the value
   */
  public String getMandateId () {
    return this.MandateId;
  }
  /** Change the field to not being actively set: MandateId (PAYMENT_PROFILE.mandate_id)
   */
  public void unsetMandateId () {
    this._MandateIdSet = false;
  }
  /** See if the field is actively set: MandateId (PAYMENT_PROFILE.mandate_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetMandateId () {
    return this._MandateIdSet;
  }
  /** set the fields value: MandateSignDate (PAYMENT_PROFILE.mandate_sign_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MandateSignDate") 
  public void setMandateSignDate (Date value) throws ServiceException
  {
    this.MandateSignDate = value;
    this._MandateSignDateSet = true;
  }

  /** Retrieves the MandateSignDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MandateSignDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MandateSignDate field
   */
   public String getMandateSignDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMandateSignDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMandateSignDateAsFormattedString");
       return fmtMgr.formatDate(this.getMandateSignDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MandateSignDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMandateSignDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the MandateSignDate field from a formatted string
   *
   * @param _value the MandateSignDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MandateSignDate field
   */
   public void setMandateSignDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMandateSignDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMandateSignDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MandateSignDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMandateSignDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMandateSignDateFromFormattedString");
   }

  /**
   * Retrieves the MandateSignDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MandateSignDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the MandateSignDate field
   */
  public String getMandateSignDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMandateSignDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMandateSignDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getMandateSignDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MandateSignDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMandateSignDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the MandateSignDate field value from a formatted date/time string
   *
   * @param _value the MandateSignDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MandateSignDate field
   */
  public void setMandateSignDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMandateSignDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setMandateSignDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MandateSignDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMandateSignDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: MandateSignDate (PAYMENT_PROFILE.mandate_sign_date)
   * @return Date the value
   */
  public Date getMandateSignDate () {
    return this.MandateSignDate;
  }
  /** Change the field to not being actively set: MandateSignDate (PAYMENT_PROFILE.mandate_sign_date)
   */
  public void unsetMandateSignDate () {
    this._MandateSignDateSet = false;
  }
  /** See if the field is actively set: MandateSignDate (PAYMENT_PROFILE.mandate_sign_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetMandateSignDate () {
    return this._MandateSignDateSet;
  }
  /** set the fields value: MandateStatus (PAYMENT_PROFILE.mandate_status)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MandateStatus") 
  public void setMandateStatus (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "MandateStatus", "setMandateStatus");
    }
    this.MandateStatus = value;
    this._MandateStatusSet = true;
  }

  /** Retrieves the MandateStatus field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MandateStatus field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MandateStatus field
   */
   public String getMandateStatusAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMandateStatusAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMandateStatusAsFormattedString");
       return fmtMgr.formatString(this.getMandateStatus());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MandateStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMandateStatusAsFormattedString");
       throw x;
     }
   }
  /** Sets the MandateStatus field from a formatted string
   *
   * @param _value the MandateStatus field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MandateStatus field
   */
   public void setMandateStatusFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMandateStatusFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMandateStatus(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MandateStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMandateStatusFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMandateStatusFromFormattedString");
   }

  /** get the value of the field: MandateStatus (PAYMENT_PROFILE.mandate_status)
   * @return String the value
   */
  public String getMandateStatus () {
    return this.MandateStatus;
  }
  /** Change the field to not being actively set: MandateStatus (PAYMENT_PROFILE.mandate_status)
   */
  public void unsetMandateStatus () {
    this._MandateStatusSet = false;
  }
  /** See if the field is actively set: MandateStatus (PAYMENT_PROFILE.mandate_status)
   * @return boolean whether the field is actively set
   */
  public boolean issetMandateStatus () {
    return this._MandateStatusSet;
  }
  /** set the fields value: CustBankIban (PAYMENT_PROFILE.cust_bank_iban)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CustBankIban") 
  public void setCustBankIban (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 34))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CustBankIban", "setCustBankIban");
    }
    this.CustBankIban = value;
    this._CustBankIbanSet = true;
  }

  /** Retrieves the CustBankIban field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CustBankIban field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustBankIban field
   */
   public String getCustBankIbanAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBankIbanAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustBankIbanAsFormattedString");
       return fmtMgr.formatString(this.getCustBankIban());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustBankIban");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustBankIbanAsFormattedString");
       throw x;
     }
   }
  /** Sets the CustBankIban field from a formatted string
   *
   * @param _value the CustBankIban field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CustBankIban field
   */
   public void setCustBankIbanFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBankIbanFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCustBankIban(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustBankIban");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustBankIbanFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustBankIbanFromFormattedString");
   }

  /** get the value of the field: CustBankIban (PAYMENT_PROFILE.cust_bank_iban)
   * @return String the value
   */
  public String getCustBankIban () {
    return this.CustBankIban;
  }
  /** Change the field to not being actively set: CustBankIban (PAYMENT_PROFILE.cust_bank_iban)
   */
  public void unsetCustBankIban () {
    this._CustBankIbanSet = false;
  }
  /** See if the field is actively set: CustBankIban (PAYMENT_PROFILE.cust_bank_iban)
   * @return boolean whether the field is actively set
   */
  public boolean issetCustBankIban () {
    return this._CustBankIbanSet;
  }
  /** set the fields value: CustBankBic (PAYMENT_PROFILE.cust_bank_bic)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CustBankBic") 
  public void setCustBankBic (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 11))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CustBankBic", "setCustBankBic");
    }
    this.CustBankBic = value;
    this._CustBankBicSet = true;
  }

  /** Retrieves the CustBankBic field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CustBankBic field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustBankBic field
   */
   public String getCustBankBicAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBankBicAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustBankBicAsFormattedString");
       return fmtMgr.formatString(this.getCustBankBic());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustBankBic");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustBankBicAsFormattedString");
       throw x;
     }
   }
  /** Sets the CustBankBic field from a formatted string
   *
   * @param _value the CustBankBic field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CustBankBic field
   */
   public void setCustBankBicFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBankBicFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCustBankBic(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustBankBic");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustBankBicFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustBankBicFromFormattedString");
   }

  /** get the value of the field: CustBankBic (PAYMENT_PROFILE.cust_bank_bic)
   * @return String the value
   */
  public String getCustBankBic () {
    return this.CustBankBic;
  }
  /** Change the field to not being actively set: CustBankBic (PAYMENT_PROFILE.cust_bank_bic)
   */
  public void unsetCustBankBic () {
    this._CustBankBicSet = false;
  }
  /** See if the field is actively set: CustBankBic (PAYMENT_PROFILE.cust_bank_bic)
   * @return boolean whether the field is actively set
   */
  public boolean issetCustBankBic () {
    return this._CustBankBicSet;
  }
  /** set the fields value: DiffAcctOwnFlag (PAYMENT_PROFILE.diff_acct_own_flag)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DiffAcctOwnFlag") 
  public void setDiffAcctOwnFlag (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 1))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "DiffAcctOwnFlag", "setDiffAcctOwnFlag");
    }
    this.DiffAcctOwnFlag = value;
    this._DiffAcctOwnFlagSet = true;
  }

  /** Retrieves the DiffAcctOwnFlag field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DiffAcctOwnFlag field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DiffAcctOwnFlag field
   */
   public String getDiffAcctOwnFlagAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiffAcctOwnFlagAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDiffAcctOwnFlagAsFormattedString");
       return fmtMgr.formatString(this.getDiffAcctOwnFlag());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DiffAcctOwnFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDiffAcctOwnFlagAsFormattedString");
       throw x;
     }
   }
  /** Sets the DiffAcctOwnFlag field from a formatted string
   *
   * @param _value the DiffAcctOwnFlag field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DiffAcctOwnFlag field
   */
   public void setDiffAcctOwnFlagFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiffAcctOwnFlagFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDiffAcctOwnFlag(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DiffAcctOwnFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDiffAcctOwnFlagFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDiffAcctOwnFlagFromFormattedString");
   }

  /** get the value of the field: DiffAcctOwnFlag (PAYMENT_PROFILE.diff_acct_own_flag)
   * @return String the value
   */
  public String getDiffAcctOwnFlag () {
    return this.DiffAcctOwnFlag;
  }
  /** Change the field to not being actively set: DiffAcctOwnFlag (PAYMENT_PROFILE.diff_acct_own_flag)
   */
  public void unsetDiffAcctOwnFlag () {
    this._DiffAcctOwnFlagSet = false;
  }
  /** See if the field is actively set: DiffAcctOwnFlag (PAYMENT_PROFILE.diff_acct_own_flag)
   * @return boolean whether the field is actively set
   */
  public boolean issetDiffAcctOwnFlag () {
    return this._DiffAcctOwnFlagSet;
  }
  /** set the fields value: CustBankAccOwner (PAYMENT_PROFILE.cust_bank_acc_owner)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CustBankAccOwner") 
  public void setCustBankAccOwner (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 85))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CustBankAccOwner", "setCustBankAccOwner");
    }
    this.CustBankAccOwner = value;
    this._CustBankAccOwnerSet = true;
  }

  /** Retrieves the CustBankAccOwner field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CustBankAccOwner field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustBankAccOwner field
   */
   public String getCustBankAccOwnerAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBankAccOwnerAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustBankAccOwnerAsFormattedString");
       return fmtMgr.formatString(this.getCustBankAccOwner());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustBankAccOwner");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustBankAccOwnerAsFormattedString");
       throw x;
     }
   }
  /** Sets the CustBankAccOwner field from a formatted string
   *
   * @param _value the CustBankAccOwner field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CustBankAccOwner field
   */
   public void setCustBankAccOwnerFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBankAccOwnerFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCustBankAccOwner(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustBankAccOwner");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustBankAccOwnerFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustBankAccOwnerFromFormattedString");
   }

  /** get the value of the field: CustBankAccOwner (PAYMENT_PROFILE.cust_bank_acc_owner)
   * @return String the value
   */
  public String getCustBankAccOwner () {
    return this.CustBankAccOwner;
  }
  /** Change the field to not being actively set: CustBankAccOwner (PAYMENT_PROFILE.cust_bank_acc_owner)
   */
  public void unsetCustBankAccOwner () {
    this._CustBankAccOwnerSet = false;
  }
  /** See if the field is actively set: CustBankAccOwner (PAYMENT_PROFILE.cust_bank_acc_owner)
   * @return boolean whether the field is actively set
   */
  public boolean issetCustBankAccOwner () {
    return this._CustBankAccOwnerSet;
  }
  /** set the fields value: SequenceType (PAYMENT_PROFILE.sequence_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SequenceType") 
  public void setSequenceType (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 4))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "SequenceType", "setSequenceType");
    }
    this.SequenceType = value;
    this._SequenceTypeSet = true;
  }

  /** Retrieves the SequenceType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SequenceType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SequenceType field
   */
   public String getSequenceTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSequenceTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSequenceTypeAsFormattedString");
       return fmtMgr.formatString(this.getSequenceType());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SequenceType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSequenceTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the SequenceType field from a formatted string
   *
   * @param _value the SequenceType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SequenceType field
   */
   public void setSequenceTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSequenceTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSequenceType(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SequenceType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSequenceTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSequenceTypeFromFormattedString");
   }

  /** get the value of the field: SequenceType (PAYMENT_PROFILE.sequence_type)
   * @return String the value
   */
  public String getSequenceType () {
    return this.SequenceType;
  }
  /** Change the field to not being actively set: SequenceType (PAYMENT_PROFILE.sequence_type)
   */
  public void unsetSequenceType () {
    this._SequenceTypeSet = false;
  }
  /** See if the field is actively set: SequenceType (PAYMENT_PROFILE.sequence_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetSequenceType () {
    return this._SequenceTypeSet;
  }
  /** set the fields value: CustBankIbanHist (PAYMENT_PROFILE.cust_bank_iban_hist)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CustBankIbanHist") 
  public void setCustBankIbanHist (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 34))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CustBankIbanHist", "setCustBankIbanHist");
    }
    this.CustBankIbanHist = value;
    this._CustBankIbanHistSet = true;
  }

  /** Retrieves the CustBankIbanHist field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CustBankIbanHist field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustBankIbanHist field
   */
   public String getCustBankIbanHistAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBankIbanHistAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustBankIbanHistAsFormattedString");
       return fmtMgr.formatString(this.getCustBankIbanHist());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustBankIbanHist");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustBankIbanHistAsFormattedString");
       throw x;
     }
   }
  /** Sets the CustBankIbanHist field from a formatted string
   *
   * @param _value the CustBankIbanHist field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CustBankIbanHist field
   */
   public void setCustBankIbanHistFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBankIbanHistFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCustBankIbanHist(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustBankIbanHist");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustBankIbanHistFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustBankIbanHistFromFormattedString");
   }

  /** get the value of the field: CustBankIbanHist (PAYMENT_PROFILE.cust_bank_iban_hist)
   * @return String the value
   */
  public String getCustBankIbanHist () {
    return this.CustBankIbanHist;
  }
  /** Change the field to not being actively set: CustBankIbanHist (PAYMENT_PROFILE.cust_bank_iban_hist)
   */
  public void unsetCustBankIbanHist () {
    this._CustBankIbanHistSet = false;
  }
  /** See if the field is actively set: CustBankIbanHist (PAYMENT_PROFILE.cust_bank_iban_hist)
   * @return boolean whether the field is actively set
   */
  public boolean issetCustBankIbanHist () {
    return this._CustBankIbanHistSet;
  }
  /** set the fields value: CustBankBicHist (PAYMENT_PROFILE.cust_bank_bic_hist)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CustBankBicHist") 
  public void setCustBankBicHist (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 11))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CustBankBicHist", "setCustBankBicHist");
    }
    this.CustBankBicHist = value;
    this._CustBankBicHistSet = true;
  }

  /** Retrieves the CustBankBicHist field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CustBankBicHist field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustBankBicHist field
   */
   public String getCustBankBicHistAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBankBicHistAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustBankBicHistAsFormattedString");
       return fmtMgr.formatString(this.getCustBankBicHist());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustBankBicHist");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustBankBicHistAsFormattedString");
       throw x;
     }
   }
  /** Sets the CustBankBicHist field from a formatted string
   *
   * @param _value the CustBankBicHist field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CustBankBicHist field
   */
   public void setCustBankBicHistFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBankBicHistFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCustBankBicHist(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustBankBicHist");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustBankBicHistFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustBankBicHistFromFormattedString");
   }

  /** get the value of the field: CustBankBicHist (PAYMENT_PROFILE.cust_bank_bic_hist)
   * @return String the value
   */
  public String getCustBankBicHist () {
    return this.CustBankBicHist;
  }
  /** Change the field to not being actively set: CustBankBicHist (PAYMENT_PROFILE.cust_bank_bic_hist)
   */
  public void unsetCustBankBicHist () {
    this._CustBankBicHistSet = false;
  }
  /** See if the field is actively set: CustBankBicHist (PAYMENT_PROFILE.cust_bank_bic_hist)
   * @return boolean whether the field is actively set
   */
  public boolean issetCustBankBicHist () {
    return this._CustBankBicHistSet;
  }
  /** set the fields value: MandateReset (PAYMENT_PROFILE.mandate_reset)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MandateReset") 
  public void setMandateReset (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 1))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "MandateReset", "setMandateReset");
    }
    this.MandateReset = value;
    this._MandateResetSet = true;
  }

  /** Retrieves the MandateReset field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MandateReset field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MandateReset field
   */
   public String getMandateResetAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMandateResetAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMandateResetAsFormattedString");
       return fmtMgr.formatString(this.getMandateReset());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MandateReset");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMandateResetAsFormattedString");
       throw x;
     }
   }
  /** Sets the MandateReset field from a formatted string
   *
   * @param _value the MandateReset field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MandateReset field
   */
   public void setMandateResetFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMandateResetFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMandateReset(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MandateReset");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMandateResetFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMandateResetFromFormattedString");
   }

  /** get the value of the field: MandateReset (PAYMENT_PROFILE.mandate_reset)
   * @return String the value
   */
  public String getMandateReset () {
    return this.MandateReset;
  }
  /** Change the field to not being actively set: MandateReset (PAYMENT_PROFILE.mandate_reset)
   */
  public void unsetMandateReset () {
    this._MandateResetSet = false;
  }
  /** See if the field is actively set: MandateReset (PAYMENT_PROFILE.mandate_reset)
   * @return boolean whether the field is actively set
   */
  public boolean issetMandateReset () {
    return this._MandateResetSet;
  }
  /** set the fields value: EpgSubscriptionId (PAYMENT_PROFILE.epg_subscription_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("EpgSubscriptionId") 
  public void setEpgSubscriptionId (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "EpgSubscriptionId", "setEpgSubscriptionId");
    }
    this.EpgSubscriptionId = value;
    this._EpgSubscriptionIdSet = true;
  }

  /** Retrieves the EpgSubscriptionId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The EpgSubscriptionId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EpgSubscriptionId field
   */
   public String getEpgSubscriptionIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEpgSubscriptionIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEpgSubscriptionIdAsFormattedString");
       return fmtMgr.formatString(this.getEpgSubscriptionId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EpgSubscriptionId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getEpgSubscriptionIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the EpgSubscriptionId field from a formatted string
   *
   * @param _value the EpgSubscriptionId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EpgSubscriptionId field
   */
   public void setEpgSubscriptionIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEpgSubscriptionIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setEpgSubscriptionId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EpgSubscriptionId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setEpgSubscriptionIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEpgSubscriptionIdFromFormattedString");
   }

  /** get the value of the field: EpgSubscriptionId (PAYMENT_PROFILE.epg_subscription_id)
   * @return String the value
   */
  public String getEpgSubscriptionId () {
    return this.EpgSubscriptionId;
  }
  /** Change the field to not being actively set: EpgSubscriptionId (PAYMENT_PROFILE.epg_subscription_id)
   */
  public void unsetEpgSubscriptionId () {
    this._EpgSubscriptionIdSet = false;
  }
  /** See if the field is actively set: EpgSubscriptionId (PAYMENT_PROFILE.epg_subscription_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetEpgSubscriptionId () {
    return this._EpgSubscriptionIdSet;
  }
  /** set the fields value: ReferenceNumber (PAYMENT_PROFILE.reference_number)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ReferenceNumber") 
  public void setReferenceNumber (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 50))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ReferenceNumber", "setReferenceNumber");
    }
    this.ReferenceNumber = value;
    this._ReferenceNumberSet = true;
  }

  /** Retrieves the ReferenceNumber field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ReferenceNumber field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ReferenceNumber field
   */
   public String getReferenceNumberAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getReferenceNumberAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getReferenceNumberAsFormattedString");
       return fmtMgr.formatString(this.getReferenceNumber());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ReferenceNumber");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getReferenceNumberAsFormattedString");
       throw x;
     }
   }
  /** Sets the ReferenceNumber field from a formatted string
   *
   * @param _value the ReferenceNumber field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ReferenceNumber field
   */
   public void setReferenceNumberFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getReferenceNumberFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setReferenceNumber(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ReferenceNumber");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setReferenceNumberFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setReferenceNumberFromFormattedString");
   }

  /** get the value of the field: ReferenceNumber (PAYMENT_PROFILE.reference_number)
   * @return String the value
   */
  public String getReferenceNumber () {
    return this.ReferenceNumber;
  }
  /** Change the field to not being actively set: ReferenceNumber (PAYMENT_PROFILE.reference_number)
   */
  public void unsetReferenceNumber () {
    this._ReferenceNumberSet = false;
  }
  /** See if the field is actively set: ReferenceNumber (PAYMENT_PROFILE.reference_number)
   * @return boolean whether the field is actively set
   */
  public boolean issetReferenceNumber () {
    return this._ReferenceNumberSet;
  }
  /** set the fields value: TransactionUuid (PAYMENT_PROFILE.transaction_uuid)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TransactionUuid") 
  public void setTransactionUuid (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 50))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "TransactionUuid", "setTransactionUuid");
    }
    this.TransactionUuid = value;
    this._TransactionUuidSet = true;
  }

  /** Retrieves the TransactionUuid field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TransactionUuid field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransactionUuid field
   */
   public String getTransactionUuidAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransactionUuidAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransactionUuidAsFormattedString");
       return fmtMgr.formatString(this.getTransactionUuid());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransactionUuid");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransactionUuidAsFormattedString");
       throw x;
     }
   }
  /** Sets the TransactionUuid field from a formatted string
   *
   * @param _value the TransactionUuid field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TransactionUuid field
   */
   public void setTransactionUuidFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransactionUuidFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTransactionUuid(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransactionUuid");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransactionUuidFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransactionUuidFromFormattedString");
   }

  /** get the value of the field: TransactionUuid (PAYMENT_PROFILE.transaction_uuid)
   * @return String the value
   */
  public String getTransactionUuid () {
    return this.TransactionUuid;
  }
  /** Change the field to not being actively set: TransactionUuid (PAYMENT_PROFILE.transaction_uuid)
   */
  public void unsetTransactionUuid () {
    this._TransactionUuidSet = false;
  }
  /** See if the field is actively set: TransactionUuid (PAYMENT_PROFILE.transaction_uuid)
   * @return boolean whether the field is actively set
   */
  public boolean issetTransactionUuid () {
    return this._TransactionUuidSet;
  }
  /** set the fields value: ProfileCreationTime (PAYMENT_PROFILE.profile_creation_time)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ProfileCreationTime") 
  public void setProfileCreationTime (Date value) throws ServiceException
  {
    this.ProfileCreationTime = value;
    this._ProfileCreationTimeSet = true;
  }

  /** Retrieves the ProfileCreationTime field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ProfileCreationTime field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProfileCreationTime field
   */
   public String getProfileCreationTimeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProfileCreationTimeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProfileCreationTimeAsFormattedString");
       return fmtMgr.formatDate(this.getProfileCreationTime(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProfileCreationTime");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getProfileCreationTimeAsFormattedString");
       throw x;
     }
   }
  /** Sets the ProfileCreationTime field from a formatted string
   *
   * @param _value the ProfileCreationTime field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ProfileCreationTime field
   */
   public void setProfileCreationTimeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProfileCreationTimeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setProfileCreationTime(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProfileCreationTime");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setProfileCreationTimeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProfileCreationTimeFromFormattedString");
   }

  /**
   * Retrieves the ProfileCreationTime field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ProfileCreationTime field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProfileCreationTime field
   */
  public String getProfileCreationTimeAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProfileCreationTimeAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProfileCreationTimeAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getProfileCreationTime(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProfileCreationTime");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getProfileCreationTimeAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ProfileCreationTime field value from a formatted date/time string
   *
   * @param _value the ProfileCreationTime field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ProfileCreationTime field
   */
  public void setProfileCreationTimeFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setProfileCreationTimeFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setProfileCreationTime(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProfileCreationTime");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setProfileCreationTimeFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: ProfileCreationTime (PAYMENT_PROFILE.profile_creation_time)
   * @return Date the value
   */
  public Date getProfileCreationTime () {
    return this.ProfileCreationTime;
  }
  /** Change the field to not being actively set: ProfileCreationTime (PAYMENT_PROFILE.profile_creation_time)
   */
  public void unsetProfileCreationTime () {
    this._ProfileCreationTimeSet = false;
  }
  /** See if the field is actively set: ProfileCreationTime (PAYMENT_PROFILE.profile_creation_time)
   * @return boolean whether the field is actively set
   */
  public boolean issetProfileCreationTime () {
    return this._ProfileCreationTimeSet;
  }
  /** set the fields value: PaymentMerchantId (PAYMENT_PROFILE.payment_merchant_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PaymentMerchantId") 
  public void setPaymentMerchantId (Integer value) throws ServiceException
  {
    this.PaymentMerchantId = value;
    this._PaymentMerchantIdSet = true;
  }

  /** Retrieves the PaymentMerchantId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PaymentMerchantId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PaymentMerchantId field
   */
   public String getPaymentMerchantIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentMerchantIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentMerchantIdAsFormattedString");
       return fmtMgr.formatNumber(this.getPaymentMerchantId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PaymentMerchantId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPaymentMerchantIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the PaymentMerchantId field from a formatted string
   *
   * @param _value the PaymentMerchantId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PaymentMerchantId field
   */
   public void setPaymentMerchantIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentMerchantIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPaymentMerchantId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PaymentMerchantId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPaymentMerchantIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPaymentMerchantIdFromFormattedString");
   }

  /** get the value of the field: PaymentMerchantId (PAYMENT_PROFILE.payment_merchant_id)
   * @return Integer the value
   */
  public Integer getPaymentMerchantId () {
    return this.PaymentMerchantId;
  }
  /** Change the field to not being actively set: PaymentMerchantId (PAYMENT_PROFILE.payment_merchant_id)
   */
  public void unsetPaymentMerchantId () {
    this._PaymentMerchantIdSet = false;
  }
  /** See if the field is actively set: PaymentMerchantId (PAYMENT_PROFILE.payment_merchant_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetPaymentMerchantId () {
    return this._PaymentMerchantIdSet;
  }
  public String toString() {
    return PrepaymentObjectHelper.toMap(this, null).toString();
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
  /** CUSTOMER_ID_ACCT_MAP.external_id field */
    if(!nonNullOnly || (AccountExternalId != null))  _AccountExternalIdSet = flag;
  /** CUSTOMER_ID_ACCT_MAP.external_id_type field */
    if(!nonNullOnly || (AccountExternalIdType != null))  _AccountExternalIdTypeSet = flag;
  /** PAYMENT_TRANS.epg_transaction_id field */
    if(!nonNullOnly || (EpgTransactionId != null))  _EpgTransactionIdSet = flag;
  /** PREPAYMENT.account_no field */
    if(!nonNullOnly || (AccountInternalId != null))  _AccountInternalIdSet = flag;
  /** PREPAYMENT.undesignated_amount field */
    if(!nonNullOnly || (UndesignatedAmount != null))  _UndesignatedAmountSet = flag;
  /** PREPAYMENT.tax_rate field */
    if(!nonNullOnly || (TaxRate != null))  _TaxRateSet = flag;
  /** PREPAYMENT.designated_tax_amount field */
    if(!nonNullOnly || (DesignatedTaxAmount != null))  _DesignatedTaxAmountSet = flag;
  /** PREPAYMENT.tax_point field */
    if(!nonNullOnly || (TaxPoint != null))  _TaxPointSet = flag;
  /** PREPAYMENT.tax_pkg_inst_id field */
    if(!nonNullOnly || (TaxPkgInstId != null))  _TaxPkgInstIdSet = flag;
  /** PREPAYMENT.no_bill field */
    if(!nonNullOnly || (NoBill != null))  _NoBillSet = flag;
  /** PREPAYMENT.bill_ref_no field */
    if(!nonNullOnly || (BillRefNo != null))  _BillRefNoSet = flag;
  /** PREPAYMENT.bill_ref_resets field */
    if(!nonNullOnly || (BillRefResets != null))  _BillRefResetsSet = flag;
  /** PREPAYMENT.trans_dt field */
    if(!nonNullOnly || (TransDt != null))  _TransDtSet = flag;
  /** PREPAYMENT.tax_type_code field */
    if(!nonNullOnly || (TaxTypeCode != null))  _TaxTypeCodeSet = flag;
  /** PREPAYMENT.open_item_id field */
    if(!nonNullOnly || (OpenItemId != null))  _OpenItemIdSet = flag;
  /** PREPAYMENT.source_type field */
    if(!nonNullOnly || (SourceType != null))  _SourceTypeSet = flag;
  /** PREPAYMENT.source_id field */
    if(!nonNullOnly || (SourceId != null))  _SourceIdSet = flag;
  /** PREPAYMENT.source_id_serv field */
    if(!nonNullOnly || (SourceIdServ != null))  _SourceIdServSet = flag;
  /** PREPAYMENT.discount_id field */
    if(!nonNullOnly || (DiscountId != null))  _DiscountIdSet = flag;
  /** PREPAYMENT.allocated_tax field */
    if(!nonNullOnly || (AllocatedTax != null))  _AllocatedTaxSet = flag;
  /** PREPAYMENT.allocated_undesignated field */
    if(!nonNullOnly || (AllocatedUndesignated != null))  _AllocatedUndesignatedSet = flag;
  /** PREPAYMENT.micr_bank_id field */
    if(!nonNullOnly || (MicrBankId != null))  _MicrBankIdSet = flag;
  /** PREPAYMENT.micr_dda_num field */
    if(!nonNullOnly || (MicrDdaNum != null))  _MicrDdaNumSet = flag;
  /** PREPAYMENT.micr_check_num field */
    if(!nonNullOnly || (MicrCheckNum != null))  _MicrCheckNumSet = flag;
  /** PREPAYMENT.chg_who field */
    if(!nonNullOnly || (ChgWho != null))  _ChgWhoSet = flag;
  /** PREPAYMENT.chg_date field */
    if(!nonNullOnly || (ChgDate != null))  _ChgDateSet = flag;
  /** PREPAYMENT.status field */
    if(!nonNullOnly || (Status != null))  _StatusSet = flag;
  /** PREPAYMENT.implied_decimal field */
    if(!nonNullOnly || (ImpliedDecimal != null))  _ImpliedDecimalSet = flag;
  /** PREPAYMENT.currency_code field */
    if(!nonNullOnly || (CurrencyCode != null))  _CurrencyCodeSet = flag;
  /** PREPAYMENT.pay_method field */
    if(!nonNullOnly || (PayMethod != null))  _PayMethodSet = flag;
  /** PREPAYMENT.realtime_indicator field */
    if(!nonNullOnly || (RealtimeIndicator != null))  _RealtimeIndicatorSet = flag;
  /** PREPAYMENT.payment_profile_id field */
    if(!nonNullOnly || (PaymentProfileId != null))  _PaymentProfileIdSet = flag;
  /** PAYMENT_PROFILE.cust_bank_sort_code field */
    if(!nonNullOnly || (CustBankSortCode != null))  _CustBankSortCodeSet = flag;
  /** PAYMENT_PROFILE.cust_bank_acc_num field */
    if(!nonNullOnly || (CustBankAccNum != null))  _CustBankAccNumSet = flag;
  /** PAYMENT_PROFILE.alt_bank_acc_num field */
    if(!nonNullOnly || (AltBankAccNum != null))  _AltBankAccNumSet = flag;
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
  /** PAYMENT_PROFILE.card_account field */
    if(!nonNullOnly || (CardAccount != null))  _CardAccountSet = flag;
  /** PAYMENT_PROFILE.card_carrier field */
    if(!nonNullOnly || (CardCarrier != null))  _CardCarrierSet = flag;
  /** PAYMENT_PROFILE.card_expire field */
    if(!nonNullOnly || (CardExpire != null))  _CardExpireSet = flag;
  /** PAYMENT_PROFILE.avs_address_id field */
    if(!nonNullOnly || (AvsAddressId != null))  _AvsAddressIdSet = flag;
  /** PAYMENT_PROFILE.avs_response_code field */
    if(!nonNullOnly || (AvsResponseCode != null))  _AvsResponseCodeSet = flag;
  /** PAYMENT_PROFILE.trans_flag field */
    if(!nonNullOnly || (TransFlag != null))  _TransFlagSet = flag;
  /** PAYMENT_PROFILE.cust_bank_acct_type field */
    if(!nonNullOnly || (CustBankAcctType != null))  _CustBankAcctTypeSet = flag;
  /** PAYMENT_PROFILE.cust_email field */
    if(!nonNullOnly || (CustEmail != null))  _CustEmailSet = flag;
  /** PAYMENT_PROFILE.cust_bill_address field */
    if(!nonNullOnly || (CustBillAddress != null))  _CustBillAddressSet = flag;
  /** PAYMENT_PROFILE.cust_bill_city field */
    if(!nonNullOnly || (CustBillCity != null))  _CustBillCitySet = flag;
  /** PAYMENT_PROFILE.cust_bill_state field */
    if(!nonNullOnly || (CustBillState != null))  _CustBillStateSet = flag;
  /** PAYMENT_PROFILE.cust_bill_zip field */
    if(!nonNullOnly || (CustBillZip != null))  _CustBillZipSet = flag;
  /** PAYMENT_PROFILE.cust_bill_country_code field */
    if(!nonNullOnly || (CustBillCountryCode != null))  _CustBillCountryCodeSet = flag;
  /** PAYMENT_PROFILE.driver_license_num field */
    if(!nonNullOnly || (DriverLicenseNum != null))  _DriverLicenseNumSet = flag;
  /** PAYMENT_PROFILE.driver_license_state field */
    if(!nonNullOnly || (DriverLicenseState != null))  _DriverLicenseStateSet = flag;
  /** PAYMENT_PROFILE.cust_company_name field */
    if(!nonNullOnly || (CustCompanyName != null))  _CustCompanyNameSet = flag;
  /** PAYMENT_PROFILE.bill_company_tax_id field */
    if(!nonNullOnly || (BillCompanyTaxId != null))  _BillCompanyTaxIdSet = flag;
  /** PAYMENT_PROFILE.cust_phone field */
    if(!nonNullOnly || (CustPhone != null))  _CustPhoneSet = flag;
  /** PAYMENT_PROFILE.ownr_fname field */
    if(!nonNullOnly || (OwnrFname != null))  _OwnrFnameSet = flag;
  /** PAYMENT_PROFILE.ownr_lname field */
    if(!nonNullOnly || (OwnrLname != null))  _OwnrLnameSet = flag;
  /** PAYMENT_PROFILE.cyclical_bill_used field */
    if(!nonNullOnly || (CyclicalBillUsed != null))  _CyclicalBillUsedSet = flag;
  /** PAYMENT_PROFILE.is_default field */
    if(!nonNullOnly || (IsDefault != null))  _IsDefaultSet = flag;
  /** PAYMENT_PROFILE.non_realtime_only field */
    if(!nonNullOnly || (NonRealtimeOnly != null))  _NonRealtimeOnlySet = flag;
  /** PAYMENT_PROFILE.is_temporary field */
    if(!nonNullOnly || (IsTemporary != null))  _IsTemporarySet = flag;
  /** PAYMENT_PROFILE.mandate_id field */
    if(!nonNullOnly || (MandateId != null))  _MandateIdSet = flag;
  /** PAYMENT_PROFILE.mandate_sign_date field */
    if(!nonNullOnly || (MandateSignDate != null))  _MandateSignDateSet = flag;
  /** PAYMENT_PROFILE.mandate_status field */
    if(!nonNullOnly || (MandateStatus != null))  _MandateStatusSet = flag;
  /** PAYMENT_PROFILE.cust_bank_iban field */
    if(!nonNullOnly || (CustBankIban != null))  _CustBankIbanSet = flag;
  /** PAYMENT_PROFILE.cust_bank_bic field */
    if(!nonNullOnly || (CustBankBic != null))  _CustBankBicSet = flag;
  /** PAYMENT_PROFILE.diff_acct_own_flag field */
    if(!nonNullOnly || (DiffAcctOwnFlag != null))  _DiffAcctOwnFlagSet = flag;
  /** PAYMENT_PROFILE.cust_bank_acc_owner field */
    if(!nonNullOnly || (CustBankAccOwner != null))  _CustBankAccOwnerSet = flag;
  /** PAYMENT_PROFILE.sequence_type field */
    if(!nonNullOnly || (SequenceType != null))  _SequenceTypeSet = flag;
  /** PAYMENT_PROFILE.cust_bank_iban_hist field */
    if(!nonNullOnly || (CustBankIbanHist != null))  _CustBankIbanHistSet = flag;
  /** PAYMENT_PROFILE.cust_bank_bic_hist field */
    if(!nonNullOnly || (CustBankBicHist != null))  _CustBankBicHistSet = flag;
  /** PAYMENT_PROFILE.mandate_reset field */
    if(!nonNullOnly || (MandateReset != null))  _MandateResetSet = flag;
  /** PAYMENT_PROFILE.epg_subscription_id field */
    if(!nonNullOnly || (EpgSubscriptionId != null))  _EpgSubscriptionIdSet = flag;
  /** PAYMENT_PROFILE.reference_number field */
    if(!nonNullOnly || (ReferenceNumber != null))  _ReferenceNumberSet = flag;
  /** PAYMENT_PROFILE.transaction_uuid field */
    if(!nonNullOnly || (TransactionUuid != null))  _TransactionUuidSet = flag;
  /** PAYMENT_PROFILE.profile_creation_time field */
    if(!nonNullOnly || (ProfileCreationTime != null))  _ProfileCreationTimeSet = flag;
  /** PAYMENT_PROFILE.payment_merchant_id field */
    if(!nonNullOnly || (PaymentMerchantId != null))  _PaymentMerchantIdSet = flag;
  }
}
