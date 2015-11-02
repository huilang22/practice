/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: VoucherTypesObjectData.java
 * Definition File: Catalog/VoucherTypes.xml
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
  
/** VoucherTypesObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class VoucherTypesObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public VoucherTypesObjectKeyData Key = null;
  /** VOUCHER_TYPES.length_of_pin field */
  public    BigInteger LengthOfPin  = null;
  protected boolean _LengthOfPinSet = false;
  /** VOUCHER_TYPES.pin_data_type field */
  public    BigInteger PinDataType  = null;
  protected boolean _PinDataTypeSet = false;
  /** VOUCHER_TYPES.voucher_descriptions field */
  public    String VoucherDescriptions  = null;
  protected boolean _VoucherDescriptionsSet = false;
  /** VOUCHER_TYPES.credit_conversion_type field */
  public    BigInteger CreditConversionType  = null;
  protected boolean _CreditConversionTypeSet = false;
  /** VOUCHER_TYPES.api_validation_check field */
  public    BigInteger ApiValidationCheck  = null;
  protected boolean _ApiValidationCheckSet = false;
  /** VOUCHER_TYPES.gui_validation_check field */
  public    BigInteger GuiValidationCheck  = null;
  protected boolean _GuiValidationCheckSet = false;
  /** VOUCHER_TYPES.unit_credit_contract_id field */
  public    BigInteger UnitCreditContractId  = null;
  protected boolean _UnitCreditContractIdSet = false;
  /** VOUCHER_TYPES.payment_trans_type field */
  public    BigInteger PaymentTransType  = null;
  protected boolean _PaymentTransTypeSet = false;
  private String _objName = "VoucherTypesObjectData";
  /** Default constructor */
  public VoucherTypesObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public VoucherTypesObjectData (VoucherTypesObjectData other)
  {

    if (other == null) return;
    this.Key = new VoucherTypesObjectKeyData (other.Key);
    this.LengthOfPin = other.LengthOfPin;
    this._LengthOfPinSet = other._LengthOfPinSet;
    this.PinDataType = other.PinDataType;
    this._PinDataTypeSet = other._PinDataTypeSet;
    this.VoucherDescriptions = other.VoucherDescriptions;
    this._VoucherDescriptionsSet = other._VoucherDescriptionsSet;
    this.CreditConversionType = other.CreditConversionType;
    this._CreditConversionTypeSet = other._CreditConversionTypeSet;
    this.ApiValidationCheck = other.ApiValidationCheck;
    this._ApiValidationCheckSet = other._ApiValidationCheckSet;
    this.GuiValidationCheck = other.GuiValidationCheck;
    this._GuiValidationCheckSet = other._GuiValidationCheckSet;
    this.UnitCreditContractId = other.UnitCreditContractId;
    this._UnitCreditContractIdSet = other._UnitCreditContractIdSet;
    this.PaymentTransType = other.PaymentTransType;
    this._PaymentTransTypeSet = other._PaymentTransTypeSet;
  }

  /** get the Key for this object
   * @return VoucherTypesObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public VoucherTypesObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (VoucherTypesObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: VoucherTypeId (VOUCHER_TYPES.voucher_type_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setVoucherTypeId (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "VoucherTypeId", "setVoucherTypeId");
    }
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "VoucherTypeId", "setVoucherTypeId");
    }
    if (this.Key == null) this.Key = new VoucherTypesObjectKeyData ();
    this.Key.VoucherTypeId = value;
    this.Key._VoucherTypeIdSet = true;
  }
  /** get the value of the field: VoucherTypeId (VOUCHER_TYPES.voucher_type_id)
   * @return BigInteger the value
   */
  public BigInteger getVoucherTypeId () {
    if (this.Key == null) return null;
    return this.Key.VoucherTypeId;
  }
  /** Change the field to not being actively set: VoucherTypeId (VOUCHER_TYPES.voucher_type_id)
   */
  public void unsetVoucherTypeId () {
    if (this.Key == null) return;
    this.Key._VoucherTypeIdSet = false;
  }
  /** See if the field is actively set: VoucherTypeId (VOUCHER_TYPES.voucher_type_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetVoucherTypeId () {
    if (this.Key == null) return false;
    return this.Key._VoucherTypeIdSet;
  }

  /** Retrieves the VoucherTypeId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The VoucherTypeId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the VoucherTypeId field
   */
   public String getVoucherTypeIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherTypeIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherTypeIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getVoucherTypeId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("VoucherTypeId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getVoucherTypeIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the VoucherTypeId field from a formatted string
   *
   * @param _value the VoucherTypeId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the VoucherTypeId field
   */
   public void setVoucherTypeIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherTypeIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setVoucherTypeId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("VoucherTypeId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setVoucherTypeIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setVoucherTypeIdFromFormattedString");
   }

  /** set the fields value: LengthOfPin (VOUCHER_TYPES.length_of_pin)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("LengthOfPin") 
  public void setLengthOfPin (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "LengthOfPin", "setLengthOfPin");
    }
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "LengthOfPin", "setLengthOfPin");
    }
    this.LengthOfPin = value;
    this._LengthOfPinSet = true;
  }

  /** Retrieves the LengthOfPin field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The LengthOfPin field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LengthOfPin field
   */
   public String getLengthOfPinAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLengthOfPinAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLengthOfPinAsFormattedString");
       return fmtMgr.formatBigInteger(this.getLengthOfPin(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LengthOfPin");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getLengthOfPinAsFormattedString");
       throw x;
     }
   }
  /** Sets the LengthOfPin field from a formatted string
   *
   * @param _value the LengthOfPin field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the LengthOfPin field
   */
   public void setLengthOfPinFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLengthOfPinFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setLengthOfPin(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LengthOfPin");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setLengthOfPinFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLengthOfPinFromFormattedString");
   }

  /** get the value of the field: LengthOfPin (VOUCHER_TYPES.length_of_pin)
   * @return BigInteger the value
   */
  public BigInteger getLengthOfPin () {
    return this.LengthOfPin;
  }
  /** Change the field to not being actively set: LengthOfPin (VOUCHER_TYPES.length_of_pin)
   */
  public void unsetLengthOfPin () {
    this._LengthOfPinSet = false;
  }
  /** See if the field is actively set: LengthOfPin (VOUCHER_TYPES.length_of_pin)
   * @return boolean whether the field is actively set
   */
  public boolean issetLengthOfPin () {
    return this._LengthOfPinSet;
  }
  /** set the fields value: PinDataType (VOUCHER_TYPES.pin_data_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PinDataType") 
  public void setPinDataType (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PinDataType", "setPinDataType");
    }
    if (value != null && !DataHelper.validLength (value, 1))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "PinDataType", "setPinDataType");
    }
    this.PinDataType = value;
    this._PinDataTypeSet = true;
  }

  /** Retrieves the PinDataType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PinDataType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PinDataType field
   */
   public String getPinDataTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPinDataTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPinDataTypeAsFormattedString");
       return fmtMgr.formatBigInteger(this.getPinDataType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PinDataType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPinDataTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the PinDataType field from a formatted string
   *
   * @param _value the PinDataType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PinDataType field
   */
   public void setPinDataTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPinDataTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPinDataType(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PinDataType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPinDataTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPinDataTypeFromFormattedString");
   }

  /** get the value of the field: PinDataType (VOUCHER_TYPES.pin_data_type)
   * @return BigInteger the value
   */
  public BigInteger getPinDataType () {
    return this.PinDataType;
  }
  /** Change the field to not being actively set: PinDataType (VOUCHER_TYPES.pin_data_type)
   */
  public void unsetPinDataType () {
    this._PinDataTypeSet = false;
  }
  /** See if the field is actively set: PinDataType (VOUCHER_TYPES.pin_data_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetPinDataType () {
    return this._PinDataTypeSet;
  }
  /** set the fields value: VoucherDescriptions (VOUCHER_TYPES.voucher_descriptions)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("VoucherDescriptions") 
  public void setVoucherDescriptions (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "VoucherDescriptions", "setVoucherDescriptions");
    }
    if (value != null && !DataHelper.validLength (value, 200))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "VoucherDescriptions", "setVoucherDescriptions");
    }
    this.VoucherDescriptions = value;
    this._VoucherDescriptionsSet = true;
  }

  /** Retrieves the VoucherDescriptions field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The VoucherDescriptions field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the VoucherDescriptions field
   */
   public String getVoucherDescriptionsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherDescriptionsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherDescriptionsAsFormattedString");
       return fmtMgr.formatString(this.getVoucherDescriptions());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("VoucherDescriptions");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getVoucherDescriptionsAsFormattedString");
       throw x;
     }
   }
  /** Sets the VoucherDescriptions field from a formatted string
   *
   * @param _value the VoucherDescriptions field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the VoucherDescriptions field
   */
   public void setVoucherDescriptionsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherDescriptionsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setVoucherDescriptions(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("VoucherDescriptions");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setVoucherDescriptionsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setVoucherDescriptionsFromFormattedString");
   }

  /** get the value of the field: VoucherDescriptions (VOUCHER_TYPES.voucher_descriptions)
   * @return String the value
   */
  public String getVoucherDescriptions () {
    return this.VoucherDescriptions;
  }
  /** Change the field to not being actively set: VoucherDescriptions (VOUCHER_TYPES.voucher_descriptions)
   */
  public void unsetVoucherDescriptions () {
    this._VoucherDescriptionsSet = false;
  }
  /** See if the field is actively set: VoucherDescriptions (VOUCHER_TYPES.voucher_descriptions)
   * @return boolean whether the field is actively set
   */
  public boolean issetVoucherDescriptions () {
    return this._VoucherDescriptionsSet;
  }
  /** set the fields value: CreditConversionType (VOUCHER_TYPES.credit_conversion_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CreditConversionType") 
  public void setCreditConversionType (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CreditConversionType", "setCreditConversionType");
    }
    if (value != null && !DataHelper.validLength (value, 1))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CreditConversionType", "setCreditConversionType");
    }
    this.CreditConversionType = value;
    this._CreditConversionTypeSet = true;
  }

  /** Retrieves the CreditConversionType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CreditConversionType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CreditConversionType field
   */
   public String getCreditConversionTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreditConversionTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCreditConversionTypeAsFormattedString");
       return fmtMgr.formatBigInteger(this.getCreditConversionType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CreditConversionType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCreditConversionTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the CreditConversionType field from a formatted string
   *
   * @param _value the CreditConversionType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CreditConversionType field
   */
   public void setCreditConversionTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreditConversionTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCreditConversionType(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CreditConversionType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCreditConversionTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCreditConversionTypeFromFormattedString");
   }

  /** get the value of the field: CreditConversionType (VOUCHER_TYPES.credit_conversion_type)
   * @return BigInteger the value
   */
  public BigInteger getCreditConversionType () {
    return this.CreditConversionType;
  }
  /** Change the field to not being actively set: CreditConversionType (VOUCHER_TYPES.credit_conversion_type)
   */
  public void unsetCreditConversionType () {
    this._CreditConversionTypeSet = false;
  }
  /** See if the field is actively set: CreditConversionType (VOUCHER_TYPES.credit_conversion_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetCreditConversionType () {
    return this._CreditConversionTypeSet;
  }
  /** set the fields value: ApiValidationCheck (VOUCHER_TYPES.api_validation_check)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ApiValidationCheck") 
  public void setApiValidationCheck (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ApiValidationCheck", "setApiValidationCheck");
    }
    if (value != null && !DataHelper.validLength (value, 1))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ApiValidationCheck", "setApiValidationCheck");
    }
    this.ApiValidationCheck = value;
    this._ApiValidationCheckSet = true;
  }

  /** Retrieves the ApiValidationCheck field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ApiValidationCheck field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ApiValidationCheck field
   */
   public String getApiValidationCheckAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getApiValidationCheckAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getApiValidationCheckAsFormattedString");
       return fmtMgr.formatBigInteger(this.getApiValidationCheck(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ApiValidationCheck");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getApiValidationCheckAsFormattedString");
       throw x;
     }
   }
  /** Sets the ApiValidationCheck field from a formatted string
   *
   * @param _value the ApiValidationCheck field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ApiValidationCheck field
   */
   public void setApiValidationCheckFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getApiValidationCheckFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setApiValidationCheck(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ApiValidationCheck");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setApiValidationCheckFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setApiValidationCheckFromFormattedString");
   }

  /** get the value of the field: ApiValidationCheck (VOUCHER_TYPES.api_validation_check)
   * @return BigInteger the value
   */
  public BigInteger getApiValidationCheck () {
    return this.ApiValidationCheck;
  }
  /** Change the field to not being actively set: ApiValidationCheck (VOUCHER_TYPES.api_validation_check)
   */
  public void unsetApiValidationCheck () {
    this._ApiValidationCheckSet = false;
  }
  /** See if the field is actively set: ApiValidationCheck (VOUCHER_TYPES.api_validation_check)
   * @return boolean whether the field is actively set
   */
  public boolean issetApiValidationCheck () {
    return this._ApiValidationCheckSet;
  }
  /** set the fields value: GuiValidationCheck (VOUCHER_TYPES.gui_validation_check)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("GuiValidationCheck") 
  public void setGuiValidationCheck (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 1))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "GuiValidationCheck", "setGuiValidationCheck");
    }
    this.GuiValidationCheck = value;
    this._GuiValidationCheckSet = true;
  }

  /** Retrieves the GuiValidationCheck field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The GuiValidationCheck field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GuiValidationCheck field
   */
   public String getGuiValidationCheckAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGuiValidationCheckAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGuiValidationCheckAsFormattedString");
       return fmtMgr.formatBigInteger(this.getGuiValidationCheck(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("GuiValidationCheck");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getGuiValidationCheckAsFormattedString");
       throw x;
     }
   }
  /** Sets the GuiValidationCheck field from a formatted string
   *
   * @param _value the GuiValidationCheck field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the GuiValidationCheck field
   */
   public void setGuiValidationCheckFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGuiValidationCheckFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setGuiValidationCheck(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("GuiValidationCheck");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setGuiValidationCheckFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGuiValidationCheckFromFormattedString");
   }

  /** get the value of the field: GuiValidationCheck (VOUCHER_TYPES.gui_validation_check)
   * @return BigInteger the value
   */
  public BigInteger getGuiValidationCheck () {
    return this.GuiValidationCheck;
  }
  /** Change the field to not being actively set: GuiValidationCheck (VOUCHER_TYPES.gui_validation_check)
   */
  public void unsetGuiValidationCheck () {
    this._GuiValidationCheckSet = false;
  }
  /** See if the field is actively set: GuiValidationCheck (VOUCHER_TYPES.gui_validation_check)
   * @return boolean whether the field is actively set
   */
  public boolean issetGuiValidationCheck () {
    return this._GuiValidationCheckSet;
  }
  /** set the fields value: UnitCreditContractId (VOUCHER_TYPES.unit_credit_contract_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UnitCreditContractId") 
  public void setUnitCreditContractId (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "UnitCreditContractId", "setUnitCreditContractId");
    }
    this.UnitCreditContractId = value;
    this._UnitCreditContractIdSet = true;
  }

  /** Retrieves the UnitCreditContractId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UnitCreditContractId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UnitCreditContractId field
   */
   public String getUnitCreditContractIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitCreditContractIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUnitCreditContractIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getUnitCreditContractId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UnitCreditContractId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUnitCreditContractIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the UnitCreditContractId field from a formatted string
   *
   * @param _value the UnitCreditContractId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UnitCreditContractId field
   */
   public void setUnitCreditContractIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitCreditContractIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUnitCreditContractId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UnitCreditContractId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUnitCreditContractIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUnitCreditContractIdFromFormattedString");
   }

  /** get the value of the field: UnitCreditContractId (VOUCHER_TYPES.unit_credit_contract_id)
   * @return BigInteger the value
   */
  public BigInteger getUnitCreditContractId () {
    return this.UnitCreditContractId;
  }
  /** Change the field to not being actively set: UnitCreditContractId (VOUCHER_TYPES.unit_credit_contract_id)
   */
  public void unsetUnitCreditContractId () {
    this._UnitCreditContractIdSet = false;
  }
  /** See if the field is actively set: UnitCreditContractId (VOUCHER_TYPES.unit_credit_contract_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetUnitCreditContractId () {
    return this._UnitCreditContractIdSet;
  }
  /** set the fields value: PaymentTransType (VOUCHER_TYPES.payment_trans_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PaymentTransType") 
  public void setPaymentTransType (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "PaymentTransType", "setPaymentTransType");
    }
    this.PaymentTransType = value;
    this._PaymentTransTypeSet = true;
  }

  /** Retrieves the PaymentTransType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PaymentTransType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PaymentTransType field
   */
   public String getPaymentTransTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentTransTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentTransTypeAsFormattedString");
       return fmtMgr.formatBigInteger(this.getPaymentTransType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PaymentTransType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPaymentTransTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the PaymentTransType field from a formatted string
   *
   * @param _value the PaymentTransType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PaymentTransType field
   */
   public void setPaymentTransTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentTransTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPaymentTransType(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PaymentTransType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPaymentTransTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPaymentTransTypeFromFormattedString");
   }

  /** get the value of the field: PaymentTransType (VOUCHER_TYPES.payment_trans_type)
   * @return BigInteger the value
   */
  public BigInteger getPaymentTransType () {
    return this.PaymentTransType;
  }
  /** Change the field to not being actively set: PaymentTransType (VOUCHER_TYPES.payment_trans_type)
   */
  public void unsetPaymentTransType () {
    this._PaymentTransTypeSet = false;
  }
  /** See if the field is actively set: PaymentTransType (VOUCHER_TYPES.payment_trans_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetPaymentTransType () {
    return this._PaymentTransTypeSet;
  }
  public String toString() {
    return VoucherTypesObjectHelper.toMap(this, null).toString();
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
  /** VOUCHER_TYPES.length_of_pin field */
    if(!nonNullOnly || (LengthOfPin != null))  _LengthOfPinSet = flag;
  /** VOUCHER_TYPES.pin_data_type field */
    if(!nonNullOnly || (PinDataType != null))  _PinDataTypeSet = flag;
  /** VOUCHER_TYPES.voucher_descriptions field */
    if(!nonNullOnly || (VoucherDescriptions != null))  _VoucherDescriptionsSet = flag;
  /** VOUCHER_TYPES.credit_conversion_type field */
    if(!nonNullOnly || (CreditConversionType != null))  _CreditConversionTypeSet = flag;
  /** VOUCHER_TYPES.api_validation_check field */
    if(!nonNullOnly || (ApiValidationCheck != null))  _ApiValidationCheckSet = flag;
  /** VOUCHER_TYPES.gui_validation_check field */
    if(!nonNullOnly || (GuiValidationCheck != null))  _GuiValidationCheckSet = flag;
  /** VOUCHER_TYPES.unit_credit_contract_id field */
    if(!nonNullOnly || (UnitCreditContractId != null))  _UnitCreditContractIdSet = flag;
  /** VOUCHER_TYPES.payment_trans_type field */
    if(!nonNullOnly || (PaymentTransType != null))  _PaymentTransTypeSet = flag;
  }
}
