/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: RDOverrideObjectData.java
 * Definition File: Customer/OverrideDiscountRate.xml
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
  
/** RDOverrideObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class RDOverrideObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public RDOverrideObjectKeyData Key = null;
  /** RATE_DISCOUNT_OVERRIDES.contract_tracking_id field */
  public    Integer ContractTrackingId  = null;
  protected boolean _ContractTrackingIdSet = false;
  /** RATE_DISCOUNT_OVERRIDES.contract_tracking_id_serv field */
  public    Integer ContractTrackingIdServ  = null;
  protected boolean _ContractTrackingIdServSet = false;
  /** RATE_DISCOUNT_OVERRIDES.discount_id field */
  public    Integer DiscountId  = null;
  protected boolean _DiscountIdSet = false;
  /** RATE_DISCOUNT_OVERRIDES.range_origin field */
  public    BigInteger RangeOrigin  = null;
  protected boolean _RangeOriginSet = false;
  /** RATE_DISCOUNT_OVERRIDES.range_terminus field */
  public    BigInteger RangeTerminus  = null;
  protected boolean _RangeTerminusSet = false;
  /** RATE_DISCOUNT_OVERRIDES.billing_frequency field */
  public    Integer BillingFrequency  = null;
  protected boolean _BillingFrequencySet = false;
  /** RATE_DISCOUNT_OVERRIDES.currency_code field */
  public    Integer CurrencyCode  = null;
  protected boolean _CurrencyCodeSet = false;
  /** RATE_DISCOUNT_OVERRIDES.discount_percent field */
  public    Integer DiscountPercent  = null;
  protected boolean _DiscountPercentSet = false;
  /** RATE_DISCOUNT_OVERRIDES.implied_decimals field */
  public    Integer ImpliedDecimals  = null;
  protected boolean _ImpliedDecimalsSet = false;
  /** RATE_DISCOUNT_OVERRIDES.discount_amount field */
  public    BigInteger DiscountAmount  = null;
  protected boolean _DiscountAmountSet = false;
  /** RATE_DISCOUNT_OVERRIDES.create_dt field */
  public    Date CreateDt  = null;
  protected boolean _CreateDtSet = false;
  /** RATE_DISCOUNT_OVERRIDES.chg_dt field */
  public    Date ChgDt  = null;
  protected boolean _ChgDtSet = false;
  /** RATE_DISCOUNT_OVERRIDES.chg_who field */
  public    String ChgWho  = null;
  protected boolean _ChgWhoSet = false;
  /** RATE_DISCOUNT_OVERRIDES.task_mode field */
  public    Integer TaskMode  = null;
  protected boolean _TaskModeSet = false;
  /** RATE_DISCOUNT_OVERRIDES.active_dt field */
  public    Date ActiveDt  = null;
  protected boolean _ActiveDtSet = false;
  /** RATE_DISCOUNT_OVERRIDES.inactive_dt field */
  public    Date InactiveDt  = null;
  protected boolean _InactiveDtSet = false;
  private String _objName = "RDOverrideObjectData";
  /** Default constructor */
  public RDOverrideObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public RDOverrideObjectData (RDOverrideObjectData other)
  {

    if (other == null) return;
    this.Key = new RDOverrideObjectKeyData (other.Key);
    this.ContractTrackingId = other.ContractTrackingId;
    this._ContractTrackingIdSet = other._ContractTrackingIdSet;
    this.ContractTrackingIdServ = other.ContractTrackingIdServ;
    this._ContractTrackingIdServSet = other._ContractTrackingIdServSet;
    this.DiscountId = other.DiscountId;
    this._DiscountIdSet = other._DiscountIdSet;
    this.RangeOrigin = other.RangeOrigin;
    this._RangeOriginSet = other._RangeOriginSet;
    this.RangeTerminus = other.RangeTerminus;
    this._RangeTerminusSet = other._RangeTerminusSet;
    this.BillingFrequency = other.BillingFrequency;
    this._BillingFrequencySet = other._BillingFrequencySet;
    this.CurrencyCode = other.CurrencyCode;
    this._CurrencyCodeSet = other._CurrencyCodeSet;
    this.DiscountPercent = other.DiscountPercent;
    this._DiscountPercentSet = other._DiscountPercentSet;
    this.ImpliedDecimals = other.ImpliedDecimals;
    this._ImpliedDecimalsSet = other._ImpliedDecimalsSet;
    this.DiscountAmount = other.DiscountAmount;
    this._DiscountAmountSet = other._DiscountAmountSet;
    this.CreateDt = other.CreateDt;
    this._CreateDtSet = other._CreateDtSet;
    this.ChgDt = other.ChgDt;
    this._ChgDtSet = other._ChgDtSet;
    this.ChgWho = other.ChgWho;
    this._ChgWhoSet = other._ChgWhoSet;
    this.TaskMode = other.TaskMode;
    this._TaskModeSet = other._TaskModeSet;
    this.ActiveDt = other.ActiveDt;
    this._ActiveDtSet = other._ActiveDtSet;
    this.InactiveDt = other.InactiveDt;
    this._InactiveDtSet = other._InactiveDtSet;
  }

  /** get the Key for this object
   * @return RDOverrideObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public RDOverrideObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (RDOverrideObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: OverrideTrackingId (RATE_DISCOUNT_OVERRIDES.override_tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setOverrideTrackingId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "OverrideTrackingId", "setOverrideTrackingId");
    }
    if (this.Key == null) this.Key = new RDOverrideObjectKeyData ();
    this.Key.OverrideTrackingId = value;
    this.Key._OverrideTrackingIdSet = true;
  }
  /** get the value of the field: OverrideTrackingId (RATE_DISCOUNT_OVERRIDES.override_tracking_id)
   * @return Integer the value
   */
  public Integer getOverrideTrackingId () {
    if (this.Key == null) return null;
    return this.Key.OverrideTrackingId;
  }
  /** Change the field to not being actively set: OverrideTrackingId (RATE_DISCOUNT_OVERRIDES.override_tracking_id)
   */
  public void unsetOverrideTrackingId () {
    if (this.Key == null) return;
    this.Key._OverrideTrackingIdSet = false;
  }
  /** See if the field is actively set: OverrideTrackingId (RATE_DISCOUNT_OVERRIDES.override_tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetOverrideTrackingId () {
    if (this.Key == null) return false;
    return this.Key._OverrideTrackingIdSet;
  }

  /** Retrieves the OverrideTrackingId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OverrideTrackingId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OverrideTrackingId field
   */
   public String getOverrideTrackingIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOverrideTrackingIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOverrideTrackingIdAsFormattedString");
       return fmtMgr.formatNumber(this.getOverrideTrackingId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OverrideTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOverrideTrackingIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the OverrideTrackingId field from a formatted string
   *
   * @param _value the OverrideTrackingId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OverrideTrackingId field
   */
   public void setOverrideTrackingIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOverrideTrackingIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOverrideTrackingId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OverrideTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOverrideTrackingIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOverrideTrackingIdFromFormattedString");
   }

  /** set the fields value: OverrideTrackingIdServ (RATE_DISCOUNT_OVERRIDES.override_tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setOverrideTrackingIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "OverrideTrackingIdServ", "setOverrideTrackingIdServ");
    }
    if (this.Key == null) this.Key = new RDOverrideObjectKeyData ();
    this.Key.OverrideTrackingIdServ = value;
    this.Key._OverrideTrackingIdServSet = true;
  }
  /** get the value of the field: OverrideTrackingIdServ (RATE_DISCOUNT_OVERRIDES.override_tracking_id_serv)
   * @return Integer the value
   */
  public Integer getOverrideTrackingIdServ () {
    if (this.Key == null) return null;
    return this.Key.OverrideTrackingIdServ;
  }
  /** Change the field to not being actively set: OverrideTrackingIdServ (RATE_DISCOUNT_OVERRIDES.override_tracking_id_serv)
   */
  public void unsetOverrideTrackingIdServ () {
    if (this.Key == null) return;
    this.Key._OverrideTrackingIdServSet = false;
  }
  /** See if the field is actively set: OverrideTrackingIdServ (RATE_DISCOUNT_OVERRIDES.override_tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetOverrideTrackingIdServ () {
    if (this.Key == null) return false;
    return this.Key._OverrideTrackingIdServSet;
  }

  /** Retrieves the OverrideTrackingIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OverrideTrackingIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OverrideTrackingIdServ field
   */
   public String getOverrideTrackingIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOverrideTrackingIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOverrideTrackingIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getOverrideTrackingIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OverrideTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOverrideTrackingIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the OverrideTrackingIdServ field from a formatted string
   *
   * @param _value the OverrideTrackingIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OverrideTrackingIdServ field
   */
   public void setOverrideTrackingIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOverrideTrackingIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOverrideTrackingIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OverrideTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOverrideTrackingIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOverrideTrackingIdServFromFormattedString");
   }

  /** set the fields value: ContractTrackingId (RATE_DISCOUNT_OVERRIDES.contract_tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ContractTrackingId") 
  public void setContractTrackingId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ContractTrackingId", "setContractTrackingId");
    }
    this.ContractTrackingId = value;
    this._ContractTrackingIdSet = true;
  }

  /** Retrieves the ContractTrackingId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ContractTrackingId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ContractTrackingId field
   */
   public String getContractTrackingIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractTrackingIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContractTrackingIdAsFormattedString");
       return fmtMgr.formatNumber(this.getContractTrackingId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContractTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getContractTrackingIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ContractTrackingId field from a formatted string
   *
   * @param _value the ContractTrackingId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ContractTrackingId field
   */
   public void setContractTrackingIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractTrackingIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setContractTrackingId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContractTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setContractTrackingIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContractTrackingIdFromFormattedString");
   }

  /** get the value of the field: ContractTrackingId (RATE_DISCOUNT_OVERRIDES.contract_tracking_id)
   * @return Integer the value
   */
  public Integer getContractTrackingId () {
    return this.ContractTrackingId;
  }
  /** Change the field to not being actively set: ContractTrackingId (RATE_DISCOUNT_OVERRIDES.contract_tracking_id)
   */
  public void unsetContractTrackingId () {
    this._ContractTrackingIdSet = false;
  }
  /** See if the field is actively set: ContractTrackingId (RATE_DISCOUNT_OVERRIDES.contract_tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetContractTrackingId () {
    return this._ContractTrackingIdSet;
  }
  /** set the fields value: ContractTrackingIdServ (RATE_DISCOUNT_OVERRIDES.contract_tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ContractTrackingIdServ") 
  public void setContractTrackingIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ContractTrackingIdServ", "setContractTrackingIdServ");
    }
    this.ContractTrackingIdServ = value;
    this._ContractTrackingIdServSet = true;
  }

  /** Retrieves the ContractTrackingIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ContractTrackingIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ContractTrackingIdServ field
   */
   public String getContractTrackingIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractTrackingIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContractTrackingIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getContractTrackingIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContractTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getContractTrackingIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the ContractTrackingIdServ field from a formatted string
   *
   * @param _value the ContractTrackingIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ContractTrackingIdServ field
   */
   public void setContractTrackingIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractTrackingIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setContractTrackingIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContractTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setContractTrackingIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContractTrackingIdServFromFormattedString");
   }

  /** get the value of the field: ContractTrackingIdServ (RATE_DISCOUNT_OVERRIDES.contract_tracking_id_serv)
   * @return Integer the value
   */
  public Integer getContractTrackingIdServ () {
    return this.ContractTrackingIdServ;
  }
  /** Change the field to not being actively set: ContractTrackingIdServ (RATE_DISCOUNT_OVERRIDES.contract_tracking_id_serv)
   */
  public void unsetContractTrackingIdServ () {
    this._ContractTrackingIdServSet = false;
  }
  /** See if the field is actively set: ContractTrackingIdServ (RATE_DISCOUNT_OVERRIDES.contract_tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetContractTrackingIdServ () {
    return this._ContractTrackingIdServSet;
  }
  /** set the fields value: DiscountId (RATE_DISCOUNT_OVERRIDES.discount_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DiscountId") 
  public void setDiscountId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DiscountId", "setDiscountId");
    }
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

  /** get the value of the field: DiscountId (RATE_DISCOUNT_OVERRIDES.discount_id)
   * @return Integer the value
   */
  public Integer getDiscountId () {
    return this.DiscountId;
  }
  /** Change the field to not being actively set: DiscountId (RATE_DISCOUNT_OVERRIDES.discount_id)
   */
  public void unsetDiscountId () {
    this._DiscountIdSet = false;
  }
  /** See if the field is actively set: DiscountId (RATE_DISCOUNT_OVERRIDES.discount_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetDiscountId () {
    return this._DiscountIdSet;
  }
  /** set the fields value: RangeOrigin (RATE_DISCOUNT_OVERRIDES.range_origin)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RangeOrigin") 
  public void setRangeOrigin (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "RangeOrigin", "setRangeOrigin");
    }
    this.RangeOrigin = value;
    this._RangeOriginSet = true;
  }

  /** Retrieves the RangeOrigin field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RangeOrigin field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RangeOrigin field
   */
   public String getRangeOriginAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRangeOriginAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRangeOriginAsFormattedString");
       return fmtMgr.formatBigInteger(this.getRangeOrigin(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RangeOrigin");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRangeOriginAsFormattedString");
       throw x;
     }
   }
  /** Sets the RangeOrigin field from a formatted string
   *
   * @param _value the RangeOrigin field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RangeOrigin field
   */
   public void setRangeOriginFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRangeOriginFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRangeOrigin(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RangeOrigin");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRangeOriginFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRangeOriginFromFormattedString");
   }

  /** get the value of the field: RangeOrigin (RATE_DISCOUNT_OVERRIDES.range_origin)
   * @return BigInteger the value
   */
  public BigInteger getRangeOrigin () {
    return this.RangeOrigin;
  }
  /** Change the field to not being actively set: RangeOrigin (RATE_DISCOUNT_OVERRIDES.range_origin)
   */
  public void unsetRangeOrigin () {
    this._RangeOriginSet = false;
  }
  /** See if the field is actively set: RangeOrigin (RATE_DISCOUNT_OVERRIDES.range_origin)
   * @return boolean whether the field is actively set
   */
  public boolean issetRangeOrigin () {
    return this._RangeOriginSet;
  }
  /** set the fields value: RangeTerminus (RATE_DISCOUNT_OVERRIDES.range_terminus)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RangeTerminus") 
  public void setRangeTerminus (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "RangeTerminus", "setRangeTerminus");
    }
    this.RangeTerminus = value;
    this._RangeTerminusSet = true;
  }

  /** Retrieves the RangeTerminus field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RangeTerminus field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RangeTerminus field
   */
   public String getRangeTerminusAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRangeTerminusAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRangeTerminusAsFormattedString");
       return fmtMgr.formatBigInteger(this.getRangeTerminus(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RangeTerminus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRangeTerminusAsFormattedString");
       throw x;
     }
   }
  /** Sets the RangeTerminus field from a formatted string
   *
   * @param _value the RangeTerminus field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RangeTerminus field
   */
   public void setRangeTerminusFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRangeTerminusFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRangeTerminus(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RangeTerminus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRangeTerminusFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRangeTerminusFromFormattedString");
   }

  /** get the value of the field: RangeTerminus (RATE_DISCOUNT_OVERRIDES.range_terminus)
   * @return BigInteger the value
   */
  public BigInteger getRangeTerminus () {
    return this.RangeTerminus;
  }
  /** Change the field to not being actively set: RangeTerminus (RATE_DISCOUNT_OVERRIDES.range_terminus)
   */
  public void unsetRangeTerminus () {
    this._RangeTerminusSet = false;
  }
  /** See if the field is actively set: RangeTerminus (RATE_DISCOUNT_OVERRIDES.range_terminus)
   * @return boolean whether the field is actively set
   */
  public boolean issetRangeTerminus () {
    return this._RangeTerminusSet;
  }
  /** set the fields value: BillingFrequency (RATE_DISCOUNT_OVERRIDES.billing_frequency)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillingFrequency") 
  public void setBillingFrequency (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillingFrequency", "setBillingFrequency");
    }
    this.BillingFrequency = value;
    this._BillingFrequencySet = true;
  }

  /** Retrieves the BillingFrequency field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillingFrequency field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillingFrequency field
   */
   public String getBillingFrequencyAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillingFrequencyAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillingFrequencyAsFormattedString");
       return fmtMgr.formatNumber(this.getBillingFrequency(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillingFrequency");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillingFrequencyAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillingFrequency field from a formatted string
   *
   * @param _value the BillingFrequency field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillingFrequency field
   */
   public void setBillingFrequencyFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillingFrequencyFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillingFrequency(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillingFrequency");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillingFrequencyFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillingFrequencyFromFormattedString");
   }

  /** get the value of the field: BillingFrequency (RATE_DISCOUNT_OVERRIDES.billing_frequency)
   * @return Integer the value
   */
  public Integer getBillingFrequency () {
    return this.BillingFrequency;
  }
  /** Change the field to not being actively set: BillingFrequency (RATE_DISCOUNT_OVERRIDES.billing_frequency)
   */
  public void unsetBillingFrequency () {
    this._BillingFrequencySet = false;
  }
  /** See if the field is actively set: BillingFrequency (RATE_DISCOUNT_OVERRIDES.billing_frequency)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillingFrequency () {
    return this._BillingFrequencySet;
  }
  /** set the fields value: CurrencyCode (RATE_DISCOUNT_OVERRIDES.currency_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CurrencyCode") 
  public void setCurrencyCode (Integer value) throws ServiceException
  {
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

  /** get the value of the field: CurrencyCode (RATE_DISCOUNT_OVERRIDES.currency_code)
   * @return Integer the value
   */
  public Integer getCurrencyCode () {
    return this.CurrencyCode;
  }
  /** Change the field to not being actively set: CurrencyCode (RATE_DISCOUNT_OVERRIDES.currency_code)
   */
  public void unsetCurrencyCode () {
    this._CurrencyCodeSet = false;
  }
  /** See if the field is actively set: CurrencyCode (RATE_DISCOUNT_OVERRIDES.currency_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCurrencyCode () {
    return this._CurrencyCodeSet;
  }
  /** set the fields value: DiscountPercent (RATE_DISCOUNT_OVERRIDES.discount_percent)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DiscountPercent") 
  public void setDiscountPercent (Integer value) throws ServiceException
  {
    this.DiscountPercent = value;
    this._DiscountPercentSet = true;
  }

  /** Retrieves the DiscountPercent field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DiscountPercent field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DiscountPercent field
   */
   public String getDiscountPercentAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountPercentAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscountPercentAsFormattedString");
       return fmtMgr.formatNumber(this.getDiscountPercent(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DiscountPercent");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDiscountPercentAsFormattedString");
       throw x;
     }
   }
  /** Sets the DiscountPercent field from a formatted string
   *
   * @param _value the DiscountPercent field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DiscountPercent field
   */
   public void setDiscountPercentFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountPercentFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDiscountPercent(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DiscountPercent");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDiscountPercentFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDiscountPercentFromFormattedString");
   }

  /** get the value of the field: DiscountPercent (RATE_DISCOUNT_OVERRIDES.discount_percent)
   * @return Integer the value
   */
  public Integer getDiscountPercent () {
    return this.DiscountPercent;
  }
  /** Change the field to not being actively set: DiscountPercent (RATE_DISCOUNT_OVERRIDES.discount_percent)
   */
  public void unsetDiscountPercent () {
    this._DiscountPercentSet = false;
  }
  /** See if the field is actively set: DiscountPercent (RATE_DISCOUNT_OVERRIDES.discount_percent)
   * @return boolean whether the field is actively set
   */
  public boolean issetDiscountPercent () {
    return this._DiscountPercentSet;
  }
  /** set the fields value: ImpliedDecimals (RATE_DISCOUNT_OVERRIDES.implied_decimals)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ImpliedDecimals") 
  public void setImpliedDecimals (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ImpliedDecimals", "setImpliedDecimals");
    }
    this.ImpliedDecimals = value;
    this._ImpliedDecimalsSet = true;
  }

  /** Retrieves the ImpliedDecimals field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ImpliedDecimals field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ImpliedDecimals field
   */
   public String getImpliedDecimalsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getImpliedDecimalsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getImpliedDecimalsAsFormattedString");
       return fmtMgr.formatNumber(this.getImpliedDecimals(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ImpliedDecimals");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getImpliedDecimalsAsFormattedString");
       throw x;
     }
   }
  /** Sets the ImpliedDecimals field from a formatted string
   *
   * @param _value the ImpliedDecimals field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ImpliedDecimals field
   */
   public void setImpliedDecimalsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getImpliedDecimalsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setImpliedDecimals(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ImpliedDecimals");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setImpliedDecimalsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setImpliedDecimalsFromFormattedString");
   }

  /** get the value of the field: ImpliedDecimals (RATE_DISCOUNT_OVERRIDES.implied_decimals)
   * @return Integer the value
   */
  public Integer getImpliedDecimals () {
    return this.ImpliedDecimals;
  }
  /** Change the field to not being actively set: ImpliedDecimals (RATE_DISCOUNT_OVERRIDES.implied_decimals)
   */
  public void unsetImpliedDecimals () {
    this._ImpliedDecimalsSet = false;
  }
  /** See if the field is actively set: ImpliedDecimals (RATE_DISCOUNT_OVERRIDES.implied_decimals)
   * @return boolean whether the field is actively set
   */
  public boolean issetImpliedDecimals () {
    return this._ImpliedDecimalsSet;
  }
  /** set the fields value: DiscountAmount (RATE_DISCOUNT_OVERRIDES.discount_amount)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DiscountAmount") 
  public void setDiscountAmount (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "DiscountAmount", "setDiscountAmount");
    }
    this.DiscountAmount = value;
    this._DiscountAmountSet = true;
  }

  /** Retrieves the DiscountAmount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DiscountAmount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DiscountAmount field
   */
   public String getDiscountAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscountAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getDiscountAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DiscountAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDiscountAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the DiscountAmount field from a formatted string
   *
   * @param _value the DiscountAmount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DiscountAmount field
   */
   public void setDiscountAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDiscountAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DiscountAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDiscountAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDiscountAmountFromFormattedString");
   }

  /**
   * Retrieves the DiscountAmount field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DiscountAmount field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the DiscountAmount field
   */
  public String getDiscountAmountAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountAmountAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscountAmountAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getDiscountAmount(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DiscountAmount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDiscountAmountAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the DiscountAmount field value from a formatted currency string
   *
   * @param _value the DiscountAmount field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DiscountAmount field
   */
  public void setDiscountAmountFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDiscountAmountFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setDiscountAmount(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DiscountAmount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDiscountAmountFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDiscountAmountFromFormattedCurrencyString");
  }

  /** get the value of the field: DiscountAmount (RATE_DISCOUNT_OVERRIDES.discount_amount)
   * @return BigInteger the value
   */
  public BigInteger getDiscountAmount () {
    return this.DiscountAmount;
  }
  /** Change the field to not being actively set: DiscountAmount (RATE_DISCOUNT_OVERRIDES.discount_amount)
   */
  public void unsetDiscountAmount () {
    this._DiscountAmountSet = false;
  }
  /** See if the field is actively set: DiscountAmount (RATE_DISCOUNT_OVERRIDES.discount_amount)
   * @return boolean whether the field is actively set
   */
  public boolean issetDiscountAmount () {
    return this._DiscountAmountSet;
  }
  /** set the fields value: CreateDt (RATE_DISCOUNT_OVERRIDES.create_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CreateDt") 
  public void setCreateDt (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CreateDt", "setCreateDt");
    }
    this.CreateDt = value;
    this._CreateDtSet = true;
  }

  /** Retrieves the CreateDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CreateDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CreateDt field
   */
   public String getCreateDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreateDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCreateDtAsFormattedString");
       return fmtMgr.formatDate(this.getCreateDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CreateDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCreateDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the CreateDt field from a formatted string
   *
   * @param _value the CreateDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CreateDt field
   */
   public void setCreateDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreateDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCreateDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CreateDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCreateDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCreateDtFromFormattedString");
   }

  /**
   * Retrieves the CreateDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CreateDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the CreateDt field
   */
  public String getCreateDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreateDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCreateDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getCreateDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CreateDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCreateDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the CreateDt field value from a formatted date/time string
   *
   * @param _value the CreateDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CreateDt field
   */
  public void setCreateDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCreateDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setCreateDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CreateDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCreateDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: CreateDt (RATE_DISCOUNT_OVERRIDES.create_dt)
   * @return Date the value
   */
  public Date getCreateDt () {
    return this.CreateDt;
  }
  /** Change the field to not being actively set: CreateDt (RATE_DISCOUNT_OVERRIDES.create_dt)
   */
  public void unsetCreateDt () {
    this._CreateDtSet = false;
  }
  /** See if the field is actively set: CreateDt (RATE_DISCOUNT_OVERRIDES.create_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetCreateDt () {
    return this._CreateDtSet;
  }
  /** set the fields value: ChgDt (RATE_DISCOUNT_OVERRIDES.chg_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ChgDt") 
  public void setChgDt (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ChgDt", "setChgDt");
    }
    this.ChgDt = value;
    this._ChgDtSet = true;
  }

  /** Retrieves the ChgDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ChgDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDt field
   */
   public String getChgDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDtAsFormattedString");
       return fmtMgr.formatDate(this.getChgDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the ChgDt field from a formatted string
   *
   * @param _value the ChgDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChgDt field
   */
   public void setChgDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setChgDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgDtFromFormattedString");
   }

  /**
   * Retrieves the ChgDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDt field
   */
  public String getChgDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getChgDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ChgDt field value from a formatted date/time string
   *
   * @param _value the ChgDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChgDt field
   */
  public void setChgDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setChgDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: ChgDt (RATE_DISCOUNT_OVERRIDES.chg_dt)
   * @return Date the value
   */
  public Date getChgDt () {
    return this.ChgDt;
  }
  /** Change the field to not being actively set: ChgDt (RATE_DISCOUNT_OVERRIDES.chg_dt)
   */
  public void unsetChgDt () {
    this._ChgDtSet = false;
  }
  /** See if the field is actively set: ChgDt (RATE_DISCOUNT_OVERRIDES.chg_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgDt () {
    return this._ChgDtSet;
  }
  /** set the fields value: ChgWho (RATE_DISCOUNT_OVERRIDES.chg_who)
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

  /** get the value of the field: ChgWho (RATE_DISCOUNT_OVERRIDES.chg_who)
   * @return String the value
   */
  public String getChgWho () {
    return this.ChgWho;
  }
  /** Change the field to not being actively set: ChgWho (RATE_DISCOUNT_OVERRIDES.chg_who)
   */
  public void unsetChgWho () {
    this._ChgWhoSet = false;
  }
  /** See if the field is actively set: ChgWho (RATE_DISCOUNT_OVERRIDES.chg_who)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgWho () {
    return this._ChgWhoSet;
  }
  /** set the fields value: TaskMode (RATE_DISCOUNT_OVERRIDES.task_mode)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TaskMode") 
  public void setTaskMode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TaskMode", "setTaskMode");
    }
    this.TaskMode = value;
    this._TaskModeSet = true;
  }

  /** Retrieves the TaskMode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TaskMode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaskMode field
   */
   public String getTaskModeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaskModeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaskModeAsFormattedString");
       return fmtMgr.formatNumber(this.getTaskMode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaskMode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaskModeAsFormattedString");
       throw x;
     }
   }
  /** Sets the TaskMode field from a formatted string
   *
   * @param _value the TaskMode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TaskMode field
   */
   public void setTaskModeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaskModeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTaskMode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaskMode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaskModeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaskModeFromFormattedString");
   }

  /** get the value of the field: TaskMode (RATE_DISCOUNT_OVERRIDES.task_mode)
   * @return Integer the value
   */
  public Integer getTaskMode () {
    return this.TaskMode;
  }
  /** Change the field to not being actively set: TaskMode (RATE_DISCOUNT_OVERRIDES.task_mode)
   */
  public void unsetTaskMode () {
    this._TaskModeSet = false;
  }
  /** See if the field is actively set: TaskMode (RATE_DISCOUNT_OVERRIDES.task_mode)
   * @return boolean whether the field is actively set
   */
  public boolean issetTaskMode () {
    return this._TaskModeSet;
  }
  /** set the fields value: ActiveDt (RATE_DISCOUNT_OVERRIDES.active_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ActiveDt") 
  public void setActiveDt (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ActiveDt", "setActiveDt");
    }
    this.ActiveDt = value;
    this._ActiveDtSet = true;
  }

  /** Retrieves the ActiveDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ActiveDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActiveDt field
   */
   public String getActiveDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActiveDtAsFormattedString");
       return fmtMgr.formatDate(this.getActiveDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ActiveDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getActiveDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the ActiveDt field from a formatted string
   *
   * @param _value the ActiveDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ActiveDt field
   */
   public void setActiveDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setActiveDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ActiveDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setActiveDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setActiveDtFromFormattedString");
   }

  /**
   * Retrieves the ActiveDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ActiveDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActiveDt field
   */
  public String getActiveDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActiveDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getActiveDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getActiveDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ActiveDt field value from a formatted date/time string
   *
   * @param _value the ActiveDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ActiveDt field
   */
  public void setActiveDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setActiveDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setActiveDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setActiveDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: ActiveDt (RATE_DISCOUNT_OVERRIDES.active_dt)
   * @return Date the value
   */
  public Date getActiveDt () {
    return this.ActiveDt;
  }
  /** Change the field to not being actively set: ActiveDt (RATE_DISCOUNT_OVERRIDES.active_dt)
   */
  public void unsetActiveDt () {
    this._ActiveDtSet = false;
  }
  /** See if the field is actively set: ActiveDt (RATE_DISCOUNT_OVERRIDES.active_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetActiveDt () {
    return this._ActiveDtSet;
  }
  /** set the fields value: InactiveDt (RATE_DISCOUNT_OVERRIDES.inactive_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("InactiveDt") 
  public void setInactiveDt (Date value) throws ServiceException
  {
    this.InactiveDt = value;
    this._InactiveDtSet = true;
  }

  /** Retrieves the InactiveDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InactiveDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InactiveDt field
   */
   public String getInactiveDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInactiveDtAsFormattedString");
       return fmtMgr.formatDate(this.getInactiveDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InactiveDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInactiveDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the InactiveDt field from a formatted string
   *
   * @param _value the InactiveDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InactiveDt field
   */
   public void setInactiveDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInactiveDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InactiveDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInactiveDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInactiveDtFromFormattedString");
   }

  /**
   * Retrieves the InactiveDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InactiveDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the InactiveDt field
   */
  public String getInactiveDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInactiveDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getInactiveDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInactiveDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the InactiveDt field value from a formatted date/time string
   *
   * @param _value the InactiveDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InactiveDt field
   */
  public void setInactiveDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInactiveDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setInactiveDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInactiveDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: InactiveDt (RATE_DISCOUNT_OVERRIDES.inactive_dt)
   * @return Date the value
   */
  public Date getInactiveDt () {
    return this.InactiveDt;
  }
  /** Change the field to not being actively set: InactiveDt (RATE_DISCOUNT_OVERRIDES.inactive_dt)
   */
  public void unsetInactiveDt () {
    this._InactiveDtSet = false;
  }
  /** See if the field is actively set: InactiveDt (RATE_DISCOUNT_OVERRIDES.inactive_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetInactiveDt () {
    return this._InactiveDtSet;
  }
  public String toString() {
    return RDOverrideObjectHelper.toMap(this, null).toString();
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
  /** RATE_DISCOUNT_OVERRIDES.contract_tracking_id field */
    if(!nonNullOnly || (ContractTrackingId != null))  _ContractTrackingIdSet = flag;
  /** RATE_DISCOUNT_OVERRIDES.contract_tracking_id_serv field */
    if(!nonNullOnly || (ContractTrackingIdServ != null))  _ContractTrackingIdServSet = flag;
  /** RATE_DISCOUNT_OVERRIDES.discount_id field */
    if(!nonNullOnly || (DiscountId != null))  _DiscountIdSet = flag;
  /** RATE_DISCOUNT_OVERRIDES.range_origin field */
    if(!nonNullOnly || (RangeOrigin != null))  _RangeOriginSet = flag;
  /** RATE_DISCOUNT_OVERRIDES.range_terminus field */
    if(!nonNullOnly || (RangeTerminus != null))  _RangeTerminusSet = flag;
  /** RATE_DISCOUNT_OVERRIDES.billing_frequency field */
    if(!nonNullOnly || (BillingFrequency != null))  _BillingFrequencySet = flag;
  /** RATE_DISCOUNT_OVERRIDES.currency_code field */
    if(!nonNullOnly || (CurrencyCode != null))  _CurrencyCodeSet = flag;
  /** RATE_DISCOUNT_OVERRIDES.discount_percent field */
    if(!nonNullOnly || (DiscountPercent != null))  _DiscountPercentSet = flag;
  /** RATE_DISCOUNT_OVERRIDES.implied_decimals field */
    if(!nonNullOnly || (ImpliedDecimals != null))  _ImpliedDecimalsSet = flag;
  /** RATE_DISCOUNT_OVERRIDES.discount_amount field */
    if(!nonNullOnly || (DiscountAmount != null))  _DiscountAmountSet = flag;
  /** RATE_DISCOUNT_OVERRIDES.create_dt field */
    if(!nonNullOnly || (CreateDt != null))  _CreateDtSet = flag;
  /** RATE_DISCOUNT_OVERRIDES.chg_dt field */
    if(!nonNullOnly || (ChgDt != null))  _ChgDtSet = flag;
  /** RATE_DISCOUNT_OVERRIDES.chg_who field */
    if(!nonNullOnly || (ChgWho != null))  _ChgWhoSet = flag;
  /** RATE_DISCOUNT_OVERRIDES.task_mode field */
    if(!nonNullOnly || (TaskMode != null))  _TaskModeSet = flag;
  /** RATE_DISCOUNT_OVERRIDES.active_dt field */
    if(!nonNullOnly || (ActiveDt != null))  _ActiveDtSet = flag;
  /** RATE_DISCOUNT_OVERRIDES.inactive_dt field */
    if(!nonNullOnly || (InactiveDt != null))  _InactiveDtSet = flag;
  }
}
