/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: HqContractUnitCrObjectKeyData.java
 * Definition File: Catalog/HqContractUnitCr.xml
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

/** HqContractUnitCrObject's Key Data class. */
public class HqContractUnitCrObjectKeyData  extends BaseObjectData
{
  /** HQ_CONTRACT_UNIT_CR.tracking_id field */
  public    Integer TrackingId  = null;
  protected boolean _TrackingIdSet = false;
  /** HQ_CONTRACT_UNIT_CR.tracking_id_serv field */
  public    Integer TrackingIdServ  = null;
  protected boolean _TrackingIdServSet = false;
  /** HQ_CONTRACT_UNIT_CR.unit_cr_id field */
  public    Integer UnitCrId  = null;
  protected boolean _UnitCrIdSet = false;
  private String _objName = "HqContractUnitCrObjectKeyData";
  /** default constructor */
  public HqContractUnitCrObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public HqContractUnitCrObjectKeyData (HqContractUnitCrObjectKeyData other)
  {
    if (other == null) return;
    this.TrackingId = other.TrackingId;
    this._TrackingIdSet = other._TrackingIdSet;
    this.TrackingIdServ = other.TrackingIdServ;
    this._TrackingIdServSet = other._TrackingIdServSet;
    this.UnitCrId = other.UnitCrId;
    this._UnitCrIdSet = other._UnitCrIdSet;
  }
  /** set the fields value: TrackingId (HQ_CONTRACT_UNIT_CR.tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TrackingId") 
  public void setTrackingId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingId", "setTrackingId");
    }
    this.TrackingId = value;
    this._TrackingIdSet = true;
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

  /** get the value of the field: TrackingId (HQ_CONTRACT_UNIT_CR.tracking_id)
   * @return Integer the value
   */
  public Integer getTrackingId () {
    return this.TrackingId;
  }
  /** Change the field to not being actively set: TrackingId (HQ_CONTRACT_UNIT_CR.tracking_id)
   */
  public void unsetTrackingId () {
    this._TrackingIdSet = false;
  }
  /** See if the field is actively set: TrackingId (HQ_CONTRACT_UNIT_CR.tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetTrackingId () {
    return this._TrackingIdSet;
  }
  /** set the fields value: TrackingIdServ (HQ_CONTRACT_UNIT_CR.tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TrackingIdServ") 
  public void setTrackingIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingIdServ", "setTrackingIdServ");
    }
    this.TrackingIdServ = value;
    this._TrackingIdServSet = true;
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

  /** get the value of the field: TrackingIdServ (HQ_CONTRACT_UNIT_CR.tracking_id_serv)
   * @return Integer the value
   */
  public Integer getTrackingIdServ () {
    return this.TrackingIdServ;
  }
  /** Change the field to not being actively set: TrackingIdServ (HQ_CONTRACT_UNIT_CR.tracking_id_serv)
   */
  public void unsetTrackingIdServ () {
    this._TrackingIdServSet = false;
  }
  /** See if the field is actively set: TrackingIdServ (HQ_CONTRACT_UNIT_CR.tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetTrackingIdServ () {
    return this._TrackingIdServSet;
  }
  /** set the fields value: UnitCrId (HQ_CONTRACT_UNIT_CR.unit_cr_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UnitCrId") 
  public void setUnitCrId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "UnitCrId", "setUnitCrId");
    }
    this.UnitCrId = value;
    this._UnitCrIdSet = true;
  }

  /** Retrieves the UnitCrId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UnitCrId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UnitCrId field
   */
   public String getUnitCrIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitCrIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUnitCrIdAsFormattedString");
       return fmtMgr.formatNumber(this.getUnitCrId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UnitCrId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUnitCrIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the UnitCrId field from a formatted string
   *
   * @param _value the UnitCrId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UnitCrId field
   */
   public void setUnitCrIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitCrIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUnitCrId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UnitCrId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUnitCrIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUnitCrIdFromFormattedString");
   }

  /** get the value of the field: UnitCrId (HQ_CONTRACT_UNIT_CR.unit_cr_id)
   * @return Integer the value
   */
  public Integer getUnitCrId () {
    return this.UnitCrId;
  }
  /** Change the field to not being actively set: UnitCrId (HQ_CONTRACT_UNIT_CR.unit_cr_id)
   */
  public void unsetUnitCrId () {
    this._UnitCrIdSet = false;
  }
  /** See if the field is actively set: UnitCrId (HQ_CONTRACT_UNIT_CR.unit_cr_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetUnitCrId () {
    return this._UnitCrIdSet;
  }
  public String toString() {
    return HqContractUnitCrObjectKeyHelper.toMap(this, null).toString();
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
    
  /** HQ_CONTRACT_UNIT_CR.tracking_id field */
    if(!nonNullOnly || (TrackingId != null))  _TrackingIdSet = flag;
  /** HQ_CONTRACT_UNIT_CR.tracking_id_serv field */
    if(!nonNullOnly || (TrackingIdServ != null))  _TrackingIdServSet = flag;
  /** HQ_CONTRACT_UNIT_CR.unit_cr_id field */
    if(!nonNullOnly || (UnitCrId != null))  _UnitCrIdSet = flag;
  }
}
