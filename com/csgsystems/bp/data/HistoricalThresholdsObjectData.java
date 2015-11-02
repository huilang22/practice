/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: HistoricalThresholdsObjectData.java
 * Definition File: Customer/HistoricalThresholds.xml
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
  
/** HistoricalThresholdsObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class HistoricalThresholdsObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public HistoricalThresholdsObjectKeyData Key = null;
  /** HISTORIC_THRESHOLDS.contract_tracking_id field */
  public    Integer ContractTrackingId  = null;
  protected boolean _ContractTrackingIdSet = false;
  /** HISTORIC_THRESHOLDS.contract_tracking_id_serv field */
  public    Integer ContractTrackingIdServ  = null;
  protected boolean _ContractTrackingIdServSet = false;
  /** HISTORIC_THRESHOLDS.discount_id field */
  public    Integer DiscountId  = null;
  protected boolean _DiscountIdSet = false;
  /** HISTORIC_THRESHOLDS.task_mode field */
  public    Integer TaskMode  = null;
  protected boolean _TaskModeSet = false;
  /** HISTORIC_THRESHOLDS.discount_quantum field */
  public    Integer DiscountQuantum  = null;
  protected boolean _DiscountQuantumSet = false;
  /** HISTORIC_THRESHOLDS.quanta field */
  public    BigInteger Quanta  = null;
  protected boolean _QuantaSet = false;
  /** HISTORIC_THRESHOLDS.currency_code field */
  public    Integer CurrencyCode  = null;
  protected boolean _CurrencyCodeSet = false;
  /** HISTORIC_THRESHOLDS.active_dt field */
  public    Date ActiveDt  = null;
  protected boolean _ActiveDtSet = false;
  /** HISTORIC_THRESHOLDS.inactive_dt field */
  public    Date InactiveDt  = null;
  protected boolean _InactiveDtSet = false;
  /** HISTORIC_THRESHOLDS.chg_dt field */
  public    Date ChgDt  = null;
  protected boolean _ChgDtSet = false;
  /** HISTORIC_THRESHOLDS.chg_who field */
  public    String ChgWho  = null;
  protected boolean _ChgWhoSet = false;
  private String _objName = "HistoricalThresholdsObjectData";
  /** Default constructor */
  public HistoricalThresholdsObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public HistoricalThresholdsObjectData (HistoricalThresholdsObjectData other)
  {

    if (other == null) return;
    this.Key = new HistoricalThresholdsObjectKeyData (other.Key);
    this.ContractTrackingId = other.ContractTrackingId;
    this._ContractTrackingIdSet = other._ContractTrackingIdSet;
    this.ContractTrackingIdServ = other.ContractTrackingIdServ;
    this._ContractTrackingIdServSet = other._ContractTrackingIdServSet;
    this.DiscountId = other.DiscountId;
    this._DiscountIdSet = other._DiscountIdSet;
    this.TaskMode = other.TaskMode;
    this._TaskModeSet = other._TaskModeSet;
    this.DiscountQuantum = other.DiscountQuantum;
    this._DiscountQuantumSet = other._DiscountQuantumSet;
    this.Quanta = other.Quanta;
    this._QuantaSet = other._QuantaSet;
    this.CurrencyCode = other.CurrencyCode;
    this._CurrencyCodeSet = other._CurrencyCodeSet;
    this.ActiveDt = other.ActiveDt;
    this._ActiveDtSet = other._ActiveDtSet;
    this.InactiveDt = other.InactiveDt;
    this._InactiveDtSet = other._InactiveDtSet;
    this.ChgDt = other.ChgDt;
    this._ChgDtSet = other._ChgDtSet;
    this.ChgWho = other.ChgWho;
    this._ChgWhoSet = other._ChgWhoSet;
  }

  /** get the Key for this object
   * @return HistoricalThresholdsObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public HistoricalThresholdsObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (HistoricalThresholdsObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: ThresholdTrackingId (HISTORIC_THRESHOLDS.threshold_tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setThresholdTrackingId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ThresholdTrackingId", "setThresholdTrackingId");
    }
    if (this.Key == null) this.Key = new HistoricalThresholdsObjectKeyData ();
    this.Key.ThresholdTrackingId = value;
    this.Key._ThresholdTrackingIdSet = true;
  }
  /** get the value of the field: ThresholdTrackingId (HISTORIC_THRESHOLDS.threshold_tracking_id)
   * @return Integer the value
   */
  public Integer getThresholdTrackingId () {
    if (this.Key == null) return null;
    return this.Key.ThresholdTrackingId;
  }
  /** Change the field to not being actively set: ThresholdTrackingId (HISTORIC_THRESHOLDS.threshold_tracking_id)
   */
  public void unsetThresholdTrackingId () {
    if (this.Key == null) return;
    this.Key._ThresholdTrackingIdSet = false;
  }
  /** See if the field is actively set: ThresholdTrackingId (HISTORIC_THRESHOLDS.threshold_tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetThresholdTrackingId () {
    if (this.Key == null) return false;
    return this.Key._ThresholdTrackingIdSet;
  }

  /** Retrieves the ThresholdTrackingId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ThresholdTrackingId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ThresholdTrackingId field
   */
   public String getThresholdTrackingIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getThresholdTrackingIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getThresholdTrackingIdAsFormattedString");
       return fmtMgr.formatNumber(this.getThresholdTrackingId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ThresholdTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getThresholdTrackingIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ThresholdTrackingId field from a formatted string
   *
   * @param _value the ThresholdTrackingId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ThresholdTrackingId field
   */
   public void setThresholdTrackingIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getThresholdTrackingIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setThresholdTrackingId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ThresholdTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setThresholdTrackingIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setThresholdTrackingIdFromFormattedString");
   }

  /** set the fields value: ThresholdTrackingIdServ (HISTORIC_THRESHOLDS.threshold_tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setThresholdTrackingIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ThresholdTrackingIdServ", "setThresholdTrackingIdServ");
    }
    if (this.Key == null) this.Key = new HistoricalThresholdsObjectKeyData ();
    this.Key.ThresholdTrackingIdServ = value;
    this.Key._ThresholdTrackingIdServSet = true;
  }
  /** get the value of the field: ThresholdTrackingIdServ (HISTORIC_THRESHOLDS.threshold_tracking_id_serv)
   * @return Integer the value
   */
  public Integer getThresholdTrackingIdServ () {
    if (this.Key == null) return null;
    return this.Key.ThresholdTrackingIdServ;
  }
  /** Change the field to not being actively set: ThresholdTrackingIdServ (HISTORIC_THRESHOLDS.threshold_tracking_id_serv)
   */
  public void unsetThresholdTrackingIdServ () {
    if (this.Key == null) return;
    this.Key._ThresholdTrackingIdServSet = false;
  }
  /** See if the field is actively set: ThresholdTrackingIdServ (HISTORIC_THRESHOLDS.threshold_tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetThresholdTrackingIdServ () {
    if (this.Key == null) return false;
    return this.Key._ThresholdTrackingIdServSet;
  }

  /** Retrieves the ThresholdTrackingIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ThresholdTrackingIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ThresholdTrackingIdServ field
   */
   public String getThresholdTrackingIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getThresholdTrackingIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getThresholdTrackingIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getThresholdTrackingIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ThresholdTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getThresholdTrackingIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the ThresholdTrackingIdServ field from a formatted string
   *
   * @param _value the ThresholdTrackingIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ThresholdTrackingIdServ field
   */
   public void setThresholdTrackingIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getThresholdTrackingIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setThresholdTrackingIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ThresholdTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setThresholdTrackingIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setThresholdTrackingIdServFromFormattedString");
   }

  /** set the fields value: ContractTrackingId (HISTORIC_THRESHOLDS.contract_tracking_id)
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

  /** get the value of the field: ContractTrackingId (HISTORIC_THRESHOLDS.contract_tracking_id)
   * @return Integer the value
   */
  public Integer getContractTrackingId () {
    return this.ContractTrackingId;
  }
  /** Change the field to not being actively set: ContractTrackingId (HISTORIC_THRESHOLDS.contract_tracking_id)
   */
  public void unsetContractTrackingId () {
    this._ContractTrackingIdSet = false;
  }
  /** See if the field is actively set: ContractTrackingId (HISTORIC_THRESHOLDS.contract_tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetContractTrackingId () {
    return this._ContractTrackingIdSet;
  }
  /** set the fields value: ContractTrackingIdServ (HISTORIC_THRESHOLDS.contract_tracking_id_serv)
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

  /** get the value of the field: ContractTrackingIdServ (HISTORIC_THRESHOLDS.contract_tracking_id_serv)
   * @return Integer the value
   */
  public Integer getContractTrackingIdServ () {
    return this.ContractTrackingIdServ;
  }
  /** Change the field to not being actively set: ContractTrackingIdServ (HISTORIC_THRESHOLDS.contract_tracking_id_serv)
   */
  public void unsetContractTrackingIdServ () {
    this._ContractTrackingIdServSet = false;
  }
  /** See if the field is actively set: ContractTrackingIdServ (HISTORIC_THRESHOLDS.contract_tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetContractTrackingIdServ () {
    return this._ContractTrackingIdServSet;
  }
  /** set the fields value: DiscountId (HISTORIC_THRESHOLDS.discount_id)
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

  /** get the value of the field: DiscountId (HISTORIC_THRESHOLDS.discount_id)
   * @return Integer the value
   */
  public Integer getDiscountId () {
    return this.DiscountId;
  }
  /** Change the field to not being actively set: DiscountId (HISTORIC_THRESHOLDS.discount_id)
   */
  public void unsetDiscountId () {
    this._DiscountIdSet = false;
  }
  /** See if the field is actively set: DiscountId (HISTORIC_THRESHOLDS.discount_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetDiscountId () {
    return this._DiscountIdSet;
  }
  /** set the fields value: TaskMode (HISTORIC_THRESHOLDS.task_mode)
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

  /** get the value of the field: TaskMode (HISTORIC_THRESHOLDS.task_mode)
   * @return Integer the value
   */
  public Integer getTaskMode () {
    return this.TaskMode;
  }
  /** Change the field to not being actively set: TaskMode (HISTORIC_THRESHOLDS.task_mode)
   */
  public void unsetTaskMode () {
    this._TaskModeSet = false;
  }
  /** See if the field is actively set: TaskMode (HISTORIC_THRESHOLDS.task_mode)
   * @return boolean whether the field is actively set
   */
  public boolean issetTaskMode () {
    return this._TaskModeSet;
  }
  /** set the fields value: DiscountQuantum (HISTORIC_THRESHOLDS.discount_quantum)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DiscountQuantum") 
  public void setDiscountQuantum (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DiscountQuantum", "setDiscountQuantum");
    }
    this.DiscountQuantum = value;
    this._DiscountQuantumSet = true;
  }

  /** Retrieves the DiscountQuantum field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DiscountQuantum field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DiscountQuantum field
   */
   public String getDiscountQuantumAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountQuantumAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscountQuantumAsFormattedString");
       return fmtMgr.formatNumber(this.getDiscountQuantum(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DiscountQuantum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDiscountQuantumAsFormattedString");
       throw x;
     }
   }
  /** Sets the DiscountQuantum field from a formatted string
   *
   * @param _value the DiscountQuantum field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DiscountQuantum field
   */
   public void setDiscountQuantumFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountQuantumFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDiscountQuantum(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DiscountQuantum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDiscountQuantumFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDiscountQuantumFromFormattedString");
   }

  /** get the value of the field: DiscountQuantum (HISTORIC_THRESHOLDS.discount_quantum)
   * @return Integer the value
   */
  public Integer getDiscountQuantum () {
    return this.DiscountQuantum;
  }
  /** Change the field to not being actively set: DiscountQuantum (HISTORIC_THRESHOLDS.discount_quantum)
   */
  public void unsetDiscountQuantum () {
    this._DiscountQuantumSet = false;
  }
  /** See if the field is actively set: DiscountQuantum (HISTORIC_THRESHOLDS.discount_quantum)
   * @return boolean whether the field is actively set
   */
  public boolean issetDiscountQuantum () {
    return this._DiscountQuantumSet;
  }
  /** set the fields value: Quanta (HISTORIC_THRESHOLDS.quanta)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Quanta") 
  public void setQuanta (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Quanta", "setQuanta");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Quanta", "setQuanta");
    }
    this.Quanta = value;
    this._QuantaSet = true;
  }

  /** Retrieves the Quanta field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Quanta field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Quanta field
   */
   public String getQuantaAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getQuantaAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getQuantaAsFormattedString");
       return fmtMgr.formatBigInteger(this.getQuanta(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Quanta");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getQuantaAsFormattedString");
       throw x;
     }
   }
  /** Sets the Quanta field from a formatted string
   *
   * @param _value the Quanta field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Quanta field
   */
   public void setQuantaFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getQuantaFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setQuanta(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Quanta");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setQuantaFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setQuantaFromFormattedString");
   }

  /**
   * Retrieves the Quanta field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The Quanta field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the Quanta field
   */
  public String getQuantaAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getQuantaAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getQuantaAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getQuanta(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Quanta");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getQuantaAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the Quanta field value from a formatted currency string
   *
   * @param _value the Quanta field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Quanta field
   */
  public void setQuantaFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setQuantaFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setQuanta(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Quanta");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setQuantaFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setQuantaFromFormattedCurrencyString");
  }

  /** get the value of the field: Quanta (HISTORIC_THRESHOLDS.quanta)
   * @return BigInteger the value
   */
  public BigInteger getQuanta () {
    return this.Quanta;
  }
  /** Change the field to not being actively set: Quanta (HISTORIC_THRESHOLDS.quanta)
   */
  public void unsetQuanta () {
    this._QuantaSet = false;
  }
  /** See if the field is actively set: Quanta (HISTORIC_THRESHOLDS.quanta)
   * @return boolean whether the field is actively set
   */
  public boolean issetQuanta () {
    return this._QuantaSet;
  }
  /** set the fields value: CurrencyCode (HISTORIC_THRESHOLDS.currency_code)
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

  /** get the value of the field: CurrencyCode (HISTORIC_THRESHOLDS.currency_code)
   * @return Integer the value
   */
  public Integer getCurrencyCode () {
    return this.CurrencyCode;
  }
  /** Change the field to not being actively set: CurrencyCode (HISTORIC_THRESHOLDS.currency_code)
   */
  public void unsetCurrencyCode () {
    this._CurrencyCodeSet = false;
  }
  /** See if the field is actively set: CurrencyCode (HISTORIC_THRESHOLDS.currency_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCurrencyCode () {
    return this._CurrencyCodeSet;
  }
  /** set the fields value: ActiveDt (HISTORIC_THRESHOLDS.active_dt)
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

  /** get the value of the field: ActiveDt (HISTORIC_THRESHOLDS.active_dt)
   * @return Date the value
   */
  public Date getActiveDt () {
    return this.ActiveDt;
  }
  /** Change the field to not being actively set: ActiveDt (HISTORIC_THRESHOLDS.active_dt)
   */
  public void unsetActiveDt () {
    this._ActiveDtSet = false;
  }
  /** See if the field is actively set: ActiveDt (HISTORIC_THRESHOLDS.active_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetActiveDt () {
    return this._ActiveDtSet;
  }
  /** set the fields value: InactiveDt (HISTORIC_THRESHOLDS.inactive_dt)
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

  /** get the value of the field: InactiveDt (HISTORIC_THRESHOLDS.inactive_dt)
   * @return Date the value
   */
  public Date getInactiveDt () {
    return this.InactiveDt;
  }
  /** Change the field to not being actively set: InactiveDt (HISTORIC_THRESHOLDS.inactive_dt)
   */
  public void unsetInactiveDt () {
    this._InactiveDtSet = false;
  }
  /** See if the field is actively set: InactiveDt (HISTORIC_THRESHOLDS.inactive_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetInactiveDt () {
    return this._InactiveDtSet;
  }
  /** set the fields value: ChgDt (HISTORIC_THRESHOLDS.chg_dt)
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

  /** get the value of the field: ChgDt (HISTORIC_THRESHOLDS.chg_dt)
   * @return Date the value
   */
  public Date getChgDt () {
    return this.ChgDt;
  }
  /** Change the field to not being actively set: ChgDt (HISTORIC_THRESHOLDS.chg_dt)
   */
  public void unsetChgDt () {
    this._ChgDtSet = false;
  }
  /** See if the field is actively set: ChgDt (HISTORIC_THRESHOLDS.chg_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgDt () {
    return this._ChgDtSet;
  }
  /** set the fields value: ChgWho (HISTORIC_THRESHOLDS.chg_who)
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

  /** get the value of the field: ChgWho (HISTORIC_THRESHOLDS.chg_who)
   * @return String the value
   */
  public String getChgWho () {
    return this.ChgWho;
  }
  /** Change the field to not being actively set: ChgWho (HISTORIC_THRESHOLDS.chg_who)
   */
  public void unsetChgWho () {
    this._ChgWhoSet = false;
  }
  /** See if the field is actively set: ChgWho (HISTORIC_THRESHOLDS.chg_who)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgWho () {
    return this._ChgWhoSet;
  }
  public String toString() {
    return HistoricalThresholdsObjectHelper.toMap(this, null).toString();
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
  /** HISTORIC_THRESHOLDS.contract_tracking_id field */
    if(!nonNullOnly || (ContractTrackingId != null))  _ContractTrackingIdSet = flag;
  /** HISTORIC_THRESHOLDS.contract_tracking_id_serv field */
    if(!nonNullOnly || (ContractTrackingIdServ != null))  _ContractTrackingIdServSet = flag;
  /** HISTORIC_THRESHOLDS.discount_id field */
    if(!nonNullOnly || (DiscountId != null))  _DiscountIdSet = flag;
  /** HISTORIC_THRESHOLDS.task_mode field */
    if(!nonNullOnly || (TaskMode != null))  _TaskModeSet = flag;
  /** HISTORIC_THRESHOLDS.discount_quantum field */
    if(!nonNullOnly || (DiscountQuantum != null))  _DiscountQuantumSet = flag;
  /** HISTORIC_THRESHOLDS.quanta field */
    if(!nonNullOnly || (Quanta != null))  _QuantaSet = flag;
  /** HISTORIC_THRESHOLDS.currency_code field */
    if(!nonNullOnly || (CurrencyCode != null))  _CurrencyCodeSet = flag;
  /** HISTORIC_THRESHOLDS.active_dt field */
    if(!nonNullOnly || (ActiveDt != null))  _ActiveDtSet = flag;
  /** HISTORIC_THRESHOLDS.inactive_dt field */
    if(!nonNullOnly || (InactiveDt != null))  _InactiveDtSet = flag;
  /** HISTORIC_THRESHOLDS.chg_dt field */
    if(!nonNullOnly || (ChgDt != null))  _ChgDtSet = flag;
  /** HISTORIC_THRESHOLDS.chg_who field */
    if(!nonNullOnly || (ChgWho != null))  _ChgWhoSet = flag;
  }
}
