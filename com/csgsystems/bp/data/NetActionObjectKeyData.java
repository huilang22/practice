/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: NetActionObjectKeyData.java
 * Definition File: Admin/NetAction.xml
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

/** NetActionObject's Key Data class. */
public class NetActionObjectKeyData  extends BaseObjectData
{
  /** NET_INTERFACE_ELIGIBILITY.rate_class field */
  public    Integer RateClass  = null;
  protected boolean _RateClassSet = false;
  /** NET_INTERFACE_ELIGIBILITY.mkt_code field */
  public    Integer MktCode  = null;
  protected boolean _MktCodeSet = false;
  /** NET_INTERFACE_ELIGIBILITY.emf_config_id field */
  public    Integer EmfConfigId  = null;
  protected boolean _EmfConfigIdSet = false;
  /** NET_ACTION_REF.net_action_name field */
  public    String NetActionName  = null;
  protected boolean _NetActionNameSet = false;
  private String _objName = "NetActionObjectKeyData";
  /** default constructor */
  public NetActionObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public NetActionObjectKeyData (NetActionObjectKeyData other)
  {
    if (other == null) return;
    this.RateClass = other.RateClass;
    this._RateClassSet = other._RateClassSet;
    this.MktCode = other.MktCode;
    this._MktCodeSet = other._MktCodeSet;
    this.EmfConfigId = other.EmfConfigId;
    this._EmfConfigIdSet = other._EmfConfigIdSet;
    this.NetActionName = other.NetActionName;
    this._NetActionNameSet = other._NetActionNameSet;
  }
  /** set the fields value: RateClass (NET_INTERFACE_ELIGIBILITY.rate_class)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RateClass") 
  public void setRateClass (Integer value) throws ServiceException
  {
    this.RateClass = value;
    this._RateClassSet = true;
  }

  /** Retrieves the RateClass field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RateClass field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateClass field
   */
   public String getRateClassAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateClassAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateClassAsFormattedString");
       return fmtMgr.formatNumber(this.getRateClass(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateClassAsFormattedString");
       throw x;
     }
   }
  /** Sets the RateClass field from a formatted string
   *
   * @param _value the RateClass field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RateClass field
   */
   public void setRateClassFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateClassFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRateClass(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateClassFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateClassFromFormattedString");
   }

  /** get the value of the field: RateClass (NET_INTERFACE_ELIGIBILITY.rate_class)
   * @return Integer the value
   */
  public Integer getRateClass () {
    return this.RateClass;
  }
  /** Change the field to not being actively set: RateClass (NET_INTERFACE_ELIGIBILITY.rate_class)
   */
  public void unsetRateClass () {
    this._RateClassSet = false;
  }
  /** See if the field is actively set: RateClass (NET_INTERFACE_ELIGIBILITY.rate_class)
   * @return boolean whether the field is actively set
   */
  public boolean issetRateClass () {
    return this._RateClassSet;
  }
  /** set the fields value: MktCode (NET_INTERFACE_ELIGIBILITY.mkt_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MktCode") 
  public void setMktCode (Integer value) throws ServiceException
  {
    this.MktCode = value;
    this._MktCodeSet = true;
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

  /** get the value of the field: MktCode (NET_INTERFACE_ELIGIBILITY.mkt_code)
   * @return Integer the value
   */
  public Integer getMktCode () {
    return this.MktCode;
  }
  /** Change the field to not being actively set: MktCode (NET_INTERFACE_ELIGIBILITY.mkt_code)
   */
  public void unsetMktCode () {
    this._MktCodeSet = false;
  }
  /** See if the field is actively set: MktCode (NET_INTERFACE_ELIGIBILITY.mkt_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetMktCode () {
    return this._MktCodeSet;
  }
  /** set the fields value: EmfConfigId (NET_INTERFACE_ELIGIBILITY.emf_config_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("EmfConfigId") 
  public void setEmfConfigId (Integer value) throws ServiceException
  {
    this.EmfConfigId = value;
    this._EmfConfigIdSet = true;
  }

  /** Retrieves the EmfConfigId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The EmfConfigId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EmfConfigId field
   */
   public String getEmfConfigIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEmfConfigIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEmfConfigIdAsFormattedString");
       return fmtMgr.formatNumber(this.getEmfConfigId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EmfConfigId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getEmfConfigIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the EmfConfigId field from a formatted string
   *
   * @param _value the EmfConfigId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EmfConfigId field
   */
   public void setEmfConfigIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEmfConfigIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setEmfConfigId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EmfConfigId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setEmfConfigIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEmfConfigIdFromFormattedString");
   }

  /** get the value of the field: EmfConfigId (NET_INTERFACE_ELIGIBILITY.emf_config_id)
   * @return Integer the value
   */
  public Integer getEmfConfigId () {
    return this.EmfConfigId;
  }
  /** Change the field to not being actively set: EmfConfigId (NET_INTERFACE_ELIGIBILITY.emf_config_id)
   */
  public void unsetEmfConfigId () {
    this._EmfConfigIdSet = false;
  }
  /** See if the field is actively set: EmfConfigId (NET_INTERFACE_ELIGIBILITY.emf_config_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetEmfConfigId () {
    return this._EmfConfigIdSet;
  }
  /** set the fields value: NetActionName (NET_ACTION_REF.net_action_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("NetActionName") 
  public void setNetActionName (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "NetActionName", "setNetActionName");
    }
    if (value != null && !DataHelper.validLength (value, 16))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "NetActionName", "setNetActionName");
    }
    this.NetActionName = value;
    this._NetActionNameSet = true;
  }

  /** Retrieves the NetActionName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The NetActionName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NetActionName field
   */
   public String getNetActionNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNetActionNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNetActionNameAsFormattedString");
       return fmtMgr.formatString(this.getNetActionName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NetActionName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getNetActionNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the NetActionName field from a formatted string
   *
   * @param _value the NetActionName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NetActionName field
   */
   public void setNetActionNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNetActionNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setNetActionName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NetActionName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setNetActionNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNetActionNameFromFormattedString");
   }

  /** get the value of the field: NetActionName (NET_ACTION_REF.net_action_name)
   * @return String the value
   */
  public String getNetActionName () {
    return this.NetActionName;
  }
  /** Change the field to not being actively set: NetActionName (NET_ACTION_REF.net_action_name)
   */
  public void unsetNetActionName () {
    this._NetActionNameSet = false;
  }
  /** See if the field is actively set: NetActionName (NET_ACTION_REF.net_action_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetNetActionName () {
    return this._NetActionNameSet;
  }
  public String toString() {
    return NetActionObjectKeyHelper.toMap(this, null).toString();
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
    
  /** NET_INTERFACE_ELIGIBILITY.rate_class field */
    if(!nonNullOnly || (RateClass != null))  _RateClassSet = flag;
  /** NET_INTERFACE_ELIGIBILITY.mkt_code field */
    if(!nonNullOnly || (MktCode != null))  _MktCodeSet = flag;
  /** NET_INTERFACE_ELIGIBILITY.emf_config_id field */
    if(!nonNullOnly || (EmfConfigId != null))  _EmfConfigIdSet = flag;
  /** NET_ACTION_REF.net_action_name field */
    if(!nonNullOnly || (NetActionName != null))  _NetActionNameSet = flag;
  }
}
