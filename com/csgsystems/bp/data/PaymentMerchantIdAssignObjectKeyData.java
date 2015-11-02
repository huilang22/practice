/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PaymentMerchantIdAssignObjectKeyData.java
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
import java.util.Map;
import java.util.Locale;
import java.math.BigInteger;

import javax.ws.rs.QueryParam;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.csgsystems.aruba.connection.ServiceException;
import com.csgsystems.aruba.*;
import com.csgsystems.aruba.filter.*;

import com.csgsystems.api.utilities.Logger;
import com.csgsystems.api.utilities.ObjectHelper;

import com.csgsystems.api.constraint.ConstraintManager;
import com.csgsystems.api.constraint.ConstraintException;

import com.csgsystems.api.defaults.DefaultManager;

import com.csgsystems.api.base.BaseObjectData;

import com.csgsystems.api.enumeration.EnumeratedDataMgr;
import com.csgsystems.api.enumeration.Enumeration;
import com.csgsystems.api.enumeration.EnumerationFilter;

import com.csgsystems.api.format.FieldFormatMgr;

/** PaymentMerchantIdAssignObject's Key Data class. */
public class PaymentMerchantIdAssignObjectKeyData  extends BaseObjectData
{
  /** PAYMENT_MERCHANT_ID_ASSIGN.payment_merchant_id field */
  public    Integer PaymentMerchantId  = null;
  protected boolean _PaymentMerchantIdSet = false;
  /** PAYMENT_MERCHANT_ID_ASSIGN.card_type_code field */
  public    Integer CardTypeCode  = null;
  protected boolean _CardTypeCodeSet = false;
  /** PAYMENT_MERCHANT_ID_ASSIGN.pay_method field */
  public    Integer PayMethod  = null;
  protected boolean _PayMethodSet = false;
  private String _objName = "PaymentMerchantIdAssignObjectKeyData";
  /** default constructor */
  public PaymentMerchantIdAssignObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public PaymentMerchantIdAssignObjectKeyData (PaymentMerchantIdAssignObjectKeyData other)
  {
    if (other == null) return;
    this.PaymentMerchantId = other.PaymentMerchantId;
    this._PaymentMerchantIdSet = other._PaymentMerchantIdSet;
    this.CardTypeCode = other.CardTypeCode;
    this._CardTypeCodeSet = other._CardTypeCodeSet;
    this.PayMethod = other.PayMethod;
    this._PayMethodSet = other._PayMethodSet;
  }
  /** set the fields value: PaymentMerchantId (PAYMENT_MERCHANT_ID_ASSIGN.payment_merchant_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PaymentMerchantId") 
  public void setPaymentMerchantId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PaymentMerchantId", "setPaymentMerchantId");
    }
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

  /** get the value of the field: PaymentMerchantId (PAYMENT_MERCHANT_ID_ASSIGN.payment_merchant_id)
   * @return Integer the value
   */
  public Integer getPaymentMerchantId () {
    return this.PaymentMerchantId;
  }
  /** Change the field to not being actively set: PaymentMerchantId (PAYMENT_MERCHANT_ID_ASSIGN.payment_merchant_id)
   */
  public void unsetPaymentMerchantId () {
    this._PaymentMerchantIdSet = false;
  }
  /** See if the field is actively set: PaymentMerchantId (PAYMENT_MERCHANT_ID_ASSIGN.payment_merchant_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetPaymentMerchantId () {
    return this._PaymentMerchantIdSet;
  }
  /** set the fields value: CardTypeCode (PAYMENT_MERCHANT_ID_ASSIGN.card_type_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CardTypeCode") 
  public void setCardTypeCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CardTypeCode", "setCardTypeCode");
    }
    this.CardTypeCode = value;
    this._CardTypeCodeSet = true;
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

  /** get the value of the field: CardTypeCode (PAYMENT_MERCHANT_ID_ASSIGN.card_type_code)
   * @return Integer the value
   */
  public Integer getCardTypeCode () {
    return this.CardTypeCode;
  }
  /** Change the field to not being actively set: CardTypeCode (PAYMENT_MERCHANT_ID_ASSIGN.card_type_code)
   */
  public void unsetCardTypeCode () {
    this._CardTypeCodeSet = false;
  }
  /** See if the field is actively set: CardTypeCode (PAYMENT_MERCHANT_ID_ASSIGN.card_type_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCardTypeCode () {
    return this._CardTypeCodeSet;
  }
  /** set the fields value: PayMethod (PAYMENT_MERCHANT_ID_ASSIGN.pay_method)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PayMethod") 
  public void setPayMethod (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PayMethod", "setPayMethod");
    }
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
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("PayMethod", _locale, enumFilter, true);
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

  /** get the value of the field: PayMethod (PAYMENT_MERCHANT_ID_ASSIGN.pay_method)
   * @return Integer the value
   */
  public Integer getPayMethod () {
    return this.PayMethod;
  }
  /** Change the field to not being actively set: PayMethod (PAYMENT_MERCHANT_ID_ASSIGN.pay_method)
   */
  public void unsetPayMethod () {
    this._PayMethodSet = false;
  }
  /** See if the field is actively set: PayMethod (PAYMENT_MERCHANT_ID_ASSIGN.pay_method)
   * @return boolean whether the field is actively set
   */
  public boolean issetPayMethod () {
    return this._PayMethodSet;
  }
  public String toString() {
    return PaymentMerchantIdAssignObjectKeyHelper.toMap(this, null).toString();
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
   * This method sets all of the *Set flags to the specified value
   * @param flag value to set
   */
  public void resetFlags(boolean flag) {
    
      resetFlags(flag, true);
  }
  /*
   * This method sets the *Set flags to the specified value
   * @param flag value to set
   * @param nonNullOnly value to set
   */
  public void resetFlags(boolean flag, boolean nonNullOnly) {
    
  /** PAYMENT_MERCHANT_ID_ASSIGN.payment_merchant_id field */
    if(!nonNullOnly || (PaymentMerchantId != null))  _PaymentMerchantIdSet = flag;
  /** PAYMENT_MERCHANT_ID_ASSIGN.card_type_code field */
    if(!nonNullOnly || (CardTypeCode != null))  _CardTypeCodeSet = flag;
  /** PAYMENT_MERCHANT_ID_ASSIGN.pay_method field */
    if(!nonNullOnly || (PayMethod != null))  _PayMethodSet = flag;
  }
}
