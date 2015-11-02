/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AbiNrcDucObjectKeyData.java
 * Definition File: Customer/AbiNrcDuc.xml
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

/** AbiNrcDucObject's Key Data class. */
public class AbiNrcDucObjectKeyData  extends BaseObjectData
{
  /** ABI_NRC_DUC.tracking_id field */
  public    BigInteger TrackingId  = null;
  protected boolean _TrackingIdSet = false;
  /** ABI_NRC_DUC.tracking_id_serv field */
  public    BigInteger TrackingIdServ  = null;
  protected boolean _TrackingIdServSet = false;
  /** ABI_NRC_DUC.parent_charge_type field */
  public    BigInteger ParentChargeType  = null;
  protected boolean _ParentChargeTypeSet = false;
  private String _objName = "AbiNrcDucObjectKeyData";
  /** default constructor */
  public AbiNrcDucObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public AbiNrcDucObjectKeyData (AbiNrcDucObjectKeyData other)
  {
    if (other == null) return;
    this.TrackingId = other.TrackingId;
    this._TrackingIdSet = other._TrackingIdSet;
    this.TrackingIdServ = other.TrackingIdServ;
    this._TrackingIdServSet = other._TrackingIdServSet;
    this.ParentChargeType = other.ParentChargeType;
    this._ParentChargeTypeSet = other._ParentChargeTypeSet;
  }
  /** set the fields value: TrackingId (ABI_NRC_DUC.tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TrackingId") 
  public void setTrackingId (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingId", "setTrackingId");
    }
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "TrackingId", "setTrackingId");
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
       return fmtMgr.formatBigInteger(this.getTrackingId(), _locale);
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
       this.setTrackingId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTrackingIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTrackingIdFromFormattedString");
   }

  /** get the value of the field: TrackingId (ABI_NRC_DUC.tracking_id)
   * @return BigInteger the value
   */
  public BigInteger getTrackingId () {
    return this.TrackingId;
  }
  /** Change the field to not being actively set: TrackingId (ABI_NRC_DUC.tracking_id)
   */
  public void unsetTrackingId () {
    this._TrackingIdSet = false;
  }
  /** See if the field is actively set: TrackingId (ABI_NRC_DUC.tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetTrackingId () {
    return this._TrackingIdSet;
  }
  /** set the fields value: TrackingIdServ (ABI_NRC_DUC.tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TrackingIdServ") 
  public void setTrackingIdServ (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingIdServ", "setTrackingIdServ");
    }
    if (value != null && !DataHelper.validLength (value, 3))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "TrackingIdServ", "setTrackingIdServ");
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
       return fmtMgr.formatBigInteger(this.getTrackingIdServ(), _locale);
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
       this.setTrackingIdServ(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTrackingIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTrackingIdServFromFormattedString");
   }

  /** get the value of the field: TrackingIdServ (ABI_NRC_DUC.tracking_id_serv)
   * @return BigInteger the value
   */
  public BigInteger getTrackingIdServ () {
    return this.TrackingIdServ;
  }
  /** Change the field to not being actively set: TrackingIdServ (ABI_NRC_DUC.tracking_id_serv)
   */
  public void unsetTrackingIdServ () {
    this._TrackingIdServSet = false;
  }
  /** See if the field is actively set: TrackingIdServ (ABI_NRC_DUC.tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetTrackingIdServ () {
    return this._TrackingIdServSet;
  }
  /** set the fields value: ParentChargeType (ABI_NRC_DUC.parent_charge_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ParentChargeType") 
  public void setParentChargeType (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ParentChargeType", "setParentChargeType");
    }
    if (value != null && !DataHelper.validLength (value, 3))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ParentChargeType", "setParentChargeType");
    }
    this.ParentChargeType = value;
    this._ParentChargeTypeSet = true;
  }

  /** Retrieves the ParentChargeType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ParentChargeType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParentChargeType field
   */
   public String getParentChargeTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentChargeTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParentChargeTypeAsFormattedString");
       return fmtMgr.formatBigInteger(this.getParentChargeType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParentChargeType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getParentChargeTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the ParentChargeType field from a formatted string
   *
   * @param _value the ParentChargeType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ParentChargeType field
   */
   public void setParentChargeTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentChargeTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setParentChargeType(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParentChargeType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setParentChargeTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParentChargeTypeFromFormattedString");
   }

  /** get the value of the field: ParentChargeType (ABI_NRC_DUC.parent_charge_type)
   * @return BigInteger the value
   */
  public BigInteger getParentChargeType () {
    return this.ParentChargeType;
  }
  /** Change the field to not being actively set: ParentChargeType (ABI_NRC_DUC.parent_charge_type)
   */
  public void unsetParentChargeType () {
    this._ParentChargeTypeSet = false;
  }
  /** See if the field is actively set: ParentChargeType (ABI_NRC_DUC.parent_charge_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetParentChargeType () {
    return this._ParentChargeTypeSet;
  }
  public String toString() {
    return AbiNrcDucObjectKeyHelper.toMap(this, null).toString();
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
    
  /** ABI_NRC_DUC.tracking_id field */
    if(!nonNullOnly || (TrackingId != null))  _TrackingIdSet = flag;
  /** ABI_NRC_DUC.tracking_id_serv field */
    if(!nonNullOnly || (TrackingIdServ != null))  _TrackingIdServSet = flag;
  /** ABI_NRC_DUC.parent_charge_type field */
    if(!nonNullOnly || (ParentChargeType != null))  _ParentChargeTypeSet = flag;
  }
}
