/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CdrDataDucObjectData.java
 * Definition File: Customer/CdrDataDuc.xml
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
  
/** CdrDataDucObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class CdrDataDucObjectData extends BaseObjectData implements Serializable
{

  /** CDR_DATA_DUC.cdr_data_partition_key field */
  public    Date CdrDataPartitionKey  = null;
  protected boolean _CdrDataPartitionKeySet = false;
  /** CDR_DATA_DUC.msg_id field */
  public    Integer MsgId  = null;
  protected boolean _MsgIdSet = false;
  /** CDR_DATA_DUC.msg_id2 field */
  public    Integer MsgId2  = null;
  protected boolean _MsgId2Set = false;
  /** CDR_DATA_DUC.msg_id_serv field */
  public    Integer MsgIdServ  = null;
  protected boolean _MsgIdServSet = false;
  /** CDR_DATA_DUC.split_row_num field */
  public    Integer SplitRowNum  = null;
  protected boolean _SplitRowNumSet = false;
  /** CDR_DATA_DUC.duc_type field */
  public    Integer DucType  = null;
  protected boolean _DucTypeSet = false;
  /** CDR_DATA_DUC.duc_subtype field */
  public    Integer DucSubtype  = null;
  protected boolean _DucSubtypeSet = false;
  /** CDR_DATA_DUC.duc_plan_id field */
  public    Integer DucPlanId  = null;
  protected boolean _DucPlanIdSet = false;
  /** CDR_DATA_DUC.duc_id field */
  public    Integer DucId  = null;
  protected boolean _DucIdSet = false;
  /** CDR_DATA_DUC.contract_tracking_id field */
  public    Integer ContractTrackingId  = null;
  protected boolean _ContractTrackingIdSet = false;
  /** CDR_DATA_DUC.contract_tracking_id_serv field */
  public    Integer ContractTrackingIdServ  = null;
  protected boolean _ContractTrackingIdServSet = false;
  /** CDR_DATA_DUC.awarded_quantum_type field */
  public    Integer AwardedQuantumType  = null;
  protected boolean _AwardedQuantumTypeSet = false;
  /** CDR_DATA_DUC.units_value field */
  public    BigInteger UnitsValue  = null;
  protected boolean _UnitsValueSet = false;
  /** CDR_DATA_DUC.units_type field */
  public    Integer UnitsType  = null;
  protected boolean _UnitsTypeSet = false;
  /** CDR_DATA_DUC.money_value field */
  public    BigInteger MoneyValue  = null;
  protected boolean _MoneyValueSet = false;
  /** CDR_DATA_DUC.currency_code field */
  public    Integer CurrencyCode  = null;
  protected boolean _CurrencyCodeSet = false;
  /** CDR_DATA_DUC.rebate_proration_ratio field */
  public    Integer RebateProrationRatio  = null;
  protected boolean _RebateProrationRatioSet = false;
  /** CDR_DATA_DUC.threshold_proration_ratio field */
  public    Integer ThresholdProrationRatio  = null;
  protected boolean _ThresholdProrationRatioSet = false;
  /** CDR_DATA_DUC.profile_id field */
  public    Integer ProfileId  = null;
  protected boolean _ProfileIdSet = false;
  /** CDR_DATA_DUC.profile_id_serv field */
  public    Integer ProfileIdServ  = null;
  protected boolean _ProfileIdServSet = false;
  /** CDR_DATA_DUC.instance_num field */
  public    Integer InstanceNum  = null;
  protected boolean _InstanceNumSet = false;
  /** CDR_DATA_DUC.quantum_pre_charge field */
  public    BigInteger QuantumPreCharge  = null;
  protected boolean _QuantumPreChargeSet = false;
  /** CDR_DATA_DUC.create_dt field */
  public    Date CreateDt  = null;
  protected boolean _CreateDtSet = false;
  /** CDR_DATA_DUC.instance_start_dt field */
  public    Date InstanceStartDt  = null;
  protected boolean _InstanceStartDtSet = false;
  /** CDR_DATA_DUC.annotation field */
  public    String Annotation  = null;
  protected boolean _AnnotationSet = false;
  private String _objName = "CdrDataDucObjectData";
  /** Default constructor */
  public CdrDataDucObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public CdrDataDucObjectData (CdrDataDucObjectData other)
  {

    if (other == null) return;
    this.CdrDataPartitionKey = other.CdrDataPartitionKey;
    this._CdrDataPartitionKeySet = other._CdrDataPartitionKeySet;
    this.MsgId = other.MsgId;
    this._MsgIdSet = other._MsgIdSet;
    this.MsgId2 = other.MsgId2;
    this._MsgId2Set = other._MsgId2Set;
    this.MsgIdServ = other.MsgIdServ;
    this._MsgIdServSet = other._MsgIdServSet;
    this.SplitRowNum = other.SplitRowNum;
    this._SplitRowNumSet = other._SplitRowNumSet;
    this.DucType = other.DucType;
    this._DucTypeSet = other._DucTypeSet;
    this.DucSubtype = other.DucSubtype;
    this._DucSubtypeSet = other._DucSubtypeSet;
    this.DucPlanId = other.DucPlanId;
    this._DucPlanIdSet = other._DucPlanIdSet;
    this.DucId = other.DucId;
    this._DucIdSet = other._DucIdSet;
    this.ContractTrackingId = other.ContractTrackingId;
    this._ContractTrackingIdSet = other._ContractTrackingIdSet;
    this.ContractTrackingIdServ = other.ContractTrackingIdServ;
    this._ContractTrackingIdServSet = other._ContractTrackingIdServSet;
    this.AwardedQuantumType = other.AwardedQuantumType;
    this._AwardedQuantumTypeSet = other._AwardedQuantumTypeSet;
    this.UnitsValue = other.UnitsValue;
    this._UnitsValueSet = other._UnitsValueSet;
    this.UnitsType = other.UnitsType;
    this._UnitsTypeSet = other._UnitsTypeSet;
    this.MoneyValue = other.MoneyValue;
    this._MoneyValueSet = other._MoneyValueSet;
    this.CurrencyCode = other.CurrencyCode;
    this._CurrencyCodeSet = other._CurrencyCodeSet;
    this.RebateProrationRatio = other.RebateProrationRatio;
    this._RebateProrationRatioSet = other._RebateProrationRatioSet;
    this.ThresholdProrationRatio = other.ThresholdProrationRatio;
    this._ThresholdProrationRatioSet = other._ThresholdProrationRatioSet;
    this.ProfileId = other.ProfileId;
    this._ProfileIdSet = other._ProfileIdSet;
    this.ProfileIdServ = other.ProfileIdServ;
    this._ProfileIdServSet = other._ProfileIdServSet;
    this.InstanceNum = other.InstanceNum;
    this._InstanceNumSet = other._InstanceNumSet;
    this.QuantumPreCharge = other.QuantumPreCharge;
    this._QuantumPreChargeSet = other._QuantumPreChargeSet;
    this.CreateDt = other.CreateDt;
    this._CreateDtSet = other._CreateDtSet;
    this.InstanceStartDt = other.InstanceStartDt;
    this._InstanceStartDtSet = other._InstanceStartDtSet;
    this.Annotation = other.Annotation;
    this._AnnotationSet = other._AnnotationSet;
  }

  /** set the fields value: CdrDataPartitionKey (CDR_DATA_DUC.cdr_data_partition_key)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CdrDataPartitionKey") 
  public void setCdrDataPartitionKey (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CdrDataPartitionKey", "setCdrDataPartitionKey");
    }
    this.CdrDataPartitionKey = value;
    this._CdrDataPartitionKeySet = true;
  }

  /** Retrieves the CdrDataPartitionKey field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CdrDataPartitionKey field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CdrDataPartitionKey field
   */
   public String getCdrDataPartitionKeyAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCdrDataPartitionKeyAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCdrDataPartitionKeyAsFormattedString");
       return fmtMgr.formatDate(this.getCdrDataPartitionKey(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CdrDataPartitionKey");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCdrDataPartitionKeyAsFormattedString");
       throw x;
     }
   }
  /** Sets the CdrDataPartitionKey field from a formatted string
   *
   * @param _value the CdrDataPartitionKey field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CdrDataPartitionKey field
   */
   public void setCdrDataPartitionKeyFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCdrDataPartitionKeyFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCdrDataPartitionKey(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CdrDataPartitionKey");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCdrDataPartitionKeyFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCdrDataPartitionKeyFromFormattedString");
   }

  /**
   * Retrieves the CdrDataPartitionKey field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CdrDataPartitionKey field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the CdrDataPartitionKey field
   */
  public String getCdrDataPartitionKeyAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCdrDataPartitionKeyAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCdrDataPartitionKeyAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getCdrDataPartitionKey(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CdrDataPartitionKey");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCdrDataPartitionKeyAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the CdrDataPartitionKey field value from a formatted date/time string
   *
   * @param _value the CdrDataPartitionKey field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CdrDataPartitionKey field
   */
  public void setCdrDataPartitionKeyFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCdrDataPartitionKeyFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setCdrDataPartitionKey(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CdrDataPartitionKey");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCdrDataPartitionKeyFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: CdrDataPartitionKey (CDR_DATA_DUC.cdr_data_partition_key)
   * @return Date the value
   */
  public Date getCdrDataPartitionKey () {
    return this.CdrDataPartitionKey;
  }
  /** Change the field to not being actively set: CdrDataPartitionKey (CDR_DATA_DUC.cdr_data_partition_key)
   */
  public void unsetCdrDataPartitionKey () {
    this._CdrDataPartitionKeySet = false;
  }
  /** See if the field is actively set: CdrDataPartitionKey (CDR_DATA_DUC.cdr_data_partition_key)
   * @return boolean whether the field is actively set
   */
  public boolean issetCdrDataPartitionKey () {
    return this._CdrDataPartitionKeySet;
  }
  /** set the fields value: MsgId (CDR_DATA_DUC.msg_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MsgId") 
  public void setMsgId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "MsgId", "setMsgId");
    }
    this.MsgId = value;
    this._MsgIdSet = true;
  }

  /** Retrieves the MsgId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MsgId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MsgId field
   */
   public String getMsgIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMsgIdAsFormattedString");
       return fmtMgr.formatNumber(this.getMsgId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MsgId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMsgIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the MsgId field from a formatted string
   *
   * @param _value the MsgId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MsgId field
   */
   public void setMsgIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMsgId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MsgId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMsgIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMsgIdFromFormattedString");
   }

  /** get the value of the field: MsgId (CDR_DATA_DUC.msg_id)
   * @return Integer the value
   */
  public Integer getMsgId () {
    return this.MsgId;
  }
  /** Change the field to not being actively set: MsgId (CDR_DATA_DUC.msg_id)
   */
  public void unsetMsgId () {
    this._MsgIdSet = false;
  }
  /** See if the field is actively set: MsgId (CDR_DATA_DUC.msg_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetMsgId () {
    return this._MsgIdSet;
  }
  /** set the fields value: MsgId2 (CDR_DATA_DUC.msg_id2)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MsgId2") 
  public void setMsgId2 (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "MsgId2", "setMsgId2");
    }
    this.MsgId2 = value;
    this._MsgId2Set = true;
  }

  /** Retrieves the MsgId2 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MsgId2 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MsgId2 field
   */
   public String getMsgId2AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgId2AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMsgId2AsFormattedString");
       return fmtMgr.formatNumber(this.getMsgId2(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MsgId2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMsgId2AsFormattedString");
       throw x;
     }
   }
  /** Sets the MsgId2 field from a formatted string
   *
   * @param _value the MsgId2 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MsgId2 field
   */
   public void setMsgId2FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgId2FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMsgId2(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MsgId2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMsgId2FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMsgId2FromFormattedString");
   }

  /** get the value of the field: MsgId2 (CDR_DATA_DUC.msg_id2)
   * @return Integer the value
   */
  public Integer getMsgId2 () {
    return this.MsgId2;
  }
  /** Change the field to not being actively set: MsgId2 (CDR_DATA_DUC.msg_id2)
   */
  public void unsetMsgId2 () {
    this._MsgId2Set = false;
  }
  /** See if the field is actively set: MsgId2 (CDR_DATA_DUC.msg_id2)
   * @return boolean whether the field is actively set
   */
  public boolean issetMsgId2 () {
    return this._MsgId2Set;
  }
  /** set the fields value: MsgIdServ (CDR_DATA_DUC.msg_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MsgIdServ") 
  public void setMsgIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "MsgIdServ", "setMsgIdServ");
    }
    this.MsgIdServ = value;
    this._MsgIdServSet = true;
  }

  /** Retrieves the MsgIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MsgIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MsgIdServ field
   */
   public String getMsgIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMsgIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getMsgIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MsgIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMsgIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the MsgIdServ field from a formatted string
   *
   * @param _value the MsgIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MsgIdServ field
   */
   public void setMsgIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMsgIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MsgIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMsgIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMsgIdServFromFormattedString");
   }

  /** get the value of the field: MsgIdServ (CDR_DATA_DUC.msg_id_serv)
   * @return Integer the value
   */
  public Integer getMsgIdServ () {
    return this.MsgIdServ;
  }
  /** Change the field to not being actively set: MsgIdServ (CDR_DATA_DUC.msg_id_serv)
   */
  public void unsetMsgIdServ () {
    this._MsgIdServSet = false;
  }
  /** See if the field is actively set: MsgIdServ (CDR_DATA_DUC.msg_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetMsgIdServ () {
    return this._MsgIdServSet;
  }
  /** set the fields value: SplitRowNum (CDR_DATA_DUC.split_row_num)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SplitRowNum") 
  public void setSplitRowNum (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SplitRowNum", "setSplitRowNum");
    }
    this.SplitRowNum = value;
    this._SplitRowNumSet = true;
  }

  /** Retrieves the SplitRowNum field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SplitRowNum field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SplitRowNum field
   */
   public String getSplitRowNumAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSplitRowNumAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSplitRowNumAsFormattedString");
       return fmtMgr.formatNumber(this.getSplitRowNum(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SplitRowNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSplitRowNumAsFormattedString");
       throw x;
     }
   }
  /** Sets the SplitRowNum field from a formatted string
   *
   * @param _value the SplitRowNum field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SplitRowNum field
   */
   public void setSplitRowNumFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSplitRowNumFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSplitRowNum(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SplitRowNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSplitRowNumFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSplitRowNumFromFormattedString");
   }

  /** get the value of the field: SplitRowNum (CDR_DATA_DUC.split_row_num)
   * @return Integer the value
   */
  public Integer getSplitRowNum () {
    return this.SplitRowNum;
  }
  /** Change the field to not being actively set: SplitRowNum (CDR_DATA_DUC.split_row_num)
   */
  public void unsetSplitRowNum () {
    this._SplitRowNumSet = false;
  }
  /** See if the field is actively set: SplitRowNum (CDR_DATA_DUC.split_row_num)
   * @return boolean whether the field is actively set
   */
  public boolean issetSplitRowNum () {
    return this._SplitRowNumSet;
  }
  /** set the fields value: DucType (CDR_DATA_DUC.duc_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DucType") 
  public void setDucType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DucType", "setDucType");
    }
    this.DucType = value;
    this._DucTypeSet = true;
  }

  /** Retrieves the DucType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DucType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DucType field
   */
   public String getDucTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDucTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDucTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getDucType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DucType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDucTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the DucType field from a formatted string
   *
   * @param _value the DucType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DucType field
   */
   public void setDucTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDucTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDucType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DucType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDucTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDucTypeFromFormattedString");
   }

  /** get the value of the field: DucType (CDR_DATA_DUC.duc_type)
   * @return Integer the value
   */
  public Integer getDucType () {
    return this.DucType;
  }
  /** Change the field to not being actively set: DucType (CDR_DATA_DUC.duc_type)
   */
  public void unsetDucType () {
    this._DucTypeSet = false;
  }
  /** See if the field is actively set: DucType (CDR_DATA_DUC.duc_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetDucType () {
    return this._DucTypeSet;
  }
  /** set the fields value: DucSubtype (CDR_DATA_DUC.duc_subtype)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DucSubtype") 
  public void setDucSubtype (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DucSubtype", "setDucSubtype");
    }
    this.DucSubtype = value;
    this._DucSubtypeSet = true;
  }

  /** Retrieves the DucSubtype field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DucSubtype field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DucSubtype field
   */
   public String getDucSubtypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDucSubtypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDucSubtypeAsFormattedString");
       return fmtMgr.formatNumber(this.getDucSubtype(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DucSubtype");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDucSubtypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the DucSubtype field from a formatted string
   *
   * @param _value the DucSubtype field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DucSubtype field
   */
   public void setDucSubtypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDucSubtypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDucSubtype(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DucSubtype");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDucSubtypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDucSubtypeFromFormattedString");
   }

  /** get the value of the field: DucSubtype (CDR_DATA_DUC.duc_subtype)
   * @return Integer the value
   */
  public Integer getDucSubtype () {
    return this.DucSubtype;
  }
  /** Change the field to not being actively set: DucSubtype (CDR_DATA_DUC.duc_subtype)
   */
  public void unsetDucSubtype () {
    this._DucSubtypeSet = false;
  }
  /** See if the field is actively set: DucSubtype (CDR_DATA_DUC.duc_subtype)
   * @return boolean whether the field is actively set
   */
  public boolean issetDucSubtype () {
    return this._DucSubtypeSet;
  }
  /** set the fields value: DucPlanId (CDR_DATA_DUC.duc_plan_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DucPlanId") 
  public void setDucPlanId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DucPlanId", "setDucPlanId");
    }
    this.DucPlanId = value;
    this._DucPlanIdSet = true;
  }

  /** Retrieves the DucPlanId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DucPlanId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DucPlanId field
   */
   public String getDucPlanIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDucPlanIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDucPlanIdAsFormattedString");
       return fmtMgr.formatNumber(this.getDucPlanId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DucPlanId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDucPlanIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the DucPlanId field from a formatted string
   *
   * @param _value the DucPlanId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DucPlanId field
   */
   public void setDucPlanIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDucPlanIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDucPlanId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DucPlanId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDucPlanIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDucPlanIdFromFormattedString");
   }

  /** get the value of the field: DucPlanId (CDR_DATA_DUC.duc_plan_id)
   * @return Integer the value
   */
  public Integer getDucPlanId () {
    return this.DucPlanId;
  }
  /** Change the field to not being actively set: DucPlanId (CDR_DATA_DUC.duc_plan_id)
   */
  public void unsetDucPlanId () {
    this._DucPlanIdSet = false;
  }
  /** See if the field is actively set: DucPlanId (CDR_DATA_DUC.duc_plan_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetDucPlanId () {
    return this._DucPlanIdSet;
  }
  /** set the fields value: DucId (CDR_DATA_DUC.duc_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DucId") 
  public void setDucId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DucId", "setDucId");
    }
    this.DucId = value;
    this._DucIdSet = true;
  }

  /** Retrieves the DucId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DucId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DucId field
   */
   public String getDucIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDucIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDucIdAsFormattedString");
       return fmtMgr.formatNumber(this.getDucId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DucId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDucIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the DucId field from a formatted string
   *
   * @param _value the DucId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DucId field
   */
   public void setDucIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDucIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDucId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DucId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDucIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDucIdFromFormattedString");
   }

  /** get the value of the field: DucId (CDR_DATA_DUC.duc_id)
   * @return Integer the value
   */
  public Integer getDucId () {
    return this.DucId;
  }
  /** Change the field to not being actively set: DucId (CDR_DATA_DUC.duc_id)
   */
  public void unsetDucId () {
    this._DucIdSet = false;
  }
  /** See if the field is actively set: DucId (CDR_DATA_DUC.duc_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetDucId () {
    return this._DucIdSet;
  }
  /** set the fields value: ContractTrackingId (CDR_DATA_DUC.contract_tracking_id)
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

  /** get the value of the field: ContractTrackingId (CDR_DATA_DUC.contract_tracking_id)
   * @return Integer the value
   */
  public Integer getContractTrackingId () {
    return this.ContractTrackingId;
  }
  /** Change the field to not being actively set: ContractTrackingId (CDR_DATA_DUC.contract_tracking_id)
   */
  public void unsetContractTrackingId () {
    this._ContractTrackingIdSet = false;
  }
  /** See if the field is actively set: ContractTrackingId (CDR_DATA_DUC.contract_tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetContractTrackingId () {
    return this._ContractTrackingIdSet;
  }
  /** set the fields value: ContractTrackingIdServ (CDR_DATA_DUC.contract_tracking_id_serv)
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

  /** get the value of the field: ContractTrackingIdServ (CDR_DATA_DUC.contract_tracking_id_serv)
   * @return Integer the value
   */
  public Integer getContractTrackingIdServ () {
    return this.ContractTrackingIdServ;
  }
  /** Change the field to not being actively set: ContractTrackingIdServ (CDR_DATA_DUC.contract_tracking_id_serv)
   */
  public void unsetContractTrackingIdServ () {
    this._ContractTrackingIdServSet = false;
  }
  /** See if the field is actively set: ContractTrackingIdServ (CDR_DATA_DUC.contract_tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetContractTrackingIdServ () {
    return this._ContractTrackingIdServSet;
  }
  /** set the fields value: AwardedQuantumType (CDR_DATA_DUC.awarded_quantum_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AwardedQuantumType") 
  public void setAwardedQuantumType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AwardedQuantumType", "setAwardedQuantumType");
    }
    this.AwardedQuantumType = value;
    this._AwardedQuantumTypeSet = true;
  }

  /** Retrieves the AwardedQuantumType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AwardedQuantumType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AwardedQuantumType field
   */
   public String getAwardedQuantumTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAwardedQuantumTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAwardedQuantumTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getAwardedQuantumType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AwardedQuantumType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAwardedQuantumTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the AwardedQuantumType field from a formatted string
   *
   * @param _value the AwardedQuantumType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AwardedQuantumType field
   */
   public void setAwardedQuantumTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAwardedQuantumTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAwardedQuantumType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AwardedQuantumType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAwardedQuantumTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAwardedQuantumTypeFromFormattedString");
   }

  /** get the value of the field: AwardedQuantumType (CDR_DATA_DUC.awarded_quantum_type)
   * @return Integer the value
   */
  public Integer getAwardedQuantumType () {
    return this.AwardedQuantumType;
  }
  /** Change the field to not being actively set: AwardedQuantumType (CDR_DATA_DUC.awarded_quantum_type)
   */
  public void unsetAwardedQuantumType () {
    this._AwardedQuantumTypeSet = false;
  }
  /** See if the field is actively set: AwardedQuantumType (CDR_DATA_DUC.awarded_quantum_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetAwardedQuantumType () {
    return this._AwardedQuantumTypeSet;
  }
  /** set the fields value: UnitsValue (CDR_DATA_DUC.units_value)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UnitsValue") 
  public void setUnitsValue (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "UnitsValue", "setUnitsValue");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "UnitsValue", "setUnitsValue");
    }
    this.UnitsValue = value;
    this._UnitsValueSet = true;
  }

  /** Retrieves the UnitsValue field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UnitsValue field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UnitsValue field
   */
   public String getUnitsValueAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitsValueAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUnitsValueAsFormattedString");
       return fmtMgr.formatBigInteger(this.getUnitsValue(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UnitsValue");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUnitsValueAsFormattedString");
       throw x;
     }
   }
  /** Sets the UnitsValue field from a formatted string
   *
   * @param _value the UnitsValue field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UnitsValue field
   */
   public void setUnitsValueFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitsValueFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUnitsValue(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UnitsValue");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUnitsValueFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUnitsValueFromFormattedString");
   }

  /** get the value of the field: UnitsValue (CDR_DATA_DUC.units_value)
   * @return BigInteger the value
   */
  public BigInteger getUnitsValue () {
    return this.UnitsValue;
  }
  /** Change the field to not being actively set: UnitsValue (CDR_DATA_DUC.units_value)
   */
  public void unsetUnitsValue () {
    this._UnitsValueSet = false;
  }
  /** See if the field is actively set: UnitsValue (CDR_DATA_DUC.units_value)
   * @return boolean whether the field is actively set
   */
  public boolean issetUnitsValue () {
    return this._UnitsValueSet;
  }
  /** set the fields value: UnitsType (CDR_DATA_DUC.units_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UnitsType") 
  public void setUnitsType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "UnitsType", "setUnitsType");
    }
    this.UnitsType = value;
    this._UnitsTypeSet = true;
  }

  /** Retrieves the UnitsType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UnitsType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UnitsType field
   */
   public String getUnitsTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitsTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUnitsTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getUnitsType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UnitsType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUnitsTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the UnitsType field from a formatted string
   *
   * @param _value the UnitsType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UnitsType field
   */
   public void setUnitsTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitsTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUnitsType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UnitsType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUnitsTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUnitsTypeFromFormattedString");
   }

  /** get the value of the field: UnitsType (CDR_DATA_DUC.units_type)
   * @return Integer the value
   */
  public Integer getUnitsType () {
    return this.UnitsType;
  }
  /** Change the field to not being actively set: UnitsType (CDR_DATA_DUC.units_type)
   */
  public void unsetUnitsType () {
    this._UnitsTypeSet = false;
  }
  /** See if the field is actively set: UnitsType (CDR_DATA_DUC.units_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetUnitsType () {
    return this._UnitsTypeSet;
  }
  /** set the fields value: MoneyValue (CDR_DATA_DUC.money_value)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MoneyValue") 
  public void setMoneyValue (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "MoneyValue", "setMoneyValue");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "MoneyValue", "setMoneyValue");
    }
    this.MoneyValue = value;
    this._MoneyValueSet = true;
  }

  /** Retrieves the MoneyValue field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MoneyValue field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MoneyValue field
   */
   public String getMoneyValueAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMoneyValueAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMoneyValueAsFormattedString");
       return fmtMgr.formatBigInteger(this.getMoneyValue(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MoneyValue");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMoneyValueAsFormattedString");
       throw x;
     }
   }
  /** Sets the MoneyValue field from a formatted string
   *
   * @param _value the MoneyValue field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MoneyValue field
   */
   public void setMoneyValueFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMoneyValueFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMoneyValue(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MoneyValue");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMoneyValueFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMoneyValueFromFormattedString");
   }

  /**
   * Retrieves the MoneyValue field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MoneyValue field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the MoneyValue field
   */
  public String getMoneyValueAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMoneyValueAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMoneyValueAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getMoneyValue(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MoneyValue");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMoneyValueAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the MoneyValue field value from a formatted currency string
   *
   * @param _value the MoneyValue field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MoneyValue field
   */
  public void setMoneyValueFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMoneyValueFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setMoneyValue(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MoneyValue");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMoneyValueFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMoneyValueFromFormattedCurrencyString");
  }

  /** get the value of the field: MoneyValue (CDR_DATA_DUC.money_value)
   * @return BigInteger the value
   */
  public BigInteger getMoneyValue () {
    return this.MoneyValue;
  }
  /** Change the field to not being actively set: MoneyValue (CDR_DATA_DUC.money_value)
   */
  public void unsetMoneyValue () {
    this._MoneyValueSet = false;
  }
  /** See if the field is actively set: MoneyValue (CDR_DATA_DUC.money_value)
   * @return boolean whether the field is actively set
   */
  public boolean issetMoneyValue () {
    return this._MoneyValueSet;
  }
  /** set the fields value: CurrencyCode (CDR_DATA_DUC.currency_code)
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

  /** get the value of the field: CurrencyCode (CDR_DATA_DUC.currency_code)
   * @return Integer the value
   */
  public Integer getCurrencyCode () {
    return this.CurrencyCode;
  }
  /** Change the field to not being actively set: CurrencyCode (CDR_DATA_DUC.currency_code)
   */
  public void unsetCurrencyCode () {
    this._CurrencyCodeSet = false;
  }
  /** See if the field is actively set: CurrencyCode (CDR_DATA_DUC.currency_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCurrencyCode () {
    return this._CurrencyCodeSet;
  }
  /** set the fields value: RebateProrationRatio (CDR_DATA_DUC.rebate_proration_ratio)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RebateProrationRatio") 
  public void setRebateProrationRatio (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RebateProrationRatio", "setRebateProrationRatio");
    }
    this.RebateProrationRatio = value;
    this._RebateProrationRatioSet = true;
  }

  /** Retrieves the RebateProrationRatio field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RebateProrationRatio field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RebateProrationRatio field
   */
   public String getRebateProrationRatioAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRebateProrationRatioAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRebateProrationRatioAsFormattedString");
       return fmtMgr.formatNumber(this.getRebateProrationRatio(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RebateProrationRatio");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRebateProrationRatioAsFormattedString");
       throw x;
     }
   }
  /** Sets the RebateProrationRatio field from a formatted string
   *
   * @param _value the RebateProrationRatio field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RebateProrationRatio field
   */
   public void setRebateProrationRatioFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRebateProrationRatioFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRebateProrationRatio(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RebateProrationRatio");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRebateProrationRatioFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRebateProrationRatioFromFormattedString");
   }

  /** get the value of the field: RebateProrationRatio (CDR_DATA_DUC.rebate_proration_ratio)
   * @return Integer the value
   */
  public Integer getRebateProrationRatio () {
    return this.RebateProrationRatio;
  }
  /** Change the field to not being actively set: RebateProrationRatio (CDR_DATA_DUC.rebate_proration_ratio)
   */
  public void unsetRebateProrationRatio () {
    this._RebateProrationRatioSet = false;
  }
  /** See if the field is actively set: RebateProrationRatio (CDR_DATA_DUC.rebate_proration_ratio)
   * @return boolean whether the field is actively set
   */
  public boolean issetRebateProrationRatio () {
    return this._RebateProrationRatioSet;
  }
  /** set the fields value: ThresholdProrationRatio (CDR_DATA_DUC.threshold_proration_ratio)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ThresholdProrationRatio") 
  public void setThresholdProrationRatio (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ThresholdProrationRatio", "setThresholdProrationRatio");
    }
    this.ThresholdProrationRatio = value;
    this._ThresholdProrationRatioSet = true;
  }

  /** Retrieves the ThresholdProrationRatio field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ThresholdProrationRatio field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ThresholdProrationRatio field
   */
   public String getThresholdProrationRatioAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getThresholdProrationRatioAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getThresholdProrationRatioAsFormattedString");
       return fmtMgr.formatNumber(this.getThresholdProrationRatio(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ThresholdProrationRatio");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getThresholdProrationRatioAsFormattedString");
       throw x;
     }
   }
  /** Sets the ThresholdProrationRatio field from a formatted string
   *
   * @param _value the ThresholdProrationRatio field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ThresholdProrationRatio field
   */
   public void setThresholdProrationRatioFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getThresholdProrationRatioFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setThresholdProrationRatio(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ThresholdProrationRatio");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setThresholdProrationRatioFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setThresholdProrationRatioFromFormattedString");
   }

  /** get the value of the field: ThresholdProrationRatio (CDR_DATA_DUC.threshold_proration_ratio)
   * @return Integer the value
   */
  public Integer getThresholdProrationRatio () {
    return this.ThresholdProrationRatio;
  }
  /** Change the field to not being actively set: ThresholdProrationRatio (CDR_DATA_DUC.threshold_proration_ratio)
   */
  public void unsetThresholdProrationRatio () {
    this._ThresholdProrationRatioSet = false;
  }
  /** See if the field is actively set: ThresholdProrationRatio (CDR_DATA_DUC.threshold_proration_ratio)
   * @return boolean whether the field is actively set
   */
  public boolean issetThresholdProrationRatio () {
    return this._ThresholdProrationRatioSet;
  }
  /** set the fields value: ProfileId (CDR_DATA_DUC.profile_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ProfileId") 
  public void setProfileId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ProfileId", "setProfileId");
    }
    this.ProfileId = value;
    this._ProfileIdSet = true;
  }

  /** Retrieves the ProfileId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ProfileId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProfileId field
   */
   public String getProfileIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProfileIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProfileIdAsFormattedString");
       return fmtMgr.formatNumber(this.getProfileId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProfileId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getProfileIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ProfileId field from a formatted string
   *
   * @param _value the ProfileId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ProfileId field
   */
   public void setProfileIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProfileIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setProfileId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProfileId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setProfileIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProfileIdFromFormattedString");
   }

  /** get the value of the field: ProfileId (CDR_DATA_DUC.profile_id)
   * @return Integer the value
   */
  public Integer getProfileId () {
    return this.ProfileId;
  }
  /** Change the field to not being actively set: ProfileId (CDR_DATA_DUC.profile_id)
   */
  public void unsetProfileId () {
    this._ProfileIdSet = false;
  }
  /** See if the field is actively set: ProfileId (CDR_DATA_DUC.profile_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetProfileId () {
    return this._ProfileIdSet;
  }
  /** set the fields value: ProfileIdServ (CDR_DATA_DUC.profile_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ProfileIdServ") 
  public void setProfileIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ProfileIdServ", "setProfileIdServ");
    }
    this.ProfileIdServ = value;
    this._ProfileIdServSet = true;
  }

  /** Retrieves the ProfileIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ProfileIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProfileIdServ field
   */
   public String getProfileIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProfileIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProfileIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getProfileIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProfileIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getProfileIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the ProfileIdServ field from a formatted string
   *
   * @param _value the ProfileIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ProfileIdServ field
   */
   public void setProfileIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProfileIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setProfileIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProfileIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setProfileIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProfileIdServFromFormattedString");
   }

  /** get the value of the field: ProfileIdServ (CDR_DATA_DUC.profile_id_serv)
   * @return Integer the value
   */
  public Integer getProfileIdServ () {
    return this.ProfileIdServ;
  }
  /** Change the field to not being actively set: ProfileIdServ (CDR_DATA_DUC.profile_id_serv)
   */
  public void unsetProfileIdServ () {
    this._ProfileIdServSet = false;
  }
  /** See if the field is actively set: ProfileIdServ (CDR_DATA_DUC.profile_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetProfileIdServ () {
    return this._ProfileIdServSet;
  }
  /** set the fields value: InstanceNum (CDR_DATA_DUC.instance_num)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("InstanceNum") 
  public void setInstanceNum (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "InstanceNum", "setInstanceNum");
    }
    this.InstanceNum = value;
    this._InstanceNumSet = true;
  }

  /** Retrieves the InstanceNum field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InstanceNum field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InstanceNum field
   */
   public String getInstanceNumAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInstanceNumAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInstanceNumAsFormattedString");
       return fmtMgr.formatNumber(this.getInstanceNum(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InstanceNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInstanceNumAsFormattedString");
       throw x;
     }
   }
  /** Sets the InstanceNum field from a formatted string
   *
   * @param _value the InstanceNum field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InstanceNum field
   */
   public void setInstanceNumFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInstanceNumFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInstanceNum(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InstanceNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInstanceNumFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInstanceNumFromFormattedString");
   }

  /** get the value of the field: InstanceNum (CDR_DATA_DUC.instance_num)
   * @return Integer the value
   */
  public Integer getInstanceNum () {
    return this.InstanceNum;
  }
  /** Change the field to not being actively set: InstanceNum (CDR_DATA_DUC.instance_num)
   */
  public void unsetInstanceNum () {
    this._InstanceNumSet = false;
  }
  /** See if the field is actively set: InstanceNum (CDR_DATA_DUC.instance_num)
   * @return boolean whether the field is actively set
   */
  public boolean issetInstanceNum () {
    return this._InstanceNumSet;
  }
  /** set the fields value: QuantumPreCharge (CDR_DATA_DUC.quantum_pre_charge)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("QuantumPreCharge") 
  public void setQuantumPreCharge (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "QuantumPreCharge", "setQuantumPreCharge");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "QuantumPreCharge", "setQuantumPreCharge");
    }
    this.QuantumPreCharge = value;
    this._QuantumPreChargeSet = true;
  }

  /** Retrieves the QuantumPreCharge field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The QuantumPreCharge field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the QuantumPreCharge field
   */
   public String getQuantumPreChargeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getQuantumPreChargeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getQuantumPreChargeAsFormattedString");
       return fmtMgr.formatBigInteger(this.getQuantumPreCharge(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("QuantumPreCharge");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getQuantumPreChargeAsFormattedString");
       throw x;
     }
   }
  /** Sets the QuantumPreCharge field from a formatted string
   *
   * @param _value the QuantumPreCharge field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the QuantumPreCharge field
   */
   public void setQuantumPreChargeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getQuantumPreChargeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setQuantumPreCharge(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("QuantumPreCharge");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setQuantumPreChargeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setQuantumPreChargeFromFormattedString");
   }

  /**
   * Retrieves the QuantumPreCharge field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The QuantumPreCharge field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the QuantumPreCharge field
   */
  public String getQuantumPreChargeAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getQuantumPreChargeAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getQuantumPreChargeAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getQuantumPreCharge(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("QuantumPreCharge");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getQuantumPreChargeAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the QuantumPreCharge field value from a formatted currency string
   *
   * @param _value the QuantumPreCharge field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the QuantumPreCharge field
   */
  public void setQuantumPreChargeFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setQuantumPreChargeFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setQuantumPreCharge(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("QuantumPreCharge");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setQuantumPreChargeFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setQuantumPreChargeFromFormattedCurrencyString");
  }

  /** get the value of the field: QuantumPreCharge (CDR_DATA_DUC.quantum_pre_charge)
   * @return BigInteger the value
   */
  public BigInteger getQuantumPreCharge () {
    return this.QuantumPreCharge;
  }
  /** Change the field to not being actively set: QuantumPreCharge (CDR_DATA_DUC.quantum_pre_charge)
   */
  public void unsetQuantumPreCharge () {
    this._QuantumPreChargeSet = false;
  }
  /** See if the field is actively set: QuantumPreCharge (CDR_DATA_DUC.quantum_pre_charge)
   * @return boolean whether the field is actively set
   */
  public boolean issetQuantumPreCharge () {
    return this._QuantumPreChargeSet;
  }
  /** set the fields value: CreateDt (CDR_DATA_DUC.create_dt)
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

  /** get the value of the field: CreateDt (CDR_DATA_DUC.create_dt)
   * @return Date the value
   */
  public Date getCreateDt () {
    return this.CreateDt;
  }
  /** Change the field to not being actively set: CreateDt (CDR_DATA_DUC.create_dt)
   */
  public void unsetCreateDt () {
    this._CreateDtSet = false;
  }
  /** See if the field is actively set: CreateDt (CDR_DATA_DUC.create_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetCreateDt () {
    return this._CreateDtSet;
  }
  /** set the fields value: InstanceStartDt (CDR_DATA_DUC.instance_start_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("InstanceStartDt") 
  public void setInstanceStartDt (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "InstanceStartDt", "setInstanceStartDt");
    }
    this.InstanceStartDt = value;
    this._InstanceStartDtSet = true;
  }

  /** Retrieves the InstanceStartDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InstanceStartDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InstanceStartDt field
   */
   public String getInstanceStartDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInstanceStartDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInstanceStartDtAsFormattedString");
       return fmtMgr.formatDate(this.getInstanceStartDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InstanceStartDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInstanceStartDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the InstanceStartDt field from a formatted string
   *
   * @param _value the InstanceStartDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InstanceStartDt field
   */
   public void setInstanceStartDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInstanceStartDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInstanceStartDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InstanceStartDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInstanceStartDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInstanceStartDtFromFormattedString");
   }

  /**
   * Retrieves the InstanceStartDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InstanceStartDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the InstanceStartDt field
   */
  public String getInstanceStartDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInstanceStartDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInstanceStartDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getInstanceStartDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InstanceStartDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInstanceStartDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the InstanceStartDt field value from a formatted date/time string
   *
   * @param _value the InstanceStartDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InstanceStartDt field
   */
  public void setInstanceStartDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInstanceStartDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setInstanceStartDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InstanceStartDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInstanceStartDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: InstanceStartDt (CDR_DATA_DUC.instance_start_dt)
   * @return Date the value
   */
  public Date getInstanceStartDt () {
    return this.InstanceStartDt;
  }
  /** Change the field to not being actively set: InstanceStartDt (CDR_DATA_DUC.instance_start_dt)
   */
  public void unsetInstanceStartDt () {
    this._InstanceStartDtSet = false;
  }
  /** See if the field is actively set: InstanceStartDt (CDR_DATA_DUC.instance_start_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetInstanceStartDt () {
    return this._InstanceStartDtSet;
  }
  /** set the fields value: Annotation (CDR_DATA_DUC.annotation)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Annotation") 
  public void setAnnotation (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 255))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Annotation", "setAnnotation");
    }
    this.Annotation = value;
    this._AnnotationSet = true;
  }

  /** Retrieves the Annotation field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Annotation field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Annotation field
   */
   public String getAnnotationAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAnnotationAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAnnotationAsFormattedString");
       return fmtMgr.formatString(this.getAnnotation());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Annotation");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAnnotationAsFormattedString");
       throw x;
     }
   }
  /** Sets the Annotation field from a formatted string
   *
   * @param _value the Annotation field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Annotation field
   */
   public void setAnnotationFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAnnotationFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAnnotation(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Annotation");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAnnotationFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAnnotationFromFormattedString");
   }

  /** get the value of the field: Annotation (CDR_DATA_DUC.annotation)
   * @return String the value
   */
  public String getAnnotation () {
    return this.Annotation;
  }
  /** Change the field to not being actively set: Annotation (CDR_DATA_DUC.annotation)
   */
  public void unsetAnnotation () {
    this._AnnotationSet = false;
  }
  /** See if the field is actively set: Annotation (CDR_DATA_DUC.annotation)
   * @return boolean whether the field is actively set
   */
  public boolean issetAnnotation () {
    return this._AnnotationSet;
  }
  public String toString() {
    return CdrDataDucObjectHelper.toMap(this, null).toString();
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
    
  /** CDR_DATA_DUC.cdr_data_partition_key field */
    if(!nonNullOnly || (CdrDataPartitionKey != null))  _CdrDataPartitionKeySet = flag;
  /** CDR_DATA_DUC.msg_id field */
    if(!nonNullOnly || (MsgId != null))  _MsgIdSet = flag;
  /** CDR_DATA_DUC.msg_id2 field */
    if(!nonNullOnly || (MsgId2 != null))  _MsgId2Set = flag;
  /** CDR_DATA_DUC.msg_id_serv field */
    if(!nonNullOnly || (MsgIdServ != null))  _MsgIdServSet = flag;
  /** CDR_DATA_DUC.split_row_num field */
    if(!nonNullOnly || (SplitRowNum != null))  _SplitRowNumSet = flag;
  /** CDR_DATA_DUC.duc_type field */
    if(!nonNullOnly || (DucType != null))  _DucTypeSet = flag;
  /** CDR_DATA_DUC.duc_subtype field */
    if(!nonNullOnly || (DucSubtype != null))  _DucSubtypeSet = flag;
  /** CDR_DATA_DUC.duc_plan_id field */
    if(!nonNullOnly || (DucPlanId != null))  _DucPlanIdSet = flag;
  /** CDR_DATA_DUC.duc_id field */
    if(!nonNullOnly || (DucId != null))  _DucIdSet = flag;
  /** CDR_DATA_DUC.contract_tracking_id field */
    if(!nonNullOnly || (ContractTrackingId != null))  _ContractTrackingIdSet = flag;
  /** CDR_DATA_DUC.contract_tracking_id_serv field */
    if(!nonNullOnly || (ContractTrackingIdServ != null))  _ContractTrackingIdServSet = flag;
  /** CDR_DATA_DUC.awarded_quantum_type field */
    if(!nonNullOnly || (AwardedQuantumType != null))  _AwardedQuantumTypeSet = flag;
  /** CDR_DATA_DUC.units_value field */
    if(!nonNullOnly || (UnitsValue != null))  _UnitsValueSet = flag;
  /** CDR_DATA_DUC.units_type field */
    if(!nonNullOnly || (UnitsType != null))  _UnitsTypeSet = flag;
  /** CDR_DATA_DUC.money_value field */
    if(!nonNullOnly || (MoneyValue != null))  _MoneyValueSet = flag;
  /** CDR_DATA_DUC.currency_code field */
    if(!nonNullOnly || (CurrencyCode != null))  _CurrencyCodeSet = flag;
  /** CDR_DATA_DUC.rebate_proration_ratio field */
    if(!nonNullOnly || (RebateProrationRatio != null))  _RebateProrationRatioSet = flag;
  /** CDR_DATA_DUC.threshold_proration_ratio field */
    if(!nonNullOnly || (ThresholdProrationRatio != null))  _ThresholdProrationRatioSet = flag;
  /** CDR_DATA_DUC.profile_id field */
    if(!nonNullOnly || (ProfileId != null))  _ProfileIdSet = flag;
  /** CDR_DATA_DUC.profile_id_serv field */
    if(!nonNullOnly || (ProfileIdServ != null))  _ProfileIdServSet = flag;
  /** CDR_DATA_DUC.instance_num field */
    if(!nonNullOnly || (InstanceNum != null))  _InstanceNumSet = flag;
  /** CDR_DATA_DUC.quantum_pre_charge field */
    if(!nonNullOnly || (QuantumPreCharge != null))  _QuantumPreChargeSet = flag;
  /** CDR_DATA_DUC.create_dt field */
    if(!nonNullOnly || (CreateDt != null))  _CreateDtSet = flag;
  /** CDR_DATA_DUC.instance_start_dt field */
    if(!nonNullOnly || (InstanceStartDt != null))  _InstanceStartDtSet = flag;
  /** CDR_DATA_DUC.annotation field */
    if(!nonNullOnly || (Annotation != null))  _AnnotationSet = flag;
  }
}
