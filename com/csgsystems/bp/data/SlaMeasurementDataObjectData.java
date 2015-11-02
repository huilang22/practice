/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: SlaMeasurementDataObjectData.java
 * Definition File: Customer/SlaMeasurementData.xml
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
  
/** SlaMeasurementDataObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class SlaMeasurementDataObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public SlaMeasurementDataObjectKeyData Key = null;
  /** SLA_MEASUREMENT_DATA.account_no field */
  public    Integer AccountInternalId  = null;
  protected boolean _AccountInternalIdSet = false;
  /** SLA_MEASUREMENT_DATA.subscr_no field */
  public    Integer ServiceInternalId  = null;
  protected boolean _ServiceInternalIdSet = false;
  /** SLA_MEASUREMENT_DATA.subscr_no_resets field */
  public    Integer ServiceInternalIdResets  = null;
  protected boolean _ServiceInternalIdResetsSet = false;
  /** SLA_MEASUREMENT_DATA.bill_ref_no field */
  public    Integer BillRefNo  = null;
  protected boolean _BillRefNoSet = false;
  /** SLA_MEASUREMENT_DATA.bill_ref_resets field */
  public    Integer BillRefResets  = null;
  protected boolean _BillRefResetsSet = false;
  /** SLA_MEASUREMENT_DATA.sla_measurement_type_id field */
  public    Integer SlaMeasurementTypeId  = null;
  protected boolean _SlaMeasurementTypeIdSet = false;
  /** SLA_MEASUREMENT_DATA.measurement_value field */
  public    BigInteger MeasurementValue  = null;
  protected boolean _MeasurementValueSet = false;
  /** SLA_MEASUREMENT_DATA.sla_ext_id field */
  public    BigInteger SlaExtId  = null;
  protected boolean _SlaExtIdSet = false;
  /** SLA_MEASUREMENT_DATA.trans_dt field */
  public    Date TransDt  = null;
  protected boolean _TransDtSet = false;
  /** SLA_MEASUREMENT_DATA.status field */
  public    Integer Status  = null;
  protected boolean _StatusSet = false;
  /** SLA_MEASUREMENT_DATA.entry_date field */
  public    Date EntryDate  = null;
  protected boolean _EntryDateSet = false;
  /** SLA_MEASUREMENT_DATA.error_code field */
  public    Integer ErrorCode  = null;
  protected boolean _ErrorCodeSet = false;
  /** SLA_MEASUREMENT_DATA.sla_data_partition_key field */
  public    Date SlaDataPartitionKey  = null;
  protected boolean _SlaDataPartitionKeySet = false;
  /** SLA_MEASUREMENT_DATA.chg_date field */
  public    Date ChgDate  = null;
  protected boolean _ChgDateSet = false;
  /** SLA_MEASUREMENT_DATA.chg_who field */
  public    String ChgWho  = null;
  protected boolean _ChgWhoSet = false;
  private String _objName = "SlaMeasurementDataObjectData";
  /** Default constructor */
  public SlaMeasurementDataObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public SlaMeasurementDataObjectData (SlaMeasurementDataObjectData other)
  {

    if (other == null) return;
    this.Key = new SlaMeasurementDataObjectKeyData (other.Key);
    this.AccountInternalId = other.AccountInternalId;
    this._AccountInternalIdSet = other._AccountInternalIdSet;
    this.ServiceInternalId = other.ServiceInternalId;
    this._ServiceInternalIdSet = other._ServiceInternalIdSet;
    this.ServiceInternalIdResets = other.ServiceInternalIdResets;
    this._ServiceInternalIdResetsSet = other._ServiceInternalIdResetsSet;
    this.BillRefNo = other.BillRefNo;
    this._BillRefNoSet = other._BillRefNoSet;
    this.BillRefResets = other.BillRefResets;
    this._BillRefResetsSet = other._BillRefResetsSet;
    this.SlaMeasurementTypeId = other.SlaMeasurementTypeId;
    this._SlaMeasurementTypeIdSet = other._SlaMeasurementTypeIdSet;
    this.MeasurementValue = other.MeasurementValue;
    this._MeasurementValueSet = other._MeasurementValueSet;
    this.SlaExtId = other.SlaExtId;
    this._SlaExtIdSet = other._SlaExtIdSet;
    this.TransDt = other.TransDt;
    this._TransDtSet = other._TransDtSet;
    this.Status = other.Status;
    this._StatusSet = other._StatusSet;
    this.EntryDate = other.EntryDate;
    this._EntryDateSet = other._EntryDateSet;
    this.ErrorCode = other.ErrorCode;
    this._ErrorCodeSet = other._ErrorCodeSet;
    this.SlaDataPartitionKey = other.SlaDataPartitionKey;
    this._SlaDataPartitionKeySet = other._SlaDataPartitionKeySet;
    this.ChgDate = other.ChgDate;
    this._ChgDateSet = other._ChgDateSet;
    this.ChgWho = other.ChgWho;
    this._ChgWhoSet = other._ChgWhoSet;
  }

  /** get the Key for this object
   * @return SlaMeasurementDataObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public SlaMeasurementDataObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (SlaMeasurementDataObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: SlaMsmTrackingId (SLA_MEASUREMENT_DATA.sla_msm_tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setSlaMsmTrackingId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SlaMsmTrackingId", "setSlaMsmTrackingId");
    }
    if (this.Key == null) this.Key = new SlaMeasurementDataObjectKeyData ();
    this.Key.SlaMsmTrackingId = value;
    this.Key._SlaMsmTrackingIdSet = true;
  }
  /** get the value of the field: SlaMsmTrackingId (SLA_MEASUREMENT_DATA.sla_msm_tracking_id)
   * @return Integer the value
   */
  public Integer getSlaMsmTrackingId () {
    if (this.Key == null) return null;
    return this.Key.SlaMsmTrackingId;
  }
  /** Change the field to not being actively set: SlaMsmTrackingId (SLA_MEASUREMENT_DATA.sla_msm_tracking_id)
   */
  public void unsetSlaMsmTrackingId () {
    if (this.Key == null) return;
    this.Key._SlaMsmTrackingIdSet = false;
  }
  /** See if the field is actively set: SlaMsmTrackingId (SLA_MEASUREMENT_DATA.sla_msm_tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetSlaMsmTrackingId () {
    if (this.Key == null) return false;
    return this.Key._SlaMsmTrackingIdSet;
  }

  /** Retrieves the SlaMsmTrackingId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SlaMsmTrackingId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SlaMsmTrackingId field
   */
   public String getSlaMsmTrackingIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSlaMsmTrackingIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSlaMsmTrackingIdAsFormattedString");
       return fmtMgr.formatNumber(this.getSlaMsmTrackingId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SlaMsmTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSlaMsmTrackingIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the SlaMsmTrackingId field from a formatted string
   *
   * @param _value the SlaMsmTrackingId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SlaMsmTrackingId field
   */
   public void setSlaMsmTrackingIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSlaMsmTrackingIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSlaMsmTrackingId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SlaMsmTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSlaMsmTrackingIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSlaMsmTrackingIdFromFormattedString");
   }

  /** set the fields value: SlaMsmTrackingIdServ (SLA_MEASUREMENT_DATA.sla_msm_tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setSlaMsmTrackingIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SlaMsmTrackingIdServ", "setSlaMsmTrackingIdServ");
    }
    if (this.Key == null) this.Key = new SlaMeasurementDataObjectKeyData ();
    this.Key.SlaMsmTrackingIdServ = value;
    this.Key._SlaMsmTrackingIdServSet = true;
  }
  /** get the value of the field: SlaMsmTrackingIdServ (SLA_MEASUREMENT_DATA.sla_msm_tracking_id_serv)
   * @return Integer the value
   */
  public Integer getSlaMsmTrackingIdServ () {
    if (this.Key == null) return null;
    return this.Key.SlaMsmTrackingIdServ;
  }
  /** Change the field to not being actively set: SlaMsmTrackingIdServ (SLA_MEASUREMENT_DATA.sla_msm_tracking_id_serv)
   */
  public void unsetSlaMsmTrackingIdServ () {
    if (this.Key == null) return;
    this.Key._SlaMsmTrackingIdServSet = false;
  }
  /** See if the field is actively set: SlaMsmTrackingIdServ (SLA_MEASUREMENT_DATA.sla_msm_tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetSlaMsmTrackingIdServ () {
    if (this.Key == null) return false;
    return this.Key._SlaMsmTrackingIdServSet;
  }

  /** Retrieves the SlaMsmTrackingIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SlaMsmTrackingIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SlaMsmTrackingIdServ field
   */
   public String getSlaMsmTrackingIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSlaMsmTrackingIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSlaMsmTrackingIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getSlaMsmTrackingIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SlaMsmTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSlaMsmTrackingIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the SlaMsmTrackingIdServ field from a formatted string
   *
   * @param _value the SlaMsmTrackingIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SlaMsmTrackingIdServ field
   */
   public void setSlaMsmTrackingIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSlaMsmTrackingIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSlaMsmTrackingIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SlaMsmTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSlaMsmTrackingIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSlaMsmTrackingIdServFromFormattedString");
   }

  /** set the fields value: AccountInternalId (SLA_MEASUREMENT_DATA.account_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AccountInternalId") 
  public void setAccountInternalId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountInternalId", "setAccountInternalId");
    }
    this.AccountInternalId = value;
    this._AccountInternalIdSet = true;
  }

  /** Retrieves the AccountInternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AccountInternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountInternalId field
   */
   public String getAccountInternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountInternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountInternalIdAsFormattedString");
       return fmtMgr.formatNumber(this.getAccountInternalId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountInternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the AccountInternalId field from a formatted string
   *
   * @param _value the AccountInternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AccountInternalId field
   */
   public void setAccountInternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountInternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAccountInternalId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountInternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountInternalIdFromFormattedString");
   }

  /** get the value of the field: AccountInternalId (SLA_MEASUREMENT_DATA.account_no)
   * @return Integer the value
   */
  public Integer getAccountInternalId () {
    return this.AccountInternalId;
  }
  /** Change the field to not being actively set: AccountInternalId (SLA_MEASUREMENT_DATA.account_no)
   */
  public void unsetAccountInternalId () {
    this._AccountInternalIdSet = false;
  }
  /** See if the field is actively set: AccountInternalId (SLA_MEASUREMENT_DATA.account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountInternalId () {
    return this._AccountInternalIdSet;
  }
  /** set the fields value: ServiceInternalId (SLA_MEASUREMENT_DATA.subscr_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServiceInternalId") 
  public void setServiceInternalId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ServiceInternalId", "setServiceInternalId");
    }
    this.ServiceInternalId = value;
    this._ServiceInternalIdSet = true;
  }

  /** Retrieves the ServiceInternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServiceInternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceInternalId field
   */
   public String getServiceInternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceInternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceInternalIdAsFormattedString");
       return fmtMgr.formatNumber(this.getServiceInternalId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceInternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServiceInternalId field from a formatted string
   *
   * @param _value the ServiceInternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServiceInternalId field
   */
   public void setServiceInternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceInternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServiceInternalId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceInternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceInternalIdFromFormattedString");
   }

  /** get the value of the field: ServiceInternalId (SLA_MEASUREMENT_DATA.subscr_no)
   * @return Integer the value
   */
  public Integer getServiceInternalId () {
    return this.ServiceInternalId;
  }
  /** Change the field to not being actively set: ServiceInternalId (SLA_MEASUREMENT_DATA.subscr_no)
   */
  public void unsetServiceInternalId () {
    this._ServiceInternalIdSet = false;
  }
  /** See if the field is actively set: ServiceInternalId (SLA_MEASUREMENT_DATA.subscr_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceInternalId () {
    return this._ServiceInternalIdSet;
  }
  /** set the fields value: ServiceInternalIdResets (SLA_MEASUREMENT_DATA.subscr_no_resets)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServiceInternalIdResets") 
  public void setServiceInternalIdResets (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ServiceInternalIdResets", "setServiceInternalIdResets");
    }
    this.ServiceInternalIdResets = value;
    this._ServiceInternalIdResetsSet = true;
  }

  /** Retrieves the ServiceInternalIdResets field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServiceInternalIdResets field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceInternalIdResets field
   */
   public String getServiceInternalIdResetsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceInternalIdResetsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceInternalIdResetsAsFormattedString");
       return fmtMgr.formatNumber(this.getServiceInternalIdResets(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceInternalIdResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceInternalIdResetsAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServiceInternalIdResets field from a formatted string
   *
   * @param _value the ServiceInternalIdResets field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServiceInternalIdResets field
   */
   public void setServiceInternalIdResetsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceInternalIdResetsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServiceInternalIdResets(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceInternalIdResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceInternalIdResetsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceInternalIdResetsFromFormattedString");
   }

  /** get the value of the field: ServiceInternalIdResets (SLA_MEASUREMENT_DATA.subscr_no_resets)
   * @return Integer the value
   */
  public Integer getServiceInternalIdResets () {
    return this.ServiceInternalIdResets;
  }
  /** Change the field to not being actively set: ServiceInternalIdResets (SLA_MEASUREMENT_DATA.subscr_no_resets)
   */
  public void unsetServiceInternalIdResets () {
    this._ServiceInternalIdResetsSet = false;
  }
  /** See if the field is actively set: ServiceInternalIdResets (SLA_MEASUREMENT_DATA.subscr_no_resets)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceInternalIdResets () {
    return this._ServiceInternalIdResetsSet;
  }
  /** set the fields value: BillRefNo (SLA_MEASUREMENT_DATA.bill_ref_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillRefNo") 
  public void setBillRefNo (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillRefNo", "setBillRefNo");
    }
    this.BillRefNo = value;
    this._BillRefNoSet = true;
  }

  /** Retrieves the BillRefNo field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillRefNo field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillRefNo field
   */
   public String getBillRefNoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillRefNoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillRefNoAsFormattedString");
       return fmtMgr.formatNumber(this.getBillRefNo(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillRefNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillRefNoAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillRefNo field from a formatted string
   *
   * @param _value the BillRefNo field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillRefNo field
   */
   public void setBillRefNoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillRefNoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillRefNo(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillRefNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillRefNoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillRefNoFromFormattedString");
   }

  /** get the value of the field: BillRefNo (SLA_MEASUREMENT_DATA.bill_ref_no)
   * @return Integer the value
   */
  public Integer getBillRefNo () {
    return this.BillRefNo;
  }
  /** Change the field to not being actively set: BillRefNo (SLA_MEASUREMENT_DATA.bill_ref_no)
   */
  public void unsetBillRefNo () {
    this._BillRefNoSet = false;
  }
  /** See if the field is actively set: BillRefNo (SLA_MEASUREMENT_DATA.bill_ref_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillRefNo () {
    return this._BillRefNoSet;
  }
  /** set the fields value: BillRefResets (SLA_MEASUREMENT_DATA.bill_ref_resets)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillRefResets") 
  public void setBillRefResets (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillRefResets", "setBillRefResets");
    }
    this.BillRefResets = value;
    this._BillRefResetsSet = true;
  }

  /** Retrieves the BillRefResets field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillRefResets field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillRefResets field
   */
   public String getBillRefResetsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillRefResetsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillRefResetsAsFormattedString");
       return fmtMgr.formatNumber(this.getBillRefResets(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillRefResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillRefResetsAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillRefResets field from a formatted string
   *
   * @param _value the BillRefResets field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillRefResets field
   */
   public void setBillRefResetsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillRefResetsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillRefResets(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillRefResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillRefResetsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillRefResetsFromFormattedString");
   }

  /** get the value of the field: BillRefResets (SLA_MEASUREMENT_DATA.bill_ref_resets)
   * @return Integer the value
   */
  public Integer getBillRefResets () {
    return this.BillRefResets;
  }
  /** Change the field to not being actively set: BillRefResets (SLA_MEASUREMENT_DATA.bill_ref_resets)
   */
  public void unsetBillRefResets () {
    this._BillRefResetsSet = false;
  }
  /** See if the field is actively set: BillRefResets (SLA_MEASUREMENT_DATA.bill_ref_resets)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillRefResets () {
    return this._BillRefResetsSet;
  }
  /** set the fields value: SlaMeasurementTypeId (SLA_MEASUREMENT_DATA.sla_measurement_type_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SlaMeasurementTypeId") 
  public void setSlaMeasurementTypeId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SlaMeasurementTypeId", "setSlaMeasurementTypeId");
    }
    this.SlaMeasurementTypeId = value;
    this._SlaMeasurementTypeIdSet = true;
  }

  /** Retrieves the SlaMeasurementTypeId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SlaMeasurementTypeId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SlaMeasurementTypeId field
   */
   public String getSlaMeasurementTypeIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSlaMeasurementTypeIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSlaMeasurementTypeIdAsFormattedString");
       return fmtMgr.formatNumber(this.getSlaMeasurementTypeId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SlaMeasurementTypeId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSlaMeasurementTypeIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the SlaMeasurementTypeId field from a formatted string
   *
   * @param _value the SlaMeasurementTypeId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SlaMeasurementTypeId field
   */
   public void setSlaMeasurementTypeIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSlaMeasurementTypeIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSlaMeasurementTypeId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SlaMeasurementTypeId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSlaMeasurementTypeIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSlaMeasurementTypeIdFromFormattedString");
   }

  /** get the value of the field: SlaMeasurementTypeId (SLA_MEASUREMENT_DATA.sla_measurement_type_id)
   * @return Integer the value
   */
  public Integer getSlaMeasurementTypeId () {
    return this.SlaMeasurementTypeId;
  }
  /** Change the field to not being actively set: SlaMeasurementTypeId (SLA_MEASUREMENT_DATA.sla_measurement_type_id)
   */
  public void unsetSlaMeasurementTypeId () {
    this._SlaMeasurementTypeIdSet = false;
  }
  /** See if the field is actively set: SlaMeasurementTypeId (SLA_MEASUREMENT_DATA.sla_measurement_type_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetSlaMeasurementTypeId () {
    return this._SlaMeasurementTypeIdSet;
  }
  /** set the fields value: MeasurementValue (SLA_MEASUREMENT_DATA.measurement_value)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MeasurementValue") 
  public void setMeasurementValue (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "MeasurementValue", "setMeasurementValue");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "MeasurementValue", "setMeasurementValue");
    }
    this.MeasurementValue = value;
    this._MeasurementValueSet = true;
  }

  /** Retrieves the MeasurementValue field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MeasurementValue field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MeasurementValue field
   */
   public String getMeasurementValueAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMeasurementValueAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMeasurementValueAsFormattedString");
       return fmtMgr.formatBigInteger(this.getMeasurementValue(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MeasurementValue");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMeasurementValueAsFormattedString");
       throw x;
     }
   }
  /** Sets the MeasurementValue field from a formatted string
   *
   * @param _value the MeasurementValue field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MeasurementValue field
   */
   public void setMeasurementValueFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMeasurementValueFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMeasurementValue(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MeasurementValue");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMeasurementValueFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMeasurementValueFromFormattedString");
   }

  /** get the value of the field: MeasurementValue (SLA_MEASUREMENT_DATA.measurement_value)
   * @return BigInteger the value
   */
  public BigInteger getMeasurementValue () {
    return this.MeasurementValue;
  }
  /** Change the field to not being actively set: MeasurementValue (SLA_MEASUREMENT_DATA.measurement_value)
   */
  public void unsetMeasurementValue () {
    this._MeasurementValueSet = false;
  }
  /** See if the field is actively set: MeasurementValue (SLA_MEASUREMENT_DATA.measurement_value)
   * @return boolean whether the field is actively set
   */
  public boolean issetMeasurementValue () {
    return this._MeasurementValueSet;
  }
  /** set the fields value: SlaExtId (SLA_MEASUREMENT_DATA.sla_ext_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SlaExtId") 
  public void setSlaExtId (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SlaExtId", "setSlaExtId");
    }
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "SlaExtId", "setSlaExtId");
    }
    this.SlaExtId = value;
    this._SlaExtIdSet = true;
  }

  /** Retrieves the SlaExtId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SlaExtId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SlaExtId field
   */
   public String getSlaExtIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSlaExtIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSlaExtIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getSlaExtId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SlaExtId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSlaExtIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the SlaExtId field from a formatted string
   *
   * @param _value the SlaExtId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SlaExtId field
   */
   public void setSlaExtIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSlaExtIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSlaExtId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SlaExtId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSlaExtIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSlaExtIdFromFormattedString");
   }

  /** get the value of the field: SlaExtId (SLA_MEASUREMENT_DATA.sla_ext_id)
   * @return BigInteger the value
   */
  public BigInteger getSlaExtId () {
    return this.SlaExtId;
  }
  /** Change the field to not being actively set: SlaExtId (SLA_MEASUREMENT_DATA.sla_ext_id)
   */
  public void unsetSlaExtId () {
    this._SlaExtIdSet = false;
  }
  /** See if the field is actively set: SlaExtId (SLA_MEASUREMENT_DATA.sla_ext_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetSlaExtId () {
    return this._SlaExtIdSet;
  }
  /** set the fields value: TransDt (SLA_MEASUREMENT_DATA.trans_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TransDt") 
  public void setTransDt (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TransDt", "setTransDt");
    }
    this.TransDt = value;
    this._TransDtSet = true;
  }

  /** Retrieves the TransDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TransDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransDt field
   */
   public String getTransDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransDtAsFormattedString");
       return fmtMgr.formatDate(this.getTransDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the TransDt field from a formatted string
   *
   * @param _value the TransDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TransDt field
   */
   public void setTransDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTransDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransDtFromFormattedString");
   }

  /**
   * Retrieves the TransDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransDt field
   */
  public String getTransDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getTransDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the TransDt field value from a formatted date/time string
   *
   * @param _value the TransDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TransDt field
   */
  public void setTransDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setTransDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: TransDt (SLA_MEASUREMENT_DATA.trans_dt)
   * @return Date the value
   */
  public Date getTransDt () {
    return this.TransDt;
  }
  /** Change the field to not being actively set: TransDt (SLA_MEASUREMENT_DATA.trans_dt)
   */
  public void unsetTransDt () {
    this._TransDtSet = false;
  }
  /** See if the field is actively set: TransDt (SLA_MEASUREMENT_DATA.trans_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetTransDt () {
    return this._TransDtSet;
  }
  /** set the fields value: Status (SLA_MEASUREMENT_DATA.status)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Status") 
  public void setStatus (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Status", "setStatus");
    }
    this.Status = value;
    this._StatusSet = true;
  }

  /** Retrieves the Status field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Status field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Status field
   */
   public String getStatusAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatusAsFormattedString");
       return fmtMgr.formatNumber(this.getStatus(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Status");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatusAsFormattedString");
       throw x;
     }
   }
  /** Sets the Status field from a formatted string
   *
   * @param _value the Status field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Status field
   */
   public void setStatusFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setStatus(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Status");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatusFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatusFromFormattedString");
   }

  /** get the value of the field: Status (SLA_MEASUREMENT_DATA.status)
   * @return Integer the value
   */
  public Integer getStatus () {
    return this.Status;
  }
  /** Change the field to not being actively set: Status (SLA_MEASUREMENT_DATA.status)
   */
  public void unsetStatus () {
    this._StatusSet = false;
  }
  /** See if the field is actively set: Status (SLA_MEASUREMENT_DATA.status)
   * @return boolean whether the field is actively set
   */
  public boolean issetStatus () {
    return this._StatusSet;
  }
  /** set the fields value: EntryDate (SLA_MEASUREMENT_DATA.entry_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("EntryDate") 
  public void setEntryDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "EntryDate", "setEntryDate");
    }
    this.EntryDate = value;
    this._EntryDateSet = true;
  }

  /** Retrieves the EntryDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The EntryDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EntryDate field
   */
   public String getEntryDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEntryDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEntryDateAsFormattedString");
       return fmtMgr.formatDate(this.getEntryDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EntryDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getEntryDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the EntryDate field from a formatted string
   *
   * @param _value the EntryDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EntryDate field
   */
   public void setEntryDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEntryDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setEntryDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EntryDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setEntryDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEntryDateFromFormattedString");
   }

  /**
   * Retrieves the EntryDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EntryDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the EntryDate field
   */
  public String getEntryDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEntryDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEntryDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getEntryDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EntryDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEntryDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the EntryDate field value from a formatted date/time string
   *
   * @param _value the EntryDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EntryDate field
   */
  public void setEntryDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEntryDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setEntryDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EntryDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEntryDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: EntryDate (SLA_MEASUREMENT_DATA.entry_date)
   * @return Date the value
   */
  public Date getEntryDate () {
    return this.EntryDate;
  }
  /** Change the field to not being actively set: EntryDate (SLA_MEASUREMENT_DATA.entry_date)
   */
  public void unsetEntryDate () {
    this._EntryDateSet = false;
  }
  /** See if the field is actively set: EntryDate (SLA_MEASUREMENT_DATA.entry_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetEntryDate () {
    return this._EntryDateSet;
  }
  /** set the fields value: ErrorCode (SLA_MEASUREMENT_DATA.error_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ErrorCode") 
  public void setErrorCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ErrorCode", "setErrorCode");
    }
    this.ErrorCode = value;
    this._ErrorCodeSet = true;
  }

  /** Retrieves the ErrorCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ErrorCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ErrorCode field
   */
   public String getErrorCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getErrorCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getErrorCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getErrorCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ErrorCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getErrorCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the ErrorCode field from a formatted string
   *
   * @param _value the ErrorCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ErrorCode field
   */
   public void setErrorCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getErrorCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setErrorCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ErrorCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setErrorCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setErrorCodeFromFormattedString");
   }

  /** get the value of the field: ErrorCode (SLA_MEASUREMENT_DATA.error_code)
   * @return Integer the value
   */
  public Integer getErrorCode () {
    return this.ErrorCode;
  }
  /** Change the field to not being actively set: ErrorCode (SLA_MEASUREMENT_DATA.error_code)
   */
  public void unsetErrorCode () {
    this._ErrorCodeSet = false;
  }
  /** See if the field is actively set: ErrorCode (SLA_MEASUREMENT_DATA.error_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetErrorCode () {
    return this._ErrorCodeSet;
  }
  /** set the fields value: SlaDataPartitionKey (SLA_MEASUREMENT_DATA.sla_data_partition_key)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SlaDataPartitionKey") 
  public void setSlaDataPartitionKey (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SlaDataPartitionKey", "setSlaDataPartitionKey");
    }
    this.SlaDataPartitionKey = value;
    this._SlaDataPartitionKeySet = true;
  }

  /** Retrieves the SlaDataPartitionKey field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SlaDataPartitionKey field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SlaDataPartitionKey field
   */
   public String getSlaDataPartitionKeyAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSlaDataPartitionKeyAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSlaDataPartitionKeyAsFormattedString");
       return fmtMgr.formatDate(this.getSlaDataPartitionKey(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SlaDataPartitionKey");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSlaDataPartitionKeyAsFormattedString");
       throw x;
     }
   }
  /** Sets the SlaDataPartitionKey field from a formatted string
   *
   * @param _value the SlaDataPartitionKey field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SlaDataPartitionKey field
   */
   public void setSlaDataPartitionKeyFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSlaDataPartitionKeyFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSlaDataPartitionKey(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SlaDataPartitionKey");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSlaDataPartitionKeyFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSlaDataPartitionKeyFromFormattedString");
   }

  /**
   * Retrieves the SlaDataPartitionKey field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SlaDataPartitionKey field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the SlaDataPartitionKey field
   */
  public String getSlaDataPartitionKeyAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSlaDataPartitionKeyAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSlaDataPartitionKeyAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getSlaDataPartitionKey(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SlaDataPartitionKey");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSlaDataPartitionKeyAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the SlaDataPartitionKey field value from a formatted date/time string
   *
   * @param _value the SlaDataPartitionKey field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SlaDataPartitionKey field
   */
  public void setSlaDataPartitionKeyFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSlaDataPartitionKeyFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setSlaDataPartitionKey(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SlaDataPartitionKey");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSlaDataPartitionKeyFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: SlaDataPartitionKey (SLA_MEASUREMENT_DATA.sla_data_partition_key)
   * @return Date the value
   */
  public Date getSlaDataPartitionKey () {
    return this.SlaDataPartitionKey;
  }
  /** Change the field to not being actively set: SlaDataPartitionKey (SLA_MEASUREMENT_DATA.sla_data_partition_key)
   */
  public void unsetSlaDataPartitionKey () {
    this._SlaDataPartitionKeySet = false;
  }
  /** See if the field is actively set: SlaDataPartitionKey (SLA_MEASUREMENT_DATA.sla_data_partition_key)
   * @return boolean whether the field is actively set
   */
  public boolean issetSlaDataPartitionKey () {
    return this._SlaDataPartitionKeySet;
  }
  /** set the fields value: ChgDate (SLA_MEASUREMENT_DATA.chg_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ChgDate") 
  public void setChgDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ChgDate", "setChgDate");
    }
    this.ChgDate = value;
    this._ChgDateSet = true;
  }

  /** Retrieves the ChgDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ChgDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDate field
   */
   public String getChgDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDateAsFormattedString");
       return fmtMgr.formatDate(this.getChgDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the ChgDate field from a formatted string
   *
   * @param _value the ChgDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChgDate field
   */
   public void setChgDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setChgDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgDateFromFormattedString");
   }

  /**
   * Retrieves the ChgDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDate field
   */
  public String getChgDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getChgDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ChgDate field value from a formatted date/time string
   *
   * @param _value the ChgDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChgDate field
   */
  public void setChgDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setChgDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: ChgDate (SLA_MEASUREMENT_DATA.chg_date)
   * @return Date the value
   */
  public Date getChgDate () {
    return this.ChgDate;
  }
  /** Change the field to not being actively set: ChgDate (SLA_MEASUREMENT_DATA.chg_date)
   */
  public void unsetChgDate () {
    this._ChgDateSet = false;
  }
  /** See if the field is actively set: ChgDate (SLA_MEASUREMENT_DATA.chg_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgDate () {
    return this._ChgDateSet;
  }
  /** set the fields value: ChgWho (SLA_MEASUREMENT_DATA.chg_who)
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

  /** get the value of the field: ChgWho (SLA_MEASUREMENT_DATA.chg_who)
   * @return String the value
   */
  public String getChgWho () {
    return this.ChgWho;
  }
  /** Change the field to not being actively set: ChgWho (SLA_MEASUREMENT_DATA.chg_who)
   */
  public void unsetChgWho () {
    this._ChgWhoSet = false;
  }
  /** See if the field is actively set: ChgWho (SLA_MEASUREMENT_DATA.chg_who)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgWho () {
    return this._ChgWhoSet;
  }
  public String toString() {
    return SlaMeasurementDataObjectHelper.toMap(this, null).toString();
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
  /** SLA_MEASUREMENT_DATA.account_no field */
    if(!nonNullOnly || (AccountInternalId != null))  _AccountInternalIdSet = flag;
  /** SLA_MEASUREMENT_DATA.subscr_no field */
    if(!nonNullOnly || (ServiceInternalId != null))  _ServiceInternalIdSet = flag;
  /** SLA_MEASUREMENT_DATA.subscr_no_resets field */
    if(!nonNullOnly || (ServiceInternalIdResets != null))  _ServiceInternalIdResetsSet = flag;
  /** SLA_MEASUREMENT_DATA.bill_ref_no field */
    if(!nonNullOnly || (BillRefNo != null))  _BillRefNoSet = flag;
  /** SLA_MEASUREMENT_DATA.bill_ref_resets field */
    if(!nonNullOnly || (BillRefResets != null))  _BillRefResetsSet = flag;
  /** SLA_MEASUREMENT_DATA.sla_measurement_type_id field */
    if(!nonNullOnly || (SlaMeasurementTypeId != null))  _SlaMeasurementTypeIdSet = flag;
  /** SLA_MEASUREMENT_DATA.measurement_value field */
    if(!nonNullOnly || (MeasurementValue != null))  _MeasurementValueSet = flag;
  /** SLA_MEASUREMENT_DATA.sla_ext_id field */
    if(!nonNullOnly || (SlaExtId != null))  _SlaExtIdSet = flag;
  /** SLA_MEASUREMENT_DATA.trans_dt field */
    if(!nonNullOnly || (TransDt != null))  _TransDtSet = flag;
  /** SLA_MEASUREMENT_DATA.status field */
    if(!nonNullOnly || (Status != null))  _StatusSet = flag;
  /** SLA_MEASUREMENT_DATA.entry_date field */
    if(!nonNullOnly || (EntryDate != null))  _EntryDateSet = flag;
  /** SLA_MEASUREMENT_DATA.error_code field */
    if(!nonNullOnly || (ErrorCode != null))  _ErrorCodeSet = flag;
  /** SLA_MEASUREMENT_DATA.sla_data_partition_key field */
    if(!nonNullOnly || (SlaDataPartitionKey != null))  _SlaDataPartitionKeySet = flag;
  /** SLA_MEASUREMENT_DATA.chg_date field */
    if(!nonNullOnly || (ChgDate != null))  _ChgDateSet = flag;
  /** SLA_MEASUREMENT_DATA.chg_who field */
    if(!nonNullOnly || (ChgWho != null))  _ChgWhoSet = flag;
  }
}
