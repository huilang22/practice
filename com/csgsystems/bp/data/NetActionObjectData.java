/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: NetActionObjectData.java
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
  
/** NetActionObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class NetActionObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public NetActionObjectKeyData Key = null;
  /** NET_ACTION_REF.is_default field */
  public    Boolean IsDefault  = null;
  protected boolean _IsDefaultSet = false;
  /** NET_ACTION_REF.is_internal field */
  public    Boolean IsInternal  = null;
  protected boolean _IsInternalSet = false;
  /** NET_ACTION_REF.config_tag_id field */
  public    String ConfigTagId  = null;
  protected boolean _ConfigTagIdSet = false;
  /** NET_INTERFACE_ACTIONS.net_interface_id field */
  public    Integer NetInterfaceId  = null;
  protected boolean _NetInterfaceIdSet = false;
  /** NET_INTERFACE_ACTIONS.net_action_id field */
  public    Integer NetActionId  = null;
  protected boolean _NetActionIdSet = false;
  /** NET_INTERFACE_ACTIONS.is_immediate field */
  public    Boolean IsImmediate  = null;
  protected boolean _IsImmediateSet = false;
  /** NET_INTERFACE_ACTIONS.cgi_url field */
  public    String CgiUrl  = null;
  protected boolean _CgiUrlSet = false;
  private String _objName = "NetActionObjectData";
  /** Default constructor */
  public NetActionObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public NetActionObjectData (NetActionObjectData other)
  {

    if (other == null) return;
    this.Key = new NetActionObjectKeyData (other.Key);
    this.IsDefault = other.IsDefault;
    this._IsDefaultSet = other._IsDefaultSet;
    this.IsInternal = other.IsInternal;
    this._IsInternalSet = other._IsInternalSet;
    this.ConfigTagId = other.ConfigTagId;
    this._ConfigTagIdSet = other._ConfigTagIdSet;
    this.NetInterfaceId = other.NetInterfaceId;
    this._NetInterfaceIdSet = other._NetInterfaceIdSet;
    this.NetActionId = other.NetActionId;
    this._NetActionIdSet = other._NetActionIdSet;
    this.IsImmediate = other.IsImmediate;
    this._IsImmediateSet = other._IsImmediateSet;
    this.CgiUrl = other.CgiUrl;
    this._CgiUrlSet = other._CgiUrlSet;
  }

  /** get the Key for this object
   * @return NetActionObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public NetActionObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (NetActionObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: RateClass (NET_INTERFACE_ELIGIBILITY.rate_class)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setRateClass (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RateClass", "setRateClass");
    }
    if (this.Key == null) this.Key = new NetActionObjectKeyData ();
    this.Key.RateClass = value;
    this.Key._RateClassSet = true;
  }
  /** get the value of the field: RateClass (NET_INTERFACE_ELIGIBILITY.rate_class)
   * @return Integer the value
   */
  public Integer getRateClass () {
    if (this.Key == null) return null;
    return this.Key.RateClass;
  }
  /** Change the field to not being actively set: RateClass (NET_INTERFACE_ELIGIBILITY.rate_class)
   */
  public void unsetRateClass () {
    if (this.Key == null) return;
    this.Key._RateClassSet = false;
  }
  /** See if the field is actively set: RateClass (NET_INTERFACE_ELIGIBILITY.rate_class)
   * @return boolean whether the field is actively set
   */
  public boolean issetRateClass () {
    if (this.Key == null) return false;
    return this.Key._RateClassSet;
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

  /** set the fields value: MktCode (NET_INTERFACE_ELIGIBILITY.mkt_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setMktCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "MktCode", "setMktCode");
    }
    if (this.Key == null) this.Key = new NetActionObjectKeyData ();
    this.Key.MktCode = value;
    this.Key._MktCodeSet = true;
  }
  /** get the value of the field: MktCode (NET_INTERFACE_ELIGIBILITY.mkt_code)
   * @return Integer the value
   */
  public Integer getMktCode () {
    if (this.Key == null) return null;
    return this.Key.MktCode;
  }
  /** Change the field to not being actively set: MktCode (NET_INTERFACE_ELIGIBILITY.mkt_code)
   */
  public void unsetMktCode () {
    if (this.Key == null) return;
    this.Key._MktCodeSet = false;
  }
  /** See if the field is actively set: MktCode (NET_INTERFACE_ELIGIBILITY.mkt_code)
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

  /** set the fields value: EmfConfigId (NET_INTERFACE_ELIGIBILITY.emf_config_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setEmfConfigId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "EmfConfigId", "setEmfConfigId");
    }
    if (this.Key == null) this.Key = new NetActionObjectKeyData ();
    this.Key.EmfConfigId = value;
    this.Key._EmfConfigIdSet = true;
  }
  /** get the value of the field: EmfConfigId (NET_INTERFACE_ELIGIBILITY.emf_config_id)
   * @return Integer the value
   */
  public Integer getEmfConfigId () {
    if (this.Key == null) return null;
    return this.Key.EmfConfigId;
  }
  /** Change the field to not being actively set: EmfConfigId (NET_INTERFACE_ELIGIBILITY.emf_config_id)
   */
  public void unsetEmfConfigId () {
    if (this.Key == null) return;
    this.Key._EmfConfigIdSet = false;
  }
  /** See if the field is actively set: EmfConfigId (NET_INTERFACE_ELIGIBILITY.emf_config_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetEmfConfigId () {
    if (this.Key == null) return false;
    return this.Key._EmfConfigIdSet;
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

  /** set the fields value: NetActionName (NET_ACTION_REF.net_action_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
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
    if (this.Key == null) this.Key = new NetActionObjectKeyData ();
    this.Key.NetActionName = value;
    this.Key._NetActionNameSet = true;
  }
  /** get the value of the field: NetActionName (NET_ACTION_REF.net_action_name)
   * @return String the value
   */
  public String getNetActionName () {
    if (this.Key == null) return null;
    return this.Key.NetActionName;
  }
  /** Change the field to not being actively set: NetActionName (NET_ACTION_REF.net_action_name)
   */
  public void unsetNetActionName () {
    if (this.Key == null) return;
    this.Key._NetActionNameSet = false;
  }
  /** See if the field is actively set: NetActionName (NET_ACTION_REF.net_action_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetNetActionName () {
    if (this.Key == null) return false;
    return this.Key._NetActionNameSet;
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

  /** set the fields value: IsDefault (NET_ACTION_REF.is_default)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsDefault") 
  public void setIsDefault (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsDefault", "setIsDefault");
    }
    this.IsDefault = value;
    this._IsDefaultSet = true;
  }

  /** Retrieves the IsDefault field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsDefault field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsDefault field
   */
   public String getIsDefaultAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsDefaultAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsDefaultAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsDefault());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsDefault");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsDefaultAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsDefault field from a formatted string
   *
   * @param _value the IsDefault field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsDefault field
   */
   public void setIsDefaultFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsDefaultFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsDefault(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsDefault");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsDefaultFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsDefaultFromFormattedString");
   }

  /** get the value of the field: IsDefault (NET_ACTION_REF.is_default)
   * @return Boolean the value
   */
  public Boolean getIsDefault () {
    return this.IsDefault;
  }
  /** Change the field to not being actively set: IsDefault (NET_ACTION_REF.is_default)
   */
  public void unsetIsDefault () {
    this._IsDefaultSet = false;
  }
  /** See if the field is actively set: IsDefault (NET_ACTION_REF.is_default)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsDefault () {
    return this._IsDefaultSet;
  }
  /** set the fields value: IsInternal (NET_ACTION_REF.is_internal)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsInternal") 
  public void setIsInternal (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsInternal", "setIsInternal");
    }
    this.IsInternal = value;
    this._IsInternalSet = true;
  }

  /** Retrieves the IsInternal field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsInternal field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsInternal field
   */
   public String getIsInternalAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsInternalAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsInternalAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsInternal());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsInternal");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsInternalAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsInternal field from a formatted string
   *
   * @param _value the IsInternal field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsInternal field
   */
   public void setIsInternalFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsInternalFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsInternal(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsInternal");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsInternalFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsInternalFromFormattedString");
   }

  /** get the value of the field: IsInternal (NET_ACTION_REF.is_internal)
   * @return Boolean the value
   */
  public Boolean getIsInternal () {
    return this.IsInternal;
  }
  /** Change the field to not being actively set: IsInternal (NET_ACTION_REF.is_internal)
   */
  public void unsetIsInternal () {
    this._IsInternalSet = false;
  }
  /** See if the field is actively set: IsInternal (NET_ACTION_REF.is_internal)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsInternal () {
    return this._IsInternalSet;
  }
  /** set the fields value: ConfigTagId (NET_ACTION_REF.config_tag_id)
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

  /** get the value of the field: ConfigTagId (NET_ACTION_REF.config_tag_id)
   * @return String the value
   */
  public String getConfigTagId () {
    return this.ConfigTagId;
  }
  /** Change the field to not being actively set: ConfigTagId (NET_ACTION_REF.config_tag_id)
   */
  public void unsetConfigTagId () {
    this._ConfigTagIdSet = false;
  }
  /** See if the field is actively set: ConfigTagId (NET_ACTION_REF.config_tag_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetConfigTagId () {
    return this._ConfigTagIdSet;
  }
  /** set the fields value: NetInterfaceId (NET_INTERFACE_ACTIONS.net_interface_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("NetInterfaceId") 
  public void setNetInterfaceId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "NetInterfaceId", "setNetInterfaceId");
    }
    this.NetInterfaceId = value;
    this._NetInterfaceIdSet = true;
  }

  /** Retrieves the NetInterfaceId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The NetInterfaceId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NetInterfaceId field
   */
   public String getNetInterfaceIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNetInterfaceIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNetInterfaceIdAsFormattedString");
       return fmtMgr.formatNumber(this.getNetInterfaceId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NetInterfaceId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getNetInterfaceIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the NetInterfaceId field from a formatted string
   *
   * @param _value the NetInterfaceId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NetInterfaceId field
   */
   public void setNetInterfaceIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNetInterfaceIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setNetInterfaceId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NetInterfaceId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setNetInterfaceIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNetInterfaceIdFromFormattedString");
   }

  /** get the value of the field: NetInterfaceId (NET_INTERFACE_ACTIONS.net_interface_id)
   * @return Integer the value
   */
  public Integer getNetInterfaceId () {
    return this.NetInterfaceId;
  }
  /** Change the field to not being actively set: NetInterfaceId (NET_INTERFACE_ACTIONS.net_interface_id)
   */
  public void unsetNetInterfaceId () {
    this._NetInterfaceIdSet = false;
  }
  /** See if the field is actively set: NetInterfaceId (NET_INTERFACE_ACTIONS.net_interface_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetNetInterfaceId () {
    return this._NetInterfaceIdSet;
  }
  /** set the fields value: NetActionId (NET_INTERFACE_ACTIONS.net_action_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("NetActionId") 
  public void setNetActionId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "NetActionId", "setNetActionId");
    }
    this.NetActionId = value;
    this._NetActionIdSet = true;
  }

  /** Retrieves the NetActionId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The NetActionId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NetActionId field
   */
   public String getNetActionIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNetActionIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNetActionIdAsFormattedString");
       return fmtMgr.formatNumber(this.getNetActionId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NetActionId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getNetActionIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the NetActionId field from a formatted string
   *
   * @param _value the NetActionId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NetActionId field
   */
   public void setNetActionIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNetActionIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setNetActionId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NetActionId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setNetActionIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNetActionIdFromFormattedString");
   }

  /** get the value of the field: NetActionId (NET_INTERFACE_ACTIONS.net_action_id)
   * @return Integer the value
   */
  public Integer getNetActionId () {
    return this.NetActionId;
  }
  /** Change the field to not being actively set: NetActionId (NET_INTERFACE_ACTIONS.net_action_id)
   */
  public void unsetNetActionId () {
    this._NetActionIdSet = false;
  }
  /** See if the field is actively set: NetActionId (NET_INTERFACE_ACTIONS.net_action_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetNetActionId () {
    return this._NetActionIdSet;
  }
  /** set the fields value: IsImmediate (NET_INTERFACE_ACTIONS.is_immediate)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsImmediate") 
  public void setIsImmediate (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsImmediate", "setIsImmediate");
    }
    this.IsImmediate = value;
    this._IsImmediateSet = true;
  }

  /** Retrieves the IsImmediate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsImmediate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsImmediate field
   */
   public String getIsImmediateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsImmediateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsImmediateAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsImmediate());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsImmediate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsImmediateAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsImmediate field from a formatted string
   *
   * @param _value the IsImmediate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsImmediate field
   */
   public void setIsImmediateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsImmediateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsImmediate(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsImmediate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsImmediateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsImmediateFromFormattedString");
   }

  /** get the value of the field: IsImmediate (NET_INTERFACE_ACTIONS.is_immediate)
   * @return Boolean the value
   */
  public Boolean getIsImmediate () {
    return this.IsImmediate;
  }
  /** Change the field to not being actively set: IsImmediate (NET_INTERFACE_ACTIONS.is_immediate)
   */
  public void unsetIsImmediate () {
    this._IsImmediateSet = false;
  }
  /** See if the field is actively set: IsImmediate (NET_INTERFACE_ACTIONS.is_immediate)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsImmediate () {
    return this._IsImmediateSet;
  }
  /** set the fields value: CgiUrl (NET_INTERFACE_ACTIONS.cgi_url)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CgiUrl") 
  public void setCgiUrl (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CgiUrl", "setCgiUrl");
    }
    if (value != null && !DataHelper.validLength (value, 255))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CgiUrl", "setCgiUrl");
    }
    this.CgiUrl = value;
    this._CgiUrlSet = true;
  }

  /** Retrieves the CgiUrl field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CgiUrl field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CgiUrl field
   */
   public String getCgiUrlAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCgiUrlAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCgiUrlAsFormattedString");
       return fmtMgr.formatString(this.getCgiUrl());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CgiUrl");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCgiUrlAsFormattedString");
       throw x;
     }
   }
  /** Sets the CgiUrl field from a formatted string
   *
   * @param _value the CgiUrl field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CgiUrl field
   */
   public void setCgiUrlFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCgiUrlFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCgiUrl(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CgiUrl");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCgiUrlFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCgiUrlFromFormattedString");
   }

  /** get the value of the field: CgiUrl (NET_INTERFACE_ACTIONS.cgi_url)
   * @return String the value
   */
  public String getCgiUrl () {
    return this.CgiUrl;
  }
  /** Change the field to not being actively set: CgiUrl (NET_INTERFACE_ACTIONS.cgi_url)
   */
  public void unsetCgiUrl () {
    this._CgiUrlSet = false;
  }
  /** See if the field is actively set: CgiUrl (NET_INTERFACE_ACTIONS.cgi_url)
   * @return boolean whether the field is actively set
   */
  public boolean issetCgiUrl () {
    return this._CgiUrlSet;
  }
  public String toString() {
    return NetActionObjectHelper.toMap(this, null).toString();
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
  /** NET_ACTION_REF.is_default field */
    if(!nonNullOnly || (IsDefault != null))  _IsDefaultSet = flag;
  /** NET_ACTION_REF.is_internal field */
    if(!nonNullOnly || (IsInternal != null))  _IsInternalSet = flag;
  /** NET_ACTION_REF.config_tag_id field */
    if(!nonNullOnly || (ConfigTagId != null))  _ConfigTagIdSet = flag;
  /** NET_INTERFACE_ACTIONS.net_interface_id field */
    if(!nonNullOnly || (NetInterfaceId != null))  _NetInterfaceIdSet = flag;
  /** NET_INTERFACE_ACTIONS.net_action_id field */
    if(!nonNullOnly || (NetActionId != null))  _NetActionIdSet = flag;
  /** NET_INTERFACE_ACTIONS.is_immediate field */
    if(!nonNullOnly || (IsImmediate != null))  _IsImmediateSet = flag;
  /** NET_INTERFACE_ACTIONS.cgi_url field */
    if(!nonNullOnly || (CgiUrl != null))  _CgiUrlSet = flag;
  }
}
