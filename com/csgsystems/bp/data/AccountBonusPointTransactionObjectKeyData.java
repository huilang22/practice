/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountBonusPointTransactionObjectKeyData.java
 * Definition File: Customer/AccountBonusPointTransaction.xml
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

/** AccountBonusPointTransactionObject's Key Data class. */
public class AccountBonusPointTransactionObjectKeyData  extends BaseObjectData
{
  /** CMF_BONUS_POINT.point_trans_tracking_id field */
  public    Integer PointTransTrackingId  = null;
  protected boolean _PointTransTrackingIdSet = false;
  /** CMF_BONUS_POINT.point_trans_tracking_id_serv field */
  public    Integer PointTransTrackingIdServ  = null;
  protected boolean _PointTransTrackingIdServSet = false;
  private String _objName = "AccountBonusPointTransactionObjectKeyData";
  /** default constructor */
  public AccountBonusPointTransactionObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public AccountBonusPointTransactionObjectKeyData (AccountBonusPointTransactionObjectKeyData other)
  {
    if (other == null) return;
    this.PointTransTrackingId = other.PointTransTrackingId;
    this._PointTransTrackingIdSet = other._PointTransTrackingIdSet;
    this.PointTransTrackingIdServ = other.PointTransTrackingIdServ;
    this._PointTransTrackingIdServSet = other._PointTransTrackingIdServSet;
  }
  /** set the fields value: PointTransTrackingId (CMF_BONUS_POINT.point_trans_tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PointTransTrackingId") 
  public void setPointTransTrackingId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PointTransTrackingId", "setPointTransTrackingId");
    }
    this.PointTransTrackingId = value;
    this._PointTransTrackingIdSet = true;
  }

  /** Retrieves the PointTransTrackingId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PointTransTrackingId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PointTransTrackingId field
   */
   public String getPointTransTrackingIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointTransTrackingIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPointTransTrackingIdAsFormattedString");
       return fmtMgr.formatNumber(this.getPointTransTrackingId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PointTransTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPointTransTrackingIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the PointTransTrackingId field from a formatted string
   *
   * @param _value the PointTransTrackingId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PointTransTrackingId field
   */
   public void setPointTransTrackingIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointTransTrackingIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPointTransTrackingId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PointTransTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPointTransTrackingIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPointTransTrackingIdFromFormattedString");
   }

  /** get the value of the field: PointTransTrackingId (CMF_BONUS_POINT.point_trans_tracking_id)
   * @return Integer the value
   */
  public Integer getPointTransTrackingId () {
    return this.PointTransTrackingId;
  }
  /** Change the field to not being actively set: PointTransTrackingId (CMF_BONUS_POINT.point_trans_tracking_id)
   */
  public void unsetPointTransTrackingId () {
    this._PointTransTrackingIdSet = false;
  }
  /** See if the field is actively set: PointTransTrackingId (CMF_BONUS_POINT.point_trans_tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetPointTransTrackingId () {
    return this._PointTransTrackingIdSet;
  }
  /** set the fields value: PointTransTrackingIdServ (CMF_BONUS_POINT.point_trans_tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PointTransTrackingIdServ") 
  public void setPointTransTrackingIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PointTransTrackingIdServ", "setPointTransTrackingIdServ");
    }
    this.PointTransTrackingIdServ = value;
    this._PointTransTrackingIdServSet = true;
  }

  /** Retrieves the PointTransTrackingIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PointTransTrackingIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PointTransTrackingIdServ field
   */
   public String getPointTransTrackingIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointTransTrackingIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPointTransTrackingIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getPointTransTrackingIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PointTransTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPointTransTrackingIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the PointTransTrackingIdServ field from a formatted string
   *
   * @param _value the PointTransTrackingIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PointTransTrackingIdServ field
   */
   public void setPointTransTrackingIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointTransTrackingIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPointTransTrackingIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PointTransTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPointTransTrackingIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPointTransTrackingIdServFromFormattedString");
   }

  /** get the value of the field: PointTransTrackingIdServ (CMF_BONUS_POINT.point_trans_tracking_id_serv)
   * @return Integer the value
   */
  public Integer getPointTransTrackingIdServ () {
    return this.PointTransTrackingIdServ;
  }
  /** Change the field to not being actively set: PointTransTrackingIdServ (CMF_BONUS_POINT.point_trans_tracking_id_serv)
   */
  public void unsetPointTransTrackingIdServ () {
    this._PointTransTrackingIdServSet = false;
  }
  /** See if the field is actively set: PointTransTrackingIdServ (CMF_BONUS_POINT.point_trans_tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetPointTransTrackingIdServ () {
    return this._PointTransTrackingIdServSet;
  }
  public String toString() {
    return AccountBonusPointTransactionObjectKeyHelper.toMap(this, null).toString();
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
    
  /** CMF_BONUS_POINT.point_trans_tracking_id field */
    if(!nonNullOnly || (PointTransTrackingId != null))  _PointTransTrackingIdSet = flag;
  /** CMF_BONUS_POINT.point_trans_tracking_id_serv field */
    if(!nonNullOnly || (PointTransTrackingIdServ != null))  _PointTransTrackingIdServSet = flag;
  }
}
