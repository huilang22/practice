/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PrepaymentDistributionObjectKeyData.java
 * Definition File: Customer/PrepaymentDistribution.xml
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

/** PrepaymentDistributionObject's Key Data class. */
public class PrepaymentDistributionObjectKeyData  extends BaseObjectData
{
  /** PREPAYMENT_DISTRIBUTION.prepayment_tracking_id field */
  public    Integer PrepaymentTrackingId  = null;
  protected boolean _PrepaymentTrackingIdSet = false;
  /** PREPAYMENT_DISTRIBUTION.prepayment_tracking_id_serv field */
  public    Integer PrepaymentTrackingIdServ  = null;
  protected boolean _PrepaymentTrackingIdServSet = false;
  /** PREPAYMENT_DISTRIBUTION.distrib_order field */
  public    Integer DistribOrder  = null;
  protected boolean _DistribOrderSet = false;
  private String _objName = "PrepaymentDistributionObjectKeyData";
  /** default constructor */
  public PrepaymentDistributionObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public PrepaymentDistributionObjectKeyData (PrepaymentDistributionObjectKeyData other)
  {
    if (other == null) return;
    this.PrepaymentTrackingId = other.PrepaymentTrackingId;
    this._PrepaymentTrackingIdSet = other._PrepaymentTrackingIdSet;
    this.PrepaymentTrackingIdServ = other.PrepaymentTrackingIdServ;
    this._PrepaymentTrackingIdServSet = other._PrepaymentTrackingIdServSet;
    this.DistribOrder = other.DistribOrder;
    this._DistribOrderSet = other._DistribOrderSet;
  }
  /** set the fields value: PrepaymentTrackingId (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PrepaymentTrackingId") 
  public void setPrepaymentTrackingId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PrepaymentTrackingId", "setPrepaymentTrackingId");
    }
    this.PrepaymentTrackingId = value;
    this._PrepaymentTrackingIdSet = true;
  }

  /** Retrieves the PrepaymentTrackingId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrepaymentTrackingId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrepaymentTrackingId field
   */
   public String getPrepaymentTrackingIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepaymentTrackingIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepaymentTrackingIdAsFormattedString");
       return fmtMgr.formatNumber(this.getPrepaymentTrackingId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrepaymentTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrepaymentTrackingIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrepaymentTrackingId field from a formatted string
   *
   * @param _value the PrepaymentTrackingId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrepaymentTrackingId field
   */
   public void setPrepaymentTrackingIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepaymentTrackingIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrepaymentTrackingId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrepaymentTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrepaymentTrackingIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrepaymentTrackingIdFromFormattedString");
   }

  /** get the value of the field: PrepaymentTrackingId (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id)
   * @return Integer the value
   */
  public Integer getPrepaymentTrackingId () {
    return this.PrepaymentTrackingId;
  }
  /** Change the field to not being actively set: PrepaymentTrackingId (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id)
   */
  public void unsetPrepaymentTrackingId () {
    this._PrepaymentTrackingIdSet = false;
  }
  /** See if the field is actively set: PrepaymentTrackingId (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetPrepaymentTrackingId () {
    return this._PrepaymentTrackingIdSet;
  }
  /** set the fields value: PrepaymentTrackingIdServ (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PrepaymentTrackingIdServ") 
  public void setPrepaymentTrackingIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PrepaymentTrackingIdServ", "setPrepaymentTrackingIdServ");
    }
    this.PrepaymentTrackingIdServ = value;
    this._PrepaymentTrackingIdServSet = true;
  }

  /** Retrieves the PrepaymentTrackingIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrepaymentTrackingIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrepaymentTrackingIdServ field
   */
   public String getPrepaymentTrackingIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepaymentTrackingIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepaymentTrackingIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getPrepaymentTrackingIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrepaymentTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrepaymentTrackingIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrepaymentTrackingIdServ field from a formatted string
   *
   * @param _value the PrepaymentTrackingIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrepaymentTrackingIdServ field
   */
   public void setPrepaymentTrackingIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepaymentTrackingIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrepaymentTrackingIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrepaymentTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrepaymentTrackingIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrepaymentTrackingIdServFromFormattedString");
   }

  /** get the value of the field: PrepaymentTrackingIdServ (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id_serv)
   * @return Integer the value
   */
  public Integer getPrepaymentTrackingIdServ () {
    return this.PrepaymentTrackingIdServ;
  }
  /** Change the field to not being actively set: PrepaymentTrackingIdServ (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id_serv)
   */
  public void unsetPrepaymentTrackingIdServ () {
    this._PrepaymentTrackingIdServSet = false;
  }
  /** See if the field is actively set: PrepaymentTrackingIdServ (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetPrepaymentTrackingIdServ () {
    return this._PrepaymentTrackingIdServSet;
  }
  /** set the fields value: DistribOrder (PREPAYMENT_DISTRIBUTION.distrib_order)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DistribOrder") 
  public void setDistribOrder (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DistribOrder", "setDistribOrder");
    }
    this.DistribOrder = value;
    this._DistribOrderSet = true;
  }

  /** Retrieves the DistribOrder field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DistribOrder field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DistribOrder field
   */
   public String getDistribOrderAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDistribOrderAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDistribOrderAsFormattedString");
       return fmtMgr.formatNumber(this.getDistribOrder(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DistribOrder");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDistribOrderAsFormattedString");
       throw x;
     }
   }
  /** Sets the DistribOrder field from a formatted string
   *
   * @param _value the DistribOrder field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DistribOrder field
   */
   public void setDistribOrderFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDistribOrderFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDistribOrder(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DistribOrder");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDistribOrderFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDistribOrderFromFormattedString");
   }

  /** get the value of the field: DistribOrder (PREPAYMENT_DISTRIBUTION.distrib_order)
   * @return Integer the value
   */
  public Integer getDistribOrder () {
    return this.DistribOrder;
  }
  /** Change the field to not being actively set: DistribOrder (PREPAYMENT_DISTRIBUTION.distrib_order)
   */
  public void unsetDistribOrder () {
    this._DistribOrderSet = false;
  }
  /** See if the field is actively set: DistribOrder (PREPAYMENT_DISTRIBUTION.distrib_order)
   * @return boolean whether the field is actively set
   */
  public boolean issetDistribOrder () {
    return this._DistribOrderSet;
  }
  public String toString() {
    return PrepaymentDistributionObjectKeyHelper.toMap(this, null).toString();
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
    
  /** PREPAYMENT_DISTRIBUTION.prepayment_tracking_id field */
    if(!nonNullOnly || (PrepaymentTrackingId != null))  _PrepaymentTrackingIdSet = flag;
  /** PREPAYMENT_DISTRIBUTION.prepayment_tracking_id_serv field */
    if(!nonNullOnly || (PrepaymentTrackingIdServ != null))  _PrepaymentTrackingIdServSet = flag;
  /** PREPAYMENT_DISTRIBUTION.distrib_order field */
    if(!nonNullOnly || (DistribOrder != null))  _DistribOrderSet = flag;
  }
}
