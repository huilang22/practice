/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AdjustmentTypeObjectData.java
 * Definition File: Admin/AdjustmentType.xml
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
import com.csgsystems.bp.data.*;
import com.csgsystems.bp.data.*;
import com.csgsystems.bp.data.*;
import com.csgsystems.bp.data.*;

import com.csgsystems.api.base.BaseObjectData;
  
/** AdjustmentTypeObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class AdjustmentTypeObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public AdjustmentTypeObjectKeyData Key = null;
  /** ADJ_TRANS_DESCR.trans_target_type field */
  public    Integer TransTargetType  = null;
  protected boolean _TransTargetTypeSet = false;
  /** ADJ_TRANS_DESCR.trans_target_id field */
  public    Integer TransTargetId  = null;
  protected boolean _TransTargetIdSet = false;
  /** ADJ_TRANS_DESCR.adj_trans_category field */
  public    Integer TransCategory  = null;
  protected boolean _TransCategorySet = false;
  /** ADJ_TRANS_DESCR.trans_sign field */
  public    Integer TransSign  = null;
  protected boolean _TransSignSet = false;
  /** ADJ_TRANS_DESCR.billing_category field */
  public    Integer BillingCategory  = null;
  protected boolean _BillingCategorySet = false;
  /** ADJ_TRANS_DESCR.billing_level field */
  public    Integer BillingLevel  = null;
  protected boolean _BillingLevelSet = false;
  /** ADJ_TRANS_DESCR.tax_class field */
  public    Integer TaxClass  = null;
  protected boolean _TaxClassSet = false;
  /** ADJ_TRANS_DESCR.is_viewable field */
  public    Boolean IsViewable  = null;
  protected boolean _IsViewableSet = false;
  /** ADJ_TRANS_DESCR.is_modifiable field */
  public    Boolean IsModifiable  = null;
  protected boolean _IsModifiableSet = false;
  /** ADJ_TRANS_DESCR.is_adjustable field */
  public    Boolean IsAdjustable  = null;
  protected boolean _IsAdjustableSet = false;
  /** ADJ_TRANS_DESCR.is_journalable field */
  public    Boolean IsJournalable  = null;
  protected boolean _IsJournalableSet = false;
  /** ADJ_TRANS_DESCR.is_displayed_onbill field */
  public    Boolean IsDisplayedOnbill  = null;
  protected boolean _IsDisplayedOnbillSet = false;
  /** ADJ_TRANS_DESCR.is_disconnect_credit field */
  public    Boolean IsDisconnectCredit  = null;
  protected boolean _IsDisconnectCreditSet = false;
  /** ADJ_TRANS_DESCR.is_refinance field */
  public    Boolean IsRefinance  = null;
  protected boolean _IsRefinanceSet = false;
  /** ADJ_TRANS_DESCR.annotation_type field */
  public    Integer AnnotationType  = null;
  protected boolean _AnnotationTypeSet = false;
  /** ADJ_TRANS_DESCR.tax_on_invoice field */
  public    Boolean TaxOnInvoice  = null;
  protected boolean _TaxOnInvoiceSet = false;
  /** ADJ_TRANS_DESCR.is_late_fee_exempt field */
  public    Boolean IsLateFeeExempt  = null;
  protected boolean _IsLateFeeExemptSet = false;
  /** ADJ_TRANS_DESCR.allow_interim_bill field */
  public    Boolean AllowInterimBill  = null;
  protected boolean _AllowInterimBillSet = false;
  /** ADJ_TRANS_DESCR.is_negative_bill_adj field */
  public    Boolean IsNegativeBillAdj  = null;
  protected boolean _IsNegativeBillAdjSet = false;
  /** ADJ_TRANS_DESCR.config_tag_id field */
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
  private String _objName = "AdjustmentTypeObjectData";
  /** Default constructor */
  public AdjustmentTypeObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public AdjustmentTypeObjectData (AdjustmentTypeObjectData other)
  {

    if (other == null) return;
    this.Key = new AdjustmentTypeObjectKeyData (other.Key);
    this.TransTargetType = other.TransTargetType;
    this._TransTargetTypeSet = other._TransTargetTypeSet;
    this.TransTargetId = other.TransTargetId;
    this._TransTargetIdSet = other._TransTargetIdSet;
    this.TransCategory = other.TransCategory;
    this._TransCategorySet = other._TransCategorySet;
    this.TransSign = other.TransSign;
    this._TransSignSet = other._TransSignSet;
    this.BillingCategory = other.BillingCategory;
    this._BillingCategorySet = other._BillingCategorySet;
    this.BillingLevel = other.BillingLevel;
    this._BillingLevelSet = other._BillingLevelSet;
    this.TaxClass = other.TaxClass;
    this._TaxClassSet = other._TaxClassSet;
    this.IsViewable = other.IsViewable;
    this._IsViewableSet = other._IsViewableSet;
    this.IsModifiable = other.IsModifiable;
    this._IsModifiableSet = other._IsModifiableSet;
    this.IsAdjustable = other.IsAdjustable;
    this._IsAdjustableSet = other._IsAdjustableSet;
    this.IsJournalable = other.IsJournalable;
    this._IsJournalableSet = other._IsJournalableSet;
    this.IsDisplayedOnbill = other.IsDisplayedOnbill;
    this._IsDisplayedOnbillSet = other._IsDisplayedOnbillSet;
    this.IsDisconnectCredit = other.IsDisconnectCredit;
    this._IsDisconnectCreditSet = other._IsDisconnectCreditSet;
    this.IsRefinance = other.IsRefinance;
    this._IsRefinanceSet = other._IsRefinanceSet;
    this.AnnotationType = other.AnnotationType;
    this._AnnotationTypeSet = other._AnnotationTypeSet;
    this.TaxOnInvoice = other.TaxOnInvoice;
    this._TaxOnInvoiceSet = other._TaxOnInvoiceSet;
    this.IsLateFeeExempt = other.IsLateFeeExempt;
    this._IsLateFeeExemptSet = other._IsLateFeeExemptSet;
    this.AllowInterimBill = other.AllowInterimBill;
    this._AllowInterimBillSet = other._AllowInterimBillSet;
    this.IsNegativeBillAdj = other.IsNegativeBillAdj;
    this._IsNegativeBillAdjSet = other._IsNegativeBillAdjSet;
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
   * @return AdjustmentTypeObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public AdjustmentTypeObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (AdjustmentTypeObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: TransCode (ADJ_TRANS_DESCR.adj_trans_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTransCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TransCode", "setTransCode");
    }
    if (this.Key == null) this.Key = new AdjustmentTypeObjectKeyData ();
    this.Key.TransCode = value;
    this.Key._TransCodeSet = true;
  }
  /** get the value of the field: TransCode (ADJ_TRANS_DESCR.adj_trans_code)
   * @return Integer the value
   */
  public Integer getTransCode () {
    if (this.Key == null) return null;
    return this.Key.TransCode;
  }
  /** Change the field to not being actively set: TransCode (ADJ_TRANS_DESCR.adj_trans_code)
   */
  public void unsetTransCode () {
    if (this.Key == null) return;
    this.Key._TransCodeSet = false;
  }
  /** See if the field is actively set: TransCode (ADJ_TRANS_DESCR.adj_trans_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetTransCode () {
    if (this.Key == null) return false;
    return this.Key._TransCodeSet;
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
    if (this.Key == null) this.Key = new AdjustmentTypeObjectKeyData ();
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
  /** set the fields value: TransTargetId (ADJ_TRANS_DESCR.trans_target_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TransTargetId") 
  public void setTransTargetId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TransTargetId", "setTransTargetId");
    }
    this.TransTargetId = value;
    this._TransTargetIdSet = true;
  }

  /** Retrieves the TransTargetId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TransTargetId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransTargetId field
   */
   public String getTransTargetIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransTargetIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransTargetIdAsFormattedString");
       return fmtMgr.formatNumber(this.getTransTargetId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransTargetId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransTargetIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the TransTargetId field from a formatted string
   *
   * @param _value the TransTargetId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TransTargetId field
   */
   public void setTransTargetIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransTargetIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTransTargetId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransTargetId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransTargetIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransTargetIdFromFormattedString");
   }

  /** get the value of the field: TransTargetId (ADJ_TRANS_DESCR.trans_target_id)
   * @return Integer the value
   */
  public Integer getTransTargetId () {
    return this.TransTargetId;
  }
  /** Change the field to not being actively set: TransTargetId (ADJ_TRANS_DESCR.trans_target_id)
   */
  public void unsetTransTargetId () {
    this._TransTargetIdSet = false;
  }
  /** See if the field is actively set: TransTargetId (ADJ_TRANS_DESCR.trans_target_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetTransTargetId () {
    return this._TransTargetIdSet;
  }
  /** set the fields value: TransCategory (ADJ_TRANS_DESCR.adj_trans_category)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TransCategory") 
  public void setTransCategory (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TransCategory", "setTransCategory");
    }
    this.TransCategory = value;
    this._TransCategorySet = true;
  }

  /** Retrieves the TransCategory field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TransCategory field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransCategory field
   */
   public String getTransCategoryAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransCategoryAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransCategoryAsFormattedString");
       return fmtMgr.formatNumber(this.getTransCategory(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransCategory");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransCategoryAsFormattedString");
       throw x;
     }
   }
  /** Sets the TransCategory field from a formatted string
   *
   * @param _value the TransCategory field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TransCategory field
   */
   public void setTransCategoryFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransCategoryFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTransCategory(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransCategory");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransCategoryFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransCategoryFromFormattedString");
   }

  /** get the value of the field: TransCategory (ADJ_TRANS_DESCR.adj_trans_category)
   * @return Integer the value
   */
  public Integer getTransCategory () {
    return this.TransCategory;
  }
  /** Change the field to not being actively set: TransCategory (ADJ_TRANS_DESCR.adj_trans_category)
   */
  public void unsetTransCategory () {
    this._TransCategorySet = false;
  }
  /** See if the field is actively set: TransCategory (ADJ_TRANS_DESCR.adj_trans_category)
   * @return boolean whether the field is actively set
   */
  public boolean issetTransCategory () {
    return this._TransCategorySet;
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
  /** set the fields value: BillingLevel (ADJ_TRANS_DESCR.billing_level)
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

  /** get the value of the field: BillingLevel (ADJ_TRANS_DESCR.billing_level)
   * @return Integer the value
   */
  public Integer getBillingLevel () {
    return this.BillingLevel;
  }
  /** Change the field to not being actively set: BillingLevel (ADJ_TRANS_DESCR.billing_level)
   */
  public void unsetBillingLevel () {
    this._BillingLevelSet = false;
  }
  /** See if the field is actively set: BillingLevel (ADJ_TRANS_DESCR.billing_level)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillingLevel () {
    return this._BillingLevelSet;
  }
  /** set the fields value: TaxClass (ADJ_TRANS_DESCR.tax_class)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TaxClass") 
  public void setTaxClass (Integer value) throws ServiceException
  {
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

  /** get the value of the field: TaxClass (ADJ_TRANS_DESCR.tax_class)
   * @return Integer the value
   */
  public Integer getTaxClass () {
    return this.TaxClass;
  }
  /** Change the field to not being actively set: TaxClass (ADJ_TRANS_DESCR.tax_class)
   */
  public void unsetTaxClass () {
    this._TaxClassSet = false;
  }
  /** See if the field is actively set: TaxClass (ADJ_TRANS_DESCR.tax_class)
   * @return boolean whether the field is actively set
   */
  public boolean issetTaxClass () {
    return this._TaxClassSet;
  }
  /** set the fields value: IsViewable (ADJ_TRANS_DESCR.is_viewable)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsViewable") 
  public void setIsViewable (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsViewable", "setIsViewable");
    }
    this.IsViewable = value;
    this._IsViewableSet = true;
  }

  /** Retrieves the IsViewable field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsViewable field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsViewable field
   */
   public String getIsViewableAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsViewableAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsViewableAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsViewable());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsViewable");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsViewableAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsViewable field from a formatted string
   *
   * @param _value the IsViewable field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsViewable field
   */
   public void setIsViewableFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsViewableFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsViewable(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsViewable");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsViewableFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsViewableFromFormattedString");
   }

  /** get the value of the field: IsViewable (ADJ_TRANS_DESCR.is_viewable)
   * @return Boolean the value
   */
  public Boolean getIsViewable () {
    return this.IsViewable;
  }
  /** Change the field to not being actively set: IsViewable (ADJ_TRANS_DESCR.is_viewable)
   */
  public void unsetIsViewable () {
    this._IsViewableSet = false;
  }
  /** See if the field is actively set: IsViewable (ADJ_TRANS_DESCR.is_viewable)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsViewable () {
    return this._IsViewableSet;
  }
  /** set the fields value: IsModifiable (ADJ_TRANS_DESCR.is_modifiable)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsModifiable") 
  public void setIsModifiable (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsModifiable", "setIsModifiable");
    }
    this.IsModifiable = value;
    this._IsModifiableSet = true;
  }

  /** Retrieves the IsModifiable field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsModifiable field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsModifiable field
   */
   public String getIsModifiableAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsModifiableAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsModifiableAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsModifiable());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsModifiable");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsModifiableAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsModifiable field from a formatted string
   *
   * @param _value the IsModifiable field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsModifiable field
   */
   public void setIsModifiableFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsModifiableFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsModifiable(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsModifiable");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsModifiableFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsModifiableFromFormattedString");
   }

  /** get the value of the field: IsModifiable (ADJ_TRANS_DESCR.is_modifiable)
   * @return Boolean the value
   */
  public Boolean getIsModifiable () {
    return this.IsModifiable;
  }
  /** Change the field to not being actively set: IsModifiable (ADJ_TRANS_DESCR.is_modifiable)
   */
  public void unsetIsModifiable () {
    this._IsModifiableSet = false;
  }
  /** See if the field is actively set: IsModifiable (ADJ_TRANS_DESCR.is_modifiable)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsModifiable () {
    return this._IsModifiableSet;
  }
  /** set the fields value: IsAdjustable (ADJ_TRANS_DESCR.is_adjustable)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsAdjustable") 
  public void setIsAdjustable (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsAdjustable", "setIsAdjustable");
    }
    this.IsAdjustable = value;
    this._IsAdjustableSet = true;
  }

  /** Retrieves the IsAdjustable field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsAdjustable field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsAdjustable field
   */
   public String getIsAdjustableAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsAdjustableAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsAdjustableAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsAdjustable());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsAdjustable");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsAdjustableAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsAdjustable field from a formatted string
   *
   * @param _value the IsAdjustable field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsAdjustable field
   */
   public void setIsAdjustableFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsAdjustableFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsAdjustable(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsAdjustable");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsAdjustableFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsAdjustableFromFormattedString");
   }

  /** get the value of the field: IsAdjustable (ADJ_TRANS_DESCR.is_adjustable)
   * @return Boolean the value
   */
  public Boolean getIsAdjustable () {
    return this.IsAdjustable;
  }
  /** Change the field to not being actively set: IsAdjustable (ADJ_TRANS_DESCR.is_adjustable)
   */
  public void unsetIsAdjustable () {
    this._IsAdjustableSet = false;
  }
  /** See if the field is actively set: IsAdjustable (ADJ_TRANS_DESCR.is_adjustable)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsAdjustable () {
    return this._IsAdjustableSet;
  }
  /** set the fields value: IsJournalable (ADJ_TRANS_DESCR.is_journalable)
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

  /** get the value of the field: IsJournalable (ADJ_TRANS_DESCR.is_journalable)
   * @return Boolean the value
   */
  public Boolean getIsJournalable () {
    return this.IsJournalable;
  }
  /** Change the field to not being actively set: IsJournalable (ADJ_TRANS_DESCR.is_journalable)
   */
  public void unsetIsJournalable () {
    this._IsJournalableSet = false;
  }
  /** See if the field is actively set: IsJournalable (ADJ_TRANS_DESCR.is_journalable)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsJournalable () {
    return this._IsJournalableSet;
  }
  /** set the fields value: IsDisplayedOnbill (ADJ_TRANS_DESCR.is_displayed_onbill)
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

  /** get the value of the field: IsDisplayedOnbill (ADJ_TRANS_DESCR.is_displayed_onbill)
   * @return Boolean the value
   */
  public Boolean getIsDisplayedOnbill () {
    return this.IsDisplayedOnbill;
  }
  /** Change the field to not being actively set: IsDisplayedOnbill (ADJ_TRANS_DESCR.is_displayed_onbill)
   */
  public void unsetIsDisplayedOnbill () {
    this._IsDisplayedOnbillSet = false;
  }
  /** See if the field is actively set: IsDisplayedOnbill (ADJ_TRANS_DESCR.is_displayed_onbill)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsDisplayedOnbill () {
    return this._IsDisplayedOnbillSet;
  }
  /** set the fields value: IsDisconnectCredit (ADJ_TRANS_DESCR.is_disconnect_credit)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsDisconnectCredit") 
  public void setIsDisconnectCredit (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsDisconnectCredit", "setIsDisconnectCredit");
    }
    this.IsDisconnectCredit = value;
    this._IsDisconnectCreditSet = true;
  }

  /** Retrieves the IsDisconnectCredit field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsDisconnectCredit field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsDisconnectCredit field
   */
   public String getIsDisconnectCreditAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsDisconnectCreditAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsDisconnectCreditAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsDisconnectCredit());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsDisconnectCredit");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsDisconnectCreditAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsDisconnectCredit field from a formatted string
   *
   * @param _value the IsDisconnectCredit field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsDisconnectCredit field
   */
   public void setIsDisconnectCreditFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsDisconnectCreditFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsDisconnectCredit(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsDisconnectCredit");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsDisconnectCreditFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsDisconnectCreditFromFormattedString");
   }

  /** get the value of the field: IsDisconnectCredit (ADJ_TRANS_DESCR.is_disconnect_credit)
   * @return Boolean the value
   */
  public Boolean getIsDisconnectCredit () {
    return this.IsDisconnectCredit;
  }
  /** Change the field to not being actively set: IsDisconnectCredit (ADJ_TRANS_DESCR.is_disconnect_credit)
   */
  public void unsetIsDisconnectCredit () {
    this._IsDisconnectCreditSet = false;
  }
  /** See if the field is actively set: IsDisconnectCredit (ADJ_TRANS_DESCR.is_disconnect_credit)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsDisconnectCredit () {
    return this._IsDisconnectCreditSet;
  }
  /** set the fields value: IsRefinance (ADJ_TRANS_DESCR.is_refinance)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsRefinance") 
  public void setIsRefinance (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsRefinance", "setIsRefinance");
    }
    this.IsRefinance = value;
    this._IsRefinanceSet = true;
  }

  /** Retrieves the IsRefinance field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsRefinance field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsRefinance field
   */
   public String getIsRefinanceAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsRefinanceAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsRefinanceAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsRefinance());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsRefinance");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsRefinanceAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsRefinance field from a formatted string
   *
   * @param _value the IsRefinance field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsRefinance field
   */
   public void setIsRefinanceFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsRefinanceFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsRefinance(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsRefinance");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsRefinanceFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsRefinanceFromFormattedString");
   }

  /** get the value of the field: IsRefinance (ADJ_TRANS_DESCR.is_refinance)
   * @return Boolean the value
   */
  public Boolean getIsRefinance () {
    return this.IsRefinance;
  }
  /** Change the field to not being actively set: IsRefinance (ADJ_TRANS_DESCR.is_refinance)
   */
  public void unsetIsRefinance () {
    this._IsRefinanceSet = false;
  }
  /** See if the field is actively set: IsRefinance (ADJ_TRANS_DESCR.is_refinance)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsRefinance () {
    return this._IsRefinanceSet;
  }
  /** set the fields value: AnnotationType (ADJ_TRANS_DESCR.annotation_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AnnotationType") 
  public void setAnnotationType (Integer value) throws ServiceException
  {
    this.AnnotationType = value;
    this._AnnotationTypeSet = true;
  }

  /** Retrieves the AnnotationType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AnnotationType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AnnotationType field
   */
   public String getAnnotationTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAnnotationTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAnnotationTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getAnnotationType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AnnotationType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAnnotationTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the AnnotationType field from a formatted string
   *
   * @param _value the AnnotationType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AnnotationType field
   */
   public void setAnnotationTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAnnotationTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAnnotationType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AnnotationType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAnnotationTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAnnotationTypeFromFormattedString");
   }

  /** get the value of the field: AnnotationType (ADJ_TRANS_DESCR.annotation_type)
   * @return Integer the value
   */
  public Integer getAnnotationType () {
    return this.AnnotationType;
  }
  /** Change the field to not being actively set: AnnotationType (ADJ_TRANS_DESCR.annotation_type)
   */
  public void unsetAnnotationType () {
    this._AnnotationTypeSet = false;
  }
  /** See if the field is actively set: AnnotationType (ADJ_TRANS_DESCR.annotation_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetAnnotationType () {
    return this._AnnotationTypeSet;
  }
  /** set the fields value: TaxOnInvoice (ADJ_TRANS_DESCR.tax_on_invoice)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TaxOnInvoice") 
  public void setTaxOnInvoice (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TaxOnInvoice", "setTaxOnInvoice");
    }
    this.TaxOnInvoice = value;
    this._TaxOnInvoiceSet = true;
  }

  /** Retrieves the TaxOnInvoice field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TaxOnInvoice field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxOnInvoice field
   */
   public String getTaxOnInvoiceAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxOnInvoiceAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxOnInvoiceAsFormattedString");
       return fmtMgr.formatBoolean(this.getTaxOnInvoice());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxOnInvoice");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxOnInvoiceAsFormattedString");
       throw x;
     }
   }
  /** Sets the TaxOnInvoice field from a formatted string
   *
   * @param _value the TaxOnInvoice field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TaxOnInvoice field
   */
   public void setTaxOnInvoiceFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxOnInvoiceFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTaxOnInvoice(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxOnInvoice");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxOnInvoiceFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxOnInvoiceFromFormattedString");
   }

  /** get the value of the field: TaxOnInvoice (ADJ_TRANS_DESCR.tax_on_invoice)
   * @return Boolean the value
   */
  public Boolean getTaxOnInvoice () {
    return this.TaxOnInvoice;
  }
  /** Change the field to not being actively set: TaxOnInvoice (ADJ_TRANS_DESCR.tax_on_invoice)
   */
  public void unsetTaxOnInvoice () {
    this._TaxOnInvoiceSet = false;
  }
  /** See if the field is actively set: TaxOnInvoice (ADJ_TRANS_DESCR.tax_on_invoice)
   * @return boolean whether the field is actively set
   */
  public boolean issetTaxOnInvoice () {
    return this._TaxOnInvoiceSet;
  }
  /** set the fields value: IsLateFeeExempt (ADJ_TRANS_DESCR.is_late_fee_exempt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsLateFeeExempt") 
  public void setIsLateFeeExempt (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsLateFeeExempt", "setIsLateFeeExempt");
    }
    this.IsLateFeeExempt = value;
    this._IsLateFeeExemptSet = true;
  }

  /** Retrieves the IsLateFeeExempt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsLateFeeExempt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsLateFeeExempt field
   */
   public String getIsLateFeeExemptAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsLateFeeExemptAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsLateFeeExemptAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsLateFeeExempt());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsLateFeeExempt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsLateFeeExemptAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsLateFeeExempt field from a formatted string
   *
   * @param _value the IsLateFeeExempt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsLateFeeExempt field
   */
   public void setIsLateFeeExemptFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsLateFeeExemptFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsLateFeeExempt(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsLateFeeExempt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsLateFeeExemptFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsLateFeeExemptFromFormattedString");
   }

  /** get the value of the field: IsLateFeeExempt (ADJ_TRANS_DESCR.is_late_fee_exempt)
   * @return Boolean the value
   */
  public Boolean getIsLateFeeExempt () {
    return this.IsLateFeeExempt;
  }
  /** Change the field to not being actively set: IsLateFeeExempt (ADJ_TRANS_DESCR.is_late_fee_exempt)
   */
  public void unsetIsLateFeeExempt () {
    this._IsLateFeeExemptSet = false;
  }
  /** See if the field is actively set: IsLateFeeExempt (ADJ_TRANS_DESCR.is_late_fee_exempt)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsLateFeeExempt () {
    return this._IsLateFeeExemptSet;
  }
  /** set the fields value: AllowInterimBill (ADJ_TRANS_DESCR.allow_interim_bill)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AllowInterimBill") 
  public void setAllowInterimBill (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AllowInterimBill", "setAllowInterimBill");
    }
    this.AllowInterimBill = value;
    this._AllowInterimBillSet = true;
  }

  /** Retrieves the AllowInterimBill field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AllowInterimBill field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AllowInterimBill field
   */
   public String getAllowInterimBillAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAllowInterimBillAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAllowInterimBillAsFormattedString");
       return fmtMgr.formatBoolean(this.getAllowInterimBill());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AllowInterimBill");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAllowInterimBillAsFormattedString");
       throw x;
     }
   }
  /** Sets the AllowInterimBill field from a formatted string
   *
   * @param _value the AllowInterimBill field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AllowInterimBill field
   */
   public void setAllowInterimBillFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAllowInterimBillFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAllowInterimBill(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AllowInterimBill");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAllowInterimBillFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAllowInterimBillFromFormattedString");
   }

  /** get the value of the field: AllowInterimBill (ADJ_TRANS_DESCR.allow_interim_bill)
   * @return Boolean the value
   */
  public Boolean getAllowInterimBill () {
    return this.AllowInterimBill;
  }
  /** Change the field to not being actively set: AllowInterimBill (ADJ_TRANS_DESCR.allow_interim_bill)
   */
  public void unsetAllowInterimBill () {
    this._AllowInterimBillSet = false;
  }
  /** See if the field is actively set: AllowInterimBill (ADJ_TRANS_DESCR.allow_interim_bill)
   * @return boolean whether the field is actively set
   */
  public boolean issetAllowInterimBill () {
    return this._AllowInterimBillSet;
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
  /** set the fields value: ConfigTagId (ADJ_TRANS_DESCR.config_tag_id)
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

  /** get the value of the field: ConfigTagId (ADJ_TRANS_DESCR.config_tag_id)
   * @return String the value
   */
  public String getConfigTagId () {
    return this.ConfigTagId;
  }
  /** Change the field to not being actively set: ConfigTagId (ADJ_TRANS_DESCR.config_tag_id)
   */
  public void unsetConfigTagId () {
    this._ConfigTagIdSet = false;
  }
  /** See if the field is actively set: ConfigTagId (ADJ_TRANS_DESCR.config_tag_id)
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
    return AdjustmentTypeObjectHelper.toMap(this, null).toString();
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
  /** ADJ_TRANS_DESCR.trans_target_type field */
    if(!nonNullOnly || (TransTargetType != null))  _TransTargetTypeSet = flag;
  /** ADJ_TRANS_DESCR.trans_target_id field */
    if(!nonNullOnly || (TransTargetId != null))  _TransTargetIdSet = flag;
  /** ADJ_TRANS_DESCR.adj_trans_category field */
    if(!nonNullOnly || (TransCategory != null))  _TransCategorySet = flag;
  /** ADJ_TRANS_DESCR.trans_sign field */
    if(!nonNullOnly || (TransSign != null))  _TransSignSet = flag;
  /** ADJ_TRANS_DESCR.billing_category field */
    if(!nonNullOnly || (BillingCategory != null))  _BillingCategorySet = flag;
  /** ADJ_TRANS_DESCR.billing_level field */
    if(!nonNullOnly || (BillingLevel != null))  _BillingLevelSet = flag;
  /** ADJ_TRANS_DESCR.tax_class field */
    if(!nonNullOnly || (TaxClass != null))  _TaxClassSet = flag;
  /** ADJ_TRANS_DESCR.is_viewable field */
    if(!nonNullOnly || (IsViewable != null))  _IsViewableSet = flag;
  /** ADJ_TRANS_DESCR.is_modifiable field */
    if(!nonNullOnly || (IsModifiable != null))  _IsModifiableSet = flag;
  /** ADJ_TRANS_DESCR.is_adjustable field */
    if(!nonNullOnly || (IsAdjustable != null))  _IsAdjustableSet = flag;
  /** ADJ_TRANS_DESCR.is_journalable field */
    if(!nonNullOnly || (IsJournalable != null))  _IsJournalableSet = flag;
  /** ADJ_TRANS_DESCR.is_displayed_onbill field */
    if(!nonNullOnly || (IsDisplayedOnbill != null))  _IsDisplayedOnbillSet = flag;
  /** ADJ_TRANS_DESCR.is_disconnect_credit field */
    if(!nonNullOnly || (IsDisconnectCredit != null))  _IsDisconnectCreditSet = flag;
  /** ADJ_TRANS_DESCR.is_refinance field */
    if(!nonNullOnly || (IsRefinance != null))  _IsRefinanceSet = flag;
  /** ADJ_TRANS_DESCR.annotation_type field */
    if(!nonNullOnly || (AnnotationType != null))  _AnnotationTypeSet = flag;
  /** ADJ_TRANS_DESCR.tax_on_invoice field */
    if(!nonNullOnly || (TaxOnInvoice != null))  _TaxOnInvoiceSet = flag;
  /** ADJ_TRANS_DESCR.is_late_fee_exempt field */
    if(!nonNullOnly || (IsLateFeeExempt != null))  _IsLateFeeExemptSet = flag;
  /** ADJ_TRANS_DESCR.allow_interim_bill field */
    if(!nonNullOnly || (AllowInterimBill != null))  _AllowInterimBillSet = flag;
  /** ADJ_TRANS_DESCR.is_negative_bill_adj field */
    if(!nonNullOnly || (IsNegativeBillAdj != null))  _IsNegativeBillAdjSet = flag;
  /** ADJ_TRANS_DESCR.config_tag_id field */
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
