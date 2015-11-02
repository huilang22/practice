/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: InvoiceDetailObjectData.java
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
  
/** InvoiceDetailObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class InvoiceDetailObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public InvoiceDetailObjectKeyData Key = null;
  /** BILL_INVOICE.currency_code field */
  public    Integer CurrencyCode  = null;
  protected boolean _CurrencyCodeSet = false;
  /** BILL_INVOICE.account_no field */
  public    Integer AccountInternalId  = null;
  protected boolean _AccountInternalIdSet = false;
  /** BILL_INVOICE.statement_date field */
  public    Date StatementDate  = null;
  protected boolean _StatementDateSet = false;
  /** BILL_INVOICE.bill_sequence_num field */
  public    Integer BillSequenceNum  = null;
  protected boolean _BillSequenceNumSet = false;
  /** CUSTOMER_ID_EQUIP_MAP_VIEW.external_id field */
  public    String ServiceExternalId  = null;
  protected boolean _ServiceExternalIdSet = false;
  /** CUSTOMER_ID_EQUIP_MAP_VIEW.external_id_type field */
  public    Integer ServiceExternalIdType  = null;
  protected boolean _ServiceExternalIdTypeSet = false;
  /** CUSTOMER_ID_ACCT_MAP.external_id field */
  public    String AccountExternalId  = null;
  protected boolean _AccountExternalIdSet = false;
  /** CUSTOMER_ID_ACCT_MAP.external_id_type field */
  public    Integer AccountExternalIdType  = null;
  protected boolean _AccountExternalIdTypeSet = false;
  /** ServerId field */
  public    Integer ServerId  = null;
  protected boolean _ServerIdSet = false;
  /** BILL_INVOICE_DETAIL.process_num field */
  public    String ProcessNum  = null;
  protected boolean _ProcessNumSet = false;
  /** BILL_INVOICE_DETAIL.package_id field */
  public    Integer PackageId  = null;
  protected boolean _PackageIdSet = false;
  /** BILL_INVOICE_DETAIL.component_id field */
  public    Integer ComponentId  = null;
  protected boolean _ComponentIdSet = false;
  /** BILL_INVOICE_DETAIL.type_code field */
  public    Integer TypeCode  = null;
  protected boolean _TypeCodeSet = false;
  /** BILL_INVOICE_DETAIL.subtype_code field */
  public    Integer SubtypeCode  = null;
  protected boolean _SubtypeCodeSet = false;
  /** BILL_INVOICE_DETAIL.tracking_id field */
  public    Integer TrackingId  = null;
  protected boolean _TrackingIdSet = false;
  /** BILL_INVOICE_DETAIL.tracking_id_serv field */
  public    Integer TrackingIdServ  = null;
  protected boolean _TrackingIdServSet = false;
  /** BILL_INVOICE_DETAIL.tracking_date field */
  public    Date TrackingDate  = null;
  protected boolean _TrackingDateSet = false;
  /** BILL_INVOICE_DETAIL.prep_sequence field */
  public    Integer PrepSequence  = null;
  protected boolean _PrepSequenceSet = false;
  /** BILL_INVOICE_DETAIL.prorate_code field */
  public    Integer ProrateCode  = null;
  protected boolean _ProrateCodeSet = false;
  /** BILL_INVOICE_DETAIL.billing_level field */
  public    Integer BillingLevel  = null;
  protected boolean _BillingLevelSet = false;
  /** BILL_INVOICE_DETAIL.billing_category field */
  public    Integer BillingCategory  = null;
  protected boolean _BillingCategorySet = false;
  /** BILL_INVOICE_DETAIL.amount field */
  public    BigInteger Amount  = null;
  protected boolean _AmountSet = false;
  /** BILL_INVOICE_DETAIL.rated_amount field */
  public    BigInteger RatedAmount  = null;
  protected boolean _RatedAmountSet = false;
  /** BILL_INVOICE_DETAIL.secondary_amount field */
  public    BigInteger SecondaryAmount  = null;
  protected boolean _SecondaryAmountSet = false;
  /** BILL_INVOICE_DETAIL.rate_currency_code field */
  public    Integer RateCurrencyCode  = null;
  protected boolean _RateCurrencyCodeSet = false;
  /** BILL_INVOICE_DETAIL.units field */
  public    BigInteger Units  = null;
  protected boolean _UnitsSet = false;
  /** BILL_INVOICE_DETAIL.tax field */
  public    BigInteger Tax  = null;
  protected boolean _TaxSet = false;
  /** BILL_INVOICE_DETAIL.tax_rate field */
  public    Integer TaxRate  = null;
  protected boolean _TaxRateSet = false;
  /** BILL_INVOICE_DETAIL.tax_pkg_inst_id field */
  public    Integer TaxPkgInstId  = null;
  protected boolean _TaxPkgInstIdSet = false;
  /** BILL_INVOICE_DETAIL.discount field */
  public    BigInteger Discount  = null;
  protected boolean _DiscountSet = false;
  /** BILL_INVOICE_DETAIL.discount_id field */
  public    Integer DiscountId  = null;
  protected boolean _DiscountIdSet = false;
  /** BILL_INVOICE_DETAIL.trans_date field */
  public    Date TransDate  = null;
  protected boolean _TransDateSet = false;
  /** BILL_INVOICE_DETAIL.provider_id field */
  public    Integer ProviderId  = null;
  protected boolean _ProviderIdSet = false;
  /** BILL_INVOICE_DETAIL.element_id field */
  public    Integer ElementId  = null;
  protected boolean _ElementIdSet = false;
  /** BILL_INVOICE_DETAIL.product_line_id field */
  public    Integer ProductLineId  = null;
  protected boolean _ProductLineIdSet = false;
  /** BILL_INVOICE_DETAIL.description_code field */
  public    Integer DescriptionCode  = null;
  protected boolean _DescriptionCodeSet = false;
  /** BILL_INVOICE_DETAIL.rate_type field */
  public    Integer RateType  = null;
  protected boolean _RateTypeSet = false;
  /** BILL_INVOICE_DETAIL.rate_period field */
  public    String RatePeriod  = null;
  protected boolean _RatePeriodSet = false;
  /** BILL_INVOICE_DETAIL.subscr_no field */
  public    Integer ServiceInternalId  = null;
  protected boolean _ServiceInternalIdSet = false;
  /** BILL_INVOICE_DETAIL.subscr_no_resets field */
  public    Integer ServiceInternalIdResets  = null;
  protected boolean _ServiceInternalIdResetsSet = false;
  /** BILL_INVOICE_DETAIL.equip_status field */
  public    Integer EquipStatus  = null;
  protected boolean _EquipStatusSet = false;
  /** BILL_INVOICE_DETAIL.from_date field */
  public    Date FromDate  = null;
  protected boolean _FromDateSet = false;
  /** BILL_INVOICE_DETAIL.to_date field */
  public    Date ToDate  = null;
  protected boolean _ToDateSet = false;
  /** BILL_INVOICE_DETAIL.annotation field */
  public    String Annotation  = null;
  protected boolean _AnnotationSet = false;
  /** BILL_INVOICE_DETAIL.profile_id field */
  public    BigInteger ProfileId  = null;
  protected boolean _ProfileIdSet = false;
  /** BILL_INVOICE_DETAIL.geocode field */
  public    String Geocode  = null;
  protected boolean _GeocodeSet = false;
  /** BILL_INVOICE_DETAIL.aux_tax_info field */
  public    String AuxTaxInfo  = null;
  protected boolean _AuxTaxInfoSet = false;
  /** BILL_INVOICE_DETAIL.federal_tax field */
  public    BigInteger FederalTax  = null;
  protected boolean _FederalTaxSet = false;
  /** BILL_INVOICE_DETAIL.state_tax field */
  public    BigInteger StateTax  = null;
  protected boolean _StateTaxSet = false;
  /** BILL_INVOICE_DETAIL.county_tax field */
  public    BigInteger CountyTax  = null;
  protected boolean _CountyTaxSet = false;
  /** BILL_INVOICE_DETAIL.city_tax field */
  public    BigInteger CityTax  = null;
  protected boolean _CityTaxSet = false;
  /** BILL_INVOICE_DETAIL.other_tax field */
  public    BigInteger OtherTax  = null;
  protected boolean _OtherTaxSet = false;
  /** BILL_INVOICE_DETAIL.test_flag field */
  public    Boolean TestFlag  = null;
  protected boolean _TestFlagSet = false;
  /** BILL_INVOICE_DETAIL.arch_flag field */
  public    Boolean ArchFlag  = null;
  protected boolean _ArchFlagSet = false;
  /** BILL_INVOICE_DETAIL.rev_rcv_cost_ctr field */
  public    Integer RevRcvCostCtr  = null;
  protected boolean _RevRcvCostCtrSet = false;
  /** BILL_INVOICE_DETAIL.b_rev_rcv_cost_ctr field */
  public    Integer BRevRcvCostCtr  = null;
  protected boolean _BRevRcvCostCtrSet = false;
  /** BILL_INVOICE_DETAIL.aggr_usage_id field */
  public    Integer AggrUsageId  = null;
  protected boolean _AggrUsageIdSet = false;
  /** BILL_INVOICE_DETAIL.tax_type_code field */
  public    Integer TaxTypeCode  = null;
  protected boolean _TaxTypeCodeSet = false;
  /** BILL_INVOICE_DETAIL.open_item_id field */
  public    Integer OpenItemId  = null;
  protected boolean _OpenItemIdSet = false;
  /** BILL_INVOICE_DETAIL.amount_reduction field */
  public    BigInteger AmountReduction  = null;
  protected boolean _AmountReductionSet = false;
  /** BILL_INVOICE_DETAIL.amount_reduction_id field */
  public    Integer AmountReductionId  = null;
  protected boolean _AmountReductionIdSet = false;
  /** BILL_INVOICE_DETAIL.zone_class field */
  public    Integer ZoneClass  = null;
  protected boolean _ZoneClassSet = false;
  /** BILL_INVOICE_DETAIL.bill_class field */
  public    Integer BillClass  = null;
  protected boolean _BillClassSet = false;
  /** BILL_INVOICE_DETAIL.inclusive_tax field */
  public    BigInteger InclusiveTax  = null;
  protected boolean _InclusiveTaxSet = false;
  /** BILL_INVOICE_DETAIL.pcm_active_dt field */
  public    Date PcmActiveDt  = null;
  protected boolean _PcmActiveDtSet = false;
  /** BILL_INVOICE_DETAIL.misc_number1 field */
  public    BigInteger MiscNumber1  = null;
  protected boolean _MiscNumber1Set = false;
  /** BILL_INVOICE_DETAIL.misc_number2 field */
  public    BigInteger MiscNumber2  = null;
  protected boolean _MiscNumber2Set = false;
  /** BILL_INVOICE_DETAIL.lob_id field */
  public    BigInteger LobId  = null;
  protected boolean _LobIdSet = false;
  /** DESCRIPTIONS.description_group field */
  public    Integer DescriptionGroup  = null;
  protected boolean _DescriptionGroupSet = false;
  /** DESCRIPTIONS.description_text field */
  public    String DescriptionText  = null;
  protected boolean _DescriptionTextSet = false;
  /** DESCRIPTIONS.short_description_text field */
  public    String ShortDescriptionText  = null;
  protected boolean _ShortDescriptionTextSet = false;
  private String _objName = "InvoiceDetailObjectData";
  /** Default constructor */
  public InvoiceDetailObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public InvoiceDetailObjectData (InvoiceDetailObjectData other)
  {

    if (other == null) return;
    this.Key = new InvoiceDetailObjectKeyData (other.Key);
    this.CurrencyCode = other.CurrencyCode;
    this._CurrencyCodeSet = other._CurrencyCodeSet;
    this.AccountInternalId = other.AccountInternalId;
    this._AccountInternalIdSet = other._AccountInternalIdSet;
    this.StatementDate = other.StatementDate;
    this._StatementDateSet = other._StatementDateSet;
    this.BillSequenceNum = other.BillSequenceNum;
    this._BillSequenceNumSet = other._BillSequenceNumSet;
    this.ServiceExternalId = other.ServiceExternalId;
    this._ServiceExternalIdSet = other._ServiceExternalIdSet;
    this.ServiceExternalIdType = other.ServiceExternalIdType;
    this._ServiceExternalIdTypeSet = other._ServiceExternalIdTypeSet;
    this.AccountExternalId = other.AccountExternalId;
    this._AccountExternalIdSet = other._AccountExternalIdSet;
    this.AccountExternalIdType = other.AccountExternalIdType;
    this._AccountExternalIdTypeSet = other._AccountExternalIdTypeSet;
    this.ServerId = other.ServerId;
    this._ServerIdSet = other._ServerIdSet;
    this.ProcessNum = other.ProcessNum;
    this._ProcessNumSet = other._ProcessNumSet;
    this.PackageId = other.PackageId;
    this._PackageIdSet = other._PackageIdSet;
    this.ComponentId = other.ComponentId;
    this._ComponentIdSet = other._ComponentIdSet;
    this.TypeCode = other.TypeCode;
    this._TypeCodeSet = other._TypeCodeSet;
    this.SubtypeCode = other.SubtypeCode;
    this._SubtypeCodeSet = other._SubtypeCodeSet;
    this.TrackingId = other.TrackingId;
    this._TrackingIdSet = other._TrackingIdSet;
    this.TrackingIdServ = other.TrackingIdServ;
    this._TrackingIdServSet = other._TrackingIdServSet;
    this.TrackingDate = other.TrackingDate;
    this._TrackingDateSet = other._TrackingDateSet;
    this.PrepSequence = other.PrepSequence;
    this._PrepSequenceSet = other._PrepSequenceSet;
    this.ProrateCode = other.ProrateCode;
    this._ProrateCodeSet = other._ProrateCodeSet;
    this.BillingLevel = other.BillingLevel;
    this._BillingLevelSet = other._BillingLevelSet;
    this.BillingCategory = other.BillingCategory;
    this._BillingCategorySet = other._BillingCategorySet;
    this.Amount = other.Amount;
    this._AmountSet = other._AmountSet;
    this.RatedAmount = other.RatedAmount;
    this._RatedAmountSet = other._RatedAmountSet;
    this.SecondaryAmount = other.SecondaryAmount;
    this._SecondaryAmountSet = other._SecondaryAmountSet;
    this.RateCurrencyCode = other.RateCurrencyCode;
    this._RateCurrencyCodeSet = other._RateCurrencyCodeSet;
    this.Units = other.Units;
    this._UnitsSet = other._UnitsSet;
    this.Tax = other.Tax;
    this._TaxSet = other._TaxSet;
    this.TaxRate = other.TaxRate;
    this._TaxRateSet = other._TaxRateSet;
    this.TaxPkgInstId = other.TaxPkgInstId;
    this._TaxPkgInstIdSet = other._TaxPkgInstIdSet;
    this.Discount = other.Discount;
    this._DiscountSet = other._DiscountSet;
    this.DiscountId = other.DiscountId;
    this._DiscountIdSet = other._DiscountIdSet;
    this.TransDate = other.TransDate;
    this._TransDateSet = other._TransDateSet;
    this.ProviderId = other.ProviderId;
    this._ProviderIdSet = other._ProviderIdSet;
    this.ElementId = other.ElementId;
    this._ElementIdSet = other._ElementIdSet;
    this.ProductLineId = other.ProductLineId;
    this._ProductLineIdSet = other._ProductLineIdSet;
    this.DescriptionCode = other.DescriptionCode;
    this._DescriptionCodeSet = other._DescriptionCodeSet;
    this.RateType = other.RateType;
    this._RateTypeSet = other._RateTypeSet;
    this.RatePeriod = other.RatePeriod;
    this._RatePeriodSet = other._RatePeriodSet;
    this.ServiceInternalId = other.ServiceInternalId;
    this._ServiceInternalIdSet = other._ServiceInternalIdSet;
    this.ServiceInternalIdResets = other.ServiceInternalIdResets;
    this._ServiceInternalIdResetsSet = other._ServiceInternalIdResetsSet;
    this.EquipStatus = other.EquipStatus;
    this._EquipStatusSet = other._EquipStatusSet;
    this.FromDate = other.FromDate;
    this._FromDateSet = other._FromDateSet;
    this.ToDate = other.ToDate;
    this._ToDateSet = other._ToDateSet;
    this.Annotation = other.Annotation;
    this._AnnotationSet = other._AnnotationSet;
    this.ProfileId = other.ProfileId;
    this._ProfileIdSet = other._ProfileIdSet;
    this.Geocode = other.Geocode;
    this._GeocodeSet = other._GeocodeSet;
    this.AuxTaxInfo = other.AuxTaxInfo;
    this._AuxTaxInfoSet = other._AuxTaxInfoSet;
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
    this.TestFlag = other.TestFlag;
    this._TestFlagSet = other._TestFlagSet;
    this.ArchFlag = other.ArchFlag;
    this._ArchFlagSet = other._ArchFlagSet;
    this.RevRcvCostCtr = other.RevRcvCostCtr;
    this._RevRcvCostCtrSet = other._RevRcvCostCtrSet;
    this.BRevRcvCostCtr = other.BRevRcvCostCtr;
    this._BRevRcvCostCtrSet = other._BRevRcvCostCtrSet;
    this.AggrUsageId = other.AggrUsageId;
    this._AggrUsageIdSet = other._AggrUsageIdSet;
    this.TaxTypeCode = other.TaxTypeCode;
    this._TaxTypeCodeSet = other._TaxTypeCodeSet;
    this.OpenItemId = other.OpenItemId;
    this._OpenItemIdSet = other._OpenItemIdSet;
    this.AmountReduction = other.AmountReduction;
    this._AmountReductionSet = other._AmountReductionSet;
    this.AmountReductionId = other.AmountReductionId;
    this._AmountReductionIdSet = other._AmountReductionIdSet;
    this.ZoneClass = other.ZoneClass;
    this._ZoneClassSet = other._ZoneClassSet;
    this.BillClass = other.BillClass;
    this._BillClassSet = other._BillClassSet;
    this.InclusiveTax = other.InclusiveTax;
    this._InclusiveTaxSet = other._InclusiveTaxSet;
    this.PcmActiveDt = other.PcmActiveDt;
    this._PcmActiveDtSet = other._PcmActiveDtSet;
    this.MiscNumber1 = other.MiscNumber1;
    this._MiscNumber1Set = other._MiscNumber1Set;
    this.MiscNumber2 = other.MiscNumber2;
    this._MiscNumber2Set = other._MiscNumber2Set;
    this.LobId = other.LobId;
    this._LobIdSet = other._LobIdSet;
    this.DescriptionGroup = other.DescriptionGroup;
    this._DescriptionGroupSet = other._DescriptionGroupSet;
    this.DescriptionText = other.DescriptionText;
    this._DescriptionTextSet = other._DescriptionTextSet;
    this.ShortDescriptionText = other.ShortDescriptionText;
    this._ShortDescriptionTextSet = other._ShortDescriptionTextSet;
  }

  /** get the Key for this object
   * @return InvoiceDetailObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public InvoiceDetailObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (InvoiceDetailObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: BillRefNo (BILL_INVOICE_DETAIL.bill_ref_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setBillRefNo (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillRefNo", "setBillRefNo");
    }
    if (this.Key == null) this.Key = new InvoiceDetailObjectKeyData ();
    this.Key.BillRefNo = value;
    this.Key._BillRefNoSet = true;
  }
  /** get the value of the field: BillRefNo (BILL_INVOICE_DETAIL.bill_ref_no)
   * @return Integer the value
   */
  public Integer getBillRefNo () {
    if (this.Key == null) return null;
    return this.Key.BillRefNo;
  }
  /** Change the field to not being actively set: BillRefNo (BILL_INVOICE_DETAIL.bill_ref_no)
   */
  public void unsetBillRefNo () {
    if (this.Key == null) return;
    this.Key._BillRefNoSet = false;
  }
  /** See if the field is actively set: BillRefNo (BILL_INVOICE_DETAIL.bill_ref_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillRefNo () {
    if (this.Key == null) return false;
    return this.Key._BillRefNoSet;
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

  /** set the fields value: BillRefResets (BILL_INVOICE_DETAIL.bill_ref_resets)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setBillRefResets (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillRefResets", "setBillRefResets");
    }
    if (this.Key == null) this.Key = new InvoiceDetailObjectKeyData ();
    this.Key.BillRefResets = value;
    this.Key._BillRefResetsSet = true;
  }
  /** get the value of the field: BillRefResets (BILL_INVOICE_DETAIL.bill_ref_resets)
   * @return Integer the value
   */
  public Integer getBillRefResets () {
    if (this.Key == null) return null;
    return this.Key.BillRefResets;
  }
  /** Change the field to not being actively set: BillRefResets (BILL_INVOICE_DETAIL.bill_ref_resets)
   */
  public void unsetBillRefResets () {
    if (this.Key == null) return;
    this.Key._BillRefResetsSet = false;
  }
  /** See if the field is actively set: BillRefResets (BILL_INVOICE_DETAIL.bill_ref_resets)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillRefResets () {
    if (this.Key == null) return false;
    return this.Key._BillRefResetsSet;
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

  /** set the fields value: BillInvoiceRow (BILL_INVOICE_DETAIL.bill_invoice_row)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setBillInvoiceRow (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillInvoiceRow", "setBillInvoiceRow");
    }
    if (this.Key == null) this.Key = new InvoiceDetailObjectKeyData ();
    this.Key.BillInvoiceRow = value;
    this.Key._BillInvoiceRowSet = true;
  }
  /** get the value of the field: BillInvoiceRow (BILL_INVOICE_DETAIL.bill_invoice_row)
   * @return Integer the value
   */
  public Integer getBillInvoiceRow () {
    if (this.Key == null) return null;
    return this.Key.BillInvoiceRow;
  }
  /** Change the field to not being actively set: BillInvoiceRow (BILL_INVOICE_DETAIL.bill_invoice_row)
   */
  public void unsetBillInvoiceRow () {
    if (this.Key == null) return;
    this.Key._BillInvoiceRowSet = false;
  }
  /** See if the field is actively set: BillInvoiceRow (BILL_INVOICE_DETAIL.bill_invoice_row)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillInvoiceRow () {
    if (this.Key == null) return false;
    return this.Key._BillInvoiceRowSet;
  }

  /** Retrieves the BillInvoiceRow field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillInvoiceRow field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillInvoiceRow field
   */
   public String getBillInvoiceRowAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillInvoiceRowAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillInvoiceRowAsFormattedString");
       return fmtMgr.formatNumber(this.getBillInvoiceRow(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillInvoiceRow");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillInvoiceRowAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillInvoiceRow field from a formatted string
   *
   * @param _value the BillInvoiceRow field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillInvoiceRow field
   */
   public void setBillInvoiceRowFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillInvoiceRowFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillInvoiceRow(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillInvoiceRow");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillInvoiceRowFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillInvoiceRowFromFormattedString");
   }

  /** set the fields value: LanguageCode (DESCRIPTIONS.language_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setLanguageCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "LanguageCode", "setLanguageCode");
    }
    if (this.Key == null) this.Key = new InvoiceDetailObjectKeyData ();
    this.Key.LanguageCode = value;
    this.Key._LanguageCodeSet = true;
  }
  /** get the value of the field: LanguageCode (DESCRIPTIONS.language_code)
   * @return Integer the value
   */
  public Integer getLanguageCode () {
    if (this.Key == null) return null;
    return this.Key.LanguageCode;
  }
  /** Change the field to not being actively set: LanguageCode (DESCRIPTIONS.language_code)
   */
  public void unsetLanguageCode () {
    if (this.Key == null) return;
    this.Key._LanguageCodeSet = false;
  }
  /** See if the field is actively set: LanguageCode (DESCRIPTIONS.language_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetLanguageCode () {
    if (this.Key == null) return false;
    return this.Key._LanguageCodeSet;
  }

  /** Retrieves the LanguageCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The LanguageCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LanguageCode field
   */
   public String getLanguageCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLanguageCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLanguageCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getLanguageCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LanguageCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getLanguageCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the LanguageCode field from a formatted string
   *
   * @param _value the LanguageCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the LanguageCode field
   */
   public void setLanguageCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLanguageCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setLanguageCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LanguageCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setLanguageCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLanguageCodeFromFormattedString");
   }

  /** set the fields value: CurrencyCode (BILL_INVOICE.currency_code)
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

  /** get the value of the field: CurrencyCode (BILL_INVOICE.currency_code)
   * @return Integer the value
   */
  public Integer getCurrencyCode () {
    return this.CurrencyCode;
  }
  /** Change the field to not being actively set: CurrencyCode (BILL_INVOICE.currency_code)
   */
  public void unsetCurrencyCode () {
    this._CurrencyCodeSet = false;
  }
  /** See if the field is actively set: CurrencyCode (BILL_INVOICE.currency_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCurrencyCode () {
    return this._CurrencyCodeSet;
  }
  /** set the fields value: AccountInternalId (BILL_INVOICE.account_no)
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

  /** get the value of the field: AccountInternalId (BILL_INVOICE.account_no)
   * @return Integer the value
   */
  public Integer getAccountInternalId () {
    return this.AccountInternalId;
  }
  /** Change the field to not being actively set: AccountInternalId (BILL_INVOICE.account_no)
   */
  public void unsetAccountInternalId () {
    this._AccountInternalIdSet = false;
  }
  /** See if the field is actively set: AccountInternalId (BILL_INVOICE.account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountInternalId () {
    return this._AccountInternalIdSet;
  }
  /** set the fields value: StatementDate (BILL_INVOICE.statement_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("StatementDate") 
  public void setStatementDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "StatementDate", "setStatementDate");
    }
    this.StatementDate = value;
    this._StatementDateSet = true;
  }

  /** Retrieves the StatementDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The StatementDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatementDate field
   */
   public String getStatementDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatementDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatementDateAsFormattedString");
       return fmtMgr.formatDate(this.getStatementDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StatementDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatementDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the StatementDate field from a formatted string
   *
   * @param _value the StatementDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StatementDate field
   */
   public void setStatementDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatementDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setStatementDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StatementDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatementDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatementDateFromFormattedString");
   }

  /**
   * Retrieves the StatementDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StatementDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatementDate field
   */
  public String getStatementDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatementDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatementDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getStatementDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatementDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatementDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the StatementDate field value from a formatted date/time string
   *
   * @param _value the StatementDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StatementDate field
   */
  public void setStatementDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStatementDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setStatementDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatementDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatementDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: StatementDate (BILL_INVOICE.statement_date)
   * @return Date the value
   */
  public Date getStatementDate () {
    return this.StatementDate;
  }
  /** Change the field to not being actively set: StatementDate (BILL_INVOICE.statement_date)
   */
  public void unsetStatementDate () {
    this._StatementDateSet = false;
  }
  /** See if the field is actively set: StatementDate (BILL_INVOICE.statement_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetStatementDate () {
    return this._StatementDateSet;
  }
  /** set the fields value: BillSequenceNum (BILL_INVOICE.bill_sequence_num)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillSequenceNum") 
  public void setBillSequenceNum (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillSequenceNum", "setBillSequenceNum");
    }
    this.BillSequenceNum = value;
    this._BillSequenceNumSet = true;
  }

  /** Retrieves the BillSequenceNum field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillSequenceNum field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillSequenceNum field
   */
   public String getBillSequenceNumAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillSequenceNumAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillSequenceNumAsFormattedString");
       return fmtMgr.formatNumber(this.getBillSequenceNum(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillSequenceNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillSequenceNumAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillSequenceNum field from a formatted string
   *
   * @param _value the BillSequenceNum field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillSequenceNum field
   */
   public void setBillSequenceNumFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillSequenceNumFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillSequenceNum(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillSequenceNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillSequenceNumFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillSequenceNumFromFormattedString");
   }

  /** get the value of the field: BillSequenceNum (BILL_INVOICE.bill_sequence_num)
   * @return Integer the value
   */
  public Integer getBillSequenceNum () {
    return this.BillSequenceNum;
  }
  /** Change the field to not being actively set: BillSequenceNum (BILL_INVOICE.bill_sequence_num)
   */
  public void unsetBillSequenceNum () {
    this._BillSequenceNumSet = false;
  }
  /** See if the field is actively set: BillSequenceNum (BILL_INVOICE.bill_sequence_num)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillSequenceNum () {
    return this._BillSequenceNumSet;
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

  /** set the fields value: ProcessNum (BILL_INVOICE_DETAIL.process_num)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ProcessNum") 
  public void setProcessNum (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ProcessNum", "setProcessNum");
    }
    if (value != null && !DataHelper.validLength (value, 1))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ProcessNum", "setProcessNum");
    }
    this.ProcessNum = value;
    this._ProcessNumSet = true;
  }

  /** Retrieves the ProcessNum field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ProcessNum field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProcessNum field
   */
   public String getProcessNumAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProcessNumAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProcessNumAsFormattedString");
       return fmtMgr.formatString(this.getProcessNum());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProcessNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getProcessNumAsFormattedString");
       throw x;
     }
   }
  /** Sets the ProcessNum field from a formatted string
   *
   * @param _value the ProcessNum field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ProcessNum field
   */
   public void setProcessNumFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProcessNumFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setProcessNum(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProcessNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setProcessNumFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProcessNumFromFormattedString");
   }

  /** get the value of the field: ProcessNum (BILL_INVOICE_DETAIL.process_num)
   * @return String the value
   */
  public String getProcessNum () {
    return this.ProcessNum;
  }
  /** Change the field to not being actively set: ProcessNum (BILL_INVOICE_DETAIL.process_num)
   */
  public void unsetProcessNum () {
    this._ProcessNumSet = false;
  }
  /** See if the field is actively set: ProcessNum (BILL_INVOICE_DETAIL.process_num)
   * @return boolean whether the field is actively set
   */
  public boolean issetProcessNum () {
    return this._ProcessNumSet;
  }
  /** set the fields value: PackageId (BILL_INVOICE_DETAIL.package_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PackageId") 
  public void setPackageId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PackageId", "setPackageId");
    }
    this.PackageId = value;
    this._PackageIdSet = true;
  }

  /** Retrieves the PackageId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PackageId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PackageId field
   */
   public String getPackageIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPackageIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPackageIdAsFormattedString");
       return fmtMgr.formatNumber(this.getPackageId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PackageId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPackageIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the PackageId field from a formatted string
   *
   * @param _value the PackageId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PackageId field
   */
   public void setPackageIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPackageIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPackageId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PackageId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPackageIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPackageIdFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated PackageId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the PackageId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the PackageId field
   */

  public String getPackageIdDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPackageIdDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getPackageIdEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPackageIdDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getPackageId()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PackageId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPackageIdDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated PackageId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the PackageId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the PackageId field
   */
  public Enumeration getPackageIdEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPackageIdEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("PackageType", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPackageIdEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PackageId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPackageIdEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated PackageId field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setPackageIdFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPackageIdFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getPackageIdEnumeration(_locale);
      this.setPackageId((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PackageId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPackageIdFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPackageIdFromDisplayValue");
  }

  /** get the value of the field: PackageId (BILL_INVOICE_DETAIL.package_id)
   * @return Integer the value
   */
  public Integer getPackageId () {
    return this.PackageId;
  }
  /** Change the field to not being actively set: PackageId (BILL_INVOICE_DETAIL.package_id)
   */
  public void unsetPackageId () {
    this._PackageIdSet = false;
  }
  /** See if the field is actively set: PackageId (BILL_INVOICE_DETAIL.package_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetPackageId () {
    return this._PackageIdSet;
  }
  /** set the fields value: ComponentId (BILL_INVOICE_DETAIL.component_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ComponentId") 
  public void setComponentId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ComponentId", "setComponentId");
    }
    this.ComponentId = value;
    this._ComponentIdSet = true;
  }

  /** Retrieves the ComponentId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ComponentId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ComponentId field
   */
   public String getComponentIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getComponentIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getComponentIdAsFormattedString");
       return fmtMgr.formatNumber(this.getComponentId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ComponentId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getComponentIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ComponentId field from a formatted string
   *
   * @param _value the ComponentId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ComponentId field
   */
   public void setComponentIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getComponentIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setComponentId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ComponentId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setComponentIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setComponentIdFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated ComponentId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the ComponentId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ComponentId field
   */

  public String getComponentIdDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getComponentIdDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getComponentIdEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getComponentIdDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getComponentId()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ComponentId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getComponentIdDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated ComponentId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the ComponentId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ComponentId field
   */
  public Enumeration getComponentIdEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getComponentIdEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("PackageComponentType", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getComponentIdEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ComponentId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getComponentIdEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated ComponentId field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setComponentIdFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setComponentIdFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getComponentIdEnumeration(_locale);
      this.setComponentId((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ComponentId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setComponentIdFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setComponentIdFromDisplayValue");
  }

  /** get the value of the field: ComponentId (BILL_INVOICE_DETAIL.component_id)
   * @return Integer the value
   */
  public Integer getComponentId () {
    return this.ComponentId;
  }
  /** Change the field to not being actively set: ComponentId (BILL_INVOICE_DETAIL.component_id)
   */
  public void unsetComponentId () {
    this._ComponentIdSet = false;
  }
  /** See if the field is actively set: ComponentId (BILL_INVOICE_DETAIL.component_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetComponentId () {
    return this._ComponentIdSet;
  }
  /** set the fields value: TypeCode (BILL_INVOICE_DETAIL.type_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TypeCode") 
  public void setTypeCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TypeCode", "setTypeCode");
    }
    this.TypeCode = value;
    this._TypeCodeSet = true;
  }

  /** Retrieves the TypeCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TypeCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TypeCode field
   */
   public String getTypeCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTypeCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTypeCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getTypeCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TypeCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTypeCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the TypeCode field from a formatted string
   *
   * @param _value the TypeCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TypeCode field
   */
   public void setTypeCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTypeCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTypeCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TypeCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTypeCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTypeCodeFromFormattedString");
   }

  /** get the value of the field: TypeCode (BILL_INVOICE_DETAIL.type_code)
   * @return Integer the value
   */
  public Integer getTypeCode () {
    return this.TypeCode;
  }
  /** Change the field to not being actively set: TypeCode (BILL_INVOICE_DETAIL.type_code)
   */
  public void unsetTypeCode () {
    this._TypeCodeSet = false;
  }
  /** See if the field is actively set: TypeCode (BILL_INVOICE_DETAIL.type_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetTypeCode () {
    return this._TypeCodeSet;
  }
  /** set the fields value: SubtypeCode (BILL_INVOICE_DETAIL.subtype_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SubtypeCode") 
  public void setSubtypeCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SubtypeCode", "setSubtypeCode");
    }
    this.SubtypeCode = value;
    this._SubtypeCodeSet = true;
  }

  /** Retrieves the SubtypeCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SubtypeCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SubtypeCode field
   */
   public String getSubtypeCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSubtypeCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSubtypeCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getSubtypeCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SubtypeCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSubtypeCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the SubtypeCode field from a formatted string
   *
   * @param _value the SubtypeCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SubtypeCode field
   */
   public void setSubtypeCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSubtypeCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSubtypeCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SubtypeCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSubtypeCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSubtypeCodeFromFormattedString");
   }

  /** get the value of the field: SubtypeCode (BILL_INVOICE_DETAIL.subtype_code)
   * @return Integer the value
   */
  public Integer getSubtypeCode () {
    return this.SubtypeCode;
  }
  /** Change the field to not being actively set: SubtypeCode (BILL_INVOICE_DETAIL.subtype_code)
   */
  public void unsetSubtypeCode () {
    this._SubtypeCodeSet = false;
  }
  /** See if the field is actively set: SubtypeCode (BILL_INVOICE_DETAIL.subtype_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetSubtypeCode () {
    return this._SubtypeCodeSet;
  }
  /** set the fields value: TrackingId (BILL_INVOICE_DETAIL.tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TrackingId") 
  public void setTrackingId (Integer value) throws ServiceException
  {
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

  /** get the value of the field: TrackingId (BILL_INVOICE_DETAIL.tracking_id)
   * @return Integer the value
   */
  public Integer getTrackingId () {
    return this.TrackingId;
  }
  /** Change the field to not being actively set: TrackingId (BILL_INVOICE_DETAIL.tracking_id)
   */
  public void unsetTrackingId () {
    this._TrackingIdSet = false;
  }
  /** See if the field is actively set: TrackingId (BILL_INVOICE_DETAIL.tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetTrackingId () {
    return this._TrackingIdSet;
  }
  /** set the fields value: TrackingIdServ (BILL_INVOICE_DETAIL.tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TrackingIdServ") 
  public void setTrackingIdServ (Integer value) throws ServiceException
  {
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

  /** get the value of the field: TrackingIdServ (BILL_INVOICE_DETAIL.tracking_id_serv)
   * @return Integer the value
   */
  public Integer getTrackingIdServ () {
    return this.TrackingIdServ;
  }
  /** Change the field to not being actively set: TrackingIdServ (BILL_INVOICE_DETAIL.tracking_id_serv)
   */
  public void unsetTrackingIdServ () {
    this._TrackingIdServSet = false;
  }
  /** See if the field is actively set: TrackingIdServ (BILL_INVOICE_DETAIL.tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetTrackingIdServ () {
    return this._TrackingIdServSet;
  }
  /** set the fields value: TrackingDate (BILL_INVOICE_DETAIL.tracking_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TrackingDate") 
  public void setTrackingDate (Date value) throws ServiceException
  {
    this.TrackingDate = value;
    this._TrackingDateSet = true;
  }

  /** Retrieves the TrackingDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TrackingDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TrackingDate field
   */
   public String getTrackingDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTrackingDateAsFormattedString");
       return fmtMgr.formatDate(this.getTrackingDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackingDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTrackingDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the TrackingDate field from a formatted string
   *
   * @param _value the TrackingDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TrackingDate field
   */
   public void setTrackingDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTrackingDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackingDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTrackingDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTrackingDateFromFormattedString");
   }

  /**
   * Retrieves the TrackingDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TrackingDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the TrackingDate field
   */
  public String getTrackingDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTrackingDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getTrackingDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TrackingDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTrackingDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the TrackingDate field value from a formatted date/time string
   *
   * @param _value the TrackingDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TrackingDate field
   */
  public void setTrackingDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTrackingDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setTrackingDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TrackingDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTrackingDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: TrackingDate (BILL_INVOICE_DETAIL.tracking_date)
   * @return Date the value
   */
  public Date getTrackingDate () {
    return this.TrackingDate;
  }
  /** Change the field to not being actively set: TrackingDate (BILL_INVOICE_DETAIL.tracking_date)
   */
  public void unsetTrackingDate () {
    this._TrackingDateSet = false;
  }
  /** See if the field is actively set: TrackingDate (BILL_INVOICE_DETAIL.tracking_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetTrackingDate () {
    return this._TrackingDateSet;
  }
  /** set the fields value: PrepSequence (BILL_INVOICE_DETAIL.prep_sequence)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PrepSequence") 
  public void setPrepSequence (Integer value) throws ServiceException
  {
    this.PrepSequence = value;
    this._PrepSequenceSet = true;
  }

  /** Retrieves the PrepSequence field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrepSequence field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrepSequence field
   */
   public String getPrepSequenceAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepSequenceAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepSequenceAsFormattedString");
       return fmtMgr.formatNumber(this.getPrepSequence(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrepSequence");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrepSequenceAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrepSequence field from a formatted string
   *
   * @param _value the PrepSequence field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrepSequence field
   */
   public void setPrepSequenceFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepSequenceFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrepSequence(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrepSequence");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrepSequenceFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrepSequenceFromFormattedString");
   }

  /** get the value of the field: PrepSequence (BILL_INVOICE_DETAIL.prep_sequence)
   * @return Integer the value
   */
  public Integer getPrepSequence () {
    return this.PrepSequence;
  }
  /** Change the field to not being actively set: PrepSequence (BILL_INVOICE_DETAIL.prep_sequence)
   */
  public void unsetPrepSequence () {
    this._PrepSequenceSet = false;
  }
  /** See if the field is actively set: PrepSequence (BILL_INVOICE_DETAIL.prep_sequence)
   * @return boolean whether the field is actively set
   */
  public boolean issetPrepSequence () {
    return this._PrepSequenceSet;
  }
  /** set the fields value: ProrateCode (BILL_INVOICE_DETAIL.prorate_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ProrateCode") 
  public void setProrateCode (Integer value) throws ServiceException
  {
    this.ProrateCode = value;
    this._ProrateCodeSet = true;
  }

  /** Retrieves the ProrateCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ProrateCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProrateCode field
   */
   public String getProrateCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProrateCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProrateCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getProrateCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProrateCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getProrateCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the ProrateCode field from a formatted string
   *
   * @param _value the ProrateCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ProrateCode field
   */
   public void setProrateCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProrateCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setProrateCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProrateCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setProrateCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProrateCodeFromFormattedString");
   }

  /** get the value of the field: ProrateCode (BILL_INVOICE_DETAIL.prorate_code)
   * @return Integer the value
   */
  public Integer getProrateCode () {
    return this.ProrateCode;
  }
  /** Change the field to not being actively set: ProrateCode (BILL_INVOICE_DETAIL.prorate_code)
   */
  public void unsetProrateCode () {
    this._ProrateCodeSet = false;
  }
  /** See if the field is actively set: ProrateCode (BILL_INVOICE_DETAIL.prorate_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetProrateCode () {
    return this._ProrateCodeSet;
  }
  /** set the fields value: BillingLevel (BILL_INVOICE_DETAIL.billing_level)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillingLevel") 
  public void setBillingLevel (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillingLevel", "setBillingLevel");
    }
    this.BillingLevel = value;
    this._BillingLevelSet = true;
  }

  /** Retrieves the BillingLevel field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillingLevel field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillingLevel field
   */
   public String getBillingLevelAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillingLevelAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillingLevelAsFormattedString");
       return fmtMgr.formatNumber(this.getBillingLevel(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillingLevel");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillingLevelAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillingLevel field from a formatted string
   *
   * @param _value the BillingLevel field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillingLevel field
   */
   public void setBillingLevelFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillingLevelFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillingLevel(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillingLevel");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillingLevelFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillingLevelFromFormattedString");
   }

  /** get the value of the field: BillingLevel (BILL_INVOICE_DETAIL.billing_level)
   * @return Integer the value
   */
  public Integer getBillingLevel () {
    return this.BillingLevel;
  }
  /** Change the field to not being actively set: BillingLevel (BILL_INVOICE_DETAIL.billing_level)
   */
  public void unsetBillingLevel () {
    this._BillingLevelSet = false;
  }
  /** See if the field is actively set: BillingLevel (BILL_INVOICE_DETAIL.billing_level)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillingLevel () {
    return this._BillingLevelSet;
  }
  /** set the fields value: BillingCategory (BILL_INVOICE_DETAIL.billing_category)
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

  /** get the value of the field: BillingCategory (BILL_INVOICE_DETAIL.billing_category)
   * @return Integer the value
   */
  public Integer getBillingCategory () {
    return this.BillingCategory;
  }
  /** Change the field to not being actively set: BillingCategory (BILL_INVOICE_DETAIL.billing_category)
   */
  public void unsetBillingCategory () {
    this._BillingCategorySet = false;
  }
  /** See if the field is actively set: BillingCategory (BILL_INVOICE_DETAIL.billing_category)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillingCategory () {
    return this._BillingCategorySet;
  }
  /** set the fields value: Amount (BILL_INVOICE_DETAIL.amount)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Amount") 
  public void setAmount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Amount", "setAmount");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Amount", "setAmount");
    }
    this.Amount = value;
    this._AmountSet = true;
  }

  /** Retrieves the Amount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Amount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Amount field
   */
   public String getAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Amount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the Amount field from a formatted string
   *
   * @param _value the Amount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Amount field
   */
   public void setAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Amount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAmountFromFormattedString");
   }

  /**
   * Retrieves the Amount field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The Amount field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the Amount field
   */
  public String getAmountAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAmountAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getAmount(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Amount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAmountAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the Amount field value from a formatted currency string
   *
   * @param _value the Amount field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Amount field
   */
  public void setAmountFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAmountFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setAmount(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Amount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAmountFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAmountFromFormattedCurrencyString");
  }

  /** get the value of the field: Amount (BILL_INVOICE_DETAIL.amount)
   * @return BigInteger the value
   */
  public BigInteger getAmount () {
    return this.Amount;
  }
  /** Change the field to not being actively set: Amount (BILL_INVOICE_DETAIL.amount)
   */
  public void unsetAmount () {
    this._AmountSet = false;
  }
  /** See if the field is actively set: Amount (BILL_INVOICE_DETAIL.amount)
   * @return boolean whether the field is actively set
   */
  public boolean issetAmount () {
    return this._AmountSet;
  }
  /** set the fields value: RatedAmount (BILL_INVOICE_DETAIL.rated_amount)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RatedAmount") 
  public void setRatedAmount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RatedAmount", "setRatedAmount");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "RatedAmount", "setRatedAmount");
    }
    this.RatedAmount = value;
    this._RatedAmountSet = true;
  }

  /** Retrieves the RatedAmount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RatedAmount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RatedAmount field
   */
   public String getRatedAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRatedAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRatedAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getRatedAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RatedAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRatedAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the RatedAmount field from a formatted string
   *
   * @param _value the RatedAmount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RatedAmount field
   */
   public void setRatedAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRatedAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRatedAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RatedAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRatedAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRatedAmountFromFormattedString");
   }

  /**
   * Retrieves the RatedAmount field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RatedAmount field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the RatedAmount field
   */
  public String getRatedAmountAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRatedAmountAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRatedAmountAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getRatedAmount(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RatedAmount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRatedAmountAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the RatedAmount field value from a formatted currency string
   *
   * @param _value the RatedAmount field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RatedAmount field
   */
  public void setRatedAmountFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRatedAmountFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setRatedAmount(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RatedAmount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRatedAmountFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRatedAmountFromFormattedCurrencyString");
  }

  /** get the value of the field: RatedAmount (BILL_INVOICE_DETAIL.rated_amount)
   * @return BigInteger the value
   */
  public BigInteger getRatedAmount () {
    return this.RatedAmount;
  }
  /** Change the field to not being actively set: RatedAmount (BILL_INVOICE_DETAIL.rated_amount)
   */
  public void unsetRatedAmount () {
    this._RatedAmountSet = false;
  }
  /** See if the field is actively set: RatedAmount (BILL_INVOICE_DETAIL.rated_amount)
   * @return boolean whether the field is actively set
   */
  public boolean issetRatedAmount () {
    return this._RatedAmountSet;
  }
  /** set the fields value: SecondaryAmount (BILL_INVOICE_DETAIL.secondary_amount)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SecondaryAmount") 
  public void setSecondaryAmount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SecondaryAmount", "setSecondaryAmount");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "SecondaryAmount", "setSecondaryAmount");
    }
    this.SecondaryAmount = value;
    this._SecondaryAmountSet = true;
  }

  /** Retrieves the SecondaryAmount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SecondaryAmount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SecondaryAmount field
   */
   public String getSecondaryAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSecondaryAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSecondaryAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getSecondaryAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SecondaryAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSecondaryAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the SecondaryAmount field from a formatted string
   *
   * @param _value the SecondaryAmount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SecondaryAmount field
   */
   public void setSecondaryAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSecondaryAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSecondaryAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SecondaryAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSecondaryAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSecondaryAmountFromFormattedString");
   }

  /**
   * Retrieves the SecondaryAmount field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SecondaryAmount field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the SecondaryAmount field
   */
  public String getSecondaryAmountAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSecondaryAmountAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSecondaryAmountAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getSecondaryAmount(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SecondaryAmount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSecondaryAmountAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the SecondaryAmount field value from a formatted currency string
   *
   * @param _value the SecondaryAmount field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SecondaryAmount field
   */
  public void setSecondaryAmountFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSecondaryAmountFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setSecondaryAmount(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SecondaryAmount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSecondaryAmountFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSecondaryAmountFromFormattedCurrencyString");
  }

  /** get the value of the field: SecondaryAmount (BILL_INVOICE_DETAIL.secondary_amount)
   * @return BigInteger the value
   */
  public BigInteger getSecondaryAmount () {
    return this.SecondaryAmount;
  }
  /** Change the field to not being actively set: SecondaryAmount (BILL_INVOICE_DETAIL.secondary_amount)
   */
  public void unsetSecondaryAmount () {
    this._SecondaryAmountSet = false;
  }
  /** See if the field is actively set: SecondaryAmount (BILL_INVOICE_DETAIL.secondary_amount)
   * @return boolean whether the field is actively set
   */
  public boolean issetSecondaryAmount () {
    return this._SecondaryAmountSet;
  }
  /** set the fields value: RateCurrencyCode (BILL_INVOICE_DETAIL.rate_currency_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RateCurrencyCode") 
  public void setRateCurrencyCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RateCurrencyCode", "setRateCurrencyCode");
    }
    this.RateCurrencyCode = value;
    this._RateCurrencyCodeSet = true;
  }

  /** Retrieves the RateCurrencyCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RateCurrencyCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateCurrencyCode field
   */
   public String getRateCurrencyCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateCurrencyCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateCurrencyCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getRateCurrencyCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateCurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateCurrencyCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the RateCurrencyCode field from a formatted string
   *
   * @param _value the RateCurrencyCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RateCurrencyCode field
   */
   public void setRateCurrencyCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateCurrencyCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRateCurrencyCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateCurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateCurrencyCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateCurrencyCodeFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated RateCurrencyCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the RateCurrencyCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the RateCurrencyCode field
   */

  public String getRateCurrencyCodeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateCurrencyCodeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getRateCurrencyCodeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateCurrencyCodeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getRateCurrencyCode()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateCurrencyCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateCurrencyCodeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated RateCurrencyCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the RateCurrencyCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the RateCurrencyCode field
   */
  public Enumeration getRateCurrencyCodeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateCurrencyCodeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("Currency", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateCurrencyCodeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateCurrencyCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateCurrencyCodeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated RateCurrencyCode field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setRateCurrencyCodeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRateCurrencyCodeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getRateCurrencyCodeEnumeration(_locale);
      this.setRateCurrencyCode((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateCurrencyCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateCurrencyCodeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRateCurrencyCodeFromDisplayValue");
  }

  /** get the value of the field: RateCurrencyCode (BILL_INVOICE_DETAIL.rate_currency_code)
   * @return Integer the value
   */
  public Integer getRateCurrencyCode () {
    return this.RateCurrencyCode;
  }
  /** Change the field to not being actively set: RateCurrencyCode (BILL_INVOICE_DETAIL.rate_currency_code)
   */
  public void unsetRateCurrencyCode () {
    this._RateCurrencyCodeSet = false;
  }
  /** See if the field is actively set: RateCurrencyCode (BILL_INVOICE_DETAIL.rate_currency_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetRateCurrencyCode () {
    return this._RateCurrencyCodeSet;
  }
  /** set the fields value: Units (BILL_INVOICE_DETAIL.units)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Units") 
  public void setUnits (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Units", "setUnits");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Units", "setUnits");
    }
    this.Units = value;
    this._UnitsSet = true;
  }

  /** Retrieves the Units field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Units field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Units field
   */
   public String getUnitsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUnitsAsFormattedString");
       return fmtMgr.formatBigInteger(this.getUnits(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Units");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUnitsAsFormattedString");
       throw x;
     }
   }
  /** Sets the Units field from a formatted string
   *
   * @param _value the Units field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Units field
   */
   public void setUnitsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUnits(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Units");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUnitsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUnitsFromFormattedString");
   }

  /** get the value of the field: Units (BILL_INVOICE_DETAIL.units)
   * @return BigInteger the value
   */
  public BigInteger getUnits () {
    return this.Units;
  }
  /** Change the field to not being actively set: Units (BILL_INVOICE_DETAIL.units)
   */
  public void unsetUnits () {
    this._UnitsSet = false;
  }
  /** See if the field is actively set: Units (BILL_INVOICE_DETAIL.units)
   * @return boolean whether the field is actively set
   */
  public boolean issetUnits () {
    return this._UnitsSet;
  }
  /** set the fields value: Tax (BILL_INVOICE_DETAIL.tax)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Tax") 
  public void setTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Tax", "setTax");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Tax", "setTax");
    }
    this.Tax = value;
    this._TaxSet = true;
  }

  /** Retrieves the Tax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Tax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Tax field
   */
   public String getTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Tax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the Tax field from a formatted string
   *
   * @param _value the Tax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Tax field
   */
   public void setTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Tax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxFromFormattedString");
   }

  /**
   * Retrieves the Tax field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The Tax field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the Tax field
   */
  public String getTaxAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getTax(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Tax");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the Tax field value from a formatted currency string
   *
   * @param _value the Tax field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Tax field
   */
  public void setTaxFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTaxFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setTax(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Tax");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxFromFormattedCurrencyString");
  }

  /** get the value of the field: Tax (BILL_INVOICE_DETAIL.tax)
   * @return BigInteger the value
   */
  public BigInteger getTax () {
    return this.Tax;
  }
  /** Change the field to not being actively set: Tax (BILL_INVOICE_DETAIL.tax)
   */
  public void unsetTax () {
    this._TaxSet = false;
  }
  /** See if the field is actively set: Tax (BILL_INVOICE_DETAIL.tax)
   * @return boolean whether the field is actively set
   */
  public boolean issetTax () {
    return this._TaxSet;
  }
  /** set the fields value: TaxRate (BILL_INVOICE_DETAIL.tax_rate)
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

  /** get the value of the field: TaxRate (BILL_INVOICE_DETAIL.tax_rate)
   * @return Integer the value
   */
  public Integer getTaxRate () {
    return this.TaxRate;
  }
  /** Change the field to not being actively set: TaxRate (BILL_INVOICE_DETAIL.tax_rate)
   */
  public void unsetTaxRate () {
    this._TaxRateSet = false;
  }
  /** See if the field is actively set: TaxRate (BILL_INVOICE_DETAIL.tax_rate)
   * @return boolean whether the field is actively set
   */
  public boolean issetTaxRate () {
    return this._TaxRateSet;
  }
  /** set the fields value: TaxPkgInstId (BILL_INVOICE_DETAIL.tax_pkg_inst_id)
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

  /** get the value of the field: TaxPkgInstId (BILL_INVOICE_DETAIL.tax_pkg_inst_id)
   * @return Integer the value
   */
  public Integer getTaxPkgInstId () {
    return this.TaxPkgInstId;
  }
  /** Change the field to not being actively set: TaxPkgInstId (BILL_INVOICE_DETAIL.tax_pkg_inst_id)
   */
  public void unsetTaxPkgInstId () {
    this._TaxPkgInstIdSet = false;
  }
  /** See if the field is actively set: TaxPkgInstId (BILL_INVOICE_DETAIL.tax_pkg_inst_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetTaxPkgInstId () {
    return this._TaxPkgInstIdSet;
  }
  /** set the fields value: Discount (BILL_INVOICE_DETAIL.discount)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Discount") 
  public void setDiscount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Discount", "setDiscount");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Discount", "setDiscount");
    }
    this.Discount = value;
    this._DiscountSet = true;
  }

  /** Retrieves the Discount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Discount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Discount field
   */
   public String getDiscountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getDiscount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Discount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDiscountAsFormattedString");
       throw x;
     }
   }
  /** Sets the Discount field from a formatted string
   *
   * @param _value the Discount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Discount field
   */
   public void setDiscountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDiscount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Discount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDiscountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDiscountFromFormattedString");
   }

  /**
   * Retrieves the Discount field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The Discount field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the Discount field
   */
  public String getDiscountAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscountAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getDiscount(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Discount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDiscountAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the Discount field value from a formatted currency string
   *
   * @param _value the Discount field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Discount field
   */
  public void setDiscountFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDiscountFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setDiscount(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Discount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDiscountFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDiscountFromFormattedCurrencyString");
  }

  /**
   * Retrieves the display value for the enumerated Discount field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the Discount field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the Discount field
   */

  public String getDiscountDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getDiscountEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscountDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getDiscount()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Discount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDiscountDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated Discount field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the Discount field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the Discount field
   */
  public Enumeration getDiscountEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("DiscountType", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscountEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Discount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDiscountEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated Discount field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setDiscountFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDiscountFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getDiscountEnumeration(_locale);
      this.setDiscount((BigInteger)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), BigInteger.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Discount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDiscountFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDiscountFromDisplayValue");
  }

  /** get the value of the field: Discount (BILL_INVOICE_DETAIL.discount)
   * @return BigInteger the value
   */
  public BigInteger getDiscount () {
    return this.Discount;
  }
  /** Change the field to not being actively set: Discount (BILL_INVOICE_DETAIL.discount)
   */
  public void unsetDiscount () {
    this._DiscountSet = false;
  }
  /** See if the field is actively set: Discount (BILL_INVOICE_DETAIL.discount)
   * @return boolean whether the field is actively set
   */
  public boolean issetDiscount () {
    return this._DiscountSet;
  }
  /** set the fields value: DiscountId (BILL_INVOICE_DETAIL.discount_id)
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

  /** get the value of the field: DiscountId (BILL_INVOICE_DETAIL.discount_id)
   * @return Integer the value
   */
  public Integer getDiscountId () {
    return this.DiscountId;
  }
  /** Change the field to not being actively set: DiscountId (BILL_INVOICE_DETAIL.discount_id)
   */
  public void unsetDiscountId () {
    this._DiscountIdSet = false;
  }
  /** See if the field is actively set: DiscountId (BILL_INVOICE_DETAIL.discount_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetDiscountId () {
    return this._DiscountIdSet;
  }
  /** set the fields value: TransDate (BILL_INVOICE_DETAIL.trans_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TransDate") 
  public void setTransDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TransDate", "setTransDate");
    }
    this.TransDate = value;
    this._TransDateSet = true;
  }

  /** Retrieves the TransDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TransDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransDate field
   */
   public String getTransDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransDateAsFormattedString");
       return fmtMgr.formatDate(this.getTransDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the TransDate field from a formatted string
   *
   * @param _value the TransDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TransDate field
   */
   public void setTransDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTransDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransDateFromFormattedString");
   }

  /**
   * Retrieves the TransDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransDate field
   */
  public String getTransDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getTransDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the TransDate field value from a formatted date/time string
   *
   * @param _value the TransDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TransDate field
   */
  public void setTransDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setTransDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: TransDate (BILL_INVOICE_DETAIL.trans_date)
   * @return Date the value
   */
  public Date getTransDate () {
    return this.TransDate;
  }
  /** Change the field to not being actively set: TransDate (BILL_INVOICE_DETAIL.trans_date)
   */
  public void unsetTransDate () {
    this._TransDateSet = false;
  }
  /** See if the field is actively set: TransDate (BILL_INVOICE_DETAIL.trans_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetTransDate () {
    return this._TransDateSet;
  }
  /** set the fields value: ProviderId (BILL_INVOICE_DETAIL.provider_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ProviderId") 
  public void setProviderId (Integer value) throws ServiceException
  {
    this.ProviderId = value;
    this._ProviderIdSet = true;
  }

  /** Retrieves the ProviderId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ProviderId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProviderId field
   */
   public String getProviderIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProviderIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProviderIdAsFormattedString");
       return fmtMgr.formatNumber(this.getProviderId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProviderId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getProviderIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ProviderId field from a formatted string
   *
   * @param _value the ProviderId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ProviderId field
   */
   public void setProviderIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProviderIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setProviderId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProviderId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setProviderIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProviderIdFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated ProviderId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the ProviderId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ProviderId field
   */

  public String getProviderIdDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProviderIdDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getProviderIdEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProviderIdDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getProviderId()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProviderId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getProviderIdDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated ProviderId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the ProviderId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ProviderId field
   */
  public Enumeration getProviderIdEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProviderIdEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("ProviderType", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProviderIdEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProviderId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getProviderIdEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated ProviderId field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setProviderIdFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setProviderIdFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getProviderIdEnumeration(_locale);
      this.setProviderId((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProviderId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setProviderIdFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setProviderIdFromDisplayValue");
  }

  /** get the value of the field: ProviderId (BILL_INVOICE_DETAIL.provider_id)
   * @return Integer the value
   */
  public Integer getProviderId () {
    return this.ProviderId;
  }
  /** Change the field to not being actively set: ProviderId (BILL_INVOICE_DETAIL.provider_id)
   */
  public void unsetProviderId () {
    this._ProviderIdSet = false;
  }
  /** See if the field is actively set: ProviderId (BILL_INVOICE_DETAIL.provider_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetProviderId () {
    return this._ProviderIdSet;
  }
  /** set the fields value: ElementId (BILL_INVOICE_DETAIL.element_id)
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

  /** get the value of the field: ElementId (BILL_INVOICE_DETAIL.element_id)
   * @return Integer the value
   */
  public Integer getElementId () {
    return this.ElementId;
  }
  /** Change the field to not being actively set: ElementId (BILL_INVOICE_DETAIL.element_id)
   */
  public void unsetElementId () {
    this._ElementIdSet = false;
  }
  /** See if the field is actively set: ElementId (BILL_INVOICE_DETAIL.element_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetElementId () {
    return this._ElementIdSet;
  }
  /** set the fields value: ProductLineId (BILL_INVOICE_DETAIL.product_line_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ProductLineId") 
  public void setProductLineId (Integer value) throws ServiceException
  {
    this.ProductLineId = value;
    this._ProductLineIdSet = true;
  }

  /** Retrieves the ProductLineId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ProductLineId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProductLineId field
   */
   public String getProductLineIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProductLineIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProductLineIdAsFormattedString");
       return fmtMgr.formatNumber(this.getProductLineId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProductLineId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getProductLineIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ProductLineId field from a formatted string
   *
   * @param _value the ProductLineId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ProductLineId field
   */
   public void setProductLineIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProductLineIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setProductLineId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProductLineId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setProductLineIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProductLineIdFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated ProductLineId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the ProductLineId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ProductLineId field
   */

  public String getProductLineIdDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProductLineIdDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getProductLineIdEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProductLineIdDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getProductLineId()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProductLineId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getProductLineIdDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated ProductLineId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the ProductLineId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ProductLineId field
   */
  public Enumeration getProductLineIdEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProductLineIdEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("ProductLines", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProductLineIdEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProductLineId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getProductLineIdEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated ProductLineId field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setProductLineIdFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setProductLineIdFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getProductLineIdEnumeration(_locale);
      this.setProductLineId((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProductLineId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setProductLineIdFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setProductLineIdFromDisplayValue");
  }

  /** get the value of the field: ProductLineId (BILL_INVOICE_DETAIL.product_line_id)
   * @return Integer the value
   */
  public Integer getProductLineId () {
    return this.ProductLineId;
  }
  /** Change the field to not being actively set: ProductLineId (BILL_INVOICE_DETAIL.product_line_id)
   */
  public void unsetProductLineId () {
    this._ProductLineIdSet = false;
  }
  /** See if the field is actively set: ProductLineId (BILL_INVOICE_DETAIL.product_line_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetProductLineId () {
    return this._ProductLineIdSet;
  }
  /** set the fields value: DescriptionCode (BILL_INVOICE_DETAIL.description_code)
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

  /** get the value of the field: DescriptionCode (BILL_INVOICE_DETAIL.description_code)
   * @return Integer the value
   */
  public Integer getDescriptionCode () {
    return this.DescriptionCode;
  }
  /** Change the field to not being actively set: DescriptionCode (BILL_INVOICE_DETAIL.description_code)
   */
  public void unsetDescriptionCode () {
    this._DescriptionCodeSet = false;
  }
  /** See if the field is actively set: DescriptionCode (BILL_INVOICE_DETAIL.description_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetDescriptionCode () {
    return this._DescriptionCodeSet;
  }
  /** set the fields value: RateType (BILL_INVOICE_DETAIL.rate_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RateType") 
  public void setRateType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RateType", "setRateType");
    }
    this.RateType = value;
    this._RateTypeSet = true;
  }

  /** Retrieves the RateType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RateType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateType field
   */
   public String getRateTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getRateType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the RateType field from a formatted string
   *
   * @param _value the RateType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RateType field
   */
   public void setRateTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRateType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateTypeFromFormattedString");
   }

  /** get the value of the field: RateType (BILL_INVOICE_DETAIL.rate_type)
   * @return Integer the value
   */
  public Integer getRateType () {
    return this.RateType;
  }
  /** Change the field to not being actively set: RateType (BILL_INVOICE_DETAIL.rate_type)
   */
  public void unsetRateType () {
    this._RateTypeSet = false;
  }
  /** See if the field is actively set: RateType (BILL_INVOICE_DETAIL.rate_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetRateType () {
    return this._RateTypeSet;
  }
  /** set the fields value: RatePeriod (BILL_INVOICE_DETAIL.rate_period)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RatePeriod") 
  public void setRatePeriod (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 1))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "RatePeriod", "setRatePeriod");
    }
    this.RatePeriod = value;
    this._RatePeriodSet = true;
  }

  /** Retrieves the RatePeriod field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RatePeriod field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RatePeriod field
   */
   public String getRatePeriodAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRatePeriodAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRatePeriodAsFormattedString");
       return fmtMgr.formatString(this.getRatePeriod());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RatePeriod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRatePeriodAsFormattedString");
       throw x;
     }
   }
  /** Sets the RatePeriod field from a formatted string
   *
   * @param _value the RatePeriod field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RatePeriod field
   */
   public void setRatePeriodFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRatePeriodFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRatePeriod(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RatePeriod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRatePeriodFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRatePeriodFromFormattedString");
   }

  /** get the value of the field: RatePeriod (BILL_INVOICE_DETAIL.rate_period)
   * @return String the value
   */
  public String getRatePeriod () {
    return this.RatePeriod;
  }
  /** Change the field to not being actively set: RatePeriod (BILL_INVOICE_DETAIL.rate_period)
   */
  public void unsetRatePeriod () {
    this._RatePeriodSet = false;
  }
  /** See if the field is actively set: RatePeriod (BILL_INVOICE_DETAIL.rate_period)
   * @return boolean whether the field is actively set
   */
  public boolean issetRatePeriod () {
    return this._RatePeriodSet;
  }
  /** set the fields value: ServiceInternalId (BILL_INVOICE_DETAIL.subscr_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServiceInternalId") 
  public void setServiceInternalId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ServiceInternalId", "setServiceInternalId");
    }
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

  /** get the value of the field: ServiceInternalId (BILL_INVOICE_DETAIL.subscr_no)
   * @return Integer the value
   */
  public Integer getServiceInternalId () {
    return this.ServiceInternalId;
  }
  /** Change the field to not being actively set: ServiceInternalId (BILL_INVOICE_DETAIL.subscr_no)
   */
  public void unsetServiceInternalId () {
    this._ServiceInternalIdSet = false;
  }
  /** See if the field is actively set: ServiceInternalId (BILL_INVOICE_DETAIL.subscr_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceInternalId () {
    return this._ServiceInternalIdSet;
  }
  /** set the fields value: ServiceInternalIdResets (BILL_INVOICE_DETAIL.subscr_no_resets)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServiceInternalIdResets") 
  public void setServiceInternalIdResets (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ServiceInternalIdResets", "setServiceInternalIdResets");
    }
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

  /** get the value of the field: ServiceInternalIdResets (BILL_INVOICE_DETAIL.subscr_no_resets)
   * @return Integer the value
   */
  public Integer getServiceInternalIdResets () {
    return this.ServiceInternalIdResets;
  }
  /** Change the field to not being actively set: ServiceInternalIdResets (BILL_INVOICE_DETAIL.subscr_no_resets)
   */
  public void unsetServiceInternalIdResets () {
    this._ServiceInternalIdResetsSet = false;
  }
  /** See if the field is actively set: ServiceInternalIdResets (BILL_INVOICE_DETAIL.subscr_no_resets)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceInternalIdResets () {
    return this._ServiceInternalIdResetsSet;
  }
  /** set the fields value: EquipStatus (BILL_INVOICE_DETAIL.equip_status)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("EquipStatus") 
  public void setEquipStatus (Integer value) throws ServiceException
  {
    this.EquipStatus = value;
    this._EquipStatusSet = true;
  }

  /** Retrieves the EquipStatus field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The EquipStatus field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EquipStatus field
   */
   public String getEquipStatusAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEquipStatusAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEquipStatusAsFormattedString");
       return fmtMgr.formatNumber(this.getEquipStatus(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EquipStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getEquipStatusAsFormattedString");
       throw x;
     }
   }
  /** Sets the EquipStatus field from a formatted string
   *
   * @param _value the EquipStatus field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EquipStatus field
   */
   public void setEquipStatusFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEquipStatusFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setEquipStatus(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EquipStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setEquipStatusFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEquipStatusFromFormattedString");
   }

  /** get the value of the field: EquipStatus (BILL_INVOICE_DETAIL.equip_status)
   * @return Integer the value
   */
  public Integer getEquipStatus () {
    return this.EquipStatus;
  }
  /** Change the field to not being actively set: EquipStatus (BILL_INVOICE_DETAIL.equip_status)
   */
  public void unsetEquipStatus () {
    this._EquipStatusSet = false;
  }
  /** See if the field is actively set: EquipStatus (BILL_INVOICE_DETAIL.equip_status)
   * @return boolean whether the field is actively set
   */
  public boolean issetEquipStatus () {
    return this._EquipStatusSet;
  }
  /** set the fields value: FromDate (BILL_INVOICE_DETAIL.from_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FromDate") 
  public void setFromDate (Date value) throws ServiceException
  {
    this.FromDate = value;
    this._FromDateSet = true;
  }

  /** Retrieves the FromDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FromDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FromDate field
   */
   public String getFromDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFromDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFromDateAsFormattedString");
       return fmtMgr.formatDate(this.getFromDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FromDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFromDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the FromDate field from a formatted string
   *
   * @param _value the FromDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FromDate field
   */
   public void setFromDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFromDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFromDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FromDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFromDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFromDateFromFormattedString");
   }

  /**
   * Retrieves the FromDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FromDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the FromDate field
   */
  public String getFromDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFromDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFromDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getFromDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FromDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFromDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the FromDate field value from a formatted date/time string
   *
   * @param _value the FromDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FromDate field
   */
  public void setFromDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFromDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setFromDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FromDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFromDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: FromDate (BILL_INVOICE_DETAIL.from_date)
   * @return Date the value
   */
  public Date getFromDate () {
    return this.FromDate;
  }
  /** Change the field to not being actively set: FromDate (BILL_INVOICE_DETAIL.from_date)
   */
  public void unsetFromDate () {
    this._FromDateSet = false;
  }
  /** See if the field is actively set: FromDate (BILL_INVOICE_DETAIL.from_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetFromDate () {
    return this._FromDateSet;
  }
  /** set the fields value: ToDate (BILL_INVOICE_DETAIL.to_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ToDate") 
  public void setToDate (Date value) throws ServiceException
  {
    this.ToDate = value;
    this._ToDateSet = true;
  }

  /** Retrieves the ToDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ToDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ToDate field
   */
   public String getToDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getToDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getToDateAsFormattedString");
       return fmtMgr.formatDate(this.getToDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ToDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getToDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the ToDate field from a formatted string
   *
   * @param _value the ToDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ToDate field
   */
   public void setToDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getToDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setToDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ToDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setToDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setToDateFromFormattedString");
   }

  /**
   * Retrieves the ToDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ToDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ToDate field
   */
  public String getToDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getToDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getToDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getToDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ToDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getToDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ToDate field value from a formatted date/time string
   *
   * @param _value the ToDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ToDate field
   */
  public void setToDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setToDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setToDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ToDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setToDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: ToDate (BILL_INVOICE_DETAIL.to_date)
   * @return Date the value
   */
  public Date getToDate () {
    return this.ToDate;
  }
  /** Change the field to not being actively set: ToDate (BILL_INVOICE_DETAIL.to_date)
   */
  public void unsetToDate () {
    this._ToDateSet = false;
  }
  /** See if the field is actively set: ToDate (BILL_INVOICE_DETAIL.to_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetToDate () {
    return this._ToDateSet;
  }
  /** set the fields value: Annotation (BILL_INVOICE_DETAIL.annotation)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Annotation") 
  public void setAnnotation (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 80))
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

  /** get the value of the field: Annotation (BILL_INVOICE_DETAIL.annotation)
   * @return String the value
   */
  public String getAnnotation () {
    return this.Annotation;
  }
  /** Change the field to not being actively set: Annotation (BILL_INVOICE_DETAIL.annotation)
   */
  public void unsetAnnotation () {
    this._AnnotationSet = false;
  }
  /** See if the field is actively set: Annotation (BILL_INVOICE_DETAIL.annotation)
   * @return boolean whether the field is actively set
   */
  public boolean issetAnnotation () {
    return this._AnnotationSet;
  }
  /** set the fields value: ProfileId (BILL_INVOICE_DETAIL.profile_id)
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

  /** get the value of the field: ProfileId (BILL_INVOICE_DETAIL.profile_id)
   * @return BigInteger the value
   */
  public BigInteger getProfileId () {
    return this.ProfileId;
  }
  /** Change the field to not being actively set: ProfileId (BILL_INVOICE_DETAIL.profile_id)
   */
  public void unsetProfileId () {
    this._ProfileIdSet = false;
  }
  /** See if the field is actively set: ProfileId (BILL_INVOICE_DETAIL.profile_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetProfileId () {
    return this._ProfileIdSet;
  }
  /** set the fields value: Geocode (BILL_INVOICE_DETAIL.geocode)
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

  /** get the value of the field: Geocode (BILL_INVOICE_DETAIL.geocode)
   * @return String the value
   */
  public String getGeocode () {
    return this.Geocode;
  }
  /** Change the field to not being actively set: Geocode (BILL_INVOICE_DETAIL.geocode)
   */
  public void unsetGeocode () {
    this._GeocodeSet = false;
  }
  /** See if the field is actively set: Geocode (BILL_INVOICE_DETAIL.geocode)
   * @return boolean whether the field is actively set
   */
  public boolean issetGeocode () {
    return this._GeocodeSet;
  }
  /** set the fields value: AuxTaxInfo (BILL_INVOICE_DETAIL.aux_tax_info)
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

  /** get the value of the field: AuxTaxInfo (BILL_INVOICE_DETAIL.aux_tax_info)
   * @return String the value
   */
  public String getAuxTaxInfo () {
    return this.AuxTaxInfo;
  }
  /** Change the field to not being actively set: AuxTaxInfo (BILL_INVOICE_DETAIL.aux_tax_info)
   */
  public void unsetAuxTaxInfo () {
    this._AuxTaxInfoSet = false;
  }
  /** See if the field is actively set: AuxTaxInfo (BILL_INVOICE_DETAIL.aux_tax_info)
   * @return boolean whether the field is actively set
   */
  public boolean issetAuxTaxInfo () {
    return this._AuxTaxInfoSet;
  }
  /** set the fields value: FederalTax (BILL_INVOICE_DETAIL.federal_tax)
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

  /** get the value of the field: FederalTax (BILL_INVOICE_DETAIL.federal_tax)
   * @return BigInteger the value
   */
  public BigInteger getFederalTax () {
    return this.FederalTax;
  }
  /** Change the field to not being actively set: FederalTax (BILL_INVOICE_DETAIL.federal_tax)
   */
  public void unsetFederalTax () {
    this._FederalTaxSet = false;
  }
  /** See if the field is actively set: FederalTax (BILL_INVOICE_DETAIL.federal_tax)
   * @return boolean whether the field is actively set
   */
  public boolean issetFederalTax () {
    return this._FederalTaxSet;
  }
  /** set the fields value: StateTax (BILL_INVOICE_DETAIL.state_tax)
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

  /** get the value of the field: StateTax (BILL_INVOICE_DETAIL.state_tax)
   * @return BigInteger the value
   */
  public BigInteger getStateTax () {
    return this.StateTax;
  }
  /** Change the field to not being actively set: StateTax (BILL_INVOICE_DETAIL.state_tax)
   */
  public void unsetStateTax () {
    this._StateTaxSet = false;
  }
  /** See if the field is actively set: StateTax (BILL_INVOICE_DETAIL.state_tax)
   * @return boolean whether the field is actively set
   */
  public boolean issetStateTax () {
    return this._StateTaxSet;
  }
  /** set the fields value: CountyTax (BILL_INVOICE_DETAIL.county_tax)
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

  /** get the value of the field: CountyTax (BILL_INVOICE_DETAIL.county_tax)
   * @return BigInteger the value
   */
  public BigInteger getCountyTax () {
    return this.CountyTax;
  }
  /** Change the field to not being actively set: CountyTax (BILL_INVOICE_DETAIL.county_tax)
   */
  public void unsetCountyTax () {
    this._CountyTaxSet = false;
  }
  /** See if the field is actively set: CountyTax (BILL_INVOICE_DETAIL.county_tax)
   * @return boolean whether the field is actively set
   */
  public boolean issetCountyTax () {
    return this._CountyTaxSet;
  }
  /** set the fields value: CityTax (BILL_INVOICE_DETAIL.city_tax)
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

  /** get the value of the field: CityTax (BILL_INVOICE_DETAIL.city_tax)
   * @return BigInteger the value
   */
  public BigInteger getCityTax () {
    return this.CityTax;
  }
  /** Change the field to not being actively set: CityTax (BILL_INVOICE_DETAIL.city_tax)
   */
  public void unsetCityTax () {
    this._CityTaxSet = false;
  }
  /** See if the field is actively set: CityTax (BILL_INVOICE_DETAIL.city_tax)
   * @return boolean whether the field is actively set
   */
  public boolean issetCityTax () {
    return this._CityTaxSet;
  }
  /** set the fields value: OtherTax (BILL_INVOICE_DETAIL.other_tax)
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

  /** get the value of the field: OtherTax (BILL_INVOICE_DETAIL.other_tax)
   * @return BigInteger the value
   */
  public BigInteger getOtherTax () {
    return this.OtherTax;
  }
  /** Change the field to not being actively set: OtherTax (BILL_INVOICE_DETAIL.other_tax)
   */
  public void unsetOtherTax () {
    this._OtherTaxSet = false;
  }
  /** See if the field is actively set: OtherTax (BILL_INVOICE_DETAIL.other_tax)
   * @return boolean whether the field is actively set
   */
  public boolean issetOtherTax () {
    return this._OtherTaxSet;
  }
  /** set the fields value: TestFlag (BILL_INVOICE_DETAIL.test_flag)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TestFlag") 
  public void setTestFlag (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TestFlag", "setTestFlag");
    }
    this.TestFlag = value;
    this._TestFlagSet = true;
  }

  /** Retrieves the TestFlag field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TestFlag field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TestFlag field
   */
   public String getTestFlagAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTestFlagAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTestFlagAsFormattedString");
       return fmtMgr.formatBoolean(this.getTestFlag());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TestFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTestFlagAsFormattedString");
       throw x;
     }
   }
  /** Sets the TestFlag field from a formatted string
   *
   * @param _value the TestFlag field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TestFlag field
   */
   public void setTestFlagFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTestFlagFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTestFlag(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TestFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTestFlagFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTestFlagFromFormattedString");
   }

  /** get the value of the field: TestFlag (BILL_INVOICE_DETAIL.test_flag)
   * @return Boolean the value
   */
  public Boolean getTestFlag () {
    return this.TestFlag;
  }
  /** Change the field to not being actively set: TestFlag (BILL_INVOICE_DETAIL.test_flag)
   */
  public void unsetTestFlag () {
    this._TestFlagSet = false;
  }
  /** See if the field is actively set: TestFlag (BILL_INVOICE_DETAIL.test_flag)
   * @return boolean whether the field is actively set
   */
  public boolean issetTestFlag () {
    return this._TestFlagSet;
  }
  /** set the fields value: ArchFlag (BILL_INVOICE_DETAIL.arch_flag)
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

  /** get the value of the field: ArchFlag (BILL_INVOICE_DETAIL.arch_flag)
   * @return Boolean the value
   */
  public Boolean getArchFlag () {
    return this.ArchFlag;
  }
  /** Change the field to not being actively set: ArchFlag (BILL_INVOICE_DETAIL.arch_flag)
   */
  public void unsetArchFlag () {
    this._ArchFlagSet = false;
  }
  /** See if the field is actively set: ArchFlag (BILL_INVOICE_DETAIL.arch_flag)
   * @return boolean whether the field is actively set
   */
  public boolean issetArchFlag () {
    return this._ArchFlagSet;
  }
  /** set the fields value: RevRcvCostCtr (BILL_INVOICE_DETAIL.rev_rcv_cost_ctr)
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

  /** get the value of the field: RevRcvCostCtr (BILL_INVOICE_DETAIL.rev_rcv_cost_ctr)
   * @return Integer the value
   */
  public Integer getRevRcvCostCtr () {
    return this.RevRcvCostCtr;
  }
  /** Change the field to not being actively set: RevRcvCostCtr (BILL_INVOICE_DETAIL.rev_rcv_cost_ctr)
   */
  public void unsetRevRcvCostCtr () {
    this._RevRcvCostCtrSet = false;
  }
  /** See if the field is actively set: RevRcvCostCtr (BILL_INVOICE_DETAIL.rev_rcv_cost_ctr)
   * @return boolean whether the field is actively set
   */
  public boolean issetRevRcvCostCtr () {
    return this._RevRcvCostCtrSet;
  }
  /** set the fields value: BRevRcvCostCtr (BILL_INVOICE_DETAIL.b_rev_rcv_cost_ctr)
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

  /** get the value of the field: BRevRcvCostCtr (BILL_INVOICE_DETAIL.b_rev_rcv_cost_ctr)
   * @return Integer the value
   */
  public Integer getBRevRcvCostCtr () {
    return this.BRevRcvCostCtr;
  }
  /** Change the field to not being actively set: BRevRcvCostCtr (BILL_INVOICE_DETAIL.b_rev_rcv_cost_ctr)
   */
  public void unsetBRevRcvCostCtr () {
    this._BRevRcvCostCtrSet = false;
  }
  /** See if the field is actively set: BRevRcvCostCtr (BILL_INVOICE_DETAIL.b_rev_rcv_cost_ctr)
   * @return boolean whether the field is actively set
   */
  public boolean issetBRevRcvCostCtr () {
    return this._BRevRcvCostCtrSet;
  }
  /** set the fields value: AggrUsageId (BILL_INVOICE_DETAIL.aggr_usage_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AggrUsageId") 
  public void setAggrUsageId (Integer value) throws ServiceException
  {
    this.AggrUsageId = value;
    this._AggrUsageIdSet = true;
  }

  /** Retrieves the AggrUsageId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AggrUsageId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AggrUsageId field
   */
   public String getAggrUsageIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAggrUsageIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAggrUsageIdAsFormattedString");
       return fmtMgr.formatNumber(this.getAggrUsageId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AggrUsageId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAggrUsageIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the AggrUsageId field from a formatted string
   *
   * @param _value the AggrUsageId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AggrUsageId field
   */
   public void setAggrUsageIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAggrUsageIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAggrUsageId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AggrUsageId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAggrUsageIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAggrUsageIdFromFormattedString");
   }

  /** get the value of the field: AggrUsageId (BILL_INVOICE_DETAIL.aggr_usage_id)
   * @return Integer the value
   */
  public Integer getAggrUsageId () {
    return this.AggrUsageId;
  }
  /** Change the field to not being actively set: AggrUsageId (BILL_INVOICE_DETAIL.aggr_usage_id)
   */
  public void unsetAggrUsageId () {
    this._AggrUsageIdSet = false;
  }
  /** See if the field is actively set: AggrUsageId (BILL_INVOICE_DETAIL.aggr_usage_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetAggrUsageId () {
    return this._AggrUsageIdSet;
  }
  /** set the fields value: TaxTypeCode (BILL_INVOICE_DETAIL.tax_type_code)
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

  /** get the value of the field: TaxTypeCode (BILL_INVOICE_DETAIL.tax_type_code)
   * @return Integer the value
   */
  public Integer getTaxTypeCode () {
    return this.TaxTypeCode;
  }
  /** Change the field to not being actively set: TaxTypeCode (BILL_INVOICE_DETAIL.tax_type_code)
   */
  public void unsetTaxTypeCode () {
    this._TaxTypeCodeSet = false;
  }
  /** See if the field is actively set: TaxTypeCode (BILL_INVOICE_DETAIL.tax_type_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetTaxTypeCode () {
    return this._TaxTypeCodeSet;
  }
  /** set the fields value: OpenItemId (BILL_INVOICE_DETAIL.open_item_id)
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

  /** get the value of the field: OpenItemId (BILL_INVOICE_DETAIL.open_item_id)
   * @return Integer the value
   */
  public Integer getOpenItemId () {
    return this.OpenItemId;
  }
  /** Change the field to not being actively set: OpenItemId (BILL_INVOICE_DETAIL.open_item_id)
   */
  public void unsetOpenItemId () {
    this._OpenItemIdSet = false;
  }
  /** See if the field is actively set: OpenItemId (BILL_INVOICE_DETAIL.open_item_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetOpenItemId () {
    return this._OpenItemIdSet;
  }
  /** set the fields value: AmountReduction (BILL_INVOICE_DETAIL.amount_reduction)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AmountReduction") 
  public void setAmountReduction (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AmountReduction", "setAmountReduction");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AmountReduction", "setAmountReduction");
    }
    this.AmountReduction = value;
    this._AmountReductionSet = true;
  }

  /** Retrieves the AmountReduction field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AmountReduction field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AmountReduction field
   */
   public String getAmountReductionAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountReductionAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAmountReductionAsFormattedString");
       return fmtMgr.formatBigInteger(this.getAmountReduction(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AmountReduction");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAmountReductionAsFormattedString");
       throw x;
     }
   }
  /** Sets the AmountReduction field from a formatted string
   *
   * @param _value the AmountReduction field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AmountReduction field
   */
   public void setAmountReductionFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountReductionFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAmountReduction(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AmountReduction");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAmountReductionFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAmountReductionFromFormattedString");
   }

  /**
   * Retrieves the AmountReduction field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AmountReduction field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the AmountReduction field
   */
  public String getAmountReductionAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountReductionAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAmountReductionAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getAmountReduction(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AmountReduction");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAmountReductionAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the AmountReduction field value from a formatted currency string
   *
   * @param _value the AmountReduction field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AmountReduction field
   */
  public void setAmountReductionFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAmountReductionFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setAmountReduction(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AmountReduction");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAmountReductionFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAmountReductionFromFormattedCurrencyString");
  }

  /** get the value of the field: AmountReduction (BILL_INVOICE_DETAIL.amount_reduction)
   * @return BigInteger the value
   */
  public BigInteger getAmountReduction () {
    return this.AmountReduction;
  }
  /** Change the field to not being actively set: AmountReduction (BILL_INVOICE_DETAIL.amount_reduction)
   */
  public void unsetAmountReduction () {
    this._AmountReductionSet = false;
  }
  /** See if the field is actively set: AmountReduction (BILL_INVOICE_DETAIL.amount_reduction)
   * @return boolean whether the field is actively set
   */
  public boolean issetAmountReduction () {
    return this._AmountReductionSet;
  }
  /** set the fields value: AmountReductionId (BILL_INVOICE_DETAIL.amount_reduction_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AmountReductionId") 
  public void setAmountReductionId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AmountReductionId", "setAmountReductionId");
    }
    this.AmountReductionId = value;
    this._AmountReductionIdSet = true;
  }

  /** Retrieves the AmountReductionId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AmountReductionId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AmountReductionId field
   */
   public String getAmountReductionIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountReductionIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAmountReductionIdAsFormattedString");
       return fmtMgr.formatNumber(this.getAmountReductionId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AmountReductionId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAmountReductionIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the AmountReductionId field from a formatted string
   *
   * @param _value the AmountReductionId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AmountReductionId field
   */
   public void setAmountReductionIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountReductionIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAmountReductionId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AmountReductionId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAmountReductionIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAmountReductionIdFromFormattedString");
   }

  /** get the value of the field: AmountReductionId (BILL_INVOICE_DETAIL.amount_reduction_id)
   * @return Integer the value
   */
  public Integer getAmountReductionId () {
    return this.AmountReductionId;
  }
  /** Change the field to not being actively set: AmountReductionId (BILL_INVOICE_DETAIL.amount_reduction_id)
   */
  public void unsetAmountReductionId () {
    this._AmountReductionIdSet = false;
  }
  /** See if the field is actively set: AmountReductionId (BILL_INVOICE_DETAIL.amount_reduction_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetAmountReductionId () {
    return this._AmountReductionIdSet;
  }
  /** set the fields value: ZoneClass (BILL_INVOICE_DETAIL.zone_class)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ZoneClass") 
  public void setZoneClass (Integer value) throws ServiceException
  {
    this.ZoneClass = value;
    this._ZoneClassSet = true;
  }

  /** Retrieves the ZoneClass field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ZoneClass field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ZoneClass field
   */
   public String getZoneClassAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getZoneClassAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getZoneClassAsFormattedString");
       return fmtMgr.formatNumber(this.getZoneClass(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ZoneClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getZoneClassAsFormattedString");
       throw x;
     }
   }
  /** Sets the ZoneClass field from a formatted string
   *
   * @param _value the ZoneClass field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ZoneClass field
   */
   public void setZoneClassFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getZoneClassFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setZoneClass(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ZoneClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setZoneClassFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setZoneClassFromFormattedString");
   }

  /** get the value of the field: ZoneClass (BILL_INVOICE_DETAIL.zone_class)
   * @return Integer the value
   */
  public Integer getZoneClass () {
    return this.ZoneClass;
  }
  /** Change the field to not being actively set: ZoneClass (BILL_INVOICE_DETAIL.zone_class)
   */
  public void unsetZoneClass () {
    this._ZoneClassSet = false;
  }
  /** See if the field is actively set: ZoneClass (BILL_INVOICE_DETAIL.zone_class)
   * @return boolean whether the field is actively set
   */
  public boolean issetZoneClass () {
    return this._ZoneClassSet;
  }
  /** set the fields value: BillClass (BILL_INVOICE_DETAIL.bill_class)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillClass") 
  public void setBillClass (Integer value) throws ServiceException
  {
    this.BillClass = value;
    this._BillClassSet = true;
  }

  /** Retrieves the BillClass field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillClass field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillClass field
   */
   public String getBillClassAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillClassAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillClassAsFormattedString");
       return fmtMgr.formatNumber(this.getBillClass(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillClassAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillClass field from a formatted string
   *
   * @param _value the BillClass field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillClass field
   */
   public void setBillClassFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillClassFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillClass(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillClassFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillClassFromFormattedString");
   }

  /** get the value of the field: BillClass (BILL_INVOICE_DETAIL.bill_class)
   * @return Integer the value
   */
  public Integer getBillClass () {
    return this.BillClass;
  }
  /** Change the field to not being actively set: BillClass (BILL_INVOICE_DETAIL.bill_class)
   */
  public void unsetBillClass () {
    this._BillClassSet = false;
  }
  /** See if the field is actively set: BillClass (BILL_INVOICE_DETAIL.bill_class)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillClass () {
    return this._BillClassSet;
  }
  /** set the fields value: InclusiveTax (BILL_INVOICE_DETAIL.inclusive_tax)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("InclusiveTax") 
  public void setInclusiveTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "InclusiveTax", "setInclusiveTax");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "InclusiveTax", "setInclusiveTax");
    }
    this.InclusiveTax = value;
    this._InclusiveTaxSet = true;
  }

  /** Retrieves the InclusiveTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InclusiveTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InclusiveTax field
   */
   public String getInclusiveTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInclusiveTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInclusiveTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getInclusiveTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InclusiveTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInclusiveTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the InclusiveTax field from a formatted string
   *
   * @param _value the InclusiveTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InclusiveTax field
   */
   public void setInclusiveTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInclusiveTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInclusiveTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InclusiveTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInclusiveTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInclusiveTaxFromFormattedString");
   }

  /**
   * Retrieves the InclusiveTax field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InclusiveTax field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the InclusiveTax field
   */
  public String getInclusiveTaxAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInclusiveTaxAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInclusiveTaxAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getInclusiveTax(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InclusiveTax");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInclusiveTaxAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the InclusiveTax field value from a formatted currency string
   *
   * @param _value the InclusiveTax field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InclusiveTax field
   */
  public void setInclusiveTaxFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInclusiveTaxFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setInclusiveTax(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InclusiveTax");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInclusiveTaxFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInclusiveTaxFromFormattedCurrencyString");
  }

  /** get the value of the field: InclusiveTax (BILL_INVOICE_DETAIL.inclusive_tax)
   * @return BigInteger the value
   */
  public BigInteger getInclusiveTax () {
    return this.InclusiveTax;
  }
  /** Change the field to not being actively set: InclusiveTax (BILL_INVOICE_DETAIL.inclusive_tax)
   */
  public void unsetInclusiveTax () {
    this._InclusiveTaxSet = false;
  }
  /** See if the field is actively set: InclusiveTax (BILL_INVOICE_DETAIL.inclusive_tax)
   * @return boolean whether the field is actively set
   */
  public boolean issetInclusiveTax () {
    return this._InclusiveTaxSet;
  }
  /** set the fields value: PcmActiveDt (BILL_INVOICE_DETAIL.pcm_active_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PcmActiveDt") 
  public void setPcmActiveDt (Date value) throws ServiceException
  {
    this.PcmActiveDt = value;
    this._PcmActiveDtSet = true;
  }

  /** Retrieves the PcmActiveDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PcmActiveDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PcmActiveDt field
   */
   public String getPcmActiveDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPcmActiveDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPcmActiveDtAsFormattedString");
       return fmtMgr.formatDate(this.getPcmActiveDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PcmActiveDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPcmActiveDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the PcmActiveDt field from a formatted string
   *
   * @param _value the PcmActiveDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PcmActiveDt field
   */
   public void setPcmActiveDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPcmActiveDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPcmActiveDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PcmActiveDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPcmActiveDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPcmActiveDtFromFormattedString");
   }

  /**
   * Retrieves the PcmActiveDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PcmActiveDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the PcmActiveDt field
   */
  public String getPcmActiveDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPcmActiveDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPcmActiveDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getPcmActiveDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PcmActiveDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPcmActiveDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the PcmActiveDt field value from a formatted date/time string
   *
   * @param _value the PcmActiveDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PcmActiveDt field
   */
  public void setPcmActiveDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPcmActiveDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setPcmActiveDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PcmActiveDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPcmActiveDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: PcmActiveDt (BILL_INVOICE_DETAIL.pcm_active_dt)
   * @return Date the value
   */
  public Date getPcmActiveDt () {
    return this.PcmActiveDt;
  }
  /** Change the field to not being actively set: PcmActiveDt (BILL_INVOICE_DETAIL.pcm_active_dt)
   */
  public void unsetPcmActiveDt () {
    this._PcmActiveDtSet = false;
  }
  /** See if the field is actively set: PcmActiveDt (BILL_INVOICE_DETAIL.pcm_active_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetPcmActiveDt () {
    return this._PcmActiveDtSet;
  }
  /** set the fields value: MiscNumber1 (BILL_INVOICE_DETAIL.misc_number1)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MiscNumber1") 
  public void setMiscNumber1 (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "MiscNumber1", "setMiscNumber1");
    }
    this.MiscNumber1 = value;
    this._MiscNumber1Set = true;
  }

  /** Retrieves the MiscNumber1 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MiscNumber1 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MiscNumber1 field
   */
   public String getMiscNumber1AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMiscNumber1AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMiscNumber1AsFormattedString");
       return fmtMgr.formatBigInteger(this.getMiscNumber1(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MiscNumber1");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMiscNumber1AsFormattedString");
       throw x;
     }
   }
  /** Sets the MiscNumber1 field from a formatted string
   *
   * @param _value the MiscNumber1 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MiscNumber1 field
   */
   public void setMiscNumber1FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMiscNumber1FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMiscNumber1(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MiscNumber1");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMiscNumber1FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMiscNumber1FromFormattedString");
   }

  /**
   * Retrieves the MiscNumber1 field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MiscNumber1 field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the MiscNumber1 field
   */
  public String getMiscNumber1AsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMiscNumber1AsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMiscNumber1AsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getMiscNumber1(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MiscNumber1");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMiscNumber1AsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the MiscNumber1 field value from a formatted currency string
   *
   * @param _value the MiscNumber1 field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MiscNumber1 field
   */
  public void setMiscNumber1FromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMiscNumber1FromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setMiscNumber1(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MiscNumber1");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMiscNumber1FromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMiscNumber1FromFormattedCurrencyString");
  }

  /** get the value of the field: MiscNumber1 (BILL_INVOICE_DETAIL.misc_number1)
   * @return BigInteger the value
   */
  public BigInteger getMiscNumber1 () {
    return this.MiscNumber1;
  }
  /** Change the field to not being actively set: MiscNumber1 (BILL_INVOICE_DETAIL.misc_number1)
   */
  public void unsetMiscNumber1 () {
    this._MiscNumber1Set = false;
  }
  /** See if the field is actively set: MiscNumber1 (BILL_INVOICE_DETAIL.misc_number1)
   * @return boolean whether the field is actively set
   */
  public boolean issetMiscNumber1 () {
    return this._MiscNumber1Set;
  }
  /** set the fields value: MiscNumber2 (BILL_INVOICE_DETAIL.misc_number2)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MiscNumber2") 
  public void setMiscNumber2 (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "MiscNumber2", "setMiscNumber2");
    }
    this.MiscNumber2 = value;
    this._MiscNumber2Set = true;
  }

  /** Retrieves the MiscNumber2 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MiscNumber2 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MiscNumber2 field
   */
   public String getMiscNumber2AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMiscNumber2AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMiscNumber2AsFormattedString");
       return fmtMgr.formatBigInteger(this.getMiscNumber2(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MiscNumber2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMiscNumber2AsFormattedString");
       throw x;
     }
   }
  /** Sets the MiscNumber2 field from a formatted string
   *
   * @param _value the MiscNumber2 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MiscNumber2 field
   */
   public void setMiscNumber2FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMiscNumber2FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMiscNumber2(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MiscNumber2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMiscNumber2FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMiscNumber2FromFormattedString");
   }

  /**
   * Retrieves the MiscNumber2 field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MiscNumber2 field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the MiscNumber2 field
   */
  public String getMiscNumber2AsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMiscNumber2AsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMiscNumber2AsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getMiscNumber2(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MiscNumber2");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMiscNumber2AsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the MiscNumber2 field value from a formatted currency string
   *
   * @param _value the MiscNumber2 field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MiscNumber2 field
   */
  public void setMiscNumber2FromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMiscNumber2FromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setMiscNumber2(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MiscNumber2");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMiscNumber2FromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMiscNumber2FromFormattedCurrencyString");
  }

  /** get the value of the field: MiscNumber2 (BILL_INVOICE_DETAIL.misc_number2)
   * @return BigInteger the value
   */
  public BigInteger getMiscNumber2 () {
    return this.MiscNumber2;
  }
  /** Change the field to not being actively set: MiscNumber2 (BILL_INVOICE_DETAIL.misc_number2)
   */
  public void unsetMiscNumber2 () {
    this._MiscNumber2Set = false;
  }
  /** See if the field is actively set: MiscNumber2 (BILL_INVOICE_DETAIL.misc_number2)
   * @return boolean whether the field is actively set
   */
  public boolean issetMiscNumber2 () {
    return this._MiscNumber2Set;
  }
  /** set the fields value: LobId (BILL_INVOICE_DETAIL.lob_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("LobId") 
  public void setLobId (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "LobId", "setLobId");
    }
    this.LobId = value;
    this._LobIdSet = true;
  }

  /** Retrieves the LobId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The LobId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LobId field
   */
   public String getLobIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLobIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLobIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getLobId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LobId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getLobIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the LobId field from a formatted string
   *
   * @param _value the LobId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the LobId field
   */
   public void setLobIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLobIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setLobId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LobId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setLobIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLobIdFromFormattedString");
   }

  /** get the value of the field: LobId (BILL_INVOICE_DETAIL.lob_id)
   * @return BigInteger the value
   */
  public BigInteger getLobId () {
    return this.LobId;
  }
  /** Change the field to not being actively set: LobId (BILL_INVOICE_DETAIL.lob_id)
   */
  public void unsetLobId () {
    this._LobIdSet = false;
  }
  /** See if the field is actively set: LobId (BILL_INVOICE_DETAIL.lob_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetLobId () {
    return this._LobIdSet;
  }
  /** set the fields value: DescriptionGroup (DESCRIPTIONS.description_group)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DescriptionGroup") 
  public void setDescriptionGroup (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DescriptionGroup", "setDescriptionGroup");
    }
    this.DescriptionGroup = value;
    this._DescriptionGroupSet = true;
  }

  /** Retrieves the DescriptionGroup field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DescriptionGroup field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DescriptionGroup field
   */
   public String getDescriptionGroupAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDescriptionGroupAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDescriptionGroupAsFormattedString");
       return fmtMgr.formatNumber(this.getDescriptionGroup(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DescriptionGroup");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDescriptionGroupAsFormattedString");
       throw x;
     }
   }
  /** Sets the DescriptionGroup field from a formatted string
   *
   * @param _value the DescriptionGroup field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DescriptionGroup field
   */
   public void setDescriptionGroupFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDescriptionGroupFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDescriptionGroup(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DescriptionGroup");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDescriptionGroupFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDescriptionGroupFromFormattedString");
   }

  /** get the value of the field: DescriptionGroup (DESCRIPTIONS.description_group)
   * @return Integer the value
   */
  public Integer getDescriptionGroup () {
    return this.DescriptionGroup;
  }
  /** Change the field to not being actively set: DescriptionGroup (DESCRIPTIONS.description_group)
   */
  public void unsetDescriptionGroup () {
    this._DescriptionGroupSet = false;
  }
  /** See if the field is actively set: DescriptionGroup (DESCRIPTIONS.description_group)
   * @return boolean whether the field is actively set
   */
  public boolean issetDescriptionGroup () {
    return this._DescriptionGroupSet;
  }
  /** set the fields value: DescriptionText (DESCRIPTIONS.description_text)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DescriptionText") 
  public void setDescriptionText (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DescriptionText", "setDescriptionText");
    }
    if (value != null && !DataHelper.validLength (value, 80))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "DescriptionText", "setDescriptionText");
    }
    this.DescriptionText = value;
    this._DescriptionTextSet = true;
  }

  /** Retrieves the DescriptionText field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DescriptionText field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DescriptionText field
   */
   public String getDescriptionTextAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDescriptionTextAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDescriptionTextAsFormattedString");
       return fmtMgr.formatString(this.getDescriptionText());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DescriptionText");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDescriptionTextAsFormattedString");
       throw x;
     }
   }
  /** Sets the DescriptionText field from a formatted string
   *
   * @param _value the DescriptionText field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DescriptionText field
   */
   public void setDescriptionTextFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDescriptionTextFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDescriptionText(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DescriptionText");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDescriptionTextFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDescriptionTextFromFormattedString");
   }

  /** get the value of the field: DescriptionText (DESCRIPTIONS.description_text)
   * @return String the value
   */
  public String getDescriptionText () {
    return this.DescriptionText;
  }
  /** Change the field to not being actively set: DescriptionText (DESCRIPTIONS.description_text)
   */
  public void unsetDescriptionText () {
    this._DescriptionTextSet = false;
  }
  /** See if the field is actively set: DescriptionText (DESCRIPTIONS.description_text)
   * @return boolean whether the field is actively set
   */
  public boolean issetDescriptionText () {
    return this._DescriptionTextSet;
  }
  /** set the fields value: ShortDescriptionText (DESCRIPTIONS.short_description_text)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ShortDescriptionText") 
  public void setShortDescriptionText (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 5))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ShortDescriptionText", "setShortDescriptionText");
    }
    this.ShortDescriptionText = value;
    this._ShortDescriptionTextSet = true;
  }

  /** Retrieves the ShortDescriptionText field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ShortDescriptionText field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ShortDescriptionText field
   */
   public String getShortDescriptionTextAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getShortDescriptionTextAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getShortDescriptionTextAsFormattedString");
       return fmtMgr.formatString(this.getShortDescriptionText());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ShortDescriptionText");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getShortDescriptionTextAsFormattedString");
       throw x;
     }
   }
  /** Sets the ShortDescriptionText field from a formatted string
   *
   * @param _value the ShortDescriptionText field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ShortDescriptionText field
   */
   public void setShortDescriptionTextFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getShortDescriptionTextFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setShortDescriptionText(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ShortDescriptionText");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setShortDescriptionTextFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setShortDescriptionTextFromFormattedString");
   }

  /** get the value of the field: ShortDescriptionText (DESCRIPTIONS.short_description_text)
   * @return String the value
   */
  public String getShortDescriptionText () {
    return this.ShortDescriptionText;
  }
  /** Change the field to not being actively set: ShortDescriptionText (DESCRIPTIONS.short_description_text)
   */
  public void unsetShortDescriptionText () {
    this._ShortDescriptionTextSet = false;
  }
  /** See if the field is actively set: ShortDescriptionText (DESCRIPTIONS.short_description_text)
   * @return boolean whether the field is actively set
   */
  public boolean issetShortDescriptionText () {
    return this._ShortDescriptionTextSet;
  }
  public String toString() {
    return InvoiceDetailObjectHelper.toMap(this, null).toString();
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
  /** BILL_INVOICE.currency_code field */
    if(!nonNullOnly || (CurrencyCode != null))  _CurrencyCodeSet = flag;
  /** BILL_INVOICE.account_no field */
    if(!nonNullOnly || (AccountInternalId != null))  _AccountInternalIdSet = flag;
  /** BILL_INVOICE.statement_date field */
    if(!nonNullOnly || (StatementDate != null))  _StatementDateSet = flag;
  /** BILL_INVOICE.bill_sequence_num field */
    if(!nonNullOnly || (BillSequenceNum != null))  _BillSequenceNumSet = flag;
  /** CUSTOMER_ID_EQUIP_MAP_VIEW.external_id field */
    if(!nonNullOnly || (ServiceExternalId != null))  _ServiceExternalIdSet = flag;
  /** CUSTOMER_ID_EQUIP_MAP_VIEW.external_id_type field */
    if(!nonNullOnly || (ServiceExternalIdType != null))  _ServiceExternalIdTypeSet = flag;
  /** CUSTOMER_ID_ACCT_MAP.external_id field */
    if(!nonNullOnly || (AccountExternalId != null))  _AccountExternalIdSet = flag;
  /** CUSTOMER_ID_ACCT_MAP.external_id_type field */
    if(!nonNullOnly || (AccountExternalIdType != null))  _AccountExternalIdTypeSet = flag;
  /** ServerId field */
    if (!nonNullOnly || (ServerId != null)) _ServerIdSet = flag;
  /** BILL_INVOICE_DETAIL.process_num field */
    if(!nonNullOnly || (ProcessNum != null))  _ProcessNumSet = flag;
  /** BILL_INVOICE_DETAIL.package_id field */
    if(!nonNullOnly || (PackageId != null))  _PackageIdSet = flag;
  /** BILL_INVOICE_DETAIL.component_id field */
    if(!nonNullOnly || (ComponentId != null))  _ComponentIdSet = flag;
  /** BILL_INVOICE_DETAIL.type_code field */
    if(!nonNullOnly || (TypeCode != null))  _TypeCodeSet = flag;
  /** BILL_INVOICE_DETAIL.subtype_code field */
    if(!nonNullOnly || (SubtypeCode != null))  _SubtypeCodeSet = flag;
  /** BILL_INVOICE_DETAIL.tracking_id field */
    if(!nonNullOnly || (TrackingId != null))  _TrackingIdSet = flag;
  /** BILL_INVOICE_DETAIL.tracking_id_serv field */
    if(!nonNullOnly || (TrackingIdServ != null))  _TrackingIdServSet = flag;
  /** BILL_INVOICE_DETAIL.tracking_date field */
    if(!nonNullOnly || (TrackingDate != null))  _TrackingDateSet = flag;
  /** BILL_INVOICE_DETAIL.prep_sequence field */
    if(!nonNullOnly || (PrepSequence != null))  _PrepSequenceSet = flag;
  /** BILL_INVOICE_DETAIL.prorate_code field */
    if(!nonNullOnly || (ProrateCode != null))  _ProrateCodeSet = flag;
  /** BILL_INVOICE_DETAIL.billing_level field */
    if(!nonNullOnly || (BillingLevel != null))  _BillingLevelSet = flag;
  /** BILL_INVOICE_DETAIL.billing_category field */
    if(!nonNullOnly || (BillingCategory != null))  _BillingCategorySet = flag;
  /** BILL_INVOICE_DETAIL.amount field */
    if(!nonNullOnly || (Amount != null))  _AmountSet = flag;
  /** BILL_INVOICE_DETAIL.rated_amount field */
    if(!nonNullOnly || (RatedAmount != null))  _RatedAmountSet = flag;
  /** BILL_INVOICE_DETAIL.secondary_amount field */
    if(!nonNullOnly || (SecondaryAmount != null))  _SecondaryAmountSet = flag;
  /** BILL_INVOICE_DETAIL.rate_currency_code field */
    if(!nonNullOnly || (RateCurrencyCode != null))  _RateCurrencyCodeSet = flag;
  /** BILL_INVOICE_DETAIL.units field */
    if(!nonNullOnly || (Units != null))  _UnitsSet = flag;
  /** BILL_INVOICE_DETAIL.tax field */
    if(!nonNullOnly || (Tax != null))  _TaxSet = flag;
  /** BILL_INVOICE_DETAIL.tax_rate field */
    if(!nonNullOnly || (TaxRate != null))  _TaxRateSet = flag;
  /** BILL_INVOICE_DETAIL.tax_pkg_inst_id field */
    if(!nonNullOnly || (TaxPkgInstId != null))  _TaxPkgInstIdSet = flag;
  /** BILL_INVOICE_DETAIL.discount field */
    if(!nonNullOnly || (Discount != null))  _DiscountSet = flag;
  /** BILL_INVOICE_DETAIL.discount_id field */
    if(!nonNullOnly || (DiscountId != null))  _DiscountIdSet = flag;
  /** BILL_INVOICE_DETAIL.trans_date field */
    if(!nonNullOnly || (TransDate != null))  _TransDateSet = flag;
  /** BILL_INVOICE_DETAIL.provider_id field */
    if(!nonNullOnly || (ProviderId != null))  _ProviderIdSet = flag;
  /** BILL_INVOICE_DETAIL.element_id field */
    if(!nonNullOnly || (ElementId != null))  _ElementIdSet = flag;
  /** BILL_INVOICE_DETAIL.product_line_id field */
    if(!nonNullOnly || (ProductLineId != null))  _ProductLineIdSet = flag;
  /** BILL_INVOICE_DETAIL.description_code field */
    if(!nonNullOnly || (DescriptionCode != null))  _DescriptionCodeSet = flag;
  /** BILL_INVOICE_DETAIL.rate_type field */
    if(!nonNullOnly || (RateType != null))  _RateTypeSet = flag;
  /** BILL_INVOICE_DETAIL.rate_period field */
    if(!nonNullOnly || (RatePeriod != null))  _RatePeriodSet = flag;
  /** BILL_INVOICE_DETAIL.subscr_no field */
    if(!nonNullOnly || (ServiceInternalId != null))  _ServiceInternalIdSet = flag;
  /** BILL_INVOICE_DETAIL.subscr_no_resets field */
    if(!nonNullOnly || (ServiceInternalIdResets != null))  _ServiceInternalIdResetsSet = flag;
  /** BILL_INVOICE_DETAIL.equip_status field */
    if(!nonNullOnly || (EquipStatus != null))  _EquipStatusSet = flag;
  /** BILL_INVOICE_DETAIL.from_date field */
    if(!nonNullOnly || (FromDate != null))  _FromDateSet = flag;
  /** BILL_INVOICE_DETAIL.to_date field */
    if(!nonNullOnly || (ToDate != null))  _ToDateSet = flag;
  /** BILL_INVOICE_DETAIL.annotation field */
    if(!nonNullOnly || (Annotation != null))  _AnnotationSet = flag;
  /** BILL_INVOICE_DETAIL.profile_id field */
    if(!nonNullOnly || (ProfileId != null))  _ProfileIdSet = flag;
  /** BILL_INVOICE_DETAIL.geocode field */
    if(!nonNullOnly || (Geocode != null))  _GeocodeSet = flag;
  /** BILL_INVOICE_DETAIL.aux_tax_info field */
    if(!nonNullOnly || (AuxTaxInfo != null))  _AuxTaxInfoSet = flag;
  /** BILL_INVOICE_DETAIL.federal_tax field */
    if(!nonNullOnly || (FederalTax != null))  _FederalTaxSet = flag;
  /** BILL_INVOICE_DETAIL.state_tax field */
    if(!nonNullOnly || (StateTax != null))  _StateTaxSet = flag;
  /** BILL_INVOICE_DETAIL.county_tax field */
    if(!nonNullOnly || (CountyTax != null))  _CountyTaxSet = flag;
  /** BILL_INVOICE_DETAIL.city_tax field */
    if(!nonNullOnly || (CityTax != null))  _CityTaxSet = flag;
  /** BILL_INVOICE_DETAIL.other_tax field */
    if(!nonNullOnly || (OtherTax != null))  _OtherTaxSet = flag;
  /** BILL_INVOICE_DETAIL.test_flag field */
    if(!nonNullOnly || (TestFlag != null))  _TestFlagSet = flag;
  /** BILL_INVOICE_DETAIL.arch_flag field */
    if(!nonNullOnly || (ArchFlag != null))  _ArchFlagSet = flag;
  /** BILL_INVOICE_DETAIL.rev_rcv_cost_ctr field */
    if(!nonNullOnly || (RevRcvCostCtr != null))  _RevRcvCostCtrSet = flag;
  /** BILL_INVOICE_DETAIL.b_rev_rcv_cost_ctr field */
    if(!nonNullOnly || (BRevRcvCostCtr != null))  _BRevRcvCostCtrSet = flag;
  /** BILL_INVOICE_DETAIL.aggr_usage_id field */
    if(!nonNullOnly || (AggrUsageId != null))  _AggrUsageIdSet = flag;
  /** BILL_INVOICE_DETAIL.tax_type_code field */
    if(!nonNullOnly || (TaxTypeCode != null))  _TaxTypeCodeSet = flag;
  /** BILL_INVOICE_DETAIL.open_item_id field */
    if(!nonNullOnly || (OpenItemId != null))  _OpenItemIdSet = flag;
  /** BILL_INVOICE_DETAIL.amount_reduction field */
    if(!nonNullOnly || (AmountReduction != null))  _AmountReductionSet = flag;
  /** BILL_INVOICE_DETAIL.amount_reduction_id field */
    if(!nonNullOnly || (AmountReductionId != null))  _AmountReductionIdSet = flag;
  /** BILL_INVOICE_DETAIL.zone_class field */
    if(!nonNullOnly || (ZoneClass != null))  _ZoneClassSet = flag;
  /** BILL_INVOICE_DETAIL.bill_class field */
    if(!nonNullOnly || (BillClass != null))  _BillClassSet = flag;
  /** BILL_INVOICE_DETAIL.inclusive_tax field */
    if(!nonNullOnly || (InclusiveTax != null))  _InclusiveTaxSet = flag;
  /** BILL_INVOICE_DETAIL.pcm_active_dt field */
    if(!nonNullOnly || (PcmActiveDt != null))  _PcmActiveDtSet = flag;
  /** BILL_INVOICE_DETAIL.misc_number1 field */
    if(!nonNullOnly || (MiscNumber1 != null))  _MiscNumber1Set = flag;
  /** BILL_INVOICE_DETAIL.misc_number2 field */
    if(!nonNullOnly || (MiscNumber2 != null))  _MiscNumber2Set = flag;
  /** BILL_INVOICE_DETAIL.lob_id field */
    if(!nonNullOnly || (LobId != null))  _LobIdSet = flag;
  /** DESCRIPTIONS.description_group field */
    if(!nonNullOnly || (DescriptionGroup != null))  _DescriptionGroupSet = flag;
  /** DESCRIPTIONS.description_text field */
    if(!nonNullOnly || (DescriptionText != null))  _DescriptionTextSet = flag;
  /** DESCRIPTIONS.short_description_text field */
    if(!nonNullOnly || (ShortDescriptionText != null))  _ShortDescriptionTextSet = flag;
  }
}
