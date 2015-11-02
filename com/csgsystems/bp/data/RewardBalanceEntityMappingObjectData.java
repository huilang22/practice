/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: RewardBalanceEntityMappingObjectData.java
 * Definition File: Admin/RewardBalanceEntityMapping.xml
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
  
/** RewardBalanceEntityMappingObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class RewardBalanceEntityMappingObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public RewardBalanceEntityMappingObjectKeyData Key = null;
  /** REWARD_BALANCE_ENTITY_MAPPING.reward_balance_id field */
  public    Integer RewardBalanceId  = null;
  protected boolean _RewardBalanceIdSet = false;
  /** REWARD_BALANCE_ENTITY_MAPPING.entity_id1 field */
  public    Integer EntityId1  = null;
  protected boolean _EntityId1Set = false;
  /** REWARD_BALANCE_ENTITY_MAPPING.entity_id2 field */
  public    Integer EntityId2  = null;
  protected boolean _EntityId2Set = false;
  /** REWARD_BALANCE_ENTITY_MAPPING.entity_id3 field */
  public    Integer EntityId3  = null;
  protected boolean _EntityId3Set = false;
  private String _objName = "RewardBalanceEntityMappingObjectData";
  /** Default constructor */
  public RewardBalanceEntityMappingObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public RewardBalanceEntityMappingObjectData (RewardBalanceEntityMappingObjectData other)
  {

    if (other == null) return;
    this.Key = new RewardBalanceEntityMappingObjectKeyData (other.Key);
    this.RewardBalanceId = other.RewardBalanceId;
    this._RewardBalanceIdSet = other._RewardBalanceIdSet;
    this.EntityId1 = other.EntityId1;
    this._EntityId1Set = other._EntityId1Set;
    this.EntityId2 = other.EntityId2;
    this._EntityId2Set = other._EntityId2Set;
    this.EntityId3 = other.EntityId3;
    this._EntityId3Set = other._EntityId3Set;
  }

  /** get the Key for this object
   * @return RewardBalanceEntityMappingObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public RewardBalanceEntityMappingObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (RewardBalanceEntityMappingObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: TrackingId (REWARD_BALANCE_ENTITY_MAPPING.tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTrackingId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingId", "setTrackingId");
    }
    if (this.Key == null) this.Key = new RewardBalanceEntityMappingObjectKeyData ();
    this.Key.TrackingId = value;
    this.Key._TrackingIdSet = true;
  }
  /** get the value of the field: TrackingId (REWARD_BALANCE_ENTITY_MAPPING.tracking_id)
   * @return Integer the value
   */
  public Integer getTrackingId () {
    if (this.Key == null) return null;
    return this.Key.TrackingId;
  }
  /** Change the field to not being actively set: TrackingId (REWARD_BALANCE_ENTITY_MAPPING.tracking_id)
   */
  public void unsetTrackingId () {
    if (this.Key == null) return;
    this.Key._TrackingIdSet = false;
  }
  /** See if the field is actively set: TrackingId (REWARD_BALANCE_ENTITY_MAPPING.tracking_id)
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

  /** set the fields value: TrackingIdServ (REWARD_BALANCE_ENTITY_MAPPING.tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTrackingIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingIdServ", "setTrackingIdServ");
    }
    if (this.Key == null) this.Key = new RewardBalanceEntityMappingObjectKeyData ();
    this.Key.TrackingIdServ = value;
    this.Key._TrackingIdServSet = true;
  }
  /** get the value of the field: TrackingIdServ (REWARD_BALANCE_ENTITY_MAPPING.tracking_id_serv)
   * @return Integer the value
   */
  public Integer getTrackingIdServ () {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServ;
  }
  /** Change the field to not being actively set: TrackingIdServ (REWARD_BALANCE_ENTITY_MAPPING.tracking_id_serv)
   */
  public void unsetTrackingIdServ () {
    if (this.Key == null) return;
    this.Key._TrackingIdServSet = false;
  }
  /** See if the field is actively set: TrackingIdServ (REWARD_BALANCE_ENTITY_MAPPING.tracking_id_serv)
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

  /** set the fields value: RewardBalanceId (REWARD_BALANCE_ENTITY_MAPPING.reward_balance_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RewardBalanceId") 
  public void setRewardBalanceId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RewardBalanceId", "setRewardBalanceId");
    }
    this.RewardBalanceId = value;
    this._RewardBalanceIdSet = true;
  }

  /** Retrieves the RewardBalanceId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RewardBalanceId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RewardBalanceId field
   */
   public String getRewardBalanceIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRewardBalanceIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRewardBalanceIdAsFormattedString");
       return fmtMgr.formatNumber(this.getRewardBalanceId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RewardBalanceId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRewardBalanceIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the RewardBalanceId field from a formatted string
   *
   * @param _value the RewardBalanceId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RewardBalanceId field
   */
   public void setRewardBalanceIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRewardBalanceIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRewardBalanceId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RewardBalanceId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRewardBalanceIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRewardBalanceIdFromFormattedString");
   }

  /** get the value of the field: RewardBalanceId (REWARD_BALANCE_ENTITY_MAPPING.reward_balance_id)
   * @return Integer the value
   */
  public Integer getRewardBalanceId () {
    return this.RewardBalanceId;
  }
  /** Change the field to not being actively set: RewardBalanceId (REWARD_BALANCE_ENTITY_MAPPING.reward_balance_id)
   */
  public void unsetRewardBalanceId () {
    this._RewardBalanceIdSet = false;
  }
  /** See if the field is actively set: RewardBalanceId (REWARD_BALANCE_ENTITY_MAPPING.reward_balance_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetRewardBalanceId () {
    return this._RewardBalanceIdSet;
  }
  /** set the fields value: EntityId1 (REWARD_BALANCE_ENTITY_MAPPING.entity_id1)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("EntityId1") 
  public void setEntityId1 (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "EntityId1", "setEntityId1");
    }
    this.EntityId1 = value;
    this._EntityId1Set = true;
  }

  /** Retrieves the EntityId1 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The EntityId1 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EntityId1 field
   */
   public String getEntityId1AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEntityId1AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEntityId1AsFormattedString");
       return fmtMgr.formatNumber(this.getEntityId1(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EntityId1");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getEntityId1AsFormattedString");
       throw x;
     }
   }
  /** Sets the EntityId1 field from a formatted string
   *
   * @param _value the EntityId1 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EntityId1 field
   */
   public void setEntityId1FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEntityId1FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setEntityId1(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EntityId1");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setEntityId1FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEntityId1FromFormattedString");
   }

  /** get the value of the field: EntityId1 (REWARD_BALANCE_ENTITY_MAPPING.entity_id1)
   * @return Integer the value
   */
  public Integer getEntityId1 () {
    return this.EntityId1;
  }
  /** Change the field to not being actively set: EntityId1 (REWARD_BALANCE_ENTITY_MAPPING.entity_id1)
   */
  public void unsetEntityId1 () {
    this._EntityId1Set = false;
  }
  /** See if the field is actively set: EntityId1 (REWARD_BALANCE_ENTITY_MAPPING.entity_id1)
   * @return boolean whether the field is actively set
   */
  public boolean issetEntityId1 () {
    return this._EntityId1Set;
  }
  /** set the fields value: EntityId2 (REWARD_BALANCE_ENTITY_MAPPING.entity_id2)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("EntityId2") 
  public void setEntityId2 (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "EntityId2", "setEntityId2");
    }
    this.EntityId2 = value;
    this._EntityId2Set = true;
  }

  /** Retrieves the EntityId2 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The EntityId2 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EntityId2 field
   */
   public String getEntityId2AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEntityId2AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEntityId2AsFormattedString");
       return fmtMgr.formatNumber(this.getEntityId2(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EntityId2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getEntityId2AsFormattedString");
       throw x;
     }
   }
  /** Sets the EntityId2 field from a formatted string
   *
   * @param _value the EntityId2 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EntityId2 field
   */
   public void setEntityId2FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEntityId2FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setEntityId2(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EntityId2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setEntityId2FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEntityId2FromFormattedString");
   }

  /** get the value of the field: EntityId2 (REWARD_BALANCE_ENTITY_MAPPING.entity_id2)
   * @return Integer the value
   */
  public Integer getEntityId2 () {
    return this.EntityId2;
  }
  /** Change the field to not being actively set: EntityId2 (REWARD_BALANCE_ENTITY_MAPPING.entity_id2)
   */
  public void unsetEntityId2 () {
    this._EntityId2Set = false;
  }
  /** See if the field is actively set: EntityId2 (REWARD_BALANCE_ENTITY_MAPPING.entity_id2)
   * @return boolean whether the field is actively set
   */
  public boolean issetEntityId2 () {
    return this._EntityId2Set;
  }
  /** set the fields value: EntityId3 (REWARD_BALANCE_ENTITY_MAPPING.entity_id3)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("EntityId3") 
  public void setEntityId3 (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "EntityId3", "setEntityId3");
    }
    this.EntityId3 = value;
    this._EntityId3Set = true;
  }

  /** Retrieves the EntityId3 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The EntityId3 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EntityId3 field
   */
   public String getEntityId3AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEntityId3AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEntityId3AsFormattedString");
       return fmtMgr.formatNumber(this.getEntityId3(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EntityId3");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getEntityId3AsFormattedString");
       throw x;
     }
   }
  /** Sets the EntityId3 field from a formatted string
   *
   * @param _value the EntityId3 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EntityId3 field
   */
   public void setEntityId3FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEntityId3FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setEntityId3(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EntityId3");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setEntityId3FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEntityId3FromFormattedString");
   }

  /** get the value of the field: EntityId3 (REWARD_BALANCE_ENTITY_MAPPING.entity_id3)
   * @return Integer the value
   */
  public Integer getEntityId3 () {
    return this.EntityId3;
  }
  /** Change the field to not being actively set: EntityId3 (REWARD_BALANCE_ENTITY_MAPPING.entity_id3)
   */
  public void unsetEntityId3 () {
    this._EntityId3Set = false;
  }
  /** See if the field is actively set: EntityId3 (REWARD_BALANCE_ENTITY_MAPPING.entity_id3)
   * @return boolean whether the field is actively set
   */
  public boolean issetEntityId3 () {
    return this._EntityId3Set;
  }
  public String toString() {
    return RewardBalanceEntityMappingObjectHelper.toMap(this, null).toString();
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
  /** REWARD_BALANCE_ENTITY_MAPPING.reward_balance_id field */
    if(!nonNullOnly || (RewardBalanceId != null))  _RewardBalanceIdSet = flag;
  /** REWARD_BALANCE_ENTITY_MAPPING.entity_id1 field */
    if(!nonNullOnly || (EntityId1 != null))  _EntityId1Set = flag;
  /** REWARD_BALANCE_ENTITY_MAPPING.entity_id2 field */
    if(!nonNullOnly || (EntityId2 != null))  _EntityId2Set = flag;
  /** REWARD_BALANCE_ENTITY_MAPPING.entity_id3 field */
    if(!nonNullOnly || (EntityId3 != null))  _EntityId3Set = flag;
  }
}
