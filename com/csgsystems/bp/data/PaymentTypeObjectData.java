/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PaymentTypeObjectData.java
 * Definition File: Admin/PaymentType.xml
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
  
/** PaymentTypeObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class PaymentTypeObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public PaymentTypeObjectKeyData Key = null;
  /** BMF_TRANS_DESCR.bmf_trans_category field */
  public    Integer BmfTransCategory  = null;
  protected boolean _BmfTransCategorySet = false;
  /** BMF_TRANS_DESCR.trans_sign field */
  public    Integer TransSign  = null;
  protected boolean _TransSignSet = false;
  /** BMF_TRANS_DESCR.billing_category field */
  public    Integer BillingCategory  = null;
  protected boolean _BillingCategorySet = false;
  /** BMF_TRANS_DESCR.allow_manual_entry field */
  public    Boolean AllowManualEntry  = null;
  protected boolean _AllowManualEntrySet = false;
  /** BMF_TRANS_DESCR.allow_suspense_acnt field */
  public    Boolean AllowSuspenseAcnt  = null;
  protected boolean _AllowSuspenseAcntSet = false;
  /** BMF_TRANS_DESCR.is_displayed_onbill field */
  public    Boolean IsDisplayedOnbill  = null;
  protected boolean _IsDisplayedOnbillSet = false;
  /** BMF_TRANS_DESCR.is_journalable field */
  public    Boolean IsJournalable  = null;
  protected boolean _IsJournalableSet = false;
  /** BMF_TRANS_DESCR.allow_autotransfer field */
  public    Boolean AllowAutotransfer  = null;
  protected boolean _AllowAutotransferSet = false;
  /** BMF_TRANS_DESCR.config_tag_id field */
  public    String ConfigTagId  = null;
  protected boolean _ConfigTagIdSet = false;
  /** DESCRIPTIONS.description_code field */
  public    Integer DescriptionCode  = null;
  protected boolean _DescriptionCodeSet = false;
  /** DESCRIPTIONS.description_group field */
  public    Integer DescriptionGroup  = null;
  protected boolean _DescriptionGroupSet = false;
  /** DESCRIPTIONS.description_text field */
  public    String DescriptionText  = null;
  protected boolean _DescriptionTextSet = false;
  /** DESCRIPTIONS.short_description_text field */
  public    String ShortDescriptionText  = null;
  protected boolean _ShortDescriptionTextSet = false;
  private String _objName = "PaymentTypeObjectData";
  /** Default constructor */
  public PaymentTypeObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public PaymentTypeObjectData (PaymentTypeObjectData other)
  {

    if (other == null) return;
    this.Key = new PaymentTypeObjectKeyData (other.Key);
    this.BmfTransCategory = other.BmfTransCategory;
    this._BmfTransCategorySet = other._BmfTransCategorySet;
    this.TransSign = other.TransSign;
    this._TransSignSet = other._TransSignSet;
    this.BillingCategory = other.BillingCategory;
    this._BillingCategorySet = other._BillingCategorySet;
    this.AllowManualEntry = other.AllowManualEntry;
    this._AllowManualEntrySet = other._AllowManualEntrySet;
    this.AllowSuspenseAcnt = other.AllowSuspenseAcnt;
    this._AllowSuspenseAcntSet = other._AllowSuspenseAcntSet;
    this.IsDisplayedOnbill = other.IsDisplayedOnbill;
    this._IsDisplayedOnbillSet = other._IsDisplayedOnbillSet;
    this.IsJournalable = other.IsJournalable;
    this._IsJournalableSet = other._IsJournalableSet;
    this.AllowAutotransfer = other.AllowAutotransfer;
    this._AllowAutotransferSet = other._AllowAutotransferSet;
    this.ConfigTagId = other.ConfigTagId;
    this._ConfigTagIdSet = other._ConfigTagIdSet;
    this.DescriptionCode = other.DescriptionCode;
    this._DescriptionCodeSet = other._DescriptionCodeSet;
    this.DescriptionGroup = other.DescriptionGroup;
    this._DescriptionGroupSet = other._DescriptionGroupSet;
    this.DescriptionText = other.DescriptionText;
    this._DescriptionTextSet = other._DescriptionTextSet;
    this.ShortDescriptionText = other.ShortDescriptionText;
    this._ShortDescriptionTextSet = other._ShortDescriptionTextSet;
  }

  /** get the Key for this object
   * @return PaymentTypeObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public PaymentTypeObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (PaymentTypeObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: BmfTransType (BMF_TRANS_DESCR.bmf_trans_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setBmfTransType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BmfTransType", "setBmfTransType");
    }
    if (this.Key == null) this.Key = new PaymentTypeObjectKeyData ();
    this.Key.BmfTransType = value;
    this.Key._BmfTransTypeSet = true;
  }
  /** get the value of the field: BmfTransType (BMF_TRANS_DESCR.bmf_trans_type)
   * @return Integer the value
   */
  public Integer getBmfTransType () {
    if (this.Key == null) return null;
    return this.Key.BmfTransType;
  }
  /** Change the field to not being actively set: BmfTransType (BMF_TRANS_DESCR.bmf_trans_type)
   */
  public void unsetBmfTransType () {
    if (this.Key == null) return;
    this.Key._BmfTransTypeSet = false;
  }
  /** See if the field is actively set: BmfTransType (BMF_TRANS_DESCR.bmf_trans_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetBmfTransType () {
    if (this.Key == null) return false;
    return this.Key._BmfTransTypeSet;
  }

  /** Retrieves the BmfTransType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BmfTransType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BmfTransType field
   */
   public String getBmfTransTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTransTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBmfTransTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getBmfTransType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BmfTransType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBmfTransTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the BmfTransType field from a formatted string
   *
   * @param _value the BmfTransType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BmfTransType field
   */
   public void setBmfTransTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTransTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBmfTransType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BmfTransType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBmfTransTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBmfTransTypeFromFormattedString");
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
    if (this.Key == null) this.Key = new PaymentTypeObjectKeyData ();
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

  /**
   * Retrieves the display value for the enumerated LanguageCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the LanguageCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the LanguageCode field
   */
  public String getLanguageCodeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLanguageCodeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getLanguageCodeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLanguageCodeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getLanguageCode()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LanguageCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getLanguageCodeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated LanguageCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the LanguageCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the LanguageCode field
   */
  public Enumeration getLanguageCodeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLanguageCodeEnumeration");
    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("LanguageCode", _locale, null, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLanguageCodeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LanguageCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getLanguageCodeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated LanguageCode field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setLanguageCodeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setLanguageCodeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getLanguageCodeEnumeration(_locale);
      this.setLanguageCode((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LanguageCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setLanguageCodeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setLanguageCodeFromDisplayValue");
  }

  /** set the fields value: BmfTransCategory (BMF_TRANS_DESCR.bmf_trans_category)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BmfTransCategory") 
  public void setBmfTransCategory (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BmfTransCategory", "setBmfTransCategory");
    }
    this.BmfTransCategory = value;
    this._BmfTransCategorySet = true;
  }

  /** Retrieves the BmfTransCategory field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BmfTransCategory field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BmfTransCategory field
   */
   public String getBmfTransCategoryAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTransCategoryAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBmfTransCategoryAsFormattedString");
       return fmtMgr.formatNumber(this.getBmfTransCategory(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BmfTransCategory");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBmfTransCategoryAsFormattedString");
       throw x;
     }
   }
  /** Sets the BmfTransCategory field from a formatted string
   *
   * @param _value the BmfTransCategory field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BmfTransCategory field
   */
   public void setBmfTransCategoryFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTransCategoryFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBmfTransCategory(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BmfTransCategory");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBmfTransCategoryFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBmfTransCategoryFromFormattedString");
   }

  /** get the value of the field: BmfTransCategory (BMF_TRANS_DESCR.bmf_trans_category)
   * @return Integer the value
   */
  public Integer getBmfTransCategory () {
    return this.BmfTransCategory;
  }
  /** Change the field to not being actively set: BmfTransCategory (BMF_TRANS_DESCR.bmf_trans_category)
   */
  public void unsetBmfTransCategory () {
    this._BmfTransCategorySet = false;
  }
  /** See if the field is actively set: BmfTransCategory (BMF_TRANS_DESCR.bmf_trans_category)
   * @return boolean whether the field is actively set
   */
  public boolean issetBmfTransCategory () {
    return this._BmfTransCategorySet;
  }
  /** set the fields value: TransSign (BMF_TRANS_DESCR.trans_sign)
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

  /** get the value of the field: TransSign (BMF_TRANS_DESCR.trans_sign)
   * @return Integer the value
   */
  public Integer getTransSign () {
    return this.TransSign;
  }
  /** Change the field to not being actively set: TransSign (BMF_TRANS_DESCR.trans_sign)
   */
  public void unsetTransSign () {
    this._TransSignSet = false;
  }
  /** See if the field is actively set: TransSign (BMF_TRANS_DESCR.trans_sign)
   * @return boolean whether the field is actively set
   */
  public boolean issetTransSign () {
    return this._TransSignSet;
  }
  /** set the fields value: BillingCategory (BMF_TRANS_DESCR.billing_category)
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

  /** get the value of the field: BillingCategory (BMF_TRANS_DESCR.billing_category)
   * @return Integer the value
   */
  public Integer getBillingCategory () {
    return this.BillingCategory;
  }
  /** Change the field to not being actively set: BillingCategory (BMF_TRANS_DESCR.billing_category)
   */
  public void unsetBillingCategory () {
    this._BillingCategorySet = false;
  }
  /** See if the field is actively set: BillingCategory (BMF_TRANS_DESCR.billing_category)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillingCategory () {
    return this._BillingCategorySet;
  }
  /** set the fields value: AllowManualEntry (BMF_TRANS_DESCR.allow_manual_entry)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AllowManualEntry") 
  public void setAllowManualEntry (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AllowManualEntry", "setAllowManualEntry");
    }
    this.AllowManualEntry = value;
    this._AllowManualEntrySet = true;
  }

  /** Retrieves the AllowManualEntry field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AllowManualEntry field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AllowManualEntry field
   */
   public String getAllowManualEntryAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAllowManualEntryAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAllowManualEntryAsFormattedString");
       return fmtMgr.formatBoolean(this.getAllowManualEntry());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AllowManualEntry");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAllowManualEntryAsFormattedString");
       throw x;
     }
   }
  /** Sets the AllowManualEntry field from a formatted string
   *
   * @param _value the AllowManualEntry field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AllowManualEntry field
   */
   public void setAllowManualEntryFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAllowManualEntryFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAllowManualEntry(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AllowManualEntry");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAllowManualEntryFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAllowManualEntryFromFormattedString");
   }

  /** get the value of the field: AllowManualEntry (BMF_TRANS_DESCR.allow_manual_entry)
   * @return Boolean the value
   */
  public Boolean getAllowManualEntry () {
    return this.AllowManualEntry;
  }
  /** Change the field to not being actively set: AllowManualEntry (BMF_TRANS_DESCR.allow_manual_entry)
   */
  public void unsetAllowManualEntry () {
    this._AllowManualEntrySet = false;
  }
  /** See if the field is actively set: AllowManualEntry (BMF_TRANS_DESCR.allow_manual_entry)
   * @return boolean whether the field is actively set
   */
  public boolean issetAllowManualEntry () {
    return this._AllowManualEntrySet;
  }
  /** set the fields value: AllowSuspenseAcnt (BMF_TRANS_DESCR.allow_suspense_acnt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AllowSuspenseAcnt") 
  public void setAllowSuspenseAcnt (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AllowSuspenseAcnt", "setAllowSuspenseAcnt");
    }
    this.AllowSuspenseAcnt = value;
    this._AllowSuspenseAcntSet = true;
  }

  /** Retrieves the AllowSuspenseAcnt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AllowSuspenseAcnt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AllowSuspenseAcnt field
   */
   public String getAllowSuspenseAcntAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAllowSuspenseAcntAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAllowSuspenseAcntAsFormattedString");
       return fmtMgr.formatBoolean(this.getAllowSuspenseAcnt());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AllowSuspenseAcnt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAllowSuspenseAcntAsFormattedString");
       throw x;
     }
   }
  /** Sets the AllowSuspenseAcnt field from a formatted string
   *
   * @param _value the AllowSuspenseAcnt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AllowSuspenseAcnt field
   */
   public void setAllowSuspenseAcntFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAllowSuspenseAcntFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAllowSuspenseAcnt(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AllowSuspenseAcnt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAllowSuspenseAcntFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAllowSuspenseAcntFromFormattedString");
   }

  /** get the value of the field: AllowSuspenseAcnt (BMF_TRANS_DESCR.allow_suspense_acnt)
   * @return Boolean the value
   */
  public Boolean getAllowSuspenseAcnt () {
    return this.AllowSuspenseAcnt;
  }
  /** Change the field to not being actively set: AllowSuspenseAcnt (BMF_TRANS_DESCR.allow_suspense_acnt)
   */
  public void unsetAllowSuspenseAcnt () {
    this._AllowSuspenseAcntSet = false;
  }
  /** See if the field is actively set: AllowSuspenseAcnt (BMF_TRANS_DESCR.allow_suspense_acnt)
   * @return boolean whether the field is actively set
   */
  public boolean issetAllowSuspenseAcnt () {
    return this._AllowSuspenseAcntSet;
  }
  /** set the fields value: IsDisplayedOnbill (BMF_TRANS_DESCR.is_displayed_onbill)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsDisplayedOnbill") 
  public void setIsDisplayedOnbill (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsDisplayedOnbill", "setIsDisplayedOnbill");
    }
    this.IsDisplayedOnbill = value;
    this._IsDisplayedOnbillSet = true;
  }

  /** Retrieves the IsDisplayedOnbill field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsDisplayedOnbill field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsDisplayedOnbill field
   */
   public String getIsDisplayedOnbillAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsDisplayedOnbillAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsDisplayedOnbillAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsDisplayedOnbill());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsDisplayedOnbill");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsDisplayedOnbillAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsDisplayedOnbill field from a formatted string
   *
   * @param _value the IsDisplayedOnbill field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsDisplayedOnbill field
   */
   public void setIsDisplayedOnbillFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsDisplayedOnbillFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsDisplayedOnbill(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsDisplayedOnbill");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsDisplayedOnbillFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsDisplayedOnbillFromFormattedString");
   }

  /** get the value of the field: IsDisplayedOnbill (BMF_TRANS_DESCR.is_displayed_onbill)
   * @return Boolean the value
   */
  public Boolean getIsDisplayedOnbill () {
    return this.IsDisplayedOnbill;
  }
  /** Change the field to not being actively set: IsDisplayedOnbill (BMF_TRANS_DESCR.is_displayed_onbill)
   */
  public void unsetIsDisplayedOnbill () {
    this._IsDisplayedOnbillSet = false;
  }
  /** See if the field is actively set: IsDisplayedOnbill (BMF_TRANS_DESCR.is_displayed_onbill)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsDisplayedOnbill () {
    return this._IsDisplayedOnbillSet;
  }
  /** set the fields value: IsJournalable (BMF_TRANS_DESCR.is_journalable)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsJournalable") 
  public void setIsJournalable (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsJournalable", "setIsJournalable");
    }
    this.IsJournalable = value;
    this._IsJournalableSet = true;
  }

  /** Retrieves the IsJournalable field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsJournalable field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsJournalable field
   */
   public String getIsJournalableAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsJournalableAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsJournalableAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsJournalable());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsJournalable");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsJournalableAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsJournalable field from a formatted string
   *
   * @param _value the IsJournalable field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsJournalable field
   */
   public void setIsJournalableFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsJournalableFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsJournalable(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsJournalable");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsJournalableFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsJournalableFromFormattedString");
   }

  /** get the value of the field: IsJournalable (BMF_TRANS_DESCR.is_journalable)
   * @return Boolean the value
   */
  public Boolean getIsJournalable () {
    return this.IsJournalable;
  }
  /** Change the field to not being actively set: IsJournalable (BMF_TRANS_DESCR.is_journalable)
   */
  public void unsetIsJournalable () {
    this._IsJournalableSet = false;
  }
  /** See if the field is actively set: IsJournalable (BMF_TRANS_DESCR.is_journalable)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsJournalable () {
    return this._IsJournalableSet;
  }
  /** set the fields value: AllowAutotransfer (BMF_TRANS_DESCR.allow_autotransfer)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AllowAutotransfer") 
  public void setAllowAutotransfer (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AllowAutotransfer", "setAllowAutotransfer");
    }
    this.AllowAutotransfer = value;
    this._AllowAutotransferSet = true;
  }

  /** Retrieves the AllowAutotransfer field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AllowAutotransfer field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AllowAutotransfer field
   */
   public String getAllowAutotransferAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAllowAutotransferAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAllowAutotransferAsFormattedString");
       return fmtMgr.formatBoolean(this.getAllowAutotransfer());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AllowAutotransfer");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAllowAutotransferAsFormattedString");
       throw x;
     }
   }
  /** Sets the AllowAutotransfer field from a formatted string
   *
   * @param _value the AllowAutotransfer field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AllowAutotransfer field
   */
   public void setAllowAutotransferFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAllowAutotransferFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAllowAutotransfer(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AllowAutotransfer");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAllowAutotransferFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAllowAutotransferFromFormattedString");
   }

  /** get the value of the field: AllowAutotransfer (BMF_TRANS_DESCR.allow_autotransfer)
   * @return Boolean the value
   */
  public Boolean getAllowAutotransfer () {
    return this.AllowAutotransfer;
  }
  /** Change the field to not being actively set: AllowAutotransfer (BMF_TRANS_DESCR.allow_autotransfer)
   */
  public void unsetAllowAutotransfer () {
    this._AllowAutotransferSet = false;
  }
  /** See if the field is actively set: AllowAutotransfer (BMF_TRANS_DESCR.allow_autotransfer)
   * @return boolean whether the field is actively set
   */
  public boolean issetAllowAutotransfer () {
    return this._AllowAutotransferSet;
  }
  /** set the fields value: ConfigTagId (BMF_TRANS_DESCR.config_tag_id)
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

  /** get the value of the field: ConfigTagId (BMF_TRANS_DESCR.config_tag_id)
   * @return String the value
   */
  public String getConfigTagId () {
    return this.ConfigTagId;
  }
  /** Change the field to not being actively set: ConfigTagId (BMF_TRANS_DESCR.config_tag_id)
   */
  public void unsetConfigTagId () {
    this._ConfigTagIdSet = false;
  }
  /** See if the field is actively set: ConfigTagId (BMF_TRANS_DESCR.config_tag_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetConfigTagId () {
    return this._ConfigTagIdSet;
  }
  /** set the fields value: DescriptionCode (DESCRIPTIONS.description_code)
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

  /** get the value of the field: DescriptionCode (DESCRIPTIONS.description_code)
   * @return Integer the value
   */
  public Integer getDescriptionCode () {
    return this.DescriptionCode;
  }
  /** Change the field to not being actively set: DescriptionCode (DESCRIPTIONS.description_code)
   */
  public void unsetDescriptionCode () {
    this._DescriptionCodeSet = false;
  }
  /** See if the field is actively set: DescriptionCode (DESCRIPTIONS.description_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetDescriptionCode () {
    return this._DescriptionCodeSet;
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
    return PaymentTypeObjectHelper.toMap(this, null).toString();
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
  /** BMF_TRANS_DESCR.bmf_trans_category field */
    if(!nonNullOnly || (BmfTransCategory != null))  _BmfTransCategorySet = flag;
  /** BMF_TRANS_DESCR.trans_sign field */
    if(!nonNullOnly || (TransSign != null))  _TransSignSet = flag;
  /** BMF_TRANS_DESCR.billing_category field */
    if(!nonNullOnly || (BillingCategory != null))  _BillingCategorySet = flag;
  /** BMF_TRANS_DESCR.allow_manual_entry field */
    if(!nonNullOnly || (AllowManualEntry != null))  _AllowManualEntrySet = flag;
  /** BMF_TRANS_DESCR.allow_suspense_acnt field */
    if(!nonNullOnly || (AllowSuspenseAcnt != null))  _AllowSuspenseAcntSet = flag;
  /** BMF_TRANS_DESCR.is_displayed_onbill field */
    if(!nonNullOnly || (IsDisplayedOnbill != null))  _IsDisplayedOnbillSet = flag;
  /** BMF_TRANS_DESCR.is_journalable field */
    if(!nonNullOnly || (IsJournalable != null))  _IsJournalableSet = flag;
  /** BMF_TRANS_DESCR.allow_autotransfer field */
    if(!nonNullOnly || (AllowAutotransfer != null))  _AllowAutotransferSet = flag;
  /** BMF_TRANS_DESCR.config_tag_id field */
    if(!nonNullOnly || (ConfigTagId != null))  _ConfigTagIdSet = flag;
  /** DESCRIPTIONS.description_code field */
    if(!nonNullOnly || (DescriptionCode != null))  _DescriptionCodeSet = flag;
  /** DESCRIPTIONS.description_group field */
    if(!nonNullOnly || (DescriptionGroup != null))  _DescriptionGroupSet = flag;
  /** DESCRIPTIONS.description_text field */
    if(!nonNullOnly || (DescriptionText != null))  _DescriptionTextSet = flag;
  /** DESCRIPTIONS.short_description_text field */
    if(!nonNullOnly || (ShortDescriptionText != null))  _ShortDescriptionTextSet = flag;
  }
}
