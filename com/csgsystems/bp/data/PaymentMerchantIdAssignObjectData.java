/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PaymentMerchantIdAssignObjectData.java
 * Definition File: Admin/PaymentMerchantIdAssign.xml
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
  
/** PaymentMerchantIdAssignObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class PaymentMerchantIdAssignObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public PaymentMerchantIdAssignObjectKeyData Key = null;
  /** PAYMENT_MERCHANT_ID_ASSIGN.is_default_merchant_id field */
  public    Boolean IsDefaultMerchantId  = null;
  protected boolean _IsDefaultMerchantIdSet = false;
  /** PAYMENT_MERCHANT_ID_ASSIGN.config_tag_id field */
  public    String ConfigTagId  = null;
  protected boolean _ConfigTagIdSet = false;
  private String _objName = "PaymentMerchantIdAssignObjectData";
  /** Default constructor */
  public PaymentMerchantIdAssignObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public PaymentMerchantIdAssignObjectData (PaymentMerchantIdAssignObjectData other)
  {

    if (other == null) return;
    this.Key = new PaymentMerchantIdAssignObjectKeyData (other.Key);
    this.IsDefaultMerchantId = other.IsDefaultMerchantId;
    this._IsDefaultMerchantIdSet = other._IsDefaultMerchantIdSet;
    this.ConfigTagId = other.ConfigTagId;
    this._ConfigTagIdSet = other._ConfigTagIdSet;
  }

  /** get the Key for this object
   * @return PaymentMerchantIdAssignObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public PaymentMerchantIdAssignObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (PaymentMerchantIdAssignObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: PaymentMerchantId (PAYMENT_MERCHANT_ID_ASSIGN.payment_merchant_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setPaymentMerchantId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PaymentMerchantId", "setPaymentMerchantId");
    }
    if (this.Key == null) this.Key = new PaymentMerchantIdAssignObjectKeyData ();
    this.Key.PaymentMerchantId = value;
    this.Key._PaymentMerchantIdSet = true;
  }
  /** get the value of the field: PaymentMerchantId (PAYMENT_MERCHANT_ID_ASSIGN.payment_merchant_id)
   * @return Integer the value
   */
  public Integer getPaymentMerchantId () {
    if (this.Key == null) return null;
    return this.Key.PaymentMerchantId;
  }
  /** Change the field to not being actively set: PaymentMerchantId (PAYMENT_MERCHANT_ID_ASSIGN.payment_merchant_id)
   */
  public void unsetPaymentMerchantId () {
    if (this.Key == null) return;
    this.Key._PaymentMerchantIdSet = false;
  }
  /** See if the field is actively set: PaymentMerchantId (PAYMENT_MERCHANT_ID_ASSIGN.payment_merchant_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetPaymentMerchantId () {
    if (this.Key == null) return false;
    return this.Key._PaymentMerchantIdSet;
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

  /** set the fields value: CardTypeCode (PAYMENT_MERCHANT_ID_ASSIGN.card_type_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCardTypeCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CardTypeCode", "setCardTypeCode");
    }
    if (this.Key == null) this.Key = new PaymentMerchantIdAssignObjectKeyData ();
    this.Key.CardTypeCode = value;
    this.Key._CardTypeCodeSet = true;
  }
  /** get the value of the field: CardTypeCode (PAYMENT_MERCHANT_ID_ASSIGN.card_type_code)
   * @return Integer the value
   */
  public Integer getCardTypeCode () {
    if (this.Key == null) return null;
    return this.Key.CardTypeCode;
  }
  /** Change the field to not being actively set: CardTypeCode (PAYMENT_MERCHANT_ID_ASSIGN.card_type_code)
   */
  public void unsetCardTypeCode () {
    if (this.Key == null) return;
    this.Key._CardTypeCodeSet = false;
  }
  /** See if the field is actively set: CardTypeCode (PAYMENT_MERCHANT_ID_ASSIGN.card_type_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCardTypeCode () {
    if (this.Key == null) return false;
    return this.Key._CardTypeCodeSet;
  }

  /** Retrieves the CardTypeCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CardTypeCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CardTypeCode field
   */
   public String getCardTypeCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCardTypeCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCardTypeCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getCardTypeCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CardTypeCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCardTypeCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the CardTypeCode field from a formatted string
   *
   * @param _value the CardTypeCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CardTypeCode field
   */
   public void setCardTypeCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCardTypeCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCardTypeCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CardTypeCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCardTypeCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCardTypeCodeFromFormattedString");
   }

  /** set the fields value: PayMethod (PAYMENT_MERCHANT_ID_ASSIGN.pay_method)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setPayMethod (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PayMethod", "setPayMethod");
    }
    if (this.Key == null) this.Key = new PaymentMerchantIdAssignObjectKeyData ();
    this.Key.PayMethod = value;
    this.Key._PayMethodSet = true;
  }
  /** get the value of the field: PayMethod (PAYMENT_MERCHANT_ID_ASSIGN.pay_method)
   * @return Integer the value
   */
  public Integer getPayMethod () {
    if (this.Key == null) return null;
    return this.Key.PayMethod;
  }
  /** Change the field to not being actively set: PayMethod (PAYMENT_MERCHANT_ID_ASSIGN.pay_method)
   */
  public void unsetPayMethod () {
    if (this.Key == null) return;
    this.Key._PayMethodSet = false;
  }
  /** See if the field is actively set: PayMethod (PAYMENT_MERCHANT_ID_ASSIGN.pay_method)
   * @return boolean whether the field is actively set
   */
  public boolean issetPayMethod () {
    if (this.Key == null) return false;
    return this.Key._PayMethodSet;
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

  /**
   * Retrieves the display value for the enumerated PayMethod field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the PayMethod field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the PayMethod field
   */
  public String getPayMethodDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayMethodDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getPayMethodEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPayMethodDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getPayMethod()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PayMethod");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPayMethodDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated PayMethod field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the PayMethod field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the PayMethod field
   */
  public Enumeration getPayMethodEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayMethodEnumeration");
    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("PayMethod", _locale, null, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPayMethodEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PayMethod");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPayMethodEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated PayMethod field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setPayMethodFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPayMethodFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getPayMethodEnumeration(_locale);
      this.setPayMethod((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PayMethod");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPayMethodFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPayMethodFromDisplayValue");
  }

  /** set the fields value: IsDefaultMerchantId (PAYMENT_MERCHANT_ID_ASSIGN.is_default_merchant_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsDefaultMerchantId") 
  public void setIsDefaultMerchantId (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsDefaultMerchantId", "setIsDefaultMerchantId");
    }
    this.IsDefaultMerchantId = value;
    this._IsDefaultMerchantIdSet = true;
  }

  /** Retrieves the IsDefaultMerchantId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsDefaultMerchantId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsDefaultMerchantId field
   */
   public String getIsDefaultMerchantIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsDefaultMerchantIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsDefaultMerchantIdAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsDefaultMerchantId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsDefaultMerchantId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsDefaultMerchantIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsDefaultMerchantId field from a formatted string
   *
   * @param _value the IsDefaultMerchantId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsDefaultMerchantId field
   */
   public void setIsDefaultMerchantIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsDefaultMerchantIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsDefaultMerchantId(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsDefaultMerchantId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsDefaultMerchantIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsDefaultMerchantIdFromFormattedString");
   }

  /** get the value of the field: IsDefaultMerchantId (PAYMENT_MERCHANT_ID_ASSIGN.is_default_merchant_id)
   * @return Boolean the value
   */
  public Boolean getIsDefaultMerchantId () {
    return this.IsDefaultMerchantId;
  }
  /** Change the field to not being actively set: IsDefaultMerchantId (PAYMENT_MERCHANT_ID_ASSIGN.is_default_merchant_id)
   */
  public void unsetIsDefaultMerchantId () {
    this._IsDefaultMerchantIdSet = false;
  }
  /** See if the field is actively set: IsDefaultMerchantId (PAYMENT_MERCHANT_ID_ASSIGN.is_default_merchant_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsDefaultMerchantId () {
    return this._IsDefaultMerchantIdSet;
  }
  /** set the fields value: ConfigTagId (PAYMENT_MERCHANT_ID_ASSIGN.config_tag_id)
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

  /** get the value of the field: ConfigTagId (PAYMENT_MERCHANT_ID_ASSIGN.config_tag_id)
   * @return String the value
   */
  public String getConfigTagId () {
    return this.ConfigTagId;
  }
  /** Change the field to not being actively set: ConfigTagId (PAYMENT_MERCHANT_ID_ASSIGN.config_tag_id)
   */
  public void unsetConfigTagId () {
    this._ConfigTagIdSet = false;
  }
  /** See if the field is actively set: ConfigTagId (PAYMENT_MERCHANT_ID_ASSIGN.config_tag_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetConfigTagId () {
    return this._ConfigTagIdSet;
  }
  public String toString() {
    return PaymentMerchantIdAssignObjectHelper.toMap(this, null).toString();
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
  /** PAYMENT_MERCHANT_ID_ASSIGN.is_default_merchant_id field */
    if(!nonNullOnly || (IsDefaultMerchantId != null))  _IsDefaultMerchantIdSet = flag;
  /** PAYMENT_MERCHANT_ID_ASSIGN.config_tag_id field */
    if(!nonNullOnly || (ConfigTagId != null))  _ConfigTagIdSet = flag;
  }
}
