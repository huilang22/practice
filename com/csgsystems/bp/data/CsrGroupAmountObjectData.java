/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CsrGroupAmountObjectData.java
 * Definition File: Admin/CsrGroupAmount.xml
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
  
/** CsrGroupAmountObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class CsrGroupAmountObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public CsrGroupAmountObjectKeyData Key = null;
  /** GROUP_AMOUNT.max_amount field */
  public    BigInteger MaxAmount  = null;
  protected boolean _MaxAmountSet = false;
  /** GROUP_AMOUNT.config_tag_id field */
  public    String ConfigTagId  = null;
  protected boolean _ConfigTagIdSet = false;
  private String _objName = "CsrGroupAmountObjectData";
  /** Default constructor */
  public CsrGroupAmountObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public CsrGroupAmountObjectData (CsrGroupAmountObjectData other)
  {

    if (other == null) return;
    this.Key = new CsrGroupAmountObjectKeyData (other.Key);
    this.MaxAmount = other.MaxAmount;
    this._MaxAmountSet = other._MaxAmountSet;
    this.ConfigTagId = other.ConfigTagId;
    this._ConfigTagIdSet = other._ConfigTagIdSet;
  }

  /** get the Key for this object
   * @return CsrGroupAmountObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public CsrGroupAmountObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (CsrGroupAmountObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: GroupName (GROUP_AMOUNT.group_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setGroupName (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "GroupName", "setGroupName");
    }
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "GroupName", "setGroupName");
    }
    if (this.Key == null) this.Key = new CsrGroupAmountObjectKeyData ();
    this.Key.GroupName = value;
    this.Key._GroupNameSet = true;
  }
  /** get the value of the field: GroupName (GROUP_AMOUNT.group_name)
   * @return String the value
   */
  public String getGroupName () {
    if (this.Key == null) return null;
    return this.Key.GroupName;
  }
  /** Change the field to not being actively set: GroupName (GROUP_AMOUNT.group_name)
   */
  public void unsetGroupName () {
    if (this.Key == null) return;
    this.Key._GroupNameSet = false;
  }
  /** See if the field is actively set: GroupName (GROUP_AMOUNT.group_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetGroupName () {
    if (this.Key == null) return false;
    return this.Key._GroupNameSet;
  }

  /** Retrieves the GroupName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The GroupName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GroupName field
   */
   public String getGroupNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupNameAsFormattedString");
       return fmtMgr.formatString(this.getGroupName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("GroupName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getGroupNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the GroupName field from a formatted string
   *
   * @param _value the GroupName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the GroupName field
   */
   public void setGroupNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setGroupName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("GroupName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setGroupNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGroupNameFromFormattedString");
   }

  /** set the fields value: CurrencyCode (GROUP_AMOUNT.currency_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCurrencyCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CurrencyCode", "setCurrencyCode");
    }
    if (this.Key == null) this.Key = new CsrGroupAmountObjectKeyData ();
    this.Key.CurrencyCode = value;
    this.Key._CurrencyCodeSet = true;
  }
  /** get the value of the field: CurrencyCode (GROUP_AMOUNT.currency_code)
   * @return Integer the value
   */
  public Integer getCurrencyCode () {
    if (this.Key == null) return null;
    return this.Key.CurrencyCode;
  }
  /** Change the field to not being actively set: CurrencyCode (GROUP_AMOUNT.currency_code)
   */
  public void unsetCurrencyCode () {
    if (this.Key == null) return;
    this.Key._CurrencyCodeSet = false;
  }
  /** See if the field is actively set: CurrencyCode (GROUP_AMOUNT.currency_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCurrencyCode () {
    if (this.Key == null) return false;
    return this.Key._CurrencyCodeSet;
  }

  /** Retrieves the CurrencyCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CurrencyCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CurrencyCode field
   */
   public String getCurrencyCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCurrencyCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getCurrencyCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCurrencyCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the CurrencyCode field from a formatted string
   *
   * @param _value the CurrencyCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CurrencyCode field
   */
   public void setCurrencyCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCurrencyCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCurrencyCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCurrencyCodeFromFormattedString");
   }

  /** set the fields value: ModuleName (GROUP_AMOUNT.module_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setModuleName (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ModuleName", "setModuleName");
    }
    if (this.Key == null) this.Key = new CsrGroupAmountObjectKeyData ();
    this.Key.ModuleName = value;
    this.Key._ModuleNameSet = true;
  }
  /** get the value of the field: ModuleName (GROUP_AMOUNT.module_name)
   * @return Integer the value
   */
  public Integer getModuleName () {
    if (this.Key == null) return null;
    return this.Key.ModuleName;
  }
  /** Change the field to not being actively set: ModuleName (GROUP_AMOUNT.module_name)
   */
  public void unsetModuleName () {
    if (this.Key == null) return;
    this.Key._ModuleNameSet = false;
  }
  /** See if the field is actively set: ModuleName (GROUP_AMOUNT.module_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetModuleName () {
    if (this.Key == null) return false;
    return this.Key._ModuleNameSet;
  }

  /** Retrieves the ModuleName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ModuleName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ModuleName field
   */
   public String getModuleNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getModuleNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getModuleNameAsFormattedString");
       return fmtMgr.formatNumber(this.getModuleName(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ModuleName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getModuleNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the ModuleName field from a formatted string
   *
   * @param _value the ModuleName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ModuleName field
   */
   public void setModuleNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getModuleNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setModuleName(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ModuleName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setModuleNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setModuleNameFromFormattedString");
   }

  /** set the fields value: MaxAmount (GROUP_AMOUNT.max_amount)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MaxAmount") 
  public void setMaxAmount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "MaxAmount", "setMaxAmount");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "MaxAmount", "setMaxAmount");
    }
    this.MaxAmount = value;
    this._MaxAmountSet = true;
  }

  /** Retrieves the MaxAmount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MaxAmount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MaxAmount field
   */
   public String getMaxAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMaxAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMaxAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getMaxAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MaxAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMaxAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the MaxAmount field from a formatted string
   *
   * @param _value the MaxAmount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MaxAmount field
   */
   public void setMaxAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMaxAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMaxAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MaxAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMaxAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMaxAmountFromFormattedString");
   }

  /**
   * Retrieves the MaxAmount field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MaxAmount field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the MaxAmount field
   */
  public String getMaxAmountAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMaxAmountAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMaxAmountAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getMaxAmount(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MaxAmount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMaxAmountAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the MaxAmount field value from a formatted currency string
   *
   * @param _value the MaxAmount field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MaxAmount field
   */
  public void setMaxAmountFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMaxAmountFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setMaxAmount(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MaxAmount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMaxAmountFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMaxAmountFromFormattedCurrencyString");
  }

  /** get the value of the field: MaxAmount (GROUP_AMOUNT.max_amount)
   * @return BigInteger the value
   */
  public BigInteger getMaxAmount () {
    return this.MaxAmount;
  }
  /** Change the field to not being actively set: MaxAmount (GROUP_AMOUNT.max_amount)
   */
  public void unsetMaxAmount () {
    this._MaxAmountSet = false;
  }
  /** See if the field is actively set: MaxAmount (GROUP_AMOUNT.max_amount)
   * @return boolean whether the field is actively set
   */
  public boolean issetMaxAmount () {
    return this._MaxAmountSet;
  }
  /** set the fields value: ConfigTagId (GROUP_AMOUNT.config_tag_id)
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

  /** get the value of the field: ConfigTagId (GROUP_AMOUNT.config_tag_id)
   * @return String the value
   */
  public String getConfigTagId () {
    return this.ConfigTagId;
  }
  /** Change the field to not being actively set: ConfigTagId (GROUP_AMOUNT.config_tag_id)
   */
  public void unsetConfigTagId () {
    this._ConfigTagIdSet = false;
  }
  /** See if the field is actively set: ConfigTagId (GROUP_AMOUNT.config_tag_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetConfigTagId () {
    return this._ConfigTagIdSet;
  }
  public String toString() {
    return CsrGroupAmountObjectHelper.toMap(this, null).toString();
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
  /** GROUP_AMOUNT.max_amount field */
    if(!nonNullOnly || (MaxAmount != null))  _MaxAmountSet = flag;
  /** GROUP_AMOUNT.config_tag_id field */
    if(!nonNullOnly || (ConfigTagId != null))  _ConfigTagIdSet = flag;
  }
}
