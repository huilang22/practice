/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: HotInvoiceObjectKeyData.java
 * Definition File: Customer/InterimBill.xml
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

/** HotInvoiceObject's Key Data class. */
public class HotInvoiceObjectKeyData  extends BaseObjectData
{
  /** HotReqStatusQueue field */
  public    String HotReqStatusQueue  = null;
  protected boolean _HotReqStatusQueueSet = false;
  private String _objName = "HotInvoiceObjectKeyData";
  /** default constructor */
  public HotInvoiceObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public HotInvoiceObjectKeyData (HotInvoiceObjectKeyData other)
  {
    if (other == null) return;
    this.HotReqStatusQueue = other.HotReqStatusQueue;
    this._HotReqStatusQueueSet = other._HotReqStatusQueueSet;
  }
  /** set the fields value: HotReqStatusQueue
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null, or the value's length exceeds the maximum length for the field (33)
   */
  public void setHotReqStatusQueue (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "HotReqStatusQueue", "setHotReqStatusQueue");
    }
    if (value != null && !DataHelper.validLength (value, 33))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "HotReqStatusQueue", "setHotReqStatusQueue");
    }
    this.HotReqStatusQueue = value;
    this._HotReqStatusQueueSet = true;
  }
  /** get the value of the field: HotReqStatusQueue
   * @return String the value
   */
  public String getHotReqStatusQueue ()
  {
    return this.HotReqStatusQueue;
  }
  /** Change the field to not being actively set: HotReqStatusQueue
   */
  public void unsetHotReqStatusQueue ()
  {
    this._HotReqStatusQueueSet = false;
  }
  /** See if the field is actively set: HotReqStatusQueue
   * @return boolean whether the field is actively set
   */
  public boolean issetHotReqStatusQueue ()
  {
    return this._HotReqStatusQueueSet;
  }

  /** Retrieves the HotReqStatusQueue field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The HotReqStatusQueue field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the HotReqStatusQueue field
   */
   public String getHotReqStatusQueueAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHotReqStatusQueueAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getHotReqStatusQueueAsFormattedString");
       return fmtMgr.formatString(this.getHotReqStatusQueue());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("HotReqStatusQueue");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getHotReqStatusQueueAsFormattedString");
       throw x;
     }
   }
  /** Sets the HotReqStatusQueue field from a formatted string
   *
   * @param _value the HotReqStatusQueue field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the HotReqStatusQueue field
   */
   public void setHotReqStatusQueueFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHotReqStatusQueueFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setHotReqStatusQueue(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("HotReqStatusQueue");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setHotReqStatusQueueFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setHotReqStatusQueueFromFormattedString");
   }

  public String toString() {
    return HotInvoiceObjectKeyHelper.toMap(this, null).toString();
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
    
  /** HotReqStatusQueue field */
    if (!nonNullOnly || (HotReqStatusQueue != null)) _HotReqStatusQueueSet = flag;
  }
}
