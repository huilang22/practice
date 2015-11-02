/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: GlobalOpenItemIdMapObjectData.java
 * Definition File: Admin/GlobalOpenItemIdMap.xml
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
  
/** GlobalOpenItemIdMapObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class GlobalOpenItemIdMapObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public GlobalOpenItemIdMapObjectKeyData Key = null;
  /** GLOBAL_OPEN_ITEM_ID_MAP.account_no field */
  public    Integer AccountInternalId  = null;
  protected boolean _AccountInternalIdSet = false;
  /** GLOBAL_OPEN_ITEM_ID_MAP.subscr_no field */
  public    Integer ServiceInternalId  = null;
  protected boolean _ServiceInternalIdSet = false;
  /** GLOBAL_OPEN_ITEM_ID_MAP.subscr_no_resets field */
  public    Integer ServiceInternalIdResets  = null;
  protected boolean _ServiceInternalIdResetsSet = false;
  /** GLOBAL_OPEN_ITEM_ID_MAP.charge_element_type field */
  public    Integer ChargeElementType  = null;
  protected boolean _ChargeElementTypeSet = false;
  /** GLOBAL_OPEN_ITEM_ID_MAP.charge_element_value field */
  public    Integer ChargeElementValue  = null;
  protected boolean _ChargeElementValueSet = false;
  /** GLOBAL_OPEN_ITEM_ID_MAP.balance_account_no field */
  public    Integer BalanceAccountInternalId  = null;
  protected boolean _BalanceAccountInternalIdSet = false;
  /** GLOBAL_OPEN_ITEM_ID_MAP.open_item_id field */
  public    Integer OpenItemId  = null;
  protected boolean _OpenItemIdSet = false;
  /** GLOBAL_OPEN_ITEM_ID_MAP.active_dt field */
  public    Date ActiveDt  = null;
  protected boolean _ActiveDtSet = false;
  /** GLOBAL_OPEN_ITEM_ID_MAP.inactive_dt field */
  public    Date InactiveDt  = null;
  protected boolean _InactiveDtSet = false;
  /** GLOBAL_OPEN_ITEM_ID_MAP.chg_dt field */
  public    Date ChgDt  = null;
  protected boolean _ChgDtSet = false;
  /** GLOBAL_OPEN_ITEM_ID_MAP.chg_who field */
  public    String ChgWho  = null;
  protected boolean _ChgWhoSet = false;
  /** GLOBAL_OPEN_ITEM_ID_MAP.order_level field */
  public    Integer OrderLevel  = null;
  protected boolean _OrderLevelSet = false;
  /** GLOBAL_OPEN_ITEM_ID_MAP.config_tag_id field */
  public    String ConfigTagId  = null;
  protected boolean _ConfigTagIdSet = false;
  private String _objName = "GlobalOpenItemIdMapObjectData";
  /** Default constructor */
  public GlobalOpenItemIdMapObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public GlobalOpenItemIdMapObjectData (GlobalOpenItemIdMapObjectData other)
  {

    if (other == null) return;
    this.Key = new GlobalOpenItemIdMapObjectKeyData (other.Key);
    this.AccountInternalId = other.AccountInternalId;
    this._AccountInternalIdSet = other._AccountInternalIdSet;
    this.ServiceInternalId = other.ServiceInternalId;
    this._ServiceInternalIdSet = other._ServiceInternalIdSet;
    this.ServiceInternalIdResets = other.ServiceInternalIdResets;
    this._ServiceInternalIdResetsSet = other._ServiceInternalIdResetsSet;
    this.ChargeElementType = other.ChargeElementType;
    this._ChargeElementTypeSet = other._ChargeElementTypeSet;
    this.ChargeElementValue = other.ChargeElementValue;
    this._ChargeElementValueSet = other._ChargeElementValueSet;
    this.BalanceAccountInternalId = other.BalanceAccountInternalId;
    this._BalanceAccountInternalIdSet = other._BalanceAccountInternalIdSet;
    this.OpenItemId = other.OpenItemId;
    this._OpenItemIdSet = other._OpenItemIdSet;
    this.ActiveDt = other.ActiveDt;
    this._ActiveDtSet = other._ActiveDtSet;
    this.InactiveDt = other.InactiveDt;
    this._InactiveDtSet = other._InactiveDtSet;
    this.ChgDt = other.ChgDt;
    this._ChgDtSet = other._ChgDtSet;
    this.ChgWho = other.ChgWho;
    this._ChgWhoSet = other._ChgWhoSet;
    this.OrderLevel = other.OrderLevel;
    this._OrderLevelSet = other._OrderLevelSet;
    this.ConfigTagId = other.ConfigTagId;
    this._ConfigTagIdSet = other._ConfigTagIdSet;
  }

  /** get the Key for this object
   * @return GlobalOpenItemIdMapObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public GlobalOpenItemIdMapObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (GlobalOpenItemIdMapObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: TrackingId (GLOBAL_OPEN_ITEM_ID_MAP.tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTrackingId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingId", "setTrackingId");
    }
    if (this.Key == null) this.Key = new GlobalOpenItemIdMapObjectKeyData ();
    this.Key.TrackingId = value;
    this.Key._TrackingIdSet = true;
  }
  /** get the value of the field: TrackingId (GLOBAL_OPEN_ITEM_ID_MAP.tracking_id)
   * @return Integer the value
   */
  public Integer getTrackingId () {
    if (this.Key == null) return null;
    return this.Key.TrackingId;
  }
  /** Change the field to not being actively set: TrackingId (GLOBAL_OPEN_ITEM_ID_MAP.tracking_id)
   */
  public void unsetTrackingId () {
    if (this.Key == null) return;
    this.Key._TrackingIdSet = false;
  }
  /** See if the field is actively set: TrackingId (GLOBAL_OPEN_ITEM_ID_MAP.tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetTrackingId () {
    if (this.Key == null) return false;
    return this.Key._TrackingIdSet;
  }

  /** Retrieves the TrackingId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TrackingId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TrackingId field
   */
   public String getTrackingIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTrackingIdAsFormattedString");
       return fmtMgr.formatNumber(this.getTrackingId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTrackingIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the TrackingId field from a formatted string
   *
   * @param _value the TrackingId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TrackingId field
   */
   public void setTrackingIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTrackingId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTrackingIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTrackingIdFromFormattedString");
   }

  /** set the fields value: TrackingIdServ (GLOBAL_OPEN_ITEM_ID_MAP.tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTrackingIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingIdServ", "setTrackingIdServ");
    }
    if (this.Key == null) this.Key = new GlobalOpenItemIdMapObjectKeyData ();
    this.Key.TrackingIdServ = value;
    this.Key._TrackingIdServSet = true;
  }
  /** get the value of the field: TrackingIdServ (GLOBAL_OPEN_ITEM_ID_MAP.tracking_id_serv)
   * @return Integer the value
   */
  public Integer getTrackingIdServ () {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServ;
  }
  /** Change the field to not being actively set: TrackingIdServ (GLOBAL_OPEN_ITEM_ID_MAP.tracking_id_serv)
   */
  public void unsetTrackingIdServ () {
    if (this.Key == null) return;
    this.Key._TrackingIdServSet = false;
  }
  /** See if the field is actively set: TrackingIdServ (GLOBAL_OPEN_ITEM_ID_MAP.tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetTrackingIdServ () {
    if (this.Key == null) return false;
    return this.Key._TrackingIdServSet;
  }

  /** Retrieves the TrackingIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TrackingIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TrackingIdServ field
   */
   public String getTrackingIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTrackingIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getTrackingIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTrackingIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the TrackingIdServ field from a formatted string
   *
   * @param _value the TrackingIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TrackingIdServ field
   */
   public void setTrackingIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTrackingIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTrackingIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTrackingIdServFromFormattedString");
   }

  /** set the fields value: AccountInternalId (GLOBAL_OPEN_ITEM_ID_MAP.account_no)
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

  /** get the value of the field: AccountInternalId (GLOBAL_OPEN_ITEM_ID_MAP.account_no)
   * @return Integer the value
   */
  public Integer getAccountInternalId () {
    return this.AccountInternalId;
  }
  /** Change the field to not being actively set: AccountInternalId (GLOBAL_OPEN_ITEM_ID_MAP.account_no)
   */
  public void unsetAccountInternalId () {
    this._AccountInternalIdSet = false;
  }
  /** See if the field is actively set: AccountInternalId (GLOBAL_OPEN_ITEM_ID_MAP.account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountInternalId () {
    return this._AccountInternalIdSet;
  }
  /** set the fields value: ServiceInternalId (GLOBAL_OPEN_ITEM_ID_MAP.subscr_no)
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

  /** get the value of the field: ServiceInternalId (GLOBAL_OPEN_ITEM_ID_MAP.subscr_no)
   * @return Integer the value
   */
  public Integer getServiceInternalId () {
    return this.ServiceInternalId;
  }
  /** Change the field to not being actively set: ServiceInternalId (GLOBAL_OPEN_ITEM_ID_MAP.subscr_no)
   */
  public void unsetServiceInternalId () {
    this._ServiceInternalIdSet = false;
  }
  /** See if the field is actively set: ServiceInternalId (GLOBAL_OPEN_ITEM_ID_MAP.subscr_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceInternalId () {
    return this._ServiceInternalIdSet;
  }
  /** set the fields value: ServiceInternalIdResets (GLOBAL_OPEN_ITEM_ID_MAP.subscr_no_resets)
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

  /** get the value of the field: ServiceInternalIdResets (GLOBAL_OPEN_ITEM_ID_MAP.subscr_no_resets)
   * @return Integer the value
   */
  public Integer getServiceInternalIdResets () {
    return this.ServiceInternalIdResets;
  }
  /** Change the field to not being actively set: ServiceInternalIdResets (GLOBAL_OPEN_ITEM_ID_MAP.subscr_no_resets)
   */
  public void unsetServiceInternalIdResets () {
    this._ServiceInternalIdResetsSet = false;
  }
  /** See if the field is actively set: ServiceInternalIdResets (GLOBAL_OPEN_ITEM_ID_MAP.subscr_no_resets)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceInternalIdResets () {
    return this._ServiceInternalIdResetsSet;
  }
  /** set the fields value: ChargeElementType (GLOBAL_OPEN_ITEM_ID_MAP.charge_element_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ChargeElementType") 
  public void setChargeElementType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ChargeElementType", "setChargeElementType");
    }
    this.ChargeElementType = value;
    this._ChargeElementTypeSet = true;
  }

  /** Retrieves the ChargeElementType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ChargeElementType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChargeElementType field
   */
   public String getChargeElementTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChargeElementTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChargeElementTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getChargeElementType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChargeElementType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getChargeElementTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the ChargeElementType field from a formatted string
   *
   * @param _value the ChargeElementType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChargeElementType field
   */
   public void setChargeElementTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChargeElementTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setChargeElementType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChargeElementType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setChargeElementTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChargeElementTypeFromFormattedString");
   }

  /** get the value of the field: ChargeElementType (GLOBAL_OPEN_ITEM_ID_MAP.charge_element_type)
   * @return Integer the value
   */
  public Integer getChargeElementType () {
    return this.ChargeElementType;
  }
  /** Change the field to not being actively set: ChargeElementType (GLOBAL_OPEN_ITEM_ID_MAP.charge_element_type)
   */
  public void unsetChargeElementType () {
    this._ChargeElementTypeSet = false;
  }
  /** See if the field is actively set: ChargeElementType (GLOBAL_OPEN_ITEM_ID_MAP.charge_element_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetChargeElementType () {
    return this._ChargeElementTypeSet;
  }
  /** set the fields value: ChargeElementValue (GLOBAL_OPEN_ITEM_ID_MAP.charge_element_value)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ChargeElementValue") 
  public void setChargeElementValue (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ChargeElementValue", "setChargeElementValue");
    }
    this.ChargeElementValue = value;
    this._ChargeElementValueSet = true;
  }

  /** Retrieves the ChargeElementValue field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ChargeElementValue field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChargeElementValue field
   */
   public String getChargeElementValueAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChargeElementValueAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChargeElementValueAsFormattedString");
       return fmtMgr.formatNumber(this.getChargeElementValue(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChargeElementValue");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getChargeElementValueAsFormattedString");
       throw x;
     }
   }
  /** Sets the ChargeElementValue field from a formatted string
   *
   * @param _value the ChargeElementValue field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChargeElementValue field
   */
   public void setChargeElementValueFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChargeElementValueFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setChargeElementValue(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChargeElementValue");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setChargeElementValueFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChargeElementValueFromFormattedString");
   }

  /** get the value of the field: ChargeElementValue (GLOBAL_OPEN_ITEM_ID_MAP.charge_element_value)
   * @return Integer the value
   */
  public Integer getChargeElementValue () {
    return this.ChargeElementValue;
  }
  /** Change the field to not being actively set: ChargeElementValue (GLOBAL_OPEN_ITEM_ID_MAP.charge_element_value)
   */
  public void unsetChargeElementValue () {
    this._ChargeElementValueSet = false;
  }
  /** See if the field is actively set: ChargeElementValue (GLOBAL_OPEN_ITEM_ID_MAP.charge_element_value)
   * @return boolean whether the field is actively set
   */
  public boolean issetChargeElementValue () {
    return this._ChargeElementValueSet;
  }
  /** set the fields value: BalanceAccountInternalId (GLOBAL_OPEN_ITEM_ID_MAP.balance_account_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BalanceAccountInternalId") 
  public void setBalanceAccountInternalId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BalanceAccountInternalId", "setBalanceAccountInternalId");
    }
    this.BalanceAccountInternalId = value;
    this._BalanceAccountInternalIdSet = true;
  }

  /** Retrieves the BalanceAccountInternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BalanceAccountInternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BalanceAccountInternalId field
   */
   public String getBalanceAccountInternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceAccountInternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceAccountInternalIdAsFormattedString");
       return fmtMgr.formatNumber(this.getBalanceAccountInternalId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BalanceAccountInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBalanceAccountInternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the BalanceAccountInternalId field from a formatted string
   *
   * @param _value the BalanceAccountInternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BalanceAccountInternalId field
   */
   public void setBalanceAccountInternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceAccountInternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBalanceAccountInternalId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BalanceAccountInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBalanceAccountInternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBalanceAccountInternalIdFromFormattedString");
   }

  /** get the value of the field: BalanceAccountInternalId (GLOBAL_OPEN_ITEM_ID_MAP.balance_account_no)
   * @return Integer the value
   */
  public Integer getBalanceAccountInternalId () {
    return this.BalanceAccountInternalId;
  }
  /** Change the field to not being actively set: BalanceAccountInternalId (GLOBAL_OPEN_ITEM_ID_MAP.balance_account_no)
   */
  public void unsetBalanceAccountInternalId () {
    this._BalanceAccountInternalIdSet = false;
  }
  /** See if the field is actively set: BalanceAccountInternalId (GLOBAL_OPEN_ITEM_ID_MAP.balance_account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetBalanceAccountInternalId () {
    return this._BalanceAccountInternalIdSet;
  }
  /** set the fields value: OpenItemId (GLOBAL_OPEN_ITEM_ID_MAP.open_item_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OpenItemId") 
  public void setOpenItemId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "OpenItemId", "setOpenItemId");
    }
    this.OpenItemId = value;
    this._OpenItemIdSet = true;
  }

  /** Retrieves the OpenItemId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OpenItemId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OpenItemId field
   */
   public String getOpenItemIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOpenItemIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOpenItemIdAsFormattedString");
       return fmtMgr.formatNumber(this.getOpenItemId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OpenItemId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOpenItemIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the OpenItemId field from a formatted string
   *
   * @param _value the OpenItemId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OpenItemId field
   */
   public void setOpenItemIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOpenItemIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOpenItemId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OpenItemId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOpenItemIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOpenItemIdFromFormattedString");
   }

  /** get the value of the field: OpenItemId (GLOBAL_OPEN_ITEM_ID_MAP.open_item_id)
   * @return Integer the value
   */
  public Integer getOpenItemId () {
    return this.OpenItemId;
  }
  /** Change the field to not being actively set: OpenItemId (GLOBAL_OPEN_ITEM_ID_MAP.open_item_id)
   */
  public void unsetOpenItemId () {
    this._OpenItemIdSet = false;
  }
  /** See if the field is actively set: OpenItemId (GLOBAL_OPEN_ITEM_ID_MAP.open_item_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetOpenItemId () {
    return this._OpenItemIdSet;
  }
  /** set the fields value: ActiveDt (GLOBAL_OPEN_ITEM_ID_MAP.active_dt)
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

  /** get the value of the field: ActiveDt (GLOBAL_OPEN_ITEM_ID_MAP.active_dt)
   * @return Date the value
   */
  public Date getActiveDt () {
    return this.ActiveDt;
  }
  /** Change the field to not being actively set: ActiveDt (GLOBAL_OPEN_ITEM_ID_MAP.active_dt)
   */
  public void unsetActiveDt () {
    this._ActiveDtSet = false;
  }
  /** See if the field is actively set: ActiveDt (GLOBAL_OPEN_ITEM_ID_MAP.active_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetActiveDt () {
    return this._ActiveDtSet;
  }
  /** set the fields value: InactiveDt (GLOBAL_OPEN_ITEM_ID_MAP.inactive_dt)
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

  /** get the value of the field: InactiveDt (GLOBAL_OPEN_ITEM_ID_MAP.inactive_dt)
   * @return Date the value
   */
  public Date getInactiveDt () {
    return this.InactiveDt;
  }
  /** Change the field to not being actively set: InactiveDt (GLOBAL_OPEN_ITEM_ID_MAP.inactive_dt)
   */
  public void unsetInactiveDt () {
    this._InactiveDtSet = false;
  }
  /** See if the field is actively set: InactiveDt (GLOBAL_OPEN_ITEM_ID_MAP.inactive_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetInactiveDt () {
    return this._InactiveDtSet;
  }
  /** set the fields value: ChgDt (GLOBAL_OPEN_ITEM_ID_MAP.chg_dt)
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

  /** get the value of the field: ChgDt (GLOBAL_OPEN_ITEM_ID_MAP.chg_dt)
   * @return Date the value
   */
  public Date getChgDt () {
    return this.ChgDt;
  }
  /** Change the field to not being actively set: ChgDt (GLOBAL_OPEN_ITEM_ID_MAP.chg_dt)
   */
  public void unsetChgDt () {
    this._ChgDtSet = false;
  }
  /** See if the field is actively set: ChgDt (GLOBAL_OPEN_ITEM_ID_MAP.chg_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgDt () {
    return this._ChgDtSet;
  }
  /** set the fields value: ChgWho (GLOBAL_OPEN_ITEM_ID_MAP.chg_who)
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

  /** get the value of the field: ChgWho (GLOBAL_OPEN_ITEM_ID_MAP.chg_who)
   * @return String the value
   */
  public String getChgWho () {
    return this.ChgWho;
  }
  /** Change the field to not being actively set: ChgWho (GLOBAL_OPEN_ITEM_ID_MAP.chg_who)
   */
  public void unsetChgWho () {
    this._ChgWhoSet = false;
  }
  /** See if the field is actively set: ChgWho (GLOBAL_OPEN_ITEM_ID_MAP.chg_who)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgWho () {
    return this._ChgWhoSet;
  }
  /** set the fields value: OrderLevel (GLOBAL_OPEN_ITEM_ID_MAP.order_level)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OrderLevel") 
  public void setOrderLevel (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "OrderLevel", "setOrderLevel");
    }
    this.OrderLevel = value;
    this._OrderLevelSet = true;
  }

  /** Retrieves the OrderLevel field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OrderLevel field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrderLevel field
   */
   public String getOrderLevelAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrderLevelAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrderLevelAsFormattedString");
       return fmtMgr.formatNumber(this.getOrderLevel(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrderLevel");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrderLevelAsFormattedString");
       throw x;
     }
   }
  /** Sets the OrderLevel field from a formatted string
   *
   * @param _value the OrderLevel field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OrderLevel field
   */
   public void setOrderLevelFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrderLevelFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOrderLevel(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrderLevel");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrderLevelFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrderLevelFromFormattedString");
   }

  /** get the value of the field: OrderLevel (GLOBAL_OPEN_ITEM_ID_MAP.order_level)
   * @return Integer the value
   */
  public Integer getOrderLevel () {
    return this.OrderLevel;
  }
  /** Change the field to not being actively set: OrderLevel (GLOBAL_OPEN_ITEM_ID_MAP.order_level)
   */
  public void unsetOrderLevel () {
    this._OrderLevelSet = false;
  }
  /** See if the field is actively set: OrderLevel (GLOBAL_OPEN_ITEM_ID_MAP.order_level)
   * @return boolean whether the field is actively set
   */
  public boolean issetOrderLevel () {
    return this._OrderLevelSet;
  }
  /** set the fields value: ConfigTagId (GLOBAL_OPEN_ITEM_ID_MAP.config_tag_id)
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

  /** get the value of the field: ConfigTagId (GLOBAL_OPEN_ITEM_ID_MAP.config_tag_id)
   * @return String the value
   */
  public String getConfigTagId () {
    return this.ConfigTagId;
  }
  /** Change the field to not being actively set: ConfigTagId (GLOBAL_OPEN_ITEM_ID_MAP.config_tag_id)
   */
  public void unsetConfigTagId () {
    this._ConfigTagIdSet = false;
  }
  /** See if the field is actively set: ConfigTagId (GLOBAL_OPEN_ITEM_ID_MAP.config_tag_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetConfigTagId () {
    return this._ConfigTagIdSet;
  }
  public String toString() {
    return GlobalOpenItemIdMapObjectHelper.toMap(this, null).toString();
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
  /** GLOBAL_OPEN_ITEM_ID_MAP.account_no field */
    if(!nonNullOnly || (AccountInternalId != null))  _AccountInternalIdSet = flag;
  /** GLOBAL_OPEN_ITEM_ID_MAP.subscr_no field */
    if(!nonNullOnly || (ServiceInternalId != null))  _ServiceInternalIdSet = flag;
  /** GLOBAL_OPEN_ITEM_ID_MAP.subscr_no_resets field */
    if(!nonNullOnly || (ServiceInternalIdResets != null))  _ServiceInternalIdResetsSet = flag;
  /** GLOBAL_OPEN_ITEM_ID_MAP.charge_element_type field */
    if(!nonNullOnly || (ChargeElementType != null))  _ChargeElementTypeSet = flag;
  /** GLOBAL_OPEN_ITEM_ID_MAP.charge_element_value field */
    if(!nonNullOnly || (ChargeElementValue != null))  _ChargeElementValueSet = flag;
  /** GLOBAL_OPEN_ITEM_ID_MAP.balance_account_no field */
    if(!nonNullOnly || (BalanceAccountInternalId != null))  _BalanceAccountInternalIdSet = flag;
  /** GLOBAL_OPEN_ITEM_ID_MAP.open_item_id field */
    if(!nonNullOnly || (OpenItemId != null))  _OpenItemIdSet = flag;
  /** GLOBAL_OPEN_ITEM_ID_MAP.active_dt field */
    if(!nonNullOnly || (ActiveDt != null))  _ActiveDtSet = flag;
  /** GLOBAL_OPEN_ITEM_ID_MAP.inactive_dt field */
    if(!nonNullOnly || (InactiveDt != null))  _InactiveDtSet = flag;
  /** GLOBAL_OPEN_ITEM_ID_MAP.chg_dt field */
    if(!nonNullOnly || (ChgDt != null))  _ChgDtSet = flag;
  /** GLOBAL_OPEN_ITEM_ID_MAP.chg_who field */
    if(!nonNullOnly || (ChgWho != null))  _ChgWhoSet = flag;
  /** GLOBAL_OPEN_ITEM_ID_MAP.order_level field */
    if(!nonNullOnly || (OrderLevel != null))  _OrderLevelSet = flag;
  /** GLOBAL_OPEN_ITEM_ID_MAP.config_tag_id field */
    if(!nonNullOnly || (ConfigTagId != null))  _ConfigTagIdSet = flag;
  }
}
