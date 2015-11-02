/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: VoucherDefinitionsObjectData.java
 * Definition File: Catalog/VoucherDefinitions.xml
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
  
/** VoucherDefinitionsObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class VoucherDefinitionsObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public VoucherDefinitionsObjectKeyData Key = null;
  /** VOUCHER_DEFINITIONS.voucher_type_id field */
  public    BigInteger VoucherTypeId  = null;
  protected boolean _VoucherTypeIdSet = false;
  /** VOUCHER_DEFINITIONS.unique_voucher_id field */
  public    BigInteger UniqueVoucherId  = null;
  protected boolean _UniqueVoucherIdSet = false;
  /** VOUCHER_DEFINITIONS.pin_code1 field */
  public    String PinCode1  = null;
  protected boolean _PinCode1Set = false;
  /** VOUCHER_DEFINITIONS.pin_code2 field */
  public    String PinCode2  = null;
  protected boolean _PinCode2Set = false;
  /** VOUCHER_DEFINITIONS.unit_credit_contract_id field */
  public    BigInteger UnitCreditContractId  = null;
  protected boolean _UnitCreditContractIdSet = false;
  /** VOUCHER_DEFINITIONS.number_of_units field */
  public    BigInteger NumberOfUnits  = null;
  protected boolean _NumberOfUnitsSet = false;
  /** VOUCHER_DEFINITIONS.amount field */
  public    BigInteger Amount  = null;
  protected boolean _AmountSet = false;
  /** VOUCHER_DEFINITIONS.currency_code field */
  public    BigInteger CurrencyCode  = null;
  protected boolean _CurrencyCodeSet = false;
  /** VOUCHER_DEFINITIONS.location_code field */
  public    BigInteger LocationCode  = null;
  protected boolean _LocationCodeSet = false;
  /** VOUCHER_DEFINITIONS.batch_id field */
  public    BigInteger BatchId  = null;
  protected boolean _BatchIdSet = false;
  /** VOUCHER_DEFINITIONS.check_sum field */
  public    String CheckSum  = null;
  protected boolean _CheckSumSet = false;
  private String _objName = "VoucherDefinitionsObjectData";
  /** Default constructor */
  public VoucherDefinitionsObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public VoucherDefinitionsObjectData (VoucherDefinitionsObjectData other)
  {

    if (other == null) return;
    this.Key = new VoucherDefinitionsObjectKeyData (other.Key);
    this.VoucherTypeId = other.VoucherTypeId;
    this._VoucherTypeIdSet = other._VoucherTypeIdSet;
    this.UniqueVoucherId = other.UniqueVoucherId;
    this._UniqueVoucherIdSet = other._UniqueVoucherIdSet;
    this.PinCode1 = other.PinCode1;
    this._PinCode1Set = other._PinCode1Set;
    this.PinCode2 = other.PinCode2;
    this._PinCode2Set = other._PinCode2Set;
    this.UnitCreditContractId = other.UnitCreditContractId;
    this._UnitCreditContractIdSet = other._UnitCreditContractIdSet;
    this.NumberOfUnits = other.NumberOfUnits;
    this._NumberOfUnitsSet = other._NumberOfUnitsSet;
    this.Amount = other.Amount;
    this._AmountSet = other._AmountSet;
    this.CurrencyCode = other.CurrencyCode;
    this._CurrencyCodeSet = other._CurrencyCodeSet;
    this.LocationCode = other.LocationCode;
    this._LocationCodeSet = other._LocationCodeSet;
    this.BatchId = other.BatchId;
    this._BatchIdSet = other._BatchIdSet;
    this.CheckSum = other.CheckSum;
    this._CheckSumSet = other._CheckSumSet;
  }

  /** get the Key for this object
   * @return VoucherDefinitionsObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public VoucherDefinitionsObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (VoucherDefinitionsObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: VoucherId (VOUCHER_DEFINITIONS.voucher_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setVoucherId (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "VoucherId", "setVoucherId");
    }
    if (value != null && !DataHelper.validLength (value, 50))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "VoucherId", "setVoucherId");
    }
    if (this.Key == null) this.Key = new VoucherDefinitionsObjectKeyData ();
    this.Key.VoucherId = value;
    this.Key._VoucherIdSet = true;
  }
  /** get the value of the field: VoucherId (VOUCHER_DEFINITIONS.voucher_id)
   * @return String the value
   */
  public String getVoucherId () {
    if (this.Key == null) return null;
    return this.Key.VoucherId;
  }
  /** Change the field to not being actively set: VoucherId (VOUCHER_DEFINITIONS.voucher_id)
   */
  public void unsetVoucherId () {
    if (this.Key == null) return;
    this.Key._VoucherIdSet = false;
  }
  /** See if the field is actively set: VoucherId (VOUCHER_DEFINITIONS.voucher_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetVoucherId () {
    if (this.Key == null) return false;
    return this.Key._VoucherIdSet;
  }

  /** Retrieves the VoucherId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The VoucherId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the VoucherId field
   */
   public String getVoucherIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherIdAsFormattedString");
       return fmtMgr.formatString(this.getVoucherId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("VoucherId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getVoucherIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the VoucherId field from a formatted string
   *
   * @param _value the VoucherId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the VoucherId field
   */
   public void setVoucherIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setVoucherId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("VoucherId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setVoucherIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setVoucherIdFromFormattedString");
   }

  /** set the fields value: VoucherTypeId (VOUCHER_DEFINITIONS.voucher_type_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("VoucherTypeId") 
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
    this.VoucherTypeId = value;
    this._VoucherTypeIdSet = true;
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

  /** get the value of the field: VoucherTypeId (VOUCHER_DEFINITIONS.voucher_type_id)
   * @return BigInteger the value
   */
  public BigInteger getVoucherTypeId () {
    return this.VoucherTypeId;
  }
  /** Change the field to not being actively set: VoucherTypeId (VOUCHER_DEFINITIONS.voucher_type_id)
   */
  public void unsetVoucherTypeId () {
    this._VoucherTypeIdSet = false;
  }
  /** See if the field is actively set: VoucherTypeId (VOUCHER_DEFINITIONS.voucher_type_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetVoucherTypeId () {
    return this._VoucherTypeIdSet;
  }
  /** set the fields value: UniqueVoucherId (VOUCHER_DEFINITIONS.unique_voucher_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UniqueVoucherId") 
  public void setUniqueVoucherId (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "UniqueVoucherId", "setUniqueVoucherId");
    }
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "UniqueVoucherId", "setUniqueVoucherId");
    }
    this.UniqueVoucherId = value;
    this._UniqueVoucherIdSet = true;
  }

  /** Retrieves the UniqueVoucherId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UniqueVoucherId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UniqueVoucherId field
   */
   public String getUniqueVoucherIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUniqueVoucherIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUniqueVoucherIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getUniqueVoucherId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UniqueVoucherId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUniqueVoucherIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the UniqueVoucherId field from a formatted string
   *
   * @param _value the UniqueVoucherId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UniqueVoucherId field
   */
   public void setUniqueVoucherIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUniqueVoucherIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUniqueVoucherId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UniqueVoucherId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUniqueVoucherIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUniqueVoucherIdFromFormattedString");
   }

  /** get the value of the field: UniqueVoucherId (VOUCHER_DEFINITIONS.unique_voucher_id)
   * @return BigInteger the value
   */
  public BigInteger getUniqueVoucherId () {
    return this.UniqueVoucherId;
  }
  /** Change the field to not being actively set: UniqueVoucherId (VOUCHER_DEFINITIONS.unique_voucher_id)
   */
  public void unsetUniqueVoucherId () {
    this._UniqueVoucherIdSet = false;
  }
  /** See if the field is actively set: UniqueVoucherId (VOUCHER_DEFINITIONS.unique_voucher_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetUniqueVoucherId () {
    return this._UniqueVoucherIdSet;
  }
  /** set the fields value: PinCode1 (VOUCHER_DEFINITIONS.pin_code1)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PinCode1") 
  public void setPinCode1 (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PinCode1", "setPinCode1");
    }
    if (value != null && !DataHelper.validLength (value, 100))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "PinCode1", "setPinCode1");
    }
    this.PinCode1 = value;
    this._PinCode1Set = true;
  }

  /** Retrieves the PinCode1 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PinCode1 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PinCode1 field
   */
   public String getPinCode1AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPinCode1AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPinCode1AsFormattedString");
       return fmtMgr.formatString(this.getPinCode1());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PinCode1");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPinCode1AsFormattedString");
       throw x;
     }
   }
  /** Sets the PinCode1 field from a formatted string
   *
   * @param _value the PinCode1 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PinCode1 field
   */
   public void setPinCode1FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPinCode1FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPinCode1(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PinCode1");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPinCode1FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPinCode1FromFormattedString");
   }

  /** get the value of the field: PinCode1 (VOUCHER_DEFINITIONS.pin_code1)
   * @return String the value
   */
  public String getPinCode1 () {
    return this.PinCode1;
  }
  /** Change the field to not being actively set: PinCode1 (VOUCHER_DEFINITIONS.pin_code1)
   */
  public void unsetPinCode1 () {
    this._PinCode1Set = false;
  }
  /** See if the field is actively set: PinCode1 (VOUCHER_DEFINITIONS.pin_code1)
   * @return boolean whether the field is actively set
   */
  public boolean issetPinCode1 () {
    return this._PinCode1Set;
  }
  /** set the fields value: PinCode2 (VOUCHER_DEFINITIONS.pin_code2)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PinCode2") 
  public void setPinCode2 (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PinCode2", "setPinCode2");
    }
    if (value != null && !DataHelper.validLength (value, 100))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "PinCode2", "setPinCode2");
    }
    this.PinCode2 = value;
    this._PinCode2Set = true;
  }

  /** Retrieves the PinCode2 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PinCode2 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PinCode2 field
   */
   public String getPinCode2AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPinCode2AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPinCode2AsFormattedString");
       return fmtMgr.formatString(this.getPinCode2());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PinCode2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPinCode2AsFormattedString");
       throw x;
     }
   }
  /** Sets the PinCode2 field from a formatted string
   *
   * @param _value the PinCode2 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PinCode2 field
   */
   public void setPinCode2FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPinCode2FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPinCode2(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PinCode2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPinCode2FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPinCode2FromFormattedString");
   }

  /** get the value of the field: PinCode2 (VOUCHER_DEFINITIONS.pin_code2)
   * @return String the value
   */
  public String getPinCode2 () {
    return this.PinCode2;
  }
  /** Change the field to not being actively set: PinCode2 (VOUCHER_DEFINITIONS.pin_code2)
   */
  public void unsetPinCode2 () {
    this._PinCode2Set = false;
  }
  /** See if the field is actively set: PinCode2 (VOUCHER_DEFINITIONS.pin_code2)
   * @return boolean whether the field is actively set
   */
  public boolean issetPinCode2 () {
    return this._PinCode2Set;
  }
  /** set the fields value: UnitCreditContractId (VOUCHER_DEFINITIONS.unit_credit_contract_id)
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

  /** get the value of the field: UnitCreditContractId (VOUCHER_DEFINITIONS.unit_credit_contract_id)
   * @return BigInteger the value
   */
  public BigInteger getUnitCreditContractId () {
    return this.UnitCreditContractId;
  }
  /** Change the field to not being actively set: UnitCreditContractId (VOUCHER_DEFINITIONS.unit_credit_contract_id)
   */
  public void unsetUnitCreditContractId () {
    this._UnitCreditContractIdSet = false;
  }
  /** See if the field is actively set: UnitCreditContractId (VOUCHER_DEFINITIONS.unit_credit_contract_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetUnitCreditContractId () {
    return this._UnitCreditContractIdSet;
  }
  /** set the fields value: NumberOfUnits (VOUCHER_DEFINITIONS.number_of_units)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("NumberOfUnits") 
  public void setNumberOfUnits (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "NumberOfUnits", "setNumberOfUnits");
    }
    this.NumberOfUnits = value;
    this._NumberOfUnitsSet = true;
  }

  /** Retrieves the NumberOfUnits field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The NumberOfUnits field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NumberOfUnits field
   */
   public String getNumberOfUnitsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNumberOfUnitsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNumberOfUnitsAsFormattedString");
       return fmtMgr.formatBigInteger(this.getNumberOfUnits(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NumberOfUnits");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getNumberOfUnitsAsFormattedString");
       throw x;
     }
   }
  /** Sets the NumberOfUnits field from a formatted string
   *
   * @param _value the NumberOfUnits field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NumberOfUnits field
   */
   public void setNumberOfUnitsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNumberOfUnitsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setNumberOfUnits(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NumberOfUnits");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setNumberOfUnitsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNumberOfUnitsFromFormattedString");
   }

  /** get the value of the field: NumberOfUnits (VOUCHER_DEFINITIONS.number_of_units)
   * @return BigInteger the value
   */
  public BigInteger getNumberOfUnits () {
    return this.NumberOfUnits;
  }
  /** Change the field to not being actively set: NumberOfUnits (VOUCHER_DEFINITIONS.number_of_units)
   */
  public void unsetNumberOfUnits () {
    this._NumberOfUnitsSet = false;
  }
  /** See if the field is actively set: NumberOfUnits (VOUCHER_DEFINITIONS.number_of_units)
   * @return boolean whether the field is actively set
   */
  public boolean issetNumberOfUnits () {
    return this._NumberOfUnitsSet;
  }
  /** set the fields value: Amount (VOUCHER_DEFINITIONS.amount)
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

  /** get the value of the field: Amount (VOUCHER_DEFINITIONS.amount)
   * @return BigInteger the value
   */
  public BigInteger getAmount () {
    return this.Amount;
  }
  /** Change the field to not being actively set: Amount (VOUCHER_DEFINITIONS.amount)
   */
  public void unsetAmount () {
    this._AmountSet = false;
  }
  /** See if the field is actively set: Amount (VOUCHER_DEFINITIONS.amount)
   * @return boolean whether the field is actively set
   */
  public boolean issetAmount () {
    return this._AmountSet;
  }
  /** set the fields value: CurrencyCode (VOUCHER_DEFINITIONS.currency_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CurrencyCode") 
  public void setCurrencyCode (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CurrencyCode", "setCurrencyCode");
    }
    if (value != null && !DataHelper.validLength (value, 6))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CurrencyCode", "setCurrencyCode");
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
       return fmtMgr.formatBigInteger(this.getCurrencyCode(), _locale);
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
       this.setCurrencyCode(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCurrencyCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCurrencyCodeFromFormattedString");
   }

  /** get the value of the field: CurrencyCode (VOUCHER_DEFINITIONS.currency_code)
   * @return BigInteger the value
   */
  public BigInteger getCurrencyCode () {
    return this.CurrencyCode;
  }
  /** Change the field to not being actively set: CurrencyCode (VOUCHER_DEFINITIONS.currency_code)
   */
  public void unsetCurrencyCode () {
    this._CurrencyCodeSet = false;
  }
  /** See if the field is actively set: CurrencyCode (VOUCHER_DEFINITIONS.currency_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCurrencyCode () {
    return this._CurrencyCodeSet;
  }
  /** set the fields value: LocationCode (VOUCHER_DEFINITIONS.location_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("LocationCode") 
  public void setLocationCode (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "LocationCode", "setLocationCode");
    }
    if (value != null && !DataHelper.validLength (value, 6))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "LocationCode", "setLocationCode");
    }
    this.LocationCode = value;
    this._LocationCodeSet = true;
  }

  /** Retrieves the LocationCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The LocationCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LocationCode field
   */
   public String getLocationCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLocationCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLocationCodeAsFormattedString");
       return fmtMgr.formatBigInteger(this.getLocationCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LocationCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getLocationCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the LocationCode field from a formatted string
   *
   * @param _value the LocationCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the LocationCode field
   */
   public void setLocationCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLocationCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setLocationCode(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LocationCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setLocationCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLocationCodeFromFormattedString");
   }

  /** get the value of the field: LocationCode (VOUCHER_DEFINITIONS.location_code)
   * @return BigInteger the value
   */
  public BigInteger getLocationCode () {
    return this.LocationCode;
  }
  /** Change the field to not being actively set: LocationCode (VOUCHER_DEFINITIONS.location_code)
   */
  public void unsetLocationCode () {
    this._LocationCodeSet = false;
  }
  /** See if the field is actively set: LocationCode (VOUCHER_DEFINITIONS.location_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetLocationCode () {
    return this._LocationCodeSet;
  }
  /** set the fields value: BatchId (VOUCHER_DEFINITIONS.batch_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BatchId") 
  public void setBatchId (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BatchId", "setBatchId");
    }
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BatchId", "setBatchId");
    }
    this.BatchId = value;
    this._BatchIdSet = true;
  }

  /** Retrieves the BatchId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BatchId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BatchId field
   */
   public String getBatchIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBatchIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBatchIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getBatchId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BatchId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBatchIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the BatchId field from a formatted string
   *
   * @param _value the BatchId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BatchId field
   */
   public void setBatchIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBatchIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBatchId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BatchId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBatchIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBatchIdFromFormattedString");
   }

  /** get the value of the field: BatchId (VOUCHER_DEFINITIONS.batch_id)
   * @return BigInteger the value
   */
  public BigInteger getBatchId () {
    return this.BatchId;
  }
  /** Change the field to not being actively set: BatchId (VOUCHER_DEFINITIONS.batch_id)
   */
  public void unsetBatchId () {
    this._BatchIdSet = false;
  }
  /** See if the field is actively set: BatchId (VOUCHER_DEFINITIONS.batch_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetBatchId () {
    return this._BatchIdSet;
  }
  /** set the fields value: CheckSum (VOUCHER_DEFINITIONS.check_sum)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CheckSum") 
  public void setCheckSum (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CheckSum", "setCheckSum");
    }
    if (value != null && !DataHelper.validLength (value, 100))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CheckSum", "setCheckSum");
    }
    this.CheckSum = value;
    this._CheckSumSet = true;
  }

  /** Retrieves the CheckSum field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CheckSum field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CheckSum field
   */
   public String getCheckSumAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCheckSumAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCheckSumAsFormattedString");
       return fmtMgr.formatString(this.getCheckSum());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CheckSum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCheckSumAsFormattedString");
       throw x;
     }
   }
  /** Sets the CheckSum field from a formatted string
   *
   * @param _value the CheckSum field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CheckSum field
   */
   public void setCheckSumFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCheckSumFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCheckSum(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CheckSum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCheckSumFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCheckSumFromFormattedString");
   }

  /** get the value of the field: CheckSum (VOUCHER_DEFINITIONS.check_sum)
   * @return String the value
   */
  public String getCheckSum () {
    return this.CheckSum;
  }
  /** Change the field to not being actively set: CheckSum (VOUCHER_DEFINITIONS.check_sum)
   */
  public void unsetCheckSum () {
    this._CheckSumSet = false;
  }
  /** See if the field is actively set: CheckSum (VOUCHER_DEFINITIONS.check_sum)
   * @return boolean whether the field is actively set
   */
  public boolean issetCheckSum () {
    return this._CheckSumSet;
  }
  public String toString() {
    return VoucherDefinitionsObjectHelper.toMap(this, null).toString();
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
  /** VOUCHER_DEFINITIONS.voucher_type_id field */
    if(!nonNullOnly || (VoucherTypeId != null))  _VoucherTypeIdSet = flag;
  /** VOUCHER_DEFINITIONS.unique_voucher_id field */
    if(!nonNullOnly || (UniqueVoucherId != null))  _UniqueVoucherIdSet = flag;
  /** VOUCHER_DEFINITIONS.pin_code1 field */
    if(!nonNullOnly || (PinCode1 != null))  _PinCode1Set = flag;
  /** VOUCHER_DEFINITIONS.pin_code2 field */
    if(!nonNullOnly || (PinCode2 != null))  _PinCode2Set = flag;
  /** VOUCHER_DEFINITIONS.unit_credit_contract_id field */
    if(!nonNullOnly || (UnitCreditContractId != null))  _UnitCreditContractIdSet = flag;
  /** VOUCHER_DEFINITIONS.number_of_units field */
    if(!nonNullOnly || (NumberOfUnits != null))  _NumberOfUnitsSet = flag;
  /** VOUCHER_DEFINITIONS.amount field */
    if(!nonNullOnly || (Amount != null))  _AmountSet = flag;
  /** VOUCHER_DEFINITIONS.currency_code field */
    if(!nonNullOnly || (CurrencyCode != null))  _CurrencyCodeSet = flag;
  /** VOUCHER_DEFINITIONS.location_code field */
    if(!nonNullOnly || (LocationCode != null))  _LocationCodeSet = flag;
  /** VOUCHER_DEFINITIONS.batch_id field */
    if(!nonNullOnly || (BatchId != null))  _BatchIdSet = flag;
  /** VOUCHER_DEFINITIONS.check_sum field */
    if(!nonNullOnly || (CheckSum != null))  _CheckSumSet = flag;
  }
}
