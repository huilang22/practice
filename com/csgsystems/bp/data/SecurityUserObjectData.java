/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: SecurityUserObjectData.java
 * Definition File: Admin/SecurityUser.xml
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
  
/** SecurityUserObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class SecurityUserObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public SecurityUserObjectKeyData Key = null;
  /** SEC_FX_USER.usr_user_id field */
  public    String UsrUserId  = null;
  protected boolean _UsrUserIdSet = false;
  /** SEC_FX_USER.usr_first_name field */
  public    String UsrFirstName  = null;
  protected boolean _UsrFirstNameSet = false;
  /** SEC_FX_USER.usr_middle_name field */
  public    String UsrMiddleName  = null;
  protected boolean _UsrMiddleNameSet = false;
  /** SEC_FX_USER.usr_last_name field */
  public    String UsrLastName  = null;
  protected boolean _UsrLastNameSet = false;
  /** SEC_FX_USER.usr_phone field */
  public    String UsrPhone  = null;
  protected boolean _UsrPhoneSet = false;
  /** SEC_FX_USER.usr_extension field */
  public    String UsrExtension  = null;
  protected boolean _UsrExtensionSet = false;
  /** SEC_FX_USER.usr_department field */
  public    String UsrDepartment  = null;
  protected boolean _UsrDepartmentSet = false;
  private String _objName = "SecurityUserObjectData";
  /** Default constructor */
  public SecurityUserObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public SecurityUserObjectData (SecurityUserObjectData other)
  {

    if (other == null) return;
    this.Key = new SecurityUserObjectKeyData (other.Key);
    this.UsrUserId = other.UsrUserId;
    this._UsrUserIdSet = other._UsrUserIdSet;
    this.UsrFirstName = other.UsrFirstName;
    this._UsrFirstNameSet = other._UsrFirstNameSet;
    this.UsrMiddleName = other.UsrMiddleName;
    this._UsrMiddleNameSet = other._UsrMiddleNameSet;
    this.UsrLastName = other.UsrLastName;
    this._UsrLastNameSet = other._UsrLastNameSet;
    this.UsrPhone = other.UsrPhone;
    this._UsrPhoneSet = other._UsrPhoneSet;
    this.UsrExtension = other.UsrExtension;
    this._UsrExtensionSet = other._UsrExtensionSet;
    this.UsrDepartment = other.UsrDepartment;
    this._UsrDepartmentSet = other._UsrDepartmentSet;
  }

  /** get the Key for this object
   * @return SecurityUserObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public SecurityUserObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (SecurityUserObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: UsrId (SEC_FX_USER.usr_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setUsrId (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "UsrId", "setUsrId");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "UsrId", "setUsrId");
    }
    if (this.Key == null) this.Key = new SecurityUserObjectKeyData ();
    this.Key.UsrId = value;
    this.Key._UsrIdSet = true;
  }
  /** get the value of the field: UsrId (SEC_FX_USER.usr_id)
   * @return BigInteger the value
   */
  public BigInteger getUsrId () {
    if (this.Key == null) return null;
    return this.Key.UsrId;
  }
  /** Change the field to not being actively set: UsrId (SEC_FX_USER.usr_id)
   */
  public void unsetUsrId () {
    if (this.Key == null) return;
    this.Key._UsrIdSet = false;
  }
  /** See if the field is actively set: UsrId (SEC_FX_USER.usr_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetUsrId () {
    if (this.Key == null) return false;
    return this.Key._UsrIdSet;
  }

  /** Retrieves the UsrId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UsrId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UsrId field
   */
   public String getUsrIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsrIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUsrIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getUsrId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UsrId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUsrIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the UsrId field from a formatted string
   *
   * @param _value the UsrId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UsrId field
   */
   public void setUsrIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsrIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUsrId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UsrId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUsrIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUsrIdFromFormattedString");
   }

  /** set the fields value: UsrUserId (SEC_FX_USER.usr_user_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UsrUserId") 
  public void setUsrUserId (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "UsrUserId", "setUsrUserId");
    }
    if (value != null && !DataHelper.validLength (value, 200))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "UsrUserId", "setUsrUserId");
    }
    this.UsrUserId = value;
    this._UsrUserIdSet = true;
  }

  /** Retrieves the UsrUserId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UsrUserId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UsrUserId field
   */
   public String getUsrUserIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsrUserIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUsrUserIdAsFormattedString");
       return fmtMgr.formatString(this.getUsrUserId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UsrUserId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUsrUserIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the UsrUserId field from a formatted string
   *
   * @param _value the UsrUserId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UsrUserId field
   */
   public void setUsrUserIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsrUserIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUsrUserId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UsrUserId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUsrUserIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUsrUserIdFromFormattedString");
   }

  /** get the value of the field: UsrUserId (SEC_FX_USER.usr_user_id)
   * @return String the value
   */
  public String getUsrUserId () {
    return this.UsrUserId;
  }
  /** Change the field to not being actively set: UsrUserId (SEC_FX_USER.usr_user_id)
   */
  public void unsetUsrUserId () {
    this._UsrUserIdSet = false;
  }
  /** See if the field is actively set: UsrUserId (SEC_FX_USER.usr_user_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetUsrUserId () {
    return this._UsrUserIdSet;
  }
  /** set the fields value: UsrFirstName (SEC_FX_USER.usr_first_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UsrFirstName") 
  public void setUsrFirstName (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "UsrFirstName", "setUsrFirstName");
    }
    if (value != null && !DataHelper.validLength (value, 200))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "UsrFirstName", "setUsrFirstName");
    }
    this.UsrFirstName = value;
    this._UsrFirstNameSet = true;
  }

  /** Retrieves the UsrFirstName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UsrFirstName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UsrFirstName field
   */
   public String getUsrFirstNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsrFirstNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUsrFirstNameAsFormattedString");
       return fmtMgr.formatString(this.getUsrFirstName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UsrFirstName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUsrFirstNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the UsrFirstName field from a formatted string
   *
   * @param _value the UsrFirstName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UsrFirstName field
   */
   public void setUsrFirstNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsrFirstNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUsrFirstName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UsrFirstName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUsrFirstNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUsrFirstNameFromFormattedString");
   }

  /** get the value of the field: UsrFirstName (SEC_FX_USER.usr_first_name)
   * @return String the value
   */
  public String getUsrFirstName () {
    return this.UsrFirstName;
  }
  /** Change the field to not being actively set: UsrFirstName (SEC_FX_USER.usr_first_name)
   */
  public void unsetUsrFirstName () {
    this._UsrFirstNameSet = false;
  }
  /** See if the field is actively set: UsrFirstName (SEC_FX_USER.usr_first_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetUsrFirstName () {
    return this._UsrFirstNameSet;
  }
  /** set the fields value: UsrMiddleName (SEC_FX_USER.usr_middle_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UsrMiddleName") 
  public void setUsrMiddleName (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 200))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "UsrMiddleName", "setUsrMiddleName");
    }
    this.UsrMiddleName = value;
    this._UsrMiddleNameSet = true;
  }

  /** Retrieves the UsrMiddleName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UsrMiddleName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UsrMiddleName field
   */
   public String getUsrMiddleNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsrMiddleNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUsrMiddleNameAsFormattedString");
       return fmtMgr.formatString(this.getUsrMiddleName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UsrMiddleName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUsrMiddleNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the UsrMiddleName field from a formatted string
   *
   * @param _value the UsrMiddleName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UsrMiddleName field
   */
   public void setUsrMiddleNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsrMiddleNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUsrMiddleName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UsrMiddleName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUsrMiddleNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUsrMiddleNameFromFormattedString");
   }

  /** get the value of the field: UsrMiddleName (SEC_FX_USER.usr_middle_name)
   * @return String the value
   */
  public String getUsrMiddleName () {
    return this.UsrMiddleName;
  }
  /** Change the field to not being actively set: UsrMiddleName (SEC_FX_USER.usr_middle_name)
   */
  public void unsetUsrMiddleName () {
    this._UsrMiddleNameSet = false;
  }
  /** See if the field is actively set: UsrMiddleName (SEC_FX_USER.usr_middle_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetUsrMiddleName () {
    return this._UsrMiddleNameSet;
  }
  /** set the fields value: UsrLastName (SEC_FX_USER.usr_last_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UsrLastName") 
  public void setUsrLastName (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "UsrLastName", "setUsrLastName");
    }
    if (value != null && !DataHelper.validLength (value, 200))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "UsrLastName", "setUsrLastName");
    }
    this.UsrLastName = value;
    this._UsrLastNameSet = true;
  }

  /** Retrieves the UsrLastName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UsrLastName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UsrLastName field
   */
   public String getUsrLastNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsrLastNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUsrLastNameAsFormattedString");
       return fmtMgr.formatString(this.getUsrLastName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UsrLastName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUsrLastNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the UsrLastName field from a formatted string
   *
   * @param _value the UsrLastName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UsrLastName field
   */
   public void setUsrLastNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsrLastNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUsrLastName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UsrLastName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUsrLastNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUsrLastNameFromFormattedString");
   }

  /** get the value of the field: UsrLastName (SEC_FX_USER.usr_last_name)
   * @return String the value
   */
  public String getUsrLastName () {
    return this.UsrLastName;
  }
  /** Change the field to not being actively set: UsrLastName (SEC_FX_USER.usr_last_name)
   */
  public void unsetUsrLastName () {
    this._UsrLastNameSet = false;
  }
  /** See if the field is actively set: UsrLastName (SEC_FX_USER.usr_last_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetUsrLastName () {
    return this._UsrLastNameSet;
  }
  /** set the fields value: UsrPhone (SEC_FX_USER.usr_phone)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UsrPhone") 
  public void setUsrPhone (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 20))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "UsrPhone", "setUsrPhone");
    }
    this.UsrPhone = value;
    this._UsrPhoneSet = true;
  }

  /** Retrieves the UsrPhone field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UsrPhone field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UsrPhone field
   */
   public String getUsrPhoneAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsrPhoneAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUsrPhoneAsFormattedString");
       return fmtMgr.formatString(this.getUsrPhone());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UsrPhone");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUsrPhoneAsFormattedString");
       throw x;
     }
   }
  /** Sets the UsrPhone field from a formatted string
   *
   * @param _value the UsrPhone field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UsrPhone field
   */
   public void setUsrPhoneFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsrPhoneFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUsrPhone(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UsrPhone");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUsrPhoneFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUsrPhoneFromFormattedString");
   }

  /** get the value of the field: UsrPhone (SEC_FX_USER.usr_phone)
   * @return String the value
   */
  public String getUsrPhone () {
    return this.UsrPhone;
  }
  /** Change the field to not being actively set: UsrPhone (SEC_FX_USER.usr_phone)
   */
  public void unsetUsrPhone () {
    this._UsrPhoneSet = false;
  }
  /** See if the field is actively set: UsrPhone (SEC_FX_USER.usr_phone)
   * @return boolean whether the field is actively set
   */
  public boolean issetUsrPhone () {
    return this._UsrPhoneSet;
  }
  /** set the fields value: UsrExtension (SEC_FX_USER.usr_extension)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UsrExtension") 
  public void setUsrExtension (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "UsrExtension", "setUsrExtension");
    }
    this.UsrExtension = value;
    this._UsrExtensionSet = true;
  }

  /** Retrieves the UsrExtension field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UsrExtension field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UsrExtension field
   */
   public String getUsrExtensionAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsrExtensionAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUsrExtensionAsFormattedString");
       return fmtMgr.formatString(this.getUsrExtension());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UsrExtension");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUsrExtensionAsFormattedString");
       throw x;
     }
   }
  /** Sets the UsrExtension field from a formatted string
   *
   * @param _value the UsrExtension field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UsrExtension field
   */
   public void setUsrExtensionFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsrExtensionFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUsrExtension(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UsrExtension");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUsrExtensionFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUsrExtensionFromFormattedString");
   }

  /** get the value of the field: UsrExtension (SEC_FX_USER.usr_extension)
   * @return String the value
   */
  public String getUsrExtension () {
    return this.UsrExtension;
  }
  /** Change the field to not being actively set: UsrExtension (SEC_FX_USER.usr_extension)
   */
  public void unsetUsrExtension () {
    this._UsrExtensionSet = false;
  }
  /** See if the field is actively set: UsrExtension (SEC_FX_USER.usr_extension)
   * @return boolean whether the field is actively set
   */
  public boolean issetUsrExtension () {
    return this._UsrExtensionSet;
  }
  /** set the fields value: UsrDepartment (SEC_FX_USER.usr_department)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UsrDepartment") 
  public void setUsrDepartment (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "UsrDepartment", "setUsrDepartment");
    }
    this.UsrDepartment = value;
    this._UsrDepartmentSet = true;
  }

  /** Retrieves the UsrDepartment field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UsrDepartment field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UsrDepartment field
   */
   public String getUsrDepartmentAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsrDepartmentAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUsrDepartmentAsFormattedString");
       return fmtMgr.formatString(this.getUsrDepartment());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UsrDepartment");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUsrDepartmentAsFormattedString");
       throw x;
     }
   }
  /** Sets the UsrDepartment field from a formatted string
   *
   * @param _value the UsrDepartment field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UsrDepartment field
   */
   public void setUsrDepartmentFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsrDepartmentFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUsrDepartment(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UsrDepartment");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUsrDepartmentFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUsrDepartmentFromFormattedString");
   }

  /** get the value of the field: UsrDepartment (SEC_FX_USER.usr_department)
   * @return String the value
   */
  public String getUsrDepartment () {
    return this.UsrDepartment;
  }
  /** Change the field to not being actively set: UsrDepartment (SEC_FX_USER.usr_department)
   */
  public void unsetUsrDepartment () {
    this._UsrDepartmentSet = false;
  }
  /** See if the field is actively set: UsrDepartment (SEC_FX_USER.usr_department)
   * @return boolean whether the field is actively set
   */
  public boolean issetUsrDepartment () {
    return this._UsrDepartmentSet;
  }
  public String toString() {
    return SecurityUserObjectHelper.toMap(this, null).toString();
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
  /** SEC_FX_USER.usr_user_id field */
    if(!nonNullOnly || (UsrUserId != null))  _UsrUserIdSet = flag;
  /** SEC_FX_USER.usr_first_name field */
    if(!nonNullOnly || (UsrFirstName != null))  _UsrFirstNameSet = flag;
  /** SEC_FX_USER.usr_middle_name field */
    if(!nonNullOnly || (UsrMiddleName != null))  _UsrMiddleNameSet = flag;
  /** SEC_FX_USER.usr_last_name field */
    if(!nonNullOnly || (UsrLastName != null))  _UsrLastNameSet = flag;
  /** SEC_FX_USER.usr_phone field */
    if(!nonNullOnly || (UsrPhone != null))  _UsrPhoneSet = flag;
  /** SEC_FX_USER.usr_extension field */
    if(!nonNullOnly || (UsrExtension != null))  _UsrExtensionSet = flag;
  /** SEC_FX_USER.usr_department field */
    if(!nonNullOnly || (UsrDepartment != null))  _UsrDepartmentSet = flag;
  }
}
