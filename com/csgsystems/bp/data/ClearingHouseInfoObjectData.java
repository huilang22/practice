/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ClearingHouseInfoObjectData.java
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
  
/** ClearingHouseInfoObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class ClearingHouseInfoObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public ClearingHouseInfoObjectKeyData Key = null;
  /** CLEARING_HOUSE_ID_REF.is_default field */
  public    Boolean IsDefault  = null;
  protected boolean _IsDefaultSet = false;
  /** CLEARING_HOUSE_ID_REF.is_internal field */
  public    Boolean IsInternal  = null;
  protected boolean _IsInternalSet = false;
  /** CLEARING_HOUSE_ID_REF.config_tag_id field */
  public    String ConfigTagId  = null;
  protected boolean _ConfigTagIdSet = false;
  /** CLEARING_HOUSE_ID_VALUES.short_display field */
  public    String ShortDisplay  = null;
  protected boolean _ShortDisplaySet = false;
  /** CLEARING_HOUSE_ID_VALUES.display_value field */
  public    String DisplayValue  = null;
  protected boolean _DisplayValueSet = false;
  /** CLEARING_HOUSE_INFO.ckf_client_id field */
  public    String CkfClientId  = null;
  protected boolean _CkfClientIdSet = false;
  /** CLEARING_HOUSE_INFO.ckf_var_descriptor field */
  public    String CkfVarDescriptor  = null;
  protected boolean _CkfVarDescriptorSet = false;
  /** CLEARING_HOUSE_INFO.knn_merchant_acct field */
  public    String KnnMerchantAcct  = null;
  protected boolean _KnnMerchantAcctSet = false;
  /** CLEARING_HOUSE_INFO.knn_merchant_id field */
  public    String KnnMerchantId  = null;
  protected boolean _KnnMerchantIdSet = false;
  /** CLEARING_HOUSE_INFO.fus_pres_id field */
  public    String FusPresId  = null;
  protected boolean _FusPresIdSet = false;
  /** CLEARING_HOUSE_INFO.fus_pres_pass field */
  public    String FusPresPass  = null;
  protected boolean _FusPresPassSet = false;
  /** CLEARING_HOUSE_INFO.fus_sub_id field */
  public    String FusSubId  = null;
  protected boolean _FusSubIdSet = false;
  /** CLEARING_HOUSE_INFO.fus_sub_pass field */
  public    String FusSubPass  = null;
  protected boolean _FusSubPassSet = false;
  /** CLEARING_HOUSE_INFO.fus_avs_type field */
  public    Integer FusAvsType  = null;
  protected boolean _FusAvsTypeSet = false;
  /** CLEARING_HOUSE_INFO.frn_unique_dates field */
  public    Boolean FrnUniqueDates  = null;
  protected boolean _FrnUniqueDatesSet = false;
  /** CLEARING_HOUSE_INFO.frn_fast_mode field */
  public    Boolean FrnFastMode  = null;
  protected boolean _FrnFastModeSet = false;
  /** CLEARING_HOUSE_INFO.frn_norm_op_id field */
  public    String FrnNormOpId  = null;
  protected boolean _FrnNormOpIdSet = false;
  /** CLEARING_HOUSE_INFO.frn_norm_post_delay field */
  public    Integer FrnNormPostDelay  = null;
  protected boolean _FrnNormPostDelaySet = false;
  /** CLEARING_HOUSE_INFO.frn_fast_op_id field */
  public    String FrnFastOpId  = null;
  protected boolean _FrnFastOpIdSet = false;
  /** CLEARING_HOUSE_INFO.frn_fast_post_delay field */
  public    Integer FrnFastPostDelay  = null;
  protected boolean _FrnFastPostDelaySet = false;
  /** CLEARING_HOUSE_INFO.frn_national_num field */
  public    String FrnNationalNum  = null;
  protected boolean _FrnNationalNumSet = false;
  /** CLEARING_HOUSE_INFO.frn_company_name field */
  public    String FrnCompanyName  = null;
  protected boolean _FrnCompanyNameSet = false;
  /** CLEARING_HOUSE_INFO.frn_agency_code field */
  public    String FrnAgencyCode  = null;
  protected boolean _FrnAgencyCodeSet = false;
  /** CLEARING_HOUSE_INFO.frn_account_num field */
  public    String FrnAccountNum  = null;
  protected boolean _FrnAccountNumSet = false;
  /** CLEARING_HOUSE_INFO.frn_bank_code field */
  public    String FrnBankCode  = null;
  protected boolean _FrnBankCodeSet = false;
  /** CLEARING_HOUSE_INFO.fdm_merchant_name field */
  public    String FdmMerchantName  = null;
  protected boolean _FdmMerchantNameSet = false;
  /** CLEARING_HOUSE_INFO.fdm_merchant_number field */
  public    String FdmMerchantNumber  = null;
  protected boolean _FdmMerchantNumberSet = false;
  /** CLEARING_HOUSE_INFO.fdm_avs_type field */
  public    Integer FdmAvsType  = null;
  protected boolean _FdmAvsTypeSet = false;
  /** CLEARING_HOUSE_INFO.dom_rcon_number field */
  public    String DomRconNumber  = null;
  protected boolean _DomRconNumberSet = false;
  /** CLEARING_HOUSE_INFO.dom_mailbox_id field */
  public    String DomMailboxId  = null;
  protected boolean _DomMailboxIdSet = false;
  /** CLEARING_HOUSE_INFO.dom_fund_orig field */
  public    String DomFundOrig  = null;
  protected boolean _DomFundOrigSet = false;
  /** CLEARING_HOUSE_INFO.dom_fund_dest field */
  public    String DomFundDest  = null;
  protected boolean _DomFundDestSet = false;
  /** CLEARING_HOUSE_INFO.dom_visa_orig field */
  public    String DomVisaOrig  = null;
  protected boolean _DomVisaOrigSet = false;
  /** CLEARING_HOUSE_INFO.dom_visa_dest field */
  public    String DomVisaDest  = null;
  protected boolean _DomVisaDestSet = false;
  /** CLEARING_HOUSE_INFO.dom_msc_orig field */
  public    String DomMscOrig  = null;
  protected boolean _DomMscOrigSet = false;
  /** CLEARING_HOUSE_INFO.dom_msc_dest field */
  public    String DomMscDest  = null;
  protected boolean _DomMscDestSet = false;
  /** CLEARING_HOUSE_INFO.dom_amex_process_id field */
  public    String DomAmexProcessId  = null;
  protected boolean _DomAmexProcessIdSet = false;
  /** CLEARING_HOUSE_INFO.dom_amex_receiver_id field */
  public    String DomAmexReceiverId  = null;
  protected boolean _DomAmexReceiverIdSet = false;
  /** CLEARING_HOUSE_INFO.dom_amex_format_code field */
  public    String DomAmexFormatCode  = null;
  protected boolean _DomAmexFormatCodeSet = false;
  /** CLEARING_HOUSE_INFO.dom_phone_dest field */
  public    String DomPhoneDest  = null;
  protected boolean _DomPhoneDestSet = false;
  /** CLEARING_HOUSE_INFO.dom_currency_ind field */
  public    String DomCurrencyInd  = null;
  protected boolean _DomCurrencyIndSet = false;
  /** CLEARING_HOUSE_INFO.dom_fund_inst_id field */
  public    String DomFundInstId  = null;
  protected boolean _DomFundInstIdSet = false;
  /** CLEARING_HOUSE_INFO.dom_fund_acct_num field */
  public    String DomFundAcctNum  = null;
  protected boolean _DomFundAcctNumSet = false;
  /** CLEARING_HOUSE_INFO.dom_batch_limit field */
  public    Integer DomBatchLimit  = null;
  protected boolean _DomBatchLimitSet = false;
  /** CLEARING_HOUSE_INFO.dom_visa_merchant field */
  public    String DomVisaMerchant  = null;
  protected boolean _DomVisaMerchantSet = false;
  /** CLEARING_HOUSE_INFO.dom_msc_merchant field */
  public    String DomMscMerchant  = null;
  protected boolean _DomMscMerchantSet = false;
  /** CLEARING_HOUSE_INFO.dom_amex_merchant field */
  public    String DomAmexMerchant  = null;
  protected boolean _DomAmexMerchantSet = false;
  private String _objName = "ClearingHouseInfoObjectData";
  /** Default constructor */
  public ClearingHouseInfoObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public ClearingHouseInfoObjectData (ClearingHouseInfoObjectData other)
  {

    if (other == null) return;
    this.Key = new ClearingHouseInfoObjectKeyData (other.Key);
    this.IsDefault = other.IsDefault;
    this._IsDefaultSet = other._IsDefaultSet;
    this.IsInternal = other.IsInternal;
    this._IsInternalSet = other._IsInternalSet;
    this.ConfigTagId = other.ConfigTagId;
    this._ConfigTagIdSet = other._ConfigTagIdSet;
    this.ShortDisplay = other.ShortDisplay;
    this._ShortDisplaySet = other._ShortDisplaySet;
    this.DisplayValue = other.DisplayValue;
    this._DisplayValueSet = other._DisplayValueSet;
    this.CkfClientId = other.CkfClientId;
    this._CkfClientIdSet = other._CkfClientIdSet;
    this.CkfVarDescriptor = other.CkfVarDescriptor;
    this._CkfVarDescriptorSet = other._CkfVarDescriptorSet;
    this.KnnMerchantAcct = other.KnnMerchantAcct;
    this._KnnMerchantAcctSet = other._KnnMerchantAcctSet;
    this.KnnMerchantId = other.KnnMerchantId;
    this._KnnMerchantIdSet = other._KnnMerchantIdSet;
    this.FusPresId = other.FusPresId;
    this._FusPresIdSet = other._FusPresIdSet;
    this.FusPresPass = other.FusPresPass;
    this._FusPresPassSet = other._FusPresPassSet;
    this.FusSubId = other.FusSubId;
    this._FusSubIdSet = other._FusSubIdSet;
    this.FusSubPass = other.FusSubPass;
    this._FusSubPassSet = other._FusSubPassSet;
    this.FusAvsType = other.FusAvsType;
    this._FusAvsTypeSet = other._FusAvsTypeSet;
    this.FrnUniqueDates = other.FrnUniqueDates;
    this._FrnUniqueDatesSet = other._FrnUniqueDatesSet;
    this.FrnFastMode = other.FrnFastMode;
    this._FrnFastModeSet = other._FrnFastModeSet;
    this.FrnNormOpId = other.FrnNormOpId;
    this._FrnNormOpIdSet = other._FrnNormOpIdSet;
    this.FrnNormPostDelay = other.FrnNormPostDelay;
    this._FrnNormPostDelaySet = other._FrnNormPostDelaySet;
    this.FrnFastOpId = other.FrnFastOpId;
    this._FrnFastOpIdSet = other._FrnFastOpIdSet;
    this.FrnFastPostDelay = other.FrnFastPostDelay;
    this._FrnFastPostDelaySet = other._FrnFastPostDelaySet;
    this.FrnNationalNum = other.FrnNationalNum;
    this._FrnNationalNumSet = other._FrnNationalNumSet;
    this.FrnCompanyName = other.FrnCompanyName;
    this._FrnCompanyNameSet = other._FrnCompanyNameSet;
    this.FrnAgencyCode = other.FrnAgencyCode;
    this._FrnAgencyCodeSet = other._FrnAgencyCodeSet;
    this.FrnAccountNum = other.FrnAccountNum;
    this._FrnAccountNumSet = other._FrnAccountNumSet;
    this.FrnBankCode = other.FrnBankCode;
    this._FrnBankCodeSet = other._FrnBankCodeSet;
    this.FdmMerchantName = other.FdmMerchantName;
    this._FdmMerchantNameSet = other._FdmMerchantNameSet;
    this.FdmMerchantNumber = other.FdmMerchantNumber;
    this._FdmMerchantNumberSet = other._FdmMerchantNumberSet;
    this.FdmAvsType = other.FdmAvsType;
    this._FdmAvsTypeSet = other._FdmAvsTypeSet;
    this.DomRconNumber = other.DomRconNumber;
    this._DomRconNumberSet = other._DomRconNumberSet;
    this.DomMailboxId = other.DomMailboxId;
    this._DomMailboxIdSet = other._DomMailboxIdSet;
    this.DomFundOrig = other.DomFundOrig;
    this._DomFundOrigSet = other._DomFundOrigSet;
    this.DomFundDest = other.DomFundDest;
    this._DomFundDestSet = other._DomFundDestSet;
    this.DomVisaOrig = other.DomVisaOrig;
    this._DomVisaOrigSet = other._DomVisaOrigSet;
    this.DomVisaDest = other.DomVisaDest;
    this._DomVisaDestSet = other._DomVisaDestSet;
    this.DomMscOrig = other.DomMscOrig;
    this._DomMscOrigSet = other._DomMscOrigSet;
    this.DomMscDest = other.DomMscDest;
    this._DomMscDestSet = other._DomMscDestSet;
    this.DomAmexProcessId = other.DomAmexProcessId;
    this._DomAmexProcessIdSet = other._DomAmexProcessIdSet;
    this.DomAmexReceiverId = other.DomAmexReceiverId;
    this._DomAmexReceiverIdSet = other._DomAmexReceiverIdSet;
    this.DomAmexFormatCode = other.DomAmexFormatCode;
    this._DomAmexFormatCodeSet = other._DomAmexFormatCodeSet;
    this.DomPhoneDest = other.DomPhoneDest;
    this._DomPhoneDestSet = other._DomPhoneDestSet;
    this.DomCurrencyInd = other.DomCurrencyInd;
    this._DomCurrencyIndSet = other._DomCurrencyIndSet;
    this.DomFundInstId = other.DomFundInstId;
    this._DomFundInstIdSet = other._DomFundInstIdSet;
    this.DomFundAcctNum = other.DomFundAcctNum;
    this._DomFundAcctNumSet = other._DomFundAcctNumSet;
    this.DomBatchLimit = other.DomBatchLimit;
    this._DomBatchLimitSet = other._DomBatchLimitSet;
    this.DomVisaMerchant = other.DomVisaMerchant;
    this._DomVisaMerchantSet = other._DomVisaMerchantSet;
    this.DomMscMerchant = other.DomMscMerchant;
    this._DomMscMerchantSet = other._DomMscMerchantSet;
    this.DomAmexMerchant = other.DomAmexMerchant;
    this._DomAmexMerchantSet = other._DomAmexMerchantSet;
  }

  /** get the Key for this object
   * @return ClearingHouseInfoObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public ClearingHouseInfoObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (ClearingHouseInfoObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: ClearingHouseId (CLEARING_HOUSE_ID_VALUES.clearing_house_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setClearingHouseId (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ClearingHouseId", "setClearingHouseId");
    }
    if (value != null && !DataHelper.validLength (value, 3))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ClearingHouseId", "setClearingHouseId");
    }
    if (this.Key == null) this.Key = new ClearingHouseInfoObjectKeyData ();
    this.Key.ClearingHouseId = value;
    this.Key._ClearingHouseIdSet = true;
  }
  /** get the value of the field: ClearingHouseId (CLEARING_HOUSE_ID_VALUES.clearing_house_id)
   * @return String the value
   */
  public String getClearingHouseId () {
    if (this.Key == null) return null;
    return this.Key.ClearingHouseId;
  }
  /** Change the field to not being actively set: ClearingHouseId (CLEARING_HOUSE_ID_VALUES.clearing_house_id)
   */
  public void unsetClearingHouseId () {
    if (this.Key == null) return;
    this.Key._ClearingHouseIdSet = false;
  }
  /** See if the field is actively set: ClearingHouseId (CLEARING_HOUSE_ID_VALUES.clearing_house_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetClearingHouseId () {
    if (this.Key == null) return false;
    return this.Key._ClearingHouseIdSet;
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

  /** set the fields value: LanguageCode (CLEARING_HOUSE_ID_VALUES.language_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setLanguageCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "LanguageCode", "setLanguageCode");
    }
    if (this.Key == null) this.Key = new ClearingHouseInfoObjectKeyData ();
    this.Key.LanguageCode = value;
    this.Key._LanguageCodeSet = true;
  }
  /** get the value of the field: LanguageCode (CLEARING_HOUSE_ID_VALUES.language_code)
   * @return Integer the value
   */
  public Integer getLanguageCode () {
    if (this.Key == null) return null;
    return this.Key.LanguageCode;
  }
  /** Change the field to not being actively set: LanguageCode (CLEARING_HOUSE_ID_VALUES.language_code)
   */
  public void unsetLanguageCode () {
    if (this.Key == null) return;
    this.Key._LanguageCodeSet = false;
  }
  /** See if the field is actively set: LanguageCode (CLEARING_HOUSE_ID_VALUES.language_code)
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

  /** set the fields value: Module (CLEARING_HOUSE_INFO.module)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setModule (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Module", "setModule");
    }
    if (value != null && !DataHelper.validLength (value, 4))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Module", "setModule");
    }
    if (this.Key == null) this.Key = new ClearingHouseInfoObjectKeyData ();
    this.Key.Module = value;
    this.Key._ModuleSet = true;
  }
  /** get the value of the field: Module (CLEARING_HOUSE_INFO.module)
   * @return String the value
   */
  public String getModule () {
    if (this.Key == null) return null;
    return this.Key.Module;
  }
  /** Change the field to not being actively set: Module (CLEARING_HOUSE_INFO.module)
   */
  public void unsetModule () {
    if (this.Key == null) return;
    this.Key._ModuleSet = false;
  }
  /** See if the field is actively set: Module (CLEARING_HOUSE_INFO.module)
   * @return boolean whether the field is actively set
   */
  public boolean issetModule () {
    if (this.Key == null) return false;
    return this.Key._ModuleSet;
  }

  /** Retrieves the Module field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Module field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Module field
   */
   public String getModuleAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getModuleAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getModuleAsFormattedString");
       return fmtMgr.formatString(this.getModule());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Module");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getModuleAsFormattedString");
       throw x;
     }
   }
  /** Sets the Module field from a formatted string
   *
   * @param _value the Module field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Module field
   */
   public void setModuleFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getModuleFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setModule(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Module");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setModuleFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setModuleFromFormattedString");
   }

  /** set the fields value: IsDefault (CLEARING_HOUSE_ID_REF.is_default)
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

  /** get the value of the field: IsDefault (CLEARING_HOUSE_ID_REF.is_default)
   * @return Boolean the value
   */
  public Boolean getIsDefault () {
    return this.IsDefault;
  }
  /** Change the field to not being actively set: IsDefault (CLEARING_HOUSE_ID_REF.is_default)
   */
  public void unsetIsDefault () {
    this._IsDefaultSet = false;
  }
  /** See if the field is actively set: IsDefault (CLEARING_HOUSE_ID_REF.is_default)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsDefault () {
    return this._IsDefaultSet;
  }
  /** set the fields value: IsInternal (CLEARING_HOUSE_ID_REF.is_internal)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsInternal") 
  public void setIsInternal (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsInternal", "setIsInternal");
    }
    this.IsInternal = value;
    this._IsInternalSet = true;
  }

  /** Retrieves the IsInternal field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsInternal field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsInternal field
   */
   public String getIsInternalAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsInternalAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsInternalAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsInternal());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsInternal");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsInternalAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsInternal field from a formatted string
   *
   * @param _value the IsInternal field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsInternal field
   */
   public void setIsInternalFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsInternalFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsInternal(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsInternal");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsInternalFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsInternalFromFormattedString");
   }

  /** get the value of the field: IsInternal (CLEARING_HOUSE_ID_REF.is_internal)
   * @return Boolean the value
   */
  public Boolean getIsInternal () {
    return this.IsInternal;
  }
  /** Change the field to not being actively set: IsInternal (CLEARING_HOUSE_ID_REF.is_internal)
   */
  public void unsetIsInternal () {
    this._IsInternalSet = false;
  }
  /** See if the field is actively set: IsInternal (CLEARING_HOUSE_ID_REF.is_internal)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsInternal () {
    return this._IsInternalSet;
  }
  /** set the fields value: ConfigTagId (CLEARING_HOUSE_ID_REF.config_tag_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ConfigTagId") 
  public void setConfigTagId (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 32))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ConfigTagId", "setConfigTagId");
    }
    this.ConfigTagId = value;
    this._ConfigTagIdSet = true;
  }

  /** Retrieves the ConfigTagId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ConfigTagId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ConfigTagId field
   */
   public String getConfigTagIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getConfigTagIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getConfigTagIdAsFormattedString");
       return fmtMgr.formatString(this.getConfigTagId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ConfigTagId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getConfigTagIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ConfigTagId field from a formatted string
   *
   * @param _value the ConfigTagId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ConfigTagId field
   */
   public void setConfigTagIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getConfigTagIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setConfigTagId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ConfigTagId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setConfigTagIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setConfigTagIdFromFormattedString");
   }

  /** get the value of the field: ConfigTagId (CLEARING_HOUSE_ID_REF.config_tag_id)
   * @return String the value
   */
  public String getConfigTagId () {
    return this.ConfigTagId;
  }
  /** Change the field to not being actively set: ConfigTagId (CLEARING_HOUSE_ID_REF.config_tag_id)
   */
  public void unsetConfigTagId () {
    this._ConfigTagIdSet = false;
  }
  /** See if the field is actively set: ConfigTagId (CLEARING_HOUSE_ID_REF.config_tag_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetConfigTagId () {
    return this._ConfigTagIdSet;
  }
  /** set the fields value: ShortDisplay (CLEARING_HOUSE_ID_VALUES.short_display)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ShortDisplay") 
  public void setShortDisplay (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 5))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ShortDisplay", "setShortDisplay");
    }
    this.ShortDisplay = value;
    this._ShortDisplaySet = true;
  }

  /** Retrieves the ShortDisplay field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ShortDisplay field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ShortDisplay field
   */
   public String getShortDisplayAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getShortDisplayAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getShortDisplayAsFormattedString");
       return fmtMgr.formatString(this.getShortDisplay());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ShortDisplay");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getShortDisplayAsFormattedString");
       throw x;
     }
   }
  /** Sets the ShortDisplay field from a formatted string
   *
   * @param _value the ShortDisplay field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ShortDisplay field
   */
   public void setShortDisplayFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getShortDisplayFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setShortDisplay(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ShortDisplay");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setShortDisplayFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setShortDisplayFromFormattedString");
   }

  /** get the value of the field: ShortDisplay (CLEARING_HOUSE_ID_VALUES.short_display)
   * @return String the value
   */
  public String getShortDisplay () {
    return this.ShortDisplay;
  }
  /** Change the field to not being actively set: ShortDisplay (CLEARING_HOUSE_ID_VALUES.short_display)
   */
  public void unsetShortDisplay () {
    this._ShortDisplaySet = false;
  }
  /** See if the field is actively set: ShortDisplay (CLEARING_HOUSE_ID_VALUES.short_display)
   * @return boolean whether the field is actively set
   */
  public boolean issetShortDisplay () {
    return this._ShortDisplaySet;
  }
  /** set the fields value: DisplayValue (CLEARING_HOUSE_ID_VALUES.display_value)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DisplayValue") 
  public void setDisplayValue (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DisplayValue", "setDisplayValue");
    }
    if (value != null && !DataHelper.validLength (value, 80))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "DisplayValue", "setDisplayValue");
    }
    this.DisplayValue = value;
    this._DisplayValueSet = true;
  }

  /** Retrieves the DisplayValue field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DisplayValue field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DisplayValue field
   */
   public String getDisplayValueAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDisplayValueAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDisplayValueAsFormattedString");
       return fmtMgr.formatString(this.getDisplayValue());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DisplayValue");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDisplayValueAsFormattedString");
       throw x;
     }
   }
  /** Sets the DisplayValue field from a formatted string
   *
   * @param _value the DisplayValue field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DisplayValue field
   */
   public void setDisplayValueFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDisplayValueFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDisplayValue(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DisplayValue");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDisplayValueFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDisplayValueFromFormattedString");
   }

  /** get the value of the field: DisplayValue (CLEARING_HOUSE_ID_VALUES.display_value)
   * @return String the value
   */
  public String getDisplayValue () {
    return this.DisplayValue;
  }
  /** Change the field to not being actively set: DisplayValue (CLEARING_HOUSE_ID_VALUES.display_value)
   */
  public void unsetDisplayValue () {
    this._DisplayValueSet = false;
  }
  /** See if the field is actively set: DisplayValue (CLEARING_HOUSE_ID_VALUES.display_value)
   * @return boolean whether the field is actively set
   */
  public boolean issetDisplayValue () {
    return this._DisplayValueSet;
  }
  /** set the fields value: CkfClientId (CLEARING_HOUSE_INFO.ckf_client_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CkfClientId") 
  public void setCkfClientId (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CkfClientId", "setCkfClientId");
    }
    this.CkfClientId = value;
    this._CkfClientIdSet = true;
  }

  /** Retrieves the CkfClientId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CkfClientId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CkfClientId field
   */
   public String getCkfClientIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCkfClientIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCkfClientIdAsFormattedString");
       return fmtMgr.formatString(this.getCkfClientId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CkfClientId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCkfClientIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the CkfClientId field from a formatted string
   *
   * @param _value the CkfClientId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CkfClientId field
   */
   public void setCkfClientIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCkfClientIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCkfClientId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CkfClientId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCkfClientIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCkfClientIdFromFormattedString");
   }

  /** get the value of the field: CkfClientId (CLEARING_HOUSE_INFO.ckf_client_id)
   * @return String the value
   */
  public String getCkfClientId () {
    return this.CkfClientId;
  }
  /** Change the field to not being actively set: CkfClientId (CLEARING_HOUSE_INFO.ckf_client_id)
   */
  public void unsetCkfClientId () {
    this._CkfClientIdSet = false;
  }
  /** See if the field is actively set: CkfClientId (CLEARING_HOUSE_INFO.ckf_client_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetCkfClientId () {
    return this._CkfClientIdSet;
  }
  /** set the fields value: CkfVarDescriptor (CLEARING_HOUSE_INFO.ckf_var_descriptor)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CkfVarDescriptor") 
  public void setCkfVarDescriptor (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 40))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CkfVarDescriptor", "setCkfVarDescriptor");
    }
    this.CkfVarDescriptor = value;
    this._CkfVarDescriptorSet = true;
  }

  /** Retrieves the CkfVarDescriptor field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CkfVarDescriptor field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CkfVarDescriptor field
   */
   public String getCkfVarDescriptorAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCkfVarDescriptorAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCkfVarDescriptorAsFormattedString");
       return fmtMgr.formatString(this.getCkfVarDescriptor());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CkfVarDescriptor");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCkfVarDescriptorAsFormattedString");
       throw x;
     }
   }
  /** Sets the CkfVarDescriptor field from a formatted string
   *
   * @param _value the CkfVarDescriptor field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CkfVarDescriptor field
   */
   public void setCkfVarDescriptorFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCkfVarDescriptorFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCkfVarDescriptor(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CkfVarDescriptor");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCkfVarDescriptorFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCkfVarDescriptorFromFormattedString");
   }

  /** get the value of the field: CkfVarDescriptor (CLEARING_HOUSE_INFO.ckf_var_descriptor)
   * @return String the value
   */
  public String getCkfVarDescriptor () {
    return this.CkfVarDescriptor;
  }
  /** Change the field to not being actively set: CkfVarDescriptor (CLEARING_HOUSE_INFO.ckf_var_descriptor)
   */
  public void unsetCkfVarDescriptor () {
    this._CkfVarDescriptorSet = false;
  }
  /** See if the field is actively set: CkfVarDescriptor (CLEARING_HOUSE_INFO.ckf_var_descriptor)
   * @return boolean whether the field is actively set
   */
  public boolean issetCkfVarDescriptor () {
    return this._CkfVarDescriptorSet;
  }
  /** set the fields value: KnnMerchantAcct (CLEARING_HOUSE_INFO.knn_merchant_acct)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("KnnMerchantAcct") 
  public void setKnnMerchantAcct (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 12))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "KnnMerchantAcct", "setKnnMerchantAcct");
    }
    this.KnnMerchantAcct = value;
    this._KnnMerchantAcctSet = true;
  }

  /** Retrieves the KnnMerchantAcct field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The KnnMerchantAcct field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the KnnMerchantAcct field
   */
   public String getKnnMerchantAcctAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getKnnMerchantAcctAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getKnnMerchantAcctAsFormattedString");
       return fmtMgr.formatString(this.getKnnMerchantAcct());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("KnnMerchantAcct");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getKnnMerchantAcctAsFormattedString");
       throw x;
     }
   }
  /** Sets the KnnMerchantAcct field from a formatted string
   *
   * @param _value the KnnMerchantAcct field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the KnnMerchantAcct field
   */
   public void setKnnMerchantAcctFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getKnnMerchantAcctFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setKnnMerchantAcct(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("KnnMerchantAcct");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setKnnMerchantAcctFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setKnnMerchantAcctFromFormattedString");
   }

  /** get the value of the field: KnnMerchantAcct (CLEARING_HOUSE_INFO.knn_merchant_acct)
   * @return String the value
   */
  public String getKnnMerchantAcct () {
    return this.KnnMerchantAcct;
  }
  /** Change the field to not being actively set: KnnMerchantAcct (CLEARING_HOUSE_INFO.knn_merchant_acct)
   */
  public void unsetKnnMerchantAcct () {
    this._KnnMerchantAcctSet = false;
  }
  /** See if the field is actively set: KnnMerchantAcct (CLEARING_HOUSE_INFO.knn_merchant_acct)
   * @return boolean whether the field is actively set
   */
  public boolean issetKnnMerchantAcct () {
    return this._KnnMerchantAcctSet;
  }
  /** set the fields value: KnnMerchantId (CLEARING_HOUSE_INFO.knn_merchant_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("KnnMerchantId") 
  public void setKnnMerchantId (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 4))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "KnnMerchantId", "setKnnMerchantId");
    }
    this.KnnMerchantId = value;
    this._KnnMerchantIdSet = true;
  }

  /** Retrieves the KnnMerchantId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The KnnMerchantId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the KnnMerchantId field
   */
   public String getKnnMerchantIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getKnnMerchantIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getKnnMerchantIdAsFormattedString");
       return fmtMgr.formatString(this.getKnnMerchantId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("KnnMerchantId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getKnnMerchantIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the KnnMerchantId field from a formatted string
   *
   * @param _value the KnnMerchantId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the KnnMerchantId field
   */
   public void setKnnMerchantIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getKnnMerchantIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setKnnMerchantId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("KnnMerchantId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setKnnMerchantIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setKnnMerchantIdFromFormattedString");
   }

  /** get the value of the field: KnnMerchantId (CLEARING_HOUSE_INFO.knn_merchant_id)
   * @return String the value
   */
  public String getKnnMerchantId () {
    return this.KnnMerchantId;
  }
  /** Change the field to not being actively set: KnnMerchantId (CLEARING_HOUSE_INFO.knn_merchant_id)
   */
  public void unsetKnnMerchantId () {
    this._KnnMerchantIdSet = false;
  }
  /** See if the field is actively set: KnnMerchantId (CLEARING_HOUSE_INFO.knn_merchant_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetKnnMerchantId () {
    return this._KnnMerchantIdSet;
  }
  /** set the fields value: FusPresId (CLEARING_HOUSE_INFO.fus_pres_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FusPresId") 
  public void setFusPresId (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 6))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "FusPresId", "setFusPresId");
    }
    this.FusPresId = value;
    this._FusPresIdSet = true;
  }

  /** Retrieves the FusPresId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FusPresId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FusPresId field
   */
   public String getFusPresIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFusPresIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFusPresIdAsFormattedString");
       return fmtMgr.formatString(this.getFusPresId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FusPresId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFusPresIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the FusPresId field from a formatted string
   *
   * @param _value the FusPresId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FusPresId field
   */
   public void setFusPresIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFusPresIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFusPresId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FusPresId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFusPresIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFusPresIdFromFormattedString");
   }

  /** get the value of the field: FusPresId (CLEARING_HOUSE_INFO.fus_pres_id)
   * @return String the value
   */
  public String getFusPresId () {
    return this.FusPresId;
  }
  /** Change the field to not being actively set: FusPresId (CLEARING_HOUSE_INFO.fus_pres_id)
   */
  public void unsetFusPresId () {
    this._FusPresIdSet = false;
  }
  /** See if the field is actively set: FusPresId (CLEARING_HOUSE_INFO.fus_pres_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetFusPresId () {
    return this._FusPresIdSet;
  }
  /** set the fields value: FusPresPass (CLEARING_HOUSE_INFO.fus_pres_pass)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FusPresPass") 
  public void setFusPresPass (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 8))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "FusPresPass", "setFusPresPass");
    }
    this.FusPresPass = value;
    this._FusPresPassSet = true;
  }

  /** Retrieves the FusPresPass field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FusPresPass field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FusPresPass field
   */
   public String getFusPresPassAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFusPresPassAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFusPresPassAsFormattedString");
       return fmtMgr.formatString(this.getFusPresPass());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FusPresPass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFusPresPassAsFormattedString");
       throw x;
     }
   }
  /** Sets the FusPresPass field from a formatted string
   *
   * @param _value the FusPresPass field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FusPresPass field
   */
   public void setFusPresPassFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFusPresPassFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFusPresPass(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FusPresPass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFusPresPassFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFusPresPassFromFormattedString");
   }

  /** get the value of the field: FusPresPass (CLEARING_HOUSE_INFO.fus_pres_pass)
   * @return String the value
   */
  public String getFusPresPass () {
    return this.FusPresPass;
  }
  /** Change the field to not being actively set: FusPresPass (CLEARING_HOUSE_INFO.fus_pres_pass)
   */
  public void unsetFusPresPass () {
    this._FusPresPassSet = false;
  }
  /** See if the field is actively set: FusPresPass (CLEARING_HOUSE_INFO.fus_pres_pass)
   * @return boolean whether the field is actively set
   */
  public boolean issetFusPresPass () {
    return this._FusPresPassSet;
  }
  /** set the fields value: FusSubId (CLEARING_HOUSE_INFO.fus_sub_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FusSubId") 
  public void setFusSubId (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 6))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "FusSubId", "setFusSubId");
    }
    this.FusSubId = value;
    this._FusSubIdSet = true;
  }

  /** Retrieves the FusSubId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FusSubId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FusSubId field
   */
   public String getFusSubIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFusSubIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFusSubIdAsFormattedString");
       return fmtMgr.formatString(this.getFusSubId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FusSubId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFusSubIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the FusSubId field from a formatted string
   *
   * @param _value the FusSubId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FusSubId field
   */
   public void setFusSubIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFusSubIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFusSubId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FusSubId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFusSubIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFusSubIdFromFormattedString");
   }

  /** get the value of the field: FusSubId (CLEARING_HOUSE_INFO.fus_sub_id)
   * @return String the value
   */
  public String getFusSubId () {
    return this.FusSubId;
  }
  /** Change the field to not being actively set: FusSubId (CLEARING_HOUSE_INFO.fus_sub_id)
   */
  public void unsetFusSubId () {
    this._FusSubIdSet = false;
  }
  /** See if the field is actively set: FusSubId (CLEARING_HOUSE_INFO.fus_sub_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetFusSubId () {
    return this._FusSubIdSet;
  }
  /** set the fields value: FusSubPass (CLEARING_HOUSE_INFO.fus_sub_pass)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FusSubPass") 
  public void setFusSubPass (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 8))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "FusSubPass", "setFusSubPass");
    }
    this.FusSubPass = value;
    this._FusSubPassSet = true;
  }

  /** Retrieves the FusSubPass field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FusSubPass field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FusSubPass field
   */
   public String getFusSubPassAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFusSubPassAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFusSubPassAsFormattedString");
       return fmtMgr.formatString(this.getFusSubPass());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FusSubPass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFusSubPassAsFormattedString");
       throw x;
     }
   }
  /** Sets the FusSubPass field from a formatted string
   *
   * @param _value the FusSubPass field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FusSubPass field
   */
   public void setFusSubPassFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFusSubPassFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFusSubPass(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FusSubPass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFusSubPassFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFusSubPassFromFormattedString");
   }

  /** get the value of the field: FusSubPass (CLEARING_HOUSE_INFO.fus_sub_pass)
   * @return String the value
   */
  public String getFusSubPass () {
    return this.FusSubPass;
  }
  /** Change the field to not being actively set: FusSubPass (CLEARING_HOUSE_INFO.fus_sub_pass)
   */
  public void unsetFusSubPass () {
    this._FusSubPassSet = false;
  }
  /** See if the field is actively set: FusSubPass (CLEARING_HOUSE_INFO.fus_sub_pass)
   * @return boolean whether the field is actively set
   */
  public boolean issetFusSubPass () {
    return this._FusSubPassSet;
  }
  /** set the fields value: FusAvsType (CLEARING_HOUSE_INFO.fus_avs_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FusAvsType") 
  public void setFusAvsType (Integer value) throws ServiceException
  {
    this.FusAvsType = value;
    this._FusAvsTypeSet = true;
  }

  /** Retrieves the FusAvsType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FusAvsType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FusAvsType field
   */
   public String getFusAvsTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFusAvsTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFusAvsTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getFusAvsType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FusAvsType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFusAvsTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the FusAvsType field from a formatted string
   *
   * @param _value the FusAvsType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FusAvsType field
   */
   public void setFusAvsTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFusAvsTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFusAvsType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FusAvsType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFusAvsTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFusAvsTypeFromFormattedString");
   }

  /** get the value of the field: FusAvsType (CLEARING_HOUSE_INFO.fus_avs_type)
   * @return Integer the value
   */
  public Integer getFusAvsType () {
    return this.FusAvsType;
  }
  /** Change the field to not being actively set: FusAvsType (CLEARING_HOUSE_INFO.fus_avs_type)
   */
  public void unsetFusAvsType () {
    this._FusAvsTypeSet = false;
  }
  /** See if the field is actively set: FusAvsType (CLEARING_HOUSE_INFO.fus_avs_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetFusAvsType () {
    return this._FusAvsTypeSet;
  }
  /** set the fields value: FrnUniqueDates (CLEARING_HOUSE_INFO.frn_unique_dates)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FrnUniqueDates") 
  public void setFrnUniqueDates (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "FrnUniqueDates", "setFrnUniqueDates");
    }
    this.FrnUniqueDates = value;
    this._FrnUniqueDatesSet = true;
  }

  /** Retrieves the FrnUniqueDates field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FrnUniqueDates field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrnUniqueDates field
   */
   public String getFrnUniqueDatesAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrnUniqueDatesAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrnUniqueDatesAsFormattedString");
       return fmtMgr.formatBoolean(this.getFrnUniqueDates());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrnUniqueDates");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrnUniqueDatesAsFormattedString");
       throw x;
     }
   }
  /** Sets the FrnUniqueDates field from a formatted string
   *
   * @param _value the FrnUniqueDates field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FrnUniqueDates field
   */
   public void setFrnUniqueDatesFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrnUniqueDatesFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFrnUniqueDates(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrnUniqueDates");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrnUniqueDatesFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrnUniqueDatesFromFormattedString");
   }

  /** get the value of the field: FrnUniqueDates (CLEARING_HOUSE_INFO.frn_unique_dates)
   * @return Boolean the value
   */
  public Boolean getFrnUniqueDates () {
    return this.FrnUniqueDates;
  }
  /** Change the field to not being actively set: FrnUniqueDates (CLEARING_HOUSE_INFO.frn_unique_dates)
   */
  public void unsetFrnUniqueDates () {
    this._FrnUniqueDatesSet = false;
  }
  /** See if the field is actively set: FrnUniqueDates (CLEARING_HOUSE_INFO.frn_unique_dates)
   * @return boolean whether the field is actively set
   */
  public boolean issetFrnUniqueDates () {
    return this._FrnUniqueDatesSet;
  }
  /** set the fields value: FrnFastMode (CLEARING_HOUSE_INFO.frn_fast_mode)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FrnFastMode") 
  public void setFrnFastMode (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "FrnFastMode", "setFrnFastMode");
    }
    this.FrnFastMode = value;
    this._FrnFastModeSet = true;
  }

  /** Retrieves the FrnFastMode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FrnFastMode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrnFastMode field
   */
   public String getFrnFastModeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrnFastModeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrnFastModeAsFormattedString");
       return fmtMgr.formatBoolean(this.getFrnFastMode());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrnFastMode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrnFastModeAsFormattedString");
       throw x;
     }
   }
  /** Sets the FrnFastMode field from a formatted string
   *
   * @param _value the FrnFastMode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FrnFastMode field
   */
   public void setFrnFastModeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrnFastModeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFrnFastMode(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrnFastMode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrnFastModeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrnFastModeFromFormattedString");
   }

  /** get the value of the field: FrnFastMode (CLEARING_HOUSE_INFO.frn_fast_mode)
   * @return Boolean the value
   */
  public Boolean getFrnFastMode () {
    return this.FrnFastMode;
  }
  /** Change the field to not being actively set: FrnFastMode (CLEARING_HOUSE_INFO.frn_fast_mode)
   */
  public void unsetFrnFastMode () {
    this._FrnFastModeSet = false;
  }
  /** See if the field is actively set: FrnFastMode (CLEARING_HOUSE_INFO.frn_fast_mode)
   * @return boolean whether the field is actively set
   */
  public boolean issetFrnFastMode () {
    return this._FrnFastModeSet;
  }
  /** set the fields value: FrnNormOpId (CLEARING_HOUSE_INFO.frn_norm_op_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FrnNormOpId") 
  public void setFrnNormOpId (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 2))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "FrnNormOpId", "setFrnNormOpId");
    }
    this.FrnNormOpId = value;
    this._FrnNormOpIdSet = true;
  }

  /** Retrieves the FrnNormOpId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FrnNormOpId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrnNormOpId field
   */
   public String getFrnNormOpIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrnNormOpIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrnNormOpIdAsFormattedString");
       return fmtMgr.formatString(this.getFrnNormOpId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrnNormOpId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrnNormOpIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the FrnNormOpId field from a formatted string
   *
   * @param _value the FrnNormOpId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FrnNormOpId field
   */
   public void setFrnNormOpIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrnNormOpIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFrnNormOpId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrnNormOpId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrnNormOpIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrnNormOpIdFromFormattedString");
   }

  /** get the value of the field: FrnNormOpId (CLEARING_HOUSE_INFO.frn_norm_op_id)
   * @return String the value
   */
  public String getFrnNormOpId () {
    return this.FrnNormOpId;
  }
  /** Change the field to not being actively set: FrnNormOpId (CLEARING_HOUSE_INFO.frn_norm_op_id)
   */
  public void unsetFrnNormOpId () {
    this._FrnNormOpIdSet = false;
  }
  /** See if the field is actively set: FrnNormOpId (CLEARING_HOUSE_INFO.frn_norm_op_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetFrnNormOpId () {
    return this._FrnNormOpIdSet;
  }
  /** set the fields value: FrnNormPostDelay (CLEARING_HOUSE_INFO.frn_norm_post_delay)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FrnNormPostDelay") 
  public void setFrnNormPostDelay (Integer value) throws ServiceException
  {
    this.FrnNormPostDelay = value;
    this._FrnNormPostDelaySet = true;
  }

  /** Retrieves the FrnNormPostDelay field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FrnNormPostDelay field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrnNormPostDelay field
   */
   public String getFrnNormPostDelayAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrnNormPostDelayAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrnNormPostDelayAsFormattedString");
       return fmtMgr.formatNumber(this.getFrnNormPostDelay(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrnNormPostDelay");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrnNormPostDelayAsFormattedString");
       throw x;
     }
   }
  /** Sets the FrnNormPostDelay field from a formatted string
   *
   * @param _value the FrnNormPostDelay field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FrnNormPostDelay field
   */
   public void setFrnNormPostDelayFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrnNormPostDelayFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFrnNormPostDelay(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrnNormPostDelay");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrnNormPostDelayFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrnNormPostDelayFromFormattedString");
   }

  /** get the value of the field: FrnNormPostDelay (CLEARING_HOUSE_INFO.frn_norm_post_delay)
   * @return Integer the value
   */
  public Integer getFrnNormPostDelay () {
    return this.FrnNormPostDelay;
  }
  /** Change the field to not being actively set: FrnNormPostDelay (CLEARING_HOUSE_INFO.frn_norm_post_delay)
   */
  public void unsetFrnNormPostDelay () {
    this._FrnNormPostDelaySet = false;
  }
  /** See if the field is actively set: FrnNormPostDelay (CLEARING_HOUSE_INFO.frn_norm_post_delay)
   * @return boolean whether the field is actively set
   */
  public boolean issetFrnNormPostDelay () {
    return this._FrnNormPostDelaySet;
  }
  /** set the fields value: FrnFastOpId (CLEARING_HOUSE_INFO.frn_fast_op_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FrnFastOpId") 
  public void setFrnFastOpId (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 2))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "FrnFastOpId", "setFrnFastOpId");
    }
    this.FrnFastOpId = value;
    this._FrnFastOpIdSet = true;
  }

  /** Retrieves the FrnFastOpId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FrnFastOpId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrnFastOpId field
   */
   public String getFrnFastOpIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrnFastOpIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrnFastOpIdAsFormattedString");
       return fmtMgr.formatString(this.getFrnFastOpId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrnFastOpId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrnFastOpIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the FrnFastOpId field from a formatted string
   *
   * @param _value the FrnFastOpId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FrnFastOpId field
   */
   public void setFrnFastOpIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrnFastOpIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFrnFastOpId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrnFastOpId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrnFastOpIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrnFastOpIdFromFormattedString");
   }

  /** get the value of the field: FrnFastOpId (CLEARING_HOUSE_INFO.frn_fast_op_id)
   * @return String the value
   */
  public String getFrnFastOpId () {
    return this.FrnFastOpId;
  }
  /** Change the field to not being actively set: FrnFastOpId (CLEARING_HOUSE_INFO.frn_fast_op_id)
   */
  public void unsetFrnFastOpId () {
    this._FrnFastOpIdSet = false;
  }
  /** See if the field is actively set: FrnFastOpId (CLEARING_HOUSE_INFO.frn_fast_op_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetFrnFastOpId () {
    return this._FrnFastOpIdSet;
  }
  /** set the fields value: FrnFastPostDelay (CLEARING_HOUSE_INFO.frn_fast_post_delay)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FrnFastPostDelay") 
  public void setFrnFastPostDelay (Integer value) throws ServiceException
  {
    this.FrnFastPostDelay = value;
    this._FrnFastPostDelaySet = true;
  }

  /** Retrieves the FrnFastPostDelay field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FrnFastPostDelay field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrnFastPostDelay field
   */
   public String getFrnFastPostDelayAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrnFastPostDelayAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrnFastPostDelayAsFormattedString");
       return fmtMgr.formatNumber(this.getFrnFastPostDelay(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrnFastPostDelay");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrnFastPostDelayAsFormattedString");
       throw x;
     }
   }
  /** Sets the FrnFastPostDelay field from a formatted string
   *
   * @param _value the FrnFastPostDelay field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FrnFastPostDelay field
   */
   public void setFrnFastPostDelayFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrnFastPostDelayFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFrnFastPostDelay(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrnFastPostDelay");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrnFastPostDelayFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrnFastPostDelayFromFormattedString");
   }

  /** get the value of the field: FrnFastPostDelay (CLEARING_HOUSE_INFO.frn_fast_post_delay)
   * @return Integer the value
   */
  public Integer getFrnFastPostDelay () {
    return this.FrnFastPostDelay;
  }
  /** Change the field to not being actively set: FrnFastPostDelay (CLEARING_HOUSE_INFO.frn_fast_post_delay)
   */
  public void unsetFrnFastPostDelay () {
    this._FrnFastPostDelaySet = false;
  }
  /** See if the field is actively set: FrnFastPostDelay (CLEARING_HOUSE_INFO.frn_fast_post_delay)
   * @return boolean whether the field is actively set
   */
  public boolean issetFrnFastPostDelay () {
    return this._FrnFastPostDelaySet;
  }
  /** set the fields value: FrnNationalNum (CLEARING_HOUSE_INFO.frn_national_num)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FrnNationalNum") 
  public void setFrnNationalNum (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 6))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "FrnNationalNum", "setFrnNationalNum");
    }
    this.FrnNationalNum = value;
    this._FrnNationalNumSet = true;
  }

  /** Retrieves the FrnNationalNum field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FrnNationalNum field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrnNationalNum field
   */
   public String getFrnNationalNumAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrnNationalNumAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrnNationalNumAsFormattedString");
       return fmtMgr.formatString(this.getFrnNationalNum());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrnNationalNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrnNationalNumAsFormattedString");
       throw x;
     }
   }
  /** Sets the FrnNationalNum field from a formatted string
   *
   * @param _value the FrnNationalNum field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FrnNationalNum field
   */
   public void setFrnNationalNumFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrnNationalNumFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFrnNationalNum(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrnNationalNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrnNationalNumFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrnNationalNumFromFormattedString");
   }

  /** get the value of the field: FrnNationalNum (CLEARING_HOUSE_INFO.frn_national_num)
   * @return String the value
   */
  public String getFrnNationalNum () {
    return this.FrnNationalNum;
  }
  /** Change the field to not being actively set: FrnNationalNum (CLEARING_HOUSE_INFO.frn_national_num)
   */
  public void unsetFrnNationalNum () {
    this._FrnNationalNumSet = false;
  }
  /** See if the field is actively set: FrnNationalNum (CLEARING_HOUSE_INFO.frn_national_num)
   * @return boolean whether the field is actively set
   */
  public boolean issetFrnNationalNum () {
    return this._FrnNationalNumSet;
  }
  /** set the fields value: FrnCompanyName (CLEARING_HOUSE_INFO.frn_company_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FrnCompanyName") 
  public void setFrnCompanyName (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 24))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "FrnCompanyName", "setFrnCompanyName");
    }
    this.FrnCompanyName = value;
    this._FrnCompanyNameSet = true;
  }

  /** Retrieves the FrnCompanyName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FrnCompanyName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrnCompanyName field
   */
   public String getFrnCompanyNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrnCompanyNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrnCompanyNameAsFormattedString");
       return fmtMgr.formatString(this.getFrnCompanyName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrnCompanyName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrnCompanyNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the FrnCompanyName field from a formatted string
   *
   * @param _value the FrnCompanyName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FrnCompanyName field
   */
   public void setFrnCompanyNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrnCompanyNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFrnCompanyName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrnCompanyName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrnCompanyNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrnCompanyNameFromFormattedString");
   }

  /** get the value of the field: FrnCompanyName (CLEARING_HOUSE_INFO.frn_company_name)
   * @return String the value
   */
  public String getFrnCompanyName () {
    return this.FrnCompanyName;
  }
  /** Change the field to not being actively set: FrnCompanyName (CLEARING_HOUSE_INFO.frn_company_name)
   */
  public void unsetFrnCompanyName () {
    this._FrnCompanyNameSet = false;
  }
  /** See if the field is actively set: FrnCompanyName (CLEARING_HOUSE_INFO.frn_company_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetFrnCompanyName () {
    return this._FrnCompanyNameSet;
  }
  /** set the fields value: FrnAgencyCode (CLEARING_HOUSE_INFO.frn_agency_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FrnAgencyCode") 
  public void setFrnAgencyCode (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 5))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "FrnAgencyCode", "setFrnAgencyCode");
    }
    this.FrnAgencyCode = value;
    this._FrnAgencyCodeSet = true;
  }

  /** Retrieves the FrnAgencyCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FrnAgencyCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrnAgencyCode field
   */
   public String getFrnAgencyCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrnAgencyCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrnAgencyCodeAsFormattedString");
       return fmtMgr.formatString(this.getFrnAgencyCode());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrnAgencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrnAgencyCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the FrnAgencyCode field from a formatted string
   *
   * @param _value the FrnAgencyCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FrnAgencyCode field
   */
   public void setFrnAgencyCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrnAgencyCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFrnAgencyCode(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrnAgencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrnAgencyCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrnAgencyCodeFromFormattedString");
   }

  /** get the value of the field: FrnAgencyCode (CLEARING_HOUSE_INFO.frn_agency_code)
   * @return String the value
   */
  public String getFrnAgencyCode () {
    return this.FrnAgencyCode;
  }
  /** Change the field to not being actively set: FrnAgencyCode (CLEARING_HOUSE_INFO.frn_agency_code)
   */
  public void unsetFrnAgencyCode () {
    this._FrnAgencyCodeSet = false;
  }
  /** See if the field is actively set: FrnAgencyCode (CLEARING_HOUSE_INFO.frn_agency_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetFrnAgencyCode () {
    return this._FrnAgencyCodeSet;
  }
  /** set the fields value: FrnAccountNum (CLEARING_HOUSE_INFO.frn_account_num)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FrnAccountNum") 
  public void setFrnAccountNum (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 11))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "FrnAccountNum", "setFrnAccountNum");
    }
    this.FrnAccountNum = value;
    this._FrnAccountNumSet = true;
  }

  /** Retrieves the FrnAccountNum field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FrnAccountNum field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrnAccountNum field
   */
   public String getFrnAccountNumAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrnAccountNumAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrnAccountNumAsFormattedString");
       return fmtMgr.formatString(this.getFrnAccountNum());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrnAccountNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrnAccountNumAsFormattedString");
       throw x;
     }
   }
  /** Sets the FrnAccountNum field from a formatted string
   *
   * @param _value the FrnAccountNum field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FrnAccountNum field
   */
   public void setFrnAccountNumFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrnAccountNumFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFrnAccountNum(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrnAccountNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrnAccountNumFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrnAccountNumFromFormattedString");
   }

  /** get the value of the field: FrnAccountNum (CLEARING_HOUSE_INFO.frn_account_num)
   * @return String the value
   */
  public String getFrnAccountNum () {
    return this.FrnAccountNum;
  }
  /** Change the field to not being actively set: FrnAccountNum (CLEARING_HOUSE_INFO.frn_account_num)
   */
  public void unsetFrnAccountNum () {
    this._FrnAccountNumSet = false;
  }
  /** See if the field is actively set: FrnAccountNum (CLEARING_HOUSE_INFO.frn_account_num)
   * @return boolean whether the field is actively set
   */
  public boolean issetFrnAccountNum () {
    return this._FrnAccountNumSet;
  }
  /** set the fields value: FrnBankCode (CLEARING_HOUSE_INFO.frn_bank_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FrnBankCode") 
  public void setFrnBankCode (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 5))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "FrnBankCode", "setFrnBankCode");
    }
    this.FrnBankCode = value;
    this._FrnBankCodeSet = true;
  }

  /** Retrieves the FrnBankCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FrnBankCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrnBankCode field
   */
   public String getFrnBankCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrnBankCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrnBankCodeAsFormattedString");
       return fmtMgr.formatString(this.getFrnBankCode());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrnBankCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrnBankCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the FrnBankCode field from a formatted string
   *
   * @param _value the FrnBankCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FrnBankCode field
   */
   public void setFrnBankCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrnBankCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFrnBankCode(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrnBankCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrnBankCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrnBankCodeFromFormattedString");
   }

  /** get the value of the field: FrnBankCode (CLEARING_HOUSE_INFO.frn_bank_code)
   * @return String the value
   */
  public String getFrnBankCode () {
    return this.FrnBankCode;
  }
  /** Change the field to not being actively set: FrnBankCode (CLEARING_HOUSE_INFO.frn_bank_code)
   */
  public void unsetFrnBankCode () {
    this._FrnBankCodeSet = false;
  }
  /** See if the field is actively set: FrnBankCode (CLEARING_HOUSE_INFO.frn_bank_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetFrnBankCode () {
    return this._FrnBankCodeSet;
  }
  /** set the fields value: FdmMerchantName (CLEARING_HOUSE_INFO.fdm_merchant_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FdmMerchantName") 
  public void setFdmMerchantName (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 16))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "FdmMerchantName", "setFdmMerchantName");
    }
    this.FdmMerchantName = value;
    this._FdmMerchantNameSet = true;
  }

  /** Retrieves the FdmMerchantName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FdmMerchantName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FdmMerchantName field
   */
   public String getFdmMerchantNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFdmMerchantNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFdmMerchantNameAsFormattedString");
       return fmtMgr.formatString(this.getFdmMerchantName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FdmMerchantName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFdmMerchantNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the FdmMerchantName field from a formatted string
   *
   * @param _value the FdmMerchantName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FdmMerchantName field
   */
   public void setFdmMerchantNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFdmMerchantNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFdmMerchantName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FdmMerchantName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFdmMerchantNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFdmMerchantNameFromFormattedString");
   }

  /** get the value of the field: FdmMerchantName (CLEARING_HOUSE_INFO.fdm_merchant_name)
   * @return String the value
   */
  public String getFdmMerchantName () {
    return this.FdmMerchantName;
  }
  /** Change the field to not being actively set: FdmMerchantName (CLEARING_HOUSE_INFO.fdm_merchant_name)
   */
  public void unsetFdmMerchantName () {
    this._FdmMerchantNameSet = false;
  }
  /** See if the field is actively set: FdmMerchantName (CLEARING_HOUSE_INFO.fdm_merchant_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetFdmMerchantName () {
    return this._FdmMerchantNameSet;
  }
  /** set the fields value: FdmMerchantNumber (CLEARING_HOUSE_INFO.fdm_merchant_number)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FdmMerchantNumber") 
  public void setFdmMerchantNumber (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 11))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "FdmMerchantNumber", "setFdmMerchantNumber");
    }
    this.FdmMerchantNumber = value;
    this._FdmMerchantNumberSet = true;
  }

  /** Retrieves the FdmMerchantNumber field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FdmMerchantNumber field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FdmMerchantNumber field
   */
   public String getFdmMerchantNumberAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFdmMerchantNumberAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFdmMerchantNumberAsFormattedString");
       return fmtMgr.formatString(this.getFdmMerchantNumber());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FdmMerchantNumber");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFdmMerchantNumberAsFormattedString");
       throw x;
     }
   }
  /** Sets the FdmMerchantNumber field from a formatted string
   *
   * @param _value the FdmMerchantNumber field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FdmMerchantNumber field
   */
   public void setFdmMerchantNumberFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFdmMerchantNumberFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFdmMerchantNumber(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FdmMerchantNumber");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFdmMerchantNumberFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFdmMerchantNumberFromFormattedString");
   }

  /** get the value of the field: FdmMerchantNumber (CLEARING_HOUSE_INFO.fdm_merchant_number)
   * @return String the value
   */
  public String getFdmMerchantNumber () {
    return this.FdmMerchantNumber;
  }
  /** Change the field to not being actively set: FdmMerchantNumber (CLEARING_HOUSE_INFO.fdm_merchant_number)
   */
  public void unsetFdmMerchantNumber () {
    this._FdmMerchantNumberSet = false;
  }
  /** See if the field is actively set: FdmMerchantNumber (CLEARING_HOUSE_INFO.fdm_merchant_number)
   * @return boolean whether the field is actively set
   */
  public boolean issetFdmMerchantNumber () {
    return this._FdmMerchantNumberSet;
  }
  /** set the fields value: FdmAvsType (CLEARING_HOUSE_INFO.fdm_avs_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FdmAvsType") 
  public void setFdmAvsType (Integer value) throws ServiceException
  {
    this.FdmAvsType = value;
    this._FdmAvsTypeSet = true;
  }

  /** Retrieves the FdmAvsType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FdmAvsType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FdmAvsType field
   */
   public String getFdmAvsTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFdmAvsTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFdmAvsTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getFdmAvsType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FdmAvsType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFdmAvsTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the FdmAvsType field from a formatted string
   *
   * @param _value the FdmAvsType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FdmAvsType field
   */
   public void setFdmAvsTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFdmAvsTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFdmAvsType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FdmAvsType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFdmAvsTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFdmAvsTypeFromFormattedString");
   }

  /** get the value of the field: FdmAvsType (CLEARING_HOUSE_INFO.fdm_avs_type)
   * @return Integer the value
   */
  public Integer getFdmAvsType () {
    return this.FdmAvsType;
  }
  /** Change the field to not being actively set: FdmAvsType (CLEARING_HOUSE_INFO.fdm_avs_type)
   */
  public void unsetFdmAvsType () {
    this._FdmAvsTypeSet = false;
  }
  /** See if the field is actively set: FdmAvsType (CLEARING_HOUSE_INFO.fdm_avs_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetFdmAvsType () {
    return this._FdmAvsTypeSet;
  }
  /** set the fields value: DomRconNumber (CLEARING_HOUSE_INFO.dom_rcon_number)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DomRconNumber") 
  public void setDomRconNumber (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 15))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "DomRconNumber", "setDomRconNumber");
    }
    this.DomRconNumber = value;
    this._DomRconNumberSet = true;
  }

  /** Retrieves the DomRconNumber field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DomRconNumber field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DomRconNumber field
   */
   public String getDomRconNumberAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomRconNumberAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDomRconNumberAsFormattedString");
       return fmtMgr.formatString(this.getDomRconNumber());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DomRconNumber");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDomRconNumberAsFormattedString");
       throw x;
     }
   }
  /** Sets the DomRconNumber field from a formatted string
   *
   * @param _value the DomRconNumber field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DomRconNumber field
   */
   public void setDomRconNumberFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomRconNumberFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDomRconNumber(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DomRconNumber");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDomRconNumberFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDomRconNumberFromFormattedString");
   }

  /** get the value of the field: DomRconNumber (CLEARING_HOUSE_INFO.dom_rcon_number)
   * @return String the value
   */
  public String getDomRconNumber () {
    return this.DomRconNumber;
  }
  /** Change the field to not being actively set: DomRconNumber (CLEARING_HOUSE_INFO.dom_rcon_number)
   */
  public void unsetDomRconNumber () {
    this._DomRconNumberSet = false;
  }
  /** See if the field is actively set: DomRconNumber (CLEARING_HOUSE_INFO.dom_rcon_number)
   * @return boolean whether the field is actively set
   */
  public boolean issetDomRconNumber () {
    return this._DomRconNumberSet;
  }
  /** set the fields value: DomMailboxId (CLEARING_HOUSE_INFO.dom_mailbox_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DomMailboxId") 
  public void setDomMailboxId (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 8))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "DomMailboxId", "setDomMailboxId");
    }
    this.DomMailboxId = value;
    this._DomMailboxIdSet = true;
  }

  /** Retrieves the DomMailboxId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DomMailboxId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DomMailboxId field
   */
   public String getDomMailboxIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomMailboxIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDomMailboxIdAsFormattedString");
       return fmtMgr.formatString(this.getDomMailboxId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DomMailboxId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDomMailboxIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the DomMailboxId field from a formatted string
   *
   * @param _value the DomMailboxId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DomMailboxId field
   */
   public void setDomMailboxIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomMailboxIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDomMailboxId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DomMailboxId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDomMailboxIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDomMailboxIdFromFormattedString");
   }

  /** get the value of the field: DomMailboxId (CLEARING_HOUSE_INFO.dom_mailbox_id)
   * @return String the value
   */
  public String getDomMailboxId () {
    return this.DomMailboxId;
  }
  /** Change the field to not being actively set: DomMailboxId (CLEARING_HOUSE_INFO.dom_mailbox_id)
   */
  public void unsetDomMailboxId () {
    this._DomMailboxIdSet = false;
  }
  /** See if the field is actively set: DomMailboxId (CLEARING_HOUSE_INFO.dom_mailbox_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetDomMailboxId () {
    return this._DomMailboxIdSet;
  }
  /** set the fields value: DomFundOrig (CLEARING_HOUSE_INFO.dom_fund_orig)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DomFundOrig") 
  public void setDomFundOrig (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "DomFundOrig", "setDomFundOrig");
    }
    this.DomFundOrig = value;
    this._DomFundOrigSet = true;
  }

  /** Retrieves the DomFundOrig field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DomFundOrig field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DomFundOrig field
   */
   public String getDomFundOrigAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomFundOrigAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDomFundOrigAsFormattedString");
       return fmtMgr.formatString(this.getDomFundOrig());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DomFundOrig");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDomFundOrigAsFormattedString");
       throw x;
     }
   }
  /** Sets the DomFundOrig field from a formatted string
   *
   * @param _value the DomFundOrig field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DomFundOrig field
   */
   public void setDomFundOrigFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomFundOrigFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDomFundOrig(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DomFundOrig");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDomFundOrigFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDomFundOrigFromFormattedString");
   }

  /** get the value of the field: DomFundOrig (CLEARING_HOUSE_INFO.dom_fund_orig)
   * @return String the value
   */
  public String getDomFundOrig () {
    return this.DomFundOrig;
  }
  /** Change the field to not being actively set: DomFundOrig (CLEARING_HOUSE_INFO.dom_fund_orig)
   */
  public void unsetDomFundOrig () {
    this._DomFundOrigSet = false;
  }
  /** See if the field is actively set: DomFundOrig (CLEARING_HOUSE_INFO.dom_fund_orig)
   * @return boolean whether the field is actively set
   */
  public boolean issetDomFundOrig () {
    return this._DomFundOrigSet;
  }
  /** set the fields value: DomFundDest (CLEARING_HOUSE_INFO.dom_fund_dest)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DomFundDest") 
  public void setDomFundDest (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 5))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "DomFundDest", "setDomFundDest");
    }
    this.DomFundDest = value;
    this._DomFundDestSet = true;
  }

  /** Retrieves the DomFundDest field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DomFundDest field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DomFundDest field
   */
   public String getDomFundDestAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomFundDestAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDomFundDestAsFormattedString");
       return fmtMgr.formatString(this.getDomFundDest());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DomFundDest");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDomFundDestAsFormattedString");
       throw x;
     }
   }
  /** Sets the DomFundDest field from a formatted string
   *
   * @param _value the DomFundDest field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DomFundDest field
   */
   public void setDomFundDestFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomFundDestFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDomFundDest(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DomFundDest");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDomFundDestFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDomFundDestFromFormattedString");
   }

  /** get the value of the field: DomFundDest (CLEARING_HOUSE_INFO.dom_fund_dest)
   * @return String the value
   */
  public String getDomFundDest () {
    return this.DomFundDest;
  }
  /** Change the field to not being actively set: DomFundDest (CLEARING_HOUSE_INFO.dom_fund_dest)
   */
  public void unsetDomFundDest () {
    this._DomFundDestSet = false;
  }
  /** See if the field is actively set: DomFundDest (CLEARING_HOUSE_INFO.dom_fund_dest)
   * @return boolean whether the field is actively set
   */
  public boolean issetDomFundDest () {
    return this._DomFundDestSet;
  }
  /** set the fields value: DomVisaOrig (CLEARING_HOUSE_INFO.dom_visa_orig)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DomVisaOrig") 
  public void setDomVisaOrig (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "DomVisaOrig", "setDomVisaOrig");
    }
    this.DomVisaOrig = value;
    this._DomVisaOrigSet = true;
  }

  /** Retrieves the DomVisaOrig field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DomVisaOrig field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DomVisaOrig field
   */
   public String getDomVisaOrigAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomVisaOrigAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDomVisaOrigAsFormattedString");
       return fmtMgr.formatString(this.getDomVisaOrig());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DomVisaOrig");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDomVisaOrigAsFormattedString");
       throw x;
     }
   }
  /** Sets the DomVisaOrig field from a formatted string
   *
   * @param _value the DomVisaOrig field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DomVisaOrig field
   */
   public void setDomVisaOrigFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomVisaOrigFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDomVisaOrig(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DomVisaOrig");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDomVisaOrigFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDomVisaOrigFromFormattedString");
   }

  /** get the value of the field: DomVisaOrig (CLEARING_HOUSE_INFO.dom_visa_orig)
   * @return String the value
   */
  public String getDomVisaOrig () {
    return this.DomVisaOrig;
  }
  /** Change the field to not being actively set: DomVisaOrig (CLEARING_HOUSE_INFO.dom_visa_orig)
   */
  public void unsetDomVisaOrig () {
    this._DomVisaOrigSet = false;
  }
  /** See if the field is actively set: DomVisaOrig (CLEARING_HOUSE_INFO.dom_visa_orig)
   * @return boolean whether the field is actively set
   */
  public boolean issetDomVisaOrig () {
    return this._DomVisaOrigSet;
  }
  /** set the fields value: DomVisaDest (CLEARING_HOUSE_INFO.dom_visa_dest)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DomVisaDest") 
  public void setDomVisaDest (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 5))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "DomVisaDest", "setDomVisaDest");
    }
    this.DomVisaDest = value;
    this._DomVisaDestSet = true;
  }

  /** Retrieves the DomVisaDest field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DomVisaDest field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DomVisaDest field
   */
   public String getDomVisaDestAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomVisaDestAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDomVisaDestAsFormattedString");
       return fmtMgr.formatString(this.getDomVisaDest());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DomVisaDest");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDomVisaDestAsFormattedString");
       throw x;
     }
   }
  /** Sets the DomVisaDest field from a formatted string
   *
   * @param _value the DomVisaDest field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DomVisaDest field
   */
   public void setDomVisaDestFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomVisaDestFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDomVisaDest(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DomVisaDest");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDomVisaDestFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDomVisaDestFromFormattedString");
   }

  /** get the value of the field: DomVisaDest (CLEARING_HOUSE_INFO.dom_visa_dest)
   * @return String the value
   */
  public String getDomVisaDest () {
    return this.DomVisaDest;
  }
  /** Change the field to not being actively set: DomVisaDest (CLEARING_HOUSE_INFO.dom_visa_dest)
   */
  public void unsetDomVisaDest () {
    this._DomVisaDestSet = false;
  }
  /** See if the field is actively set: DomVisaDest (CLEARING_HOUSE_INFO.dom_visa_dest)
   * @return boolean whether the field is actively set
   */
  public boolean issetDomVisaDest () {
    return this._DomVisaDestSet;
  }
  /** set the fields value: DomMscOrig (CLEARING_HOUSE_INFO.dom_msc_orig)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DomMscOrig") 
  public void setDomMscOrig (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "DomMscOrig", "setDomMscOrig");
    }
    this.DomMscOrig = value;
    this._DomMscOrigSet = true;
  }

  /** Retrieves the DomMscOrig field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DomMscOrig field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DomMscOrig field
   */
   public String getDomMscOrigAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomMscOrigAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDomMscOrigAsFormattedString");
       return fmtMgr.formatString(this.getDomMscOrig());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DomMscOrig");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDomMscOrigAsFormattedString");
       throw x;
     }
   }
  /** Sets the DomMscOrig field from a formatted string
   *
   * @param _value the DomMscOrig field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DomMscOrig field
   */
   public void setDomMscOrigFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomMscOrigFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDomMscOrig(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DomMscOrig");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDomMscOrigFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDomMscOrigFromFormattedString");
   }

  /** get the value of the field: DomMscOrig (CLEARING_HOUSE_INFO.dom_msc_orig)
   * @return String the value
   */
  public String getDomMscOrig () {
    return this.DomMscOrig;
  }
  /** Change the field to not being actively set: DomMscOrig (CLEARING_HOUSE_INFO.dom_msc_orig)
   */
  public void unsetDomMscOrig () {
    this._DomMscOrigSet = false;
  }
  /** See if the field is actively set: DomMscOrig (CLEARING_HOUSE_INFO.dom_msc_orig)
   * @return boolean whether the field is actively set
   */
  public boolean issetDomMscOrig () {
    return this._DomMscOrigSet;
  }
  /** set the fields value: DomMscDest (CLEARING_HOUSE_INFO.dom_msc_dest)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DomMscDest") 
  public void setDomMscDest (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 5))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "DomMscDest", "setDomMscDest");
    }
    this.DomMscDest = value;
    this._DomMscDestSet = true;
  }

  /** Retrieves the DomMscDest field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DomMscDest field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DomMscDest field
   */
   public String getDomMscDestAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomMscDestAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDomMscDestAsFormattedString");
       return fmtMgr.formatString(this.getDomMscDest());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DomMscDest");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDomMscDestAsFormattedString");
       throw x;
     }
   }
  /** Sets the DomMscDest field from a formatted string
   *
   * @param _value the DomMscDest field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DomMscDest field
   */
   public void setDomMscDestFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomMscDestFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDomMscDest(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DomMscDest");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDomMscDestFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDomMscDestFromFormattedString");
   }

  /** get the value of the field: DomMscDest (CLEARING_HOUSE_INFO.dom_msc_dest)
   * @return String the value
   */
  public String getDomMscDest () {
    return this.DomMscDest;
  }
  /** Change the field to not being actively set: DomMscDest (CLEARING_HOUSE_INFO.dom_msc_dest)
   */
  public void unsetDomMscDest () {
    this._DomMscDestSet = false;
  }
  /** See if the field is actively set: DomMscDest (CLEARING_HOUSE_INFO.dom_msc_dest)
   * @return boolean whether the field is actively set
   */
  public boolean issetDomMscDest () {
    return this._DomMscDestSet;
  }
  /** set the fields value: DomAmexProcessId (CLEARING_HOUSE_INFO.dom_amex_process_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DomAmexProcessId") 
  public void setDomAmexProcessId (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 3))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "DomAmexProcessId", "setDomAmexProcessId");
    }
    this.DomAmexProcessId = value;
    this._DomAmexProcessIdSet = true;
  }

  /** Retrieves the DomAmexProcessId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DomAmexProcessId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DomAmexProcessId field
   */
   public String getDomAmexProcessIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomAmexProcessIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDomAmexProcessIdAsFormattedString");
       return fmtMgr.formatString(this.getDomAmexProcessId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DomAmexProcessId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDomAmexProcessIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the DomAmexProcessId field from a formatted string
   *
   * @param _value the DomAmexProcessId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DomAmexProcessId field
   */
   public void setDomAmexProcessIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomAmexProcessIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDomAmexProcessId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DomAmexProcessId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDomAmexProcessIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDomAmexProcessIdFromFormattedString");
   }

  /** get the value of the field: DomAmexProcessId (CLEARING_HOUSE_INFO.dom_amex_process_id)
   * @return String the value
   */
  public String getDomAmexProcessId () {
    return this.DomAmexProcessId;
  }
  /** Change the field to not being actively set: DomAmexProcessId (CLEARING_HOUSE_INFO.dom_amex_process_id)
   */
  public void unsetDomAmexProcessId () {
    this._DomAmexProcessIdSet = false;
  }
  /** See if the field is actively set: DomAmexProcessId (CLEARING_HOUSE_INFO.dom_amex_process_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetDomAmexProcessId () {
    return this._DomAmexProcessIdSet;
  }
  /** set the fields value: DomAmexReceiverId (CLEARING_HOUSE_INFO.dom_amex_receiver_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DomAmexReceiverId") 
  public void setDomAmexReceiverId (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 3))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "DomAmexReceiverId", "setDomAmexReceiverId");
    }
    this.DomAmexReceiverId = value;
    this._DomAmexReceiverIdSet = true;
  }

  /** Retrieves the DomAmexReceiverId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DomAmexReceiverId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DomAmexReceiverId field
   */
   public String getDomAmexReceiverIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomAmexReceiverIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDomAmexReceiverIdAsFormattedString");
       return fmtMgr.formatString(this.getDomAmexReceiverId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DomAmexReceiverId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDomAmexReceiverIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the DomAmexReceiverId field from a formatted string
   *
   * @param _value the DomAmexReceiverId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DomAmexReceiverId field
   */
   public void setDomAmexReceiverIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomAmexReceiverIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDomAmexReceiverId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DomAmexReceiverId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDomAmexReceiverIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDomAmexReceiverIdFromFormattedString");
   }

  /** get the value of the field: DomAmexReceiverId (CLEARING_HOUSE_INFO.dom_amex_receiver_id)
   * @return String the value
   */
  public String getDomAmexReceiverId () {
    return this.DomAmexReceiverId;
  }
  /** Change the field to not being actively set: DomAmexReceiverId (CLEARING_HOUSE_INFO.dom_amex_receiver_id)
   */
  public void unsetDomAmexReceiverId () {
    this._DomAmexReceiverIdSet = false;
  }
  /** See if the field is actively set: DomAmexReceiverId (CLEARING_HOUSE_INFO.dom_amex_receiver_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetDomAmexReceiverId () {
    return this._DomAmexReceiverIdSet;
  }
  /** set the fields value: DomAmexFormatCode (CLEARING_HOUSE_INFO.dom_amex_format_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DomAmexFormatCode") 
  public void setDomAmexFormatCode (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 2))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "DomAmexFormatCode", "setDomAmexFormatCode");
    }
    this.DomAmexFormatCode = value;
    this._DomAmexFormatCodeSet = true;
  }

  /** Retrieves the DomAmexFormatCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DomAmexFormatCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DomAmexFormatCode field
   */
   public String getDomAmexFormatCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomAmexFormatCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDomAmexFormatCodeAsFormattedString");
       return fmtMgr.formatString(this.getDomAmexFormatCode());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DomAmexFormatCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDomAmexFormatCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the DomAmexFormatCode field from a formatted string
   *
   * @param _value the DomAmexFormatCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DomAmexFormatCode field
   */
   public void setDomAmexFormatCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomAmexFormatCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDomAmexFormatCode(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DomAmexFormatCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDomAmexFormatCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDomAmexFormatCodeFromFormattedString");
   }

  /** get the value of the field: DomAmexFormatCode (CLEARING_HOUSE_INFO.dom_amex_format_code)
   * @return String the value
   */
  public String getDomAmexFormatCode () {
    return this.DomAmexFormatCode;
  }
  /** Change the field to not being actively set: DomAmexFormatCode (CLEARING_HOUSE_INFO.dom_amex_format_code)
   */
  public void unsetDomAmexFormatCode () {
    this._DomAmexFormatCodeSet = false;
  }
  /** See if the field is actively set: DomAmexFormatCode (CLEARING_HOUSE_INFO.dom_amex_format_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetDomAmexFormatCode () {
    return this._DomAmexFormatCodeSet;
  }
  /** set the fields value: DomPhoneDest (CLEARING_HOUSE_INFO.dom_phone_dest)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DomPhoneDest") 
  public void setDomPhoneDest (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 5))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "DomPhoneDest", "setDomPhoneDest");
    }
    this.DomPhoneDest = value;
    this._DomPhoneDestSet = true;
  }

  /** Retrieves the DomPhoneDest field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DomPhoneDest field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DomPhoneDest field
   */
   public String getDomPhoneDestAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomPhoneDestAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDomPhoneDestAsFormattedString");
       return fmtMgr.formatString(this.getDomPhoneDest());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DomPhoneDest");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDomPhoneDestAsFormattedString");
       throw x;
     }
   }
  /** Sets the DomPhoneDest field from a formatted string
   *
   * @param _value the DomPhoneDest field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DomPhoneDest field
   */
   public void setDomPhoneDestFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomPhoneDestFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDomPhoneDest(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DomPhoneDest");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDomPhoneDestFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDomPhoneDestFromFormattedString");
   }

  /** get the value of the field: DomPhoneDest (CLEARING_HOUSE_INFO.dom_phone_dest)
   * @return String the value
   */
  public String getDomPhoneDest () {
    return this.DomPhoneDest;
  }
  /** Change the field to not being actively set: DomPhoneDest (CLEARING_HOUSE_INFO.dom_phone_dest)
   */
  public void unsetDomPhoneDest () {
    this._DomPhoneDestSet = false;
  }
  /** See if the field is actively set: DomPhoneDest (CLEARING_HOUSE_INFO.dom_phone_dest)
   * @return boolean whether the field is actively set
   */
  public boolean issetDomPhoneDest () {
    return this._DomPhoneDestSet;
  }
  /** set the fields value: DomCurrencyInd (CLEARING_HOUSE_INFO.dom_currency_ind)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DomCurrencyInd") 
  public void setDomCurrencyInd (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 3))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "DomCurrencyInd", "setDomCurrencyInd");
    }
    this.DomCurrencyInd = value;
    this._DomCurrencyIndSet = true;
  }

  /** Retrieves the DomCurrencyInd field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DomCurrencyInd field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DomCurrencyInd field
   */
   public String getDomCurrencyIndAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomCurrencyIndAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDomCurrencyIndAsFormattedString");
       return fmtMgr.formatString(this.getDomCurrencyInd());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DomCurrencyInd");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDomCurrencyIndAsFormattedString");
       throw x;
     }
   }
  /** Sets the DomCurrencyInd field from a formatted string
   *
   * @param _value the DomCurrencyInd field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DomCurrencyInd field
   */
   public void setDomCurrencyIndFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomCurrencyIndFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDomCurrencyInd(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DomCurrencyInd");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDomCurrencyIndFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDomCurrencyIndFromFormattedString");
   }

  /** get the value of the field: DomCurrencyInd (CLEARING_HOUSE_INFO.dom_currency_ind)
   * @return String the value
   */
  public String getDomCurrencyInd () {
    return this.DomCurrencyInd;
  }
  /** Change the field to not being actively set: DomCurrencyInd (CLEARING_HOUSE_INFO.dom_currency_ind)
   */
  public void unsetDomCurrencyInd () {
    this._DomCurrencyIndSet = false;
  }
  /** See if the field is actively set: DomCurrencyInd (CLEARING_HOUSE_INFO.dom_currency_ind)
   * @return boolean whether the field is actively set
   */
  public boolean issetDomCurrencyInd () {
    return this._DomCurrencyIndSet;
  }
  /** set the fields value: DomFundInstId (CLEARING_HOUSE_INFO.dom_fund_inst_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DomFundInstId") 
  public void setDomFundInstId (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 9))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "DomFundInstId", "setDomFundInstId");
    }
    this.DomFundInstId = value;
    this._DomFundInstIdSet = true;
  }

  /** Retrieves the DomFundInstId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DomFundInstId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DomFundInstId field
   */
   public String getDomFundInstIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomFundInstIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDomFundInstIdAsFormattedString");
       return fmtMgr.formatString(this.getDomFundInstId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DomFundInstId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDomFundInstIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the DomFundInstId field from a formatted string
   *
   * @param _value the DomFundInstId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DomFundInstId field
   */
   public void setDomFundInstIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomFundInstIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDomFundInstId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DomFundInstId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDomFundInstIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDomFundInstIdFromFormattedString");
   }

  /** get the value of the field: DomFundInstId (CLEARING_HOUSE_INFO.dom_fund_inst_id)
   * @return String the value
   */
  public String getDomFundInstId () {
    return this.DomFundInstId;
  }
  /** Change the field to not being actively set: DomFundInstId (CLEARING_HOUSE_INFO.dom_fund_inst_id)
   */
  public void unsetDomFundInstId () {
    this._DomFundInstIdSet = false;
  }
  /** See if the field is actively set: DomFundInstId (CLEARING_HOUSE_INFO.dom_fund_inst_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetDomFundInstId () {
    return this._DomFundInstIdSet;
  }
  /** set the fields value: DomFundAcctNum (CLEARING_HOUSE_INFO.dom_fund_acct_num)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DomFundAcctNum") 
  public void setDomFundAcctNum (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 12))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "DomFundAcctNum", "setDomFundAcctNum");
    }
    this.DomFundAcctNum = value;
    this._DomFundAcctNumSet = true;
  }

  /** Retrieves the DomFundAcctNum field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DomFundAcctNum field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DomFundAcctNum field
   */
   public String getDomFundAcctNumAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomFundAcctNumAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDomFundAcctNumAsFormattedString");
       return fmtMgr.formatString(this.getDomFundAcctNum());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DomFundAcctNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDomFundAcctNumAsFormattedString");
       throw x;
     }
   }
  /** Sets the DomFundAcctNum field from a formatted string
   *
   * @param _value the DomFundAcctNum field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DomFundAcctNum field
   */
   public void setDomFundAcctNumFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomFundAcctNumFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDomFundAcctNum(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DomFundAcctNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDomFundAcctNumFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDomFundAcctNumFromFormattedString");
   }

  /** get the value of the field: DomFundAcctNum (CLEARING_HOUSE_INFO.dom_fund_acct_num)
   * @return String the value
   */
  public String getDomFundAcctNum () {
    return this.DomFundAcctNum;
  }
  /** Change the field to not being actively set: DomFundAcctNum (CLEARING_HOUSE_INFO.dom_fund_acct_num)
   */
  public void unsetDomFundAcctNum () {
    this._DomFundAcctNumSet = false;
  }
  /** See if the field is actively set: DomFundAcctNum (CLEARING_HOUSE_INFO.dom_fund_acct_num)
   * @return boolean whether the field is actively set
   */
  public boolean issetDomFundAcctNum () {
    return this._DomFundAcctNumSet;
  }
  /** set the fields value: DomBatchLimit (CLEARING_HOUSE_INFO.dom_batch_limit)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DomBatchLimit") 
  public void setDomBatchLimit (Integer value) throws ServiceException
  {
    this.DomBatchLimit = value;
    this._DomBatchLimitSet = true;
  }

  /** Retrieves the DomBatchLimit field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DomBatchLimit field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DomBatchLimit field
   */
   public String getDomBatchLimitAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomBatchLimitAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDomBatchLimitAsFormattedString");
       return fmtMgr.formatNumber(this.getDomBatchLimit(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DomBatchLimit");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDomBatchLimitAsFormattedString");
       throw x;
     }
   }
  /** Sets the DomBatchLimit field from a formatted string
   *
   * @param _value the DomBatchLimit field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DomBatchLimit field
   */
   public void setDomBatchLimitFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomBatchLimitFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDomBatchLimit(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DomBatchLimit");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDomBatchLimitFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDomBatchLimitFromFormattedString");
   }

  /** get the value of the field: DomBatchLimit (CLEARING_HOUSE_INFO.dom_batch_limit)
   * @return Integer the value
   */
  public Integer getDomBatchLimit () {
    return this.DomBatchLimit;
  }
  /** Change the field to not being actively set: DomBatchLimit (CLEARING_HOUSE_INFO.dom_batch_limit)
   */
  public void unsetDomBatchLimit () {
    this._DomBatchLimitSet = false;
  }
  /** See if the field is actively set: DomBatchLimit (CLEARING_HOUSE_INFO.dom_batch_limit)
   * @return boolean whether the field is actively set
   */
  public boolean issetDomBatchLimit () {
    return this._DomBatchLimitSet;
  }
  /** set the fields value: DomVisaMerchant (CLEARING_HOUSE_INFO.dom_visa_merchant)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DomVisaMerchant") 
  public void setDomVisaMerchant (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 8))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "DomVisaMerchant", "setDomVisaMerchant");
    }
    this.DomVisaMerchant = value;
    this._DomVisaMerchantSet = true;
  }

  /** Retrieves the DomVisaMerchant field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DomVisaMerchant field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DomVisaMerchant field
   */
   public String getDomVisaMerchantAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomVisaMerchantAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDomVisaMerchantAsFormattedString");
       return fmtMgr.formatString(this.getDomVisaMerchant());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DomVisaMerchant");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDomVisaMerchantAsFormattedString");
       throw x;
     }
   }
  /** Sets the DomVisaMerchant field from a formatted string
   *
   * @param _value the DomVisaMerchant field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DomVisaMerchant field
   */
   public void setDomVisaMerchantFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomVisaMerchantFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDomVisaMerchant(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DomVisaMerchant");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDomVisaMerchantFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDomVisaMerchantFromFormattedString");
   }

  /** get the value of the field: DomVisaMerchant (CLEARING_HOUSE_INFO.dom_visa_merchant)
   * @return String the value
   */
  public String getDomVisaMerchant () {
    return this.DomVisaMerchant;
  }
  /** Change the field to not being actively set: DomVisaMerchant (CLEARING_HOUSE_INFO.dom_visa_merchant)
   */
  public void unsetDomVisaMerchant () {
    this._DomVisaMerchantSet = false;
  }
  /** See if the field is actively set: DomVisaMerchant (CLEARING_HOUSE_INFO.dom_visa_merchant)
   * @return boolean whether the field is actively set
   */
  public boolean issetDomVisaMerchant () {
    return this._DomVisaMerchantSet;
  }
  /** set the fields value: DomMscMerchant (CLEARING_HOUSE_INFO.dom_msc_merchant)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DomMscMerchant") 
  public void setDomMscMerchant (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 8))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "DomMscMerchant", "setDomMscMerchant");
    }
    this.DomMscMerchant = value;
    this._DomMscMerchantSet = true;
  }

  /** Retrieves the DomMscMerchant field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DomMscMerchant field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DomMscMerchant field
   */
   public String getDomMscMerchantAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomMscMerchantAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDomMscMerchantAsFormattedString");
       return fmtMgr.formatString(this.getDomMscMerchant());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DomMscMerchant");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDomMscMerchantAsFormattedString");
       throw x;
     }
   }
  /** Sets the DomMscMerchant field from a formatted string
   *
   * @param _value the DomMscMerchant field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DomMscMerchant field
   */
   public void setDomMscMerchantFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomMscMerchantFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDomMscMerchant(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DomMscMerchant");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDomMscMerchantFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDomMscMerchantFromFormattedString");
   }

  /** get the value of the field: DomMscMerchant (CLEARING_HOUSE_INFO.dom_msc_merchant)
   * @return String the value
   */
  public String getDomMscMerchant () {
    return this.DomMscMerchant;
  }
  /** Change the field to not being actively set: DomMscMerchant (CLEARING_HOUSE_INFO.dom_msc_merchant)
   */
  public void unsetDomMscMerchant () {
    this._DomMscMerchantSet = false;
  }
  /** See if the field is actively set: DomMscMerchant (CLEARING_HOUSE_INFO.dom_msc_merchant)
   * @return boolean whether the field is actively set
   */
  public boolean issetDomMscMerchant () {
    return this._DomMscMerchantSet;
  }
  /** set the fields value: DomAmexMerchant (CLEARING_HOUSE_INFO.dom_amex_merchant)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DomAmexMerchant") 
  public void setDomAmexMerchant (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "DomAmexMerchant", "setDomAmexMerchant");
    }
    this.DomAmexMerchant = value;
    this._DomAmexMerchantSet = true;
  }

  /** Retrieves the DomAmexMerchant field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DomAmexMerchant field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DomAmexMerchant field
   */
   public String getDomAmexMerchantAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomAmexMerchantAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDomAmexMerchantAsFormattedString");
       return fmtMgr.formatString(this.getDomAmexMerchant());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DomAmexMerchant");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDomAmexMerchantAsFormattedString");
       throw x;
     }
   }
  /** Sets the DomAmexMerchant field from a formatted string
   *
   * @param _value the DomAmexMerchant field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DomAmexMerchant field
   */
   public void setDomAmexMerchantFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDomAmexMerchantFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDomAmexMerchant(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DomAmexMerchant");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDomAmexMerchantFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDomAmexMerchantFromFormattedString");
   }

  /** get the value of the field: DomAmexMerchant (CLEARING_HOUSE_INFO.dom_amex_merchant)
   * @return String the value
   */
  public String getDomAmexMerchant () {
    return this.DomAmexMerchant;
  }
  /** Change the field to not being actively set: DomAmexMerchant (CLEARING_HOUSE_INFO.dom_amex_merchant)
   */
  public void unsetDomAmexMerchant () {
    this._DomAmexMerchantSet = false;
  }
  /** See if the field is actively set: DomAmexMerchant (CLEARING_HOUSE_INFO.dom_amex_merchant)
   * @return boolean whether the field is actively set
   */
  public boolean issetDomAmexMerchant () {
    return this._DomAmexMerchantSet;
  }
  public String toString() {
    return ClearingHouseInfoObjectHelper.toMap(this, null).toString();
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
  /** CLEARING_HOUSE_ID_REF.is_default field */
    if(!nonNullOnly || (IsDefault != null))  _IsDefaultSet = flag;
  /** CLEARING_HOUSE_ID_REF.is_internal field */
    if(!nonNullOnly || (IsInternal != null))  _IsInternalSet = flag;
  /** CLEARING_HOUSE_ID_REF.config_tag_id field */
    if(!nonNullOnly || (ConfigTagId != null))  _ConfigTagIdSet = flag;
  /** CLEARING_HOUSE_ID_VALUES.short_display field */
    if(!nonNullOnly || (ShortDisplay != null))  _ShortDisplaySet = flag;
  /** CLEARING_HOUSE_ID_VALUES.display_value field */
    if(!nonNullOnly || (DisplayValue != null))  _DisplayValueSet = flag;
  /** CLEARING_HOUSE_INFO.ckf_client_id field */
    if(!nonNullOnly || (CkfClientId != null))  _CkfClientIdSet = flag;
  /** CLEARING_HOUSE_INFO.ckf_var_descriptor field */
    if(!nonNullOnly || (CkfVarDescriptor != null))  _CkfVarDescriptorSet = flag;
  /** CLEARING_HOUSE_INFO.knn_merchant_acct field */
    if(!nonNullOnly || (KnnMerchantAcct != null))  _KnnMerchantAcctSet = flag;
  /** CLEARING_HOUSE_INFO.knn_merchant_id field */
    if(!nonNullOnly || (KnnMerchantId != null))  _KnnMerchantIdSet = flag;
  /** CLEARING_HOUSE_INFO.fus_pres_id field */
    if(!nonNullOnly || (FusPresId != null))  _FusPresIdSet = flag;
  /** CLEARING_HOUSE_INFO.fus_pres_pass field */
    if(!nonNullOnly || (FusPresPass != null))  _FusPresPassSet = flag;
  /** CLEARING_HOUSE_INFO.fus_sub_id field */
    if(!nonNullOnly || (FusSubId != null))  _FusSubIdSet = flag;
  /** CLEARING_HOUSE_INFO.fus_sub_pass field */
    if(!nonNullOnly || (FusSubPass != null))  _FusSubPassSet = flag;
  /** CLEARING_HOUSE_INFO.fus_avs_type field */
    if(!nonNullOnly || (FusAvsType != null))  _FusAvsTypeSet = flag;
  /** CLEARING_HOUSE_INFO.frn_unique_dates field */
    if(!nonNullOnly || (FrnUniqueDates != null))  _FrnUniqueDatesSet = flag;
  /** CLEARING_HOUSE_INFO.frn_fast_mode field */
    if(!nonNullOnly || (FrnFastMode != null))  _FrnFastModeSet = flag;
  /** CLEARING_HOUSE_INFO.frn_norm_op_id field */
    if(!nonNullOnly || (FrnNormOpId != null))  _FrnNormOpIdSet = flag;
  /** CLEARING_HOUSE_INFO.frn_norm_post_delay field */
    if(!nonNullOnly || (FrnNormPostDelay != null))  _FrnNormPostDelaySet = flag;
  /** CLEARING_HOUSE_INFO.frn_fast_op_id field */
    if(!nonNullOnly || (FrnFastOpId != null))  _FrnFastOpIdSet = flag;
  /** CLEARING_HOUSE_INFO.frn_fast_post_delay field */
    if(!nonNullOnly || (FrnFastPostDelay != null))  _FrnFastPostDelaySet = flag;
  /** CLEARING_HOUSE_INFO.frn_national_num field */
    if(!nonNullOnly || (FrnNationalNum != null))  _FrnNationalNumSet = flag;
  /** CLEARING_HOUSE_INFO.frn_company_name field */
    if(!nonNullOnly || (FrnCompanyName != null))  _FrnCompanyNameSet = flag;
  /** CLEARING_HOUSE_INFO.frn_agency_code field */
    if(!nonNullOnly || (FrnAgencyCode != null))  _FrnAgencyCodeSet = flag;
  /** CLEARING_HOUSE_INFO.frn_account_num field */
    if(!nonNullOnly || (FrnAccountNum != null))  _FrnAccountNumSet = flag;
  /** CLEARING_HOUSE_INFO.frn_bank_code field */
    if(!nonNullOnly || (FrnBankCode != null))  _FrnBankCodeSet = flag;
  /** CLEARING_HOUSE_INFO.fdm_merchant_name field */
    if(!nonNullOnly || (FdmMerchantName != null))  _FdmMerchantNameSet = flag;
  /** CLEARING_HOUSE_INFO.fdm_merchant_number field */
    if(!nonNullOnly || (FdmMerchantNumber != null))  _FdmMerchantNumberSet = flag;
  /** CLEARING_HOUSE_INFO.fdm_avs_type field */
    if(!nonNullOnly || (FdmAvsType != null))  _FdmAvsTypeSet = flag;
  /** CLEARING_HOUSE_INFO.dom_rcon_number field */
    if(!nonNullOnly || (DomRconNumber != null))  _DomRconNumberSet = flag;
  /** CLEARING_HOUSE_INFO.dom_mailbox_id field */
    if(!nonNullOnly || (DomMailboxId != null))  _DomMailboxIdSet = flag;
  /** CLEARING_HOUSE_INFO.dom_fund_orig field */
    if(!nonNullOnly || (DomFundOrig != null))  _DomFundOrigSet = flag;
  /** CLEARING_HOUSE_INFO.dom_fund_dest field */
    if(!nonNullOnly || (DomFundDest != null))  _DomFundDestSet = flag;
  /** CLEARING_HOUSE_INFO.dom_visa_orig field */
    if(!nonNullOnly || (DomVisaOrig != null))  _DomVisaOrigSet = flag;
  /** CLEARING_HOUSE_INFO.dom_visa_dest field */
    if(!nonNullOnly || (DomVisaDest != null))  _DomVisaDestSet = flag;
  /** CLEARING_HOUSE_INFO.dom_msc_orig field */
    if(!nonNullOnly || (DomMscOrig != null))  _DomMscOrigSet = flag;
  /** CLEARING_HOUSE_INFO.dom_msc_dest field */
    if(!nonNullOnly || (DomMscDest != null))  _DomMscDestSet = flag;
  /** CLEARING_HOUSE_INFO.dom_amex_process_id field */
    if(!nonNullOnly || (DomAmexProcessId != null))  _DomAmexProcessIdSet = flag;
  /** CLEARING_HOUSE_INFO.dom_amex_receiver_id field */
    if(!nonNullOnly || (DomAmexReceiverId != null))  _DomAmexReceiverIdSet = flag;
  /** CLEARING_HOUSE_INFO.dom_amex_format_code field */
    if(!nonNullOnly || (DomAmexFormatCode != null))  _DomAmexFormatCodeSet = flag;
  /** CLEARING_HOUSE_INFO.dom_phone_dest field */
    if(!nonNullOnly || (DomPhoneDest != null))  _DomPhoneDestSet = flag;
  /** CLEARING_HOUSE_INFO.dom_currency_ind field */
    if(!nonNullOnly || (DomCurrencyInd != null))  _DomCurrencyIndSet = flag;
  /** CLEARING_HOUSE_INFO.dom_fund_inst_id field */
    if(!nonNullOnly || (DomFundInstId != null))  _DomFundInstIdSet = flag;
  /** CLEARING_HOUSE_INFO.dom_fund_acct_num field */
    if(!nonNullOnly || (DomFundAcctNum != null))  _DomFundAcctNumSet = flag;
  /** CLEARING_HOUSE_INFO.dom_batch_limit field */
    if(!nonNullOnly || (DomBatchLimit != null))  _DomBatchLimitSet = flag;
  /** CLEARING_HOUSE_INFO.dom_visa_merchant field */
    if(!nonNullOnly || (DomVisaMerchant != null))  _DomVisaMerchantSet = flag;
  /** CLEARING_HOUSE_INFO.dom_msc_merchant field */
    if(!nonNullOnly || (DomMscMerchant != null))  _DomMscMerchantSet = flag;
  /** CLEARING_HOUSE_INFO.dom_amex_merchant field */
    if(!nonNullOnly || (DomAmexMerchant != null))  _DomAmexMerchantSet = flag;
  }
}
