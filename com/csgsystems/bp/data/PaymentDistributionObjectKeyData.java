/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PaymentDistributionObjectKeyData.java
 * Definition File: Customer/PaymentDistribution.xml
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

/** PaymentDistributionObject's Key Data class. */
public class PaymentDistributionObjectKeyData  extends BaseObjectData
{
  /** BMF_DISTRIBUTION.bmf_tracking_id field */
  public    Integer BmfTrackingId  = null;
  protected boolean _BmfTrackingIdSet = false;
  /** BMF_DISTRIBUTION.bmf_tracking_id_serv field */
  public    Integer BmfTrackingIdServ  = null;
  protected boolean _BmfTrackingIdServSet = false;
  /** BMF_DISTRIBUTION.distrib_order field */
  public    Integer DistribOrder  = null;
  protected boolean _DistribOrderSet = false;
  private String _objName = "PaymentDistributionObjectKeyData";
  /** default constructor */
  public PaymentDistributionObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public PaymentDistributionObjectKeyData (PaymentDistributionObjectKeyData other)
  {
    if (other == null) return;
    this.BmfTrackingId = other.BmfTrackingId;
    this._BmfTrackingIdSet = other._BmfTrackingIdSet;
    this.BmfTrackingIdServ = other.BmfTrackingIdServ;
    this._BmfTrackingIdServSet = other._BmfTrackingIdServSet;
    this.DistribOrder = other.DistribOrder;
    this._DistribOrderSet = other._DistribOrderSet;
  }
  /** set the fields value: BmfTrackingId (BMF_DISTRIBUTION.bmf_tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BmfTrackingId") 
  public void setBmfTrackingId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BmfTrackingId", "setBmfTrackingId");
    }
    this.BmfTrackingId = value;
    this._BmfTrackingIdSet = true;
  }

  /** Retrieves the BmfTrackingId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BmfTrackingId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BmfTrackingId field
   */
   public String getBmfTrackingIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTrackingIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBmfTrackingIdAsFormattedString");
       return fmtMgr.formatNumber(this.getBmfTrackingId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BmfTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBmfTrackingIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the BmfTrackingId field from a formatted string
   *
   * @param _value the BmfTrackingId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BmfTrackingId field
   */
   public void setBmfTrackingIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTrackingIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBmfTrackingId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BmfTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBmfTrackingIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBmfTrackingIdFromFormattedString");
   }

  /** get the value of the field: BmfTrackingId (BMF_DISTRIBUTION.bmf_tracking_id)
   * @return Integer the value
   */
  public Integer getBmfTrackingId () {
    return this.BmfTrackingId;
  }
  /** Change the field to not being actively set: BmfTrackingId (BMF_DISTRIBUTION.bmf_tracking_id)
   */
  public void unsetBmfTrackingId () {
    this._BmfTrackingIdSet = false;
  }
  /** See if the field is actively set: BmfTrackingId (BMF_DISTRIBUTION.bmf_tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetBmfTrackingId () {
    return this._BmfTrackingIdSet;
  }
  /** set the fields value: BmfTrackingIdServ (BMF_DISTRIBUTION.bmf_tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BmfTrackingIdServ") 
  public void setBmfTrackingIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BmfTrackingIdServ", "setBmfTrackingIdServ");
    }
    this.BmfTrackingIdServ = value;
    this._BmfTrackingIdServSet = true;
  }

  /** Retrieves the BmfTrackingIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BmfTrackingIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BmfTrackingIdServ field
   */
   public String getBmfTrackingIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTrackingIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBmfTrackingIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getBmfTrackingIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BmfTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBmfTrackingIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the BmfTrackingIdServ field from a formatted string
   *
   * @param _value the BmfTrackingIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BmfTrackingIdServ field
   */
   public void setBmfTrackingIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTrackingIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBmfTrackingIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BmfTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBmfTrackingIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBmfTrackingIdServFromFormattedString");
   }

  /** get the value of the field: BmfTrackingIdServ (BMF_DISTRIBUTION.bmf_tracking_id_serv)
   * @return Integer the value
   */
  public Integer getBmfTrackingIdServ () {
    return this.BmfTrackingIdServ;
  }
  /** Change the field to not being actively set: BmfTrackingIdServ (BMF_DISTRIBUTION.bmf_tracking_id_serv)
   */
  public void unsetBmfTrackingIdServ () {
    this._BmfTrackingIdServSet = false;
  }
  /** See if the field is actively set: BmfTrackingIdServ (BMF_DISTRIBUTION.bmf_tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetBmfTrackingIdServ () {
    return this._BmfTrackingIdServSet;
  }
  /** set the fields value: DistribOrder (BMF_DISTRIBUTION.distrib_order)
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

  /** get the value of the field: DistribOrder (BMF_DISTRIBUTION.distrib_order)
   * @return Integer the value
   */
  public Integer getDistribOrder () {
    return this.DistribOrder;
  }
  /** Change the field to not being actively set: DistribOrder (BMF_DISTRIBUTION.distrib_order)
   */
  public void unsetDistribOrder () {
    this._DistribOrderSet = false;
  }
  /** See if the field is actively set: DistribOrder (BMF_DISTRIBUTION.distrib_order)
   * @return boolean whether the field is actively set
   */
  public boolean issetDistribOrder () {
    return this._DistribOrderSet;
  }
  public String toString() {
    return PaymentDistributionObjectKeyHelper.toMap(this, null).toString();
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
    
  /** BMF_DISTRIBUTION.bmf_tracking_id field */
    if(!nonNullOnly || (BmfTrackingId != null))  _BmfTrackingIdSet = flag;
  /** BMF_DISTRIBUTION.bmf_tracking_id_serv field */
    if(!nonNullOnly || (BmfTrackingIdServ != null))  _BmfTrackingIdServSet = flag;
  /** BMF_DISTRIBUTION.distrib_order field */
    if(!nonNullOnly || (DistribOrder != null))  _DistribOrderSet = flag;
  }
}
