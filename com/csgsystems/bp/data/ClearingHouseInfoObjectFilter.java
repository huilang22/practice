/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ClearingHouseInfoObjectFilter.java
 * Definition File: Admin/ClearingHouseInfo.xml
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
public class ClearingHouseInfoObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public ClearingHouseInfoObjectKeyFilter Key = null;
  /** raw field for: CLEARING_HOUSE_ID_REF.is_default) */
  public    BooleanFilter[] IsDefault  = null;
  protected boolean IsDefaultFetch = false;
  protected boolean IsDefaultSortAscending = true;
  protected Integer IsDefaultSort = null;
  /** raw field for: CLEARING_HOUSE_ID_REF.is_internal) */
  public    BooleanFilter[] IsInternal  = null;
  protected boolean IsInternalFetch = false;
  protected boolean IsInternalSortAscending = true;
  protected Integer IsInternalSort = null;
  /** raw field for: CLEARING_HOUSE_ID_REF.config_tag_id) */
  public    StringFilter[] ConfigTagId  = null;
  protected boolean ConfigTagIdFetch = false;
  protected boolean ConfigTagIdSortAscending = true;
  protected boolean ConfigTagIdCaseInsensitive = false;
  protected Integer ConfigTagIdSort = null;
  /** raw field for: CLEARING_HOUSE_ID_VALUES.short_display) */
  public    StringFilter[] ShortDisplay  = null;
  protected boolean ShortDisplayFetch = false;
  protected boolean ShortDisplaySortAscending = true;
  protected boolean ShortDisplayCaseInsensitive = false;
  protected Integer ShortDisplaySort = null;
  /** raw field for: CLEARING_HOUSE_ID_VALUES.display_value) */
  public    StringFilter[] DisplayValue  = null;
  protected boolean DisplayValueFetch = false;
  protected boolean DisplayValueSortAscending = true;
  protected boolean DisplayValueCaseInsensitive = false;
  protected Integer DisplayValueSort = null;
  /** raw field for: CLEARING_HOUSE_INFO.ckf_client_id) */
  public    StringFilter[] CkfClientId  = null;
  protected boolean CkfClientIdFetch = false;
  protected boolean CkfClientIdSortAscending = true;
  protected boolean CkfClientIdCaseInsensitive = false;
  protected Integer CkfClientIdSort = null;
  /** raw field for: CLEARING_HOUSE_INFO.ckf_var_descriptor) */
  public    StringFilter[] CkfVarDescriptor  = null;
  protected boolean CkfVarDescriptorFetch = false;
  protected boolean CkfVarDescriptorSortAscending = true;
  protected boolean CkfVarDescriptorCaseInsensitive = false;
  protected Integer CkfVarDescriptorSort = null;
  /** raw field for: CLEARING_HOUSE_INFO.knn_merchant_acct) */
  public    StringFilter[] KnnMerchantAcct  = null;
  protected boolean KnnMerchantAcctFetch = false;
  protected boolean KnnMerchantAcctSortAscending = true;
  protected boolean KnnMerchantAcctCaseInsensitive = false;
  protected Integer KnnMerchantAcctSort = null;
  /** raw field for: CLEARING_HOUSE_INFO.knn_merchant_id) */
  public    StringFilter[] KnnMerchantId  = null;
  protected boolean KnnMerchantIdFetch = false;
  protected boolean KnnMerchantIdSortAscending = true;
  protected boolean KnnMerchantIdCaseInsensitive = false;
  protected Integer KnnMerchantIdSort = null;
  /** raw field for: CLEARING_HOUSE_INFO.fus_pres_id) */
  public    StringFilter[] FusPresId  = null;
  protected boolean FusPresIdFetch = false;
  protected boolean FusPresIdSortAscending = true;
  protected boolean FusPresIdCaseInsensitive = false;
  protected Integer FusPresIdSort = null;
  /** raw field for: CLEARING_HOUSE_INFO.fus_pres_pass) */
  public    StringFilter[] FusPresPass  = null;
  protected boolean FusPresPassFetch = false;
  protected boolean FusPresPassSortAscending = true;
  protected boolean FusPresPassCaseInsensitive = false;
  protected Integer FusPresPassSort = null;
  /** raw field for: CLEARING_HOUSE_INFO.fus_sub_id) */
  public    StringFilter[] FusSubId  = null;
  protected boolean FusSubIdFetch = false;
  protected boolean FusSubIdSortAscending = true;
  protected boolean FusSubIdCaseInsensitive = false;
  protected Integer FusSubIdSort = null;
  /** raw field for: CLEARING_HOUSE_INFO.fus_sub_pass) */
  public    StringFilter[] FusSubPass  = null;
  protected boolean FusSubPassFetch = false;
  protected boolean FusSubPassSortAscending = true;
  protected boolean FusSubPassCaseInsensitive = false;
  protected Integer FusSubPassSort = null;
  /** raw field for: CLEARING_HOUSE_INFO.fus_avs_type) */
  public    IntegerFilter[] FusAvsType  = null;
  protected boolean FusAvsTypeFetch = false;
  protected boolean FusAvsTypeSortAscending = true;
  protected Integer FusAvsTypeSort = null;
  /** raw field for: CLEARING_HOUSE_INFO.frn_unique_dates) */
  public    BooleanFilter[] FrnUniqueDates  = null;
  protected boolean FrnUniqueDatesFetch = false;
  protected boolean FrnUniqueDatesSortAscending = true;
  protected Integer FrnUniqueDatesSort = null;
  /** raw field for: CLEARING_HOUSE_INFO.frn_fast_mode) */
  public    BooleanFilter[] FrnFastMode  = null;
  protected boolean FrnFastModeFetch = false;
  protected boolean FrnFastModeSortAscending = true;
  protected Integer FrnFastModeSort = null;
  /** raw field for: CLEARING_HOUSE_INFO.frn_norm_op_id) */
  public    StringFilter[] FrnNormOpId  = null;
  protected boolean FrnNormOpIdFetch = false;
  protected boolean FrnNormOpIdSortAscending = true;
  protected boolean FrnNormOpIdCaseInsensitive = false;
  protected Integer FrnNormOpIdSort = null;
  /** raw field for: CLEARING_HOUSE_INFO.frn_norm_post_delay) */
  public    IntegerFilter[] FrnNormPostDelay  = null;
  protected boolean FrnNormPostDelayFetch = false;
  protected boolean FrnNormPostDelaySortAscending = true;
  protected Integer FrnNormPostDelaySort = null;
  /** raw field for: CLEARING_HOUSE_INFO.frn_fast_op_id) */
  public    StringFilter[] FrnFastOpId  = null;
  protected boolean FrnFastOpIdFetch = false;
  protected boolean FrnFastOpIdSortAscending = true;
  protected boolean FrnFastOpIdCaseInsensitive = false;
  protected Integer FrnFastOpIdSort = null;
  /** raw field for: CLEARING_HOUSE_INFO.frn_fast_post_delay) */
  public    IntegerFilter[] FrnFastPostDelay  = null;
  protected boolean FrnFastPostDelayFetch = false;
  protected boolean FrnFastPostDelaySortAscending = true;
  protected Integer FrnFastPostDelaySort = null;
  /** raw field for: CLEARING_HOUSE_INFO.frn_national_num) */
  public    StringFilter[] FrnNationalNum  = null;
  protected boolean FrnNationalNumFetch = false;
  protected boolean FrnNationalNumSortAscending = true;
  protected boolean FrnNationalNumCaseInsensitive = false;
  protected Integer FrnNationalNumSort = null;
  /** raw field for: CLEARING_HOUSE_INFO.frn_company_name) */
  public    StringFilter[] FrnCompanyName  = null;
  protected boolean FrnCompanyNameFetch = false;
  protected boolean FrnCompanyNameSortAscending = true;
  protected boolean FrnCompanyNameCaseInsensitive = false;
  protected Integer FrnCompanyNameSort = null;
  /** raw field for: CLEARING_HOUSE_INFO.frn_agency_code) */
  public    StringFilter[] FrnAgencyCode  = null;
  protected boolean FrnAgencyCodeFetch = false;
  protected boolean FrnAgencyCodeSortAscending = true;
  protected boolean FrnAgencyCodeCaseInsensitive = false;
  protected Integer FrnAgencyCodeSort = null;
  /** raw field for: CLEARING_HOUSE_INFO.frn_account_num) */
  public    StringFilter[] FrnAccountNum  = null;
  protected boolean FrnAccountNumFetch = false;
  protected boolean FrnAccountNumSortAscending = true;
  protected boolean FrnAccountNumCaseInsensitive = false;
  protected Integer FrnAccountNumSort = null;
  /** raw field for: CLEARING_HOUSE_INFO.frn_bank_code) */
  public    StringFilter[] FrnBankCode  = null;
  protected boolean FrnBankCodeFetch = false;
  protected boolean FrnBankCodeSortAscending = true;
  protected boolean FrnBankCodeCaseInsensitive = false;
  protected Integer FrnBankCodeSort = null;
  /** raw field for: CLEARING_HOUSE_INFO.fdm_merchant_name) */
  public    StringFilter[] FdmMerchantName  = null;
  protected boolean FdmMerchantNameFetch = false;
  protected boolean FdmMerchantNameSortAscending = true;
  protected boolean FdmMerchantNameCaseInsensitive = false;
  protected Integer FdmMerchantNameSort = null;
  /** raw field for: CLEARING_HOUSE_INFO.fdm_merchant_number) */
  public    StringFilter[] FdmMerchantNumber  = null;
  protected boolean FdmMerchantNumberFetch = false;
  protected boolean FdmMerchantNumberSortAscending = true;
  protected boolean FdmMerchantNumberCaseInsensitive = false;
  protected Integer FdmMerchantNumberSort = null;
  /** raw field for: CLEARING_HOUSE_INFO.fdm_avs_type) */
  public    IntegerFilter[] FdmAvsType  = null;
  protected boolean FdmAvsTypeFetch = false;
  protected boolean FdmAvsTypeSortAscending = true;
  protected Integer FdmAvsTypeSort = null;
  /** raw field for: CLEARING_HOUSE_INFO.dom_rcon_number) */
  public    StringFilter[] DomRconNumber  = null;
  protected boolean DomRconNumberFetch = false;
  protected boolean DomRconNumberSortAscending = true;
  protected boolean DomRconNumberCaseInsensitive = false;
  protected Integer DomRconNumberSort = null;
  /** raw field for: CLEARING_HOUSE_INFO.dom_mailbox_id) */
  public    StringFilter[] DomMailboxId  = null;
  protected boolean DomMailboxIdFetch = false;
  protected boolean DomMailboxIdSortAscending = true;
  protected boolean DomMailboxIdCaseInsensitive = false;
  protected Integer DomMailboxIdSort = null;
  /** raw field for: CLEARING_HOUSE_INFO.dom_fund_orig) */
  public    StringFilter[] DomFundOrig  = null;
  protected boolean DomFundOrigFetch = false;
  protected boolean DomFundOrigSortAscending = true;
  protected boolean DomFundOrigCaseInsensitive = false;
  protected Integer DomFundOrigSort = null;
  /** raw field for: CLEARING_HOUSE_INFO.dom_fund_dest) */
  public    StringFilter[] DomFundDest  = null;
  protected boolean DomFundDestFetch = false;
  protected boolean DomFundDestSortAscending = true;
  protected boolean DomFundDestCaseInsensitive = false;
  protected Integer DomFundDestSort = null;
  /** raw field for: CLEARING_HOUSE_INFO.dom_visa_orig) */
  public    StringFilter[] DomVisaOrig  = null;
  protected boolean DomVisaOrigFetch = false;
  protected boolean DomVisaOrigSortAscending = true;
  protected boolean DomVisaOrigCaseInsensitive = false;
  protected Integer DomVisaOrigSort = null;
  /** raw field for: CLEARING_HOUSE_INFO.dom_visa_dest) */
  public    StringFilter[] DomVisaDest  = null;
  protected boolean DomVisaDestFetch = false;
  protected boolean DomVisaDestSortAscending = true;
  protected boolean DomVisaDestCaseInsensitive = false;
  protected Integer DomVisaDestSort = null;
  /** raw field for: CLEARING_HOUSE_INFO.dom_msc_orig) */
  public    StringFilter[] DomMscOrig  = null;
  protected boolean DomMscOrigFetch = false;
  protected boolean DomMscOrigSortAscending = true;
  protected boolean DomMscOrigCaseInsensitive = false;
  protected Integer DomMscOrigSort = null;
  /** raw field for: CLEARING_HOUSE_INFO.dom_msc_dest) */
  public    StringFilter[] DomMscDest  = null;
  protected boolean DomMscDestFetch = false;
  protected boolean DomMscDestSortAscending = true;
  protected boolean DomMscDestCaseInsensitive = false;
  protected Integer DomMscDestSort = null;
  /** raw field for: CLEARING_HOUSE_INFO.dom_amex_process_id) */
  public    StringFilter[] DomAmexProcessId  = null;
  protected boolean DomAmexProcessIdFetch = false;
  protected boolean DomAmexProcessIdSortAscending = true;
  protected boolean DomAmexProcessIdCaseInsensitive = false;
  protected Integer DomAmexProcessIdSort = null;
  /** raw field for: CLEARING_HOUSE_INFO.dom_amex_receiver_id) */
  public    StringFilter[] DomAmexReceiverId  = null;
  protected boolean DomAmexReceiverIdFetch = false;
  protected boolean DomAmexReceiverIdSortAscending = true;
  protected boolean DomAmexReceiverIdCaseInsensitive = false;
  protected Integer DomAmexReceiverIdSort = null;
  /** raw field for: CLEARING_HOUSE_INFO.dom_amex_format_code) */
  public    StringFilter[] DomAmexFormatCode  = null;
  protected boolean DomAmexFormatCodeFetch = false;
  protected boolean DomAmexFormatCodeSortAscending = true;
  protected boolean DomAmexFormatCodeCaseInsensitive = false;
  protected Integer DomAmexFormatCodeSort = null;
  /** raw field for: CLEARING_HOUSE_INFO.dom_phone_dest) */
  public    StringFilter[] DomPhoneDest  = null;
  protected boolean DomPhoneDestFetch = false;
  protected boolean DomPhoneDestSortAscending = true;
  protected boolean DomPhoneDestCaseInsensitive = false;
  protected Integer DomPhoneDestSort = null;
  /** raw field for: CLEARING_HOUSE_INFO.dom_currency_ind) */
  public    StringFilter[] DomCurrencyInd  = null;
  protected boolean DomCurrencyIndFetch = false;
  protected boolean DomCurrencyIndSortAscending = true;
  protected boolean DomCurrencyIndCaseInsensitive = false;
  protected Integer DomCurrencyIndSort = null;
  /** raw field for: CLEARING_HOUSE_INFO.dom_fund_inst_id) */
  public    StringFilter[] DomFundInstId  = null;
  protected boolean DomFundInstIdFetch = false;
  protected boolean DomFundInstIdSortAscending = true;
  protected boolean DomFundInstIdCaseInsensitive = false;
  protected Integer DomFundInstIdSort = null;
  /** raw field for: CLEARING_HOUSE_INFO.dom_fund_acct_num) */
  public    StringFilter[] DomFundAcctNum  = null;
  protected boolean DomFundAcctNumFetch = false;
  protected boolean DomFundAcctNumSortAscending = true;
  protected boolean DomFundAcctNumCaseInsensitive = false;
  protected Integer DomFundAcctNumSort = null;
  /** raw field for: CLEARING_HOUSE_INFO.dom_batch_limit) */
  public    IntegerFilter[] DomBatchLimit  = null;
  protected boolean DomBatchLimitFetch = false;
  protected boolean DomBatchLimitSortAscending = true;
  protected Integer DomBatchLimitSort = null;
  /** raw field for: CLEARING_HOUSE_INFO.dom_visa_merchant) */
  public    StringFilter[] DomVisaMerchant  = null;
  protected boolean DomVisaMerchantFetch = false;
  protected boolean DomVisaMerchantSortAscending = true;
  protected boolean DomVisaMerchantCaseInsensitive = false;
  protected Integer DomVisaMerchantSort = null;
  /** raw field for: CLEARING_HOUSE_INFO.dom_msc_merchant) */
  public    StringFilter[] DomMscMerchant  = null;
  protected boolean DomMscMerchantFetch = false;
  protected boolean DomMscMerchantSortAscending = true;
  protected boolean DomMscMerchantCaseInsensitive = false;
  protected Integer DomMscMerchantSort = null;
  /** raw field for: CLEARING_HOUSE_INFO.dom_amex_merchant) */
  public    StringFilter[] DomAmexMerchant  = null;
  protected boolean DomAmexMerchantFetch = false;
  protected boolean DomAmexMerchantSortAscending = true;
  protected boolean DomAmexMerchantCaseInsensitive = false;
  protected Integer DomAmexMerchantSort = null;
  private String _objName = "ClearingHouseInfoObjectFilter";
  /** default constructor */
  public ClearingHouseInfoObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public ClearingHouseInfoObjectFilter (ClearingHouseInfoObjectFilter other)
  {
    if (other == null) return;
    this.Key = new ClearingHouseInfoObjectKeyFilter (other.Key);
    this.IsDefault = other.IsDefault;
    this.IsDefaultFetch = other.IsDefaultFetch;
    this.IsDefaultSort = other.IsDefaultSort;
    this.IsDefaultSortAscending = other.IsDefaultSortAscending;
    this.IsInternal = other.IsInternal;
    this.IsInternalFetch = other.IsInternalFetch;
    this.IsInternalSort = other.IsInternalSort;
    this.IsInternalSortAscending = other.IsInternalSortAscending;
    this.ConfigTagId = other.ConfigTagId;
    this.ConfigTagIdFetch = other.ConfigTagIdFetch;
    this.ConfigTagIdSort = other.ConfigTagIdSort;
    this.ConfigTagIdCaseInsensitive = other.ConfigTagIdCaseInsensitive;
    this.ConfigTagIdSortAscending = other.ConfigTagIdSortAscending;
    this.ShortDisplay = other.ShortDisplay;
    this.ShortDisplayFetch = other.ShortDisplayFetch;
    this.ShortDisplaySort = other.ShortDisplaySort;
    this.ShortDisplayCaseInsensitive = other.ShortDisplayCaseInsensitive;
    this.ShortDisplaySortAscending = other.ShortDisplaySortAscending;
    this.DisplayValue = other.DisplayValue;
    this.DisplayValueFetch = other.DisplayValueFetch;
    this.DisplayValueSort = other.DisplayValueSort;
    this.DisplayValueCaseInsensitive = other.DisplayValueCaseInsensitive;
    this.DisplayValueSortAscending = other.DisplayValueSortAscending;
    this.CkfClientId = other.CkfClientId;
    this.CkfClientIdFetch = other.CkfClientIdFetch;
    this.CkfClientIdSort = other.CkfClientIdSort;
    this.CkfClientIdCaseInsensitive = other.CkfClientIdCaseInsensitive;
    this.CkfClientIdSortAscending = other.CkfClientIdSortAscending;
    this.CkfVarDescriptor = other.CkfVarDescriptor;
    this.CkfVarDescriptorFetch = other.CkfVarDescriptorFetch;
    this.CkfVarDescriptorSort = other.CkfVarDescriptorSort;
    this.CkfVarDescriptorCaseInsensitive = other.CkfVarDescriptorCaseInsensitive;
    this.CkfVarDescriptorSortAscending = other.CkfVarDescriptorSortAscending;
    this.KnnMerchantAcct = other.KnnMerchantAcct;
    this.KnnMerchantAcctFetch = other.KnnMerchantAcctFetch;
    this.KnnMerchantAcctSort = other.KnnMerchantAcctSort;
    this.KnnMerchantAcctCaseInsensitive = other.KnnMerchantAcctCaseInsensitive;
    this.KnnMerchantAcctSortAscending = other.KnnMerchantAcctSortAscending;
    this.KnnMerchantId = other.KnnMerchantId;
    this.KnnMerchantIdFetch = other.KnnMerchantIdFetch;
    this.KnnMerchantIdSort = other.KnnMerchantIdSort;
    this.KnnMerchantIdCaseInsensitive = other.KnnMerchantIdCaseInsensitive;
    this.KnnMerchantIdSortAscending = other.KnnMerchantIdSortAscending;
    this.FusPresId = other.FusPresId;
    this.FusPresIdFetch = other.FusPresIdFetch;
    this.FusPresIdSort = other.FusPresIdSort;
    this.FusPresIdCaseInsensitive = other.FusPresIdCaseInsensitive;
    this.FusPresIdSortAscending = other.FusPresIdSortAscending;
    this.FusPresPass = other.FusPresPass;
    this.FusPresPassFetch = other.FusPresPassFetch;
    this.FusPresPassSort = other.FusPresPassSort;
    this.FusPresPassCaseInsensitive = other.FusPresPassCaseInsensitive;
    this.FusPresPassSortAscending = other.FusPresPassSortAscending;
    this.FusSubId = other.FusSubId;
    this.FusSubIdFetch = other.FusSubIdFetch;
    this.FusSubIdSort = other.FusSubIdSort;
    this.FusSubIdCaseInsensitive = other.FusSubIdCaseInsensitive;
    this.FusSubIdSortAscending = other.FusSubIdSortAscending;
    this.FusSubPass = other.FusSubPass;
    this.FusSubPassFetch = other.FusSubPassFetch;
    this.FusSubPassSort = other.FusSubPassSort;
    this.FusSubPassCaseInsensitive = other.FusSubPassCaseInsensitive;
    this.FusSubPassSortAscending = other.FusSubPassSortAscending;
    this.FusAvsType = other.FusAvsType;
    this.FusAvsTypeFetch = other.FusAvsTypeFetch;
    this.FusAvsTypeSort = other.FusAvsTypeSort;
    this.FusAvsTypeSortAscending = other.FusAvsTypeSortAscending;
    this.FrnUniqueDates = other.FrnUniqueDates;
    this.FrnUniqueDatesFetch = other.FrnUniqueDatesFetch;
    this.FrnUniqueDatesSort = other.FrnUniqueDatesSort;
    this.FrnUniqueDatesSortAscending = other.FrnUniqueDatesSortAscending;
    this.FrnFastMode = other.FrnFastMode;
    this.FrnFastModeFetch = other.FrnFastModeFetch;
    this.FrnFastModeSort = other.FrnFastModeSort;
    this.FrnFastModeSortAscending = other.FrnFastModeSortAscending;
    this.FrnNormOpId = other.FrnNormOpId;
    this.FrnNormOpIdFetch = other.FrnNormOpIdFetch;
    this.FrnNormOpIdSort = other.FrnNormOpIdSort;
    this.FrnNormOpIdCaseInsensitive = other.FrnNormOpIdCaseInsensitive;
    this.FrnNormOpIdSortAscending = other.FrnNormOpIdSortAscending;
    this.FrnNormPostDelay = other.FrnNormPostDelay;
    this.FrnNormPostDelayFetch = other.FrnNormPostDelayFetch;
    this.FrnNormPostDelaySort = other.FrnNormPostDelaySort;
    this.FrnNormPostDelaySortAscending = other.FrnNormPostDelaySortAscending;
    this.FrnFastOpId = other.FrnFastOpId;
    this.FrnFastOpIdFetch = other.FrnFastOpIdFetch;
    this.FrnFastOpIdSort = other.FrnFastOpIdSort;
    this.FrnFastOpIdCaseInsensitive = other.FrnFastOpIdCaseInsensitive;
    this.FrnFastOpIdSortAscending = other.FrnFastOpIdSortAscending;
    this.FrnFastPostDelay = other.FrnFastPostDelay;
    this.FrnFastPostDelayFetch = other.FrnFastPostDelayFetch;
    this.FrnFastPostDelaySort = other.FrnFastPostDelaySort;
    this.FrnFastPostDelaySortAscending = other.FrnFastPostDelaySortAscending;
    this.FrnNationalNum = other.FrnNationalNum;
    this.FrnNationalNumFetch = other.FrnNationalNumFetch;
    this.FrnNationalNumSort = other.FrnNationalNumSort;
    this.FrnNationalNumCaseInsensitive = other.FrnNationalNumCaseInsensitive;
    this.FrnNationalNumSortAscending = other.FrnNationalNumSortAscending;
    this.FrnCompanyName = other.FrnCompanyName;
    this.FrnCompanyNameFetch = other.FrnCompanyNameFetch;
    this.FrnCompanyNameSort = other.FrnCompanyNameSort;
    this.FrnCompanyNameCaseInsensitive = other.FrnCompanyNameCaseInsensitive;
    this.FrnCompanyNameSortAscending = other.FrnCompanyNameSortAscending;
    this.FrnAgencyCode = other.FrnAgencyCode;
    this.FrnAgencyCodeFetch = other.FrnAgencyCodeFetch;
    this.FrnAgencyCodeSort = other.FrnAgencyCodeSort;
    this.FrnAgencyCodeCaseInsensitive = other.FrnAgencyCodeCaseInsensitive;
    this.FrnAgencyCodeSortAscending = other.FrnAgencyCodeSortAscending;
    this.FrnAccountNum = other.FrnAccountNum;
    this.FrnAccountNumFetch = other.FrnAccountNumFetch;
    this.FrnAccountNumSort = other.FrnAccountNumSort;
    this.FrnAccountNumCaseInsensitive = other.FrnAccountNumCaseInsensitive;
    this.FrnAccountNumSortAscending = other.FrnAccountNumSortAscending;
    this.FrnBankCode = other.FrnBankCode;
    this.FrnBankCodeFetch = other.FrnBankCodeFetch;
    this.FrnBankCodeSort = other.FrnBankCodeSort;
    this.FrnBankCodeCaseInsensitive = other.FrnBankCodeCaseInsensitive;
    this.FrnBankCodeSortAscending = other.FrnBankCodeSortAscending;
    this.FdmMerchantName = other.FdmMerchantName;
    this.FdmMerchantNameFetch = other.FdmMerchantNameFetch;
    this.FdmMerchantNameSort = other.FdmMerchantNameSort;
    this.FdmMerchantNameCaseInsensitive = other.FdmMerchantNameCaseInsensitive;
    this.FdmMerchantNameSortAscending = other.FdmMerchantNameSortAscending;
    this.FdmMerchantNumber = other.FdmMerchantNumber;
    this.FdmMerchantNumberFetch = other.FdmMerchantNumberFetch;
    this.FdmMerchantNumberSort = other.FdmMerchantNumberSort;
    this.FdmMerchantNumberCaseInsensitive = other.FdmMerchantNumberCaseInsensitive;
    this.FdmMerchantNumberSortAscending = other.FdmMerchantNumberSortAscending;
    this.FdmAvsType = other.FdmAvsType;
    this.FdmAvsTypeFetch = other.FdmAvsTypeFetch;
    this.FdmAvsTypeSort = other.FdmAvsTypeSort;
    this.FdmAvsTypeSortAscending = other.FdmAvsTypeSortAscending;
    this.DomRconNumber = other.DomRconNumber;
    this.DomRconNumberFetch = other.DomRconNumberFetch;
    this.DomRconNumberSort = other.DomRconNumberSort;
    this.DomRconNumberCaseInsensitive = other.DomRconNumberCaseInsensitive;
    this.DomRconNumberSortAscending = other.DomRconNumberSortAscending;
    this.DomMailboxId = other.DomMailboxId;
    this.DomMailboxIdFetch = other.DomMailboxIdFetch;
    this.DomMailboxIdSort = other.DomMailboxIdSort;
    this.DomMailboxIdCaseInsensitive = other.DomMailboxIdCaseInsensitive;
    this.DomMailboxIdSortAscending = other.DomMailboxIdSortAscending;
    this.DomFundOrig = other.DomFundOrig;
    this.DomFundOrigFetch = other.DomFundOrigFetch;
    this.DomFundOrigSort = other.DomFundOrigSort;
    this.DomFundOrigCaseInsensitive = other.DomFundOrigCaseInsensitive;
    this.DomFundOrigSortAscending = other.DomFundOrigSortAscending;
    this.DomFundDest = other.DomFundDest;
    this.DomFundDestFetch = other.DomFundDestFetch;
    this.DomFundDestSort = other.DomFundDestSort;
    this.DomFundDestCaseInsensitive = other.DomFundDestCaseInsensitive;
    this.DomFundDestSortAscending = other.DomFundDestSortAscending;
    this.DomVisaOrig = other.DomVisaOrig;
    this.DomVisaOrigFetch = other.DomVisaOrigFetch;
    this.DomVisaOrigSort = other.DomVisaOrigSort;
    this.DomVisaOrigCaseInsensitive = other.DomVisaOrigCaseInsensitive;
    this.DomVisaOrigSortAscending = other.DomVisaOrigSortAscending;
    this.DomVisaDest = other.DomVisaDest;
    this.DomVisaDestFetch = other.DomVisaDestFetch;
    this.DomVisaDestSort = other.DomVisaDestSort;
    this.DomVisaDestCaseInsensitive = other.DomVisaDestCaseInsensitive;
    this.DomVisaDestSortAscending = other.DomVisaDestSortAscending;
    this.DomMscOrig = other.DomMscOrig;
    this.DomMscOrigFetch = other.DomMscOrigFetch;
    this.DomMscOrigSort = other.DomMscOrigSort;
    this.DomMscOrigCaseInsensitive = other.DomMscOrigCaseInsensitive;
    this.DomMscOrigSortAscending = other.DomMscOrigSortAscending;
    this.DomMscDest = other.DomMscDest;
    this.DomMscDestFetch = other.DomMscDestFetch;
    this.DomMscDestSort = other.DomMscDestSort;
    this.DomMscDestCaseInsensitive = other.DomMscDestCaseInsensitive;
    this.DomMscDestSortAscending = other.DomMscDestSortAscending;
    this.DomAmexProcessId = other.DomAmexProcessId;
    this.DomAmexProcessIdFetch = other.DomAmexProcessIdFetch;
    this.DomAmexProcessIdSort = other.DomAmexProcessIdSort;
    this.DomAmexProcessIdCaseInsensitive = other.DomAmexProcessIdCaseInsensitive;
    this.DomAmexProcessIdSortAscending = other.DomAmexProcessIdSortAscending;
    this.DomAmexReceiverId = other.DomAmexReceiverId;
    this.DomAmexReceiverIdFetch = other.DomAmexReceiverIdFetch;
    this.DomAmexReceiverIdSort = other.DomAmexReceiverIdSort;
    this.DomAmexReceiverIdCaseInsensitive = other.DomAmexReceiverIdCaseInsensitive;
    this.DomAmexReceiverIdSortAscending = other.DomAmexReceiverIdSortAscending;
    this.DomAmexFormatCode = other.DomAmexFormatCode;
    this.DomAmexFormatCodeFetch = other.DomAmexFormatCodeFetch;
    this.DomAmexFormatCodeSort = other.DomAmexFormatCodeSort;
    this.DomAmexFormatCodeCaseInsensitive = other.DomAmexFormatCodeCaseInsensitive;
    this.DomAmexFormatCodeSortAscending = other.DomAmexFormatCodeSortAscending;
    this.DomPhoneDest = other.DomPhoneDest;
    this.DomPhoneDestFetch = other.DomPhoneDestFetch;
    this.DomPhoneDestSort = other.DomPhoneDestSort;
    this.DomPhoneDestCaseInsensitive = other.DomPhoneDestCaseInsensitive;
    this.DomPhoneDestSortAscending = other.DomPhoneDestSortAscending;
    this.DomCurrencyInd = other.DomCurrencyInd;
    this.DomCurrencyIndFetch = other.DomCurrencyIndFetch;
    this.DomCurrencyIndSort = other.DomCurrencyIndSort;
    this.DomCurrencyIndCaseInsensitive = other.DomCurrencyIndCaseInsensitive;
    this.DomCurrencyIndSortAscending = other.DomCurrencyIndSortAscending;
    this.DomFundInstId = other.DomFundInstId;
    this.DomFundInstIdFetch = other.DomFundInstIdFetch;
    this.DomFundInstIdSort = other.DomFundInstIdSort;
    this.DomFundInstIdCaseInsensitive = other.DomFundInstIdCaseInsensitive;
    this.DomFundInstIdSortAscending = other.DomFundInstIdSortAscending;
    this.DomFundAcctNum = other.DomFundAcctNum;
    this.DomFundAcctNumFetch = other.DomFundAcctNumFetch;
    this.DomFundAcctNumSort = other.DomFundAcctNumSort;
    this.DomFundAcctNumCaseInsensitive = other.DomFundAcctNumCaseInsensitive;
    this.DomFundAcctNumSortAscending = other.DomFundAcctNumSortAscending;
    this.DomBatchLimit = other.DomBatchLimit;
    this.DomBatchLimitFetch = other.DomBatchLimitFetch;
    this.DomBatchLimitSort = other.DomBatchLimitSort;
    this.DomBatchLimitSortAscending = other.DomBatchLimitSortAscending;
    this.DomVisaMerchant = other.DomVisaMerchant;
    this.DomVisaMerchantFetch = other.DomVisaMerchantFetch;
    this.DomVisaMerchantSort = other.DomVisaMerchantSort;
    this.DomVisaMerchantCaseInsensitive = other.DomVisaMerchantCaseInsensitive;
    this.DomVisaMerchantSortAscending = other.DomVisaMerchantSortAscending;
    this.DomMscMerchant = other.DomMscMerchant;
    this.DomMscMerchantFetch = other.DomMscMerchantFetch;
    this.DomMscMerchantSort = other.DomMscMerchantSort;
    this.DomMscMerchantCaseInsensitive = other.DomMscMerchantCaseInsensitive;
    this.DomMscMerchantSortAscending = other.DomMscMerchantSortAscending;
    this.DomAmexMerchant = other.DomAmexMerchant;
    this.DomAmexMerchantFetch = other.DomAmexMerchantFetch;
    this.DomAmexMerchantSort = other.DomAmexMerchantSort;
    this.DomAmexMerchantCaseInsensitive = other.DomAmexMerchantCaseInsensitive;
    this.DomAmexMerchantSortAscending = other.DomAmexMerchantSortAscending;  }
  /** get the filter for this object's key
   * @return ClearingHouseInfoObjectKeyFilter
   */
  public ClearingHouseInfoObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (ClearingHouseInfoObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: ClearingHouseId (CLEARING_HOUSE_ID_VALUES.clearing_house_id)
   * @param fetch whether to fetch this field or not
   */
  public void setClearingHouseIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new ClearingHouseInfoObjectKeyFilter ();
    this.Key.ClearingHouseIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ClearingHouseId (CLEARING_HOUSE_ID_VALUES.clearing_house_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getClearingHouseIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.ClearingHouseIdFetch;
  }
  /** Set the SortOrder for field: ClearingHouseId (CLEARING_HOUSE_ID_VALUES.clearing_house_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setClearingHouseIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new ClearingHouseInfoObjectKeyFilter ();
    this.Key.ClearingHouseIdSort = value;
  }
  /** Retrieve SortOrder for field: ClearingHouseId (CLEARING_HOUSE_ID_VALUES.clearing_house_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getClearingHouseIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.ClearingHouseIdSort;
  }
  /** Set the sort direction for field: ClearingHouseId (CLEARING_HOUSE_ID_VALUES.clearing_house_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setClearingHouseIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new ClearingHouseInfoObjectKeyFilter ();
    this.Key.ClearingHouseIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ClearingHouseId (CLEARING_HOUSE_ID_VALUES.clearing_house_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getClearingHouseIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.ClearingHouseIdSortAscending;
  }
  /** Set the case insensitive for field: ClearingHouseId (CLEARING_HOUSE_ID_VALUES.clearing_house_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setClearingHouseIdCaseInsensitive (boolean ascending)
  {
    if (this.Key == null) this.Key = new ClearingHouseInfoObjectKeyFilter ();
    this.Key.ClearingHouseIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsentive for field: ClearingHouseId (CLEARING_HOUSE_ID_VALUES.clearing_house_id)
   * @return boolean whether the field is case insensitive
   */
  public boolean getClearingHouseIdCaseInsensitive ()
  {
    if (this.Key == null) return false;
    return this.Key.ClearingHouseIdCaseInsensitive;
  }
  /** Set the field level filters for field: ClearingHouseId (CLEARING_HOUSE_ID_VALUES.clearing_house_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setClearingHouseIdFilter (StringFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new ClearingHouseInfoObjectKeyFilter ();
    this.Key.ClearingHouseId = value;
  }
  /** Retrieve filter for field: ClearingHouseId (CLEARING_HOUSE_ID_VALUES.clearing_house_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getClearingHouseIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.ClearingHouseId;
  }
  /** Set the field level Fetch value for field: LanguageCode (CLEARING_HOUSE_ID_VALUES.language_code)
   * @param fetch whether to fetch this field or not
   */
  public void setLanguageCodeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new ClearingHouseInfoObjectKeyFilter ();
    this.Key.LanguageCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: LanguageCode (CLEARING_HOUSE_ID_VALUES.language_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getLanguageCodeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.LanguageCodeFetch;
  }
  /** Set the SortOrder for field: LanguageCode (CLEARING_HOUSE_ID_VALUES.language_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLanguageCodeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new ClearingHouseInfoObjectKeyFilter ();
    this.Key.LanguageCodeSort = value;
  }
  /** Retrieve SortOrder for field: LanguageCode (CLEARING_HOUSE_ID_VALUES.language_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLanguageCodeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.LanguageCodeSort;
  }
  /** Set the sort direction for field: LanguageCode (CLEARING_HOUSE_ID_VALUES.language_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLanguageCodeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new ClearingHouseInfoObjectKeyFilter ();
    this.Key.LanguageCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LanguageCode (CLEARING_HOUSE_ID_VALUES.language_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLanguageCodeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.LanguageCodeSortAscending;
  }
  /** Set the field level filters for field: LanguageCode (CLEARING_HOUSE_ID_VALUES.language_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLanguageCodeFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new ClearingHouseInfoObjectKeyFilter ();
    this.Key.LanguageCode = value;
  }
  /** Retrieve filter for field: LanguageCode (CLEARING_HOUSE_ID_VALUES.language_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getLanguageCodeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.LanguageCode;
  }
  /** Set the field level Fetch value for field: Module (CLEARING_HOUSE_INFO.module)
   * @param fetch whether to fetch this field or not
   */
  public void setModuleFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new ClearingHouseInfoObjectKeyFilter ();
    this.Key.ModuleFetch = fetch;
  }
  /** Retrieve Fetch value for field: Module (CLEARING_HOUSE_INFO.module)
   * @return boolean the Fetch value for this field
   */
  public boolean getModuleFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.ModuleFetch;
  }
  /** Set the SortOrder for field: Module (CLEARING_HOUSE_INFO.module)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setModuleSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new ClearingHouseInfoObjectKeyFilter ();
    this.Key.ModuleSort = value;
  }
  /** Retrieve SortOrder for field: Module (CLEARING_HOUSE_INFO.module)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getModuleSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.ModuleSort;
  }
  /** Set the sort direction for field: Module (CLEARING_HOUSE_INFO.module)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setModuleSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new ClearingHouseInfoObjectKeyFilter ();
    this.Key.ModuleSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Module (CLEARING_HOUSE_INFO.module)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getModuleSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.ModuleSortAscending;
  }
  /** Set the case insensitive for field: Module (CLEARING_HOUSE_INFO.module)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setModuleCaseInsensitive (boolean ascending)
  {
    if (this.Key == null) this.Key = new ClearingHouseInfoObjectKeyFilter ();
    this.Key.ModuleCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsentive for field: Module (CLEARING_HOUSE_INFO.module)
   * @return boolean whether the field is case insensitive
   */
  public boolean getModuleCaseInsensitive ()
  {
    if (this.Key == null) return false;
    return this.Key.ModuleCaseInsensitive;
  }
  /** Set the field level filters for field: Module (CLEARING_HOUSE_INFO.module)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setModuleFilter (StringFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new ClearingHouseInfoObjectKeyFilter ();
    this.Key.Module = value;
  }
  /** Retrieve filter for field: Module (CLEARING_HOUSE_INFO.module)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getModuleFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.Module;
  }
  /** Set the field level Fetch value for field: IsDefault (CLEARING_HOUSE_ID_REF.is_default)
   * @param fetch whether to fetch this field or not
   */
  public void setIsDefaultFetch (boolean fetch) {
    this.IsDefaultFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsDefault (CLEARING_HOUSE_ID_REF.is_default)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsDefaultFetch () {
    return this.IsDefaultFetch;
  }
  /** Set the SortOrder for field: IsDefault (CLEARING_HOUSE_ID_REF.is_default)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsDefaultSortOrder (Integer value) {
    this.IsDefaultSort = value;
  }
  /** Retrieve SortOrder for field: IsDefault (CLEARING_HOUSE_ID_REF.is_default)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsDefaultSortOrder () {
    return this.IsDefaultSort;
  }
  /** Set the sort direction for field: IsDefault (CLEARING_HOUSE_ID_REF.is_default)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsDefaultSortDirection (boolean ascending) {
    this.IsDefaultSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsDefault (CLEARING_HOUSE_ID_REF.is_default)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsDefaultSortDirection () {
    return this.IsDefaultSortAscending;
  }
  /** Set the field level filters for field: IsDefault (CLEARING_HOUSE_ID_REF.is_default)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsDefaultFilter (BooleanFilter[] value) throws ServiceException {
    this.IsDefault = value;
  }
  /** Retrieve filter for field: IsDefault (CLEARING_HOUSE_ID_REF.is_default)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsDefaultFilter () {
    return this.IsDefault;
  }

  /**
   * Retrieves the IsDefaultFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsDefaultFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsDefaultFilter field
   */
  public String[] getIsDefaultFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsDefaultFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsDefaultFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsDefaultFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsDefaultFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsDefaultFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsDefaultFilter filter value from a formatted string
   *
   * @param _value the IsDefaultFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsDefaultFilter filter field
   */
  public void setIsDefaultFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsDefaultFilterFromFormattedString");
    try {
      this.setIsDefaultFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsDefaultFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsDefaultFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsDefaultFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsInternal (CLEARING_HOUSE_ID_REF.is_internal)
   * @param fetch whether to fetch this field or not
   */
  public void setIsInternalFetch (boolean fetch) {
    this.IsInternalFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsInternal (CLEARING_HOUSE_ID_REF.is_internal)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsInternalFetch () {
    return this.IsInternalFetch;
  }
  /** Set the SortOrder for field: IsInternal (CLEARING_HOUSE_ID_REF.is_internal)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsInternalSortOrder (Integer value) {
    this.IsInternalSort = value;
  }
  /** Retrieve SortOrder for field: IsInternal (CLEARING_HOUSE_ID_REF.is_internal)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsInternalSortOrder () {
    return this.IsInternalSort;
  }
  /** Set the sort direction for field: IsInternal (CLEARING_HOUSE_ID_REF.is_internal)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsInternalSortDirection (boolean ascending) {
    this.IsInternalSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsInternal (CLEARING_HOUSE_ID_REF.is_internal)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsInternalSortDirection () {
    return this.IsInternalSortAscending;
  }
  /** Set the field level filters for field: IsInternal (CLEARING_HOUSE_ID_REF.is_internal)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsInternalFilter (BooleanFilter[] value) throws ServiceException {
    this.IsInternal = value;
  }
  /** Retrieve filter for field: IsInternal (CLEARING_HOUSE_ID_REF.is_internal)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsInternalFilter () {
    return this.IsInternal;
  }

  /**
   * Retrieves the IsInternalFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsInternalFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsInternalFilter field
   */
  public String[] getIsInternalFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsInternalFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsInternalFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsInternalFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsInternalFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsInternalFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsInternalFilter filter value from a formatted string
   *
   * @param _value the IsInternalFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsInternalFilter filter field
   */
  public void setIsInternalFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsInternalFilterFromFormattedString");
    try {
      this.setIsInternalFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsInternalFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsInternalFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsInternalFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ConfigTagId (CLEARING_HOUSE_ID_REF.config_tag_id)
   * @param fetch whether to fetch this field or not
   */
  public void setConfigTagIdFetch (boolean fetch) {
    this.ConfigTagIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ConfigTagId (CLEARING_HOUSE_ID_REF.config_tag_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getConfigTagIdFetch () {
    return this.ConfigTagIdFetch;
  }
  /** Set the SortOrder for field: ConfigTagId (CLEARING_HOUSE_ID_REF.config_tag_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setConfigTagIdSortOrder (Integer value) {
    this.ConfigTagIdSort = value;
  }
  /** Retrieve SortOrder for field: ConfigTagId (CLEARING_HOUSE_ID_REF.config_tag_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getConfigTagIdSortOrder () {
    return this.ConfigTagIdSort;
  }
  /** Set the sort direction for field: ConfigTagId (CLEARING_HOUSE_ID_REF.config_tag_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setConfigTagIdSortDirection (boolean ascending) {
    this.ConfigTagIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ConfigTagId (CLEARING_HOUSE_ID_REF.config_tag_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getConfigTagIdSortDirection () {
    return this.ConfigTagIdSortAscending;
  }
  /** Set the case insensitive for field: ConfigTagId (CLEARING_HOUSE_ID_REF.config_tag_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setConfigTagIdCaseInsensitive (boolean ascending) {
    this.ConfigTagIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ConfigTagId (CLEARING_HOUSE_ID_REF.config_tag_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getConfigTagIdCaseInsensitive () {
    return this.ConfigTagIdCaseInsensitive;
  }
  /** Set the field level filters for field: ConfigTagId (CLEARING_HOUSE_ID_REF.config_tag_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setConfigTagIdFilter (StringFilter[] value) throws ServiceException {
    this.ConfigTagId = value;
  }
  /** Retrieve filter for field: ConfigTagId (CLEARING_HOUSE_ID_REF.config_tag_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getConfigTagIdFilter () {
    return this.ConfigTagId;
  }

  /**
   * Retrieves the ConfigTagIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ConfigTagIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ConfigTagIdFilter field
   */
  public String[] getConfigTagIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getConfigTagIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getConfigTagIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getConfigTagIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ConfigTagIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getConfigTagIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ConfigTagIdFilter filter value from a formatted string
   *
   * @param _value the ConfigTagIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ConfigTagIdFilter filter field
   */
  public void setConfigTagIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setConfigTagIdFilterFromFormattedString");
    try {
      this.setConfigTagIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ConfigTagIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setConfigTagIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setConfigTagIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ShortDisplay (CLEARING_HOUSE_ID_VALUES.short_display)
   * @param fetch whether to fetch this field or not
   */
  public void setShortDisplayFetch (boolean fetch) {
    this.ShortDisplayFetch = fetch;
  }
  /** Retrieve Fetch value for field: ShortDisplay (CLEARING_HOUSE_ID_VALUES.short_display)
   * @return boolean the Fetch value for this field
   */
  public boolean getShortDisplayFetch () {
    return this.ShortDisplayFetch;
  }
  /** Set the SortOrder for field: ShortDisplay (CLEARING_HOUSE_ID_VALUES.short_display)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setShortDisplaySortOrder (Integer value) {
    this.ShortDisplaySort = value;
  }
  /** Retrieve SortOrder for field: ShortDisplay (CLEARING_HOUSE_ID_VALUES.short_display)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getShortDisplaySortOrder () {
    return this.ShortDisplaySort;
  }
  /** Set the sort direction for field: ShortDisplay (CLEARING_HOUSE_ID_VALUES.short_display)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setShortDisplaySortDirection (boolean ascending) {
    this.ShortDisplaySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ShortDisplay (CLEARING_HOUSE_ID_VALUES.short_display)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getShortDisplaySortDirection () {
    return this.ShortDisplaySortAscending;
  }
  /** Set the case insensitive for field: ShortDisplay (CLEARING_HOUSE_ID_VALUES.short_display)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setShortDisplayCaseInsensitive (boolean ascending) {
    this.ShortDisplayCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ShortDisplay (CLEARING_HOUSE_ID_VALUES.short_display)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getShortDisplayCaseInsensitive () {
    return this.ShortDisplayCaseInsensitive;
  }
  /** Set the field level filters for field: ShortDisplay (CLEARING_HOUSE_ID_VALUES.short_display)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setShortDisplayFilter (StringFilter[] value) throws ServiceException {
    this.ShortDisplay = value;
  }
  /** Retrieve filter for field: ShortDisplay (CLEARING_HOUSE_ID_VALUES.short_display)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getShortDisplayFilter () {
    return this.ShortDisplay;
  }

  /**
   * Retrieves the ShortDisplayFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ShortDisplayFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ShortDisplayFilter field
   */
  public String[] getShortDisplayFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getShortDisplayFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getShortDisplayFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getShortDisplayFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ShortDisplayFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getShortDisplayFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ShortDisplayFilter filter value from a formatted string
   *
   * @param _value the ShortDisplayFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ShortDisplayFilter filter field
   */
  public void setShortDisplayFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setShortDisplayFilterFromFormattedString");
    try {
      this.setShortDisplayFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ShortDisplayFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setShortDisplayFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setShortDisplayFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DisplayValue (CLEARING_HOUSE_ID_VALUES.display_value)
   * @param fetch whether to fetch this field or not
   */
  public void setDisplayValueFetch (boolean fetch) {
    this.DisplayValueFetch = fetch;
  }
  /** Retrieve Fetch value for field: DisplayValue (CLEARING_HOUSE_ID_VALUES.display_value)
   * @return boolean the Fetch value for this field
   */
  public boolean getDisplayValueFetch () {
    return this.DisplayValueFetch;
  }
  /** Set the SortOrder for field: DisplayValue (CLEARING_HOUSE_ID_VALUES.display_value)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDisplayValueSortOrder (Integer value) {
    this.DisplayValueSort = value;
  }
  /** Retrieve SortOrder for field: DisplayValue (CLEARING_HOUSE_ID_VALUES.display_value)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDisplayValueSortOrder () {
    return this.DisplayValueSort;
  }
  /** Set the sort direction for field: DisplayValue (CLEARING_HOUSE_ID_VALUES.display_value)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDisplayValueSortDirection (boolean ascending) {
    this.DisplayValueSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DisplayValue (CLEARING_HOUSE_ID_VALUES.display_value)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDisplayValueSortDirection () {
    return this.DisplayValueSortAscending;
  }
  /** Set the case insensitive for field: DisplayValue (CLEARING_HOUSE_ID_VALUES.display_value)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDisplayValueCaseInsensitive (boolean ascending) {
    this.DisplayValueCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DisplayValue (CLEARING_HOUSE_ID_VALUES.display_value)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDisplayValueCaseInsensitive () {
    return this.DisplayValueCaseInsensitive;
  }
  /** Set the field level filters for field: DisplayValue (CLEARING_HOUSE_ID_VALUES.display_value)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDisplayValueFilter (StringFilter[] value) throws ServiceException {
    this.DisplayValue = value;
  }
  /** Retrieve filter for field: DisplayValue (CLEARING_HOUSE_ID_VALUES.display_value)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getDisplayValueFilter () {
    return this.DisplayValue;
  }

  /**
   * Retrieves the DisplayValueFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DisplayValueFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DisplayValueFilter field
   */
  public String[] getDisplayValueFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDisplayValueFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDisplayValueFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDisplayValueFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DisplayValueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDisplayValueFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DisplayValueFilter filter value from a formatted string
   *
   * @param _value the DisplayValueFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DisplayValueFilter filter field
   */
  public void setDisplayValueFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDisplayValueFilterFromFormattedString");
    try {
      this.setDisplayValueFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DisplayValueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDisplayValueFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDisplayValueFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CkfClientId (CLEARING_HOUSE_INFO.ckf_client_id)
   * @param fetch whether to fetch this field or not
   */
  public void setCkfClientIdFetch (boolean fetch) {
    this.CkfClientIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: CkfClientId (CLEARING_HOUSE_INFO.ckf_client_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getCkfClientIdFetch () {
    return this.CkfClientIdFetch;
  }
  /** Set the SortOrder for field: CkfClientId (CLEARING_HOUSE_INFO.ckf_client_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCkfClientIdSortOrder (Integer value) {
    this.CkfClientIdSort = value;
  }
  /** Retrieve SortOrder for field: CkfClientId (CLEARING_HOUSE_INFO.ckf_client_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCkfClientIdSortOrder () {
    return this.CkfClientIdSort;
  }
  /** Set the sort direction for field: CkfClientId (CLEARING_HOUSE_INFO.ckf_client_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCkfClientIdSortDirection (boolean ascending) {
    this.CkfClientIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CkfClientId (CLEARING_HOUSE_INFO.ckf_client_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCkfClientIdSortDirection () {
    return this.CkfClientIdSortAscending;
  }
  /** Set the case insensitive for field: CkfClientId (CLEARING_HOUSE_INFO.ckf_client_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCkfClientIdCaseInsensitive (boolean ascending) {
    this.CkfClientIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CkfClientId (CLEARING_HOUSE_INFO.ckf_client_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCkfClientIdCaseInsensitive () {
    return this.CkfClientIdCaseInsensitive;
  }
  /** Set the field level filters for field: CkfClientId (CLEARING_HOUSE_INFO.ckf_client_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCkfClientIdFilter (StringFilter[] value) throws ServiceException {
    this.CkfClientId = value;
  }
  /** Retrieve filter for field: CkfClientId (CLEARING_HOUSE_INFO.ckf_client_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCkfClientIdFilter () {
    return this.CkfClientId;
  }

  /**
   * Retrieves the CkfClientIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CkfClientIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CkfClientIdFilter field
   */
  public String[] getCkfClientIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCkfClientIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCkfClientIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCkfClientIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CkfClientIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCkfClientIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CkfClientIdFilter filter value from a formatted string
   *
   * @param _value the CkfClientIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CkfClientIdFilter filter field
   */
  public void setCkfClientIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCkfClientIdFilterFromFormattedString");
    try {
      this.setCkfClientIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CkfClientIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCkfClientIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCkfClientIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CkfVarDescriptor (CLEARING_HOUSE_INFO.ckf_var_descriptor)
   * @param fetch whether to fetch this field or not
   */
  public void setCkfVarDescriptorFetch (boolean fetch) {
    this.CkfVarDescriptorFetch = fetch;
  }
  /** Retrieve Fetch value for field: CkfVarDescriptor (CLEARING_HOUSE_INFO.ckf_var_descriptor)
   * @return boolean the Fetch value for this field
   */
  public boolean getCkfVarDescriptorFetch () {
    return this.CkfVarDescriptorFetch;
  }
  /** Set the SortOrder for field: CkfVarDescriptor (CLEARING_HOUSE_INFO.ckf_var_descriptor)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCkfVarDescriptorSortOrder (Integer value) {
    this.CkfVarDescriptorSort = value;
  }
  /** Retrieve SortOrder for field: CkfVarDescriptor (CLEARING_HOUSE_INFO.ckf_var_descriptor)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCkfVarDescriptorSortOrder () {
    return this.CkfVarDescriptorSort;
  }
  /** Set the sort direction for field: CkfVarDescriptor (CLEARING_HOUSE_INFO.ckf_var_descriptor)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCkfVarDescriptorSortDirection (boolean ascending) {
    this.CkfVarDescriptorSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CkfVarDescriptor (CLEARING_HOUSE_INFO.ckf_var_descriptor)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCkfVarDescriptorSortDirection () {
    return this.CkfVarDescriptorSortAscending;
  }
  /** Set the case insensitive for field: CkfVarDescriptor (CLEARING_HOUSE_INFO.ckf_var_descriptor)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCkfVarDescriptorCaseInsensitive (boolean ascending) {
    this.CkfVarDescriptorCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CkfVarDescriptor (CLEARING_HOUSE_INFO.ckf_var_descriptor)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCkfVarDescriptorCaseInsensitive () {
    return this.CkfVarDescriptorCaseInsensitive;
  }
  /** Set the field level filters for field: CkfVarDescriptor (CLEARING_HOUSE_INFO.ckf_var_descriptor)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCkfVarDescriptorFilter (StringFilter[] value) throws ServiceException {
    this.CkfVarDescriptor = value;
  }
  /** Retrieve filter for field: CkfVarDescriptor (CLEARING_HOUSE_INFO.ckf_var_descriptor)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCkfVarDescriptorFilter () {
    return this.CkfVarDescriptor;
  }

  /**
   * Retrieves the CkfVarDescriptorFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CkfVarDescriptorFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CkfVarDescriptorFilter field
   */
  public String[] getCkfVarDescriptorFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCkfVarDescriptorFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCkfVarDescriptorFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCkfVarDescriptorFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CkfVarDescriptorFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCkfVarDescriptorFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CkfVarDescriptorFilter filter value from a formatted string
   *
   * @param _value the CkfVarDescriptorFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CkfVarDescriptorFilter filter field
   */
  public void setCkfVarDescriptorFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCkfVarDescriptorFilterFromFormattedString");
    try {
      this.setCkfVarDescriptorFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CkfVarDescriptorFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCkfVarDescriptorFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCkfVarDescriptorFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: KnnMerchantAcct (CLEARING_HOUSE_INFO.knn_merchant_acct)
   * @param fetch whether to fetch this field or not
   */
  public void setKnnMerchantAcctFetch (boolean fetch) {
    this.KnnMerchantAcctFetch = fetch;
  }
  /** Retrieve Fetch value for field: KnnMerchantAcct (CLEARING_HOUSE_INFO.knn_merchant_acct)
   * @return boolean the Fetch value for this field
   */
  public boolean getKnnMerchantAcctFetch () {
    return this.KnnMerchantAcctFetch;
  }
  /** Set the SortOrder for field: KnnMerchantAcct (CLEARING_HOUSE_INFO.knn_merchant_acct)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setKnnMerchantAcctSortOrder (Integer value) {
    this.KnnMerchantAcctSort = value;
  }
  /** Retrieve SortOrder for field: KnnMerchantAcct (CLEARING_HOUSE_INFO.knn_merchant_acct)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getKnnMerchantAcctSortOrder () {
    return this.KnnMerchantAcctSort;
  }
  /** Set the sort direction for field: KnnMerchantAcct (CLEARING_HOUSE_INFO.knn_merchant_acct)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setKnnMerchantAcctSortDirection (boolean ascending) {
    this.KnnMerchantAcctSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: KnnMerchantAcct (CLEARING_HOUSE_INFO.knn_merchant_acct)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getKnnMerchantAcctSortDirection () {
    return this.KnnMerchantAcctSortAscending;
  }
  /** Set the case insensitive for field: KnnMerchantAcct (CLEARING_HOUSE_INFO.knn_merchant_acct)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setKnnMerchantAcctCaseInsensitive (boolean ascending) {
    this.KnnMerchantAcctCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: KnnMerchantAcct (CLEARING_HOUSE_INFO.knn_merchant_acct)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getKnnMerchantAcctCaseInsensitive () {
    return this.KnnMerchantAcctCaseInsensitive;
  }
  /** Set the field level filters for field: KnnMerchantAcct (CLEARING_HOUSE_INFO.knn_merchant_acct)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setKnnMerchantAcctFilter (StringFilter[] value) throws ServiceException {
    this.KnnMerchantAcct = value;
  }
  /** Retrieve filter for field: KnnMerchantAcct (CLEARING_HOUSE_INFO.knn_merchant_acct)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getKnnMerchantAcctFilter () {
    return this.KnnMerchantAcct;
  }

  /**
   * Retrieves the KnnMerchantAcctFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The KnnMerchantAcctFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the KnnMerchantAcctFilter field
   */
  public String[] getKnnMerchantAcctFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getKnnMerchantAcctFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getKnnMerchantAcctFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getKnnMerchantAcctFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("KnnMerchantAcctFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getKnnMerchantAcctFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the KnnMerchantAcctFilter filter value from a formatted string
   *
   * @param _value the KnnMerchantAcctFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the KnnMerchantAcctFilter filter field
   */
  public void setKnnMerchantAcctFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setKnnMerchantAcctFilterFromFormattedString");
    try {
      this.setKnnMerchantAcctFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("KnnMerchantAcctFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setKnnMerchantAcctFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setKnnMerchantAcctFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: KnnMerchantId (CLEARING_HOUSE_INFO.knn_merchant_id)
   * @param fetch whether to fetch this field or not
   */
  public void setKnnMerchantIdFetch (boolean fetch) {
    this.KnnMerchantIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: KnnMerchantId (CLEARING_HOUSE_INFO.knn_merchant_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getKnnMerchantIdFetch () {
    return this.KnnMerchantIdFetch;
  }
  /** Set the SortOrder for field: KnnMerchantId (CLEARING_HOUSE_INFO.knn_merchant_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setKnnMerchantIdSortOrder (Integer value) {
    this.KnnMerchantIdSort = value;
  }
  /** Retrieve SortOrder for field: KnnMerchantId (CLEARING_HOUSE_INFO.knn_merchant_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getKnnMerchantIdSortOrder () {
    return this.KnnMerchantIdSort;
  }
  /** Set the sort direction for field: KnnMerchantId (CLEARING_HOUSE_INFO.knn_merchant_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setKnnMerchantIdSortDirection (boolean ascending) {
    this.KnnMerchantIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: KnnMerchantId (CLEARING_HOUSE_INFO.knn_merchant_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getKnnMerchantIdSortDirection () {
    return this.KnnMerchantIdSortAscending;
  }
  /** Set the case insensitive for field: KnnMerchantId (CLEARING_HOUSE_INFO.knn_merchant_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setKnnMerchantIdCaseInsensitive (boolean ascending) {
    this.KnnMerchantIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: KnnMerchantId (CLEARING_HOUSE_INFO.knn_merchant_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getKnnMerchantIdCaseInsensitive () {
    return this.KnnMerchantIdCaseInsensitive;
  }
  /** Set the field level filters for field: KnnMerchantId (CLEARING_HOUSE_INFO.knn_merchant_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setKnnMerchantIdFilter (StringFilter[] value) throws ServiceException {
    this.KnnMerchantId = value;
  }
  /** Retrieve filter for field: KnnMerchantId (CLEARING_HOUSE_INFO.knn_merchant_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getKnnMerchantIdFilter () {
    return this.KnnMerchantId;
  }

  /**
   * Retrieves the KnnMerchantIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The KnnMerchantIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the KnnMerchantIdFilter field
   */
  public String[] getKnnMerchantIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getKnnMerchantIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getKnnMerchantIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getKnnMerchantIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("KnnMerchantIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getKnnMerchantIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the KnnMerchantIdFilter filter value from a formatted string
   *
   * @param _value the KnnMerchantIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the KnnMerchantIdFilter filter field
   */
  public void setKnnMerchantIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setKnnMerchantIdFilterFromFormattedString");
    try {
      this.setKnnMerchantIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("KnnMerchantIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setKnnMerchantIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setKnnMerchantIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: FusPresId (CLEARING_HOUSE_INFO.fus_pres_id)
   * @param fetch whether to fetch this field or not
   */
  public void setFusPresIdFetch (boolean fetch) {
    this.FusPresIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: FusPresId (CLEARING_HOUSE_INFO.fus_pres_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getFusPresIdFetch () {
    return this.FusPresIdFetch;
  }
  /** Set the SortOrder for field: FusPresId (CLEARING_HOUSE_INFO.fus_pres_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFusPresIdSortOrder (Integer value) {
    this.FusPresIdSort = value;
  }
  /** Retrieve SortOrder for field: FusPresId (CLEARING_HOUSE_INFO.fus_pres_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFusPresIdSortOrder () {
    return this.FusPresIdSort;
  }
  /** Set the sort direction for field: FusPresId (CLEARING_HOUSE_INFO.fus_pres_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFusPresIdSortDirection (boolean ascending) {
    this.FusPresIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FusPresId (CLEARING_HOUSE_INFO.fus_pres_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFusPresIdSortDirection () {
    return this.FusPresIdSortAscending;
  }
  /** Set the case insensitive for field: FusPresId (CLEARING_HOUSE_INFO.fus_pres_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setFusPresIdCaseInsensitive (boolean ascending) {
    this.FusPresIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: FusPresId (CLEARING_HOUSE_INFO.fus_pres_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getFusPresIdCaseInsensitive () {
    return this.FusPresIdCaseInsensitive;
  }
  /** Set the field level filters for field: FusPresId (CLEARING_HOUSE_INFO.fus_pres_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFusPresIdFilter (StringFilter[] value) throws ServiceException {
    this.FusPresId = value;
  }
  /** Retrieve filter for field: FusPresId (CLEARING_HOUSE_INFO.fus_pres_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getFusPresIdFilter () {
    return this.FusPresId;
  }

  /**
   * Retrieves the FusPresIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FusPresIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FusPresIdFilter field
   */
  public String[] getFusPresIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFusPresIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFusPresIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFusPresIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FusPresIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFusPresIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FusPresIdFilter filter value from a formatted string
   *
   * @param _value the FusPresIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FusPresIdFilter filter field
   */
  public void setFusPresIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFusPresIdFilterFromFormattedString");
    try {
      this.setFusPresIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FusPresIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFusPresIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFusPresIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: FusPresPass (CLEARING_HOUSE_INFO.fus_pres_pass)
   * @param fetch whether to fetch this field or not
   */
  public void setFusPresPassFetch (boolean fetch) {
    this.FusPresPassFetch = fetch;
  }
  /** Retrieve Fetch value for field: FusPresPass (CLEARING_HOUSE_INFO.fus_pres_pass)
   * @return boolean the Fetch value for this field
   */
  public boolean getFusPresPassFetch () {
    return this.FusPresPassFetch;
  }
  /** Set the SortOrder for field: FusPresPass (CLEARING_HOUSE_INFO.fus_pres_pass)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFusPresPassSortOrder (Integer value) {
    this.FusPresPassSort = value;
  }
  /** Retrieve SortOrder for field: FusPresPass (CLEARING_HOUSE_INFO.fus_pres_pass)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFusPresPassSortOrder () {
    return this.FusPresPassSort;
  }
  /** Set the sort direction for field: FusPresPass (CLEARING_HOUSE_INFO.fus_pres_pass)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFusPresPassSortDirection (boolean ascending) {
    this.FusPresPassSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FusPresPass (CLEARING_HOUSE_INFO.fus_pres_pass)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFusPresPassSortDirection () {
    return this.FusPresPassSortAscending;
  }
  /** Set the case insensitive for field: FusPresPass (CLEARING_HOUSE_INFO.fus_pres_pass)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setFusPresPassCaseInsensitive (boolean ascending) {
    this.FusPresPassCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: FusPresPass (CLEARING_HOUSE_INFO.fus_pres_pass)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getFusPresPassCaseInsensitive () {
    return this.FusPresPassCaseInsensitive;
  }
  /** Set the field level filters for field: FusPresPass (CLEARING_HOUSE_INFO.fus_pres_pass)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFusPresPassFilter (StringFilter[] value) throws ServiceException {
    this.FusPresPass = value;
  }
  /** Retrieve filter for field: FusPresPass (CLEARING_HOUSE_INFO.fus_pres_pass)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getFusPresPassFilter () {
    return this.FusPresPass;
  }

  /**
   * Retrieves the FusPresPassFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FusPresPassFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FusPresPassFilter field
   */
  public String[] getFusPresPassFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFusPresPassFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFusPresPassFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFusPresPassFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FusPresPassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFusPresPassFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FusPresPassFilter filter value from a formatted string
   *
   * @param _value the FusPresPassFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FusPresPassFilter filter field
   */
  public void setFusPresPassFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFusPresPassFilterFromFormattedString");
    try {
      this.setFusPresPassFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FusPresPassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFusPresPassFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFusPresPassFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: FusSubId (CLEARING_HOUSE_INFO.fus_sub_id)
   * @param fetch whether to fetch this field or not
   */
  public void setFusSubIdFetch (boolean fetch) {
    this.FusSubIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: FusSubId (CLEARING_HOUSE_INFO.fus_sub_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getFusSubIdFetch () {
    return this.FusSubIdFetch;
  }
  /** Set the SortOrder for field: FusSubId (CLEARING_HOUSE_INFO.fus_sub_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFusSubIdSortOrder (Integer value) {
    this.FusSubIdSort = value;
  }
  /** Retrieve SortOrder for field: FusSubId (CLEARING_HOUSE_INFO.fus_sub_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFusSubIdSortOrder () {
    return this.FusSubIdSort;
  }
  /** Set the sort direction for field: FusSubId (CLEARING_HOUSE_INFO.fus_sub_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFusSubIdSortDirection (boolean ascending) {
    this.FusSubIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FusSubId (CLEARING_HOUSE_INFO.fus_sub_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFusSubIdSortDirection () {
    return this.FusSubIdSortAscending;
  }
  /** Set the case insensitive for field: FusSubId (CLEARING_HOUSE_INFO.fus_sub_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setFusSubIdCaseInsensitive (boolean ascending) {
    this.FusSubIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: FusSubId (CLEARING_HOUSE_INFO.fus_sub_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getFusSubIdCaseInsensitive () {
    return this.FusSubIdCaseInsensitive;
  }
  /** Set the field level filters for field: FusSubId (CLEARING_HOUSE_INFO.fus_sub_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFusSubIdFilter (StringFilter[] value) throws ServiceException {
    this.FusSubId = value;
  }
  /** Retrieve filter for field: FusSubId (CLEARING_HOUSE_INFO.fus_sub_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getFusSubIdFilter () {
    return this.FusSubId;
  }

  /**
   * Retrieves the FusSubIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FusSubIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FusSubIdFilter field
   */
  public String[] getFusSubIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFusSubIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFusSubIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFusSubIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FusSubIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFusSubIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FusSubIdFilter filter value from a formatted string
   *
   * @param _value the FusSubIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FusSubIdFilter filter field
   */
  public void setFusSubIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFusSubIdFilterFromFormattedString");
    try {
      this.setFusSubIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FusSubIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFusSubIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFusSubIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: FusSubPass (CLEARING_HOUSE_INFO.fus_sub_pass)
   * @param fetch whether to fetch this field or not
   */
  public void setFusSubPassFetch (boolean fetch) {
    this.FusSubPassFetch = fetch;
  }
  /** Retrieve Fetch value for field: FusSubPass (CLEARING_HOUSE_INFO.fus_sub_pass)
   * @return boolean the Fetch value for this field
   */
  public boolean getFusSubPassFetch () {
    return this.FusSubPassFetch;
  }
  /** Set the SortOrder for field: FusSubPass (CLEARING_HOUSE_INFO.fus_sub_pass)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFusSubPassSortOrder (Integer value) {
    this.FusSubPassSort = value;
  }
  /** Retrieve SortOrder for field: FusSubPass (CLEARING_HOUSE_INFO.fus_sub_pass)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFusSubPassSortOrder () {
    return this.FusSubPassSort;
  }
  /** Set the sort direction for field: FusSubPass (CLEARING_HOUSE_INFO.fus_sub_pass)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFusSubPassSortDirection (boolean ascending) {
    this.FusSubPassSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FusSubPass (CLEARING_HOUSE_INFO.fus_sub_pass)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFusSubPassSortDirection () {
    return this.FusSubPassSortAscending;
  }
  /** Set the case insensitive for field: FusSubPass (CLEARING_HOUSE_INFO.fus_sub_pass)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setFusSubPassCaseInsensitive (boolean ascending) {
    this.FusSubPassCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: FusSubPass (CLEARING_HOUSE_INFO.fus_sub_pass)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getFusSubPassCaseInsensitive () {
    return this.FusSubPassCaseInsensitive;
  }
  /** Set the field level filters for field: FusSubPass (CLEARING_HOUSE_INFO.fus_sub_pass)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFusSubPassFilter (StringFilter[] value) throws ServiceException {
    this.FusSubPass = value;
  }
  /** Retrieve filter for field: FusSubPass (CLEARING_HOUSE_INFO.fus_sub_pass)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getFusSubPassFilter () {
    return this.FusSubPass;
  }

  /**
   * Retrieves the FusSubPassFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FusSubPassFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FusSubPassFilter field
   */
  public String[] getFusSubPassFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFusSubPassFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFusSubPassFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFusSubPassFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FusSubPassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFusSubPassFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FusSubPassFilter filter value from a formatted string
   *
   * @param _value the FusSubPassFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FusSubPassFilter filter field
   */
  public void setFusSubPassFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFusSubPassFilterFromFormattedString");
    try {
      this.setFusSubPassFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FusSubPassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFusSubPassFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFusSubPassFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: FusAvsType (CLEARING_HOUSE_INFO.fus_avs_type)
   * @param fetch whether to fetch this field or not
   */
  public void setFusAvsTypeFetch (boolean fetch) {
    this.FusAvsTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: FusAvsType (CLEARING_HOUSE_INFO.fus_avs_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getFusAvsTypeFetch () {
    return this.FusAvsTypeFetch;
  }
  /** Set the SortOrder for field: FusAvsType (CLEARING_HOUSE_INFO.fus_avs_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFusAvsTypeSortOrder (Integer value) {
    this.FusAvsTypeSort = value;
  }
  /** Retrieve SortOrder for field: FusAvsType (CLEARING_HOUSE_INFO.fus_avs_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFusAvsTypeSortOrder () {
    return this.FusAvsTypeSort;
  }
  /** Set the sort direction for field: FusAvsType (CLEARING_HOUSE_INFO.fus_avs_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFusAvsTypeSortDirection (boolean ascending) {
    this.FusAvsTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FusAvsType (CLEARING_HOUSE_INFO.fus_avs_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFusAvsTypeSortDirection () {
    return this.FusAvsTypeSortAscending;
  }
  /** Set the field level filters for field: FusAvsType (CLEARING_HOUSE_INFO.fus_avs_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFusAvsTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.FusAvsType = value;
  }
  /** Retrieve filter for field: FusAvsType (CLEARING_HOUSE_INFO.fus_avs_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getFusAvsTypeFilter () {
    return this.FusAvsType;
  }

  /**
   * Retrieves the FusAvsTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FusAvsTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FusAvsTypeFilter field
   */
  public String[] getFusAvsTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFusAvsTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFusAvsTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFusAvsTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FusAvsTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFusAvsTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FusAvsTypeFilter filter value from a formatted string
   *
   * @param _value the FusAvsTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FusAvsTypeFilter filter field
   */
  public void setFusAvsTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFusAvsTypeFilterFromFormattedString");
    try {
      this.setFusAvsTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FusAvsTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFusAvsTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFusAvsTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: FrnUniqueDates (CLEARING_HOUSE_INFO.frn_unique_dates)
   * @param fetch whether to fetch this field or not
   */
  public void setFrnUniqueDatesFetch (boolean fetch) {
    this.FrnUniqueDatesFetch = fetch;
  }
  /** Retrieve Fetch value for field: FrnUniqueDates (CLEARING_HOUSE_INFO.frn_unique_dates)
   * @return boolean the Fetch value for this field
   */
  public boolean getFrnUniqueDatesFetch () {
    return this.FrnUniqueDatesFetch;
  }
  /** Set the SortOrder for field: FrnUniqueDates (CLEARING_HOUSE_INFO.frn_unique_dates)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFrnUniqueDatesSortOrder (Integer value) {
    this.FrnUniqueDatesSort = value;
  }
  /** Retrieve SortOrder for field: FrnUniqueDates (CLEARING_HOUSE_INFO.frn_unique_dates)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFrnUniqueDatesSortOrder () {
    return this.FrnUniqueDatesSort;
  }
  /** Set the sort direction for field: FrnUniqueDates (CLEARING_HOUSE_INFO.frn_unique_dates)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFrnUniqueDatesSortDirection (boolean ascending) {
    this.FrnUniqueDatesSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FrnUniqueDates (CLEARING_HOUSE_INFO.frn_unique_dates)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFrnUniqueDatesSortDirection () {
    return this.FrnUniqueDatesSortAscending;
  }
  /** Set the field level filters for field: FrnUniqueDates (CLEARING_HOUSE_INFO.frn_unique_dates)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFrnUniqueDatesFilter (BooleanFilter[] value) throws ServiceException {
    this.FrnUniqueDates = value;
  }
  /** Retrieve filter for field: FrnUniqueDates (CLEARING_HOUSE_INFO.frn_unique_dates)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getFrnUniqueDatesFilter () {
    return this.FrnUniqueDates;
  }

  /**
   * Retrieves the FrnUniqueDatesFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FrnUniqueDatesFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrnUniqueDatesFilter field
   */
  public String[] getFrnUniqueDatesFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrnUniqueDatesFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFrnUniqueDatesFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrnUniqueDatesFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrnUniqueDatesFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrnUniqueDatesFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FrnUniqueDatesFilter filter value from a formatted string
   *
   * @param _value the FrnUniqueDatesFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FrnUniqueDatesFilter filter field
   */
  public void setFrnUniqueDatesFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFrnUniqueDatesFilterFromFormattedString");
    try {
      this.setFrnUniqueDatesFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrnUniqueDatesFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrnUniqueDatesFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrnUniqueDatesFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: FrnFastMode (CLEARING_HOUSE_INFO.frn_fast_mode)
   * @param fetch whether to fetch this field or not
   */
  public void setFrnFastModeFetch (boolean fetch) {
    this.FrnFastModeFetch = fetch;
  }
  /** Retrieve Fetch value for field: FrnFastMode (CLEARING_HOUSE_INFO.frn_fast_mode)
   * @return boolean the Fetch value for this field
   */
  public boolean getFrnFastModeFetch () {
    return this.FrnFastModeFetch;
  }
  /** Set the SortOrder for field: FrnFastMode (CLEARING_HOUSE_INFO.frn_fast_mode)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFrnFastModeSortOrder (Integer value) {
    this.FrnFastModeSort = value;
  }
  /** Retrieve SortOrder for field: FrnFastMode (CLEARING_HOUSE_INFO.frn_fast_mode)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFrnFastModeSortOrder () {
    return this.FrnFastModeSort;
  }
  /** Set the sort direction for field: FrnFastMode (CLEARING_HOUSE_INFO.frn_fast_mode)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFrnFastModeSortDirection (boolean ascending) {
    this.FrnFastModeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FrnFastMode (CLEARING_HOUSE_INFO.frn_fast_mode)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFrnFastModeSortDirection () {
    return this.FrnFastModeSortAscending;
  }
  /** Set the field level filters for field: FrnFastMode (CLEARING_HOUSE_INFO.frn_fast_mode)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFrnFastModeFilter (BooleanFilter[] value) throws ServiceException {
    this.FrnFastMode = value;
  }
  /** Retrieve filter for field: FrnFastMode (CLEARING_HOUSE_INFO.frn_fast_mode)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getFrnFastModeFilter () {
    return this.FrnFastMode;
  }

  /**
   * Retrieves the FrnFastModeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FrnFastModeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrnFastModeFilter field
   */
  public String[] getFrnFastModeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrnFastModeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFrnFastModeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrnFastModeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrnFastModeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrnFastModeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FrnFastModeFilter filter value from a formatted string
   *
   * @param _value the FrnFastModeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FrnFastModeFilter filter field
   */
  public void setFrnFastModeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFrnFastModeFilterFromFormattedString");
    try {
      this.setFrnFastModeFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrnFastModeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrnFastModeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrnFastModeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: FrnNormOpId (CLEARING_HOUSE_INFO.frn_norm_op_id)
   * @param fetch whether to fetch this field or not
   */
  public void setFrnNormOpIdFetch (boolean fetch) {
    this.FrnNormOpIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: FrnNormOpId (CLEARING_HOUSE_INFO.frn_norm_op_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getFrnNormOpIdFetch () {
    return this.FrnNormOpIdFetch;
  }
  /** Set the SortOrder for field: FrnNormOpId (CLEARING_HOUSE_INFO.frn_norm_op_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFrnNormOpIdSortOrder (Integer value) {
    this.FrnNormOpIdSort = value;
  }
  /** Retrieve SortOrder for field: FrnNormOpId (CLEARING_HOUSE_INFO.frn_norm_op_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFrnNormOpIdSortOrder () {
    return this.FrnNormOpIdSort;
  }
  /** Set the sort direction for field: FrnNormOpId (CLEARING_HOUSE_INFO.frn_norm_op_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFrnNormOpIdSortDirection (boolean ascending) {
    this.FrnNormOpIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FrnNormOpId (CLEARING_HOUSE_INFO.frn_norm_op_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFrnNormOpIdSortDirection () {
    return this.FrnNormOpIdSortAscending;
  }
  /** Set the case insensitive for field: FrnNormOpId (CLEARING_HOUSE_INFO.frn_norm_op_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setFrnNormOpIdCaseInsensitive (boolean ascending) {
    this.FrnNormOpIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: FrnNormOpId (CLEARING_HOUSE_INFO.frn_norm_op_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getFrnNormOpIdCaseInsensitive () {
    return this.FrnNormOpIdCaseInsensitive;
  }
  /** Set the field level filters for field: FrnNormOpId (CLEARING_HOUSE_INFO.frn_norm_op_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFrnNormOpIdFilter (StringFilter[] value) throws ServiceException {
    this.FrnNormOpId = value;
  }
  /** Retrieve filter for field: FrnNormOpId (CLEARING_HOUSE_INFO.frn_norm_op_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getFrnNormOpIdFilter () {
    return this.FrnNormOpId;
  }

  /**
   * Retrieves the FrnNormOpIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FrnNormOpIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrnNormOpIdFilter field
   */
  public String[] getFrnNormOpIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrnNormOpIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFrnNormOpIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrnNormOpIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrnNormOpIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrnNormOpIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FrnNormOpIdFilter filter value from a formatted string
   *
   * @param _value the FrnNormOpIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FrnNormOpIdFilter filter field
   */
  public void setFrnNormOpIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFrnNormOpIdFilterFromFormattedString");
    try {
      this.setFrnNormOpIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrnNormOpIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrnNormOpIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrnNormOpIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: FrnNormPostDelay (CLEARING_HOUSE_INFO.frn_norm_post_delay)
   * @param fetch whether to fetch this field or not
   */
  public void setFrnNormPostDelayFetch (boolean fetch) {
    this.FrnNormPostDelayFetch = fetch;
  }
  /** Retrieve Fetch value for field: FrnNormPostDelay (CLEARING_HOUSE_INFO.frn_norm_post_delay)
   * @return boolean the Fetch value for this field
   */
  public boolean getFrnNormPostDelayFetch () {
    return this.FrnNormPostDelayFetch;
  }
  /** Set the SortOrder for field: FrnNormPostDelay (CLEARING_HOUSE_INFO.frn_norm_post_delay)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFrnNormPostDelaySortOrder (Integer value) {
    this.FrnNormPostDelaySort = value;
  }
  /** Retrieve SortOrder for field: FrnNormPostDelay (CLEARING_HOUSE_INFO.frn_norm_post_delay)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFrnNormPostDelaySortOrder () {
    return this.FrnNormPostDelaySort;
  }
  /** Set the sort direction for field: FrnNormPostDelay (CLEARING_HOUSE_INFO.frn_norm_post_delay)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFrnNormPostDelaySortDirection (boolean ascending) {
    this.FrnNormPostDelaySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FrnNormPostDelay (CLEARING_HOUSE_INFO.frn_norm_post_delay)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFrnNormPostDelaySortDirection () {
    return this.FrnNormPostDelaySortAscending;
  }
  /** Set the field level filters for field: FrnNormPostDelay (CLEARING_HOUSE_INFO.frn_norm_post_delay)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFrnNormPostDelayFilter (IntegerFilter[] value) throws ServiceException {
    this.FrnNormPostDelay = value;
  }
  /** Retrieve filter for field: FrnNormPostDelay (CLEARING_HOUSE_INFO.frn_norm_post_delay)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getFrnNormPostDelayFilter () {
    return this.FrnNormPostDelay;
  }

  /**
   * Retrieves the FrnNormPostDelayFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FrnNormPostDelayFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrnNormPostDelayFilter field
   */
  public String[] getFrnNormPostDelayFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrnNormPostDelayFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFrnNormPostDelayFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrnNormPostDelayFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrnNormPostDelayFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrnNormPostDelayFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FrnNormPostDelayFilter filter value from a formatted string
   *
   * @param _value the FrnNormPostDelayFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FrnNormPostDelayFilter filter field
   */
  public void setFrnNormPostDelayFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFrnNormPostDelayFilterFromFormattedString");
    try {
      this.setFrnNormPostDelayFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrnNormPostDelayFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrnNormPostDelayFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrnNormPostDelayFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: FrnFastOpId (CLEARING_HOUSE_INFO.frn_fast_op_id)
   * @param fetch whether to fetch this field or not
   */
  public void setFrnFastOpIdFetch (boolean fetch) {
    this.FrnFastOpIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: FrnFastOpId (CLEARING_HOUSE_INFO.frn_fast_op_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getFrnFastOpIdFetch () {
    return this.FrnFastOpIdFetch;
  }
  /** Set the SortOrder for field: FrnFastOpId (CLEARING_HOUSE_INFO.frn_fast_op_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFrnFastOpIdSortOrder (Integer value) {
    this.FrnFastOpIdSort = value;
  }
  /** Retrieve SortOrder for field: FrnFastOpId (CLEARING_HOUSE_INFO.frn_fast_op_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFrnFastOpIdSortOrder () {
    return this.FrnFastOpIdSort;
  }
  /** Set the sort direction for field: FrnFastOpId (CLEARING_HOUSE_INFO.frn_fast_op_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFrnFastOpIdSortDirection (boolean ascending) {
    this.FrnFastOpIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FrnFastOpId (CLEARING_HOUSE_INFO.frn_fast_op_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFrnFastOpIdSortDirection () {
    return this.FrnFastOpIdSortAscending;
  }
  /** Set the case insensitive for field: FrnFastOpId (CLEARING_HOUSE_INFO.frn_fast_op_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setFrnFastOpIdCaseInsensitive (boolean ascending) {
    this.FrnFastOpIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: FrnFastOpId (CLEARING_HOUSE_INFO.frn_fast_op_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getFrnFastOpIdCaseInsensitive () {
    return this.FrnFastOpIdCaseInsensitive;
  }
  /** Set the field level filters for field: FrnFastOpId (CLEARING_HOUSE_INFO.frn_fast_op_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFrnFastOpIdFilter (StringFilter[] value) throws ServiceException {
    this.FrnFastOpId = value;
  }
  /** Retrieve filter for field: FrnFastOpId (CLEARING_HOUSE_INFO.frn_fast_op_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getFrnFastOpIdFilter () {
    return this.FrnFastOpId;
  }

  /**
   * Retrieves the FrnFastOpIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FrnFastOpIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrnFastOpIdFilter field
   */
  public String[] getFrnFastOpIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrnFastOpIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFrnFastOpIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrnFastOpIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrnFastOpIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrnFastOpIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FrnFastOpIdFilter filter value from a formatted string
   *
   * @param _value the FrnFastOpIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FrnFastOpIdFilter filter field
   */
  public void setFrnFastOpIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFrnFastOpIdFilterFromFormattedString");
    try {
      this.setFrnFastOpIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrnFastOpIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrnFastOpIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrnFastOpIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: FrnFastPostDelay (CLEARING_HOUSE_INFO.frn_fast_post_delay)
   * @param fetch whether to fetch this field or not
   */
  public void setFrnFastPostDelayFetch (boolean fetch) {
    this.FrnFastPostDelayFetch = fetch;
  }
  /** Retrieve Fetch value for field: FrnFastPostDelay (CLEARING_HOUSE_INFO.frn_fast_post_delay)
   * @return boolean the Fetch value for this field
   */
  public boolean getFrnFastPostDelayFetch () {
    return this.FrnFastPostDelayFetch;
  }
  /** Set the SortOrder for field: FrnFastPostDelay (CLEARING_HOUSE_INFO.frn_fast_post_delay)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFrnFastPostDelaySortOrder (Integer value) {
    this.FrnFastPostDelaySort = value;
  }
  /** Retrieve SortOrder for field: FrnFastPostDelay (CLEARING_HOUSE_INFO.frn_fast_post_delay)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFrnFastPostDelaySortOrder () {
    return this.FrnFastPostDelaySort;
  }
  /** Set the sort direction for field: FrnFastPostDelay (CLEARING_HOUSE_INFO.frn_fast_post_delay)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFrnFastPostDelaySortDirection (boolean ascending) {
    this.FrnFastPostDelaySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FrnFastPostDelay (CLEARING_HOUSE_INFO.frn_fast_post_delay)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFrnFastPostDelaySortDirection () {
    return this.FrnFastPostDelaySortAscending;
  }
  /** Set the field level filters for field: FrnFastPostDelay (CLEARING_HOUSE_INFO.frn_fast_post_delay)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFrnFastPostDelayFilter (IntegerFilter[] value) throws ServiceException {
    this.FrnFastPostDelay = value;
  }
  /** Retrieve filter for field: FrnFastPostDelay (CLEARING_HOUSE_INFO.frn_fast_post_delay)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getFrnFastPostDelayFilter () {
    return this.FrnFastPostDelay;
  }

  /**
   * Retrieves the FrnFastPostDelayFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FrnFastPostDelayFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrnFastPostDelayFilter field
   */
  public String[] getFrnFastPostDelayFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrnFastPostDelayFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFrnFastPostDelayFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrnFastPostDelayFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrnFastPostDelayFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrnFastPostDelayFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FrnFastPostDelayFilter filter value from a formatted string
   *
   * @param _value the FrnFastPostDelayFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FrnFastPostDelayFilter filter field
   */
  public void setFrnFastPostDelayFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFrnFastPostDelayFilterFromFormattedString");
    try {
      this.setFrnFastPostDelayFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrnFastPostDelayFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrnFastPostDelayFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrnFastPostDelayFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: FrnNationalNum (CLEARING_HOUSE_INFO.frn_national_num)
   * @param fetch whether to fetch this field or not
   */
  public void setFrnNationalNumFetch (boolean fetch) {
    this.FrnNationalNumFetch = fetch;
  }
  /** Retrieve Fetch value for field: FrnNationalNum (CLEARING_HOUSE_INFO.frn_national_num)
   * @return boolean the Fetch value for this field
   */
  public boolean getFrnNationalNumFetch () {
    return this.FrnNationalNumFetch;
  }
  /** Set the SortOrder for field: FrnNationalNum (CLEARING_HOUSE_INFO.frn_national_num)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFrnNationalNumSortOrder (Integer value) {
    this.FrnNationalNumSort = value;
  }
  /** Retrieve SortOrder for field: FrnNationalNum (CLEARING_HOUSE_INFO.frn_national_num)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFrnNationalNumSortOrder () {
    return this.FrnNationalNumSort;
  }
  /** Set the sort direction for field: FrnNationalNum (CLEARING_HOUSE_INFO.frn_national_num)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFrnNationalNumSortDirection (boolean ascending) {
    this.FrnNationalNumSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FrnNationalNum (CLEARING_HOUSE_INFO.frn_national_num)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFrnNationalNumSortDirection () {
    return this.FrnNationalNumSortAscending;
  }
  /** Set the case insensitive for field: FrnNationalNum (CLEARING_HOUSE_INFO.frn_national_num)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setFrnNationalNumCaseInsensitive (boolean ascending) {
    this.FrnNationalNumCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: FrnNationalNum (CLEARING_HOUSE_INFO.frn_national_num)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getFrnNationalNumCaseInsensitive () {
    return this.FrnNationalNumCaseInsensitive;
  }
  /** Set the field level filters for field: FrnNationalNum (CLEARING_HOUSE_INFO.frn_national_num)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFrnNationalNumFilter (StringFilter[] value) throws ServiceException {
    this.FrnNationalNum = value;
  }
  /** Retrieve filter for field: FrnNationalNum (CLEARING_HOUSE_INFO.frn_national_num)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getFrnNationalNumFilter () {
    return this.FrnNationalNum;
  }

  /**
   * Retrieves the FrnNationalNumFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FrnNationalNumFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrnNationalNumFilter field
   */
  public String[] getFrnNationalNumFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrnNationalNumFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFrnNationalNumFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrnNationalNumFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrnNationalNumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrnNationalNumFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FrnNationalNumFilter filter value from a formatted string
   *
   * @param _value the FrnNationalNumFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FrnNationalNumFilter filter field
   */
  public void setFrnNationalNumFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFrnNationalNumFilterFromFormattedString");
    try {
      this.setFrnNationalNumFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrnNationalNumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrnNationalNumFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrnNationalNumFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: FrnCompanyName (CLEARING_HOUSE_INFO.frn_company_name)
   * @param fetch whether to fetch this field or not
   */
  public void setFrnCompanyNameFetch (boolean fetch) {
    this.FrnCompanyNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: FrnCompanyName (CLEARING_HOUSE_INFO.frn_company_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getFrnCompanyNameFetch () {
    return this.FrnCompanyNameFetch;
  }
  /** Set the SortOrder for field: FrnCompanyName (CLEARING_HOUSE_INFO.frn_company_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFrnCompanyNameSortOrder (Integer value) {
    this.FrnCompanyNameSort = value;
  }
  /** Retrieve SortOrder for field: FrnCompanyName (CLEARING_HOUSE_INFO.frn_company_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFrnCompanyNameSortOrder () {
    return this.FrnCompanyNameSort;
  }
  /** Set the sort direction for field: FrnCompanyName (CLEARING_HOUSE_INFO.frn_company_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFrnCompanyNameSortDirection (boolean ascending) {
    this.FrnCompanyNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FrnCompanyName (CLEARING_HOUSE_INFO.frn_company_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFrnCompanyNameSortDirection () {
    return this.FrnCompanyNameSortAscending;
  }
  /** Set the case insensitive for field: FrnCompanyName (CLEARING_HOUSE_INFO.frn_company_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setFrnCompanyNameCaseInsensitive (boolean ascending) {
    this.FrnCompanyNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: FrnCompanyName (CLEARING_HOUSE_INFO.frn_company_name)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getFrnCompanyNameCaseInsensitive () {
    return this.FrnCompanyNameCaseInsensitive;
  }
  /** Set the field level filters for field: FrnCompanyName (CLEARING_HOUSE_INFO.frn_company_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFrnCompanyNameFilter (StringFilter[] value) throws ServiceException {
    this.FrnCompanyName = value;
  }
  /** Retrieve filter for field: FrnCompanyName (CLEARING_HOUSE_INFO.frn_company_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getFrnCompanyNameFilter () {
    return this.FrnCompanyName;
  }

  /**
   * Retrieves the FrnCompanyNameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FrnCompanyNameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrnCompanyNameFilter field
   */
  public String[] getFrnCompanyNameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrnCompanyNameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFrnCompanyNameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrnCompanyNameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrnCompanyNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrnCompanyNameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FrnCompanyNameFilter filter value from a formatted string
   *
   * @param _value the FrnCompanyNameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FrnCompanyNameFilter filter field
   */
  public void setFrnCompanyNameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFrnCompanyNameFilterFromFormattedString");
    try {
      this.setFrnCompanyNameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrnCompanyNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrnCompanyNameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrnCompanyNameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: FrnAgencyCode (CLEARING_HOUSE_INFO.frn_agency_code)
   * @param fetch whether to fetch this field or not
   */
  public void setFrnAgencyCodeFetch (boolean fetch) {
    this.FrnAgencyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: FrnAgencyCode (CLEARING_HOUSE_INFO.frn_agency_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getFrnAgencyCodeFetch () {
    return this.FrnAgencyCodeFetch;
  }
  /** Set the SortOrder for field: FrnAgencyCode (CLEARING_HOUSE_INFO.frn_agency_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFrnAgencyCodeSortOrder (Integer value) {
    this.FrnAgencyCodeSort = value;
  }
  /** Retrieve SortOrder for field: FrnAgencyCode (CLEARING_HOUSE_INFO.frn_agency_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFrnAgencyCodeSortOrder () {
    return this.FrnAgencyCodeSort;
  }
  /** Set the sort direction for field: FrnAgencyCode (CLEARING_HOUSE_INFO.frn_agency_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFrnAgencyCodeSortDirection (boolean ascending) {
    this.FrnAgencyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FrnAgencyCode (CLEARING_HOUSE_INFO.frn_agency_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFrnAgencyCodeSortDirection () {
    return this.FrnAgencyCodeSortAscending;
  }
  /** Set the case insensitive for field: FrnAgencyCode (CLEARING_HOUSE_INFO.frn_agency_code)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setFrnAgencyCodeCaseInsensitive (boolean ascending) {
    this.FrnAgencyCodeCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: FrnAgencyCode (CLEARING_HOUSE_INFO.frn_agency_code)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getFrnAgencyCodeCaseInsensitive () {
    return this.FrnAgencyCodeCaseInsensitive;
  }
  /** Set the field level filters for field: FrnAgencyCode (CLEARING_HOUSE_INFO.frn_agency_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFrnAgencyCodeFilter (StringFilter[] value) throws ServiceException {
    this.FrnAgencyCode = value;
  }
  /** Retrieve filter for field: FrnAgencyCode (CLEARING_HOUSE_INFO.frn_agency_code)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getFrnAgencyCodeFilter () {
    return this.FrnAgencyCode;
  }

  /**
   * Retrieves the FrnAgencyCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FrnAgencyCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrnAgencyCodeFilter field
   */
  public String[] getFrnAgencyCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrnAgencyCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFrnAgencyCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrnAgencyCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrnAgencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrnAgencyCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FrnAgencyCodeFilter filter value from a formatted string
   *
   * @param _value the FrnAgencyCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FrnAgencyCodeFilter filter field
   */
  public void setFrnAgencyCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFrnAgencyCodeFilterFromFormattedString");
    try {
      this.setFrnAgencyCodeFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrnAgencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrnAgencyCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrnAgencyCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: FrnAccountNum (CLEARING_HOUSE_INFO.frn_account_num)
   * @param fetch whether to fetch this field or not
   */
  public void setFrnAccountNumFetch (boolean fetch) {
    this.FrnAccountNumFetch = fetch;
  }
  /** Retrieve Fetch value for field: FrnAccountNum (CLEARING_HOUSE_INFO.frn_account_num)
   * @return boolean the Fetch value for this field
   */
  public boolean getFrnAccountNumFetch () {
    return this.FrnAccountNumFetch;
  }
  /** Set the SortOrder for field: FrnAccountNum (CLEARING_HOUSE_INFO.frn_account_num)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFrnAccountNumSortOrder (Integer value) {
    this.FrnAccountNumSort = value;
  }
  /** Retrieve SortOrder for field: FrnAccountNum (CLEARING_HOUSE_INFO.frn_account_num)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFrnAccountNumSortOrder () {
    return this.FrnAccountNumSort;
  }
  /** Set the sort direction for field: FrnAccountNum (CLEARING_HOUSE_INFO.frn_account_num)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFrnAccountNumSortDirection (boolean ascending) {
    this.FrnAccountNumSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FrnAccountNum (CLEARING_HOUSE_INFO.frn_account_num)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFrnAccountNumSortDirection () {
    return this.FrnAccountNumSortAscending;
  }
  /** Set the case insensitive for field: FrnAccountNum (CLEARING_HOUSE_INFO.frn_account_num)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setFrnAccountNumCaseInsensitive (boolean ascending) {
    this.FrnAccountNumCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: FrnAccountNum (CLEARING_HOUSE_INFO.frn_account_num)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getFrnAccountNumCaseInsensitive () {
    return this.FrnAccountNumCaseInsensitive;
  }
  /** Set the field level filters for field: FrnAccountNum (CLEARING_HOUSE_INFO.frn_account_num)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFrnAccountNumFilter (StringFilter[] value) throws ServiceException {
    this.FrnAccountNum = value;
  }
  /** Retrieve filter for field: FrnAccountNum (CLEARING_HOUSE_INFO.frn_account_num)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getFrnAccountNumFilter () {
    return this.FrnAccountNum;
  }

  /**
   * Retrieves the FrnAccountNumFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FrnAccountNumFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrnAccountNumFilter field
   */
  public String[] getFrnAccountNumFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrnAccountNumFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFrnAccountNumFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrnAccountNumFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrnAccountNumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrnAccountNumFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FrnAccountNumFilter filter value from a formatted string
   *
   * @param _value the FrnAccountNumFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FrnAccountNumFilter filter field
   */
  public void setFrnAccountNumFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFrnAccountNumFilterFromFormattedString");
    try {
      this.setFrnAccountNumFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrnAccountNumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrnAccountNumFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrnAccountNumFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: FrnBankCode (CLEARING_HOUSE_INFO.frn_bank_code)
   * @param fetch whether to fetch this field or not
   */
  public void setFrnBankCodeFetch (boolean fetch) {
    this.FrnBankCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: FrnBankCode (CLEARING_HOUSE_INFO.frn_bank_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getFrnBankCodeFetch () {
    return this.FrnBankCodeFetch;
  }
  /** Set the SortOrder for field: FrnBankCode (CLEARING_HOUSE_INFO.frn_bank_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFrnBankCodeSortOrder (Integer value) {
    this.FrnBankCodeSort = value;
  }
  /** Retrieve SortOrder for field: FrnBankCode (CLEARING_HOUSE_INFO.frn_bank_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFrnBankCodeSortOrder () {
    return this.FrnBankCodeSort;
  }
  /** Set the sort direction for field: FrnBankCode (CLEARING_HOUSE_INFO.frn_bank_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFrnBankCodeSortDirection (boolean ascending) {
    this.FrnBankCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FrnBankCode (CLEARING_HOUSE_INFO.frn_bank_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFrnBankCodeSortDirection () {
    return this.FrnBankCodeSortAscending;
  }
  /** Set the case insensitive for field: FrnBankCode (CLEARING_HOUSE_INFO.frn_bank_code)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setFrnBankCodeCaseInsensitive (boolean ascending) {
    this.FrnBankCodeCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: FrnBankCode (CLEARING_HOUSE_INFO.frn_bank_code)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getFrnBankCodeCaseInsensitive () {
    return this.FrnBankCodeCaseInsensitive;
  }
  /** Set the field level filters for field: FrnBankCode (CLEARING_HOUSE_INFO.frn_bank_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFrnBankCodeFilter (StringFilter[] value) throws ServiceException {
    this.FrnBankCode = value;
  }
  /** Retrieve filter for field: FrnBankCode (CLEARING_HOUSE_INFO.frn_bank_code)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getFrnBankCodeFilter () {
    return this.FrnBankCode;
  }

  /**
   * Retrieves the FrnBankCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FrnBankCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrnBankCodeFilter field
   */
  public String[] getFrnBankCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrnBankCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFrnBankCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrnBankCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrnBankCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrnBankCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FrnBankCodeFilter filter value from a formatted string
   *
   * @param _value the FrnBankCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FrnBankCodeFilter filter field
   */
  public void setFrnBankCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFrnBankCodeFilterFromFormattedString");
    try {
      this.setFrnBankCodeFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrnBankCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrnBankCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrnBankCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: FdmMerchantName (CLEARING_HOUSE_INFO.fdm_merchant_name)
   * @param fetch whether to fetch this field or not
   */
  public void setFdmMerchantNameFetch (boolean fetch) {
    this.FdmMerchantNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: FdmMerchantName (CLEARING_HOUSE_INFO.fdm_merchant_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getFdmMerchantNameFetch () {
    return this.FdmMerchantNameFetch;
  }
  /** Set the SortOrder for field: FdmMerchantName (CLEARING_HOUSE_INFO.fdm_merchant_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFdmMerchantNameSortOrder (Integer value) {
    this.FdmMerchantNameSort = value;
  }
  /** Retrieve SortOrder for field: FdmMerchantName (CLEARING_HOUSE_INFO.fdm_merchant_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFdmMerchantNameSortOrder () {
    return this.FdmMerchantNameSort;
  }
  /** Set the sort direction for field: FdmMerchantName (CLEARING_HOUSE_INFO.fdm_merchant_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFdmMerchantNameSortDirection (boolean ascending) {
    this.FdmMerchantNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FdmMerchantName (CLEARING_HOUSE_INFO.fdm_merchant_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFdmMerchantNameSortDirection () {
    return this.FdmMerchantNameSortAscending;
  }
  /** Set the case insensitive for field: FdmMerchantName (CLEARING_HOUSE_INFO.fdm_merchant_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setFdmMerchantNameCaseInsensitive (boolean ascending) {
    this.FdmMerchantNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: FdmMerchantName (CLEARING_HOUSE_INFO.fdm_merchant_name)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getFdmMerchantNameCaseInsensitive () {
    return this.FdmMerchantNameCaseInsensitive;
  }
  /** Set the field level filters for field: FdmMerchantName (CLEARING_HOUSE_INFO.fdm_merchant_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFdmMerchantNameFilter (StringFilter[] value) throws ServiceException {
    this.FdmMerchantName = value;
  }
  /** Retrieve filter for field: FdmMerchantName (CLEARING_HOUSE_INFO.fdm_merchant_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getFdmMerchantNameFilter () {
    return this.FdmMerchantName;
  }

  /**
   * Retrieves the FdmMerchantNameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FdmMerchantNameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FdmMerchantNameFilter field
   */
  public String[] getFdmMerchantNameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFdmMerchantNameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFdmMerchantNameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFdmMerchantNameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FdmMerchantNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFdmMerchantNameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FdmMerchantNameFilter filter value from a formatted string
   *
   * @param _value the FdmMerchantNameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FdmMerchantNameFilter filter field
   */
  public void setFdmMerchantNameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFdmMerchantNameFilterFromFormattedString");
    try {
      this.setFdmMerchantNameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FdmMerchantNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFdmMerchantNameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFdmMerchantNameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: FdmMerchantNumber (CLEARING_HOUSE_INFO.fdm_merchant_number)
   * @param fetch whether to fetch this field or not
   */
  public void setFdmMerchantNumberFetch (boolean fetch) {
    this.FdmMerchantNumberFetch = fetch;
  }
  /** Retrieve Fetch value for field: FdmMerchantNumber (CLEARING_HOUSE_INFO.fdm_merchant_number)
   * @return boolean the Fetch value for this field
   */
  public boolean getFdmMerchantNumberFetch () {
    return this.FdmMerchantNumberFetch;
  }
  /** Set the SortOrder for field: FdmMerchantNumber (CLEARING_HOUSE_INFO.fdm_merchant_number)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFdmMerchantNumberSortOrder (Integer value) {
    this.FdmMerchantNumberSort = value;
  }
  /** Retrieve SortOrder for field: FdmMerchantNumber (CLEARING_HOUSE_INFO.fdm_merchant_number)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFdmMerchantNumberSortOrder () {
    return this.FdmMerchantNumberSort;
  }
  /** Set the sort direction for field: FdmMerchantNumber (CLEARING_HOUSE_INFO.fdm_merchant_number)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFdmMerchantNumberSortDirection (boolean ascending) {
    this.FdmMerchantNumberSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FdmMerchantNumber (CLEARING_HOUSE_INFO.fdm_merchant_number)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFdmMerchantNumberSortDirection () {
    return this.FdmMerchantNumberSortAscending;
  }
  /** Set the case insensitive for field: FdmMerchantNumber (CLEARING_HOUSE_INFO.fdm_merchant_number)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setFdmMerchantNumberCaseInsensitive (boolean ascending) {
    this.FdmMerchantNumberCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: FdmMerchantNumber (CLEARING_HOUSE_INFO.fdm_merchant_number)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getFdmMerchantNumberCaseInsensitive () {
    return this.FdmMerchantNumberCaseInsensitive;
  }
  /** Set the field level filters for field: FdmMerchantNumber (CLEARING_HOUSE_INFO.fdm_merchant_number)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFdmMerchantNumberFilter (StringFilter[] value) throws ServiceException {
    this.FdmMerchantNumber = value;
  }
  /** Retrieve filter for field: FdmMerchantNumber (CLEARING_HOUSE_INFO.fdm_merchant_number)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getFdmMerchantNumberFilter () {
    return this.FdmMerchantNumber;
  }

  /**
   * Retrieves the FdmMerchantNumberFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FdmMerchantNumberFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FdmMerchantNumberFilter field
   */
  public String[] getFdmMerchantNumberFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFdmMerchantNumberFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFdmMerchantNumberFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFdmMerchantNumberFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FdmMerchantNumberFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFdmMerchantNumberFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FdmMerchantNumberFilter filter value from a formatted string
   *
   * @param _value the FdmMerchantNumberFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FdmMerchantNumberFilter filter field
   */
  public void setFdmMerchantNumberFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFdmMerchantNumberFilterFromFormattedString");
    try {
      this.setFdmMerchantNumberFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FdmMerchantNumberFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFdmMerchantNumberFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFdmMerchantNumberFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: FdmAvsType (CLEARING_HOUSE_INFO.fdm_avs_type)
   * @param fetch whether to fetch this field or not
   */
  public void setFdmAvsTypeFetch (boolean fetch) {
    this.FdmAvsTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: FdmAvsType (CLEARING_HOUSE_INFO.fdm_avs_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getFdmAvsTypeFetch () {
    return this.FdmAvsTypeFetch;
  }
  /** Set the SortOrder for field: FdmAvsType (CLEARING_HOUSE_INFO.fdm_avs_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFdmAvsTypeSortOrder (Integer value) {
    this.FdmAvsTypeSort = value;
  }
  /** Retrieve SortOrder for field: FdmAvsType (CLEARING_HOUSE_INFO.fdm_avs_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFdmAvsTypeSortOrder () {
    return this.FdmAvsTypeSort;
  }
  /** Set the sort direction for field: FdmAvsType (CLEARING_HOUSE_INFO.fdm_avs_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFdmAvsTypeSortDirection (boolean ascending) {
    this.FdmAvsTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FdmAvsType (CLEARING_HOUSE_INFO.fdm_avs_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFdmAvsTypeSortDirection () {
    return this.FdmAvsTypeSortAscending;
  }
  /** Set the field level filters for field: FdmAvsType (CLEARING_HOUSE_INFO.fdm_avs_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFdmAvsTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.FdmAvsType = value;
  }
  /** Retrieve filter for field: FdmAvsType (CLEARING_HOUSE_INFO.fdm_avs_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getFdmAvsTypeFilter () {
    return this.FdmAvsType;
  }

  /**
   * Retrieves the FdmAvsTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FdmAvsTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FdmAvsTypeFilter field
   */
  public String[] getFdmAvsTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFdmAvsTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFdmAvsTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFdmAvsTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FdmAvsTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFdmAvsTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FdmAvsTypeFilter filter value from a formatted string
   *
   * @param _value the FdmAvsTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FdmAvsTypeFilter filter field
   */
  public void setFdmAvsTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFdmAvsTypeFilterFromFormattedString");
    try {
      this.setFdmAvsTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FdmAvsTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFdmAvsTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFdmAvsTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DomRconNumber (CLEARING_HOUSE_INFO.dom_rcon_number)
   * @param fetch whether to fetch this field or not
   */
  public void setDomRconNumberFetch (boolean fetch) {
    this.DomRconNumberFetch = fetch;
  }
  /** Retrieve Fetch value for field: DomRconNumber (CLEARING_HOUSE_INFO.dom_rcon_number)
   * @return boolean the Fetch value for this field
   */
  public boolean getDomRconNumberFetch () {
    return this.DomRconNumberFetch;
  }
  /** Set the SortOrder for field: DomRconNumber (CLEARING_HOUSE_INFO.dom_rcon_number)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDomRconNumberSortOrder (Integer value) {
    this.DomRconNumberSort = value;
  }
  /** Retrieve SortOrder for field: DomRconNumber (CLEARING_HOUSE_INFO.dom_rcon_number)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDomRconNumberSortOrder () {
    return this.DomRconNumberSort;
  }
  /** Set the sort direction for field: DomRconNumber (CLEARING_HOUSE_INFO.dom_rcon_number)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDomRconNumberSortDirection (boolean ascending) {
    this.DomRconNumberSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DomRconNumber (CLEARING_HOUSE_INFO.dom_rcon_number)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDomRconNumberSortDirection () {
    return this.DomRconNumberSortAscending;
  }
  /** Set the case insensitive for field: DomRconNumber (CLEARING_HOUSE_INFO.dom_rcon_number)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDomRconNumberCaseInsensitive (boolean ascending) {
    this.DomRconNumberCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DomRconNumber (CLEARING_HOUSE_INFO.dom_rcon_number)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDomRconNumberCaseInsensitive () {
    return this.DomRconNumberCaseInsensitive;
  }
  /** Set the field level filters for field: DomRconNumber (CLEARING_HOUSE_INFO.dom_rcon_number)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDomRconNumberFilter (StringFilter[] value) throws ServiceException {
    this.DomRconNumber = value;
  }
  /** Retrieve filter for field: DomRconNumber (CLEARING_HOUSE_INFO.dom_rcon_number)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getDomRconNumberFilter () {
    return this.DomRconNumber;
  }

  /**
   * Retrieves the DomRconNumberFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DomRconNumberFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DomRconNumberFilter field
   */
  public String[] getDomRconNumberFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomRconNumberFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDomRconNumberFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDomRconNumberFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DomRconNumberFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDomRconNumberFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DomRconNumberFilter filter value from a formatted string
   *
   * @param _value the DomRconNumberFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DomRconNumberFilter filter field
   */
  public void setDomRconNumberFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDomRconNumberFilterFromFormattedString");
    try {
      this.setDomRconNumberFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DomRconNumberFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDomRconNumberFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDomRconNumberFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DomMailboxId (CLEARING_HOUSE_INFO.dom_mailbox_id)
   * @param fetch whether to fetch this field or not
   */
  public void setDomMailboxIdFetch (boolean fetch) {
    this.DomMailboxIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: DomMailboxId (CLEARING_HOUSE_INFO.dom_mailbox_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getDomMailboxIdFetch () {
    return this.DomMailboxIdFetch;
  }
  /** Set the SortOrder for field: DomMailboxId (CLEARING_HOUSE_INFO.dom_mailbox_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDomMailboxIdSortOrder (Integer value) {
    this.DomMailboxIdSort = value;
  }
  /** Retrieve SortOrder for field: DomMailboxId (CLEARING_HOUSE_INFO.dom_mailbox_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDomMailboxIdSortOrder () {
    return this.DomMailboxIdSort;
  }
  /** Set the sort direction for field: DomMailboxId (CLEARING_HOUSE_INFO.dom_mailbox_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDomMailboxIdSortDirection (boolean ascending) {
    this.DomMailboxIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DomMailboxId (CLEARING_HOUSE_INFO.dom_mailbox_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDomMailboxIdSortDirection () {
    return this.DomMailboxIdSortAscending;
  }
  /** Set the case insensitive for field: DomMailboxId (CLEARING_HOUSE_INFO.dom_mailbox_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDomMailboxIdCaseInsensitive (boolean ascending) {
    this.DomMailboxIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DomMailboxId (CLEARING_HOUSE_INFO.dom_mailbox_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDomMailboxIdCaseInsensitive () {
    return this.DomMailboxIdCaseInsensitive;
  }
  /** Set the field level filters for field: DomMailboxId (CLEARING_HOUSE_INFO.dom_mailbox_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDomMailboxIdFilter (StringFilter[] value) throws ServiceException {
    this.DomMailboxId = value;
  }
  /** Retrieve filter for field: DomMailboxId (CLEARING_HOUSE_INFO.dom_mailbox_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getDomMailboxIdFilter () {
    return this.DomMailboxId;
  }

  /**
   * Retrieves the DomMailboxIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DomMailboxIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DomMailboxIdFilter field
   */
  public String[] getDomMailboxIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomMailboxIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDomMailboxIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDomMailboxIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DomMailboxIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDomMailboxIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DomMailboxIdFilter filter value from a formatted string
   *
   * @param _value the DomMailboxIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DomMailboxIdFilter filter field
   */
  public void setDomMailboxIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDomMailboxIdFilterFromFormattedString");
    try {
      this.setDomMailboxIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DomMailboxIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDomMailboxIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDomMailboxIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DomFundOrig (CLEARING_HOUSE_INFO.dom_fund_orig)
   * @param fetch whether to fetch this field or not
   */
  public void setDomFundOrigFetch (boolean fetch) {
    this.DomFundOrigFetch = fetch;
  }
  /** Retrieve Fetch value for field: DomFundOrig (CLEARING_HOUSE_INFO.dom_fund_orig)
   * @return boolean the Fetch value for this field
   */
  public boolean getDomFundOrigFetch () {
    return this.DomFundOrigFetch;
  }
  /** Set the SortOrder for field: DomFundOrig (CLEARING_HOUSE_INFO.dom_fund_orig)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDomFundOrigSortOrder (Integer value) {
    this.DomFundOrigSort = value;
  }
  /** Retrieve SortOrder for field: DomFundOrig (CLEARING_HOUSE_INFO.dom_fund_orig)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDomFundOrigSortOrder () {
    return this.DomFundOrigSort;
  }
  /** Set the sort direction for field: DomFundOrig (CLEARING_HOUSE_INFO.dom_fund_orig)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDomFundOrigSortDirection (boolean ascending) {
    this.DomFundOrigSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DomFundOrig (CLEARING_HOUSE_INFO.dom_fund_orig)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDomFundOrigSortDirection () {
    return this.DomFundOrigSortAscending;
  }
  /** Set the case insensitive for field: DomFundOrig (CLEARING_HOUSE_INFO.dom_fund_orig)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDomFundOrigCaseInsensitive (boolean ascending) {
    this.DomFundOrigCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DomFundOrig (CLEARING_HOUSE_INFO.dom_fund_orig)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDomFundOrigCaseInsensitive () {
    return this.DomFundOrigCaseInsensitive;
  }
  /** Set the field level filters for field: DomFundOrig (CLEARING_HOUSE_INFO.dom_fund_orig)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDomFundOrigFilter (StringFilter[] value) throws ServiceException {
    this.DomFundOrig = value;
  }
  /** Retrieve filter for field: DomFundOrig (CLEARING_HOUSE_INFO.dom_fund_orig)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getDomFundOrigFilter () {
    return this.DomFundOrig;
  }

  /**
   * Retrieves the DomFundOrigFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DomFundOrigFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DomFundOrigFilter field
   */
  public String[] getDomFundOrigFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomFundOrigFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDomFundOrigFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDomFundOrigFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DomFundOrigFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDomFundOrigFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DomFundOrigFilter filter value from a formatted string
   *
   * @param _value the DomFundOrigFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DomFundOrigFilter filter field
   */
  public void setDomFundOrigFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDomFundOrigFilterFromFormattedString");
    try {
      this.setDomFundOrigFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DomFundOrigFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDomFundOrigFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDomFundOrigFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DomFundDest (CLEARING_HOUSE_INFO.dom_fund_dest)
   * @param fetch whether to fetch this field or not
   */
  public void setDomFundDestFetch (boolean fetch) {
    this.DomFundDestFetch = fetch;
  }
  /** Retrieve Fetch value for field: DomFundDest (CLEARING_HOUSE_INFO.dom_fund_dest)
   * @return boolean the Fetch value for this field
   */
  public boolean getDomFundDestFetch () {
    return this.DomFundDestFetch;
  }
  /** Set the SortOrder for field: DomFundDest (CLEARING_HOUSE_INFO.dom_fund_dest)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDomFundDestSortOrder (Integer value) {
    this.DomFundDestSort = value;
  }
  /** Retrieve SortOrder for field: DomFundDest (CLEARING_HOUSE_INFO.dom_fund_dest)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDomFundDestSortOrder () {
    return this.DomFundDestSort;
  }
  /** Set the sort direction for field: DomFundDest (CLEARING_HOUSE_INFO.dom_fund_dest)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDomFundDestSortDirection (boolean ascending) {
    this.DomFundDestSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DomFundDest (CLEARING_HOUSE_INFO.dom_fund_dest)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDomFundDestSortDirection () {
    return this.DomFundDestSortAscending;
  }
  /** Set the case insensitive for field: DomFundDest (CLEARING_HOUSE_INFO.dom_fund_dest)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDomFundDestCaseInsensitive (boolean ascending) {
    this.DomFundDestCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DomFundDest (CLEARING_HOUSE_INFO.dom_fund_dest)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDomFundDestCaseInsensitive () {
    return this.DomFundDestCaseInsensitive;
  }
  /** Set the field level filters for field: DomFundDest (CLEARING_HOUSE_INFO.dom_fund_dest)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDomFundDestFilter (StringFilter[] value) throws ServiceException {
    this.DomFundDest = value;
  }
  /** Retrieve filter for field: DomFundDest (CLEARING_HOUSE_INFO.dom_fund_dest)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getDomFundDestFilter () {
    return this.DomFundDest;
  }

  /**
   * Retrieves the DomFundDestFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DomFundDestFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DomFundDestFilter field
   */
  public String[] getDomFundDestFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomFundDestFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDomFundDestFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDomFundDestFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DomFundDestFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDomFundDestFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DomFundDestFilter filter value from a formatted string
   *
   * @param _value the DomFundDestFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DomFundDestFilter filter field
   */
  public void setDomFundDestFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDomFundDestFilterFromFormattedString");
    try {
      this.setDomFundDestFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DomFundDestFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDomFundDestFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDomFundDestFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DomVisaOrig (CLEARING_HOUSE_INFO.dom_visa_orig)
   * @param fetch whether to fetch this field or not
   */
  public void setDomVisaOrigFetch (boolean fetch) {
    this.DomVisaOrigFetch = fetch;
  }
  /** Retrieve Fetch value for field: DomVisaOrig (CLEARING_HOUSE_INFO.dom_visa_orig)
   * @return boolean the Fetch value for this field
   */
  public boolean getDomVisaOrigFetch () {
    return this.DomVisaOrigFetch;
  }
  /** Set the SortOrder for field: DomVisaOrig (CLEARING_HOUSE_INFO.dom_visa_orig)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDomVisaOrigSortOrder (Integer value) {
    this.DomVisaOrigSort = value;
  }
  /** Retrieve SortOrder for field: DomVisaOrig (CLEARING_HOUSE_INFO.dom_visa_orig)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDomVisaOrigSortOrder () {
    return this.DomVisaOrigSort;
  }
  /** Set the sort direction for field: DomVisaOrig (CLEARING_HOUSE_INFO.dom_visa_orig)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDomVisaOrigSortDirection (boolean ascending) {
    this.DomVisaOrigSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DomVisaOrig (CLEARING_HOUSE_INFO.dom_visa_orig)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDomVisaOrigSortDirection () {
    return this.DomVisaOrigSortAscending;
  }
  /** Set the case insensitive for field: DomVisaOrig (CLEARING_HOUSE_INFO.dom_visa_orig)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDomVisaOrigCaseInsensitive (boolean ascending) {
    this.DomVisaOrigCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DomVisaOrig (CLEARING_HOUSE_INFO.dom_visa_orig)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDomVisaOrigCaseInsensitive () {
    return this.DomVisaOrigCaseInsensitive;
  }
  /** Set the field level filters for field: DomVisaOrig (CLEARING_HOUSE_INFO.dom_visa_orig)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDomVisaOrigFilter (StringFilter[] value) throws ServiceException {
    this.DomVisaOrig = value;
  }
  /** Retrieve filter for field: DomVisaOrig (CLEARING_HOUSE_INFO.dom_visa_orig)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getDomVisaOrigFilter () {
    return this.DomVisaOrig;
  }

  /**
   * Retrieves the DomVisaOrigFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DomVisaOrigFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DomVisaOrigFilter field
   */
  public String[] getDomVisaOrigFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomVisaOrigFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDomVisaOrigFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDomVisaOrigFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DomVisaOrigFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDomVisaOrigFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DomVisaOrigFilter filter value from a formatted string
   *
   * @param _value the DomVisaOrigFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DomVisaOrigFilter filter field
   */
  public void setDomVisaOrigFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDomVisaOrigFilterFromFormattedString");
    try {
      this.setDomVisaOrigFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DomVisaOrigFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDomVisaOrigFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDomVisaOrigFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DomVisaDest (CLEARING_HOUSE_INFO.dom_visa_dest)
   * @param fetch whether to fetch this field or not
   */
  public void setDomVisaDestFetch (boolean fetch) {
    this.DomVisaDestFetch = fetch;
  }
  /** Retrieve Fetch value for field: DomVisaDest (CLEARING_HOUSE_INFO.dom_visa_dest)
   * @return boolean the Fetch value for this field
   */
  public boolean getDomVisaDestFetch () {
    return this.DomVisaDestFetch;
  }
  /** Set the SortOrder for field: DomVisaDest (CLEARING_HOUSE_INFO.dom_visa_dest)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDomVisaDestSortOrder (Integer value) {
    this.DomVisaDestSort = value;
  }
  /** Retrieve SortOrder for field: DomVisaDest (CLEARING_HOUSE_INFO.dom_visa_dest)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDomVisaDestSortOrder () {
    return this.DomVisaDestSort;
  }
  /** Set the sort direction for field: DomVisaDest (CLEARING_HOUSE_INFO.dom_visa_dest)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDomVisaDestSortDirection (boolean ascending) {
    this.DomVisaDestSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DomVisaDest (CLEARING_HOUSE_INFO.dom_visa_dest)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDomVisaDestSortDirection () {
    return this.DomVisaDestSortAscending;
  }
  /** Set the case insensitive for field: DomVisaDest (CLEARING_HOUSE_INFO.dom_visa_dest)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDomVisaDestCaseInsensitive (boolean ascending) {
    this.DomVisaDestCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DomVisaDest (CLEARING_HOUSE_INFO.dom_visa_dest)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDomVisaDestCaseInsensitive () {
    return this.DomVisaDestCaseInsensitive;
  }
  /** Set the field level filters for field: DomVisaDest (CLEARING_HOUSE_INFO.dom_visa_dest)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDomVisaDestFilter (StringFilter[] value) throws ServiceException {
    this.DomVisaDest = value;
  }
  /** Retrieve filter for field: DomVisaDest (CLEARING_HOUSE_INFO.dom_visa_dest)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getDomVisaDestFilter () {
    return this.DomVisaDest;
  }

  /**
   * Retrieves the DomVisaDestFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DomVisaDestFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DomVisaDestFilter field
   */
  public String[] getDomVisaDestFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomVisaDestFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDomVisaDestFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDomVisaDestFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DomVisaDestFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDomVisaDestFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DomVisaDestFilter filter value from a formatted string
   *
   * @param _value the DomVisaDestFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DomVisaDestFilter filter field
   */
  public void setDomVisaDestFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDomVisaDestFilterFromFormattedString");
    try {
      this.setDomVisaDestFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DomVisaDestFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDomVisaDestFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDomVisaDestFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DomMscOrig (CLEARING_HOUSE_INFO.dom_msc_orig)
   * @param fetch whether to fetch this field or not
   */
  public void setDomMscOrigFetch (boolean fetch) {
    this.DomMscOrigFetch = fetch;
  }
  /** Retrieve Fetch value for field: DomMscOrig (CLEARING_HOUSE_INFO.dom_msc_orig)
   * @return boolean the Fetch value for this field
   */
  public boolean getDomMscOrigFetch () {
    return this.DomMscOrigFetch;
  }
  /** Set the SortOrder for field: DomMscOrig (CLEARING_HOUSE_INFO.dom_msc_orig)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDomMscOrigSortOrder (Integer value) {
    this.DomMscOrigSort = value;
  }
  /** Retrieve SortOrder for field: DomMscOrig (CLEARING_HOUSE_INFO.dom_msc_orig)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDomMscOrigSortOrder () {
    return this.DomMscOrigSort;
  }
  /** Set the sort direction for field: DomMscOrig (CLEARING_HOUSE_INFO.dom_msc_orig)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDomMscOrigSortDirection (boolean ascending) {
    this.DomMscOrigSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DomMscOrig (CLEARING_HOUSE_INFO.dom_msc_orig)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDomMscOrigSortDirection () {
    return this.DomMscOrigSortAscending;
  }
  /** Set the case insensitive for field: DomMscOrig (CLEARING_HOUSE_INFO.dom_msc_orig)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDomMscOrigCaseInsensitive (boolean ascending) {
    this.DomMscOrigCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DomMscOrig (CLEARING_HOUSE_INFO.dom_msc_orig)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDomMscOrigCaseInsensitive () {
    return this.DomMscOrigCaseInsensitive;
  }
  /** Set the field level filters for field: DomMscOrig (CLEARING_HOUSE_INFO.dom_msc_orig)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDomMscOrigFilter (StringFilter[] value) throws ServiceException {
    this.DomMscOrig = value;
  }
  /** Retrieve filter for field: DomMscOrig (CLEARING_HOUSE_INFO.dom_msc_orig)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getDomMscOrigFilter () {
    return this.DomMscOrig;
  }

  /**
   * Retrieves the DomMscOrigFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DomMscOrigFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DomMscOrigFilter field
   */
  public String[] getDomMscOrigFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomMscOrigFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDomMscOrigFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDomMscOrigFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DomMscOrigFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDomMscOrigFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DomMscOrigFilter filter value from a formatted string
   *
   * @param _value the DomMscOrigFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DomMscOrigFilter filter field
   */
  public void setDomMscOrigFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDomMscOrigFilterFromFormattedString");
    try {
      this.setDomMscOrigFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DomMscOrigFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDomMscOrigFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDomMscOrigFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DomMscDest (CLEARING_HOUSE_INFO.dom_msc_dest)
   * @param fetch whether to fetch this field or not
   */
  public void setDomMscDestFetch (boolean fetch) {
    this.DomMscDestFetch = fetch;
  }
  /** Retrieve Fetch value for field: DomMscDest (CLEARING_HOUSE_INFO.dom_msc_dest)
   * @return boolean the Fetch value for this field
   */
  public boolean getDomMscDestFetch () {
    return this.DomMscDestFetch;
  }
  /** Set the SortOrder for field: DomMscDest (CLEARING_HOUSE_INFO.dom_msc_dest)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDomMscDestSortOrder (Integer value) {
    this.DomMscDestSort = value;
  }
  /** Retrieve SortOrder for field: DomMscDest (CLEARING_HOUSE_INFO.dom_msc_dest)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDomMscDestSortOrder () {
    return this.DomMscDestSort;
  }
  /** Set the sort direction for field: DomMscDest (CLEARING_HOUSE_INFO.dom_msc_dest)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDomMscDestSortDirection (boolean ascending) {
    this.DomMscDestSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DomMscDest (CLEARING_HOUSE_INFO.dom_msc_dest)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDomMscDestSortDirection () {
    return this.DomMscDestSortAscending;
  }
  /** Set the case insensitive for field: DomMscDest (CLEARING_HOUSE_INFO.dom_msc_dest)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDomMscDestCaseInsensitive (boolean ascending) {
    this.DomMscDestCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DomMscDest (CLEARING_HOUSE_INFO.dom_msc_dest)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDomMscDestCaseInsensitive () {
    return this.DomMscDestCaseInsensitive;
  }
  /** Set the field level filters for field: DomMscDest (CLEARING_HOUSE_INFO.dom_msc_dest)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDomMscDestFilter (StringFilter[] value) throws ServiceException {
    this.DomMscDest = value;
  }
  /** Retrieve filter for field: DomMscDest (CLEARING_HOUSE_INFO.dom_msc_dest)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getDomMscDestFilter () {
    return this.DomMscDest;
  }

  /**
   * Retrieves the DomMscDestFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DomMscDestFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DomMscDestFilter field
   */
  public String[] getDomMscDestFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomMscDestFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDomMscDestFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDomMscDestFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DomMscDestFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDomMscDestFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DomMscDestFilter filter value from a formatted string
   *
   * @param _value the DomMscDestFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DomMscDestFilter filter field
   */
  public void setDomMscDestFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDomMscDestFilterFromFormattedString");
    try {
      this.setDomMscDestFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DomMscDestFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDomMscDestFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDomMscDestFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DomAmexProcessId (CLEARING_HOUSE_INFO.dom_amex_process_id)
   * @param fetch whether to fetch this field or not
   */
  public void setDomAmexProcessIdFetch (boolean fetch) {
    this.DomAmexProcessIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: DomAmexProcessId (CLEARING_HOUSE_INFO.dom_amex_process_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getDomAmexProcessIdFetch () {
    return this.DomAmexProcessIdFetch;
  }
  /** Set the SortOrder for field: DomAmexProcessId (CLEARING_HOUSE_INFO.dom_amex_process_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDomAmexProcessIdSortOrder (Integer value) {
    this.DomAmexProcessIdSort = value;
  }
  /** Retrieve SortOrder for field: DomAmexProcessId (CLEARING_HOUSE_INFO.dom_amex_process_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDomAmexProcessIdSortOrder () {
    return this.DomAmexProcessIdSort;
  }
  /** Set the sort direction for field: DomAmexProcessId (CLEARING_HOUSE_INFO.dom_amex_process_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDomAmexProcessIdSortDirection (boolean ascending) {
    this.DomAmexProcessIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DomAmexProcessId (CLEARING_HOUSE_INFO.dom_amex_process_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDomAmexProcessIdSortDirection () {
    return this.DomAmexProcessIdSortAscending;
  }
  /** Set the case insensitive for field: DomAmexProcessId (CLEARING_HOUSE_INFO.dom_amex_process_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDomAmexProcessIdCaseInsensitive (boolean ascending) {
    this.DomAmexProcessIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DomAmexProcessId (CLEARING_HOUSE_INFO.dom_amex_process_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDomAmexProcessIdCaseInsensitive () {
    return this.DomAmexProcessIdCaseInsensitive;
  }
  /** Set the field level filters for field: DomAmexProcessId (CLEARING_HOUSE_INFO.dom_amex_process_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDomAmexProcessIdFilter (StringFilter[] value) throws ServiceException {
    this.DomAmexProcessId = value;
  }
  /** Retrieve filter for field: DomAmexProcessId (CLEARING_HOUSE_INFO.dom_amex_process_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getDomAmexProcessIdFilter () {
    return this.DomAmexProcessId;
  }

  /**
   * Retrieves the DomAmexProcessIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DomAmexProcessIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DomAmexProcessIdFilter field
   */
  public String[] getDomAmexProcessIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomAmexProcessIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDomAmexProcessIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDomAmexProcessIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DomAmexProcessIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDomAmexProcessIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DomAmexProcessIdFilter filter value from a formatted string
   *
   * @param _value the DomAmexProcessIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DomAmexProcessIdFilter filter field
   */
  public void setDomAmexProcessIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDomAmexProcessIdFilterFromFormattedString");
    try {
      this.setDomAmexProcessIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DomAmexProcessIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDomAmexProcessIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDomAmexProcessIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DomAmexReceiverId (CLEARING_HOUSE_INFO.dom_amex_receiver_id)
   * @param fetch whether to fetch this field or not
   */
  public void setDomAmexReceiverIdFetch (boolean fetch) {
    this.DomAmexReceiverIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: DomAmexReceiverId (CLEARING_HOUSE_INFO.dom_amex_receiver_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getDomAmexReceiverIdFetch () {
    return this.DomAmexReceiverIdFetch;
  }
  /** Set the SortOrder for field: DomAmexReceiverId (CLEARING_HOUSE_INFO.dom_amex_receiver_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDomAmexReceiverIdSortOrder (Integer value) {
    this.DomAmexReceiverIdSort = value;
  }
  /** Retrieve SortOrder for field: DomAmexReceiverId (CLEARING_HOUSE_INFO.dom_amex_receiver_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDomAmexReceiverIdSortOrder () {
    return this.DomAmexReceiverIdSort;
  }
  /** Set the sort direction for field: DomAmexReceiverId (CLEARING_HOUSE_INFO.dom_amex_receiver_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDomAmexReceiverIdSortDirection (boolean ascending) {
    this.DomAmexReceiverIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DomAmexReceiverId (CLEARING_HOUSE_INFO.dom_amex_receiver_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDomAmexReceiverIdSortDirection () {
    return this.DomAmexReceiverIdSortAscending;
  }
  /** Set the case insensitive for field: DomAmexReceiverId (CLEARING_HOUSE_INFO.dom_amex_receiver_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDomAmexReceiverIdCaseInsensitive (boolean ascending) {
    this.DomAmexReceiverIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DomAmexReceiverId (CLEARING_HOUSE_INFO.dom_amex_receiver_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDomAmexReceiverIdCaseInsensitive () {
    return this.DomAmexReceiverIdCaseInsensitive;
  }
  /** Set the field level filters for field: DomAmexReceiverId (CLEARING_HOUSE_INFO.dom_amex_receiver_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDomAmexReceiverIdFilter (StringFilter[] value) throws ServiceException {
    this.DomAmexReceiverId = value;
  }
  /** Retrieve filter for field: DomAmexReceiverId (CLEARING_HOUSE_INFO.dom_amex_receiver_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getDomAmexReceiverIdFilter () {
    return this.DomAmexReceiverId;
  }

  /**
   * Retrieves the DomAmexReceiverIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DomAmexReceiverIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DomAmexReceiverIdFilter field
   */
  public String[] getDomAmexReceiverIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomAmexReceiverIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDomAmexReceiverIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDomAmexReceiverIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DomAmexReceiverIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDomAmexReceiverIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DomAmexReceiverIdFilter filter value from a formatted string
   *
   * @param _value the DomAmexReceiverIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DomAmexReceiverIdFilter filter field
   */
  public void setDomAmexReceiverIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDomAmexReceiverIdFilterFromFormattedString");
    try {
      this.setDomAmexReceiverIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DomAmexReceiverIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDomAmexReceiverIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDomAmexReceiverIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DomAmexFormatCode (CLEARING_HOUSE_INFO.dom_amex_format_code)
   * @param fetch whether to fetch this field or not
   */
  public void setDomAmexFormatCodeFetch (boolean fetch) {
    this.DomAmexFormatCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: DomAmexFormatCode (CLEARING_HOUSE_INFO.dom_amex_format_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getDomAmexFormatCodeFetch () {
    return this.DomAmexFormatCodeFetch;
  }
  /** Set the SortOrder for field: DomAmexFormatCode (CLEARING_HOUSE_INFO.dom_amex_format_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDomAmexFormatCodeSortOrder (Integer value) {
    this.DomAmexFormatCodeSort = value;
  }
  /** Retrieve SortOrder for field: DomAmexFormatCode (CLEARING_HOUSE_INFO.dom_amex_format_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDomAmexFormatCodeSortOrder () {
    return this.DomAmexFormatCodeSort;
  }
  /** Set the sort direction for field: DomAmexFormatCode (CLEARING_HOUSE_INFO.dom_amex_format_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDomAmexFormatCodeSortDirection (boolean ascending) {
    this.DomAmexFormatCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DomAmexFormatCode (CLEARING_HOUSE_INFO.dom_amex_format_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDomAmexFormatCodeSortDirection () {
    return this.DomAmexFormatCodeSortAscending;
  }
  /** Set the case insensitive for field: DomAmexFormatCode (CLEARING_HOUSE_INFO.dom_amex_format_code)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDomAmexFormatCodeCaseInsensitive (boolean ascending) {
    this.DomAmexFormatCodeCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DomAmexFormatCode (CLEARING_HOUSE_INFO.dom_amex_format_code)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDomAmexFormatCodeCaseInsensitive () {
    return this.DomAmexFormatCodeCaseInsensitive;
  }
  /** Set the field level filters for field: DomAmexFormatCode (CLEARING_HOUSE_INFO.dom_amex_format_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDomAmexFormatCodeFilter (StringFilter[] value) throws ServiceException {
    this.DomAmexFormatCode = value;
  }
  /** Retrieve filter for field: DomAmexFormatCode (CLEARING_HOUSE_INFO.dom_amex_format_code)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getDomAmexFormatCodeFilter () {
    return this.DomAmexFormatCode;
  }

  /**
   * Retrieves the DomAmexFormatCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DomAmexFormatCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DomAmexFormatCodeFilter field
   */
  public String[] getDomAmexFormatCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomAmexFormatCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDomAmexFormatCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDomAmexFormatCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DomAmexFormatCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDomAmexFormatCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DomAmexFormatCodeFilter filter value from a formatted string
   *
   * @param _value the DomAmexFormatCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DomAmexFormatCodeFilter filter field
   */
  public void setDomAmexFormatCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDomAmexFormatCodeFilterFromFormattedString");
    try {
      this.setDomAmexFormatCodeFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DomAmexFormatCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDomAmexFormatCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDomAmexFormatCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DomPhoneDest (CLEARING_HOUSE_INFO.dom_phone_dest)
   * @param fetch whether to fetch this field or not
   */
  public void setDomPhoneDestFetch (boolean fetch) {
    this.DomPhoneDestFetch = fetch;
  }
  /** Retrieve Fetch value for field: DomPhoneDest (CLEARING_HOUSE_INFO.dom_phone_dest)
   * @return boolean the Fetch value for this field
   */
  public boolean getDomPhoneDestFetch () {
    return this.DomPhoneDestFetch;
  }
  /** Set the SortOrder for field: DomPhoneDest (CLEARING_HOUSE_INFO.dom_phone_dest)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDomPhoneDestSortOrder (Integer value) {
    this.DomPhoneDestSort = value;
  }
  /** Retrieve SortOrder for field: DomPhoneDest (CLEARING_HOUSE_INFO.dom_phone_dest)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDomPhoneDestSortOrder () {
    return this.DomPhoneDestSort;
  }
  /** Set the sort direction for field: DomPhoneDest (CLEARING_HOUSE_INFO.dom_phone_dest)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDomPhoneDestSortDirection (boolean ascending) {
    this.DomPhoneDestSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DomPhoneDest (CLEARING_HOUSE_INFO.dom_phone_dest)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDomPhoneDestSortDirection () {
    return this.DomPhoneDestSortAscending;
  }
  /** Set the case insensitive for field: DomPhoneDest (CLEARING_HOUSE_INFO.dom_phone_dest)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDomPhoneDestCaseInsensitive (boolean ascending) {
    this.DomPhoneDestCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DomPhoneDest (CLEARING_HOUSE_INFO.dom_phone_dest)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDomPhoneDestCaseInsensitive () {
    return this.DomPhoneDestCaseInsensitive;
  }
  /** Set the field level filters for field: DomPhoneDest (CLEARING_HOUSE_INFO.dom_phone_dest)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDomPhoneDestFilter (StringFilter[] value) throws ServiceException {
    this.DomPhoneDest = value;
  }
  /** Retrieve filter for field: DomPhoneDest (CLEARING_HOUSE_INFO.dom_phone_dest)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getDomPhoneDestFilter () {
    return this.DomPhoneDest;
  }

  /**
   * Retrieves the DomPhoneDestFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DomPhoneDestFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DomPhoneDestFilter field
   */
  public String[] getDomPhoneDestFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomPhoneDestFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDomPhoneDestFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDomPhoneDestFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DomPhoneDestFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDomPhoneDestFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DomPhoneDestFilter filter value from a formatted string
   *
   * @param _value the DomPhoneDestFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DomPhoneDestFilter filter field
   */
  public void setDomPhoneDestFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDomPhoneDestFilterFromFormattedString");
    try {
      this.setDomPhoneDestFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DomPhoneDestFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDomPhoneDestFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDomPhoneDestFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DomCurrencyInd (CLEARING_HOUSE_INFO.dom_currency_ind)
   * @param fetch whether to fetch this field or not
   */
  public void setDomCurrencyIndFetch (boolean fetch) {
    this.DomCurrencyIndFetch = fetch;
  }
  /** Retrieve Fetch value for field: DomCurrencyInd (CLEARING_HOUSE_INFO.dom_currency_ind)
   * @return boolean the Fetch value for this field
   */
  public boolean getDomCurrencyIndFetch () {
    return this.DomCurrencyIndFetch;
  }
  /** Set the SortOrder for field: DomCurrencyInd (CLEARING_HOUSE_INFO.dom_currency_ind)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDomCurrencyIndSortOrder (Integer value) {
    this.DomCurrencyIndSort = value;
  }
  /** Retrieve SortOrder for field: DomCurrencyInd (CLEARING_HOUSE_INFO.dom_currency_ind)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDomCurrencyIndSortOrder () {
    return this.DomCurrencyIndSort;
  }
  /** Set the sort direction for field: DomCurrencyInd (CLEARING_HOUSE_INFO.dom_currency_ind)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDomCurrencyIndSortDirection (boolean ascending) {
    this.DomCurrencyIndSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DomCurrencyInd (CLEARING_HOUSE_INFO.dom_currency_ind)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDomCurrencyIndSortDirection () {
    return this.DomCurrencyIndSortAscending;
  }
  /** Set the case insensitive for field: DomCurrencyInd (CLEARING_HOUSE_INFO.dom_currency_ind)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDomCurrencyIndCaseInsensitive (boolean ascending) {
    this.DomCurrencyIndCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DomCurrencyInd (CLEARING_HOUSE_INFO.dom_currency_ind)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDomCurrencyIndCaseInsensitive () {
    return this.DomCurrencyIndCaseInsensitive;
  }
  /** Set the field level filters for field: DomCurrencyInd (CLEARING_HOUSE_INFO.dom_currency_ind)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDomCurrencyIndFilter (StringFilter[] value) throws ServiceException {
    this.DomCurrencyInd = value;
  }
  /** Retrieve filter for field: DomCurrencyInd (CLEARING_HOUSE_INFO.dom_currency_ind)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getDomCurrencyIndFilter () {
    return this.DomCurrencyInd;
  }

  /**
   * Retrieves the DomCurrencyIndFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DomCurrencyIndFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DomCurrencyIndFilter field
   */
  public String[] getDomCurrencyIndFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomCurrencyIndFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDomCurrencyIndFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDomCurrencyIndFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DomCurrencyIndFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDomCurrencyIndFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DomCurrencyIndFilter filter value from a formatted string
   *
   * @param _value the DomCurrencyIndFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DomCurrencyIndFilter filter field
   */
  public void setDomCurrencyIndFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDomCurrencyIndFilterFromFormattedString");
    try {
      this.setDomCurrencyIndFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DomCurrencyIndFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDomCurrencyIndFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDomCurrencyIndFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DomFundInstId (CLEARING_HOUSE_INFO.dom_fund_inst_id)
   * @param fetch whether to fetch this field or not
   */
  public void setDomFundInstIdFetch (boolean fetch) {
    this.DomFundInstIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: DomFundInstId (CLEARING_HOUSE_INFO.dom_fund_inst_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getDomFundInstIdFetch () {
    return this.DomFundInstIdFetch;
  }
  /** Set the SortOrder for field: DomFundInstId (CLEARING_HOUSE_INFO.dom_fund_inst_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDomFundInstIdSortOrder (Integer value) {
    this.DomFundInstIdSort = value;
  }
  /** Retrieve SortOrder for field: DomFundInstId (CLEARING_HOUSE_INFO.dom_fund_inst_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDomFundInstIdSortOrder () {
    return this.DomFundInstIdSort;
  }
  /** Set the sort direction for field: DomFundInstId (CLEARING_HOUSE_INFO.dom_fund_inst_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDomFundInstIdSortDirection (boolean ascending) {
    this.DomFundInstIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DomFundInstId (CLEARING_HOUSE_INFO.dom_fund_inst_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDomFundInstIdSortDirection () {
    return this.DomFundInstIdSortAscending;
  }
  /** Set the case insensitive for field: DomFundInstId (CLEARING_HOUSE_INFO.dom_fund_inst_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDomFundInstIdCaseInsensitive (boolean ascending) {
    this.DomFundInstIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DomFundInstId (CLEARING_HOUSE_INFO.dom_fund_inst_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDomFundInstIdCaseInsensitive () {
    return this.DomFundInstIdCaseInsensitive;
  }
  /** Set the field level filters for field: DomFundInstId (CLEARING_HOUSE_INFO.dom_fund_inst_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDomFundInstIdFilter (StringFilter[] value) throws ServiceException {
    this.DomFundInstId = value;
  }
  /** Retrieve filter for field: DomFundInstId (CLEARING_HOUSE_INFO.dom_fund_inst_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getDomFundInstIdFilter () {
    return this.DomFundInstId;
  }

  /**
   * Retrieves the DomFundInstIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DomFundInstIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DomFundInstIdFilter field
   */
  public String[] getDomFundInstIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomFundInstIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDomFundInstIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDomFundInstIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DomFundInstIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDomFundInstIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DomFundInstIdFilter filter value from a formatted string
   *
   * @param _value the DomFundInstIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DomFundInstIdFilter filter field
   */
  public void setDomFundInstIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDomFundInstIdFilterFromFormattedString");
    try {
      this.setDomFundInstIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DomFundInstIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDomFundInstIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDomFundInstIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DomFundAcctNum (CLEARING_HOUSE_INFO.dom_fund_acct_num)
   * @param fetch whether to fetch this field or not
   */
  public void setDomFundAcctNumFetch (boolean fetch) {
    this.DomFundAcctNumFetch = fetch;
  }
  /** Retrieve Fetch value for field: DomFundAcctNum (CLEARING_HOUSE_INFO.dom_fund_acct_num)
   * @return boolean the Fetch value for this field
   */
  public boolean getDomFundAcctNumFetch () {
    return this.DomFundAcctNumFetch;
  }
  /** Set the SortOrder for field: DomFundAcctNum (CLEARING_HOUSE_INFO.dom_fund_acct_num)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDomFundAcctNumSortOrder (Integer value) {
    this.DomFundAcctNumSort = value;
  }
  /** Retrieve SortOrder for field: DomFundAcctNum (CLEARING_HOUSE_INFO.dom_fund_acct_num)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDomFundAcctNumSortOrder () {
    return this.DomFundAcctNumSort;
  }
  /** Set the sort direction for field: DomFundAcctNum (CLEARING_HOUSE_INFO.dom_fund_acct_num)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDomFundAcctNumSortDirection (boolean ascending) {
    this.DomFundAcctNumSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DomFundAcctNum (CLEARING_HOUSE_INFO.dom_fund_acct_num)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDomFundAcctNumSortDirection () {
    return this.DomFundAcctNumSortAscending;
  }
  /** Set the case insensitive for field: DomFundAcctNum (CLEARING_HOUSE_INFO.dom_fund_acct_num)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDomFundAcctNumCaseInsensitive (boolean ascending) {
    this.DomFundAcctNumCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DomFundAcctNum (CLEARING_HOUSE_INFO.dom_fund_acct_num)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDomFundAcctNumCaseInsensitive () {
    return this.DomFundAcctNumCaseInsensitive;
  }
  /** Set the field level filters for field: DomFundAcctNum (CLEARING_HOUSE_INFO.dom_fund_acct_num)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDomFundAcctNumFilter (StringFilter[] value) throws ServiceException {
    this.DomFundAcctNum = value;
  }
  /** Retrieve filter for field: DomFundAcctNum (CLEARING_HOUSE_INFO.dom_fund_acct_num)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getDomFundAcctNumFilter () {
    return this.DomFundAcctNum;
  }

  /**
   * Retrieves the DomFundAcctNumFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DomFundAcctNumFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DomFundAcctNumFilter field
   */
  public String[] getDomFundAcctNumFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomFundAcctNumFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDomFundAcctNumFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDomFundAcctNumFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DomFundAcctNumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDomFundAcctNumFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DomFundAcctNumFilter filter value from a formatted string
   *
   * @param _value the DomFundAcctNumFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DomFundAcctNumFilter filter field
   */
  public void setDomFundAcctNumFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDomFundAcctNumFilterFromFormattedString");
    try {
      this.setDomFundAcctNumFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DomFundAcctNumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDomFundAcctNumFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDomFundAcctNumFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DomBatchLimit (CLEARING_HOUSE_INFO.dom_batch_limit)
   * @param fetch whether to fetch this field or not
   */
  public void setDomBatchLimitFetch (boolean fetch) {
    this.DomBatchLimitFetch = fetch;
  }
  /** Retrieve Fetch value for field: DomBatchLimit (CLEARING_HOUSE_INFO.dom_batch_limit)
   * @return boolean the Fetch value for this field
   */
  public boolean getDomBatchLimitFetch () {
    return this.DomBatchLimitFetch;
  }
  /** Set the SortOrder for field: DomBatchLimit (CLEARING_HOUSE_INFO.dom_batch_limit)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDomBatchLimitSortOrder (Integer value) {
    this.DomBatchLimitSort = value;
  }
  /** Retrieve SortOrder for field: DomBatchLimit (CLEARING_HOUSE_INFO.dom_batch_limit)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDomBatchLimitSortOrder () {
    return this.DomBatchLimitSort;
  }
  /** Set the sort direction for field: DomBatchLimit (CLEARING_HOUSE_INFO.dom_batch_limit)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDomBatchLimitSortDirection (boolean ascending) {
    this.DomBatchLimitSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DomBatchLimit (CLEARING_HOUSE_INFO.dom_batch_limit)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDomBatchLimitSortDirection () {
    return this.DomBatchLimitSortAscending;
  }
  /** Set the field level filters for field: DomBatchLimit (CLEARING_HOUSE_INFO.dom_batch_limit)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDomBatchLimitFilter (IntegerFilter[] value) throws ServiceException {
    this.DomBatchLimit = value;
  }
  /** Retrieve filter for field: DomBatchLimit (CLEARING_HOUSE_INFO.dom_batch_limit)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDomBatchLimitFilter () {
    return this.DomBatchLimit;
  }

  /**
   * Retrieves the DomBatchLimitFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DomBatchLimitFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DomBatchLimitFilter field
   */
  public String[] getDomBatchLimitFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomBatchLimitFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDomBatchLimitFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDomBatchLimitFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DomBatchLimitFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDomBatchLimitFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DomBatchLimitFilter filter value from a formatted string
   *
   * @param _value the DomBatchLimitFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DomBatchLimitFilter filter field
   */
  public void setDomBatchLimitFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDomBatchLimitFilterFromFormattedString");
    try {
      this.setDomBatchLimitFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DomBatchLimitFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDomBatchLimitFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDomBatchLimitFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DomVisaMerchant (CLEARING_HOUSE_INFO.dom_visa_merchant)
   * @param fetch whether to fetch this field or not
   */
  public void setDomVisaMerchantFetch (boolean fetch) {
    this.DomVisaMerchantFetch = fetch;
  }
  /** Retrieve Fetch value for field: DomVisaMerchant (CLEARING_HOUSE_INFO.dom_visa_merchant)
   * @return boolean the Fetch value for this field
   */
  public boolean getDomVisaMerchantFetch () {
    return this.DomVisaMerchantFetch;
  }
  /** Set the SortOrder for field: DomVisaMerchant (CLEARING_HOUSE_INFO.dom_visa_merchant)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDomVisaMerchantSortOrder (Integer value) {
    this.DomVisaMerchantSort = value;
  }
  /** Retrieve SortOrder for field: DomVisaMerchant (CLEARING_HOUSE_INFO.dom_visa_merchant)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDomVisaMerchantSortOrder () {
    return this.DomVisaMerchantSort;
  }
  /** Set the sort direction for field: DomVisaMerchant (CLEARING_HOUSE_INFO.dom_visa_merchant)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDomVisaMerchantSortDirection (boolean ascending) {
    this.DomVisaMerchantSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DomVisaMerchant (CLEARING_HOUSE_INFO.dom_visa_merchant)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDomVisaMerchantSortDirection () {
    return this.DomVisaMerchantSortAscending;
  }
  /** Set the case insensitive for field: DomVisaMerchant (CLEARING_HOUSE_INFO.dom_visa_merchant)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDomVisaMerchantCaseInsensitive (boolean ascending) {
    this.DomVisaMerchantCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DomVisaMerchant (CLEARING_HOUSE_INFO.dom_visa_merchant)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDomVisaMerchantCaseInsensitive () {
    return this.DomVisaMerchantCaseInsensitive;
  }
  /** Set the field level filters for field: DomVisaMerchant (CLEARING_HOUSE_INFO.dom_visa_merchant)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDomVisaMerchantFilter (StringFilter[] value) throws ServiceException {
    this.DomVisaMerchant = value;
  }
  /** Retrieve filter for field: DomVisaMerchant (CLEARING_HOUSE_INFO.dom_visa_merchant)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getDomVisaMerchantFilter () {
    return this.DomVisaMerchant;
  }

  /**
   * Retrieves the DomVisaMerchantFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DomVisaMerchantFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DomVisaMerchantFilter field
   */
  public String[] getDomVisaMerchantFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomVisaMerchantFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDomVisaMerchantFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDomVisaMerchantFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DomVisaMerchantFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDomVisaMerchantFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DomVisaMerchantFilter filter value from a formatted string
   *
   * @param _value the DomVisaMerchantFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DomVisaMerchantFilter filter field
   */
  public void setDomVisaMerchantFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDomVisaMerchantFilterFromFormattedString");
    try {
      this.setDomVisaMerchantFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DomVisaMerchantFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDomVisaMerchantFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDomVisaMerchantFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DomMscMerchant (CLEARING_HOUSE_INFO.dom_msc_merchant)
   * @param fetch whether to fetch this field or not
   */
  public void setDomMscMerchantFetch (boolean fetch) {
    this.DomMscMerchantFetch = fetch;
  }
  /** Retrieve Fetch value for field: DomMscMerchant (CLEARING_HOUSE_INFO.dom_msc_merchant)
   * @return boolean the Fetch value for this field
   */
  public boolean getDomMscMerchantFetch () {
    return this.DomMscMerchantFetch;
  }
  /** Set the SortOrder for field: DomMscMerchant (CLEARING_HOUSE_INFO.dom_msc_merchant)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDomMscMerchantSortOrder (Integer value) {
    this.DomMscMerchantSort = value;
  }
  /** Retrieve SortOrder for field: DomMscMerchant (CLEARING_HOUSE_INFO.dom_msc_merchant)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDomMscMerchantSortOrder () {
    return this.DomMscMerchantSort;
  }
  /** Set the sort direction for field: DomMscMerchant (CLEARING_HOUSE_INFO.dom_msc_merchant)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDomMscMerchantSortDirection (boolean ascending) {
    this.DomMscMerchantSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DomMscMerchant (CLEARING_HOUSE_INFO.dom_msc_merchant)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDomMscMerchantSortDirection () {
    return this.DomMscMerchantSortAscending;
  }
  /** Set the case insensitive for field: DomMscMerchant (CLEARING_HOUSE_INFO.dom_msc_merchant)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDomMscMerchantCaseInsensitive (boolean ascending) {
    this.DomMscMerchantCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DomMscMerchant (CLEARING_HOUSE_INFO.dom_msc_merchant)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDomMscMerchantCaseInsensitive () {
    return this.DomMscMerchantCaseInsensitive;
  }
  /** Set the field level filters for field: DomMscMerchant (CLEARING_HOUSE_INFO.dom_msc_merchant)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDomMscMerchantFilter (StringFilter[] value) throws ServiceException {
    this.DomMscMerchant = value;
  }
  /** Retrieve filter for field: DomMscMerchant (CLEARING_HOUSE_INFO.dom_msc_merchant)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getDomMscMerchantFilter () {
    return this.DomMscMerchant;
  }

  /**
   * Retrieves the DomMscMerchantFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DomMscMerchantFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DomMscMerchantFilter field
   */
  public String[] getDomMscMerchantFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomMscMerchantFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDomMscMerchantFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDomMscMerchantFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DomMscMerchantFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDomMscMerchantFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DomMscMerchantFilter filter value from a formatted string
   *
   * @param _value the DomMscMerchantFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DomMscMerchantFilter filter field
   */
  public void setDomMscMerchantFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDomMscMerchantFilterFromFormattedString");
    try {
      this.setDomMscMerchantFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DomMscMerchantFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDomMscMerchantFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDomMscMerchantFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DomAmexMerchant (CLEARING_HOUSE_INFO.dom_amex_merchant)
   * @param fetch whether to fetch this field or not
   */
  public void setDomAmexMerchantFetch (boolean fetch) {
    this.DomAmexMerchantFetch = fetch;
  }
  /** Retrieve Fetch value for field: DomAmexMerchant (CLEARING_HOUSE_INFO.dom_amex_merchant)
   * @return boolean the Fetch value for this field
   */
  public boolean getDomAmexMerchantFetch () {
    return this.DomAmexMerchantFetch;
  }
  /** Set the SortOrder for field: DomAmexMerchant (CLEARING_HOUSE_INFO.dom_amex_merchant)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDomAmexMerchantSortOrder (Integer value) {
    this.DomAmexMerchantSort = value;
  }
  /** Retrieve SortOrder for field: DomAmexMerchant (CLEARING_HOUSE_INFO.dom_amex_merchant)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDomAmexMerchantSortOrder () {
    return this.DomAmexMerchantSort;
  }
  /** Set the sort direction for field: DomAmexMerchant (CLEARING_HOUSE_INFO.dom_amex_merchant)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDomAmexMerchantSortDirection (boolean ascending) {
    this.DomAmexMerchantSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DomAmexMerchant (CLEARING_HOUSE_INFO.dom_amex_merchant)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDomAmexMerchantSortDirection () {
    return this.DomAmexMerchantSortAscending;
  }
  /** Set the case insensitive for field: DomAmexMerchant (CLEARING_HOUSE_INFO.dom_amex_merchant)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDomAmexMerchantCaseInsensitive (boolean ascending) {
    this.DomAmexMerchantCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DomAmexMerchant (CLEARING_HOUSE_INFO.dom_amex_merchant)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDomAmexMerchantCaseInsensitive () {
    return this.DomAmexMerchantCaseInsensitive;
  }
  /** Set the field level filters for field: DomAmexMerchant (CLEARING_HOUSE_INFO.dom_amex_merchant)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDomAmexMerchantFilter (StringFilter[] value) throws ServiceException {
    this.DomAmexMerchant = value;
  }
  /** Retrieve filter for field: DomAmexMerchant (CLEARING_HOUSE_INFO.dom_amex_merchant)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getDomAmexMerchantFilter () {
    return this.DomAmexMerchant;
  }

  /**
   * Retrieves the DomAmexMerchantFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DomAmexMerchantFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DomAmexMerchantFilter field
   */
  public String[] getDomAmexMerchantFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomAmexMerchantFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDomAmexMerchantFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDomAmexMerchantFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DomAmexMerchantFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDomAmexMerchantFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DomAmexMerchantFilter filter value from a formatted string
   *
   * @param _value the DomAmexMerchantFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DomAmexMerchantFilter filter field
   */
  public void setDomAmexMerchantFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDomAmexMerchantFilterFromFormattedString");
    try {
      this.setDomAmexMerchantFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DomAmexMerchantFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDomAmexMerchantFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDomAmexMerchantFilterFromFormattedString");
  }

  public String toString() {
    return ClearingHouseInfoObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return ClearingHouseInfoObjectHelper.toMap(this, null);
  }
}
