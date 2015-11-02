/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountEDObjectData.java
 * Definition File: Customer/Account.xml
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

import com.csgsystems.bp.data.*;
import com.csgsystems.bp.data.*;
import com.csgsystems.bp.data.*;

import com.csgsystems.api.base.BaseObjectData;
  
/** AccountEDObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class AccountEDObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public AccountEDObjectKeyData Key = null;
  /** PARAM_DEF.param_name field */
  public    String ParamName  = null;
  protected boolean _ParamNameSet = false;
  /** CMF_EXT_DATA.param_value field */
  public    String ParamValue  = null;
  protected boolean _ParamValueSet = false;
  /** CMF_EXT_DATA.param_datatype field */
  public    Integer ParamDatatype  = null;
  protected boolean _ParamDatatypeSet = false;
  private String _objName = "AccountEDObjectData";
  /** Default constructor */
  public AccountEDObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public AccountEDObjectData (AccountEDObjectData other)
  {

    if (other == null) return;
    this.Key = new AccountEDObjectKeyData (other.Key);
    this.ParamName = other.ParamName;
    this._ParamNameSet = other._ParamNameSet;
    this.ParamValue = other.ParamValue;
    this._ParamValueSet = other._ParamValueSet;
    this.ParamDatatype = other.ParamDatatype;
    this._ParamDatatypeSet = other._ParamDatatypeSet;
  }

  /** get the Key for this object
   * @return AccountEDObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public AccountEDObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (AccountEDObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: AccountInternalId (CMF_EXT_DATA.account_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setAccountInternalId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountInternalId", "setAccountInternalId");
    }
    if (this.Key == null) this.Key = new AccountEDObjectKeyData ();
    this.Key.AccountInternalId = value;
    this.Key._AccountInternalIdSet = true;
  }
  /** get the value of the field: AccountInternalId (CMF_EXT_DATA.account_no)
   * @return Integer the value
   */
  public Integer getAccountInternalId () {
    if (this.Key == null) return null;
    return this.Key.AccountInternalId;
  }
  /** Change the field to not being actively set: AccountInternalId (CMF_EXT_DATA.account_no)
   */
  public void unsetAccountInternalId () {
    if (this.Key == null) return;
    this.Key._AccountInternalIdSet = false;
  }
  /** See if the field is actively set: AccountInternalId (CMF_EXT_DATA.account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountInternalId () {
    if (this.Key == null) return false;
    return this.Key._AccountInternalIdSet;
  }

  /** Retrieves the AccountInternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AccountInternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountInternalId field
   */
   public String getAccountInternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountInternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountInternalIdAsFormattedString");
       return fmtMgr.formatNumber(this.getAccountInternalId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountInternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the AccountInternalId field from a formatted string
   *
   * @param _value the AccountInternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AccountInternalId field
   */
   public void setAccountInternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountInternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAccountInternalId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountInternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountInternalIdFromFormattedString");
   }

  /** set the fields value: ParamId (CMF_EXT_DATA.param_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setParamId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ParamId", "setParamId");
    }
    if (this.Key == null) this.Key = new AccountEDObjectKeyData ();
    this.Key.ParamId = value;
    this.Key._ParamIdSet = true;
  }
  /** get the value of the field: ParamId (CMF_EXT_DATA.param_id)
   * @return Integer the value
   */
  public Integer getParamId () {
    if (this.Key == null) return null;
    return this.Key.ParamId;
  }
  /** Change the field to not being actively set: ParamId (CMF_EXT_DATA.param_id)
   */
  public void unsetParamId () {
    if (this.Key == null) return;
    this.Key._ParamIdSet = false;
  }
  /** See if the field is actively set: ParamId (CMF_EXT_DATA.param_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetParamId () {
    if (this.Key == null) return false;
    return this.Key._ParamIdSet;
  }

  /** Retrieves the ParamId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ParamId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParamId field
   */
   public String getParamIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParamIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParamIdAsFormattedString");
       return fmtMgr.formatNumber(this.getParamId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParamId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getParamIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ParamId field from a formatted string
   *
   * @param _value the ParamId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ParamId field
   */
   public void setParamIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParamIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setParamId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParamId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setParamIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParamIdFromFormattedString");
   }

  /** set the fields value: ParamName (PARAM_DEF.param_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ParamName") 
  public void setParamName (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ParamName", "setParamName");
    }
    if (value != null && !DataHelper.validLength (value, 32))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ParamName", "setParamName");
    }
    this.ParamName = value;
    this._ParamNameSet = true;
  }

  /** Retrieves the ParamName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ParamName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParamName field
   */
   public String getParamNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParamNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParamNameAsFormattedString");
       return fmtMgr.formatString(this.getParamName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParamName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getParamNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the ParamName field from a formatted string
   *
   * @param _value the ParamName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ParamName field
   */
   public void setParamNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParamNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setParamName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParamName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setParamNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParamNameFromFormattedString");
   }

  /** get the value of the field: ParamName (PARAM_DEF.param_name)
   * @return String the value
   */
  public String getParamName () {
    return this.ParamName;
  }
  /** Change the field to not being actively set: ParamName (PARAM_DEF.param_name)
   */
  public void unsetParamName () {
    this._ParamNameSet = false;
  }
  /** See if the field is actively set: ParamName (PARAM_DEF.param_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetParamName () {
    return this._ParamNameSet;
  }
  /** set the fields value: ParamValue (CMF_EXT_DATA.param_value)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ParamValue") 
  public void setParamValue (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ParamValue", "setParamValue");
    }
    if (value != null && !DataHelper.validLength (value, 500))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ParamValue", "setParamValue");
    }
    this.ParamValue = value;
    this._ParamValueSet = true;
  }

  /** Retrieves the ParamValue field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ParamValue field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParamValue field
   */
   public String getParamValueAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParamValueAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParamValueAsFormattedString");
       return fmtMgr.formatString(this.getParamValue());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParamValue");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getParamValueAsFormattedString");
       throw x;
     }
   }
  /** Sets the ParamValue field from a formatted string
   *
   * @param _value the ParamValue field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ParamValue field
   */
   public void setParamValueFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParamValueFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setParamValue(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParamValue");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setParamValueFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParamValueFromFormattedString");
   }

  /** get the value of the field: ParamValue (CMF_EXT_DATA.param_value)
   * @return String the value
   */
  public String getParamValue () {
    return this.ParamValue;
  }
  /** Change the field to not being actively set: ParamValue (CMF_EXT_DATA.param_value)
   */
  public void unsetParamValue () {
    this._ParamValueSet = false;
  }
  /** See if the field is actively set: ParamValue (CMF_EXT_DATA.param_value)
   * @return boolean whether the field is actively set
   */
  public boolean issetParamValue () {
    return this._ParamValueSet;
  }
  /** set the fields value: ParamDatatype (CMF_EXT_DATA.param_datatype)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ParamDatatype") 
  public void setParamDatatype (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ParamDatatype", "setParamDatatype");
    }
    this.ParamDatatype = value;
    this._ParamDatatypeSet = true;
  }

  /** Retrieves the ParamDatatype field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ParamDatatype field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParamDatatype field
   */
   public String getParamDatatypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParamDatatypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParamDatatypeAsFormattedString");
       return fmtMgr.formatNumber(this.getParamDatatype(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParamDatatype");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getParamDatatypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the ParamDatatype field from a formatted string
   *
   * @param _value the ParamDatatype field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ParamDatatype field
   */
   public void setParamDatatypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParamDatatypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setParamDatatype(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParamDatatype");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setParamDatatypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParamDatatypeFromFormattedString");
   }

  /** get the value of the field: ParamDatatype (CMF_EXT_DATA.param_datatype)
   * @return Integer the value
   */
  public Integer getParamDatatype () {
    return this.ParamDatatype;
  }
  /** Change the field to not being actively set: ParamDatatype (CMF_EXT_DATA.param_datatype)
   */
  public void unsetParamDatatype () {
    this._ParamDatatypeSet = false;
  }
  /** See if the field is actively set: ParamDatatype (CMF_EXT_DATA.param_datatype)
   * @return boolean whether the field is actively set
   */
  public boolean issetParamDatatype () {
    return this._ParamDatatypeSet;
  }
  public String toString() {
    return AccountEDObjectHelper.toMap(this, null).toString();
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
  /** PARAM_DEF.param_name field */
    if(!nonNullOnly || (ParamName != null))  _ParamNameSet = flag;
  /** CMF_EXT_DATA.param_value field */
    if(!nonNullOnly || (ParamValue != null))  _ParamValueSet = flag;
  /** CMF_EXT_DATA.param_datatype field */
    if(!nonNullOnly || (ParamDatatype != null))  _ParamDatatypeSet = flag;
  }
}
