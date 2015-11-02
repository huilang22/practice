/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: SecurityAciObjectData.java
 * Definition File: Admin/SecurityAci.xml
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
  
/** SecurityAciObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class SecurityAciObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public SecurityAciObjectKeyData Key = null;
  /** SEC_ACI.aci_name field */
  public    String AciName  = null;
  protected boolean _AciNameSet = false;
  /** SEC_ACI.aci_res_id field */
  public    BigInteger AciResId  = null;
  protected boolean _AciResIdSet = false;
  /** SEC_ACI.aci_role_id field */
  public    BigInteger AciRoleId  = null;
  protected boolean _AciRoleIdSet = false;
  /** SEC_ACI.aci_update_count field */
  public    BigInteger AciUpdateCount  = null;
  protected boolean _AciUpdateCountSet = false;
  /** SEC_ACI.aci_create_date field */
  public    Date AciCreateDate  = null;
  protected boolean _AciCreateDateSet = false;
  /** SEC_ACI.aci_modify_date field */
  public    Date AciModifyDate  = null;
  protected boolean _AciModifyDateSet = false;
  /** SEC_ACI.aci_modify_user field */
  public    String AciModifyUser  = null;
  protected boolean _AciModifyUserSet = false;
  /** SEC_FX_RESOURCE.res_id field */
  public    BigInteger ResId  = null;
  protected boolean _ResIdSet = false;
  /** SEC_FX_RESOURCE.res_name field */
  public    String ResName  = null;
  protected boolean _ResNameSet = false;
  /** SEC_FX_RESOURCE.res_sub_id field */
  public    BigInteger ResSubId  = null;
  protected boolean _ResSubIdSet = false;
  /** SEC_FX_RESOURCE.res_rty_id field */
  public    BigInteger ResRtyId  = null;
  protected boolean _ResRtyIdSet = false;
  /** SEC_FX_RESOURCE.res_mr_id field */
  public    BigInteger ResMrId  = null;
  protected boolean _ResMrIdSet = false;
  /** SEC_FX_RESOURCE.res_update_count field */
  public    BigInteger ResUpdateCount  = null;
  protected boolean _ResUpdateCountSet = false;
  /** SEC_FX_RESOURCE.res_create_date field */
  public    Date ResCreateDate  = null;
  protected boolean _ResCreateDateSet = false;
  /** SEC_FX_RESOURCE.res_modify_date field */
  public    Date ResModifyDate  = null;
  protected boolean _ResModifyDateSet = false;
  /** SEC_FX_RESOURCE.res_modify_user field */
  public    String ResModifyUser  = null;
  protected boolean _ResModifyUserSet = false;
  /** SEC_FX_ROLE_VALUES.frv_role_id field */
  public    BigInteger FrvRoleId  = null;
  protected boolean _FrvRoleIdSet = false;
  /** SEC_FX_ROLE_VALUES.frv_language_code field */
  public    Integer FrvLanguageCode  = null;
  protected boolean _FrvLanguageCodeSet = false;
  /** SEC_FX_ROLE_VALUES.frv_short_display field */
  public    String FrvShortDisplay  = null;
  protected boolean _FrvShortDisplaySet = false;
  /** SEC_FX_ROLE_VALUES.frv_display_value field */
  public    String FrvDisplayValue  = null;
  protected boolean _FrvDisplayValueSet = false;
  /** SEC_FX_ROLE_VALUES.frv_update_count field */
  public    BigInteger FrvUpdateCount  = null;
  protected boolean _FrvUpdateCountSet = false;
  /** SEC_FX_ROLE_VALUES.frv_create_date field */
  public    Date FrvCreateDate  = null;
  protected boolean _FrvCreateDateSet = false;
  /** SEC_FX_ROLE_VALUES.frv_modify_date field */
  public    Date FrvModifyDate  = null;
  protected boolean _FrvModifyDateSet = false;
  /** SEC_FX_ROLE_VALUES.frv_modify_user field */
  public    String FrvModifyUser  = null;
  protected boolean _FrvModifyUserSet = false;
  private String _objName = "SecurityAciObjectData";
  /** Default constructor */
  public SecurityAciObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public SecurityAciObjectData (SecurityAciObjectData other)
  {

    if (other == null) return;
    this.Key = new SecurityAciObjectKeyData (other.Key);
    this.AciName = other.AciName;
    this._AciNameSet = other._AciNameSet;
    this.AciResId = other.AciResId;
    this._AciResIdSet = other._AciResIdSet;
    this.AciRoleId = other.AciRoleId;
    this._AciRoleIdSet = other._AciRoleIdSet;
    this.AciUpdateCount = other.AciUpdateCount;
    this._AciUpdateCountSet = other._AciUpdateCountSet;
    this.AciCreateDate = other.AciCreateDate;
    this._AciCreateDateSet = other._AciCreateDateSet;
    this.AciModifyDate = other.AciModifyDate;
    this._AciModifyDateSet = other._AciModifyDateSet;
    this.AciModifyUser = other.AciModifyUser;
    this._AciModifyUserSet = other._AciModifyUserSet;
    this.ResId = other.ResId;
    this._ResIdSet = other._ResIdSet;
    this.ResName = other.ResName;
    this._ResNameSet = other._ResNameSet;
    this.ResSubId = other.ResSubId;
    this._ResSubIdSet = other._ResSubIdSet;
    this.ResRtyId = other.ResRtyId;
    this._ResRtyIdSet = other._ResRtyIdSet;
    this.ResMrId = other.ResMrId;
    this._ResMrIdSet = other._ResMrIdSet;
    this.ResUpdateCount = other.ResUpdateCount;
    this._ResUpdateCountSet = other._ResUpdateCountSet;
    this.ResCreateDate = other.ResCreateDate;
    this._ResCreateDateSet = other._ResCreateDateSet;
    this.ResModifyDate = other.ResModifyDate;
    this._ResModifyDateSet = other._ResModifyDateSet;
    this.ResModifyUser = other.ResModifyUser;
    this._ResModifyUserSet = other._ResModifyUserSet;
    this.FrvRoleId = other.FrvRoleId;
    this._FrvRoleIdSet = other._FrvRoleIdSet;
    this.FrvLanguageCode = other.FrvLanguageCode;
    this._FrvLanguageCodeSet = other._FrvLanguageCodeSet;
    this.FrvShortDisplay = other.FrvShortDisplay;
    this._FrvShortDisplaySet = other._FrvShortDisplaySet;
    this.FrvDisplayValue = other.FrvDisplayValue;
    this._FrvDisplayValueSet = other._FrvDisplayValueSet;
    this.FrvUpdateCount = other.FrvUpdateCount;
    this._FrvUpdateCountSet = other._FrvUpdateCountSet;
    this.FrvCreateDate = other.FrvCreateDate;
    this._FrvCreateDateSet = other._FrvCreateDateSet;
    this.FrvModifyDate = other.FrvModifyDate;
    this._FrvModifyDateSet = other._FrvModifyDateSet;
    this.FrvModifyUser = other.FrvModifyUser;
    this._FrvModifyUserSet = other._FrvModifyUserSet;
  }

  /** get the Key for this object
   * @return SecurityAciObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public SecurityAciObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (SecurityAciObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: AciId (SEC_ACI.aci_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setAciId (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AciId", "setAciId");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AciId", "setAciId");
    }
    if (this.Key == null) this.Key = new SecurityAciObjectKeyData ();
    this.Key.AciId = value;
    this.Key._AciIdSet = true;
  }
  /** get the value of the field: AciId (SEC_ACI.aci_id)
   * @return BigInteger the value
   */
  public BigInteger getAciId () {
    if (this.Key == null) return null;
    return this.Key.AciId;
  }
  /** Change the field to not being actively set: AciId (SEC_ACI.aci_id)
   */
  public void unsetAciId () {
    if (this.Key == null) return;
    this.Key._AciIdSet = false;
  }
  /** See if the field is actively set: AciId (SEC_ACI.aci_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetAciId () {
    if (this.Key == null) return false;
    return this.Key._AciIdSet;
  }

  /** Retrieves the AciId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AciId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AciId field
   */
   public String getAciIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAciIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAciIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getAciId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AciId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAciIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the AciId field from a formatted string
   *
   * @param _value the AciId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AciId field
   */
   public void setAciIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAciIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAciId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AciId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAciIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAciIdFromFormattedString");
   }

  /** set the fields value: AciName (SEC_ACI.aci_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AciName") 
  public void setAciName (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AciName", "setAciName");
    }
    if (value != null && !DataHelper.validLength (value, 200))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AciName", "setAciName");
    }
    this.AciName = value;
    this._AciNameSet = true;
  }

  /** Retrieves the AciName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AciName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AciName field
   */
   public String getAciNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAciNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAciNameAsFormattedString");
       return fmtMgr.formatString(this.getAciName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AciName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAciNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the AciName field from a formatted string
   *
   * @param _value the AciName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AciName field
   */
   public void setAciNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAciNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAciName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AciName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAciNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAciNameFromFormattedString");
   }

  /** get the value of the field: AciName (SEC_ACI.aci_name)
   * @return String the value
   */
  public String getAciName () {
    return this.AciName;
  }
  /** Change the field to not being actively set: AciName (SEC_ACI.aci_name)
   */
  public void unsetAciName () {
    this._AciNameSet = false;
  }
  /** See if the field is actively set: AciName (SEC_ACI.aci_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetAciName () {
    return this._AciNameSet;
  }
  /** set the fields value: AciResId (SEC_ACI.aci_res_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AciResId") 
  public void setAciResId (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AciResId", "setAciResId");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AciResId", "setAciResId");
    }
    this.AciResId = value;
    this._AciResIdSet = true;
  }

  /** Retrieves the AciResId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AciResId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AciResId field
   */
   public String getAciResIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAciResIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAciResIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getAciResId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AciResId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAciResIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the AciResId field from a formatted string
   *
   * @param _value the AciResId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AciResId field
   */
   public void setAciResIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAciResIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAciResId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AciResId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAciResIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAciResIdFromFormattedString");
   }

  /** get the value of the field: AciResId (SEC_ACI.aci_res_id)
   * @return BigInteger the value
   */
  public BigInteger getAciResId () {
    return this.AciResId;
  }
  /** Change the field to not being actively set: AciResId (SEC_ACI.aci_res_id)
   */
  public void unsetAciResId () {
    this._AciResIdSet = false;
  }
  /** See if the field is actively set: AciResId (SEC_ACI.aci_res_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetAciResId () {
    return this._AciResIdSet;
  }
  /** set the fields value: AciRoleId (SEC_ACI.aci_role_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AciRoleId") 
  public void setAciRoleId (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AciRoleId", "setAciRoleId");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AciRoleId", "setAciRoleId");
    }
    this.AciRoleId = value;
    this._AciRoleIdSet = true;
  }

  /** Retrieves the AciRoleId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AciRoleId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AciRoleId field
   */
   public String getAciRoleIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAciRoleIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAciRoleIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getAciRoleId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AciRoleId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAciRoleIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the AciRoleId field from a formatted string
   *
   * @param _value the AciRoleId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AciRoleId field
   */
   public void setAciRoleIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAciRoleIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAciRoleId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AciRoleId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAciRoleIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAciRoleIdFromFormattedString");
   }

  /** get the value of the field: AciRoleId (SEC_ACI.aci_role_id)
   * @return BigInteger the value
   */
  public BigInteger getAciRoleId () {
    return this.AciRoleId;
  }
  /** Change the field to not being actively set: AciRoleId (SEC_ACI.aci_role_id)
   */
  public void unsetAciRoleId () {
    this._AciRoleIdSet = false;
  }
  /** See if the field is actively set: AciRoleId (SEC_ACI.aci_role_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetAciRoleId () {
    return this._AciRoleIdSet;
  }
  /** set the fields value: AciUpdateCount (SEC_ACI.aci_update_count)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AciUpdateCount") 
  public void setAciUpdateCount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AciUpdateCount", "setAciUpdateCount");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AciUpdateCount", "setAciUpdateCount");
    }
    this.AciUpdateCount = value;
    this._AciUpdateCountSet = true;
  }

  /** Retrieves the AciUpdateCount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AciUpdateCount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AciUpdateCount field
   */
   public String getAciUpdateCountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAciUpdateCountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAciUpdateCountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getAciUpdateCount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AciUpdateCount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAciUpdateCountAsFormattedString");
       throw x;
     }
   }
  /** Sets the AciUpdateCount field from a formatted string
   *
   * @param _value the AciUpdateCount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AciUpdateCount field
   */
   public void setAciUpdateCountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAciUpdateCountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAciUpdateCount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AciUpdateCount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAciUpdateCountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAciUpdateCountFromFormattedString");
   }

  /** get the value of the field: AciUpdateCount (SEC_ACI.aci_update_count)
   * @return BigInteger the value
   */
  public BigInteger getAciUpdateCount () {
    return this.AciUpdateCount;
  }
  /** Change the field to not being actively set: AciUpdateCount (SEC_ACI.aci_update_count)
   */
  public void unsetAciUpdateCount () {
    this._AciUpdateCountSet = false;
  }
  /** See if the field is actively set: AciUpdateCount (SEC_ACI.aci_update_count)
   * @return boolean whether the field is actively set
   */
  public boolean issetAciUpdateCount () {
    return this._AciUpdateCountSet;
  }
  /** set the fields value: AciCreateDate (SEC_ACI.aci_create_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AciCreateDate") 
  public void setAciCreateDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AciCreateDate", "setAciCreateDate");
    }
    this.AciCreateDate = value;
    this._AciCreateDateSet = true;
  }

  /** Retrieves the AciCreateDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AciCreateDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AciCreateDate field
   */
   public String getAciCreateDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAciCreateDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAciCreateDateAsFormattedString");
       return fmtMgr.formatDate(this.getAciCreateDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AciCreateDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAciCreateDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the AciCreateDate field from a formatted string
   *
   * @param _value the AciCreateDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AciCreateDate field
   */
   public void setAciCreateDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAciCreateDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAciCreateDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AciCreateDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAciCreateDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAciCreateDateFromFormattedString");
   }

  /**
   * Retrieves the AciCreateDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AciCreateDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the AciCreateDate field
   */
  public String getAciCreateDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAciCreateDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAciCreateDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getAciCreateDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AciCreateDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAciCreateDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the AciCreateDate field value from a formatted date/time string
   *
   * @param _value the AciCreateDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AciCreateDate field
   */
  public void setAciCreateDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAciCreateDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setAciCreateDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AciCreateDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAciCreateDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: AciCreateDate (SEC_ACI.aci_create_date)
   * @return Date the value
   */
  public Date getAciCreateDate () {
    return this.AciCreateDate;
  }
  /** Change the field to not being actively set: AciCreateDate (SEC_ACI.aci_create_date)
   */
  public void unsetAciCreateDate () {
    this._AciCreateDateSet = false;
  }
  /** See if the field is actively set: AciCreateDate (SEC_ACI.aci_create_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetAciCreateDate () {
    return this._AciCreateDateSet;
  }
  /** set the fields value: AciModifyDate (SEC_ACI.aci_modify_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AciModifyDate") 
  public void setAciModifyDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AciModifyDate", "setAciModifyDate");
    }
    this.AciModifyDate = value;
    this._AciModifyDateSet = true;
  }

  /** Retrieves the AciModifyDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AciModifyDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AciModifyDate field
   */
   public String getAciModifyDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAciModifyDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAciModifyDateAsFormattedString");
       return fmtMgr.formatDate(this.getAciModifyDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AciModifyDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAciModifyDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the AciModifyDate field from a formatted string
   *
   * @param _value the AciModifyDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AciModifyDate field
   */
   public void setAciModifyDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAciModifyDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAciModifyDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AciModifyDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAciModifyDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAciModifyDateFromFormattedString");
   }

  /**
   * Retrieves the AciModifyDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AciModifyDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the AciModifyDate field
   */
  public String getAciModifyDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAciModifyDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAciModifyDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getAciModifyDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AciModifyDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAciModifyDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the AciModifyDate field value from a formatted date/time string
   *
   * @param _value the AciModifyDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AciModifyDate field
   */
  public void setAciModifyDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAciModifyDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setAciModifyDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AciModifyDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAciModifyDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: AciModifyDate (SEC_ACI.aci_modify_date)
   * @return Date the value
   */
  public Date getAciModifyDate () {
    return this.AciModifyDate;
  }
  /** Change the field to not being actively set: AciModifyDate (SEC_ACI.aci_modify_date)
   */
  public void unsetAciModifyDate () {
    this._AciModifyDateSet = false;
  }
  /** See if the field is actively set: AciModifyDate (SEC_ACI.aci_modify_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetAciModifyDate () {
    return this._AciModifyDateSet;
  }
  /** set the fields value: AciModifyUser (SEC_ACI.aci_modify_user)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AciModifyUser") 
  public void setAciModifyUser (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AciModifyUser", "setAciModifyUser");
    }
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AciModifyUser", "setAciModifyUser");
    }
    this.AciModifyUser = value;
    this._AciModifyUserSet = true;
  }

  /** Retrieves the AciModifyUser field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AciModifyUser field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AciModifyUser field
   */
   public String getAciModifyUserAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAciModifyUserAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAciModifyUserAsFormattedString");
       return fmtMgr.formatString(this.getAciModifyUser());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AciModifyUser");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAciModifyUserAsFormattedString");
       throw x;
     }
   }
  /** Sets the AciModifyUser field from a formatted string
   *
   * @param _value the AciModifyUser field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AciModifyUser field
   */
   public void setAciModifyUserFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAciModifyUserFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAciModifyUser(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AciModifyUser");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAciModifyUserFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAciModifyUserFromFormattedString");
   }

  /** get the value of the field: AciModifyUser (SEC_ACI.aci_modify_user)
   * @return String the value
   */
  public String getAciModifyUser () {
    return this.AciModifyUser;
  }
  /** Change the field to not being actively set: AciModifyUser (SEC_ACI.aci_modify_user)
   */
  public void unsetAciModifyUser () {
    this._AciModifyUserSet = false;
  }
  /** See if the field is actively set: AciModifyUser (SEC_ACI.aci_modify_user)
   * @return boolean whether the field is actively set
   */
  public boolean issetAciModifyUser () {
    return this._AciModifyUserSet;
  }
  /** set the fields value: ResId (SEC_FX_RESOURCE.res_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ResId") 
  public void setResId (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ResId", "setResId");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ResId", "setResId");
    }
    this.ResId = value;
    this._ResIdSet = true;
  }

  /** Retrieves the ResId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ResId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ResId field
   */
   public String getResIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getResIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getResId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ResId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getResIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ResId field from a formatted string
   *
   * @param _value the ResId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ResId field
   */
   public void setResIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setResId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ResId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setResIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setResIdFromFormattedString");
   }

  /** get the value of the field: ResId (SEC_FX_RESOURCE.res_id)
   * @return BigInteger the value
   */
  public BigInteger getResId () {
    return this.ResId;
  }
  /** Change the field to not being actively set: ResId (SEC_FX_RESOURCE.res_id)
   */
  public void unsetResId () {
    this._ResIdSet = false;
  }
  /** See if the field is actively set: ResId (SEC_FX_RESOURCE.res_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetResId () {
    return this._ResIdSet;
  }
  /** set the fields value: ResName (SEC_FX_RESOURCE.res_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ResName") 
  public void setResName (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ResName", "setResName");
    }
    if (value != null && !DataHelper.validLength (value, 200))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ResName", "setResName");
    }
    this.ResName = value;
    this._ResNameSet = true;
  }

  /** Retrieves the ResName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ResName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ResName field
   */
   public String getResNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getResNameAsFormattedString");
       return fmtMgr.formatString(this.getResName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ResName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getResNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the ResName field from a formatted string
   *
   * @param _value the ResName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ResName field
   */
   public void setResNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setResName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ResName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setResNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setResNameFromFormattedString");
   }

  /** get the value of the field: ResName (SEC_FX_RESOURCE.res_name)
   * @return String the value
   */
  public String getResName () {
    return this.ResName;
  }
  /** Change the field to not being actively set: ResName (SEC_FX_RESOURCE.res_name)
   */
  public void unsetResName () {
    this._ResNameSet = false;
  }
  /** See if the field is actively set: ResName (SEC_FX_RESOURCE.res_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetResName () {
    return this._ResNameSet;
  }
  /** set the fields value: ResSubId (SEC_FX_RESOURCE.res_sub_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ResSubId") 
  public void setResSubId (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ResSubId", "setResSubId");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ResSubId", "setResSubId");
    }
    this.ResSubId = value;
    this._ResSubIdSet = true;
  }

  /** Retrieves the ResSubId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ResSubId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ResSubId field
   */
   public String getResSubIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResSubIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getResSubIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getResSubId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ResSubId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getResSubIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ResSubId field from a formatted string
   *
   * @param _value the ResSubId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ResSubId field
   */
   public void setResSubIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResSubIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setResSubId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ResSubId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setResSubIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setResSubIdFromFormattedString");
   }

  /** get the value of the field: ResSubId (SEC_FX_RESOURCE.res_sub_id)
   * @return BigInteger the value
   */
  public BigInteger getResSubId () {
    return this.ResSubId;
  }
  /** Change the field to not being actively set: ResSubId (SEC_FX_RESOURCE.res_sub_id)
   */
  public void unsetResSubId () {
    this._ResSubIdSet = false;
  }
  /** See if the field is actively set: ResSubId (SEC_FX_RESOURCE.res_sub_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetResSubId () {
    return this._ResSubIdSet;
  }
  /** set the fields value: ResRtyId (SEC_FX_RESOURCE.res_rty_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ResRtyId") 
  public void setResRtyId (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ResRtyId", "setResRtyId");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ResRtyId", "setResRtyId");
    }
    this.ResRtyId = value;
    this._ResRtyIdSet = true;
  }

  /** Retrieves the ResRtyId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ResRtyId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ResRtyId field
   */
   public String getResRtyIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResRtyIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getResRtyIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getResRtyId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ResRtyId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getResRtyIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ResRtyId field from a formatted string
   *
   * @param _value the ResRtyId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ResRtyId field
   */
   public void setResRtyIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResRtyIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setResRtyId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ResRtyId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setResRtyIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setResRtyIdFromFormattedString");
   }

  /** get the value of the field: ResRtyId (SEC_FX_RESOURCE.res_rty_id)
   * @return BigInteger the value
   */
  public BigInteger getResRtyId () {
    return this.ResRtyId;
  }
  /** Change the field to not being actively set: ResRtyId (SEC_FX_RESOURCE.res_rty_id)
   */
  public void unsetResRtyId () {
    this._ResRtyIdSet = false;
  }
  /** See if the field is actively set: ResRtyId (SEC_FX_RESOURCE.res_rty_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetResRtyId () {
    return this._ResRtyIdSet;
  }
  /** set the fields value: ResMrId (SEC_FX_RESOURCE.res_mr_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ResMrId") 
  public void setResMrId (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ResMrId", "setResMrId");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ResMrId", "setResMrId");
    }
    this.ResMrId = value;
    this._ResMrIdSet = true;
  }

  /** Retrieves the ResMrId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ResMrId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ResMrId field
   */
   public String getResMrIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResMrIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getResMrIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getResMrId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ResMrId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getResMrIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ResMrId field from a formatted string
   *
   * @param _value the ResMrId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ResMrId field
   */
   public void setResMrIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResMrIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setResMrId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ResMrId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setResMrIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setResMrIdFromFormattedString");
   }

  /** get the value of the field: ResMrId (SEC_FX_RESOURCE.res_mr_id)
   * @return BigInteger the value
   */
  public BigInteger getResMrId () {
    return this.ResMrId;
  }
  /** Change the field to not being actively set: ResMrId (SEC_FX_RESOURCE.res_mr_id)
   */
  public void unsetResMrId () {
    this._ResMrIdSet = false;
  }
  /** See if the field is actively set: ResMrId (SEC_FX_RESOURCE.res_mr_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetResMrId () {
    return this._ResMrIdSet;
  }
  /** set the fields value: ResUpdateCount (SEC_FX_RESOURCE.res_update_count)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ResUpdateCount") 
  public void setResUpdateCount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ResUpdateCount", "setResUpdateCount");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ResUpdateCount", "setResUpdateCount");
    }
    this.ResUpdateCount = value;
    this._ResUpdateCountSet = true;
  }

  /** Retrieves the ResUpdateCount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ResUpdateCount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ResUpdateCount field
   */
   public String getResUpdateCountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResUpdateCountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getResUpdateCountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getResUpdateCount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ResUpdateCount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getResUpdateCountAsFormattedString");
       throw x;
     }
   }
  /** Sets the ResUpdateCount field from a formatted string
   *
   * @param _value the ResUpdateCount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ResUpdateCount field
   */
   public void setResUpdateCountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResUpdateCountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setResUpdateCount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ResUpdateCount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setResUpdateCountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setResUpdateCountFromFormattedString");
   }

  /** get the value of the field: ResUpdateCount (SEC_FX_RESOURCE.res_update_count)
   * @return BigInteger the value
   */
  public BigInteger getResUpdateCount () {
    return this.ResUpdateCount;
  }
  /** Change the field to not being actively set: ResUpdateCount (SEC_FX_RESOURCE.res_update_count)
   */
  public void unsetResUpdateCount () {
    this._ResUpdateCountSet = false;
  }
  /** See if the field is actively set: ResUpdateCount (SEC_FX_RESOURCE.res_update_count)
   * @return boolean whether the field is actively set
   */
  public boolean issetResUpdateCount () {
    return this._ResUpdateCountSet;
  }
  /** set the fields value: ResCreateDate (SEC_FX_RESOURCE.res_create_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ResCreateDate") 
  public void setResCreateDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ResCreateDate", "setResCreateDate");
    }
    this.ResCreateDate = value;
    this._ResCreateDateSet = true;
  }

  /** Retrieves the ResCreateDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ResCreateDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ResCreateDate field
   */
   public String getResCreateDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResCreateDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getResCreateDateAsFormattedString");
       return fmtMgr.formatDate(this.getResCreateDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ResCreateDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getResCreateDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the ResCreateDate field from a formatted string
   *
   * @param _value the ResCreateDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ResCreateDate field
   */
   public void setResCreateDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResCreateDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setResCreateDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ResCreateDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setResCreateDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setResCreateDateFromFormattedString");
   }

  /**
   * Retrieves the ResCreateDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ResCreateDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ResCreateDate field
   */
  public String getResCreateDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResCreateDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getResCreateDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getResCreateDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResCreateDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getResCreateDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ResCreateDate field value from a formatted date/time string
   *
   * @param _value the ResCreateDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ResCreateDate field
   */
  public void setResCreateDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setResCreateDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setResCreateDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResCreateDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setResCreateDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: ResCreateDate (SEC_FX_RESOURCE.res_create_date)
   * @return Date the value
   */
  public Date getResCreateDate () {
    return this.ResCreateDate;
  }
  /** Change the field to not being actively set: ResCreateDate (SEC_FX_RESOURCE.res_create_date)
   */
  public void unsetResCreateDate () {
    this._ResCreateDateSet = false;
  }
  /** See if the field is actively set: ResCreateDate (SEC_FX_RESOURCE.res_create_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetResCreateDate () {
    return this._ResCreateDateSet;
  }
  /** set the fields value: ResModifyDate (SEC_FX_RESOURCE.res_modify_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ResModifyDate") 
  public void setResModifyDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ResModifyDate", "setResModifyDate");
    }
    this.ResModifyDate = value;
    this._ResModifyDateSet = true;
  }

  /** Retrieves the ResModifyDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ResModifyDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ResModifyDate field
   */
   public String getResModifyDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResModifyDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getResModifyDateAsFormattedString");
       return fmtMgr.formatDate(this.getResModifyDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ResModifyDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getResModifyDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the ResModifyDate field from a formatted string
   *
   * @param _value the ResModifyDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ResModifyDate field
   */
   public void setResModifyDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResModifyDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setResModifyDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ResModifyDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setResModifyDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setResModifyDateFromFormattedString");
   }

  /**
   * Retrieves the ResModifyDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ResModifyDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ResModifyDate field
   */
  public String getResModifyDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResModifyDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getResModifyDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getResModifyDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResModifyDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getResModifyDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ResModifyDate field value from a formatted date/time string
   *
   * @param _value the ResModifyDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ResModifyDate field
   */
  public void setResModifyDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setResModifyDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setResModifyDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResModifyDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setResModifyDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: ResModifyDate (SEC_FX_RESOURCE.res_modify_date)
   * @return Date the value
   */
  public Date getResModifyDate () {
    return this.ResModifyDate;
  }
  /** Change the field to not being actively set: ResModifyDate (SEC_FX_RESOURCE.res_modify_date)
   */
  public void unsetResModifyDate () {
    this._ResModifyDateSet = false;
  }
  /** See if the field is actively set: ResModifyDate (SEC_FX_RESOURCE.res_modify_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetResModifyDate () {
    return this._ResModifyDateSet;
  }
  /** set the fields value: ResModifyUser (SEC_FX_RESOURCE.res_modify_user)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ResModifyUser") 
  public void setResModifyUser (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ResModifyUser", "setResModifyUser");
    }
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ResModifyUser", "setResModifyUser");
    }
    this.ResModifyUser = value;
    this._ResModifyUserSet = true;
  }

  /** Retrieves the ResModifyUser field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ResModifyUser field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ResModifyUser field
   */
   public String getResModifyUserAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResModifyUserAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getResModifyUserAsFormattedString");
       return fmtMgr.formatString(this.getResModifyUser());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ResModifyUser");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getResModifyUserAsFormattedString");
       throw x;
     }
   }
  /** Sets the ResModifyUser field from a formatted string
   *
   * @param _value the ResModifyUser field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ResModifyUser field
   */
   public void setResModifyUserFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResModifyUserFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setResModifyUser(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ResModifyUser");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setResModifyUserFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setResModifyUserFromFormattedString");
   }

  /** get the value of the field: ResModifyUser (SEC_FX_RESOURCE.res_modify_user)
   * @return String the value
   */
  public String getResModifyUser () {
    return this.ResModifyUser;
  }
  /** Change the field to not being actively set: ResModifyUser (SEC_FX_RESOURCE.res_modify_user)
   */
  public void unsetResModifyUser () {
    this._ResModifyUserSet = false;
  }
  /** See if the field is actively set: ResModifyUser (SEC_FX_RESOURCE.res_modify_user)
   * @return boolean whether the field is actively set
   */
  public boolean issetResModifyUser () {
    return this._ResModifyUserSet;
  }
  /** set the fields value: FrvRoleId (SEC_FX_ROLE_VALUES.frv_role_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FrvRoleId") 
  public void setFrvRoleId (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "FrvRoleId", "setFrvRoleId");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "FrvRoleId", "setFrvRoleId");
    }
    this.FrvRoleId = value;
    this._FrvRoleIdSet = true;
  }

  /** Retrieves the FrvRoleId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FrvRoleId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrvRoleId field
   */
   public String getFrvRoleIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvRoleIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrvRoleIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getFrvRoleId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrvRoleId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrvRoleIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the FrvRoleId field from a formatted string
   *
   * @param _value the FrvRoleId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FrvRoleId field
   */
   public void setFrvRoleIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvRoleIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFrvRoleId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrvRoleId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrvRoleIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrvRoleIdFromFormattedString");
   }

  /** get the value of the field: FrvRoleId (SEC_FX_ROLE_VALUES.frv_role_id)
   * @return BigInteger the value
   */
  public BigInteger getFrvRoleId () {
    return this.FrvRoleId;
  }
  /** Change the field to not being actively set: FrvRoleId (SEC_FX_ROLE_VALUES.frv_role_id)
   */
  public void unsetFrvRoleId () {
    this._FrvRoleIdSet = false;
  }
  /** See if the field is actively set: FrvRoleId (SEC_FX_ROLE_VALUES.frv_role_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetFrvRoleId () {
    return this._FrvRoleIdSet;
  }
  /** set the fields value: FrvLanguageCode (SEC_FX_ROLE_VALUES.frv_language_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FrvLanguageCode") 
  public void setFrvLanguageCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "FrvLanguageCode", "setFrvLanguageCode");
    }
    this.FrvLanguageCode = value;
    this._FrvLanguageCodeSet = true;
  }

  /** Retrieves the FrvLanguageCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FrvLanguageCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrvLanguageCode field
   */
   public String getFrvLanguageCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvLanguageCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrvLanguageCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getFrvLanguageCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrvLanguageCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrvLanguageCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the FrvLanguageCode field from a formatted string
   *
   * @param _value the FrvLanguageCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FrvLanguageCode field
   */
   public void setFrvLanguageCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvLanguageCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFrvLanguageCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrvLanguageCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrvLanguageCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrvLanguageCodeFromFormattedString");
   }

  /** get the value of the field: FrvLanguageCode (SEC_FX_ROLE_VALUES.frv_language_code)
   * @return Integer the value
   */
  public Integer getFrvLanguageCode () {
    return this.FrvLanguageCode;
  }
  /** Change the field to not being actively set: FrvLanguageCode (SEC_FX_ROLE_VALUES.frv_language_code)
   */
  public void unsetFrvLanguageCode () {
    this._FrvLanguageCodeSet = false;
  }
  /** See if the field is actively set: FrvLanguageCode (SEC_FX_ROLE_VALUES.frv_language_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetFrvLanguageCode () {
    return this._FrvLanguageCodeSet;
  }
  /** set the fields value: FrvShortDisplay (SEC_FX_ROLE_VALUES.frv_short_display)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FrvShortDisplay") 
  public void setFrvShortDisplay (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "FrvShortDisplay", "setFrvShortDisplay");
    }
    this.FrvShortDisplay = value;
    this._FrvShortDisplaySet = true;
  }

  /** Retrieves the FrvShortDisplay field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FrvShortDisplay field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrvShortDisplay field
   */
   public String getFrvShortDisplayAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvShortDisplayAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrvShortDisplayAsFormattedString");
       return fmtMgr.formatString(this.getFrvShortDisplay());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrvShortDisplay");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrvShortDisplayAsFormattedString");
       throw x;
     }
   }
  /** Sets the FrvShortDisplay field from a formatted string
   *
   * @param _value the FrvShortDisplay field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FrvShortDisplay field
   */
   public void setFrvShortDisplayFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvShortDisplayFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFrvShortDisplay(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrvShortDisplay");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrvShortDisplayFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrvShortDisplayFromFormattedString");
   }

  /** get the value of the field: FrvShortDisplay (SEC_FX_ROLE_VALUES.frv_short_display)
   * @return String the value
   */
  public String getFrvShortDisplay () {
    return this.FrvShortDisplay;
  }
  /** Change the field to not being actively set: FrvShortDisplay (SEC_FX_ROLE_VALUES.frv_short_display)
   */
  public void unsetFrvShortDisplay () {
    this._FrvShortDisplaySet = false;
  }
  /** See if the field is actively set: FrvShortDisplay (SEC_FX_ROLE_VALUES.frv_short_display)
   * @return boolean whether the field is actively set
   */
  public boolean issetFrvShortDisplay () {
    return this._FrvShortDisplaySet;
  }
  /** set the fields value: FrvDisplayValue (SEC_FX_ROLE_VALUES.frv_display_value)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FrvDisplayValue") 
  public void setFrvDisplayValue (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "FrvDisplayValue", "setFrvDisplayValue");
    }
    if (value != null && !DataHelper.validLength (value, 80))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "FrvDisplayValue", "setFrvDisplayValue");
    }
    this.FrvDisplayValue = value;
    this._FrvDisplayValueSet = true;
  }

  /** Retrieves the FrvDisplayValue field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FrvDisplayValue field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrvDisplayValue field
   */
   public String getFrvDisplayValueAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvDisplayValueAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrvDisplayValueAsFormattedString");
       return fmtMgr.formatString(this.getFrvDisplayValue());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrvDisplayValue");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrvDisplayValueAsFormattedString");
       throw x;
     }
   }
  /** Sets the FrvDisplayValue field from a formatted string
   *
   * @param _value the FrvDisplayValue field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FrvDisplayValue field
   */
   public void setFrvDisplayValueFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvDisplayValueFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFrvDisplayValue(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrvDisplayValue");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrvDisplayValueFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrvDisplayValueFromFormattedString");
   }

  /** get the value of the field: FrvDisplayValue (SEC_FX_ROLE_VALUES.frv_display_value)
   * @return String the value
   */
  public String getFrvDisplayValue () {
    return this.FrvDisplayValue;
  }
  /** Change the field to not being actively set: FrvDisplayValue (SEC_FX_ROLE_VALUES.frv_display_value)
   */
  public void unsetFrvDisplayValue () {
    this._FrvDisplayValueSet = false;
  }
  /** See if the field is actively set: FrvDisplayValue (SEC_FX_ROLE_VALUES.frv_display_value)
   * @return boolean whether the field is actively set
   */
  public boolean issetFrvDisplayValue () {
    return this._FrvDisplayValueSet;
  }
  /** set the fields value: FrvUpdateCount (SEC_FX_ROLE_VALUES.frv_update_count)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FrvUpdateCount") 
  public void setFrvUpdateCount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "FrvUpdateCount", "setFrvUpdateCount");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "FrvUpdateCount", "setFrvUpdateCount");
    }
    this.FrvUpdateCount = value;
    this._FrvUpdateCountSet = true;
  }

  /** Retrieves the FrvUpdateCount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FrvUpdateCount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrvUpdateCount field
   */
   public String getFrvUpdateCountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvUpdateCountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrvUpdateCountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getFrvUpdateCount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrvUpdateCount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrvUpdateCountAsFormattedString");
       throw x;
     }
   }
  /** Sets the FrvUpdateCount field from a formatted string
   *
   * @param _value the FrvUpdateCount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FrvUpdateCount field
   */
   public void setFrvUpdateCountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvUpdateCountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFrvUpdateCount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrvUpdateCount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrvUpdateCountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrvUpdateCountFromFormattedString");
   }

  /** get the value of the field: FrvUpdateCount (SEC_FX_ROLE_VALUES.frv_update_count)
   * @return BigInteger the value
   */
  public BigInteger getFrvUpdateCount () {
    return this.FrvUpdateCount;
  }
  /** Change the field to not being actively set: FrvUpdateCount (SEC_FX_ROLE_VALUES.frv_update_count)
   */
  public void unsetFrvUpdateCount () {
    this._FrvUpdateCountSet = false;
  }
  /** See if the field is actively set: FrvUpdateCount (SEC_FX_ROLE_VALUES.frv_update_count)
   * @return boolean whether the field is actively set
   */
  public boolean issetFrvUpdateCount () {
    return this._FrvUpdateCountSet;
  }
  /** set the fields value: FrvCreateDate (SEC_FX_ROLE_VALUES.frv_create_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FrvCreateDate") 
  public void setFrvCreateDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "FrvCreateDate", "setFrvCreateDate");
    }
    this.FrvCreateDate = value;
    this._FrvCreateDateSet = true;
  }

  /** Retrieves the FrvCreateDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FrvCreateDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrvCreateDate field
   */
   public String getFrvCreateDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvCreateDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrvCreateDateAsFormattedString");
       return fmtMgr.formatDate(this.getFrvCreateDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrvCreateDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrvCreateDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the FrvCreateDate field from a formatted string
   *
   * @param _value the FrvCreateDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FrvCreateDate field
   */
   public void setFrvCreateDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvCreateDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFrvCreateDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrvCreateDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrvCreateDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrvCreateDateFromFormattedString");
   }

  /**
   * Retrieves the FrvCreateDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FrvCreateDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrvCreateDate field
   */
  public String getFrvCreateDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvCreateDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrvCreateDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getFrvCreateDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrvCreateDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrvCreateDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the FrvCreateDate field value from a formatted date/time string
   *
   * @param _value the FrvCreateDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FrvCreateDate field
   */
  public void setFrvCreateDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFrvCreateDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setFrvCreateDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrvCreateDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrvCreateDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: FrvCreateDate (SEC_FX_ROLE_VALUES.frv_create_date)
   * @return Date the value
   */
  public Date getFrvCreateDate () {
    return this.FrvCreateDate;
  }
  /** Change the field to not being actively set: FrvCreateDate (SEC_FX_ROLE_VALUES.frv_create_date)
   */
  public void unsetFrvCreateDate () {
    this._FrvCreateDateSet = false;
  }
  /** See if the field is actively set: FrvCreateDate (SEC_FX_ROLE_VALUES.frv_create_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetFrvCreateDate () {
    return this._FrvCreateDateSet;
  }
  /** set the fields value: FrvModifyDate (SEC_FX_ROLE_VALUES.frv_modify_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FrvModifyDate") 
  public void setFrvModifyDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "FrvModifyDate", "setFrvModifyDate");
    }
    this.FrvModifyDate = value;
    this._FrvModifyDateSet = true;
  }

  /** Retrieves the FrvModifyDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FrvModifyDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrvModifyDate field
   */
   public String getFrvModifyDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvModifyDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrvModifyDateAsFormattedString");
       return fmtMgr.formatDate(this.getFrvModifyDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrvModifyDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrvModifyDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the FrvModifyDate field from a formatted string
   *
   * @param _value the FrvModifyDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FrvModifyDate field
   */
   public void setFrvModifyDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvModifyDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFrvModifyDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrvModifyDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrvModifyDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrvModifyDateFromFormattedString");
   }

  /**
   * Retrieves the FrvModifyDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FrvModifyDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrvModifyDate field
   */
  public String getFrvModifyDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvModifyDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrvModifyDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getFrvModifyDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrvModifyDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrvModifyDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the FrvModifyDate field value from a formatted date/time string
   *
   * @param _value the FrvModifyDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FrvModifyDate field
   */
  public void setFrvModifyDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFrvModifyDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setFrvModifyDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FrvModifyDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrvModifyDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: FrvModifyDate (SEC_FX_ROLE_VALUES.frv_modify_date)
   * @return Date the value
   */
  public Date getFrvModifyDate () {
    return this.FrvModifyDate;
  }
  /** Change the field to not being actively set: FrvModifyDate (SEC_FX_ROLE_VALUES.frv_modify_date)
   */
  public void unsetFrvModifyDate () {
    this._FrvModifyDateSet = false;
  }
  /** See if the field is actively set: FrvModifyDate (SEC_FX_ROLE_VALUES.frv_modify_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetFrvModifyDate () {
    return this._FrvModifyDateSet;
  }
  /** set the fields value: FrvModifyUser (SEC_FX_ROLE_VALUES.frv_modify_user)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FrvModifyUser") 
  public void setFrvModifyUser (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "FrvModifyUser", "setFrvModifyUser");
    }
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "FrvModifyUser", "setFrvModifyUser");
    }
    this.FrvModifyUser = value;
    this._FrvModifyUserSet = true;
  }

  /** Retrieves the FrvModifyUser field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FrvModifyUser field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrvModifyUser field
   */
   public String getFrvModifyUserAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvModifyUserAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrvModifyUserAsFormattedString");
       return fmtMgr.formatString(this.getFrvModifyUser());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrvModifyUser");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrvModifyUserAsFormattedString");
       throw x;
     }
   }
  /** Sets the FrvModifyUser field from a formatted string
   *
   * @param _value the FrvModifyUser field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FrvModifyUser field
   */
   public void setFrvModifyUserFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvModifyUserFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFrvModifyUser(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrvModifyUser");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrvModifyUserFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrvModifyUserFromFormattedString");
   }

  /** get the value of the field: FrvModifyUser (SEC_FX_ROLE_VALUES.frv_modify_user)
   * @return String the value
   */
  public String getFrvModifyUser () {
    return this.FrvModifyUser;
  }
  /** Change the field to not being actively set: FrvModifyUser (SEC_FX_ROLE_VALUES.frv_modify_user)
   */
  public void unsetFrvModifyUser () {
    this._FrvModifyUserSet = false;
  }
  /** See if the field is actively set: FrvModifyUser (SEC_FX_ROLE_VALUES.frv_modify_user)
   * @return boolean whether the field is actively set
   */
  public boolean issetFrvModifyUser () {
    return this._FrvModifyUserSet;
  }
  public String toString() {
    return SecurityAciObjectHelper.toMap(this, null).toString();
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
  /** SEC_ACI.aci_name field */
    if(!nonNullOnly || (AciName != null))  _AciNameSet = flag;
  /** SEC_ACI.aci_res_id field */
    if(!nonNullOnly || (AciResId != null))  _AciResIdSet = flag;
  /** SEC_ACI.aci_role_id field */
    if(!nonNullOnly || (AciRoleId != null))  _AciRoleIdSet = flag;
  /** SEC_ACI.aci_update_count field */
    if(!nonNullOnly || (AciUpdateCount != null))  _AciUpdateCountSet = flag;
  /** SEC_ACI.aci_create_date field */
    if(!nonNullOnly || (AciCreateDate != null))  _AciCreateDateSet = flag;
  /** SEC_ACI.aci_modify_date field */
    if(!nonNullOnly || (AciModifyDate != null))  _AciModifyDateSet = flag;
  /** SEC_ACI.aci_modify_user field */
    if(!nonNullOnly || (AciModifyUser != null))  _AciModifyUserSet = flag;
  /** SEC_FX_RESOURCE.res_id field */
    if(!nonNullOnly || (ResId != null))  _ResIdSet = flag;
  /** SEC_FX_RESOURCE.res_name field */
    if(!nonNullOnly || (ResName != null))  _ResNameSet = flag;
  /** SEC_FX_RESOURCE.res_sub_id field */
    if(!nonNullOnly || (ResSubId != null))  _ResSubIdSet = flag;
  /** SEC_FX_RESOURCE.res_rty_id field */
    if(!nonNullOnly || (ResRtyId != null))  _ResRtyIdSet = flag;
  /** SEC_FX_RESOURCE.res_mr_id field */
    if(!nonNullOnly || (ResMrId != null))  _ResMrIdSet = flag;
  /** SEC_FX_RESOURCE.res_update_count field */
    if(!nonNullOnly || (ResUpdateCount != null))  _ResUpdateCountSet = flag;
  /** SEC_FX_RESOURCE.res_create_date field */
    if(!nonNullOnly || (ResCreateDate != null))  _ResCreateDateSet = flag;
  /** SEC_FX_RESOURCE.res_modify_date field */
    if(!nonNullOnly || (ResModifyDate != null))  _ResModifyDateSet = flag;
  /** SEC_FX_RESOURCE.res_modify_user field */
    if(!nonNullOnly || (ResModifyUser != null))  _ResModifyUserSet = flag;
  /** SEC_FX_ROLE_VALUES.frv_role_id field */
    if(!nonNullOnly || (FrvRoleId != null))  _FrvRoleIdSet = flag;
  /** SEC_FX_ROLE_VALUES.frv_language_code field */
    if(!nonNullOnly || (FrvLanguageCode != null))  _FrvLanguageCodeSet = flag;
  /** SEC_FX_ROLE_VALUES.frv_short_display field */
    if(!nonNullOnly || (FrvShortDisplay != null))  _FrvShortDisplaySet = flag;
  /** SEC_FX_ROLE_VALUES.frv_display_value field */
    if(!nonNullOnly || (FrvDisplayValue != null))  _FrvDisplayValueSet = flag;
  /** SEC_FX_ROLE_VALUES.frv_update_count field */
    if(!nonNullOnly || (FrvUpdateCount != null))  _FrvUpdateCountSet = flag;
  /** SEC_FX_ROLE_VALUES.frv_create_date field */
    if(!nonNullOnly || (FrvCreateDate != null))  _FrvCreateDateSet = flag;
  /** SEC_FX_ROLE_VALUES.frv_modify_date field */
    if(!nonNullOnly || (FrvModifyDate != null))  _FrvModifyDateSet = flag;
  /** SEC_FX_ROLE_VALUES.frv_modify_user field */
    if(!nonNullOnly || (FrvModifyUser != null))  _FrvModifyUserSet = flag;
  }
}
