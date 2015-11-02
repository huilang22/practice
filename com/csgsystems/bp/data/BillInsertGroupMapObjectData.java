/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BillInsertGroupMapObjectData.java
 * Definition File: Admin/BillInsertGroupMap.xml
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
  
/** BillInsertGroupMapObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class BillInsertGroupMapObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public BillInsertGroupMapObjectKeyData Key = null;
  /** BILL_INSERT_GROUPS.insert_trigger_id field */
  public    Integer InsertTriggerId  = null;
  protected boolean _InsertTriggerIdSet = false;
  /** BILL_INSERT_GROUPS.insert_bin_num field */
  public    Integer InsertBinNum  = null;
  protected boolean _InsertBinNumSet = false;
  /** BILL_INSERT_GROUPS.is_required field */
  public    Boolean IsRequired  = null;
  protected boolean _IsRequiredSet = false;
  /** BILL_INSERT_GROUPS.priority field */
  public    Integer Priority  = null;
  protected boolean _PrioritySet = false;
  /** BILL_INSERT_GROUPS.active_dt field */
  public    Date ActiveDt  = null;
  protected boolean _ActiveDtSet = false;
  /** BILL_INSERT_GROUPS.inactive_dt field */
  public    Date InactiveDt  = null;
  protected boolean _InactiveDtSet = false;
  /** BILL_INSERT_GROUPS.insert_foreign_key field */
  public    Integer InsertForeignKey  = null;
  protected boolean _InsertForeignKeySet = false;
  /** BILL_INSERT_GROUPS.config_tag_id field */
  public    String ConfigTagId  = null;
  protected boolean _ConfigTagIdSet = false;
  private String _objName = "BillInsertGroupMapObjectData";
  /** Default constructor */
  public BillInsertGroupMapObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public BillInsertGroupMapObjectData (BillInsertGroupMapObjectData other)
  {

    if (other == null) return;
    this.Key = new BillInsertGroupMapObjectKeyData (other.Key);
    this.InsertTriggerId = other.InsertTriggerId;
    this._InsertTriggerIdSet = other._InsertTriggerIdSet;
    this.InsertBinNum = other.InsertBinNum;
    this._InsertBinNumSet = other._InsertBinNumSet;
    this.IsRequired = other.IsRequired;
    this._IsRequiredSet = other._IsRequiredSet;
    this.Priority = other.Priority;
    this._PrioritySet = other._PrioritySet;
    this.ActiveDt = other.ActiveDt;
    this._ActiveDtSet = other._ActiveDtSet;
    this.InactiveDt = other.InactiveDt;
    this._InactiveDtSet = other._InactiveDtSet;
    this.InsertForeignKey = other.InsertForeignKey;
    this._InsertForeignKeySet = other._InsertForeignKeySet;
    this.ConfigTagId = other.ConfigTagId;
    this._ConfigTagIdSet = other._ConfigTagIdSet;
  }

  /** get the Key for this object
   * @return BillInsertGroupMapObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public BillInsertGroupMapObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (BillInsertGroupMapObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: InsertGrpId (BILL_INSERT_GROUPS.insert_grp_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setInsertGrpId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "InsertGrpId", "setInsertGrpId");
    }
    if (this.Key == null) this.Key = new BillInsertGroupMapObjectKeyData ();
    this.Key.InsertGrpId = value;
    this.Key._InsertGrpIdSet = true;
  }
  /** get the value of the field: InsertGrpId (BILL_INSERT_GROUPS.insert_grp_id)
   * @return Integer the value
   */
  public Integer getInsertGrpId () {
    if (this.Key == null) return null;
    return this.Key.InsertGrpId;
  }
  /** Change the field to not being actively set: InsertGrpId (BILL_INSERT_GROUPS.insert_grp_id)
   */
  public void unsetInsertGrpId () {
    if (this.Key == null) return;
    this.Key._InsertGrpIdSet = false;
  }
  /** See if the field is actively set: InsertGrpId (BILL_INSERT_GROUPS.insert_grp_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetInsertGrpId () {
    if (this.Key == null) return false;
    return this.Key._InsertGrpIdSet;
  }

  /** Retrieves the InsertGrpId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InsertGrpId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InsertGrpId field
   */
   public String getInsertGrpIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInsertGrpIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInsertGrpIdAsFormattedString");
       return fmtMgr.formatNumber(this.getInsertGrpId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InsertGrpId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInsertGrpIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the InsertGrpId field from a formatted string
   *
   * @param _value the InsertGrpId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InsertGrpId field
   */
   public void setInsertGrpIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInsertGrpIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInsertGrpId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InsertGrpId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInsertGrpIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInsertGrpIdFromFormattedString");
   }

  /** set the fields value: InsertId (BILL_INSERT_GROUPS.insert_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setInsertId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "InsertId", "setInsertId");
    }
    if (this.Key == null) this.Key = new BillInsertGroupMapObjectKeyData ();
    this.Key.InsertId = value;
    this.Key._InsertIdSet = true;
  }
  /** get the value of the field: InsertId (BILL_INSERT_GROUPS.insert_id)
   * @return Integer the value
   */
  public Integer getInsertId () {
    if (this.Key == null) return null;
    return this.Key.InsertId;
  }
  /** Change the field to not being actively set: InsertId (BILL_INSERT_GROUPS.insert_id)
   */
  public void unsetInsertId () {
    if (this.Key == null) return;
    this.Key._InsertIdSet = false;
  }
  /** See if the field is actively set: InsertId (BILL_INSERT_GROUPS.insert_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetInsertId () {
    if (this.Key == null) return false;
    return this.Key._InsertIdSet;
  }

  /** Retrieves the InsertId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InsertId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InsertId field
   */
   public String getInsertIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInsertIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInsertIdAsFormattedString");
       return fmtMgr.formatNumber(this.getInsertId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InsertId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInsertIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the InsertId field from a formatted string
   *
   * @param _value the InsertId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InsertId field
   */
   public void setInsertIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInsertIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInsertId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InsertId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInsertIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInsertIdFromFormattedString");
   }

  /** set the fields value: GeoKey (BILL_INSERT_GROUPS.geo_key)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setGeoKey (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "GeoKey", "setGeoKey");
    }
    if (value != null && !DataHelper.validLength (value, 8))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "GeoKey", "setGeoKey");
    }
    if (this.Key == null) this.Key = new BillInsertGroupMapObjectKeyData ();
    this.Key.GeoKey = value;
    this.Key._GeoKeySet = true;
  }
  /** get the value of the field: GeoKey (BILL_INSERT_GROUPS.geo_key)
   * @return String the value
   */
  public String getGeoKey () {
    if (this.Key == null) return null;
    return this.Key.GeoKey;
  }
  /** Change the field to not being actively set: GeoKey (BILL_INSERT_GROUPS.geo_key)
   */
  public void unsetGeoKey () {
    if (this.Key == null) return;
    this.Key._GeoKeySet = false;
  }
  /** See if the field is actively set: GeoKey (BILL_INSERT_GROUPS.geo_key)
   * @return boolean whether the field is actively set
   */
  public boolean issetGeoKey () {
    if (this.Key == null) return false;
    return this.Key._GeoKeySet;
  }

  /** Retrieves the GeoKey field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The GeoKey field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GeoKey field
   */
   public String getGeoKeyAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGeoKeyAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGeoKeyAsFormattedString");
       return fmtMgr.formatString(this.getGeoKey());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("GeoKey");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getGeoKeyAsFormattedString");
       throw x;
     }
   }
  /** Sets the GeoKey field from a formatted string
   *
   * @param _value the GeoKey field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the GeoKey field
   */
   public void setGeoKeyFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGeoKeyFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setGeoKey(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("GeoKey");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setGeoKeyFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGeoKeyFromFormattedString");
   }

  /** set the fields value: MktCode (BILL_INSERT_GROUPS.mkt_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setMktCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "MktCode", "setMktCode");
    }
    if (this.Key == null) this.Key = new BillInsertGroupMapObjectKeyData ();
    this.Key.MktCode = value;
    this.Key._MktCodeSet = true;
  }
  /** get the value of the field: MktCode (BILL_INSERT_GROUPS.mkt_code)
   * @return Integer the value
   */
  public Integer getMktCode () {
    if (this.Key == null) return null;
    return this.Key.MktCode;
  }
  /** Change the field to not being actively set: MktCode (BILL_INSERT_GROUPS.mkt_code)
   */
  public void unsetMktCode () {
    if (this.Key == null) return;
    this.Key._MktCodeSet = false;
  }
  /** See if the field is actively set: MktCode (BILL_INSERT_GROUPS.mkt_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetMktCode () {
    if (this.Key == null) return false;
    return this.Key._MktCodeSet;
  }

  /** Retrieves the MktCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MktCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MktCode field
   */
   public String getMktCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMktCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMktCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getMktCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MktCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMktCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the MktCode field from a formatted string
   *
   * @param _value the MktCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MktCode field
   */
   public void setMktCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMktCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMktCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MktCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMktCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMktCodeFromFormattedString");
   }

  /** set the fields value: InsertTriggerId (BILL_INSERT_GROUPS.insert_trigger_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("InsertTriggerId") 
  public void setInsertTriggerId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "InsertTriggerId", "setInsertTriggerId");
    }
    this.InsertTriggerId = value;
    this._InsertTriggerIdSet = true;
  }

  /** Retrieves the InsertTriggerId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InsertTriggerId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InsertTriggerId field
   */
   public String getInsertTriggerIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInsertTriggerIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInsertTriggerIdAsFormattedString");
       return fmtMgr.formatNumber(this.getInsertTriggerId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InsertTriggerId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInsertTriggerIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the InsertTriggerId field from a formatted string
   *
   * @param _value the InsertTriggerId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InsertTriggerId field
   */
   public void setInsertTriggerIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInsertTriggerIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInsertTriggerId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InsertTriggerId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInsertTriggerIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInsertTriggerIdFromFormattedString");
   }

  /** get the value of the field: InsertTriggerId (BILL_INSERT_GROUPS.insert_trigger_id)
   * @return Integer the value
   */
  public Integer getInsertTriggerId () {
    return this.InsertTriggerId;
  }
  /** Change the field to not being actively set: InsertTriggerId (BILL_INSERT_GROUPS.insert_trigger_id)
   */
  public void unsetInsertTriggerId () {
    this._InsertTriggerIdSet = false;
  }
  /** See if the field is actively set: InsertTriggerId (BILL_INSERT_GROUPS.insert_trigger_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetInsertTriggerId () {
    return this._InsertTriggerIdSet;
  }
  /** set the fields value: InsertBinNum (BILL_INSERT_GROUPS.insert_bin_num)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("InsertBinNum") 
  public void setInsertBinNum (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "InsertBinNum", "setInsertBinNum");
    }
    this.InsertBinNum = value;
    this._InsertBinNumSet = true;
  }

  /** Retrieves the InsertBinNum field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InsertBinNum field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InsertBinNum field
   */
   public String getInsertBinNumAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInsertBinNumAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInsertBinNumAsFormattedString");
       return fmtMgr.formatNumber(this.getInsertBinNum(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InsertBinNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInsertBinNumAsFormattedString");
       throw x;
     }
   }
  /** Sets the InsertBinNum field from a formatted string
   *
   * @param _value the InsertBinNum field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InsertBinNum field
   */
   public void setInsertBinNumFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInsertBinNumFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInsertBinNum(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InsertBinNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInsertBinNumFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInsertBinNumFromFormattedString");
   }

  /** get the value of the field: InsertBinNum (BILL_INSERT_GROUPS.insert_bin_num)
   * @return Integer the value
   */
  public Integer getInsertBinNum () {
    return this.InsertBinNum;
  }
  /** Change the field to not being actively set: InsertBinNum (BILL_INSERT_GROUPS.insert_bin_num)
   */
  public void unsetInsertBinNum () {
    this._InsertBinNumSet = false;
  }
  /** See if the field is actively set: InsertBinNum (BILL_INSERT_GROUPS.insert_bin_num)
   * @return boolean whether the field is actively set
   */
  public boolean issetInsertBinNum () {
    return this._InsertBinNumSet;
  }
  /** set the fields value: IsRequired (BILL_INSERT_GROUPS.is_required)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsRequired") 
  public void setIsRequired (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsRequired", "setIsRequired");
    }
    this.IsRequired = value;
    this._IsRequiredSet = true;
  }

  /** Retrieves the IsRequired field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsRequired field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsRequired field
   */
   public String getIsRequiredAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsRequiredAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsRequiredAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsRequired());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsRequired");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsRequiredAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsRequired field from a formatted string
   *
   * @param _value the IsRequired field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsRequired field
   */
   public void setIsRequiredFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsRequiredFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsRequired(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsRequired");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsRequiredFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsRequiredFromFormattedString");
   }

  /** get the value of the field: IsRequired (BILL_INSERT_GROUPS.is_required)
   * @return Boolean the value
   */
  public Boolean getIsRequired () {
    return this.IsRequired;
  }
  /** Change the field to not being actively set: IsRequired (BILL_INSERT_GROUPS.is_required)
   */
  public void unsetIsRequired () {
    this._IsRequiredSet = false;
  }
  /** See if the field is actively set: IsRequired (BILL_INSERT_GROUPS.is_required)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsRequired () {
    return this._IsRequiredSet;
  }
  /** set the fields value: Priority (BILL_INSERT_GROUPS.priority)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Priority") 
  public void setPriority (Integer value) throws ServiceException
  {
    this.Priority = value;
    this._PrioritySet = true;
  }

  /** Retrieves the Priority field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Priority field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Priority field
   */
   public String getPriorityAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPriorityAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPriorityAsFormattedString");
       return fmtMgr.formatNumber(this.getPriority(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Priority");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPriorityAsFormattedString");
       throw x;
     }
   }
  /** Sets the Priority field from a formatted string
   *
   * @param _value the Priority field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Priority field
   */
   public void setPriorityFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPriorityFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPriority(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Priority");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPriorityFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPriorityFromFormattedString");
   }

  /** get the value of the field: Priority (BILL_INSERT_GROUPS.priority)
   * @return Integer the value
   */
  public Integer getPriority () {
    return this.Priority;
  }
  /** Change the field to not being actively set: Priority (BILL_INSERT_GROUPS.priority)
   */
  public void unsetPriority () {
    this._PrioritySet = false;
  }
  /** See if the field is actively set: Priority (BILL_INSERT_GROUPS.priority)
   * @return boolean whether the field is actively set
   */
  public boolean issetPriority () {
    return this._PrioritySet;
  }
  /** set the fields value: ActiveDt (BILL_INSERT_GROUPS.active_dt)
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

  /** get the value of the field: ActiveDt (BILL_INSERT_GROUPS.active_dt)
   * @return Date the value
   */
  public Date getActiveDt () {
    return this.ActiveDt;
  }
  /** Change the field to not being actively set: ActiveDt (BILL_INSERT_GROUPS.active_dt)
   */
  public void unsetActiveDt () {
    this._ActiveDtSet = false;
  }
  /** See if the field is actively set: ActiveDt (BILL_INSERT_GROUPS.active_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetActiveDt () {
    return this._ActiveDtSet;
  }
  /** set the fields value: InactiveDt (BILL_INSERT_GROUPS.inactive_dt)
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

  /** get the value of the field: InactiveDt (BILL_INSERT_GROUPS.inactive_dt)
   * @return Date the value
   */
  public Date getInactiveDt () {
    return this.InactiveDt;
  }
  /** Change the field to not being actively set: InactiveDt (BILL_INSERT_GROUPS.inactive_dt)
   */
  public void unsetInactiveDt () {
    this._InactiveDtSet = false;
  }
  /** See if the field is actively set: InactiveDt (BILL_INSERT_GROUPS.inactive_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetInactiveDt () {
    return this._InactiveDtSet;
  }
  /** set the fields value: InsertForeignKey (BILL_INSERT_GROUPS.insert_foreign_key)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("InsertForeignKey") 
  public void setInsertForeignKey (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "InsertForeignKey", "setInsertForeignKey");
    }
    this.InsertForeignKey = value;
    this._InsertForeignKeySet = true;
  }

  /** Retrieves the InsertForeignKey field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InsertForeignKey field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InsertForeignKey field
   */
   public String getInsertForeignKeyAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInsertForeignKeyAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInsertForeignKeyAsFormattedString");
       return fmtMgr.formatNumber(this.getInsertForeignKey(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InsertForeignKey");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInsertForeignKeyAsFormattedString");
       throw x;
     }
   }
  /** Sets the InsertForeignKey field from a formatted string
   *
   * @param _value the InsertForeignKey field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InsertForeignKey field
   */
   public void setInsertForeignKeyFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInsertForeignKeyFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInsertForeignKey(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InsertForeignKey");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInsertForeignKeyFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInsertForeignKeyFromFormattedString");
   }

  /** get the value of the field: InsertForeignKey (BILL_INSERT_GROUPS.insert_foreign_key)
   * @return Integer the value
   */
  public Integer getInsertForeignKey () {
    return this.InsertForeignKey;
  }
  /** Change the field to not being actively set: InsertForeignKey (BILL_INSERT_GROUPS.insert_foreign_key)
   */
  public void unsetInsertForeignKey () {
    this._InsertForeignKeySet = false;
  }
  /** See if the field is actively set: InsertForeignKey (BILL_INSERT_GROUPS.insert_foreign_key)
   * @return boolean whether the field is actively set
   */
  public boolean issetInsertForeignKey () {
    return this._InsertForeignKeySet;
  }
  /** set the fields value: ConfigTagId (BILL_INSERT_GROUPS.config_tag_id)
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

  /** get the value of the field: ConfigTagId (BILL_INSERT_GROUPS.config_tag_id)
   * @return String the value
   */
  public String getConfigTagId () {
    return this.ConfigTagId;
  }
  /** Change the field to not being actively set: ConfigTagId (BILL_INSERT_GROUPS.config_tag_id)
   */
  public void unsetConfigTagId () {
    this._ConfigTagIdSet = false;
  }
  /** See if the field is actively set: ConfigTagId (BILL_INSERT_GROUPS.config_tag_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetConfigTagId () {
    return this._ConfigTagIdSet;
  }
  public String toString() {
    return BillInsertGroupMapObjectHelper.toMap(this, null).toString();
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
  /** BILL_INSERT_GROUPS.insert_trigger_id field */
    if(!nonNullOnly || (InsertTriggerId != null))  _InsertTriggerIdSet = flag;
  /** BILL_INSERT_GROUPS.insert_bin_num field */
    if(!nonNullOnly || (InsertBinNum != null))  _InsertBinNumSet = flag;
  /** BILL_INSERT_GROUPS.is_required field */
    if(!nonNullOnly || (IsRequired != null))  _IsRequiredSet = flag;
  /** BILL_INSERT_GROUPS.priority field */
    if(!nonNullOnly || (Priority != null))  _PrioritySet = flag;
  /** BILL_INSERT_GROUPS.active_dt field */
    if(!nonNullOnly || (ActiveDt != null))  _ActiveDtSet = flag;
  /** BILL_INSERT_GROUPS.inactive_dt field */
    if(!nonNullOnly || (InactiveDt != null))  _InactiveDtSet = flag;
  /** BILL_INSERT_GROUPS.insert_foreign_key field */
    if(!nonNullOnly || (InsertForeignKey != null))  _InsertForeignKeySet = flag;
  /** BILL_INSERT_GROUPS.config_tag_id field */
    if(!nonNullOnly || (ConfigTagId != null))  _ConfigTagIdSet = flag;
  }
}
