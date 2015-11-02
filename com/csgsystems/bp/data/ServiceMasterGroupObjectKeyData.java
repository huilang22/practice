/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ServiceMasterGroupObjectKeyData.java
 * Definition File: Customer/ServiceMasterGroup.xml
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

/** ServiceMasterGroupObject's Key Data class. */
public class ServiceMasterGroupObjectKeyData  extends BaseObjectData
{
  /** EMF_MASTER_GROUPS.subscr_master_group_no field */
  public    Integer SubscrMasterGroupNo  = null;
  protected boolean _SubscrMasterGroupNoSet = false;
  private String _objName = "ServiceMasterGroupObjectKeyData";
  /** default constructor */
  public ServiceMasterGroupObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public ServiceMasterGroupObjectKeyData (ServiceMasterGroupObjectKeyData other)
  {
    if (other == null) return;
    this.SubscrMasterGroupNo = other.SubscrMasterGroupNo;
    this._SubscrMasterGroupNoSet = other._SubscrMasterGroupNoSet;
  }
  /** set the fields value: SubscrMasterGroupNo (EMF_MASTER_GROUPS.subscr_master_group_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SubscrMasterGroupNo") 
  public void setSubscrMasterGroupNo (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SubscrMasterGroupNo", "setSubscrMasterGroupNo");
    }
    this.SubscrMasterGroupNo = value;
    this._SubscrMasterGroupNoSet = true;
  }

  /** Retrieves the SubscrMasterGroupNo field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SubscrMasterGroupNo field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SubscrMasterGroupNo field
   */
   public String getSubscrMasterGroupNoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSubscrMasterGroupNoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSubscrMasterGroupNoAsFormattedString");
       return fmtMgr.formatNumber(this.getSubscrMasterGroupNo(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SubscrMasterGroupNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSubscrMasterGroupNoAsFormattedString");
       throw x;
     }
   }
  /** Sets the SubscrMasterGroupNo field from a formatted string
   *
   * @param _value the SubscrMasterGroupNo field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SubscrMasterGroupNo field
   */
   public void setSubscrMasterGroupNoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSubscrMasterGroupNoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSubscrMasterGroupNo(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SubscrMasterGroupNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSubscrMasterGroupNoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSubscrMasterGroupNoFromFormattedString");
   }

  /** get the value of the field: SubscrMasterGroupNo (EMF_MASTER_GROUPS.subscr_master_group_no)
   * @return Integer the value
   */
  public Integer getSubscrMasterGroupNo () {
    return this.SubscrMasterGroupNo;
  }
  /** Change the field to not being actively set: SubscrMasterGroupNo (EMF_MASTER_GROUPS.subscr_master_group_no)
   */
  public void unsetSubscrMasterGroupNo () {
    this._SubscrMasterGroupNoSet = false;
  }
  /** See if the field is actively set: SubscrMasterGroupNo (EMF_MASTER_GROUPS.subscr_master_group_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetSubscrMasterGroupNo () {
    return this._SubscrMasterGroupNoSet;
  }
  public String toString() {
    return ServiceMasterGroupObjectKeyHelper.toMap(this, null).toString();
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
    
  /** EMF_MASTER_GROUPS.subscr_master_group_no field */
    if(!nonNullOnly || (SubscrMasterGroupNo != null))  _SubscrMasterGroupNoSet = flag;
  }
}
